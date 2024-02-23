# Code snippets and samples


## CertificateProfiles

- [Create](#certificateprofiles_create)
- [Delete](#certificateprofiles_delete)
- [Get](#certificateprofiles_get)
- [ListByCodeSigningAccount](#certificateprofiles_listbycodesigningaccount)
- [RevokeCertificate](#certificateprofiles_revokecertificate)

## CodeSigningAccounts

- [CheckNameAvailability](#codesigningaccounts_checknameavailability)
- [Create](#codesigningaccounts_create)
- [Delete](#codesigningaccounts_delete)
- [GetByResourceGroup](#codesigningaccounts_getbyresourcegroup)
- [List](#codesigningaccounts_list)
- [ListByResourceGroup](#codesigningaccounts_listbyresourcegroup)
- [Update](#codesigningaccounts_update)

## Operations

- [List](#operations_list)
### CertificateProfiles_Create

```java
import com.azure.resourcemanager.codesigning.models.ProfileType;

/**
 * Samples for CertificateProfiles Create.
 */
public final class CertificateProfilesCreateSamples {
    /*
     * x-ms-original-file:
     * specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2024-02-05-preview/examples/
     * CertificateProfiles_Create.json
     */
    /**
     * Sample code: Create Certificate Profile.
     * 
     * @param manager Entry point to CodeSigningManager.
     */
    public static void createCertificateProfile(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.certificateProfiles().define("profileA").withExistingCodeSigningAccount("MyResourceGroup", "MyAccount")
            .withProfileType(ProfileType.PUBLIC_TRUST).withIncludeStreetAddress(false).withIncludePostalCode(true)
            .withIdentityValidationId("00000000-1234-5678-3333-444444444444").create();
    }
}
```

### CertificateProfiles_Delete

```java
/**
 * Samples for CertificateProfiles Delete.
 */
public final class CertificateProfilesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2024-02-05-preview/examples/
     * CertificateProfiles_Delete.json
     */
    /**
     * Sample code: Delete Certificate Profile.
     * 
     * @param manager Entry point to CodeSigningManager.
     */
    public static void deleteCertificateProfile(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.certificateProfiles().delete("MyResourceGroup", "MyAccount", "profileA",
            com.azure.core.util.Context.NONE);
    }
}
```

### CertificateProfiles_Get

```java
/**
 * Samples for CertificateProfiles Get.
 */
public final class CertificateProfilesGetSamples {
    /*
     * x-ms-original-file:
     * specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2024-02-05-preview/examples/
     * CertificateProfiles_Get.json
     */
    /**
     * Sample code: Get Certificate Profile.
     * 
     * @param manager Entry point to CodeSigningManager.
     */
    public static void getCertificateProfile(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.certificateProfiles().getWithResponse("MyResourceGroup", "MyAccount", "profileA",
            com.azure.core.util.Context.NONE);
    }
}
```

### CertificateProfiles_ListByCodeSigningAccount

```java
/**
 * Samples for CertificateProfiles ListByCodeSigningAccount.
 */
public final class CertificateProfilesListByCodeSigningAccountSamples {
    /*
     * x-ms-original-file:
     * specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2024-02-05-preview/examples/
     * CertificateProfiles_ListByCodeSigningAccount.json
     */
    /**
     * Sample code: List Certificate Profiles.
     * 
     * @param manager Entry point to CodeSigningManager.
     */
    public static void listCertificateProfiles(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.certificateProfiles().listByCodeSigningAccount("MyResourceGroup", "MyAccount",
            com.azure.core.util.Context.NONE);
    }
}
```

### CertificateProfiles_RevokeCertificate

```java
import com.azure.resourcemanager.codesigning.models.RevokeCertificate;
import java.time.OffsetDateTime;

/**
 * Samples for CertificateProfiles RevokeCertificate.
 */
public final class CertificateProfilesRevokeCertificateSamples {
    /*
     * x-ms-original-file:
     * specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2024-02-05-preview/examples/
     * CertificateProfiles_RevokeCertificate.json
     */
    /**
     * Sample code: Revoke Certificate.
     * 
     * @param manager Entry point to CodeSigningManager.
     */
    public static void revokeCertificate(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.certificateProfiles().revokeCertificateWithResponse("MyResourceGroup", "MyAccount", "profileA",
            new RevokeCertificate().withSerialNumber("xxxxxxxxxxxxxxxxxx")
                .withThumbprint("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .withEffectiveAt(OffsetDateTime.parse("2023-11-12T23:40:25+00:00")).withReason("KeyCompromised")
                .withRemarks("test"),
            com.azure.core.util.Context.NONE);
    }
}
```

### CodeSigningAccounts_CheckNameAvailability

```java
import com.azure.resourcemanager.codesigning.models.CheckNameAvailability;

/**
 * Samples for CodeSigningAccounts CheckNameAvailability.
 */
public final class CodeSigningAccountsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2024-02-05-preview/examples/
     * CodeSigningAccounts_CheckNameAvailability.json
     */
    /**
     * Sample code: Validate a code signing account name.
     * 
     * @param manager Entry point to CodeSigningManager.
     */
    public static void
        validateACodeSigningAccountName(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.codeSigningAccounts().checkNameAvailabilityWithResponse(
            new CheckNameAvailability().withName("sample-account"), com.azure.core.util.Context.NONE);
    }
}
```

### CodeSigningAccounts_Create

```java
import com.azure.resourcemanager.codesigning.models.AccountSku;
import com.azure.resourcemanager.codesigning.models.SkuName;

/**
 * Samples for CodeSigningAccounts Create.
 */
public final class CodeSigningAccountsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2024-02-05-preview/examples/
     * CodeSigningAccounts_Create.json
     */
    /**
     * Sample code: Create Code Signing Account.
     * 
     * @param manager Entry point to CodeSigningManager.
     */
    public static void createCodeSigningAccount(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.codeSigningAccounts().define("MyAccount").withRegion("westus")
            .withExistingResourceGroup("MyResourceGroup").withSku(new AccountSku().withName(SkuName.BASIC)).create();
    }
}
```

### CodeSigningAccounts_Delete

```java
/**
 * Samples for CodeSigningAccounts Delete.
 */
public final class CodeSigningAccountsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2024-02-05-preview/examples/
     * CodeSigningAccounts_Delete.json
     */
    /**
     * Sample code: Delete Code Signing Account.
     * 
     * @param manager Entry point to CodeSigningManager.
     */
    public static void deleteCodeSigningAccount(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.codeSigningAccounts().delete("MyResourceGroup", "MyAccount", com.azure.core.util.Context.NONE);
    }
}
```

### CodeSigningAccounts_GetByResourceGroup

```java
/**
 * Samples for CodeSigningAccounts GetByResourceGroup.
 */
public final class CodeSigningAccountsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2024-02-05-preview/examples/
     * CodeSigningAccounts_Get.json
     */
    /**
     * Sample code: Get Code Signing Account.
     * 
     * @param manager Entry point to CodeSigningManager.
     */
    public static void getCodeSigningAccount(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.codeSigningAccounts().getByResourceGroupWithResponse("MyResourceGroup", "MyAccount",
            com.azure.core.util.Context.NONE);
    }
}
```

### CodeSigningAccounts_List

```java
/**
 * Samples for CodeSigningAccounts List.
 */
public final class CodeSigningAccountsListSamples {
    /*
     * x-ms-original-file:
     * specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2024-02-05-preview/examples/
     * CodeSigningAccounts_ListBySubscription.json
     */
    /**
     * Sample code: List Code Signing Accounts by Subscription.
     * 
     * @param manager Entry point to CodeSigningManager.
     */
    public static void
        listCodeSigningAccountsBySubscription(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.codeSigningAccounts().list(com.azure.core.util.Context.NONE);
    }
}
```

### CodeSigningAccounts_ListByResourceGroup

```java
/**
 * Samples for CodeSigningAccounts ListByResourceGroup.
 */
public final class CodeSigningAccountsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2024-02-05-preview/examples/
     * CodeSigningAccounts_ListByResourceGroup.json
     */
    /**
     * Sample code: List Code Signing Accounts by Resource Group.
     * 
     * @param manager Entry point to CodeSigningManager.
     */
    public static void
        listCodeSigningAccountsByResourceGroup(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.codeSigningAccounts().listByResourceGroup("MyResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### CodeSigningAccounts_Update

```java
import com.azure.resourcemanager.codesigning.models.CodeSigningAccount;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for CodeSigningAccounts Update.
 */
public final class CodeSigningAccountsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2024-02-05-preview/examples/
     * CodeSigningAccounts_Update.json
     */
    /**
     * Sample code: Update Code Signing Account.
     * 
     * @param manager Entry point to CodeSigningManager.
     */
    public static void updateCodeSigningAccount(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        CodeSigningAccount resource = manager.codeSigningAccounts()
            .getByResourceGroupWithResponse("MyResourceGroup", "MyAccount", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("key1", "fakeTokenPlaceholder")).apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2024-02-05-preview/examples/
     * Operations_List.json
     */
    /**
     * Sample code: List Code Signing Account operations.
     * 
     * @param manager Entry point to CodeSigningManager.
     */
    public static void
        listCodeSigningAccountOperations(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

