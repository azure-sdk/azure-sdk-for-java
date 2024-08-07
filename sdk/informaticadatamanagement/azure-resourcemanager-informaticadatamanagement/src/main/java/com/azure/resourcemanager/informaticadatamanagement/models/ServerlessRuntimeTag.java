// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Serverless Runtime Tags.
 */
@Fluent
public final class ServerlessRuntimeTag implements JsonSerializable<ServerlessRuntimeTag> {
    /*
     * The name (also known as the key) of the tag.
     */
    private String name;

    /*
     * The value of the tag.
     */
    private String value;

    /**
     * Creates an instance of ServerlessRuntimeTag class.
     */
    public ServerlessRuntimeTag() {
    }

    /**
     * Get the name property: The name (also known as the key) of the tag.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name (also known as the key) of the tag.
     * 
     * @param name the name value to set.
     * @return the ServerlessRuntimeTag object itself.
     */
    public ServerlessRuntimeTag withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the tag.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the tag.
     * 
     * @param value the value value to set.
     * @return the ServerlessRuntimeTag object itself.
     */
    public ServerlessRuntimeTag withValue(String value) {
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServerlessRuntimeTag from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerlessRuntimeTag if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServerlessRuntimeTag.
     */
    public static ServerlessRuntimeTag fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerlessRuntimeTag deserializedServerlessRuntimeTag = new ServerlessRuntimeTag();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedServerlessRuntimeTag.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedServerlessRuntimeTag.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerlessRuntimeTag;
        });
    }
}
