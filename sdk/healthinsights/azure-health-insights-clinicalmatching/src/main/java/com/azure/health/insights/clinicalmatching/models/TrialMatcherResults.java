// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.clinicalmatching.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * The inference results for the Trial Matcher request.
 */
@Immutable
public final class TrialMatcherResults implements JsonSerializable<TrialMatcherResults> {

    /*
     * Results for the patients given in the request.
     */
    @Generated
    private final List<TrialMatcherPatientResult> patients;

    /*
     * The version of the model used for inference, expressed as the model date.
     */
    @Generated
    private final String modelVersion;

    /*
     * The date when the clinical trials knowledge graph was last updated.
     */
    @Generated
    private LocalDate knowledgeGraphLastUpdateDate;

    /**
     * Creates an instance of TrialMatcherResults class.
     *
     * @param patients the patients value to set.
     * @param modelVersion the modelVersion value to set.
     */
    @Generated
    private TrialMatcherResults(List<TrialMatcherPatientResult> patients, String modelVersion) {
        this.patients = patients;
        this.modelVersion = modelVersion;
    }

    /**
     * Get the patients property: Results for the patients given in the request.
     *
     * @return the patients value.
     */
    @Generated
    public List<TrialMatcherPatientResult> getPatients() {
        return this.patients;
    }

    /**
     * Get the modelVersion property: The version of the model used for inference, expressed as the model date.
     *
     * @return the modelVersion value.
     */
    @Generated
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Get the knowledgeGraphLastUpdateDate property: The date when the clinical trials knowledge graph was last
     * updated.
     *
     * @return the knowledgeGraphLastUpdateDate value.
     */
    @Generated
    public LocalDate getKnowledgeGraphLastUpdateDate() {
        return this.knowledgeGraphLastUpdateDate;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("patients", this.patients, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("modelVersion", this.modelVersion);
        jsonWriter.writeStringField("knowledgeGraphLastUpdateDate",
            Objects.toString(this.knowledgeGraphLastUpdateDate, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TrialMatcherResults from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrialMatcherResults if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TrialMatcherResults.
     */
    @Generated
    public static TrialMatcherResults fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<TrialMatcherPatientResult> patients = null;
            String modelVersion = null;
            LocalDate knowledgeGraphLastUpdateDate = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("patients".equals(fieldName)) {
                    patients = reader.readArray(reader1 -> TrialMatcherPatientResult.fromJson(reader1));
                } else if ("modelVersion".equals(fieldName)) {
                    modelVersion = reader.getString();
                } else if ("knowledgeGraphLastUpdateDate".equals(fieldName)) {
                    knowledgeGraphLastUpdateDate
                        = reader.getNullable(nonNullReader -> LocalDate.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }
            TrialMatcherResults deserializedTrialMatcherResults = new TrialMatcherResults(patients, modelVersion);
            deserializedTrialMatcherResults.knowledgeGraphLastUpdateDate = knowledgeGraphLastUpdateDate;
            return deserializedTrialMatcherResults;
        });
    }
}
