# Release History

## 1.0.0-beta.1 (2025-03-23)

- Azure Resource Manager IoT Firmware Defense client library for Java. This package contains Microsoft Azure SDK for IoT Firmware Defense Management SDK. Firmware & IoT Security REST API. Package tag package-2025-04-01-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.SbomComponentListResult` was removed

#### `models.WorkspaceList` was removed

#### `models.BinaryHardeningListResult` was removed

#### `models.CryptoKeyListResult` was removed

#### `models.SummaryListResult` was removed

#### `models.CveListResult` was removed

#### `models.CveComponent` was removed

#### `models.CryptoCertificateListResult` was removed

#### `models.FirmwareList` was removed

#### `models.SummaryName` was removed

#### `models.WorkspaceUpdateDefinition` was removed

#### `models.PasswordHashListResult` was removed

#### `models.PairedKey` was modified

* `withId(java.lang.String)` was removed
* `id()` was removed

#### `models.SbomComponentResource` was modified

* `filePaths()` was removed
* `license()` was removed
* `componentName()` was removed
* `componentId()` was removed
* `version()` was removed

#### `models.CveResource` was modified

* `description()` was removed
* `links()` was removed
* `namePropertiesName()` was removed
* `cvssScore()` was removed
* `cvssVersion()` was removed
* `cveId()` was removed
* `cvssV3Score()` was removed
* `cvssV2Score()` was removed
* `severity()` was removed
* `component()` was removed

#### `models.Firmware$Definition` was modified

* `withStatus(models.Status)` was removed
* `withFileName(java.lang.String)` was removed
* `withVendor(java.lang.String)` was removed
* `withFileSize(java.lang.Long)` was removed
* `withDescription(java.lang.String)` was removed
* `withModel(java.lang.String)` was removed
* `withVersion(java.lang.String)` was removed
* `withStatusMessages(java.util.List)` was removed

#### `IoTFirmwareDefenseManager` was modified

* `fluent.IoTFirmwareDefense serviceClient()` -> `fluent.IotFirmwareDefense serviceClient()`

#### `models.Workspace` was modified

* `provisioningState()` was removed

#### `models.CryptoCertificateSummaryResource` was modified

* `withWeakSignature(java.lang.Long)` was removed
* `totalCertificates()` was removed
* `pairedKeys()` was removed
* `selfSigned()` was removed
* `expiringSoon()` was removed
* `withSelfSigned(java.lang.Long)` was removed
* `weakSignature()` was removed
* `withTotalCertificates(java.lang.Long)` was removed
* `withShortKeySize(java.lang.Long)` was removed
* `withPairedKeys(java.lang.Long)` was removed
* `shortKeySize()` was removed
* `withExpiringSoon(java.lang.Long)` was removed
* `withExpired(java.lang.Long)` was removed
* `expired()` was removed

#### `models.BinaryHardeningSummaryResource` was modified

* `withRelro(java.lang.Integer)` was removed
* `nx()` was removed
* `withPie(java.lang.Integer)` was removed
* `stripped()` was removed
* `withNx(java.lang.Integer)` was removed
* `withStripped(java.lang.Integer)` was removed
* `withCanary(java.lang.Integer)` was removed
* `canary()` was removed
* `relro()` was removed
* `pie()` was removed

#### `models.Summaries` was modified

* `get(java.lang.String,java.lang.String,java.lang.String,models.SummaryName)` was removed
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,models.SummaryName,com.azure.core.util.Context)` was removed

#### `models.Firmwares` was modified

* `generateDownloadUrl(java.lang.String,java.lang.String,java.lang.String)` was removed
* `generateDownloadUrlWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `generateFilesystemDownloadUrlWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `generateFilesystemDownloadUrl(java.lang.String,java.lang.String,java.lang.String)` was removed

#### `models.CveSummary` was modified

* `withUnknown(java.lang.Long)` was removed
* `critical()` was removed
* `high()` was removed
* `withCritical(java.lang.Long)` was removed
* `withMedium(java.lang.Long)` was removed
* `medium()` was removed
* `unknown()` was removed
* `withLow(java.lang.Long)` was removed
* `low()` was removed
* `withHigh(java.lang.Long)` was removed

#### `models.CryptoKeyResource` was modified

* `isShortKeySize()` was removed
* `pairedKey()` was removed
* `keyAlgorithm()` was removed
* `keySize()` was removed
* `filePaths()` was removed
* `cryptoKeyId()` was removed
* `keyType()` was removed
* `usage()` was removed

#### `models.Firmware$Update` was modified

