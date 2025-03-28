// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.migration.assessment.fluent.SqlCollectorOperationsClient;
import com.azure.resourcemanager.migration.assessment.fluent.models.SqlCollectorInner;
import com.azure.resourcemanager.migration.assessment.models.SqlCollector;
import com.azure.resourcemanager.migration.assessment.models.SqlCollectorOperations;

public final class SqlCollectorOperationsImpl implements SqlCollectorOperations {
    private static final ClientLogger LOGGER = new ClientLogger(SqlCollectorOperationsImpl.class);

    private final SqlCollectorOperationsClient innerClient;

    private final com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager;

    public SqlCollectorOperationsImpl(SqlCollectorOperationsClient innerClient,
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SqlCollector> listByAssessmentProject(String resourceGroupName, String projectName) {
        PagedIterable<SqlCollectorInner> inner
            = this.serviceClient().listByAssessmentProject(resourceGroupName, projectName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SqlCollectorImpl(inner1, this.manager()));
    }

    public PagedIterable<SqlCollector> listByAssessmentProject(String resourceGroupName, String projectName,
        Context context) {
        PagedIterable<SqlCollectorInner> inner
            = this.serviceClient().listByAssessmentProject(resourceGroupName, projectName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SqlCollectorImpl(inner1, this.manager()));
    }

    public Response<SqlCollector> getWithResponse(String resourceGroupName, String projectName, String collectorName,
        Context context) {
        Response<SqlCollectorInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, projectName, collectorName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SqlCollectorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SqlCollector get(String resourceGroupName, String projectName, String collectorName) {
        SqlCollectorInner inner = this.serviceClient().get(resourceGroupName, projectName, collectorName);
        if (inner != null) {
            return new SqlCollectorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String projectName, String collectorName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, projectName, collectorName, context);
    }

    public void delete(String resourceGroupName, String projectName, String collectorName) {
        this.serviceClient().delete(resourceGroupName, projectName, collectorName);
    }

    public SqlCollector getById(String id) {
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
        String collectorName = ResourceManagerUtils.getValueFromIdByName(id, "sqlcollectors");
        if (collectorName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sqlcollectors'.", id)));
        }
        return this.getWithResponse(resourceGroupName, projectName, collectorName, Context.NONE).getValue();
    }

    public Response<SqlCollector> getByIdWithResponse(String id, Context context) {
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
        String collectorName = ResourceManagerUtils.getValueFromIdByName(id, "sqlcollectors");
        if (collectorName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sqlcollectors'.", id)));
        }
        return this.getWithResponse(resourceGroupName, projectName, collectorName, context);
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
        String collectorName = ResourceManagerUtils.getValueFromIdByName(id, "sqlcollectors");
        if (collectorName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sqlcollectors'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, projectName, collectorName, Context.NONE);
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
        String collectorName = ResourceManagerUtils.getValueFromIdByName(id, "sqlcollectors");
        if (collectorName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'sqlcollectors'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, projectName, collectorName, context);
    }

    private SqlCollectorOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager() {
        return this.serviceManager;
    }

    public SqlCollectorImpl define(String name) {
        return new SqlCollectorImpl(name, this.manager());
    }
}
