// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Class representing a secret store resource.
 */
@Fluent
public final class SecretStoreResource implements JsonSerializable<SecretStoreResource> {
    /*
     * Uri to get to the resource
     */
    private String uri;

    /*
     * Gets or sets the type of secret store
     */
    private SecretStoreType secretStoreType;

    /*
     * Gets or sets value stored in secret store resource
     */
    private String value;

    /**
     * Creates an instance of SecretStoreResource class.
     */
    public SecretStoreResource() {
    }

    /**
     * Get the uri property: Uri to get to the resource.
     * 
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: Uri to get to the resource.
     * 
     * @param uri the uri value to set.
     * @return the SecretStoreResource object itself.
     */
    public SecretStoreResource withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the secretStoreType property: Gets or sets the type of secret store.
     * 
     * @return the secretStoreType value.
     */
    public SecretStoreType secretStoreType() {
        return this.secretStoreType;
    }

    /**
     * Set the secretStoreType property: Gets or sets the type of secret store.
     * 
     * @param secretStoreType the secretStoreType value to set.
     * @return the SecretStoreResource object itself.
     */
    public SecretStoreResource withSecretStoreType(SecretStoreType secretStoreType) {
        this.secretStoreType = secretStoreType;
        return this;
    }

    /**
     * Get the value property: Gets or sets value stored in secret store resource.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets value stored in secret store resource.
     * 
     * @param value the value value to set.
     * @return the SecretStoreResource object itself.
     */
    public SecretStoreResource withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (secretStoreType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property secretStoreType in model SecretStoreResource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SecretStoreResource.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("secretStoreType",
            this.secretStoreType == null ? null : this.secretStoreType.toString());
        jsonWriter.writeStringField("uri", this.uri);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecretStoreResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecretStoreResource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SecretStoreResource.
     */
    public static SecretStoreResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecretStoreResource deserializedSecretStoreResource = new SecretStoreResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("secretStoreType".equals(fieldName)) {
                    deserializedSecretStoreResource.secretStoreType = SecretStoreType.fromString(reader.getString());
                } else if ("uri".equals(fieldName)) {
                    deserializedSecretStoreResource.uri = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedSecretStoreResource.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecretStoreResource;
        });
    }
}
