# Release History

## 1.0.0-beta.1 (2024-09-16)

- Azure Resource Manager NewRelicObservability client library for Java. This package contains Microsoft Azure SDK for NewRelicObservability Management SDK.  Package tag package-2024-10-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.BillingCycle` was removed

#### `models.PlanData` was modified

* `withBillingCycle(models.BillingCycle)` was removed
* `models.BillingCycle billingCycle()` -> `java.lang.String billingCycle()`

### Features Added

* `models.ResubscribeProperties` was added

#### `models.PlanData` was modified

* `withBillingCycle(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UserAssignedIdentity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AppServicesListResponse` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AppServicesGetRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UserInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MarketplaceSaaSInfo` was modified

* `withPublisherId(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `publisherId()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `offerId()` was added
* `withOfferId(java.lang.String)` was added

#### `models.OperationDisplay` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MetricsRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AccountInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OrganizationInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MonitoredResourceListResponse` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NewRelicAccountProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OrganizationsListResponse` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MonitoredSubscriptionPropertiesList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LogRules` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMHostsListResponse` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AccountsListResponse` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NewRelicMonitorResource` was modified

* `refreshIngestionKeyWithResponse(com.azure.core.util.Context)` was added
* `resubscribe(models.ResubscribeProperties,com.azure.core.util.Context)` was added
* `resubscribe()` was added
* `refreshIngestionKey()` was added

#### `models.SubscriptionList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ConnectedPartnerResourcesListResponse` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TagRuleListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MetricsStatusRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FilteringTag` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NewRelicMonitorResourceUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ManagedServiceIdentity` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NewRelicSingleSignOnProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PlanDataListResponse` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NewRelicMonitorResourceListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ConnectedPartnerResourceProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HostsGetRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Monitors` was modified

* `resubscribe(java.lang.String,java.lang.String,models.ResubscribeProperties,com.azure.core.util.Context)` was added
* `resubscribe(java.lang.String,java.lang.String)` was added
* `refreshIngestionKeyWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `refreshIngestionKey(java.lang.String,java.lang.String)` was added

#### `models.PartnerBillingEntity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SwitchBillingRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.LinkedResourceListResponse` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.1.0 (2024-03-15)

- Azure Resource Manager NewRelicObservability client library for Java. This package contains Microsoft Azure SDK for NewRelicObservability Management SDK.  Package tag package-2024-01-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.ConfigurationName` was added

* `models.MarketplaceSaaSInfo` was added

* `models.MonitoredSubscriptionProperties$UpdateStages` was added

* `models.MonitoredSubscription` was added

* `models.MonitoredSubscriptionProperties$Definition` was added

* `models.BillingInfoResponse` was added

* `models.MonitoredSubscriptionPropertiesList` was added

* `models.ConnectedPartnerResources` was added

* `models.SubscriptionList` was added

* `models.ConnectedPartnerResourcesListResponse` was added

* `models.ConnectedPartnerResourcesListFormat` was added

* `models.BillingInfoes` was added

* `models.PatchOperation` was added

* `models.MonitoredSubscriptionProperties$Update` was added

* `models.Status` was added

* `models.MonitoredSubscriptionProperties$DefinitionStages` was added

* `models.ConnectedPartnerResourceProperties` was added

* `models.MonitoredSubscriptionProperties` was added

* `models.LinkedResource` was added

* `models.PartnerBillingEntity` was added

* `models.MonitoredSubscriptions` was added

* `models.LinkedResourceListResponse` was added

#### `models.NewRelicMonitorResource` was modified

* `saaSAzureSubscriptionStatus()` was added
* `listLinkedResources(com.azure.core.util.Context)` was added
* `listLinkedResources()` was added
* `subscriptionState()` was added

#### `models.NewRelicMonitorResource$Definition` was modified

* `withSaaSAzureSubscriptionStatus(java.lang.String)` was added
* `withSubscriptionState(java.lang.String)` was added

#### `models.Monitors` was modified

* `listLinkedResources(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `listLinkedResources(java.lang.String,java.lang.String)` was added

#### `NewRelicObservabilityManager` was modified

* `connectedPartnerResources()` was added
* `monitoredSubscriptions()` was added
* `billingInfoes()` was added

## 1.0.0 (2023-05-18)

- Azure Resource Manager NewRelicObservability client library for Java. This package contains Microsoft Azure SDK for NewRelicObservability Management SDK.  Package tag package-2022-07-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

## 1.0.0-beta.2 (2023-04-18)

- Azure Resource Manager NewRelicObservability client library for Java. This package contains Microsoft Azure SDK for NewRelicObservability Management SDK.  Package tag package-2022-07-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.NewRelicMonitorResource` was modified

* `void switchBilling(models.SwitchBillingRequest)` -> `models.NewRelicMonitorResource switchBilling(models.SwitchBillingRequest)`

#### `models.Monitors` was modified

* `void switchBilling(java.lang.String,java.lang.String,models.SwitchBillingRequest)` -> `models.NewRelicMonitorResource switchBilling(java.lang.String,java.lang.String,models.SwitchBillingRequest)`

### Features Added

* `models.MonitorsSwitchBillingResponse` was added

* `models.MonitorsSwitchBillingHeaders` was added

## 1.0.0-beta.1 (2023-03-27)

- Azure Resource Manager NewRelicObservability client library for Java. This package contains Microsoft Azure SDK for NewRelicObservability Management SDK.  Package tag package-2022-07-01-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
