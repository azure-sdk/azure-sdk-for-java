// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkTapRulesClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.CommonPostActionResponseForStateUpdateInner;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkTapRuleInner;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.ValidateConfigurationResponseInner;
import com.azure.resourcemanager.managednetworkfabric.models.CommonPostActionResponseForStateUpdate;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRule;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRules;
import com.azure.resourcemanager.managednetworkfabric.models.UpdateAdministrativeState;
import com.azure.resourcemanager.managednetworkfabric.models.ValidateConfigurationResponse;

public final class NetworkTapRulesImpl implements NetworkTapRules {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkTapRulesImpl.class);

    private final NetworkTapRulesClient innerClient;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public NetworkTapRulesImpl(NetworkTapRulesClient innerClient,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<NetworkTapRule> getByResourceGroupWithResponse(String resourceGroupName, String networkTapRuleName,
        Context context) {
        Response<NetworkTapRuleInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, networkTapRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NetworkTapRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkTapRule getByResourceGroup(String resourceGroupName, String networkTapRuleName) {
        NetworkTapRuleInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, networkTapRuleName);
        if (inner != null) {
            return new NetworkTapRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String networkTapRuleName) {
        this.serviceClient().delete(resourceGroupName, networkTapRuleName);
    }

    public void delete(String resourceGroupName, String networkTapRuleName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkTapRuleName, context);
    }

    public PagedIterable<NetworkTapRule> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetworkTapRuleInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NetworkTapRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkTapRule> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<NetworkTapRuleInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NetworkTapRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkTapRule> list() {
        PagedIterable<NetworkTapRuleInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NetworkTapRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkTapRule> list(Context context) {
        PagedIterable<NetworkTapRuleInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NetworkTapRuleImpl(inner1, this.manager()));
    }

    public CommonPostActionResponseForStateUpdate updateAdministrativeState(String resourceGroupName,
        String networkTapRuleName, UpdateAdministrativeState body) {
        CommonPostActionResponseForStateUpdateInner inner
            = this.serviceClient().updateAdministrativeState(resourceGroupName, networkTapRuleName, body);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CommonPostActionResponseForStateUpdate updateAdministrativeState(String resourceGroupName,
        String networkTapRuleName, UpdateAdministrativeState body, Context context) {
        CommonPostActionResponseForStateUpdateInner inner
            = this.serviceClient().updateAdministrativeState(resourceGroupName, networkTapRuleName, body, context);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CommonPostActionResponseForStateUpdate resync(String resourceGroupName, String networkTapRuleName) {
        CommonPostActionResponseForStateUpdateInner inner
            = this.serviceClient().resync(resourceGroupName, networkTapRuleName);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CommonPostActionResponseForStateUpdate resync(String resourceGroupName, String networkTapRuleName,
        Context context) {
        CommonPostActionResponseForStateUpdateInner inner
            = this.serviceClient().resync(resourceGroupName, networkTapRuleName, context);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ValidateConfigurationResponse validateConfiguration(String resourceGroupName, String networkTapRuleName) {
        ValidateConfigurationResponseInner inner
            = this.serviceClient().validateConfiguration(resourceGroupName, networkTapRuleName);
        if (inner != null) {
            return new ValidateConfigurationResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ValidateConfigurationResponse validateConfiguration(String resourceGroupName, String networkTapRuleName,
        Context context) {
        ValidateConfigurationResponseInner inner
            = this.serviceClient().validateConfiguration(resourceGroupName, networkTapRuleName, context);
        if (inner != null) {
            return new ValidateConfigurationResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NetworkTapRule getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkTapRuleName = ResourceManagerUtils.getValueFromIdByName(id, "networkTapRules");
        if (networkTapRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkTapRules'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkTapRuleName, Context.NONE).getValue();
    }

    public Response<NetworkTapRule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkTapRuleName = ResourceManagerUtils.getValueFromIdByName(id, "networkTapRules");
        if (networkTapRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkTapRules'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkTapRuleName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkTapRuleName = ResourceManagerUtils.getValueFromIdByName(id, "networkTapRules");
        if (networkTapRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkTapRules'.", id)));
        }
        this.delete(resourceGroupName, networkTapRuleName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkTapRuleName = ResourceManagerUtils.getValueFromIdByName(id, "networkTapRules");
        if (networkTapRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkTapRules'.", id)));
        }
        this.delete(resourceGroupName, networkTapRuleName, context);
    }

    private NetworkTapRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    public NetworkTapRuleImpl define(String name) {
        return new NetworkTapRuleImpl(name, this.manager());
    }
}
