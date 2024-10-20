// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The batch configuration properties definition.
 */
@Fluent
public final class BatchConfigurationProperties extends ArtifactProperties {
    /*
     * The name of the batch group.
     */
    private String batchGroupName;

    /*
     * The batch release criteria.
     */
    private BatchReleaseCriteria releaseCriteria;

    /**
     * Creates an instance of BatchConfigurationProperties class.
     */
    public BatchConfigurationProperties() {
    }

    /**
     * Get the batchGroupName property: The name of the batch group.
     * 
     * @return the batchGroupName value.
     */
    public String batchGroupName() {
        return this.batchGroupName;
    }

    /**
     * Set the batchGroupName property: The name of the batch group.
     * 
     * @param batchGroupName the batchGroupName value to set.
     * @return the BatchConfigurationProperties object itself.
     */
    public BatchConfigurationProperties withBatchGroupName(String batchGroupName) {
        this.batchGroupName = batchGroupName;
        return this;
    }

    /**
     * Get the releaseCriteria property: The batch release criteria.
     * 
     * @return the releaseCriteria value.
     */
    public BatchReleaseCriteria releaseCriteria() {
        return this.releaseCriteria;
    }

    /**
     * Set the releaseCriteria property: The batch release criteria.
     * 
     * @param releaseCriteria the releaseCriteria value to set.
     * @return the BatchConfigurationProperties object itself.
     */
    public BatchConfigurationProperties withReleaseCriteria(BatchReleaseCriteria releaseCriteria) {
        this.releaseCriteria = releaseCriteria;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchConfigurationProperties withCreatedTime(OffsetDateTime createdTime) {
        super.withCreatedTime(createdTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchConfigurationProperties withChangedTime(OffsetDateTime changedTime) {
        super.withChangedTime(changedTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchConfigurationProperties withMetadata(Object metadata) {
        super.withMetadata(metadata);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (batchGroupName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property batchGroupName in model BatchConfigurationProperties"));
        }
        if (releaseCriteria() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property releaseCriteria in model BatchConfigurationProperties"));
        } else {
            releaseCriteria().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BatchConfigurationProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("createdTime",
            createdTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(createdTime()));
        jsonWriter.writeStringField("changedTime",
            changedTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(changedTime()));
        jsonWriter.writeUntypedField("metadata", metadata());
        jsonWriter.writeStringField("batchGroupName", this.batchGroupName);
        jsonWriter.writeJsonField("releaseCriteria", this.releaseCriteria);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchConfigurationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchConfigurationProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchConfigurationProperties.
     */
    public static BatchConfigurationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchConfigurationProperties deserializedBatchConfigurationProperties = new BatchConfigurationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("createdTime".equals(fieldName)) {
                    deserializedBatchConfigurationProperties.withCreatedTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("changedTime".equals(fieldName)) {
                    deserializedBatchConfigurationProperties.withChangedTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("metadata".equals(fieldName)) {
                    deserializedBatchConfigurationProperties.withMetadata(reader.readUntyped());
                } else if ("batchGroupName".equals(fieldName)) {
                    deserializedBatchConfigurationProperties.batchGroupName = reader.getString();
                } else if ("releaseCriteria".equals(fieldName)) {
                    deserializedBatchConfigurationProperties.releaseCriteria = BatchReleaseCriteria.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBatchConfigurationProperties;
        });
    }
}
