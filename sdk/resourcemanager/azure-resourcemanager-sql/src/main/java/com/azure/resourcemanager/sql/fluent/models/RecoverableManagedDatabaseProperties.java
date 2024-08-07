// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The recoverable managed database's properties.
 */
@Immutable
public final class RecoverableManagedDatabaseProperties
    implements JsonSerializable<RecoverableManagedDatabaseProperties> {
    /*
     * The last available backup date.
     */
    private String lastAvailableBackupDate;

    /**
     * Creates an instance of RecoverableManagedDatabaseProperties class.
     */
    public RecoverableManagedDatabaseProperties() {
    }

    /**
     * Get the lastAvailableBackupDate property: The last available backup date.
     * 
     * @return the lastAvailableBackupDate value.
     */
    public String lastAvailableBackupDate() {
        return this.lastAvailableBackupDate;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RecoverableManagedDatabaseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RecoverableManagedDatabaseProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RecoverableManagedDatabaseProperties.
     */
    public static RecoverableManagedDatabaseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RecoverableManagedDatabaseProperties deserializedRecoverableManagedDatabaseProperties
                = new RecoverableManagedDatabaseProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("lastAvailableBackupDate".equals(fieldName)) {
                    deserializedRecoverableManagedDatabaseProperties.lastAvailableBackupDate = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRecoverableManagedDatabaseProperties;
        });
    }
}
