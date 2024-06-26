// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** VMware to AzStackHCI planned failover model custom properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMwareToAzStackHCI")
@Fluent
public final class VMwareToAzStackHciPlannedFailoverCustomProps extends PlannedFailoverModelCustomProperties {
    /*
     * Gets or sets a value indicating whether VM needs to be shut down.
     */
    @JsonProperty(value = "shutdownSourceVM", required = true)
    private boolean shutdownSourceVM;

    /** Creates an instance of VMwareToAzStackHciPlannedFailoverCustomProps class. */
    public VMwareToAzStackHciPlannedFailoverCustomProps() {
    }

    /**
     * Get the shutdownSourceVM property: Gets or sets a value indicating whether VM needs to be shut down.
     *
     * @return the shutdownSourceVM value.
     */
    public boolean shutdownSourceVM() {
        return this.shutdownSourceVM;
    }

    /**
     * Set the shutdownSourceVM property: Gets or sets a value indicating whether VM needs to be shut down.
     *
     * @param shutdownSourceVM the shutdownSourceVM value to set.
     * @return the VMwareToAzStackHciPlannedFailoverCustomProps object itself.
     */
    public VMwareToAzStackHciPlannedFailoverCustomProps withShutdownSourceVM(boolean shutdownSourceVM) {
        this.shutdownSourceVM = shutdownSourceVM;
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
