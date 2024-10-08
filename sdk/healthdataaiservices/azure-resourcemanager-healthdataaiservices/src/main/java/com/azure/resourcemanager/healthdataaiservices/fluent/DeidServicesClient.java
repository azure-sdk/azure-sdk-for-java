// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.healthdataaiservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.healthdataaiservices.fluent.models.DeidServiceInner;
import com.azure.resourcemanager.healthdataaiservices.models.DeidUpdate;

/**
 * An instance of this class provides access to all the operations defined in DeidServicesClient.
 */
public interface DeidServicesClient {
    /**
     * Get a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DeidService along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeidServiceInner> getByResourceGroupWithResponse(String resourceGroupName, String deidServiceName,
        Context context);

    /**
     * Get a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DeidService.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeidServiceInner getByResourceGroup(String resourceGroupName, String deidServiceName);

    /**
     * List DeidService resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DeidService list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeidServiceInner> listByResourceGroup(String resourceGroupName);

    /**
     * List DeidService resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DeidService list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeidServiceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List DeidService resources by subscription ID.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DeidService list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeidServiceInner> list();

    /**
     * List DeidService resources by subscription ID.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DeidService list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeidServiceInner> list(Context context);

    /**
     * Create a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a HealthDataAIServicesProviderHub resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DeidServiceInner>, DeidServiceInner> beginCreate(String resourceGroupName,
        String deidServiceName, DeidServiceInner resource);

    /**
     * Create a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a HealthDataAIServicesProviderHub resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DeidServiceInner>, DeidServiceInner> beginCreate(String resourceGroupName,
        String deidServiceName, DeidServiceInner resource, Context context);

    /**
     * Create a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a HealthDataAIServicesProviderHub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeidServiceInner create(String resourceGroupName, String deidServiceName, DeidServiceInner resource);

    /**
     * Create a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a HealthDataAIServicesProviderHub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeidServiceInner create(String resourceGroupName, String deidServiceName, DeidServiceInner resource,
        Context context);

    /**
     * Update a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a HealthDataAIServicesProviderHub resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DeidServiceInner>, DeidServiceInner> beginUpdate(String resourceGroupName,
        String deidServiceName, DeidUpdate properties);

    /**
     * Update a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a HealthDataAIServicesProviderHub resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DeidServiceInner>, DeidServiceInner> beginUpdate(String resourceGroupName,
        String deidServiceName, DeidUpdate properties, Context context);

    /**
     * Update a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a HealthDataAIServicesProviderHub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeidServiceInner update(String resourceGroupName, String deidServiceName, DeidUpdate properties);

    /**
     * Update a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a HealthDataAIServicesProviderHub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeidServiceInner update(String resourceGroupName, String deidServiceName, DeidUpdate properties, Context context);

    /**
     * Delete a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String deidServiceName);

    /**
     * Delete a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String deidServiceName, Context context);

    /**
     * Delete a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String deidServiceName);

    /**
     * Delete a DeidService.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deidServiceName The name of the deid service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String deidServiceName, Context context);
}
