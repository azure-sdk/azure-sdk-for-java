// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Request parameter that contains authorization claims for copy operation.
 */
@Fluent
public final class CopyAuthorizationResult implements JsonSerializable<CopyAuthorizationResult> {
    /*
     * Model identifier.
     */
    @Generated
    private String modelId;

    /*
     * Token claim used to authorize the request.
     */
    @Generated
    private String accessToken;

    /*
     * The time when the access token expires. The date is represented as the number of seconds from 1970-01-01T0:0:0Z
     * UTC until the expiration time.
     */
    @Generated
    private long expirationDateTimeTicks;

    /**
     * Creates an instance of CopyAuthorizationResult class.
     */
    @Generated
    public CopyAuthorizationResult() {
    }

    /**
     * Get the modelId property: Model identifier.
     * 
     * @return the modelId value.
     */
    @Generated
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Set the modelId property: Model identifier.
     * 
     * @param modelId the modelId value to set.
     * @return the CopyAuthorizationResult object itself.
     */
    @Generated
    public CopyAuthorizationResult setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Get the accessToken property: Token claim used to authorize the request.
     * 
     * @return the accessToken value.
     */
    @Generated
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: Token claim used to authorize the request.
     * 
     * @param accessToken the accessToken value to set.
     * @return the CopyAuthorizationResult object itself.
     */
    @Generated
    public CopyAuthorizationResult setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the expirationDateTimeTicks property: The time when the access token expires. The date is represented as the
     * number of seconds from 1970-01-01T0:0:0Z UTC until the expiration time.
     * 
     * @return the expirationDateTimeTicks value.
     */
    @Generated
    public long getExpirationDateTimeTicks() {
        return this.expirationDateTimeTicks;
    }

    /**
     * Set the expirationDateTimeTicks property: The time when the access token expires. The date is represented as the
     * number of seconds from 1970-01-01T0:0:0Z UTC until the expiration time.
     * 
     * @param expirationDateTimeTicks the expirationDateTimeTicks value to set.
     * @return the CopyAuthorizationResult object itself.
     */
    @Generated
    public CopyAuthorizationResult setExpirationDateTimeTicks(long expirationDateTimeTicks) {
        this.expirationDateTimeTicks = expirationDateTimeTicks;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("modelId", this.modelId);
        jsonWriter.writeStringField("accessToken", this.accessToken);
        jsonWriter.writeLongField("expirationDateTimeTicks", this.expirationDateTimeTicks);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CopyAuthorizationResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CopyAuthorizationResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CopyAuthorizationResult.
     */
    @Generated
    public static CopyAuthorizationResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CopyAuthorizationResult deserializedCopyAuthorizationResult = new CopyAuthorizationResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("modelId".equals(fieldName)) {
                    deserializedCopyAuthorizationResult.modelId = reader.getString();
                } else if ("accessToken".equals(fieldName)) {
                    deserializedCopyAuthorizationResult.accessToken = reader.getString();
                } else if ("expirationDateTimeTicks".equals(fieldName)) {
                    deserializedCopyAuthorizationResult.expirationDateTimeTicks = reader.getLong();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCopyAuthorizationResult;
        });
    }
}
