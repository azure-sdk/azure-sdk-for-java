// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of FabricAgents.
 */
public interface FabricAgents {
    /**
     * Gets the details of the fabric agent.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the fabric agent along with {@link Response}.
     */
    Response<FabricAgentModel> getWithResponse(String resourceGroupName, String fabricName, String fabricAgentName,
        Context context);

    /**
     * Gets the details of the fabric agent.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the fabric agent.
     */
    FabricAgentModel get(String resourceGroupName, String fabricName, String fabricAgentName);

    /**
     * Deletes fabric agent.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String fabricName, String fabricAgentName);

    /**
     * Deletes fabric agent.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String fabricName, String fabricAgentName, Context context);

    /**
     * Gets the list of fabric agents in the given fabric.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of fabric agents in the given fabric as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FabricAgentModel> list(String resourceGroupName, String fabricName);

    /**
     * Gets the list of fabric agents in the given fabric.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of fabric agents in the given fabric as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FabricAgentModel> list(String resourceGroupName, String fabricName, Context context);

    /**
     * Gets the details of the fabric agent.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the fabric agent along with {@link Response}.
     */
    FabricAgentModel getById(String id);

    /**
     * Gets the details of the fabric agent.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the fabric agent along with {@link Response}.
     */
    Response<FabricAgentModel> getByIdWithResponse(String id, Context context);

    /**
     * Deletes fabric agent.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes fabric agent.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new FabricAgentModel resource.
     * 
     * @param name resource name.
     * @return the first stage of the new FabricAgentModel definition.
     */
    FabricAgentModel.DefinitionStages.Blank define(String name);
}
