// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.models.IpConfiguration;
import com.azure.resourcemanager.hdinsight.models.PrivateLinkConfigurationProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The private link configuration properties. */
@Fluent
public final class PrivateLinkConfigurationProperties {
    /*
     * The HDInsight private linkable sub-resource name to apply the private link configuration to. For example,
     * 'headnode', 'gateway', 'edgenode'.
     */
    @JsonProperty(value = "groupId", required = true)
    private String groupId;

    /*
     * The private link configuration provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateLinkConfigurationProvisioningState provisioningState;

    /*
     * The IP configurations for the private link service.
     */
    @JsonProperty(value = "ipConfigurations", required = true)
    private List<IpConfiguration> ipConfigurations;

    /** Creates an instance of PrivateLinkConfigurationProperties class. */
    public PrivateLinkConfigurationProperties() {
    }

    /**
     * Get the groupId property: The HDInsight private linkable sub-resource name to apply the private link
     * configuration to. For example, 'headnode', 'gateway', 'edgenode'.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The HDInsight private linkable sub-resource name to apply the private link
     * configuration to. For example, 'headnode', 'gateway', 'edgenode'.
     *
     * @param groupId the groupId value to set.
     * @return the PrivateLinkConfigurationProperties object itself.
     */
    public PrivateLinkConfigurationProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the provisioningState property: The private link configuration provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    public PrivateLinkConfigurationProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the ipConfigurations property: The IP configurations for the private link service.
     *
     * @return the ipConfigurations value.
     */
    public List<IpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: The IP configurations for the private link service.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the PrivateLinkConfigurationProperties object itself.
     */
    public PrivateLinkConfigurationProperties withIpConfigurations(List<IpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (groupId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property groupId in model PrivateLinkConfigurationProperties"));
        }
        if (ipConfigurations() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ipConfigurations in model PrivateLinkConfigurationProperties"));
        } else {
            ipConfigurations().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkConfigurationProperties.class);
}
