// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.identity.implementation.models;

import com.azure.communication.identity.models.CommunicationTokenScope;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The CommunicationIdentityAccessTokenRequest model.
 */
@Fluent
public final class CommunicationIdentityAccessTokenRequest
    implements JsonSerializable<CommunicationIdentityAccessTokenRequest> {
    /*
     * List of scopes attached to the token.
     */
    @Generated
    private List<CommunicationTokenScope> scopes;

    /*
     * Optional custom validity period of the token within [60,1440] minutes range. If not provided, the default value
     * of 1440 minutes (24 hours) will be used.
     */
    @Generated
    private Integer expiresInMinutes;

    /**
     * Creates an instance of CommunicationIdentityAccessTokenRequest class.
     */
    @Generated
    public CommunicationIdentityAccessTokenRequest() {
    }

    /**
     * Get the scopes property: List of scopes attached to the token.
     * 
     * @return the scopes value.
     */
    @Generated
    public List<CommunicationTokenScope> getScopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: List of scopes attached to the token.
     * 
     * @param scopes the scopes value to set.
     * @return the CommunicationIdentityAccessTokenRequest object itself.
     */
    @Generated
    public CommunicationIdentityAccessTokenRequest setScopes(List<CommunicationTokenScope> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Get the expiresInMinutes property: Optional custom validity period of the token within [60,1440] minutes range.
     * If not provided, the default value of 1440 minutes (24 hours) will be used.
     * 
     * @return the expiresInMinutes value.
     */
    @Generated
    public Integer getExpiresInMinutes() {
        return this.expiresInMinutes;
    }

    /**
     * Set the expiresInMinutes property: Optional custom validity period of the token within [60,1440] minutes range.
     * If not provided, the default value of 1440 minutes (24 hours) will be used.
     * 
     * @param expiresInMinutes the expiresInMinutes value to set.
     * @return the CommunicationIdentityAccessTokenRequest object itself.
     */
    @Generated
    public CommunicationIdentityAccessTokenRequest setExpiresInMinutes(Integer expiresInMinutes) {
        this.expiresInMinutes = expiresInMinutes;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("scopes", this.scopes,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeNumberField("expiresInMinutes", this.expiresInMinutes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CommunicationIdentityAccessTokenRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CommunicationIdentityAccessTokenRequest if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CommunicationIdentityAccessTokenRequest.
     */
    @Generated
    public static CommunicationIdentityAccessTokenRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunicationIdentityAccessTokenRequest deserializedCommunicationIdentityAccessTokenRequest
                = new CommunicationIdentityAccessTokenRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("scopes".equals(fieldName)) {
                    List<CommunicationTokenScope> scopes
                        = reader.readArray(reader1 -> CommunicationTokenScope.fromString(reader1.getString()));
                    deserializedCommunicationIdentityAccessTokenRequest.scopes = scopes;
                } else if ("expiresInMinutes".equals(fieldName)) {
                    deserializedCommunicationIdentityAccessTokenRequest.expiresInMinutes
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCommunicationIdentityAccessTokenRequest;
        });
    }
}
