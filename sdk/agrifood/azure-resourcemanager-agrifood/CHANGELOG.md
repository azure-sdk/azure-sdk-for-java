# Release History

## 1.0.0-beta.1 (2024-06-29)

- Azure Resource Manager AgriFood client library for Java. This package contains Microsoft Azure SDK for AgriFood Management SDK. APIs documentation for Microsoft Azure Data Manager for Agriculture Service. Package tag package-preview-2023-06. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.Locations` was removed

* `models.FarmBeats$Update` was removed

* `models.FarmBeatsExtension` was removed

* `models.FarmBeatsExtensions` was removed

* `models.FarmBeatsUpdateProperties` was removed

* `models.FarmBeats` was removed

* `models.FarmBeats$Definition` was removed

* `models.FarmBeatsUpdateRequestModel` was removed

* `models.FarmBeats$UpdateStages` was removed

* `models.FarmBeatsExtensionListResponse` was removed

* `models.FarmBeatsProperties` was removed

* `models.FarmBeats$DefinitionStages` was removed

* `models.FarmBeatsListResponse` was removed

* `models.FarmBeatsModels` was removed

#### `AgriFoodManager` was modified

* `locations()` was removed
* `farmBeatsExtensions()` was removed
* `farmBeatsModels()` was removed

#### `models.PrivateEndpointConnections` was modified

* `com.azure.core.http.rest.PagedIterable listByResource(java.lang.String,java.lang.String)` -> `models.PrivateEndpointConnectionListResult listByResource(java.lang.String,java.lang.String)`
* `listByResource(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.PrivateEndpointConnectionListResult` was modified

* `validate()` was removed
* `java.util.List value()` -> `java.util.List value()`
* `withValue(java.util.List)` was removed

#### `models.Identity` was modified

* `java.lang.String tenantId()` -> `java.util.UUID tenantId()`
* `java.lang.String principalId()` -> `java.util.UUID principalId()`

#### `models.PrivateLinkResources` was modified

* `com.azure.core.http.rest.PagedIterable listByResource(java.lang.String,java.lang.String)` -> `models.PrivateLinkResourceListResult listByResource(java.lang.String,java.lang.String)`
* `listByResource(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.Extensions` was modified

* `updateWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listByFarmBeats(java.lang.String,java.lang.String)` was removed
* `listByFarmBeats(java.lang.String,java.lang.String,java.util.List,java.util.List,java.lang.Integer,java.lang.String,com.azure.core.util.Context)` was removed
* `update(java.lang.String,java.lang.String,java.lang.String)` was removed
* `create(java.lang.String,java.lang.String,java.lang.String)` was removed
* `createWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.PrivateLinkResourceListResult` was modified

* `validate()` was removed
* `java.util.List value()` -> `java.util.List value()`
* `withValue(java.util.List)` was removed

### Features Added

* `models.DataManagerForAgricultureExtension` was added

* `models.DataConnector` was added

* `models.Solution$Definition` was added

* `models.SolutionListResponse` was added

* `models.DataManagerForAgricultureListResponse` was added

* `models.OAuthClientCredentials` was added

* `models.AuthCredentials` was added

* `models.ArmAsyncOperationError` was added

* `models.DataManagerForAgriculture$Update` was added

* `models.MarketplaceOfferDetails` was added

* `models.ApiKeyAuthCredentials` was added

* `models.DataManagerForAgriculture$DefinitionStages` was added

* `models.DataManagerForAgricultureSolution` was added

* `models.DataManagerForAgricultureExtensions` was added

* `models.SolutionProperties` was added

* `models.ExtensionInstallationRequest` was added

* `models.Extension$UpdateStages` was added

* `models.DataManagerForAgricultureUpdateProperties` was added

* `models.DataConnectors` was added

* `models.DataManagerForAgricultureResources` was added

* `models.DataManagerForAgricultureSolutionProperties` was added

* `models.DataConnector$UpdateStages` was added

* `models.DataConnector$Definition` was added

* `models.AuthCredentialsKind` was added

* `models.DataManagerForAgriculture$UpdateStages` was added

* `models.Solution$DefinitionStages` was added

* `models.SolutionsDiscoverabilities` was added

* `models.CheckNameAvailabilities` was added

* `models.DataConnector$DefinitionStages` was added

* `models.Extension$Definition` was added

* `models.DataConnector$Update` was added

* `models.OperationResults` was added

* `models.Solutions` was added

* `models.DataManagerForAgricultureSolutionListResponse` was added

* `models.KeyVaultProperties` was added

* `models.DataManagerForAgricultureUpdateRequestModel` was added

* `models.DataManagerForAgricultureExtensionProperties` was added

* `models.DataConnectorListResponse` was added

* `models.DataManagerForAgriculture` was added

* `models.ApiProperties` was added

* `models.DataManagerForAgricultureExtensionListResponse` was added

* `models.Solution` was added

* `models.Extension$Update` was added

* `models.DataConnectorProperties` was added

* `models.Solution$Update` was added

* `models.DataManagerForAgriculture$Definition` was added

* `models.Extension$DefinitionStages` was added

* `models.Solution$UpdateStages` was added

#### `models.Extension` was modified

* `refresh(com.azure.core.util.Context)` was added
* `additionalApiProperties()` was added
* `systemData()` was added
* `update()` was added
* `refresh()` was added
* `resourceGroupName()` was added

#### `models.ExtensionListResponse` was modified

* `skipToken()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withSkipToken(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CheckNameAvailabilityRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `AgriFoodManager` was modified

* `solutionsDiscoverabilities()` was added
* `solutions()` was added
* `dataManagerForAgricultureResources()` was added
* `dataManagerForAgricultureExtensions()` was added
* `checkNameAvailabilities()` was added
* `operationResults()` was added
* `dataConnectors()` was added

#### `models.PrivateEndpointConnections` was modified

* `listByResourceWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.DetailedInformation` was modified

* `apiDocsLink()` was added
* `apiType()` was added
* `apiDefaultInputParameters()` was added
* `withApiDefaultInputParameters(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withApiDocsLink(java.lang.String)` was added
* `withApiType(java.lang.String)` was added

#### `models.PrivateEndpointConnectionListResult` was modified

* `innerModel()` was added

#### `models.OperationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SensorIntegration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ArmAsyncOperation` was modified

* `error()` was added

#### `models.PrivateEndpoint` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PrivateEndpointConnection` was modified

* `groupIds()` was added

#### `models.Identity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrivateLinkResources` was modified

* `listByResourceWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.Extensions` was modified

* `getByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `deleteByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `listByDataManagerForAgriculture(java.lang.String,java.lang.String)` was added
* `listByDataManagerForAgriculture(java.lang.String,java.lang.String,java.util.List,java.util.List,java.lang.Integer,java.lang.String,com.azure.core.util.Context)` was added
* `deleteById(java.lang.String)` was added
* `define(java.lang.String)` was added
* `getById(java.lang.String)` was added

#### `models.PrivateLinkServiceConnectionState` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationDisplay` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UnitSystemsInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrivateLinkResourceListResult` was modified

* `innerModel()` was added

## 1.0.0-beta.1 (2022-09-07)

- Azure Resource Manager AgriFood client library for Java. This package contains Microsoft Azure SDK for AgriFood Management SDK. APIs documentation for Azure AgFoodPlatform Resource Provider Service. Package tag package-preview-2021-09. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
