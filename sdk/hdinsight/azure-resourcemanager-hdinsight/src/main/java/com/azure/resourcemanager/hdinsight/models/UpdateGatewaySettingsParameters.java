// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The update gateway settings request parameters. */
@Fluent
public final class UpdateGatewaySettingsParameters {
    /*
     * Indicates whether or not the gateway settings based authorization is enabled.
     */
    @JsonProperty(value = "restAuthCredential.isEnabled")
    private Boolean isCredentialEnabled;

    /*
     * The gateway settings user name.
     */
    @JsonProperty(value = "restAuthCredential.username")
    private String username;

    /*
     * The gateway settings user password.
     */
    @JsonProperty(value = "restAuthCredential.password")
    private String password;

    /** Creates an instance of UpdateGatewaySettingsParameters class. */
    public UpdateGatewaySettingsParameters() {
    }

    /**
     * Get the isCredentialEnabled property: Indicates whether or not the gateway settings based authorization is
     * enabled.
     *
     * @return the isCredentialEnabled value.
     */
    public Boolean isCredentialEnabled() {
        return this.isCredentialEnabled;
    }

    /**
     * Set the isCredentialEnabled property: Indicates whether or not the gateway settings based authorization is
     * enabled.
     *
     * @param isCredentialEnabled the isCredentialEnabled value to set.
     * @return the UpdateGatewaySettingsParameters object itself.
     */
    public UpdateGatewaySettingsParameters withIsCredentialEnabled(Boolean isCredentialEnabled) {
        this.isCredentialEnabled = isCredentialEnabled;
        return this;
    }

    /**
     * Get the username property: The gateway settings user name.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The gateway settings user name.
     *
     * @param username the username value to set.
     * @return the UpdateGatewaySettingsParameters object itself.
     */
    public UpdateGatewaySettingsParameters withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The gateway settings user password.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The gateway settings user password.
     *
     * @param password the password value to set.
     * @return the UpdateGatewaySettingsParameters object itself.
     */
    public UpdateGatewaySettingsParameters withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
