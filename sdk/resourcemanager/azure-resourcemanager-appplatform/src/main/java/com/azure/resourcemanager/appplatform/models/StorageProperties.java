// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Storage resource payload.
 */
@Immutable
public class StorageProperties implements JsonSerializable<StorageProperties> {
    /*
     * The type of the storage.
     */
    private StorageType storageType = StorageType.fromString("StorageProperties");

    /**
     * Creates an instance of StorageProperties class.
     */
    public StorageProperties() {
    }

    /**
     * Get the storageType property: The type of the storage.
     * 
     * @return the storageType value.
     */
    public StorageType storageType() {
        return this.storageType;
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
        jsonWriter.writeStringField("storageType", this.storageType == null ? null : this.storageType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageProperties.
     */
    public static StorageProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("storageType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("StorageAccount".equals(discriminatorValue)) {
                    return StorageAccount.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static StorageProperties fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageProperties deserializedStorageProperties = new StorageProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("storageType".equals(fieldName)) {
                    deserializedStorageProperties.storageType = StorageType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageProperties;
        });
    }
}
