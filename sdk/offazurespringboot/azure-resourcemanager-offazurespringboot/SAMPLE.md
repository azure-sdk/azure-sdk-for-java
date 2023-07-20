# Code snippets and samples


## ErrorSummaries

- [CreateOrUpdate](#errorsummaries_createorupdate)
- [Delete](#errorsummaries_delete)
- [Get](#errorsummaries_get)
- [ListBySite](#errorsummaries_listbysite)
- [Update](#errorsummaries_update)

## Operations

- [List](#operations_list)

## Springbootapps

- [CreateOrUpdate](#springbootapps_createorupdate)
- [Delete](#springbootapps_delete)
- [Get](#springbootapps_get)
- [ListByResourceGroup](#springbootapps_listbyresourcegroup)
- [ListBySubscription](#springbootapps_listbysubscription)
- [Update](#springbootapps_update)

## Springbootservers

- [CreateOrUpdate](#springbootservers_createorupdate)
- [Delete](#springbootservers_delete)
- [Get](#springbootservers_get)
- [ListByResourceGroup](#springbootservers_listbyresourcegroup)
- [ListBySubscription](#springbootservers_listbysubscription)
- [Update](#springbootservers_update)

## Springbootsites

- [CreateOrUpdate](#springbootsites_createorupdate)
- [Delete](#springbootsites_delete)
- [GetByResourceGroup](#springbootsites_getbyresourcegroup)
- [List](#springbootsites_list)
- [ListByResourceGroup](#springbootsites_listbyresourcegroup)
- [TriggerRefreshSite](#springbootsites_triggerrefreshsite)
- [Update](#springbootsites_update)

## Summaries

- [CreateOrUpdate](#summaries_createorupdate)
- [Delete](#summaries_delete)
- [Get](#summaries_get)
- [ListBySite](#summaries_listbysite)
- [Update](#summaries_update)
### ErrorSummaries_CreateOrUpdate

```java
import com.azure.resourcemanager.offazurespringboot.models.Error;
import com.azure.resourcemanager.offazurespringboot.models.ErrorSummariesProperties;
import com.azure.resourcemanager.offazurespringboot.models.ErrorSummaryModel;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ErrorSummaries CreateOrUpdate. */
public final class ErrorSummariesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/ErrorSummaries_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: ErrorSummaries_CreateOrUpdate_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void errorSummariesCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .errorSummaries()
            .define("K2lv")
            .withExistingSpringbootsite("rgspringbootdiscovery", "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps")
            .withProperties(new ErrorSummariesProperties())
            .create();
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/ErrorSummaries_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ErrorSummaries_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void errorSummariesCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .errorSummaries()
            .define("K2lv")
            .withExistingSpringbootsite("rgspringbootdiscovery", "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps")
            .withTags(mapOf("key2085", "fakeTokenPlaceholder"))
            .withProperties(
                new ErrorSummariesProperties()
                    .withDiscoveryScopeErrorSummaries(
                        Arrays
                            .asList(
                                new ErrorSummaryModel()
                                    .withAffectedResourceType("kprvjasvybficrqctgbjpaek")
                                    .withAffectedObjectsCount(2)))
                    .withErrors(
                        Arrays
                            .asList(
                                new Error()
                                    .withId(13)
                                    .withCode("fakeTokenPlaceholder")
                                    .withSummaryMessage("knjufnfkdpukqiuqzfviwnss")
                                    .withRunAsAccountId("knjufnfkdpukqiuqzfviwnss")
                                    .withMessage("knjufnfkdpukqiuqzfviwnss")
                                    .withPossibleCauses("knjufnfkdpukqiuqzfviwnss")
                                    .withRecommendedAction("qpycieevlbrcomlwooiw")
                                    .withSeverity("wcusqqmqwo")
                                    .withUpdatedTimestamp(OffsetDateTime.parse("2022-12-02T09:28:24.094Z")))))
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

### ErrorSummaries_Delete

```java
/** Samples for ErrorSummaries Delete. */
public final class ErrorSummariesDeleteSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/ErrorSummaries_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: ErrorSummaries_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void errorSummariesDeleteMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .errorSummaries()
            .deleteWithResponse(
                "rgspringbootdiscovery",
                "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                "K2lv",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/ErrorSummaries_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: ErrorSummaries_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void errorSummariesDeleteMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .errorSummaries()
            .deleteWithResponse(
                "rgspringbootdiscovery",
                "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                "K2lv",
                com.azure.core.util.Context.NONE);
    }
}
```

### ErrorSummaries_Get

```java
/** Samples for ErrorSummaries Get. */
public final class ErrorSummariesGetSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/ErrorSummaries_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: ErrorSummaries_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void errorSummariesGetMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .errorSummaries()
            .getWithResponse(
                "rgspringbootdiscovery",
                "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                "K2lv",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/ErrorSummaries_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: ErrorSummaries_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void errorSummariesGetMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .errorSummaries()
            .getWithResponse(
                "rgspringbootdiscovery",
                "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                "K2lv",
                com.azure.core.util.Context.NONE);
    }
}
```

### ErrorSummaries_ListBySite

```java
/** Samples for ErrorSummaries ListBySite. */
public final class ErrorSummariesListBySiteSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/ErrorSummaries_ListBySite_MaximumSet_Gen.json
     */
    /**
     * Sample code: ErrorSummaries_ListBySite_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void errorSummariesListBySiteMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .errorSummaries()
            .listBySite(
                "rgspringbootdiscovery", "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/ErrorSummaries_ListBySite_MinimumSet_Gen.json
     */
    /**
     * Sample code: ErrorSummaries_ListBySite_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void errorSummariesListBySiteMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .errorSummaries()
            .listBySite(
                "rgspringbootdiscovery", "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps", com.azure.core.util.Context.NONE);
    }
}
```

### ErrorSummaries_Update

```java
import com.azure.resourcemanager.offazurespringboot.models.Error;
import com.azure.resourcemanager.offazurespringboot.models.ErrorSummariesProperties;
import com.azure.resourcemanager.offazurespringboot.models.ErrorSummary;
import com.azure.resourcemanager.offazurespringboot.models.ErrorSummaryModel;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ErrorSummaries Update. */
public final class ErrorSummariesUpdateSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/ErrorSummaries_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: ErrorSummaries_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void errorSummariesUpdateMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        ErrorSummary resource =
            manager
                .errorSummaries()
                .getWithResponse(
                    "rgspringbootdiscovery",
                    "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                    "K2lv",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key8342", "fakeTokenPlaceholder"))
            .withProperties(
                new ErrorSummariesProperties()
                    .withDiscoveryScopeErrorSummaries(
                        Arrays
                            .asList(
                                new ErrorSummaryModel()
                                    .withAffectedResourceType("kprvjasvybficrqctgbjpaek")
                                    .withAffectedObjectsCount(2)))
                    .withErrors(
                        Arrays
                            .asList(
                                new Error()
                                    .withId(13)
                                    .withCode("fakeTokenPlaceholder")
                                    .withSummaryMessage("knjufnfkdpukqiuqzfviwnss")
                                    .withRunAsAccountId("knjufnfkdpukqiuqzfviwnss")
                                    .withMessage("knjufnfkdpukqiuqzfviwnss")
                                    .withPossibleCauses("knjufnfkdpukqiuqzfviwnss")
                                    .withRecommendedAction("qpycieevlbrcomlwooiw")
                                    .withSeverity("wcusqqmqwo")
                                    .withUpdatedTimestamp(OffsetDateTime.parse("2022-12-02T09:28:24.094Z")))))
            .apply();
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/ErrorSummaries_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: ErrorSummaries_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void errorSummariesUpdateMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        ErrorSummary resource =
            manager
                .errorSummaries()
                .getWithResponse(
                    "rgspringbootdiscovery",
                    "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                    "K2lv",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
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

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void operationsListMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void operationsListMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Springbootapps_CreateOrUpdate

```java
import com.azure.resourcemanager.offazurespringboot.models.SpringbootappsProperties;
import com.azure.resourcemanager.offazurespringboot.models.SpringbootappsPropertiesApplicationConfigurationsItem;
import com.azure.resourcemanager.offazurespringboot.models.SpringbootappsPropertiesInstancesItem;
import com.azure.resourcemanager.offazurespringboot.models.SpringbootappsPropertiesMiscsItem;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for Springbootapps CreateOrUpdate. */
public final class SpringbootappsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootapps_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootapps_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootappsCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootapps()
            .define("ofjeesoahqtnovlbuvflyknpbhcpeqqhekntvqxyemuwbcqnuxjgfhsf")
            .withExistingSpringbootsite("pdfosfhtemfsaglvwjdyqlyeipucrd", "rgspringbootapps")
            .withProperties(
                new SpringbootappsProperties()
                    .withAppName("wrauwfegjfccym")
                    .withArtifactName("wrauwfegjfccym")
                    .withAppPort(12)
                    .withAppType("axzunlh")
                    .withApplicationConfigurations(
                        Arrays
                            .asList(
                                new SpringbootappsPropertiesApplicationConfigurationsItem()
                                    .withKey("fakeTokenPlaceholder")
                                    .withValue("jnmaf")))
                    .withBindingPorts(Arrays.asList(11))
                    .withBuildJdkVersion("ipzruwqqulkpvhzymqegntz")
                    .withCertificates(Arrays.asList("xpiqqob"))
                    .withChecksum("gpzumvbzfnhhmuehveanctiamr")
                    .withDependencies(Arrays.asList("zrtted"))
                    .withEnvironments(Arrays.asList("afhprevtcx"))
                    .withInstanceCount(5)
                    .withJarFileLocation("wfptqclncaqycyfbfih")
                    .withJvmMemoryInMB(1)
                    .withJvmOptions(Arrays.asList("nytejjoytevmvlgnfwb"))
                    .withMiscs(
                        Arrays
                            .asList(
                                new SpringbootappsPropertiesMiscsItem().withKey("fakeTokenPlaceholder").withValue("k")))
                    .withInstances(
                        Arrays
                            .asList(
                                new SpringbootappsPropertiesInstancesItem()
                                    .withMachineArmId("lsstlommxuskyhnwyxh")
                                    .withInstanceCount(5)
                                    .withJvmMemoryInMB(128)))
                    .withRuntimeJdkVersion("eblzujbsulpeilykqyjso")
                    .withServers(Arrays.asList("gvfhsohasdx"))
                    .withMachineArmIds(Arrays.asList("lsstlommxuskyhnwyxh"))
                    .withSiteName("nzzyrevhsz")
                    .withSpringBootVersion("euggigfiii")
                    .withStaticContentLocations(Arrays.asList("wvvajfkbtmjftir"))
                    .withLastModifiedTime(OffsetDateTime.parse("2022-12-02T09:28:24.094Z")))
            .create();
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootapps_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootapps_CreateOrUpdate_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootappsCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootapps()
            .define("ofjeesoahqtnovlbuvflyknpbhcpeqqhekntvqxyemuwbcqnuxjgfhsf")
            .withExistingSpringbootsite("pdfosfhtemfsaglvwjdyqlyeipucrd", "rgspringbootapps")
            .create();
    }
}
```

### Springbootapps_Delete

```java
/** Samples for Springbootapps Delete. */
public final class SpringbootappsDeleteSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootapps_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootapps_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootappsDeleteMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootapps()
            .deleteWithResponse(
                "pdfosfhtemfsaglvwjdyqlyeipucrd",
                "rgspringbootapps",
                "ofjeesoahqtnovlbuvflyknpbhcpeqqhekntvqxyemuwbcqnuxjgfhsf",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootapps_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootapps_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootappsDeleteMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootapps()
            .deleteWithResponse(
                "pdfosfhtemfsaglvwjdyqlyeipucrd",
                "rgspringbootapps",
                "ofjeesoahqtnovlbuvflyknpbhcpeqqhekntvqxyemuwbcqnuxjgfhsf",
                com.azure.core.util.Context.NONE);
    }
}
```

### Springbootapps_Get

```java
/** Samples for Springbootapps Get. */
public final class SpringbootappsGetSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootapps_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootapps_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootappsGetMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootapps()
            .getWithResponse(
                "pdfosfhtemfsaglvwjdyqlyeipucrd",
                "rgspringbootapps",
                "ofjeesoahqtnovlbuvflyknpbhcpeqqhekntvqxyemuwbcqnuxjgfhsf",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootapps_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootapps_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootappsGetMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootapps()
            .getWithResponse(
                "pdfosfhtemfsaglvwjdyqlyeipucrd",
                "rgspringbootapps",
                "ofjeesoahqtnovlbuvflyknpbhcpeqqhekntvqxyemuwbcqnuxjgfhsf",
                com.azure.core.util.Context.NONE);
    }
}
```

### Springbootapps_ListByResourceGroup

```java
/** Samples for Springbootapps ListByResourceGroup. */
public final class SpringbootappsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootapps_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootapps_ListByResourceGroup_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootappsListByResourceGroupMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootapps()
            .listByResourceGroup(
                "pdfosfhtemfsaglvwjdyqlyeipucrd", "rgspringbootapps", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootapps_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootapps_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootappsListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootapps()
            .listByResourceGroup(
                "pdfosfhtemfsaglvwjdyqlyeipucrd", "rgspringbootapps", com.azure.core.util.Context.NONE);
    }
}
```

### Springbootapps_ListBySubscription

```java
/** Samples for Springbootapps ListBySubscription. */
public final class SpringbootappsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootapps_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootapps_ListBySubscription_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootappsListBySubscriptionMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager.springbootapps().listBySubscription("pdfosfhtemfsaglvwjdyqlyeipucrd", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootapps_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootapps_ListBySubscription_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootappsListBySubscriptionMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager.springbootapps().listBySubscription("pdfosfhtemfsaglvwjdyqlyeipucrd", com.azure.core.util.Context.NONE);
    }
}
```

### Springbootapps_Update

```java
import com.azure.resourcemanager.offazurespringboot.models.SpringbootappsModel;

/** Samples for Springbootapps Update. */
public final class SpringbootappsUpdateSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootapps_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootapps_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootappsUpdateMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        SpringbootappsModel resource =
            manager
                .springbootapps()
                .getWithResponse(
                    "pdfosfhtemfsaglvwjdyqlyeipucrd",
                    "rgspringbootapps",
                    "ofjeesoahqtnovlbuvflyknpbhcpeqqhekntvqxyemuwbcqnuxjgfhsf",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootapps_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootapps_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootappsUpdateMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        SpringbootappsModel resource =
            manager
                .springbootapps()
                .getWithResponse(
                    "pdfosfhtemfsaglvwjdyqlyeipucrd",
                    "rgspringbootapps",
                    "ofjeesoahqtnovlbuvflyknpbhcpeqqhekntvqxyemuwbcqnuxjgfhsf",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
```

### Springbootservers_CreateOrUpdate

```java
import com.azure.resourcemanager.offazurespringboot.models.SpringbootserversProperties;
import java.util.Arrays;

/** Samples for Springbootservers CreateOrUpdate. */
public final class SpringbootserversCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootservers_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootserversCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootservers()
            .define("zkarbqnwnxeozvjrkpdqmgnwedwgtwcmmyqwaijkn")
            .withExistingSpringbootsite(
                "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj", "rgspringbootservers")
            .withProperties(
                new SpringbootserversProperties()
                    .withPort(10)
                    .withServer("thhuxocfyqpeluqcgnypi")
                    .withFqdnAndIpAddressList(Arrays.asList())
                    .withMachineArmId("fvfkiapbqsprnbzczdfmuryknrna")
                    .withTotalApps(5)
                    .withSpringBootApps(17)
                    .withErrors(Arrays.asList()))
            .create();
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootservers_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_CreateOrUpdate_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootserversCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootservers()
            .define("zkarbqnwnxeozvjrkpdqmgnwedwgtwcmmyqwaijkn")
            .withExistingSpringbootsite(
                "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj", "rgspringbootservers")
            .create();
    }
}
```

### Springbootservers_Delete

```java
/** Samples for Springbootservers Delete. */
public final class SpringbootserversDeleteSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootservers_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootserversDeleteMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootservers()
            .delete(
                "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj",
                "rgspringbootservers",
                "zkarbqnwnxeozvjrkpdqmgnwedwgtwcmmyqwaijkn",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootservers_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootserversDeleteMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootservers()
            .delete(
                "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj",
                "rgspringbootservers",
                "zkarbqnwnxeozvjrkpdqmgnwedwgtwcmmyqwaijkn",
                com.azure.core.util.Context.NONE);
    }
}
```

### Springbootservers_Get

```java
/** Samples for Springbootservers Get. */
public final class SpringbootserversGetSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootservers_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootserversGetMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootservers()
            .getWithResponse(
                "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj",
                "rgspringbootservers",
                "zkarbqnwnxeozvjrkpdqmgnwedwgtwcmmyqwaijkn",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootservers_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootserversGetMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootservers()
            .getWithResponse(
                "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj",
                "rgspringbootservers",
                "zkarbqnwnxeozvjrkpdqmgnwedwgtwcmmyqwaijkn",
                com.azure.core.util.Context.NONE);
    }
}
```

### Springbootservers_ListByResourceGroup

```java
/** Samples for Springbootservers ListByResourceGroup. */
public final class SpringbootserversListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootservers_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_ListByResourceGroup_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootserversListByResourceGroupMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootservers()
            .listByResourceGroup(
                "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj",
                "rgspringbootservers",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootservers_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootserversListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootservers()
            .listByResourceGroup(
                "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj",
                "rgspringbootservers",
                com.azure.core.util.Context.NONE);
    }
}
```

### Springbootservers_ListBySubscription

```java
/** Samples for Springbootservers ListBySubscription. */
public final class SpringbootserversListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootservers_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_ListBySubscription_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootserversListBySubscriptionMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootservers()
            .listBySubscription(
                "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootservers_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_ListBySubscription_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootserversListBySubscriptionMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootservers()
            .listBySubscription(
                "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj", com.azure.core.util.Context.NONE);
    }
}
```

### Springbootservers_Update

```java
import com.azure.resourcemanager.offazurespringboot.models.SpringbootserversModel;

/** Samples for Springbootservers Update. */
public final class SpringbootserversUpdateSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootservers_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootserversUpdateMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        SpringbootserversModel resource =
            manager
                .springbootservers()
                .getWithResponse(
                    "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj",
                    "rgspringbootservers",
                    "zkarbqnwnxeozvjrkpdqmgnwedwgtwcmmyqwaijkn",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootservers_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootserversUpdateMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        SpringbootserversModel resource =
            manager
                .springbootservers()
                .getWithResponse(
                    "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj",
                    "rgspringbootservers",
                    "zkarbqnwnxeozvjrkpdqmgnwedwgtwcmmyqwaijkn",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
```

### Springbootsites_CreateOrUpdate

```java
import com.azure.resourcemanager.offazurespringboot.models.SpringbootsitesModelExtendedLocation;
import com.azure.resourcemanager.offazurespringboot.models.SpringbootsitesProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for Springbootsites CreateOrUpdate. */
public final class SpringbootsitesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootsites()
            .define("xrmzlavpewxtfeitghdrj")
            .withRegion("tgobtvxktootwhhvjtsmpddvlqlrq")
            .withExistingResourceGroup("rgspringbootsites")
            .withTags(mapOf("key3558", "fakeTokenPlaceholder"))
            .withProperties(
                new SpringbootsitesProperties()
                    .withMasterSiteId("xsoimrgshsactearljwuljmi")
                    .withMigrateProjectId("wwuattybgco"))
            .withExtendedLocation(
                new SpringbootsitesModelExtendedLocation().withType("lvsb").withName("rywvpbfsqovhlfirtwisugsdsfsgf"))
            .create();
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_CreateOrUpdate_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootsites()
            .define("xrmzlavpewxtfeitghdrj")
            .withRegion("tgobtvxktootwhhvjtsmpddvlqlrq")
            .withExistingResourceGroup("rgspringbootsites")
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

### Springbootsites_Delete

```java
/** Samples for Springbootsites Delete. */
public final class SpringbootsitesDeleteSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesDeleteMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootsites()
            .deleteByResourceGroupWithResponse(
                "rgspringbootsites", "xrmzlavpewxtfeitghdrj", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesDeleteMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootsites()
            .deleteByResourceGroupWithResponse(
                "rgspringbootsites", "xrmzlavpewxtfeitghdrj", com.azure.core.util.Context.NONE);
    }
}
```

### Springbootsites_GetByResourceGroup

```java
/** Samples for Springbootsites GetByResourceGroup. */
public final class SpringbootsitesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesGetMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootsites()
            .getByResourceGroupWithResponse(
                "rgspringbootsites", "xrmzlavpewxtfeitghdrj", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesGetMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootsites()
            .getByResourceGroupWithResponse(
                "rgspringbootsites", "xrmzlavpewxtfeitghdrj", com.azure.core.util.Context.NONE);
    }
}
```

### Springbootsites_List

```java
/** Samples for Springbootsites List. */
public final class SpringbootsitesListSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_ListBySubscription_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesListBySubscriptionMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager.springbootsites().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_ListBySubscription_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesListBySubscriptionMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager.springbootsites().list(com.azure.core.util.Context.NONE);
    }
}
```

### Springbootsites_ListByResourceGroup

```java
/** Samples for Springbootsites ListByResourceGroup. */
public final class SpringbootsitesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_ListByResourceGroup_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesListByResourceGroupMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager.springbootsites().listByResourceGroup("rgspringbootsites", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager.springbootsites().listByResourceGroup("rgspringbootsites", com.azure.core.util.Context.NONE);
    }
}
```

### Springbootsites_TriggerRefreshSite

```java
/** Samples for Springbootsites TriggerRefreshSite. */
public final class SpringbootsitesTriggerRefreshSiteSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_TriggerRefreshSite_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_TriggerRefreshSite_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesTriggerRefreshSiteMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootsites()
            .triggerRefreshSite("rgspringbootsites", "czarpuxwoafaqsuptutcwyu", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_TriggerRefreshSite_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_TriggerRefreshSite_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesTriggerRefreshSiteMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .springbootsites()
            .triggerRefreshSite("rgspringbootsites", "czarpuxwoafaqsuptutcwyu", com.azure.core.util.Context.NONE);
    }
}
```

### Springbootsites_Update

```java
import com.azure.resourcemanager.offazurespringboot.models.SpringbootsitesModel;
import java.util.HashMap;
import java.util.Map;

/** Samples for Springbootsites Update. */
public final class SpringbootsitesUpdateSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesUpdateMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        SpringbootsitesModel resource =
            manager
                .springbootsites()
                .getByResourceGroupWithResponse(
                    "rgspringbootsites", "xrmzlavpewxtfeitghdrj", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key9581", "fakeTokenPlaceholder")).apply();
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/springbootsites_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootsites_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void springbootsitesUpdateMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        SpringbootsitesModel resource =
            manager
                .springbootsites()
                .getByResourceGroupWithResponse(
                    "rgspringbootsites", "xrmzlavpewxtfeitghdrj", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
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

### Summaries_CreateOrUpdate

```java
import com.azure.resourcemanager.offazurespringboot.models.SummariesProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for Summaries CreateOrUpdate. */
public final class SummariesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/Summaries_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Summaries_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void summariesCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .summaries()
            .define("vjB")
            .withExistingSpringbootsite("rgspringbootdiscovery", "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps")
            .withTags(mapOf("key9287", "fakeTokenPlaceholder"))
            .withProperties(new SummariesProperties().withDiscoveredServers(22).withDiscoveredApps(24))
            .create();
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/Summaries_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: Summaries_CreateOrUpdate_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void summariesCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .summaries()
            .define("vjB")
            .withExistingSpringbootsite("rgspringbootdiscovery", "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps")
            .withProperties(new SummariesProperties())
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

### Summaries_Delete

```java
/** Samples for Summaries Delete. */
public final class SummariesDeleteSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/Summaries_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Summaries_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void summariesDeleteMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .summaries()
            .deleteWithResponse(
                "rgspringbootdiscovery",
                "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                "vjB",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/Summaries_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: Summaries_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void summariesDeleteMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .summaries()
            .deleteWithResponse(
                "rgspringbootdiscovery",
                "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                "vjB",
                com.azure.core.util.Context.NONE);
    }
}
```

### Summaries_Get

```java
/** Samples for Summaries Get. */
public final class SummariesGetSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/Summaries_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Summaries_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void summariesGetMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .summaries()
            .getWithResponse(
                "rgspringbootdiscovery",
                "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                "vjB",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/Summaries_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: Summaries_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void summariesGetMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .summaries()
            .getWithResponse(
                "rgspringbootdiscovery",
                "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                "vjB",
                com.azure.core.util.Context.NONE);
    }
}
```

### Summaries_ListBySite

```java
/** Samples for Summaries ListBySite. */
public final class SummariesListBySiteSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/Summaries_ListBySite_MaximumSet_Gen.json
     */
    /**
     * Sample code: Summaries_ListBySite_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void summariesListBySiteMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .summaries()
            .listBySite(
                "rgspringbootdiscovery", "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/Summaries_ListBySite_MinimumSet_Gen.json
     */
    /**
     * Sample code: Summaries_ListBySite_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void summariesListBySiteMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        manager
            .summaries()
            .listBySite(
                "rgspringbootdiscovery", "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps", com.azure.core.util.Context.NONE);
    }
}
```

### Summaries_Update

```java
import com.azure.resourcemanager.offazurespringboot.models.SummariesProperties;
import com.azure.resourcemanager.offazurespringboot.models.Summary;
import java.util.HashMap;
import java.util.Map;

/** Samples for Summaries Update. */
public final class SummariesUpdateSamples {
    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/Summaries_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: Summaries_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void summariesUpdateMinimumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        Summary resource =
            manager
                .summaries()
                .getWithResponse(
                    "rgspringbootdiscovery",
                    "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                    "vjB",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }

    /*
     * x-ms-original-file: specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/examples/Summaries_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Summaries_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to SpringAppsDiscoveryManager.
     */
    public static void summariesUpdateMaximumSetGen(
        com.azure.resourcemanager.offazurespringboot.SpringAppsDiscoveryManager manager) {
        Summary resource =
            manager
                .summaries()
                .getWithResponse(
                    "rgspringbootdiscovery",
                    "xxkzlvbihwxunadjcpjpjmghmhxrqyvghtpfps",
                    "vjB",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key2503", "fakeTokenPlaceholder"))
            .withProperties(new SummariesProperties().withDiscoveredServers(22).withDiscoveredApps(24))
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

