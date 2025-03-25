# Release History

## 1.0.0-beta.2 (2025-03-25)

- Azure Resource Manager Trusted Signing client library for Java. This package contains Microsoft Azure SDK for Trusted Signing Management SDK. Code Signing resource provider api. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.CodeSigningAccountPatch` was modified

* `models.AccountSku sku()` -> `models.AccountSkuPatch sku()`
* `withSku(models.AccountSku)` was removed

#### `models.CodeSigningAccount$Update` was modified

* `withSku(models.AccountSku)` was removed

#### `models.CertificateProfileProperties` was modified

* `postalCode()` was removed
* `state()` was removed
* `country()` was removed
* `streetAddress()` was removed
* `enhancedKeyUsage()` was removed
* `city()` was removed
* `organization()` was removed
* `organizationUnit()` was removed
* `commonName()` was removed

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
