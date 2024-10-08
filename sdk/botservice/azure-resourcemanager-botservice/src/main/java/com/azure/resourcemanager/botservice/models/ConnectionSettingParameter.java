// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Extra Parameter in a Connection Setting Properties to indicate service provider specific properties.
 */
@Fluent
public final class ConnectionSettingParameter implements JsonSerializable<ConnectionSettingParameter> {
    /*
     * Key for the Connection Setting Parameter.
     */
    private String key;

    /*
     * Value associated with the Connection Setting Parameter.
     */
    private String value;

    /**
     * Creates an instance of ConnectionSettingParameter class.
     */
    public ConnectionSettingParameter() {
    }

    /**
     * Get the key property: Key for the Connection Setting Parameter.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: Key for the Connection Setting Parameter.
     * 
     * @param key the key value to set.
     * @return the ConnectionSettingParameter object itself.
     */
    public ConnectionSettingParameter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: Value associated with the Connection Setting Parameter.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value associated with the Connection Setting Parameter.
     * 
     * @param value the value value to set.
     * @return the ConnectionSettingParameter object itself.
     */
    public ConnectionSettingParameter withValue(String value) {
        this.value = value;
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
        jsonWriter.writeStringField("key", this.key);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectionSettingParameter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectionSettingParameter if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectionSettingParameter.
     */
    public static ConnectionSettingParameter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectionSettingParameter deserializedConnectionSettingParameter = new ConnectionSettingParameter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedConnectionSettingParameter.key = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedConnectionSettingParameter.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectionSettingParameter;
        });
    }
}
