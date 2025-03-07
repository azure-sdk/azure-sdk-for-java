// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.PolicyDescriptionsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyDescriptionCollectionInner;
import com.azure.resourcemanager.apimanagement.models.PolicyDescriptionCollection;
import com.azure.resourcemanager.apimanagement.models.PolicyDescriptions;
import com.azure.resourcemanager.apimanagement.models.PolicyScopeContract;

public final class PolicyDescriptionsImpl implements PolicyDescriptions {
    private static final ClientLogger LOGGER = new ClientLogger(PolicyDescriptionsImpl.class);

    private final PolicyDescriptionsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public PolicyDescriptionsImpl(PolicyDescriptionsClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<PolicyDescriptionCollection> listByServiceWithResponse(String resourceGroupName, String serviceName,
        PolicyScopeContract scope, Context context) {
        Response<PolicyDescriptionCollectionInner> inner
            = this.serviceClient().listByServiceWithResponse(resourceGroupName, serviceName, scope, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PolicyDescriptionCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicyDescriptionCollection listByService(String resourceGroupName, String serviceName) {
        PolicyDescriptionCollectionInner inner = this.serviceClient().listByService(resourceGroupName, serviceName);
        if (inner != null) {
            return new PolicyDescriptionCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private PolicyDescriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
