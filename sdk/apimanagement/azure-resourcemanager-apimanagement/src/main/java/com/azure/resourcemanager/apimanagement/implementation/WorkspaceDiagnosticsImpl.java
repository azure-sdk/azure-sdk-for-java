// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.WorkspaceDiagnosticsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.DiagnosticContractInner;
import com.azure.resourcemanager.apimanagement.models.DiagnosticContract;
import com.azure.resourcemanager.apimanagement.models.DiagnosticUpdateContract;
import com.azure.resourcemanager.apimanagement.models.WorkspaceDiagnostics;
import com.azure.resourcemanager.apimanagement.models.WorkspaceDiagnosticsCreateOrUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.WorkspaceDiagnosticsGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.WorkspaceDiagnosticsGetResponse;
import com.azure.resourcemanager.apimanagement.models.WorkspaceDiagnosticsUpdateResponse;

public final class WorkspaceDiagnosticsImpl implements WorkspaceDiagnostics {
    private static final ClientLogger LOGGER = new ClientLogger(WorkspaceDiagnosticsImpl.class);

    private final WorkspaceDiagnosticsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public WorkspaceDiagnosticsImpl(WorkspaceDiagnosticsClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DiagnosticContract> listByWorkspace(String resourceGroupName, String serviceName,
        String workspaceId) {
        PagedIterable<DiagnosticContractInner> inner
            = this.serviceClient().listByWorkspace(resourceGroupName, serviceName, workspaceId);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DiagnosticContractImpl(inner1, this.manager()));
    }

    public PagedIterable<DiagnosticContract> listByWorkspace(String resourceGroupName, String serviceName,
        String workspaceId, String filter, Integer top, Integer skip, Context context) {
        PagedIterable<DiagnosticContractInner> inner = this.serviceClient()
            .listByWorkspace(resourceGroupName, serviceName, workspaceId, filter, top, skip, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DiagnosticContractImpl(inner1, this.manager()));
    }

    public WorkspaceDiagnosticsGetEntityTagResponse getEntityTagWithResponse(String resourceGroupName,
        String serviceName, String workspaceId, String diagnosticId, Context context) {
        return this.serviceClient()
            .getEntityTagWithResponse(resourceGroupName, serviceName, workspaceId, diagnosticId, context);
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String workspaceId, String diagnosticId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, workspaceId, diagnosticId);
    }

    public Response<DiagnosticContract> getWithResponse(String resourceGroupName, String serviceName,
        String workspaceId, String diagnosticId, Context context) {
        WorkspaceDiagnosticsGetResponse inner
            = this.serviceClient().getWithResponse(resourceGroupName, serviceName, workspaceId, diagnosticId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DiagnosticContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticContract get(String resourceGroupName, String serviceName, String workspaceId,
        String diagnosticId) {
        DiagnosticContractInner inner
            = this.serviceClient().get(resourceGroupName, serviceName, workspaceId, diagnosticId);
        if (inner != null) {
            return new DiagnosticContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticContract> createOrUpdateWithResponse(String resourceGroupName, String serviceName,
        String workspaceId, String diagnosticId, DiagnosticContractInner parameters, String ifMatch, Context context) {
        WorkspaceDiagnosticsCreateOrUpdateResponse inner = this.serviceClient()
            .createOrUpdateWithResponse(resourceGroupName, serviceName, workspaceId, diagnosticId, parameters, ifMatch,
                context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DiagnosticContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticContract createOrUpdate(String resourceGroupName, String serviceName, String workspaceId,
        String diagnosticId, DiagnosticContractInner parameters) {
        DiagnosticContractInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, serviceName, workspaceId, diagnosticId, parameters);
        if (inner != null) {
            return new DiagnosticContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticContract> updateWithResponse(String resourceGroupName, String serviceName,
        String workspaceId, String diagnosticId, String ifMatch, DiagnosticUpdateContract parameters, Context context) {
        WorkspaceDiagnosticsUpdateResponse inner = this.serviceClient()
            .updateWithResponse(resourceGroupName, serviceName, workspaceId, diagnosticId, ifMatch, parameters,
                context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DiagnosticContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticContract update(String resourceGroupName, String serviceName, String workspaceId,
        String diagnosticId, String ifMatch, DiagnosticUpdateContract parameters) {
        DiagnosticContractInner inner = this.serviceClient()
            .update(resourceGroupName, serviceName, workspaceId, diagnosticId, ifMatch, parameters);
        if (inner != null) {
            return new DiagnosticContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String workspaceId,
        String diagnosticId, String ifMatch, Context context) {
        return this.serviceClient()
            .deleteWithResponse(resourceGroupName, serviceName, workspaceId, diagnosticId, ifMatch, context);
    }

    public void delete(String resourceGroupName, String serviceName, String workspaceId, String diagnosticId,
        String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, workspaceId, diagnosticId, ifMatch);
    }

    private WorkspaceDiagnosticsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
