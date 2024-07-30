# Release History

## 1.0.0-beta.1 (2024-07-30)

- Azure Resource Manager Qumulo client library for Java. This package contains Microsoft Azure SDK for Qumulo Management SDK. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.OperationListResult` was removed

* `models.FileSystemResourceListResult` was removed

* `models.StorageSku` was removed

#### `models.ProvisioningState` was modified

* `valueOf(java.lang.String)` was removed
* `models.ProvisioningState[] values()` -> `java.util.Collection values()`
* `toString()` was removed

#### `models.FileSystemResource` was modified

* `initialCapacity()` was removed
* `models.StorageSku storageSku()` -> `java.lang.String storageSku()`

#### `models.ManagedServiceIdentity` was modified

* `java.util.UUID principalId()` -> `java.lang.String principalId()`
* `java.util.UUID tenantId()` -> `java.lang.String tenantId()`

#### `models.UserAssignedIdentity` was modified

* `java.util.UUID clientId()` -> `java.lang.String clientId()`
* `java.util.UUID principalId()` -> `java.lang.String principalId()`

#### `models.MarketplaceSubscriptionStatus` was modified

* `valueOf(java.lang.String)` was removed
* `models.MarketplaceSubscriptionStatus[] values()` -> `java.util.Collection values()`
* `toString()` was removed

#### `models.FileSystemResourceUpdateProperties` was modified

* `withPrivateIPs(java.util.List)` was removed
* `clusterLoginUrl()` was removed
* `privateIPs()` was removed
* `withClusterLoginUrl(java.lang.String)` was removed

#### `QumuloManager` was modified

* `fluent.QumuloStorage serviceClient()` -> `fluent.StorageClient serviceClient()`

#### `models.FileSystemResource$Definition` was modified

* `withStorageSku(models.StorageSku)` was removed
* `withInitialCapacity(int)` was removed

### Features Added

* `implementation.models.FileSystemResourceListResult` was added

* `implementation.models.OperationListResult` was added

#### `models.FileSystemResourceUpdate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ManagedServiceIdentity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UserAssignedIdentity` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FileSystemResourceUpdateProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UserDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MarketplaceDetails` was modified

* `termUnit()` was added
* `withTermUnit(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FileSystemResource$Definition` was modified

* `withStorageSku(java.lang.String)` was added

## 1.0.0 (2023-05-25)

- Azure Resource Manager Qumulo client library for Java. This package contains Microsoft Azure SDK for Qumulo Management SDK.  Package tag package-2022-10. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

## 1.0.0-beta.2 (2023-05-22)

- Azure Resource Manager Qumulo client library for Java. This package contains Microsoft Azure SDK for Qumulo Management SDK.  Package tag package-2022-10. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

## 1.0.0-beta.1 (2023-04-18)

- Azure Resource Manager Qumulo client library for Java. This package contains Microsoft Azure SDK for Qumulo Management SDK.  Package tag package-2022-10-12-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
