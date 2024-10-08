// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hdinsight.fluent.models.AsyncOperationResultInner;
import com.azure.resourcemanager.hdinsight.fluent.models.AzureMonitorResponseInner;
import com.azure.resourcemanager.hdinsight.fluent.models.ClusterMonitoringResponseInner;
import com.azure.resourcemanager.hdinsight.models.AzureMonitorRequest;
import com.azure.resourcemanager.hdinsight.models.ClusterMonitoringRequest;
import com.azure.resourcemanager.hdinsight.models.Extension;

/**
 * An instance of this class provides access to all the operations defined in ExtensionsClient.
 */
public interface ExtensionsClient {
    /**
     * Enables the Operations Management Suite (OMS) on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Operations Management Suite (OMS) workspace parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnableMonitoring(String resourceGroupName, String clusterName,
        ClusterMonitoringRequest parameters);

    /**
     * Enables the Operations Management Suite (OMS) on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Operations Management Suite (OMS) workspace parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnableMonitoring(String resourceGroupName, String clusterName,
        ClusterMonitoringRequest parameters, Context context);

    /**
     * Enables the Operations Management Suite (OMS) on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Operations Management Suite (OMS) workspace parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enableMonitoring(String resourceGroupName, String clusterName, ClusterMonitoringRequest parameters);

    /**
     * Enables the Operations Management Suite (OMS) on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Operations Management Suite (OMS) workspace parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enableMonitoring(String resourceGroupName, String clusterName, ClusterMonitoringRequest parameters,
        Context context);

    /**
     * Gets the status of Operations Management Suite (OMS) on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Operations Management Suite (OMS) on the HDInsight cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterMonitoringResponseInner> getMonitoringStatusWithResponse(String resourceGroupName,
        String clusterName, Context context);

    /**
     * Gets the status of Operations Management Suite (OMS) on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Operations Management Suite (OMS) on the HDInsight cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterMonitoringResponseInner getMonitoringStatus(String resourceGroupName, String clusterName);

    /**
     * Disables the Operations Management Suite (OMS) on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisableMonitoring(String resourceGroupName, String clusterName);

    /**
     * Disables the Operations Management Suite (OMS) on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisableMonitoring(String resourceGroupName, String clusterName,
        Context context);

    /**
     * Disables the Operations Management Suite (OMS) on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableMonitoring(String resourceGroupName, String clusterName);

    /**
     * Disables the Operations Management Suite (OMS) on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableMonitoring(String resourceGroupName, String clusterName, Context context);

    /**
     * Enables the Azure Monitor on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Log Analytics workspace parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnableAzureMonitor(String resourceGroupName, String clusterName,
        AzureMonitorRequest parameters);

    /**
     * Enables the Azure Monitor on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Log Analytics workspace parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnableAzureMonitor(String resourceGroupName, String clusterName,
        AzureMonitorRequest parameters, Context context);

    /**
     * Enables the Azure Monitor on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Log Analytics workspace parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enableAzureMonitor(String resourceGroupName, String clusterName, AzureMonitorRequest parameters);

    /**
     * Enables the Azure Monitor on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Log Analytics workspace parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enableAzureMonitor(String resourceGroupName, String clusterName, AzureMonitorRequest parameters,
        Context context);

    /**
     * Gets the status of Azure Monitor on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Azure Monitor on the HDInsight cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureMonitorResponseInner> getAzureMonitorStatusWithResponse(String resourceGroupName, String clusterName,
        Context context);

    /**
     * Gets the status of Azure Monitor on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Azure Monitor on the HDInsight cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureMonitorResponseInner getAzureMonitorStatus(String resourceGroupName, String clusterName);

    /**
     * Disables the Azure Monitor on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisableAzureMonitor(String resourceGroupName, String clusterName);

    /**
     * Disables the Azure Monitor on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisableAzureMonitor(String resourceGroupName, String clusterName,
        Context context);

    /**
     * Disables the Azure Monitor on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableAzureMonitor(String resourceGroupName, String clusterName);

    /**
     * Disables the Azure Monitor on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableAzureMonitor(String resourceGroupName, String clusterName, Context context);

    /**
     * Enables the Azure Monitor Agent on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Log Analytics workspace parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnableAzureMonitorAgent(String resourceGroupName, String clusterName,
        AzureMonitorRequest parameters);

    /**
     * Enables the Azure Monitor Agent on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Log Analytics workspace parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnableAzureMonitorAgent(String resourceGroupName, String clusterName,
        AzureMonitorRequest parameters, Context context);

    /**
     * Enables the Azure Monitor Agent on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Log Analytics workspace parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enableAzureMonitorAgent(String resourceGroupName, String clusterName, AzureMonitorRequest parameters);

    /**
     * Enables the Azure Monitor Agent on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Log Analytics workspace parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enableAzureMonitorAgent(String resourceGroupName, String clusterName, AzureMonitorRequest parameters,
        Context context);

    /**
     * Gets the status of Azure Monitor Agent on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Azure Monitor Agent on the HDInsight cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureMonitorResponseInner> getAzureMonitorAgentStatusWithResponse(String resourceGroupName,
        String clusterName, Context context);

    /**
     * Gets the status of Azure Monitor Agent on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Azure Monitor Agent on the HDInsight cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureMonitorResponseInner getAzureMonitorAgentStatus(String resourceGroupName, String clusterName);

    /**
     * Disables the Azure Monitor Agent on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisableAzureMonitorAgent(String resourceGroupName, String clusterName);

    /**
     * Disables the Azure Monitor Agent on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisableAzureMonitorAgent(String resourceGroupName, String clusterName,
        Context context);

    /**
     * Disables the Azure Monitor Agent on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableAzureMonitorAgent(String resourceGroupName, String clusterName);

    /**
     * Disables the Azure Monitor Agent on the HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableAzureMonitorAgent(String resourceGroupName, String clusterName, Context context);

    /**
     * Creates an HDInsight cluster extension.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param parameters The cluster extensions create request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCreate(String resourceGroupName, String clusterName, String extensionName,
        Extension parameters);

    /**
     * Creates an HDInsight cluster extension.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param parameters The cluster extensions create request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCreate(String resourceGroupName, String clusterName, String extensionName,
        Extension parameters, Context context);

    /**
     * Creates an HDInsight cluster extension.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param parameters The cluster extensions create request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void create(String resourceGroupName, String clusterName, String extensionName, Extension parameters);

    /**
     * Creates an HDInsight cluster extension.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param parameters The cluster extensions create request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void create(String resourceGroupName, String clusterName, String extensionName, Extension parameters,
        Context context);

    /**
     * Gets the extension properties for the specified HDInsight cluster extension.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the extension properties for the specified HDInsight cluster extension along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterMonitoringResponseInner> getWithResponse(String resourceGroupName, String clusterName,
        String extensionName, Context context);

    /**
     * Gets the extension properties for the specified HDInsight cluster extension.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the extension properties for the specified HDInsight cluster extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterMonitoringResponseInner get(String resourceGroupName, String clusterName, String extensionName);

    /**
     * Deletes the specified extension for HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, String extensionName);

    /**
     * Deletes the specified extension for HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, String extensionName,
        Context context);

    /**
     * Deletes the specified extension for HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String extensionName);

    /**
     * Deletes the specified extension for HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String extensionName, Context context);

    /**
     * Gets the async operation status.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param operationId The long running operation id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operation status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AsyncOperationResultInner> getAzureAsyncOperationStatusWithResponse(String resourceGroupName,
        String clusterName, String extensionName, String operationId, Context context);

    /**
     * Gets the async operation status.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param operationId The long running operation id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AsyncOperationResultInner getAzureAsyncOperationStatus(String resourceGroupName, String clusterName,
        String extensionName, String operationId);
}
