// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Microsoft Access table dataset properties.
 */
@Fluent
public final class MicrosoftAccessTableDatasetTypeProperties
    implements JsonSerializable<MicrosoftAccessTableDatasetTypeProperties> {
    /*
     * The Microsoft Access table name. Type: string (or Expression with resultType string).
     */
    private Object tableName;

    /**
     * Creates an instance of MicrosoftAccessTableDatasetTypeProperties class.
     */
    public MicrosoftAccessTableDatasetTypeProperties() {
    }

    /**
     * Get the tableName property: The Microsoft Access table name. Type: string (or Expression with resultType string).
     * 
     * @return the tableName value.
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The Microsoft Access table name. Type: string (or Expression with resultType string).
     * 
     * @param tableName the tableName value to set.
     * @return the MicrosoftAccessTableDatasetTypeProperties object itself.
     */
    public MicrosoftAccessTableDatasetTypeProperties withTableName(Object tableName) {
        this.tableName = tableName;
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
        if (this.tableName != null) {
            jsonWriter.writeUntypedField("tableName", this.tableName);
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftAccessTableDatasetTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftAccessTableDatasetTypeProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftAccessTableDatasetTypeProperties.
     */
    public static MicrosoftAccessTableDatasetTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftAccessTableDatasetTypeProperties deserializedMicrosoftAccessTableDatasetTypeProperties
                = new MicrosoftAccessTableDatasetTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tableName".equals(fieldName)) {
                    deserializedMicrosoftAccessTableDatasetTypeProperties.tableName = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMicrosoftAccessTableDatasetTypeProperties;
        });
    }
}
