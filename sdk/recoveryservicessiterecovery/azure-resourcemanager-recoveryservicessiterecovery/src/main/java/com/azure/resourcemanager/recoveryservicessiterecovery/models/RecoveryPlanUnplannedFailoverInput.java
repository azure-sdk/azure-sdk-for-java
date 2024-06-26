// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Recovery plan unplanned failover input.
 */
@Fluent
public final class RecoveryPlanUnplannedFailoverInput {
    /*
     * The recovery plan unplanned failover input properties.
     */
    @JsonProperty(value = "properties", required = true)
    private RecoveryPlanUnplannedFailoverInputProperties properties;

    /**
     * Creates an instance of RecoveryPlanUnplannedFailoverInput class.
     */
    public RecoveryPlanUnplannedFailoverInput() {
    }

    /**
     * Get the properties property: The recovery plan unplanned failover input properties.
     * 
     * @return the properties value.
     */
    public RecoveryPlanUnplannedFailoverInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The recovery plan unplanned failover input properties.
     * 
     * @param properties the properties value to set.
     * @return the RecoveryPlanUnplannedFailoverInput object itself.
     */
    public RecoveryPlanUnplannedFailoverInput withProperties(RecoveryPlanUnplannedFailoverInputProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property properties in model RecoveryPlanUnplannedFailoverInput"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecoveryPlanUnplannedFailoverInput.class);
}
