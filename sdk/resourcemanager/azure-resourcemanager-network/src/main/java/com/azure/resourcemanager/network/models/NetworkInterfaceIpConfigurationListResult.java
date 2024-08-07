// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.NetworkInterfaceIpConfigurationInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for list ip configurations API service call.
 */
@Fluent
public final class NetworkInterfaceIpConfigurationListResult
    implements JsonSerializable<NetworkInterfaceIpConfigurationListResult> {
    /*
     * A list of ip configurations.
     */
    private List<NetworkInterfaceIpConfigurationInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of NetworkInterfaceIpConfigurationListResult class.
     */
    public NetworkInterfaceIpConfigurationListResult() {
    }

    /**
     * Get the value property: A list of ip configurations.
     * 
     * @return the value value.
     */
    public List<NetworkInterfaceIpConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of ip configurations.
     * 
     * @param value the value value to set.
     * @return the NetworkInterfaceIpConfigurationListResult object itself.
     */
    public NetworkInterfaceIpConfigurationListResult withValue(List<NetworkInterfaceIpConfigurationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkInterfaceIpConfigurationListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkInterfaceIpConfigurationListResult if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkInterfaceIpConfigurationListResult.
     */
    public static NetworkInterfaceIpConfigurationListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkInterfaceIpConfigurationListResult deserializedNetworkInterfaceIpConfigurationListResult
                = new NetworkInterfaceIpConfigurationListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<NetworkInterfaceIpConfigurationInner> value
                        = reader.readArray(reader1 -> NetworkInterfaceIpConfigurationInner.fromJson(reader1));
                    deserializedNetworkInterfaceIpConfigurationListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedNetworkInterfaceIpConfigurationListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkInterfaceIpConfigurationListResult;
        });
    }
}
