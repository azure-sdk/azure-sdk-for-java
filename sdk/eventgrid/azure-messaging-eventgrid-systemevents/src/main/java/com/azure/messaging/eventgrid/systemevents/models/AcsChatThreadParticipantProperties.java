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
import java.util.Map;

/**
 * Schema of the chat thread participant.
 */
@Immutable
public final class AcsChatThreadParticipantProperties implements JsonSerializable<AcsChatThreadParticipantProperties> {
    /*
     * The name of the user
     */
    @Generated
    private String displayName;

    /*
     * The communication identifier of the user
     */
    @Generated
    private final CommunicationIdentifierModel participantCommunicationIdentifier;

    /*
     * The metadata of the user
     */
    @Generated
    private Map<String, String> metadata;

    /**
     * Creates an instance of AcsChatThreadParticipantProperties class.
     * 
     * @param participantCommunicationIdentifier the participantCommunicationIdentifier value to set.
     */
    @Generated
    private AcsChatThreadParticipantProperties(CommunicationIdentifierModel participantCommunicationIdentifier) {
        this.participantCommunicationIdentifier = participantCommunicationIdentifier;
    }

    /**
     * Get the displayName property: The name of the user.
     * 
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the participantCommunicationIdentifier property: The communication identifier of the user.
     * 
     * @return the participantCommunicationIdentifier value.
     */
    @Generated
    public CommunicationIdentifierModel getParticipantCommunicationIdentifier() {
        return this.participantCommunicationIdentifier;
    }

    /**
     * Get the metadata property: The metadata of the user.
     * 
     * @return the metadata value.
     */
    @Generated
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("participantCommunicationIdentifier", this.participantCommunicationIdentifier);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsChatThreadParticipantProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsChatThreadParticipantProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AcsChatThreadParticipantProperties.
     */
    @Generated
    public static AcsChatThreadParticipantProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunicationIdentifierModel participantCommunicationIdentifier = null;
            String displayName = null;
            Map<String, String> metadata = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("participantCommunicationIdentifier".equals(fieldName)) {
                    participantCommunicationIdentifier = CommunicationIdentifierModel.fromJson(reader);
                } else if ("displayName".equals(fieldName)) {
                    displayName = reader.getString();
                } else if ("metadata".equals(fieldName)) {
                    metadata = reader.readMap(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            AcsChatThreadParticipantProperties deserializedAcsChatThreadParticipantProperties
                = new AcsChatThreadParticipantProperties(participantCommunicationIdentifier);
            deserializedAcsChatThreadParticipantProperties.displayName = displayName;
            deserializedAcsChatThreadParticipantProperties.metadata = metadata;

            return deserializedAcsChatThreadParticipantProperties;
        });
    }
}
