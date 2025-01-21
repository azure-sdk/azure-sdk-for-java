# Code snippets and samples


## GenerateAwsTemplate

- [Post](#generateawstemplate_post)

## Inventory

- [Get](#inventory_get)
- [ListBySolutionConfiguration](#inventory_listbysolutionconfiguration)

## PublicCloudConnectors

- [CreateOrUpdate](#publiccloudconnectors_createorupdate)
- [Delete](#publiccloudconnectors_delete)
- [GetByResourceGroup](#publiccloudconnectors_getbyresourcegroup)
- [List](#publiccloudconnectors_list)
- [ListByResourceGroup](#publiccloudconnectors_listbyresourcegroup)
- [TestPermissions](#publiccloudconnectors_testpermissions)
- [Update](#publiccloudconnectors_update)

## SolutionConfigurations

- [CreateOrUpdate](#solutionconfigurations_createorupdate)
- [Delete](#solutionconfigurations_delete)
- [Get](#solutionconfigurations_get)
- [List](#solutionconfigurations_list)
- [SyncNow](#solutionconfigurations_syncnow)
- [Update](#solutionconfigurations_update)

## SolutionTypes

- [GetByResourceGroup](#solutiontypes_getbyresourcegroup)
- [List](#solutiontypes_list)
- [ListByResourceGroup](#solutiontypes_listbyresourcegroup)
### GenerateAwsTemplate_Post

```java
import com.azure.resourcemanager.hybridconnectivity.models.GenerateAwsTemplateRequest;
import com.azure.resourcemanager.hybridconnectivity.models.SolutionSettings;
import com.azure.resourcemanager.hybridconnectivity.models.SolutionTypeSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for GenerateAwsTemplate Post.
 */
public final class GenerateAwsTemplatePostSamples {
    /*
     * x-ms-original-file: 2024-12-01/GenerateAwsTemplate_Post.json
     */
    /**
     * Sample code: GenerateAwsTemplate_Post.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void
        generateAwsTemplatePost(com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.generateAwsTemplates()
            .postWithResponse(
                new GenerateAwsTemplateRequest().withConnectorId("pnxcfjidglabnwxit")
                    .withSolutionTypes(Arrays.asList(new SolutionTypeSettings().withSolutionType("hjyownzpfxwiufmd")
                        .withSolutionSettings(new SolutionSettings().withAdditionalProperties(mapOf())))),
                com.azure.core.util.Context.NONE);
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

### Inventory_Get

```java
/**
 * Samples for Inventory Get.
 */
public final class InventoryGetSamples {
    /*
     * x-ms-original-file: 2024-12-01/Inventory_Get.json
     */
    /**
     * Sample code: Inventory_Get.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void inventoryGet(com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.inventories()
            .getWithResponse("ymuj", "zarfsraogroxlaqjjnwixtn", "xofprmcboosrbd", com.azure.core.util.Context.NONE);
    }
}
```

### Inventory_ListBySolutionConfiguration

```java
/**
 * Samples for Inventory ListBySolutionConfiguration.
 */
public final class InventoryListBySolutionConfigurationSamples {
    /*
     * x-ms-original-file: 2024-12-01/Inventory_ListBySolutionConfiguration.json
     */
    /**
     * Sample code: Inventory_ListBySolutionConfiguration.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void inventoryListBySolutionConfiguration(
        com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.inventories().listBySolutionConfiguration("ymuj", "wsxt", com.azure.core.util.Context.NONE);
    }
}
```

### PublicCloudConnectors_CreateOrUpdate

```java
import com.azure.resourcemanager.hybridconnectivity.models.AwsCloudProfile;
import com.azure.resourcemanager.hybridconnectivity.models.HostType;
import com.azure.resourcemanager.hybridconnectivity.models.PublicCloudConnectorProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for PublicCloudConnectors CreateOrUpdate.
 */
public final class PublicCloudConnectorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2024-12-01/PublicCloudConnectors_CreateOrUpdate.json
     */
    /**
     * Sample code: PublicCloudConnectors_CreateOrUpdate.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void publicCloudConnectorsCreateOrUpdate(
        com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.publicCloudConnectors()
            .define("advjwoakdusalamomg")
            .withRegion("jpiglusfxynfcewcjwvvnn")
            .withExistingResourceGroup("rgpublicCloud")
            .withTags(mapOf())
            .withProperties(new PublicCloudConnectorProperties()
                .withAwsCloudProfile(new AwsCloudProfile().withAccountId("snbnuxckevyqpm")
                    .withExcludedAccounts(Arrays.asList("rwgqpukglvbqmogqcliqolucp"))
                    .withIsOrganizationalAccount(true))
                .withHostType(HostType.AWS))
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

### PublicCloudConnectors_Delete

```java
/**
 * Samples for PublicCloudConnectors Delete.
 */
public final class PublicCloudConnectorsDeleteSamples {
    /*
     * x-ms-original-file: 2024-12-01/PublicCloudConnectors_Delete.json
     */
    /**
     * Sample code: PublicCloudConnectors_Delete.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void
        publicCloudConnectorsDelete(com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.publicCloudConnectors()
            .deleteByResourceGroupWithResponse("rgpublicCloud", "skcfyjvflkhibdywjay",
                com.azure.core.util.Context.NONE);
    }
}
```

### PublicCloudConnectors_GetByResourceGroup

```java
/**
 * Samples for PublicCloudConnectors GetByResourceGroup.
 */
public final class PublicCloudConnectorsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-12-01/PublicCloudConnectors_Get.json
     */
    /**
     * Sample code: PublicCloudConnectors_Get.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void
        publicCloudConnectorsGet(com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.publicCloudConnectors()
            .getByResourceGroupWithResponse("rgpublicCloud", "rzygvnpsnrdylwzdbsscjazvamyxmh",
                com.azure.core.util.Context.NONE);
    }
}
```

### PublicCloudConnectors_List

```java
/**
 * Samples for PublicCloudConnectors List.
 */
public final class PublicCloudConnectorsListSamples {
    /*
     * x-ms-original-file: 2024-12-01/PublicCloudConnectors_ListBySubscription.json
     */
    /**
     * Sample code: PublicCloudConnectors_ListBySubscription.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void publicCloudConnectorsListBySubscription(
        com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.publicCloudConnectors().list(com.azure.core.util.Context.NONE);
    }
}
```

### PublicCloudConnectors_ListByResourceGroup

```java
/**
 * Samples for PublicCloudConnectors ListByResourceGroup.
 */
public final class PublicCloudConnectorsListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-12-01/PublicCloudConnectors_ListByResourceGroup.json
     */
    /**
     * Sample code: PublicCloudConnectors_ListByResourceGroup.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void publicCloudConnectorsListByResourceGroup(
        com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.publicCloudConnectors().listByResourceGroup("rgpublicCloud", com.azure.core.util.Context.NONE);
    }
}
```

### PublicCloudConnectors_TestPermissions

```java
/**
 * Samples for PublicCloudConnectors TestPermissions.
 */
public final class PublicCloudConnectorsTestPermissionsSamples {
    /*
     * x-ms-original-file: 2024-12-01/PublicCloudConnectors_TestPermissions.json
     */
    /**
     * Sample code: PublicCloudConnectors_TestPermissions.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void publicCloudConnectorsTestPermissions(
        com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.publicCloudConnectors()
            .testPermissions("rgpublicCloud", "rzygvnpsnrdylwzdbsscjazvamyxmh", com.azure.core.util.Context.NONE);
    }
}
```

### PublicCloudConnectors_Update

```java
import com.azure.resourcemanager.hybridconnectivity.models.AwsCloudProfile;
import com.azure.resourcemanager.hybridconnectivity.models.PublicCloudConnector;
import com.azure.resourcemanager.hybridconnectivity.models.PublicCloudConnectorProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for PublicCloudConnectors Update.
 */
public final class PublicCloudConnectorsUpdateSamples {
    /*
     * x-ms-original-file: 2024-12-01/PublicCloudConnectors_Update.json
     */
    /**
     * Sample code: PublicCloudConnectors_Update.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void
        publicCloudConnectorsUpdate(com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        PublicCloudConnector resource = manager.publicCloudConnectors()
            .getByResourceGroupWithResponse("rgpublicCloud", "svtirlbyqpepbzyessjenlueeznhg",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf())
            .withProperties(new PublicCloudConnectorProperties()
                .withAwsCloudProfile(new AwsCloudProfile().withExcludedAccounts(Arrays.asList("zrbtd"))))
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

### SolutionConfigurations_CreateOrUpdate

```java
import com.azure.resourcemanager.hybridconnectivity.models.SolutionConfigurationProperties;
import com.azure.resourcemanager.hybridconnectivity.models.SolutionSettings;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SolutionConfigurations CreateOrUpdate.
 */
public final class SolutionConfigurationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2024-12-01/SolutionConfigurations_CreateOrUpdate.json
     */
    /**
     * Sample code: SolutionConfigurations_CreateOrUpdate.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void solutionConfigurationsCreateOrUpdate(
        com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.solutionConfigurations()
            .define("keebwujt")
            .withExistingResourceUri("ymuj")
            .withProperties(new SolutionConfigurationProperties().withSolutionType("nmtqllkyohwtsthxaimsye")
                .withSolutionSettings(new SolutionSettings().withAdditionalProperties(mapOf())))
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

### SolutionConfigurations_Delete

```java
/**
 * Samples for SolutionConfigurations Delete.
 */
public final class SolutionConfigurationsDeleteSamples {
    /*
     * x-ms-original-file: 2024-12-01/SolutionConfigurations_Delete.json
     */
    /**
     * Sample code: SolutionConfigurations_Delete.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void
        solutionConfigurationsDelete(com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.solutionConfigurations()
            .deleteByResourceGroupWithResponse("ymuj", "stu", com.azure.core.util.Context.NONE);
    }
}
```

### SolutionConfigurations_Get

```java
/**
 * Samples for SolutionConfigurations Get.
 */
public final class SolutionConfigurationsGetSamples {
    /*
     * x-ms-original-file: 2024-12-01/SolutionConfigurations_Get.json
     */
    /**
     * Sample code: SolutionConfigurations_Get.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void
        solutionConfigurationsGet(com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.solutionConfigurations().getWithResponse("ymuj", "tks", com.azure.core.util.Context.NONE);
    }
}
```

### SolutionConfigurations_List

```java
/**
 * Samples for SolutionConfigurations List.
 */
public final class SolutionConfigurationsListSamples {
    /*
     * x-ms-original-file: 2024-12-01/SolutionConfigurations_List.json
     */
    /**
     * Sample code: SolutionConfigurations_List.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void
        solutionConfigurationsList(com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.solutionConfigurations().list("ymuj", com.azure.core.util.Context.NONE);
    }
}
```

### SolutionConfigurations_SyncNow

```java
/**
 * Samples for SolutionConfigurations SyncNow.
 */
public final class SolutionConfigurationsSyncNowSamples {
    /*
     * x-ms-original-file: 2024-12-01/SolutionConfigurations_SyncNow.json
     */
    /**
     * Sample code: SolutionConfigurations_SyncNow.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void
        solutionConfigurationsSyncNow(com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.solutionConfigurations().syncNow("ymuj", "tks", com.azure.core.util.Context.NONE);
    }
}
```

### SolutionConfigurations_Update

```java
import com.azure.resourcemanager.hybridconnectivity.models.SolutionConfiguration;
import com.azure.resourcemanager.hybridconnectivity.models.SolutionConfigurationProperties;
import com.azure.resourcemanager.hybridconnectivity.models.SolutionSettings;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SolutionConfigurations Update.
 */
public final class SolutionConfigurationsUpdateSamples {
    /*
     * x-ms-original-file: 2024-12-01/SolutionConfigurations_Update.json
     */
    /**
     * Sample code: SolutionConfigurations_Update.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void
        solutionConfigurationsUpdate(com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        SolutionConfiguration resource = manager.solutionConfigurations()
            .getWithResponse("ymuj", "dxt", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new SolutionConfigurationProperties().withSolutionType("myzljlstvmgkp")
                .withSolutionSettings(new SolutionSettings().withAdditionalProperties(mapOf())))
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

### SolutionTypes_GetByResourceGroup

```java
/**
 * Samples for SolutionTypes GetByResourceGroup.
 */
public final class SolutionTypesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-12-01/SolutionTypes_Get.json
     */
    /**
     * Sample code: SolutionTypes_Get.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void
        solutionTypesGet(com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.solutionTypes()
            .getByResourceGroupWithResponse("rgpublicCloud", "lulzqllpu", com.azure.core.util.Context.NONE);
    }
}
```

### SolutionTypes_List

```java
/**
 * Samples for SolutionTypes List.
 */
public final class SolutionTypesListSamples {
    /*
     * x-ms-original-file: 2024-12-01/SolutionTypes_ListBySubscription.json
     */
    /**
     * Sample code: SolutionTypes_ListBySubscription.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void solutionTypesListBySubscription(
        com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.solutionTypes().list(com.azure.core.util.Context.NONE);
    }
}
```

### SolutionTypes_ListByResourceGroup

```java
/**
 * Samples for SolutionTypes ListByResourceGroup.
 */
public final class SolutionTypesListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-12-01/SolutionTypes_ListByResourceGroup.json
     */
    /**
     * Sample code: SolutionTypes_ListByResourceGroup.
     * 
     * @param manager Entry point to HybridConnectivityManager.
     */
    public static void solutionTypesListByResourceGroup(
        com.azure.resourcemanager.hybridconnectivity.HybridConnectivityManager manager) {
        manager.solutionTypes().listByResourceGroup("rgpublicCloud", com.azure.core.util.Context.NONE);
    }
}
```

