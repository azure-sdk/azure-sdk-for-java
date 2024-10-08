// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Gets or sets the SKU name of the account.
 */
public final class SkuNameEnum extends ExpandableStringEnum<SkuNameEnum> {
    /**
     * Static value Free for SkuNameEnum.
     */
    public static final SkuNameEnum FREE = fromString("Free");

    /**
     * Static value Basic for SkuNameEnum.
     */
    public static final SkuNameEnum BASIC = fromString("Basic");

    /**
     * Creates a new instance of SkuNameEnum value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SkuNameEnum() {
    }

    /**
     * Creates or finds a SkuNameEnum from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SkuNameEnum.
     */
    public static SkuNameEnum fromString(String name) {
        return fromString(name, SkuNameEnum.class);
    }

    /**
     * Gets known SkuNameEnum values.
     * 
     * @return known SkuNameEnum values.
     */
    public static Collection<SkuNameEnum> values() {
        return values(SkuNameEnum.class);
    }
}
