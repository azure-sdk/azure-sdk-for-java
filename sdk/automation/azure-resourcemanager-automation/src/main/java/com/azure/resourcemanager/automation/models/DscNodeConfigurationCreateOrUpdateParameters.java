// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.automation.fluent.models.DscNodeConfigurationCreateOrUpdateParametersProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters supplied to the create or update node configuration operation. */
@Fluent
public final class DscNodeConfigurationCreateOrUpdateParameters {
    /*
     * Node configuration properties
     */
    @JsonProperty(value = "properties")
    private DscNodeConfigurationCreateOrUpdateParametersProperties innerProperties;

    /*
     * Name of the node configuration.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets or sets the tags attached to the resource.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the innerProperties property: Node configuration properties.
     *
     * @return the innerProperties value.
     */
    private DscNodeConfigurationCreateOrUpdateParametersProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the node configuration.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the node configuration.
     *
     * @param name the name value to set.
     * @return the DscNodeConfigurationCreateOrUpdateParameters object itself.
     */
    public DscNodeConfigurationCreateOrUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tags property: Gets or sets the tags attached to the resource.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets the tags attached to the resource.
     *
     * @param tags the tags value to set.
     * @return the DscNodeConfigurationCreateOrUpdateParameters object itself.
     */
    public DscNodeConfigurationCreateOrUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the source property: Gets or sets the source.
     *
     * @return the source value.
     */
    public ContentSource source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: Gets or sets the source.
     *
     * @param source the source value to set.
     * @return the DscNodeConfigurationCreateOrUpdateParameters object itself.
     */
    public DscNodeConfigurationCreateOrUpdateParameters withSource(ContentSource source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscNodeConfigurationCreateOrUpdateParametersProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the configuration property: Gets or sets the configuration of the node.
     *
     * @return the configuration value.
     */
    public DscConfigurationAssociationProperty configuration() {
        return this.innerProperties() == null ? null : this.innerProperties().configuration();
    }

    /**
     * Set the configuration property: Gets or sets the configuration of the node.
     *
     * @param configuration the configuration value to set.
     * @return the DscNodeConfigurationCreateOrUpdateParameters object itself.
     */
    public DscNodeConfigurationCreateOrUpdateParameters withConfiguration(
        DscConfigurationAssociationProperty configuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscNodeConfigurationCreateOrUpdateParametersProperties();
        }
        this.innerProperties().withConfiguration(configuration);
        return this;
    }

    /**
     * Get the incrementNodeConfigurationBuild property: If a new build version of NodeConfiguration is required.
     *
     * @return the incrementNodeConfigurationBuild value.
     */
    public Boolean incrementNodeConfigurationBuild() {
        return this.innerProperties() == null ? null : this.innerProperties().incrementNodeConfigurationBuild();
    }

    /**
     * Set the incrementNodeConfigurationBuild property: If a new build version of NodeConfiguration is required.
     *
     * @param incrementNodeConfigurationBuild the incrementNodeConfigurationBuild value to set.
     * @return the DscNodeConfigurationCreateOrUpdateParameters object itself.
     */
    public DscNodeConfigurationCreateOrUpdateParameters withIncrementNodeConfigurationBuild(
        Boolean incrementNodeConfigurationBuild) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscNodeConfigurationCreateOrUpdateParametersProperties();
        }
        this.innerProperties().withIncrementNodeConfigurationBuild(incrementNodeConfigurationBuild);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
