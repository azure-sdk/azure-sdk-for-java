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

## Snapshots

- [Create](#snapshots_create)
- [Delete](#snapshots_delete)
- [Get](#snapshots_get)
- [ListByVolumeGroup](#snapshots_listbyvolumegroup)
- [Update](#snapshots_update)

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
import com.azure.resourcemanager.elasticsan.models.ElasticSanCreateParameter;
import com.azure.resourcemanager.elasticsan.models.Sku;
import com.azure.resourcemanager.elasticsan.models.SkuName;
import com.azure.resourcemanager.elasticsan.models.SkuTier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ElasticSans Create. */
public final class ElasticSansCreateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/ElasticSans_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Create_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansCreateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .elasticSans()
            .create(
                "rgelasticsan",
                "gK0Xqt_l",
                new ElasticSanCreateParameter()
                    .withLocation("xowbvwkenks")
                    .withTags(mapOf("key286", "gpcwdldexltjcvnljbctycrdzw"))
                    .withSku(new Sku().withName(SkuName.PREMIUM_LRS).withTier(SkuTier.PREMIUM))
                    .withAvailabilityZones(Arrays.asList("ycz"))
                    .withBaseSizeTiB(16L)
                    .withExtendedCapacitySizeTiB(7L),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/ElasticSans_Create_MinimumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Create_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansCreateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .elasticSans()
            .create(
                "rgelasticsan",
                "gK0Xqt_l",
                new ElasticSanCreateParameter()
                    .withSku(new Sku().withName(SkuName.PREMIUM_LRS))
                    .withBaseSizeTiB(16L)
                    .withExtendedCapacitySizeTiB(7L),
                com.azure.core.util.Context.NONE);
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
/** Samples for ElasticSans Delete. */
public final class ElasticSansDeleteSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/ElasticSans_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansDeleteMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().delete("rgelasticsan", "gK0Xqt_l", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/ElasticSans_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansDeleteMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().delete("rgelasticsan", "gK0Xqt_l", com.azure.core.util.Context.NONE);
    }
}
```

### ElasticSans_GetByResourceGroup

```java
/** Samples for ElasticSans GetByResourceGroup. */
public final class ElasticSansGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/ElasticSans_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansGetMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .elasticSans()
            .getByResourceGroupWithResponse("rgelasticsan", "gK0Xqt_l", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/ElasticSans_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansGetMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .elasticSans()
            .getByResourceGroupWithResponse("rgelasticsan", "gK0Xqt_l", com.azure.core.util.Context.NONE);
    }
}
```

### ElasticSans_List

```java
/** Samples for ElasticSans List. */
public final class ElasticSansListSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/ElasticSans_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_ListBySubscription_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansListBySubscriptionMaximumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/ElasticSans_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_ListBySubscription_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansListBySubscriptionMinimumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().list(com.azure.core.util.Context.NONE);
    }
}
```

### ElasticSans_ListByResourceGroup

```java
/** Samples for ElasticSans ListByResourceGroup. */
public final class ElasticSansListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/ElasticSans_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_ListByResourceGroup_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansListByResourceGroupMinimumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().listByResourceGroup("rgelasticsan", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/ElasticSans_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.elasticSans().listByResourceGroup("rgelasticsan", com.azure.core.util.Context.NONE);
    }
}
```

### ElasticSans_Update

```java
import com.azure.resourcemanager.elasticsan.models.ElasticSanUpdate;
import java.util.HashMap;
import java.util.Map;

/** Samples for ElasticSans Update. */
public final class ElasticSansUpdateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/ElasticSans_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansUpdateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .elasticSans()
            .update("rgelasticsan", "gK0Xqt_l", new ElasticSanUpdate(), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/ElasticSans_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: ElasticSans_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void elasticSansUpdateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .elasticSans()
            .update(
                "rgelasticsan",
                "gK0Xqt_l",
                new ElasticSanUpdate()
                    .withTags(mapOf("key2579", "dwy"))
                    .withBaseSizeTiB(16L)
                    .withExtendedCapacitySizeTiB(22L),
                com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void operationsListMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void operationsListMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Skus_List

```java
/** Samples for Skus List. */
public final class SkusListSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Skus_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Skus_List_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void skusListMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.skus().list(null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Skus_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Skus_List_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void skusListMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.skus().list("bedmmzczbxgioilyrjlybymrcllor", com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_Create

```java
import com.azure.resourcemanager.elasticsan.models.SnapshotCreateParameter;
import com.azure.resourcemanager.elasticsan.models.SnapshotCreationData;
import java.util.HashMap;
import java.util.Map;

/** Samples for Snapshots Create. */
public final class SnapshotsCreateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Snapshots_Create_MinimumSet_Gen.json
     */
    /**
     * Sample code: Snapshots_Create_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void snapshotsCreateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .snapshots()
            .create(
                "rgelasticsan",
                "gK0Xqt_l",
                "kypb8-jS2-75o-7T_MrJeI_32E-I61",
                "q4d_67_ums.965e",
                new SnapshotCreateParameter()
                    .withCreationData(new SnapshotCreationData().withSourceUri("vnzgyexwwrbrbfdcxw")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Snapshots_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: Snapshots_Create_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void snapshotsCreateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .snapshots()
            .create(
                "rgelasticsan",
                "gK0Xqt_l",
                "kypb8-jS2-75o-7T_MrJeI_32E-I61",
                "q4d_67_ums.965e",
                new SnapshotCreateParameter()
                    .withTags(mapOf("key1478", "i"))
                    .withCreationData(new SnapshotCreationData().withSourceUri("vnzgyexwwrbrbfdcxw")),
                com.azure.core.util.Context.NONE);
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

### Snapshots_Delete

```java
/** Samples for Snapshots Delete. */
public final class SnapshotsDeleteSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Snapshots_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: Snapshots_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void snapshotsDeleteMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .snapshots()
            .delete(
                "rgelasticsan",
                "gK0Xqt_l",
                "kypb8-jS2-75o-7T_MrJeI_32E-I61",
                "q4d_67_ums.965e",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Snapshots_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Snapshots_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void snapshotsDeleteMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .snapshots()
            .delete(
                "rgelasticsan",
                "gK0Xqt_l",
                "kypb8-jS2-75o-7T_MrJeI_32E-I61",
                "q4d_67_ums.965e",
                com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_Get

```java
/** Samples for Snapshots Get. */
public final class SnapshotsGetSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Snapshots_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Snapshots_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void snapshotsGetMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .snapshots()
            .getWithResponse(
                "rgelasticsan",
                "gK0Xqt_l",
                "kypb8-jS2-75o-7T_MrJeI_32E-I61",
                "q4d_67_ums.965e",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Snapshots_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: Snapshots_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void snapshotsGetMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .snapshots()
            .getWithResponse(
                "rgelasticsan",
                "gK0Xqt_l",
                "kypb8-jS2-75o-7T_MrJeI_32E-I61",
                "q4d_67_ums.965e",
                com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_ListByVolumeGroup

```java
/** Samples for Snapshots ListByVolumeGroup. */
public final class SnapshotsListByVolumeGroupSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Snapshots_ListByVolumeGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Snapshots_ListByVolumeGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void snapshotsListByVolumeGroupMaximumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .snapshots()
            .listByVolumeGroup(
                "rgelasticsan",
                "gK0Xqt_l",
                "kypb8-jS2-75o-7T_MrJeI_32E-I61",
                "oewjnmn",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Snapshots_ListByVolumeGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: Snapshots_ListByVolumeGroup_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void snapshotsListByVolumeGroupMinimumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .snapshots()
            .listByVolumeGroup(
                "rgelasticsan", "gK0Xqt_l", "kypb8-jS2-75o-7T_MrJeI_32E-I61", null, com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_Update

```java
import com.azure.resourcemanager.elasticsan.models.SnapshotUpdate;
import java.util.HashMap;
import java.util.Map;

/** Samples for Snapshots Update. */
public final class SnapshotsUpdateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Snapshots_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Snapshots_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void snapshotsUpdateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .snapshots()
            .updateWithResponse(
                "rgelasticsan",
                "gK0Xqt_l",
                "kypb8-jS2-75o-7T_MrJeI_32E-I61",
                "q4d_67_ums.965e",
                new SnapshotUpdate().withTags(mapOf("key7955", "daianlnloihpdq")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Snapshots_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: Snapshots_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void snapshotsUpdateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .snapshots()
            .updateWithResponse(
                "rgelasticsan",
                "gK0Xqt_l",
                "kypb8-jS2-75o-7T_MrJeI_32E-I61",
                "q4d_67_ums.965e",
                new SnapshotUpdate(),
                com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/VolumeGroups_Create_MinimumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Create_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsCreateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumeGroups()
            .define("kypb8-jS2-75o-7T_MrJeI_32E-I61")
            .withExistingElasticSan("rgelasticsan", "gK0Xqt_l")
            .create();
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/VolumeGroups_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Create_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsCreateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumeGroups()
            .define("kypb8-jS2-75o-7T_MrJeI_32E-I61")
            .withExistingElasticSan("rgelasticsan", "gK0Xqt_l")
            .withTags(mapOf("key3042", "kbcbiivskcojixplxgmipembcme"))
            .withProtocolType(StorageTargetType.ISCSI)
            .withEncryption(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY)
            .withNetworkAcls(
                new NetworkRuleSet()
                    .withVirtualNetworkRules(
                        Arrays
                            .asList(
                                new VirtualNetworkRule()
                                    .withVirtualNetworkResourceId("xeqiwideellnmojfxvzmd")
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
/** Samples for VolumeGroups Delete. */
public final class VolumeGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/VolumeGroups_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsDeleteMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumeGroups()
            .delete("rgelasticsan", "gK0Xqt_l", "kypb8-jS2-75o-7T_MrJeI_32E-I61", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/VolumeGroups_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsDeleteMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumeGroups()
            .delete("rgelasticsan", "gK0Xqt_l", "kypb8-jS2-75o-7T_MrJeI_32E-I61", com.azure.core.util.Context.NONE);
    }
}
```

### VolumeGroups_Get

```java
/** Samples for VolumeGroups Get. */
public final class VolumeGroupsGetSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/VolumeGroups_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsGetMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumeGroups()
            .getWithResponse(
                "rgelasticsan", "gK0Xqt_l", "kypb8-jS2-75o-7T_MrJeI_32E-I61", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/VolumeGroups_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsGetMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumeGroups()
            .getWithResponse(
                "rgelasticsan", "gK0Xqt_l", "kypb8-jS2-75o-7T_MrJeI_32E-I61", com.azure.core.util.Context.NONE);
    }
}
```

### VolumeGroups_ListByElasticSan

```java
/** Samples for VolumeGroups ListByElasticSan. */
public final class VolumeGroupsListByElasticSanSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/VolumeGroups_ListByElasticSan_MinimumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_ListByElasticSan_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsListByElasticSanMinimumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.volumeGroups().listByElasticSan("rgelasticsan", "gK0Xqt_l", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/VolumeGroups_ListByElasticSan_MaximumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_ListByElasticSan_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsListByElasticSanMaximumSetGen(
        com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager.volumeGroups().listByElasticSan("rgelasticsan", "gK0Xqt_l", com.azure.core.util.Context.NONE);
    }
}
```

### VolumeGroups_Update

```java
import com.azure.resourcemanager.elasticsan.models.EncryptionType;
import com.azure.resourcemanager.elasticsan.models.StorageTargetType;
import com.azure.resourcemanager.elasticsan.models.VolumeGroup;
import java.util.HashMap;
import java.util.Map;

/** Samples for VolumeGroups Update. */
public final class VolumeGroupsUpdateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/VolumeGroups_Update_MaximumSet_Gen.json
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
                .getWithResponse(
                    "rgelasticsan", "gK0Xqt_l", "kypb8-jS2-75o-7T_MrJeI_32E-I61", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key1555", "f"))
            .withProtocolType(StorageTargetType.ISCSI)
            .withEncryption(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY)
            .apply();
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/VolumeGroups_Update_MinimumSet_Gen.json
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
                .getWithResponse(
                    "rgelasticsan", "gK0Xqt_l", "kypb8-jS2-75o-7T_MrJeI_32E-I61", com.azure.core.util.Context.NONE)
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
import com.azure.resourcemanager.elasticsan.models.VolumeCreateParameter;
import java.util.HashMap;
import java.util.Map;

/** Samples for Volumes Create. */
public final class VolumesCreateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Volumes_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Create_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesCreateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .create(
                "rgelasticsan",
                "gK0Xqt_l",
                "kypb8-jS2-75o-7T_MrJeI_32E-I61",
                "3e-5",
                new VolumeCreateParameter()
                    .withTags(mapOf("key771", "hehvfomthzftrtugbohtwgvnhvic"))
                    .withCreationData(
                        new SourceCreationData()
                            .withCreateSource(VolumeCreateOption.NONE)
                            .withSourceUri("mtxprdnmqwrwlsffwhaczvdpxl"))
                    .withSizeGiB(6L),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Volumes_Create_MinimumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Create_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesCreateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .create(
                "rgelasticsan",
                "gK0Xqt_l",
                "kypb8-jS2-75o-7T_MrJeI_32E-I61",
                "3e-5",
                new VolumeCreateParameter().withSizeGiB(6L),
                com.azure.core.util.Context.NONE);
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
/** Samples for Volumes Delete. */
public final class VolumesDeleteSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Volumes_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesDeleteMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .delete(
                "rgelasticsan", "gK0Xqt_l", "kypb8-jS2-75o-7T_MrJeI_32E-I61", "3e-5", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Volumes_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesDeleteMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .delete(
                "rgelasticsan", "gK0Xqt_l", "kypb8-jS2-75o-7T_MrJeI_32E-I61", "3e-5", com.azure.core.util.Context.NONE);
    }
}
```

### Volumes_Get

```java
/** Samples for Volumes Get. */
public final class VolumesGetSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Volumes_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesGetMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .getWithResponse(
                "rgelasticsan", "gK0Xqt_l", "kypb8-jS2-75o-7T_MrJeI_32E-I61", "3e-5", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Volumes_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesGetMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .getWithResponse(
                "rgelasticsan", "gK0Xqt_l", "kypb8-jS2-75o-7T_MrJeI_32E-I61", "3e-5", com.azure.core.util.Context.NONE);
    }
}
```

### Volumes_ListByVolumeGroup

```java
/** Samples for Volumes ListByVolumeGroup. */
public final class VolumesListByVolumeGroupSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Volumes_ListByVolumeGroup_MaximumSet_Gen.json
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
            .listByVolumeGroup(
                "rgelasticsan", "gK0Xqt_l", "kypb8-jS2-75o-7T_MrJeI_32E-I61", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Volumes_ListByVolumeGroup_MinimumSet_Gen.json
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
            .listByVolumeGroup(
                "rgelasticsan", "gK0Xqt_l", "kypb8-jS2-75o-7T_MrJeI_32E-I61", com.azure.core.util.Context.NONE);
    }
}
```

### Volumes_Update

```java
import com.azure.resourcemanager.elasticsan.models.VolumeUpdate;
import java.util.HashMap;
import java.util.Map;

/** Samples for Volumes Update. */
public final class VolumesUpdateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Volumes_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesUpdateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .update(
                "rgelasticsan",
                "gK0Xqt_l",
                "kypb8-jS2-75o-7T_MrJeI_32E-I61",
                "3e-5",
                new VolumeUpdate(),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2023-01-01/examples/Volumes_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Volumes_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumesUpdateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        manager
            .volumes()
            .update(
                "rgelasticsan",
                "gK0Xqt_l",
                "kypb8-jS2-75o-7T_MrJeI_32E-I61",
                "3e-5",
                new VolumeUpdate().withTags(mapOf("key4429", "mcnxoewapph")).withSizeGiB(8L),
                com.azure.core.util.Context.NONE);
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

