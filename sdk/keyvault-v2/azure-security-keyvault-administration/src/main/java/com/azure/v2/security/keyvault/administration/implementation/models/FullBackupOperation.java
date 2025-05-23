// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.v2.security.keyvault.administration.implementation.models;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Full backup operation.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class FullBackupOperation implements JsonSerializable<FullBackupOperation> {
    /*
     * Status of the backup operation.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private OperationStatus status;

    /*
     * The status details of backup operation.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String statusDetails;

    /*
     * Error encountered, if any, during the full backup operation.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private FullBackupOperationError error;

    /*
     * The start time of the backup operation in UTC
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long startTime;

    /*
     * The end time of the backup operation in UTC
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long endTime;

    /*
     * Identifier for the full backup operation.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String jobId;

    /*
     * The Azure blob storage container Uri which contains the full backup
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String azureStorageBlobContainerUri;

    /**
     * Creates an instance of FullBackupOperation class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private FullBackupOperation() {
    }

    /**
     * Get the status property: Status of the backup operation.
     * 
     * @return the status value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public OperationStatus getStatus() {
        return this.status;
    }

    /**
     * Get the statusDetails property: The status details of backup operation.
     * 
     * @return the statusDetails value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * Get the error property: Error encountered, if any, during the full backup operation.
     * 
     * @return the error value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public FullBackupOperationError getError() {
        return this.error;
    }

    /**
     * Get the startTime property: The start time of the backup operation in UTC.
     * 
     * @return the startTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public OffsetDateTime getStartTime() {
        if (this.startTime == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.startTime), ZoneOffset.UTC);
    }

    /**
     * Get the endTime property: The end time of the backup operation in UTC.
     * 
     * @return the endTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public OffsetDateTime getEndTime() {
        if (this.endTime == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.endTime), ZoneOffset.UTC);
    }

    /**
     * Get the jobId property: Identifier for the full backup operation.
     * 
     * @return the jobId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Get the azureStorageBlobContainerUri property: The Azure blob storage container Uri which contains the full
     * backup.
     * 
     * @return the azureStorageBlobContainerUri value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAzureStorageBlobContainerUri() {
        return this.azureStorageBlobContainerUri;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.getValue());
        jsonWriter.writeStringField("statusDetails", this.statusDetails);
        jsonWriter.writeJsonField("error", this.error);
        jsonWriter.writeNumberField("startTime", this.startTime);
        jsonWriter.writeNumberField("endTime", this.endTime);
        jsonWriter.writeStringField("jobId", this.jobId);
        jsonWriter.writeStringField("azureStorageBlobContainerUri", this.azureStorageBlobContainerUri);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FullBackupOperation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FullBackupOperation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FullBackupOperation.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static FullBackupOperation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FullBackupOperation deserializedFullBackupOperation = new FullBackupOperation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedFullBackupOperation.status = OperationStatus.fromValue(reader.getString());
                } else if ("statusDetails".equals(fieldName)) {
                    deserializedFullBackupOperation.statusDetails = reader.getString();
                } else if ("error".equals(fieldName)) {
                    deserializedFullBackupOperation.error = FullBackupOperationError.fromJson(reader);
                } else if ("startTime".equals(fieldName)) {
                    deserializedFullBackupOperation.startTime = reader.getNullable(JsonReader::getLong);
                } else if ("endTime".equals(fieldName)) {
                    deserializedFullBackupOperation.endTime = reader.getNullable(JsonReader::getLong);
                } else if ("jobId".equals(fieldName)) {
                    deserializedFullBackupOperation.jobId = reader.getString();
                } else if ("azureStorageBlobContainerUri".equals(fieldName)) {
                    deserializedFullBackupOperation.azureStorageBlobContainerUri = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFullBackupOperation;
        });
    }
}
