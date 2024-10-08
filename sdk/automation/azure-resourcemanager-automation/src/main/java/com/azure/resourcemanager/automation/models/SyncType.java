// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The sync type.
 */
public final class SyncType extends ExpandableStringEnum<SyncType> {
    /**
     * Static value PartialSync for SyncType.
     */
    public static final SyncType PARTIAL_SYNC = fromString("PartialSync");

    /**
     * Static value FullSync for SyncType.
     */
    public static final SyncType FULL_SYNC = fromString("FullSync");

    /**
     * Creates a new instance of SyncType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SyncType() {
    }

    /**
     * Creates or finds a SyncType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SyncType.
     */
    public static SyncType fromString(String name) {
        return fromString(name, SyncType.class);
    }

    /**
     * Gets known SyncType values.
     * 
     * @return known SyncType values.
     */
    public static Collection<SyncType> values() {
        return values(SyncType.class);
    }
}
