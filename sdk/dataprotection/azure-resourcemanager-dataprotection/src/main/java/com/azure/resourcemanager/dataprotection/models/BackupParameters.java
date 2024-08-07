// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * BackupParameters
 * 
 * BackupParameters base.
 */
@Immutable
public class BackupParameters implements JsonSerializable<BackupParameters> {
    /*
     * Type of the specific object - used for deserializing
     */
    private String objectType = "BackupParameters";

    /**
     * Creates an instance of BackupParameters class.
     */
    public BackupParameters() {
    }

    /**
     * Get the objectType property: Type of the specific object - used for deserializing.
     * 
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
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
        jsonWriter.writeStringField("objectType", this.objectType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BackupParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BackupParameters if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BackupParameters.
     */
    public static BackupParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("objectType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("AzureBackupParams".equals(discriminatorValue)) {
                    return AzureBackupParams.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static BackupParameters fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BackupParameters deserializedBackupParameters = new BackupParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("objectType".equals(fieldName)) {
                    deserializedBackupParameters.objectType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBackupParameters;
        });
    }
}
