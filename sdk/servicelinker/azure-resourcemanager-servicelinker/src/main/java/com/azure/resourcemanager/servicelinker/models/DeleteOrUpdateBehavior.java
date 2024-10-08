// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The cleanup behavior to indicate whether clean up operation when resource is deleted or updated.
 */
public final class DeleteOrUpdateBehavior extends ExpandableStringEnum<DeleteOrUpdateBehavior> {
    /**
     * Static value Default for DeleteOrUpdateBehavior.
     */
    public static final DeleteOrUpdateBehavior DEFAULT = fromString("Default");

    /**
     * Static value ForcedCleanup for DeleteOrUpdateBehavior.
     */
    public static final DeleteOrUpdateBehavior FORCED_CLEANUP = fromString("ForcedCleanup");

    /**
     * Creates a new instance of DeleteOrUpdateBehavior value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DeleteOrUpdateBehavior() {
    }

    /**
     * Creates or finds a DeleteOrUpdateBehavior from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DeleteOrUpdateBehavior.
     */
    public static DeleteOrUpdateBehavior fromString(String name) {
        return fromString(name, DeleteOrUpdateBehavior.class);
    }

    /**
     * Gets known DeleteOrUpdateBehavior values.
     * 
     * @return known DeleteOrUpdateBehavior values.
     */
    public static Collection<DeleteOrUpdateBehavior> values() {
        return values(DeleteOrUpdateBehavior.class);
    }
}
