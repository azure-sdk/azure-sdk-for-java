// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.ReservationOrdersClient;
import com.azure.resourcemanager.billing.fluent.models.ReservationOrderInner;
import com.azure.resourcemanager.billing.models.ReservationOrder;
import com.azure.resourcemanager.billing.models.ReservationOrders;

public final class ReservationOrdersImpl implements ReservationOrders {
    private static final ClientLogger LOGGER = new ClientLogger(ReservationOrdersImpl.class);

    private final ReservationOrdersClient innerClient;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    public ReservationOrdersImpl(ReservationOrdersClient innerClient,
        com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ReservationOrder> getByBillingAccountWithResponse(String billingAccountName,
        String reservationOrderId, String expand, Context context) {
        Response<ReservationOrderInner> inner = this.serviceClient()
            .getByBillingAccountWithResponse(billingAccountName, reservationOrderId, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ReservationOrderImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ReservationOrder getByBillingAccount(String billingAccountName, String reservationOrderId) {
        ReservationOrderInner inner = this.serviceClient().getByBillingAccount(billingAccountName, reservationOrderId);
        if (inner != null) {
            return new ReservationOrderImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ReservationOrder> listByBillingAccount(String billingAccountName) {
        PagedIterable<ReservationOrderInner> inner = this.serviceClient().listByBillingAccount(billingAccountName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReservationOrderImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationOrder> listByBillingAccount(String billingAccountName, String filter,
        String orderBy, Float skiptoken, Context context) {
        PagedIterable<ReservationOrderInner> inner
            = this.serviceClient().listByBillingAccount(billingAccountName, filter, orderBy, skiptoken, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReservationOrderImpl(inner1, this.manager()));
    }

    private ReservationOrdersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
