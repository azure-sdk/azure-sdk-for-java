# Release History

## 1.1.0-beta.3 (2025-05-12)

- Azure Resource Manager Maintenance client library for Java. This package contains Microsoft Azure SDK for Maintenance Management SDK. Azure Maintenance Management Client. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.OperationInfo` was removed

#### `models.ScheduledEvents` was removed

#### `models.Updates` was removed

#### `models.MaintenanceConfigurationsForResourceGroups` was removed

#### `models.PublicMaintenanceConfigurations` was removed

#### `models.ListMaintenanceConfigurationsResult` was removed

#### `models.ListApplyUpdate` was removed

#### `models.OperationsListResult` was removed

#### `models.ConfigurationAssignmentsWithinSubscriptions` was removed

#### `models.ApplyUpdateForResourceGroups` was removed

#### `models.ListConfigurationAssignmentsResult` was removed

#### `models.ListUpdatesResult` was removed

#### `models.MaintenanceConfigurations` was modified

* `define(java.lang.String)` was removed
* `getByResourceGroup(java.lang.String,java.lang.String)` was removed
* `deleteById(java.lang.String)` was removed
* `deleteByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `deleteByResourceGroup(java.lang.String,java.lang.String)` was removed
* `getByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `getById(java.lang.String)` was removed
* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.ConfigurationAssignments` was modified

