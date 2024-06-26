// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP Community set operation properties. */
@Fluent
public class IpCommunitySetOperationProperties {
    /*
     * List of IP Community IDs.
     */
    @JsonProperty(value = "set")
    private IpCommunityIdList set;

    /** Creates an instance of IpCommunitySetOperationProperties class. */
    public IpCommunitySetOperationProperties() {
    }

    /**
     * Get the set property: List of IP Community IDs.
     *
     * @return the set value.
     */
    public IpCommunityIdList set() {
        return this.set;
    }

    /**
     * Set the set property: List of IP Community IDs.
     *
     * @param set the set value to set.
     * @return the IpCommunitySetOperationProperties object itself.
     */
    public IpCommunitySetOperationProperties withSet(IpCommunityIdList set) {
        this.set = set;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (set() != null) {
            set().validate();
        }
    }
}
