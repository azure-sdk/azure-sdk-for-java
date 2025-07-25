// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.implementation;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservices.fluent.RegisteredIdentitiesClient;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in RegisteredIdentitiesClient.
 */
public final class RegisteredIdentitiesClientImpl implements RegisteredIdentitiesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final RegisteredIdentitiesService service;

    /**
     * The service client containing this operation class.
     */
    private final RecoveryServicesManagementClientImpl client;

    /**
     * Initializes an instance of RegisteredIdentitiesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    RegisteredIdentitiesClientImpl(RecoveryServicesManagementClientImpl client) {
        this.service = RestProxy.create(RegisteredIdentitiesService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesManagementClientRegisteredIdentities to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesManagementClientRegisteredIdentities")
    public interface RegisteredIdentitiesService {
        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/registeredIdentities/{identityName}")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vaultName") String vaultName,
            @PathParam("identityName") String identityName, Context context);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/registeredIdentities/{identityName}")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Response<Void> deleteSync(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vaultName") String vaultName,
            @PathParam("identityName") String identityName, Context context);
    }

    /**
     * Unregisters the given container from your Recovery Services vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param identityName Name of the protection container to unregister.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String vaultName,
        String identityName) {
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
        if (identityName == null) {
            return Mono.error(new IllegalArgumentException("Parameter identityName is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.delete(this.client.getEndpoint(), this.client.getSubscriptionId(),
                this.client.getApiVersion(), resourceGroupName, vaultName, identityName, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Unregisters the given container from your Recovery Services vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param identityName Name of the protection container to unregister.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String resourceGroupName, String vaultName, String identityName) {
        return deleteWithResponseAsync(resourceGroupName, vaultName, identityName).flatMap(ignored -> Mono.empty());
    }

    /**
     * Unregisters the given container from your Recovery Services vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param identityName Name of the protection container to unregister.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String resourceGroupName, String vaultName, String identityName,
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
        if (identityName == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter identityName is required and cannot be null."));
        }
        return service.deleteSync(this.client.getEndpoint(), this.client.getSubscriptionId(),
            this.client.getApiVersion(), resourceGroupName, vaultName, identityName, context);
    }

    /**
     * Unregisters the given container from your Recovery Services vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param identityName Name of the protection container to unregister.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String vaultName, String identityName) {
        deleteWithResponse(resourceGroupName, vaultName, identityName, Context.NONE);
    }

    private static final ClientLogger LOGGER = new ClientLogger(RegisteredIdentitiesClientImpl.class);
}
