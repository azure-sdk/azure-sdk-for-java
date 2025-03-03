// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ContentTypeContractProperties model.
 */
@Fluent
public final class ContentTypeContractProperties implements JsonSerializable<ContentTypeContractProperties> {
    /*
     * Content type identifier
     */
    private String id;

    /*
     * Content type name. Must be 1 to 250 characters long.
     */
    private String name;

    /*
     * Content type description.
     */
    private String description;

    /*
     * Content type schema.
     */
    private Object schema;

    /*
     * Content type version.
     */
    private String version;

    /**
     * Creates an instance of ContentTypeContractProperties class.
     */
    public ContentTypeContractProperties() {
    }

    /**
     * Get the id property: Content type identifier.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Content type identifier.
     * 
     * @param id the id value to set.
     * @return the ContentTypeContractProperties object itself.
     */
    public ContentTypeContractProperties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Content type name. Must be 1 to 250 characters long.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Content type name. Must be 1 to 250 characters long.
     * 
     * @param name the name value to set.
     * @return the ContentTypeContractProperties object itself.
     */
    public ContentTypeContractProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Content type description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Content type description.
     * 
     * @param description the description value to set.
     * @return the ContentTypeContractProperties object itself.
     */
    public ContentTypeContractProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the schema property: Content type schema.
     * 
     * @return the schema value.
     */
    public Object schema() {
        return this.schema;
    }

    /**
     * Set the schema property: Content type schema.
     * 
     * @param schema the schema value to set.
     * @return the ContentTypeContractProperties object itself.
     */
    public ContentTypeContractProperties withSchema(Object schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the version property: Content type version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Content type version.
     * 
     * @param version the version value to set.
     * @return the ContentTypeContractProperties object itself.
     */
    public ContentTypeContractProperties withVersion(String version) {
        this.version = version;
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
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeUntypedField("schema", this.schema);
        jsonWriter.writeStringField("version", this.version);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContentTypeContractProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContentTypeContractProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContentTypeContractProperties.
     */
    public static ContentTypeContractProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContentTypeContractProperties deserializedContentTypeContractProperties
                = new ContentTypeContractProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedContentTypeContractProperties.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedContentTypeContractProperties.name = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedContentTypeContractProperties.description = reader.getString();
                } else if ("schema".equals(fieldName)) {
                    deserializedContentTypeContractProperties.schema = reader.readUntyped();
                } else if ("version".equals(fieldName)) {
                    deserializedContentTypeContractProperties.version = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContentTypeContractProperties;
        });
    }
}
