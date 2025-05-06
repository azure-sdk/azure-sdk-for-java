# Release History

## 4.8.0-beta.2 (Unreleased)

### Breaking Changes

#### `implementation.models.Attributes` was removed

#### `implementation.models.PendingCertificateSigningRequestResult` was removed

#### `implementation.models.KeyVaultError` was removed

#### `implementation.models.KeyVaultErrorException` was removed

#### `implementation.models.CertificateItem` was modified

* `setAttributes(implementation.models.CertificateAttributes)` was removed
* `setTags(java.util.Map)` was removed
* `setX509Thumbprint(byte[])` was removed
* `setId(java.lang.String)` was removed

#### `implementation.models.CertificateOperationUpdateParameter` was modified

* `setCancellationRequested(boolean)` was removed

#### `implementation.models.Action` was modified

* `models.CertificatePolicyAction getActionType()` -> `implementation.models.CertificatePolicyAction getActionType()`
* `setActionType(models.CertificatePolicyAction)` was removed

#### `implementation.CertificateIssuerHelper$CertificateIssuerAccessor` was modified

* `getImpl(models.CertificateIssuer)` was removed

#### `implementation.CertificateClientImpl` was modified

* `getCertificatesNextSinglePageAsync(java.lang.String,java.lang.String)` was removed
* `setCertificateIssuer(java.lang.String,java.lang.String,java.lang.String,implementation.models.IssuerCredentials,implementation.models.OrganizationDetails,implementation.models.IssuerAttributes)` was removed
* `deleteCertificateIssuerAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteCertificateWithResponseAsync(java.lang.String,java.lang.String)` was removed
* `getDeletedCertificateWithResponseAsync(java.lang.String,java.lang.String)` was removed
* `getCertificateIssuersSinglePageAsync(java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed
* `getCertificateContactsAsync(java.lang.String)` was removed
* `getDeletedCertificateWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getDeletedCertificatesNextSinglePage(java.lang.String,java.lang.String)` was removed
* `updateCertificateOperationWithResponseAsync(java.lang.String,java.lang.String,boolean)` was removed
* `getDeletedCertificatesNextSinglePageAsync(java.lang.String,java.lang.String)` was removed
* `createCertificateAsync(java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map,com.azure.core.util.Context)` was removed
* `getCertificateContacts(java.lang.String)` was removed
* `mergeCertificateWithResponseAsync(java.lang.String,java.lang.String,java.util.List,implementation.models.CertificateAttributes,java.util.Map)` was removed
* `getCertificatesNextSinglePageAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `purgeDeletedCertificateWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificatePolicyWithResponseAsync(java.lang.String,java.lang.String)` was removed
* `updateCertificateOperation(java.lang.String,java.lang.String,boolean)` was removed
* `updateCertificateOperationWithResponseAsync(java.lang.String,java.lang.String,boolean,com.azure.core.util.Context)` was removed
* `updateCertificateOperationAsync(java.lang.String,java.lang.String,boolean)` was removed
* `deleteCertificateAsync(java.lang.String,java.lang.String)` was removed
* `deleteCertificateContactsWithResponseAsync(java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificatesAsync(java.lang.String,java.lang.Integer,java.lang.Boolean,com.azure.core.util.Context)` was removed
* `deleteCertificateOperationAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `getCertificateIssuersAsync(java.lang.String,java.lang.Integer)` was removed
* `mergeCertificateWithResponseAsync(java.lang.String,java.lang.String,java.util.List,implementation.models.CertificateAttributes,java.util.Map,com.azure.core.util.Context)` was removed
* `recoverDeletedCertificate(java.lang.String,java.lang.String)` was removed
* `getDeletedCertificatesAsync(java.lang.String,java.lang.Integer,java.lang.Boolean)` was removed
* `purgeDeletedCertificateWithResponseAsync(java.lang.String,java.lang.String)` was removed
* `getCertificateIssuersSinglePage(java.lang.String,java.lang.Integer)` was removed
* `getCertificateOperationWithResponseAsync(java.lang.String,java.lang.String)` was removed
* `getCertificateWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `mergeCertificateAsync(java.lang.String,java.lang.String,java.util.List,implementation.models.CertificateAttributes,java.util.Map)` was removed
* `restoreCertificate(java.lang.String,byte[])` was removed
* `updateCertificateWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map,com.azure.core.util.Context)` was removed
* `deleteCertificateOperationWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateIssuerWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateVersionsNextSinglePage(java.lang.String,java.lang.String)` was removed
* `getCertificateIssuersSinglePageAsync(java.lang.String,java.lang.Integer)` was removed
* `getCertificateVersionsAsync(java.lang.String,java.lang.String,java.lang.Integer)` was removed
* `deleteCertificateWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `setCertificateContactsAsync(java.lang.String,implementation.models.Contacts,com.azure.core.util.Context)` was removed
* `importCertificateWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map)` was removed
* `getCertificatesSinglePage(java.lang.String,java.lang.Integer,java.lang.Boolean)` was removed
* `backupCertificateWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateIssuers(java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed
* `getDeletedCertificatesSinglePage(java.lang.String,java.lang.Integer,java.lang.Boolean)` was removed
* `updateCertificate(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map)` was removed
* `createCertificateWithResponseAsync(java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map)` was removed
* `getCertificateIssuerAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `updateCertificateWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map)` was removed
* `getCertificatesSinglePageAsync(java.lang.String,java.lang.Integer,java.lang.Boolean)` was removed
* `setCertificateContacts(java.lang.String,implementation.models.Contacts)` was removed
* `createCertificateWithResponseAsync(java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map,com.azure.core.util.Context)` was removed
* `deleteCertificateContactsWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `deleteCertificateIssuer(java.lang.String,java.lang.String)` was removed
* `getCertificate(java.lang.String,java.lang.String,java.lang.String)` was removed
* `getDeletedCertificatesNextSinglePageAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateContactsWithResponseAsync(java.lang.String)` was removed
* `getCertificateIssuersNextSinglePageAsync(java.lang.String,java.lang.String)` was removed
* `updateCertificateAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map,com.azure.core.util.Context)` was removed
* `getCertificateIssuers(java.lang.String,java.lang.Integer)` was removed
* `getCertificateOperationWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `recoverDeletedCertificateAsync(java.lang.String,java.lang.String)` was removed
* `getCertificateIssuerWithResponseAsync(java.lang.String,java.lang.String)` was removed
* `recoverDeletedCertificateAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateVersionsSinglePage(java.lang.String,java.lang.String,java.lang.Integer)` was removed
* `importCertificateWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map,com.azure.core.util.Context)` was removed
* `getCertificateIssuerWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `recoverDeletedCertificateWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteCertificateIssuerWithResponseAsync(java.lang.String,java.lang.String)` was removed
* `setCertificateIssuerWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.IssuerCredentials,implementation.models.OrganizationDetails,implementation.models.IssuerAttributes)` was removed
* `getDeletedCertificate(java.lang.String,java.lang.String)` was removed
* `getDeletedCertificatesAsync(java.lang.String,java.lang.Integer,java.lang.Boolean,com.azure.core.util.Context)` was removed
* `deleteCertificateContacts(java.lang.String)` was removed
* `getCertificates(java.lang.String,java.lang.Integer,java.lang.Boolean,com.azure.core.util.Context)` was removed
* `mergeCertificateWithResponse(java.lang.String,java.lang.String,java.util.List,implementation.models.CertificateAttributes,java.util.Map,com.azure.core.util.Context)` was removed
* `deleteCertificateAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `setCertificateIssuerAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.IssuerCredentials,implementation.models.OrganizationDetails,implementation.models.IssuerAttributes,com.azure.core.util.Context)` was removed
* `updateCertificateIssuerWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.IssuerCredentials,implementation.models.OrganizationDetails,implementation.models.IssuerAttributes,com.azure.core.util.Context)` was removed
* `setCertificateContactsWithResponse(java.lang.String,implementation.models.Contacts,com.azure.core.util.Context)` was removed
* `getDeletedCertificates(java.lang.String,java.lang.Integer,java.lang.Boolean)` was removed
* `getCertificateIssuersNextSinglePage(java.lang.String,java.lang.String)` was removed
* `purgeDeletedCertificateAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `backupCertificateWithResponseAsync(java.lang.String,java.lang.String)` was removed
* `getCertificateOperationWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `updateCertificateWithResponse(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map,com.azure.core.util.Context)` was removed
* `getCertificatePolicyAsync(java.lang.String,java.lang.String)` was removed
* `updateCertificateIssuerWithResponse(java.lang.String,java.lang.String,java.lang.String,implementation.models.IssuerCredentials,implementation.models.OrganizationDetails,implementation.models.IssuerAttributes,com.azure.core.util.Context)` was removed
* `updateCertificateOperationWithResponse(java.lang.String,java.lang.String,boolean,com.azure.core.util.Context)` was removed
* `restoreCertificateWithResponseAsync(java.lang.String,byte[])` was removed
* `updateCertificateAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map)` was removed
* `getCertificateAsync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `purgeDeletedCertificateWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getDeletedCertificateAsync(java.lang.String,java.lang.String)` was removed
* `mergeCertificateAsync(java.lang.String,java.lang.String,java.util.List,implementation.models.CertificateAttributes,java.util.Map,com.azure.core.util.Context)` was removed
* `getCertificateOperationAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificatePolicyWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `backupCertificateAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `backupCertificateWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateIssuersNextSinglePage(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `restoreCertificateAsync(java.lang.String,byte[],com.azure.core.util.Context)` was removed
* `getCertificatesSinglePageAsync(java.lang.String,java.lang.Integer,java.lang.Boolean,com.azure.core.util.Context)` was removed
* `restoreCertificateWithResponseAsync(java.lang.String,byte[],com.azure.core.util.Context)` was removed
* `getCertificateWithResponseAsync(java.lang.String,java.lang.String,java.lang.String)` was removed
* `deleteCertificateOperationWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateOperation(java.lang.String,java.lang.String)` was removed
* `deleteCertificateContactsAsync(java.lang.String,com.azure.core.util.Context)` was removed
* `getDeletedCertificatesSinglePage(java.lang.String,java.lang.Integer,java.lang.Boolean,com.azure.core.util.Context)` was removed
* `deleteCertificateContactsWithResponseAsync(java.lang.String)` was removed
* `createCertificateWithResponse(java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map,com.azure.core.util.Context)` was removed
* `recoverDeletedCertificateWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `setCertificateContactsWithResponseAsync(java.lang.String,implementation.models.Contacts)` was removed
* `deleteCertificateIssuerAsync(java.lang.String,java.lang.String)` was removed
* `createCertificateAsync(java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map)` was removed
* `getDeletedCertificates(java.lang.String,java.lang.Integer,java.lang.Boolean,com.azure.core.util.Context)` was removed
* `getCertificatesAsync(java.lang.String,java.lang.Integer,java.lang.Boolean)` was removed
* `getCertificatePolicyWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `updateCertificateIssuer(java.lang.String,java.lang.String,java.lang.String,implementation.models.IssuerCredentials,implementation.models.OrganizationDetails,implementation.models.IssuerAttributes)` was removed
* `updateCertificateIssuerWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.IssuerCredentials,implementation.models.OrganizationDetails,implementation.models.IssuerAttributes)` was removed
* `updateCertificateOperationAsync(java.lang.String,java.lang.String,boolean,com.azure.core.util.Context)` was removed
* `restoreCertificateWithResponse(java.lang.String,byte[],com.azure.core.util.Context)` was removed
* `setCertificateIssuerWithResponseAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.IssuerCredentials,implementation.models.OrganizationDetails,implementation.models.IssuerAttributes,com.azure.core.util.Context)` was removed
* `getCertificateVersionsSinglePageAsync(java.lang.String,java.lang.String,java.lang.Integer)` was removed
* `deleteCertificateIssuerWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateVersionsSinglePageAsync(java.lang.String,java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed
* `getCertificateVersionsNextSinglePage(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificatesNextSinglePage(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `purgeDeletedCertificateAsync(java.lang.String,java.lang.String)` was removed
* `updateCertificatePolicyWithResponseAsync(java.lang.String,java.lang.String,implementation.models.CertificatePolicy)` was removed
* `getDeletedCertificatesNextSinglePage(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateVersions(java.lang.String,java.lang.String,java.lang.Integer)` was removed
* `setCertificateIssuerAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.IssuerCredentials,implementation.models.OrganizationDetails,implementation.models.IssuerAttributes)` was removed
* `updateCertificatePolicyWithResponseAsync(java.lang.String,java.lang.String,implementation.models.CertificatePolicy,com.azure.core.util.Context)` was removed
* `deleteCertificateOperation(java.lang.String,java.lang.String)` was removed
* `deleteCertificateIssuerWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateIssuerAsync(java.lang.String,java.lang.String)` was removed
* `importCertificateAsync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map,com.azure.core.util.Context)` was removed
* `getCertificatesNextSinglePage(java.lang.String,java.lang.String)` was removed
* `updateCertificateIssuerAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.IssuerCredentials,implementation.models.OrganizationDetails,implementation.models.IssuerAttributes)` was removed
* `updateCertificatePolicyWithResponse(java.lang.String,java.lang.String,implementation.models.CertificatePolicy,com.azure.core.util.Context)` was removed
* `backupCertificate(java.lang.String,java.lang.String)` was removed
* `importCertificateAsync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map)` was removed
* `restoreCertificateAsync(java.lang.String,byte[])` was removed
* `deleteCertificateContactsAsync(java.lang.String)` was removed
* `getCertificateContactsAsync(java.lang.String,com.azure.core.util.Context)` was removed
* `backupCertificateAsync(java.lang.String,java.lang.String)` was removed
* `setCertificateIssuerWithResponse(java.lang.String,java.lang.String,java.lang.String,implementation.models.IssuerCredentials,implementation.models.OrganizationDetails,implementation.models.IssuerAttributes,com.azure.core.util.Context)` was removed
* `getCertificateOperationAsync(java.lang.String,java.lang.String)` was removed
* `updateCertificateIssuerAsync(java.lang.String,java.lang.String,java.lang.String,implementation.models.IssuerCredentials,implementation.models.OrganizationDetails,implementation.models.IssuerAttributes,com.azure.core.util.Context)` was removed
* `getCertificateIssuersAsync(java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed
* `getDeletedCertificatesSinglePageAsync(java.lang.String,java.lang.Integer,java.lang.Boolean)` was removed
* `getCertificateIssuersSinglePage(java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed
* `importCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map)` was removed
* `getCertificateContactsWithResponseAsync(java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateVersions(java.lang.String,java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed
* `getCertificateContactsWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateVersionsNextSinglePageAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteCertificateOperationAsync(java.lang.String,java.lang.String)` was removed
* `purgeDeletedCertificate(java.lang.String,java.lang.String)` was removed
* `getCertificatePolicyAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateIssuersNextSinglePageAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificatePolicy(java.lang.String,java.lang.String)` was removed
* `getCertificateVersionsNextSinglePageAsync(java.lang.String,java.lang.String)` was removed
* `updateCertificatePolicy(java.lang.String,java.lang.String,implementation.models.CertificatePolicy)` was removed
* `getDeletedCertificateWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `recoverDeletedCertificateWithResponseAsync(java.lang.String,java.lang.String)` was removed
* `deleteCertificate(java.lang.String,java.lang.String)` was removed
* `updateCertificatePolicyAsync(java.lang.String,java.lang.String,implementation.models.CertificatePolicy)` was removed
* `createCertificate(java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map)` was removed
* `getDeletedCertificateAsync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateVersionsSinglePage(java.lang.String,java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed
* `setCertificateContactsWithResponseAsync(java.lang.String,implementation.models.Contacts,com.azure.core.util.Context)` was removed
* `getCertificatesSinglePage(java.lang.String,java.lang.Integer,java.lang.Boolean,com.azure.core.util.Context)` was removed
* `deleteCertificateWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateVersionsAsync(java.lang.String,java.lang.String,java.lang.Integer,com.azure.core.util.Context)` was removed
* `getDeletedCertificatesSinglePageAsync(java.lang.String,java.lang.Integer,java.lang.Boolean,com.azure.core.util.Context)` was removed
* `deleteCertificateOperationWithResponseAsync(java.lang.String,java.lang.String)` was removed
* `setCertificateContactsAsync(java.lang.String,implementation.models.Contacts)` was removed
* `importCertificateWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,implementation.models.CertificateAttributes,java.util.Map,com.azure.core.util.Context)` was removed
* `getApiVersion()` was removed
* `getCertificates(java.lang.String,java.lang.Integer,java.lang.Boolean)` was removed
* `mergeCertificate(java.lang.String,java.lang.String,java.util.List,implementation.models.CertificateAttributes,java.util.Map)` was removed
* `getCertificateIssuer(java.lang.String,java.lang.String)` was removed
* `updateCertificatePolicyAsync(java.lang.String,java.lang.String,implementation.models.CertificatePolicy,com.azure.core.util.Context)` was removed

#### `implementation.models.KeyProperties` was modified

* `getKty()` was removed
* `setCrv(models.CertificateKeyCurveName)` was removed
* `setKty(models.CertificateKeyType)` was removed
* `getCrv()` was removed

#### `implementation.models.CertificateAttributes` was modified

* `getRecoveryLevel()` was removed
* `setExpires(java.time.OffsetDateTime)` was removed
* `setEnabled(java.lang.Boolean)` was removed
* `setNotBefore(java.time.OffsetDateTime)` was removed

#### `implementation.models.DeletedCertificateItem` was modified

* `setTags(java.util.Map)` was removed
* `setX509Thumbprint(byte[])` was removed
* `setAttributes(implementation.models.CertificateAttributes)` was removed
* `setRecoveryId(java.lang.String)` was removed
* `setId(java.lang.String)` was removed

#### `implementation.CertificateClientImpl$CertificateClientService` was modified

* `getCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `updateCertificateOperation(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateOperationUpdateParameter,java.lang.String,com.azure.core.util.Context)` was removed
* `getDeletedCertificatesSync(java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `purgeDeletedCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateIssuers(java.lang.String,java.lang.Integer,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `restoreCertificate(java.lang.String,java.lang.String,implementation.models.CertificateRestoreParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateIssuersNext(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `updateCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateUpdateParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificatesNextSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateVersions(java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getDeletedCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateIssuersSync(java.lang.String,java.lang.Integer,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateOperationSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `createCertificate(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateCreateParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteCertificateContacts(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `updateCertificatePolicy(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteCertificateIssuerSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `purgeDeletedCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteCertificateOperation(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `recoverDeletedCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificates(java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `setCertificateIssuer(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateIssuerSetParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `getDeletedCertificates(java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getDeletedCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `updateCertificateOperationSync(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateOperationUpdateParameter,java.lang.String,com.azure.core.util.Context)` was removed
* `recoverDeletedCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `updateCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateUpdateParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `getDeletedCertificatesNextSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateOperation(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `importCertificate(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateImportParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateVersionsSync(java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `setCertificateIssuerSync(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateIssuerSetParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateIssuer(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `backupCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteCertificateOperationSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `updateCertificatePolicySync(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificatePolicy,java.lang.String,com.azure.core.util.Context)` was removed
* `mergeCertificateSync(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateMergeParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `mergeCertificate(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateMergeParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `getDeletedCertificatesNext(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateIssuersNextSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteCertificateContactsSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteCertificateIssuer(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateContacts(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificatePolicy(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `restoreCertificateSync(java.lang.String,java.lang.String,implementation.models.CertificateRestoreParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `setCertificateContactsSync(java.lang.String,java.lang.String,implementation.models.Contacts,java.lang.String,com.azure.core.util.Context)` was removed
* `updateCertificateIssuer(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateIssuerUpdateParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `updateCertificateIssuerSync(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateIssuerUpdateParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `createCertificateSync(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateCreateParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `setCertificateContacts(java.lang.String,java.lang.String,implementation.models.Contacts,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateVersionsNextSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `backupCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificatePolicySync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificatesSync(java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateVersionsNext(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificatesNext(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateContactsSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `importCertificateSync(java.lang.String,java.lang.String,java.lang.String,implementation.models.CertificateImportParameters,java.lang.String,com.azure.core.util.Context)` was removed
* `getCertificateIssuerSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `implementation.models.CertificateImportParameters` was modified

* `setBase64EncodedCertificate(java.lang.String)` was removed

#### `implementation.models.CertificateRestoreParameters` was modified

* `setCertificateBundleBackup(byte[])` was removed

#### `implementation.models.CertificateBundle` was modified

* `setCer(byte[])` was removed
* `setContentType(java.lang.String)` was removed
* `setTags(java.util.Map)` was removed
* `setAttributes(implementation.models.CertificateAttributes)` was removed

#### `implementation.models.CertificateMergeParameters` was modified

* `setX509Certificates(java.util.List)` was removed

#### `implementation.models.CertificateIssuerSetParameters` was modified

* `setProvider(java.lang.String)` was removed

#### `implementation.models.DeletedCertificateBundle` was modified

* `setTags(java.util.Map)` was removed
* `setCer(byte[])` was removed
* `setContentType(java.lang.String)` was removed
* `setRecoveryId(java.lang.String)` was removed
* `setAttributes(implementation.models.CertificateAttributes)` was removed

### Features Added

#### `implementation.models.Action` was modified

* `setActionType(implementation.models.CertificatePolicyAction)` was added

#### `models.CertificateProperties` was modified

* `isCertificateOrderPreserved()` was added

#### `implementation.models.CertificateCreateParameters` was modified

* `setPreserveCertOrder(java.lang.Boolean)` was added
* `isPreserveCertOrder()` was added

#### `implementation.CertificateIssuerHelper$CertificateIssuerAccessor` was modified

* `getIssuerBundle(models.CertificateIssuer)` was added

#### `implementation.CertificateClientImpl` was modified

* `updateCertificateOperationWithResponseAsync(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `getCertificateOperationWithResponseAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `deleteCertificateIssuerWithResponseAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getVaultBaseUrl()` was added
* `recoverDeletedCertificateWithResponseAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getCertificates(com.azure.core.http.rest.RequestOptions)` was added
* `deleteCertificateOperationWithResponseAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getCertificateIssuerWithResponseAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getDeletedCertificatesAsync(com.azure.core.http.rest.RequestOptions)` was added
* `mergeCertificateWithResponseAsync(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `deleteCertificateContactsWithResponseAsync(com.azure.core.http.rest.RequestOptions)` was added
* `getCertificateOperationWithResponse(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getCertificateIssuerWithResponse(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getCertificateIssuers(com.azure.core.http.rest.RequestOptions)` was added
* `getCertificateVersionsAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `updateCertificateWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `mergeCertificateWithResponse(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `importCertificateWithResponse(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `updateCertificateOperationWithResponse(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `deleteCertificateContactsWithResponse(com.azure.core.http.rest.RequestOptions)` was added
* `updateCertificatePolicyWithResponseAsync(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `createCertificateWithResponse(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `updateCertificateIssuerWithResponseAsync(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `deleteCertificateIssuerWithResponse(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `deleteCertificateWithResponseAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `deleteCertificateOperationWithResponse(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `recoverDeletedCertificateWithResponse(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `updateCertificateWithResponse(java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `setCertificateIssuerWithResponseAsync(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `restoreCertificateWithResponse(com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `getCertificatesAsync(com.azure.core.http.rest.RequestOptions)` was added
* `backupCertificateWithResponseAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getCertificateContactsWithResponseAsync(com.azure.core.http.rest.RequestOptions)` was added
* `updateCertificateIssuerWithResponse(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `createCertificateWithResponseAsync(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `setCertificateContactsWithResponseAsync(com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `getCertificatePolicyWithResponseAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getCertificatePolicyWithResponse(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `updateCertificatePolicyWithResponse(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `backupCertificateWithResponse(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getDeletedCertificateWithResponseAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getCertificateContactsWithResponse(com.azure.core.http.rest.RequestOptions)` was added
* `setCertificateIssuerWithResponse(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `restoreCertificateWithResponseAsync(com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `getDeletedCertificates(com.azure.core.http.rest.RequestOptions)` was added
* `getCertificateVersions(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getCertificateWithResponseAsync(java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `importCertificateWithResponseAsync(java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `purgeDeletedCertificateWithResponseAsync(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `deleteCertificateWithResponse(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `setCertificateContactsWithResponse(com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions)` was added
* `getServiceVersion()` was added
* `getDeletedCertificateWithResponse(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getCertificateIssuersAsync(com.azure.core.http.rest.RequestOptions)` was added
* `purgeDeletedCertificateWithResponse(java.lang.String,com.azure.core.http.rest.RequestOptions)` was added
* `getCertificateWithResponse(java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions)` was added

#### `implementation.models.KeyProperties` was modified

* `setCurve(models.CertificateKeyCurveName)` was added
* `getCurve()` was added
* `setKeyType(models.CertificateKeyType)` was added
* `getKeyType()` was added

#### `implementation.models.CertificateAttributes` was modified

* `getExpires()` was added
* `getAdminContacts()` was added
* `getNotBefore()` was added
* `isEnabled()` was added

#### `implementation.models.DeletedCertificateItem` was modified

* `getId()` was added
* `getTags()` was added
* `getAttributes()` was added
* `getX509Thumbprint()` was added

#### `implementation.models.CertificateOperation` was modified

* `isPreserveCertOrder()` was added
* `setPreserveCertOrder(java.lang.Boolean)` was added

#### `models.ImportCertificateOptions` was modified

* `setCertificateOrderPreserved(java.lang.Boolean)` was added
* `isCertificateOrderPreserved()` was added

#### `models.CertificateOperation` was modified

* `isCertificateOrderPreserved()` was added

#### `models.KeyVaultCertificate` was modified

* `isCertificateOrderPreserved()` was added

#### `implementation.CertificatePropertiesHelper` was modified

* `createCertificateProperties(implementation.models.DeletedCertificateItem)` was added

#### `implementation.CertificateClientImpl$CertificateClientService` was modified

* `recoverDeletedCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `deleteCertificateOperationSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `purgeDeletedCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `setCertificateContacts(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `recoverDeletedCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateIssuerSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateVersionsNext(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificatesSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateIssuersNextSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificatesNext(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateContacts(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `createCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `mergeCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `purgeDeletedCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificatePolicySync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateIssuer(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `deleteCertificateIssuerSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getDeletedCertificatesNextSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `backupCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `importCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateContactsSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getDeletedCertificatesSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `setCertificateIssuer(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateIssuers(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateVersionsNextSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateIssuersSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `updateCertificateIssuerSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `deleteCertificateOperation(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateVersionsSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `deleteCertificateContacts(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `deleteCertificateIssuer(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificatesNextSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `deleteCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `importCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getDeletedCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `updateCertificatePolicySync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `updateCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `restoreCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `setCertificateIssuerSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getDeletedCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateIssuersNext(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateOperation(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `updateCertificateOperation(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `updateCertificateSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificates(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `updateCertificateOperationSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateVersions(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `createCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getDeletedCertificatesNext(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `setCertificateContactsSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificatePolicy(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `backupCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getCertificateOperationSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `deleteCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `mergeCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `getDeletedCertificates(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `updateCertificateIssuer(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `updateCertificatePolicy(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `restoreCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `deleteCertificateContactsSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added

#### `implementation.models.CertificateImportParameters` was modified

* `isPreserveCertOrder()` was added
* `setPreserveCertOrder(java.lang.Boolean)` was added

#### `CertificateClient` was modified

* `beginCreateCertificate(java.lang.String,models.CertificatePolicy,java.lang.Boolean,java.util.Map,java.lang.Boolean)` was added

#### `implementation.CertificatePropertiesHelper$CertificatePropertiesAccessor` was modified

* `createCertificateProperties(implementation.models.DeletedCertificateItem)` was added

#### `implementation.models.CertificateBundle` was modified

* `isPreserveCertOrder()` was added

#### `CertificateAsyncClient` was modified

* `beginCreateCertificate(java.lang.String,models.CertificatePolicy,java.lang.Boolean,java.util.Map,java.lang.Boolean)` was added

#### `implementation.models.DeletedCertificateBundle` was modified

* `getAttributes()` was added
* `getTags()` was added
* `isPreserveCertOrder()` was added
* `getCer()` was added
* `getContentType()` was added

## 4.8.0-beta.1 (2025-04-10)

### Features Added
- Added support for preserving the order of the certificate chain when creating or importing certificates. ([#44788](https://github.com/Azure/azure-sdk-for-java/pull/44788)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.55.2` to version `1.55.3`.
- Upgraded `azure-json` from `1.4.0` to version `1.5.0`.
- Upgraded `azure-core-http-netty` from `1.15.10` to version `1.15.11`.

## 4.7.4 (2025-03-24)

### Other Changes

#### Dependency Updates

- Upgraded `azure-json` from `1.4.0` to version `1.5.0`.
- Upgraded `azure-core-http-netty` from `1.15.10` to version `1.15.11`.
- Upgraded `azure-core` from `1.55.2` to version `1.55.3`.


## 4.7.3 (2025-03-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.54.1` to version `1.55.2`.
- Upgraded `azure-json` from `1.3.0` to version `1.4.0`.
- Upgraded `azure-core-http-netty` from `1.15.7` to version `1.15.10`.

## 4.7.2 (2025-01-14)

### Bugs Fixed
- Fixed issue where certain `toString()` calls could cause a `NullPointerException`. ([#43776](https://github.com/Azure/azure-sdk-for-java/pull/43776))

## 4.7.1 (2024-12-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.53.0` to version `1.54.1`.
- Upgraded `azure-core-http-netty` from `1.15.5` to version `1.15.7`.

## 4.7.0 (2024-10-15)

## Features Added
- Added support for Continuous Access Evaluation (CAE). ([#41814](https://github.com/Azure/azure-sdk-for-java/pull/41814))

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.52.0` to version `1.53.0`.
- Upgraded `azure-core-http-netty` from `1.15.4` to version `1.15.5`.

## 4.6.7 (2024-09-27)

### Other Changes

#### Dependency Updates

- Upgraded `azure-json` from `1.2.0` to version `1.3.0`.
- Upgraded `azure-core-http-netty` from `1.15.3` to version `1.15.4`.
- Upgraded `azure-core` from `1.51.0` to version `1.52.0`.


## 4.6.6 (2024-08-24)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.50.0` to version `1.51.0`.
- Upgraded `azure-core-http-netty` from `1.15.2` to version `1.15.3`.


## 4.6.5 (2024-07-29)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.49.1` to version `1.50.0`.
- Upgraded `azure-json` from `1.1.0` to version `1.2.0`.
- Upgraded `azure-core-http-netty` from `1.15.1` to version `1.15.2`.

## 4.6.4 (2024-06-27)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.49.0` to version `1.49.1`.
- Upgraded `azure-core-http-netty` from `1.15.0` to version `1.15.1`.

## 4.6.3 (2024-05-13)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.48.0` to version `1.49.0`.
- Upgraded `azure-core-http-netty` from `1.14.2` to version `1.15.0`.

## 4.6.2 (2024-04-23)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.47.0` to version `1.48.0`.
- Upgraded `azure-core-http-netty` from `1.14.1` to version `1.14.2`.

## 4.6.1 (2024-03-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.46.0` to version `1.47.0`.
- Upgraded `azure-core-http-netty` from `1.14.0` to version `1.14.1`.

## 4.6.0 (2024-02-22)
Changes when compared to the last stable release (`4.5.9`) include:

### Features Added
- Added support for service version `7.5`.
- Added `CertificateProperties.getX509ThumbprintAsString()` to return the hexadecimal string representation of the SHA-1 hash of a certificate.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.45.1` to version `1.46.0`.
- Upgraded `azure-core-http-netty` from `1.13.11` to version `1.14.0`.

## 4.5.9 (2023-12-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.13.10` to version `1.13.11`.
- Upgraded `azure-core` from `1.45.0` to version `1.45.1`.

## 4.5.8 (2023-11-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.44.1` to version `1.45.0`.
- Upgraded `azure-core-http-netty` from `1.13.9` to version `1.13.10`.

## 4.6.0-beta.1 (2023-11-09)

### Features Added
- Added support for service version `7.5-preview.1`.

#### Dependency Updates
- Upgraded `azure-core` from `1.44.1` to version `1.45.0`.
- Upgraded `azure-core-http-netty` from `1.13.9` to version `1.13.10`.

## 4.5.7 (2023-10-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.43.0` to version `1.44.1`.
- Upgraded `azure-core-http-netty` from `1.13.7` to version `1.13.9`.

## 4.5.6 (2023-09-25)

### Bugs Fixed
- Fixed response code for certificate merging operations from `200` to the correct `201`. 
([#36260](https://github.com/Azure/azure-sdk-for-java/issues/36260))

#### Dependency Updates

- Upgraded `azure-core` from `1.42.0` to version `1.43.0`.
- Upgraded `azure-core-http-netty` from `1.13.6` to version `1.13.7`.

## 4.5.5 (2023-08-21)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.41.0` to version `1.42.0`.
- Upgraded `azure-core-http-netty` from `1.13.5` to version `1.13.6`.

## 4.5.4 (2023-07-25)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.40.0` to version `1.41.0`.
- Upgraded `azure-core-http-netty` from `1.13.4` to version `1.13.5`.

## 4.5.3 (2023-06-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.39.0` to version `1.40.0`.
- Upgraded `azure-core-http-netty` from `1.13.3` to version `1.13.4`.

## 4.5.2 (2023-05-23)

### Other Changes
- Migrate Test recordings to assets repo.

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.13.2` to version `1.13.3`.
- Upgraded `azure-core` from `1.38.0` to version `1.39.0`.

## 4.5.1 (2023-04-20)

### Other Changes

- Test proxy server migration.
- Made all logger instances static.

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.13.1` to version `1.13.2`.
- Upgraded `azure-core` from `1.37.0` to version `1.38.0`.

## 4.5.0 (2023-03-18)

### Features Added
- Added support for service version `7.4`.

### Other Changes
- Upgraded `azure-core-http-netty` from `1.13.0` to version `1.13.1`.
- Upgraded `azure-core` from `1.36.0` to version `1.37.0`.

## 4.4.4 (2023-02-16)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.12.8` to version `1.13.0`.
- Upgraded `azure-core` from `1.35.0` to version `1.36.0`.

## 4.4.3 (2023-01-09)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` from `1.34.0` to version `1.35.0`.
- Upgraded `azure-core-http-netty` from `1.12.7` to version `1.12.8`.

## 4.4.2 (2022-11-10)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` from `1.33.0` to version `1.34.0`.
- Upgraded `azure-core-http-netty` from `1.12.6` to version `1.12.7`.

## 4.4.1 (2022-10-17)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` from `1.32.0` to version `1.33.0`.
- Upgraded `azure-core-http-netty` from `1.12.5` to version `1.12.6`.

## 4.4.0 (2022-09-20)

### Breaking Changes
- Made it so that we verify that the challenge resource matches the vault domain by default. This should affect few customers who can use the `disableChallengeResourceVerification()` method in client builders to disable this functionality. See https://aka.ms/azsdk/blog/vault-uri for more information.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.31.0` to version `1.32.0`.
- Upgraded `azure-core-http-netty` from `1.12.4` to version `1.12.5`.

## 4.3.5 (2022-08-15)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.31.0`.
- Upgraded `azure-core-http-netty` dependency to `1.12.4`.

## 4.3.4 (2022-07-06)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.30.0`.
- Upgraded `azure-core-http-netty` dependency to `1.12.3`.

## 4.3.3 (2022-06-10)

### Bugs Fixed
- Fixed an issue that caused the `organizationId` and `enabled` parameters not be sent to the Key Vault service when creating or updating a `CertificateIssuer`.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.29.1`.
- Upgraded `azure-core-http-netty` dependency to `1.12.2`.

## 4.3.2 (2022-05-10)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.28.0`.
- Upgraded `azure-core-http-netty` dependency to `1.12.0`.

## 4.3.1 (2022-04-08)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.27.0`.
- Upgraded `azure-core-http-netty` dependency to `1.11.9`.

## 4.3.0 (2022-03-31)

### Features Added
- Added support for service version `7.3`.
- Implemented new traits (micro-interfaces) in `CertificateClientBuilder`. This makes the experience of using client builders more consistent across libraries in the Azure SDK for Java.

## 4.2.8 (2022-03-17)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.26.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.8`

## 4.3.0-beta.5 (2022-02-11)

### Features added
- Implemented new traits (micro-interfaces) in `CertificateClientBuilder`. This makes the experience of using client builders more consistent across libraries in the Azure SDK for Java.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.25.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.7`

## 4.2.7 (2022-02-11)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.25.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.7`

## 4.3.0-beta.4 (2022-01-13)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.24.1`
- Upgraded `azure-core-http-netty` dependency to `1.11.6`

## 4.2.6 (2022-01-12)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.24.1`
- Upgraded `azure-core-http-netty` dependency to `1.11.6`

## 4.3.0-beta.3 (2021-11-12)

### Features Added

- Added support for multi-tenant authentication in clients.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.22.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.2`

## 4.2.5 (2021-11-12)

### Features Added

- Added support for multi-tenant authentication in clients.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.22.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.2`



## 4.3.0-beta.2 (2021-10-07)

### Bugs Fixed
- Fixed an issue that made clients send unnecessary unauthorized requests to obtain a bearer challenge from the service even when already possessing a valid bearer token.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.21.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.1`

## 4.2.4 (2021-10-06)

### Bugs Fixed
- Fixed an issue that made clients send unnecessary unauthorized requests to obtain a bearer challenge from the service even when already possessing a valid bearer token.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.21.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.1`

## 4.3.0-beta.1 (2021-09-10)

### Features Added
- Added support for service version `7.3-preview`.

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.20.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.0`

## 4.2.3 (2021-09-10)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.20.0`
- Upgraded `azure-core-http-netty` dependency to `1.11.0`

## 4.2.2 (2021-08-12)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.19.0`
- Upgraded `azure-core-http-netty` dependency to `1.10.2`


## 4.2.1 (2021-07-08)

### Other Changes

#### Dependency Updates
- Upgraded `azure-core` dependency to `1.18.0`
- Upgraded `azure-core-http-netty` dependency to `1.10.1`

## 4.2.0 (2021-06-17)

### Features Added
- Changed default service version to `7.2`.
- Added `KeyVaultCertificateIdentifier` to parse certificate URLs.

### Changes since 4.2.0-beta.6

#### Bug Fixes
- Ensured that `RetryPolicy` and `HttpLogOptions` use a default implementation when creating Key Vault clients if not set or set to `null`.

#### New Features
- `KeyVaultCertificateIdentifier` can now be used to parse any Key Vault identifier.

#### Breaking Changes
- Removed service method overloads that take a `pollingInterval`, since `PollerFlux` and `SyncPoller` objects allow for setting this value directly on them.

#### Non-Breaking Changes
- Renamed `certificateId` to `sourceId` in `KeyVaultCertificateIdentifier`.
- Added the `@ServiceMethod` annotation to all public methods that call the Key Vault service in `CertificateClient` and `CertificateAsyncClient`.

## 4.2.0-beta.6 (2021-05-15)

### Dependency Updates
- Upgraded `azure-core` dependency to `1.16.0`
- Upgraded `azure-core-http-netty` dependency to `1.9.2`
- Upgraded `azure-core-http-okhttp` dependency to `1.6.2`
- Upgraded `azure-identity` dependency to `1.3.0`

## 4.2.0-beta.5 (2021-04-09)

### New features
- Added support for service version `7.2`.
- Added support to specify whether or not a pipeline policy should be added per call or per retry.

### Breaking Changes
- Changed `KeyVaultCertificateIdentifier` so it is instantiated via its constructor as opposed to via a `parse()` factory method.

## 4.2.0-beta.4 (2021-03-12)

### Changed
- Changed logging level in `onRequest` and `onSuccess` calls for service operations from `INFO` to `VERBOSE`.

### Dependency Updates
- Upgraded `azure-core` dependency to `1.14.0`
- Upgraded `azure-core-http-netty` dependency to `1.9.0`
- Upgraded `azure-core-http-okhttp` dependency to `1.6.0`
- Upgraded `azure-identity` dependency to `1.2.4`

## 4.2.0-beta.3 (2021-02-11)

### Dependency Updates
- Upgraded `azure-core` dependency to `1.13.0`
- Upgraded `azure-core-http-netty` dependency to `1.8.0`
- Upgraded `azure-core-http-okhttp` dependency to `1.5.0`
- Upgraded `azure-identity` dependency to `1.2.3`

## 4.1.5 (2021-02-11)

### Dependency Updates
- Upgraded `azure-core` dependency to `1.13.0`
- Upgraded `azure-core-http-netty` dependency to `1.8.0`
- Upgraded `azure-core-http-okhttp` dependency to `1.5.0`
- Upgraded `azure-identity` dependency to `1.2.3`

## 4.1.4 (2021-01-15)

### Dependency Updates
- Upgraded `azure-core` dependency to `1.12.0`
- Upgraded `azure-core-http-netty` dependency to `1.7.1`
- Upgraded `azure-core-http-okhttp` dependency to `1.4.1`
- Upgraded `azure-identity` dependency to `1.2.2`

## 4.1.3 (2020-11-12)

### Dependency Updates
- Upgraded `azure-core` dependency to `1.10.0`
- Upgraded `azure-core-http-netty` dependency to `1.6.3`
- Upgraded `azure-core-http-okhttp` dependency to `1.3.3`
- Upgraded `azure-core-test` dependency to `1.5.1`
- Upgraded `azure-identity` dependency to `1.2.0`

## 4.2.0-beta.2 (2020-10-09)

### New Features
- Added `KeyVaultCertificateIdentifier`. Use its [`parse`](https://github.com/Azure/azure-sdk-for-java/blob/ff52067a3772a430e5913b898f2806078aec8ef2/sdk/keyvault/azure-security-keyvault-certificates/src/main/java/com/azure/security/keyvault/certificates/models/KeyVaultCertificateIdentifier.java#L79) method to parse the different elements of a given certificate identifier.
- Added API overloads that allow for passing specific polling intervals for long-running operations:
    - `CertificateAsyncClient`
        - `beginCreateCertificate(String, CertificatePolicy, Boolean, Map<String, String>, Duration)`
        - `getCertificateOperation(String, Duration)`
        - `beginDeleteCertificate(String, Duration)`
        - `beginRecoverDeletedCertificate(String, Duration)`
    - `CertificateClient`
        - `beginCreateCertificate(String, CertificatePolicy, Boolean, Map<String, String>, Duration)`
        - `getCertificateOperation(String, Duration)`
        - `beginDeleteCertificate(String, Duration)`
        - `beginRecoverDeletedCertificate(String, Duration)`
- Added support for `com.azure.core.util.ClientOptions` in client builders.

### Dependency Updates
- Upgraded `azure-core` dependency to `1.9.0`
- Upgraded `azure-core-http-netty` dependency to `1.6.2`
- Upgraded `azure-core-http-okhttp` dependency to `1.3.2`
- Upgraded `azure-core-test` dependency to `1.5.0`
- Upgraded `azure-identity` dependency to `1.1.3`

## 4.1.2 (2020-10-08)

### Dependency Updates
- Upgraded `azure-core` dependency to `1.9.0`
- Upgraded `azure-core-http-netty` dependency to `1.6.2`
- Upgraded `azure-core-http-okhttp` dependency to `1.3.2`
- Upgraded `azure-core-test` dependency to `1.5.0`
- Upgraded `azure-identity` dependency to `1.1.3`

## 4.2.0-beta.1 (2020-09-11)
- Updated versions for azure-core and azure-identity.

## 4.1.1 (2020-09-10)
- Updated versions for azure-core and azure-identity.

## 4.1.0 (2020-08-12)
- Added support for service version `7.1`.
- Added `retryPolicy` setter in `CertificateClientBuilder`.
- Added `recoverableDays` property to `CertificateProperties`.

## 4.1.0-beta.4 (2020-07-08)
- Updated versions for azure-core, azure-identity.

## 4.0.5 (2020-07-08)
- Updated versions for azure-core and azure-identity.

## 4.1.0-beta.3 (2020-06-10)
- Updated version for azure-core, azure-identity and external dependencies.

## 4.0.4 (2020-06-10)
- Updated version for azure-core, azure-identity and external dependencies.

## 4.0.3 (2020-05-06)
- Update azure-core dependency to version 1.5.0.

## 4.1.0-beta.2 (2020-04-09)
- Added `retryPolicy` setter in `CertificateClientBuilder`
- Update azure-core dependency to version 1.4.0.

## 4.0.2 (2020-04-07)
- Update azure-core dependency to version 1.4.0.

## 4.0.1 (2020-03-25)
- Update azure-core dependency to version 1.3.0.

## 4.1.0-beta.1 (2020-03-10)
- Added `recoverableDays` property to `CertificateProperties`.
- Added support for `7.1-Preview` service version

## 4.0.0 (2020-01-07)
- Update azure-core dependency to version 1.2.0.

## 4.0.0-beta.7 (2019-12-17)
- `beginDeleteCertificate` and `beginRecoverDeletedCertificate` methods now return a poll response with a status of SUCCESSFULLY_COMPLETED when service returns 403 status.
- `CertificateClient.createIssuer` and `CertificateAsyncClient.createIssuer` now require a `CertificateIssuer` with both a name and provider.
- Removed constructor overload for `CertificateIssuer(String name, String provider)` from `CertificateIssuer` model.
- Removed `AdministratorContact` constructor overloads and introduced setters for all parameters.
- Removed `CertificateContact` constructor overloads and introduced setters for all parameters.

## 4.0.0-beta.6 (2019-12-04)

### Breaking changes

- Moved `CertificateClient.cancelCertificationOperation` to `SyncPoller.cancel` and `CertificateAsyncClient.cancelCertificationOperation` to `PollerFlux.cancel` respectively.
- deleteCertificate method has been renamed to beginDeleteCertificate and now returns a SyncPoller in `CertificateClient` and PollerFlux in `CertificateAsyncClient` to track this long-running operation.
- recoverDeletedCertificate method has been renamed to beginRecoverDeletedCertificate and now returns a SyncPoller in `CertificateClient` and PollerFlux in `CertificateAsyncClient` to track this long-running operation.
- `subject` and `issuerName` constructor parameters have been switched on `CertificatePolicy`.
- `subjectAlternativeNames` and `issuerName` constructor parameters have been switched on `CertificatePolicy`.
- The `SubjectAlternativeNames` class has been rewritten to contain `DnsNames`, `Emails`, and `UserPrincipalNames` collection properties.
- `CertificateIssuer.administrators` has been renamed to `CertificateIssuer.administratorContacts`.
- `CertificateKeyType.Oct` has been removed.
- `ImportCertificateOptions.value` has been renamed to `ImportCertificateOptions.certificate`.
- `LifeTimeAction` has been renamed to `LifetimeAction`.
- `CertificateKeyCurveName` and `CertificateKeyType` have been moved from package `com.azure.security.keyvault.certificates.models.webkey` to `com.azure.security.keyvault.certificates.models`.
- On `CertificateProperties`, expires, created, and updated have been renamed to expiresOn, createdOn, and updatedOn respectively.
- On `DeletedCertificate`, deletedDate has been renamed to DeletedOn.
- `CertificateImportOptions` has been renamed to `ImportCertificateOptions`.
- `CertificateMergeOptions` has been renamed to `MergeCertificateOptions`.
- `CertificatePolicy.DEFAULT` has been removed.


### Major changes

- The `SubjectAlternativeNames` class now allows you to set multiple types of subject alternative names using any of the `DnsNames`, `Emails`, and `UserPrincipalNames` collection properties.
- A new `CertificatePolicy` constructor allows you to both pass in both the `subject` and `subjectAlternativeNames` parameters.
- `CertificateIssuer.provider` was added.
- `CertificatePolicy.getDefault()` was added and allows you to get the default policy.


## 4.0.0-preview.5 (2019-11-01)

### Breaking changes
- `beginCreateCertificate` method now returns a SyncPoller in `CertificateClient` and a PollerFlux in`CertificateAsyncClient`
- Certificate has been renamed to KeyVaultCertificate to avoid ambiguity with other libraries and to yield better search results.
- endpoint method on CertificateClientBuilder has been renamed to vaultUrl.
- listCertificates and listCertificateVersions methods have been renamed to listPropertiesOfCertificates and listPropertiesOfCertificateVersions respectively in `CertificateClient` and `CertificateAsyncClient`.
- restoreCertificate method has been renamed to restoreCertificateBackup in `CertificateClient` and `CertificatAsyncClient` to better associate it with CertificateClient.backupCertificate.
- LifetimeActionType class has been renamed to CertificatePolicyAction.
- Contact class has been renamed to CertificateContact.
- Issuer class has been renamed to CertificateIssuer.
- getCertificate method has been renamed to getCertificateVersion in `CertificateClient` and `CertificateAsyncClient`
- getCertificateWithPolicy method has been renamed to getCertificate and now returns KeyVaultCertificateWithPolicy in `CertificateClient` and `CertificateAsyncClient`
- getPendingCertificateSigningRequest method has been removed from `CertificateClient` and `CertificateAsyncClient`

### Major changes
- CertificateClient.vaultUrl has been added with the original value pass to CertificateClient.
- KeyVaultCertificateWithPolicy has been added and is returned by getCertificate method in `CertificateClient` and `CertificateAsyncClient`


## 4.0.0-preview.4 (2019-10-08)
For details on the Azure SDK for Java (September 2019 Preview) release refer to the [release announcement](https://aka.ms/azure-sdk-preview4-java).

- `importCertificate` API has been added to `CertificateClient` and `CertificateAsyncClient`.
-  Updated to be fully compliant with the Java 9 Platform Module System.

### Breaking changes

- `CertificateBase` has been renamed to `CertificateProperties`.
- `Certificate` no longer extends `CertificateProperties`, but instead contains a `CertificateProperties` property named `Properties`.
- `IssuerBase` has been renamed to `IssuerProperties`.
- `Issuer` no longer extends `IssuerProperties`, but instead contains a `IssuerProperties` property named `Properties`.
- `CertificatePolicy` has been flattened to include all properties from `KeyOptions` and derivative classes.
- `KeyOptions` and derivative classes have been removed.
- `KeyType` has been renamed to `CertificateKeyType`.
- `KeyCurveName` has been renamed to `CertificateKeyCurveName`.
- `KeyUsage` has been renamed to `CertificateKeyUsage`.
- `SecretContentType` has been renamed to `CertificateContentType`.
- `updateCertificate` method has been renamed to `updateCertificateProperties` in `CertificateClient` and `CertificateAsyncClient`.
-  Getters and setters were updated to use Java Bean notation.
-  Changed VoidResponse to Response<Void> on sync API, and Mono<VoidResponse> to Mono<Response<Void>> on async API.
- `createCertificate` API has been renamed to `beginCreateCertificate` in in `CertificateClient` and `CertificateAsyncClient`.
-  Enumerations including `CertificateKeyCurveName`, `CertificateKeyUsage`, `CertificateContentType` and `CertificateKeyType` are now structures that define well-known, supported static fields.

## 4.0.0-preview.3 (2019-09-10)
For details on the Azure SDK for Java (August 2019 Preview) release refer to the [release announcement](https://aka.ms/azure-sdk-preview3-java).

This library is not a direct replacement for certificates management operations from [microsoft-azure-keyvault](https://github.com/Azure/azure-sdk-for-java/tree/azure-security-keyvault-keys_4.0.0/sdk/keyvault/microsoft-azure-keyvault). Applications using that library would require code changes to use `azure-keyvault-certificates`.
This package's
[documentation](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/azure-security-keyvault-certificates/README.md)
and
[samples](https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/keyvault/azure-security-keyvault-certificates/src/samples/java)
demonstrate the new API.


### Features Added
- Packages scoped by functionality
    - `azure-keyvault-keys` contains a `KeyClient` and `KeyAsyncClient` for key operations, 
    `azure-keyvault-secrets` contains a `SecretClient` and `SecretAsyncClient` for secret operations,
    `azure-keyvault-certificates` contains a `CertificateClient` and `CertificateAsyncClient` for certificate operations
- Client instances are scoped to vaults (an instance interacts with one vault
only)
- Reactive streams support using [Project Reactor](https://projectreactor.io/).
- Authentication using `azure-identity` credentials
  - see this package's
  [documentation](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/azure-security-keyvault-certificates/README.md)
  , and the
  [Azure Identity documentation](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/identity/azure-identity/README.md)
  for more information
- Added support for HTTP challenge based authentication, allowing clients to interact with vaults in sovereign clouds.
