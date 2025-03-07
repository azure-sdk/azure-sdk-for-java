// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The unit details.
 */
public final class UsageUnit extends ExpandableStringEnum<UsageUnit> {
    /**
     * Static value Count for UsageUnit.
     */
    public static final UsageUnit COUNT = fromString("Count");

    /**
     * Creates a new instance of UsageUnit value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UsageUnit() {
    }

    /**
     * Creates or finds a UsageUnit from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UsageUnit.
     */
    public static UsageUnit fromString(String name) {
        return fromString(name, UsageUnit.class);
    }

    /**
     * Gets known UsageUnit values.
     * 
     * @return known UsageUnit values.
     */
    public static Collection<UsageUnit> values() {
        return values(UsageUnit.class);
    }
}
