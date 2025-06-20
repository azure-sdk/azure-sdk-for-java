// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * mark if the data feed need rollup.
 */
public final class NeedRollupEnum extends ExpandableStringEnum<NeedRollupEnum> {
    /**
     * Static value NoRollup for NeedRollupEnum.
     */
    @Generated
    public static final NeedRollupEnum NO_ROLLUP = fromString("NoRollup");

    /**
     * Static value NeedRollup for NeedRollupEnum.
     */
    @Generated
    public static final NeedRollupEnum NEED_ROLLUP = fromString("NeedRollup");

    /**
     * Static value AlreadyRollup for NeedRollupEnum.
     */
    @Generated
    public static final NeedRollupEnum ALREADY_ROLLUP = fromString("AlreadyRollup");

    /**
     * Creates a new instance of NeedRollupEnum value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public NeedRollupEnum() {
    }

    /**
     * Creates or finds a NeedRollupEnum from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NeedRollupEnum.
     */
    @Generated
    public static NeedRollupEnum fromString(String name) {
        return fromString(name, NeedRollupEnum.class);
    }

    /**
     * Gets known NeedRollupEnum values.
     * 
     * @return known NeedRollupEnum values.
     */
    @Generated
    public static Collection<NeedRollupEnum> values() {
        return values(NeedRollupEnum.class);
    }
}
