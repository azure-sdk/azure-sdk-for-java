# Release History

## 1.0.0-beta.1 (2025-05-07)

- Azure Resource Manager healthdataaiservices client library for Java. This package contains Microsoft Azure SDK for healthdataaiservices Management SDK.  Package tag package-2024-09-20. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `implementation.models.OperationListResult` was removed

#### `implementation.models.PrivateLinkResourceListResult` was removed

#### `implementation.models.PrivateEndpointConnectionResourceListResult` was removed

#### `HealthDataAIServicesManager` was removed

#### `HealthDataAIServicesManager$Configurable` was removed

#### `models.PrivateEndpointConnectionProperties` was removed

#### `implementation.models.DeidServiceListResult` was removed

#### `models.PrivateEndpointConnection` was modified

* `properties()` was removed

#### `models.PrivateEndpointConnectionResource$Definition` was modified

* `withProperties(models.PrivateEndpointConnectionProperties)` was removed

#### `models.PrivateEndpointConnectionResource` was modified

* `models.PrivateEndpointConnectionProperties properties()` -> `fluent.models.PrivateEndpointConnectionProperties properties()`

#### `models.UserAssignedIdentity` was modified

* `java.lang.String clientId()` -> `java.util.UUID clientId()`
* `java.lang.String principalId()` -> `java.util.UUID principalId()`

#### `models.ManagedServiceIdentity` was modified

* `java.lang.String principalId()` -> `java.util.UUID principalId()`
* `java.lang.String tenantId()` -> `java.util.UUID tenantId()`

### Features Added

* `models.OperationListResult` was added

* `models.DeidServiceListResult` was added

* `HealthdataaiservicesManager$Configurable` was added

* `models.PrivateEndpointConnectionResourceListResult` was added

* `models.PrivateLinkResourceListResult` was added

* `HealthdataaiservicesManager` was added

#### `models.PrivateEndpointConnection` was modified

* `groupIds()` was added
* `privateLinkServiceConnectionState()` was added
* `withPrivateEndpoint(models.PrivateEndpoint)` was added
* `privateEndpoint()` was added
* `withPrivateLinkServiceConnectionState(models.PrivateLinkServiceConnectionState)` was added
* `provisioningState()` was added

#### `models.PrivateEndpointConnectionResource$Definition` was modified

* `withProperties(fluent.models.PrivateEndpointConnectionProperties)` was added

#### `models.PrivateLinkResourceProperties` was modified

* `withRequiredZoneNames(java.util.List)` was added

## 1.0.0 (2024-11-21)

- Azure Resource Manager Health Data AI Services client library for Java. This package contains Microsoft Azure SDK for Health Data AI Services Management SDK. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

- The first stable release for the azure-resourcemanager-healthdataaiservices Java SDK.

## 1.0.0-beta.1 (2024-08-14)

- Azure Resource Manager Health Data AI Services client library for Java. This package contains Microsoft Azure SDK for Health Data AI Services Management SDK. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

- Initial release for the azure-resourcemanager-healthdataaiservices Java SDK.
