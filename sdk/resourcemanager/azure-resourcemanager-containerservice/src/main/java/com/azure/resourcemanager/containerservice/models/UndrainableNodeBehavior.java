// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines the behavior for undrainable nodes during upgrade. The most common cause of undrainable nodes is Pod
 * Disruption Budgets (PDBs), but other issues, such as pod termination grace period is exceeding the remaining per-node
 * drain timeout or pod is still being in a running state, can also cause undrainable nodes.
 */
public final class UndrainableNodeBehavior extends ExpandableStringEnum<UndrainableNodeBehavior> {
    /**
     * Static value Cordon for UndrainableNodeBehavior.
     */
    public static final UndrainableNodeBehavior CORDON = fromString("Cordon");

    /**
     * Static value Schedule for UndrainableNodeBehavior.
     */
    public static final UndrainableNodeBehavior SCHEDULE = fromString("Schedule");

    /**
     * Creates a new instance of UndrainableNodeBehavior value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UndrainableNodeBehavior() {
    }

    /**
     * Creates or finds a UndrainableNodeBehavior from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UndrainableNodeBehavior.
     */
    public static UndrainableNodeBehavior fromString(String name) {
        return fromString(name, UndrainableNodeBehavior.class);
    }

    /**
     * Gets known UndrainableNodeBehavior values.
     * 
     * @return known UndrainableNodeBehavior values.
     */
    public static Collection<UndrainableNodeBehavior> values() {
        return values(UndrainableNodeBehavior.class);
    }
}
