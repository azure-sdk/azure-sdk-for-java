// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.resourcemanager.hybridcompute.fluent.models.OperationValueInner;

/**
 * An immutable client-side representation of OperationValue.
 */
public interface OperationValue {
    /**
     * Gets the origin property: The origin of the compute operation.
     * 
     * @return the origin value.
     */
    String origin();

    /**
     * Gets the name property: The name of the compute operation.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: Display properties.
     * 
     * @return the display value.
     */
    OperationValueDisplay display();

    /**
     * Gets the isDataAction property: This property indicates if the operation is an action or a data action.
     * 
     * @return the isDataAction value.
     */
    Boolean isDataAction();

    /**
     * Gets the inner com.azure.resourcemanager.hybridcompute.fluent.models.OperationValueInner object.
     * 
     * @return the inner object.
     */
    OperationValueInner innerModel();
}
