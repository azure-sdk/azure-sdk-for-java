// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.implementation;

import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.DatasetListResponse;
import com.azure.analytics.synapse.artifacts.models.DatasetResource;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Datasets.
 */
public final class DatasetsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final DatasetsService service;

    /**
     * The service client containing this operation class.
     */
    private final ArtifactsClientImpl client;

    /**
     * Initializes an instance of DatasetsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    DatasetsImpl(ArtifactsClientImpl client) {
        this.service = RestProxy.create(DatasetsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ArtifactsClientDatasets to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ArtifactsClientDatasets")
    public interface DatasetsService {
        @Get("/datasets")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<DatasetListResponse>> getDatasetsByWorkspace(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Put("/datasets/{datasetName}")
        @ExpectedResponses({ 200, 202 })
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<DatasetResource>> createOrUpdateDataset(@HostParam("endpoint") String endpoint,
            @PathParam("datasetName") String datasetName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("If-Match") String ifMatch, @BodyParam("application/json") DatasetResource dataset,
            @HeaderParam("Accept") String accept, Context context);

        @Get("/datasets/{datasetName}")
        @ExpectedResponses({ 200, 304 })
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<DatasetResource>> getDataset(@HostParam("endpoint") String endpoint,
            @PathParam("datasetName") String datasetName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("Accept") String accept, Context context);

        @Delete("/datasets/{datasetName}")
        @ExpectedResponses({ 200, 202, 204 })
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<Void>> deleteDataset(@HostParam("endpoint") String endpoint,
            @PathParam("datasetName") String datasetName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Post("/datasets/{datasetName}/rename")
        @ExpectedResponses({ 200, 202 })
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<Void>> renameDataset(@HostParam("endpoint") String endpoint,
            @PathParam("datasetName") String datasetName, @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ArtifactRenameRequest request, @HeaderParam("Accept") String accept,
            Context context);

        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<DatasetListResponse>> getDatasetsByWorkspaceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("endpoint") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Lists datasets.
     * 
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of dataset resources along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DatasetResource>> getDatasetsByWorkspaceSinglePageAsync() {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.getDatasetsByWorkspace(this.client.getEndpoint(), apiVersion, accept, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * Lists datasets.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of dataset resources along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DatasetResource>> getDatasetsByWorkspaceSinglePageAsync(Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.getDatasetsByWorkspace(this.client.getEndpoint(), apiVersion, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * Lists datasets.
     * 
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of dataset resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DatasetResource> getDatasetsByWorkspaceAsync() {
        return new PagedFlux<>(() -> getDatasetsByWorkspaceSinglePageAsync(),
            nextLink -> getDatasetsByWorkspaceNextSinglePageAsync(nextLink));
    }

    /**
     * Lists datasets.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of dataset resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DatasetResource> getDatasetsByWorkspaceAsync(Context context) {
        return new PagedFlux<>(() -> getDatasetsByWorkspaceSinglePageAsync(context),
            nextLink -> getDatasetsByWorkspaceNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists datasets.
     * 
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of dataset resources along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<DatasetResource> getDatasetsByWorkspaceSinglePage() {
        return getDatasetsByWorkspaceSinglePageAsync().block();
    }

    /**
     * Lists datasets.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of dataset resources along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<DatasetResource> getDatasetsByWorkspaceSinglePage(Context context) {
        return getDatasetsByWorkspaceSinglePageAsync(context).block();
    }

    /**
     * Lists datasets.
     * 
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of dataset resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DatasetResource> getDatasetsByWorkspace() {
        return new PagedIterable<>(getDatasetsByWorkspaceAsync());
    }

    /**
     * Lists datasets.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of dataset resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DatasetResource> getDatasetsByWorkspace(Context context) {
        return new PagedIterable<>(getDatasetsByWorkspaceAsync(context));
    }

    /**
     * Creates or updates a dataset.
     * 
     * @param datasetName The dataset name.
     * @param dataset Dataset resource definition.
     * @param ifMatch ETag of the dataset entity. Should only be specified for update, for which it should match
     * existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dataset resource type along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatasetResource>> createOrUpdateDatasetWithResponseAsync(String datasetName,
        DatasetResource dataset, String ifMatch) {
        return FluxUtil
            .withContext(context -> createOrUpdateDatasetWithResponseAsync(datasetName, dataset, ifMatch, context));
    }

    /**
     * Creates or updates a dataset.
     * 
     * @param datasetName The dataset name.
     * @param dataset Dataset resource definition.
     * @param ifMatch ETag of the dataset entity. Should only be specified for update, for which it should match
     * existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dataset resource type along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatasetResource>> createOrUpdateDatasetWithResponseAsync(String datasetName,
        DatasetResource dataset, String ifMatch, Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.createOrUpdateDataset(this.client.getEndpoint(), datasetName, apiVersion, ifMatch, dataset,
            accept, context);
    }

    /**
     * Creates or updates a dataset.
     * 
     * @param datasetName The dataset name.
     * @param dataset Dataset resource definition.
     * @param ifMatch ETag of the dataset entity. Should only be specified for update, for which it should match
     * existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dataset resource type on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatasetResource> createOrUpdateDatasetAsync(String datasetName, DatasetResource dataset,
        String ifMatch) {
        return createOrUpdateDatasetWithResponseAsync(datasetName, dataset, ifMatch)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Creates or updates a dataset.
     * 
     * @param datasetName The dataset name.
     * @param dataset Dataset resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dataset resource type on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatasetResource> createOrUpdateDatasetAsync(String datasetName, DatasetResource dataset) {
        final String ifMatch = null;
        return createOrUpdateDatasetWithResponseAsync(datasetName, dataset, ifMatch)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Creates or updates a dataset.
     * 
     * @param datasetName The dataset name.
     * @param dataset Dataset resource definition.
     * @param ifMatch ETag of the dataset entity. Should only be specified for update, for which it should match
     * existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dataset resource type on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatasetResource> createOrUpdateDatasetAsync(String datasetName, DatasetResource dataset, String ifMatch,
        Context context) {
        return createOrUpdateDatasetWithResponseAsync(datasetName, dataset, ifMatch, context)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Creates or updates a dataset.
     * 
     * @param datasetName The dataset name.
     * @param dataset Dataset resource definition.
     * @param ifMatch ETag of the dataset entity. Should only be specified for update, for which it should match
     * existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dataset resource type along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DatasetResource> createOrUpdateDatasetWithResponse(String datasetName, DatasetResource dataset,
        String ifMatch, Context context) {
        return createOrUpdateDatasetWithResponseAsync(datasetName, dataset, ifMatch, context).block();
    }

    /**
     * Creates or updates a dataset.
     * 
     * @param datasetName The dataset name.
     * @param dataset Dataset resource definition.
     * @param ifMatch ETag of the dataset entity. Should only be specified for update, for which it should match
     * existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dataset resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatasetResource createOrUpdateDataset(String datasetName, DatasetResource dataset, String ifMatch) {
        return createOrUpdateDatasetWithResponse(datasetName, dataset, ifMatch, Context.NONE).getValue();
    }

    /**
     * Creates or updates a dataset.
     * 
     * @param datasetName The dataset name.
     * @param dataset Dataset resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dataset resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatasetResource createOrUpdateDataset(String datasetName, DatasetResource dataset) {
        final String ifMatch = null;
        return createOrUpdateDatasetWithResponse(datasetName, dataset, ifMatch, Context.NONE).getValue();
    }

    /**
     * Gets a dataset.
     * 
     * @param datasetName The dataset name.
     * @param ifNoneMatch ETag of the dataset entity. Should only be specified for get. If the ETag matches the existing
     * entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dataset along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatasetResource>> getDatasetWithResponseAsync(String datasetName, String ifNoneMatch) {
        return FluxUtil.withContext(context -> getDatasetWithResponseAsync(datasetName, ifNoneMatch, context));
    }

    /**
     * Gets a dataset.
     * 
     * @param datasetName The dataset name.
     * @param ifNoneMatch ETag of the dataset entity. Should only be specified for get. If the ETag matches the existing
     * entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dataset along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatasetResource>> getDatasetWithResponseAsync(String datasetName, String ifNoneMatch,
        Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.getDataset(this.client.getEndpoint(), datasetName, apiVersion, ifNoneMatch, accept, context);
    }

    /**
     * Gets a dataset.
     * 
     * @param datasetName The dataset name.
     * @param ifNoneMatch ETag of the dataset entity. Should only be specified for get. If the ETag matches the existing
     * entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dataset on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatasetResource> getDatasetAsync(String datasetName, String ifNoneMatch) {
        return getDatasetWithResponseAsync(datasetName, ifNoneMatch).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a dataset.
     * 
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dataset on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatasetResource> getDatasetAsync(String datasetName) {
        final String ifNoneMatch = null;
        return getDatasetWithResponseAsync(datasetName, ifNoneMatch).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a dataset.
     * 
     * @param datasetName The dataset name.
     * @param ifNoneMatch ETag of the dataset entity. Should only be specified for get. If the ETag matches the existing
     * entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dataset on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatasetResource> getDatasetAsync(String datasetName, String ifNoneMatch, Context context) {
        return getDatasetWithResponseAsync(datasetName, ifNoneMatch, context)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a dataset.
     * 
     * @param datasetName The dataset name.
     * @param ifNoneMatch ETag of the dataset entity. Should only be specified for get. If the ETag matches the existing
     * entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dataset along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DatasetResource> getDatasetWithResponse(String datasetName, String ifNoneMatch, Context context) {
        return getDatasetWithResponseAsync(datasetName, ifNoneMatch, context).block();
    }

    /**
     * Gets a dataset.
     * 
     * @param datasetName The dataset name.
     * @param ifNoneMatch ETag of the dataset entity. Should only be specified for get. If the ETag matches the existing
     * entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dataset.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatasetResource getDataset(String datasetName, String ifNoneMatch) {
        return getDatasetWithResponse(datasetName, ifNoneMatch, Context.NONE).getValue();
    }

    /**
     * Gets a dataset.
     * 
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dataset.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatasetResource getDataset(String datasetName) {
        final String ifNoneMatch = null;
        return getDatasetWithResponse(datasetName, ifNoneMatch, Context.NONE).getValue();
    }

    /**
     * Deletes a dataset.
     * 
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteDatasetWithResponseAsync(String datasetName) {
        return FluxUtil.withContext(context -> deleteDatasetWithResponseAsync(datasetName, context));
    }

    /**
     * Deletes a dataset.
     * 
     * @param datasetName The dataset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteDatasetWithResponseAsync(String datasetName, Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.deleteDataset(this.client.getEndpoint(), datasetName, apiVersion, accept, context);
    }

    /**
     * Deletes a dataset.
     * 
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteDatasetAsync(String datasetName) {
        return deleteDatasetWithResponseAsync(datasetName).flatMap(ignored -> Mono.empty());
    }

    /**
     * Deletes a dataset.
     * 
     * @param datasetName The dataset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteDatasetAsync(String datasetName, Context context) {
        return deleteDatasetWithResponseAsync(datasetName, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Deletes a dataset.
     * 
     * @param datasetName The dataset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteDatasetWithResponse(String datasetName, Context context) {
        return deleteDatasetWithResponseAsync(datasetName, context).block();
    }

    /**
     * Deletes a dataset.
     * 
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteDataset(String datasetName) {
        deleteDatasetWithResponse(datasetName, Context.NONE);
    }

    /**
     * Renames a dataset.
     * 
     * @param datasetName The dataset name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> renameDatasetWithResponseAsync(String datasetName, ArtifactRenameRequest request) {
        return FluxUtil.withContext(context -> renameDatasetWithResponseAsync(datasetName, request, context));
    }

    /**
     * Renames a dataset.
     * 
     * @param datasetName The dataset name.
     * @param request proposed new name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> renameDatasetWithResponseAsync(String datasetName, ArtifactRenameRequest request,
        Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.renameDataset(this.client.getEndpoint(), datasetName, apiVersion, request, accept, context);
    }

    /**
     * Renames a dataset.
     * 
     * @param datasetName The dataset name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> renameDatasetAsync(String datasetName, ArtifactRenameRequest request) {
        return renameDatasetWithResponseAsync(datasetName, request).flatMap(ignored -> Mono.empty());
    }

    /**
     * Renames a dataset.
     * 
     * @param datasetName The dataset name.
     * @param request proposed new name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> renameDatasetAsync(String datasetName, ArtifactRenameRequest request, Context context) {
        return renameDatasetWithResponseAsync(datasetName, request, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Renames a dataset.
     * 
     * @param datasetName The dataset name.
     * @param request proposed new name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renameDatasetWithResponse(String datasetName, ArtifactRenameRequest request,
        Context context) {
        return renameDatasetWithResponseAsync(datasetName, request, context).block();
    }

    /**
     * Renames a dataset.
     * 
     * @param datasetName The dataset name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void renameDataset(String datasetName, ArtifactRenameRequest request) {
        renameDatasetWithResponse(datasetName, request, Context.NONE);
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of dataset resources along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DatasetResource>> getDatasetsByWorkspaceNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.getDatasetsByWorkspaceNext(nextLink, this.client.getEndpoint(), accept, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of dataset resources along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DatasetResource>> getDatasetsByWorkspaceNextSinglePageAsync(String nextLink,
        Context context) {
        final String accept = "application/json";
        return service.getDatasetsByWorkspaceNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of dataset resources along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<DatasetResource> getDatasetsByWorkspaceNextSinglePage(String nextLink) {
        return getDatasetsByWorkspaceNextSinglePageAsync(nextLink).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of dataset resources along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PagedResponse<DatasetResource> getDatasetsByWorkspaceNextSinglePage(String nextLink, Context context) {
        return getDatasetsByWorkspaceNextSinglePageAsync(nextLink, context).block();
    }
}
