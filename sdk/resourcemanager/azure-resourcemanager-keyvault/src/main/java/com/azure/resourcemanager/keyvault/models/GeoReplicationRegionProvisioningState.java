// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The current provisioning state.
 */
public final class GeoReplicationRegionProvisioningState
    extends ExpandableStringEnum<GeoReplicationRegionProvisioningState> {
    /**
     * Static value Preprovisioning for GeoReplicationRegionProvisioningState.
     */
    public static final GeoReplicationRegionProvisioningState PREPROVISIONING = fromString("Preprovisioning");

    /**
     * Static value Provisioning for GeoReplicationRegionProvisioningState.
     */
    public static final GeoReplicationRegionProvisioningState PROVISIONING = fromString("Provisioning");

    /**
     * Static value Succeeded for GeoReplicationRegionProvisioningState.
     */
    public static final GeoReplicationRegionProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for GeoReplicationRegionProvisioningState.
     */
    public static final GeoReplicationRegionProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Deleting for GeoReplicationRegionProvisioningState.
     */
    public static final GeoReplicationRegionProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Cleanup for GeoReplicationRegionProvisioningState.
     */
    public static final GeoReplicationRegionProvisioningState CLEANUP = fromString("Cleanup");

    /**
     * Creates a new instance of GeoReplicationRegionProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GeoReplicationRegionProvisioningState() {
    }

    /**
     * Creates or finds a GeoReplicationRegionProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding GeoReplicationRegionProvisioningState.
     */
    public static GeoReplicationRegionProvisioningState fromString(String name) {
        return fromString(name, GeoReplicationRegionProvisioningState.class);
    }

    /**
     * Gets known GeoReplicationRegionProvisioningState values.
     * 
     * @return known GeoReplicationRegionProvisioningState values.
     */
    public static Collection<GeoReplicationRegionProvisioningState> values() {
        return values(GeoReplicationRegionProvisioningState.class);
    }
}