* `withStatusMessages(java.util.List)` was removed
* `withVersion(java.lang.String)` was removed
* `withVendor(java.lang.String)` was removed
* `withFileSize(java.lang.Long)` was removed
* `withFileName(java.lang.String)` was removed
* `withModel(java.lang.String)` was removed
* `withDescription(java.lang.String)` was removed
* `withStatus(models.Status)` was removed

#### `models.FirmwareUpdateDefinition` was modified

* `fileName()` was removed
* `provisioningState()` was removed
* `version()` was removed
* `withDescription(java.lang.String)` was removed
* `description()` was removed
* `withVersion(java.lang.String)` was removed
* `statusMessages()` was removed
* `model()` was removed
* `withModel(java.lang.String)` was removed
* `withFileName(java.lang.String)` was removed
* `vendor()` was removed
* `status()` was removed
* `withStatusMessages(java.util.List)` was removed
* `fileSize()` was removed
* `withVendor(java.lang.String)` was removed
* `withStatus(models.Status)` was removed
* `withFileSize(java.lang.Long)` was removed

#### `models.CryptoCertificateResource` was modified

* `fingerprint()` was removed
* `keySize()` was removed
* `issuedDate()` was removed
* `isSelfSigned()` was removed
* `serialNumber()` was removed
* `pairedKey()` was removed
* `role()` was removed
* `encoding()` was removed
* `keyAlgorithm()` was removed
* `expirationDate()` was removed
* `isWeakSignature()` was removed
* `usage()` was removed
* `cryptoCertId()` was removed
* `filePaths()` was removed
* `issuer()` was removed
* `signatureAlgorithm()` was removed
* `namePropertiesName()` was removed
* `isShortKeySize()` was removed
* `isExpired()` was removed
* `subject()` was removed

#### `models.CryptoKeySummaryResource` was modified

* `shortKeySize()` was removed
* `withPublicKeys(java.lang.Long)` was removed
* `totalKeys()` was removed
* `pairedKeys()` was removed
* `withPrivateKeys(java.lang.Long)` was removed
* `publicKeys()` was removed
* `privateKeys()` was removed
* `withTotalKeys(java.lang.Long)` was removed
* `withPairedKeys(java.lang.Long)` was removed
* `withShortKeySize(java.lang.Long)` was removed

#### `models.Firmware` was modified

* `fileName()` was removed
* `generateDownloadUrlWithResponse(com.azure.core.util.Context)` was removed
* `statusMessages()` was removed
* `status()` was removed
* `model()` was removed
* `provisioningState()` was removed
* `vendor()` was removed
* `fileSize()` was removed
* `version()` was removed
* `description()` was removed
* `generateDownloadUrl()` was removed
* `generateFilesystemDownloadUrl()` was removed
* `generateFilesystemDownloadUrlWithResponse(com.azure.core.util.Context)` was removed

#### `models.PasswordHashResource` was modified

* `salt()` was removed
* `username()` was removed
* `context()` was removed
* `filePath()` was removed
* `passwordHashId()` was removed
* `algorithm()` was removed
* `hash()` was removed

#### `models.BinaryHardeningResource` was modified

* `relro()` was removed
* `classProperty()` was removed
* `nx()` was removed
* `filePath()` was removed
* `architecture()` was removed
* `pie()` was removed
* `stripped()` was removed
* `canary()` was removed
* `runpath()` was removed
* `binaryHardeningId()` was removed
* `rpath()` was removed

### Features Added

* `models.UsageMetric` was added

* `models.AzureResourceManagerCommonTypesSkuUpdate` was added

* `models.WorkspaceUpdate` was added

* `models.SkuTier` was added

* `models.CryptoKey` was added

* `models.FirmwareListResult` was added

* `models.SbomComponentResourceListResult` was added

* `models.Sku` was added

* `models.CryptoCertificateResourceListResult` was added

* `models.SummaryResourceListResult` was added

* `models.CveResult` was added

* `models.BinaryHardeningResult` was added

* `models.CryptoKeyResourceListResult` was added

* `models.PasswordHashResourceListResult` was added

* `models.UsageMetrics` was added

* `models.WorkspaceListResult` was added

* `models.CvssScore` was added

* `models.FirmwareProperties` was added

* `models.CertificateUsage` was added

* `models.SbomComponent` was added

* `models.UsageMetricListResult` was added

* `models.BinaryHardeningResourceListResult` was added

* `models.ExecutableClass` was added

* `models.PasswordHash` was added

* `models.CryptoCertificate` was added

* `models.BinaryHardeningFeatures` was added

* `models.UsageMetricProperties` was added

* `models.CryptoKeyType` was added

* `models.WorkspaceProperties` was added

