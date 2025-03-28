// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.AccessPolicyResourceInner;
import com.azure.resourcemanager.timeseriesinsights.models.AccessPolicyCreateOrUpdateParameters;
import com.azure.resourcemanager.timeseriesinsights.models.AccessPolicyResource;
import com.azure.resourcemanager.timeseriesinsights.models.AccessPolicyRole;
import com.azure.resourcemanager.timeseriesinsights.models.AccessPolicyUpdateParameters;
import java.util.Collections;
import java.util.List;

public final class AccessPolicyResourceImpl
    implements AccessPolicyResource, AccessPolicyResource.Definition, AccessPolicyResource.Update {
    private AccessPolicyResourceInner innerObject;

    private final com.azure.resourcemanager.timeseriesinsights.TimeSeriesInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String principalObjectId() {
        return this.innerModel().principalObjectId();
    }

    public String description() {
        return this.innerModel().description();
    }

    public List<AccessPolicyRole> roles() {
        List<AccessPolicyRole> inner = this.innerModel().roles();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AccessPolicyResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.timeseriesinsights.TimeSeriesInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String environmentName;

    private String accessPolicyName;

    private AccessPolicyCreateOrUpdateParameters createParameters;

    private AccessPolicyUpdateParameters updateAccessPolicyUpdateParameters;

    public AccessPolicyResourceImpl withExistingEnvironment(String resourceGroupName, String environmentName) {
        this.resourceGroupName = resourceGroupName;
        this.environmentName = environmentName;
        return this;
    }

    public AccessPolicyResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getAccessPolicies()
            .createOrUpdateWithResponse(resourceGroupName, environmentName, accessPolicyName, createParameters,
                Context.NONE)
            .getValue();
        return this;
    }

    public AccessPolicyResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAccessPolicies()
            .createOrUpdateWithResponse(resourceGroupName, environmentName, accessPolicyName, createParameters, context)
            .getValue();
        return this;
    }

    AccessPolicyResourceImpl(String name,
        com.azure.resourcemanager.timeseriesinsights.TimeSeriesInsightsManager serviceManager) {
        this.innerObject = new AccessPolicyResourceInner();
        this.serviceManager = serviceManager;
        this.accessPolicyName = name;
        this.createParameters = new AccessPolicyCreateOrUpdateParameters();
    }

    public AccessPolicyResourceImpl update() {
        this.updateAccessPolicyUpdateParameters = new AccessPolicyUpdateParameters();
        return this;
    }

    public AccessPolicyResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getAccessPolicies()
            .updateWithResponse(resourceGroupName, environmentName, accessPolicyName,
                updateAccessPolicyUpdateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public AccessPolicyResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAccessPolicies()
            .updateWithResponse(resourceGroupName, environmentName, accessPolicyName,
                updateAccessPolicyUpdateParameters, context)
            .getValue();
        return this;
    }

    AccessPolicyResourceImpl(AccessPolicyResourceInner innerObject,
        com.azure.resourcemanager.timeseriesinsights.TimeSeriesInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.environmentName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "environments");
        this.accessPolicyName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "accessPolicies");
    }

    public AccessPolicyResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getAccessPolicies()
            .getWithResponse(resourceGroupName, environmentName, accessPolicyName, Context.NONE)
            .getValue();
        return this;
    }

    public AccessPolicyResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAccessPolicies()
            .getWithResponse(resourceGroupName, environmentName, accessPolicyName, context)
            .getValue();
        return this;
    }

    public AccessPolicyResourceImpl withPrincipalObjectId(String principalObjectId) {
        this.createParameters.withPrincipalObjectId(principalObjectId);
        return this;
    }

    public AccessPolicyResourceImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.createParameters.withDescription(description);
            return this;
        } else {
            this.updateAccessPolicyUpdateParameters.withDescription(description);
            return this;
        }
    }

    public AccessPolicyResourceImpl withRoles(List<AccessPolicyRole> roles) {
        if (isInCreateMode()) {
            this.createParameters.withRoles(roles);
            return this;
        } else {
            this.updateAccessPolicyUpdateParameters.withRoles(roles);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
