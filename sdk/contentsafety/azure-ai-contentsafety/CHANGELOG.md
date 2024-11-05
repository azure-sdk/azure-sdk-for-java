# Release History

## 1.1.0-beta.1 (Unreleased)

### Breaking Changes

#### `implementation.ContentSafetyClientImpl$ContentSafetyClientService` was modified

* `analyzeImage(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `analyzeText(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `analyzeImageSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `analyzeTextSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed

#### `implementation.BlocklistClientImpl$BlocklistClientService` was modified

* `removeBlocklistItems(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `addOrUpdateBlocklistItems(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `addOrUpdateBlocklistItemsSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `removeBlocklistItemsSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed

#### `models.AnalyzeTextOptions` was modified

* `getText()` was removed

### Features Added

#### `models.AddOrUpdateTextBlocklistItemsResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `BlocklistAsyncClient` was modified

* `createOrUpdateTextBlocklist(java.lang.String,models.TextBlocklist)` was added

#### `models.AnalyzeTextResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TextBlocklistMatch` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AnalyzeImageOptions` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `implementation.ContentSafetyClientImpl$ContentSafetyClientService` was modified

* `analyzeImage(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `analyzeImageSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `analyzeTextSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `analyzeText(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added

#### `models.TextBlocklistItem` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RemoveTextBlocklistItemsOptions` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `implementation.BlocklistClientImpl$BlocklistClientService` was modified

* `addOrUpdateBlocklistItems(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `removeBlocklistItems(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `addOrUpdateBlocklistItemsSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `removeBlocklistItemsSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added

#### `models.TextBlocklist` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AnalyzeTextOptions` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `getText2()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `implementation.JsonMergePatchHelper$TextBlocklistAccessor` was modified

* `isJsonMergePatch(models.TextBlocklist)` was added

#### `models.ImageCategoriesAnalysis` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AnalyzeImageResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AddOrUpdateTextBlocklistItemsOptions` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ContentSafetyImageData` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TextCategoriesAnalysis` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `BlocklistClient` was modified

* `createOrUpdateTextBlocklist(java.lang.String,models.TextBlocklist)` was added

## 1.0.8 (2024-10-25)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.15.4` to version `1.15.5`.
- Upgraded `azure-core` from `1.52.0` to version `1.53.0`.


## 1.0.7 (2024-09-27)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.51.0` to version `1.52.0`.
- Upgraded `azure-core-http-netty` from `1.15.3` to version `1.15.4`.


## 1.0.6 (2024-08-24)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.15.2` to version `1.15.3`.
- Upgraded `azure-core` from `1.50.0` to version `1.51.0`.

## 1.0.5 (2024-07-26)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.15.1` to version `1.15.2`.
- Upgraded `azure-core` from `1.49.1` to version `1.50.0`.


## 1.0.4 (2024-06-27)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.15.0` to version `1.15.1`.
- Upgraded `azure-core` from `1.49.0` to version `1.49.1`.


## 1.0.3 (2024-05-28)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.48.0` to version `1.49.0`.
- Upgraded `azure-core-http-netty` from `1.14.2` to version `1.15.0`.


## 1.0.2 (2024-04-23)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.47.0` to version `1.48.0`.
- Upgraded `azure-core-http-netty` from `1.14.1` to version `1.14.2`.


## 1.0.1 (2024-03-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.45.1` to version `1.47.0`.
- Upgraded `azure-core-http-netty` from `1.13.11` to version `1.14.1`.


## 1.0.0 (2023-12-13)

### Features Added
- Support Microsoft Entra ID Authentication
- Support 8 severity level for AnalyzeText
### Breaking Changes
Contract change for AnalyzeText, AnalyzeImage, Blocklist management related methods
#### AnalyzeText
- AnalyzeTextOptions
  - Renamed `breakByBlocklists` to `haltOnBlocklistHit`
  - Added `AnalyzeTextOutputType`
- AnalyzeTextResult
  - Renamed `blocklistsMatchResults` to `blocklistsMatch`
  - Replaced `TextAnalyzeSeverityResult` by `TextCategoriesAnalysis`
#### AnalyzeImage
- AnalyzeImageOptions
    - Replaced `ImageData` by `ContentSafetyImageData`
    - Added `AnalyzeImageOutputType`
- AnalyzeImageResult
    - Replaced `ImageAnalyzeSeverityResult` by `ImageCategoriesAnalysis`
#### Blocklist management
- Added `BlocklistAsyncClient`
- Renamed `AddBlockItemsOptions` to `AddOrUpdateTextBlocklistItemsOptions`
- Renamed `AddBlockItemsResult` to `AddOrUpdateTextBlocklistItemsResult`
- Renamed `RemoveBlockItemsOptions` to `RemoveTextBlocklistItemsOptions`
- Renamed `TextBlockItemInfo` to `TextBlocklistItem`

### Other Changes
#### Dependency Updates
- Upgraded `azure-core` from `1.43.0` to version `1.45.0`.
- Upgraded `azure-core-http-netty` from `1.13.7` to version `1.13.10`.
- Upgraded `azure-identity` from `1.10.1` to version `1.11.0`
## 1.0.0-beta.1 (2023-09-28)

- Azure AI ContentSafety client library for Java. This package contains Microsoft Azure ContentSafety client library.

### Features Added
* Text Analysis API: Scans text for sexual content, violence, hate, and self harm with multi-severity levels.
* Image Analysis API: Scans images for sexual content, violence, hate, and self harm with multi-severity levels.
* Text Blocklist Management APIs: The default AI classifiers are sufficient for most content safety needs; however, you might need to screen for terms that are specific to your use case. You can create blocklists of terms to use with the Text API.
