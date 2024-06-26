// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.ExtendedLocation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The agentPool resource definition.
 */
@Fluent
public final class AgentPoolInner extends ProxyResource {
    /*
     * Properties of the agent pool resource
     */
    @JsonProperty(value = "properties")
    private AgentPoolProperties properties;

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Extended location pointing to the underlying infrastructure
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of AgentPoolInner class.
     */
    public AgentPoolInner() {
    }

    /**
     * Get the properties property: Properties of the agent pool resource.
     * 
     * @return the properties value.
     */
    public AgentPoolProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the agent pool resource.
     * 
     * @param properties the properties value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withProperties(AgentPoolProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the extendedLocation property: Extended location pointing to the underlying infrastructure.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: Extended location pointing to the underlying infrastructure.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }
}
