// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cognitiveservices.fluent.NetworkSecurityPerimeterConfigurationsClient;
import com.azure.resourcemanager.cognitiveservices.fluent.models.NetworkSecurityPerimeterConfigurationInner;
import com.azure.resourcemanager.cognitiveservices.models.NetworkSecurityPerimeterConfiguration;
import com.azure.resourcemanager.cognitiveservices.models.NetworkSecurityPerimeterConfigurations;

public final class NetworkSecurityPerimeterConfigurationsImpl implements NetworkSecurityPerimeterConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkSecurityPerimeterConfigurationsImpl.class);

    private final NetworkSecurityPerimeterConfigurationsClient innerClient;

    private final com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager;

    public NetworkSecurityPerimeterConfigurationsImpl(NetworkSecurityPerimeterConfigurationsClient innerClient,
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<NetworkSecurityPerimeterConfiguration> list(String resourceGroupName, String accountName) {
        PagedIterable<NetworkSecurityPerimeterConfigurationInner> inner
            = this.serviceClient().list(resourceGroupName, accountName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new NetworkSecurityPerimeterConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkSecurityPerimeterConfiguration> list(String resourceGroupName, String accountName,
        Context context) {
        PagedIterable<NetworkSecurityPerimeterConfigurationInner> inner
            = this.serviceClient().list(resourceGroupName, accountName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new NetworkSecurityPerimeterConfigurationImpl(inner1, this.manager()));
    }

    public Response<NetworkSecurityPerimeterConfiguration> getWithResponse(String resourceGroupName, String accountName,
        String nspConfigurationName, Context context) {
        Response<NetworkSecurityPerimeterConfigurationInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, accountName, nspConfigurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NetworkSecurityPerimeterConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkSecurityPerimeterConfiguration get(String resourceGroupName, String accountName,
        String nspConfigurationName) {
        NetworkSecurityPerimeterConfigurationInner inner
            = this.serviceClient().get(resourceGroupName, accountName, nspConfigurationName);
        if (inner != null) {
            return new NetworkSecurityPerimeterConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NetworkSecurityPerimeterConfiguration reconcile(String resourceGroupName, String accountName,
        String nspConfigurationName) {
        NetworkSecurityPerimeterConfigurationInner inner
            = this.serviceClient().reconcile(resourceGroupName, accountName, nspConfigurationName);
        if (inner != null) {
            return new NetworkSecurityPerimeterConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NetworkSecurityPerimeterConfiguration reconcile(String resourceGroupName, String accountName,
        String nspConfigurationName, Context context) {
        NetworkSecurityPerimeterConfigurationInner inner
            = this.serviceClient().reconcile(resourceGroupName, accountName, nspConfigurationName, context);
        if (inner != null) {
            return new NetworkSecurityPerimeterConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private NetworkSecurityPerimeterConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager() {
        return this.serviceManager;
    }
}
