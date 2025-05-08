# Release History

## 1.0.0-beta.1 (2025-04-11)

- Azure Resource Manager Dynatrace client library for Java. This package contains Microsoft Azure SDK for Dynatrace Management SDK.  Package tag package-2024-04-24. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.UserAssignedIdentity` was modified

* `withClientId(java.lang.String)` was removed
* `withPrincipalId(java.lang.String)` was removed
* `java.lang.String principalId()` -> `java.util.UUID principalId()`
* `java.lang.String clientId()` -> `java.util.UUID clientId()`

#### `models.Monitors` was modified

* `listMonitoredResources(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getMetricStatusWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.MonitorResource` was modified

* `listMonitoredResources(com.azure.core.util.Context)` was removed
* `getMetricStatusWithResponse(com.azure.core.util.Context)` was removed

### Features Added

* `models.Status` was added

* `models.MonitorUpdateProperties` was added

* `models.AgentStatusRequest` was added

* `models.MonitoredSubscriptionPropertiesList` was added

* `models.Action` was added

* `models.MarketplaceSubscriptionIdRequest` was added

* `models.MetricStatusRequest` was added

* `models.SubscriptionList` was added

* `models.MarketplaceSaasAutoRenew` was added

* `models.UpgradePlanRequest` was added

* `models.AgentStatus` was added

* `models.ManagedServiceIdentity` was added

* `models.MonitoredSubscription` was added

* `models.ManagedServiceIdentityType` was added

* `models.CreateResourceSupportedResponse` was added

* `models.CreateResourceSupportedProperties` was added

* `models.SubscriptionListOperation` was added

* `models.MonitoredSubscriptions` was added

* `models.MonitoredSubscriptionProperties` was added

* `models.ConnectedResourcesCountResponse` was added

* `models.CreationSupporteds` was added

* `models.LogStatusRequest` was added

#### `models.MarketplaceSaaSResourceDetailsResponse` was modified

* `marketplaceSaaSResourceName()` was added

#### `models.Monitors` was modified

* `updateAgentStatusWithResponse(java.lang.String,java.lang.String,models.AgentStatusRequest,com.azure.core.util.Context)` was added
* `listMonitoredResources(java.lang.String,java.lang.String,models.LogStatusRequest,com.azure.core.util.Context)` was added
* `getAllConnectedResourcesCount(models.MarketplaceSubscriptionIdRequest)` was added
* `updateAgentStatus(java.lang.String,java.lang.String,models.AgentStatusRequest)` was added
* `upgradePlan(java.lang.String,java.lang.String,models.UpgradePlanRequest)` was added
* `getMetricStatusWithResponse(java.lang.String,java.lang.String,models.MetricStatusRequest,com.azure.core.util.Context)` was added
* `getAllConnectedResourcesCountWithResponse(models.MarketplaceSubscriptionIdRequest,com.azure.core.util.Context)` was added
* `upgradePlan(java.lang.String,java.lang.String,models.UpgradePlanRequest,com.azure.core.util.Context)` was added

#### `models.MonitorResource$Definition` was modified

* `withMarketplaceSaasAutoRenew(models.MarketplaceSaasAutoRenew)` was added

#### `models.MonitorResourceUpdate` was modified

* `identity()` was added
* `withIdentity(models.ManagedServiceIdentity)` was added
* `properties()` was added
* `withProperties(models.MonitorUpdateProperties)` was added

#### `DynatraceManager` was modified

* `monitoredSubscriptions()` was added
* `creationSupporteds()` was added

#### `models.MonitorResource` was modified

* `getMetricStatusWithResponse(models.MetricStatusRequest,com.azure.core.util.Context)` was added
* `updateAgentStatus(models.AgentStatusRequest)` was added
* `upgradePlan(models.UpgradePlanRequest)` was added
* `upgradePlan(models.UpgradePlanRequest,com.azure.core.util.Context)` was added
* `updateAgentStatusWithResponse(models.AgentStatusRequest,com.azure.core.util.Context)` was added
* `marketplaceSaasAutoRenew()` was added
* `listMonitoredResources(models.LogStatusRequest,com.azure.core.util.Context)` was added

#### `models.AccountInfo` was modified

* `withCompanyName(java.lang.String)` was added
* `companyName()` was added

#### `models.MonitorResource$Update` was modified

* `withProperties(models.MonitorUpdateProperties)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added

## 1.0.0 (2024-12-26)

- Azure Resource Manager Dynatrace client library for Java. This package contains Microsoft Azure SDK for Dynatrace Management SDK.  Package tag package-2023-04-27. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Other Changes

- Release for Azure Resource Manager Dynatrace client library for Java.

## 1.0.0-beta.4 (2024-10-31)

- Azure Resource Manager Dynatrace client library for Java. This package contains Microsoft Azure SDK for Dynatrace Management SDK.  Package tag package-2023-04-27. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.UserAssignedIdentity` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.LinkableEnvironmentListResponse` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AppServiceListResponse` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FilteringTag` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UserInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DynatraceEnvironmentProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationDisplay` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TagRuleListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SsoDetailsRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LogRules` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MonitorResourceListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LinkableEnvironmentRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EnvironmentInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IdentityProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMHostsListResponse` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MonitorResourceUpdate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AccountInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PlanData` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MarketplaceSaaSResourceDetailsRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DynatraceSingleSignOnResourceListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MonitoredResourceListResponse` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MetricRules` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

## 1.0.0-beta.3 (2023-08-22)

- Azure Resource Manager Dynatrace client library for Java. This package contains Microsoft Azure SDK for Dynatrace Management SDK.  Package tag package-2023-04-27. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.AccountInfoSecure` was removed

* `models.TagRuleUpdate` was removed

#### `models.Monitors` was modified

* `getAccountCredentials(java.lang.String,java.lang.String)` was removed
* `getAccountCredentialsWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.MonitorResourceUpdate` was modified

* `planData()` was removed
* `withMonitoringStatus(models.MonitoringStatus)` was removed
* `withUserInfo(models.UserInfo)` was removed
* `marketplaceSubscriptionStatus()` was removed
* `monitoringStatus()` was removed
* `dynatraceEnvironmentProperties()` was removed
* `withMarketplaceSubscriptionStatus(models.MarketplaceSubscriptionStatus)` was removed
* `withDynatraceEnvironmentProperties(models.DynatraceEnvironmentProperties)` was removed
* `withPlanData(models.PlanData)` was removed
* `userInfo()` was removed

#### `models.MonitorResource` was modified

* `getAccountCredentialsWithResponse(com.azure.core.util.Context)` was removed
* `getAccountCredentials()` was removed

#### `models.MonitorResource$Update` was modified

* `withDynatraceEnvironmentProperties(models.DynatraceEnvironmentProperties)` was removed
* `withMarketplaceSubscriptionStatus(models.MarketplaceSubscriptionStatus)` was removed
* `withMonitoringStatus(models.MonitoringStatus)` was removed
* `withPlanData(models.PlanData)` was removed
* `withUserInfo(models.UserInfo)` was removed

### Features Added

* `models.MarketplaceSaaSResourceDetailsResponse` was added

* `models.MetricsStatusResponse` was added

* `models.MarketplaceSaaSResourceDetailsRequest` was added

#### `models.Monitors` was modified

* `getMetricStatus(java.lang.String,java.lang.String)` was added
* `getMarketplaceSaaSResourceDetailsWithResponse(models.MarketplaceSaaSResourceDetailsRequest,com.azure.core.util.Context)` was added
* `getMetricStatusWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getMarketplaceSaaSResourceDetails(models.MarketplaceSaaSResourceDetailsRequest)` was added

#### `models.MonitorResource` was modified

* `getMetricStatus()` was added
* `getMetricStatusWithResponse(com.azure.core.util.Context)` was added

#### `models.MetricRules` was modified

* `sendingMetrics()` was added
* `withSendingMetrics(models.SendingMetricsStatus)` was added

## 1.0.0-beta.2 (2022-09-19)

- Azure Resource Manager Dynatrace client library for Java. This package contains Microsoft Azure SDK for Dynatrace Management SDK.  Package tag package-2021-09-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

## 1.0.0-beta.1 (2022-05-25)

- Azure Resource Manager Dynatrace client library for Java. This package contains Microsoft Azure SDK for Dynatrace Management SDK.  Package tag package-2021-09-01-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
