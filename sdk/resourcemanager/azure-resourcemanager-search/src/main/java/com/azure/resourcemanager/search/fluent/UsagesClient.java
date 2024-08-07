// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.search.fluent.models.QuotaUsageResultInner;
import java.util.UUID;

/**
 * An instance of this class provides access to all the operations defined in UsagesClient.
 */
public interface UsagesClient {
    /**
     * Gets a list of all Search quota usages in the given subscription.
     * 
     * @param location The unique location name for a Microsoft Azure geographic region.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Search quota usages in the given subscription as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<QuotaUsageResultInner> listBySubscriptionAsync(String location, UUID clientRequestId);

    /**
     * Gets a list of all Search quota usages in the given subscription.
     * 
     * @param location The unique location name for a Microsoft Azure geographic region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Search quota usages in the given subscription as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<QuotaUsageResultInner> listBySubscriptionAsync(String location);

    /**
     * Gets a list of all Search quota usages in the given subscription.
     * 
     * @param location The unique location name for a Microsoft Azure geographic region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Search quota usages in the given subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<QuotaUsageResultInner> listBySubscription(String location);

    /**
     * Gets a list of all Search quota usages in the given subscription.
     * 
     * @param location The unique location name for a Microsoft Azure geographic region.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Search quota usages in the given subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<QuotaUsageResultInner> listBySubscription(String location, UUID clientRequestId, Context context);
}
