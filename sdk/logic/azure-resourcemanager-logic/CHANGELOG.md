# Release History

## 1.0.0-beta.1 (2025-03-12)

- Azure Resource Manager Logic client library for Java. This package contains Microsoft Azure SDK for Logic Management SDK. REST API for Azure Logic Apps. Package tag package-2019-05. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.ExtendedErrorInfo` was removed

#### `models.WorkflowRunActionScopeRepetitions` was removed

#### `models.AS2AcknowledgementConnectionSettings` was removed

#### `models.IntegrationServiceEnvironmentNetworkDependencyHealth` was removed

#### `models.UserAssignedIdentity` was removed

#### `models.AS2ValidationSettings` was removed

#### `models.WorkflowRunActionRepetitions` was removed

#### `models.IntegrationAccountAssemblies` was removed

#### `models.AS2MessageConnectionSettings` was removed

#### `models.AS2MdnSettings` was removed

#### `models.IntegrationAccountBatchConfigurations` was removed

#### `models.ManagedServiceIdentity` was removed

#### `models.IntegrationServiceEnvironmentSubnetNetworkHealth` was removed

#### `models.AS2EnvelopeSettings` was removed

#### `models.AS2SecuritySettings` was removed

#### `models.WorkflowRunActionRequestHistories` was removed

#### `models.AS2AgreementContent` was removed

#### `models.IntegrationServiceEnvironmentManagedApiOperations` was removed

#### `models.AS2ErrorSettings` was removed

#### `models.AS2OneWayAgreement` was removed

#### `models.IntegrationServiceEnvironmentSkus` was removed

#### `models.IntegrationServiceEnvironmentNetworkHealths` was removed

#### `models.WorkflowRunActionRepetitionsRequestHistories` was removed

#### `models.IntegrationServiceEnvironmentNetworkDependencyHealthState` was removed

#### `models.ManagedServiceIdentityType` was removed

#### `models.AS2ProtocolSettings` was removed

#### `models.ErrorResponseCode` was removed

#### `models.WorkflowRunOperations` was removed

#### `models.WorkflowVersionTriggers` was removed

#### `models.IntegrationAccountCertificate$DefinitionStages` was modified

* Required stage 2 was added
* `withRegion(java.lang.String)` was removed in stage 1
* `withRegion(com.azure.core.management.Region)` was removed in stage 1

#### `models.IntegrationAccountAgreement$DefinitionStages` was modified

* `withRegion(java.lang.String)` was removed in stage 1
* `withRegion(com.azure.core.management.Region)` was removed in stage 1
* `withAgreementType(models.AgreementType)` was removed in stage 2

#### `models.IntegrationAccountPartner$DefinitionStages` was modified

* `withRegion(java.lang.String)` was removed in stage 1
* `withRegion(com.azure.core.management.Region)` was removed in stage 1
* `withPartnerType(models.PartnerType)` was removed in stage 2

#### `models.IntegrationAccountMap$DefinitionStages` was modified

* `withRegion(com.azure.core.management.Region)` was removed in stage 1
* `withRegion(java.lang.String)` was removed in stage 1
* `withMapType(models.MapType)` was removed in stage 2

#### `models.IntegrationAccountSession$DefinitionStages` was modified

* Required stage 2 was added
* `withRegion(java.lang.String)` was removed in stage 1
* `withRegion(com.azure.core.management.Region)` was removed in stage 1

#### `models.IntegrationServiceEnvironmentManagedApi$DefinitionStages` was modified

* `withExistingIntegrationServiceEnvironment(java.lang.String,java.lang.String)` was removed in stage 2

#### `models.AssemblyDefinition$DefinitionStages` was modified

* `withRegion(com.azure.core.management.Region)` was removed in stage 1
* `withRegion(java.lang.String)` was removed in stage 1

#### `models.BatchConfiguration$DefinitionStages` was modified

* `withRegion(com.azure.core.management.Region)` was removed in stage 1
* `withRegion(java.lang.String)` was removed in stage 1

#### `models.IntegrationAccountSchema$DefinitionStages` was modified

* `withRegion(com.azure.core.management.Region)` was removed in stage 1
* `withRegion(java.lang.String)` was removed in stage 1
* `withSchemaType(models.SchemaType)` was removed in stage 2

#### `models.WorkflowVersion` was modified

* `changedTime()` was removed
* `sku()` was removed
* `createdTime()` was removed
* `accessControl()` was removed
* `parameters()` was removed
* `location()` was removed
* `state()` was removed
* `tags()` was removed
* `integrationAccount()` was removed
* `version()` was removed
* `accessEndpoint()` was removed
* `endpointsConfiguration()` was removed
* `provisioningState()` was removed
* `definition()` was removed

#### `models.RequestHistory` was modified

* `location()` was removed
* `tags()` was removed

#### `models.AgreementContent` was modified

* `models.AS2AgreementContent aS2()` -> `models.As2AgreementContent aS2()`
* `withAS2(models.AS2AgreementContent)` was removed

#### `models.ExpressionRoot` was modified

* `withValue(java.lang.Object)` was removed

#### `models.EdifactDecimalIndicator` was modified

* `valueOf(java.lang.String)` was removed
* `models.EdifactDecimalIndicator[] values()` -> `java.util.Collection values()`
* `toString()` was removed

#### `models.IntegrationAccountSchema` was modified

* `fileName()` was removed
* `region()` was removed
* `contentType()` was removed
* `regionName()` was removed
* `contentLink()` was removed
* `schemaType()` was removed
* `content()` was removed
* `location()` was removed
* `changedTime()` was removed
* `metadata()` was removed
* `targetNamespace()` was removed
* `tags()` was removed
* `createdTime()` was removed
* `documentName()` was removed

#### `models.EventLevel` was modified

* `valueOf(java.lang.String)` was removed
* `models.EventLevel[] values()` -> `java.util.Collection values()`
* `toString()` was removed

#### `models.IntegrationAccountCertificate$Definition` was modified

* `withMetadata(java.lang.Object)` was removed
* `withKey(models.KeyVaultKeyReference)` was removed
* `withTags(java.util.Map)` was removed
* `withRegion(java.lang.String)` was removed
* `withPublicCertificate(java.lang.String)` was removed
* `withRegion(com.azure.core.management.Region)` was removed

#### `models.Response` was modified

* `java.lang.Object headers()` -> `java.util.Map headers()`
* `withHeaders(java.lang.Object)` was removed

#### `models.ApiResourceMetadata` was modified

* `withProvisioningState(models.WorkflowProvisioningState)` was removed

#### `models.IntegrationServiceEnvironments` was modified

* `restart(java.lang.String,java.lang.String)` was removed
* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `restartWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteByResourceGroup(java.lang.String,java.lang.String)` was removed
* `getByResourceGroup(java.lang.String,java.lang.String)` was removed
* `list()` was removed
* `getByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `list(java.lang.Integer,com.azure.core.util.Context)` was removed

