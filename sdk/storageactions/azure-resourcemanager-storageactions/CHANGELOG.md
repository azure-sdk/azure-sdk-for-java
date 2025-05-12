# Release History

## 1.0.0-beta.4 (2025-05-09)

- Azure Resource Manager StorageActions client library for Java. This package contains Microsoft Azure SDK for StorageActions Management SDK. The Azure Storage Actions Management API. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.StorageTaskReportSummary` was removed

#### `models.StorageTasksReports` was removed

#### `models.StorageTaskPreviewActionProperties` was removed

#### `models.StorageTasksListResult` was removed

#### `models.StorageTaskAssignmentsListResult` was removed

#### `models.StorageTaskProperties` was removed

#### `models.OperationListResult` was removed

#### `models.StorageTaskAssignments` was removed

#### `models.StorageTask$DefinitionStages` was modified

* Required stage 5, 6 was added
* `withProperties(models.StorageTaskProperties)` was removed in stage 4

#### `models.StorageTask` was modified

* `properties()` was removed

#### `models.StorageTaskPreviewAction` was modified

* `properties()` was removed

#### `models.StorageTask$Definition` was modified

* `withProperties(models.StorageTaskProperties)` was removed

#### `models.StorageTasks` was modified

* `list(com.azure.core.util.Context)` was removed
* `previewActionsWithResponse(java.lang.String,fluent.models.StorageTaskPreviewActionInner,com.azure.core.util.Context)` was removed
* `list()` was removed
* `previewActions(java.lang.String,fluent.models.StorageTaskPreviewActionInner)` was removed

#### `models.StorageTask$Update` was modified

* `withProperties(models.StorageTaskProperties)` was removed

#### `models.StorageTaskUpdateParameters` was modified

* `withProperties(models.StorageTaskProperties)` was removed
* `properties()` was removed

#### `models.UserAssignedIdentity` was modified

* `java.util.UUID principalId()` -> `java.lang.String principalId()`
* `java.util.UUID clientId()` -> `java.lang.String clientId()`

#### `StorageActionsManager` was modified

* `fluent.StorageActionsMgmtClient serviceClient()` -> `fluent.StorageActionsClient serviceClient()`
* `storageTaskAssignments()` was removed
* `storageTasksReports()` was removed

#### `models.ManagedServiceIdentity` was modified

* `java.util.UUID tenantId()` -> `java.lang.String tenantId()`
* `java.util.UUID principalId()` -> `java.lang.String principalId()`

### Features Added

* `implementation.models.OperationListResult` was added

* `implementation.models.StorageTaskReportSummary` was added

* `implementation.models.StorageTasksListResult` was added

* `models.StorageTasksOperationGroups` was added

* `implementation.models.StorageTaskAssignmentsListResult` was added

#### `models.StorageTask` was modified

* `provisioningState()` was added
* `action()` was added
* `description()` was added
* `creationTimeInUtc()` was added
* `enabled()` was added
* `taskVersion()` was added

#### `models.StorageTaskPreviewAction` was modified

* `container()` was added
* `action()` was added
* `blobs()` was added

#### `models.StorageTask$Definition` was modified

* `withDescription(java.lang.String)` was added
* `withEnabled(boolean)` was added
* `withAction(models.StorageTaskAction)` was added

#### `models.StorageTasks` was modified

* `listBySubscription(com.azure.core.util.Context)` was added
* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,com.azure.core.util.Context)` was added
* `list(java.lang.String,java.lang.String)` was added
* `storageTaskAssignmentList(java.lang.String,java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was added
* `storageTaskAssignmentList(java.lang.String,java.lang.String)` was added
* `listBySubscription()` was added

#### `models.StorageTask$Update` was modified

* `withDescription(java.lang.String)` was added
* `withAction(models.StorageTaskAction)` was added
* `withEnabled(java.lang.Boolean)` was added

#### `models.StorageTaskUpdateParameters` was modified

* `provisioningState()` was added
* `creationTimeInUtc()` was added
* `enabled()` was added
* `withEnabled(java.lang.Boolean)` was added
* `action()` was added
* `taskVersion()` was added
* `description()` was added
* `withAction(models.StorageTaskAction)` was added
* `withDescription(java.lang.String)` was added

#### `StorageActionsManager` was modified

* `storageTasksOperationGroups()` was added

## 1.0.0-beta.3 (2025-04-18)

- Azure Resource Manager StorageActions client library for Java. This package contains Microsoft Azure SDK for StorageActions Management SDK. The Azure Storage Actions Management API. Package tag package-2023-01-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.ProvisioningState` was modified

* `models.ProvisioningState[] values()` -> `java.util.Collection values()`
* `valueOf(java.lang.String)` was removed
* `toString()` was removed

#### `models.OnFailure` was modified

* `valueOf(java.lang.String)` was removed
* `toString()` was removed
* `models.OnFailure[] values()` -> `java.util.Collection values()`

#### `models.OnSuccess` was modified

* `models.OnSuccess[] values()` -> `java.util.Collection values()`
* `toString()` was removed
* `valueOf(java.lang.String)` was removed

## 1.0.0-beta.2 (2024-12-03)

- Azure Resource Manager StorageActions client library for Java. This package contains Microsoft Azure SDK for StorageActions Management SDK. The Azure Storage Actions Management API. Package tag package-2023-01-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### Serialization/Deserialization change

- `Jackson` is removed from dependency and no longer supported.

##### Migration Guide

If you are using `Jackson`/`ObjectMapper` for manual serialization/deserialization, configure your `ObjectMapper` for backward compatibility:
```java
objectMapper.registerModule(com.azure.core.serializer.json.jackson.JacksonJsonProvider.getJsonSerializableDatabindModule());
```

#### `models.StorageTask$DefinitionStages` was modified

* Required stage 3, 4 was added

#### `models.StorageTasksReports` was modified

* `list(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.StorageTaskAssignments` was modified

* `list(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

### Features Added

#### `models.StorageTasksReports` was modified

* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,com.azure.core.util.Context)` was added

#### `models.StorageTaskAssignments` was modified

* `list(java.lang.String,java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was added

## 1.0.0-beta.1 (2024-03-21)

- Azure Resource Manager StorageActions client library for Java. This package contains Microsoft Azure SDK for StorageActions Management SDK. The Azure Storage Actions Management API. Package tag package-2023-01-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

