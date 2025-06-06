// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.purestorageblock.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.purestorageblock.fluent.models.AvsVmVolumeInner;
import com.azure.resourcemanager.purestorageblock.models.AvsVmVolumeUpdate;

/**
 * An instance of this class provides access to all the operations defined in AvsVmVolumesClient.
 */
public interface AvsVmVolumesClient {
    /**
     * Update a volume in an AVS VM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storagePoolName Name of the storage pool.
     * @param avsVmId ID of the AVS VM.
     * @param volumeId ID of the volume in the AVS VM.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of any volume associated to a particular AVS VM.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AvsVmVolumeInner>, AvsVmVolumeInner> beginUpdate(String resourceGroupName,
        String storagePoolName, String avsVmId, String volumeId, AvsVmVolumeUpdate properties);

    /**
     * Update a volume in an AVS VM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storagePoolName Name of the storage pool.
     * @param avsVmId ID of the AVS VM.
     * @param volumeId ID of the volume in the AVS VM.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of any volume associated to a particular AVS VM.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AvsVmVolumeInner>, AvsVmVolumeInner> beginUpdate(String resourceGroupName,
        String storagePoolName, String avsVmId, String volumeId, AvsVmVolumeUpdate properties, Context context);

    /**
     * Update a volume in an AVS VM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storagePoolName Name of the storage pool.
     * @param avsVmId ID of the AVS VM.
     * @param volumeId ID of the volume in the AVS VM.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any volume associated to a particular AVS VM.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvsVmVolumeInner update(String resourceGroupName, String storagePoolName, String avsVmId, String volumeId,
        AvsVmVolumeUpdate properties);

    /**
     * Update a volume in an AVS VM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storagePoolName Name of the storage pool.
     * @param avsVmId ID of the AVS VM.
     * @param volumeId ID of the volume in the AVS VM.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any volume associated to a particular AVS VM.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvsVmVolumeInner update(String resourceGroupName, String storagePoolName, String avsVmId, String volumeId,
        AvsVmVolumeUpdate properties, Context context);

    /**
     * Get a volume in an AVS VM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storagePoolName Name of the storage pool.
     * @param avsVmId ID of the AVS VM.
     * @param volumeId ID of the volume in the AVS VM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a volume in an AVS VM along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AvsVmVolumeInner> getWithResponse(String resourceGroupName, String storagePoolName, String avsVmId,
        String volumeId, Context context);

    /**
     * Get a volume in an AVS VM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storagePoolName Name of the storage pool.
     * @param avsVmId ID of the AVS VM.
     * @param volumeId ID of the volume in the AVS VM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a volume in an AVS VM.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvsVmVolumeInner get(String resourceGroupName, String storagePoolName, String avsVmId, String volumeId);

    /**
     * Delete a volume in an AVS VM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storagePoolName Name of the storage pool.
     * @param avsVmId ID of the AVS VM.
     * @param volumeId ID of the volume in the AVS VM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String storagePoolName, String avsVmId,
        String volumeId);

    /**
     * Delete a volume in an AVS VM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storagePoolName Name of the storage pool.
     * @param avsVmId ID of the AVS VM.
     * @param volumeId ID of the volume in the AVS VM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String storagePoolName, String avsVmId,
        String volumeId, Context context);

    /**
     * Delete a volume in an AVS VM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storagePoolName Name of the storage pool.
     * @param avsVmId ID of the AVS VM.
     * @param volumeId ID of the volume in the AVS VM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String storagePoolName, String avsVmId, String volumeId);

    /**
     * Delete a volume in an AVS VM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storagePoolName Name of the storage pool.
     * @param avsVmId ID of the AVS VM.
     * @param volumeId ID of the volume in the AVS VM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String storagePoolName, String avsVmId, String volumeId, Context context);

    /**
     * List volumes in an AVS VM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storagePoolName Name of the storage pool.
     * @param avsVmId ID of the AVS VM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AvsVmVolume list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvsVmVolumeInner> listByAvsVm(String resourceGroupName, String storagePoolName, String avsVmId);

    /**
     * List volumes in an AVS VM.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storagePoolName Name of the storage pool.
     * @param avsVmId ID of the AVS VM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AvsVmVolume list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvsVmVolumeInner> listByAvsVm(String resourceGroupName, String storagePoolName, String avsVmId,
        Context context);
}
