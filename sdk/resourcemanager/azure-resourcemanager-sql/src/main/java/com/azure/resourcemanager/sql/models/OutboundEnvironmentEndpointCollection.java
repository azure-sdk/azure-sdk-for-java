// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.fluent.models.OutboundEnvironmentEndpointInner;
import java.io.IOException;
import java.util.List;

/**
 * A collection of endpoints that the managed instance service requires outbound network access to.
 */
@Immutable
public final class OutboundEnvironmentEndpointCollection
    implements JsonSerializable<OutboundEnvironmentEndpointCollection> {
    /*
     * Array of results.
     */
    private List<OutboundEnvironmentEndpointInner> value;

    /*
     * Link to retrieve next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of OutboundEnvironmentEndpointCollection class.
     */
    public OutboundEnvironmentEndpointCollection() {
    }

    /**
     * Get the value property: Array of results.
     * 
     * @return the value value.
     */
    public List<OutboundEnvironmentEndpointInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to retrieve next page of results.
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OutboundEnvironmentEndpointCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OutboundEnvironmentEndpointCollection if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OutboundEnvironmentEndpointCollection.
     */
    public static OutboundEnvironmentEndpointCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OutboundEnvironmentEndpointCollection deserializedOutboundEnvironmentEndpointCollection
                = new OutboundEnvironmentEndpointCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<OutboundEnvironmentEndpointInner> value
                        = reader.readArray(reader1 -> OutboundEnvironmentEndpointInner.fromJson(reader1));
                    deserializedOutboundEnvironmentEndpointCollection.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedOutboundEnvironmentEndpointCollection.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOutboundEnvironmentEndpointCollection;
        });
    }
}
