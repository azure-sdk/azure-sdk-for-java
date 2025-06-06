// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Linked resource is reference to a resource deployed in an Azure subscription, add the linked resource `uniqueName`
 * value as an optional parameter for operations on Azure Maps Geospatial REST APIs.
 */
@Fluent
public final class LinkedResource implements JsonSerializable<LinkedResource> {
    /*
     * A provided name which uniquely identifies the linked resource.
     */
    private String uniqueName;

    /*
     * ARM resource id in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/accounts/{
     * storageName}'.
     */
    private String id;

    /**
     * Creates an instance of LinkedResource class.
     */
    public LinkedResource() {
    }

    /**
     * Get the uniqueName property: A provided name which uniquely identifies the linked resource.
     * 
     * @return the uniqueName value.
     */
    public String uniqueName() {
        return this.uniqueName;
    }

    /**
     * Set the uniqueName property: A provided name which uniquely identifies the linked resource.
     * 
     * @param uniqueName the uniqueName value to set.
     * @return the LinkedResource object itself.
     */
    public LinkedResource withUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    /**
     * Get the id property: ARM resource id in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/accounts/{storageName}'.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: ARM resource id in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/accounts/{storageName}'.
     * 
     * @param id the id value to set.
     * @return the LinkedResource object itself.
     */
    public LinkedResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (uniqueName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property uniqueName in model LinkedResource"));
        }
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property id in model LinkedResource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LinkedResource.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("uniqueName", this.uniqueName);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinkedResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinkedResource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LinkedResource.
     */
    public static LinkedResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LinkedResource deserializedLinkedResource = new LinkedResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("uniqueName".equals(fieldName)) {
                    deserializedLinkedResource.uniqueName = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedLinkedResource.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLinkedResource;
        });
    }
}
