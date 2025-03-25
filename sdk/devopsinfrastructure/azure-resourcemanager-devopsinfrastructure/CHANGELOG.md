# Release History

## 1.1.0-beta.1 (2025-03-25)

- Azure Resource Manager DevOps Infrastructure client library for Java. This package contains Microsoft Azure SDK for DevOps Infrastructure Management SDK. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.CheckNameAvailability` was added

* `models.CheckNameAvailabilityResult` was added

* `models.DevOpsInfrastructureResourceType` was added

* `models.CheckNameAvailabilityReason` was added

* `models.AvailabilityStatus` was added

* `models.CertificateStoreNameOption` was added

* `models.EphemeralType` was added

#### `models.PoolImage` was modified

* `withEphemeralType(models.EphemeralType)` was added
* `ephemeralType()` was added

#### `models.Organization` was modified

* `openAccess()` was added
* `withOpenAccess(java.lang.Boolean)` was added

#### `models.SecretsManagementSettings` was modified

* `withCertificateStoreName(models.CertificateStoreNameOption)` was added
* `certificateStoreName()` was added

#### `models.Pools` was modified

* `checkNameAvailabilityWithResponse(models.CheckNameAvailability,com.azure.core.util.Context)` was added
* `checkNameAvailability(models.CheckNameAvailability)` was added

## 1.0.0 (2024-11-21)

- Azure Resource Manager DevOps Infrastructure client library for Java. This package contains Microsoft Azure SDK for DevOps Infrastructure Management SDK. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### Serialization/Deserialization change

- `Jackson` is removed from dependency and no longer supported.

##### Migration Guide

If you are using `Jackson`/`ObjectMapper` for manual serialization/deserialization, configure your `ObjectMapper` for backward compatibility:
```java
objectMapper.registerModule(com.azure.core.serializer.json.jackson.JacksonJsonProvider.getJsonSerializableDatabindModule());
```

#### `implementation.models.QuotaListResult` was removed

#### `implementation.models.PagedOperation` was removed

#### `models.QuotaProperties` was removed

#### `models.StatelessAgentProfile` was modified

* `withResourcePredictions(java.lang.Object)` was removed

#### `models.SubscriptionUsages` was modified

* `listByLocation(java.lang.String)` was removed
* `listByLocation(java.lang.String,com.azure.core.util.Context)` was removed

#### `models.Quota` was modified

* `java.lang.String name()` -> `models.QuotaName name()`
* `systemData()` was removed
* `type()` was removed
* `properties()` was removed

#### `models.AgentProfile` was modified

* `java.lang.Object resourcePredictions()` -> `models.ResourcePredictions resourcePredictions()`
* `withResourcePredictions(java.lang.Object)` was removed

#### `models.Stateful` was modified

* `withResourcePredictions(java.lang.Object)` was removed

#### `models.UserAssignedIdentity` was modified

* `withClientId(java.lang.String)` was removed
* `withPrincipalId(java.lang.String)` was removed

#### `DevOpsInfrastructureManager` was modified

* `fluent.DevOpsInfrastructureClient serviceClient()` -> `fluent.DevOpsInfrastructureManagementClient serviceClient()`

### Features Added

* `implementation.models.PagedQuota` was added

* `implementation.models.OperationListResult` was added

* `models.ResourcePredictions` was added

#### `models.StatelessAgentProfile` was modified

* `withResourcePredictions(models.ResourcePredictions)` was added

#### `models.SubscriptionUsages` was modified

* `usages(java.lang.String)` was added
* `usages(java.lang.String,com.azure.core.util.Context)` was added

#### `models.Quota` was modified

* `limit()` was added
* `unit()` was added
* `currentValue()` was added

#### `models.AgentProfile` was modified

* `withResourcePredictions(models.ResourcePredictions)` was added

## 1.0.0-beta.1 (2024-05-23)

- Azure Resource Manager DevOps Infrastructure client library for Java. This package contains Microsoft Azure SDK for DevOps Infrastructure Management SDK. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
