// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.fluent.ApplicationsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ApplicationInner;
import com.azure.resourcemanager.desktopvirtualization.models.Application;
import com.azure.resourcemanager.desktopvirtualization.models.Applications;

public final class ApplicationsImpl implements Applications {
    private static final ClientLogger LOGGER = new ClientLogger(ApplicationsImpl.class);

    private final ApplicationsClient innerClient;

    private final com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager;

    public ApplicationsImpl(ApplicationsClient innerClient,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Application> getWithResponse(String resourceGroupName, String applicationGroupName,
        String applicationName, Context context) {
        Response<ApplicationInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, applicationGroupName, applicationName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ApplicationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Application get(String resourceGroupName, String applicationGroupName, String applicationName) {
        ApplicationInner inner = this.serviceClient().get(resourceGroupName, applicationGroupName, applicationName);
        if (inner != null) {
            return new ApplicationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String applicationGroupName,
        String applicationName, Context context) {
        return this.serviceClient()
            .deleteWithResponse(resourceGroupName, applicationGroupName, applicationName, context);
    }

    public void delete(String resourceGroupName, String applicationGroupName, String applicationName) {
        this.serviceClient().delete(resourceGroupName, applicationGroupName, applicationName);
    }

    public PagedIterable<Application> list(String resourceGroupName, String applicationGroupName) {
        PagedIterable<ApplicationInner> inner = this.serviceClient().list(resourceGroupName, applicationGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ApplicationImpl(inner1, this.manager()));
    }

    public PagedIterable<Application> list(String resourceGroupName, String applicationGroupName, Integer pageSize,
        Boolean isDescending, Integer initialSkip, Context context) {
        PagedIterable<ApplicationInner> inner = this.serviceClient()
            .list(resourceGroupName, applicationGroupName, pageSize, isDescending, initialSkip, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ApplicationImpl(inner1, this.manager()));
    }

    public Application getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String applicationGroupName = ResourceManagerUtils.getValueFromIdByName(id, "applicationGroups");
        if (applicationGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applicationGroups'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        return this.getWithResponse(resourceGroupName, applicationGroupName, applicationName, Context.NONE).getValue();
    }

    public Response<Application> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String applicationGroupName = ResourceManagerUtils.getValueFromIdByName(id, "applicationGroups");
        if (applicationGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applicationGroups'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        return this.getWithResponse(resourceGroupName, applicationGroupName, applicationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String applicationGroupName = ResourceManagerUtils.getValueFromIdByName(id, "applicationGroups");
        if (applicationGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applicationGroups'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, applicationGroupName, applicationName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String applicationGroupName = ResourceManagerUtils.getValueFromIdByName(id, "applicationGroups");
        if (applicationGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applicationGroups'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, applicationGroupName, applicationName, context);
    }

    private ApplicationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }

    public ApplicationImpl define(String name) {
        return new ApplicationImpl(name, this.manager());
    }
}
