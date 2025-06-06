// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The provisioning state of the last accepted operation.
 */
public final class FleetProvisioningState extends ExpandableStringEnum<FleetProvisioningState> {
    /**
     * Resource has been created.
     */
    public static final FleetProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Resource creation failed.
     */
    public static final FleetProvisioningState FAILED = fromString("Failed");

    /**
     * Resource creation was canceled.
     */
    public static final FleetProvisioningState CANCELED = fromString("Canceled");

    /**
     * The provisioning state of a fleet being created.
     */
    public static final FleetProvisioningState CREATING = fromString("Creating");

    /**
     * The provisioning state of a fleet being updated.
     */
    public static final FleetProvisioningState UPDATING = fromString("Updating");

    /**
     * The provisioning state of a fleet being deleted.
     */
    public static final FleetProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates a new instance of FleetProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FleetProvisioningState() {
    }

    /**
     * Creates or finds a FleetProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FleetProvisioningState.
     */
    public static FleetProvisioningState fromString(String name) {
        return fromString(name, FleetProvisioningState.class);
    }

    /**
     * Gets known FleetProvisioningState values.
     * 
     * @return known FleetProvisioningState values.
     */
    public static Collection<FleetProvisioningState> values() {
        return values(FleetProvisioningState.class);
    }
}