* `models.CveResourceListResult` was added

#### `models.PairedKey` was modified

* `pairedKeyId()` was added
* `withPairedKeyId(java.lang.String)` was added

#### `models.SbomComponentResource` was modified

* `properties()` was added

#### `models.CveResource` was modified

* `properties()` was added

#### `models.Firmware$Definition` was modified

* `withProperties(models.FirmwareProperties)` was added

#### `IoTFirmwareDefenseManager` was modified

* `usageMetrics()` was added

#### `models.Workspace` was modified

* `sku()` was added
* `properties()` was added

#### `models.CryptoCertificateSummaryResource` was modified

* `withPairedKeyCount(java.lang.Long)` was added
* `withTotalCertificateCount(java.lang.Long)` was added
* `weakSignatureCount()` was added
* `totalCertificateCount()` was added
* `withExpiredCertificateCount(java.lang.Long)` was added
* `withWeakSignatureCount(java.lang.Long)` was added
* `pairedKeyCount()` was added
* `shortKeySizeCount()` was added
* `withShortKeySizeCount(java.lang.Long)` was added
* `withSelfSignedCertificateCount(java.lang.Long)` was added
* `expiredCertificateCount()` was added
* `selfSignedCertificateCount()` was added
* `withExpiringSoonCertificateCount(java.lang.Long)` was added
* `expiringSoonCertificateCount()` was added

#### `models.BinaryHardeningSummaryResource` was modified

* `positionIndependentExecutableCount()` was added
* `withRelocationReadOnlyCount(java.lang.Long)` was added
* `withNotExecutableStackCount(java.lang.Long)` was added
* `withPositionIndependentExecutableCount(java.lang.Long)` was added
* `notExecutableStackCount()` was added
* `withStackCanaryCount(java.lang.Long)` was added
* `relocationReadOnlyCount()` was added
* `strippedBinaryCount()` was added
* `stackCanaryCount()` was added
* `withStrippedBinaryCount(java.lang.Long)` was added

#### `models.Summaries` was modified

* `get(java.lang.String,java.lang.String,java.lang.String,models.SummaryType)` was added
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,models.SummaryType,com.azure.core.util.Context)` was added

#### `models.Workspace$Update` was modified

* `withTags(java.util.Map)` was added
* `withSku(models.AzureResourceManagerCommonTypesSkuUpdate)` was added

#### `models.Workspace$Definition` was modified

* `withSku(models.Sku)` was added
* `withProperties(models.WorkspaceProperties)` was added

#### `models.CveSummary` was modified

* `criticalCveCount()` was added
* `withHighCveCount(java.lang.Long)` was added
* `withUnknownCveCount(java.lang.Long)` was added
* `mediumCveCount()` was added
* `withLowCveCount(java.lang.Long)` was added
* `lowCveCount()` was added
* `unknownCveCount()` was added
* `withMediumCveCount(java.lang.Long)` was added
* `highCveCount()` was added
* `withCriticalCveCount(java.lang.Long)` was added

#### `models.SummaryResourceProperties` was modified

* `provisioningState()` was added

#### `models.CryptoKeyResource` was modified

* `properties()` was added

#### `models.Firmware$Update` was modified

* `withProperties(models.FirmwareProperties)` was added

#### `models.FirmwareUpdateDefinition` was modified

* `properties()` was added
* `withProperties(models.FirmwareProperties)` was added

#### `models.CryptoCertificateResource` was modified

* `properties()` was added

#### `models.CryptoKeySummaryResource` was modified

* `pairedKeyCount()` was added
* `withPrivateKeyCount(java.lang.Long)` was added
* `withTotalKeyCount(java.lang.Long)` was added
* `publicKeyCount()` was added
* `shortKeySizeCount()` was added
* `withPairedKeyCount(java.lang.Long)` was added
* `withPublicKeyCount(java.lang.Long)` was added
* `totalKeyCount()` was added
* `withShortKeySizeCount(java.lang.Long)` was added
* `privateKeyCount()` was added

#### `models.Firmware` was modified

* `properties()` was added

#### `models.PasswordHashResource` was modified

* `properties()` was added

#### `models.BinaryHardeningResource` was modified

* `properties()` was added

## 1.1.0 (2024-12-19)

- Azure Resource Manager IoT Firmware Defense client library for Java. This package contains Microsoft Azure SDK for IoT Firmware Defense Management SDK. Firmware & IoT Security REST API. Package tag package-2024-01-10. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### Serialization/Deserialization change

- `Jackson` is removed from dependency and no longer supported.

##### Migration Guide

If you are using `Jackson`/`ObjectMapper` for manual serialization/deserialization, configure your `ObjectMapper` for backward compatibility:
```java
objectMapper.registerModule(com.azure.core.serializer.json.jackson.JacksonJsonProvider.getJsonSerializableDatabindModule());
```

### Features Added

#### `models.CveSummary` was modified

* `summaryType()` was added

#### `models.SummaryResourceProperties` was modified

* `summaryType()` was added

#### `models.CryptoCertificateSummaryResource` was modified

* `summaryType()` was added

#### `models.BinaryHardeningSummaryResource` was modified

* `summaryType()` was added

#### `models.CryptoKeySummaryResource` was modified

* `summaryType()` was added

#### `models.FirmwareSummary` was modified

* `summaryType()` was added

## 1.0.0 (2024-03-18)

- Azure Resource Manager IoT Firmware Defense client library for Java. This package contains Microsoft Azure SDK for IoT Firmware Defense Management SDK. Firmware & IoT Security REST API. Package tag package-2024-01-10. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.Cve` was removed

