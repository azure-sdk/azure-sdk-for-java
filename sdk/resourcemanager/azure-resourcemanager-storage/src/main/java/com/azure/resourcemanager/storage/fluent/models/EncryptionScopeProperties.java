// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.models.EncryptionScopeKeyVaultProperties;
import com.azure.resourcemanager.storage.models.EncryptionScopeSource;
import com.azure.resourcemanager.storage.models.EncryptionScopeState;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Properties of the encryption scope.
 */
@Fluent
public final class EncryptionScopeProperties implements JsonSerializable<EncryptionScopeProperties> {
    /*
     * The provider for the encryption scope. Possible values (case-insensitive): Microsoft.Storage, Microsoft.KeyVault.
     */
    private EncryptionScopeSource source;

    /*
     * The state of the encryption scope. Possible values (case-insensitive): Enabled, Disabled.
     */
    private EncryptionScopeState state;

    /*
     * Gets the creation date and time of the encryption scope in UTC.
     */
    private OffsetDateTime creationTime;

    /*
     * Gets the last modification date and time of the encryption scope in UTC.
     */
    private OffsetDateTime lastModifiedTime;

    /*
     * The key vault properties for the encryption scope. This is a required field if encryption scope 'source'
     * attribute is set to 'Microsoft.KeyVault'.
     */
    private EncryptionScopeKeyVaultProperties keyVaultProperties;

    /*
     * A boolean indicating whether or not the service applies a secondary layer of encryption with platform managed
     * keys for data at rest.
     */
    private Boolean requireInfrastructureEncryption;

    /**
     * Creates an instance of EncryptionScopeProperties class.
     */
    public EncryptionScopeProperties() {
    }

    /**
     * Get the source property: The provider for the encryption scope. Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.KeyVault.
     * 
     * @return the source value.
     */
    public EncryptionScopeSource source() {
        return this.source;
    }

    /**
     * Set the source property: The provider for the encryption scope. Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.KeyVault.
     * 
     * @param source the source value to set.
     * @return the EncryptionScopeProperties object itself.
     */
    public EncryptionScopeProperties withSource(EncryptionScopeSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the state property: The state of the encryption scope. Possible values (case-insensitive): Enabled, Disabled.
     * 
     * @return the state value.
     */
    public EncryptionScopeState state() {
        return this.state;
    }

    /**
     * Set the state property: The state of the encryption scope. Possible values (case-insensitive): Enabled, Disabled.
     * 
     * @param state the state value to set.
     * @return the EncryptionScopeProperties object itself.
     */
    public EncryptionScopeProperties withState(EncryptionScopeState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the creationTime property: Gets the creation date and time of the encryption scope in UTC.
     * 
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the lastModifiedTime property: Gets the last modification date and time of the encryption scope in UTC.
     * 
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the keyVaultProperties property: The key vault properties for the encryption scope. This is a required field
     * if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     * 
     * @return the keyVaultProperties value.
     */
    public EncryptionScopeKeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: The key vault properties for the encryption scope. This is a required field
     * if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     * 
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the EncryptionScopeProperties object itself.
     */
    public EncryptionScopeProperties withKeyVaultProperties(EncryptionScopeKeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Get the requireInfrastructureEncryption property: A boolean indicating whether or not the service applies a
     * secondary layer of encryption with platform managed keys for data at rest.
     * 
     * @return the requireInfrastructureEncryption value.
     */
    public Boolean requireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption;
    }

    /**
     * Set the requireInfrastructureEncryption property: A boolean indicating whether or not the service applies a
     * secondary layer of encryption with platform managed keys for data at rest.
     * 
     * @param requireInfrastructureEncryption the requireInfrastructureEncryption value to set.
     * @return the EncryptionScopeProperties object itself.
     */
    public EncryptionScopeProperties withRequireInfrastructureEncryption(Boolean requireInfrastructureEncryption) {
        this.requireInfrastructureEncryption = requireInfrastructureEncryption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultProperties() != null) {
            keyVaultProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("source", this.source == null ? null : this.source.toString());
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        jsonWriter.writeJsonField("keyVaultProperties", this.keyVaultProperties);
        jsonWriter.writeBooleanField("requireInfrastructureEncryption", this.requireInfrastructureEncryption);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EncryptionScopeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EncryptionScopeProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EncryptionScopeProperties.
     */
    public static EncryptionScopeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EncryptionScopeProperties deserializedEncryptionScopeProperties = new EncryptionScopeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("source".equals(fieldName)) {
                    deserializedEncryptionScopeProperties.source = EncryptionScopeSource.fromString(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedEncryptionScopeProperties.state = EncryptionScopeState.fromString(reader.getString());
                } else if ("creationTime".equals(fieldName)) {
                    deserializedEncryptionScopeProperties.creationTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastModifiedTime".equals(fieldName)) {
                    deserializedEncryptionScopeProperties.lastModifiedTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("keyVaultProperties".equals(fieldName)) {
                    deserializedEncryptionScopeProperties.keyVaultProperties
                        = EncryptionScopeKeyVaultProperties.fromJson(reader);
                } else if ("requireInfrastructureEncryption".equals(fieldName)) {
                    deserializedEncryptionScopeProperties.requireInfrastructureEncryption
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEncryptionScopeProperties;
        });
    }
}
