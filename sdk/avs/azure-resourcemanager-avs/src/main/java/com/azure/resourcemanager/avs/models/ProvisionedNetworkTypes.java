// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of network provisioned.
 */
public final class ProvisionedNetworkTypes extends ExpandableStringEnum<ProvisionedNetworkTypes> {
    /**
     * network for ESX management.
     */
    public static final ProvisionedNetworkTypes ESX_MANAGEMENT = fromString("esxManagement");

    /**
     * network for ESX replication.
     */
    public static final ProvisionedNetworkTypes ESX_REPLICATION = fromString("esxReplication");

    /**
     * network for HCX management.
     */
    public static final ProvisionedNetworkTypes HCX_MANAGEMENT = fromString("hcxManagement");

    /**
     * network for HCX uplink.
     */
    public static final ProvisionedNetworkTypes HCX_UPLINK = fromString("hcxUplink");

    /**
     * network for vCenter management.
     */
    public static final ProvisionedNetworkTypes VCENTER_MANAGEMENT = fromString("vcenterManagement");

    /**
     * network for vmotion.
     */
    public static final ProvisionedNetworkTypes VMOTION = fromString("vmotion");

    /**
     * network for vsan.
     */
    public static final ProvisionedNetworkTypes VSAN = fromString("vsan");

    /**
     * Creates a new instance of ProvisionedNetworkTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisionedNetworkTypes() {
    }

    /**
     * Creates or finds a ProvisionedNetworkTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProvisionedNetworkTypes.
     */
    public static ProvisionedNetworkTypes fromString(String name) {
        return fromString(name, ProvisionedNetworkTypes.class);
    }

    /**
     * Gets known ProvisionedNetworkTypes values.
     * 
     * @return known ProvisionedNetworkTypes values.
     */
    public static Collection<ProvisionedNetworkTypes> values() {
        return values(ProvisionedNetworkTypes.class);
    }
}
