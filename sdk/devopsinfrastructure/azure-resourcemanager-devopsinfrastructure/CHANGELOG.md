# Release History

## 1.0.0-beta.1 (2025-01-28)

- Azure Resource Manager DevOpsInfrastructure client library for Java. This package contains Microsoft Azure SDK for DevOpsInfrastructure Management SDK.  Package tag package-stable-2025-01-21. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `implementation.models.PagedQuota` was removed

#### `implementation.models.ImageVersionListResult` was removed

#### `implementation.models.OperationListResult` was removed

#### `implementation.models.ResourceDetailsObjectListResult` was removed

#### `implementation.models.PoolListResult` was removed

#### `implementation.models.ResourceSkuListResult` was removed

#### `models.ResourcePredictions` was removed

#### `models.StatelessAgentProfile` was modified

* `withResourcePredictions(models.ResourcePredictions)` was removed

#### `models.ManagedServiceIdentity` was modified

* `java.lang.String principalId()` -> `java.util.UUID principalId()`
* `java.lang.String tenantId()` -> `java.util.UUID tenantId()`

#### `models.AgentProfile` was modified

* `models.ResourcePredictions resourcePredictions()` -> `java.lang.Object resourcePredictions()`
* `withResourcePredictions(models.ResourcePredictions)` was removed

#### `models.Stateful` was modified

* `withResourcePredictions(models.ResourcePredictions)` was removed

#### `models.UserAssignedIdentity` was modified

* `java.lang.String clientId()` -> `java.util.UUID clientId()`
* `java.lang.String principalId()` -> `java.util.UUID principalId()`

#### `DevOpsInfrastructureManager` was modified

* `fluent.DevOpsInfrastructureManagementClient serviceClient()` -> `fluent.ManagedDevOpsInfrastructure serviceClient()`

### Features Added

* `models.CheckNameAvailability` was added

* `models.ResourceDetailsObjectListResult` was added

* `models.ImageVersionListResult` was added

* `models.PagedQuota` was added

* `models.CheckNameAvailabilityReason` was added

* `models.EphemeralType` was added

* `models.CheckNameAvailabilityResult` was added

* `models.DevOpsInfrastructureResourceType` was added

* `models.AvailabilityStatus` was added

* `models.CertificateStoreNameOption` was added

* `models.ResourceSkuListResult` was added

* `models.PoolListResult` was added

* `models.OperationListResult` was added

#### `models.ImageVersionProperties` was modified

* `withVersion(java.lang.String)` was added

#### `models.PoolImage` was modified

* `ephemeralType()` was added
* `withEphemeralType(models.EphemeralType)` was added

#### `models.ResourceDetailsObjectProperties` was modified

* `withImage(java.lang.String)` was added
* `withStatus(models.ResourceStatus)` was added
* `withImageVersion(java.lang.String)` was added

#### `models.QuotaName` was modified

* `withLocalizedValue(java.lang.String)` was added
* `withValue(java.lang.String)` was added

#### `models.ResourceSkuZoneDetails` was modified

* `withName(java.util.List)` was added
* `withCapabilities(java.util.List)` was added

#### `models.ResourceSkuLocationInfo` was modified

* `withLocation(java.lang.String)` was added
* `withZoneDetails(java.util.List)` was added
* `withZones(java.util.List)` was added

#### `models.ResourceSkuProperties` was modified

* `withResourceType(java.lang.String)` was added
* `withRestrictions(java.util.List)` was added
* `withSize(java.lang.String)` was added
* `withCapabilities(java.util.List)` was added
* `withLocations(java.util.List)` was added
* `withTier(java.lang.String)` was added
* `withFamily(java.lang.String)` was added
* `withLocationInfo(java.util.List)` was added

#### `models.StatelessAgentProfile` was modified

* `withResourcePredictions(java.lang.Object)` was added

#### `models.ResourceSkuRestrictions` was modified

* `withRestrictionInfo(models.ResourceSkuRestrictionInfo)` was added
* `withReasonCode(models.ResourceSkuRestrictionsReasonCode)` was added
* `withValues(java.util.List)` was added
* `withType(models.ResourceSkuRestrictionsType)` was added

#### `models.AgentProfile` was modified

* `withResourcePredictions(java.lang.Object)` was added

#### `models.Stateful` was modified

* `withResourcePredictions(java.lang.Object)` was added

#### `models.Organization` was modified

* `openAccess()` was added
* `withOpenAccess(java.lang.Boolean)` was added

#### `models.SecretsManagementSettings` was modified

* `withCertificateStoreName(models.CertificateStoreNameOption)` was added
* `certificateStoreName()` was added

#### `models.Pools` was modified

* `checkNameAvailability(models.CheckNameAvailability)` was added
* `checkNameAvailabilityWithResponse(models.CheckNameAvailability,com.azure.core.util.Context)` was added

#### `models.ResourceSkuCapabilities` was modified

* `withValue(java.lang.String)` was added
* `withName(java.lang.String)` was added

#### `models.ResourceSkuRestrictionInfo` was modified

* `withZones(java.util.List)` was added
* `withLocations(java.util.List)` was added

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
