// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.resourcemanager.consumption.models.Metrictype;

/**
 * Samples for UsageDetails List.
 */
public final class UsageDetailsListSamples {
    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListForBillingPeriodByBillingAccount.json
     */
    /**
     * Sample code: BillingAccountUsageDetailsListForBillingPeriod-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void billingAccountUsageDetailsListForBillingPeriodLegacy(
        com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("providers/Microsoft.Billing/BillingAccounts/1234", null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListByMCAInvoiceSection.json
     */
    /**
     * Sample code: InvoiceSectionUsageDetailsList-Modern.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void
        invoiceSectionUsageDetailsListModern(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("providers/Microsoft.Billing/BillingAccounts/1234:56789/invoiceSections/98765", null, null, null,
                null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/UsageDetailsList.json
     */
    /**
     * Sample code: UsageDetailsList-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void usageDetailsListLegacy(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("subscriptions/00000000-0000-0000-0000-000000000000", null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListFilterByTag.json
     */
    /**
     * Sample code: UsageDetailsListFilterByTag-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void
        usageDetailsListFilterByTagLegacy(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("subscriptions/00000000-0000-0000-0000-000000000000", null, "tags eq 'dev:tools'", null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListByBillingAccount.json
     */
    /**
     * Sample code: BillingAccountUsageDetailsList-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void
        billingAccountUsageDetailsListLegacy(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("providers/Microsoft.Billing/BillingAccounts/1234", null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListByMCABillingProfile.json
     */
    /**
     * Sample code: BillingProfileUsageDetailsList-Modern.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void
        billingProfileUsageDetailsListModern(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("providers/Microsoft.Billing/BillingAccounts/1234:56789/billingProfiles/2468", null, null, null, null,
                null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListForBillingPeriodByDepartment.json
     */
    /**
     * Sample code: DepartmentUsageDetailsListForBillingPeriod-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void departmentUsageDetailsListForBillingPeriodLegacy(
        com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("providers/Microsoft.Billing/Departments/1234", null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListForBillingPeriodByManagementGroup.json
     */
    /**
     * Sample code: ManagementGroupUsageDetailsListForBillingPeriod-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void managementGroupUsageDetailsListForBillingPeriodLegacy(
        com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("subscriptions/00000000-0000-0000-0000-000000000000", null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListByMetricAmortizedCost.json
     */
    /**
     * Sample code: UsageDetailsListByMetricAmortizedCost-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void
        usageDetailsListByMetricAmortizedCostLegacy(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("subscriptions/00000000-0000-0000-0000-000000000000", null, null, null, null,
                Metrictype.AMORTIZEDCOST, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListByMetricUsage.json
     */
    /**
     * Sample code: UsageDetailsListByMetricUsage-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void
        usageDetailsListByMetricUsageLegacy(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("subscriptions/00000000-0000-0000-0000-000000000000", null, null, null, null, Metrictype.USAGE,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListByManagementGroup.json
     */
    /**
     * Sample code: ManagementGroupUsageDetailsList-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void
        managementGroupUsageDetailsListLegacy(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("subscriptions/00000000-0000-0000-0000-000000000000", null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListByDepartment.json
     */
    /**
     * Sample code: DepartmentUsageDetailsList-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void
        departmentUsageDetailsListLegacy(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("providers/Microsoft.Billing/Departments/1234", null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListByMetricActualCost.json
     */
    /**
     * Sample code: UsageDetailsListByMetricActualCost-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void
        usageDetailsListByMetricActualCostLegacy(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("subscriptions/00000000-0000-0000-0000-000000000000", null, null, null, null, Metrictype.ACTUALCOST,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListByEnrollmentAccount.json
     */
    /**
     * Sample code: EnrollmentAccountUsageDetailsList-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void
        enrollmentAccountUsageDetailsListLegacy(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("providers/Microsoft.Billing/EnrollmentAccounts/1234", null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListByMCABillingAccount.json
     */
    /**
     * Sample code: BillingAccountUsageDetailsList-Modern.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void
        billingAccountUsageDetailsListModern(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("providers/Microsoft.Billing/BillingAccounts/1234:56789", null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListByMCACustomer.json
     */
    /**
     * Sample code: CustomerUsageDetailsList-Modern.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void
        customerUsageDetailsListModern(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list(
                "providers/Microsoft.Billing/BillingAccounts/1234:56789/customers/00000000-0000-0000-0000-000000000000",
                null, null, null, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/UsageDetailsExpand.
     * json
     */
    /**
     * Sample code: UsageDetailsExpand-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void usageDetailsExpandLegacy(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("subscriptions/00000000-0000-0000-0000-000000000000", "meterDetails,additionalInfo",
                "tags eq 'dev:tools'", null, 1, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListForBillingPeriodByEnrollmentAccount.json
     */
    /**
     * Sample code: EnrollmentAccountUsageDetailsListForBillingPeriod-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void enrollmentAccountUsageDetailsListForBillingPeriodLegacy(
        com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("providers/Microsoft.Billing/EnrollmentAccounts/1234", null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * UsageDetailsListForBillingPeriod.json
     */
    /**
     * Sample code: UsageDetailsListForBillingPeriod-Legacy.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void
        usageDetailsListForBillingPeriodLegacy(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.usageDetails()
            .list("subscriptions/00000000-0000-0000-0000-000000000000", null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }
}
