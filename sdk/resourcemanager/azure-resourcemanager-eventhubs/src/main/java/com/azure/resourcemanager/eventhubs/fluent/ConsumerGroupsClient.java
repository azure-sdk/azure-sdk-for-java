// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.fluent.models.ConsumerGroupInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ConsumerGroupsClient.
 */
public interface ConsumerGroupsClient {
    /**
     * Creates or updates an Event Hubs consumer group as a nested resource within a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @param parameters Parameters supplied to create or update a consumer group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Consumer group operation along with {@link Response} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ConsumerGroupInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String namespaceName,
        String eventHubName, String consumerGroupName, ConsumerGroupInner parameters);

    /**
     * Creates or updates an Event Hubs consumer group as a nested resource within a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @param parameters Parameters supplied to create or update a consumer group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Consumer group operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ConsumerGroupInner> createOrUpdateAsync(String resourceGroupName, String namespaceName, String eventHubName,
        String consumerGroupName, ConsumerGroupInner parameters);

    /**
     * Creates or updates an Event Hubs consumer group as a nested resource within a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @param parameters Parameters supplied to create or update a consumer group resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Consumer group operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConsumerGroupInner> createOrUpdateWithResponse(String resourceGroupName, String namespaceName,
        String eventHubName, String consumerGroupName, ConsumerGroupInner parameters, Context context);

    /**
     * Creates or updates an Event Hubs consumer group as a nested resource within a Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @param parameters Parameters supplied to create or update a consumer group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single item in List or Get Consumer group operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConsumerGroupInner createOrUpdate(String resourceGroupName, String namespaceName, String eventHubName,
        String consumerGroupName, ConsumerGroupInner parameters);

    /**
     * Deletes a consumer group from the specified Event Hub and resource group.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String namespaceName, String eventHubName,
        String consumerGroupName);

    /**
     * Deletes a consumer group from the specified Event Hub and resource group.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String namespaceName, String eventHubName,
        String consumerGroupName);

    /**
     * Deletes a consumer group from the specified Event Hub and resource group.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String namespaceName, String eventHubName,
        String consumerGroupName, Context context);

    /**
     * Deletes a consumer group from the specified Event Hub and resource group.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName);

    /**
     * Gets a description for the specified consumer group.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a description for the specified consumer group along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ConsumerGroupInner>> getWithResponseAsync(String resourceGroupName, String namespaceName,
        String eventHubName, String consumerGroupName);

    /**
     * Gets a description for the specified consumer group.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a description for the specified consumer group on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ConsumerGroupInner> getAsync(String resourceGroupName, String namespaceName, String eventHubName,
        String consumerGroupName);

    /**
     * Gets a description for the specified consumer group.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a description for the specified consumer group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConsumerGroupInner> getWithResponse(String resourceGroupName, String namespaceName, String eventHubName,
        String consumerGroupName, Context context);

    /**
     * Gets a description for the specified consumer group.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a description for the specified consumer group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConsumerGroupInner get(String resourceGroupName, String namespaceName, String eventHubName,
        String consumerGroupName);

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the
     * Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param skip Skip is only used if a previous operation returned a partial result. If a previous response contains
     * a nextLink element, the value of the nextLink element will include a skip parameter that specifies a starting
     * point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the consumer groups in a Namespace as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ConsumerGroupInner> listByEventHubAsync(String resourceGroupName, String namespaceName,
        String eventHubName, Integer skip, Integer top);

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the
     * Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the consumer groups in a Namespace as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ConsumerGroupInner> listByEventHubAsync(String resourceGroupName, String namespaceName,
        String eventHubName);

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the
     * Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the consumer groups in a Namespace as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConsumerGroupInner> listByEventHub(String resourceGroupName, String namespaceName,
        String eventHubName);

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the
     * Namespace.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param skip Skip is only used if a previous operation returned a partial result. If a previous response contains
     * a nextLink element, the value of the nextLink element will include a skip parameter that specifies a starting
     * point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the consumer groups in a Namespace as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConsumerGroupInner> listByEventHub(String resourceGroupName, String namespaceName,
        String eventHubName, Integer skip, Integer top, Context context);
}
