// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.v2.security.keyvault.administration.models;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import io.clientcore.core.utils.ExpandableEnum;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/**
 * Supported permissions for data actions.
 */
public final class KeyVaultDataAction implements ExpandableEnum<String>, JsonSerializable<KeyVaultDataAction> {
    private static final Map<String, KeyVaultDataAction> VALUES = new ConcurrentHashMap<>();

    private static final Function<String, KeyVaultDataAction> NEW_INSTANCE = KeyVaultDataAction::new;

    /**
     * Read HSM key metadata.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction READ_HSM_KEY = fromValue("Microsoft.KeyVault/managedHsm/keys/read/action");

    /**
     * Update an HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction WRITE_HSM_KEY = fromValue("Microsoft.KeyVault/managedHsm/keys/write/action");

    /**
     * Read deleted HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction READ_DELETED_HSM_KEY
        = fromValue("Microsoft.KeyVault/managedHsm/keys/deletedKeys/read/action");

    /**
     * Recover deleted HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction RECOVER_DELETED_HSM_KEY
        = fromValue("Microsoft.KeyVault/managedHsm/keys/deletedKeys/recover/action");

    /**
     * Backup HSM keys.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction BACKUP_HSM_KEYS
        = fromValue("Microsoft.KeyVault/managedHsm/keys/backup/action");

    /**
     * Restore HSM keys.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction RESTORE_HSM_KEYS
        = fromValue("Microsoft.KeyVault/managedHsm/keys/restore/action");

    /**
     * Delete role assignment.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction DELETE_ROLE_ASSIGNMENT
        = fromValue("Microsoft.KeyVault/managedHsm/roleAssignments/delete/action");

    /**
     * Get role assignment.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction GET_ROLE_ASSIGNMENT
        = fromValue("Microsoft.KeyVault/managedHsm/roleAssignments/read/action");

    /**
     * Create or update role assignment.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction WRITE_ROLE_ASSIGNMENT
        = fromValue("Microsoft.KeyVault/managedHsm/roleAssignments/write/action");

    /**
     * Get role definition.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction READ_ROLE_DEFINITION
        = fromValue("Microsoft.KeyVault/managedHsm/roleDefinitions/read/action");

    /**
     * Create or update role definition.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction WRITE_ROLE_DEFINITION
        = fromValue("Microsoft.KeyVault/managedHsm/roleDefinitions/write/action");

    /**
     * Delete role definition.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction DELETE_ROLE_DEFINITION
        = fromValue("Microsoft.KeyVault/managedHsm/roleDefinitions/delete/action");

    /**
     * Encrypt using an HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction ENCRYPT_HSM_KEY
        = fromValue("Microsoft.KeyVault/managedHsm/keys/encrypt/action");

    /**
     * Decrypt using an HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction DECRYPT_HSM_KEY
        = fromValue("Microsoft.KeyVault/managedHsm/keys/decrypt/action");

    /**
     * Wrap using an HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction WRAP_HSM_KEY = fromValue("Microsoft.KeyVault/managedHsm/keys/wrap/action");

    /**
     * Unwrap using an HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction UNWRAP_HSM_KEY
        = fromValue("Microsoft.KeyVault/managedHsm/keys/unwrap/action");

    /**
     * Sign using an HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction SIGN_HSM_KEY = fromValue("Microsoft.KeyVault/managedHsm/keys/sign/action");

    /**
     * Verify using an HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction VERIFY_HSM_KEY
        = fromValue("Microsoft.KeyVault/managedHsm/keys/verify/action");

    /**
     * Create an HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction CREATE_HSM_KEY = fromValue("Microsoft.KeyVault/managedHsm/keys/create");

    /**
     * Delete an HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction DELETE_HSM_KEY = fromValue("Microsoft.KeyVault/managedHsm/keys/delete");

    /**
     * Export an HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction EXPORT_HSM_KEY
        = fromValue("Microsoft.KeyVault/managedHsm/keys/export/action");

    /**
     * Release an HSM key using Secure Key Release.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction RELEASE_KEY = fromValue("Microsoft.KeyVault/managedHsm/keys/release/action");

    /**
     * Import an HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction IMPORT_HSM_KEY
        = fromValue("Microsoft.KeyVault/managedHsm/keys/import/action");

    /**
     * Purge a deleted HSM key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction PURGE_DELETED_HSM_KEY
        = fromValue("Microsoft.KeyVault/managedHsm/keys/deletedKeys/delete");

    /**
     * Download an HSM security domain.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction DOWNLOAD_HSM_SECURITY_DOMAIN
        = fromValue("Microsoft.KeyVault/managedHsm/securitydomain/download/action");

    /**
     * Check status of HSM security domain download.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction DOWNLOAD_HSM_SECURITY_DOMAIN_STATUS
        = fromValue("Microsoft.KeyVault/managedHsm/securitydomain/download/read");

    /**
     * Upload an HSM security domain.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction UPLOAD_HSM_SECURITY_DOMAIN
        = fromValue("Microsoft.KeyVault/managedHsm/securitydomain/upload/action");

    /**
     * Check the status of the HSM security domain exchange file.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction READ_HSM_SECURITY_DOMAIN_STATUS
        = fromValue("Microsoft.KeyVault/managedHsm/securitydomain/upload/read");

    /**
     * Download an HSM security domain transfer key.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction READ_HSM_SECURITY_DOMAIN_TRANSFER_KEY
        = fromValue("Microsoft.KeyVault/managedHsm/securitydomain/transferkey/read");

    /**
     * Start an HSM backup.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction START_HSM_BACKUP
        = fromValue("Microsoft.KeyVault/managedHsm/backup/start/action");

    /**
     * Start an HSM restore.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction START_HSM_RESTORE
        = fromValue("Microsoft.KeyVault/managedHsm/restore/start/action");

    /**
     * Read an HSM backup status.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction READ_HSM_BACKUP_STATUS
        = fromValue("Microsoft.KeyVault/managedHsm/backup/status/action");

    /**
     * Read an HSM restore status.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction READ_HSM_RESTORE_STATUS
        = fromValue("Microsoft.KeyVault/managedHsm/restore/status/action");

    /**
     * Generate random numbers.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultDataAction RANDOM_NUMBERS_GENERATE
        = fromValue("Microsoft.KeyVault/managedHsm/rng/action");

    private final String value;

    private KeyVaultDataAction(String value) {
        this.value = value;
    }

    /**
     * Creates or finds a KeyVaultDataAction.
     * 
     * @param value a value to look for.
     * @return the corresponding KeyVaultDataAction.
     * @throws IllegalArgumentException if value is null.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static KeyVaultDataAction fromValue(String value) {
        if (value == null) {
            throw new IllegalArgumentException("'value' cannot be null.");
        }
        return VALUES.computeIfAbsent(value, NEW_INSTANCE);
    }

    /**
     * Gets known KeyVaultDataAction values.
     * 
     * @return Known KeyVaultDataAction values.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static Collection<KeyVaultDataAction> values() {
        return new ArrayList<>(VALUES.values());
    }

    /**
     * Gets the value of the KeyVaultDataAction instance.
     * 
     * @return the value of the KeyVaultDataAction instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public String getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        return jsonWriter.writeString(getValue());
    }

    /**
     * Reads an instance of KeyVaultDataAction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyVaultDataAction if the JsonReader was pointing to an instance of it, or null if the
     * JsonReader was pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyVaultDataAction.
     * @throws IllegalStateException If unexpected JSON token is found.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static KeyVaultDataAction fromJson(JsonReader jsonReader) throws IOException {
        JsonToken nextToken = jsonReader.nextToken();
        if (nextToken == JsonToken.NULL) {
            return null;
        }
        if (nextToken != JsonToken.STRING) {
            throw new IllegalStateException(
                String.format("Unexpected JSON token for %s deserialization: %s", JsonToken.STRING, nextToken));
        }
        return KeyVaultDataAction.fromValue(jsonReader.getString());
    }

    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public String toString() {
        return Objects.toString(this.value);
    }

    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }
}
