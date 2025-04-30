# Release History

## 1.0.0-beta.1 (2025-04-30)

- Azure Resource Manager computeschedule client library for Java. This package contains Microsoft Azure SDK for computeschedule Management SDK. Microsoft.ComputeSchedule Resource Provider management API. Package tag package-2025-05-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `ComputeScheduleManager$Configurable` was removed

#### `implementation.models.OperationListResult` was removed

#### `ComputeScheduleManager` was removed

#### `models.OperationErrorDetails` was modified

* `timeStamp()` was removed

#### `models.ResourceOperationDetails` was modified

* `timeZone()` was removed

#### `models.Schedule` was modified

* `withTimeZone(java.lang.String)` was removed
* `withDeadLine(java.time.OffsetDateTime)` was removed
* `timeZone()` was removed
* `deadLine()` was removed

### Features Added

* `models.ResourceProvisionPayload` was added

* `models.CreateResourceOperationResponse` was added

* `models.SubmitDeleteRequest` was added

* `models.OperationListResult` was added

* `ComputescheduleManager$Configurable` was added

* `models.ExecuteDeleteRequest` was added

* `models.ExecuteCreateRequest` was added

* `ComputescheduleManager` was added

* `models.DeleteResourceOperationResponse` was added

* `models.SubmitCreateRequest` was added

#### `models.OperationErrorsResult` was modified

* `withRequestErrorCode(java.lang.String)` was added
* `withCreationTime(java.time.OffsetDateTime)` was added
* `withActivationTime(java.time.OffsetDateTime)` was added
* `withOperationId(java.lang.String)` was added
* `withCompletedAt(java.time.OffsetDateTime)` was added
* `withOperationErrors(java.util.List)` was added
* `withRequestErrorDetails(java.lang.String)` was added

#### `models.OperationErrorDetails` was modified

* `withTimestamp(java.time.OffsetDateTime)` was added
* `withAzureOperationName(java.lang.String)` was added
* `withErrorCode(java.lang.String)` was added
* `errorDetailsTimestamp()` was added
* `withErrorDetailsTimestamp(java.time.OffsetDateTime)` was added
* `withCrpOperationId(java.lang.String)` was added
* `withErrorDetails(java.lang.String)` was added

#### `models.ScheduledActions` was modified

* `virtualMachinesExecuteDeleteWithResponse(java.lang.String,models.ExecuteDeleteRequest,com.azure.core.util.Context)` was added
* `virtualMachinesSubmitDeleteWithResponse(java.lang.String,models.SubmitDeleteRequest,com.azure.core.util.Context)` was added
* `virtualMachinesExecuteDelete(java.lang.String,models.ExecuteDeleteRequest)` was added
* `virtualMachinesExecuteCreateWithResponse(java.lang.String,models.ExecuteCreateRequest,com.azure.core.util.Context)` was added
* `virtualMachinesSubmitCreateWithResponse(java.lang.String,models.SubmitCreateRequest,com.azure.core.util.Context)` was added
* `virtualMachinesSubmitCreate(java.lang.String,models.SubmitCreateRequest)` was added
* `virtualMachinesExecuteCreate(java.lang.String,models.ExecuteCreateRequest)` was added
* `virtualMachinesSubmitDelete(java.lang.String,models.SubmitDeleteRequest)` was added

#### `models.ResourceOperationDetails` was modified

* `withOperationId(java.lang.String)` was added
* `withSubscriptionId(java.lang.String)` was added
* `withResourceOperationError(models.ResourceOperationError)` was added
* `operationTimezone()` was added
* `withResourceId(java.lang.String)` was added
* `withState(models.OperationState)` was added
* `withTimezone(java.lang.String)` was added
* `withDeadline(java.time.OffsetDateTime)` was added
* `withRetryPolicy(models.RetryPolicy)` was added
* `withOpType(models.ResourceOperationType)` was added
* `withOperationTimezone(java.lang.String)` was added
* `withDeadlineType(models.DeadlineType)` was added
* `withCompletedAt(java.time.OffsetDateTime)` was added

#### `models.ResourceOperationError` was modified

* `withErrorDetails(java.lang.String)` was added
* `withErrorCode(java.lang.String)` was added

#### `models.Schedule` was modified

* `scheduleDeadline()` was added
* `scheduleTimezone()` was added
* `withScheduleTimezone(java.lang.String)` was added
* `withScheduleDeadline(java.time.OffsetDateTime)` was added

#### `models.ResourceOperation` was modified

* `withErrorDetails(java.lang.String)` was added
* `withResourceId(java.lang.String)` was added
* `withErrorCode(java.lang.String)` was added
* `withOperation(models.ResourceOperationDetails)` was added

## 1.0.0 (2025-01-22)

- Azure Resource Manager Compute Schedule client library for Java. This package contains Microsoft Azure SDK for Compute Schedule Management SDK. Microsoft.ComputeSchedule Resource Provider management API. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.OperationErrorDetails` was modified

* `java.time.OffsetDateTime errorDetails()` -> `java.lang.String errorDetails()`

#### `ComputeScheduleManager` was modified

* `fluent.ComputeScheduleClient serviceClient()` -> `fluent.ComputeScheduleMgmtClient serviceClient()`

### Features Added

#### `models.OperationErrorDetails` was modified

* `azureOperationName()` was added
* `timestamp()` was added

#### `models.ResourceOperationDetails` was modified

* `timezone()` was added

#### `models.Schedule` was modified

* `timezone()` was added
* `withTimezone(java.lang.String)` was added
* `withDeadline(java.time.OffsetDateTime)` was added
* `deadline()` was added

## 1.0.0-beta.1 (2024-09-25)

- Azure Resource Manager Compute Schedule client library for Java. This package contains Microsoft Azure SDK for Compute Schedule Management SDK. Microsoft.ComputeSchedule Resource Provider management API. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

- Initial release for the azure-resourcemanager-computeschedule Java SDK.
