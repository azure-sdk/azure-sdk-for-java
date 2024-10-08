// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.LongRunningOperationResultInner;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.LongRunningOperationResult;
import java.time.OffsetDateTime;

public final class LongRunningOperationResultImpl implements LongRunningOperationResult {
    private LongRunningOperationResultInner innerObject;

    private final com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager;

    LongRunningOperationResultImpl(LongRunningOperationResultInner innerObject,
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public Double percentComplete() {
        return this.innerModel().percentComplete();
    }

    public String status() {
        return this.innerModel().status();
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public LongRunningOperationResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager manager() {
        return this.serviceManager;
    }
}
