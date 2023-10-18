# Code snippets and samples


## CertificateProfileOperation

- [Create](#certificateprofileoperation_create)
- [Delete](#certificateprofileoperation_delete)
- [Get](#certificateprofileoperation_get)
- [ListByCodeSigningAccount](#certificateprofileoperation_listbycodesigningaccount)
- [Update](#certificateprofileoperation_update)

## CodeSigningAccountOperation

- [CheckNameAvailability](#codesigningaccountoperation_checknameavailability)
- [Create](#codesigningaccountoperation_create)
- [Delete](#codesigningaccountoperation_delete)
- [GetByResourceGroup](#codesigningaccountoperation_getbyresourcegroup)
- [List](#codesigningaccountoperation_list)
- [ListByResourceGroup](#codesigningaccountoperation_listbyresourcegroup)
- [Update](#codesigningaccountoperation_update)

## Operations

- [List](#operations_list)
### CertificateProfileOperation_Create

```java
import com.azure.resourcemanager.codesigning.models.ProfileType;
import com.azure.resourcemanager.codesigning.models.RotationPolicy;

/** Samples for CertificateProfileOperation Create. */
public final class CertificateProfileOperationCreateSamples {
    /*
     * x-ms-original-file: specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2023-04-30-preview/examples/createCertificateProfile.json
     */
    /**
     * Sample code: Create Certificate Profile.
     *
     * @param manager Entry point to CodeSigningManager.
     */
    public static void createCertificateProfile(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager
            .certificateProfileOperations()
            .define("profileA")
            .withExistingCodeSigningAccount("MyResourceGroup", "MyAccount")
            .withProfileType(ProfileType.PUBLIC_TRUST)
            .withRotationPolicy(RotationPolicy.THREE_ZERO_DAYS)
            .withCommonName("Contoso Inc")
            .withOrganization("Contoso Inc")
            .withIncludeStreetAddress(false)
            .withIncludePostalCode(true)
            .create();
    }
}
```

### CertificateProfileOperation_Delete

```java
/** Samples for CertificateProfileOperation Delete. */
public final class CertificateProfileOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2023-04-30-preview/examples/deleteCertificateProfile.json
     */
    /**
     * Sample code: Delete Certificate Profile.
     *
     * @param manager Entry point to CodeSigningManager.
     */
    public static void deleteCertificateProfile(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager
            .certificateProfileOperations()
            .delete("MyResourceGroup", "MyAccount", "profileA", com.azure.core.util.Context.NONE);
    }
}
```

### CertificateProfileOperation_Get

```java
/** Samples for CertificateProfileOperation Get. */
public final class CertificateProfileOperationGetSamples {
    /*
     * x-ms-original-file: specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2023-04-30-preview/examples/getCertificateProfile.json
     */
    /**
     * Sample code: Get Certificate Profile.
     *
     * @param manager Entry point to CodeSigningManager.
     */
    public static void getCertificateProfile(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager
            .certificateProfileOperations()
            .getWithResponse("MyResourceGroup", "MyAccount", "profileA", com.azure.core.util.Context.NONE);
    }
}
```

### CertificateProfileOperation_ListByCodeSigningAccount

```java
/** Samples for CertificateProfileOperation ListByCodeSigningAccount. */
public final class CertificateProfileOperationListByCodeSigningAccountSamples {
    /*
     * x-ms-original-file: specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2023-04-30-preview/examples/listCertificateProfiles.json
     */
    /**
     * Sample code: List Certificate Profiles.
     *
     * @param manager Entry point to CodeSigningManager.
     */
    public static void listCertificateProfiles(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager
            .certificateProfileOperations()
            .listByCodeSigningAccount("MyResourceGroup", "MyAccount", com.azure.core.util.Context.NONE);
    }
}
```

### CertificateProfileOperation_Update

```java
import com.azure.resourcemanager.codesigning.models.Certificate;
import com.azure.resourcemanager.codesigning.models.CertificateProfile;
import com.azure.resourcemanager.codesigning.models.CertificateStatus;
import com.azure.resourcemanager.codesigning.models.Revocation;
import java.util.Arrays;

/** Samples for CertificateProfileOperation Update. */
public final class CertificateProfileOperationUpdateSamples {
    /*
     * x-ms-original-file: specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2023-04-30-preview/examples/updateCertificateProfile.json
     */
    /**
     * Sample code: Update Certificate Profile.
     *
     * @param manager Entry point to CodeSigningManager.
     */
    public static void updateCertificateProfile(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        CertificateProfile resource =
            manager
                .certificateProfileOperations()
                .getWithResponse("MyResourceGroup", "MyAccount", "profileA", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withCertificates(
                Arrays
                    .asList(
                        new Certificate()
                            .withSerialNumber("xxxxxxxxxxxxxxxxxx")
                            .withSubjectName("CN=Contoso Inc, O=Contoso Inc, L=New York, S=New York, C=US")
                            .withThumbprint("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                            .withCreatedDate("3/14/2023 5:27:49 PM")
                            .withExpiryDate("3/17/2023 5:27:49 PM")
                            .withStatus(CertificateStatus.ACTIVE)
                            .withRevocations(
                                Arrays
                                    .asList(
                                        new Revocation()
                                            .withRequestedAt("3/19/2023 5:27:49 PM")
                                            .withRevokedAt("3/19/2023 5:27:49 PM")
                                            .withReason("KeyCompromised")
                                            .withRemarks("test")))))
            .apply();
    }
}
```

### CodeSigningAccountOperation_CheckNameAvailability

```java
import com.azure.resourcemanager.codesigning.models.CheckNameAvailability;

/** Samples for CodeSigningAccountOperation CheckNameAvailability. */
public final class CodeSigningAccountOperationCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2023-04-30-preview/examples/checkAccountNameAvailability.json
     */
    /**
     * Sample code: Validate a code signing account name.
     *
     * @param manager Entry point to CodeSigningManager.
     */
    public static void validateACodeSigningAccountName(
        com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager
            .codeSigningAccountOperations()
            .checkNameAvailabilityWithResponse(
                new CheckNameAvailability().withName("sample-account"), com.azure.core.util.Context.NONE);
    }
}
```

### CodeSigningAccountOperation_Create

```java
/** Samples for CodeSigningAccountOperation Create. */
public final class CodeSigningAccountOperationCreateSamples {
    /*
     * x-ms-original-file: specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2023-04-30-preview/examples/createCodeSigningAccount.json
     */
    /**
     * Sample code: Create Code Signing Account.
     *
     * @param manager Entry point to CodeSigningManager.
     */
    public static void createCodeSigningAccount(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager
            .codeSigningAccountOperations()
            .define("MyAccount")
            .withRegion((String) null)
            .withExistingResourceGroup("MyResourceGroup")
            .create();
    }
}
```

### CodeSigningAccountOperation_Delete

```java
/** Samples for CodeSigningAccountOperation Delete. */
public final class CodeSigningAccountOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2023-04-30-preview/examples/deleteCodeSigningAccount.json
     */
    /**
     * Sample code: Delete Code Signing Account.
     *
     * @param manager Entry point to CodeSigningManager.
     */
    public static void deleteCodeSigningAccount(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.codeSigningAccountOperations().delete("MyResourceGroup", "MyAccount", com.azure.core.util.Context.NONE);
    }
}
```

### CodeSigningAccountOperation_GetByResourceGroup

```java
/** Samples for CodeSigningAccountOperation GetByResourceGroup. */
public final class CodeSigningAccountOperationGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2023-04-30-preview/examples/getCodeSigningAccount.json
     */
    /**
     * Sample code: Get Code Signing Account.
     *
     * @param manager Entry point to CodeSigningManager.
     */
    public static void getCodeSigningAccount(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager
            .codeSigningAccountOperations()
            .getByResourceGroupWithResponse("MyResourceGroup", "MyAccount", com.azure.core.util.Context.NONE);
    }
}
```

### CodeSigningAccountOperation_List

```java
/** Samples for CodeSigningAccountOperation List. */
public final class CodeSigningAccountOperationListSamples {
    /*
     * x-ms-original-file: specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2023-04-30-preview/examples/listCodeSigningAccountsBySubscription.json
     */
    /**
     * Sample code: List Code Signing Accounts by Subscription.
     *
     * @param manager Entry point to CodeSigningManager.
     */
    public static void listCodeSigningAccountsBySubscription(
        com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.codeSigningAccountOperations().list(com.azure.core.util.Context.NONE);
    }
}
```

### CodeSigningAccountOperation_ListByResourceGroup

```java
/** Samples for CodeSigningAccountOperation ListByResourceGroup. */
public final class CodeSigningAccountOperationListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2023-04-30-preview/examples/listCodeSigningAccountsByResourceGroup.json
     */
    /**
     * Sample code: List Code Signing Accounts by Resource Group.
     *
     * @param manager Entry point to CodeSigningManager.
     */
    public static void listCodeSigningAccountsByResourceGroup(
        com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.codeSigningAccountOperations().listByResourceGroup("MyResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### CodeSigningAccountOperation_Update

```java
import com.azure.resourcemanager.codesigning.models.CodeSigningAccount;
import java.util.HashMap;
import java.util.Map;

/** Samples for CodeSigningAccountOperation Update. */
public final class CodeSigningAccountOperationUpdateSamples {
    /*
     * x-ms-original-file: specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2023-04-30-preview/examples/updateCodeSigningAccount.json
     */
    /**
     * Sample code: Update Code Signing Account.
     *
     * @param manager Entry point to CodeSigningManager.
     */
    public static void updateCodeSigningAccount(com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        CodeSigningAccount resource =
            manager
                .codeSigningAccountOperations()
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
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/codesigning/resource-manager/Microsoft.CodeSigning/preview/2023-04-30-preview/examples/listCodeSigningAccountOperations.json
     */
    /**
     * Sample code: List Code Signing Account operations.
     *
     * @param manager Entry point to CodeSigningManager.
     */
    public static void listCodeSigningAccountOperations(
        com.azure.resourcemanager.codesigning.CodeSigningManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

