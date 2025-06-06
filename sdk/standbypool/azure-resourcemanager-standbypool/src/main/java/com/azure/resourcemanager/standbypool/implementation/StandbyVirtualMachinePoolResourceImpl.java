// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.standbypool.fluent.models.StandbyVirtualMachinePoolResourceInner;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResource;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResourceProperties;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResourceUpdate;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResourceUpdateProperties;
import java.util.Collections;
import java.util.Map;

public final class StandbyVirtualMachinePoolResourceImpl implements StandbyVirtualMachinePoolResource,
    StandbyVirtualMachinePoolResource.Definition, StandbyVirtualMachinePoolResource.Update {
    private StandbyVirtualMachinePoolResourceInner innerObject;

    private final com.azure.resourcemanager.standbypool.StandbyPoolManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public StandbyVirtualMachinePoolResourceProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public StandbyVirtualMachinePoolResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.standbypool.StandbyPoolManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String standbyVirtualMachinePoolName;

    private StandbyVirtualMachinePoolResourceUpdate updateProperties;

    public StandbyVirtualMachinePoolResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public StandbyVirtualMachinePoolResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getStandbyVirtualMachinePools()
            .createOrUpdate(resourceGroupName, standbyVirtualMachinePoolName, this.innerModel(), Context.NONE);
        return this;
    }

    public StandbyVirtualMachinePoolResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getStandbyVirtualMachinePools()
            .createOrUpdate(resourceGroupName, standbyVirtualMachinePoolName, this.innerModel(), context);
        return this;
    }

    StandbyVirtualMachinePoolResourceImpl(String name,
        com.azure.resourcemanager.standbypool.StandbyPoolManager serviceManager) {
        this.innerObject = new StandbyVirtualMachinePoolResourceInner();
        this.serviceManager = serviceManager;
        this.standbyVirtualMachinePoolName = name;
    }

    public StandbyVirtualMachinePoolResourceImpl update() {
        this.updateProperties = new StandbyVirtualMachinePoolResourceUpdate();
        return this;
    }

    public StandbyVirtualMachinePoolResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getStandbyVirtualMachinePools()
            .updateWithResponse(resourceGroupName, standbyVirtualMachinePoolName, updateProperties, Context.NONE)
            .getValue();
        return this;
    }

    public StandbyVirtualMachinePoolResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getStandbyVirtualMachinePools()
            .updateWithResponse(resourceGroupName, standbyVirtualMachinePoolName, updateProperties, context)
            .getValue();
        return this;
    }

    StandbyVirtualMachinePoolResourceImpl(StandbyVirtualMachinePoolResourceInner innerObject,
        com.azure.resourcemanager.standbypool.StandbyPoolManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.standbyVirtualMachinePoolName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "standbyVirtualMachinePools");
    }

    public StandbyVirtualMachinePoolResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getStandbyVirtualMachinePools()
            .getByResourceGroupWithResponse(resourceGroupName, standbyVirtualMachinePoolName, Context.NONE)
            .getValue();
        return this;
    }

    public StandbyVirtualMachinePoolResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getStandbyVirtualMachinePools()
            .getByResourceGroupWithResponse(resourceGroupName, standbyVirtualMachinePoolName, context)
            .getValue();
        return this;
    }

    public StandbyVirtualMachinePoolResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public StandbyVirtualMachinePoolResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public StandbyVirtualMachinePoolResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateProperties.withTags(tags);
            return this;
        }
    }

    public StandbyVirtualMachinePoolResourceImpl
        withProperties(StandbyVirtualMachinePoolResourceProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public StandbyVirtualMachinePoolResourceImpl
        withProperties(StandbyVirtualMachinePoolResourceUpdateProperties properties) {
        this.updateProperties.withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel() == null || this.innerModel().id() == null;
    }
}
