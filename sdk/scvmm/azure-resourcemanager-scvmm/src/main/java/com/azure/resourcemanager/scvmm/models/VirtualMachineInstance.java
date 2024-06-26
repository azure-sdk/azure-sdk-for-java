// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.scvmm.fluent.models.VirtualMachineInstanceInner;

/**
 * An immutable client-side representation of VirtualMachineInstance.
 */
public interface VirtualMachineInstance {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    VirtualMachineInstanceProperties properties();

    /**
     * Gets the extendedLocation property: Gets or sets the extended location.
     * 
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.scvmm.fluent.models.VirtualMachineInstanceInner object.
     * 
     * @return the inner object.
     */
    VirtualMachineInstanceInner innerModel();
}
