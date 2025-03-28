// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.connectedcache.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of EnterpriseMccCacheNodesOperations.
 */
public interface EnterpriseMccCacheNodesOperations {
    /**
     * This api gets ispCacheNode resource information.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param cacheNodeResourceName Name of the ConnectedCache resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the high level Nodes needed to provision cache node resources along with {@link Response}.
     */
    Response<EnterpriseMccCacheNodeResource> getWithResponse(String resourceGroupName, String customerResourceName,
        String cacheNodeResourceName, Context context);

    /**
     * This api gets ispCacheNode resource information.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param cacheNodeResourceName Name of the ConnectedCache resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the high level Nodes needed to provision cache node resources.
     */
    EnterpriseMccCacheNodeResource get(String resourceGroupName, String customerResourceName,
        String cacheNodeResourceName);

    /**
     * This api deletes an existing ispCacheNode resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param cacheNodeResourceName Name of the ConnectedCache resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String customerResourceName, String cacheNodeResourceName);

    /**
     * This api deletes an existing ispCacheNode resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param cacheNodeResourceName Name of the ConnectedCache resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String customerResourceName, String cacheNodeResourceName, Context context);

    /**
     * This api retrieves information about all ispCacheNode resources under the given subscription and resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a EnterpriseMccCacheNodeResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<EnterpriseMccCacheNodeResource> listByEnterpriseMccCustomerResource(String resourceGroupName,
        String customerResourceName);

    /**
     * This api retrieves information about all ispCacheNode resources under the given subscription and resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a EnterpriseMccCacheNodeResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<EnterpriseMccCacheNodeResource> listByEnterpriseMccCustomerResource(String resourceGroupName,
        String customerResourceName, Context context);

    /**
     * This api gets secrets of the ispCacheNode resource install details.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param cacheNodeResourceName Name of the ConnectedCache resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return mcc cache node resource all install details along with {@link Response}.
     */
    Response<MccCacheNodeInstallDetails> getCacheNodeInstallDetailsWithResponse(String resourceGroupName,
        String customerResourceName, String cacheNodeResourceName, Context context);

    /**
     * This api gets secrets of the ispCacheNode resource install details.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customerResourceName Name of the Customer resource.
     * @param cacheNodeResourceName Name of the ConnectedCache resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return mcc cache node resource all install details.
     */
    MccCacheNodeInstallDetails getCacheNodeInstallDetails(String resourceGroupName, String customerResourceName,
        String cacheNodeResourceName);

    /**
     * This api gets ispCacheNode resource information.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the high level Nodes needed to provision cache node resources along with {@link Response}.
     */
    EnterpriseMccCacheNodeResource getById(String id);

    /**
     * This api gets ispCacheNode resource information.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the high level Nodes needed to provision cache node resources along with {@link Response}.
     */
    Response<EnterpriseMccCacheNodeResource> getByIdWithResponse(String id, Context context);

    /**
     * This api deletes an existing ispCacheNode resource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * This api deletes an existing ispCacheNode resource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new EnterpriseMccCacheNodeResource resource.
     * 
     * @param name resource name.
     * @return the first stage of the new EnterpriseMccCacheNodeResource definition.
     */
    EnterpriseMccCacheNodeResource.DefinitionStages.Blank define(String name);
}
