# Release History

## 1.0.0-beta.2 (2025-05-06)

- Azure Resource Manager Connected Cache client library for Java. This package contains Microsoft Azure SDK for Connected Cache Management SDK. Microsoft Connected Cache Rest Api version 2023-05-01-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.EnterpriseCustomerOperations` was removed

#### `models.CacheNodePreviewResource$DefinitionStages` was removed

#### `models.CacheNodesOperations` was removed

#### `models.CycleType` was removed

#### `models.EnterprisePreviewResource$Update` was removed

#### `models.EnterprisePreviewResource$UpdateStages` was removed

#### `models.CacheNodePreviewResource$UpdateStages` was removed

#### `models.EnterprisePreviewResource` was removed

#### `models.CacheNodePreviewResource` was removed

#### `models.CacheNodeOldResponse` was removed

#### `implementation.models.CacheNodePreviewResourceListResult` was removed

#### `implementation.models.EnterprisePreviewResourceListResult` was removed

#### `models.EnterprisePreviewResource$Definition` was removed

#### `models.CacheNodePreviewResource$Definition` was removed

#### `models.CacheNodePreviewResource$Update` was removed

#### `models.EnterprisePreviewResource$DefinitionStages` was removed

#### `models.AdditionalCustomerProperties` was modified

* `peeringDbLastUpdateTime()` was removed

#### `ConnectedCacheManager` was modified

* `enterpriseCustomerOperations()` was removed
* `cacheNodesOperations()` was removed

#### `models.AdditionalCacheNodeProperties` was modified

* `withUpdateCycleType(models.CycleType)` was removed
* `proxyUrl()` was removed
* `updateCycleType()` was removed
* `withProxyUrl(java.lang.String)` was removed

### Features Added

* `models.MccCacheNodeTlsCertificate` was added

* `models.MccIssue` was added

* `models.MccCacheNodeAutoUpdateInfo` was added

* `models.MccCacheNodeAutoUpdateHistoryProperties` was added

* `models.MccCacheNodeIssueHistory` was added

* `models.MccCacheNodeAutoUpdateHistory` was added

* `models.MccCacheNodeTlsCertificateHistory` was added

* `models.MccCacheNodeIssueHistoryProperties` was added

* `models.MccCacheNodeTlsCertificateProperties` was added

#### `models.CacheNodeInstallProperties` was modified

* `tlsCertificateProvisioningKey()` was added
* `driveConfiguration()` was added
* `proxyUrlConfiguration()` was added

#### `models.IspCacheNodeResource` was modified

* `getCacheNodeMccIssueDetailsHistory()` was added
* `getCacheNodeMccIssueDetailsHistoryWithResponse(com.azure.core.util.Context)` was added
* `getCacheNodeAutoUpdateHistory()` was added
* `getCacheNodeAutoUpdateHistoryWithResponse(com.azure.core.util.Context)` was added

#### `models.IspCacheNodesOperations` was modified

* `getCacheNodeAutoUpdateHistory(java.lang.String,java.lang.String,java.lang.String)` was added
* `getCacheNodeMccIssueDetailsHistory(java.lang.String,java.lang.String,java.lang.String)` was added
* `getCacheNodeMccIssueDetailsHistoryWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getCacheNodeAutoUpdateHistoryWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.EnterpriseMccCacheNodesOperations` was modified

* `getCacheNodeAutoUpdateHistory(java.lang.String,java.lang.String,java.lang.String)` was added
* `getCacheNodeTlsCertificateHistoryWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getCacheNodeTlsCertificateHistory(java.lang.String,java.lang.String,java.lang.String)` was added
* `getCacheNodeMccIssueDetailsHistory(java.lang.String,java.lang.String,java.lang.String)` was added
* `getCacheNodeAutoUpdateHistoryWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getCacheNodeMccIssueDetailsHistoryWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.AdditionalCacheNodeProperties` was modified

* `issuesList()` was added
* `withCreationMethod(java.lang.Integer)` was added
* `creationMethod()` was added
* `tlsStatus()` was added
* `lastAutoUpdateInfo()` was added
* `currentTlsCertificate()` was added
* `issuesCount()` was added

#### `models.EnterpriseMccCacheNodeResource` was modified

* `getCacheNodeAutoUpdateHistoryWithResponse(com.azure.core.util.Context)` was added
* `getCacheNodeAutoUpdateHistory()` was added
* `getCacheNodeTlsCertificateHistory()` was added
* `getCacheNodeMccIssueDetailsHistoryWithResponse(com.azure.core.util.Context)` was added
* `getCacheNodeMccIssueDetailsHistory()` was added
* `getCacheNodeTlsCertificateHistoryWithResponse(com.azure.core.util.Context)` was added

## 1.0.0-beta.1 (2024-11-21)

- Azure Resource Manager Connected Cache client library for Java. This package contains Microsoft Azure SDK for Connected Cache Management SDK. Microsoft Connected Cache Rest Api version 2023-05-01-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

- Initial release for the azure-resourcemanager-connectedcache Java SDK.
