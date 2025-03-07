// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated;

/**
 * Samples for AccessPolicyAssignment List.
 */
public final class AccessPolicyAssignmentListSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2024-11-01/examples/
     * RedisCacheAccessPolicyAssignmentList.json
     */
    /**
     * Sample code: RedisCacheAccessPolicyAssignmentList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redisCacheAccessPolicyAssignmentList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.redisCaches()
            .manager()
            .serviceClient()
            .getAccessPolicyAssignments()
            .list("rg1", "cache1", com.azure.core.util.Context.NONE);
    }
}
