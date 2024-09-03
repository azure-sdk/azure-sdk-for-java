# Release History

## 1.0.0-beta.1 (2024-09-03)

- Azure Resource Manager AzureSphere client library for Java. This package contains Microsoft Azure SDK for AzureSphere Management SDK. Azure Sphere resource management API. Package tag package-2024-04-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.CountDeviceResponse` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DeviceGroupProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ImageListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PagedDeviceInsight` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added

#### `models.OperationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CatalogUpdate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DeviceGroupListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added

#### `models.ProofOfPossessionNonceRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DeploymentListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DeviceProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CertificateProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProductListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added

#### `models.DeviceUpdate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CatalogListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DeviceListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DeploymentProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ListDeviceGroupsRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DeviceUpdateProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DeviceGroupUpdateProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CountElementsResponse` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.GenerateCapabilityImageRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CatalogProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProductUpdateProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Image$Update` was modified

* `withProperties(models.ImageProperties)` was added

#### `models.ProductUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ClaimDevicesRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DeviceGroupUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ImageProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CertificateListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Deployment$Update` was modified

* `withProperties(models.DeploymentProperties)` was added

#### `models.ProductProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

## 1.0.0 (2024-03-26)

- Azure Resource Manager AzureSphere client library for Java. This package contains Microsoft Azure SDK for AzureSphere Management SDK. Azure Sphere resource management API. Package tag package-2024-04-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.CountDeviceResponse` was modified

* `value()` was removed
* `innerModel()` was removed

#### `models.Product$Definition` was modified

* `withDescription(java.lang.String)` was removed

#### `models.ImageListResult` was modified

* `withNextLink(java.lang.String)` was removed

#### `models.PagedDeviceInsight` was modified

* `withNextLink(java.lang.String)` was removed

#### `AzureSphereManager` was modified

* `fluent.AzureSphereManagementClient serviceClient()` -> `fluent.AzureSphereMgmtClient serviceClient()`

#### `models.DeviceGroup$Update` was modified

* `withAllowCrashDumpsCollection(models.AllowCrashDumpCollection)` was removed
* `withDescription(java.lang.String)` was removed
* `withUpdatePolicy(models.UpdatePolicy)` was removed
* `withOsFeedType(models.OSFeedType)` was removed
* `withRegionalDataBoundary(models.RegionalDataBoundary)` was removed

#### `models.DeviceGroupListResult` was modified

* `withNextLink(java.lang.String)` was removed

#### `models.Catalogs` was modified

* `models.CountDeviceResponse countDevices(java.lang.String,java.lang.String)` -> `models.CountDevicesResponse countDevices(java.lang.String,java.lang.String)`

#### `models.DeploymentListResult` was modified

* `withNextLink(java.lang.String)` was removed

#### `models.Device$Definition` was modified

* `withDeviceId(java.lang.String)` was removed

#### `models.Catalog` was modified

* `provisioningState()` was removed
* `models.CountDeviceResponse countDevices()` -> `models.CountDevicesResponse countDevices()`

#### `models.Device` was modified

* `chipSku()` was removed
* `provisioningState()` was removed
* `lastAvailableOsVersion()` was removed
* `lastOsUpdateUtc()` was removed
* `deviceId()` was removed
* `lastUpdateRequestUtc()` was removed
* `lastInstalledOsVersion()` was removed

#### `models.Product$Update` was modified

* `withDescription(java.lang.String)` was removed

#### `models.ProductListResult` was modified

* `withNextLink(java.lang.String)` was removed

#### `models.DeviceGroup$Definition` was modified

* `withAllowCrashDumpsCollection(models.AllowCrashDumpCollection)` was removed
* `withDescription(java.lang.String)` was removed
* `withUpdatePolicy(models.UpdatePolicy)` was removed
* `withRegionalDataBoundary(models.RegionalDataBoundary)` was removed
* `withOsFeedType(models.OSFeedType)` was removed

#### `models.DeviceGroup` was modified

* `osFeedType()` was removed
* `models.CountDeviceResponse countDevices()` -> `models.CountDevicesResponse countDevices()`
* `provisioningState()` was removed
* `hasDeployment()` was removed
* `allowCrashDumpsCollection()` was removed
* `regionalDataBoundary()` was removed
* `description()` was removed
* `updatePolicy()` was removed

#### `models.DeviceUpdate` was modified

* `withDeviceGroupId(java.lang.String)` was removed
* `deviceGroupId()` was removed

#### `models.CatalogListResult` was modified

* `withNextLink(java.lang.String)` was removed

#### `models.DeviceListResult` was modified

* `withNextLink(java.lang.String)` was removed

#### `models.Product` was modified

* `description()` was removed
* `models.CountDeviceResponse countDevices()` -> `models.CountDevicesResponse countDevices()`
* `provisioningState()` was removed

#### `models.Device$Update` was modified

* `withDeviceGroupId(java.lang.String)` was removed

#### `models.Image$Definition` was modified

* `withRegionalDataBoundary(models.RegionalDataBoundary)` was removed
* `withImage(java.lang.String)` was removed
* `withImageId(java.lang.String)` was removed

#### `models.Deployment` was modified

* `deploymentId()` was removed
* `deploymentDateUtc()` was removed
* `provisioningState()` was removed
* `deployedImages()` was removed

#### `models.DeviceGroups` was modified

* `models.CountDeviceResponse countDevices(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` -> `models.CountDevicesResponse countDevices(java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

#### `models.Products` was modified

* `models.CountDeviceResponse countDevices(java.lang.String,java.lang.String,java.lang.String)` -> `models.CountDevicesResponse countDevices(java.lang.String,java.lang.String,java.lang.String)`

#### `models.ProductUpdate` was modified

* `withDescription(java.lang.String)` was removed
* `description()` was removed

#### `models.DeviceGroupUpdate` was modified

* `regionalDataBoundary()` was removed
* `withRegionalDataBoundary(models.RegionalDataBoundary)` was removed
* `allowCrashDumpsCollection()` was removed
* `updatePolicy()` was removed
* `withAllowCrashDumpsCollection(models.AllowCrashDumpCollection)` was removed
* `withOsFeedType(models.OSFeedType)` was removed
* `withUpdatePolicy(models.UpdatePolicy)` was removed
* `withDescription(java.lang.String)` was removed
* `description()` was removed
* `osFeedType()` was removed

#### `models.CertificateListResult` was modified

* `withNextLink(java.lang.String)` was removed

#### `models.Image` was modified

* `regionalDataBoundary()` was removed
* `image()` was removed
* `provisioningState()` was removed
* `uri()` was removed
* `imageName()` was removed
* `imageId()` was removed
* `description()` was removed
* `componentId()` was removed
* `imageType()` was removed

#### `models.Deployment$Definition` was modified

* `withDeploymentId(java.lang.String)` was removed
* `withDeployedImages(java.util.List)` was removed

#### `models.Certificate` was modified

* `notBeforeUtc()` was removed
* `subject()` was removed
* `expiryUtc()` was removed
* `certificate()` was removed
* `thumbprint()` was removed
* `provisioningState()` was removed
* `status()` was removed

### Features Added

* `models.DeviceGroupProperties` was added

* `models.DeviceProperties` was added

* `models.CertificateProperties` was added

* `models.CountDevicesResponse` was added

* `models.DeploymentProperties` was added

* `models.DeviceUpdateProperties` was added

* `models.DeviceGroupUpdateProperties` was added

* `models.CatalogProperties` was added

* `models.ProductUpdateProperties` was added

* `models.ImageProperties` was added

* `models.ProductProperties` was added

#### `models.CountDeviceResponse` was modified

* `withValue(int)` was added
* `validate()` was added

#### `models.Product$Definition` was modified

* `withProperties(models.ProductProperties)` was added

#### `models.DeviceGroup$Update` was modified

* `withProperties(models.DeviceGroupUpdateProperties)` was added

#### `models.Catalogs` was modified

* `uploadImage(java.lang.String,java.lang.String,fluent.models.ImageInner,com.azure.core.util.Context)` was added
* `uploadImage(java.lang.String,java.lang.String,fluent.models.ImageInner)` was added

#### `models.Device$Definition` was modified

* `withProperties(models.DeviceProperties)` was added

#### `models.Catalog` was modified

* `uploadImage(fluent.models.ImageInner,com.azure.core.util.Context)` was added
* `properties()` was added
* `uploadImage(fluent.models.ImageInner)` was added

#### `models.Device` was modified

* `systemData()` was added
* `properties()` was added

#### `models.Product$Update` was modified

* `withProperties(models.ProductUpdateProperties)` was added

#### `models.DeviceGroup$Definition` was modified

* `withProperties(models.DeviceGroupProperties)` was added

#### `models.DeviceGroup` was modified

* `properties()` was added
* `systemData()` was added

#### `models.DeviceUpdate` was modified

* `properties()` was added
* `withProperties(models.DeviceUpdateProperties)` was added

#### `models.Product` was modified

* `properties()` was added
* `systemData()` was added

#### `models.Device$Update` was modified

* `withProperties(models.DeviceUpdateProperties)` was added

#### `models.Image$Definition` was modified

* `withProperties(models.ImageProperties)` was added

#### `models.Deployment` was modified

* `systemData()` was added
* `properties()` was added

#### `models.ProductUpdate` was modified

* `withProperties(models.ProductUpdateProperties)` was added
* `properties()` was added

#### `models.DeviceGroupUpdate` was modified

* `withProperties(models.DeviceGroupUpdateProperties)` was added
* `properties()` was added

#### `models.Catalog$Definition` was modified

* `withProperties(models.CatalogProperties)` was added

#### `models.Image` was modified

* `systemData()` was added
* `properties()` was added

#### `models.Deployment$Definition` was modified

* `withProperties(models.DeploymentProperties)` was added

#### `models.Certificate` was modified

* `properties()` was added

## 1.0.0-beta.1 (2023-07-21)

- Azure Resource Manager AzureSphere client library for Java. This package contains Microsoft Azure SDK for AzureSphere Management SDK. Azure Sphere resource management API. Package tag package-2022-09-01-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
