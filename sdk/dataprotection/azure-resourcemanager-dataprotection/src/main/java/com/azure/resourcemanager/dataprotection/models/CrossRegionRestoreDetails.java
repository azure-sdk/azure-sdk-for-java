// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Cross Region Restore details.
 */
@Fluent
public final class CrossRegionRestoreDetails implements JsonSerializable<CrossRegionRestoreDetails> {
    /*
     * The sourceRegion property.
     */
    private String sourceRegion;

    /*
     * The sourceBackupInstanceId property.
     */
    private String sourceBackupInstanceId;

    /**
     * Creates an instance of CrossRegionRestoreDetails class.
     */
    public CrossRegionRestoreDetails() {
    }

    /**
     * Get the sourceRegion property: The sourceRegion property.
     * 
     * @return the sourceRegion value.
     */
    public String sourceRegion() {
        return this.sourceRegion;
    }

    /**
     * Set the sourceRegion property: The sourceRegion property.
     * 
     * @param sourceRegion the sourceRegion value to set.
     * @return the CrossRegionRestoreDetails object itself.
     */
    public CrossRegionRestoreDetails withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * Get the sourceBackupInstanceId property: The sourceBackupInstanceId property.
     * 
     * @return the sourceBackupInstanceId value.
     */
    public String sourceBackupInstanceId() {
        return this.sourceBackupInstanceId;
    }

    /**
     * Set the sourceBackupInstanceId property: The sourceBackupInstanceId property.
     * 
     * @param sourceBackupInstanceId the sourceBackupInstanceId value to set.
     * @return the CrossRegionRestoreDetails object itself.
     */
    public CrossRegionRestoreDetails withSourceBackupInstanceId(String sourceBackupInstanceId) {
        this.sourceBackupInstanceId = sourceBackupInstanceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceRegion() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sourceRegion in model CrossRegionRestoreDetails"));
        }
        if (sourceBackupInstanceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sourceBackupInstanceId in model CrossRegionRestoreDetails"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CrossRegionRestoreDetails.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sourceRegion", this.sourceRegion);
        jsonWriter.writeStringField("sourceBackupInstanceId", this.sourceBackupInstanceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CrossRegionRestoreDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CrossRegionRestoreDetails if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CrossRegionRestoreDetails.
     */
    public static CrossRegionRestoreDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CrossRegionRestoreDetails deserializedCrossRegionRestoreDetails = new CrossRegionRestoreDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRegion".equals(fieldName)) {
                    deserializedCrossRegionRestoreDetails.sourceRegion = reader.getString();
                } else if ("sourceBackupInstanceId".equals(fieldName)) {
                    deserializedCrossRegionRestoreDetails.sourceBackupInstanceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCrossRegionRestoreDetails;
        });
    }
}
