// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/**
 * Samples for Departments ListByBillingAccount.
 */
public final class DepartmentsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/
     * departmentsListByBillingAccount.json
     */
    /**
     * Sample code: DepartmentsListByBillingAccount.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void departmentsListByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.departments()
            .listByBillingAccount("456598", null, null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
