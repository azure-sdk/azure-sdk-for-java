// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Details of the ContainerGroupProfile.
 */
@Fluent
public final class ContainerGroupProfile implements JsonSerializable<ContainerGroupProfile> {
    /*
     * Specifies container group profile id of standby container groups.
     */
    private String id;

    /*
     * Specifies revision of container group profile.
     */
    private Long revision;

    /**
     * Creates an instance of ContainerGroupProfile class.
     */
    public ContainerGroupProfile() {
    }

    /**
     * Get the id property: Specifies container group profile id of standby container groups.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Specifies container group profile id of standby container groups.
     * 
     * @param id the id value to set.
     * @return the ContainerGroupProfile object itself.
     */
    public ContainerGroupProfile withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the revision property: Specifies revision of container group profile.
     * 
     * @return the revision value.
     */
    public Long revision() {
        return this.revision;
    }

    /**
     * Set the revision property: Specifies revision of container group profile.
     * 
     * @param revision the revision value to set.
     * @return the ContainerGroupProfile object itself.
     */
    public ContainerGroupProfile withRevision(Long revision) {
        this.revision = revision;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property id in model ContainerGroupProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContainerGroupProfile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeNumberField("revision", this.revision);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerGroupProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerGroupProfile if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContainerGroupProfile.
     */
    public static ContainerGroupProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerGroupProfile deserializedContainerGroupProfile = new ContainerGroupProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedContainerGroupProfile.id = reader.getString();
                } else if ("revision".equals(fieldName)) {
                    deserializedContainerGroupProfile.revision = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerGroupProfile;
        });
    }
}