#### `models.KeyVaultKeyCollection` was modified

* `withValue(java.util.List)` was removed
* `java.util.List value()` -> `java.util.List value()`
* `withSkipToken(java.lang.String)` was removed
* `fromJson(com.azure.json.JsonReader)` was removed
* `java.lang.String skipToken()` -> `java.lang.String skipToken()`
* `toJson(com.azure.json.JsonWriter)` was removed
* `validate()` was removed

#### `models.AssemblyCollection` was modified

* `withValue(java.util.List)` was removed
* `toJson(com.azure.json.JsonWriter)` was removed
* `validate()` was removed
* `fromJson(com.azure.json.JsonReader)` was removed
* `java.util.List value()` -> `java.util.List value()`

#### `models.WorkflowTriggers` was modified

* `runWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.WorkflowTriggerHistory` was modified

* `correlation()` was removed
* `trackingId()` was removed
* `error()` was removed
* `code()` was removed
* `inputsLink()` was removed
* `status()` was removed
* `outputsLink()` was removed
* `fired()` was removed
* `startTime()` was removed
* `endTime()` was removed
* `run()` was removed
* `scheduledTime()` was removed

#### `models.BatchConfiguration$Update` was modified

* `withTags(java.util.Map)` was removed

#### `models.ArtifactProperties` was modified

* `java.lang.Object metadata()` -> `java.util.Map metadata()`
* `withMetadata(java.lang.Object)` was removed

#### `models.IntegrationAccountCertificate$Update` was modified

* `withKey(models.KeyVaultKeyReference)` was removed
* `withPublicCertificate(java.lang.String)` was removed
* `withTags(java.util.Map)` was removed
* `withMetadata(java.lang.Object)` was removed

#### `models.WorkflowOutputParameter` was modified

* `withMetadata(java.lang.Object)` was removed
* `withValue(java.lang.Object)` was removed
* `java.lang.Object error()` -> `java.util.Map error()`

#### `models.IntegrationAccount$Definition` was modified

* `withState(models.WorkflowState)` was removed
* `withIntegrationServiceEnvironment(models.ResourceReference)` was removed

#### `models.WorkflowTriggerHistories` was modified

* `resubmitWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.DayOfWeek` was modified

* `toString()` was removed
* `models.DayOfWeek[] values()` -> `java.util.Collection values()`
* `valueOf(java.lang.String)` was removed

#### `models.IntegrationAccountCertificate` was modified

* `changedTime()` was removed
* `regionName()` was removed
* `createdTime()` was removed
* `location()` was removed
* `metadata()` was removed
* `tags()` was removed
* `region()` was removed
* `publicCertificate()` was removed
* `key()` was removed

#### `models.IntegrationServiceEnvironment` was modified

* `resourceGroupName()` was removed
* `identity()` was removed

#### `models.IntegrationAccountAgreement$Update` was modified

* `withTags(java.util.Map)` was removed
* `withGuestIdentity(models.BusinessIdentity)` was removed
* `withGuestPartner(java.lang.String)` was removed
* `withContent(models.AgreementContent)` was removed
* `withMetadata(java.lang.Object)` was removed
* `withAgreementType(models.AgreementType)` was removed
* `withHostPartner(java.lang.String)` was removed
* `withHostIdentity(models.BusinessIdentity)` was removed

#### `models.WorkflowRunTrigger` was modified

