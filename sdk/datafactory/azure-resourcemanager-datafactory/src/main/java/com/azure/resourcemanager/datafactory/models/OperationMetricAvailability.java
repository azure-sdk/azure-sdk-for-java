// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines how often data for a metric becomes available.
 */
@Fluent
public final class OperationMetricAvailability implements JsonSerializable<OperationMetricAvailability> {
    /*
     * The granularity for the metric.
     */
    private String timeGrain;

    /*
     * Blob created in the customer storage account, per hour.
     */
    private String blobDuration;

    /**
     * Creates an instance of OperationMetricAvailability class.
     */
    public OperationMetricAvailability() {
    }

    /**
     * Get the timeGrain property: The granularity for the metric.
     * 
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain property: The granularity for the metric.
     * 
     * @param timeGrain the timeGrain value to set.
     * @return the OperationMetricAvailability object itself.
     */
    public OperationMetricAvailability withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the blobDuration property: Blob created in the customer storage account, per hour.
     * 
     * @return the blobDuration value.
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Set the blobDuration property: Blob created in the customer storage account, per hour.
     * 
     * @param blobDuration the blobDuration value to set.
     * @return the OperationMetricAvailability object itself.
     */
    public OperationMetricAvailability withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("timeGrain", this.timeGrain);
        jsonWriter.writeStringField("blobDuration", this.blobDuration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationMetricAvailability from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationMetricAvailability if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationMetricAvailability.
     */
    public static OperationMetricAvailability fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationMetricAvailability deserializedOperationMetricAvailability = new OperationMetricAvailability();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("timeGrain".equals(fieldName)) {
                    deserializedOperationMetricAvailability.timeGrain = reader.getString();
                } else if ("blobDuration".equals(fieldName)) {
                    deserializedOperationMetricAvailability.blobDuration = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationMetricAvailability;
        });
    }
}
