// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.deploymentstacks.models;

import com.azure.core.management.SystemData;
import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.resources.deploymentstacks.fluent.models.DeploymentStackValidateResultInner;

/**
 * An immutable client-side representation of DeploymentStackValidateResult.
 */
public interface DeploymentStackValidateResult {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the properties property: The validation result details.
     * 
     * @return the properties value.
     */
    DeploymentStackValidateProperties properties();

    /**
     * Gets the error property: The error detail.
     * 
     * @return the error value.
     */
    ManagementError error();

    /**
     * Gets the inner
     * com.azure.resourcemanager.resources.deploymentstacks.fluent.models.DeploymentStackValidateResultInner object.
     * 
     * @return the inner object.
     */
    DeploymentStackValidateResultInner innerModel();
}
