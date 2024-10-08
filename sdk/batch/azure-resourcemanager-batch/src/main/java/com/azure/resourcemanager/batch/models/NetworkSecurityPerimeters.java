// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of NetworkSecurityPerimeters.
 */
public interface NetworkSecurityPerimeters {
    /**
     * Lists all of the NSP configurations in the specified account.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of a list NSP (network security perimeter) configurations request as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<NetworkSecurityPerimeterConfiguration> listConfigurations(String resourceGroupName,
        String accountName);

    /**
     * Lists all of the NSP configurations in the specified account.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of a list NSP (network security perimeter) configurations request as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<NetworkSecurityPerimeterConfiguration> listConfigurations(String resourceGroupName,
        String accountName, Context context);

    /**
     * Gets information about the specified NSP configuration.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param networkSecurityPerimeterConfigurationName The name for Network Security Perimeter configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified NSP configuration along with {@link Response}.
     */
    Response<NetworkSecurityPerimeterConfiguration> getConfigurationWithResponse(String resourceGroupName,
        String accountName, String networkSecurityPerimeterConfigurationName, Context context);

    /**
     * Gets information about the specified NSP configuration.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param networkSecurityPerimeterConfigurationName The name for Network Security Perimeter configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified NSP configuration.
     */
    NetworkSecurityPerimeterConfiguration getConfiguration(String resourceGroupName, String accountName,
        String networkSecurityPerimeterConfigurationName);

    /**
     * Reconciles the specified NSP configuration.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param networkSecurityPerimeterConfigurationName The name for Network Security Perimeter configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reconcileConfiguration(String resourceGroupName, String accountName,
        String networkSecurityPerimeterConfigurationName);

    /**
     * Reconciles the specified NSP configuration.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param networkSecurityPerimeterConfigurationName The name for Network Security Perimeter configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reconcileConfiguration(String resourceGroupName, String accountName,
        String networkSecurityPerimeterConfigurationName, Context context);
}
