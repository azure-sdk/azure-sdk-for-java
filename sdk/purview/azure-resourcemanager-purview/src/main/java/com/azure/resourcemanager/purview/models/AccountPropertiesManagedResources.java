// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Gets the resource identifiers of the managed resources.
 */
@Immutable
public final class AccountPropertiesManagedResources extends ManagedResources {
    /*
     * Gets the managed storage account resource identifier.
     */
    private String storageAccount;

    /*
     * Gets the managed resource group resource identifier. This resource group will host resource dependencies for the
     * account.
     */
    private String resourceGroup;

    /*
     * Gets the managed event hub namespace resource identifier.
     */
    private String eventHubNamespace;

    /**
     * Creates an instance of AccountPropertiesManagedResources class.
     */
    public AccountPropertiesManagedResources() {
    }

    /**
     * Get the storageAccount property: Gets the managed storage account resource identifier.
     * 
     * @return the storageAccount value.
     */
    @Override
    public String storageAccount() {
        return this.storageAccount;
    }

    /**
     * Get the resourceGroup property: Gets the managed resource group resource identifier. This resource group will
     * host resource dependencies for the account.
     * 
     * @return the resourceGroup value.
     */
    @Override
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the eventHubNamespace property: Gets the managed event hub namespace resource identifier.
     * 
     * @return the eventHubNamespace value.
     */
    @Override
    public String eventHubNamespace() {
        return this.eventHubNamespace;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AccountPropertiesManagedResources from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AccountPropertiesManagedResources if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AccountPropertiesManagedResources.
     */
    public static AccountPropertiesManagedResources fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AccountPropertiesManagedResources deserializedAccountPropertiesManagedResources
                = new AccountPropertiesManagedResources();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("eventHubNamespace".equals(fieldName)) {
                    deserializedAccountPropertiesManagedResources.eventHubNamespace = reader.getString();
                } else if ("resourceGroup".equals(fieldName)) {
                    deserializedAccountPropertiesManagedResources.resourceGroup = reader.getString();
                } else if ("storageAccount".equals(fieldName)) {
                    deserializedAccountPropertiesManagedResources.storageAccount = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAccountPropertiesManagedResources;
        });
    }
}
