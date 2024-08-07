// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.IpGroupInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for the ListIpGroups API service call.
 */
@Fluent
public final class IpGroupListResult implements JsonSerializable<IpGroupListResult> {
    /*
     * The list of IpGroups information resources.
     */
    private List<IpGroupInner> value;

    /*
     * URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of IpGroupListResult class.
     */
    public IpGroupListResult() {
    }

    /**
     * Get the value property: The list of IpGroups information resources.
     * 
     * @return the value value.
     */
    public List<IpGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of IpGroups information resources.
     * 
     * @param value the value value to set.
     * @return the IpGroupListResult object itself.
     */
    public IpGroupListResult withValue(List<IpGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the IpGroupListResult object itself.
     */
    public IpGroupListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpGroupListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpGroupListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IpGroupListResult.
     */
    public static IpGroupListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpGroupListResult deserializedIpGroupListResult = new IpGroupListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<IpGroupInner> value = reader.readArray(reader1 -> IpGroupInner.fromJson(reader1));
                    deserializedIpGroupListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedIpGroupListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpGroupListResult;
        });
    }
}
