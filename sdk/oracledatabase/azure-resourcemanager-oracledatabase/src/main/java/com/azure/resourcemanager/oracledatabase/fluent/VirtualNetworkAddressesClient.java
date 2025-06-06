// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.oracledatabase.fluent.models.VirtualNetworkAddressInner;

/**
 * An instance of this class provides access to all the operations defined in VirtualNetworkAddressesClient.
 */
public interface VirtualNetworkAddressesClient {
    /**
     * Create a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of virtual IP resource belonging to a vm cluster resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualNetworkAddressInner>, VirtualNetworkAddressInner> beginCreateOrUpdate(
        String resourceGroupName, String cloudvmclustername, String virtualnetworkaddressname,
        VirtualNetworkAddressInner resource);

    /**
     * Create a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of virtual IP resource belonging to a vm cluster resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualNetworkAddressInner>, VirtualNetworkAddressInner> beginCreateOrUpdate(
        String resourceGroupName, String cloudvmclustername, String virtualnetworkaddressname,
        VirtualNetworkAddressInner resource, Context context);

    /**
     * Create a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual IP resource belonging to a vm cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkAddressInner createOrUpdate(String resourceGroupName, String cloudvmclustername,
        String virtualnetworkaddressname, VirtualNetworkAddressInner resource);

    /**
     * Create a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual IP resource belonging to a vm cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkAddressInner createOrUpdate(String resourceGroupName, String cloudvmclustername,
        String virtualnetworkaddressname, VirtualNetworkAddressInner resource, Context context);

    /**
     * Get a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a VirtualNetworkAddress along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualNetworkAddressInner> getWithResponse(String resourceGroupName, String cloudvmclustername,
        String virtualnetworkaddressname, Context context);

    /**
     * Get a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a VirtualNetworkAddress.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkAddressInner get(String resourceGroupName, String cloudvmclustername,
        String virtualnetworkaddressname);

    /**
     * Delete a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String cloudvmclustername,
        String virtualnetworkaddressname);

    /**
     * Delete a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String cloudvmclustername,
        String virtualnetworkaddressname, Context context);

    /**
     * Delete a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cloudvmclustername, String virtualnetworkaddressname);

    /**
     * Delete a VirtualNetworkAddress.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param virtualnetworkaddressname Virtual IP address hostname.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cloudvmclustername, String virtualnetworkaddressname, Context context);

    /**
     * List VirtualNetworkAddress resources by CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VirtualNetworkAddress list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworkAddressInner> listByCloudVmCluster(String resourceGroupName, String cloudvmclustername);

    /**
     * List VirtualNetworkAddress resources by CloudVmCluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudvmclustername CloudVmCluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VirtualNetworkAddress list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworkAddressInner> listByCloudVmCluster(String resourceGroupName, String cloudvmclustername,
        Context context);
}
