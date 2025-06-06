// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.weightsandbiases.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.weightsandbiases.fluent.models.InstanceResourceInner;
import com.azure.resourcemanager.weightsandbiases.models.InstanceProperties;
import com.azure.resourcemanager.weightsandbiases.models.InstanceResource;
import com.azure.resourcemanager.weightsandbiases.models.InstanceResourceUpdate;
import com.azure.resourcemanager.weightsandbiases.models.ManagedServiceIdentity;
import java.util.Collections;
import java.util.Map;

public final class InstanceResourceImpl
    implements InstanceResource, InstanceResource.Definition, InstanceResource.Update {
    private InstanceResourceInner innerObject;

    private final com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager serviceManager;

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

    public InstanceProperties properties() {
        return this.innerModel().properties();
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
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

    public InstanceResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String instancename;

    private InstanceResourceUpdate updateProperties;

    public InstanceResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public InstanceResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getInstances()
            .createOrUpdate(resourceGroupName, instancename, this.innerModel(), Context.NONE);
        return this;
    }

    public InstanceResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getInstances()
            .createOrUpdate(resourceGroupName, instancename, this.innerModel(), context);
        return this;
    }

    InstanceResourceImpl(String name,
        com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager serviceManager) {
        this.innerObject = new InstanceResourceInner();
        this.serviceManager = serviceManager;
        this.instancename = name;
    }

    public InstanceResourceImpl update() {
        this.updateProperties = new InstanceResourceUpdate();
        return this;
    }

    public InstanceResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getInstances()
            .updateWithResponse(resourceGroupName, instancename, updateProperties, Context.NONE)
            .getValue();
        return this;
    }

    public InstanceResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getInstances()
            .updateWithResponse(resourceGroupName, instancename, updateProperties, context)
            .getValue();
        return this;
    }

    InstanceResourceImpl(InstanceResourceInner innerObject,
        com.azure.resourcemanager.weightsandbiases.WeightsAndBiasesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.instancename = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "instances");
    }

    public InstanceResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getInstances()
            .getByResourceGroupWithResponse(resourceGroupName, instancename, Context.NONE)
            .getValue();
        return this;
    }

    public InstanceResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getInstances()
            .getByResourceGroupWithResponse(resourceGroupName, instancename, context)
            .getValue();
        return this;
    }

    public InstanceResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public InstanceResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public InstanceResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateProperties.withTags(tags);
            return this;
        }
    }

    public InstanceResourceImpl withProperties(InstanceProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public InstanceResourceImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateProperties.withIdentity(identity);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel() == null || this.innerModel().id() == null;
    }
}
