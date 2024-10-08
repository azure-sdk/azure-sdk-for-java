// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.utils.CustomizationHelper;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;

/**
 * Statistics for the queue.
 */
@Immutable
public final class RouterQueueStatistics implements JsonSerializable<RouterQueueStatistics> {

    /*
     * Id of the queue these details are about.
     */
    @Generated
    private final String queueId;

    /*
     * Length of the queue: total number of enqueued jobs.
     */
    @Generated
    private final int length;

    /*
     * The estimated wait time of this queue rounded up to the nearest minute, grouped by job priority.
     */
    @Generated
    private Map<Integer, Duration> estimatedWaitTimeMinutes;

    /*
     * The wait time of the job that has been enqueued in this queue for the longest.
     */
    @Generated
    private Double longestJobWaitTimeMinutes;

    /**
     * Creates an instance of RouterQueueStatistics class.
     *
     * @param queueId the queueId value to set.
     * @param length the length value to set.
     */
    @Generated
    private RouterQueueStatistics(String queueId, int length) {
        this.queueId = queueId;
        this.length = length;
    }

    /**
     * Get the queueId property: Id of the queue these details are about.
     *
     * @return the queueId value.
     */
    @Generated
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Get the length property: Length of the queue: total number of enqueued jobs.
     *
     * @return the length value.
     */
    @Generated
    public int getLength() {
        return this.length;
    }

    /**
     * Get the estimatedWaitTimeMinutes property: The estimated wait time of this queue rounded up to the nearest
     * minute, grouped by job priority.
     *
     * @return the estimatedWaitTimeMinutes value.
     */
    @Generated
    public Map<Integer, Duration> getEstimatedWaitTime() {
        return this.estimatedWaitTimeMinutes;
    }

    /**
     * Get the longestJobWaitTimeMinutes property: The wait time of the job that has been enqueued in this queue for the
     * longest.
     *
     * @return the longestJobWaitTimeMinutes value.
     */
    @Generated
    public Double getLongestJobWaitTimeMinutes() {
        return this.longestJobWaitTimeMinutes;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("queueId", this.queueId);
        jsonWriter.writeIntField("length", this.length);
        CustomizationHelper.serializeDurationToMinutesMap(jsonWriter, "estimatedWaitTimeMinutes",
            this.estimatedWaitTimeMinutes);
        jsonWriter.writeNumberField("longestJobWaitTimeMinutes", this.longestJobWaitTimeMinutes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RouterQueueStatistics from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RouterQueueStatistics if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RouterQueueStatistics.
     */
    @Generated
    public static RouterQueueStatistics fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String queueId = null;
            int length = 0;
            Map<Integer, Duration> estimatedWaitTimeMinutes = null;
            Double longestJobWaitTimeMinutes = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("queueId".equals(fieldName)) {
                    queueId = reader.getString();
                } else if ("length".equals(fieldName)) {
                    length = reader.getInt();
                } else if ("estimatedWaitTimeMinutes".equals(fieldName)) {
                    estimatedWaitTimeMinutes = CustomizationHelper.deserializeDurationFromMinutesMap(reader);
                } else if ("longestJobWaitTimeMinutes".equals(fieldName)) {
                    longestJobWaitTimeMinutes = reader.getNullable(JsonReader::getDouble);
                } else {
                    reader.skipChildren();
                }
            }
            RouterQueueStatistics deserializedRouterQueueStatistics = new RouterQueueStatistics(queueId, length);
            deserializedRouterQueueStatistics.estimatedWaitTimeMinutes = estimatedWaitTimeMinutes;
            deserializedRouterQueueStatistics.longestJobWaitTimeMinutes = longestJobWaitTimeMinutes;
            return deserializedRouterQueueStatistics;
        });
    }
}
