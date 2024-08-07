// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.monitoring;

import com.azure.analytics.synapse.monitoring.implementation.MonitoringsImpl;
import com.azure.analytics.synapse.monitoring.models.SparkJobListViewResponse;
import com.azure.analytics.synapse.monitoring.models.SqlQueryStringDataModel;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous MonitoringClient type.
 */
@ServiceClient(builder = MonitoringClientBuilder.class, isAsync = true)
public final class MonitoringAsyncClient {
    @Generated
    private final MonitoringsImpl serviceClient;

    /**
     * Initializes an instance of MonitoringAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    MonitoringAsyncClient(MonitoringsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get list of spark applications for the workspace.
     * 
     * @param xMsClientRequestId Can provide a guid, which is helpful for debugging and to provide better customer
     * support.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of spark applications for the workspace along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SparkJobListViewResponse>> getSparkJobListWithResponse(String xMsClientRequestId) {
        return this.serviceClient.getSparkJobListWithResponseAsync(xMsClientRequestId);
    }

    /**
     * Get list of spark applications for the workspace.
     * 
     * @param xMsClientRequestId Can provide a guid, which is helpful for debugging and to provide better customer
     * support.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of spark applications for the workspace on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkJobListViewResponse> getSparkJobList(String xMsClientRequestId) {
        return this.serviceClient.getSparkJobListAsync(xMsClientRequestId);
    }

    /**
     * Get list of spark applications for the workspace.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of spark applications for the workspace on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkJobListViewResponse> getSparkJobList() {
        return this.serviceClient.getSparkJobListAsync();
    }

    /**
     * Get SQL OD/DW Query for the workspace.
     * 
     * @param xMsClientRequestId Can provide a guid, which is helpful for debugging and to provide better customer
     * support.
     * @param filter The filter parameter.
     * @param orderby The orderby parameter.
     * @param skip The skip parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sQL OD/DW Query for the workspace along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SqlQueryStringDataModel>> getSqlJobQueryStringWithResponse(String xMsClientRequestId,
        String filter, String orderby, String skip) {
        return this.serviceClient.getSqlJobQueryStringWithResponseAsync(xMsClientRequestId, filter, orderby, skip);
    }

    /**
     * Get SQL OD/DW Query for the workspace.
     * 
     * @param xMsClientRequestId Can provide a guid, which is helpful for debugging and to provide better customer
     * support.
     * @param filter The filter parameter.
     * @param orderby The orderby parameter.
     * @param skip The skip parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sQL OD/DW Query for the workspace on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlQueryStringDataModel> getSqlJobQueryString(String xMsClientRequestId, String filter, String orderby,
        String skip) {
        return this.serviceClient.getSqlJobQueryStringAsync(xMsClientRequestId, filter, orderby, skip);
    }

    /**
     * Get SQL OD/DW Query for the workspace.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sQL OD/DW Query for the workspace on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlQueryStringDataModel> getSqlJobQueryString() {
        return this.serviceClient.getSqlJobQueryStringAsync();
    }
}
