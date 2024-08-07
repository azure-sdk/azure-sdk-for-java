// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.authorization.fluent.models.ProviderOperationsMetadataInner;
import java.io.IOException;
import java.util.List;

/**
 * Provider operations metadata list.
 */
@Fluent
public final class ProviderOperationsMetadataListResult
    implements JsonSerializable<ProviderOperationsMetadataListResult> {
    /*
     * The list of providers.
     */
    private List<ProviderOperationsMetadataInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ProviderOperationsMetadataListResult class.
     */
    public ProviderOperationsMetadataListResult() {
    }

    /**
     * Get the value property: The list of providers.
     * 
     * @return the value value.
     */
    public List<ProviderOperationsMetadataInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of providers.
     * 
     * @param value the value value to set.
     * @return the ProviderOperationsMetadataListResult object itself.
     */
    public ProviderOperationsMetadataListResult withValue(List<ProviderOperationsMetadataInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ProviderOperationsMetadataListResult object itself.
     */
    public ProviderOperationsMetadataListResult withNextLink(String nextLink) {
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
     * Reads an instance of ProviderOperationsMetadataListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProviderOperationsMetadataListResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProviderOperationsMetadataListResult.
     */
    public static ProviderOperationsMetadataListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProviderOperationsMetadataListResult deserializedProviderOperationsMetadataListResult
                = new ProviderOperationsMetadataListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ProviderOperationsMetadataInner> value
                        = reader.readArray(reader1 -> ProviderOperationsMetadataInner.fromJson(reader1));
                    deserializedProviderOperationsMetadataListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedProviderOperationsMetadataListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProviderOperationsMetadataListResult;
        });
    }
}