* `models.CryptoKeyList` was removed

* `models.PasswordHashList` was removed

* `models.NxFlag` was removed

* `models.CveList` was removed

* `models.CryptoKey` was removed

* `models.CryptoCertificateList` was removed

* `models.CryptoKeySummary` was removed

* `models.BinaryHardeningSummary` was removed

* `models.BinaryHardeningList` was removed

* `models.CanaryFlag` was removed

* `models.IsExpired` was removed

* `models.IsUpdateAvailable` was removed

* `models.CryptoCertificateSummary` was removed

* `models.PasswordHash` was removed

* `models.PieFlag` was removed

* `models.StrippedFlag` was removed

* `models.IsSelfSigned` was removed

* `models.CryptoCertificate` was removed

* `models.IsWeakSignature` was removed

* `models.IsShortKeySize` was removed

* `models.ComponentList` was removed

* `models.RelroFlag` was removed

* `models.Component` was removed

* `models.BinaryHardening` was removed

#### `models.PairedKey` was modified

* `withAdditionalProperties(java.lang.Object)` was removed
* `additionalProperties()` was removed

#### `models.UrlToken` was modified

* `uploadUrl()` was removed

#### `IoTFirmwareDefenseManager` was modified

* `fluent.Fist serviceClient()` -> `fluent.IoTFirmwareDefense serviceClient()`

#### `models.FirmwareSummary` was modified

* `java.lang.Long extractedFileCount()` -> `java.lang.Long extractedFileCount()`
* `java.lang.Long fileSize()` -> `java.lang.Long fileSize()`
* `innerModel()` was removed
* `java.lang.Long componentCount()` -> `java.lang.Long componentCount()`
* `java.lang.Long rootFileSystems()` -> `java.lang.Long rootFileSystems()`
* `java.lang.Long analysisTimeSeconds()` -> `java.lang.Long analysisTimeSeconds()`
* `java.lang.Long binaryCount()` -> `java.lang.Long binaryCount()`
* `java.lang.Long extractedSize()` -> `java.lang.Long extractedSize()`

#### `models.Firmwares` was modified

