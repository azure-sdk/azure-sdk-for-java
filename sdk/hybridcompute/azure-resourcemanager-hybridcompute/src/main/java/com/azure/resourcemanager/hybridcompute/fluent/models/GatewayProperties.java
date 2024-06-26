// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridcompute.models.GatewayType;
import com.azure.resourcemanager.hybridcompute.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes the properties of a Gateway Profile.
 */
@Fluent
public final class GatewayProperties {
    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * A unique, immutable, identifier for the Gateway.
     */
    @JsonProperty(value = "gatewayId", access = JsonProperty.Access.WRITE_ONLY)
    private String gatewayId;

    /*
     * The type of the Gateway resource.
     */
    @JsonProperty(value = "gatewayType")
    private GatewayType gatewayType;

    /*
     * The endpoint fqdn for the Gateway.
     */
    @JsonProperty(value = "gatewayEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String gatewayEndpoint;

    /*
     * Specifies the list of features that are enabled for this Gateway.
     */
    @JsonProperty(value = "allowedFeatures")
    private List<String> allowedFeatures;

    /**
     * Creates an instance of GatewayProperties class.
     */
    public GatewayProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the gatewayId property: A unique, immutable, identifier for the Gateway.
     * 
     * @return the gatewayId value.
     */
    public String gatewayId() {
        return this.gatewayId;
    }

    /**
     * Get the gatewayType property: The type of the Gateway resource.
     * 
     * @return the gatewayType value.
     */
    public GatewayType gatewayType() {
        return this.gatewayType;
    }

    /**
     * Set the gatewayType property: The type of the Gateway resource.
     * 
     * @param gatewayType the gatewayType value to set.
     * @return the GatewayProperties object itself.
     */
    public GatewayProperties withGatewayType(GatewayType gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * Get the gatewayEndpoint property: The endpoint fqdn for the Gateway.
     * 
     * @return the gatewayEndpoint value.
     */
    public String gatewayEndpoint() {
        return this.gatewayEndpoint;
    }

    /**
     * Get the allowedFeatures property: Specifies the list of features that are enabled for this Gateway.
     * 
     * @return the allowedFeatures value.
     */
    public List<String> allowedFeatures() {
        return this.allowedFeatures;
    }

    /**
     * Set the allowedFeatures property: Specifies the list of features that are enabled for this Gateway.
     * 
     * @param allowedFeatures the allowedFeatures value to set.
     * @return the GatewayProperties object itself.
     */
    public GatewayProperties withAllowedFeatures(List<String> allowedFeatures) {
        this.allowedFeatures = allowedFeatures;
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
