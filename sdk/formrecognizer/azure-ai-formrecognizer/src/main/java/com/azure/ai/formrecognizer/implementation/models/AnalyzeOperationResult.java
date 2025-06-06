// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Status and result of the queued analyze operation.
 */
@Fluent
public final class AnalyzeOperationResult implements JsonSerializable<AnalyzeOperationResult> {
    /*
     * Operation status.
     */
    @Generated
    private OperationStatus status;

    /*
     * Date and time (UTC) when the analyze operation was submitted.
     */
    @Generated
    private OffsetDateTime createdDateTime;

    /*
     * Date and time (UTC) when the status was last updated.
     */
    @Generated
    private OffsetDateTime lastUpdatedDateTime;

    /*
     * Results of the analyze operation.
     */
    @Generated
    private AnalyzeResult analyzeResult;

    /**
     * Creates an instance of AnalyzeOperationResult class.
     */
    @Generated
    public AnalyzeOperationResult() {
    }

    /**
     * Get the status property: Operation status.
     * 
     * @return the status value.
     */
    @Generated
    public OperationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Operation status.
     * 
     * @param status the status value to set.
     * @return the AnalyzeOperationResult object itself.
     */
    @Generated
    public AnalyzeOperationResult setStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the createdDateTime property: Date and time (UTC) when the analyze operation was submitted.
     * 
     * @return the createdDateTime value.
     */
    @Generated
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Date and time (UTC) when the analyze operation was submitted.
     * 
     * @param createdDateTime the createdDateTime value to set.
     * @return the AnalyzeOperationResult object itself.
     */
    @Generated
    public AnalyzeOperationResult setCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the lastUpdatedDateTime property: Date and time (UTC) when the status was last updated.
     * 
     * @return the lastUpdatedDateTime value.
     */
    @Generated
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * Set the lastUpdatedDateTime property: Date and time (UTC) when the status was last updated.
     * 
     * @param lastUpdatedDateTime the lastUpdatedDateTime value to set.
     * @return the AnalyzeOperationResult object itself.
     */
    @Generated
    public AnalyzeOperationResult setLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        return this;
    }

    /**
     * Get the analyzeResult property: Results of the analyze operation.
     * 
     * @return the analyzeResult value.
     */
    @Generated
    public AnalyzeResult getAnalyzeResult() {
        return this.analyzeResult;
    }

    /**
     * Set the analyzeResult property: Results of the analyze operation.
     * 
     * @param analyzeResult the analyzeResult value to set.
     * @return the AnalyzeOperationResult object itself.
     */
    @Generated
    public AnalyzeOperationResult setAnalyzeResult(AnalyzeResult analyzeResult) {
        this.analyzeResult = analyzeResult;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("createdDateTime",
            this.createdDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdDateTime));
        jsonWriter.writeStringField("lastUpdatedDateTime",
            this.lastUpdatedDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastUpdatedDateTime));
        jsonWriter.writeJsonField("analyzeResult", this.analyzeResult);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnalyzeOperationResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnalyzeOperationResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AnalyzeOperationResult.
     */
    @Generated
    public static AnalyzeOperationResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnalyzeOperationResult deserializedAnalyzeOperationResult = new AnalyzeOperationResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedAnalyzeOperationResult.status = OperationStatus.fromString(reader.getString());
                } else if ("createdDateTime".equals(fieldName)) {
                    deserializedAnalyzeOperationResult.createdDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastUpdatedDateTime".equals(fieldName)) {
                    deserializedAnalyzeOperationResult.lastUpdatedDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("analyzeResult".equals(fieldName)) {
                    deserializedAnalyzeOperationResult.analyzeResult = AnalyzeResult.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAnalyzeOperationResult;
        });
    }
}
