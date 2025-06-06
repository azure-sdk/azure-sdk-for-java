// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.ProtectedItemsClient;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.PlannedFailoverModelInner;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.ProtectedItemModelInner;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.PlannedFailoverModel;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.ProtectedItemModel;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.ProtectedItems;

public final class ProtectedItemsImpl implements ProtectedItems {
    private static final ClientLogger LOGGER = new ClientLogger(ProtectedItemsImpl.class);

    private final ProtectedItemsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager serviceManager;

    public ProtectedItemsImpl(ProtectedItemsClient innerClient,
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ProtectedItemModel> getWithResponse(String resourceGroupName, String vaultName,
        String protectedItemName, Context context) {
        Response<ProtectedItemModelInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, vaultName, protectedItemName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ProtectedItemModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ProtectedItemModel get(String resourceGroupName, String vaultName, String protectedItemName) {
        ProtectedItemModelInner inner = this.serviceClient().get(resourceGroupName, vaultName, protectedItemName);
        if (inner != null) {
            return new ProtectedItemModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String vaultName, String protectedItemName) {
        this.serviceClient().delete(resourceGroupName, vaultName, protectedItemName);
    }

    public void delete(String resourceGroupName, String vaultName, String protectedItemName, Boolean forceDelete,
        Context context) {
        this.serviceClient().delete(resourceGroupName, vaultName, protectedItemName, forceDelete, context);
    }

    public PagedIterable<ProtectedItemModel> list(String resourceGroupName, String vaultName) {
        PagedIterable<ProtectedItemModelInner> inner = this.serviceClient().list(resourceGroupName, vaultName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProtectedItemModelImpl(inner1, this.manager()));
    }

    public PagedIterable<ProtectedItemModel> list(String resourceGroupName, String vaultName, String odataOptions,
        String continuationToken, Integer pageSize, Context context) {
        PagedIterable<ProtectedItemModelInner> inner = this.serviceClient()
            .list(resourceGroupName, vaultName, odataOptions, continuationToken, pageSize, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProtectedItemModelImpl(inner1, this.manager()));
    }

    public PlannedFailoverModel plannedFailover(String resourceGroupName, String vaultName, String protectedItemName,
        PlannedFailoverModelInner body) {
        PlannedFailoverModelInner inner
            = this.serviceClient().plannedFailover(resourceGroupName, vaultName, protectedItemName, body);
        if (inner != null) {
            return new PlannedFailoverModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PlannedFailoverModel plannedFailover(String resourceGroupName, String vaultName, String protectedItemName,
        PlannedFailoverModelInner body, Context context) {
        PlannedFailoverModelInner inner
            = this.serviceClient().plannedFailover(resourceGroupName, vaultName, protectedItemName, body, context);
        if (inner != null) {
            return new PlannedFailoverModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ProtectedItemModel getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = ResourceManagerUtils.getValueFromIdByName(id, "replicationVaults");
        if (vaultName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'replicationVaults'.", id)));
        }
        String protectedItemName = ResourceManagerUtils.getValueFromIdByName(id, "protectedItems");
        if (protectedItemName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'protectedItems'.", id)));
        }
        return this.getWithResponse(resourceGroupName, vaultName, protectedItemName, Context.NONE).getValue();
    }

    public Response<ProtectedItemModel> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = ResourceManagerUtils.getValueFromIdByName(id, "replicationVaults");
        if (vaultName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'replicationVaults'.", id)));
        }
        String protectedItemName = ResourceManagerUtils.getValueFromIdByName(id, "protectedItems");
        if (protectedItemName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'protectedItems'.", id)));
        }
        return this.getWithResponse(resourceGroupName, vaultName, protectedItemName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = ResourceManagerUtils.getValueFromIdByName(id, "replicationVaults");
        if (vaultName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'replicationVaults'.", id)));
        }
        String protectedItemName = ResourceManagerUtils.getValueFromIdByName(id, "protectedItems");
        if (protectedItemName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'protectedItems'.", id)));
        }
        Boolean localForceDelete = null;
        this.delete(resourceGroupName, vaultName, protectedItemName, localForceDelete, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean forceDelete, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = ResourceManagerUtils.getValueFromIdByName(id, "replicationVaults");
        if (vaultName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'replicationVaults'.", id)));
        }
        String protectedItemName = ResourceManagerUtils.getValueFromIdByName(id, "protectedItems");
        if (protectedItemName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'protectedItems'.", id)));
        }
        this.delete(resourceGroupName, vaultName, protectedItemName, forceDelete, context);
    }

    private ProtectedItemsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager manager() {
        return this.serviceManager;
    }

    public ProtectedItemModelImpl define(String name) {
        return new ProtectedItemModelImpl(name, this.manager());
    }
}
