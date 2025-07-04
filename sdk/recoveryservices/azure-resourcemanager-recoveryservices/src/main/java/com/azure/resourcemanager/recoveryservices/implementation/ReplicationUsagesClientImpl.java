// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservices.fluent.ReplicationUsagesClient;
import com.azure.resourcemanager.recoveryservices.fluent.models.ReplicationUsageInner;
import com.azure.resourcemanager.recoveryservices.models.ReplicationUsageList;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ReplicationUsagesClient.
 */
public final class ReplicationUsagesClientImpl implements ReplicationUsagesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ReplicationUsagesService service;

    /**
     * The service client containing this operation class.
     */
    private final RecoveryServicesManagementClientImpl client;

    /**
     * Initializes an instance of ReplicationUsagesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ReplicationUsagesClientImpl(RecoveryServicesManagementClientImpl client) {
        this.service
            = RestProxy.create(ReplicationUsagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesManagementClientReplicationUsages to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesManagementClientReplicationUsages")
    public interface ReplicationUsagesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/replicationUsages")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReplicationUsageList>> list(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vaultName") String vaultName,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/replicationUsages")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Response<ReplicationUsageList> listSync(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vaultName") String vaultName,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Fetches the replication usages of the vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication usages for vault along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReplicationUsageInner>> listSinglePageAsync(String resourceGroupName, String vaultName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getSubscriptionId(),
                this.client.getApiVersion(), resourceGroupName, vaultName, accept, context))
            .<PagedResponse<ReplicationUsageInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Fetches the replication usages of the vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication usages for vault as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ReplicationUsageInner> listAsync(String resourceGroupName, String vaultName) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, vaultName));
    }

    /**
     * Fetches the replication usages of the vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication usages for vault along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<ReplicationUsageInner> listSinglePage(String resourceGroupName, String vaultName) {
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        final String accept = "application/json";
        Response<ReplicationUsageList> res
            = service.listSync(this.client.getEndpoint(), this.client.getSubscriptionId(), this.client.getApiVersion(),
                resourceGroupName, vaultName, accept, Context.NONE);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(),
            null, null);
    }

    /**
     * Fetches the replication usages of the vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication usages for vault along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<ReplicationUsageInner> listSinglePage(String resourceGroupName, String vaultName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        final String accept = "application/json";
        Response<ReplicationUsageList> res
            = service.listSync(this.client.getEndpoint(), this.client.getSubscriptionId(), this.client.getApiVersion(),
                resourceGroupName, vaultName, accept, context);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(),
            null, null);
    }

    /**
     * Fetches the replication usages of the vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication usages for vault as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ReplicationUsageInner> list(String resourceGroupName, String vaultName) {
        return new PagedIterable<>(() -> listSinglePage(resourceGroupName, vaultName));
    }

    /**
     * Fetches the replication usages of the vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication usages for vault as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ReplicationUsageInner> list(String resourceGroupName, String vaultName, Context context) {
        return new PagedIterable<>(() -> listSinglePage(resourceGroupName, vaultName, context));
    }

    private static final ClientLogger LOGGER = new ClientLogger(ReplicationUsagesClientImpl.class);
}
