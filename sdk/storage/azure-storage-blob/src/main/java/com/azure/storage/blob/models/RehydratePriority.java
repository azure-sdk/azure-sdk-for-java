// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * If an object is in rehydrate pending state then this header is returned with priority of rehydrate. Valid values are
 * High and Standard.
 */
public final class RehydratePriority extends ExpandableStringEnum<RehydratePriority> {
    /**
     * Static value High for RehydratePriority.
     */
    @Generated
    public static final RehydratePriority HIGH = fromString("High");

    /**
     * Static value Standard for RehydratePriority.
     */
    @Generated
    public static final RehydratePriority STANDARD = fromString("Standard");

    /**
     * Creates a new instance of RehydratePriority value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public RehydratePriority() {
    }

    /**
     * Creates or finds a RehydratePriority from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RehydratePriority.
     */
    @Generated
    public static RehydratePriority fromString(String name) {
        return fromString(name, RehydratePriority.class);
    }

    /**
     * Gets known RehydratePriority values.
     * 
     * @return known RehydratePriority values.
     */
    @Generated
    public static Collection<RehydratePriority> values() {
        return values(RehydratePriority.class);
    }
}
