// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.EvidenceFileDownloadResponseInner;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.EvidenceResourceInner;
import com.azure.resourcemanager.appcomplianceautomation.models.EvidenceFileDownloadRequest;

/**
 * An instance of this class provides access to all the operations defined in EvidencesClient.
 */
public interface EvidencesClient {
    /**
     * Returns a paginated list of evidences for a specified report.
     * 
     * @param reportName Report Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a EvidenceResource list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EvidenceResourceInner> listByReport(String reportName);

    /**
     * Returns a paginated list of evidences for a specified report.
     * 
     * @param reportName Report Name.
     * @param skipToken Skip over when retrieving results.
     * @param top Number of elements to return when retrieving results.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     * ?$select=reportName,id.
     * @param filter The filter to apply on the operation.
     * @param orderby OData order by query option.
     * @param offerGuid The offerGuid which mapping to the reports.
     * @param reportCreatorTenantId The tenant id of the report creator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a EvidenceResource list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EvidenceResourceInner> listByReport(String reportName, String skipToken, Integer top, String select,
        String filter, String orderby, String offerGuid, String reportCreatorTenantId, Context context);

    /**
     * Get the evidence metadata.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the evidence metadata along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EvidenceResourceInner> getWithResponse(String reportName, String evidenceName, Context context);

    /**
     * Get the evidence metadata.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the evidence metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EvidenceResourceInner get(String reportName, String evidenceName);

    /**
     * Create or Update an evidence a specified report.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @param properties Parameters for the create or update operation.
     * @param offerGuid The offerGuid which mapping to the reports.
     * @param reportCreatorTenantId The tenant id of the report creator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represent an AppComplianceAutomation evidence resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EvidenceResourceInner> createOrUpdateWithResponse(String reportName, String evidenceName,
        EvidenceResourceInner properties, String offerGuid, String reportCreatorTenantId, Context context);

    /**
     * Create or Update an evidence a specified report.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @param properties Parameters for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represent an AppComplianceAutomation evidence resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EvidenceResourceInner createOrUpdate(String reportName, String evidenceName, EvidenceResourceInner properties);

    /**
     * Delete an existent evidence from a specified report.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String reportName, String evidenceName, Context context);

    /**
     * Delete an existent evidence from a specified report.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String reportName, String evidenceName);

    /**
     * Download evidence file.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @param body Parameters for the query operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes all the possible response for the evidence file download operation along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EvidenceFileDownloadResponseInner> downloadWithResponse(String reportName, String evidenceName,
        EvidenceFileDownloadRequest body, Context context);

    /**
     * Download evidence file.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @param body Parameters for the query operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes all the possible response for the evidence file download operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EvidenceFileDownloadResponseInner download(String reportName, String evidenceName,
        EvidenceFileDownloadRequest body);
}