* `java.lang.Object inputs()` -> `java.util.Map inputs()`
* `java.lang.Object outputs()` -> `java.util.Map outputs()`
* `java.lang.Object error()` -> `java.util.Map error()`
* `java.lang.Object trackedProperties()` -> `java.util.Map trackedProperties()`

#### `models.IntegrationAccount` was modified

* `listKeyVaultKeys(models.ListKeyVaultKeysDefinition,com.azure.core.util.Context)` was removed
* `integrationServiceEnvironment()` was removed
* `state()` was removed
* `com.azure.core.http.rest.PagedIterable listKeyVaultKeys(models.ListKeyVaultKeysDefinition)` -> `models.KeyVaultKeyCollection listKeyVaultKeys(models.ListKeyVaultKeysDefinition)`

#### `models.IntegrationServiceEnvironmentManagedApi$Definition` was modified

* `withExistingIntegrationServiceEnvironment(java.lang.String,java.lang.String)` was removed
* `withDeploymentParameters(models.IntegrationServiceEnvironmentManagedApiDeploymentParameters)` was removed
* `withIntegrationServiceEnvironment(models.ResourceReference)` was removed

#### `models.WorkflowParameter` was modified

* `java.lang.Object value()` -> `java.util.Map value()`
* `withValue(java.lang.Object)` was removed
* `withMetadata(java.lang.Object)` was removed
* `java.lang.Object metadata()` -> `java.util.Map metadata()`

#### `models.ApiResourceProperties` was modified

* `name()` was removed

#### `models.IntegrationAccounts` was modified

* `listKeyVaultKeys(java.lang.String,java.lang.String,models.ListKeyVaultKeysDefinition,com.azure.core.util.Context)` was removed
* `com.azure.core.http.rest.PagedIterable listKeyVaultKeys(java.lang.String,java.lang.String,models.ListKeyVaultKeysDefinition)` -> `models.KeyVaultKeyCollection listKeyVaultKeys(java.lang.String,java.lang.String,models.ListKeyVaultKeysDefinition)`

#### `models.WorkflowRun` was modified

* `waitEndTime()` was removed
* `status()` was removed
* `error()` was removed
* `code()` was removed
* `endTime()` was removed
* `correlation()` was removed
* `outputs()` was removed
* `startTime()` was removed
* `response()` was removed
* `correlationId()` was removed
* `trigger()` was removed
* `workflow()` was removed

#### `models.WorkflowRunAction` was modified

* `status()` was removed
* `code()` was removed
* `error()` was removed
* `retryHistory()` was removed
* `startTime()` was removed
* `outputsLink()` was removed
* `correlation()` was removed
* `trackedProperties()` was removed
* `endTime()` was removed
* `inputsLink()` was removed
* `trackingId()` was removed

#### `models.IntegrationAccountSession$Update` was modified

* `withTags(java.util.Map)` was removed
* `withContent(java.lang.Object)` was removed

#### `models.IntegrationAccountSchema$Update` was modified

* `withContentType(java.lang.String)` was removed
* `withTargetNamespace(java.lang.String)` was removed
* `withDocumentName(java.lang.String)` was removed
* `withTags(java.util.Map)` was removed
* `withContent(java.lang.String)` was removed
* `withSchemaType(models.SchemaType)` was removed
* `withMetadata(java.lang.Object)` was removed
* `withFileName(java.lang.String)` was removed

#### `models.IntegrationAccountPartner$Definition` was modified

* `withPartnerType(models.PartnerType)` was removed
* `withRegion(java.lang.String)` was removed
* `withMetadata(java.lang.Object)` was removed
* `withContent(models.PartnerContent)` was removed
* `withRegion(com.azure.core.management.Region)` was removed
* `withTags(java.util.Map)` was removed

#### `models.Operation` was modified

* `java.lang.String origin()` -> `models.Origin origin()`
* `properties()` was removed

#### `models.IntegrationAccountMap$Definition` was modified

* `withMapType(models.MapType)` was removed
* `withRegion(com.azure.core.management.Region)` was removed
* `withParametersSchema(models.IntegrationAccountMapPropertiesParametersSchema)` was removed
* `withRegion(java.lang.String)` was removed
* `withMetadata(java.lang.Object)` was removed
* `withTags(java.util.Map)` was removed
* `withContentType(java.lang.String)` was removed
* `withContent(java.lang.String)` was removed

#### `models.IntegrationAccount$Update` was modified

* `withState(models.WorkflowState)` was removed
* `withIntegrationServiceEnvironment(models.ResourceReference)` was removed

#### `models.AssemblyDefinition$Update` was modified

* `withTags(java.util.Map)` was removed

#### `models.Expression` was modified

* `withValue(java.lang.Object)` was removed
* `java.lang.Object value()` -> `java.util.Map value()`

#### `models.IntegrationAccountAgreement$Definition` was modified

* `withRegion(java.lang.String)` was removed
* `withHostIdentity(models.BusinessIdentity)` was removed
* `withHostPartner(java.lang.String)` was removed
* `withRegion(com.azure.core.management.Region)` was removed
* `withContent(models.AgreementContent)` was removed
* `withGuestIdentity(models.BusinessIdentity)` was removed
* `withAgreementType(models.AgreementType)` was removed
* `withMetadata(java.lang.Object)` was removed
* `withGuestPartner(java.lang.String)` was removed
* `withTags(java.util.Map)` was removed

