# Release History

## 1.0.0-beta.1 (2024-11-18)

- Azure Resource Manager PaloAlto Networks Ngfw client library for Java. This package contains Microsoft Azure SDK for PaloAlto Networks Ngfw Management SDK.  Package tag package-preview-2024-02-07-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.LocalRulestacks` was modified

* `listPredefinedUrlCategoriesWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed
* `listCountriesWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed
* `listCountries(java.lang.String,java.lang.String)` was removed
* `listPredefinedUrlCategories(java.lang.String,java.lang.String)` was removed
* `listAppIdsWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed
* `listAppIds(java.lang.String,java.lang.String)` was removed

#### `models.PredefinedUrlCategory` was modified

* `withName(java.lang.String)` was removed
* `validate()` was removed
* `java.lang.String name()` -> `java.lang.String name()`
* `withAction(java.lang.String)` was removed
* `java.lang.String action()` -> `java.lang.String action()`

#### `models.LocalRulestackResource` was modified

* `listAppIds()` was removed
* `listPredefinedUrlCategories()` was removed
* `listCountries()` was removed
* `listAppIdsWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed
* `listPredefinedUrlCategoriesWithResponse(java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed
* `listCountriesWithResponse(java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed

#### `models.Country` was modified

* `withDescription(java.lang.String)` was removed
* `validate()` was removed
* `withCode(java.lang.String)` was removed
* `java.lang.String code()` -> `java.lang.String code()`
* `java.lang.String description()` -> `java.lang.String description()`

### Features Added

* `models.CloudManagerTenantList` was added

* `models.EnableStatus` was added

* `models.SupportInfoModel` was added

* `models.RegistrationStatus` was added

* `models.ProductSerialStatusValues` was added

* `models.StrataCloudManagerConfig` was added

* `models.ProductSerialNumberStatus` was added

* `models.ProductSerialNumberRequestStatus` was added

* `models.PaloAltoNetworksCloudngfws` was added

* `models.StrataCloudManagerInfo` was added

#### `models.MarketplaceDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PredefinedUrlCategory` was modified

* `innerModel()` was added

#### `models.AdvSecurityObjectModel` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CertificateObjectGlobalRulestackResourceListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IpAddressSpace` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.GlobalRulestackResourceUpdateProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureResourceManagerManagedIdentityProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MonitorLog` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FqdnListGlobalRulestackResourceListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DnsSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.GlobalRulestackResourceListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PrefixListResourceListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FirewallResourceUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FirewallStatusResourceListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.LocalRulestackResourceListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NameDescriptionObject` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AppSeenInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PlanData` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EndpointConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FirewallResource$Definition` was modified

* `withStrataCloudManagerConfig(models.StrataCloudManagerConfig)` was added
* `withIsStrataCloudManaged(models.BooleanEnum)` was added

#### `models.Category` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `PaloAltoNetworksNgfwManager` was modified

* `paloAltoNetworksCloudngfws()` was added

#### `models.DestinationAddr` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IpAddress` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FirewallResourceListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FrontendSetting` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.StorageAccount` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PreRulesResourceListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LocalRulestackResourceUpdate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrefixListGlobalRulestackResourceListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SecurityServices` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SecurityServicesTypeList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CertificateObjectLocalRulestackResourceListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RulestackDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VwanConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LocalRulestackResourceUpdateProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EventHub` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FirewallStatusResource` was modified

* `strataCloudManagerInfo()` was added
* `isStrataCloudManaged()` was added

#### `models.OperationDisplay` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LogDestination` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.GlobalRulestackResourceUpdate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FirewallResource` was modified

* `isStrataCloudManaged()` was added
* `strataCloudManagerConfig()` was added

#### `models.SourceAddr` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureResourceManagerUserAssignedIdentity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TagInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FirewallResourceUpdateProperties` was modified

* `withIsStrataCloudManaged(models.BooleanEnum)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `isStrataCloudManaged()` was added
* `withStrataCloudManagerConfig(models.StrataCloudManagerConfig)` was added
* `strataCloudManagerConfig()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AppSeenData` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PanoramaStatus` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VnetConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FqdnListLocalRulestackResourceListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NetworkProfile` was modified

* `withPrivateSourceNatRulesDestination(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `privateSourceNatRulesDestination()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PostRulesResourceListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Country` was modified

* `innerModel()` was added

#### `models.ApplicationInsights` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.LocalRulesResourceListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PanoramaConfig` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.1.0 (2023-11-15)

- Azure Resource Manager PaloAlto Networks Ngfw client library for Java. This package contains Microsoft Azure SDK for PaloAlto Networks Ngfw Management SDK.  Package tag package-2023-09-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.NetworkProfile` was modified

* `trustedRanges()` was added
* `withTrustedRanges(java.util.List)` was added

## 1.0.0 (2023-07-14)

- Azure Resource Manager PaloAlto Networks Ngfw client library for Java. This package contains Microsoft Azure SDK for PaloAlto Networks Ngfw Management SDK.  Package tag package-2022-08-29. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

## 1.0.0-beta.1 (2023-05-04)

- Azure Resource Manager PaloAlto Networks Ngfw client library for Java. This package contains Microsoft Azure SDK for PaloAlto Networks Ngfw Management SDK.  Package tag package-2022-08-29-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
