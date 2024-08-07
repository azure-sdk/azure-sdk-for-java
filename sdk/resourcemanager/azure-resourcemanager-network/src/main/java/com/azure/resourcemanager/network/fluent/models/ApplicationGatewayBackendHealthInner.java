// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ApplicationGatewayBackendHealthPool;
import java.io.IOException;
import java.util.List;

/**
 * Response for ApplicationGatewayBackendHealth API service call.
 */
@Fluent
public final class ApplicationGatewayBackendHealthInner
    implements JsonSerializable<ApplicationGatewayBackendHealthInner> {
    /*
     * A list of ApplicationGatewayBackendHealthPool resources.
     */
    private List<ApplicationGatewayBackendHealthPool> backendAddressPools;

    /**
     * Creates an instance of ApplicationGatewayBackendHealthInner class.
     */
    public ApplicationGatewayBackendHealthInner() {
    }

    /**
     * Get the backendAddressPools property: A list of ApplicationGatewayBackendHealthPool resources.
     * 
     * @return the backendAddressPools value.
     */
    public List<ApplicationGatewayBackendHealthPool> backendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools property: A list of ApplicationGatewayBackendHealthPool resources.
     * 
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the ApplicationGatewayBackendHealthInner object itself.
     */
    public ApplicationGatewayBackendHealthInner
        withBackendAddressPools(List<ApplicationGatewayBackendHealthPool> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backendAddressPools() != null) {
            backendAddressPools().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("backendAddressPools", this.backendAddressPools,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayBackendHealthInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayBackendHealthInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewayBackendHealthInner.
     */
    public static ApplicationGatewayBackendHealthInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayBackendHealthInner deserializedApplicationGatewayBackendHealthInner
                = new ApplicationGatewayBackendHealthInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("backendAddressPools".equals(fieldName)) {
                    List<ApplicationGatewayBackendHealthPool> backendAddressPools
                        = reader.readArray(reader1 -> ApplicationGatewayBackendHealthPool.fromJson(reader1));
                    deserializedApplicationGatewayBackendHealthInner.backendAddressPools = backendAddressPools;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayBackendHealthInner;
        });
    }
}