#### `models.IntegrationAccountSession` was modified

* `createdTime()` was removed
* `content()` was removed
* `location()` was removed
* `changedTime()` was removed
* `tags()` was removed
* `region()` was removed
* `regionName()` was removed

#### `models.WorkflowRunActionRepetitionDefinition` was modified

* `inputsLink()` was removed
* `correlation()` was removed
* `status()` was removed
* `outputsLink()` was removed
* `startTime()` was removed
* `retryHistory()` was removed
* `trackedProperties()` was removed
* `inputs()` was removed
* `tags()` was removed
* `error()` was removed
* `trackingId()` was removed
* `location()` was removed
* `repetitionIndexes()` was removed
* `endTime()` was removed
* `iterationCount()` was removed
* `outputs()` was removed
* `code()` was removed

#### `models.ArtifactContentPropertiesDefinition` was modified

* `java.lang.Object content()` -> `java.util.Map content()`
* `withMetadata(java.lang.Object)` was removed
* `withContent(java.lang.Object)` was removed

#### `models.IntegrationServiceEnvironment$Definition` was modified

* `withExistingResourceGroup(java.lang.String)` was removed
* `withIdentity(models.ManagedServiceIdentity)` was removed

#### `models.Workflow$Definition` was modified

* `withIntegrationAccount(models.ResourceReference)` was removed
* `withDefinition(java.lang.Object)` was removed
* `withParameters(java.util.Map)` was removed
* `withState(models.WorkflowState)` was removed
* `withAccessControl(models.FlowAccessControlConfiguration)` was removed
* `withEndpointsConfiguration(models.FlowEndpointsConfiguration)` was removed
* `withIdentity(models.ManagedServiceIdentity)` was removed
* `withIntegrationServiceEnvironment(models.ResourceReference)` was removed

#### `models.DaysOfWeek` was modified

* `toString()` was removed
* `valueOf(java.lang.String)` was removed
* `models.DaysOfWeek[] values()` -> `java.util.Collection values()`

#### `models.IntegrationAccountPartner` was modified

* `createdTime()` was removed
* `partnerType()` was removed
* `content()` was removed
* `metadata()` was removed
* `region()` was removed
* `changedTime()` was removed
* `regionName()` was removed
* `location()` was removed
* `tags()` was removed

#### `models.Request` was modified

* `withHeaders(java.lang.Object)` was removed
* `java.lang.Object headers()` -> `java.util.Map headers()`

#### `models.WorkflowRuns` was modified

