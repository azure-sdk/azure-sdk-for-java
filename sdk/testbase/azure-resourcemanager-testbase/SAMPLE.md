# Code snippets and samples


## ActionRequestsOperation

- [Delete](#actionrequestsoperation_delete)
- [Get](#actionrequestsoperation_get)
- [List](#actionrequestsoperation_list)
- [Put](#actionrequestsoperation_put)

## AnalysisResults

- [Get](#analysisresults_get)
- [List](#analysisresults_list)

## AvailableInplaceUpgradeOS

- [Get](#availableinplaceupgradeos_get)
- [List](#availableinplaceupgradeos_list)

## AvailableOS

- [Get](#availableos_get)
- [List](#availableos_list)

## BillingHubService

- [GetFreeHourBalance](#billinghubservice_getfreehourbalance)
- [GetUsage](#billinghubservice_getusage)

## ChatSessionOperation

- [Chat](#chatsessionoperation_chat)

## ChatSessions

- [Get](#chatsessions_get)
- [List](#chatsessions_list)

## Credential

- [Get](#credential_get)
- [ListByTestBaseAccount](#credential_listbytestbaseaccount)

## CredentialsOperation

- [Create](#credentialsoperation_create)
- [Delete](#credentialsoperation_delete)

## CustomImages

- [CheckImageNameAvailability](#customimages_checkimagenameavailability)
- [Create](#customimages_create)
- [Delete](#customimages_delete)
- [Get](#customimages_get)
- [ListByTestBaseAccount](#customimages_listbytestbaseaccount)

## CustomerEvents

- [Create](#customerevents_create)
- [Delete](#customerevents_delete)
- [Get](#customerevents_get)
- [ListByTestBaseAccount](#customerevents_listbytestbaseaccount)

## DraftPackages

- [CopyFromPackage](#draftpackages_copyfrompackage)
- [Create](#draftpackages_create)
- [Delete](#draftpackages_delete)
- [ExtractFile](#draftpackages_extractfile)
- [GenerateFoldersAndScripts](#draftpackages_generatefoldersandscripts)
- [Get](#draftpackages_get)
- [GetPath](#draftpackages_getpath)
- [ListByTestBaseAccount](#draftpackages_listbytestbaseaccount)
- [Update](#draftpackages_update)

## EmailEvents

- [Get](#emailevents_get)
- [List](#emailevents_list)

## FavoriteProcesses

- [Create](#favoriteprocesses_create)
- [Delete](#favoriteprocesses_delete)
- [Get](#favoriteprocesses_get)
- [List](#favoriteprocesses_list)

## FeatureUpdateSupportedOses

- [List](#featureupdatesupportedoses_list)

## FirstPartyApps

- [Get](#firstpartyapps_get)
- [List](#firstpartyapps_list)

## FlightingRings

- [Get](#flightingrings_get)
- [List](#flightingrings_list)

## FreeHourBalances

- [Get](#freehourbalances_get)
- [List](#freehourbalances_list)

## GalleryAppSkus

- [Get](#galleryappskus_get)
- [List](#galleryappskus_list)

## GalleryApps

- [Get](#galleryapps_get)
- [List](#galleryapps_list)

## ImageDefinitions

- [Create](#imagedefinitions_create)
- [Delete](#imagedefinitions_delete)
- [Get](#imagedefinitions_get)
- [ListByTestBaseAccount](#imagedefinitions_listbytestbaseaccount)

## OSUpdates

- [Get](#osupdates_get)
- [List](#osupdates_list)

## Operations

- [List](#operations_list)

## Packages

- [Create](#packages_create)
- [Delete](#packages_delete)
- [Get](#packages_get)
- [GetDownloadUrl](#packages_getdownloadurl)
- [HardDelete](#packages_harddelete)
- [ListByTestBaseAccount](#packages_listbytestbaseaccount)
- [RunTest](#packages_runtest)
- [Update](#packages_update)

## Skus

- [List](#skus_list)

## TestBaseAccounts

- [CheckPackageNameAvailability](#testbaseaccounts_checkpackagenameavailability)
- [Create](#testbaseaccounts_create)
- [Delete](#testbaseaccounts_delete)
- [GetByResourceGroup](#testbaseaccounts_getbyresourcegroup)
- [GetFileUploadUrl](#testbaseaccounts_getfileuploadurl)
- [List](#testbaseaccounts_list)
- [ListByResourceGroup](#testbaseaccounts_listbyresourcegroup)
- [Offboard](#testbaseaccounts_offboard)
- [Update](#testbaseaccounts_update)

## TestResults

- [Get](#testresults_get)
- [GetConsoleLogDownloadUrl](#testresults_getconsolelogdownloadurl)
- [GetDownloadUrl](#testresults_getdownloadurl)
- [GetVideoDownloadUrl](#testresults_getvideodownloadurl)
- [List](#testresults_list)

## TestSummaries

- [Get](#testsummaries_get)
- [List](#testsummaries_list)

## TestTypes

- [Get](#testtypes_get)
- [List](#testtypes_list)

## Usage

- [List](#usage_list)

## VHDs

- [Delete](#vhds_delete)
- [Get](#vhds_get)
- [ListByTestBaseAccount](#vhds_listbytestbaseaccount)
### ActionRequestsOperation_Delete

```java
/**
 * Samples for ActionRequestsOperation Delete.
 */
public final class ActionRequestsOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/ActionRequestDelete.json
     */
    /**
     * Sample code: ActionRequestDelete.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void actionRequestDelete(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.actionRequestsOperations().deleteWithResponse("contoso-rg", "contoso-testBaseAccount", "167184141414254", com.azure.core.util.Context.NONE);
    }
}
```

### ActionRequestsOperation_Get

```java
/**
 * Samples for ActionRequestsOperation Get.
 */
public final class ActionRequestsOperationGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/ActionRequestGet.json
     */
    /**
     * Sample code: ActionRequestGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void actionRequestGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.actionRequestsOperations().getWithResponse("contoso-rg", "contoso-testBaseAccount", "167184141414254", com.azure.core.util.Context.NONE);
    }
}
```

### ActionRequestsOperation_List

```java
/**
 * Samples for ActionRequestsOperation List.
 */
public final class ActionRequestsOperationListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/ActionRequestList.json
     */
    /**
     * Sample code: ActionRequestList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void actionRequestList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.actionRequestsOperations().list("contoso-rg", "contoso-testBaseAccount", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### ActionRequestsOperation_Put

```java
/**
 * Samples for ActionRequestsOperation Put.
 */
public final class ActionRequestsOperationPutSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/ActionRequestPut.json
     */
    /**
     * Sample code: ActionRequestPut.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void actionRequestPut(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.actionRequestsOperations().define("167184141414254").withExistingTestBaseAccount("contoso-rg", "contoso-testBaseAccount").create();
    }
}
```

### AnalysisResults_Get

```java
import com.azure.resourcemanager.testbase.models.AnalysisResultName;
import java.util.stream.Collectors;

/**
 * Samples for AnalysisResults Get.
 */
public final class AnalysisResultsGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/MemoryUtilizationAnalysisResultGet.json
     */
    /**
     * Sample code: MemoryUtilizationAnalysisResultGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void memoryUtilizationAnalysisResultGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.analysisResults().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-Test-Id", AnalysisResultName.MEMORY_UTILIZATION, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CPURegressionAnalysisResultGet.json
     */
    /**
     * Sample code: CPURegressionAnalysisResultGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void cPURegressionAnalysisResultGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.analysisResults().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-Test-Id", AnalysisResultName.CPU_REGRESSION, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/ScriptExecutionAnalysisResultGet.json
     */
    /**
     * Sample code: ScriptExecutionAnalysisResultGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void scriptExecutionAnalysisResultGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.analysisResults().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-Test-Id", AnalysisResultName.SCRIPT_EXECUTION, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CPUUtilizationAnalysisResultGet.json
     */
    /**
     * Sample code: CPUUtilizationAnalysisResultGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void cPUUtilizationAnalysisResultGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.analysisResults().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-Test-Id", AnalysisResultName.CPU_UTILIZATION, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/MemoryRegressionAnalysisResultGet.json
     */
    /**
     * Sample code: MemoryRegressionAnalysisResultGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void memoryRegressionAnalysisResultGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.analysisResults().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-Test-Id", AnalysisResultName.MEMORY_REGRESSION, com.azure.core.util.Context.NONE);
    }
}
```

### AnalysisResults_List

```java
import com.azure.resourcemanager.testbase.models.AnalysisResultType;
import java.util.stream.Collectors;

/**
 * Samples for AnalysisResults List.
 */
public final class AnalysisResultsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/MemoryRegressionAnalysisResultsList.json
     */
    /**
     * Sample code: MemoryRegressionAnalysisResultsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void memoryRegressionAnalysisResultsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.analysisResults().list("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-Test-Id", AnalysisResultType.MEMORY_REGRESSION, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/ScriptExecutionAnalysisResultsList.json
     */
    /**
     * Sample code: ScriptExecutionAnalysisResultsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void scriptExecutionAnalysisResultsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.analysisResults().list("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-Test-Id", AnalysisResultType.SCRIPT_EXECUTION, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CPUUtilizationAnalysisResultsList.json
     */
    /**
     * Sample code: CPUUtilizationAnalysisResultsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void cPUUtilizationAnalysisResultsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.analysisResults().list("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-Test-Id", AnalysisResultType.CPUUTILIZATION, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/MemoryUtilizationAnalysisResultsList.json
     */
    /**
     * Sample code: MemoryUtilizationAnalysisResultsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void memoryUtilizationAnalysisResultsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.analysisResults().list("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-Test-Id", AnalysisResultType.MEMORY_UTILIZATION, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CPURegressionAnalysisResultsList.json
     */
    /**
     * Sample code: CPURegressionAnalysisResultsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void cPURegressionAnalysisResultsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.analysisResults().list("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-Test-Id", AnalysisResultType.CPUREGRESSION, com.azure.core.util.Context.NONE);
    }
}
```

### AvailableInplaceUpgradeOS_Get

```java
/**
 * Samples for AvailableInplaceUpgradeOS Get.
 */
public final class AvailableInplaceUpgradeOSGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/AvailableInplaceUpgradeOSGet.json
     */
    /**
     * Sample code: AvailableInplaceUpgradeOSGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void availableInplaceUpgradeOSGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.availableInplaceUpgradeOS().getWithResponse("contoso-rg", "contoso-testBaseAccount", "Windows-10-1903", com.azure.core.util.Context.NONE);
    }
}
```

### AvailableInplaceUpgradeOS_List

```java
import com.azure.resourcemanager.testbase.models.OsUpdateType;
import java.util.stream.Collectors;

/**
 * Samples for AvailableInplaceUpgradeOS List.
 */
public final class AvailableInplaceUpgradeOSListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/AvailableInplaceUpgradeOSList.json
     */
    /**
     * Sample code: AvailableInplaceUpgradeOSList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void availableInplaceUpgradeOSList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.availableInplaceUpgradeOS().list("contoso-rg", "contoso-testBaseAccount", null, com.azure.core.util.Context.NONE);
    }
}
```

### AvailableOS_Get

```java
/**
 * Samples for AvailableOS Get.
 */
public final class AvailableOSGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/AvailableOSGet.json
     */
    /**
     * Sample code: AvailableOSGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void availableOSGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.availableOS().getWithResponse("contoso-rg", "contoso-testBaseAccount", "Windows-10-2004", com.azure.core.util.Context.NONE);
    }
}
```

### AvailableOS_List

```java
import com.azure.resourcemanager.testbase.models.OsUpdateType;
import java.util.stream.Collectors;

/**
 * Samples for AvailableOS List.
 */
public final class AvailableOSListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/AvailableOSsList.json
     */
    /**
     * Sample code: AvailableOSsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void availableOSsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.availableOS().list("contoso-rg", "contoso-testBaseAccount", OsUpdateType.SECURITY_UPDATE, com.azure.core.util.Context.NONE);
    }
}
```

### BillingHubService_GetFreeHourBalance

```java
/**
 * Samples for BillingHubService GetFreeHourBalance.
 */
public final class BillingHubServiceGetFreeHourBalanceSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/BillingHubGetFreeHourBalance.json
     */
    /**
     * Sample code: BillingHubGetFreeHourBalance.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void billingHubGetFreeHourBalance(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.billingHubServices().getFreeHourBalanceWithResponse("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### BillingHubService_GetUsage

```java
import com.azure.resourcemanager.testbase.models.BillingHubGetUsageRequest;

/**
 * Samples for BillingHubService GetUsage.
 */
public final class BillingHubServiceGetUsageSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/BillingHubGetUsage.json
     */
    /**
     * Sample code: BillingHubGetUsage.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void billingHubGetUsage(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.billingHubServices().getUsageWithResponse("contoso-rg1", "contoso-testBaseAccount1", null, com.azure.core.util.Context.NONE);
    }
}
```

### ChatSessionOperation_Chat

```java
import com.azure.resourcemanager.testbase.models.ChatRequest;

/**
 * Samples for ChatSessionOperation Chat.
 */
public final class ChatSessionOperationChatSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/ChatSessionChat.json
     */
    /**
     * Sample code: ChatSessionChat.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void chatSessionChat(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.chatSessionOperations().chat("contoso-rg1", "contoso-testBaseAccount1", "e7520e9c-4017-4a92-aff2-d168670bb8ba", new ChatRequest().withQuestion("What is Test Base for Microsoft 365?"), com.azure.core.util.Context.NONE);
    }
}
```

### ChatSessions_Get

```java
/**
 * Samples for ChatSessions Get.
 */
public final class ChatSessionsGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/ChatSessionGet.json
     */
    /**
     * Sample code: ChatSessionGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void chatSessionGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.chatSessions().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "e7520e9c-4017-4a92-aff2-d168670bb8ba", com.azure.core.util.Context.NONE);
    }
}
```

### ChatSessions_List

```java
/**
 * Samples for ChatSessions List.
 */
public final class ChatSessionsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/ChatSessionList.json
     */
    /**
     * Sample code: ChatSessionList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void chatSessionList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.chatSessions().list("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### Credential_Get

```java
/**
 * Samples for Credential Get.
 */
public final class CredentialGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CredentialGet.json
     */
    /**
     * Sample code: CredentialGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void credentialGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.credentials().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-credential", com.azure.core.util.Context.NONE);
    }
}
```

### Credential_ListByTestBaseAccount

```java
/**
 * Samples for Credential ListByTestBaseAccount.
 */
public final class CredentialListByTestBaseAccountSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CredentialsList.json
     */
    /**
     * Sample code: CustomImagesList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void customImagesList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.credentials().listByTestBaseAccount("contoso-rg", "contoso-testBaseAccount", com.azure.core.util.Context.NONE);
    }
}
```

### CredentialsOperation_Create

```java
import com.azure.resourcemanager.testbase.models.IntuneSingletonResourceProperties;

/**
 * Samples for CredentialsOperation Create.
 */
public final class CredentialsOperationCreateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CredentialCreate.json
     */
    /**
     * Sample code: ImageDefinitionCreate.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void imageDefinitionCreate(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.credentialsOperations().define("contoso-credential").withExistingTestBaseAccount("contoso-rg1", "contoso-testBaseAccount1").withProperties(new IntuneSingletonResourceProperties().withDisplayName("contoso-credential").withUsernameKeyVaultSecretPath("fakeTokenPlaceholder").withPasswordKeyVaultSecretPath("fakeTokenPlaceholder")).create();
    }
}
```

### CredentialsOperation_Delete

```java
/**
 * Samples for CredentialsOperation Delete.
 */
public final class CredentialsOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CredentialDelete.json
     */
    /**
     * Sample code: DraftPackageDelete.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void draftPackageDelete(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.credentialsOperations().deleteWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-credential", com.azure.core.util.Context.NONE);
    }
}
```

### CustomImages_CheckImageNameAvailability

```java
import com.azure.resourcemanager.testbase.models.ImageNameCheckAvailabilityParameters;

/**
 * Samples for CustomImages CheckImageNameAvailability.
 */
public final class CustomImagesCheckImageNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CheckImageNameAvailability.json
     */
    /**
     * Sample code: CheckImageAvailability.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void checkImageAvailability(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.customImages().checkImageNameAvailabilityWithResponse("contoso-rg1", "contoso-testBaseAccount1", new ImageNameCheckAvailabilityParameters().withDefinitionName("contoso-image-def").withVersionName("contoso-image-ver"), com.azure.core.util.Context.NONE);
    }
}
```

### CustomImages_Create

```java
import com.azure.resourcemanager.testbase.models.ImageSource;
import java.util.stream.Collectors;

/**
 * Samples for CustomImages Create.
 */
public final class CustomImagesCreateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CustomImageCreate.json
     */
    /**
     * Sample code: CustomImageCreate.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void customImageCreate(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.customImages().define("image-2cfb2edc-13bc-4d54-8d6e-38b2a233b003").withExistingTestBaseAccount("contoso-rg1", "contoso-testBaseAccount1").withVhdId("/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/contoso-rg1/providers/Microsoft.TestBase/testBaseAccounts/contoso-testBaseAccount1/VHDs/vhd-00ac3ccd-1503-4ee5-aa26-26569cfafe88").withDefinitionName("contoso-image-def").withVersionName("1.0.0").withSource(ImageSource.VHD).create();
    }
}
```

### CustomImages_Delete

```java
/**
 * Samples for CustomImages Delete.
 */
public final class CustomImagesDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CustomImageDelete.json
     */
    /**
     * Sample code: CustomImageDelete.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void customImageDelete(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.customImages().delete("contoso-rg1", "contoso-testBaseAccount1", "image-2cfb2edc-13bc-4d54-8d6e-38b2a233b003", com.azure.core.util.Context.NONE);
    }
}
```

### CustomImages_Get

```java
/**
 * Samples for CustomImages Get.
 */
public final class CustomImagesGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CustomImageGet.json
     */
    /**
     * Sample code: CustomImageGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void customImageGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.customImages().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "image-2cfb2edc-13bc-4d54-8d6e-38b2a233b003", com.azure.core.util.Context.NONE);
    }
}
```

### CustomImages_ListByTestBaseAccount

```java
/**
 * Samples for CustomImages ListByTestBaseAccount.
 */
public final class CustomImagesListByTestBaseAccountSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CustomImagesList.json
     */
    /**
     * Sample code: CustomImagesList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void customImagesList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.customImages().listByTestBaseAccount("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### CustomerEvents_Create

```java
import com.azure.resourcemanager.testbase.models.DistributionGroupListReceiverValue;
import com.azure.resourcemanager.testbase.models.NotificationEventReceiver;
import com.azure.resourcemanager.testbase.models.NotificationReceiverValue;
import com.azure.resourcemanager.testbase.models.UserObjectReceiverValue;
import java.util.Arrays;

/**
 * Samples for CustomerEvents Create.
 */
public final class CustomerEventsCreateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CustomerEventCreate.json
     */
    /**
     * Sample code: CustomerEventCreate.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void customerEventCreate(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.customerEvents().define("WeeklySummary").withExistingTestBaseAccount("contoso-rg1", "contoso-testBaseAccount1").withEventName("WeeklySummary").withReceivers(Arrays.asList(new NotificationEventReceiver().withReceiverType("UserObjects").withReceiverValue(new NotificationReceiverValue().withUserObjectReceiverValue(new UserObjectReceiverValue().withUserObjectIds(Arrays.asList("245245245245325", "365365365363565")))), new NotificationEventReceiver().withReceiverType("DistributionGroup").withReceiverValue(new NotificationReceiverValue().withDistributionGroupListReceiverValue(new DistributionGroupListReceiverValue().withDistributionGroups(Arrays.asList("test@microsoft.com")))))).create();
    }
}
```

### CustomerEvents_Delete

```java
/**
 * Samples for CustomerEvents Delete.
 */
public final class CustomerEventsDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CustomerEventDelete.json
     */
    /**
     * Sample code: CustomerEventDelete.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void customerEventDelete(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.customerEvents().delete("contoso-rg1", "contoso-testBaseAccount1", "WeeklySummary", com.azure.core.util.Context.NONE);
    }
}
```

### CustomerEvents_Get

```java
/**
 * Samples for CustomerEvents Get.
 */
public final class CustomerEventsGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CustomerEventGet.json
     */
    /**
     * Sample code: CustomerEventGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void customerEventGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.customerEvents().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "WeeklySummary", com.azure.core.util.Context.NONE);
    }
}
```

### CustomerEvents_ListByTestBaseAccount

```java
/**
 * Samples for CustomerEvents ListByTestBaseAccount.
 */
public final class CustomerEventsListByTestBaseAccountSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CustomerEventsList.json
     */
    /**
     * Sample code: CustomerEventsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void customerEventsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.customerEvents().listByTestBaseAccount("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### DraftPackages_CopyFromPackage

```java
import com.azure.resourcemanager.testbase.models.CopyFromPackageOperationParameters;

/**
 * Samples for DraftPackages CopyFromPackage.
 */
public final class DraftPackagesCopyFromPackageSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/DraftPackageCopyFromPackage.json
     */
    /**
     * Sample code: DraftPackageCopyFromPackage.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void draftPackageCopyFromPackage(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.draftPackages().copyFromPackage("contoso-rg", "contoso-testBaseAccount", "61d99543-14ff-47ae-bf03-8a8b8445502e", new CopyFromPackageOperationParameters().withPackageId("/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/contoso-rg/providers/Microsoft.TestBase/testBaseAccounts/contoso-testBaseAccount/packages/contoso-package"), com.azure.core.util.Context.NONE);
    }
}
```

### DraftPackages_Create

```java
import com.azure.resourcemanager.testbase.models.DraftPackageSourceType;
import java.util.stream.Collectors;

/**
 * Samples for DraftPackages Create.
 */
public final class DraftPackagesCreateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/DraftPackageCreate.json
     */
    /**
     * Sample code: DraftPackageCreate.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void draftPackageCreate(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.draftPackages().define("61d99543-14ff-47ae-bf03-8a8b8445502e").withExistingTestBaseAccount("contoso-rg1", "contoso-testBaseAccount1").withApplicationName("contoso-package").withVersion("1.0").withAppFileName("TestBaseM365DigitalClock.msi").withSourceType(DraftPackageSourceType.NATIVE).withUseSample(false).create();
    }
}
```

### DraftPackages_Delete

```java
/**
 * Samples for DraftPackages Delete.
 */
public final class DraftPackagesDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/DraftPackageDelete.json
     */
    /**
     * Sample code: DraftPackageDelete.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void draftPackageDelete(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.draftPackages().deleteWithResponse("contoso-rg", "contoso-testBaseAccount", "61d99543-14ff-47ae-bf03-8a8b8445502e", com.azure.core.util.Context.NONE);
    }
}
```

### DraftPackages_ExtractFile

```java
import com.azure.resourcemanager.testbase.models.ExtractFileOperationParameters;
import com.azure.resourcemanager.testbase.models.ExtractFileType;
import java.util.stream.Collectors;

/**
 * Samples for DraftPackages ExtractFile.
 */
public final class DraftPackagesExtractFileSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/DraftPackageExtractFile.json
     */
    /**
     * Sample code: DraftPackageExtractFile.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void draftPackageExtractFile(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.draftPackages().extractFile("contoso-rg", "contoso-testBaseAccount", "34070901-fc0b-4459-b6de-4295b7c7bf19", new ExtractFileOperationParameters().withFileType(ExtractFileType.INTUNE_WIN_PACKAGE).withSourceFile("bin/contoso.intunewin"), com.azure.core.util.Context.NONE);
    }
}
```

### DraftPackages_GenerateFoldersAndScripts

```java
import com.azure.resourcemanager.testbase.models.GenerateOperationParameters;

/**
 * Samples for DraftPackages GenerateFoldersAndScripts.
 */
public final class DraftPackagesGenerateFoldersAndScriptsSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/DraftPackageGenerateFoldersAndScripts.json
     */
    /**
     * Sample code: DraftPackageGenerate.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void draftPackageGenerate(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.draftPackages().generateFoldersAndScripts("contoso-rg", "contoso-testBaseAccount", "61d99543-14ff-47ae-bf03-8a8b8445502e", new GenerateOperationParameters().withForceGenerate(false), com.azure.core.util.Context.NONE);
    }
}
```

### DraftPackages_Get

```java
/**
 * Samples for DraftPackages Get.
 */
public final class DraftPackagesGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/DraftPackageGet.json
     */
    /**
     * Sample code: DraftPackageGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void draftPackageGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.draftPackages().getWithResponse("contoso-rg", "contoso-testBaseAccount", "61d99543-14ff-47ae-bf03-8a8b8445502e", com.azure.core.util.Context.NONE);
    }
}
```

### DraftPackages_GetPath

```java
/**
 * Samples for DraftPackages GetPath.
 */
public final class DraftPackagesGetPathSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/DraftPackageGetPath.json
     */
    /**
     * Sample code: DraftPackageGetPath.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void draftPackageGetPath(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.draftPackages().getPathWithResponse("contoso-rg", "contoso-testBaseAccount", "61d99543-14ff-47ae-bf03-8a8b8445502e", com.azure.core.util.Context.NONE);
    }
}
```

### DraftPackages_ListByTestBaseAccount

```java
/**
 * Samples for DraftPackages ListByTestBaseAccount.
 */
public final class DraftPackagesListByTestBaseAccountSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/DraftPackagesList.json
     */
    /**
     * Sample code: DraftPackagesList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void draftPackagesList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.draftPackages().listByTestBaseAccount("contoso-rg", "contoso-testBaseAccount", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### DraftPackages_Update

```java
import com.azure.resourcemanager.testbase.models.DraftPackageResource;
import com.azure.resourcemanager.testbase.models.TargetOSInfo;
import java.util.Arrays;

/**
 * Samples for DraftPackages Update.
 */
public final class DraftPackagesUpdateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/DraftPackageUpdate.json
     */
    /**
     * Sample code: DraftPackageUpdate.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void draftPackageUpdate(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        DraftPackageResource resource = manager.draftPackages().getWithResponse("contoso-rg", "contoso-testBaseAccount", "61d99543-14ff-47ae-bf03-8a8b8445502e", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTargetOSList(Arrays.asList(new TargetOSInfo().withOsUpdateType("Security updates").withTargetOSs(Arrays.asList("Windows 11 21H2", "Windows 10 21H2", "Windows 10 21H1")), new TargetOSInfo().withOsUpdateType("Feature updates").withTargetOSs(Arrays.asList("Windows 10 21H2")))).withFlightingRing("Insider Beta Channel").apply();
    }
}
```

### EmailEvents_Get

```java
/**
 * Samples for EmailEvents Get.
 */
public final class EmailEventsGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/EmailEventGet.json
     */
    /**
     * Sample code: EmailEventGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void emailEventGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.emailEvents().getWithResponse("contoso-rg", "contoso-testBaseAccount", "weekly-summary", com.azure.core.util.Context.NONE);
    }
}
```

### EmailEvents_List

```java
/**
 * Samples for EmailEvents List.
 */
public final class EmailEventsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/EmailEventsList.json
     */
    /**
     * Sample code: EmailEventsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void emailEventsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.emailEvents().list("contoso-rg", "contoso-testBaseAccount", com.azure.core.util.Context.NONE);
    }
}
```

### FavoriteProcesses_Create

```java
/**
 * Samples for FavoriteProcesses Create.
 */
public final class FavoriteProcessesCreateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/FavoriteProcessCreate.json
     */
    /**
     * Sample code: FavoriteProcessCreate.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void favoriteProcessCreate(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.favoriteProcesses().define("testAppProcess").withExistingPackage("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2").withActualProcessName("testApp&.exe").create();
    }
}
```

### FavoriteProcesses_Delete

```java
/**
 * Samples for FavoriteProcesses Delete.
 */
public final class FavoriteProcessesDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/FavoriteProcessDelete.json
     */
    /**
     * Sample code: FavoriteProcessDelete.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void favoriteProcessDelete(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.favoriteProcesses().deleteWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "testAppProcess", com.azure.core.util.Context.NONE);
    }
}
```

### FavoriteProcesses_Get

```java
/**
 * Samples for FavoriteProcesses Get.
 */
public final class FavoriteProcessesGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/FavoriteProcessGet.json
     */
    /**
     * Sample code: FavoriteProcessGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void favoriteProcessGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.favoriteProcesses().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "testAppProcess", com.azure.core.util.Context.NONE);
    }
}
```

### FavoriteProcesses_List

```java
/**
 * Samples for FavoriteProcesses List.
 */
public final class FavoriteProcessesListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/FavoriteProcessesList.json
     */
    /**
     * Sample code: FavoriteProcessesList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void favoriteProcessesList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.favoriteProcesses().list("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", com.azure.core.util.Context.NONE);
    }
}
```

### FeatureUpdateSupportedOses_List

```java
/**
 * Samples for FeatureUpdateSupportedOses List.
 */
public final class FeatureUpdateSupportedOsesListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/FeatureUpdateSupportedOsesList.json
     */
    /**
     * Sample code: FeatureUpdateSupportedOsesList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void featureUpdateSupportedOsesList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.featureUpdateSupportedOses().list("contoso-rg", "contoso-testBaseAccount", com.azure.core.util.Context.NONE);
    }
}
```

### FirstPartyApps_Get

```java
/**
 * Samples for FirstPartyApps Get.
 */
public final class FirstPartyAppsGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/FirstPartyAppGet.json
     */
    /**
     * Sample code: FirstPartyAppsGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void firstPartyAppsGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.firstPartyApps().getWithResponse("contoso-rg", "contoso-testBaseAccount", "firstPartyApp-fe51c56c-5dc0-499b-a807-a9d7746b34ae", com.azure.core.util.Context.NONE);
    }
}
```

### FirstPartyApps_List

```java
/**
 * Samples for FirstPartyApps List.
 */
public final class FirstPartyAppsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/FirstPartyAppsList.json
     */
    /**
     * Sample code: FirstPartyAppsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void firstPartyAppsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.firstPartyApps().list("contoso-rg", "contoso-testBaseAccount", com.azure.core.util.Context.NONE);
    }
}
```

### FlightingRings_Get

```java
/**
 * Samples for FlightingRings Get.
 */
public final class FlightingRingsGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/FlightingRingGet.json
     */
    /**
     * Sample code: FlightingRingGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void flightingRingGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.flightingRings().getWithResponse("contoso-rg", "contoso-testBaseAccount", "Insider-Beta-Channel", com.azure.core.util.Context.NONE);
    }
}
```

### FlightingRings_List

```java
/**
 * Samples for FlightingRings List.
 */
public final class FlightingRingsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/FlightingRingsList.json
     */
    /**
     * Sample code: FlightingRingsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void flightingRingsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.flightingRings().list("contoso-rg", "contoso-testBaseAccount", com.azure.core.util.Context.NONE);
    }
}
```

### FreeHourBalances_Get

```java
import com.azure.resourcemanager.testbase.models.FreeHourBalanceName;
import java.util.stream.Collectors;

/**
 * Samples for FreeHourBalances Get.
 */
public final class FreeHourBalancesGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/FreeHourBalanceGet.json
     */
    /**
     * Sample code: FreeHourBalanceGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void freeHourBalanceGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.freeHourBalances().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", FreeHourBalanceName.TENANT_LEVEL, com.azure.core.util.Context.NONE);
    }
}
```

### FreeHourBalances_List

```java
/**
 * Samples for FreeHourBalances List.
 */
public final class FreeHourBalancesListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/FreeHourBalancesList.json
     */
    /**
     * Sample code: FreeHourBalancesList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void freeHourBalancesList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.freeHourBalances().list("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### GalleryAppSkus_Get

```java
/**
 * Samples for GalleryAppSkus Get.
 */
public final class GalleryAppSkusGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/GalleryAppSkuGet.json
     */
    /**
     * Sample code: GalleryAppsSkuGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void galleryAppsSkuGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.galleryAppSkus().getWithResponse("contoso-rg", "contoso-testBaseAccount", "fe51c56c-5dc0-499b-a807-a9d7746b34ae", "ec898a20-df1e-4483-83e7-4bb37bb77385", com.azure.core.util.Context.NONE);
    }
}
```

### GalleryAppSkus_List

```java
/**
 * Samples for GalleryAppSkus List.
 */
public final class GalleryAppSkusListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/GalleryAppsSkusList.json
     */
    /**
     * Sample code: GalleryAppSkusList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void galleryAppSkusList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.galleryAppSkus().list("contoso-rg", "contoso-testBaseAccount", "fe51c56c-5dc0-499b-a807-a9d7746b34ae", com.azure.core.util.Context.NONE);
    }
}
```

### GalleryApps_Get

```java
/**
 * Samples for GalleryApps Get.
 */
public final class GalleryAppsGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/GalleryAppGet.json
     */
    /**
     * Sample code: GalleryAppsGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void galleryAppsGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.galleryApps().getWithResponse("contoso-rg", "contoso-testBaseAccount", "fe51c56c-5dc0-499b-a807-a9d7746b34ae", com.azure.core.util.Context.NONE);
    }
}
```

### GalleryApps_List

```java
import com.azure.resourcemanager.testbase.models.ApplicationType;
import com.azure.resourcemanager.testbase.models.OrderBy;
import java.util.stream.Collectors;

/**
 * Samples for GalleryApps List.
 */
public final class GalleryAppsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/GalleryAppsList.json
     */
    /**
     * Sample code: GalleryAppsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void galleryAppsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.galleryApps().list("contoso-rg", "contoso-testBaseAccount", "office", ApplicationType.WINGET, OrderBy.RELEVANCE, 2, com.azure.core.util.Context.NONE);
    }
}
```

### ImageDefinitions_Create

```java
import com.azure.resourcemanager.testbase.models.ImageArchitecture;
import com.azure.resourcemanager.testbase.models.ImageOSState;
import com.azure.resourcemanager.testbase.models.ImageSecurityType;
import java.util.stream.Collectors;

/**
 * Samples for ImageDefinitions Create.
 */
public final class ImageDefinitionsCreateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/ImageDefinitionCreate.json
     */
    /**
     * Sample code: ImageDefinitionCreate.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void imageDefinitionCreate(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.imageDefinitions().define("contoso-image-def").withExistingTestBaseAccount("contoso-rg1", "contoso-testBaseAccount1").withArchitecture(ImageArchitecture.X64).withOsState(ImageOSState.GENERALIZED).withSecurityType(ImageSecurityType.STANDARD).create();
    }
}
```

### ImageDefinitions_Delete

```java
/**
 * Samples for ImageDefinitions Delete.
 */
public final class ImageDefinitionsDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/ImageDefinitionDelete.json
     */
    /**
     * Sample code: ImageDefinitionDelete.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void imageDefinitionDelete(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.imageDefinitions().deleteWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-image-def", com.azure.core.util.Context.NONE);
    }
}
```

### ImageDefinitions_Get

```java
/**
 * Samples for ImageDefinitions Get.
 */
public final class ImageDefinitionsGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/ImageDefinitionGet.json
     */
    /**
     * Sample code: ImageDefinitionGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void imageDefinitionGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.imageDefinitions().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-image-def", com.azure.core.util.Context.NONE);
    }
}
```

### ImageDefinitions_ListByTestBaseAccount

```java
/**
 * Samples for ImageDefinitions ListByTestBaseAccount.
 */
public final class ImageDefinitionsListByTestBaseAccountSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/ImageDefinitionsList.json
     */
    /**
     * Sample code: ListImageDefinitions.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void listImageDefinitions(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.imageDefinitions().listByTestBaseAccount("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### OSUpdates_Get

```java
/**
 * Samples for OSUpdates Get.
 */
public final class OSUpdatesGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/OSUpdateGet.json
     */
    /**
     * Sample code: OSUpdateGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void oSUpdateGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.oSUpdates().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-2004-2020-12-B-505", com.azure.core.util.Context.NONE);
    }
}
```

### OSUpdates_List

```java
import com.azure.resourcemanager.testbase.models.OsUpdateType;
import java.util.stream.Collectors;

/**
 * Samples for OSUpdates List.
 */
public final class OSUpdatesListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/OSUpdatesList.json
     */
    /**
     * Sample code: OSUpdatesList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void oSUpdatesList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.oSUpdates().list("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", OsUpdateType.SECURITY_UPDATE, com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/OperationsList.json
     */
    /**
     * Sample code: OperationsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void operationsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Packages_Create

```java
import com.azure.resourcemanager.testbase.models.Action;
import com.azure.resourcemanager.testbase.models.Architecture;
import com.azure.resourcemanager.testbase.models.Command;
import com.azure.resourcemanager.testbase.models.ContentType;
import com.azure.resourcemanager.testbase.models.FirstPartyAppDefinition;
import com.azure.resourcemanager.testbase.models.InteropExecutionMode;
import com.azure.resourcemanager.testbase.models.TargetOSInfo;
import com.azure.resourcemanager.testbase.models.Test;
import com.azure.resourcemanager.testbase.models.TestType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for Packages Create.
 */
public final class PackagesCreateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/PackageCreate.json
     */
    /**
     * Sample code: PackageCreate.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void packageCreate(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.packages().define("contoso-package2").withRegion("westus").withExistingTestBaseAccount("contoso-rg1", "contoso-testBaseAccount1").withTags(mapOf()).withApplicationName("contoso-package2").withVersion("1.0.0").withBlobPath("storageAccountPath/package.zip").withTargetOSList(Arrays.asList(new TargetOSInfo().withOsUpdateType("Security updates").withTargetOSs(Arrays.asList("Windows 10 2004", "Windows 10 1903")))).withFlightingRing("Insider Beta Channel").withFirstPartyApps(Arrays.asList(new FirstPartyAppDefinition().withName("Office").withArchitecture(Architecture.X64).withChannel("Current Channel").withRing("Insider").withInteropExecutionMode(InteropExecutionMode.FIRST_PARTY_APP_WITH_TESTS))).withTests(Arrays.asList(new Test().withTestType(TestType.OUT_OF_BOX_TEST).withIsActive(true).withCommands(Arrays.asList(new Command().withName("Install").withAction(Action.INSTALL).withContentType(ContentType.PATH).withContent("app/scripts/install/job.ps1").withRunElevated(true).withRestartAfter(true).withMaxRunTime(1800).withRunAsInteractive(true).withAlwaysRun(true).withApplyUpdateBefore(false).withInstall1PAppBefore(true), new Command().withName("Launch").withAction(Action.LAUNCH).withContentType(ContentType.PATH).withContent("app/scripts/launch/job.ps1").withRunElevated(true).withRestartAfter(false).withMaxRunTime(1800).withRunAsInteractive(true).withAlwaysRun(false).withApplyUpdateBefore(true).withInstall1PAppBefore(false), new Command().withName("Close").withAction(Action.CLOSE).withContentType(ContentType.PATH).withContent("app/scripts/close/job.ps1").withRunElevated(true).withRestartAfter(false).withMaxRunTime(1800).withRunAsInteractive(true).withAlwaysRun(false).withApplyUpdateBefore(false).withInstall1PAppBefore(false), new Command().withName("Uninstall").withAction(Action.UNINSTALL).withContentType(ContentType.PATH).withContent("app/scripts/uninstall/job.ps1").withRunElevated(true).withRestartAfter(false).withMaxRunTime(1800).withRunAsInteractive(true).withAlwaysRun(true).withApplyUpdateBefore(false).withInstall1PAppBefore(false))))).create();
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

### Packages_Delete

```java
/**
 * Samples for Packages Delete.
 */
public final class PackagesDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/PackageDelete.json
     */
    /**
     * Sample code: PackageDelete.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void packageDelete(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.packages().delete("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", com.azure.core.util.Context.NONE);
    }
}
```

### Packages_Get

```java
/**
 * Samples for Packages Get.
 */
public final class PackagesGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/PackageGet.json
     */
    /**
     * Sample code: PackageGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void packageGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.packages().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", com.azure.core.util.Context.NONE);
    }
}
```

### Packages_GetDownloadUrl

```java
/**
 * Samples for Packages GetDownloadUrl.
 */
public final class PackagesGetDownloadUrlSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/PackageGetDownloadURL.json
     */
    /**
     * Sample code: PackageGetDownloadURL.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void packageGetDownloadURL(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.packages().getDownloadUrlWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", com.azure.core.util.Context.NONE);
    }
}
```

### Packages_HardDelete

```java
/**
 * Samples for Packages HardDelete.
 */
public final class PackagesHardDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/PackageHardDelete.json
     */
    /**
     * Sample code: PackageHardDelete.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void packageHardDelete(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.packages().hardDelete("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", com.azure.core.util.Context.NONE);
    }
}
```

### Packages_ListByTestBaseAccount

```java
/**
 * Samples for Packages ListByTestBaseAccount.
 */
public final class PackagesListByTestBaseAccountSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/PackagesList.json
     */
    /**
     * Sample code: PackagesList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void packagesList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.packages().listByTestBaseAccount("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### Packages_RunTest

```java
import com.azure.resourcemanager.testbase.models.OsUpdateType;
import com.azure.resourcemanager.testbase.models.PackageRunTestParameters;
import com.azure.resourcemanager.testbase.models.TestType;
import java.util.stream.Collectors;

/**
 * Samples for Packages RunTest.
 */
public final class PackagesRunTestSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/PackageRunTest.json
     */
    /**
     * Sample code: PackageRunTest.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void packageRunTest(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.packages().runTestWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", new PackageRunTestParameters().withTestType(TestType.OUT_OF_BOX_TEST).withOsUpdateType(OsUpdateType.SECURITY_UPDATE).withOsName("Windows 10 21H1").withReleaseName("2021.05 B"), com.azure.core.util.Context.NONE);
    }
}
```

### Packages_Update

```java
import com.azure.resourcemanager.testbase.models.Action;
import com.azure.resourcemanager.testbase.models.Architecture;
import com.azure.resourcemanager.testbase.models.Command;
import com.azure.resourcemanager.testbase.models.ContentType;
import com.azure.resourcemanager.testbase.models.FirstPartyAppDefinition;
import com.azure.resourcemanager.testbase.models.InteropExecutionMode;
import com.azure.resourcemanager.testbase.models.PackageResource;
import com.azure.resourcemanager.testbase.models.TargetOSInfo;
import com.azure.resourcemanager.testbase.models.Test;
import com.azure.resourcemanager.testbase.models.TestType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for Packages Update.
 */
public final class PackagesUpdateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/PackageUpdate.json
     */
    /**
     * Sample code: PackageUpdate.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void packageUpdate(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        PackageResource resource = manager.packages().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf()).withIsEnabled(false).withBlobPath("storageAccountPath/package.zip").withTargetOSList(Arrays.asList(new TargetOSInfo().withOsUpdateType("Security updates").withTargetOSs(Arrays.asList("Windows 10 2004", "Windows 10 1903")))).withFlightingRing("Insider Beta Channel").withFirstPartyApps(Arrays.asList(new FirstPartyAppDefinition().withName("Office").withArchitecture(Architecture.X64).withChannel("Current Channel").withRing("Insider").withInteropExecutionMode(InteropExecutionMode.FIRST_PARTY_APP_WITH_TESTS))).withTests(Arrays.asList(new Test().withTestType(TestType.OUT_OF_BOX_TEST).withIsActive(true).withCommands(Arrays.asList(new Command().withName("Install").withAction(Action.INSTALL).withContentType(ContentType.PATH).withContent("app/scripts/install/job.ps1").withRunElevated(true).withRestartAfter(true).withMaxRunTime(1800).withRunAsInteractive(true).withAlwaysRun(true).withApplyUpdateBefore(false).withInstall1PAppBefore(true), new Command().withName("Launch").withAction(Action.LAUNCH).withContentType(ContentType.PATH).withContent("app/scripts/launch/job.ps1").withRunElevated(true).withRestartAfter(false).withMaxRunTime(1800).withRunAsInteractive(true).withAlwaysRun(false).withApplyUpdateBefore(true).withInstall1PAppBefore(false), new Command().withName("Close").withAction(Action.CLOSE).withContentType(ContentType.PATH).withContent("app/scripts/close/job.ps1").withRunElevated(true).withRestartAfter(false).withMaxRunTime(1800).withRunAsInteractive(true).withAlwaysRun(false).withApplyUpdateBefore(false).withInstall1PAppBefore(false), new Command().withName("Uninstall").withAction(Action.UNINSTALL).withContentType(ContentType.PATH).withContent("app/scripts/uninstall/job.ps1").withRunElevated(true).withRestartAfter(false).withMaxRunTime(1800).withRunAsInteractive(true).withAlwaysRun(true).withApplyUpdateBefore(false).withInstall1PAppBefore(false))))).apply();
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

### Skus_List

```java
/**
 * Samples for Skus List.
 */
public final class SkusListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestBaseAccountSKUsList.json
     */
    /**
     * Sample code: TestBaseAccountSKUsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testBaseAccountSKUsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.skus().list(com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccounts_CheckPackageNameAvailability

```java
import com.azure.resourcemanager.testbase.models.PackageCheckNameAvailabilityParameters;

/**
 * Samples for TestBaseAccounts CheckPackageNameAvailability.
 */
public final class TestBaseAccountsCheckPackageNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/CheckPackageNameAvailability.json
     */
    /**
     * Sample code: CheckPackageNameAvailability.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void checkPackageNameAvailability(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testBaseAccounts().checkPackageNameAvailabilityWithResponse("contoso-rg1", "contoso-testBaseAccount1", new PackageCheckNameAvailabilityParameters().withName("testApp").withApplicationName("testApp").withVersion("1.0.0").withType("Microsoft.TestBase/testBaseAccounts/packages"), com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccounts_Create

```java
import com.azure.resourcemanager.testbase.fluent.models.TestBaseAccountSkuInner;
import com.azure.resourcemanager.testbase.models.Tier;
import java.util.stream.Collectors;

/**
 * Samples for TestBaseAccounts Create.
 */
public final class TestBaseAccountsCreateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestBaseAccountCreate.json
     */
    /**
     * Sample code: TestBaseAccountCreate.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testBaseAccountCreate(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testBaseAccounts().define("contoso-testBaseAccount1").withRegion("westus").withExistingResourceGroup("contoso-rg1").withSku(new TestBaseAccountSkuInner().withName("S0").withTier(Tier.STANDARD)).create();
    }
}
```

### TestBaseAccounts_Delete

```java
/**
 * Samples for TestBaseAccounts Delete.
 */
public final class TestBaseAccountsDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestBaseAccountDelete.json
     */
    /**
     * Sample code: TestBaseAccountDelete.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testBaseAccountDelete(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testBaseAccounts().delete("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccounts_GetByResourceGroup

```java
/**
 * Samples for TestBaseAccounts GetByResourceGroup.
 */
public final class TestBaseAccountsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestBaseAccountGet.json
     */
    /**
     * Sample code: TestBaseAccountGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testBaseAccountGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testBaseAccounts().getByResourceGroupWithResponse("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccounts_GetFileUploadUrl

```java
import com.azure.resourcemanager.testbase.models.GetFileUploadUrlParameters;

/**
 * Samples for TestBaseAccounts GetFileUploadUrl.
 */
public final class TestBaseAccountsGetFileUploadUrlSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestBaseAccountGetFileUploadUrl.json
     */
    /**
     * Sample code: TestBaseAccountGetFileUploadUrl.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testBaseAccountGetFileUploadUrl(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testBaseAccounts().getFileUploadUrlWithResponse("contoso-rg1", "contoso-testBaseAccount1", new GetFileUploadUrlParameters().withBlobName("package.zip"), com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccounts_List

```java
/**
 * Samples for TestBaseAccounts List.
 */
public final class TestBaseAccountsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestBaseAccountsListBySubscription.json
     */
    /**
     * Sample code: TestBaseAccountsListBySubscription.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testBaseAccountsListBySubscription(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testBaseAccounts().list(null, com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccounts_ListByResourceGroup

```java
/**
 * Samples for TestBaseAccounts ListByResourceGroup.
 */
public final class TestBaseAccountsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestBaseAccountsList.json
     */
    /**
     * Sample code: TestBaseAccountsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testBaseAccountsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testBaseAccounts().listByResourceGroup("contoso-rg1", null, com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccounts_Offboard

```java
/**
 * Samples for TestBaseAccounts Offboard.
 */
public final class TestBaseAccountsOffboardSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestBaseAccountOffboard.json
     */
    /**
     * Sample code: TestBaseAccountOffboard.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testBaseAccountOffboard(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testBaseAccounts().offboard("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccounts_Update

```java
import com.azure.resourcemanager.testbase.fluent.models.TestBaseAccountSkuInner;
import com.azure.resourcemanager.testbase.models.TestBaseAccountResource;
import com.azure.resourcemanager.testbase.models.Tier;
import java.util.stream.Collectors;

/**
 * Samples for TestBaseAccounts Update.
 */
public final class TestBaseAccountsUpdateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestBaseAccountUpdate.json
     */
    /**
     * Sample code: TestBaseAccountUpdate.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testBaseAccountUpdate(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        TestBaseAccountResource resource = manager.testBaseAccounts().getByResourceGroupWithResponse("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withSku(new TestBaseAccountSkuInner().withName("S0").withTier(Tier.STANDARD)).apply();
    }
}
```

### TestResults_Get

```java
/**
 * Samples for TestResults Get.
 */
public final class TestResultsGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestResultGet.json
     */
    /**
     * Sample code: TestResultGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testResultGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testResults().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-99b1f80d-03a9-4148-997f-806ba5bac8e0", com.azure.core.util.Context.NONE);
    }
}
```

### TestResults_GetConsoleLogDownloadUrl

```java
import com.azure.resourcemanager.testbase.models.TestResultConsoleLogDownloadUrlParameters;

/**
 * Samples for TestResults GetConsoleLogDownloadUrl.
 */
public final class TestResultsGetConsoleLogDownloadUrlSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestResultGetConsoleLogDownloadURL.json
     */
    /**
     * Sample code: TestResultGetConsoleLogDownloadURL.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testResultGetConsoleLogDownloadURL(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testResults().getConsoleLogDownloadUrlWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-99b1f80d-03a9-4148-997f-806ba5bac8e0", new TestResultConsoleLogDownloadUrlParameters().withLogFileName("launch-stderr-1234.log"), com.azure.core.util.Context.NONE);
    }
}
```

### TestResults_GetDownloadUrl

```java
/**
 * Samples for TestResults GetDownloadUrl.
 */
public final class TestResultsGetDownloadUrlSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestResultGetDownloadURL.json
     */
    /**
     * Sample code: TestResultGetDownloadURL.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testResultGetDownloadURL(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testResults().getDownloadUrlWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-99b1f80d-03a9-4148-997f-806ba5bac8e0", com.azure.core.util.Context.NONE);
    }
}
```

### TestResults_GetVideoDownloadUrl

```java
/**
 * Samples for TestResults GetVideoDownloadUrl.
 */
public final class TestResultsGetVideoDownloadUrlSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestResultGetVideoDownloadURL.json
     */
    /**
     * Sample code: TestResultGetVideoDownloadURL.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testResultGetVideoDownloadURL(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testResults().getVideoDownloadUrlWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", "Windows-10-1909-99b1f80d-03a9-4148-997f-806ba5bac8e0", com.azure.core.util.Context.NONE);
    }
}
```

### TestResults_List

```java
import com.azure.resourcemanager.testbase.models.OsUpdateType;
import java.util.stream.Collectors;

/**
 * Samples for TestResults List.
 */
public final class TestResultsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestResultsList.json
     */
    /**
     * Sample code: TestResultsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testResultsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testResults().list("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", OsUpdateType.SECURITY_UPDATE, "osName eq 'Windows 10 2004' and releaseName eq '2020.11B'", com.azure.core.util.Context.NONE);
    }
}
```

### TestSummaries_Get

```java
/**
 * Samples for TestSummaries Get.
 */
public final class TestSummariesGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestSummaryGet.json
     */
    /**
     * Sample code: TestSummaryGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testSummaryGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testSummaries().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2-096bffb5-5d3d-4305-a66a-953372ed6e88", com.azure.core.util.Context.NONE);
    }
}
```

### TestSummaries_List

```java
/**
 * Samples for TestSummaries List.
 */
public final class TestSummariesListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestSummariesList.json
     */
    /**
     * Sample code: TestSummariesList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testSummariesList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testSummaries().list("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### TestTypes_Get

```java
/**
 * Samples for TestTypes Get.
 */
public final class TestTypesGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestTypeGet.json
     */
    /**
     * Sample code: TestTypeGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testTypeGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testTypes().getWithResponse("contoso-rg", "contoso-testBaseAccount", "Functional-Test", com.azure.core.util.Context.NONE);
    }
}
```

### TestTypes_List

```java
/**
 * Samples for TestTypes List.
 */
public final class TestTypesListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestTypesList.json
     */
    /**
     * Sample code: TestTypesList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testTypesList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.testTypes().list("contoso-rg", "contoso-testBaseAccount", com.azure.core.util.Context.NONE);
    }
}
```

### Usage_List

```java
/**
 * Samples for Usage List.
 */
public final class UsageListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/TestBaseAccountUsagesList.json
     */
    /**
     * Sample code: TestBaseAccountUsagesList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void testBaseAccountUsagesList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.usages().list("contoso-rg1", "contoso-testBaseAccount1", null, com.azure.core.util.Context.NONE);
    }
}
```

### VHDs_Delete

```java
/**
 * Samples for VHDs Delete.
 */
public final class VHDsDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/VHDDelete.json
     */
    /**
     * Sample code: VHDDelete.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void vHDDelete(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.vHDs().deleteWithResponse("contoso-rg1", "contoso-testBaseAccount1", "vhd-00ac3ccd-1503-4ee5-aa26-26569cfafe88", com.azure.core.util.Context.NONE);
    }
}
```

### VHDs_Get

```java
/**
 * Samples for VHDs Get.
 */
public final class VHDsGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/VHDGet.json
     */
    /**
     * Sample code: VHDGet.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void vHDGet(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.vHDs().getWithResponse("contoso-rg1", "contoso-testBaseAccount1", "vhd-00ac3ccd-1503-4ee5-aa26-26569cfafe88", com.azure.core.util.Context.NONE);
    }
}
```

### VHDs_ListByTestBaseAccount

```java
/**
 * Samples for VHDs ListByTestBaseAccount.
 */
public final class VHDsListByTestBaseAccountSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2023-11-01-preview/examples/VHDsList.json
     */
    /**
     * Sample code: VHDsList.
     * 
     * @param manager Entry point to TestBaseManager.
     */
    public static void vHDsList(com.azure.resourcemanager.testbase.TestBaseManager manager) {
        manager.vHDs().listByTestBaseAccount("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

