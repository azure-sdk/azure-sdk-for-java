// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The log size capability.
 */
@Immutable
public final class LogSizeCapability implements JsonSerializable<LogSizeCapability> {
    /*
     * The log size limit (see 'unit' for the units).
     */
    private Integer limit;

    /*
     * The units that the limit is expressed in.
     */
    private LogSizeUnit unit;

    /**
     * Creates an instance of LogSizeCapability class.
     */
    public LogSizeCapability() {
    }

    /**
     * Get the limit property: The log size limit (see 'unit' for the units).
     * 
     * @return the limit value.
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Get the unit property: The units that the limit is expressed in.
     * 
     * @return the unit value.
     */
    public LogSizeUnit unit() {
        return this.unit;
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
     * Reads an instance of LogSizeCapability from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogSizeCapability if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LogSizeCapability.
     */
    public static LogSizeCapability fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogSizeCapability deserializedLogSizeCapability = new LogSizeCapability();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("limit".equals(fieldName)) {
                    deserializedLogSizeCapability.limit = reader.getNullable(JsonReader::getInt);
                } else if ("unit".equals(fieldName)) {
                    deserializedLogSizeCapability.unit = LogSizeUnit.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogSizeCapability;
        });
    }
}
