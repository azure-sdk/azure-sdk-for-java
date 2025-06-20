// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Export command settings.
 */
@Fluent
public class ExportSettings implements JsonSerializable<ExportSettings> {
    /*
     * The export setting type.
     */
    @Generated
    private String type = "ExportSettings";

    /*
     * Export command settings.
     */
    @Generated
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of ExportSettings class.
     */
    @Generated
    public ExportSettings() {
    }

    /**
     * Get the type property: The export setting type.
     * 
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Get the additionalProperties property: Export command settings.
     * 
     * @return the additionalProperties value.
     */
    @Generated
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Export command settings.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the ExportSettings object itself.
     */
    @Generated
    public ExportSettings setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExportSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExportSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExportSettings.
     */
    @Generated
    public static ExportSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("SnowflakeExportCopyCommand".equals(discriminatorValue)) {
                    return SnowflakeExportCopyCommand.fromJson(readerToUse.reset());
                } else if ("AzureDatabricksDeltaLakeExportCommand".equals(discriminatorValue)) {
                    return AzureDatabricksDeltaLakeExportCommand.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static ExportSettings fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExportSettings deserializedExportSettings = new ExportSettings();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedExportSettings.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedExportSettings.additionalProperties = additionalProperties;

            return deserializedExportSettings;
        });
    }
}
