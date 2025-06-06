// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Whether internet is enabled or disabled.
 */
public final class InternetEnum extends ExpandableStringEnum<InternetEnum> {
    /**
     * is enabled.
     */
    public static final InternetEnum ENABLED = fromString("Enabled");

    /**
     * is disabled.
     */
    public static final InternetEnum DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of InternetEnum value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InternetEnum() {
    }

    /**
     * Creates or finds a InternetEnum from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding InternetEnum.
     */
    public static InternetEnum fromString(String name) {
        return fromString(name, InternetEnum.class);
    }

    /**
     * Gets known InternetEnum values.
     * 
     * @return known InternetEnum values.
     */
    public static Collection<InternetEnum> values() {
        return values(InternetEnum.class);
    }
}
