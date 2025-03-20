# Release History

## 4.7.0-beta.1 (Unreleased)

### Breaking Changes

#### `implementation.models.RoleAssignmentListResult` was removed

#### `implementation.KeyVaultAccessControlClientImpl` was removed

#### `implementation.models.RoleDefinitionFilter` was removed

#### `implementation.KeyVaultErrorCodeStrings` was removed

#### `implementation.models.KeyVaultError` was removed

#### `implementation.KeyVaultSettingsClientImpl` was removed

#### `implementation.models.SelectiveKeyRestoreOperationHeaders` was removed

#### `implementation.models.FullRestoreOperationHeaders` was removed

#### `implementation.models.KeyVaultErrorException` was removed

#### `implementation.KeyVaultBackupClientImpl$KeyVaultBackupClientService` was removed

#### `implementation.models.FullBackupHeaders` was removed

#### `implementation.models.RoleDefinitionListResult` was removed

#### `implementation.models.RoleAssignmentFilter` was removed

#### `implementation.KeyVaultBackupClientImpl` was removed

#### `implementation.KeyVaultSettingsClientImpl$KeyVaultSettingsClientService` was removed

#### `implementation.models.SelectiveKeyRestoreOperationResponse` was removed

#### `implementation.RoleAssignmentsImpl$RoleAssignmentsService` was modified

