// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.purestorageblock.models;

import com.azure.resourcemanager.purestorageblock.fluent.models.AvsStatusInner;

/**
 * An immutable client-side representation of AvsStatus.
 */
public interface AvsStatus {
    /**
     * Gets the avsEnabled property: If true, an AVS connection has been successfully completed.
     * 
     * @return the avsEnabled value.
     */
    boolean avsEnabled();

    /**
     * Gets the currentConnectionStatus property: Human-readable current AVS connection status.
     * 
     * @return the currentConnectionStatus value.
     */
    String currentConnectionStatus();

    /**
     * Gets the clusterResourceId property: Azure resource ID of the AVS SDDC the pool is connected to.
     * 
     * @return the clusterResourceId value.
     */
    String clusterResourceId();

    /**
     * Gets the inner com.azure.resourcemanager.purestorageblock.fluent.models.AvsStatusInner object.
     * 
     * @return the inner object.
     */
    AvsStatusInner innerModel();
}
