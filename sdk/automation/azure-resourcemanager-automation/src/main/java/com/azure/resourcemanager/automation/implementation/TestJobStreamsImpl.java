// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.TestJobStreamsClient;
import com.azure.resourcemanager.automation.fluent.models.JobStreamInner;
import com.azure.resourcemanager.automation.models.JobStream;
import com.azure.resourcemanager.automation.models.TestJobStreams;

public final class TestJobStreamsImpl implements TestJobStreams {
    private static final ClientLogger LOGGER = new ClientLogger(TestJobStreamsImpl.class);

    private final TestJobStreamsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public TestJobStreamsImpl(TestJobStreamsClient innerClient,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<JobStream> getWithResponse(String resourceGroupName, String automationAccountName,
        String runbookName, String jobStreamId, Context context) {
        Response<JobStreamInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, automationAccountName, runbookName, jobStreamId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new JobStreamImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public JobStream get(String resourceGroupName, String automationAccountName, String runbookName,
        String jobStreamId) {
        JobStreamInner inner
            = this.serviceClient().get(resourceGroupName, automationAccountName, runbookName, jobStreamId);
        if (inner != null) {
            return new JobStreamImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<JobStream> listByTestJob(String resourceGroupName, String automationAccountName,
        String runbookName) {
        PagedIterable<JobStreamInner> inner
            = this.serviceClient().listByTestJob(resourceGroupName, automationAccountName, runbookName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new JobStreamImpl(inner1, this.manager()));
    }

    public PagedIterable<JobStream> listByTestJob(String resourceGroupName, String automationAccountName,
        String runbookName, String filter, Context context) {
        PagedIterable<JobStreamInner> inner = this.serviceClient()
            .listByTestJob(resourceGroupName, automationAccountName, runbookName, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new JobStreamImpl(inner1, this.manager()));
    }

    private TestJobStreamsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}
