// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileAssignmentInner;

/**
 * Resource collection API of ConfigurationProfileHciAssignments.
 */
public interface ConfigurationProfileHciAssignments {
    /**
     * Creates an association between a AzureStackHCI cluster and Automanage configuration profile.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName Name of the configuration profile assignment. Only default is
     * supported.
     * @param parameters Parameters supplied to the create or update configuration profile assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration profile assignment is an association between a VM and automanage profile configuration
     * along with {@link Response}.
     */
    Response<ConfigurationProfileAssignment> createOrUpdateWithResponse(String resourceGroupName, String clusterName,
        String configurationProfileAssignmentName, ConfigurationProfileAssignmentInner parameters, Context context);

    /**
     * Creates an association between a AzureStackHCI cluster and Automanage configuration profile.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName Name of the configuration profile assignment. Only default is
     * supported.
     * @param parameters Parameters supplied to the create or update configuration profile assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration profile assignment is an association between a VM and automanage profile configuration.
     */
    ConfigurationProfileAssignment createOrUpdate(String resourceGroupName, String clusterName,
        String configurationProfileAssignmentName, ConfigurationProfileAssignmentInner parameters);

    /**
     * Get information about a configuration profile assignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a configuration profile assignment along with {@link Response}.
     */
    Response<ConfigurationProfileAssignment> getWithResponse(String resourceGroupName, String clusterName,
        String configurationProfileAssignmentName, Context context);

    /**
     * Get information about a configuration profile assignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a configuration profile assignment.
     */
    ConfigurationProfileAssignment get(String resourceGroupName, String clusterName,
        String configurationProfileAssignmentName);

    /**
     * Delete a configuration profile assignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName Name of the configuration profile assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String clusterName,
        String configurationProfileAssignmentName, Context context);

    /**
     * Delete a configuration profile assignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName Name of the configuration profile assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, String configurationProfileAssignmentName);
}
