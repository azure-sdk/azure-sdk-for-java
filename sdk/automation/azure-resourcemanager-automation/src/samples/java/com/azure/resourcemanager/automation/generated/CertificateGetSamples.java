// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

/**
 * Samples for Certificate Get.
 */
public final class CertificateGetSamples {
    /*
     * x-ms-original-file:
     * specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/getCertificate
     * .json
     */
    /**
     * Sample code: Get a certificate.
     * 
     * @param manager Entry point to AutomationManager.
     */
    public static void getACertificate(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.certificates()
            .getWithResponse("rg", "myAutomationAccount33", "testCert", com.azure.core.util.Context.NONE);
    }
}
