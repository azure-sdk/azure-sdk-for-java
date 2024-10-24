// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Properties of a time series database connection resource. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "connectionType",
    defaultImpl = TimeSeriesDatabaseConnectionProperties.class)
@JsonTypeName("TimeSeriesDatabaseConnectionProperties")
@JsonSubTypes({ @JsonSubTypes.Type(name = "AzureDataExplorer", value = AzureDataExplorerConnectionProperties.class) })
@Fluent
public class TimeSeriesDatabaseConnectionProperties {
    /*
     * The provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private TimeSeriesDatabaseConnectionState provisioningState;

    /*
     * Managed identity properties for the time series database connection resource.
     */
    @JsonProperty(value = "identity")
    private ManagedIdentityReference identity;

    /** Creates an instance of TimeSeriesDatabaseConnectionProperties class. */
    public TimeSeriesDatabaseConnectionProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public TimeSeriesDatabaseConnectionState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the identity property: Managed identity properties for the time series database connection resource.
     *
     * @return the identity value.
     */
    public ManagedIdentityReference identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed identity properties for the time series database connection resource.
     *
     * @param identity the identity value to set.
     * @return the TimeSeriesDatabaseConnectionProperties object itself.
     */
    public TimeSeriesDatabaseConnectionProperties withIdentity(ManagedIdentityReference identity) {
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
}
