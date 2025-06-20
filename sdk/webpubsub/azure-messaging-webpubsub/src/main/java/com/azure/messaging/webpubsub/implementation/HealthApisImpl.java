// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.webpubsub.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Head;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.messaging.webpubsub.WebPubSubServiceVersion;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in HealthApis.
 */
public final class HealthApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final HealthApisService service;

    /**
     * The service client containing this operation class.
     */
    private final WebPubSubServiceClientImpl client;

    /**
     * Initializes an instance of HealthApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    HealthApisImpl(WebPubSubServiceClientImpl client) {
        this.service
            = RestProxy.create(HealthApisService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public WebPubSubServiceVersion getServiceVersion() {
        return client.getServiceVersion();
    }

    /**
     * The interface defining all the services for AzureWebPubSubServiceRestApiHealthApis to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "AzureWebPubSubServiceRestApiHealthApis")
    public interface HealthApisService {
        @Head("/api/health")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> getServiceStatus(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, RequestOptions requestOptions, Context context);

        @Head("/api/health")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> getServiceStatusSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, RequestOptions requestOptions, Context context);
    }

    /**
     * Get service health status.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return service health status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getServiceStatusWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getServiceStatus(this.client.getEndpoint(),
            this.client.getServiceVersion().getVersion(), requestOptions, context));
    }

    /**
     * Get service health status.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return service health status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getServiceStatusWithResponse(RequestOptions requestOptions) {
        return service.getServiceStatusSync(this.client.getEndpoint(), this.client.getServiceVersion().getVersion(),
            requestOptions, Context.NONE);
    }
}
