// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for Enum0.
 */
public final class Enum0 extends ExpandableStringEnum<Enum0> {
    /**
     * Static value Available for Enum0.
     */
    public static final Enum0 AVAILABLE = fromString("Available");

    /**
     * Static value Unavailable for Enum0.
     */
    public static final Enum0 UNAVAILABLE = fromString("Unavailable");

    /**
     * Creates a new instance of Enum0 value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Enum0() {
    }

    /**
     * Creates or finds a Enum0 from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Enum0.
     */
    public static Enum0 fromString(String name) {
        return fromString(name, Enum0.class);
    }

    /**
     * Gets known Enum0 values.
     * 
     * @return known Enum0 values.
     */
    public static Collection<Enum0> values() {
        return values(Enum0.class);
    }
}
