// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.fluent.models.InstancePoolInner;
import java.io.IOException;
import java.util.List;

/**
 * A list of Azure SQL instance pools.
 */
@Immutable
public final class InstancePoolListResult implements JsonSerializable<InstancePoolListResult> {
    /*
     * Array of results.
     */
    private List<InstancePoolInner> value;

    /*
     * Link to retrieve next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of InstancePoolListResult class.
     */
    public InstancePoolListResult() {
    }

    /**
     * Get the value property: Array of results.
     * 
     * @return the value value.
     */
    public List<InstancePoolInner> value() {
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
     * Reads an instance of InstancePoolListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InstancePoolListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the InstancePoolListResult.
     */
    public static InstancePoolListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InstancePoolListResult deserializedInstancePoolListResult = new InstancePoolListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<InstancePoolInner> value = reader.readArray(reader1 -> InstancePoolInner.fromJson(reader1));
                    deserializedInstancePoolListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedInstancePoolListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInstancePoolListResult;
        });
    }
}
