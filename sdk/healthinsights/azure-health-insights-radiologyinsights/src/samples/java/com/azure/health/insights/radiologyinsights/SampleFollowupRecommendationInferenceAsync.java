// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.health.insights.radiologyinsights;

import com.azure.core.util.Configuration;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.health.insights.radiologyinsights.models.ClinicalDocumentAuthor;
import com.azure.health.insights.radiologyinsights.models.ClinicalDocumentContent;
import com.azure.health.insights.radiologyinsights.models.ClinicalDocumentContentType;
import com.azure.health.insights.radiologyinsights.models.ClinicalDocumentType;
import com.azure.health.insights.radiologyinsights.models.DocumentAdministrativeMetadata;
import com.azure.health.insights.radiologyinsights.models.DocumentContentSourceType;
import com.azure.health.insights.radiologyinsights.models.EncounterClass;
import com.azure.health.insights.radiologyinsights.models.FhirR4CodeableConcept;
import com.azure.health.insights.radiologyinsights.models.FhirR4Coding;
import com.azure.health.insights.radiologyinsights.models.FhirR4Extension;
import com.azure.health.insights.radiologyinsights.models.FindingOptions;
import com.azure.health.insights.radiologyinsights.models.FollowupRecommendationInference;
import com.azure.health.insights.radiologyinsights.models.FollowupRecommendationOptions;
import com.azure.health.insights.radiologyinsights.models.GenericProcedureRecommendation;
import com.azure.health.insights.radiologyinsights.models.ImagingProcedure;
import com.azure.health.insights.radiologyinsights.models.ImagingProcedureRecommendation;
import com.azure.health.insights.radiologyinsights.models.OrderedProcedure;
import com.azure.health.insights.radiologyinsights.models.PatientDetails;
import com.azure.health.insights.radiologyinsights.models.PatientDocument;
import com.azure.health.insights.radiologyinsights.models.PatientEncounter;
import com.azure.health.insights.radiologyinsights.models.PatientRecord;
import com.azure.health.insights.radiologyinsights.models.PatientSex;
import com.azure.health.insights.radiologyinsights.models.ProcedureRecommendation;
import com.azure.health.insights.radiologyinsights.models.RadiologyInsightsData;
import com.azure.health.insights.radiologyinsights.models.RadiologyInsightsInference;
import com.azure.health.insights.radiologyinsights.models.RadiologyInsightsInferenceOptions;
import com.azure.health.insights.radiologyinsights.models.RadiologyInsightsInferenceResult;
import com.azure.health.insights.radiologyinsights.models.RadiologyInsightsInferenceType;
import com.azure.health.insights.radiologyinsights.models.RadiologyInsightsJob;
import com.azure.health.insights.radiologyinsights.models.RadiologyInsightsModelConfiguration;
import com.azure.health.insights.radiologyinsights.models.RadiologyInsightsPatientResult;
import com.azure.health.insights.radiologyinsights.models.SpecialtyType;
import com.azure.health.insights.radiologyinsights.models.TimePeriod;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/**
 * The SampleFollowupRecommendationInferenceAsync class processes a sample radiology document
 * with the Radiology Insights service. It will initialize an asynchronous
 * RadiologyInsightsAsyncClient, build a Radiology Insights request with the sample document, poll the
 * results and display the Followup Recommendation extracted by the Radiology Insights service.
 *
 */
public class SampleFollowupRecommendationInferenceAsync {

    private static final String DOC_CONTENT = "CLINICAL HISTORY:   "
            + "\r\n20-year-old female presenting with abdominal pain. Surgical history significant for appendectomy."
            + "\r\n "
            + "\r\nCOMPARISON:   "
            + "\r\nRight upper quadrant sonographic performed 1 day prior."
            + "\r\n "
            + "\r\nTECHNIQUE:   "
            + "\r\nTransabdominal grayscale pelvic sonography with duplex color Doppler "
            + "\r\nand spectral waveform analysis of the ovaries."
            + "\r\n "
            + "\r\nFINDINGS:   "
            + "\r\nThe uterus is unremarkable given the transabdominal technique with "
            + "\r\nendometrial echo complex within physiologic normal limits. The "
            + "\r\novaries are symmetric in size, measuring 2.5 x 1.2 x 3.0 cm and the "
            + "\r\nleft measuring 2.8 x 1.5 x 1.9 cm.\n \r\nOn duplex imaging, Doppler signal is symmetric."
            + "\r\n "
            + "\r\nIMPRESSION:   "
            + "\r\n1. Normal pelvic sonography. Findings of testicular torsion."
            + "\r\n\nA new US pelvis within the next 6 months is recommended."
            + "\n\nThese results have been discussed with Dr. Jones at 3 PM on November 5 2020.\n "
            + "\r\n";

