# Release History

## 1.0.0-beta.1 (2025-03-11)

- Azure Resource Manager Logic client library for Java. This package contains Microsoft Azure SDK for Logic Management SDK. REST API for Azure Logic Apps. Package tag package-2019-05. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.ExtendedErrorInfo` was removed

#### `models.RequestHistoryProperties` was removed

#### `models.AS2AcknowledgementConnectionSettings` was removed

#### `models.IntegrationServiceEnvironmentNetworkDependencyHealth` was removed

#### `models.AS2ValidationSettings` was removed

#### `models.AS2MessageConnectionSettings` was removed

#### `models.AS2MdnSettings` was removed

#### `models.ApiOperationPropertiesDefinition` was removed

#### `models.IntegrationServiceEnvironmentSubnetNetworkHealth` was removed

#### `models.AS2EnvelopeSettings` was removed

#### `models.AS2SecuritySettings` was removed

#### `models.AS2AgreementContent` was removed

#### `models.IntegrationServiceEnvironmentManagedApiOperations` was removed

#### `models.AS2ErrorSettings` was removed

#### `models.AS2OneWayAgreement` was removed

#### `models.AssemblyProperties` was removed

#### `models.IntegrationServiceEnvironmentNetworkDependencyHealthState` was removed

#### `models.AS2ProtocolSettings` was removed

#### `models.ErrorResponseCode` was removed

#### `models.IntegrationServiceEnvironmentProperties` was removed

#### `models.BatchConfigurationProperties` was removed

#### `models.AssemblyDefinition$DefinitionStages` was modified

* `withProperties(models.AssemblyProperties)` was removed in stage 3

#### `models.IntegrationServiceEnvironmentManagedApi$DefinitionStages` was modified

* `withExistingIntegrationServiceEnvironment(java.lang.String,java.lang.String)` was removed in stage 2

#### `models.BatchConfiguration$DefinitionStages` was modified

* Required stage 4 was added
* `withProperties(models.BatchConfigurationProperties)` was removed in stage 3

#### `models.WorkflowVersion` was modified

* `java.lang.Object definition()` -> `java.util.Map definition()`

#### `models.RequestHistory` was modified

* `properties()` was removed

#### `models.AgreementContent` was modified

* `models.AS2AgreementContent aS2()` -> `models.As2AgreementContent aS2()`
* `withAS2(models.AS2AgreementContent)` was removed

#### `models.EdifactDecimalIndicator` was modified

* `toString()` was removed
* `valueOf(java.lang.String)` was removed
* `models.EdifactDecimalIndicator[] values()` -> `java.util.Collection values()`

#### `models.IntegrationAccountSchema` was modified

* `java.lang.Object metadata()` -> `java.util.Map metadata()`

#### `models.EventLevel` was modified

* `valueOf(java.lang.String)` was removed
* `toString()` was removed
* `models.EventLevel[] values()` -> `java.util.Collection values()`

#### `models.IntegrationAccountCertificate$Definition` was modified

* `withMetadata(java.lang.Object)` was removed

#### `models.UserAssignedIdentity` was modified

* `java.lang.String principalId()` -> `java.util.UUID principalId()`
* `java.lang.String clientId()` -> `java.util.UUID clientId()`

#### `models.Response` was modified

* `java.lang.Object headers()` -> `java.util.Map headers()`
* `withHeaders(java.lang.Object)` was removed

#### `models.ApiResourceMetadata` was modified

* `withProvisioningState(models.WorkflowProvisioningState)` was removed

#### `models.IntegrationServiceEnvironments` was modified

* `deleteByResourceGroup(java.lang.String,java.lang.String)` was removed
* `getByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getByResourceGroup(java.lang.String,java.lang.String)` was removed
* `restart(java.lang.String,java.lang.String)` was removed
* `restartWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.KeyVaultKeyCollection` was modified

* `java.lang.String skipToken()` -> `java.lang.String skipToken()`
* `withValue(java.util.List)` was removed
* `validate()` was removed
* `java.util.List value()` -> `java.util.List value()`
* `toJson(com.azure.json.JsonWriter)` was removed
* `withSkipToken(java.lang.String)` was removed
* `fromJson(com.azure.json.JsonReader)` was removed

#### `models.AssemblyCollection` was modified

* `validate()` was removed
* `java.util.List value()` -> `java.util.List value()`
* `toJson(com.azure.json.JsonWriter)` was removed
* `fromJson(com.azure.json.JsonReader)` was removed
* `withValue(java.util.List)` was removed

#### `models.WorkflowTriggers` was modified

* `runWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.WorkflowRunActionRepetitions` was modified

* `listExpressionTraces(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `list(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was removed
* `list(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `com.azure.core.http.rest.PagedIterable listExpressionTraces(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)` -> `models.ExpressionTraces listExpressionTraces(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

#### `models.WorkflowTriggerHistory` was modified

* `java.lang.Object error()` -> `java.util.Map error()`

#### `models.BatchConfiguration$Update` was modified

* `withProperties(models.BatchConfigurationProperties)` was removed

#### `models.IntegrationAccountCertificate$Update` was modified

* `withMetadata(java.lang.Object)` was removed

#### `models.IntegrationAccountAssemblies` was modified

* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `com.azure.core.http.rest.PagedIterable list(java.lang.String,java.lang.String)` -> `models.AssemblyCollection list(java.lang.String,java.lang.String)`

#### `models.WorkflowOutputParameter` was modified

* `java.lang.Object error()` -> `java.util.Map error()`
* `withValue(java.lang.Object)` was removed
* `withMetadata(java.lang.Object)` was removed

#### `models.IntegrationAccountBatchConfigurations` was modified

* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `com.azure.core.http.rest.PagedIterable list(java.lang.String,java.lang.String)` -> `models.BatchConfigurationCollection list(java.lang.String,java.lang.String)`

#### `models.WorkflowTriggerHistories` was modified

* `resubmitWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.DayOfWeek` was modified

* `valueOf(java.lang.String)` was removed
* `models.DayOfWeek[] values()` -> `java.util.Collection values()`
* `toString()` was removed

#### `models.ManagedServiceIdentity` was modified

* `java.util.UUID principalId()` -> `java.lang.String principalId()`
* `java.util.UUID tenantId()` -> `java.lang.String tenantId()`

#### `models.IntegrationAccountCertificate` was modified

* `java.lang.Object metadata()` -> `java.util.Map metadata()`

#### `models.IntegrationServiceEnvironment` was modified

* `resourceGroupName()` was removed
* `properties()` was removed

#### `models.IntegrationAccountAgreement$Update` was modified

* `withMetadata(java.lang.Object)` was removed

#### `models.WorkflowRunTrigger` was modified

* `java.lang.Object trackedProperties()` -> `java.util.Map trackedProperties()`
* `java.lang.Object inputs()` -> `java.util.Map inputs()`
* `java.lang.Object error()` -> `java.util.Map error()`
* `java.lang.Object outputs()` -> `java.util.Map outputs()`

#### `models.IntegrationAccount` was modified

* `com.azure.core.http.rest.PagedIterable listKeyVaultKeys(models.ListKeyVaultKeysDefinition)` -> `models.KeyVaultKeyCollection listKeyVaultKeys(models.ListKeyVaultKeysDefinition)`
* `listKeyVaultKeys(models.ListKeyVaultKeysDefinition,com.azure.core.util.Context)` was removed

#### `models.IntegrationServiceEnvironmentManagedApi$Definition` was modified

* `withExistingIntegrationServiceEnvironment(java.lang.String,java.lang.String)` was removed

#### `models.WorkflowParameter` was modified

* `java.lang.Object value()` -> `java.util.Map value()`
* `withValue(java.lang.Object)` was removed
* `withMetadata(java.lang.Object)` was removed
* `java.lang.Object metadata()` -> `java.util.Map metadata()`

#### `models.ApiResourceProperties` was modified

* `name()` was removed

#### `models.IntegrationAccounts` was modified

* `com.azure.core.http.rest.PagedIterable listKeyVaultKeys(java.lang.String,java.lang.String,models.ListKeyVaultKeysDefinition)` -> `models.KeyVaultKeyCollection listKeyVaultKeys(java.lang.String,java.lang.String,models.ListKeyVaultKeysDefinition)`
* `listKeyVaultKeys(java.lang.String,java.lang.String,models.ListKeyVaultKeysDefinition,com.azure.core.util.Context)` was removed

#### `models.WorkflowRun` was modified

* `java.lang.Object error()` -> `java.util.Map error()`

#### `models.WorkflowRunAction` was modified

* `java.lang.Object error()` -> `java.util.Map error()`
* `java.lang.Object trackedProperties()` -> `java.util.Map trackedProperties()`

#### `models.IntegrationAccountSession$Update` was modified

* `withContent(java.lang.Object)` was removed

#### `models.IntegrationAccountSchema$Update` was modified

* `withMetadata(java.lang.Object)` was removed

#### `models.IntegrationAccountPartner$Definition` was modified

* `withMetadata(java.lang.Object)` was removed

#### `models.Operation` was modified

* `properties()` was removed
* `java.lang.String origin()` -> `models.Origin origin()`

#### `models.IntegrationAccountMap$Definition` was modified

* `withMetadata(java.lang.Object)` was removed

#### `models.AssemblyDefinition$Update` was modified

* `withProperties(models.AssemblyProperties)` was removed

#### `models.IntegrationAccountAgreement$Definition` was modified

* `withMetadata(java.lang.Object)` was removed

#### `models.IntegrationAccountSession` was modified

* `java.lang.Object content()` -> `java.util.Map content()`

#### `models.WorkflowRunActionRepetitionDefinition` was modified

* `java.lang.Object inputs()` -> `java.util.Map inputs()`
* `java.lang.Object outputs()` -> `java.util.Map outputs()`
* `java.lang.Object trackedProperties()` -> `java.util.Map trackedProperties()`

#### `models.IntegrationServiceEnvironment$Definition` was modified

* `withProperties(models.IntegrationServiceEnvironmentProperties)` was removed
* `withExistingResourceGroup(java.lang.String)` was removed

#### `models.Workflow$Definition` was modified

* `withDefinition(java.lang.Object)` was removed

#### `models.DaysOfWeek` was modified

* `valueOf(java.lang.String)` was removed
* `toString()` was removed
* `models.DaysOfWeek[] values()` -> `java.util.Collection values()`

#### `models.IntegrationAccountPartner` was modified

* `java.lang.Object metadata()` -> `java.util.Map metadata()`

#### `models.Request` was modified

* `withHeaders(java.lang.Object)` was removed
* `java.lang.Object headers()` -> `java.util.Map headers()`

#### `models.WorkflowRuns` was modified

* `list(java.lang.String,java.lang.String)` was removed
* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.Workflow$Update` was modified

* `withDefinition(java.lang.Object)` was removed

#### `models.IntegrationAccountSession$Definition` was modified

* `withContent(java.lang.Object)` was removed

#### `models.ContentLink` was modified

* `java.lang.Object metadata()` -> `java.util.Map metadata()`

#### `models.Workflow` was modified

* `java.lang.Object generateUpgradedDefinition(models.GenerateUpgradedDefinitionParameters)` -> `java.util.Map generateUpgradedDefinition(models.GenerateUpgradedDefinitionParameters)`
* `java.lang.Object definition()` -> `java.util.Map definition()`
* `java.lang.Object listSwagger()` -> `java.util.Map listSwagger()`

#### `models.AgreementType` was modified

* `toString()` was removed
* `valueOf(java.lang.String)` was removed
* `models.AgreementType[] values()` -> `java.util.Collection values()`

#### `models.OperationResult` was modified

* `java.lang.Object outputs()` -> `java.util.Map outputs()`
* `java.lang.Object trackedProperties()` -> `java.util.Map trackedProperties()`
* `withStatus(models.WorkflowStatus)` was removed
* `java.lang.Object inputs()` -> `java.util.Map inputs()`

#### `models.IntegrationServiceEnvironment$Update` was modified

* `withProperties(models.IntegrationServiceEnvironmentProperties)` was removed

#### `models.IntegrationAccountMap` was modified

* `java.lang.Object metadata()` -> `java.util.Map metadata()`

#### `models.WorkflowRunActions` was modified

* `listExpressionTraces(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `com.azure.core.http.rest.PagedIterable listExpressionTraces(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` -> `models.ExpressionTraces listExpressionTraces(java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

#### `models.Workflows` was modified

* `java.lang.Object listSwagger(java.lang.String,java.lang.String)` -> `java.util.Map listSwagger(java.lang.String,java.lang.String)`
* `updateWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `update(java.lang.String,java.lang.String)` was removed
* `java.lang.Object generateUpgradedDefinition(java.lang.String,java.lang.String,models.GenerateUpgradedDefinitionParameters)` -> `java.util.Map generateUpgradedDefinition(java.lang.String,java.lang.String,models.GenerateUpgradedDefinitionParameters)`

#### `models.SegmentTerminatorSuffix` was modified

* `valueOf(java.lang.String)` was removed
* `models.SegmentTerminatorSuffix[] values()` -> `java.util.Collection values()`
* `toString()` was removed

#### `models.IntegrationAccountSchema$Definition` was modified

* `withMetadata(java.lang.Object)` was removed

#### `models.IntegrationServiceEnvironmentSkus` was modified

* `list(java.lang.String,java.lang.String)` was removed
* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `LogicManager` was modified

* `integrationServiceEnvironmentManagedApiOperations()` was removed

#### `models.IntegrationServiceEnvironmentNetworkHealths` was modified

* `getWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `get(java.lang.String,java.lang.String)` was removed

#### `models.SwaggerSchema` was modified

* `java.lang.Object additionalProperties()` -> `java.util.Map additionalProperties()`
* `withExample(java.lang.Object)` was removed
* `java.lang.Object example()` -> `java.util.Map example()`
* `withAdditionalProperties(java.lang.Object)` was removed

#### `models.ApiOperation` was modified

* `properties()` was removed
* `tags()` was removed
* `location()` was removed

#### `models.IntegrationAccountPartner$Update` was modified

* `withMetadata(java.lang.Object)` was removed

#### `models.TrackingEvent` was modified

* `java.lang.Object record()` -> `java.util.Map record()`
* `withRecord(java.lang.Object)` was removed

#### `models.BatchConfiguration$Definition` was modified

* `withProperties(models.BatchConfigurationProperties)` was removed

#### `models.BatchConfigurationCollection` was modified

* `withValue(java.util.List)` was removed
* `java.util.List value()` -> `java.util.List value()`
* `validate()` was removed
* `toJson(com.azure.json.JsonWriter)` was removed
* `fromJson(com.azure.json.JsonReader)` was removed

#### `models.ExpressionTraces` was modified

* `fromJson(com.azure.json.JsonReader)` was removed
* `java.util.List inputs()` -> `java.util.List inputs()`
* `withInputs(java.util.List)` was removed
* `validate()` was removed
* `toJson(com.azure.json.JsonWriter)` was removed

#### `models.IntegrationServiceEnvironmentManagedApis` was modified

* `delete(java.lang.String,java.lang.String,java.lang.String)` was removed
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `list(java.lang.String,java.lang.String)` was removed
* `delete(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `get(java.lang.String,java.lang.String,java.lang.String)` was removed
* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.IntegrationServiceEnvironmentManagedApi` was modified

* `resourceGroupName()` was removed
* `namePropertiesName()` was removed

#### `models.AssemblyDefinition` was modified

* `properties()` was removed

#### `models.OperationDisplay` was modified

* `withDescription(java.lang.String)` was removed
* `withResource(java.lang.String)` was removed
* `withProvider(java.lang.String)` was removed
* `withOperation(java.lang.String)` was removed

#### `models.SwaggerCustomDynamicTreeParameter` was modified

* `java.lang.Object value()` -> `java.util.Map value()`
* `withValue(java.lang.Object)` was removed

#### `models.AssemblyDefinition$Definition` was modified

* `withProperties(models.AssemblyProperties)` was removed

#### `models.OperationListResult` was modified

* `withValue(java.util.List)` was removed
* `withNextLink(java.lang.String)` was removed

#### `models.OperationResultProperties` was modified

* `models.OperationResultProperties withStatus(models.WorkflowStatus)` -> `models.OperationResultProperties withStatus(models.WorkflowStatus)`

#### `models.IntegrationAccountMap$Update` was modified

* `withMetadata(java.lang.Object)` was removed

#### `models.ApiReference` was modified

* `withSwagger(java.lang.Object)` was removed
* `java.lang.Object swagger()` -> `java.util.Map swagger()`

#### `models.IntegrationAccountAgreement` was modified

* `java.lang.Object metadata()` -> `java.util.Map metadata()`

#### `models.BatchConfiguration` was modified

* `properties()` was removed

#### `models.KeyVaultKey` was modified

* `innerModel()` was removed
* `java.lang.String kid()` -> `java.lang.String kid()`
* `models.KeyVaultKeyAttributes attributes()` -> `models.KeyVaultKeyAttributes attributes()`

### Features Added

* `models.IntegrationServiceEnvironmentNetworkHealth` was added

* `models.As2ProtocolSettings` was added

* `models.As2ValidationSettings` was added

* `models.ActionType` was added

* `models.As2MessageConnectionSettings` was added

* `models.As2MdnSettings` was added

* `models.As2AcknowledgementConnectionSettings` was added

* `models.ApiOperations` was added

* `models.As2ErrorSettings` was added

* `models.As2SecuritySettings` was added

* `models.As2EnvelopeSettings` was added

* `models.As2OneWayAgreement` was added

* `models.Origin` was added

* `models.As2AgreementContent` was added

#### `models.WorkflowVersion` was modified

* `systemData()` was added

#### `models.RequestHistory` was modified

* `response()` was added
* `endTime()` was added
* `startTime()` was added
* `systemData()` was added
* `request()` was added

#### `models.AgreementContent` was modified

* `withAS2(models.As2AgreementContent)` was added

#### `models.IntegrationAccountSchema` was modified

* `systemData()` was added

#### `models.IntegrationAccountCertificate$Definition` was modified

* `withMetadata(java.util.Map)` was added

#### `models.Response` was modified

* `withHeaders(java.util.Map)` was added

#### `models.IntegrationServiceEnvironments` was modified

* `get(java.lang.String)` was added
* `getWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `restart(java.lang.String)` was added
* `deleteWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `restartWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `delete(java.lang.String)` was added

#### `models.KeyVaultKeyCollection` was modified

* `innerModel()` was added

#### `models.AssemblyCollection` was modified

* `innerModel()` was added

#### `models.WorkflowTriggers` was modified

* `run(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.WorkflowRunActionRepetitions` was modified

* `listExpressionTracesWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.WorkflowTriggerHistory` was modified

* `systemData()` was added

#### `models.BatchConfiguration$Update` was modified

* `withCreatedTime(java.time.OffsetDateTime)` was added
* `withMetadata(java.lang.Object)` was added
* `withChangedTime(java.time.OffsetDateTime)` was added
* `withBatchGroupName(java.lang.String)` was added
* `withReleaseCriteria(models.BatchReleaseCriteria)` was added

#### `models.IntegrationAccountCertificate$Update` was modified

* `withMetadata(java.util.Map)` was added

#### `models.IntegrationAccountAssemblies` was modified

* `listWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.WorkflowOutputParameter` was modified

* `withValue(java.util.Map)` was added
* `withMetadata(java.util.Map)` was added

#### `models.IntegrationAccountBatchConfigurations` was modified

* `listWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.WorkflowTriggerHistories` was modified

* `resubmit(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.IntegrationAccountCertificate` was modified

* `systemData()` was added

#### `models.IntegrationServiceEnvironment` was modified

* `integrationServiceEnvironmentId()` was added
* `systemData()` was added
* `networkConfiguration()` was added
* `encryptionConfiguration()` was added
* `provisioningState()` was added
* `state()` was added
* `endpointsConfiguration()` was added

#### `models.IntegrationAccountAgreement$Update` was modified

* `withMetadata(java.util.Map)` was added

#### `models.IntegrationAccount` was modified

* `listKeyVaultKeysWithResponse(models.ListKeyVaultKeysDefinition,com.azure.core.util.Context)` was added
* `systemData()` was added

#### `models.IntegrationServiceEnvironmentManagedApi$Definition` was modified

* `withExistingIntegrationServiceEnvironment(java.lang.String)` was added

#### `models.WorkflowParameter` was modified

* `withValue(java.util.Map)` was added
* `withMetadata(java.util.Map)` was added

#### `models.IntegrationAccounts` was modified

* `listKeyVaultKeysWithResponse(java.lang.String,java.lang.String,models.ListKeyVaultKeysDefinition,com.azure.core.util.Context)` was added

#### `models.WorkflowRun` was modified

* `systemData()` was added

#### `models.WorkflowRunAction` was modified

* `systemData()` was added

#### `models.IntegrationAccountSession$Update` was modified

* `withContent(java.util.Map)` was added

#### `models.IntegrationAccountSchema$Update` was modified

* `withMetadata(java.util.Map)` was added

#### `models.IntegrationAccountPartner$Definition` was modified

* `withMetadata(java.util.Map)` was added

#### `models.Operation` was modified

* `isDataAction()` was added
* `actionType()` was added

#### `models.IntegrationAccountMap$Definition` was modified

* `withMetadata(java.util.Map)` was added

#### `models.AssemblyDefinition$Update` was modified

* `withContent(java.lang.Object)` was added
* `withContentLink(models.ContentLink)` was added
* `withChangedTime(java.time.OffsetDateTime)` was added
* `withAssemblyCulture(java.lang.String)` was added
* `withMetadata(java.lang.Object)` was added
* `withContentType(java.lang.String)` was added
* `withCreatedTime(java.time.OffsetDateTime)` was added
* `withAssemblyPublicKeyToken(java.lang.String)` was added
* `withAssemblyVersion(java.lang.String)` was added
* `withAssemblyName(java.lang.String)` was added

#### `models.IntegrationAccountAgreement$Definition` was modified

* `withMetadata(java.util.Map)` was added

#### `models.IntegrationAccountSession` was modified

* `systemData()` was added

#### `models.WorkflowRunActionRepetitionDefinition` was modified

* `systemData()` was added

#### `models.IntegrationServiceEnvironment$Definition` was modified

* `withNetworkConfiguration(models.NetworkConfiguration)` was added
* `withEndpointsConfiguration(models.FlowEndpointsConfiguration)` was added
* `withState(models.WorkflowState)` was added
* `withEncryptionConfiguration(models.IntegrationServiceEnvironmenEncryptionConfiguration)` was added
* `withIntegrationServiceEnvironmentId(java.lang.String)` was added

#### `models.Workflow$Definition` was modified

* `withDefinition(java.util.Map)` was added

#### `models.IntegrationAccountPartner` was modified

* `systemData()` was added

#### `models.Request` was modified

* `withHeaders(java.util.Map)` was added

#### `models.WorkflowRuns` was modified

* `list(java.lang.String,java.lang.String,java.lang.String)` was added
* `list(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,com.azure.core.util.Context)` was added

#### `models.Workflow$Update` was modified

* `withDefinition(java.util.Map)` was added

#### `models.IntegrationAccountSession$Definition` was modified

* `withContent(java.util.Map)` was added

#### `models.Workflow` was modified

* `systemData()` was added

#### `models.OperationResult` was modified

* `status()` was added

#### `models.IntegrationServiceEnvironment$Update` was modified

* `withEndpointsConfiguration(models.FlowEndpointsConfiguration)` was added
* `withIntegrationServiceEnvironmentId(java.lang.String)` was added
* `withState(models.WorkflowState)` was added
* `withNetworkConfiguration(models.NetworkConfiguration)` was added
* `withEncryptionConfiguration(models.IntegrationServiceEnvironmenEncryptionConfiguration)` was added

#### `models.IntegrationAccountMap` was modified

* `systemData()` was added

#### `models.WorkflowRunActions` was modified

* `listExpressionTracesWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.Workflows` was modified

* `updateWithResponse(java.lang.String,java.lang.String,java.lang.Object,com.azure.core.util.Context)` was added
* `update(java.lang.String,java.lang.String,java.lang.Object)` was added

#### `models.IntegrationAccountSchema$Definition` was modified

* `withMetadata(java.util.Map)` was added

#### `models.IntegrationServiceEnvironmentSkus` was modified

* `list(java.lang.String)` was added
* `list(java.lang.String,com.azure.core.util.Context)` was added

#### `LogicManager` was modified

* `apiOperations()` was added

#### `models.IntegrationServiceEnvironmentNetworkHealths` was modified

* `get(java.lang.String)` was added
* `getWithResponse(java.lang.String,com.azure.core.util.Context)` was added

#### `models.SwaggerSchema` was modified

* `withExample(java.util.Map)` was added
* `withAdditionalProperties(java.util.Map)` was added

#### `models.ApiOperation` was modified

* `api()` was added
* `isWebhook()` was added
* `description()` was added
* `isNotification()` was added
* `triggerHint()` was added
* `trigger()` was added
* `annotation()` was added
* `responsesDefinition()` was added
* `visibility()` was added
* `systemData()` was added
* `summary()` was added
* `pageable()` was added
* `inputsDefinition()` was added

#### `models.IntegrationAccountPartner$Update` was modified

* `withMetadata(java.util.Map)` was added

#### `models.TrackingEvent` was modified

* `withRecord(java.util.Map)` was added

#### `models.BatchConfiguration$Definition` was modified

* `withChangedTime(java.time.OffsetDateTime)` was added
* `withMetadata(java.lang.Object)` was added
* `withCreatedTime(java.time.OffsetDateTime)` was added
* `withBatchGroupName(java.lang.String)` was added
* `withReleaseCriteria(models.BatchReleaseCriteria)` was added

#### `models.BatchConfigurationCollection` was modified

* `innerModel()` was added

#### `models.ExpressionTraces` was modified

* `innerModel()` was added

#### `models.WorkflowTrigger` was modified

* `systemData()` was added

#### `models.IntegrationServiceEnvironmentManagedApis` was modified

* `list(java.lang.String)` was added
* `list(java.lang.String,com.azure.core.util.Context)` was added
* `delete(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `deleteByResourceGroup(java.lang.String,java.lang.String)` was added
* `get(java.lang.String,java.lang.String)` was added
* `getWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.IntegrationServiceEnvironmentManagedApi` was modified

* `systemData()` was added

#### `models.AssemblyDefinition` was modified

* `assemblyVersion()` was added
* `contentType()` was added
* `contentLink()` was added
* `assemblyName()` was added
* `changedTime()` was added
* `systemData()` was added
* `assemblyCulture()` was added
* `content()` was added
* `metadata()` was added
* `assemblyPublicKeyToken()` was added
* `createdTime()` was added

#### `models.SwaggerCustomDynamicTreeParameter` was modified

* `withValue(java.util.Map)` was added

#### `models.AssemblyDefinition$Definition` was modified

* `withAssemblyCulture(java.lang.String)` was added
* `withContent(java.lang.Object)` was added
* `withAssemblyPublicKeyToken(java.lang.String)` was added
* `withMetadata(java.lang.Object)` was added
* `withAssemblyVersion(java.lang.String)` was added
* `withAssemblyName(java.lang.String)` was added
* `withCreatedTime(java.time.OffsetDateTime)` was added
* `withContentLink(models.ContentLink)` was added
* `withChangedTime(java.time.OffsetDateTime)` was added
* `withContentType(java.lang.String)` was added

#### `models.IntegrationAccountMap$Update` was modified

* `withMetadata(java.util.Map)` was added

#### `models.ApiReference` was modified

* `withSwagger(java.util.Map)` was added

#### `models.IntegrationAccountAgreement` was modified

* `systemData()` was added

#### `models.BatchConfiguration` was modified

* `systemData()` was added
* `changedTime()` was added
* `metadata()` was added
* `batchGroupName()` was added
* `releaseCriteria()` was added
* `createdTime()` was added

#### `models.KeyVaultKey` was modified

* `validate()` was added
* `withAttributes(models.KeyVaultKeyAttributes)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withKid(java.lang.String)` was added

## 1.0.0 (2024-12-24)

- Azure Resource Manager Logic client library for Java. This package contains Microsoft Azure SDK for Logic Management SDK. REST API for Azure Logic Apps. Package tag package-2019-05. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Other Changes

- Release for Azure Resource Manager Logic client library for Java.

## 1.0.0-beta.3 (2024-10-17)

- Azure Resource Manager Logic client library for Java. This package contains Microsoft Azure SDK for Logic Management SDK. REST API for Azure Logic Apps. Package tag package-2019-05. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.IpAddressRange` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ListKeyVaultKeysDefinition` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExtendedErrorInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FlowEndpointsConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AgreementContent` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApiOperationListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationServiceEnvironmenEncryptionKeyReference` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExpressionRoot` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RequestHistoryProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EdifactValidationOverride` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EdifactProcessingSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AS2AcknowledgementConnectionSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApiResourceDefinitions` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationServiceEnvironmentNetworkDependencyHealth` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkflowVersionListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SwaggerCustomDynamicList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SwaggerCustomDynamicTreeSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RepetitionIndex` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.X12EnvelopeSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApiDeploymentParameterMetadata` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.X12ProtocolSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UserAssignedIdentity` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkflowTriggerHistoryListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Response` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApiResourceMetadata` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AS2ValidationSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationServiceEnvironmentSkuList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.KeyVaultKeyCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AssemblyCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OpenAuthenticationAccessPolicies` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.X12ValidationSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ArtifactProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkflowOutputParameter` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationAccountMapPropertiesParametersSchema` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AS2MessageConnectionSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AS2MdnSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.X12AcknowledgementSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EdifactMessageIdentifier` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ManagedServiceIdentity` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EdifactFramingSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SwaggerCustomDynamicTreeCommand` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SwaggerExternalDocumentation` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApiOperationPropertiesDefinition` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TrackingEventErrorInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkflowRunTrigger` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AS2EnvelopeSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Correlation` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SetTriggerStateActionDefinition` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkflowParameter` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TrackingEventsDefinition` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AS2SecuritySettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.KeyVaultKeyAttributes` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EdifactDelimiterOverride` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EdifactMessageFilter` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationAccountMapListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BatchReleaseCriteria` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EdifactEnvelopeSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FlowAccessControlConfigurationPolicy` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApiResourceProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IntegrationAccountCertificateListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureResourceErrorInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RegenerateActionParameter` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IntegrationServiceEnvironmentSkuCapacity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.X12ValidationOverride` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SwaggerCustomDynamicTree` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NetworkConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkflowTriggerListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationAccountPartnerListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationAccountAgreementListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EdifactSchemaReference` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AS2AgreementContent` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationServiceEnvironmentNetworkEndpoint` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RunCorrelation` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IntegrationServiceEnvironmentSkuDefinitionSku` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WsdlService` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EdifactAgreementContent` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SwaggerXml` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IntegrationAccountSchemaListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.X12OneWayAgreement` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Expression` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SwaggerCustomDynamicSchema` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PartnerContent` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ArtifactContentPropertiesDefinition` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.X12EnvelopeOverride` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AS2ErrorSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AS2OneWayAgreement` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FlowEndpoints` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkflowTriggerReference` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `name()` was added
* `type()` was added

#### `models.WorkflowRunListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EdifactValidationSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Request` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkflowListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AssemblyProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.B2BPartnerContent` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SwaggerCustomDynamicProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkflowTriggerListCallbackUrlQueries` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.KeyVaultReference` was modified

* `name()` was added
* `type()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ContentLink` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.X12SecuritySettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkflowTriggerRecurrence` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApiResourceBackendService` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RequestHistoryListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RetryHistory` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationAccountListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.KeyVaultKeyReferenceKeyVault` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationAccountSessionListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FlowAccessControlConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkflowReference` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `name()` was added
* `type()` was added

#### `models.RecurrenceScheduleOccurrence` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.GetCallbackUrlParameters` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OpenAuthenticationPolicyClaim` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.KeyVaultKeyReference` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationAccountSku` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.X12FramingSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OpenAuthenticationAccessPolicy` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.X12AgreementContent` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RunActionCorrelation` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SwaggerSchema` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IntegrationServiceEnvironmentManagedApiListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EdifactAcknowledgementSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TrackingEvent` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecurrenceSchedule` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BatchConfigurationCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationServiceEnvironmentListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExpressionTraces` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EdifactProtocolSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationServiceEnvironmentSku` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.X12MessageFilter` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationServiceEnvironmentManagedApiDeploymentParameters` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EdifactEnvelopeOverride` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.X12DelimiterOverrides` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkflowRunActionRepetitionDefinitionCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IntegrationServiceEnvironmentAccessEndpoint` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AS2ProtocolSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IpAddress` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IntegrationServiceEnvironmentNetworkDependency` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.X12ProcessingSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IntegrationServiceEnvironmenEncryptionConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Sku` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SwaggerCustomDynamicTreeParameter` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApiOperationAnnotation` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IntegrationServiceEnvironmentProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ErrorInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationResultProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.GenerateUpgradedDefinitionParameters` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.BusinessIdentity` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApiResourceGeneralInformation` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.X12SchemaReference` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApiReference` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added
* `name()` was added

#### `models.X12MessageIdentifier` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApiResourcePolicies` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.BatchConfigurationProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResourceReference` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkflowRunActionListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApiDeploymentParameterMetadataSet` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EdifactOneWayAgreement` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ContentHash` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.0.0-beta.2 (2023-01-17)

- Azure Resource Manager Logic client library for Java. This package contains Microsoft Azure SDK for Logic Management SDK. REST API for Azure Logic Apps. Package tag package-2019-05. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.ManagedApiListResult` was removed

* `models.WorkflowRunActionRepetitionProperties` was removed

* `models.ManagedApi` was removed

#### `models.IntegrationServiceEnvironments` was modified

* `deleteWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.IntegrationAccount$Definition` was modified

* `withIntegrationServiceEnvironment(fluent.models.IntegrationServiceEnvironmentInner)` was removed

#### `models.IntegrationAccount` was modified

* `models.IntegrationServiceEnvironment integrationServiceEnvironment()` -> `models.ResourceReference integrationServiceEnvironment()`

#### `models.ApiResourceProperties` was modified

* `withCategory(models.ApiTier)` was removed
* `withBackendService(models.ApiResourceBackendService)` was removed
* `withName(java.lang.String)` was removed
* `withPolicies(models.ApiResourcePolicies)` was removed
* `withMetadata(models.ApiResourceMetadata)` was removed
* `withRuntimeUrls(java.util.List)` was removed
* `withCapabilities(java.util.List)` was removed
* `withConnectionParameters(java.util.Map)` was removed
* `withApiDefinitions(models.ApiResourceDefinitions)` was removed
* `withProvisioningState(models.WorkflowProvisioningState)` was removed
* `withGeneralInformation(models.ApiResourceGeneralInformation)` was removed
* `withApiDefinitionUrl(java.lang.String)` was removed

#### `models.IntegrationAccounts` was modified

* `deleteWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.IntegrationAccount$Update` was modified

* `withIntegrationServiceEnvironment(fluent.models.IntegrationServiceEnvironmentInner)` was removed

#### `models.ContentLink` was modified

* `withContentSize(java.lang.Long)` was removed
* `withMetadata(java.lang.Object)` was removed
* `withContentHash(models.ContentHash)` was removed
* `withContentVersion(java.lang.String)` was removed

#### `models.Workflows` was modified

* `deleteWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.IntegrationServiceEnvironmentManagedApis` was modified

* `models.ManagedApi get(java.lang.String,java.lang.String,java.lang.String)` -> `models.IntegrationServiceEnvironmentManagedApi get(java.lang.String,java.lang.String,java.lang.String)`
* `put(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `put(java.lang.String,java.lang.String,java.lang.String)` was removed

### Features Added

* `models.UserAssignedIdentity` was added

* `models.ManagedServiceIdentity` was added

* `models.IntegrationServiceEnvironmentManagedApi$Definition` was added

* `models.IntegrationServiceEnvironmentManagedApi$DefinitionStages` was added

* `models.IntegrationServiceEnvironmentManagedApiListResult` was added

* `models.IntegrationServiceEnvironmentManagedApi$Update` was added

* `models.ManagedServiceIdentityType` was added

* `models.IntegrationServiceEnvironmentManagedApi$UpdateStages` was added

* `models.IntegrationServiceEnvironmentManagedApiDeploymentParameters` was added

* `models.IntegrationServiceEnvironmentManagedApi` was added

#### `models.IntegrationAccountSchema` was modified

* `resourceGroupName()` was added

#### `models.IntegrationServiceEnvironments` was modified

* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.IntegrationAccount$Definition` was modified

* `withIntegrationServiceEnvironment(models.ResourceReference)` was added

#### `models.IntegrationAccountCertificate` was modified

* `resourceGroupName()` was added

#### `models.IntegrationServiceEnvironment` was modified

* `resourceGroupName()` was added
* `identity()` was added

#### `models.IntegrationAccount` was modified

* `resourceGroupName()` was added

#### `models.IntegrationAccounts` was modified

* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.IntegrationAccount$Update` was modified

* `withIntegrationServiceEnvironment(models.ResourceReference)` was added

#### `models.IntegrationAccountSession` was modified

* `resourceGroupName()` was added

#### `models.IntegrationServiceEnvironment$Definition` was modified

* `withIdentity(models.ManagedServiceIdentity)` was added

#### `models.Workflow$Definition` was modified

* `withIdentity(models.ManagedServiceIdentity)` was added

#### `models.IntegrationAccountPartner` was modified

* `resourceGroupName()` was added

#### `models.Workflow$Update` was modified

* `withIdentity(models.ManagedServiceIdentity)` was added

#### `LogicManager$Configurable` was modified

* `withScope(java.lang.String)` was added
* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added

#### `models.Workflow` was modified

* `identity()` was added
* `resourceGroupName()` was added

#### `models.IntegrationServiceEnvironment$Update` was modified

* `withIdentity(models.ManagedServiceIdentity)` was added

#### `models.IntegrationAccountMap` was modified

* `resourceGroupName()` was added

#### `models.Workflows` was modified

* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `LogicManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

#### `models.OpenAuthenticationAccessPolicy` was modified

* `withType(models.OpenAuthenticationProviderType)` was added

#### `models.IntegrationServiceEnvironmentManagedApis` was modified

* `getByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `deleteById(java.lang.String)` was added
* `getById(java.lang.String)` was added
* `deleteByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `define(java.lang.String)` was added

#### `models.AssemblyDefinition` was modified

* `resourceGroupName()` was added

#### `models.IntegrationAccountAgreement` was modified

* `resourceGroupName()` was added

#### `models.BatchConfiguration` was modified

* `resourceGroupName()` was added

## 1.0.0-beta.1 (2021-04-16)

- Azure Resource Manager Logic client library for Java. This package contains Microsoft Azure SDK for Logic Management SDK. REST API for Azure Logic Apps. Package tag package-2019-05. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
