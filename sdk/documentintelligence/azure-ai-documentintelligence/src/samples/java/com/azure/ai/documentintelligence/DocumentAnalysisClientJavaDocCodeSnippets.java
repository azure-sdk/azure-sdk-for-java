// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.documentintelligence;

import com.azure.ai.documentintelligence.models.AnalyzeDocumentOptions;
import com.azure.ai.documentintelligence.models.AnalyzeOperationDetails;
import com.azure.ai.documentintelligence.models.AnalyzeResult;
import com.azure.ai.documentintelligence.models.AnalyzedDocument;
import com.azure.ai.documentintelligence.models.AzureBlobContentSource;
import com.azure.ai.documentintelligence.models.BuildDocumentModelOptions;
import com.azure.ai.documentintelligence.models.ClassifyDocumentOptions;
import com.azure.ai.documentintelligence.models.DocumentAnalysisFeature;
import com.azure.ai.documentintelligence.models.DocumentBuildMode;
import com.azure.ai.documentintelligence.models.DocumentContentFormat;
import com.azure.ai.documentintelligence.models.DocumentModelBuildOperationDetails;
import com.azure.ai.documentintelligence.models.DocumentModelDetails;
import com.azure.ai.documentintelligence.models.DocumentTable;
import com.azure.ai.documentintelligence.models.StringIndexType;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredentialBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Code snippet for {@link DocumentIntelligenceClient}
 */
public class DocumentAnalysisClientJavaDocCodeSnippets {
    private final DocumentIntelligenceClient documentIntelligenceClient = new DocumentIntelligenceClientBuilder().buildClient();
    private final DocumentIntelligenceAdministrationClient documentModelAdminClient =
        new DocumentIntelligenceAdministrationClientBuilder().buildClient();

    /**
     * Code snippet for creating a {@link DocumentIntelligenceClient}
     */
    public void createDocumentAnalysisClient() {
        // BEGIN: com.azure.ai.documentintelligence.DocumentAnalysisClient.instantiation
        DocumentIntelligenceClient documentIntelligenceClient = new DocumentIntelligenceClientBuilder()
            .credential(new AzureKeyCredential("{key}"))
            .endpoint("{endpoint}")
            .buildClient();
        // END: com.azure.ai.documentintelligence.DocumentAnalysisClient.instantiation
    }

    public void useAadAsyncClient() {
        // BEGIN: readme-sample-createDocumentAnalysisAsyncClientWithAAD
        DocumentIntelligenceAsyncClient documentIntelligenceAsyncClient = new DocumentIntelligenceClientBuilder()
            .endpoint("{endpoint}")
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildAsyncClient();
        // END: readme-sample-createDocumentAnalysisAsyncClientWithAAD
    }

    /**
     * Code snippet for creating a {@link DocumentIntelligenceClient} with pipeline
     */
    public void createDocumentAnalysisClientWithPipeline() {
        // BEGIN: com.azure.ai.documentintelligence.DocumentAnalysisClient.pipeline.instantiation
        HttpPipeline pipeline = new HttpPipelineBuilder()
            .policies(/* add policies */)
            .build();

        DocumentIntelligenceClient documentIntelligenceClient = new DocumentIntelligenceClientBuilder()
            .credential(new AzureKeyCredential("{key}"))
            .endpoint("{endpoint}")
            .pipeline(pipeline)
            .buildClient();
        // END:  com.azure.ai.documentintelligence.DocumentAnalysisClient.pipeline.instantiation
    }


    // Analyze Custom Form

    /**
     * Code snippet for {@link DocumentIntelligenceClient#beginAnalyzeDocument(String, AnalyzeDocumentOptions)}
     */
    public void beginAnalyzeDocumentFromUrl() {
        // BEGIN: com.azure.ai.documentintelligence.DocumentAnalysisClient.beginAnalyzeDocumentFromUrl#String-AnalyzeDocumentOptions
        String documentUrl = "{document_url}";
        String modelId = "{custom_trained_model_id}";

        documentIntelligenceClient.beginAnalyzeDocument(modelId,
            new AnalyzeDocumentOptions(documentUrl).setPages(Arrays.asList("1"))
                .setLocale("en-US").setStringIndexType(StringIndexType.TEXT_ELEMENTS)
                .setDocumentAnalysisFeatures(Collections.singletonList(DocumentAnalysisFeature.LANGUAGES))
                .setOutputContentFormat(DocumentContentFormat.TEXT)).getFinalResult()
            .getDocuments().stream()
            .map(AnalyzedDocument::getFields)
            .forEach(documentFieldMap -> documentFieldMap.forEach((key, documentField) -> {
                System.out.printf("Field text: %s%n", key);
                System.out.printf("Field value data content: %s%n", documentField.getContent());
                System.out.printf("Confidence score: %.2f%n", documentField.getConfidence());
            }));

        // END: com.azure.ai.documentintelligence.DocumentAnalysisClient.beginAnalyzeDocumentFromUrl#String-AnalyzeDocumentOptions
    }

