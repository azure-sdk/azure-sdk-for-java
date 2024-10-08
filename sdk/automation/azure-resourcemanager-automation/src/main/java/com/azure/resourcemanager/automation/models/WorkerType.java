// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of the HybridWorker.
 */
public final class WorkerType extends ExpandableStringEnum<WorkerType> {
    /**
     * Static value HybridV1 for WorkerType.
     */
    public static final WorkerType HYBRID_V1 = fromString("HybridV1");

    /**
     * Static value HybridV2 for WorkerType.
     */
    public static final WorkerType HYBRID_V2 = fromString("HybridV2");

    /**
     * Creates a new instance of WorkerType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WorkerType() {
    }

    /**
     * Creates or finds a WorkerType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding WorkerType.
     */
    public static WorkerType fromString(String name) {
        return fromString(name, WorkerType.class);
    }

    /**
     * Gets known WorkerType values.
     * 
     * @return known WorkerType values.
     */
    public static Collection<WorkerType> values() {
        return values(WorkerType.class);
    }
}
