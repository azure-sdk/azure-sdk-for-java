# Release History

## 1.0.0-beta.1 (2024-11-25)

- Azure Resource Manager Chaos client library for Java. This package contains Microsoft Azure SDK for Chaos Management SDK. Chaos Management Client. Package tag package-2025-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.ResourceIdentity` was removed

#### `models.ResourceIdentityType` was removed

#### `models.OperationStatus` was removed

#### `models.TargetType` was modified

* `location()` was removed

#### `models.Experiments` was modified

* `void start(java.lang.String,java.lang.String)` -> `models.PostActionResult start(java.lang.String,java.lang.String)`
* `void cancel(java.lang.String,java.lang.String,com.azure.core.util.Context)` -> `models.PostActionResult cancel(java.lang.String,java.lang.String,com.azure.core.util.Context)`
* `void start(java.lang.String,java.lang.String,com.azure.core.util.Context)` -> `models.PostActionResult start(java.lang.String,java.lang.String,com.azure.core.util.Context)`
* `void cancel(java.lang.String,java.lang.String)` -> `models.PostActionResult cancel(java.lang.String,java.lang.String)`

#### `models.CapabilityType` was modified

* `location()` was removed

#### `models.Experiment$Definition` was modified

* `withIdentity(models.ResourceIdentity)` was removed

#### `models.Experiment` was modified

* `void start()` -> `models.PostActionResult start()`
* `void cancel(com.azure.core.util.Context)` -> `models.PostActionResult cancel(com.azure.core.util.Context)`
* `models.ResourceIdentity identity()` -> `models.ManagedServiceIdentity identity()`
* `void start(com.azure.core.util.Context)` -> `models.PostActionResult start(com.azure.core.util.Context)`
* `void cancel()` -> `models.PostActionResult cancel()`

#### `models.ChaosTargetSelector` was modified

* `withAdditionalProperties(java.util.Map)` was removed
* `additionalProperties()` was removed

#### `models.ExperimentUpdate` was modified

* `models.ResourceIdentity identity()` -> `models.ManagedServiceIdentity identity()`
* `withIdentity(models.ResourceIdentity)` was removed

#### `models.Experiment$Update` was modified

* `withIdentity(models.ResourceIdentity)` was removed

#### `models.OperationStatuses` was modified

* `models.OperationStatus get(java.lang.String,java.lang.String)` -> `models.OperationStatusResult get(java.lang.String,java.lang.String)`

### Features Added

* `models.ExperimentActionType` was added

* `models.ManagedServiceIdentityType` was added

* `models.PostActionResult` was added

* `models.OperationStatusResult` was added

* `models.ManagedServiceIdentity` was added

#### `models.TargetListResult` was modified

* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ChaosTargetListSelector` was modified

* `type()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationDisplay` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ChaosTargetSimpleFilterParameters` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UserAssignedIdentity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DelayAction` was modified

* `type()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CapabilityTypeListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ChaosTargetQuerySelector` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added

#### `models.ExperimentExecutionDetailsPropertiesRunInformation` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.StepStatus` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ContinuousAction` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added

#### `models.CapabilityTypePropertiesRuntimeProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExperimentExecutionActionTargetDetailsError` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExperimentListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExperimentExecutionListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withValue(java.util.List)` was added
* `withNextLink(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExperimentExecution` was modified

* `systemData()` was added

#### `models.ChaosExperimentBranch` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.KeyValuePair` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ChaosTargetFilter` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ChaosTargetSimpleFilter` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added

#### `models.Experiment$Definition` was modified

* `withIdentity(models.ManagedServiceIdentity)` was added

#### `models.ChaosExperimentStep` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ChaosExperimentAction` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added

#### `models.BranchStatus` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TargetTypeListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added

#### `models.DiscreteAction` was modified

* `type()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ActionStatus` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ChaosTargetSelector` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CapabilityListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExperimentExecutionActionTargetDetailsProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExperimentUpdate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TargetReference` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Experiment$Update` was modified

* `withIdentity(models.ManagedServiceIdentity)` was added

## 1.1.0 (2024-03-15)

- Azure Resource Manager Chaos client library for Java. This package contains Microsoft Azure SDK for Chaos Management SDK. Chaos Management Client. Package tag package-2024-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.ExperimentUpdate` was modified

* `tags()` was added
* `withTags(java.util.Map)` was added

#### `models.Experiment$Update` was modified

* `withTags(java.util.Map)` was added

