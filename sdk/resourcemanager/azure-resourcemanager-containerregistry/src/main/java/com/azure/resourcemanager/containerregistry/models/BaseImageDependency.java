// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties that describe a base image dependency.
 */
@Fluent
public final class BaseImageDependency implements JsonSerializable<BaseImageDependency> {
    /*
     * The type of the base image dependency.
     */
    private BaseImageDependencyType type;

    /*
     * The registry login server.
     */
    private String registry;

    /*
     * The repository name.
     */
    private String repository;

    /*
     * The tag name.
     */
    private String tag;

    /*
     * The sha256-based digest of the image manifest.
     */
    private String digest;

    /**
     * Creates an instance of BaseImageDependency class.
     */
    public BaseImageDependency() {
    }

    /**
     * Get the type property: The type of the base image dependency.
     * 
     * @return the type value.
     */
    public BaseImageDependencyType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the base image dependency.
     * 
     * @param type the type value to set.
     * @return the BaseImageDependency object itself.
     */
    public BaseImageDependency withType(BaseImageDependencyType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the registry property: The registry login server.
     * 
     * @return the registry value.
     */
    public String registry() {
        return this.registry;
    }

    /**
     * Set the registry property: The registry login server.
     * 
     * @param registry the registry value to set.
     * @return the BaseImageDependency object itself.
     */
    public BaseImageDependency withRegistry(String registry) {
        this.registry = registry;
        return this;
    }

    /**
     * Get the repository property: The repository name.
     * 
     * @return the repository value.
     */
    public String repository() {
        return this.repository;
    }

    /**
     * Set the repository property: The repository name.
     * 
     * @param repository the repository value to set.
     * @return the BaseImageDependency object itself.
     */
    public BaseImageDependency withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get the tag property: The tag name.
     * 
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the tag property: The tag name.
     * 
     * @param tag the tag value to set.
     * @return the BaseImageDependency object itself.
     */
    public BaseImageDependency withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the digest property: The sha256-based digest of the image manifest.
     * 
     * @return the digest value.
     */
    public String digest() {
        return this.digest;
    }

    /**
     * Set the digest property: The sha256-based digest of the image manifest.
     * 
     * @param digest the digest value to set.
     * @return the BaseImageDependency object itself.
     */
    public BaseImageDependency withDigest(String digest) {
        this.digest = digest;
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
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("registry", this.registry);
        jsonWriter.writeStringField("repository", this.repository);
        jsonWriter.writeStringField("tag", this.tag);
        jsonWriter.writeStringField("digest", this.digest);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BaseImageDependency from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BaseImageDependency if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BaseImageDependency.
     */
    public static BaseImageDependency fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BaseImageDependency deserializedBaseImageDependency = new BaseImageDependency();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedBaseImageDependency.type = BaseImageDependencyType.fromString(reader.getString());
                } else if ("registry".equals(fieldName)) {
                    deserializedBaseImageDependency.registry = reader.getString();
                } else if ("repository".equals(fieldName)) {
                    deserializedBaseImageDependency.repository = reader.getString();
                } else if ("tag".equals(fieldName)) {
                    deserializedBaseImageDependency.tag = reader.getString();
                } else if ("digest".equals(fieldName)) {
                    deserializedBaseImageDependency.digest = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBaseImageDependency;
        });
    }
}