    /**
     * Code snippet for
     * {@link DocumentIntelligenceClient#beginClassifyDocument(String, ClassifyDocumentOptions)}
     *
     * @throws IOException Exception thrown when there is an error in reading all the bytes from the File.
     */
    public void beginClassifyDocumentContext() throws IOException {
        // BEGIN: com.azure.ai.documentintelligence.DocumentAnalysisClient.beginClassifyDocument#string-BinaryData-Context
        File document = new File("{local/file_path/fileName.jpg}");
        String classifierId = "{custom_trained_classifier_id}";

        documentIntelligenceClient.beginClassifyDocument(classifierId, new ClassifyDocumentOptions(Files.readAllBytes(document.toPath())))
            .getFinalResult()
            .getDocuments()
            .forEach(analyzedDocument -> System.out.printf("Doc Type: %s%n", analyzedDocument.getDocumentType()));
        // END: com.azure.ai.documentintelligence.DocumentAnalysisClient.beginClassifyDocument#string-BinaryData-Context
    }

    private void buildAndAnalyzeCustomDocument() {
        // BEGIN: readme-sample-build-analyze
        String blobContainerUrl = "{SAS_URL_of_your_container_in_blob_storage}";
        // The shared access signature (SAS) Url of your Azure Blob Storage container with your custom documents.
        String prefix = "{blob_name_prefix}}";
        // Build custom document analysis model
        SyncPoller<DocumentModelBuildOperationDetails, DocumentModelDetails> buildOperationPoller =
            documentModelAdminClient.beginBuildDocumentModel(
                new BuildDocumentModelOptions("modelId", DocumentBuildMode.TEMPLATE)
                    .setAzureBlobSource(new AzureBlobContentSource(blobContainerUrl)));

        DocumentModelDetails customBuildModel = buildOperationPoller.getFinalResult();

        // analyze using custom-built model
        String modelId = customBuildModel.getModelId();
        String documentUrl = "documentUrl";
        SyncPoller<AnalyzeOperationDetails, AnalyzeResult> analyzeDocumentPoller =
            documentIntelligenceClient.beginAnalyzeDocument(modelId,
                new AnalyzeDocumentOptions(documentUrl));

        AnalyzeResult analyzeResult = analyzeDocumentPoller.getFinalResult();

        for (int i = 0; i < analyzeResult.getDocuments().size(); i++) {
            final AnalyzedDocument analyzedDocument = analyzeResult.getDocuments().get(i);
            System.out.printf("----------- Analyzing custom document %d -----------%n", i);
            System.out.printf("Analyzed document has doc type %s with confidence : %.2f%n",
                analyzedDocument.getDocumentType(), analyzedDocument.getConfidence());
            analyzedDocument.getFields().forEach((key, documentField) -> {
                System.out.printf("AnalyzedDocument Field content: %s%n", documentField.getContent());
                System.out.printf("AnalyzedDocument Field confidence: %.2f%n", documentField.getConfidence());
                System.out.printf("AnalyzedDocument Field Type: %s%n", documentField.getType());
                System.out.printf("AnalyzedDocument Field found within bounding region: %s%n",
                    documentField.getBoundingRegions().toString());
            });
        }

        analyzeResult.getPages().forEach(documentPage -> {
            System.out.printf("Page has width: %.2f and height: %.2f, measured with unit: %s%n",
                documentPage.getWidth(),
                documentPage.getHeight(),
                documentPage.getUnit());

            // lines
            documentPage.getLines().forEach(documentLine ->
                System.out.printf("Line '%s' is within a bounding box %s.%n",
                    documentLine.getContent(),
                    documentLine.getPolygon().toString()));

            // words
            documentPage.getWords().forEach(documentWord ->
                System.out.printf("Word '%s' has a confidence score of %.2f.%n",
                    documentWord.getContent(),
                    documentWord.getConfidence()));
        });

        // tables
        List<DocumentTable> tables = analyzeResult.getTables();
        for (int i = 0; i < tables.size(); i++) {
            DocumentTable documentTable = tables.get(i);
            System.out.printf("Table %d has %d rows and %d columns.%n", i, documentTable.getRowCount(),
                documentTable.getColumnCount());
            documentTable.getCells().forEach(documentTableCell -> {
                System.out.printf("Cell '%s', has row index %d and column index %d.%n",
                    documentTableCell.getContent(),
                    documentTableCell.getRowIndex(), documentTableCell.getColumnIndex());
            });
            System.out.println();
        }
        // END: readme-sample-build-analyze
    }
}
