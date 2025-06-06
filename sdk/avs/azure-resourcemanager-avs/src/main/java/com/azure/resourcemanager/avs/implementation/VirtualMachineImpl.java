// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.avs.fluent.models.VirtualMachineInner;
import com.azure.resourcemanager.avs.models.VirtualMachine;
import com.azure.resourcemanager.avs.models.VirtualMachineProvisioningState;
import com.azure.resourcemanager.avs.models.VirtualMachineRestrictMovementState;

public final class VirtualMachineImpl implements VirtualMachine {
    private VirtualMachineInner innerObject;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    VirtualMachineImpl(VirtualMachineInner innerObject, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public VirtualMachineProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String moRefId() {
        return this.innerModel().moRefId();
    }

    public String folderPath() {
        return this.innerModel().folderPath();
    }

    public VirtualMachineRestrictMovementState restrictMovement() {
        return this.innerModel().restrictMovement();
    }

    public VirtualMachineInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }
}
