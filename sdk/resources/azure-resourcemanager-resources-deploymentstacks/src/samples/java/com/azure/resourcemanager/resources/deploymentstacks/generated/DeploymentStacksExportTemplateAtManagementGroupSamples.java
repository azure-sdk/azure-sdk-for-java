// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.deploymentstacks.generated;

/**
 * Samples for DeploymentStacks ExportTemplateAtManagementGroup.
 */
public final class DeploymentStacksExportTemplateAtManagementGroupSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentStacks/stable/2024-03-01/examples/
     * DeploymentStackManagementGroupExportTemplate.json
     */
    /**
     * Sample code: DeploymentStacksManagementGroupExportTemplate.
     * 
     * @param manager Entry point to DeploymentStacksManager.
     */
    public static void deploymentStacksManagementGroupExportTemplate(
        com.azure.resourcemanager.resources.deploymentstacks.DeploymentStacksManager manager) {
        manager.deploymentStacks()
            .exportTemplateAtManagementGroupWithResponse("myMg", "simpleDeploymentStack",
                com.azure.core.util.Context.NONE);
    }
}
