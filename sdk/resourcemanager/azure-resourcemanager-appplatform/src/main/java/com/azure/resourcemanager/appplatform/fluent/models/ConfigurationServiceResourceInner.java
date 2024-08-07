// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appplatform.models.ConfigurationServiceProperties;
import java.io.IOException;

/**
 * Application Configuration Service resource.
 */
@Fluent
public final class ConfigurationServiceResourceInner extends ProxyResource {
    /*
     * Application Configuration Service properties payload
     */
    private ConfigurationServiceProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ConfigurationServiceResourceInner class.
     */
    public ConfigurationServiceResourceInner() {
    }

    /**
     * Get the properties property: Application Configuration Service properties payload.
     * 
     * @return the properties value.
     */
    public ConfigurationServiceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Application Configuration Service properties payload.
     * 
     * @param properties the properties value to set.
     * @return the ConfigurationServiceResourceInner object itself.
     */
    public ConfigurationServiceResourceInner withProperties(ConfigurationServiceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfigurationServiceResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfigurationServiceResourceInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ConfigurationServiceResourceInner.
     */
    public static ConfigurationServiceResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConfigurationServiceResourceInner deserializedConfigurationServiceResourceInner
                = new ConfigurationServiceResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedConfigurationServiceResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedConfigurationServiceResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedConfigurationServiceResourceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedConfigurationServiceResourceInner.properties
                        = ConfigurationServiceProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedConfigurationServiceResourceInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConfigurationServiceResourceInner;
        });
    }
}
