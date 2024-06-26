// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/**
 * Number of device queue purges is not in allowed range.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "ruleType",
    defaultImpl = QueuePurgesNotInAllowedRange.class,
    visible = true)
@JsonTypeName("QueuePurgesNotInAllowedRange")
@Fluent
public final class QueuePurgesNotInAllowedRange extends TimeWindowCustomAlertRule {
    /*
     * The type of the custom alert rule.
     */
    @JsonTypeId
    @JsonProperty(value = "ruleType", required = true)
    private String ruleType = "QueuePurgesNotInAllowedRange";

    /**
     * Creates an instance of QueuePurgesNotInAllowedRange class.
     */
    public QueuePurgesNotInAllowedRange() {
    }

    /**
     * Get the ruleType property: The type of the custom alert rule.
     * 
     * @return the ruleType value.
     */
    @Override
    public String ruleType() {
        return this.ruleType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QueuePurgesNotInAllowedRange withTimeWindowSize(Duration timeWindowSize) {
        super.withTimeWindowSize(timeWindowSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QueuePurgesNotInAllowedRange withMinThreshold(int minThreshold) {
        super.withMinThreshold(minThreshold);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QueuePurgesNotInAllowedRange withMaxThreshold(int maxThreshold) {
        super.withMaxThreshold(maxThreshold);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QueuePurgesNotInAllowedRange withIsEnabled(boolean isEnabled) {
        super.withIsEnabled(isEnabled);
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
