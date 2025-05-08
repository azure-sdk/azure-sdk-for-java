# Code snippets and samples


## Accounts

- [CheckNameAvailability](#accounts_checknameavailability)
- [CreateOrUpdate](#accounts_createorupdate)
- [Delete](#accounts_delete)
- [GetByResourceGroup](#accounts_getbyresourcegroup)
- [List](#accounts_list)
- [ListByResourceGroup](#accounts_listbyresourcegroup)
- [Update](#accounts_update)

## Generate

- [AccessToken](#generate_accesstoken)
- [ExtensionAccessToken](#generate_extensionaccesstoken)
- [ExtensionRestrictedViewerAccessToken](#generate_extensionrestrictedvieweraccesstoken)
- [RestrictedViewerAccessToken](#generate_restrictedvieweraccesstoken)

## Operations

- [List](#operations_list)

## PrivateEndpointConnections

- [CreateOrUpdate](#privateendpointconnections_createorupdate)
- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [ListByAccount](#privateendpointconnections_listbyaccount)

## PrivateLinkResources

- [Get](#privatelinkresources_get)
- [ListByAccount](#privatelinkresources_listbyaccount)
### Accounts_CheckNameAvailability

```java
import com.azure.resourcemanager.vi.models.ManagedServiceIdentity;
import com.azure.resourcemanager.vi.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.vi.models.OpenAiServicesForPutRequest;
import com.azure.resourcemanager.vi.models.StorageServicesForPutRequest;
import com.azure.resourcemanager.vi.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Accounts CreateOrUpdate.
 */
public final class AccountsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViAccountPut/
     * ConnectClassicAccountToArmAccountUsingSystemAssignedMI.json
     */
    /**
     * Sample code: Connect classic account to arm account using system assigned Mi.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void
        connectClassicAccountToArmAccountUsingSystemAssignedMi(com.azure.resourcemanager.vi.ViManager manager) {
        manager.accounts()
            .define("contosto-videoanalyzer")
            .withRegion("NorthEurope")
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED))
            .withAccountId("462af7c5-d1f6-4b91-86e3-8bc5e8a61574")
            .withStorageServices(new StorageServicesForPutRequest().withResourceId(
                "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.Storage/storageAccounts/contoso-videoanalyzer-ms"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViAccountPut/
     * ConnectClassicAccountToArmAccountUsingUserAssignedMi.json
     */
    /**
     * Sample code: Connect classic account to arm account using user assigned Mi.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void
        connectClassicAccountToArmAccountUsingUserAssignedMi(com.azure.resourcemanager.vi.ViManager manager) {
        manager.accounts()
            .define("contosto-videoanalyzer")
            .withRegion("NorthEurope")
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                    new UserAssignedIdentity())))
            .withAccountId("462af7c5-d1f6-4b91-86e3-8bc5e8a61574")
            .withStorageServices(new StorageServicesForPutRequest().withResourceId(
                "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.Storage/storageAccounts/contoso-videoanalyzer-ms")
                .withUserAssignedIdentity(
                    "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViAccountPut/
     * CreateOrUpdateAccountWithUserAssignedMi.json
     */
    /**
     * Sample code: Create or update account with user assigned Mi.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void createOrUpdateAccountWithUserAssignedMi(com.azure.resourcemanager.vi.ViManager manager) {
        manager.accounts()
            .define("contosto-videoanalyzer")
            .withRegion("NorthEurope")
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                    new UserAssignedIdentity(),
                    "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi2",
                    new UserAssignedIdentity())))
            .withStorageServices(new StorageServicesForPutRequest().withResourceId(
                "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.Storage/storageAccounts/contoso-videoanalyzer-ms")
                .withUserAssignedIdentity(
                    "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .withOpenAiServices(new OpenAiServicesForPutRequest().withResourceId(
                "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.CognitiveServices/accounts/contoso-viopenai-ms")
                .withUserAssignedIdentity(
                    "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi2"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViAccountPut/
     * CreateOrUpdateAccountWithSystemAssignedMi.json
     */
    /**
     * Sample code: Create or update account with system assigned Mi.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void createOrUpdateAccountWithSystemAssignedMi(com.azure.resourcemanager.vi.ViManager manager) {
        manager.accounts()
            .define("contosto-videoanalyzer")
            .withRegion("NorthEurope")
            .withExistingResourceGroup("contosto-videoanalyzer-rg")
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED))
            .withStorageServices(new StorageServicesForPutRequest().withResourceId(
                "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.Storage/storageAccounts/contoso-videoanalyzer-ms"))
            .withOpenAiServices(new OpenAiServicesForPutRequest().withResourceId(
                "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.CognitiveServices/accounts/contoso-viopenai-ms"))
            .create();
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

### Accounts_CreateOrUpdate

```java
/**
 * Samples for Accounts ListByResourceGroup.
 */
public final class AccountsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViAccountsListByResourceGroup
     * .json
     */
    /**
     * Sample code: List accounts by resource group.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void listAccountsByResourceGroup(com.azure.resourcemanager.vi.ViManager manager) {
        manager.accounts().listByResourceGroup("contoso-videoanalyzer-rg", com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_Delete

```java
import com.azure.resourcemanager.vi.models.GenerateExtensionAccessTokenParameters;
import com.azure.resourcemanager.vi.models.PermissionType;
import com.azure.resourcemanager.vi.models.Scope;

/**
 * Samples for Generate ExtensionAccessToken.
 */
public final class GenerateExtensionAccessTokenSamples {
    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/
     * ViGenerateExtensionAccessToken/ViGenerateAccountContributerAccessToken.json
     */
    /**
     * Sample code: Generate accessToken for account contributor.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateAccessTokenForAccountContributor(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .extensionAccessTokenWithResponse("contoso-videoindexer-rg", "contoso-videoindexer",
                new GenerateExtensionAccessTokenParameters().withPermissionType(PermissionType.CONTRIBUTOR)
                    .withScope(Scope.ACCOUNT)
                    .withExtensionId(
                        "/subscriptions/39ks012-8546-4da5-g6w0-8c3cb76dd930/resourceGroups/yl-arc/providers/Microsoft.Kubernetes/ConnectedClusters/yl-arc/providers/Microsoft.KubernetesConfiguration/extensions/exampleid"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/
     * ViGenerateExtensionAccessToken/ViGenerateAccountReaderAccessToken.json
     */
    /**
     * Sample code: Generate accessToken for account reader.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateAccessTokenForAccountReader(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .extensionAccessTokenWithResponse("contoso-videoindexer-rg", "contoso-videoindexer",
                new GenerateExtensionAccessTokenParameters().withPermissionType(PermissionType.READER)
                    .withScope(Scope.ACCOUNT)
                    .withExtensionId(
                        "/subscriptions/39ks012-8546-4da5-g6w0-8c3cb76dd930/resourceGroups/yl-arc/providers/Microsoft.Kubernetes/ConnectedClusters/yl-arc/providers/Microsoft.KubernetesConfiguration/extensions/exampleid"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/
     * ViGenerateExtensionAccessToken/ViGenerateVideoContributerAccessToken.json
     */
    /**
     * Sample code: Generate accessToken for video contributor.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateAccessTokenForVideoContributor(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .extensionAccessTokenWithResponse("contoso-videoindexer-rg", "contoso-videoindexer",
                new GenerateExtensionAccessTokenParameters().withPermissionType(PermissionType.CONTRIBUTOR)
                    .withScope(Scope.VIDEO)
                    .withExtensionId(
                        "/subscriptions/39ks012-8546-4da5-g6w0-8c3cb76dd930/resourceGroups/yl-arc/providers/Microsoft.Kubernetes/ConnectedClusters/yl-arc/providers/Microsoft.KubernetesConfiguration/extensions/exampleid")
                    .withVideoId("07ec9e38d4")
                    .withTokenLifetimeInSeconds(3600),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/
     * ViGenerateExtensionAccessToken/ViGenerateVideoReaderAccessToken.json
     */
    /**
     * Sample code: Generate accessToken for video reader.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateAccessTokenForVideoReader(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .extensionAccessTokenWithResponse("contoso-videoindexer-rg", "contoso-videoindexer",
                new GenerateExtensionAccessTokenParameters().withPermissionType(PermissionType.READER)
                    .withScope(Scope.VIDEO)
                    .withExtensionId(
                        "/subscriptions/39ks012-8546-4da5-g6w0-8c3cb76dd930/resourceGroups/yl-arc/providers/Microsoft.Kubernetes/ConnectedClusters/yl-arc/providers/Microsoft.KubernetesConfiguration/extensions/exampleid")
                    .withVideoId("07ec9e38d4")
                    .withTokenLifetimeInSeconds(3600),
                com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_GetByResourceGroup

```java
/**
 * Samples for Accounts List.
 */
public final class AccountsListSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViAccountsList.json
     */
    /**
     * Sample code: List accounts.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void listAccounts(com.azure.resourcemanager.vi.ViManager manager) {
        manager.accounts().list(com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_List

```java
/**
 * Samples for Accounts Delete.
 */
public final class AccountsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViAccountDelete.json
     */
    /**
     * Sample code: Delete account.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void deleteAccount(com.azure.resourcemanager.vi.ViManager manager) {
        manager.accounts()
            .deleteByResourceGroupWithResponse("contoso-rg", "contosto-videoanalyzer",
                com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_ListByResourceGroup

```java
/**
 * Samples for PrivateLinkResources Get.
 */
public final class PrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/PrivateLinkResources/
     * PrivateLinkResources_Get.json
     */
    /**
     * Sample code: PrivateLinkResourcesGet.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void privateLinkResourcesGet(com.azure.resourcemanager.vi.ViManager manager) {
        manager.privateLinkResources().getWithResponse("test-rg", "contoso", "avi", com.azure.core.util.Context.NONE);
    }
}
```

### Accounts_Update

```java
import com.azure.resourcemanager.vi.models.GenerateAccessTokenParameters;
import com.azure.resourcemanager.vi.models.PermissionType;
import com.azure.resourcemanager.vi.models.Scope;

/**
 * Samples for Generate AccessToken.
 */
public final class GenerateAccessTokenSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViGenerateAccessToken/
     * ViGenerateProjectContributerAccessToken.json
     */
    /**
     * Sample code: Generate accessToken for project contributor.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateAccessTokenForProjectContributor(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .accessTokenWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer",
                new GenerateAccessTokenParameters().withPermissionType(PermissionType.CONTRIBUTOR)
                    .withScope(Scope.PROJECT)
                    .withProjectId("07ec9e38d4"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViGenerateAccessToken/
     * ViGenerateProjectReaderAccessToken.json
     */
    /**
     * Sample code: Generate accessToken for project reader.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateAccessTokenForProjectReader(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .accessTokenWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer",
                new GenerateAccessTokenParameters().withPermissionType(PermissionType.READER)
                    .withScope(Scope.PROJECT)
                    .withProjectId("07ec9e38d4"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViGenerateAccessToken/
     * ViGenerateAccountContributerAccessToken.json
     */
    /**
     * Sample code: Generate accessToken for account contributor.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateAccessTokenForAccountContributor(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .accessTokenWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer",
                new GenerateAccessTokenParameters().withPermissionType(PermissionType.CONTRIBUTOR)
                    .withScope(Scope.ACCOUNT),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViGenerateAccessToken/
     * ViGenerateAccountReaderAccessToken.json
     */
    /**
     * Sample code: Generate accessToken for account reader.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateAccessTokenForAccountReader(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .accessTokenWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer",
                new GenerateAccessTokenParameters().withPermissionType(PermissionType.READER).withScope(Scope.ACCOUNT),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViGenerateAccessToken/
     * ViGenerateVideoContributerAccessToken.json
     */
    /**
     * Sample code: Generate accessToken for video contributor.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateAccessTokenForVideoContributor(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .accessTokenWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer",
                new GenerateAccessTokenParameters().withPermissionType(PermissionType.CONTRIBUTOR)
                    .withScope(Scope.VIDEO)
                    .withVideoId("07ec9e38d4"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViGenerateAccessToken/
     * ViGenerateVideoReaderAccessToken.json
     */
    /**
     * Sample code: Generate accessToken for video reader.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateAccessTokenForVideoReader(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .accessTokenWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer",
                new GenerateAccessTokenParameters().withPermissionType(PermissionType.READER)
                    .withScope(Scope.VIDEO)
                    .withVideoId("07ec9e38d4"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Generate_AccessToken

```java
import com.azure.resourcemanager.vi.models.Account;
import com.azure.resourcemanager.vi.models.ManagedServiceIdentity;
import com.azure.resourcemanager.vi.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.vi.models.OpenAiServicesForPatchRequest;
import com.azure.resourcemanager.vi.models.StorageServicesForPatchRequest;
import com.azure.resourcemanager.vi.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Accounts Update.
 */
public final class AccountsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViAccountPatch/
     * PatchAccountWithUserAssignedMi.json
     */
    /**
     * Sample code: Patch account with user assigned Mi.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void patchAccountWithUserAssignedMi(com.azure.resourcemanager.vi.ViManager manager) {
        Account resource = manager.accounts()
            .getByResourceGroupWithResponse("contosto-videoanalyzer-rg", "contosto-videoanalyzer",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi",
                    new UserAssignedIdentity(),
                    "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi2",
                    new UserAssignedIdentity())))
            .withStorageServices(new StorageServicesForPatchRequest().withUserAssignedIdentity(
                "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi"))
            .withOpenAiServices(new OpenAiServicesForPatchRequest().withResourceId(
                "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.CognitiveServices/accounts/contoso-viopenai-ms")
                .withUserAssignedIdentity(
                    "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/contoso-videoanalyzer-mi2"))
            .apply();
    }

    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViAccountPatch/
     * PatchAccountWithSystemAssignedMi.json
     */
    /**
     * Sample code: Patch account with system assigned Mi.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void patchAccountWithSystemAssignedMi(com.azure.resourcemanager.vi.ViManager manager) {
        Account resource = manager.accounts()
            .getByResourceGroupWithResponse("contoso-videoanalyzer-rg", "contosto-videoanalyzer",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED))
            .withStorageServices(new StorageServicesForPatchRequest())
            .withOpenAiServices(new OpenAiServicesForPatchRequest().withResourceId(
                "/subscriptions/xxx/resourceGroups/contoso-videoanalyzer-rg/providers/Microsoft.CognitiveServices/accounts/contoso-viopenai-ms"))
            .apply();
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

### Generate_ExtensionAccessToken

```java
import com.azure.resourcemanager.vi.models.GenerateRestrictedViewerAccessTokenParameters;
import com.azure.resourcemanager.vi.models.Scope;

/**
 * Samples for Generate RestrictedViewerAccessToken.
 */
public final class GenerateRestrictedViewerAccessTokenSamples {
    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/
     * ViGenerateRestrictedViewerAccessToken/ViGenerateVideoRestrictedViewerAccessToken.json
     */
    /**
     * Sample code: Generate restricted viewer accessToken for video.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateRestrictedViewerAccessTokenForVideo(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .restrictedViewerAccessTokenWithResponse("contosto-azurevideoindexer-rg", "contosto-azurevideoindexer",
                new GenerateRestrictedViewerAccessTokenParameters().withScope(Scope.VIDEO).withVideoId("07ec9e38d4"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/
     * ViGenerateRestrictedViewerAccessToken/ViGenerateAccountRestrictedViewerAccessToken.json
     */
    /**
     * Sample code: Generate restricted viewer accessToken for account.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateRestrictedViewerAccessTokenForAccount(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .restrictedViewerAccessTokenWithResponse("contosto-azurevideoindexer-rg", "contosto-azurevideoindexer",
                new GenerateRestrictedViewerAccessTokenParameters().withScope(Scope.ACCOUNT),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/
     * ViGenerateRestrictedViewerAccessToken/ViGenerateProjectRestrictedViewerAccessToken.json
     */
    /**
     * Sample code: Generate restricted viewer accessToken for project.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateRestrictedViewerAccessTokenForProject(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .restrictedViewerAccessTokenWithResponse("contosto-azurevideoindexer-rg", "contosto-azurevideoindexer",
                new GenerateRestrictedViewerAccessTokenParameters().withScope(Scope.PROJECT)
                    .withProjectId("07ec9e38d4"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Generate_ExtensionRestrictedViewerAccessToken

```java
import com.azure.resourcemanager.vi.models.GenerateExtensionRestrictedViewerAccessTokenParameters;
import com.azure.resourcemanager.vi.models.Scope;

/**
 * Samples for Generate ExtensionRestrictedViewerAccessToken.
 */
public final class GenerateExtensionRestrictedViewerAccessTokenSamples {
    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/
     * ViGenerateExtensionRestrictedViewerAccessToken/ViGenerateAccountRestrictedViewerAccessToken.json
     */
    /**
     * Sample code: Generate restricted viewer accessToken for account.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateRestrictedViewerAccessTokenForAccount(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .extensionRestrictedViewerAccessTokenWithResponse("contosto-azurevideoindexer-rg",
                "contosto-azurevideoindexer",
                new GenerateExtensionRestrictedViewerAccessTokenParameters().withScope(Scope.ACCOUNT)
                    .withExtensionId(
                        "/subscriptions/39ks012-8546-4da5-g6w0-8c3cb76dd930/resourceGroups/yl-arc/providers/Microsoft.Kubernetes/ConnectedClusters/yl-arc/providers/Microsoft.KubernetesConfiguration/extensions/exampleid"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/
     * ViGenerateExtensionRestrictedViewerAccessToken/ViGenerateVideoRestrictedViewerAccessToken.json
     */
    /**
     * Sample code: Generate restricted viewer accessToken for video #1.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void generateRestrictedViewerAccessTokenForVideo1(com.azure.resourcemanager.vi.ViManager manager) {
        manager.generates()
            .extensionRestrictedViewerAccessTokenWithResponse("contosto-azurevideoindexer-rg",
                "contosto-azurevideoindexer",
                new GenerateExtensionRestrictedViewerAccessTokenParameters().withScope(Scope.VIDEO)
                    .withExtensionId(
                        "/subscriptions/39ks012-8546-4da5-g6w0-8c3cb76dd930/resourceGroups/yl-arc/providers/Microsoft.Kubernetes/ConnectedClusters/yl-arc/providers/Microsoft.KubernetesConfiguration/extensions/exampleid")
                    .withVideoId("07ec9e38d4")
                    .withTokenLifetimeInSeconds(3600),
                com.azure.core.util.Context.NONE);
    }
}
```

### Generate_RestrictedViewerAccessToken

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViOperationsList.json
     */
    /**
     * Sample code: List operations.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void listOperations(com.azure.resourcemanager.vi.ViManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for PrivateEndpointConnections Get.
 */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/PrivateEndpointConnections/
     * PrivateEndpointConnection_Get.json
     */
    /**
     * Sample code: PrivateEndpointConnectionGet.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void privateEndpointConnectionGet(com.azure.resourcemanager.vi.ViManager manager) {
        manager.privateEndpointConnections()
            .getWithResponse("test-rg", "contoso", "peexample01", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_CreateOrUpdate

```java
/**
 * Samples for PrivateEndpointConnections ListByAccount.
 */
public final class PrivateEndpointConnectionsListByAccountSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/PrivateEndpointConnections/
     * PrivateEndpointConnection_ListByAccount.json
     */
    /**
     * Sample code: PrivateEndpointConnectionList.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void privateEndpointConnectionList(com.azure.resourcemanager.vi.ViManager manager) {
        manager.privateEndpointConnections().listByAccount("test-rg", "contoso", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Delete

```java
/**
 * Samples for PrivateEndpointConnections Delete.
 */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/PrivateEndpointConnections/
     * PrivateEndpointConnection_Delete.json
     */
    /**
     * Sample code: PrivateEndpointConnectionDelete.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void privateEndpointConnectionDelete(com.azure.resourcemanager.vi.ViManager manager) {
        manager.privateEndpointConnections()
            .delete("test-rg", "contoso", "peexample01", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
/**
 * Samples for Accounts GetByResourceGroup.
 */
public final class AccountsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/ViAccountGet.json
     */
    /**
     * Sample code: Get account.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void getAccount(com.azure.resourcemanager.vi.ViManager manager) {
        manager.accounts()
            .getByResourceGroupWithResponse("contoso-rg", "contosto-videoanalyzer", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_ListByAccount

```java
import com.azure.resourcemanager.vi.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.vi.models.PrivateLinkServiceConnectionState;

/**
 * Samples for PrivateEndpointConnections CreateOrUpdate.
 */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/PrivateEndpointConnections/
     * PrivateEndpointConnection_CreateOrUpdate.json
     */
    /**
     * Sample code: PrivateEndpointConnectionCreateOrUpdate.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void privateEndpointConnectionCreateOrUpdate(com.azure.resourcemanager.vi.ViManager manager) {
        manager.privateEndpointConnections()
            .define("peexample01")
            .withExistingAccount("test-rg", "contoso")
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                    .withDescription("Auto-Approved"))
            .create();
    }
}
```

### PrivateLinkResources_Get

```java
/**
 * Samples for PrivateLinkResources ListByAccount.
 */
public final class PrivateLinkResourcesListByAccountSamples {
    /*
     * x-ms-original-file:
     * specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/PrivateLinkResources/
     * PrivateLinkResources_ListByAccount.json
     */
    /**
     * Sample code: PrivateLinkResourcesList.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void privateLinkResourcesList(com.azure.resourcemanager.vi.ViManager manager) {
        manager.privateLinkResources().listByAccount("test-rg", "contoso", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_ListByAccount

```java
import com.azure.resourcemanager.vi.models.AccountCheckNameAvailabilityParameters;
import com.azure.resourcemanager.vi.models.Type;

/**
 * Samples for Accounts CheckNameAvailability.
 */
public final class AccountsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/
     * ViAccountCheckNameAvailabilityFree.json
     */
    /**
     * Sample code: Check free account name availability.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void checkFreeAccountNameAvailability(com.azure.resourcemanager.vi.ViManager manager) {
        manager.accounts()
            .checkNameAvailabilityWithResponse(new AccountCheckNameAvailabilityParameters().withName("vi1")
                .withType(Type.MICROSOFT_VIDEO_INDEXER_ACCOUNTS), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/vi/resource-manager/Microsoft.VideoIndexer/stable/2025-04-01/examples/
     * ViAccountCheckNameAvailabilityTaken.json
     */
    /**
     * Sample code: Check taken account name availability.
     * 
     * @param manager Entry point to ViManager.
     */
    public static void checkTakenAccountNameAvailability(com.azure.resourcemanager.vi.ViManager manager) {
        manager.accounts()
            .checkNameAvailabilityWithResponse(new AccountCheckNameAvailabilityParameters().withName("vi1")
                .withType(Type.MICROSOFT_VIDEO_INDEXER_ACCOUNTS), com.azure.core.util.Context.NONE);
    }
}
```

