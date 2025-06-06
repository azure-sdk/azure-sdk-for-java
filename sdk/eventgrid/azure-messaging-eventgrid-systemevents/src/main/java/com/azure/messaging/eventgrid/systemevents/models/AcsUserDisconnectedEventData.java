// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.messaging.eventgrid.systemevents.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Schema of the Data property of an EventGridEvent for an Microsoft.Communication.UserDisconnected event.
 */
@Immutable
public final class AcsUserDisconnectedEventData implements JsonSerializable<AcsUserDisconnectedEventData> {

    /*
     * The communication identifier of the user who was disconnected
     */
    @Generated
    private final CommunicationIdentifierModel userCommunicationIdentifier;

    /**
     * Creates an instance of AcsUserDisconnectedEventData class.
     *
     * @param userCommunicationIdentifier the userCommunicationIdentifier value to set.
     */
    @Generated
    private AcsUserDisconnectedEventData(CommunicationIdentifierModel userCommunicationIdentifier) {
        this.userCommunicationIdentifier = userCommunicationIdentifier;
    }

    /**
     * Get the userCommunicationIdentifier property: The communication identifier of the user who was disconnected.
     *
     * @return the userCommunicationIdentifier value.
     */
    @Generated
    public CommunicationIdentifierModel getUserCommunicationIdentifier() {
        return this.userCommunicationIdentifier;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("userCommunicationIdentifier", this.userCommunicationIdentifier);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsUserDisconnectedEventData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsUserDisconnectedEventData if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AcsUserDisconnectedEventData.
     */
    @Generated
    public static AcsUserDisconnectedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunicationIdentifierModel userCommunicationIdentifier = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("userCommunicationIdentifier".equals(fieldName)) {
                    userCommunicationIdentifier = CommunicationIdentifierModel.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new AcsUserDisconnectedEventData(userCommunicationIdentifier);
        });
    }
}
