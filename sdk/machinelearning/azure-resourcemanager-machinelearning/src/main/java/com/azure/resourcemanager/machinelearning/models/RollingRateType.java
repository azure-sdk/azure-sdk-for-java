// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for RollingRateType.
 */
public final class RollingRateType extends ExpandableStringEnum<RollingRateType> {
    /**
     * Static value Year for RollingRateType.
     */
    public static final RollingRateType YEAR = fromString("Year");

    /**
     * Static value Month for RollingRateType.
     */
    public static final RollingRateType MONTH = fromString("Month");

    /**
     * Static value Day for RollingRateType.
     */
    public static final RollingRateType DAY = fromString("Day");

    /**
     * Static value Hour for RollingRateType.
     */
    public static final RollingRateType HOUR = fromString("Hour");

    /**
     * Static value Minute for RollingRateType.
     */
    public static final RollingRateType MINUTE = fromString("Minute");

    /**
     * Creates a new instance of RollingRateType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RollingRateType() {
    }

    /**
     * Creates or finds a RollingRateType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RollingRateType.
     */
    public static RollingRateType fromString(String name) {
        return fromString(name, RollingRateType.class);
    }

    /**
     * Gets known RollingRateType values.
     * 
     * @return known RollingRateType values.
     */
    public static Collection<RollingRateType> values() {
        return values(RollingRateType.class);
    }
}
