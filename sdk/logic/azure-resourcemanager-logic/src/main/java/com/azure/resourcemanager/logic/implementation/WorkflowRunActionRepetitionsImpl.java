// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.WorkflowRunActionRepetitionsClient;
import com.azure.resourcemanager.logic.fluent.models.WorkflowRunActionRepetitionDefinitionInner;
import com.azure.resourcemanager.logic.models.ExpressionRoot;
import com.azure.resourcemanager.logic.models.WorkflowRunActionRepetitionDefinition;
import com.azure.resourcemanager.logic.models.WorkflowRunActionRepetitions;

public final class WorkflowRunActionRepetitionsImpl implements WorkflowRunActionRepetitions {
    private static final ClientLogger LOGGER = new ClientLogger(WorkflowRunActionRepetitionsImpl.class);

    private final WorkflowRunActionRepetitionsClient innerClient;

    private final com.azure.resourcemanager.logic.LogicManager serviceManager;

    public WorkflowRunActionRepetitionsImpl(WorkflowRunActionRepetitionsClient innerClient,
        com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<WorkflowRunActionRepetitionDefinition> list(String resourceGroupName, String workflowName,
        String runName, String actionName) {
        PagedIterable<WorkflowRunActionRepetitionDefinitionInner> inner
            = this.serviceClient().list(resourceGroupName, workflowName, runName, actionName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new WorkflowRunActionRepetitionDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkflowRunActionRepetitionDefinition> list(String resourceGroupName, String workflowName,
        String runName, String actionName, Context context) {
        PagedIterable<WorkflowRunActionRepetitionDefinitionInner> inner
            = this.serviceClient().list(resourceGroupName, workflowName, runName, actionName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new WorkflowRunActionRepetitionDefinitionImpl(inner1, this.manager()));
    }

    public Response<WorkflowRunActionRepetitionDefinition> getWithResponse(String resourceGroupName,
        String workflowName, String runName, String actionName, String repetitionName, Context context) {
        Response<WorkflowRunActionRepetitionDefinitionInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, workflowName, runName, actionName, repetitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WorkflowRunActionRepetitionDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WorkflowRunActionRepetitionDefinition get(String resourceGroupName, String workflowName, String runName,
        String actionName, String repetitionName) {
        WorkflowRunActionRepetitionDefinitionInner inner
            = this.serviceClient().get(resourceGroupName, workflowName, runName, actionName, repetitionName);
        if (inner != null) {
            return new WorkflowRunActionRepetitionDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ExpressionRoot> listExpressionTraces(String resourceGroupName, String workflowName,
        String runName, String actionName, String repetitionName) {
        return this.serviceClient()
            .listExpressionTraces(resourceGroupName, workflowName, runName, actionName, repetitionName);
    }

    public PagedIterable<ExpressionRoot> listExpressionTraces(String resourceGroupName, String workflowName,
        String runName, String actionName, String repetitionName, Context context) {
        return this.serviceClient()
            .listExpressionTraces(resourceGroupName, workflowName, runName, actionName, repetitionName, context);
    }

    private WorkflowRunActionRepetitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.logic.LogicManager manager() {
        return this.serviceManager;
    }
}
