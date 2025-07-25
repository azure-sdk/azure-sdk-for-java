// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.storageactions.implementation;

import com.azure.resourcemanager.storageactions.fluent.models.StorageTaskPreviewActionInner;
import com.azure.resourcemanager.storageactions.models.StorageTaskPreviewAction;
import com.azure.resourcemanager.storageactions.models.StorageTaskPreviewActionProperties;

public final class StorageTaskPreviewActionImpl implements StorageTaskPreviewAction {
    private StorageTaskPreviewActionInner innerObject;

    private final com.azure.resourcemanager.storageactions.StorageActionsManager serviceManager;

    StorageTaskPreviewActionImpl(StorageTaskPreviewActionInner innerObject,
        com.azure.resourcemanager.storageactions.StorageActionsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public StorageTaskPreviewActionProperties properties() {
        return this.innerModel().properties();
    }

    public StorageTaskPreviewActionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storageactions.StorageActionsManager manager() {
        return this.serviceManager;
    }
}
