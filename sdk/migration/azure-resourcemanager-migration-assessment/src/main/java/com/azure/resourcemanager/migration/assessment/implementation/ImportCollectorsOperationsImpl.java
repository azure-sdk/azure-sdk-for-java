// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.migration.assessment.fluent.ImportCollectorsOperationsClient;
import com.azure.resourcemanager.migration.assessment.fluent.models.ImportCollectorInner;
import com.azure.resourcemanager.migration.assessment.models.ImportCollector;
import com.azure.resourcemanager.migration.assessment.models.ImportCollectorsOperations;

public final class ImportCollectorsOperationsImpl implements ImportCollectorsOperations {
    private static final ClientLogger LOGGER = new ClientLogger(ImportCollectorsOperationsImpl.class);

    private final ImportCollectorsOperationsClient innerClient;

    private final com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager;

    public ImportCollectorsOperationsImpl(ImportCollectorsOperationsClient innerClient,
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ImportCollector> listByAssessmentProject(String resourceGroupName, String projectName) {
        PagedIterable<ImportCollectorInner> inner
            = this.serviceClient().listByAssessmentProject(resourceGroupName, projectName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ImportCollectorImpl(inner1, this.manager()));
    }

    public PagedIterable<ImportCollector> listByAssessmentProject(String resourceGroupName, String projectName,
        Context context) {
        PagedIterable<ImportCollectorInner> inner
            = this.serviceClient().listByAssessmentProject(resourceGroupName, projectName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ImportCollectorImpl(inner1, this.manager()));
    }

    public Response<ImportCollector> getWithResponse(String resourceGroupName, String projectName,
        String importCollectorName, Context context) {
        Response<ImportCollectorInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, projectName, importCollectorName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ImportCollectorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ImportCollector get(String resourceGroupName, String projectName, String importCollectorName) {
        ImportCollectorInner inner = this.serviceClient().get(resourceGroupName, projectName, importCollectorName);
        if (inner != null) {
            return new ImportCollectorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String projectName, String importCollectorName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, projectName, importCollectorName, context);
    }

    public void delete(String resourceGroupName, String projectName, String importCollectorName) {
        this.serviceClient().delete(resourceGroupName, projectName, importCollectorName);
    }

    public ImportCollector getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = ResourceManagerUtils.getValueFromIdByName(id, "assessmentProjects");
        if (projectName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'assessmentProjects'.", id)));
        }
        String importCollectorName = ResourceManagerUtils.getValueFromIdByName(id, "importcollectors");
        if (importCollectorName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'importcollectors'.", id)));
        }
        return this.getWithResponse(resourceGroupName, projectName, importCollectorName, Context.NONE).getValue();
    }

    public Response<ImportCollector> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = ResourceManagerUtils.getValueFromIdByName(id, "assessmentProjects");
        if (projectName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'assessmentProjects'.", id)));
        }
        String importCollectorName = ResourceManagerUtils.getValueFromIdByName(id, "importcollectors");
        if (importCollectorName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'importcollectors'.", id)));
        }
        return this.getWithResponse(resourceGroupName, projectName, importCollectorName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = ResourceManagerUtils.getValueFromIdByName(id, "assessmentProjects");
        if (projectName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'assessmentProjects'.", id)));
        }
        String importCollectorName = ResourceManagerUtils.getValueFromIdByName(id, "importcollectors");
        if (importCollectorName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'importcollectors'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, projectName, importCollectorName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = ResourceManagerUtils.getValueFromIdByName(id, "assessmentProjects");
        if (projectName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'assessmentProjects'.", id)));
        }
        String importCollectorName = ResourceManagerUtils.getValueFromIdByName(id, "importcollectors");
        if (importCollectorName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'importcollectors'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, projectName, importCollectorName, context);
    }

    private ImportCollectorsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager() {
        return this.serviceManager;
    }

    public ImportCollectorImpl define(String name) {
        return new ImportCollectorImpl(name, this.manager());
    }
}
