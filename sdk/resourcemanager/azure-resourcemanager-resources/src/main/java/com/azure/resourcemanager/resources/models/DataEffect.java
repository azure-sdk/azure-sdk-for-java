// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The data effect definition.
 */
@Fluent
public final class DataEffect implements JsonSerializable<DataEffect> {
    /*
     * The data effect name.
     */
    private String name;

    /*
     * The data effect details schema.
     */
    private Object detailsSchema;

    /**
     * Creates an instance of DataEffect class.
     */
    public DataEffect() {
    }

    /**
     * Get the name property: The data effect name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The data effect name.
     * 
     * @param name the name value to set.
     * @return the DataEffect object itself.
     */
    public DataEffect withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the detailsSchema property: The data effect details schema.
     * 
     * @return the detailsSchema value.
     */
    public Object detailsSchema() {
        return this.detailsSchema;
    }

    /**
     * Set the detailsSchema property: The data effect details schema.
     * 
     * @param detailsSchema the detailsSchema value to set.
     * @return the DataEffect object itself.
     */
    public DataEffect withDetailsSchema(Object detailsSchema) {
        this.detailsSchema = detailsSchema;
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
        jsonWriter.writeStringField("name", this.name);
        if (this.detailsSchema != null) {
            jsonWriter.writeUntypedField("detailsSchema", this.detailsSchema);
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataEffect from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataEffect if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the DataEffect.
     */
    public static DataEffect fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataEffect deserializedDataEffect = new DataEffect();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDataEffect.name = reader.getString();
                } else if ("detailsSchema".equals(fieldName)) {
                    deserializedDataEffect.detailsSchema = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataEffect;
        });
    }
}
