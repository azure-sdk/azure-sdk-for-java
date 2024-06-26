// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.implementation;

import com.azure.resourcemanager.newrelicobservability.fluent.models.LinkedResourceInner;
import com.azure.resourcemanager.newrelicobservability.models.LinkedResource;

public final class LinkedResourceImpl implements LinkedResource {
    private LinkedResourceInner innerObject;

    private final com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager;

    LinkedResourceImpl(LinkedResourceInner innerObject,
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public LinkedResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager() {
        return this.serviceManager;
    }
}
