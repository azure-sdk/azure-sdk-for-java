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
 * Cross Region Restore Request Object.
 */
@Fluent
public final class CrossRegionRestoreRequestObject implements JsonSerializable<CrossRegionRestoreRequestObject> {
    /*
     * Gets or sets the restore request object.
     */
    private AzureBackupRestoreRequest restoreRequestObject;

    /*
     * Cross region restore details.
     */
    private CrossRegionRestoreDetails crossRegionRestoreDetails;

    /**
     * Creates an instance of CrossRegionRestoreRequestObject class.
     */
    public CrossRegionRestoreRequestObject() {
    }

    /**
     * Get the restoreRequestObject property: Gets or sets the restore request object.
     * 
     * @return the restoreRequestObject value.
     */
    public AzureBackupRestoreRequest restoreRequestObject() {
        return this.restoreRequestObject;
    }

    /**
     * Set the restoreRequestObject property: Gets or sets the restore request object.
     * 
     * @param restoreRequestObject the restoreRequestObject value to set.
     * @return the CrossRegionRestoreRequestObject object itself.
     */
    public CrossRegionRestoreRequestObject withRestoreRequestObject(AzureBackupRestoreRequest restoreRequestObject) {
        this.restoreRequestObject = restoreRequestObject;
        return this;
    }

    /**
     * Get the crossRegionRestoreDetails property: Cross region restore details.
     * 
     * @return the crossRegionRestoreDetails value.
     */
    public CrossRegionRestoreDetails crossRegionRestoreDetails() {
        return this.crossRegionRestoreDetails;
    }

    /**
     * Set the crossRegionRestoreDetails property: Cross region restore details.
     * 
     * @param crossRegionRestoreDetails the crossRegionRestoreDetails value to set.
     * @return the CrossRegionRestoreRequestObject object itself.
     */
    public CrossRegionRestoreRequestObject
        withCrossRegionRestoreDetails(CrossRegionRestoreDetails crossRegionRestoreDetails) {
        this.crossRegionRestoreDetails = crossRegionRestoreDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (restoreRequestObject() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property restoreRequestObject in model CrossRegionRestoreRequestObject"));
        } else {
            restoreRequestObject().validate();
        }
        if (crossRegionRestoreDetails() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property crossRegionRestoreDetails in model CrossRegionRestoreRequestObject"));
        } else {
            crossRegionRestoreDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CrossRegionRestoreRequestObject.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("restoreRequestObject", this.restoreRequestObject);
        jsonWriter.writeJsonField("crossRegionRestoreDetails", this.crossRegionRestoreDetails);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CrossRegionRestoreRequestObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CrossRegionRestoreRequestObject if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CrossRegionRestoreRequestObject.
     */
    public static CrossRegionRestoreRequestObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CrossRegionRestoreRequestObject deserializedCrossRegionRestoreRequestObject
                = new CrossRegionRestoreRequestObject();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("restoreRequestObject".equals(fieldName)) {
                    deserializedCrossRegionRestoreRequestObject.restoreRequestObject
                        = AzureBackupRestoreRequest.fromJson(reader);
                } else if ("crossRegionRestoreDetails".equals(fieldName)) {
                    deserializedCrossRegionRestoreRequestObject.crossRegionRestoreDetails
                        = CrossRegionRestoreDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCrossRegionRestoreRequestObject;
        });
    }
}