* `delete(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was removed
* `list(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was removed
* `deleteWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `get(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was removed
* `createOrUpdate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,fluent.models.ConfigurationAssignmentInner)` was removed
* `createOrUpdateWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,fluent.models.ConfigurationAssignmentInner,com.azure.core.util.Context)` was removed
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `list(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.Operation` was modified

* `java.lang.String origin()` -> `models.Origin origin()`
* `properties()` was removed
* `models.OperationInfo display()` -> `models.OperationDisplay display()`

#### `models.Update` was modified

* `resourceId()` was removed

#### `MaintenanceManager` was modified

* `maintenanceConfigurationsForResourceGroups()` was removed
* `publicMaintenanceConfigurations()` was removed
* `configurationAssignmentsWithinSubscriptions()` was removed
* `fluent.MaintenanceManagementClient serviceClient()` -> `fluent.MaintenanceClient serviceClient()`
* `applyUpdateForResourceGroups()` was removed
* `updates()` was removed
* `scheduledEvents()` was removed

#### `models.ApplyUpdates` was modified

* `createOrUpdateParentWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `createOrUpdateWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `createOrUpdateOrCancel(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,fluent.models.ApplyUpdateInner)` was removed
* `list()` was removed
* `createOrUpdateParent(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was removed
* `createOrUpdate(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was removed
* `get(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was removed
* `createOrUpdateOrCancelWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,fluent.models.ApplyUpdateInner,com.azure.core.util.Context)` was removed
* `list(com.azure.core.util.Context)` was removed

### Features Added

* `models.ApplyUpdatesOperationGroups` was added

* `models.ApplyUpdatesOperationGroupsCreateOrUpdateHeaders` was added

* `models.MaintenanceConfigurationOperationGroups` was added

* `implementation.models.ListUpdatesResult` was added

* `models.ApplyUpdatesOperationGroupsCreateOrUpdateParentHeaders` was added

* `models.OperationDisplay` was added

* `models.ApplyUpdateOperationGroups` was added

* `models.UpdatesOperationGroups` was added

* `models.ActionType` was added

* `implementation.models.ListMaintenanceConfigurationsResult` was added

* `implementation.models.ListConfigurationAssignmentsResult` was added

* `models.ConfigurationAssignmentOperationGroups` was added

* `implementation.models.OperationsListResult` was added

* `models.ApplyUpdatesOperationGroupsCreateOrUpdateParentResponse` was added

* `models.UpdateProperties` was added

* `models.ApplyUpdatesOperationGroupsCreateOrUpdateResponse` was added

* `models.ScheduledEventOperationGroups` was added

* `models.ApplyUpdateForResourceGroupOperationGroups` was added

* `models.ConfigurationAssignmentForResourceGroupOperationGroups` was added

* `implementation.models.ListApplyUpdate` was added

* `models.Origin` was added

#### `models.MaintenanceConfigurations` was modified

* `getWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `get(java.lang.String)` was added

#### `models.Operation` was modified

* `actionType()` was added

#### `models.Update` was modified

* `properties()` was added

#### `models.ConfigurationAssignmentsForSubscriptions` was modified

* `list()` was added
* `list(com.azure.core.util.Context)` was added

#### `MaintenanceManager` was modified

* `applyUpdateOperationGroups()` was added
* `applyUpdateForResourceGroupOperationGroups()` was added
* `updatesOperationGroups()` was added
* `scheduledEventOperationGroups()` was added
* `configurationAssignmentForResourceGroupOperationGroups()` was added
* `configurationAssignmentOperationGroups()` was added
* `maintenanceConfigurationOperationGroups()` was added
* `applyUpdatesOperationGroups()` was added

## 1.1.0-beta.2 (2024-12-04)

- Azure Resource Manager Maintenance client library for Java. This package contains Microsoft Azure SDK for Maintenance Management SDK. Azure Maintenance Management Client. Package tag package-preview-2023-10. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### Serialization/Deserialization change

- `Jackson` is removed from dependency and no longer supported.

##### Migration Guide

If you are using `Jackson`/`ObjectMapper` for manual serialization/deserialization, configure your `ObjectMapper` for backward compatibility:
```java
objectMapper.registerModule(com.azure.core.serializer.json.jackson.JacksonJsonProvider.getJsonSerializableDatabindModule());
```

## 1.1.0-beta.1 (2024-05-20)

- Azure Resource Manager Maintenance client library for Java. This package contains Microsoft Azure SDK for Maintenance Management SDK. Azure Maintenance Management Client. Package tag package-preview-2023-10. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.ScheduledEventApproveResponse` was added

* `models.ScheduledEvents` was added

#### `MaintenanceManager` was modified

* `scheduledEvents()` was added

#### `models.ApplyUpdates` was modified

* `createOrUpdateOrCancelWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,fluent.models.ApplyUpdateInner,com.azure.core.util.Context)` was added
* `createOrUpdateOrCancel(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,fluent.models.ApplyUpdateInner)` was added

## 1.0.0 (2023-08-22)

- Azure Resource Manager Maintenance client library for Java. This package contains Microsoft Azure SDK for Maintenance Management SDK. Azure Maintenance Management Client. Package tag package-2023-04. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.TagOperators` was added

* `models.ConfigurationAssignment$DefinitionStages` was added

* `models.InputPatchConfiguration` was added

* `models.TagSettingsProperties` was added

* `models.ConfigurationAssignment$Update` was added

* `models.ConfigurationAssignmentsWithinSubscriptions` was added

* `models.ConfigurationAssignmentFilterProperties` was added

* `models.ConfigurationAssignment$UpdateStages` was added

* `models.RebootOptions` was added

* `models.ConfigurationAssignmentsForResourceGroups` was added

* `models.ConfigurationAssignmentsForSubscriptions` was added

* `models.InputLinuxParameters` was added

* `models.ConfigurationAssignment$Definition` was added

* `models.InputWindowsParameters` was added

#### `models.MaintenanceConfiguration$Definition` was modified

* `withInstallPatches(models.InputPatchConfiguration)` was added

#### `models.ConfigurationAssignments` was modified

* `getParent(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was added
* `getParentWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `get(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was added
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `MaintenanceManager` was modified

* `configurationAssignmentsForResourceGroups()` was added
* `configurationAssignmentsForSubscriptions()` was added
* `configurationAssignmentsWithinSubscriptions()` was added

#### `models.ConfigurationAssignment` was modified

* `filter()` was added
* `refresh(com.azure.core.util.Context)` was added
* `regionName()` was added
* `refresh()` was added
* `region()` was added
* `update()` was added

#### `models.MaintenanceConfiguration` was modified

* `installPatches()` was added

#### `models.MaintenanceConfiguration$Update` was modified

* `withInstallPatches(models.InputPatchConfiguration)` was added

## 1.0.0-beta.3 (2023-01-18)

- Azure Resource Manager Maintenance client library for Java. This package contains Microsoft Azure SDK for Maintenance Management SDK. Azure Maintenance Management Client. Package tag package-2021-05. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.MaintenanceConfigurations` was modified

* `deleteWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

### Features Added

#### `models.MaintenanceConfigurations` was modified

* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `MaintenanceManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

#### `MaintenanceManager$Configurable` was modified

* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added
* `withScope(java.lang.String)` was added

#### `models.MaintenanceConfiguration` was modified

* `resourceGroupName()` was added

## 1.0.0-beta.2 (2021-05-13)

- Azure Resource Manager Maintenance client library for Java. This package contains Microsoft Azure SDK for Maintenance Management SDK. Azure Maintenance Management Client. Package tag package-2021-05. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Change

#### `MaintenanceManager` was modified

* `fluent.MaintenanceClient serviceClient()` -> `fluent.MaintenanceManagementClient serviceClient()`

### New Feature

* `models.PublicMaintenanceConfigurations` was added

* `models.ListApplyUpdate` was added

* `models.Visibility` was added

* `models.ApplyUpdateForResourceGroups` was added

* `models.MaintenanceConfigurationsForResourceGroups` was added

#### `models.ApplyUpdate` was modified

* `systemData()` was added

#### `models.MaintenanceConfiguration$Definition` was modified

* `withTimeZone(java.lang.String)` was added
* `withVisibility(models.Visibility)` was added
* `withDuration(java.lang.String)` was added
* `withRecurEvery(java.lang.String)` was added
* `withExpirationDateTime(java.lang.String)` was added
* `withStartDateTime(java.lang.String)` was added

#### `MaintenanceManager` was modified

* `maintenanceConfigurationsForResourceGroups()` was added
* `publicMaintenanceConfigurations()` was added
* `applyUpdateForResourceGroups()` was added

#### `models.ConfigurationAssignment` was modified

* `systemData()` was added

#### `models.Operation` was modified

* `isDataAction()` was added

#### `models.ApplyUpdates` was modified

* `list()` was added
* `list(com.azure.core.util.Context)` was added

#### `models.MaintenanceConfiguration` was modified

* `expirationDateTime()` was added
* `timeZone()` was added
* `duration()` was added
* `systemData()` was added
* `visibility()` was added
* `recurEvery()` was added
* `startDateTime()` was added

#### `models.MaintenanceConfiguration$Update` was modified

* `withDuration(java.lang.String)` was added
* `withRecurEvery(java.lang.String)` was added
* `withStartDateTime(java.lang.String)` was added
* `withExpirationDateTime(java.lang.String)` was added
* `withVisibility(models.Visibility)` was added
* `withTimeZone(java.lang.String)` was added

## 1.0.0-beta.1 (2021-04-16)

- Azure Resource Manager Maintenance client library for Java. This package contains Microsoft Azure SDK for Maintenance Management SDK. Maintenance Client. Package tag package-2020-04. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
