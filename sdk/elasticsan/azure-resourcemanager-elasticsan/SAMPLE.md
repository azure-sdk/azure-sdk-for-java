# Code snippets and samples


## ElasticSans

- [Create](#elasticsans_create)
- [Delete](#elasticsans_delete)
- [GetByResourceGroup](#elasticsans_getbyresourcegroup)
- [List](#elasticsans_list)
- [ListByResourceGroup](#elasticsans_listbyresourcegroup)
- [Update](#elasticsans_update)

## Operations

- [List](#operations_list)

## Skus

- [List](#skus_list)

## VolumeGroups

- [Create](#volumegroups_create)
- [Delete](#volumegroups_delete)
- [Get](#volumegroups_get)
- [ListByElasticSan](#volumegroups_listbyelasticsan)
- [Update](#volumegroups_update)

## Volumes

- [Create](#volumes_create)
- [Delete](#volumes_delete)
- [Get](#volumes_get)
- [ListByVolumeGroup](#volumes_listbyvolumegroup)
- [Update](#volumes_update)
### ElasticSans_Create

```java
import com.azure.resourcemanager.elasticsan.models.Name;
import com.azure.resourcemanager.elasticsan.models.Sku;
import com.azure.resourcemanager.elasticsan.models.Tier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ElasticSans Create. */
public final class ElasticSansCreateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/ElasticSans_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Create_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansCreateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .elasticSans()
            .define("51pt_7LR_t13")
            .withRegion("aaaaaaaaaaa")
            .withExistingResourceGroup("rgelasticsan")
            .withTags(mapOf("key902", "aaaaaaaaaaaaa"))
            .withSku(new Sku().withName(Name.STANDARD_LRS).withTier(Tier.fromString("Standard")))
            .withAvailabilityZones(Arrays.asList("aaa"))
            .withBaseSizeTiB(17L)
            .withExtendedCapacitySizeTiB(17L)
            .create();
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/ElasticSans_Create_MinimumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Create_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansCreateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .elasticSans()
            .define("51pt_7LR_t13")
            .withRegion((String) null)
            .withExistingResourceGroup("rgelasticsan")
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

### ElasticSans_Delete

```java
import com.azure.core.util.Context;

/** Samples for ElasticSans Delete. */
public final class ElasticSansDeleteSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/ElasticSans_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansDeleteMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().delete("rgelasticsan", "51pt_7LR_t13", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/ElasticSans_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansDeleteMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().delete("rgelasticsan", "51pt_7LR_t13", true, Context.NONE);
    }
}
```

### ElasticSans_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ElasticSans GetByResourceGroup. */
public final class ElasticSansGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/ElasticSans_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansGetMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().getByResourceGroupWithResponse("rgelasticsan", "51pt_7LR_t13", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/ElasticSans_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansGetMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().getByResourceGroupWithResponse("rgelasticsan", "51pt_7LR_t13", Context.NONE);
    }
}
```

### ElasticSans_List

```java
import com.azure.core.util.Context;

/** Samples for ElasticSans List. */
public final class ElasticSansListSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/ElasticSans_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_ListBySubscription_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansListBySubscriptionMaximumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().list(Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/ElasticSans_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_ListBySubscription_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansListBySubscriptionMinimumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().list(Context.NONE);
    }
}
```

### ElasticSans_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ElasticSans ListByResourceGroup. */
public final class ElasticSansListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/ElasticSans_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_ListByResourceGroup_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansListByResourceGroupMinimumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().listByResourceGroup("rgelasticsan", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/ElasticSans_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().listByResourceGroup("rgelasticsan", Context.NONE);
    }
}
```

### ElasticSans_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.elasticsan.models.ElasticSan;
import java.util.HashMap;
import java.util.Map;

/** Samples for ElasticSans Update. */
public final class ElasticSansUpdateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/ElasticSans_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansUpdateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        ElasticSan resource =
            manager
                .elasticSans()
                .getByResourceGroupWithResponse("rgelasticsan", "51pt_7LR_t13", Context.NONE)
                .getValue();
        resource.update().apply();
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/ElasticSans_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansUpdateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        ElasticSan resource =
            manager
                .elasticSans()
                .getByResourceGroupWithResponse("rgelasticsan", "51pt_7LR_t13", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key5304", "aa")).apply();
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
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void operationsListMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.operations().list(Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void operationsListMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

### Skus_List

```java
import com.azure.core.util.Context;

/** Samples for Skus List. */
public final class SkusListSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Skus_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Skus_List_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void skusListMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.skus().list(null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Skus_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Skus_List_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void skusListMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.skus().list("aaaaaaaaaaa", Context.NONE);
    }
}
```

### VolumeGroups_Create

```java
import com.azure.resourcemanager.elasticsan.models.Action;
import com.azure.resourcemanager.elasticsan.models.EncryptionType;
import com.azure.resourcemanager.elasticsan.models.NetworkRuleSet;
import com.azure.resourcemanager.elasticsan.models.StorageTargetType;
import com.azure.resourcemanager.elasticsan.models.VirtualNetworkRule;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for VolumeGroups Create. */
public final class VolumeGroupsCreateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/VolumeGroups_Create_MinimumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Create_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsCreateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumeGroups()
            .define("5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y")
            .withRegion((String) null)
            .withExistingElasticSan("rgelasticsan", "51pt_7LR_t13")
            .create();
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/VolumeGroups_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Create_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsCreateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumeGroups()
            .define("5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y")
            .withRegion("aaaaaaaaaaaaaa")
            .withExistingElasticSan("rgelasticsan", "51pt_7LR_t13")
            .withTags(mapOf("key7241", "aaaaaaaaaaaaaaaaa"))
            .withProtocolType(StorageTargetType.ISCSI)
            .withEncryption(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY)
            .withNetworkAcls(
                new NetworkRuleSet()
                    .withVirtualNetworkRules(
                        Arrays
                            .asList(
                                new VirtualNetworkRule()
                                    .withVirtualNetworkResourceId("aaaaaaaaaaaaaaaaaaaa")
                                    .withAction(Action.ALLOW))))
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

### VolumeGroups_Delete

```java
import com.azure.core.util.Context;

/** Samples for VolumeGroups Delete. */
public final class VolumeGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/VolumeGroups_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsDeleteMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumeGroups()
            .delete("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/VolumeGroups_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsDeleteMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumeGroups()
            .delete("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", true, Context.NONE);
    }
}
```

### VolumeGroups_Get

```java
import com.azure.core.util.Context;

/** Samples for VolumeGroups Get. */
public final class VolumeGroupsGetSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/VolumeGroups_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsGetMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumeGroups()
            .getWithResponse("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/VolumeGroups_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsGetMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumeGroups()
            .getWithResponse("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", Context.NONE);
    }
}
```

### VolumeGroups_ListByElasticSan

```java
import com.azure.core.util.Context;

/** Samples for VolumeGroups ListByElasticSan. */
public final class VolumeGroupsListByElasticSanSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/VolumeGroups_ListByElasticSan_MinimumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_ListByElasticSan_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsListByElasticSanMinimumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.volumeGroups().listByElasticSan("rgelasticsan", "51pt_7LR_t13", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/VolumeGroups_ListByElasticSan_MaximumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_ListByElasticSan_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsListByElasticSanMaximumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.volumeGroups().listByElasticSan("rgelasticsan", "51pt_7LR_t13", Context.NONE);
    }
}
```

### VolumeGroups_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.elasticsan.models.EncryptionType;
import com.azure.resourcemanager.elasticsan.models.StorageTargetType;
import com.azure.resourcemanager.elasticsan.models.VolumeGroup;
import java.util.HashMap;
import java.util.Map;

/** Samples for VolumeGroups Update. */
public final class VolumeGroupsUpdateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/VolumeGroups_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsUpdateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        VolumeGroup resource =
            manager
                .volumeGroups()
                .getWithResponse("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key1832", "aaaaaaaaaaaaaaaaaa"))
            .withProtocolType(StorageTargetType.ISCSI)
            .withEncryption(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY)
            .apply();
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/VolumeGroups_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsUpdateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        VolumeGroup resource =
            manager
                .volumeGroups()
                .getWithResponse("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", Context.NONE)
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

### Volumes_Create

```java
import com.azure.resourcemanager.elasticsan.models.SourceCreationData;
import com.azure.resourcemanager.elasticsan.models.VolumeCreateOption;
import java.util.HashMap;
import java.util.Map;

/** Samples for Volumes Create. */
public final class VolumesCreateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Volumes_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Create_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesCreateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .define("6p-DA22")
            .withExistingVolumegroup("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y")
            .withTags(mapOf("key7776", "aaaaaaaaaaaaaaaaaaaaaaaaaa"))
            .withCreationData(
                new SourceCreationData()
                    .withCreateSource(VolumeCreateOption.NONE)
                    .withSourceUri("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"))
            .withSizeGiB(21L)
            .create();
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Volumes_Create_MinimumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Create_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesCreateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .define("6p-DA22")
            .withExistingVolumegroup("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y")
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

### Volumes_Delete

```java
import com.azure.core.util.Context;

/** Samples for Volumes Delete. */
public final class VolumesDeleteSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Volumes_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesDeleteMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .delete("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", "6p-DA22", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Volumes_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesDeleteMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .delete("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", "6p-DA22", Context.NONE);
    }
}
```

### Volumes_Get

```java
import com.azure.core.util.Context;

/** Samples for Volumes Get. */
public final class VolumesGetSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Volumes_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesGetMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .getWithResponse("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", "6p-DA22", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Volumes_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesGetMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .getWithResponse("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", "6p-DA22", Context.NONE);
    }
}
```

### Volumes_ListByVolumeGroup

```java
import com.azure.core.util.Context;

/** Samples for Volumes ListByVolumeGroup. */
public final class VolumesListByVolumeGroupSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Volumes_ListByVolumeGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Volumes_ListByVolumeGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesListByVolumeGroupMaximumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .listByVolumeGroup("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Volumes_ListByVolumeGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: Volumes_ListByVolumeGroup_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesListByVolumeGroupMinimumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .listByVolumeGroup("rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", Context.NONE);
    }
}
```

### Volumes_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.elasticsan.models.Volume;
import java.util.HashMap;
import java.util.Map;

/** Samples for Volumes Update. */
public final class VolumesUpdateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Volumes_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesUpdateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        Volume resource =
            manager
                .volumes()
                .getWithResponse(
                    "rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", "6p-DA22", Context.NONE)
                .getValue();
        resource.update().apply();
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/preview/2021-11-20-preview/examples/Volumes_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesUpdateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        Volume resource =
            manager
                .volumes()
                .getWithResponse(
                    "rgelasticsan", "51pt_7LR_t13", "5lvMpyp_h8p3_iqe-5Xa_2458_9-0Y", "6p-DA22", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key3286", "aaaaaaaaaaaaaaaaaaaaaaa")).withSizeGiB(13L).apply();
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

