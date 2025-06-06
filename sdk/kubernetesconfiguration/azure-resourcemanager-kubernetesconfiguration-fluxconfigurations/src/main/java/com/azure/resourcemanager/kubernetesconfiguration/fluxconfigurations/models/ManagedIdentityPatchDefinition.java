// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.fluxconfigurations.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Parameters to authenticate using a Managed Identity.
 */
@Fluent
public final class ManagedIdentityPatchDefinition implements JsonSerializable<ManagedIdentityPatchDefinition> {
    /*
     * The client Id for authenticating a Managed Identity.
     */
    private String clientId;

    /**
     * Creates an instance of ManagedIdentityPatchDefinition class.
     */
    public ManagedIdentityPatchDefinition() {
    }

    /**
     * Get the clientId property: The client Id for authenticating a Managed Identity.
     * 
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client Id for authenticating a Managed Identity.
     * 
     * @param clientId the clientId value to set.
     * @return the ManagedIdentityPatchDefinition object itself.
     */
    public ManagedIdentityPatchDefinition withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("clientId", this.clientId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedIdentityPatchDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedIdentityPatchDefinition if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedIdentityPatchDefinition.
     */
    public static ManagedIdentityPatchDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedIdentityPatchDefinition deserializedManagedIdentityPatchDefinition
                = new ManagedIdentityPatchDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("clientId".equals(fieldName)) {
                    deserializedManagedIdentityPatchDefinition.clientId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedIdentityPatchDefinition;
        });
    }
}
