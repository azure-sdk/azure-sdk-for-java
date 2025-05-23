// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The storage account information for storing Service Fabric diagnostic logs.
 */
@Fluent
public final class DiagnosticsStorageAccountConfig implements JsonSerializable<DiagnosticsStorageAccountConfig> {
    /*
     * The Azure storage account name.
     */
    private String storageAccountName;

    /*
     * The protected diagnostics storage key name.
     */
    private String protectedAccountKeyName;

    /*
     * The secondary protected diagnostics storage key name. If one of the storage account keys is rotated the cluster
     * will fallback to using the other.
     */
    private String protectedAccountKeyName2;

    /*
     * The blob endpoint of the azure storage account.
     */
    private String blobEndpoint;

    /*
     * The queue endpoint of the azure storage account.
     */
    private String queueEndpoint;

    /*
     * The table endpoint of the azure storage account.
     */
    private String tableEndpoint;

    /**
     * Creates an instance of DiagnosticsStorageAccountConfig class.
     */
    public DiagnosticsStorageAccountConfig() {
    }

    /**
     * Get the storageAccountName property: The Azure storage account name.
     * 
     * @return the storageAccountName value.
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Set the storageAccountName property: The Azure storage account name.
     * 
     * @param storageAccountName the storageAccountName value to set.
     * @return the DiagnosticsStorageAccountConfig object itself.
     */
    public DiagnosticsStorageAccountConfig withStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
        return this;
    }

    /**
     * Get the protectedAccountKeyName property: The protected diagnostics storage key name.
     * 
     * @return the protectedAccountKeyName value.
     */
    public String protectedAccountKeyName() {
        return this.protectedAccountKeyName;
    }

    /**
     * Set the protectedAccountKeyName property: The protected diagnostics storage key name.
     * 
     * @param protectedAccountKeyName the protectedAccountKeyName value to set.
     * @return the DiagnosticsStorageAccountConfig object itself.
     */
    public DiagnosticsStorageAccountConfig withProtectedAccountKeyName(String protectedAccountKeyName) {
        this.protectedAccountKeyName = protectedAccountKeyName;
        return this;
    }

    /**
     * Get the protectedAccountKeyName2 property: The secondary protected diagnostics storage key name. If one of the
     * storage account keys is rotated the cluster will fallback to using the other.
     * 
     * @return the protectedAccountKeyName2 value.
     */
    public String protectedAccountKeyName2() {
        return this.protectedAccountKeyName2;
    }

    /**
     * Set the protectedAccountKeyName2 property: The secondary protected diagnostics storage key name. If one of the
     * storage account keys is rotated the cluster will fallback to using the other.
     * 
     * @param protectedAccountKeyName2 the protectedAccountKeyName2 value to set.
     * @return the DiagnosticsStorageAccountConfig object itself.
     */
    public DiagnosticsStorageAccountConfig withProtectedAccountKeyName2(String protectedAccountKeyName2) {
        this.protectedAccountKeyName2 = protectedAccountKeyName2;
        return this;
    }

    /**
     * Get the blobEndpoint property: The blob endpoint of the azure storage account.
     * 
     * @return the blobEndpoint value.
     */
    public String blobEndpoint() {
        return this.blobEndpoint;
    }

    /**
     * Set the blobEndpoint property: The blob endpoint of the azure storage account.
     * 
     * @param blobEndpoint the blobEndpoint value to set.
     * @return the DiagnosticsStorageAccountConfig object itself.
     */
    public DiagnosticsStorageAccountConfig withBlobEndpoint(String blobEndpoint) {
        this.blobEndpoint = blobEndpoint;
        return this;
    }

    /**
     * Get the queueEndpoint property: The queue endpoint of the azure storage account.
     * 
     * @return the queueEndpoint value.
     */
    public String queueEndpoint() {
        return this.queueEndpoint;
    }

    /**
     * Set the queueEndpoint property: The queue endpoint of the azure storage account.
     * 
     * @param queueEndpoint the queueEndpoint value to set.
     * @return the DiagnosticsStorageAccountConfig object itself.
     */
    public DiagnosticsStorageAccountConfig withQueueEndpoint(String queueEndpoint) {
        this.queueEndpoint = queueEndpoint;
        return this;
    }

    /**
     * Get the tableEndpoint property: The table endpoint of the azure storage account.
     * 
     * @return the tableEndpoint value.
     */
    public String tableEndpoint() {
        return this.tableEndpoint;
    }

    /**
     * Set the tableEndpoint property: The table endpoint of the azure storage account.
     * 
     * @param tableEndpoint the tableEndpoint value to set.
     * @return the DiagnosticsStorageAccountConfig object itself.
     */
    public DiagnosticsStorageAccountConfig withTableEndpoint(String tableEndpoint) {
        this.tableEndpoint = tableEndpoint;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageAccountName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property storageAccountName in model DiagnosticsStorageAccountConfig"));
        }
        if (protectedAccountKeyName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property protectedAccountKeyName in model DiagnosticsStorageAccountConfig"));
        }
        if (blobEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property blobEndpoint in model DiagnosticsStorageAccountConfig"));
        }
        if (queueEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property queueEndpoint in model DiagnosticsStorageAccountConfig"));
        }
        if (tableEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property tableEndpoint in model DiagnosticsStorageAccountConfig"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiagnosticsStorageAccountConfig.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("storageAccountName", this.storageAccountName);
        jsonWriter.writeStringField("protectedAccountKeyName", this.protectedAccountKeyName);
        jsonWriter.writeStringField("blobEndpoint", this.blobEndpoint);
        jsonWriter.writeStringField("queueEndpoint", this.queueEndpoint);
        jsonWriter.writeStringField("tableEndpoint", this.tableEndpoint);
        jsonWriter.writeStringField("protectedAccountKeyName2", this.protectedAccountKeyName2);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiagnosticsStorageAccountConfig from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiagnosticsStorageAccountConfig if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DiagnosticsStorageAccountConfig.
     */
    public static DiagnosticsStorageAccountConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiagnosticsStorageAccountConfig deserializedDiagnosticsStorageAccountConfig
                = new DiagnosticsStorageAccountConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("storageAccountName".equals(fieldName)) {
                    deserializedDiagnosticsStorageAccountConfig.storageAccountName = reader.getString();
                } else if ("protectedAccountKeyName".equals(fieldName)) {
                    deserializedDiagnosticsStorageAccountConfig.protectedAccountKeyName = reader.getString();
                } else if ("blobEndpoint".equals(fieldName)) {
                    deserializedDiagnosticsStorageAccountConfig.blobEndpoint = reader.getString();
                } else if ("queueEndpoint".equals(fieldName)) {
                    deserializedDiagnosticsStorageAccountConfig.queueEndpoint = reader.getString();
                } else if ("tableEndpoint".equals(fieldName)) {
                    deserializedDiagnosticsStorageAccountConfig.tableEndpoint = reader.getString();
                } else if ("protectedAccountKeyName2".equals(fieldName)) {
                    deserializedDiagnosticsStorageAccountConfig.protectedAccountKeyName2 = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiagnosticsStorageAccountConfig;
        });
    }
}
