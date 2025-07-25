// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.ServicesClient;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.ServiceResourceInner;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ServiceResource;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.Services;

public final class ServicesImpl implements Services {
    private static final ClientLogger LOGGER = new ClientLogger(ServicesImpl.class);

    private final ServicesClient innerClient;

    private final com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager;

    public ServicesImpl(ServicesClient innerClient,
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ServiceResource> getWithResponse(String resourceGroupName, String clusterName,
        String applicationName, String serviceName, Context context) {
        Response<ServiceResourceInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, clusterName, applicationName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ServiceResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServiceResource get(String resourceGroupName, String clusterName, String applicationName,
        String serviceName) {
        ServiceResourceInner inner
            = this.serviceClient().get(resourceGroupName, clusterName, applicationName, serviceName);
        if (inner != null) {
            return new ServiceResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String applicationName, String serviceName) {
        this.serviceClient().delete(resourceGroupName, clusterName, applicationName, serviceName);
    }

    public void delete(String resourceGroupName, String clusterName, String applicationName, String serviceName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, applicationName, serviceName, context);
    }

    public PagedIterable<ServiceResource> listByApplications(String resourceGroupName, String clusterName,
        String applicationName) {
        PagedIterable<ServiceResourceInner> inner
            = this.serviceClient().listByApplications(resourceGroupName, clusterName, applicationName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ServiceResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ServiceResource> listByApplications(String resourceGroupName, String clusterName,
        String applicationName, Context context) {
        PagedIterable<ServiceResourceInner> inner
            = this.serviceClient().listByApplications(resourceGroupName, clusterName, applicationName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ServiceResourceImpl(inner1, this.manager()));
    }

    public ServiceResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "managedClusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, applicationName, serviceName, Context.NONE)
            .getValue();
    }

    public Response<ServiceResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "managedClusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, applicationName, serviceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "managedClusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        this.delete(resourceGroupName, clusterName, applicationName, serviceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "managedClusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        this.delete(resourceGroupName, clusterName, applicationName, serviceName, context);
    }

    private ServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager manager() {
        return this.serviceManager;
    }

    public ServiceResourceImpl define(String name) {
        return new ServiceResourceImpl(name, this.manager());
    }
}
