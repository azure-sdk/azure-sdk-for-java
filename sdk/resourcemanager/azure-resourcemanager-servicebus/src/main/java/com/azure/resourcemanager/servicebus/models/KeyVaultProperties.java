// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties to configure keyVault Properties.
 */
@Fluent
public final class KeyVaultProperties implements JsonSerializable<KeyVaultProperties> {
    /*
     * Name of the Key from KeyVault
     */
    private String keyName;

    /*
     * Uri of KeyVault
     */
    private String keyVaultUri;

    /*
     * Version of KeyVault
     */
    private String keyVersion;

    /*
     * The identity property.
     */
    private UserAssignedIdentityProperties identity;

    /**
     * Creates an instance of KeyVaultProperties class.
     */
    public KeyVaultProperties() {
    }

    /**
     * Get the keyName property: Name of the Key from KeyVault.
     * 
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: Name of the Key from KeyVault.
     * 
     * @param keyName the keyName value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVaultUri property: Uri of KeyVault.
     * 
     * @return the keyVaultUri value.
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the keyVaultUri property: Uri of KeyVault.
     * 
     * @param keyVaultUri the keyVaultUri value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

    /**
     * Get the keyVersion property: Version of KeyVault.
     * 
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: Version of KeyVault.
     * 
     * @param keyVersion the keyVersion value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get the identity property: The identity property.
     * 
     * @return the identity value.
     */
    public UserAssignedIdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity property.
     * 
     * @param identity the identity value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withIdentity(UserAssignedIdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("keyName", this.keyName);
        jsonWriter.writeStringField("keyVaultUri", this.keyVaultUri);
        jsonWriter.writeStringField("keyVersion", this.keyVersion);
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyVaultProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyVaultProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyVaultProperties.
     */
    public static KeyVaultProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyVaultProperties deserializedKeyVaultProperties = new KeyVaultProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keyName".equals(fieldName)) {
                    deserializedKeyVaultProperties.keyName = reader.getString();
                } else if ("keyVaultUri".equals(fieldName)) {
                    deserializedKeyVaultProperties.keyVaultUri = reader.getString();
                } else if ("keyVersion".equals(fieldName)) {
                    deserializedKeyVaultProperties.keyVersion = reader.getString();
                } else if ("identity".equals(fieldName)) {
                    deserializedKeyVaultProperties.identity = UserAssignedIdentityProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyVaultProperties;
        });
    }
}