* `list(java.lang.String,java.lang.String)` was removed
* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.AssemblyProperties` was modified

* `withContent(java.lang.Object)` was removed
* `withMetadata(java.lang.Object)` was removed

#### `models.Workflow$Update` was modified

* `withParameters(java.util.Map)` was removed
* `withDefinition(java.lang.Object)` was removed
* `withIdentity(models.ManagedServiceIdentity)` was removed
* `withAccessControl(models.FlowAccessControlConfiguration)` was removed
* `withState(models.WorkflowState)` was removed
* `withIntegrationServiceEnvironment(models.ResourceReference)` was removed
* `withEndpointsConfiguration(models.FlowEndpointsConfiguration)` was removed
* `withIntegrationAccount(models.ResourceReference)` was removed

#### `models.IntegrationAccountSession$Definition` was modified

* `withTags(java.util.Map)` was removed
* `withContent(java.lang.Object)` was removed
* `withRegion(java.lang.String)` was removed
* `withRegion(com.azure.core.management.Region)` was removed

#### `models.ContentLink` was modified

* `java.lang.Object metadata()` -> `java.util.Map metadata()`

#### `models.Workflow` was modified

* `changedTime()` was removed
* `java.lang.Object generateUpgradedDefinition(models.GenerateUpgradedDefinitionParameters)` -> `java.util.Map generateUpgradedDefinition(models.GenerateUpgradedDefinitionParameters)`
* `accessControl()` was removed
* `endpointsConfiguration()` was removed
* `state()` was removed
* `identity()` was removed
* `integrationServiceEnvironment()` was removed
* `accessEndpoint()` was removed
* `definition()` was removed
* `sku()` was removed
* `createdTime()` was removed
* `integrationAccount()` was removed
* `java.lang.Object listSwagger()` -> `java.util.Map listSwagger()`
* `parameters()` was removed
* `provisioningState()` was removed
* `version()` was removed

#### `models.AgreementType` was modified

* `valueOf(java.lang.String)` was removed
* `models.AgreementType[] values()` -> `java.util.Collection values()`
* `toString()` was removed

#### `models.OperationResult` was modified

* `withStatus(models.WorkflowStatus)` was removed
* `java.lang.Object inputs()` -> `java.util.Map inputs()`
* `java.lang.Object outputs()` -> `java.util.Map outputs()`
* `withError(java.lang.Object)` was removed
* `java.lang.Object trackedProperties()` -> `java.util.Map trackedProperties()`

#### `models.IntegrationServiceEnvironment$Update` was modified

* `withIdentity(models.ManagedServiceIdentity)` was removed

#### `models.IntegrationAccountMap` was modified

* `changedTime()` was removed
* `parametersSchema()` was removed
* `region()` was removed
* `contentType()` was removed
* `regionName()` was removed
* `content()` was removed
* `createdTime()` was removed
* `tags()` was removed
* `contentLink()` was removed
* `mapType()` was removed
* `location()` was removed
* `metadata()` was removed

#### `models.WorkflowRunActions` was modified

* `listExpressionTraces(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `com.azure.core.http.rest.PagedIterable listExpressionTraces(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` -> `models.ExpressionTraces listExpressionTraces(java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

#### `models.Workflows` was modified

* `validateByLocationWithResponse(java.lang.String,java.lang.String,java.lang.String,fluent.models.WorkflowInner,com.azure.core.util.Context)` was removed
* `java.lang.Object generateUpgradedDefinition(java.lang.String,java.lang.String,models.GenerateUpgradedDefinitionParameters)` -> `java.util.Map generateUpgradedDefinition(java.lang.String,java.lang.String,models.GenerateUpgradedDefinitionParameters)`
* `update(java.lang.String,java.lang.String)` was removed
* `validateByLocation(java.lang.String,java.lang.String,java.lang.String,fluent.models.WorkflowInner)` was removed
* `updateWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `java.lang.Object listSwagger(java.lang.String,java.lang.String)` -> `java.util.Map listSwagger(java.lang.String,java.lang.String)`

#### `models.SegmentTerminatorSuffix` was modified

* `valueOf(java.lang.String)` was removed
* `models.SegmentTerminatorSuffix[] values()` -> `java.util.Collection values()`
* `toString()` was removed

#### `models.IntegrationAccountSchema$Definition` was modified

* `withTags(java.util.Map)` was removed
* `withFileName(java.lang.String)` was removed
* `withDocumentName(java.lang.String)` was removed
* `withMetadata(java.lang.Object)` was removed
* `withRegion(com.azure.core.management.Region)` was removed
* `withTargetNamespace(java.lang.String)` was removed
* `withRegion(java.lang.String)` was removed
* `withContent(java.lang.String)` was removed
* `withContentType(java.lang.String)` was removed
* `withSchemaType(models.SchemaType)` was removed

#### `LogicManager` was modified

* `integrationAccountAssemblies()` was removed
* `integrationServiceEnvironmentNetworkHealths()` was removed
* `workflowRunActionRepetitionsRequestHistories()` was removed
* `workflowRunActionScopeRepetitions()` was removed
* `integrationServiceEnvironmentManagedApiOperations()` was removed
* `workflowRunOperations()` was removed
* `workflowRunActionRequestHistories()` was removed
* `integrationAccountBatchConfigurations()` was removed
* `workflowVersionTriggers()` was removed
* `workflowRunActionRepetitions()` was removed
* `integrationServiceEnvironmentSkus()` was removed

#### `models.SwaggerSchema` was modified

* `withExample(java.lang.Object)` was removed
* `java.lang.Object example()` -> `java.util.Map example()`
* `java.lang.Object additionalProperties()` -> `java.util.Map additionalProperties()`
* `withAdditionalProperties(java.lang.Object)` was removed

#### `models.ApiOperation` was modified

* `location()` was removed
* `tags()` was removed

#### `models.IntegrationAccountPartner$Update` was modified

* `withPartnerType(models.PartnerType)` was removed
* `withContent(models.PartnerContent)` was removed
* `withMetadata(java.lang.Object)` was removed
* `withTags(java.util.Map)` was removed

#### `models.TrackingEvent` was modified

* `withRecord(java.lang.Object)` was removed
* `java.lang.Object record()` -> `java.util.Map record()`

#### `models.BatchConfiguration$Definition` was modified

* `withRegion(com.azure.core.management.Region)` was removed
* `withTags(java.util.Map)` was removed
* `withRegion(java.lang.String)` was removed

#### `models.IntegrationServiceEnvironmentManagedApi$Update` was modified

* `withDeploymentParameters(models.IntegrationServiceEnvironmentManagedApiDeploymentParameters)` was removed
* `withIntegrationServiceEnvironment(models.ResourceReference)` was removed

#### `models.BatchConfigurationCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was removed
* `validate()` was removed
* `java.util.List value()` -> `java.util.List value()`
* `toJson(com.azure.json.JsonWriter)` was removed
* `withValue(java.util.List)` was removed

#### `models.ExpressionTraces` was modified

* `toJson(com.azure.json.JsonWriter)` was removed
* `withInputs(java.util.List)` was removed
* `fromJson(com.azure.json.JsonReader)` was removed
* `validate()` was removed
* `java.util.List inputs()` -> `java.util.List inputs()`

#### `models.WorkflowTrigger` was modified

* `changedTime()` was removed
* `provisioningState()` was removed
* `workflow()` was removed
* `nextExecutionTime()` was removed
* `status()` was removed
* `createdTime()` was removed
* `recurrence()` was removed
* `state()` was removed
* `lastExecutionTime()` was removed

#### `models.IntegrationServiceEnvironmentManagedApis` was modified

* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `delete(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `list(java.lang.String,java.lang.String)` was removed
* `delete(java.lang.String,java.lang.String,java.lang.String)` was removed
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `get(java.lang.String,java.lang.String,java.lang.String)` was removed

#### `models.IntegrationServiceEnvironmentManagedApi` was modified

* `generalInformation()` was removed
* `category()` was removed
* `runtimeUrls()` was removed
* `capabilities()` was removed
* `connectionParameters()` was removed
* `provisioningState()` was removed
* `apiDefinitionUrl()` was removed
* `resourceGroupName()` was removed
* `policies()` was removed
* `namePropertiesName()` was removed
* `metadata()` was removed
* `deploymentParameters()` was removed
* `integrationServiceEnvironment()` was removed
* `apiDefinitions()` was removed
* `backendService()` was removed

#### `models.AssemblyDefinition` was modified

* `regionName()` was removed
* `region()` was removed
* `location()` was removed
* `tags()` was removed

#### `models.OperationDisplay` was modified

* `withDescription(java.lang.String)` was removed
* `withResource(java.lang.String)` was removed
* `withOperation(java.lang.String)` was removed
* `withProvider(java.lang.String)` was removed

#### `models.SwaggerCustomDynamicTreeParameter` was modified

* `withValue(java.lang.Object)` was removed
* `java.lang.Object value()` -> `java.util.Map value()`

#### `models.IntegrationServiceEnvironmentProperties` was modified

* `withProvisioningState(models.WorkflowProvisioningState)` was removed

#### `models.AssemblyDefinition$Definition` was modified

* `withRegion(com.azure.core.management.Region)` was removed
* `withTags(java.util.Map)` was removed
* `withRegion(java.lang.String)` was removed

#### `models.OperationListResult` was modified

* `withValue(java.util.List)` was removed
* `withNextLink(java.lang.String)` was removed

#### `models.OperationResultProperties` was modified

* `withError(java.lang.Object)` was removed
* `models.OperationResultProperties withStatus(models.WorkflowStatus)` -> `models.OperationResultProperties withStatus(models.WorkflowStatus)`
* `java.lang.Object error()` -> `java.util.Map error()`

#### `models.IntegrationAccountMap$Update` was modified

* `withTags(java.util.Map)` was removed
* `withContent(java.lang.String)` was removed
* `withContentType(java.lang.String)` was removed
* `withMetadata(java.lang.Object)` was removed
* `withMapType(models.MapType)` was removed
* `withParametersSchema(models.IntegrationAccountMapPropertiesParametersSchema)` was removed

#### `models.ApiReference` was modified

* `java.lang.Object swagger()` -> `java.util.Map swagger()`
* `withSwagger(java.lang.Object)` was removed

#### `models.BatchConfigurationProperties` was modified

* `withMetadata(java.lang.Object)` was removed

#### `models.IntegrationAccountAgreement` was modified

* `hostPartner()` was removed
* `regionName()` was removed
* `location()` was removed
* `guestPartner()` was removed
* `guestIdentity()` was removed
* `createdTime()` was removed
* `tags()` was removed
* `region()` was removed
* `changedTime()` was removed
* `agreementType()` was removed
* `content()` was removed
* `metadata()` was removed
* `hostIdentity()` was removed

#### `models.BatchConfiguration` was modified

* `location()` was removed
* `tags()` was removed
* `region()` was removed
* `regionName()` was removed

#### `models.KeyVaultKey` was modified

* `java.lang.String kid()` -> `java.lang.String kid()`
* `models.KeyVaultKeyAttributes attributes()` -> `models.KeyVaultKeyAttributes attributes()`
* `innerModel()` was removed

### Features Added

* `models.Template$Definition` was added

* `models.BatchConfigurations` was added

* `models.IntegrationAccountPartnerProperties` was added

* `models.IntegrationServiceEnvironmentNetworkHealth` was added

* `models.As2ProtocolSettings` was added

* `models.IntegrationAccountSchemaProperties` was added

* `models.IntegrationAccountMapProperties` was added

* `models.As2ValidationSettings` was added

* `models.Templates` was added

* `models.WorkflowRunActionRepetitionDefinitions` was added

* `models.WorkflowRunActionScopeRepetitionsOperations` was added

* `models.IntegrationAccountProperties` was added

* `models.Template$Update` was added

* `models.ActionType` was added

* `models.As2MessageConnectionSettings` was added

* `models.FlowTemplateSku` was added

* `models.WorkflowRunActionRepetitionProperties` was added

* `models.TemplateProperties` was added

* `models.WorkflowRunProperties` was added

* `models.As2MdnSettings` was added

* `models.IntegrationAccountCertificateProperties` was added

* `models.TemplateUpdate` was added

* `models.WorkflowTriggerProperties` was added

* `models.As2AcknowledgementConnectionSettings` was added

* `models.AssemblyDefinitions` was added

* `models.Template$DefinitionStages` was added

* `models.WorkflowRunActionRequestHistoriesOperations` was added

* `models.FlowTemplateDetails` was added

* `models.TemplateListResult` was added

* `models.IntegrationAccountAgreementProperties` was added

* `models.WorkflowRunActionProperties` was added

* `models.WorkflowRunsOperations` was added

* `models.WorkflowRunOperationsOperations` was added

* `models.ApiOperations` was added

* `models.FlowTemplateState` was added

* `models.RequestHistories` was added

* `models.FlowTemplateType` was added

* `models.As2ErrorSettings` was added

* `models.FlowRunExecutionMode` was added

* `models.WorkflowsOperations` was added

* `models.IntegrationAccountSessionProperties` was added

* `models.Template` was added

* `models.As2SecuritySettings` was added

* `models.FlowTemplateManifest` was added

* `models.Template$UpdateStages` was added

* `models.As2EnvelopeSettings` was added

* `models.FlowTemplateConnectorDetails` was added

* `models.WorkflowProperties` was added

* `models.WorkflowVersionProperties` was added

* `models.WorkflowTriggerHistoryProperties` was added

* `models.AzureResourceManagerFoundationsArmTagsProperty` was added

* `models.As2OneWayAgreement` was added

* `models.IntegrationServiceEnvironmentManagedApiProperties` was added

* `models.Origin` was added

* `models.AzureResourceManagerCommonTypesTrackedResourceUpdate` was added

* `models.As2AgreementContent` was added

#### `models.WorkflowVersion` was modified

* `properties()` was added
* `systemData()` was added

#### `models.RequestHistory` was modified

* `systemData()` was added

#### `models.AgreementContent` was modified

* `withAS2(models.As2AgreementContent)` was added

#### `models.ExpressionRoot` was modified

* `withValue(java.util.Map)` was added

#### `models.RequestHistoryProperties` was modified

* `provisioningState()` was added

#### `models.IntegrationAccountSchema` was modified

* `properties()` was added
* `systemData()` was added

#### `models.IntegrationAccountCertificate$Definition` was modified

* `withProperties(models.IntegrationAccountCertificateProperties)` was added

#### `models.Response` was modified

* `withHeaders(java.util.Map)` was added

#### `models.IntegrationServiceEnvironments` was modified

* `get(java.lang.String)` was added
* `getWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `restart(java.lang.String)` was added
* `delete(java.lang.String)` was added
* `deleteWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `integrationServiceEnvironmentNetworkHealthGetWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `list(java.lang.String,com.azure.core.util.Context)` was added
* `listBySubscription()` was added
* `restartWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `integrationServiceEnvironmentNetworkHealthGet(java.lang.String)` was added
* `listBySubscription(java.lang.Integer,com.azure.core.util.Context)` was added
* `list(java.lang.String)` was added

#### `models.KeyVaultKeyCollection` was modified

* `innerModel()` was added

#### `models.AssemblyCollection` was modified

* `innerModel()` was added

#### `models.WorkflowTriggers` was modified

* `run(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.WorkflowTriggerHistory` was modified

* `systemData()` was added
* `properties()` was added

#### `models.ArtifactProperties` was modified

* `withMetadata(java.util.Map)` was added

#### `models.IntegrationAccountCertificate$Update` was modified

* `withProperties(models.IntegrationAccountCertificateProperties)` was added

#### `models.WorkflowOutputParameter` was modified

* `withMetadata(java.util.Map)` was added
* `withValue(java.util.Map)` was added

#### `models.IntegrationAccount$Definition` was modified

* `withProperties(models.IntegrationAccountProperties)` was added

#### `models.WorkflowTriggerHistories` was modified

* `resubmit(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.IntegrationAccountCertificate` was modified

* `systemData()` was added
* `properties()` was added

#### `models.IntegrationServiceEnvironment` was modified

* `systemData()` was added

#### `models.IntegrationAccountAgreement$Update` was modified

* `withProperties(models.IntegrationAccountAgreementProperties)` was added

#### `models.ApiOperationPropertiesDefinition` was modified

* `provisioningState()` was added

#### `models.IntegrationAccount` was modified

* `listKeyVaultKeysWithResponse(models.ListKeyVaultKeysDefinition,com.azure.core.util.Context)` was added
* `systemData()` was added
* `properties()` was added

#### `models.IntegrationServiceEnvironmentManagedApi$Definition` was modified

* `withExistingIntegrationServiceEnvironment(java.lang.String)` was added
* `withProperties(models.IntegrationServiceEnvironmentManagedApiProperties)` was added

#### `models.WorkflowParameter` was modified

* `withMetadata(java.util.Map)` was added
* `withValue(java.util.Map)` was added

#### `models.IntegrationAccounts` was modified

* `listKeyVaultKeysWithResponse(java.lang.String,java.lang.String,models.ListKeyVaultKeysDefinition,com.azure.core.util.Context)` was added

#### `models.WorkflowRun` was modified

* `properties()` was added
* `systemData()` was added

#### `models.WorkflowRunAction` was modified

* `properties()` was added
* `systemData()` was added

#### `models.IntegrationAccountSession$Update` was modified

* `withProperties(models.IntegrationAccountSessionProperties)` was added

#### `models.IntegrationAccountSchema$Update` was modified

* `withProperties(models.IntegrationAccountSchemaProperties)` was added

#### `models.IntegrationAccountPartner$Definition` was modified

* `withProperties(models.IntegrationAccountPartnerProperties)` was added

#### `models.Operation` was modified

* `actionType()` was added
* `isDataAction()` was added

#### `models.IntegrationAccountMap$Definition` was modified

* `withProperties(models.IntegrationAccountMapProperties)` was added

#### `models.IntegrationAccount$Update` was modified

* `withProperties(models.IntegrationAccountProperties)` was added

#### `models.WorkflowVersions` was modified

* `listCallbackUrl(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was added
* `listCallbackUrlWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,models.GetCallbackUrlParameters,com.azure.core.util.Context)` was added

#### `models.Expression` was modified

* `withValue(java.util.Map)` was added

#### `models.IntegrationAccountAgreement$Definition` was modified

* `withProperties(models.IntegrationAccountAgreementProperties)` was added

#### `models.IntegrationAccountSession` was modified

* `properties()` was added
* `systemData()` was added

#### `models.WorkflowRunActionRepetitionDefinition` was modified

* `properties()` was added
* `systemData()` was added

#### `models.ArtifactContentPropertiesDefinition` was modified

* `withMetadata(java.util.Map)` was added
* `withContent(java.util.Map)` was added

#### `models.Workflow$Definition` was modified

* `withProperties(models.WorkflowProperties)` was added

#### `models.IntegrationAccountPartner` was modified

* `systemData()` was added
* `properties()` was added

#### `models.Request` was modified

* `withHeaders(java.util.Map)` was added

#### `models.AssemblyProperties` was modified

* `provisioningState()` was added
* `withMetadata(java.util.Map)` was added
* `withContent(java.util.Map)` was added

#### `models.IntegrationAccountSession$Definition` was modified

* `withProperties(models.IntegrationAccountSessionProperties)` was added

#### `models.Workflow` was modified

* `systemData()` was added
* `properties()` was added

#### `models.OperationResult` was modified

* `status()` was added
* `withError(java.util.Map)` was added
* `withExecutionMode(models.FlowRunExecutionMode)` was added
* `withCanResubmit(java.lang.Boolean)` was added
* `executionMode()` was added
* `canResubmit()` was added

#### `models.IntegrationAccountMap` was modified

* `properties()` was added
* `systemData()` was added

#### `models.WorkflowRunActions` was modified

* `listExpressionTracesWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.IntegrationAccountSchema$Definition` was modified

* `withProperties(models.IntegrationAccountSchemaProperties)` was added

#### `LogicManager` was modified

* `batchConfigurations()` was added
* `workflowRunActionRequestHistoriesOperations()` was added
* `workflowsOperations()` was added
* `assemblyDefinitions()` was added
* `templates()` was added
* `workflowRunOperationsOperations()` was added
* `workflowRunsOperations()` was added
* `workflowRunActionRepetitionDefinitions()` was added
* `workflowRunActionScopeRepetitionsOperations()` was added
* `requestHistories()` was added
* `apiOperations()` was added

#### `models.SwaggerSchema` was modified

* `withExample(java.util.Map)` was added
* `withAdditionalProperties(java.util.Map)` was added

#### `models.ApiOperation` was modified

* `systemData()` was added

#### `models.IntegrationAccountPartner$Update` was modified

* `withProperties(models.IntegrationAccountPartnerProperties)` was added

#### `models.TrackingEvent` was modified

* `withRecord(java.util.Map)` was added

#### `models.IntegrationServiceEnvironmentManagedApi$Update` was modified

* `withProperties(models.IntegrationServiceEnvironmentManagedApiProperties)` was added

#### `models.BatchConfigurationCollection` was modified

* `innerModel()` was added

#### `models.ExpressionTraces` was modified

* `innerModel()` was added

#### `models.WorkflowTrigger` was modified

* `systemData()` was added
* `properties()` was added

#### `models.IntegrationServiceEnvironmentManagedApis` was modified

* `get(java.lang.String,java.lang.String)` was added
* `getWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `deleteByResourceGroup(java.lang.String,java.lang.String)` was added
* `delete(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `list(java.lang.String,com.azure.core.util.Context)` was added
* `list(java.lang.String)` was added

#### `models.IntegrationServiceEnvironmentManagedApi` was modified

* `properties()` was added
* `systemData()` was added

#### `models.AssemblyDefinition` was modified

* `systemData()` was added

#### `models.SwaggerCustomDynamicTreeParameter` was modified

* `withValue(java.util.Map)` was added

#### `models.OperationResultProperties` was modified

* `withError(java.util.Map)` was added

#### `models.IntegrationAccountMap$Update` was modified

* `withProperties(models.IntegrationAccountMapProperties)` was added

#### `models.ApiReference` was modified

* `withSwagger(java.util.Map)` was added

#### `models.BatchConfigurationProperties` was modified

* `withMetadata(java.util.Map)` was added
* `provisioningState()` was added

#### `models.IntegrationAccountAgreement` was modified

* `properties()` was added
* `systemData()` was added

#### `models.BatchConfiguration` was modified

* `systemData()` was added

#### `models.KeyVaultKey` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `validate()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withKid(java.lang.String)` was added
* `withAttributes(models.KeyVaultKeyAttributes)` was added

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
