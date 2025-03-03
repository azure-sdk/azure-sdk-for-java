// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.FlexibleServerCapabilityInner;
import java.io.IOException;
import java.util.List;

/**
 * Capability for the PostgreSQL server.
 */
@Immutable
public final class CapabilitiesListResult implements JsonSerializable<CapabilitiesListResult> {
    /*
     * A list of supported capabilities.
     */
    private List<FlexibleServerCapabilityInner> value;

    /*
     * Link to retrieve next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of CapabilitiesListResult class.
     */
    public CapabilitiesListResult() {
    }

    /**
     * Get the value property: A list of supported capabilities.
     * 
     * @return the value value.
     */
    public List<FlexibleServerCapabilityInner> value() {
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
     * Reads an instance of CapabilitiesListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CapabilitiesListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CapabilitiesListResult.
     */
    public static CapabilitiesListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CapabilitiesListResult deserializedCapabilitiesListResult = new CapabilitiesListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<FlexibleServerCapabilityInner> value
                        = reader.readArray(reader1 -> FlexibleServerCapabilityInner.fromJson(reader1));
                    deserializedCapabilitiesListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedCapabilitiesListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCapabilitiesListResult;
        });
    }
}
