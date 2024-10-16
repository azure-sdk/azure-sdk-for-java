// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

/** The request payload start for call recording operation with call locator. */
@Fluent
public final class StartCallRecordingRequestInternal implements JsonSerializable<StartCallRecordingRequestInternal> {
    /*
     * The call locator.
     */
    private CallLocatorInternal callLocator;

    /*
     * The uri to send notifications to.
     */
    private String recordingStateCallbackUri;

    /*
     * The content type of call recording.
     */
    private RecordingContentInternal recordingContentType;

    /*
     * The channel type of call recording.
     */
    private RecordingChannelInternal recordingChannelType;

    /*
     * The format type of call recording.
     */
    private RecordingFormatInternal recordingFormatType;

    /*
     * The channel affinity of call recording.
     */
    private List<ChannelAffinityInternal> channelAffinity;

    /**
     * Get the callLocator property: The call locator.
     *
     * @return the callLocator value.
     */
    public CallLocatorInternal getCallLocator() {
        return this.callLocator;
    }

    /**
     * Set the callLocator property: The call locator.
     *
     * @param callLocator the callLocator value to set.
     * @return the StartCallRecordingRequestInternal object itself.
     */
    public StartCallRecordingRequestInternal setCallLocator(CallLocatorInternal callLocator) {
        this.callLocator = callLocator;
        return this;
    }

    /**
     * Get the recordingStateCallbackUri property: The uri to send notifications to.
     *
     * @return the recordingStateCallbackUri value.
     */
    public String getRecordingStateCallbackUri() {
        return this.recordingStateCallbackUri;
    }

    /**
     * Set the recordingStateCallbackUri property: The uri to send notifications to.
     *
     * @param recordingStateCallbackUri the recordingStateCallbackUri value to set.
     * @return the StartCallRecordingRequestInternal object itself.
     */
    public StartCallRecordingRequestInternal setRecordingStateCallbackUri(String recordingStateCallbackUri) {
        this.recordingStateCallbackUri = recordingStateCallbackUri;
        return this;
    }

    /**
     * Get the recordingContentType property: The content type of call recording.
     *
     * @return the recordingContentType value.
     */
    public RecordingContentInternal getRecordingContentType() {
        return this.recordingContentType;
    }

    /**
     * Set the recordingContentType property: The content type of call recording.
     *
     * @param recordingContentType the recordingContentType value to set.
     * @return the StartCallRecordingRequestInternal object itself.
     */
    public StartCallRecordingRequestInternal setRecordingContentType(RecordingContentInternal recordingContentType) {
        this.recordingContentType = recordingContentType;
        return this;
    }

    /**
     * Get the recordingChannelType property: The channel type of call recording.
     *
     * @return the recordingChannelType value.
     */
    public RecordingChannelInternal getRecordingChannelType() {
        return this.recordingChannelType;
    }

    /**
     * Set the recordingChannelType property: The channel type of call recording.
     *
     * @param recordingChannelType the recordingChannelType value to set.
     * @return the StartCallRecordingRequestInternal object itself.
     */
    public StartCallRecordingRequestInternal setRecordingChannelType(RecordingChannelInternal recordingChannelType) {
        this.recordingChannelType = recordingChannelType;
        return this;
    }

    /**
     * Get the recordingFormatType property: The format type of call recording.
     *
     * @return the recordingFormatType value.
     */
    public RecordingFormatInternal getRecordingFormatType() {
        return this.recordingFormatType;
    }

    /**
     * Set the recordingFormatType property: The format type of call recording.
     *
     * @param recordingFormatType the recordingFormatType value to set.
     * @return the StartCallRecordingRequestInternal object itself.
     */
    public StartCallRecordingRequestInternal setRecordingFormatType(RecordingFormatInternal recordingFormatType) {
        this.recordingFormatType = recordingFormatType;
        return this;
    }

    /**
     * Get the channelAffinity property: The channel affinity of call recording.
     *
     * @return the channelAffinity value.
     */
    public List<ChannelAffinityInternal> getChannelAffinity() {
        return this.channelAffinity;
    }

    /**
     * Set the channelAffinity property: The channel affinity of call recording.
     *
     * @param channelAffinity the channelAffinity value to set.
     * @return the StartCallRecordingRequestInternal object itself.
     */
    public StartCallRecordingRequestInternal setChannelAffinity(List<ChannelAffinityInternal> channelAffinity) {
        this.channelAffinity = channelAffinity;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        return jsonWriter.writeStartObject()
            .writeJsonField("callLocator", callLocator)
            .writeStringField("recordingStateCallbackUri", recordingStateCallbackUri)
            .writeStringField("recordingContentType", Objects.toString(recordingContentType, null))
            .writeStringField("recordingChannelType", Objects.toString(recordingChannelType, null))
            .writeStringField("recordingFormatType", Objects.toString(recordingFormatType, null))
            .writeArrayField("channelAffinity", channelAffinity, JsonWriter::writeJson)
            .writeEndObject();
    }

    /**
     * Reads an instance of {@link StartCallRecordingRequestInternal} from the {@link JsonReader}.
     *
     * @param jsonReader The {@link JsonReader} to read.
     * @return An instance of {@link StartCallRecordingRequestInternal}, or null if the {@link JsonReader} was pointing to
     * {@link JsonToken#NULL}.
     * @throws IOException If an error occurs while reading the {@link JsonReader}.
     */
    public static StartCallRecordingRequestInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StartCallRecordingRequestInternal request = new StartCallRecordingRequestInternal();

            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("callLocator".equals(fieldName)) {
                    request.callLocator = CallLocatorInternal.fromJson(reader);
                } else if ("recordingStateCallbackUri".equals(fieldName)) {
                    request.recordingStateCallbackUri = reader.getString();
                } else if ("recordingContentType".equals(fieldName)) {
                    request.recordingContentType = RecordingContentInternal.fromString(reader.getString());
                } else if ("recordingChannelType".equals(fieldName)) {
                    request.recordingChannelType = RecordingChannelInternal.fromString(reader.getString());
                } else if ("recordingFormatType".equals(fieldName)) {
                    request.recordingFormatType = RecordingFormatInternal.fromString(reader.getString());
                } else if ("channelAffinity".equals(fieldName)) {
                    request.channelAffinity = reader.readArray(ChannelAffinityInternal::fromJson);
                } else {
                    reader.skipChildren();
                }
            }

            return request;
        });
    }
}
