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
 * Schema of calling event ended by properties.
 */
@Immutable
public final class AcsCallEndedByProperties implements JsonSerializable<AcsCallEndedByProperties> {
    /*
     * The communication identifier of the call ended by
     */
    @Generated
    private final CommunicationIdentifierModel communicationIdentifier;

    /*
     * The type of call ended by.
     */
    @Generated
    private final AcsCallEndedByKind kind;

    /*
     * The name of the call ended by.
     */
    @Generated
    private final String name;

    /**
     * Creates an instance of AcsCallEndedByProperties class.
     * 
     * @param communicationIdentifier the communicationIdentifier value to set.
     * @param kind the kind value to set.
     * @param name the name value to set.
     */
    @Generated
    private AcsCallEndedByProperties(CommunicationIdentifierModel communicationIdentifier, AcsCallEndedByKind kind,
        String name) {
        this.communicationIdentifier = communicationIdentifier;
        this.kind = kind;
        this.name = name;
    }

    /**
     * Get the communicationIdentifier property: The communication identifier of the call ended by.
     * 
     * @return the communicationIdentifier value.
     */
    @Generated
    public CommunicationIdentifierModel getCommunicationIdentifier() {
        return this.communicationIdentifier;
    }

    /**
     * Get the kind property: The type of call ended by.
     * 
     * @return the kind value.
     */
    @Generated
    public AcsCallEndedByKind getKind() {
        return this.kind;
    }

    /**
     * Get the name property: The name of the call ended by.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("communicationIdentifier", this.communicationIdentifier);
        jsonWriter.writeStringField("type", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsCallEndedByProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsCallEndedByProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AcsCallEndedByProperties.
     */
    @Generated
    public static AcsCallEndedByProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunicationIdentifierModel communicationIdentifier = null;
            AcsCallEndedByKind kind = null;
            String name = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("communicationIdentifier".equals(fieldName)) {
                    communicationIdentifier = CommunicationIdentifierModel.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    kind = AcsCallEndedByKind.fromString(reader.getString());
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new AcsCallEndedByProperties(communicationIdentifier, kind, name);
        });
    }
}
