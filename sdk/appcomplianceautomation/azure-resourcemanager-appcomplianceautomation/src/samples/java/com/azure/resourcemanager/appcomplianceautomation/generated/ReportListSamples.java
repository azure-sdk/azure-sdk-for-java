// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

/**
 * Samples for Report List.
 */
public final class ReportListSamples {
    /*
     * x-ms-original-file:
     * specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/
     * examples/Report_List.json
     */
    /**
     * Sample code: Report_List.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        reportList(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reports()
            .list("1", 100, null, null, null, "00000000-0000-0000-0000-000000000000",
                "00000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
    }
}
