// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.deploymentstacks.generated;

/**
 * Samples for DeploymentStacks ListByResourceGroup.
 */
public final class DeploymentStacksListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentStacks/stable/2024-03-01/examples/
     * DeploymentStackResourceGroupList.json
     */
    /**
     * Sample code: DeploymentStacksResourceGroupList.
     * 
     * @param manager Entry point to DeploymentStacksManager.
     */
    public static void deploymentStacksResourceGroupList(
        com.azure.resourcemanager.resources.deploymentstacks.DeploymentStacksManager manager) {
        manager.deploymentStacks().listByResourceGroup("deploymentStacksRG", com.azure.core.util.Context.NONE);
    }
}
