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
 * Schema of common properties of all participant event user.
 */
@Immutable
public final class AcsCallParticipantProperties implements JsonSerializable<AcsCallParticipantProperties> {
    /*
     * The communication identifier of the participant user
     */
    @Generated
    private CommunicationIdentifierModel communicationIdentifier;

    /*
     * The role of the participant
     */
    @Generated
    private AcsCallParticipantKind role;

    /**
     * Creates an instance of AcsCallParticipantProperties class.
     */
    @Generated
    private AcsCallParticipantProperties() {
    }

    /**
     * Get the communicationIdentifier property: The communication identifier of the participant user.
     * 
     * @return the communicationIdentifier value.
     */
    @Generated
    public CommunicationIdentifierModel getCommunicationIdentifier() {
        return this.communicationIdentifier;
    }

    /**
     * Get the role property: The role of the participant.
     * 
     * @return the role value.
     */
    @Generated
    public AcsCallParticipantKind getRole() {
        return this.role;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("communicationIdentifier", this.communicationIdentifier);
        jsonWriter.writeStringField("role", this.role == null ? null : this.role.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsCallParticipantProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsCallParticipantProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AcsCallParticipantProperties.
     */
    @Generated
    public static AcsCallParticipantProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AcsCallParticipantProperties deserializedAcsCallParticipantProperties = new AcsCallParticipantProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("communicationIdentifier".equals(fieldName)) {
                    deserializedAcsCallParticipantProperties.communicationIdentifier
                        = CommunicationIdentifierModel.fromJson(reader);
                } else if ("role".equals(fieldName)) {
                    deserializedAcsCallParticipantProperties.role
                        = AcsCallParticipantKind.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAcsCallParticipantProperties;
        });
    }
}
