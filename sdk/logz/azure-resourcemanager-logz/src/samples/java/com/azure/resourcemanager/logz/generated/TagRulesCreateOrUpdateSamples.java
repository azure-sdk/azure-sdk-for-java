// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

/**
 * Samples for TagRules CreateOrUpdate.
 */
public final class TagRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/logz/resource-manager/Microsoft.Logz/stable/2020-10-01/examples/TagRules_CreateOrUpdate.json
     */
    /**
     * Sample code: TagRules_CreateOrUpdate.
     * 
     * @param manager Entry point to LogzManager.
     */
    public static void tagRulesCreateOrUpdate(com.azure.resourcemanager.logz.LogzManager manager) {
        manager.tagRules().define("default").withExistingMonitor("myResourceGroup", "myMonitor").create();
    }
}
