// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.resourcemanager.automation.fluent.models.NodeCountsInner;
import java.util.List;

/**
 * An immutable client-side representation of NodeCounts.
 */
public interface NodeCounts {
    /**
     * Gets the value property: Gets an array of counts.
     * 
     * @return the value value.
     */
    List<NodeCount> value();

    /**
     * Gets the totalCount property: Gets the total number of records matching countType criteria.
     * 
     * @return the totalCount value.
     */
    Integer totalCount();

    /**
     * Gets the inner com.azure.resourcemanager.automation.fluent.models.NodeCountsInner object.
     * 
     * @return the inner object.
     */
    NodeCountsInner innerModel();
}