    /**
     * The main method is the entry point for the application. It initializes and uses
     * the RadiologyInsightsAsyncClient to perform Radiology Insights operations.
     *
     * @param args The command-line arguments passed to the program.
     */
    public static void main(final String[] args) throws InterruptedException {
        String endpoint = Configuration.getGlobalConfiguration().get("AZURE_HEALTH_INSIGHTS_ENDPOINT");

        DefaultAzureCredential credential = new DefaultAzureCredentialBuilder().build();
        RadiologyInsightsClientBuilder clientBuilder = new RadiologyInsightsClientBuilder()
                .endpoint(endpoint)
                .credential(credential);
        RadiologyInsightsAsyncClient radiologyInsightsAsyncClient = clientBuilder.buildAsyncClient();

        PollerFlux<RadiologyInsightsJob, RadiologyInsightsInferenceResult> asyncPoller = radiologyInsightsAsyncClient
                .beginInferRadiologyInsights(UUID.randomUUID().toString(), createRadiologyInsightsJob());

        CountDownLatch latch = new CountDownLatch(1);

        asyncPoller
            .takeUntil(isComplete)
            .doFinally(signal -> {
                latch.countDown();
            })
            .subscribe(completedResult -> {
                if (completedResult.getStatus() == LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
                    System.out.println("Completed poll response, status: " + completedResult.getStatus());
                    mono = completedResult.getFinalResult();
                }
            }, error -> {
                System.err.println(error.getMessage());
                error.printStackTrace();
            });

        latch.await();
        mono.subscribe(radiologyInsightsResult -> {
            // Process the result asynchronously
            displayFollowUpRecommendations(radiologyInsightsResult);
        }, error -> {
            // Handle any errors
            System.err.println("Error occurred: " + error.getMessage());
            error.printStackTrace();
        });
        // The .subscribe() creation and assignment is not a blocking call. For the purpose of this example, we sleep
        // the thread so the program does not end before the send operation is complete. Using .block() instead of
        // .subscribe() will turn this into a synchronous call.
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static Mono<RadiologyInsightsInferenceResult> mono = null;

    /**
     * Display the critical results of the Radiology Insights request.
     *
     * @param radiologyInsightsResult The response for the Radiology Insights
     *                                request.
     */
    // BEGIN: com.azure.health.insights.radiologyinsights.displayresults.followuprecommendation
    private static void displayFollowUpRecommendations(RadiologyInsightsInferenceResult radiologyInsightsResult) {
        List<RadiologyInsightsPatientResult> patientResults = radiologyInsightsResult.getPatientResults();
        for (RadiologyInsightsPatientResult patientResult : patientResults) {
            List<RadiologyInsightsInference> inferences = patientResult.getInferences();
            for (RadiologyInsightsInference inference : inferences) {

                if (inference instanceof FollowupRecommendationInference) {
                    FollowupRecommendationInference followupRecommendationInference = (FollowupRecommendationInference) inference;
                    System.out.println("Follow Up Recommendation Inference found: ");
                    List<FhirR4Extension> extensions = followupRecommendationInference.getExtension();
                    System.out.println("   Evidence: " + extractEvidence(extensions));
                    System.out.println("   Is conditional: " + followupRecommendationInference.isConditional());
                    System.out.println("   Is guideline: " + followupRecommendationInference.isGuideline());
                    System.out.println("   Is hedging: " + followupRecommendationInference.isHedging());
                    System.out.println("   Is option: " + followupRecommendationInference.isOption());

                    ProcedureRecommendation recommendedProcedure = followupRecommendationInference.getRecommendedProcedure();
                    if (recommendedProcedure instanceof GenericProcedureRecommendation) {
                        System.out.println("   Generic procedure recommendation:");
                        GenericProcedureRecommendation genericProcedureRecommendation = (GenericProcedureRecommendation) recommendedProcedure;
                        System.out.println("      Procedure codes: ");
                        FhirR4CodeableConcept code = genericProcedureRecommendation.getCode();
                        displayCodes(code, 3);
                    }
                    if (recommendedProcedure instanceof ImagingProcedureRecommendation) {
                        System.out.println("   Imaging procedure recommendation: ");
                        ImagingProcedureRecommendation imagingProcedureRecommendation = (ImagingProcedureRecommendation) recommendedProcedure;
                        System.out.println("      Procedure codes: ");
                        List<FhirR4CodeableConcept> procedureCodes = imagingProcedureRecommendation.getProcedureCodes();
                        if (procedureCodes != null) {
                            for (FhirR4CodeableConcept codeableConcept : procedureCodes) {
                                displayCodes(codeableConcept, 3);
                            }
                        }

                        System.out.println("      Imaging procedure: ");
                        List<ImagingProcedure> imagingProcedures = imagingProcedureRecommendation.getImagingProcedures();
                        for (ImagingProcedure imagingProcedure : imagingProcedures) {
                            System.out.println("         Modality");
                            FhirR4CodeableConcept modality = imagingProcedure.getModality();
                            displayCodes(modality, 4);
                            System.out.println("            Evidence: " + extractEvidence(modality.getExtension()));

                            System.out.println("         Anatomy");
                            FhirR4CodeableConcept anatomy = imagingProcedure.getAnatomy();
                            displayCodes(anatomy, 4);
                            System.out.println("            Evidence: " + extractEvidence(anatomy.getExtension()));
                        }
                    }
                }
            }
        }
    }

    private static void displayCodes(FhirR4CodeableConcept codeableConcept, int indentation) {
        String initialBlank = "";
        for (int i = 0; i < indentation; i++) {
            initialBlank += "   ";
        }
        if (codeableConcept != null) {
            List<FhirR4Coding> codingList = codeableConcept.getCoding();
            if (codingList != null) {
                for (FhirR4Coding fhirR4Coding : codingList) {
                    System.out.println(initialBlank + "Coding: " + fhirR4Coding.getCode() + ", " + fhirR4Coding.getDisplay() + " (" + fhirR4Coding.getSystem() + ")");
                }
            }
        }
    }

    private static String extractEvidence(List<FhirR4Extension> extensions) {
        String evidence = "";
        if (extensions != null) {
            for (FhirR4Extension extension : extensions) {
                List<FhirR4Extension> subExtensions = extension.getExtension();
                if (subExtensions != null) {
                    evidence += extractEvidenceToken(subExtensions) + " ";
                }
            }
        }
        return evidence;
    }

    private static String extractEvidenceToken(List<FhirR4Extension> subExtensions) {
        String evidence = "";
        int offset = -1;
        int length = -1;
        for (FhirR4Extension iExtension : subExtensions) {
            if (iExtension.getUrl().equals("offset")) {
                offset = iExtension.getValueInteger();
            }
            if (iExtension.getUrl().equals("length")) {
                length = iExtension.getValueInteger();
            }
        }
        if (offset > 0 && length > 0) {
            //System.out.println("Offset: " + offset + ", length: " + length);
            evidence = DOC_CONTENT.substring(offset, Math.min(offset + length, DOC_CONTENT.length()));
        }
        return evidence;
    }
    // END: com.azure.health.insights.radiologyinsights.displayresults.followuprecommendation

    /**
     * Creates a RadiologyInsightsJob object to use in the Radiology Insights job
     * request.
     *
     * @return A RadiologyInsightsJob object with the created patient records and
     *         model configuration.
     */
    private static RadiologyInsightsData createRadiologyInsightsJob() {
        List<PatientRecord> patientRecords = createPatientRecords();
        RadiologyInsightsData radiologyInsightsData = new RadiologyInsightsData(patientRecords);
        RadiologyInsightsModelConfiguration modelConfiguration = createRadiologyInsightsModelConfig();
        radiologyInsightsData.setConfiguration(modelConfiguration);
        return radiologyInsightsData;
    }

    /**
     * Creates a list of patient records.
     *
     * @return A list of PatientRecord objects that represent patient information.
     */
    private static List<PatientRecord> createPatientRecords() {
        List<PatientRecord> patientRecords = new ArrayList<>();
        // Patients
        PatientRecord patientRecord = new PatientRecord("Sharona");

        PatientDetails patientDetails = new PatientDetails();
        patientDetails.setSex(PatientSex.FEMALE);
        // Define a formatter that matches the input pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");

        // Parse the string to LocalDateTime
        LocalDateTime dateTime = LocalDateTime.parse("1959-11-11T19:00:00+00:00", formatter);
        patientDetails.setBirthDate(dateTime.toLocalDate());

        patientRecord.setDetails(patientDetails);

        PatientEncounter encounter = new PatientEncounter("encounterid1");

        TimePeriod period = new TimePeriod();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-M-d'T'HH:mm:ssXXX");

        OffsetDateTime startTime = OffsetDateTime.parse("2021-8-28T00:00:00" + "+00:00", formatter2);
        OffsetDateTime endTime = OffsetDateTime.parse("2021-8-28T00:00:00" + "+00:00", formatter2);

        period.setStart(startTime);
        period.setEnd(endTime);

        encounter.setPeriod(period);
        encounter.setClassProperty(EncounterClass.IN_PATIENT);

        patientRecord.setEncounters(Arrays.asList(encounter));

        PatientDocument patientDocument = getPatientDocument();
        patientDocument.setClinicalType(ClinicalDocumentType.RADIOLOGY_REPORT);
        patientDocument.setLanguage("EN");

        ClinicalDocumentAuthor author = new ClinicalDocumentAuthor();
        author.setId("authorid1");
        author.setFullName("authorname1");

        patientDocument.setAuthors(Arrays.asList(author));
        patientDocument.setSpecialtyType(SpecialtyType.RADIOLOGY);

        DocumentAdministrativeMetadata adminMetadata = new DocumentAdministrativeMetadata();
        OrderedProcedure orderedProcedure = new OrderedProcedure();

        FhirR4CodeableConcept procedureCode = new FhirR4CodeableConcept();
        FhirR4Coding procedureCoding = new FhirR4Coding();
        procedureCoding.setSystem("Http://hl7.org/fhir/ValueSet/cpt-all");
        procedureCoding.setCode("USPELVIS");
        procedureCoding.setDisplay("US PELVIS COMPLETE");

        procedureCode.setCoding(Arrays.asList(procedureCoding));
        orderedProcedure.setCode(procedureCode);
        orderedProcedure.setDescription("US PELVIS COMPLETE");

        adminMetadata.setOrderedProcedures(Arrays.asList(orderedProcedure));
        adminMetadata.setEncounterId("encounterid1");

        patientDocument.setAdministrativeMetadata(adminMetadata);

        // Define a formatter to handle milliseconds
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

        OffsetDateTime createdDateTime = OffsetDateTime.parse("2021-06-01T00:00:00.000" + "+00:00", formatter3);
        patientDocument.setCreatedAt(createdDateTime);

        patientRecord.setPatientDocuments(Arrays.asList(patientDocument));
        patientRecords.add(patientRecord);
        return patientRecords;
    }

    /**
     * Retrieves the patient document.
     *
     * @return The patient document.
     */
    private static PatientDocument getPatientDocument() {
        ClinicalDocumentContent documentContent = new ClinicalDocumentContent(DocumentContentSourceType.INLINE, DOC_CONTENT);
        return new PatientDocument(ClinicalDocumentContentType.NOTE, "docid1", documentContent);
    }

    /**
     * Creates a RadiologyInsightsModelConfiguration object with the specified
     * configuration settings.
     *
     * @return A new instance of RadiologyInsightsModelConfiguration.
     */
    private static RadiologyInsightsModelConfiguration createRadiologyInsightsModelConfig() {
        RadiologyInsightsModelConfiguration configuration = new RadiologyInsightsModelConfiguration();
        RadiologyInsightsInferenceOptions inferenceOptions = getRadiologyInsightsInferenceOptions();
        configuration.setInferenceOptions(inferenceOptions);
        configuration.setInferenceTypes(Arrays.asList(RadiologyInsightsInferenceType.FINDING,
                RadiologyInsightsInferenceType.AGE_MISMATCH, RadiologyInsightsInferenceType.LATERALITY_DISCREPANCY,
                RadiologyInsightsInferenceType.SEX_MISMATCH, RadiologyInsightsInferenceType.COMPLETE_ORDER_DISCREPANCY,
                RadiologyInsightsInferenceType.LIMITED_ORDER_DISCREPANCY,
                RadiologyInsightsInferenceType.CRITICAL_RESULT, RadiologyInsightsInferenceType.FOLLOWUP_RECOMMENDATION,
                RadiologyInsightsInferenceType.FOLLOWUP_COMMUNICATION,
                RadiologyInsightsInferenceType.RADIOLOGY_PROCEDURE));
        configuration.setLocale("en-US");
        configuration.setVerbose(false);
        configuration.setIncludeEvidence(true);
        return configuration;
    }

    /**
     * Retrieves the RadiologyInsightsInferenceOptions object with the specified
     * options.
     *
     * @return The RadiologyInsightsInferenceOptions object with the specified
     *         options.
     */
    private static RadiologyInsightsInferenceOptions getRadiologyInsightsInferenceOptions() {
        RadiologyInsightsInferenceOptions inferenceOptions = new RadiologyInsightsInferenceOptions();
        FollowupRecommendationOptions followupOptions = new FollowupRecommendationOptions();
        FindingOptions findingOptions = new FindingOptions();
        followupOptions.setIncludeRecommendationsWithNoSpecifiedModality(true);
        followupOptions.setIncludeRecommendationsInReferences(true);
        followupOptions.setProvideFocusedSentenceEvidence(true);
        findingOptions.setProvideFocusedSentenceEvidence(true);
        inferenceOptions.setFollowupRecommendationOptions(followupOptions);
        inferenceOptions.setFindingOptions(findingOptions);
        return inferenceOptions;
    }

    private static Predicate<AsyncPollResponse<RadiologyInsightsJob, RadiologyInsightsInferenceResult>> isComplete = response -> {
        return response.getStatus() != LongRunningOperationStatus.IN_PROGRESS
            && response.getStatus() != LongRunningOperationStatus.NOT_STARTED;
    };
}