* `generateCveSummary(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listGenerateCveList(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `generateSummaryWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listGenerateCryptoKeyList(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listGeneratePasswordHashList(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listGenerateCryptoCertificateList(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listGenerateBinaryHardeningList(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listGenerateCveList(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listGenerateComponentList(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `generateBinaryHardeningDetails(java.lang.String,java.lang.String,java.lang.String)` was removed
* `generateCryptoKeySummary(java.lang.String,java.lang.String,java.lang.String)` was removed
* `generateBinaryHardeningDetailsWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `generateBinaryHardeningSummary(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listGenerateCryptoKeyList(java.lang.String,java.lang.String,java.lang.String)` was removed
* `generateCryptoCertificateSummary(java.lang.String,java.lang.String,java.lang.String)` was removed
* `generateCveSummaryWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listGenerateComponentList(java.lang.String,java.lang.String,java.lang.String)` was removed
* `generateComponentDetails(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listGeneratePasswordHashList(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listGenerateBinaryHardeningList(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `generateBinaryHardeningSummaryWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `generateComponentDetailsWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `generateCryptoKeySummaryWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `generateSummary(java.lang.String,java.lang.String,java.lang.String)` was removed
* `generateCryptoCertificateSummaryWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listGenerateCryptoCertificateList(java.lang.String,java.lang.String,java.lang.String)` was removed

#### `models.CveSummary` was modified

* `java.lang.Long critical()` -> `java.lang.Long critical()`
* `java.lang.Long low()` -> `java.lang.Long low()`
* `java.lang.Long high()` -> `java.lang.Long high()`
* `undefined()` was removed
* `innerModel()` was removed
* `java.lang.Long unknown()` -> `java.lang.Long unknown()`
* `java.lang.Long medium()` -> `java.lang.Long medium()`

#### `models.Firmware` was modified

* `listGeneratePasswordHashList()` was removed
* `listGenerateCveList(com.azure.core.util.Context)` was removed
* `generateComponentDetailsWithResponse(com.azure.core.util.Context)` was removed
* `generateCryptoKeySummaryWithResponse(com.azure.core.util.Context)` was removed
* `listGenerateCveList()` was removed
* `generateCveSummary()` was removed
* `listGenerateComponentList()` was removed
* `generateComponentDetails()` was removed
* `generateBinaryHardeningDetails()` was removed
* `listGenerateComponentList(com.azure.core.util.Context)` was removed
* `listGenerateBinaryHardeningList(com.azure.core.util.Context)` was removed
* `listGenerateCryptoKeyList(com.azure.core.util.Context)` was removed
* `listGenerateBinaryHardeningList()` was removed
* `listGenerateCryptoCertificateList(com.azure.core.util.Context)` was removed
* `generateCryptoKeySummary()` was removed
* `generateBinaryHardeningSummary()` was removed
* `listGenerateCryptoKeyList()` was removed
* `generateSummaryWithResponse(com.azure.core.util.Context)` was removed
* `listGeneratePasswordHashList(com.azure.core.util.Context)` was removed
* `generateSummary()` was removed
* `generateCryptoCertificateSummary()` was removed
* `generateBinaryHardeningDetailsWithResponse(com.azure.core.util.Context)` was removed
* `generateCryptoCertificateSummaryWithResponse(com.azure.core.util.Context)` was removed
* `listGenerateCryptoCertificateList()` was removed
* `generateCveSummaryWithResponse(com.azure.core.util.Context)` was removed
* `generateBinaryHardeningSummaryWithResponse(com.azure.core.util.Context)` was removed

### Features Added

* `models.SbomComponentResource` was added

* `models.CveResource` was added

* `models.SbomComponentListResult` was added

* `models.BinaryHardenings` was added

* `models.CryptoCertificateSummaryResource` was added

* `models.BinaryHardeningListResult` was added

* `models.CryptoKeyListResult` was added

* `models.SummaryListResult` was added

* `models.BinaryHardeningSummaryResource` was added

* `models.CveListResult` was added

* `models.CryptoKeys` was added

* `models.Summaries` was added

* `models.SbomComponents` was added

* `models.SummaryType` was added

* `models.SummaryResource` was added

* `models.StatusMessage` was added

* `models.CveComponent` was added

* `models.CryptoCertificateListResult` was added

* `models.SummaryResourceProperties` was added

* `models.CryptoCertificates` was added

* `models.CryptoKeyResource` was added

* `models.SummaryName` was added

* `models.CryptoCertificateResource` was added

* `models.CryptoKeySummaryResource` was added

* `models.PasswordHashes` was added

* `models.Cves` was added

* `models.PasswordHashResource` was added

* `models.PasswordHashListResult` was added

* `models.BinaryHardeningResource` was added

#### `IoTFirmwareDefenseManager` was modified

* `passwordHashes()` was added
* `binaryHardenings()` was added
* `cryptoCertificates()` was added
* `sbomComponents()` was added
* `summaries()` was added
* `cves()` was added
* `cryptoKeys()` was added

#### `models.FirmwareSummary` was modified

* `withExtractedFileCount(java.lang.Long)` was added
* `withFileSize(java.lang.Long)` was added
* `withExtractedSize(java.lang.Long)` was added
* `withComponentCount(java.lang.Long)` was added
* `withBinaryCount(java.lang.Long)` was added
* `withAnalysisTimeSeconds(java.lang.Long)` was added
* `withRootFileSystems(java.lang.Long)` was added
* `validate()` was added

#### `models.CveSummary` was modified

* `withUnknown(java.lang.Long)` was added
* `withLow(java.lang.Long)` was added
* `withMedium(java.lang.Long)` was added
* `validate()` was added
* `withHigh(java.lang.Long)` was added
* `withCritical(java.lang.Long)` was added

## 1.0.0-beta.1 (2023-07-20)

- Azure Resource Manager IoT Firmware Defense client library for Java. This package contains Microsoft Azure SDK for IoT Firmware Defense Management SDK. The definitions and parameters in this swagger specification will be used to manage the IoT Firmware Defense resources. Package tag package-2023-02-08-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
