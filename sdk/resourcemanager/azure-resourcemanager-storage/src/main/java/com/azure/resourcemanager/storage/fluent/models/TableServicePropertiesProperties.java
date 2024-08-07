// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.models.CorsRules;
import java.io.IOException;

/**
 * The properties of a storage account’s Table service.
 */
@Fluent
public final class TableServicePropertiesProperties implements JsonSerializable<TableServicePropertiesProperties> {
    /*
     * Specifies CORS rules for the Table service. You can include up to five CorsRule elements in the request. If no
     * CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for
     * the Table service.
     */
    private CorsRules cors;

    /**
     * Creates an instance of TableServicePropertiesProperties class.
     */
    public TableServicePropertiesProperties() {
    }

    /**
     * Get the cors property: Specifies CORS rules for the Table service. You can include up to five CorsRule elements
     * in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and
     * CORS will be disabled for the Table service.
     * 
     * @return the cors value.
     */
    public CorsRules cors() {
        return this.cors;
    }

    /**
     * Set the cors property: Specifies CORS rules for the Table service. You can include up to five CorsRule elements
     * in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and
     * CORS will be disabled for the Table service.
     * 
     * @param cors the cors value to set.
     * @return the TableServicePropertiesProperties object itself.
     */
    public TableServicePropertiesProperties withCors(CorsRules cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cors() != null) {
            cors().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("cors", this.cors);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TableServicePropertiesProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TableServicePropertiesProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TableServicePropertiesProperties.
     */
    public static TableServicePropertiesProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TableServicePropertiesProperties deserializedTableServicePropertiesProperties
                = new TableServicePropertiesProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("cors".equals(fieldName)) {
                    deserializedTableServicePropertiesProperties.cors = CorsRules.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTableServicePropertiesProperties;
        });
    }
}
