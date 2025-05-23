// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.programmableconnectivity.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.programmableconnectivity.fluent.OperatorApiPlansClient;
import com.azure.resourcemanager.programmableconnectivity.fluent.models.OperatorApiPlanInner;
import com.azure.resourcemanager.programmableconnectivity.models.OperatorApiPlan;
import com.azure.resourcemanager.programmableconnectivity.models.OperatorApiPlans;

public final class OperatorApiPlansImpl implements OperatorApiPlans {
    private static final ClientLogger LOGGER = new ClientLogger(OperatorApiPlansImpl.class);

    private final OperatorApiPlansClient innerClient;

    private final com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager serviceManager;

    public OperatorApiPlansImpl(OperatorApiPlansClient innerClient,
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<OperatorApiPlan> getWithResponse(String operatorApiPlanName, Context context) {
        Response<OperatorApiPlanInner> inner = this.serviceClient().getWithResponse(operatorApiPlanName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new OperatorApiPlanImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OperatorApiPlan get(String operatorApiPlanName) {
        OperatorApiPlanInner inner = this.serviceClient().get(operatorApiPlanName);
        if (inner != null) {
            return new OperatorApiPlanImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<OperatorApiPlan> list() {
        PagedIterable<OperatorApiPlanInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OperatorApiPlanImpl(inner1, this.manager()));
    }

    public PagedIterable<OperatorApiPlan> list(String filter, Integer top, Integer skip, Context context) {
        PagedIterable<OperatorApiPlanInner> inner = this.serviceClient().list(filter, top, skip, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OperatorApiPlanImpl(inner1, this.manager()));
    }

    private OperatorApiPlansClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager() {
        return this.serviceManager;
    }
}
