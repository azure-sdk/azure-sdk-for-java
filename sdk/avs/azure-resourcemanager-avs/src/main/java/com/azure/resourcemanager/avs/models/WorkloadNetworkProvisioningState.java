// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * base Workload Network provisioning state.
 */
public final class WorkloadNetworkProvisioningState extends ExpandableStringEnum<WorkloadNetworkProvisioningState> {
    /**
     * Resource has been created.
     */
    public static final WorkloadNetworkProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Resource creation failed.
     */
    public static final WorkloadNetworkProvisioningState FAILED = fromString("Failed");

    /**
     * Resource creation was canceled.
     */
    public static final WorkloadNetworkProvisioningState CANCELED = fromString("Canceled");

    /**
     * is building.
     */
    public static final WorkloadNetworkProvisioningState BUILDING = fromString("Building");

    /**
     * is deleting.
     */
    public static final WorkloadNetworkProvisioningState DELETING = fromString("Deleting");

    /**
     * is updating.
     */
    public static final WorkloadNetworkProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates a new instance of WorkloadNetworkProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WorkloadNetworkProvisioningState() {
    }

    /**
     * Creates or finds a WorkloadNetworkProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding WorkloadNetworkProvisioningState.
     */
    public static WorkloadNetworkProvisioningState fromString(String name) {
        return fromString(name, WorkloadNetworkProvisioningState.class);
    }

    /**
     * Gets known WorkloadNetworkProvisioningState values.
     * 
     * @return known WorkloadNetworkProvisioningState values.
     */
    public static Collection<WorkloadNetworkProvisioningState> values() {
        return values(WorkloadNetworkProvisioningState.class);
    }
}
