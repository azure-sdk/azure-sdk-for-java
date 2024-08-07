// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Dimension of a resource metric. For e.g. instance specific HTTP requests for a web app,
 * where instance name is dimension of the metric HTTP request.
 */
@Fluent
public final class Dimension implements JsonSerializable<Dimension> {
    /*
     * The name property.
     */
    private String name;

    /*
     * The displayName property.
     */
    private String displayName;

    /*
     * The internalName property.
     */
    private String internalName;

    /*
     * The toBeExportedForShoebox property.
     */
    private Boolean toBeExportedForShoebox;

    /**
     * Creates an instance of Dimension class.
     */
    public Dimension() {
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the Dimension object itself.
     */
    public Dimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: The displayName property.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The displayName property.
     * 
     * @param displayName the displayName value to set.
     * @return the Dimension object itself.
     */
    public Dimension withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the internalName property: The internalName property.
     * 
     * @return the internalName value.
     */
    public String internalName() {
        return this.internalName;
    }

    /**
     * Set the internalName property: The internalName property.
     * 
     * @param internalName the internalName value to set.
     * @return the Dimension object itself.
     */
    public Dimension withInternalName(String internalName) {
        this.internalName = internalName;
        return this;
    }

    /**
     * Get the toBeExportedForShoebox property: The toBeExportedForShoebox property.
     * 
     * @return the toBeExportedForShoebox value.
     */
    public Boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
    }

    /**
     * Set the toBeExportedForShoebox property: The toBeExportedForShoebox property.
     * 
     * @param toBeExportedForShoebox the toBeExportedForShoebox value to set.
     * @return the Dimension object itself.
     */
    public Dimension withToBeExportedForShoebox(Boolean toBeExportedForShoebox) {
        this.toBeExportedForShoebox = toBeExportedForShoebox;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("internalName", this.internalName);
        jsonWriter.writeBooleanField("toBeExportedForShoebox", this.toBeExportedForShoebox);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Dimension from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Dimension if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Dimension.
     */
    public static Dimension fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Dimension deserializedDimension = new Dimension();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDimension.name = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedDimension.displayName = reader.getString();
                } else if ("internalName".equals(fieldName)) {
                    deserializedDimension.internalName = reader.getString();
                } else if ("toBeExportedForShoebox".equals(fieldName)) {
                    deserializedDimension.toBeExportedForShoebox = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDimension;
        });
    }
}