## 1.0.0 (2023-11-16)

- Azure Resource Manager Chaos client library for Java. This package contains Microsoft Azure SDK for Chaos Management SDK. Chaos Management Client. Package tag package-2023-11. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.ExperimentStatusListResult` was removed

* `models.Selector` was removed

* `models.SimpleFilter` was removed

* `models.Action` was removed

* `models.ExperimentCancelOperationResult` was removed

* `models.ExperimentExecutionDetailsListResult` was removed

* `models.Filter` was removed

* `models.Branch` was removed

* `models.QuerySelector` was removed

* `models.SimpleFilterParameters` was removed

* `models.Step` was removed

* `models.ExperimentStatus` was removed

* `models.ListSelector` was removed

* `models.ExperimentStartOperationResult` was removed

#### `models.ExperimentExecutionDetails` was modified

* `stopDateTime()` was removed
* `experimentId()` was removed
* `lastActionDateTime()` was removed
* `createdDateTime()` was removed
* `startDateTime()` was removed

#### `models.DelayAction` was modified

* `models.Action withName(java.lang.String)` -> `models.ChaosExperimentAction withName(java.lang.String)`

#### `models.ContinuousAction` was modified

* `models.Action withName(java.lang.String)` -> `models.ChaosExperimentAction withName(java.lang.String)`

#### `models.Experiments` was modified

* `getExecutionDetailsWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listAllStatuses(java.lang.String,java.lang.String)` was removed
* `models.ExperimentCancelOperationResult cancel(java.lang.String,java.lang.String)` -> `void cancel(java.lang.String,java.lang.String)`
* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listExecutionDetails(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `cancelWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getExecutionDetails(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listAllStatuses(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listExecutionDetails(java.lang.String,java.lang.String)` was removed
* `models.ExperimentStartOperationResult start(java.lang.String,java.lang.String)` -> `void start(java.lang.String,java.lang.String)`
* `com.azure.core.http.rest.Response deleteByIdWithResponse(java.lang.String,com.azure.core.util.Context)` -> `void deleteByIdWithResponse(java.lang.String,com.azure.core.util.Context)`
* `getStatusWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `startWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getStatus(java.lang.String,java.lang.String,java.lang.String)` was removed

#### `models.Experiment$Definition` was modified

* `withStartOnCreation(java.lang.Boolean)` was removed

#### `models.Experiment` was modified

* `startWithResponse(com.azure.core.util.Context)` was removed
* `models.ExperimentStartOperationResult start()` -> `void start()`
* `models.ExperimentCancelOperationResult cancel()` -> `void cancel()`
* `cancelWithResponse(com.azure.core.util.Context)` was removed
* `startOnCreation()` was removed

#### `models.DiscreteAction` was modified

* `models.Action withName(java.lang.String)` -> `models.ChaosExperimentAction withName(java.lang.String)`

### Features Added

* `models.ChaosTargetListSelector` was added

* `models.ChaosTargetSimpleFilterParameters` was added

* `models.ChaosTargetQuerySelector` was added

* `models.ExperimentExecutionListResult` was added

* `models.ExperimentExecution` was added

* `models.ChaosExperimentBranch` was added

* `models.ChaosTargetFilter` was added

* `models.ChaosTargetSimpleFilter` was added

* `models.OperationStatus` was added

* `models.ChaosExperimentStep` was added

* `models.ProvisioningState` was added

* `models.ChaosExperimentAction` was added

* `models.ChaosTargetSelector` was added

* `models.OperationStatuses` was added

#### `models.ExperimentExecutionDetails` was modified

* `stoppedAt()` was added
* `startedAt()` was added
* `lastActionAt()` was added

#### `models.Experiments` was modified

* `executionDetails(java.lang.String,java.lang.String,java.lang.String)` was added
* `executionDetailsWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getExecution(java.lang.String,java.lang.String,java.lang.String)` was added
* `listAllExecutions(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `cancel(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `start(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getExecutionWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `delete(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `listAllExecutions(java.lang.String,java.lang.String)` was added

#### `models.Experiment` was modified

* `provisioningState()` was added
* `start(com.azure.core.util.Context)` was added
* `cancel(com.azure.core.util.Context)` was added

#### `ChaosManager` was modified

* `operationStatuses()` was added

## 1.0.0-beta.1 (2023-07-27)

- Azure Resource Manager Chaos client library for Java. This package contains Microsoft Azure SDK for Chaos Management SDK. Chaos Management Client. Package tag package-2023-04-15-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