* `get(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listForScopeNext(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listForScope(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `delete(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `createSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleAssignmentCreateParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `listForScopeSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `create(java.lang.String,java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleAssignmentCreateParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `listForScopeNextSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `implementation.models.RoleDefinition` was modified

* `getAssignableScopes()` was removed
* `setPermissions(java.util.List)` was removed
* `getRoleType()` was removed
* `setRoleType(models.KeyVaultRoleType)` was removed
* `getPermissions()` was removed
* `setAssignableScopes(java.util.List)` was removed
* `getRoleName()` was removed
* `getDescription()` was removed
* `setDescription(java.lang.String)` was removed
* `setRoleName(java.lang.String)` was removed

#### `implementation.models.RestoreOperation` was modified

* `setStatus(java.lang.String)` was removed
* `setError(implementation.models.Error)` was removed
* `setStatusDetails(java.lang.String)` was removed
* `implementation.models.Error getError()` -> `implementation.models.FullBackupOperationError getError()`
* `setJobId(java.lang.String)` was removed
* `setStartTime(java.time.OffsetDateTime)` was removed
* `java.lang.String getStatus()` -> `implementation.models.OperationStatus getStatus()`
* `setEndTime(java.time.OffsetDateTime)` was removed

#### `implementation.models.SelectiveKeyRestoreOperation` was modified

* `setJobId(java.lang.String)` was removed
* `setStartTime(java.time.OffsetDateTime)` was removed
* `java.lang.String getStatus()` -> `implementation.models.OperationStatus getStatus()`
* `setStatusDetails(java.lang.String)` was removed
* `implementation.models.Error getError()` -> `implementation.models.FullBackupOperationError getError()`
* `setEndTime(java.time.OffsetDateTime)` was removed
* `setError(implementation.models.Error)` was removed
* `setStatus(java.lang.String)` was removed

#### `implementation.models.UpdateSettingRequest` was modified

* `setValue(java.lang.String)` was removed

#### `implementation.RoleDefinitionsImpl$RoleDefinitionsService` was modified

* `listNext(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `createOrUpdate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleDefinitionCreateParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `list(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `createOrUpdateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleDefinitionCreateParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `listNextSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `get(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `delete(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `implementation.KeyVaultAdministrationUtils` was modified

* `toKeyVaultError(implementation.models.KeyVaultError)` was removed
* `toKeyVaultAdministrationException(implementation.models.KeyVaultErrorException)` was removed
* `createKeyVaultErrorFromError(implementation.models.Error)` was removed

#### `implementation.models.RoleAssignmentPropertiesWithScope` was modified

* `setRoleDefinitionId(java.lang.String)` was removed
* `setPrincipalId(java.lang.String)` was removed
* `setScope(models.KeyVaultRoleScope)` was removed

#### `implementation.models.FullBackupOperation` was modified

* `setAzureStorageBlobContainerUri(java.lang.String)` was removed
* `setError(implementation.models.Error)` was removed
* `setStartTime(java.time.OffsetDateTime)` was removed
* `setStatus(java.lang.String)` was removed
* `java.lang.String getStatus()` -> `implementation.models.OperationStatus getStatus()`
* `setStatusDetails(java.lang.String)` was removed
* `setJobId(java.lang.String)` was removed
* `implementation.models.Error getError()` -> `implementation.models.FullBackupOperationError getError()`
* `setEndTime(java.time.OffsetDateTime)` was removed

#### `implementation.models.RoleAssignment` was modified

* `setProperties(implementation.models.RoleAssignmentPropertiesWithScope)` was removed

#### `implementation.RoleDefinitionsImpl` was modified

* `listNextSinglePage(java.lang.String,java.lang.String)` was removed
* `delete(java.lang.String,java.lang.String,java.lang.String)` was removed
* `getWithResponseAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `deleteWithResponseAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listNextSinglePageAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `createOrUpdateAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleDefinitionCreateParameters,com.azure.core.util.Context)` was removed
* `deleteAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listNextSinglePageAsync(java.lang.String,java.lang.String)` was removed
* `listNextSinglePage(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `list(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listSinglePage(java.lang.String,java.lang.String,java.lang.String)` was removed
* `deleteWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listSinglePage(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `createOrUpdate(java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleDefinitionCreateParameters)` was removed
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `get(java.lang.String,java.lang.String,java.lang.String)` was removed
* `getAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `createOrUpdateAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleDefinitionCreateParameters)` was removed
* `listSinglePageAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listSinglePageAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `list(java.lang.String,java.lang.String,java.lang.String)` was removed
* `deleteAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `createOrUpdateWithResponse(java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleDefinitionCreateParameters,com.azure.core.util.Context)` was removed
* `listAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `createOrUpdateWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleDefinitionCreateParameters,com.azure.core.util.Context)` was removed
* `createOrUpdateWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleDefinitionCreateParameters)` was removed

#### `implementation.models.Setting` was modified

* `setType(models.KeyVaultSettingType)` was removed

#### `implementation.RoleAssignmentsImpl` was modified

* `listForScope(java.lang.String,java.lang.String,java.lang.String)` was removed
* `createAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleAssignmentCreateParameters,com.azure.core.util.Context)` was removed
* `createWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleAssignmentCreateParameters,com.azure.core.util.Context)` was removed
* `listForScopeSinglePageAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `createAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleAssignmentCreateParameters)` was removed
* `deleteWithResponseAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `getWithResponseAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listForScopeNextSinglePage(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `delete(java.lang.String,java.lang.String,java.lang.String)` was removed
* `deleteWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listForScopeAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listForScopeNextSinglePageAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listForScopeSinglePage(java.lang.String,java.lang.String,java.lang.String)` was removed
* `getWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `createWithResponse(java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleAssignmentCreateParameters,com.azure.core.util.Context)` was removed
* `listForScopeSinglePageAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `get(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listForScopeSinglePage(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listForScopeNextSinglePage(java.lang.String,java.lang.String)` was removed
* `listForScopeAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `create(java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleAssignmentCreateParameters)` was removed
* `getAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `createWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.RoleAssignmentCreateParameters)` was removed
* `deleteWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listForScope(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listForScopeNextSinglePageAsync(java.lang.String,java.lang.String)` was removed

### Features Added

* `implementation.KeyVaultAdministrationClientImpl` was added

* `implementation.models.OperationStatus` was added

* `implementation.models.PreBackupOperationParameters` was added

* `implementation.models.FullBackupOperationError` was added

* `implementation.KeyVaultAdministrationClientImpl$KeyVaultAdministrationClientService` was added

* `implementation.models.PreRestoreOperationParameters` was added

#### `implementation.RoleAssignmentsImpl$RoleAssignmentsService` was modified

* `listForScopeNext(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `createSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `delete(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `listForScopeNextSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `listForScope(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `get(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `create(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `listForScopeSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `deleteSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added

#### `implementation.models.RoleDefinition` was modified

* `getProperties()` was added

#### `implementation.RoleDefinitionsImpl$RoleDefinitionsService` was modified

* `deleteSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `listSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `delete(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `list(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `listNextSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `listNext(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `createOrUpdate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `get(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `createOrUpdateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added

#### `KeyVaultBackupClient` was modified

* `beginPreBackup(java.lang.String,java.lang.String)` was added
* `beginPreRestore(java.lang.String,java.lang.String)` was added

#### `KeyVaultBackupAsyncClient` was modified

* `beginPreBackup(java.lang.String,java.lang.String)` was added
* `beginPreRestore(java.lang.String,java.lang.String)` was added

#### `implementation.KeyVaultAdministrationUtils` was modified

* `toKeyVaultAdministrationError(java.lang.Object)` was added
* `toKeyVaultAdministrationException(com.azure.core.exception.HttpResponseException)` was added

#### `implementation.RoleDefinitionsImpl` was modified

* `deleteWithResponse(java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getWithResponse(java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `list(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `listAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `deleteWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `createOrUpdateWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `getWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getServiceVersion()` was added
* `listNextSinglePageAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `createOrUpdateWithResponse(java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `listSinglePageAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added

#### `implementation.RoleAssignmentsImpl` was modified

* `getServiceVersion()` was added
* `listForScope(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getWithResponse(java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `createWithResponse(java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `deleteWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `listForScopeAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `deleteWithResponse(java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `listForScopeSinglePageAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `createWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `listForScopeNextSinglePageAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added

## 4.6.3 (2025-03-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.54.1` to version `1.55.2`.
- Upgraded `azure-json` from `1.3.0` to version `1.4.0`.
- Upgraded `azure-core-http-netty` from `1.15.7` to version `1.15.10`.

## 4.6.2 (2025-01-14)

### Bugs Fixed
- Fixed issue where certain `toString()` calls could cause a `NullPointerException`. ([#43776](https://github.com/Azure/azure-sdk-for-java/pull/43776))

## 4.6.1 (2024-12-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.53.0` to version `1.54.1`.
- Upgraded `azure-core-http-netty` from `1.15.5` to version `1.15.7`.

## 4.6.0 (2024-10-15)

## Features Added
- Added support for Continuous Access Evaluation (CAE). ([#41814](https://github.com/Azure/azure-sdk-for-java/pull/41814))

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.52.0` to version `1.53.0`.
- Upgraded `azure-core-http-netty` from `1.15.4` to version `1.15.5`.

## 4.5.8 (2024-09-27)

### Other Changes

#### Dependency Updates

- Upgraded `azure-json` from `1.2.0` to version `1.3.0`.
- Upgraded `azure-core-http-netty` from `1.15.3` to version `1.15.4`.
- Upgraded `azure-core` from `1.51.0` to version `1.52.0`.

## 4.5.7 (2024-08-24)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.50.0` to version `1.51.0`.
- Upgraded `azure-core-http-netty` from `1.15.2` to version `1.15.3`.

## 4.5.6 (2024-07-29)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.49.1` to version `1.50.0`.
- Upgraded `azure-json` from `1.1.0` to version `1.2.0`. 
- Upgraded `azure-core-http-netty` from `1.15.1` to version `1.15.2`.

## 4.5.5 (2024-06-27)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.49.0` to version `1.49.1`.
- Upgraded `azure-core-http-netty` from `1.15.0` to version `1.15.1`.

## 4.5.4 (2024-05-13)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.48.0` to version `1.49.0`.
- Upgraded `azure-core-http-netty` from `1.14.2` to version `1.15.0`.

## 4.5.3 (2024-04-30)

### Other Changes

- No changes but only upgrade version to fix Microsoft Doc.

## 4.5.2 (2024-04-23)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.47.0` to version `1.48.0`.
- Upgraded `azure-core-http-netty` from `1.14.1` to version `1.14.2`.

## 4.5.1 (2024-03-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.46.0` to version `1.47.0`.
- Upgraded `azure-core-http-netty` from `1.14.0` to version `1.14.1`.

## 4.5.0 (2024-02-22)
Changes when compared to the last stable release (`4.4.3`) include:

### Features Added
- Added support for service version `7.5`.
- Managed Identity can now be used in place of a SAS token to access the blob storage resource when performing backup and restore operations using a `KeyVaultBackupClient` or `KeyVaultBackupAsyncClient`. This is now the default behavior if a `null` SAS token is provided to the `beginBackup()`, `beginRestore()` or `beginSelectiveRestore()` methods.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.45.1` to version `1.46.0`.
- Upgraded `azure-core-http-netty` from `1.13.11` to version `1.14.0`.

## 4.4.3 (2023-12-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.13.10` to version `1.13.11`.
- Upgraded `azure-core` from `1.45.0` to version `1.45.1`.

## 4.4.2 (2023-11-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.44.1` to version `1.45.0`.
- Upgraded `azure-core-http-netty` from `1.13.9` to version `1.13.10`.

## 4.5.0-beta.1 (2023-11-09)

### Features Added
- Added support for service version `7.5-preview.1`.
- Managed Identity can now be used in place of a SAS token to access the blob storage resource when performing backup and restore operations using a `KeyVaultBackupClient` or `KeyVaultBackupAsyncClient`. This is now the default behavior if a `null` SAS token is provided to the `beginBackup()`, `beginRestore()` or `beginSelectiveRestore()` methods.

#### Dependency Updates
- Upgraded `azure-core` from `1.44.1` to version `1.45.0`.
- Upgraded `azure-core-http-netty` from `1.13.9` to version `1.13.10`.

## 4.4.1 (2023-10-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.13.7` to version `1.13.9`.
- Upgraded `azure-core` from `1.43.0` to version `1.44.1`.

## 4.4.0 (2023-09-25)

### Other Changes
- Explicitly added a `values()` method to all `ExpandableStringEnum` models:
    - `KeyVaultDataAction`
    - `KeyVaultRoleDefinitionType`
    - `KeyVaultRoleScope`
    - `KeyVaultRoleType`
    - `KeyVaultSettingType`
  Functionality remains the same as the aforementioned method simply calls the implementation in the parent class.
- Migrate test recordings to assets repo.

#### Dependency Updates

- Upgraded `azure-core` from `1.42.0` to version `1.43.0`.
- Upgraded `azure-core-http-netty` from `1.13.6` to version `1.13.7`.
- Upgraded `azure-json` from `1.0.1` to version `1.1.0`.

## 4.3.5 (2023-08-21)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.41.0` to version `1.42.0`.
- Upgraded `azure-core-http-netty` from `1.13.5` to version `1.13.6`.

## 4.3.4 (2023-07-25)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.40.0` to version `1.41.0`.
- Upgraded `azure-core-http-netty` from `1.13.4` to version `1.13.5`.

## 4.3.3 (2023-06-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.39.0` to version `1.40.0`.
- Upgraded `azure-core-http-netty` from `1.13.3` to version `1.13.4`.

## 4.3.2 (2023-05-23)

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.13.2` to version `1.13.3`.
- Upgraded `azure-core` from `1.38.0` to version `1.39.0`.

## 4.3.1 (2023-04-20)

### Other Changes

- Test proxy server migration.
- Made all logger instances static.

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.13.1` to version `1.13.2`.
- Upgraded `azure-core` from `1.37.0` to version `1.38.0`.

## 4.3.0 (2023-03-18)

### Features Added
- Added support for service version `7.4`.
- Added `KeyVaultSettingsClient` and `KeyVaultSettingsAsyncClient` to get and update Managed HSM settings.

### Breaking Changes
> These changes do not impact the API of stable versions such as `4.2.4`. Only code written against a beta version such as `4.3.0-beta.1` may be affected.
- Removed support for service version `7.4-preview.1`.
- Removed `KeyVaultSetting.asString()`, as well as the `KeyVaultSetting(String, String, KeyVaultSettingType)` constructor.

### Other Changes
- Upgraded `azure-core-http-netty` from `1.13.0` to version `1.13.1`.
- Upgraded `azure-core` from `1.36.0` to version `1.37.0`.

## 4.2.4 (2023-02-16)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.12.8` to version `1.13.0`.
- Upgraded `azure-core` from `1.35.0` to version `1.36.0`.

## 4.2.3 (2023-01-09)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` from `1.34.0` to version `1.35.0`.
- Upgraded `azure-core-http-netty` from `1.12.7` to version `1.12.8`.

## 4.3.0-beta.1 (2022-11-11)

### Features Added
- Added `KeyVaultSettingsClient` and `KeyVaultSettingsAsyncClient` to get and update Managed HSM settings.
- Added support for service version `7.4-preview.1`.

## 4.2.2 (2022-11-10)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` from `1.33.0` to version `1.34.0`.
- Upgraded `azure-core-http-netty` from `1.12.6` to version `1.12.7`.

## 4.2.1 (2022-10-17)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` from `1.32.0` to version `1.33.0`.
- Upgraded `azure-core-http-netty` from `1.12.5` to version `1.12.6`.

## 4.2.0 (2022-09-20)

### Breaking Changes
- Made it so that we verify that the challenge resource matches the vault domain by default. This should affect few customers who can use the `disableChallengeResourceVerification()` method in client builders to disable this functionality. See https://aka.ms/azsdk/blog/vault-uri for more information.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.31.0` to version `1.32.0`.
- Upgraded `azure-core-http-netty` from `1.12.4` to version `1.12.5`.

## 4.1.5 (2022-08-15)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.31.0`.
- Upgraded `azure-core-http-netty` dependency to `1.12.4`.

## 4.1.4 (2022-07-06)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.30.0`.
- Upgraded `azure-core-http-netty` dependency to `1.12.3`.

## 4.1.3 (2022-06-10)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.29.1`.
- Upgraded `azure-core-http-netty` dependency to `1.12.2`.

## 4.1.2 (2022-05-10)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.28.0`.
- Upgraded `azure-core-http-netty` dependency to `1.12.0`.

## 4.1.1 (2022-04-08)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.27.0`.
- Upgraded `azure-core-http-netty` dependency to `1.11.9`.

## 4.1.0 (2022-03-31)

### Features Added
- Added support for service version `7.3`.
- Added the following values to `KeyVaultDataAction`:
  - `WRITE_ROLE_DEFINITION`
  - `DELETE_ROLE_DEFINITION`
  - `RELEASE_KEY`
  - `DOWNLOAD_HSM_SECURITY_DOMAIN_STATUS`
  - `RANDOM_NUMBERS_GENERATE`
- Implemented new traits (micro-interfaces) in `KeyVaultAccessControlClientBuilder` and `KeyVaultBackupClientBuilder`. This makes the experience of using client builders more consistent across libraries in the Azure SDK for Java.

## 4.0.8 (2022-03-17)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.26.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.8`

## 4.1.0-beta.5 (2022-02-11)

### Features added
- Implemented new traits (micro-interfaces) in `KeyVaultAccessControlClientBuilder` and `KeyVaultBackupClientBuilder`. This makes the experience of using client builders more consistent across libraries in the Azure SDK for Java.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.25.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.7`

## 4.0.7 (2022-02-11)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.25.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.7`

## 4.1.0-beta.4 (2022-01-13)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.24.1`
- Upgraded `azure-core-http-netty` dependency to `1.11.6`

## 4.0.6 (2022-01-12)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.24.1`
- Upgraded `azure-core-http-netty` dependency to `1.11.6`

## 4.1.0-beta.3 (2021-11-12)

### Features Added

- Added support for multi-tenant authentication in clients.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.22.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.2`

## 4.0.5 (2021-11-12)

### Features Added

- Added support for multi-tenant authentication in clients.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.22.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.2`

## 4.1.0-beta.2 (2021-10-07)

### Bugs Fixed
- Fixed an issue that made clients send unnecessary unauthorized requests to obtain a bearer challenge from the service even when already possessing a valid bearer token.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.21.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.1`

## 4.0.4 (2021-10-06)

### Bugs Fixed
- Fixed an issue that made clients send unnecessary unauthorized requests to obtain a bearer challenge from the service even when already possessing a valid bearer token.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.21.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.1`

## 4.1.0-beta.1 (2021-09-10)

### Features Added
- Added support for service version `7.3-preview`.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.20.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.0`

## 4.0.3 (2021-09-10)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.20.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.0`

## 4.0.2 (2021-08-12)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.19.0`
- Upgraded `azure-core-http-netty` dependency to `1.10.2`

## 4.0.1 (2021-07-08)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.18.0`
- Upgraded `azure-core-http-netty` dependency to `1.10.1`

## 4.0.0 (2021-06-17)
- Initial release of `KeyVaultAccessControlClient` and `KeyVaultAccessControlAsyncClient` to manage role assignments and definitions for Managed HSM.
- Initial release of `KeyVaultBackupClient` and `KeyVaultBackupAsyncClient` to backup and restore Managed HSM.

### Features Added
- Changed default service version to `7.2`.
- Added `KeyVaultKeyIdentifier` to parse key URLs.
- Added local-only support for `CryptographyClient` and `CryptographyAsyncClient` by providing a `JsonWebKey` during client creation.
- Added `KeyType.OCT-HSM` to support oct-HSM key operations to support Managed HSM.
- Added the `CreateOctKeyOptions` class and associated `createOctKey()` methods.
- Added AES-GCM and AES-CBC support for encrypting and decrypting, including new `Encrypt` and `Decrypt` overloads.
- Added the ability to set a public exponent on RSA keys during creation.
- Made all getters for properties of a `JsonWebKey` public.

### Changes since 4.0.0-beta.7

#### Bug Fixes
- Ensured that `RetryPolicy` and `HttpLogOptions` use a default implementation when creating Key Vault clients if not set or set to `null`.

#### Breaking Changes 
- Renamed `beginSelectiveRestore()` to `beginSelectiveKeyRestore()` in `KeyVaultBackupClient` and `KeyVaultBackupAsyncClient`. Made the aforementioned operation return the new `KeyVaultSelectiveKeyRestoreOperation` instead of a `KeyVaultRestoreOperation`.
- Changed the final return type of `beginRestore()` and `beginSelectiveKeyRestore()`'s poller types from `Void` to the new `KeyVaultRestoreResult` and `KeyVaultSelectiveKeyRestoreResult`, respectively.
- `KeyVaultBackupClient` and `KeyVaultBackupAsyncClient`'s long-running operations now throw a `RuntimeException` when cancellation is attempted, as it is not currently supported.
- Made `KeyVaultRoleDefinition` flat, as opposed to it having a `KeyVaultRoleDefinitionProperties` member with more properties inside of it.
- Moved `roleScope` from `KeyVaultRoleAssignment` to `KeyVaultRoleAssignmentProperties` and renamed it to `scope`.
- Moved `SetRoleDefinitionOptions` from the `options` package to the `models` package.
- Removed `roleType` from `SetRoleDefinitionOptions`.
- Removed service method overloads that take a `pollingInterval`, since `PollerFlux` and `SyncPoller` objects allow for setting this value directly on them.
- Delete methods on the `KeyVaultAccessControlClient` now return a `void` or `Mono<Void>` and ignore HTTP `404`s.
- Renamed `jobId` and `getJobId()` to `operationId` and `getOperationId()` in `KeyVaultLongRunningOperation` and its children classes.
- Made the following classes `final`:
    - `KeyVaultDataAction`
    - `KeyVaultRoleDefinitionType`
    - `KeyVaultRoleType`
    - `SetRoleDefinitionOptions`

## 4.0.0-beta.7 (2021-05-15)

### New features

- Added support for creating, retrieving, updating and deleting custom role definitions.

### Breaking Changes

- Added the public `KeyVaultAdministrationException`, which will be thrown in place of an exception with the same name in the `implementation` package.

#### Behavioral Changes

### Dependency Updates
- Upgraded `azure-core` dependency to `1.16.0`
- Upgraded `azure-core-http-netty` dependency to `1.9.2`
- Upgraded `azure-core-http-okhttp` dependency to `1.6.2`
- Upgraded `azure-identity` dependency to `1.3.0`

## 4.0.0-beta.6 (2021-04-09)

### New features
- Added support for service version `7.2`.
- Added support to specify whether or not a pipeline policy should be added per call or per retry.

## 4.0.0-beta.5 (2021-03-12)

### Changed
- Changed logging level in `onRequest` and `onSuccess` calls for service operations from `INFO` to `VERBOSE`.

### Dependency Updates
- Upgraded `azure-core` dependency to `1.14.0`
- Upgraded `azure-core-http-netty` dependency to `1.9.0`
- Upgraded `azure-core-http-okhttp` dependency to `1.6.0`
- Upgraded `azure-identity` dependency to `1.2.4`

## 4.0.0-beta.4 (2021-02-11)

### Dependency Updates
- Upgraded `azure-core` dependency to `1.13.0`
- Upgraded `azure-core-http-netty` dependency to `1.8.0`
- Upgraded `azure-core-http-okhttp` dependency to `1.5.0`
- Upgraded `azure-identity` dependency to `1.2.3`

## 4.0.0-beta.3 (2020-11-12)

### New Features
- Added support for passing a `ServiceVersion` in clients and their builders.

### Breaking Changes
- Removed exposure of `implementation` (internal) package types via `module-info.java`
- Renamed `KeyVaultRoleAssignmentScope` to `KeyVaultRoleScope` to be in line with other languages.
- Changed the `KeyVaultRoleScope` enum from using `URI` to `URL` and added an overload that accepts a `String` representation of a `URL` too.
- Renamed the `scope` property of `KeyVaultRoleAssignment` to `roleScope` to align with the access client APIs.
- Renamed the `name` parameter to `roleAssignmentName` in role assignment-related APIs, as well as its type from `UUID` to `String`.
- Removed APIs for re-hydrating long-running operations as the guidelines regarding such methods are a still a work in progress
- Annotated read-only classes with `@Immutable`.
- Renamed `actions` and `dataActions` to `allowedActions` and `allowedDataActions` in `KeyVaultPermission`.
- Changed the type of `startTime` and `endTime` from `Long` to `OffsetDateTime` in `KeyVaultLongRunningOperation` and its sub-types.
- Renamed `azureStorageBlobContainerUri` to `azureStorageBlobContainerUrl` in `KeyVaultBackupOperation`, as well as its getter method.
- Removed the use of `KeyVaultRoleAssignmentProperties` in clients' public APIs in favor of using the `roleDefinitionId` and `servicePrincipalId` values directly.

## 4.0.0-beta.2 (2020-10-09)

### New Features
- Added the new public APIs `getBackupOperation` and `getRestoreOperation` for querying the status of long-running operations in `KeyVaultBackupClient` and `KeyVaultBackupAsyncClient`.
- Added API overloads that allow for passing specific polling intervals for long-running operations:
    - `KeyVaultBackupAsyncClient`
        - `beginBackup(String, String, Duration)`
        - `beginRestore(String, String, String, Duration)`
        - `beginSelectiveRestore(String, String, String, String, Duration)`
    - `KeyVaultBackupClient`
        - `beginBackup(String, String, Duration)`
        - `beginRestore(String, String, String, Duration)`
        - `beginSelectiveRestore(String, String, String, String, Duration)`
- Added support for `com.azure.core.util.ClientOptions` in client builders.

### Dependency Updates
- Upgraded `azure-core` dependency to `1.9.0`
- Upgraded `azure-core-http-netty` dependency to `1.6.2`
- Upgraded `azure-core-http-okhttp` dependency to `1.3.2`
- Upgraded `azure-core-test` dependency to `1.5.0`
- Upgraded `azure-identity` dependency to `1.1.3`

## 4.0.0-beta.1 (2020-09-11)
- Added `KeyVaultBackupClient` and `KeyVaultBackupAsyncClient`.
- Added `KeyVaultAccessControlClient` and `KeyVaultAccessControlAsyncClient`.
