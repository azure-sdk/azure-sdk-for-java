// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The SpringbootappsPropertiesApplicationConfigurationsItem model.
 */
@Fluent
public final class SpringbootappsPropertiesApplicationConfigurationsItem
    implements JsonSerializable<SpringbootappsPropertiesApplicationConfigurationsItem> {
    /*
     * The application config file name.
     */
    private String key;

    /*
     * The application config file content, only contains config keys.
     */
    private String value;

    /**
     * Creates an instance of SpringbootappsPropertiesApplicationConfigurationsItem class.
     */
    public SpringbootappsPropertiesApplicationConfigurationsItem() {
    }

    /**
     * Get the key property: The application config file name.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: The application config file name.
     * 
     * @param key the key value to set.
     * @return the SpringbootappsPropertiesApplicationConfigurationsItem object itself.
     */
    public SpringbootappsPropertiesApplicationConfigurationsItem withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: The application config file content, only contains config keys.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The application config file content, only contains config keys.
     * 
     * @param value the value value to set.
     * @return the SpringbootappsPropertiesApplicationConfigurationsItem object itself.
     */
    public SpringbootappsPropertiesApplicationConfigurationsItem withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (key() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property key in model SpringbootappsPropertiesApplicationConfigurationsItem"));
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(SpringbootappsPropertiesApplicationConfigurationsItem.class);

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
     * Reads an instance of SpringbootappsPropertiesApplicationConfigurationsItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SpringbootappsPropertiesApplicationConfigurationsItem if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SpringbootappsPropertiesApplicationConfigurationsItem.
     */
    public static SpringbootappsPropertiesApplicationConfigurationsItem fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            SpringbootappsPropertiesApplicationConfigurationsItem deserializedSpringbootappsPropertiesApplicationConfigurationsItem
                = new SpringbootappsPropertiesApplicationConfigurationsItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedSpringbootappsPropertiesApplicationConfigurationsItem.key = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedSpringbootappsPropertiesApplicationConfigurationsItem.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSpringbootappsPropertiesApplicationConfigurationsItem;
        });
    }
}
