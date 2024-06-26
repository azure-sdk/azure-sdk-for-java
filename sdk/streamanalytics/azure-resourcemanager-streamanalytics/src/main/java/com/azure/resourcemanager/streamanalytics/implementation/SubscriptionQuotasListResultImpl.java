// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.implementation;

import com.azure.resourcemanager.streamanalytics.fluent.models.SubscriptionQuotasListResultInner;
import com.azure.resourcemanager.streamanalytics.models.SubscriptionQuota;
import com.azure.resourcemanager.streamanalytics.models.SubscriptionQuotasListResult;
import java.util.Collections;
import java.util.List;

public final class SubscriptionQuotasListResultImpl implements SubscriptionQuotasListResult {
    private SubscriptionQuotasListResultInner innerObject;

    private final com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager;

    SubscriptionQuotasListResultImpl(SubscriptionQuotasListResultInner innerObject,
        com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<SubscriptionQuota> value() {
        List<SubscriptionQuota> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SubscriptionQuotasListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager() {
        return this.serviceManager;
    }
}
