# Release History

## 1.0.0-beta.2 (2025-04-15)

- Azure Resource Manager Trusted Signing client library for Java. This package contains Microsoft Azure SDK for Trusted Signing Management SDK. Code Signing resource provider api. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.CodeSigningAccountPatch` was modified

* `models.AccountSku sku()` -> `models.AccountSkuPatch sku()`
* `withSku(models.AccountSku)` was removed

#### `models.CodeSigningAccount$Update` was modified

* `withSku(models.AccountSku)` was removed

#### `models.CertificateProfileProperties` was modified

* `organizationUnit()` was removed
* `state()` was removed
* `city()` was removed
* `country()` was removed
* `postalCode()` was removed
* `commonName()` was removed
* `enhancedKeyUsage()` was removed
* `organization()` was removed
* `streetAddress()` was removed

### Features Added

* `models.AccountSkuPatch` was added

#### `models.CodeSigningAccountPatch` was modified

* `withSku(models.AccountSkuPatch)` was added

#### `models.CodeSigningAccount$Update` was modified

* `withSku(models.AccountSkuPatch)` was added

#### `models.Certificate` was modified

* `enhancedKeyUsage()` was added

## 1.0.0-beta.1 (2024-09-27)

- Azure Resource Manager Trusted Signing client library for Java. This package contains Microsoft Azure SDK for Trusted Signing Management SDK. Code Signing resource provider api. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

- Initial release for the azure-resourcemanager-trustedsigning Java SDK.
