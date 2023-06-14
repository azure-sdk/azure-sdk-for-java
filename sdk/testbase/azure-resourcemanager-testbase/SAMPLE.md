# Code snippets and samples


## AnalysisResultOperation

- [Get](#analysisresultoperation_get)

## AnalysisResults

- [List](#analysisresults_list)

## FavoriteProcess

- [Create](#favoriteprocess_create)
- [Delete](#favoriteprocess_delete)
- [Get](#favoriteprocess_get)

## FavoriteProcesses

- [List](#favoriteprocesses_list)

## OSUpdateOperation

- [Get](#osupdateoperation_get)

## OSUpdates

- [List](#osupdates_list)

## Operations

- [List](#operations_list)

## PackageOperation

- [Create](#packageoperation_create)
- [Delete](#packageoperation_delete)
- [Get](#packageoperation_get)
- [HardDelete](#packageoperation_harddelete)
- [Update](#packageoperation_update)

## Packages

- [ListByTestBaseAccount](#packages_listbytestbaseaccount)

## ResourceProvider

- [CheckPackageNameAvailability](#resourceprovider_checkpackagenameavailability)
- [PackageGetDownloadUrl](#resourceprovider_packagegetdownloadurl)
- [TestBaseAccountGetFileUploadUrl](#resourceprovider_testbaseaccountgetfileuploadurl)
- [TestResultGetDownloadUrl](#resourceprovider_testresultgetdownloadurl)
- [TestResultGetVideoDownloadUrl](#resourceprovider_testresultgetvideodownloadurl)

## SKUs

- [List](#skus_list)

## TestBaseAccountAvailableOS

- [Get](#testbaseaccountavailableos_get)

## TestBaseAccountAvailableOSs

- [List](#testbaseaccountavailableoss_list)

## TestBaseAccountFlightingRingOperation

- [Get](#testbaseaccountflightingringoperation_get)

## TestBaseAccountFlightingRings

- [List](#testbaseaccountflightingrings_list)

## TestBaseAccountOperation

- [Create](#testbaseaccountoperation_create)
- [Delete](#testbaseaccountoperation_delete)
- [GetByResourceGroup](#testbaseaccountoperation_getbyresourcegroup)
- [Offboard](#testbaseaccountoperation_offboard)
- [Update](#testbaseaccountoperation_update)

## TestBaseAccountTestTypeOperation

- [Get](#testbaseaccounttesttypeoperation_get)

## TestBaseAccountTestTypes

- [List](#testbaseaccounttesttypes_list)

## TestBaseAccountUsage

- [List](#testbaseaccountusage_list)

## TestBaseAccounts

- [List](#testbaseaccounts_list)
- [ListByResourceGroup](#testbaseaccounts_listbyresourcegroup)

## TestResultOperation

- [Get](#testresultoperation_get)

## TestResults

- [List](#testresults_list)

## TestSummaries

- [List](#testsummaries_list)

## TestSummaryOperation

- [Get](#testsummaryoperation_get)
### AnalysisResultOperation_Get

```java
import com.azure.resourcemanager.testbase.models.AnalysisResultName;

/** Samples for AnalysisResultOperation Get. */
public final class AnalysisResultOperationGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/MemoryUtilizationAnalysisResultGet.json
     */
    /**
     * Sample code: MemoryUtilizationAnalysisResultGet.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void memoryUtilizationAnalysisResultGet(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .analysisResultOperations()
            .getWithResponse(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "Windows-10-1909-Test-Id",
                AnalysisResultName.MEMORY_UTILIZATION,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/CPURegressionAnalysisResultGet.json
     */
    /**
     * Sample code: CPURegressionAnalysisResultGet.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void cPURegressionAnalysisResultGet(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .analysisResultOperations()
            .getWithResponse(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "Windows-10-1909-Test-Id",
                AnalysisResultName.CPU_REGRESSION,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/CPUUtilizationAnalysisResultGet.json
     */
    /**
     * Sample code: CPUUtilizationAnalysisResultGet.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void cPUUtilizationAnalysisResultGet(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .analysisResultOperations()
            .getWithResponse(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "Windows-10-1909-Test-Id",
                AnalysisResultName.CPU_UTILIZATION,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/MemoryRegressionAnalysisResultGet.json
     */
    /**
     * Sample code: MemoryRegressionAnalysisResultGet.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void memoryRegressionAnalysisResultGet(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .analysisResultOperations()
            .getWithResponse(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "Windows-10-1909-Test-Id",
                AnalysisResultName.MEMORY_REGRESSION,
                com.azure.core.util.Context.NONE);
    }
}
```

### AnalysisResults_List

```java
import com.azure.resourcemanager.testbase.models.AnalysisResultType;

/** Samples for AnalysisResults List. */
public final class AnalysisResultsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/MemoryRegressionAnalysisResultsList.json
     */
    /**
     * Sample code: MemoryRegressionAnalysisResultsList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void memoryRegressionAnalysisResultsList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .analysisResults()
            .list(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "Windows-10-1909-Test-Id",
                AnalysisResultType.MEMORY_REGRESSION,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/CPUUtilizationAnalysisResultsList.json
     */
    /**
     * Sample code: CPUUtilizationAnalysisResultsList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void cPUUtilizationAnalysisResultsList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .analysisResults()
            .list(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "Windows-10-1909-Test-Id",
                AnalysisResultType.CPUUTILIZATION,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/MemoryUtilizationAnalysisResultsList.json
     */
    /**
     * Sample code: MemoryUtilizationAnalysisResultsList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void memoryUtilizationAnalysisResultsList(
        com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .analysisResults()
            .list(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "Windows-10-1909-Test-Id",
                AnalysisResultType.MEMORY_UTILIZATION,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/CPURegressionAnalysisResultsList.json
     */
    /**
     * Sample code: CPURegressionAnalysisResultsList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void cPURegressionAnalysisResultsList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .analysisResults()
            .list(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "Windows-10-1909-Test-Id",
                AnalysisResultType.CPUREGRESSION,
                com.azure.core.util.Context.NONE);
    }
}
```

### FavoriteProcess_Create

```java
/** Samples for FavoriteProcess Create. */
public final class FavoriteProcessCreateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/FavoriteProcessCreate.json
     */
    /**
     * Sample code: FavoriteProcessCreate.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void favoriteProcessCreate(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .favoriteProcess()
            .define("testAppProcess")
            .withExistingPackage("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2")
            .withActualProcessName("testApp&.exe")
            .create();
    }
}
```

### FavoriteProcess_Delete

```java
/** Samples for FavoriteProcess Delete. */
public final class FavoriteProcessDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/FavoriteProcessDelete.json
     */
    /**
     * Sample code: FavoriteProcessDelete.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void favoriteProcessDelete(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .favoriteProcess()
            .deleteWithResponse(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "testAppProcess",
                com.azure.core.util.Context.NONE);
    }
}
```

### FavoriteProcess_Get

```java
/** Samples for FavoriteProcess Get. */
public final class FavoriteProcessGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/FavoriteProcessGet.json
     */
    /**
     * Sample code: FavoriteProcessGet.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void favoriteProcessGet(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .favoriteProcess()
            .getWithResponse(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "testAppProcess",
                com.azure.core.util.Context.NONE);
    }
}
```

### FavoriteProcesses_List

```java
/** Samples for FavoriteProcesses List. */
public final class FavoriteProcessesListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/FavoriteProcessesList.json
     */
    /**
     * Sample code: FavoriteProcessesList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void favoriteProcessesList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .favoriteProcesses()
            .list("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", com.azure.core.util.Context.NONE);
    }
}
```

### OSUpdateOperation_Get

```java
/** Samples for OSUpdateOperation Get. */
public final class OSUpdateOperationGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/OSUpdateGet.json
     */
    /**
     * Sample code: OSUpdateGet.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void oSUpdateGet(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .oSUpdateOperations()
            .getWithResponse(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "Windows-10-2004-2020-12-B-505",
                com.azure.core.util.Context.NONE);
    }
}
```

### OSUpdates_List

```java
import com.azure.resourcemanager.testbase.models.OsUpdateType;

/** Samples for OSUpdates List. */
public final class OSUpdatesListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/OSUpdatesList.json
     */
    /**
     * Sample code: OSUpdatesList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void oSUpdatesList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .oSUpdates()
            .list(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                OsUpdateType.SECURITY_UPDATE,
                com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/OperationsList.json
     */
    /**
     * Sample code: OperationsList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void operationsList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### PackageOperation_Create

```java
import com.azure.resourcemanager.testbase.models.Action;
import com.azure.resourcemanager.testbase.models.Command;
import com.azure.resourcemanager.testbase.models.ContentType;
import com.azure.resourcemanager.testbase.models.TargetOSInfo;
import com.azure.resourcemanager.testbase.models.Test;
import com.azure.resourcemanager.testbase.models.TestType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for PackageOperation Create. */
public final class PackageOperationCreateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/PackageCreate.json
     */
    /**
     * Sample code: PackageCreate.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void packageCreate(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .packageOperations()
            .define("contoso-package2")
            .withRegion("westus")
            .withExistingTestBaseAccount("contoso-rg1", "contoso-testBaseAccount1")
            .withTags(mapOf())
            .withApplicationName("contoso-package2")
            .withVersion("1.0.0")
            .withTargetOSList(
                Arrays
                    .asList(
                        new TargetOSInfo()
                            .withOsUpdateType("Security updates")
                            .withTargetOSs(Arrays.asList("Windows 10 2004", "Windows 10 1903"))))
            .withFlightingRing("Insider Beta Channel")
            .withBlobPath("storageAccountPath/package.zip")
            .withTests(
                Arrays
                    .asList(
                        new Test()
                            .withTestType(TestType.OUT_OF_BOX_TEST)
                            .withIsActive(true)
                            .withCommands(
                                Arrays
                                    .asList(
                                        new Command()
                                            .withName("Install")
                                            .withAction(Action.INSTALL)
                                            .withContentType(ContentType.PATH)
                                            .withContent("app/scripts/install/job.ps1")
                                            .withRunElevated(true)
                                            .withRestartAfter(true)
                                            .withMaxRunTime(1800)
                                            .withRunAsInteractive(true)
                                            .withAlwaysRun(true)
                                            .withApplyUpdateBefore(false),
                                        new Command()
                                            .withName("Launch")
                                            .withAction(Action.LAUNCH)
                                            .withContentType(ContentType.PATH)
                                            .withContent("app/scripts/launch/job.ps1")
                                            .withRunElevated(true)
                                            .withRestartAfter(false)
                                            .withMaxRunTime(1800)
                                            .withRunAsInteractive(true)
                                            .withAlwaysRun(false)
                                            .withApplyUpdateBefore(true),
                                        new Command()
                                            .withName("Close")
                                            .withAction(Action.CLOSE)
                                            .withContentType(ContentType.PATH)
                                            .withContent("app/scripts/close/job.ps1")
                                            .withRunElevated(true)
                                            .withRestartAfter(false)
                                            .withMaxRunTime(1800)
                                            .withRunAsInteractive(true)
                                            .withAlwaysRun(false)
                                            .withApplyUpdateBefore(false),
                                        new Command()
                                            .withName("Uninstall")
                                            .withAction(Action.UNINSTALL)
                                            .withContentType(ContentType.PATH)
                                            .withContent("app/scripts/uninstall/job.ps1")
                                            .withRunElevated(true)
                                            .withRestartAfter(false)
                                            .withMaxRunTime(1800)
                                            .withRunAsInteractive(true)
                                            .withAlwaysRun(true)
                                            .withApplyUpdateBefore(false)))))
            .create();
    }

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

### PackageOperation_Delete

```java
/** Samples for PackageOperation Delete. */
public final class PackageOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/PackageDelete.json
     */
    /**
     * Sample code: PackageDelete.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void packageDelete(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .packageOperations()
            .delete("contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", com.azure.core.util.Context.NONE);
    }
}
```

### PackageOperation_Get

```java
/** Samples for PackageOperation Get. */
public final class PackageOperationGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/PackageGet.json
     */
    /**
     * Sample code: PackageGet.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void packageGet(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .packageOperations()
            .getWithResponse(
                "contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", com.azure.core.util.Context.NONE);
    }
}
```

### PackageOperation_HardDelete

```java
/** Samples for PackageOperation HardDelete. */
public final class PackageOperationHardDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/PackageHardDelete.json
     */
    /**
     * Sample code: PackageHardDelete.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void packageHardDelete(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .packageOperations()
            .hardDelete(
                "contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", com.azure.core.util.Context.NONE);
    }
}
```

### PackageOperation_Update

```java
import com.azure.resourcemanager.testbase.models.Action;
import com.azure.resourcemanager.testbase.models.Command;
import com.azure.resourcemanager.testbase.models.ContentType;
import com.azure.resourcemanager.testbase.models.PackageResource;
import com.azure.resourcemanager.testbase.models.TargetOSInfo;
import com.azure.resourcemanager.testbase.models.Test;
import com.azure.resourcemanager.testbase.models.TestType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for PackageOperation Update. */
public final class PackageOperationUpdateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/PackageUpdate.json
     */
    /**
     * Sample code: PackageUpdate.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void packageUpdate(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        PackageResource resource =
            manager
                .packageOperations()
                .getWithResponse(
                    "contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf())
            .withTargetOSList(
                Arrays
                    .asList(
                        new TargetOSInfo()
                            .withOsUpdateType("Security updates")
                            .withTargetOSs(Arrays.asList("Windows 10 2004", "Windows 10 1903"))))
            .withFlightingRing("Insider Beta Channel")
            .withIsEnabled(false)
            .withBlobPath("storageAccountPath/package.zip")
            .withTests(
                Arrays
                    .asList(
                        new Test()
                            .withTestType(TestType.OUT_OF_BOX_TEST)
                            .withIsActive(true)
                            .withCommands(
                                Arrays
                                    .asList(
                                        new Command()
                                            .withName("Install")
                                            .withAction(Action.INSTALL)
                                            .withContentType(ContentType.PATH)
                                            .withContent("app/scripts/install/job.ps1")
                                            .withRunElevated(true)
                                            .withRestartAfter(true)
                                            .withMaxRunTime(1800)
                                            .withRunAsInteractive(true)
                                            .withAlwaysRun(true)
                                            .withApplyUpdateBefore(false),
                                        new Command()
                                            .withName("Launch")
                                            .withAction(Action.LAUNCH)
                                            .withContentType(ContentType.PATH)
                                            .withContent("app/scripts/launch/job.ps1")
                                            .withRunElevated(true)
                                            .withRestartAfter(false)
                                            .withMaxRunTime(1800)
                                            .withRunAsInteractive(true)
                                            .withAlwaysRun(false)
                                            .withApplyUpdateBefore(true),
                                        new Command()
                                            .withName("Close")
                                            .withAction(Action.CLOSE)
                                            .withContentType(ContentType.PATH)
                                            .withContent("app/scripts/close/job.ps1")
                                            .withRunElevated(true)
                                            .withRestartAfter(false)
                                            .withMaxRunTime(1800)
                                            .withRunAsInteractive(true)
                                            .withAlwaysRun(false)
                                            .withApplyUpdateBefore(false),
                                        new Command()
                                            .withName("Uninstall")
                                            .withAction(Action.UNINSTALL)
                                            .withContentType(ContentType.PATH)
                                            .withContent("app/scripts/uninstall/job.ps1")
                                            .withRunElevated(true)
                                            .withRestartAfter(false)
                                            .withMaxRunTime(1800)
                                            .withRunAsInteractive(true)
                                            .withAlwaysRun(true)
                                            .withApplyUpdateBefore(false)))))
            .apply();
    }

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

### Packages_ListByTestBaseAccount

```java
/** Samples for Packages ListByTestBaseAccount. */
public final class PackagesListByTestBaseAccountSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/PackagesList.json
     */
    /**
     * Sample code: PackagesList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void packagesList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .packages()
            .listByTestBaseAccount("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_CheckPackageNameAvailability

```java
import com.azure.resourcemanager.testbase.models.PackageCheckNameAvailabilityParameters;

/** Samples for ResourceProvider CheckPackageNameAvailability. */
public final class ResourceProviderCheckPackageNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/CheckPackageNameAvailability.json
     */
    /**
     * Sample code: CheckPackageNameAvailability.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void checkPackageNameAvailability(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .resourceProviders()
            .checkPackageNameAvailabilityWithResponse(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                new PackageCheckNameAvailabilityParameters()
                    .withName("testApp")
                    .withApplicationName("testApp")
                    .withVersion("1.0.0")
                    .withType("Microsoft.TestBase/testBaseAccounts/packages"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_PackageGetDownloadUrl

```java
/** Samples for ResourceProvider PackageGetDownloadUrl. */
public final class ResourceProviderPackageGetDownloadUrlSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/PackageGetDownloadURL.json
     */
    /**
     * Sample code: PackageGetDownloadURL.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void packageGetDownloadURL(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .resourceProviders()
            .packageGetDownloadUrlWithResponse(
                "contoso-rg1", "contoso-testBaseAccount1", "contoso-package2", com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_TestBaseAccountGetFileUploadUrl

```java
import com.azure.resourcemanager.testbase.models.GetFileUploadUrlParameters;

/** Samples for ResourceProvider TestBaseAccountGetFileUploadUrl. */
public final class ResourceProviderTestBaseAccountGetFileUploadUrlSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestBaseAccountGetFileUploadUrl.json
     */
    /**
     * Sample code: TestBaseAccountGetFileUploadUrl.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testBaseAccountGetFileUploadUrl(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .resourceProviders()
            .testBaseAccountGetFileUploadUrlWithResponse(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                new GetFileUploadUrlParameters().withBlobName("package.zip"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_TestResultGetDownloadUrl

```java
/** Samples for ResourceProvider TestResultGetDownloadUrl. */
public final class ResourceProviderTestResultGetDownloadUrlSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestResultGetDownloadURL.json
     */
    /**
     * Sample code: TestResultGetDownloadURL.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testResultGetDownloadURL(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .resourceProviders()
            .testResultGetDownloadUrlWithResponse(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "Windows-10-1909-99b1f80d-03a9-4148-997f-806ba5bac8e0",
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_TestResultGetVideoDownloadUrl

```java
/** Samples for ResourceProvider TestResultGetVideoDownloadUrl. */
public final class ResourceProviderTestResultGetVideoDownloadUrlSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestResultGetVideoDownloadURL.json
     */
    /**
     * Sample code: TestResultGetVideoDownloadURL.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testResultGetVideoDownloadURL(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .resourceProviders()
            .testResultGetVideoDownloadUrlWithResponse(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "Windows-10-1909-99b1f80d-03a9-4148-997f-806ba5bac8e0",
                com.azure.core.util.Context.NONE);
    }
}
```

### SKUs_List

```java
/** Samples for SKUs List. */
public final class SKUsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestBaseAccountSKUsList.json
     */
    /**
     * Sample code: TestBaseAccountSKUsList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testBaseAccountSKUsList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager.sKUs().list(com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccountAvailableOS_Get

```java
/** Samples for TestBaseAccountAvailableOS Get. */
public final class TestBaseAccountAvailableOSGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/AvailableOSGet.json
     */
    /**
     * Sample code: AvailableOSGet.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void availableOSGet(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testBaseAccountAvailableOS()
            .getWithResponse(
                "contoso-rg", "contoso-testBaseAccount", "Windows-10-2004", com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccountAvailableOSs_List

```java
import com.azure.resourcemanager.testbase.models.OsUpdateType;

/** Samples for TestBaseAccountAvailableOSs List. */
public final class TestBaseAccountAvailableOSsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/AvailableOSsList.json
     */
    /**
     * Sample code: AvailableOSsList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void availableOSsList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testBaseAccountAvailableOSs()
            .list(
                "contoso-rg",
                "contoso-testBaseAccount",
                OsUpdateType.SECURITY_UPDATE,
                com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccountFlightingRingOperation_Get

```java
/** Samples for TestBaseAccountFlightingRingOperation Get. */
public final class TestBaseAccountFlightingRingOperationGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/FlightingRingGet.json
     */
    /**
     * Sample code: FlightingRingGet.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void flightingRingGet(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testBaseAccountFlightingRingOperations()
            .getWithResponse(
                "contoso-rg", "contoso-testBaseAccount", "Insider-Beta-Channel", com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccountFlightingRings_List

```java
/** Samples for TestBaseAccountFlightingRings List. */
public final class TestBaseAccountFlightingRingsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/FlightingRingsList.json
     */
    /**
     * Sample code: FlightingRingsList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void flightingRingsList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testBaseAccountFlightingRings()
            .list("contoso-rg", "contoso-testBaseAccount", com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccountOperation_Create

```java
import com.azure.resourcemanager.testbase.fluent.models.TestBaseAccountSkuInner;
import com.azure.resourcemanager.testbase.models.Tier;

/** Samples for TestBaseAccountOperation Create. */
public final class TestBaseAccountOperationCreateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestBaseAccountCreate.json
     */
    /**
     * Sample code: TestBaseAccountCreate.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testBaseAccountCreate(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testBaseAccountOperations()
            .define("contoso-testBaseAccount1")
            .withRegion("westus")
            .withExistingResourceGroup("contoso-rg1")
            .withSku(new TestBaseAccountSkuInner().withName("B0").withTier(Tier.BASIC))
            .create();
    }
}
```

### TestBaseAccountOperation_Delete

```java
/** Samples for TestBaseAccountOperation Delete. */
public final class TestBaseAccountOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestBaseAccountDelete.json
     */
    /**
     * Sample code: TestBaseAccountDelete.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testBaseAccountDelete(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testBaseAccountOperations()
            .delete("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccountOperation_GetByResourceGroup

```java
/** Samples for TestBaseAccountOperation GetByResourceGroup. */
public final class TestBaseAccountOperationGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestBaseAccountGet.json
     */
    /**
     * Sample code: TestBaseAccountGet.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testBaseAccountGet(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testBaseAccountOperations()
            .getByResourceGroupWithResponse(
                "contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccountOperation_Offboard

```java
/** Samples for TestBaseAccountOperation Offboard. */
public final class TestBaseAccountOperationOffboardSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestBaseAccountOffboard.json
     */
    /**
     * Sample code: TestBaseAccountOffboard.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testBaseAccountOffboard(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testBaseAccountOperations()
            .offboard("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccountOperation_Update

```java
import com.azure.resourcemanager.testbase.fluent.models.TestBaseAccountSkuInner;
import com.azure.resourcemanager.testbase.models.TestBaseAccountResource;
import com.azure.resourcemanager.testbase.models.Tier;

/** Samples for TestBaseAccountOperation Update. */
public final class TestBaseAccountOperationUpdateSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestBaseAccountUpdate.json
     */
    /**
     * Sample code: TestBaseAccountUpdate.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testBaseAccountUpdate(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        TestBaseAccountResource resource =
            manager
                .testBaseAccountOperations()
                .getByResourceGroupWithResponse(
                    "contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withSku(new TestBaseAccountSkuInner().withName("B0").withTier(Tier.BASIC)).apply();
    }
}
```

### TestBaseAccountTestTypeOperation_Get

```java
/** Samples for TestBaseAccountTestTypeOperation Get. */
public final class TestBaseAccountTestTypeOperationGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestTypeGet.json
     */
    /**
     * Sample code: TestTypeGet.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testTypeGet(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testBaseAccountTestTypeOperations()
            .getWithResponse(
                "contoso-rg", "contoso-testBaseAccount", "Functional-Test", com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccountTestTypes_List

```java
/** Samples for TestBaseAccountTestTypes List. */
public final class TestBaseAccountTestTypesListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestTypesList.json
     */
    /**
     * Sample code: TestTypesList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testTypesList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testBaseAccountTestTypes()
            .list("contoso-rg", "contoso-testBaseAccount", com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccountUsage_List

```java
/** Samples for TestBaseAccountUsage List. */
public final class TestBaseAccountUsageListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestBaseAccountUsagesList.json
     */
    /**
     * Sample code: TestBaseAccountUsagesList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testBaseAccountUsagesList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testBaseAccountUsages()
            .list("contoso-rg1", "contoso-testBaseAccount1", null, com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccounts_List

```java
/** Samples for TestBaseAccounts List. */
public final class TestBaseAccountsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestBaseAccountsListBySubscription.json
     */
    /**
     * Sample code: TestBaseAccountsListBySubscription.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testBaseAccountsListBySubscription(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager.testBaseAccounts().list(null, com.azure.core.util.Context.NONE);
    }
}
```

### TestBaseAccounts_ListByResourceGroup

```java
/** Samples for TestBaseAccounts ListByResourceGroup. */
public final class TestBaseAccountsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestBaseAccountsList.json
     */
    /**
     * Sample code: TestBaseAccountsList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testBaseAccountsList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager.testBaseAccounts().listByResourceGroup("contoso-rg1", null, com.azure.core.util.Context.NONE);
    }
}
```

### TestResultOperation_Get

```java
/** Samples for TestResultOperation Get. */
public final class TestResultOperationGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestResultGet.json
     */
    /**
     * Sample code: TestResultGet.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testResultGet(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testResultOperations()
            .getWithResponse(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                "Windows-10-1909-99b1f80d-03a9-4148-997f-806ba5bac8e0",
                com.azure.core.util.Context.NONE);
    }
}
```

### TestResults_List

```java
import com.azure.resourcemanager.testbase.models.OsUpdateType;

/** Samples for TestResults List. */
public final class TestResultsListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestResultsList.json
     */
    /**
     * Sample code: TestResultsList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testResultsList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testResults()
            .list(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2",
                OsUpdateType.SECURITY_UPDATE,
                "osName eq 'Windows 10 2004' and releaseName eq '2020.11B'",
                com.azure.core.util.Context.NONE);
    }
}
```

### TestSummaries_List

```java
/** Samples for TestSummaries List. */
public final class TestSummariesListSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestSummariesList.json
     */
    /**
     * Sample code: TestSummariesList.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testSummariesList(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager.testSummaries().list("contoso-rg1", "contoso-testBaseAccount1", com.azure.core.util.Context.NONE);
    }
}
```

### TestSummaryOperation_Get

```java
/** Samples for TestSummaryOperation Get. */
public final class TestSummaryOperationGetSamples {
    /*
     * x-ms-original-file: specification/testbase/resource-manager/Microsoft.TestBase/preview/2020-12-16-preview/examples/TestSummaryGet.json
     */
    /**
     * Sample code: TestSummaryGet.
     *
     * @param manager Entry point to TestbaseManager.
     */
    public static void testSummaryGet(com.azure.resourcemanager.testbase.TestbaseManager manager) {
        manager
            .testSummaryOperations()
            .getWithResponse(
                "contoso-rg1",
                "contoso-testBaseAccount1",
                "contoso-package2-096bffb5-5d3d-4305-a66a-953372ed6e88",
                com.azure.core.util.Context.NONE);
    }
}
```

