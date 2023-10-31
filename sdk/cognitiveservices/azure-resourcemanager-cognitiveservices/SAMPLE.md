# Code snippets and samples


## Accounts

- [Create](#accounts_create)
- [Delete](#accounts_delete)
- [GetByResourceGroup](#accounts_getbyresourcegroup)
- [List](#accounts_list)
- [ListByResourceGroup](#accounts_listbyresourcegroup)
- [ListKeys](#accounts_listkeys)
- [ListModels](#accounts_listmodels)
- [ListSkus](#accounts_listskus)
- [ListUsages](#accounts_listusages)
- [RegenerateKey](#accounts_regeneratekey)
- [Update](#accounts_update)

## CommitmentPlans

- [CreateOrUpdate](#commitmentplans_createorupdate)
- [CreateOrUpdateAssociation](#commitmentplans_createorupdateassociation)
- [CreateOrUpdatePlan](#commitmentplans_createorupdateplan)
- [Delete](#commitmentplans_delete)
- [DeleteAssociation](#commitmentplans_deleteassociation)
- [DeletePlan](#commitmentplans_deleteplan)
- [Get](#commitmentplans_get)
- [GetAssociation](#commitmentplans_getassociation)
- [GetByResourceGroup](#commitmentplans_getbyresourcegroup)
- [List](#commitmentplans_list)
- [ListAssociations](#commitmentplans_listassociations)
- [ListByResourceGroup](#commitmentplans_listbyresourcegroup)
- [ListPlansBySubscription](#commitmentplans_listplansbysubscription)
- [UpdatePlan](#commitmentplans_updateplan)

## CommitmentTiers

- [List](#commitmenttiers_list)

## DeletedAccounts

- [Get](#deletedaccounts_get)
- [List](#deletedaccounts_list)
- [Purge](#deletedaccounts_purge)

## Deployments

- [CreateOrUpdate](#deployments_createorupdate)
- [Delete](#deployments_delete)
- [Get](#deployments_get)
- [List](#deployments_list)
- [ListSkus](#deployments_listskus)
- [Update](#deployments_update)

## EncryptionScopes

- [CreateOrUpdate](#encryptionscopes_createorupdate)
- [Delete](#encryptionscopes_delete)
- [Get](#encryptionscopes_get)
- [List](#encryptionscopes_list)

## Models

- [List](#models_list)

## Operations

- [List](#operations_list)

## PrivateEndpointConnections

- [CreateOrUpdate](#privateendpointconnections_createorupdate)
- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [List](#privateendpointconnections_list)

## PrivateLinkResources

- [List](#privatelinkresources_list)

## RaiBlocklistItems

- [CreateOrUpdate](#raiblocklistitems_createorupdate)
- [Delete](#raiblocklistitems_delete)
- [Get](#raiblocklistitems_get)
- [List](#raiblocklistitems_list)

## RaiBlocklists

- [CreateOrUpdate](#raiblocklists_createorupdate)
- [Delete](#raiblocklists_delete)
- [Get](#raiblocklists_get)
- [List](#raiblocklists_list)

## RaiContentFilters

- [List](#raicontentfilters_list)

## RaiPolicies

- [CreateOrUpdate](#raipolicies_createorupdate)
- [Delete](#raipolicies_delete)
- [Get](#raipolicies_get)
- [List](#raipolicies_list)

## ResourceProvider

- [CheckDomainAvailability](#resourceprovider_checkdomainavailability)
- [CheckSkuAvailability](#resourceprovider_checkskuavailability)

## ResourceSkus

- [List](#resourceskus_list)

## Usages

- [List](#usages_list)
### Accounts_Create

```java
import com.azure.resourcemanager.cognitiveservices.models.AccountProperties;
import com.azure.resourcemanager.cognitiveservices.models.Encryption;
import com.azure.resourcemanager.cognitiveservices.models.Identity;
import com.azure.resourcemanager.cognitiveservices.models.KeySource;
import com.azure.resourcemanager.cognitiveservices.models.KeyVaultProperties;
import com.azure.resourcemanager.cognitiveservices.models.ResourceIdentityType;
import com.azure.resourcemanager.cognitiveservices.models.Sku;
import com.azure.resourcemanager.cognitiveservices.models.UserOwnedStorage;
import java.util.Arrays;

/** Samples for Accounts Create. */
public final class AccountsCreateSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/CreateAccountMin.json
     */
    /**
     * Sample code: Create Account Min.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void createAccountMin(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .accounts()
            .define("testCreate1")
            .withExistingResourceGroup("myResourceGroup")
            .withRegion("West US")
            .withKind("CognitiveServices")
            .withSku(new Sku().withName("S0"))
            .withIdentity(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withProperties(new AccountProperties())
            .create();
    }

    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/CreateAccount.json
     */
    /**
     * Sample code: Create Account.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void createAccount(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .accounts()
            .define("testCreate1")
            .withExistingResourceGroup("myResourceGroup")
            .withRegion("West US")
            .withKind("Emotion")
            .withSku(new Sku().withName("S0"))
            .withIdentity(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withProperties(
                new AccountProperties()
                    .withEncryption(
                        new Encryption()
                            .withKeyVaultProperties(
                                new KeyVaultProperties()
                                    .withKeyName("fakeTokenPlaceholder")
                                    .withKeyVersion("fakeTokenPlaceholder")
                                    .withKeyVaultUri("fakeTokenPlaceholder"))
                            .withKeySource(KeySource.MICROSOFT_KEY_VAULT))
                    .withUserOwnedStorage(
                        Arrays
                            .asList(
                                new UserOwnedStorage()
                                    .withResourceId(
                                        "/subscriptions/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount"))))
            .create();
    }
}
```

### Accounts_Delete

```java
/** Samples for Accounts Delete. */
public final class AccountsDeleteSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/DeleteAccount.json
     */
    /**
     * Sample code: Delete Account.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void deleteAccount(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.accounts().delete("myResourceGroup", "PropTest01", com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_GetByResourceGroup

```java
/** Samples for Accounts GetByResourceGroup. */
public final class AccountsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetAccount.json
     */
    /**
     * Sample code: Get Account.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getAccount(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .accounts()
            .getByResourceGroupWithResponse("myResourceGroup", "myAccount", com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_List

```java
/** Samples for Accounts List. */
public final class AccountsListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListAccountsBySubscription.json
     */
    /**
     * Sample code: List Accounts by Subscription.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listAccountsBySubscription(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.accounts().list(com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_ListByResourceGroup

```java
/** Samples for Accounts ListByResourceGroup. */
public final class AccountsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListAccountsByResourceGroup.json
     */
    /**
     * Sample code: List Accounts by Resource Group.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listAccountsByResourceGroup(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.accounts().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_ListKeys

```java
/** Samples for Accounts ListKeys. */
public final class AccountsListKeysSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListKeys.json
     */
    /**
     * Sample code: List Keys.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listKeys(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.accounts().listKeysWithResponse("myResourceGroup", "myAccount", com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_ListModels

```java
/** Samples for Accounts ListModels. */
public final class AccountsListModelsSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListAccountModels.json
     */
    /**
     * Sample code: List AccountModels.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listAccountModels(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.accounts().listModels("resourceGroupName", "accountName", com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_ListSkus

```java
/** Samples for Accounts ListSkus. */
public final class AccountsListSkusSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListSkus.json
     */
    /**
     * Sample code: List SKUs.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listSKUs(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.accounts().listSkusWithResponse("myResourceGroup", "myAccount", com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_ListUsages

```java
/** Samples for Accounts ListUsages. */
public final class AccountsListUsagesSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetUsages.json
     */
    /**
     * Sample code: Get Usages.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getUsages(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .accounts()
            .listUsagesWithResponse("myResourceGroup", "TestUsage02", null, com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_RegenerateKey

```java
import com.azure.resourcemanager.cognitiveservices.models.KeyName;
import com.azure.resourcemanager.cognitiveservices.models.RegenerateKeyParameters;

/** Samples for Accounts RegenerateKey. */
public final class AccountsRegenerateKeySamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/RegenerateKey.json
     */
    /**
     * Sample code: Regenerate Keys.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void regenerateKeys(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .accounts()
            .regenerateKeyWithResponse(
                "myResourceGroup",
                "myAccount",
                new RegenerateKeyParameters().withKeyName(KeyName.KEY2),
                com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_Update

```java
import com.azure.resourcemanager.cognitiveservices.models.Account;
import com.azure.resourcemanager.cognitiveservices.models.Sku;

/** Samples for Accounts Update. */
public final class AccountsUpdateSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/UpdateAccount.json
     */
    /**
     * Sample code: Update Account.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void updateAccount(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        Account resource =
            manager
                .accounts()
                .getByResourceGroupWithResponse("bvttest", "bingSearch", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withSku(new Sku().withName("S2")).apply();
    }
}
```

### CommitmentPlans_CreateOrUpdate

```java
import com.azure.resourcemanager.cognitiveservices.fluent.models.CommitmentPlanInner;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPeriod;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlanProperties;
import com.azure.resourcemanager.cognitiveservices.models.HostingModel;

/** Samples for CommitmentPlans CreateOrUpdate. */
public final class CommitmentPlansCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/PutCommitmentPlan.json
     */
    /**
     * Sample code: PutCommitmentPlan.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void putCommitmentPlan(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .commitmentPlans()
            .createOrUpdateWithResponse(
                "resourceGroupName",
                "accountName",
                "commitmentPlanName",
                new CommitmentPlanInner()
                    .withProperties(
                        new CommitmentPlanProperties()
                            .withHostingModel(HostingModel.WEB)
                            .withPlanType("Speech2Text")
                            .withCurrent(new CommitmentPeriod().withTier("T1"))
                            .withAutoRenew(true)),
                com.azure.core.util.Context.NONE);
    }
}
```

### CommitmentPlans_CreateOrUpdateAssociation

```java
/** Samples for CommitmentPlans CreateOrUpdateAssociation. */
public final class CommitmentPlansCreateOrUpdateAssociationSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/CreateSharedCommitmentPlanAssociation.json
     */
    /**
     * Sample code: PutCommitmentPlan.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void putCommitmentPlan(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .commitmentPlans()
            .defineAssociation("commitmentPlanAssociationName")
            .withExistingCommitmentPlan("resourceGroupName", "commitmentPlanName")
            .withAccountId(
                "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.CognitiveServices/accounts/accountName")
            .create();
    }
}
```

### CommitmentPlans_CreateOrUpdatePlan

```java
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPeriod;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlanProperties;
import com.azure.resourcemanager.cognitiveservices.models.HostingModel;
import com.azure.resourcemanager.cognitiveservices.models.Sku;

/** Samples for CommitmentPlans CreateOrUpdatePlan. */
public final class CommitmentPlansCreateOrUpdatePlanSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/CreateSharedCommitmentPlan.json
     */
    /**
     * Sample code: Create Commitment Plan.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void createCommitmentPlan(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .commitmentPlans()
            .definePlan("commitmentPlanName")
            .withExistingResourceGroup("resourceGroupName")
            .withRegion("West US")
            .withKind("SpeechServices")
            .withSku(new Sku().withName("S0"))
            .withProperties(
                new CommitmentPlanProperties()
                    .withHostingModel(HostingModel.WEB)
                    .withPlanType("STT")
                    .withCurrent(new CommitmentPeriod().withTier("T1"))
                    .withAutoRenew(true))
            .create();
    }
}
```

### CommitmentPlans_Delete

```java
/** Samples for CommitmentPlans Delete. */
public final class CommitmentPlansDeleteSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/DeleteCommitmentPlan.json
     */
    /**
     * Sample code: DeleteCommitmentPlan.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void deleteCommitmentPlan(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .commitmentPlans()
            .delete("resourceGroupName", "accountName", "commitmentPlanName", com.azure.core.util.Context.NONE);
    }
}
```

### CommitmentPlans_DeleteAssociation

```java
/** Samples for CommitmentPlans DeleteAssociation. */
public final class CommitmentPlansDeleteAssociationSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/DeleteSharedCommitmentPlanAssociation.json
     */
    /**
     * Sample code: DeleteCommitmentPlan.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void deleteCommitmentPlan(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .commitmentPlans()
            .deleteAssociation(
                "resourceGroupName",
                "commitmentPlanName",
                "commitmentPlanAssociationName",
                com.azure.core.util.Context.NONE);
    }
}
```

### CommitmentPlans_DeletePlan

```java
/** Samples for CommitmentPlans DeletePlan. */
public final class CommitmentPlansDeletePlanSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/DeleteSharedCommitmentPlan.json
     */
    /**
     * Sample code: Delete Commitment Plan.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void deleteCommitmentPlan(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .commitmentPlans()
            .deletePlan("resourceGroupName", "commitmentPlanName", com.azure.core.util.Context.NONE);
    }
}
```

### CommitmentPlans_Get

```java
/** Samples for CommitmentPlans Get. */
public final class CommitmentPlansGetSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetCommitmentPlan.json
     */
    /**
     * Sample code: GetCommitmentPlan.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getCommitmentPlan(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .commitmentPlans()
            .getWithResponse(
                "resourceGroupName", "accountName", "commitmentPlanName", com.azure.core.util.Context.NONE);
    }
}
```

### CommitmentPlans_GetAssociation

```java
/** Samples for CommitmentPlans GetAssociation. */
public final class CommitmentPlansGetAssociationSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetSharedCommitmentPlanAssociation.json
     */
    /**
     * Sample code: GetCommitmentPlan.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getCommitmentPlan(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .commitmentPlans()
            .getAssociationWithResponse(
                "resourceGroupName",
                "commitmentPlanName",
                "commitmentPlanAssociationName",
                com.azure.core.util.Context.NONE);
    }
}
```

### CommitmentPlans_GetByResourceGroup

```java
/** Samples for CommitmentPlans GetByResourceGroup. */
public final class CommitmentPlansGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetSharedCommitmentPlan.json
     */
    /**
     * Sample code: Get Commitment Plan.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getCommitmentPlan(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .commitmentPlans()
            .getByResourceGroupWithResponse(
                "resourceGroupName", "commitmentPlanName", com.azure.core.util.Context.NONE);
    }
}
```

### CommitmentPlans_List

```java
/** Samples for CommitmentPlans List. */
public final class CommitmentPlansListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListCommitmentPlans.json
     */
    /**
     * Sample code: ListCommitmentPlans.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listCommitmentPlans(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.commitmentPlans().list("resourceGroupName", "accountName", com.azure.core.util.Context.NONE);
    }
}
```

### CommitmentPlans_ListAssociations

```java
/** Samples for CommitmentPlans ListAssociations. */
public final class CommitmentPlansListAssociationsSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListSharedCommitmentPlanAssociations.json
     */
    /**
     * Sample code: ListCommitmentPlans.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listCommitmentPlans(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .commitmentPlans()
            .listAssociations("resourceGroupName", "commitmentPlanName", com.azure.core.util.Context.NONE);
    }
}
```

### CommitmentPlans_ListByResourceGroup

```java
/** Samples for CommitmentPlans ListByResourceGroup. */
public final class CommitmentPlansListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListSharedCommitmentPlansByResourceGroup.json
     */
    /**
     * Sample code: List Commitment Plans by Resource Group.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listCommitmentPlansByResourceGroup(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.commitmentPlans().listByResourceGroup("resourceGroupName", com.azure.core.util.Context.NONE);
    }
}
```

### CommitmentPlans_ListPlansBySubscription

```java
/** Samples for CommitmentPlans ListPlansBySubscription. */
public final class CommitmentPlansListPlansBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListSharedCommitmentPlansBySubscription.json
     */
    /**
     * Sample code: List Accounts by Subscription.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listAccountsBySubscription(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.commitmentPlans().listPlansBySubscription(com.azure.core.util.Context.NONE);
    }
}
```

### CommitmentPlans_UpdatePlan

```java
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlan;
import java.util.HashMap;
import java.util.Map;

/** Samples for CommitmentPlans UpdatePlan. */
public final class CommitmentPlansUpdatePlanSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/UpdateSharedCommitmentPlan.json
     */
    /**
     * Sample code: Create Commitment Plan.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void createCommitmentPlan(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        CommitmentPlan resource =
            manager
                .commitmentPlans()
                .getByResourceGroupWithResponse(
                    "resourceGroupName", "commitmentPlanName", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("name", "value")).apply();
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

### CommitmentTiers_List

```java
/** Samples for CommitmentTiers List. */
public final class CommitmentTiersListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListCommitmentTiers.json
     */
    /**
     * Sample code: ListCommitmentTiers.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listCommitmentTiers(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.commitmentTiers().list("location", com.azure.core.util.Context.NONE);
    }
}
```

### DeletedAccounts_Get

```java
/** Samples for DeletedAccounts Get. */
public final class DeletedAccountsGetSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetDeletedAccount.json
     */
    /**
     * Sample code: Get Account.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getAccount(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .deletedAccounts()
            .getWithResponse("westus", "myResourceGroup", "myAccount", com.azure.core.util.Context.NONE);
    }
}
```

### DeletedAccounts_List

```java
/** Samples for DeletedAccounts List. */
public final class DeletedAccountsListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListDeletedAccountsBySubscription.json
     */
    /**
     * Sample code: List Deleted Accounts by Subscription.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listDeletedAccountsBySubscription(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.deletedAccounts().list(com.azure.core.util.Context.NONE);
    }
}
```

### DeletedAccounts_Purge

```java
/** Samples for DeletedAccounts Purge. */
public final class DeletedAccountsPurgeSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/PurgeDeletedAccount.json
     */
    /**
     * Sample code: Delete Account.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void deleteAccount(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.deletedAccounts().purge("westus", "myResourceGroup", "PropTest01", com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_CreateOrUpdate

```java
import com.azure.resourcemanager.cognitiveservices.models.DeploymentModel;
import com.azure.resourcemanager.cognitiveservices.models.DeploymentProperties;
import com.azure.resourcemanager.cognitiveservices.models.Sku;

/** Samples for Deployments CreateOrUpdate. */
public final class DeploymentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/PutDeployment.json
     */
    /**
     * Sample code: PutDeployment.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void putDeployment(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .deployments()
            .define("deploymentName")
            .withExistingAccount("resourceGroupName", "accountName")
            .withSku(new Sku().withName("Standard").withCapacity(1))
            .withProperties(
                new DeploymentProperties()
                    .withModel(new DeploymentModel().withFormat("OpenAI").withName("ada").withVersion("1")))
            .create();
    }
}
```

### Deployments_Delete

```java
/** Samples for Deployments Delete. */
public final class DeploymentsDeleteSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/DeleteDeployment.json
     */
    /**
     * Sample code: DeleteDeployment.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void deleteDeployment(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .deployments()
            .delete("resourceGroupName", "accountName", "deploymentName", com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_Get

```java
/** Samples for Deployments Get. */
public final class DeploymentsGetSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetDeployment.json
     */
    /**
     * Sample code: GetDeployment.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getDeployment(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .deployments()
            .getWithResponse("resourceGroupName", "accountName", "deploymentName", com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_List

```java
/** Samples for Deployments List. */
public final class DeploymentsListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListDeployments.json
     */
    /**
     * Sample code: ListDeployments.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listDeployments(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.deployments().list("resourceGroupName", "accountName", com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_ListSkus

```java
/** Samples for Deployments ListSkus. */
public final class DeploymentsListSkusSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListDeploymentSkus.json
     */
    /**
     * Sample code: ListDeploymentSkus.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listDeploymentSkus(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .deployments()
            .listSkus("resourceGroupName", "accountName", "deploymentName", com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_Update

```java
import com.azure.resourcemanager.cognitiveservices.models.Deployment;
import com.azure.resourcemanager.cognitiveservices.models.Sku;

/** Samples for Deployments Update. */
public final class DeploymentsUpdateSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/UpdateDeployment.json
     */
    /**
     * Sample code: UpdateDeployment.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void updateDeployment(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        Deployment resource =
            manager
                .deployments()
                .getWithResponse("resourceGroupName", "accountName", "deploymentName", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withSku(new Sku().withName("Standard").withCapacity(1)).apply();
    }
}
```

### EncryptionScopes_CreateOrUpdate

```java
import com.azure.resourcemanager.cognitiveservices.models.EncryptionScopeProperties;
import com.azure.resourcemanager.cognitiveservices.models.EncryptionScopeState;
import com.azure.resourcemanager.cognitiveservices.models.KeySource;
import com.azure.resourcemanager.cognitiveservices.models.KeyVaultProperties;

/** Samples for EncryptionScopes CreateOrUpdate. */
public final class EncryptionScopesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/PutEncryptionScope.json
     */
    /**
     * Sample code: PutEncryptionScope.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void putEncryptionScope(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .encryptionScopes()
            .define("encryptionScopeName")
            .withExistingAccount("resourceGroupName", "accountName")
            .withProperties(
                new EncryptionScopeProperties()
                    .withKeyVaultProperties(
                        new KeyVaultProperties()
                            .withKeyName("fakeTokenPlaceholder")
                            .withKeyVersion("fakeTokenPlaceholder")
                            .withKeyVaultUri("fakeTokenPlaceholder")
                            .withIdentityClientId("00000000-0000-0000-0000-000000000000"))
                    .withKeySource(KeySource.MICROSOFT_KEY_VAULT)
                    .withState(EncryptionScopeState.ENABLED))
            .create();
    }
}
```

### EncryptionScopes_Delete

```java
/** Samples for EncryptionScopes Delete. */
public final class EncryptionScopesDeleteSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/DeleteEncryptionScope.json
     */
    /**
     * Sample code: DeleteEncryptionScope.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void deleteEncryptionScope(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .encryptionScopes()
            .delete("resourceGroupName", "accountName", "encryptionScopeName", com.azure.core.util.Context.NONE);
    }
}
```

### EncryptionScopes_Get

```java
/** Samples for EncryptionScopes Get. */
public final class EncryptionScopesGetSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetEncryptionScope.json
     */
    /**
     * Sample code: GetEncryptionScope.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getEncryptionScope(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .encryptionScopes()
            .getWithResponse(
                "resourceGroupName", "accountName", "encryptionScopeName", com.azure.core.util.Context.NONE);
    }
}
```

### EncryptionScopes_List

```java
/** Samples for EncryptionScopes List. */
public final class EncryptionScopesListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListEncryptionScopes.json
     */
    /**
     * Sample code: ListEncryptionScopes.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listEncryptionScopes(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.encryptionScopes().list("resourceGroupName", "accountName", com.azure.core.util.Context.NONE);
    }
}
```

### Models_List

```java
/** Samples for Models List. */
public final class ModelsListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListModels.json
     */
    /**
     * Sample code: ListModels.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listModels(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.models().list("WestUS", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetOperations.json
     */
    /**
     * Sample code: Get Operations.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getOperations(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_CreateOrUpdate

```java
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkServiceConnectionState;

/** Samples for PrivateEndpointConnections CreateOrUpdate. */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/PutPrivateEndpointConnection.json
     */
    /**
     * Sample code: PutPrivateEndpointConnection.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void putPrivateEndpointConnection(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .privateEndpointConnections()
            .define("{privateEndpointConnectionName}")
            .withExistingAccount("res7687", "sto9699")
            .withProperties(
                new PrivateEndpointConnectionProperties()
                    .withPrivateLinkServiceConnectionState(
                        new PrivateLinkServiceConnectionState()
                            .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                            .withDescription("Auto-Approved")))
            .create();
    }
}
```

### PrivateEndpointConnections_Delete

```java
/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/DeletePrivateEndpointConnection.json
     */
    /**
     * Sample code: DeletePrivateEndpointConnection.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void deletePrivateEndpointConnection(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .privateEndpointConnections()
            .delete("res6977", "sto2527", "{privateEndpointConnectionName}", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetPrivateEndpointConnection.json
     */
    /**
     * Sample code: GetPrivateEndpointConnection.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getPrivateEndpointConnection(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse("res6977", "sto2527", "{privateEndpointConnectionName}", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_List

```java
/** Samples for PrivateEndpointConnections List. */
public final class PrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListPrivateEndpointConnections.json
     */
    /**
     * Sample code: GetPrivateEndpointConnection.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getPrivateEndpointConnection(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.privateEndpointConnections().listWithResponse("res6977", "sto2527", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_List

```java
/** Samples for PrivateLinkResources List. */
public final class PrivateLinkResourcesListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListPrivateLinkResources.json
     */
    /**
     * Sample code: ListPrivateLinkResources.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listPrivateLinkResources(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.privateLinkResources().listWithResponse("res6977", "sto2527", com.azure.core.util.Context.NONE);
    }
}
```

### RaiBlocklistItems_CreateOrUpdate

```java
import com.azure.resourcemanager.cognitiveservices.models.RaiBlocklistItemProperties;

/** Samples for RaiBlocklistItems CreateOrUpdate. */
public final class RaiBlocklistItemsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/PutRaiBlocklistItem.json
     */
    /**
     * Sample code: PutRaiBlocklistItem.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void putRaiBlocklistItem(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .raiBlocklistItems()
            .define("raiBlocklistItemName")
            .withExistingRaiBlocklist("resourceGroupName", "accountName", "raiBlocklistName")
            .withProperties(new RaiBlocklistItemProperties().withPattern("Pattern To Block").withIsRegex(false))
            .create();
    }
}
```

### RaiBlocklistItems_Delete

```java
/** Samples for RaiBlocklistItems Delete. */
public final class RaiBlocklistItemsDeleteSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/DeleteRaiBlocklistItem.json
     */
    /**
     * Sample code: DeleteRaiBlocklistItem.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void deleteRaiBlocklistItem(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .raiBlocklistItems()
            .delete(
                "resourceGroupName",
                "accountName",
                "raiBlocklistName",
                "raiBlocklistItemName",
                com.azure.core.util.Context.NONE);
    }
}
```

### RaiBlocklistItems_Get

```java
/** Samples for RaiBlocklistItems Get. */
public final class RaiBlocklistItemsGetSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetRaiBlocklistItem.json
     */
    /**
     * Sample code: GetRaiBlocklistItem.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getRaiBlocklistItem(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .raiBlocklistItems()
            .getWithResponse(
                "resourceGroupName",
                "accountName",
                "raiBlocklistName",
                "raiBlocklistItemName",
                com.azure.core.util.Context.NONE);
    }
}
```

### RaiBlocklistItems_List

```java
/** Samples for RaiBlocklistItems List. */
public final class RaiBlocklistItemsListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListBlocklistItems.json
     */
    /**
     * Sample code: ListBlocklistItems.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listBlocklistItems(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .raiBlocklistItems()
            .list("resourceGroupName", "accountName", "raiBlocklistName", com.azure.core.util.Context.NONE);
    }
}
```

### RaiBlocklists_CreateOrUpdate

```java
import com.azure.resourcemanager.cognitiveservices.models.RaiBlocklistProperties;

/** Samples for RaiBlocklists CreateOrUpdate. */
public final class RaiBlocklistsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/PutRaiBlocklist.json
     */
    /**
     * Sample code: PutRaiBlocklist.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void putRaiBlocklist(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .raiBlocklists()
            .define("raiBlocklistName")
            .withExistingAccount("resourceGroupName", "accountName")
            .withProperties(new RaiBlocklistProperties().withDescription("Basic blocklist description"))
            .create();
    }
}
```

### RaiBlocklists_Delete

```java
/** Samples for RaiBlocklists Delete. */
public final class RaiBlocklistsDeleteSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/DeleteRaiBlocklist.json
     */
    /**
     * Sample code: DeleteRaiBlocklist.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void deleteRaiBlocklist(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .raiBlocklists()
            .delete("resourceGroupName", "accountName", "raiBlocklistName", com.azure.core.util.Context.NONE);
    }
}
```

### RaiBlocklists_Get

```java
/** Samples for RaiBlocklists Get. */
public final class RaiBlocklistsGetSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetRaiBlocklist.json
     */
    /**
     * Sample code: GetRaiBlocklist.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getRaiBlocklist(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .raiBlocklists()
            .getWithResponse("resourceGroupName", "accountName", "raiBlocklistName", com.azure.core.util.Context.NONE);
    }
}
```

### RaiBlocklists_List

```java
/** Samples for RaiBlocklists List. */
public final class RaiBlocklistsListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListBlocklists.json
     */
    /**
     * Sample code: ListBlocklists.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listBlocklists(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.raiBlocklists().list("resourceGroupName", "accountName", com.azure.core.util.Context.NONE);
    }
}
```

### RaiContentFilters_List

```java
/** Samples for RaiContentFilters List. */
public final class RaiContentFiltersListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListRaiContentFilters.json
     */
    /**
     * Sample code: ListRaiContentFilters.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listRaiContentFilters(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.raiContentFilters().listWithResponse("WestUS", com.azure.core.util.Context.NONE);
    }
}
```

### RaiPolicies_CreateOrUpdate

```java
import com.azure.resourcemanager.cognitiveservices.models.AllowedContentLevel;
import com.azure.resourcemanager.cognitiveservices.models.RaiPolicyContentFilter;
import com.azure.resourcemanager.cognitiveservices.models.RaiPolicyProperties;
import java.util.Arrays;

/** Samples for RaiPolicies CreateOrUpdate. */
public final class RaiPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/PutRaiPolicy.json
     */
    /**
     * Sample code: PutRaiPolicy.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void putRaiPolicy(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .raiPolicies()
            .define("raiPolicyName")
            .withExistingAccount("resourceGroupName", "accountName")
            .withProperties(
                new RaiPolicyProperties()
                    .withBasePolicyName("112")
                    .withContentFilters(
                        Arrays
                            .asList(
                                new RaiPolicyContentFilter()
                                    .withPolicyName("hate")
                                    .withAllowedContentLevel(AllowedContentLevel.LOW)
                                    .withBlocking(true),
                                new RaiPolicyContentFilter()
                                    .withPolicyName("sexual")
                                    .withAllowedContentLevel(AllowedContentLevel.LOW),
                                new RaiPolicyContentFilter().withPolicyName("violence").withEnabled(false),
                                new RaiPolicyContentFilter()
                                    .withPolicyName("DefaultHateSpeechBlockList")
                                    .withEnabled(false))))
            .create();
    }
}
```

### RaiPolicies_Delete

```java
/** Samples for RaiPolicies Delete. */
public final class RaiPoliciesDeleteSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/DeleteRaiPolicy.json
     */
    /**
     * Sample code: DeleteRaiPolicy.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void deleteRaiPolicy(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .raiPolicies()
            .delete("resourceGroupName", "accountName", "raiPolicyName", com.azure.core.util.Context.NONE);
    }
}
```

### RaiPolicies_Get

```java
/** Samples for RaiPolicies Get. */
public final class RaiPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetRaiPolicy.json
     */
    /**
     * Sample code: GetRaiPolicy.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getRaiPolicy(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .raiPolicies()
            .getWithResponse("resourceGroupName", "accountName", "raiPolicyName", com.azure.core.util.Context.NONE);
    }
}
```

### RaiPolicies_List

```java
/** Samples for RaiPolicies List. */
public final class RaiPoliciesListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListRaiPolicies.json
     */
    /**
     * Sample code: ListRaiPolicies.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listRaiPolicies(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.raiPolicies().list("resourceGroupName", "accountName", com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_CheckDomainAvailability

```java
import com.azure.resourcemanager.cognitiveservices.models.CheckDomainAvailabilityParameter;

/** Samples for ResourceProvider CheckDomainAvailability. */
public final class ResourceProviderCheckDomainAvailabilitySamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/CheckDomainAvailability.json
     */
    /**
     * Sample code: Check SKU Availability.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void checkSKUAvailability(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .resourceProviders()
            .checkDomainAvailabilityWithResponse(
                new CheckDomainAvailabilityParameter()
                    .withSubdomainName("contosodemoapp1")
                    .withType("Microsoft.CognitiveServices/accounts"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_CheckSkuAvailability

```java
import com.azure.resourcemanager.cognitiveservices.models.CheckSkuAvailabilityParameter;
import java.util.Arrays;

/** Samples for ResourceProvider CheckSkuAvailability. */
public final class ResourceProviderCheckSkuAvailabilitySamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/CheckSkuAvailability.json
     */
    /**
     * Sample code: Check SKU Availability.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void checkSKUAvailability(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .resourceProviders()
            .checkSkuAvailabilityWithResponse(
                "westus",
                new CheckSkuAvailabilityParameter()
                    .withSkus(Arrays.asList("S0"))
                    .withKind("Face")
                    .withType("Microsoft.CognitiveServices/accounts"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceSkus_List

```java
/** Samples for ResourceSkus List. */
public final class ResourceSkusListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/GetSkus.json
     */
    /**
     * Sample code: Regenerate Keys.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void regenerateKeys(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.resourceSkus().list(com.azure.core.util.Context.NONE);
    }
}
```

### Usages_List

```java
/** Samples for Usages List. */
public final class UsagesListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/preview/2023-10-01-preview/examples/ListUsages.json
     */
    /**
     * Sample code: Get Usages.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getUsages(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.usages().list("WestUS", null, com.azure.core.util.Context.NONE);
    }
}
```

