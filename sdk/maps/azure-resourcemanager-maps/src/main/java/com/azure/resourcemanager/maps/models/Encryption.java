// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * (Optional) Discouraged to include in resource definition. Only needed where it is possible to disable platform (AKA
 * infrastructure) encryption. Azure SQL TDE is an example of this. Values are enabled and disabled.
 */
@Fluent
public final class Encryption {
    /*
     * Values are enabled and disabled.
     */
    @JsonProperty(value = "infrastructureEncryption")
    private InfrastructureEncryption infrastructureEncryption;

    /*
     * All Customer-managed key encryption properties for the resource.
     */
    @JsonProperty(value = "customerManagedKeyEncryption")
    private CustomerManagedKeyEncryption customerManagedKeyEncryption;

    /** Creates an instance of Encryption class. */
    public Encryption() {
    }

    /**
     * Get the infrastructureEncryption property: Values are enabled and disabled.
     *
     * @return the infrastructureEncryption value.
     */
    public InfrastructureEncryption infrastructureEncryption() {
        return this.infrastructureEncryption;
    }

    /**
     * Set the infrastructureEncryption property: Values are enabled and disabled.
     *
     * @param infrastructureEncryption the infrastructureEncryption value to set.
     * @return the Encryption object itself.
     */
    public Encryption withInfrastructureEncryption(InfrastructureEncryption infrastructureEncryption) {
        this.infrastructureEncryption = infrastructureEncryption;
        return this;
    }

    /**
     * Get the customerManagedKeyEncryption property: All Customer-managed key encryption properties for the resource.
     *
     * @return the customerManagedKeyEncryption value.
     */
    public CustomerManagedKeyEncryption customerManagedKeyEncryption() {
        return this.customerManagedKeyEncryption;
    }

    /**
     * Set the customerManagedKeyEncryption property: All Customer-managed key encryption properties for the resource.
     *
     * @param customerManagedKeyEncryption the customerManagedKeyEncryption value to set.
     * @return the Encryption object itself.
     */
    public Encryption withCustomerManagedKeyEncryption(CustomerManagedKeyEncryption customerManagedKeyEncryption) {
        this.customerManagedKeyEncryption = customerManagedKeyEncryption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customerManagedKeyEncryption() != null) {
            customerManagedKeyEncryption().validate();
        }
    }
}
