// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.implementation;

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
import com.azure.resourcemanager.oracledatabase.fluent.AutonomousDatabaseNationalCharacterSetsClient;
import com.azure.resourcemanager.oracledatabase.fluent.models.AutonomousDatabaseNationalCharacterSetInner;
import com.azure.resourcemanager.oracledatabase.implementation.models.AutonomousDatabaseNationalCharacterSetListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * AutonomousDatabaseNationalCharacterSetsClient.
 */
public final class AutonomousDatabaseNationalCharacterSetsClientImpl
    implements AutonomousDatabaseNationalCharacterSetsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final AutonomousDatabaseNationalCharacterSetsService service;

    /**
     * The service client containing this operation class.
     */
    private final OracleDatabaseManagementClientImpl client;

    /**
     * Initializes an instance of AutonomousDatabaseNationalCharacterSetsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    AutonomousDatabaseNationalCharacterSetsClientImpl(OracleDatabaseManagementClientImpl client) {
        this.service = RestProxy.create(AutonomousDatabaseNationalCharacterSetsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for OracleDatabaseManagementClientAutonomousDatabaseNationalCharacterSets
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "OracleDatabaseManagementClientAutonomousDatabaseNationalCharacterSets")
    public interface AutonomousDatabaseNationalCharacterSetsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Oracle.Database/locations/{location}/autonomousDatabaseNationalCharacterSets/{adbsncharsetname}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AutonomousDatabaseNationalCharacterSetInner>> get(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location, @PathParam("adbsncharsetname") String adbsncharsetname,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Oracle.Database/locations/{location}/autonomousDatabaseNationalCharacterSets/{adbsncharsetname}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Response<AutonomousDatabaseNationalCharacterSetInner> getSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location, @PathParam("adbsncharsetname") String adbsncharsetname,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Oracle.Database/locations/{location}/autonomousDatabaseNationalCharacterSets")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AutonomousDatabaseNationalCharacterSetListResult>> listByLocation(
            @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("location") String location,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Oracle.Database/locations/{location}/autonomousDatabaseNationalCharacterSets")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Response<AutonomousDatabaseNationalCharacterSetListResult> listByLocationSync(
            @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("location") String location,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AutonomousDatabaseNationalCharacterSetListResult>> listByLocationNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("endpoint") String endpoint,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Response<AutonomousDatabaseNationalCharacterSetListResult> listByLocationNextSync(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("endpoint") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Get a AutonomousDatabaseNationalCharacterSet.
     * 
     * @param location The name of the Azure region.
     * @param adbsncharsetname AutonomousDatabaseNationalCharacterSets name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AutonomousDatabaseNationalCharacterSet along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AutonomousDatabaseNationalCharacterSetInner>> getWithResponseAsync(String location,
        String adbsncharsetname) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (adbsncharsetname == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter adbsncharsetname is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), location, adbsncharsetname, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a AutonomousDatabaseNationalCharacterSet.
     * 
     * @param location The name of the Azure region.
     * @param adbsncharsetname AutonomousDatabaseNationalCharacterSets name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AutonomousDatabaseNationalCharacterSet on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AutonomousDatabaseNationalCharacterSetInner> getAsync(String location, String adbsncharsetname) {
        return getWithResponseAsync(location, adbsncharsetname).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a AutonomousDatabaseNationalCharacterSet.
     * 
     * @param location The name of the Azure region.
     * @param adbsncharsetname AutonomousDatabaseNationalCharacterSets name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AutonomousDatabaseNationalCharacterSet along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AutonomousDatabaseNationalCharacterSetInner> getWithResponse(String location,
        String adbsncharsetname, Context context) {
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
        if (location == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (adbsncharsetname == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter adbsncharsetname is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getSync(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
            location, adbsncharsetname, accept, context);
    }

    /**
     * Get a AutonomousDatabaseNationalCharacterSet.
     * 
     * @param location The name of the Azure region.
     * @param adbsncharsetname AutonomousDatabaseNationalCharacterSets name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AutonomousDatabaseNationalCharacterSet.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AutonomousDatabaseNationalCharacterSetInner get(String location, String adbsncharsetname) {
        return getWithResponse(location, adbsncharsetname, Context.NONE).getValue();
    }

    /**
     * List AutonomousDatabaseNationalCharacterSet resources by SubscriptionLocationResource.
     * 
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabaseNationalCharacterSet list operation along with {@link PagedResponse}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AutonomousDatabaseNationalCharacterSetInner>>
        listByLocationSinglePageAsync(String location) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByLocation(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), location, accept, context))
            .<PagedResponse<AutonomousDatabaseNationalCharacterSetInner>>map(
                res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                    res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List AutonomousDatabaseNationalCharacterSet resources by SubscriptionLocationResource.
     * 
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabaseNationalCharacterSet list operation as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AutonomousDatabaseNationalCharacterSetInner> listByLocationAsync(String location) {
        return new PagedFlux<>(() -> listByLocationSinglePageAsync(location),
            nextLink -> listByLocationNextSinglePageAsync(nextLink));
    }

    /**
     * List AutonomousDatabaseNationalCharacterSet resources by SubscriptionLocationResource.
     * 
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabaseNationalCharacterSet list operation along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<AutonomousDatabaseNationalCharacterSetInner> listByLocationSinglePage(String location) {
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
        if (location == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        Response<AutonomousDatabaseNationalCharacterSetListResult> res
            = service.listByLocationSync(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), location, accept, Context.NONE);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(),
            res.getValue().nextLink(), null);
    }

    /**
     * List AutonomousDatabaseNationalCharacterSet resources by SubscriptionLocationResource.
     * 
     * @param location The name of the Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabaseNationalCharacterSet list operation along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<AutonomousDatabaseNationalCharacterSetInner> listByLocationSinglePage(String location,
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
        if (location == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        Response<AutonomousDatabaseNationalCharacterSetListResult> res
            = service.listByLocationSync(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), location, accept, context);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(),
            res.getValue().nextLink(), null);
    }

    /**
     * List AutonomousDatabaseNationalCharacterSet resources by SubscriptionLocationResource.
     * 
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabaseNationalCharacterSet list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AutonomousDatabaseNationalCharacterSetInner> listByLocation(String location) {
        return new PagedIterable<>(() -> listByLocationSinglePage(location),
            nextLink -> listByLocationNextSinglePage(nextLink));
    }

    /**
     * List AutonomousDatabaseNationalCharacterSet resources by SubscriptionLocationResource.
     * 
     * @param location The name of the Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabaseNationalCharacterSet list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AutonomousDatabaseNationalCharacterSetInner> listByLocation(String location, Context context) {
        return new PagedIterable<>(() -> listByLocationSinglePage(location, context),
            nextLink -> listByLocationNextSinglePage(nextLink, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabaseNationalCharacterSet list operation along with {@link PagedResponse}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AutonomousDatabaseNationalCharacterSetInner>>
        listByLocationNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByLocationNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<AutonomousDatabaseNationalCharacterSetInner>>map(
                res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                    res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabaseNationalCharacterSet list operation along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<AutonomousDatabaseNationalCharacterSetInner> listByLocationNextSinglePage(String nextLink) {
        if (nextLink == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        Response<AutonomousDatabaseNationalCharacterSetListResult> res
            = service.listByLocationNextSync(nextLink, this.client.getEndpoint(), accept, Context.NONE);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(),
            res.getValue().nextLink(), null);
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabaseNationalCharacterSet list operation along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<AutonomousDatabaseNationalCharacterSetInner> listByLocationNextSinglePage(String nextLink,
        Context context) {
        if (nextLink == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        Response<AutonomousDatabaseNationalCharacterSetListResult> res
            = service.listByLocationNextSync(nextLink, this.client.getEndpoint(), accept, context);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(),
            res.getValue().nextLink(), null);
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(AutonomousDatabaseNationalCharacterSetsClientImpl.class);
}
