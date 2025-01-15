# Release History

## 1.0.0-beta.1 (2025-01-15)

- Azure Resource Manager Hybrid Connectivity client library for Java. This package contains Microsoft Azure SDK for Hybrid Connectivity Management SDK. REST API for public clouds. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.EndpointProperties` was removed

#### `models.EndpointsList` was removed

#### `models.Type` was removed

#### `models.EndpointResource$Update` was removed

#### `models.ServiceConfigurationResource$UpdateStages` was removed

#### `models.ServiceConfigurationResource$Update` was removed

#### `models.EndpointResource$DefinitionStages` was removed

#### `models.ServiceConfigurationResource$DefinitionStages` was removed

#### `models.IngressGatewayResource` was removed

#### `models.ListIngressGatewayCredentialsRequest` was removed

#### `models.EndpointResource` was removed

#### `models.ServiceConfigurationResource` was removed

#### `models.OperationListResult` was removed

#### `models.EndpointResource$Definition` was removed

#### `models.ProvisioningState` was removed

#### `models.ServiceName` was removed

#### `models.ServiceConfigurationList` was removed

#### `models.ManagedProxyResource` was removed

#### `models.EndpointAccessResource` was removed

#### `models.ServiceConfigurationResource$Definition` was removed

#### `models.EndpointResource$UpdateStages` was removed

#### `models.ServiceConfigurations` was modified

* `models.ServiceConfigurationResource getById(java.lang.String)` -> `models.HybridConnectivityServiceConfiguration getById(java.lang.String)`
* `models.ServiceConfigurationResource get(java.lang.String,java.lang.String,java.lang.String)` -> `models.HybridConnectivityServiceConfiguration get(java.lang.String,java.lang.String,java.lang.String)`
* `models.ServiceConfigurationResource$DefinitionStages$Blank define(java.lang.String)` -> `models.HybridConnectivityServiceConfiguration$DefinitionStages$Blank define(java.lang.String)`

#### `models.ManagedProxyRequest` was modified

* `withServiceName(models.ServiceName)` was removed
* `models.ServiceName serviceName()` -> `models.HybridConnectivityServiceName serviceName()`

#### `HybridConnectivityManager` was modified

* `fluent.HybridConnectivityManagementApi serviceClient()` -> `fluent.HybridConnectivityMgmtClient serviceClient()`

#### `models.Endpoints` was modified

* `models.EndpointResource getById(java.lang.String)` -> `models.HybridConnectivityEndpoint getById(java.lang.String)`
* `models.ManagedProxyResource listManagedProxyDetails(java.lang.String,java.lang.String,models.ManagedProxyRequest)` -> `models.ManagedProxyAsset listManagedProxyDetails(java.lang.String,java.lang.String,models.ManagedProxyRequest)`
* `models.EndpointAccessResource listCredentials(java.lang.String,java.lang.String)` -> `models.TargetResourceEndpointAccess listCredentials(java.lang.String,java.lang.String)`
* `models.IngressGatewayResource listIngressGatewayCredentials(java.lang.String,java.lang.String)` -> `models.IngressGatewayAsset listIngressGatewayCredentials(java.lang.String,java.lang.String)`
* `listIngressGatewayCredentialsWithResponse(java.lang.String,java.lang.String,java.lang.Long,models.ListIngressGatewayCredentialsRequest,com.azure.core.util.Context)` was removed
* `models.EndpointResource$DefinitionStages$Blank define(java.lang.String)` -> `models.HybridConnectivityEndpoint$DefinitionStages$Blank define(java.lang.String)`
* `models.EndpointResource get(java.lang.String,java.lang.String)` -> `models.HybridConnectivityEndpoint get(java.lang.String,java.lang.String)`

#### `models.ListCredentialsRequest` was modified

* `models.ServiceName serviceName()` -> `models.HybridConnectivityServiceName serviceName()`
* `withServiceName(models.ServiceName)` was removed

### Features Added

* `models.HybridConnectivityServiceConfiguration$UpdateStages` was added

* `models.SolutionConfiguration` was added

* `models.HybridConnectivityEndpoint$Update` was added

* `models.GenerateAwsTemplateRequest` was added

* `models.PublicCloudConnector` was added

* `models.SolutionSettings` was added

* `models.HybridConnectivityEndpointProperties` was added

* `models.Inventories` was added

* `models.SolutionConfiguration$Definition` was added

* `implementation.models.ServiceConfigurationList` was added

* `models.OperationStatusResult` was added

* `models.SolutionTypeSettingsProperties` was added

* `models.SolutionTypeResource` was added

* `models.AwsCloudProfile` was added

* `implementation.models.SolutionConfigurationListResult` was added

* `implementation.models.SolutionTypeResourceListResult` was added

* `models.HybridConnectivityEndpoint$DefinitionStages` was added

* `models.InventoryResource` was added

* `implementation.models.EndpointsList` was added

* `models.SolutionTypeSettings` was added

* `models.SolutionConfigurationStatus` was added

* `models.HybridConnectivityEndpoint$UpdateStages` was added

* `models.SolutionConfigurations` was added

* `models.SolutionConfigurationProperties` was added

* `models.ResourceProvisioningState` was added

* `models.HybridConnectivityEndpoint` was added

* `models.HybridConnectivityProvisioningState` was added

* `models.HostType` was added

* `models.HybridConnectivityServiceConfiguration$Definition` was added

* `models.PublicCloudConnectors` was added

* `models.PublicCloudConnectorProperties` was added

* `models.SolutionConfiguration$Update` was added

* `models.PublicCloudConnector$Definition` was added

* `models.SolutionTypes` was added

* `implementation.models.PublicCloudConnectorListResult` was added

* `models.ManagedProxyAsset` was added

* `models.HybridConnectivityServiceConfiguration$Update` was added

* `models.PublicCloudConnector$DefinitionStages` was added

* `models.PublicCloudConnector$Update` was added

* `models.SolutionTypeProperties` was added

* `models.PostResponse` was added

* `models.TargetResourceEndpointAccess` was added

* `models.PublicCloudConnector$UpdateStages` was added

* `models.SolutionConfiguration$DefinitionStages` was added

* `models.HybridConnectivityEndpointType` was added

* `models.HybridConnectivityEndpoint$Definition` was added

* `models.HybridConnectivityServiceConfiguration` was added

* `models.HybridConnectivityServiceName` was added

* `implementation.models.OperationListResult` was added

* `models.InventoryProperties` was added

* `implementation.models.InventoryResourceListResult` was added

* `models.HybridConnectivityServiceConfiguration$DefinitionStages` was added

* `models.IngressGatewayAsset` was added

* `models.CloudNativeType` was added

* `models.GenerateAwsTemplates` was added

* `models.SolutionConfiguration$UpdateStages` was added

#### `models.ManagedProxyRequest` was modified

* `withServiceName(models.HybridConnectivityServiceName)` was added

#### `HybridConnectivityManager` was modified

* `publicCloudConnectors()` was added
* `solutionTypes()` was added
* `generateAwsTemplates()` was added
* `inventories()` was added
* `solutionConfigurations()` was added

#### `models.Endpoints` was modified

* `listIngressGatewayCredentialsWithResponse(java.lang.String,java.lang.String,java.lang.Long,com.azure.core.util.Context)` was added

#### `models.ListCredentialsRequest` was modified

* `withServiceName(models.HybridConnectivityServiceName)` was added

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
