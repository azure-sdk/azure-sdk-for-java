// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.purview.fluent.DefaultAccountsClient;
import com.azure.resourcemanager.purview.fluent.models.DefaultAccountPayloadInner;
import com.azure.resourcemanager.purview.models.ScopeType;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in DefaultAccountsClient.
 */
public final class DefaultAccountsClientImpl implements DefaultAccountsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final DefaultAccountsService service;

    /**
     * The service client containing this operation class.
     */
    private final PurviewManagementClientImpl client;

    /**
     * Initializes an instance of DefaultAccountsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    DefaultAccountsClientImpl(PurviewManagementClientImpl client) {
        this.service
            = RestProxy.create(DefaultAccountsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PurviewManagementClientDefaultAccounts to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PurviewManagementCli")
    public interface DefaultAccountsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/providers/Microsoft.Purview/getDefaultAccount")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DefaultAccountPayloadInner>> get(@HostParam("$host") String endpoint,
            @QueryParam("scopeTenantId") UUID scopeTenantId, @QueryParam("scopeType") ScopeType scopeType,
            @QueryParam("scope") String scope, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Post("/providers/Microsoft.Purview/setDefaultAccount")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DefaultAccountPayloadInner>> set(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") DefaultAccountPayloadInner defaultAccountPayload,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Post("/providers/Microsoft.Purview/removeDefaultAccount")
        @ExpectedResponses({ 200, 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> remove(@HostParam("$host") String endpoint,
            @QueryParam("scopeTenantId") UUID scopeTenantId, @QueryParam("scopeType") ScopeType scopeType,
            @QueryParam("scope") String scope, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets the default account information set for the scope.
     * 
     * Get the default account for the scope.
     * 
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @param scope The Id of the scope object, for example if the scope is "Subscription" then it is the ID of that
     * subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default account for the scope along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DefaultAccountPayloadInner>> getWithResponseAsync(UUID scopeTenantId, ScopeType scopeType,
        String scope) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scopeTenantId == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeTenantId is required and cannot be null."));
        }
        if (scopeType == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeType is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), scopeTenantId, scopeType, scope,
                this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the default account information set for the scope.
     * 
     * Get the default account for the scope.
     * 
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @param scope The Id of the scope object, for example if the scope is "Subscription" then it is the ID of that
     * subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default account for the scope along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DefaultAccountPayloadInner>> getWithResponseAsync(UUID scopeTenantId, ScopeType scopeType,
        String scope, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scopeTenantId == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeTenantId is required and cannot be null."));
        }
        if (scopeType == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeType is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), scopeTenantId, scopeType, scope, this.client.getApiVersion(),
            accept, context);
    }

    /**
     * Gets the default account information set for the scope.
     * 
     * Get the default account for the scope.
     * 
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default account for the scope on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DefaultAccountPayloadInner> getAsync(UUID scopeTenantId, ScopeType scopeType) {
        final String scope = null;
        return getWithResponseAsync(scopeTenantId, scopeType, scope).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the default account information set for the scope.
     * 
     * Get the default account for the scope.
     * 
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @param scope The Id of the scope object, for example if the scope is "Subscription" then it is the ID of that
     * subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default account for the scope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DefaultAccountPayloadInner> getWithResponse(UUID scopeTenantId, ScopeType scopeType, String scope,
        Context context) {
        return getWithResponseAsync(scopeTenantId, scopeType, scope, context).block();
    }

    /**
     * Gets the default account information set for the scope.
     * 
     * Get the default account for the scope.
     * 
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default account for the scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DefaultAccountPayloadInner get(UUID scopeTenantId, ScopeType scopeType) {
        final String scope = null;
        return getWithResponse(scopeTenantId, scopeType, scope, Context.NONE).getValue();
    }

    /**
     * Sets the default account for the scope.
     * 
     * @param defaultAccountPayload The payload containing the default account information and the scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload to get and set the default account in the given scope along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DefaultAccountPayloadInner>>
        setWithResponseAsync(DefaultAccountPayloadInner defaultAccountPayload) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (defaultAccountPayload == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter defaultAccountPayload is required and cannot be null."));
        } else {
            defaultAccountPayload.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.set(this.client.getEndpoint(), this.client.getApiVersion(),
                defaultAccountPayload, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Sets the default account for the scope.
     * 
     * @param defaultAccountPayload The payload containing the default account information and the scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload to get and set the default account in the given scope along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DefaultAccountPayloadInner>>
        setWithResponseAsync(DefaultAccountPayloadInner defaultAccountPayload, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (defaultAccountPayload == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter defaultAccountPayload is required and cannot be null."));
        } else {
            defaultAccountPayload.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.set(this.client.getEndpoint(), this.client.getApiVersion(), defaultAccountPayload, accept,
            context);
    }

    /**
     * Sets the default account for the scope.
     * 
     * @param defaultAccountPayload The payload containing the default account information and the scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload to get and set the default account in the given scope on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DefaultAccountPayloadInner> setAsync(DefaultAccountPayloadInner defaultAccountPayload) {
        return setWithResponseAsync(defaultAccountPayload).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Sets the default account for the scope.
     * 
     * @param defaultAccountPayload The payload containing the default account information and the scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload to get and set the default account in the given scope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DefaultAccountPayloadInner> setWithResponse(DefaultAccountPayloadInner defaultAccountPayload,
        Context context) {
        return setWithResponseAsync(defaultAccountPayload, context).block();
    }

    /**
     * Sets the default account for the scope.
     * 
     * @param defaultAccountPayload The payload containing the default account information and the scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload to get and set the default account in the given scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DefaultAccountPayloadInner set(DefaultAccountPayloadInner defaultAccountPayload) {
        return setWithResponse(defaultAccountPayload, Context.NONE).getValue();
    }

    /**
     * Removes the default account from the scope.
     * 
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @param scope The Id of the scope object, for example if the scope is "Subscription" then it is the ID of that
     * subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> removeWithResponseAsync(UUID scopeTenantId, ScopeType scopeType, String scope) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scopeTenantId == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeTenantId is required and cannot be null."));
        }
        if (scopeType == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeType is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.remove(this.client.getEndpoint(), scopeTenantId, scopeType, scope,
                this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Removes the default account from the scope.
     * 
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @param scope The Id of the scope object, for example if the scope is "Subscription" then it is the ID of that
     * subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> removeWithResponseAsync(UUID scopeTenantId, ScopeType scopeType, String scope,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scopeTenantId == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeTenantId is required and cannot be null."));
        }
        if (scopeType == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeType is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.remove(this.client.getEndpoint(), scopeTenantId, scopeType, scope, this.client.getApiVersion(),
            accept, context);
    }

    /**
     * Removes the default account from the scope.
     * 
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> removeAsync(UUID scopeTenantId, ScopeType scopeType) {
        final String scope = null;
        return removeWithResponseAsync(scopeTenantId, scopeType, scope).flatMap(ignored -> Mono.empty());
    }

    /**
     * Removes the default account from the scope.
     * 
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @param scope The Id of the scope object, for example if the scope is "Subscription" then it is the ID of that
     * subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> removeWithResponse(UUID scopeTenantId, ScopeType scopeType, String scope, Context context) {
        return removeWithResponseAsync(scopeTenantId, scopeType, scope, context).block();
    }

    /**
     * Removes the default account from the scope.
     * 
     * @param scopeTenantId The tenant ID.
     * @param scopeType The scope for the default account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void remove(UUID scopeTenantId, ScopeType scopeType) {
        final String scope = null;
        removeWithResponse(scopeTenantId, scopeType, scope, Context.NONE);
    }
}
