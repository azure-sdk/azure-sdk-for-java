// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.CheckNameAvailabilityResponseModelInner;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.CheckNameAvailabilityModel;

/**
 * An instance of this class provides access to all the operations defined in CheckNameAvailabilitiesClient.
 */
public interface CheckNameAvailabilitiesClient {
    /**
     * Performs the resource name availability check.
     * 
     * Checks the resource name availability.
     * 
     * @param location The name of the Azure region.
     * @param body Resource details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check name availability response model along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityResponseModelInner> postWithResponse(String location, CheckNameAvailabilityModel body,
        Context context);

    /**
     * Performs the resource name availability check.
     * 
     * Checks the resource name availability.
     * 
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check name availability response model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityResponseModelInner post(String location);
}
