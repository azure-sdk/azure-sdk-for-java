// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.messaging.eventgrid.systemevents.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.Communication.RouterJobWaitingForActivation event.
 */
@Immutable
public final class AcsRouterJobWaitingForActivationEventData extends AcsRouterJobEventData {

    /*
     * Router Job Waiting For Activation Priority
     */
    @Generated
    private final int priority;

    /*
     * Router Job Waiting For Activation Worker Selector Expired
     */
    @Generated
    private List<AcsRouterWorkerSelector> expiredAttachedWorkerSelectors;

    /*
     * Router Job Waiting For Activation Requested Worker Selector Expired
     */
    @Generated
    private List<AcsRouterWorkerSelector> expiredRequestedWorkerSelectors;

    /*
     * Router Job Waiting For Activation Scheduled Time in UTC
     */
    @Generated
    private final OffsetDateTime scheduledOn;

    /*
     * Router Job Waiting For Activation Unavailable For Matching
     */
    @Generated
    private final boolean unavailableForMatching;

    /*
     * Router Job events Queue Id
     */
    @Generated
    private String queueId;

    /*
     * Router Event Channel ID
     */
    @Generated
    private String channelId;

    /*
     * Router Event Channel Reference
     */
    @Generated
    private String channelReference;

    /**
     * Creates an instance of AcsRouterJobWaitingForActivationEventData class.
     *
     * @param jobId the jobId value to set.
     * @param labels the labels value to set.
     * @param tags the tags value to set.
     * @param priority the priority value to set.
     * @param scheduledOn the scheduledOn value to set.
     * @param unavailableForMatching the unavailableForMatching value to set.
     */
    @Generated
    private AcsRouterJobWaitingForActivationEventData(String jobId, Map<String, String> labels,
        Map<String, String> tags, int priority, OffsetDateTime scheduledOn, boolean unavailableForMatching) {
        super(jobId, labels, tags);
        this.priority = priority;
        this.scheduledOn = scheduledOn;
        this.unavailableForMatching = unavailableForMatching;
    }

    /**
     * Get the priority property: Router Job Waiting For Activation Priority.
     *
     * @return the priority value.
     */
    @Generated
    public int getPriority() {
        return this.priority;
    }

    /**
     * Get the expiredAttachedWorkerSelectors property: Router Job Waiting For Activation Worker Selector Expired.
     *
     * @return the expiredAttachedWorkerSelectors value.
     */
    @Generated
    public List<AcsRouterWorkerSelector> getExpiredAttachedWorkerSelectors() {
        return this.expiredAttachedWorkerSelectors;
    }

    /**
     * Get the expiredRequestedWorkerSelectors property: Router Job Waiting For Activation Requested Worker Selector
     * Expired.
     *
     * @return the expiredRequestedWorkerSelectors value.
     */
    @Generated
    public List<AcsRouterWorkerSelector> getExpiredRequestedWorkerSelectors() {
        return this.expiredRequestedWorkerSelectors;
    }

    /**
     * Get the scheduledOn property: Router Job Waiting For Activation Scheduled Time in UTC.
     *
     * @return the scheduledOn value.
     */
    @Generated
    public OffsetDateTime getScheduledOn() {
        return this.scheduledOn;
    }

    /**
     * Get the unavailableForMatching property: Router Job Waiting For Activation Unavailable For Matching.
     *
     * @return the unavailableForMatching value.
     */
    @Generated
    public boolean isUnavailableForMatching() {
        return this.unavailableForMatching;
    }

    /**
     * Get the queueId property: Router Job events Queue Id.
     *
     * @return the queueId value.
     */
    @Generated
    @Override
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Get the channelId property: Router Event Channel ID.
     *
     * @return the channelId value.
     */
    @Generated
    @Override
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * Get the channelReference property: Router Event Channel Reference.
     *
     * @return the channelReference value.
     */
    @Generated
    @Override
    public String getChannelReference() {
        return this.channelReference;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("jobId", getJobId());
        jsonWriter.writeMapField("labels", getLabels(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("tags", getTags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("channelReference", getChannelReference());
        jsonWriter.writeStringField("channelId", getChannelId());
        jsonWriter.writeStringField("queueId", getQueueId());
        jsonWriter.writeIntField("priority", this.priority);
        jsonWriter.writeStringField("scheduledOn",
            this.scheduledOn == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.scheduledOn));
        jsonWriter.writeBooleanField("unavailableForMatching", this.unavailableForMatching);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsRouterJobWaitingForActivationEventData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsRouterJobWaitingForActivationEventData if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AcsRouterJobWaitingForActivationEventData.
     */
    @Generated
    public static AcsRouterJobWaitingForActivationEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String jobId = null;
            Map<String, String> labels = null;
            Map<String, String> tags = null;
            String channelReference = null;
            String channelId = null;
            String queueId = null;
            int priority = 0;
            List<AcsRouterWorkerSelector> expiredAttachedWorkerSelectors = null;
            List<AcsRouterWorkerSelector> expiredRequestedWorkerSelectors = null;
            OffsetDateTime scheduledOn = null;
            boolean unavailableForMatching = false;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("jobId".equals(fieldName)) {
                    jobId = reader.getString();
                } else if ("labels".equals(fieldName)) {
                    labels = reader.readMap(reader1 -> reader1.getString());
                } else if ("tags".equals(fieldName)) {
                    tags = reader.readMap(reader1 -> reader1.getString());
                } else if ("channelReference".equals(fieldName)) {
                    channelReference = reader.getString();
                } else if ("channelId".equals(fieldName)) {
                    channelId = reader.getString();
                } else if ("queueId".equals(fieldName)) {
                    queueId = reader.getString();
                } else if ("priority".equals(fieldName)) {
                    priority = reader.getInt();
                } else if ("expiredAttachedWorkerSelectors".equals(fieldName)) {
                    expiredAttachedWorkerSelectors
                        = reader.readArray(reader1 -> AcsRouterWorkerSelector.fromJson(reader1));
                } else if ("expiredRequestedWorkerSelectors".equals(fieldName)) {
                    expiredRequestedWorkerSelectors
                        = reader.readArray(reader1 -> AcsRouterWorkerSelector.fromJson(reader1));
                } else if ("scheduledOn".equals(fieldName)) {
                    scheduledOn = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("unavailableForMatching".equals(fieldName)) {
                    unavailableForMatching = reader.getBoolean();
                } else {
                    reader.skipChildren();
                }
            }
            AcsRouterJobWaitingForActivationEventData deserializedAcsRouterJobWaitingForActivationEventData
                = new AcsRouterJobWaitingForActivationEventData(jobId, labels, tags, priority, scheduledOn,
                    unavailableForMatching);
            deserializedAcsRouterJobWaitingForActivationEventData.channelReference = channelReference;
            deserializedAcsRouterJobWaitingForActivationEventData.channelId = channelId;
            deserializedAcsRouterJobWaitingForActivationEventData.queueId = queueId;
            deserializedAcsRouterJobWaitingForActivationEventData.expiredAttachedWorkerSelectors
                = expiredAttachedWorkerSelectors;
            deserializedAcsRouterJobWaitingForActivationEventData.expiredRequestedWorkerSelectors
                = expiredRequestedWorkerSelectors;
            return deserializedAcsRouterJobWaitingForActivationEventData;
        });
    }
}
