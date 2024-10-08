// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

/**
 * Samples for Job Resume.
 */
public final class JobResumeSamples {
    /*
     * x-ms-original-file:
     * specification/automation/resource-manager/Microsoft.Automation/stable/2019-06-01/examples/job/resumeJob.json
     */
    /**
     * Sample code: Resume job.
     * 
     * @param manager Entry point to AutomationManager.
     */
    public static void resumeJob(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.jobs()
            .resumeWithResponse("mygroup", "ContoseAutomationAccount", "foo", null, com.azure.core.util.Context.NONE);
    }
}
