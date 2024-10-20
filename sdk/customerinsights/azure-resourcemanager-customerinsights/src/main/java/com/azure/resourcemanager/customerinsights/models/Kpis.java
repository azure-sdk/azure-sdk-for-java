// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Kpis.
 */
public interface Kpis {
    /**
     * Gets a KPI in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a KPI in the hub along with {@link Response}.
     */
    Response<KpiResourceFormat> getWithResponse(String resourceGroupName, String hubName, String kpiName,
        Context context);

    /**
     * Gets a KPI in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a KPI in the hub.
     */
    KpiResourceFormat get(String resourceGroupName, String hubName, String kpiName);

    /**
     * Deletes a KPI in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hubName, String kpiName);

    /**
     * Deletes a KPI in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hubName, String kpiName, Context context);

    /**
     * Reprocesses the Kpi values of the specified KPI.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> reprocessWithResponse(String resourceGroupName, String hubName, String kpiName, Context context);

    /**
     * Reprocesses the Kpi values of the specified KPI.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reprocess(String resourceGroupName, String hubName, String kpiName);

    /**
     * Gets all the KPIs in the specified hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the KPIs in the specified hub as paginated response with {@link PagedIterable}.
     */
    PagedIterable<KpiResourceFormat> listByHub(String resourceGroupName, String hubName);

    /**
     * Gets all the KPIs in the specified hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the KPIs in the specified hub as paginated response with {@link PagedIterable}.
     */
    PagedIterable<KpiResourceFormat> listByHub(String resourceGroupName, String hubName, Context context);

    /**
     * Gets a KPI in the hub.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a KPI in the hub along with {@link Response}.
     */
    KpiResourceFormat getById(String id);

    /**
     * Gets a KPI in the hub.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a KPI in the hub along with {@link Response}.
     */
    Response<KpiResourceFormat> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a KPI in the hub.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a KPI in the hub.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new KpiResourceFormat resource.
     * 
     * @param name resource name.
     * @return the first stage of the new KpiResourceFormat definition.
     */
    KpiResourceFormat.DefinitionStages.Blank define(String name);
}
