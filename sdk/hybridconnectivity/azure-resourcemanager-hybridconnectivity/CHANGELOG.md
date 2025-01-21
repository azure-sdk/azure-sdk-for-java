# Release History

## 1.0.0-beta.1 (2025-01-21)

- Azure Resource Manager Hybrid Connectivity client library for Java. This package contains Microsoft Azure SDK for Hybrid Connectivity Management SDK. REST API for public clouds. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.EndpointProperties` was removed

#### `models.ListIngressGatewayCredentialsRequest` was removed

#### `models.ServiceConfigurations` was removed

#### `models.EndpointResource` was removed

#### `models.EndpointsList` was removed

#### `models.ManagedProxyRequest` was removed

#### `models.ServiceConfigurationResource` was removed

#### `models.OperationListResult` was removed

#### `models.EndpointResource$Definition` was removed

#### `models.ProvisioningState` was removed

#### `models.Type` was removed

#### `models.ServiceName` was removed

#### `models.EndpointResource$Update` was removed

#### `models.Origin` was removed

#### `models.ServiceConfigurationList` was removed

#### `models.Operations` was removed

#### `models.ActionType` was removed

#### `models.Endpoints` was removed

#### `models.ServiceConfigurationResource$UpdateStages` was removed

#### `models.ManagedProxyResource` was removed

#### `models.ServiceConfigurationResource$Update` was removed

#### `models.EndpointResource$DefinitionStages` was removed

#### `models.OperationDisplay` was removed

#### `models.EndpointAccessResource` was removed

#### `models.Operation` was removed

#### `models.ServiceConfigurationResource$Definition` was removed

#### `models.ServiceConfigurationResourcePatch` was removed

#### `models.ServiceConfigurationResource$DefinitionStages` was removed

#### `models.ListCredentialsRequest` was removed

#### `models.IngressGatewayResource` was removed

#### `models.EndpointResource$UpdateStages` was removed

#### `HybridConnectivityManager` was modified

* `fluent.HybridConnectivityManagementApi serviceClient()` -> `fluent.HybridConnectivityMgmtClient serviceClient()`
* `serviceConfigurations()` was removed
* `endpoints()` was removed
* `operations()` was removed

### Features Added

* `models.PublicCloudConnectorProperties` was added

* `models.SolutionConfiguration$Update` was added

* `models.SolutionConfiguration` was added

* `models.PublicCloudConnector$Definition` was added

* `models.SolutionTypes` was added

* `implementation.models.PublicCloudConnectorListResult` was added

* `models.GenerateAwsTemplateRequest` was added

* `models.PublicCloudConnector` was added

* `models.PublicCloudConnector$DefinitionStages` was added

* `models.PublicCloudConnector$Update` was added

* `models.SolutionSettings` was added

* `models.SolutionTypeProperties` was added

* `models.PostResponse` was added

* `models.Inventories` was added

* `models.SolutionConfiguration$Definition` was added

* `models.OperationStatusResult` was added

* `models.PublicCloudConnector$UpdateStages` was added

* `models.SolutionConfiguration$DefinitionStages` was added

* `models.SolutionTypeSettingsProperties` was added

* `models.SolutionTypeResource` was added

* `models.AwsCloudProfile` was added

* `implementation.models.SolutionConfigurationListResult` was added

* `implementation.models.SolutionTypeResourceListResult` was added

* `models.InventoryResource` was added

* `models.SolutionTypeSettings` was added

* `models.InventoryProperties` was added

* `implementation.models.InventoryResourceListResult` was added

* `models.SolutionConfigurationStatus` was added

* `models.SolutionConfigurations` was added

* `models.SolutionConfigurationProperties` was added

* `models.ResourceProvisioningState` was added

* `models.HostType` was added

* `models.PublicCloudConnectors` was added

* `models.CloudNativeType` was added

* `models.GenerateAwsTemplates` was added

* `models.SolutionConfiguration$UpdateStages` was added

#### `HybridConnectivityManager` was modified

* `publicCloudConnectors()` was added
* `solutionTypes()` was added
* `inventories()` was added
* `generateAwsTemplates()` was added
* `solutionConfigurations()` was added

## 1.1.0 (2024-12-11)

- Azure Resource Manager HybridConnectivity client library for Java. This package contains Microsoft Azure SDK for HybridConnectivity Management SDK. REST API for Hybrid Connectivity. Package tag package-2023-03. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### Serialization/Deserialization change

- `Jackson` is removed from dependency and no longer supported.

##### Migration Guide

If you are using `Jackson`/`ObjectMapper` for manual serialization/deserialization, configure your `ObjectMapper` for backward compatibility:
```java
objectMapper.registerModule(com.azure.core.serializer.json.jackson.JacksonJsonProvider.getJsonSerializableDatabindModule());
```

## 1.0.0 (2023-09-22)

- Azure Resource Manager HybridConnectivity client library for Java. This package contains Microsoft Azure SDK for HybridConnectivity Management SDK. REST API for Hybrid Connectivity. Package tag package-2023-03. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.ServiceConfigurationResource` was modified

* `systemData()` was added

## 1.0.0-beta.1 (2023-08-30)

- Azure Resource Manager HybridConnectivity client library for Java. This package contains Microsoft Azure SDK for HybridConnectivity Management SDK. REST API for Hybrid Connectivity. Package tag package-2023-03. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
