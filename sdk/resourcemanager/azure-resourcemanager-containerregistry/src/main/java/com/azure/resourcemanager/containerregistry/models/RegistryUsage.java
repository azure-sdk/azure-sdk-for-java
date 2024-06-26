// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The quota usage for a container registry.
 */
@Fluent
public final class RegistryUsage {
    /*
     * The name of the usage.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The limit of the usage.
     */
    @JsonProperty(value = "limit")
    private Long limit;

    /*
     * The current value of the usage.
     */
    @JsonProperty(value = "currentValue")
    private Long currentValue;

    /*
     * The unit of measurement.
     */
    @JsonProperty(value = "unit")
    private RegistryUsageUnit unit;

    /**
     * Creates an instance of RegistryUsage class.
     */
    public RegistryUsage() {
    }

    /**
     * Get the name property: The name of the usage.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the usage.
     * 
     * @param name the name value to set.
     * @return the RegistryUsage object itself.
     */
    public RegistryUsage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the limit property: The limit of the usage.
     * 
     * @return the limit value.
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The limit of the usage.
     * 
     * @param limit the limit value to set.
     * @return the RegistryUsage object itself.
     */
    public RegistryUsage withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the currentValue property: The current value of the usage.
     * 
     * @return the currentValue value.
     */
    public Long currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The current value of the usage.
     * 
     * @param currentValue the currentValue value to set.
     * @return the RegistryUsage object itself.
     */
    public RegistryUsage withCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the unit property: The unit of measurement.
     * 
     * @return the unit value.
     */
    public RegistryUsageUnit unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit of measurement.
     * 
     * @param unit the unit value to set.
     * @return the RegistryUsage object itself.
     */
    public RegistryUsage withUnit(RegistryUsageUnit unit) {
        this.unit = unit;
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
