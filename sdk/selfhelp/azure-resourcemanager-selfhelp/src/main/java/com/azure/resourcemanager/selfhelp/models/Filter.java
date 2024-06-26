// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Filter criterion.
 */
@Fluent
public final class Filter implements JsonSerializable<Filter> {
    /*
     * Filter name
     */
    private String name;

    /*
     * Filter values
     */
    private String values;

    /*
     * Filter operator
     */
    private String operator;

    /**
     * Creates an instance of Filter class.
     */
    public Filter() {
    }

    /**
     * Get the name property: Filter name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Filter name.
     * 
     * @param name the name value to set.
     * @return the Filter object itself.
     */
    public Filter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the values property: Filter values.
     * 
     * @return the values value.
     */
    public String values() {
        return this.values;
    }

    /**
     * Set the values property: Filter values.
     * 
     * @param values the values value to set.
     * @return the Filter object itself.
     */
    public Filter withValues(String values) {
        this.values = values;
        return this;
    }

    /**
     * Get the operator property: Filter operator.
     * 
     * @return the operator value.
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Set the operator property: Filter operator.
     * 
     * @param operator the operator value to set.
     * @return the Filter object itself.
     */
    public Filter withOperator(String operator) {
        this.operator = operator;
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
        jsonWriter.writeStringField("values", this.values);
        jsonWriter.writeStringField("operator", this.operator);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Filter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Filter if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Filter.
     */
    public static Filter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Filter deserializedFilter = new Filter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedFilter.name = reader.getString();
                } else if ("values".equals(fieldName)) {
                    deserializedFilter.values = reader.getString();
                } else if ("operator".equals(fieldName)) {
                    deserializedFilter.operator = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFilter;
        });
    }
}
