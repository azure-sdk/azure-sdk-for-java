// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The AnomalyResultList model.
 */
@Fluent
public final class AnomalyResultList implements JsonSerializable<AnomalyResultList> {
    /*
     * The @nextLink property.
     */
    @Generated
    private String nextLink;

    /*
     * The value property.
     */
    @Generated
    private List<AnomalyResult> value;

    /**
     * Creates an instance of AnomalyResultList class.
     */
    @Generated
    public AnomalyResultList() {
    }

    /**
     * Get the nextLink property: The &#064;nextLink property.
     * 
     * @return the nextLink value.
     */
    @Generated
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    @Generated
    public List<AnomalyResult> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the AnomalyResultList object itself.
     */
    @Generated
    public AnomalyResultList setValue(List<AnomalyResult> value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnomalyResultList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnomalyResultList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AnomalyResultList.
     */
    @Generated
    public static AnomalyResultList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnomalyResultList deserializedAnomalyResultList = new AnomalyResultList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AnomalyResult> value = reader.readArray(reader1 -> AnomalyResult.fromJson(reader1));
                    deserializedAnomalyResultList.value = value;
                } else if ("@nextLink".equals(fieldName)) {
                    deserializedAnomalyResultList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAnomalyResultList;
        });
    }
}
