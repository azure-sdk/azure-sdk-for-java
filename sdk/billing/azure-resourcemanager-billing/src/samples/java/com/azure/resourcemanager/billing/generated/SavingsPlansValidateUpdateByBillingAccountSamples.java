// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.resourcemanager.billing.models.AppliedScopeProperties;
import com.azure.resourcemanager.billing.models.AppliedScopeType;
import com.azure.resourcemanager.billing.models.SavingsPlanUpdateRequestProperties;
import com.azure.resourcemanager.billing.models.SavingsPlanUpdateValidateRequest;
import java.util.Arrays;

/**
 * Samples for SavingsPlans ValidateUpdateByBillingAccount.
 */
public final class SavingsPlansValidateUpdateByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/
     * savingsPlanValidateUpdateByBillingAccount.json
     */
    /**
     * Sample code: SavingsPlanValidateUpdate.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void savingsPlanValidateUpdate(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.savingsPlans()
            .validateUpdateByBillingAccountWithResponse(
                "00000000-0000-0000-0000-000000000000:00000000-0000-0000-0000-000000000000_2019-05-31",
                "20000000-0000-0000-0000-000000000000", "30000000-0000-0000-0000-000000000000",
                new SavingsPlanUpdateValidateRequest().withBenefits(
                    Arrays.asList(new SavingsPlanUpdateRequestProperties().withAppliedScopeType(AppliedScopeType.SINGLE)
                        .withAppliedScopeProperties(new AppliedScopeProperties()
                            .withSubscriptionId("/subscriptions/50000000-0000-0000-0000-000000000000")))),
                com.azure.core.util.Context.NONE);
    }
}
