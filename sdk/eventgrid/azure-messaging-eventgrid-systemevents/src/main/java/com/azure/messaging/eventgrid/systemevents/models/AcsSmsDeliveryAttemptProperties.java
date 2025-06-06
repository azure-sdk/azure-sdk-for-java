// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.messaging.eventgrid.systemevents.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Schema for details of a delivery attempt.
 */
@Immutable
public final class AcsSmsDeliveryAttemptProperties implements JsonSerializable<AcsSmsDeliveryAttemptProperties> {
    /*
     * TimeStamp when delivery was attempted
     */
    @Generated
    private final OffsetDateTime timestamp;

    /*
     * Number of segments that were successfully delivered
     */
    @Generated
    private final int segmentsSucceeded;

    /*
     * Number of segments whose delivery failed
     */
    @Generated
    private final int segmentsFailed;

    /**
     * Creates an instance of AcsSmsDeliveryAttemptProperties class.
     * 
     * @param timestamp the timestamp value to set.
     * @param segmentsSucceeded the segmentsSucceeded value to set.
     * @param segmentsFailed the segmentsFailed value to set.
     */
    @Generated
    private AcsSmsDeliveryAttemptProperties(OffsetDateTime timestamp, int segmentsSucceeded, int segmentsFailed) {
        this.timestamp = timestamp;
        this.segmentsSucceeded = segmentsSucceeded;
        this.segmentsFailed = segmentsFailed;
    }

    /**
     * Get the timestamp property: TimeStamp when delivery was attempted.
     * 
     * @return the timestamp value.
     */
    @Generated
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the segmentsSucceeded property: Number of segments that were successfully delivered.
     * 
     * @return the segmentsSucceeded value.
     */
    @Generated
    public int getSegmentsSucceeded() {
        return this.segmentsSucceeded;
    }

    /**
     * Get the segmentsFailed property: Number of segments whose delivery failed.
     * 
     * @return the segmentsFailed value.
     */
    @Generated
    public int getSegmentsFailed() {
        return this.segmentsFailed;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("timestamp",
            this.timestamp == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.timestamp));
        jsonWriter.writeIntField("segmentsSucceeded", this.segmentsSucceeded);
        jsonWriter.writeIntField("segmentsFailed", this.segmentsFailed);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsSmsDeliveryAttemptProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsSmsDeliveryAttemptProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AcsSmsDeliveryAttemptProperties.
     */
    @Generated
    public static AcsSmsDeliveryAttemptProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OffsetDateTime timestamp = null;
            int segmentsSucceeded = 0;
            int segmentsFailed = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("timestamp".equals(fieldName)) {
                    timestamp = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("segmentsSucceeded".equals(fieldName)) {
                    segmentsSucceeded = reader.getInt();
                } else if ("segmentsFailed".equals(fieldName)) {
                    segmentsFailed = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }
            return new AcsSmsDeliveryAttemptProperties(timestamp, segmentsSucceeded, segmentsFailed);
        });
    }
}
