// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated;

/**
 * Samples for Topics Get.
 */
public final class TopicsGetSamples {
    /*
     * x-ms-original-file:
     * specification/servicebus/resource-manager/Microsoft.ServiceBus/stable/2021-11-01/examples/Topics/SBTopicGet.json
     */
    /**
     * Sample code: TopicGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void topicGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.serviceBusNamespaces()
            .manager()
            .serviceClient()
            .getTopics()
            .getWithResponse("ArunMonocle", "sdk-Namespace-1617", "sdk-Topics-5488", com.azure.core.util.Context.NONE);
    }
}
