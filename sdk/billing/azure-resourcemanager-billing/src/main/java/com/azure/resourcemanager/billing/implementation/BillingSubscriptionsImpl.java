// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.BillingSubscriptionsClient;
import com.azure.resourcemanager.billing.fluent.models.BillingSubscriptionInner;
import com.azure.resourcemanager.billing.fluent.models.ValidateSubscriptionTransferEligibilityResultInner;
import com.azure.resourcemanager.billing.models.BillingSubscription;
import com.azure.resourcemanager.billing.models.BillingSubscriptions;
import com.azure.resourcemanager.billing.models.TransferBillingSubscriptionRequestProperties;
import com.azure.resourcemanager.billing.models.ValidateSubscriptionTransferEligibilityResult;

public final class BillingSubscriptionsImpl implements BillingSubscriptions {
    private static final ClientLogger LOGGER = new ClientLogger(BillingSubscriptionsImpl.class);

    private final BillingSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    public BillingSubscriptionsImpl(
        BillingSubscriptionsClient innerClient, com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BillingSubscription> listByCustomer(String billingAccountName, String customerName) {
        PagedIterable<BillingSubscriptionInner> inner =
            this.serviceClient().listByCustomer(billingAccountName, customerName);
        return Utils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByCustomer(
        String billingAccountName, String customerName, Context context) {
        PagedIterable<BillingSubscriptionInner> inner =
            this.serviceClient().listByCustomer(billingAccountName, customerName, context);
        return Utils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByBillingAccount(String billingAccountName) {
        PagedIterable<BillingSubscriptionInner> inner = this.serviceClient().listByBillingAccount(billingAccountName);
        return Utils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByBillingAccount(String billingAccountName, Context context) {
        PagedIterable<BillingSubscriptionInner> inner =
            this.serviceClient().listByBillingAccount(billingAccountName, context);
        return Utils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByBillingProfile(
        String billingAccountName, String billingProfileName) {
        PagedIterable<BillingSubscriptionInner> inner =
            this.serviceClient().listByBillingProfile(billingAccountName, billingProfileName);
        return Utils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByBillingProfile(
        String billingAccountName, String billingProfileName, Context context) {
        PagedIterable<BillingSubscriptionInner> inner =
            this.serviceClient().listByBillingProfile(billingAccountName, billingProfileName, context);
        return Utils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByInvoiceSection(
        String billingAccountName, String billingProfileName, String invoiceSectionName) {
        PagedIterable<BillingSubscriptionInner> inner =
            this.serviceClient().listByInvoiceSection(billingAccountName, billingProfileName, invoiceSectionName);
        return Utils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingSubscription> listByInvoiceSection(
        String billingAccountName, String billingProfileName, String invoiceSectionName, Context context) {
        PagedIterable<BillingSubscriptionInner> inner =
            this
                .serviceClient()
                .listByInvoiceSection(billingAccountName, billingProfileName, invoiceSectionName, context);
        return Utils.mapPage(inner, inner1 -> new BillingSubscriptionImpl(inner1, this.manager()));
    }

    public Response<BillingSubscription> getWithResponse(String billingAccountName, Context context) {
        Response<BillingSubscriptionInner> inner = this.serviceClient().getWithResponse(billingAccountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BillingSubscriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BillingSubscription get(String billingAccountName) {
        BillingSubscriptionInner inner = this.serviceClient().get(billingAccountName);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BillingSubscription> updateWithResponse(
        String billingAccountName, BillingSubscriptionInner parameters, Context context) {
        Response<BillingSubscriptionInner> inner =
            this.serviceClient().updateWithResponse(billingAccountName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BillingSubscriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BillingSubscription update(String billingAccountName, BillingSubscriptionInner parameters) {
        BillingSubscriptionInner inner = this.serviceClient().update(billingAccountName, parameters);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BillingSubscription move(
        String billingAccountName, TransferBillingSubscriptionRequestProperties parameters) {
        BillingSubscriptionInner inner = this.serviceClient().move(billingAccountName, parameters);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BillingSubscription move(
        String billingAccountName, TransferBillingSubscriptionRequestProperties parameters, Context context) {
        BillingSubscriptionInner inner = this.serviceClient().move(billingAccountName, parameters, context);
        if (inner != null) {
            return new BillingSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ValidateSubscriptionTransferEligibilityResult> validateMoveWithResponse(
        String billingAccountName, TransferBillingSubscriptionRequestProperties parameters, Context context) {
        Response<ValidateSubscriptionTransferEligibilityResultInner> inner =
            this.serviceClient().validateMoveWithResponse(billingAccountName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ValidateSubscriptionTransferEligibilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ValidateSubscriptionTransferEligibilityResult validateMove(
        String billingAccountName, TransferBillingSubscriptionRequestProperties parameters) {
        ValidateSubscriptionTransferEligibilityResultInner inner =
            this.serviceClient().validateMove(billingAccountName, parameters);
        if (inner != null) {
            return new ValidateSubscriptionTransferEligibilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private BillingSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
