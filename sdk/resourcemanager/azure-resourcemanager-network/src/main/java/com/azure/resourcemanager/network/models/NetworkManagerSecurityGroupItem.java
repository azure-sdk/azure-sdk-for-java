// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Network manager security group item.
 */
@Fluent
public final class NetworkManagerSecurityGroupItem implements JsonSerializable<NetworkManagerSecurityGroupItem> {
    /*
     * Network manager group Id.
     */
    private String networkGroupId;

    /**
     * Creates an instance of NetworkManagerSecurityGroupItem class.
     */
    public NetworkManagerSecurityGroupItem() {
    }

    /**
     * Get the networkGroupId property: Network manager group Id.
     * 
     * @return the networkGroupId value.
     */
    public String networkGroupId() {
        return this.networkGroupId;
    }

    /**
     * Set the networkGroupId property: Network manager group Id.
     * 
     * @param networkGroupId the networkGroupId value to set.
     * @return the NetworkManagerSecurityGroupItem object itself.
     */
    public NetworkManagerSecurityGroupItem withNetworkGroupId(String networkGroupId) {
        this.networkGroupId = networkGroupId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkGroupId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property networkGroupId in model NetworkManagerSecurityGroupItem"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkManagerSecurityGroupItem.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("networkGroupId", this.networkGroupId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkManagerSecurityGroupItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkManagerSecurityGroupItem if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NetworkManagerSecurityGroupItem.
     */
    public static NetworkManagerSecurityGroupItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkManagerSecurityGroupItem deserializedNetworkManagerSecurityGroupItem
                = new NetworkManagerSecurityGroupItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("networkGroupId".equals(fieldName)) {
                    deserializedNetworkManagerSecurityGroupItem.networkGroupId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkManagerSecurityGroupItem;
        });
    }
}
