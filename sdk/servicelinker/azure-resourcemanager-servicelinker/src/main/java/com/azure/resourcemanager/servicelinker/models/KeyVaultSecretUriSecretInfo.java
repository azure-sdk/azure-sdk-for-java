// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The secret info when type is keyVaultSecretUri. It's for scenario that user provides a secret stored in user's
 * keyvault and source is Web App, Spring Cloud or Container App.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "secretType")
@JsonTypeName("keyVaultSecretUri")
@Fluent
public final class KeyVaultSecretUriSecretInfo extends SecretInfoBase {
    /*
     * URI to the keyvault secret
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the value property: URI to the keyvault secret.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: URI to the keyvault secret.
     *
     * @param value the value value to set.
     * @return the KeyVaultSecretUriSecretInfo object itself.
     */
    public KeyVaultSecretUriSecretInfo withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
