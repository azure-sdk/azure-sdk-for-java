# Code snippets and samples


## AccessPolicy

- [CreateUpdate](#accesspolicy_createupdate)
- [Delete](#accesspolicy_delete)
- [Get](#accesspolicy_get)
- [List](#accesspolicy_list)

## AccessPolicyAssignment

- [CreateUpdate](#accesspolicyassignment_createupdate)
- [Delete](#accesspolicyassignment_delete)
- [Get](#accesspolicyassignment_get)
- [List](#accesspolicyassignment_list)

## AsyncOperationStatus

- [Get](#asyncoperationstatus_get)

## FirewallRules

- [CreateOrUpdate](#firewallrules_createorupdate)
- [Delete](#firewallrules_delete)
- [Get](#firewallrules_get)
- [List](#firewallrules_list)

## LinkedServer

- [Create](#linkedserver_create)
- [Delete](#linkedserver_delete)
- [Get](#linkedserver_get)
- [List](#linkedserver_list)

## Operations

- [List](#operations_list)

## PatchSchedules

- [CreateOrUpdate](#patchschedules_createorupdate)
- [Delete](#patchschedules_delete)
- [Get](#patchschedules_get)
- [ListByRedisResource](#patchschedules_listbyredisresource)

## PrivateEndpointConnections

- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [List](#privateendpointconnections_list)
- [Put](#privateendpointconnections_put)

## PrivateLinkResources

- [ListByRedisCache](#privatelinkresources_listbyrediscache)

## Redis

- [CheckNameAvailability](#redis_checknameavailability)
- [Create](#redis_create)
- [Delete](#redis_delete)
- [ExportData](#redis_exportdata)
- [FlushCache](#redis_flushcache)
- [ForceReboot](#redis_forcereboot)
- [GetByResourceGroup](#redis_getbyresourcegroup)
- [ImportData](#redis_importdata)
- [List](#redis_list)
- [ListByResourceGroup](#redis_listbyresourcegroup)
- [ListKeys](#redis_listkeys)
- [ListUpgradeNotifications](#redis_listupgradenotifications)
- [RegenerateKey](#redis_regeneratekey)
- [Update](#redis_update)
### AccessPolicy_CreateUpdate

```java
/**
 * Samples for AccessPolicy CreateUpdate.
 */
public final class AccessPolicyCreateUpdateSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheAccessPolicyCreateUpdate.json
     */
    /**
     * Sample code: RedisCacheAccessPolicyCreateUpdate.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void
        redisCacheAccessPolicyCreateUpdate(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.accessPolicies()
            .define("accessPolicy1")
            .withExistingRedi("rg1", "cache1")
            .withPermissions("+get +hget")
            .create();
    }
}
```

### AccessPolicy_Delete

```java
/**
 * Samples for AccessPolicy Delete.
 */
public final class AccessPolicyDeleteSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheAccessPolicyDelete.json
     */
    /**
     * Sample code: RedisCacheAccessPolicyDelete.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheAccessPolicyDelete(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.accessPolicies().delete("rg1", "cache1", "accessPolicy1", com.azure.core.util.Context.NONE);
    }
}
```

### AccessPolicy_Get

```java
/**
 * Samples for AccessPolicy Get.
 */
public final class AccessPolicyGetSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheAccessPolicyGet.json
     */
    /**
     * Sample code: RedisCacheAccessPolicyGet.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheAccessPolicyGet(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.accessPolicies().getWithResponse("rg1", "cache1", "accessPolicy1", com.azure.core.util.Context.NONE);
    }
}
```

### AccessPolicy_List

```java
/**
 * Samples for AccessPolicy List.
 */
public final class AccessPolicyListSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheAccessPolicyList.json
     */
    /**
     * Sample code: RedisCacheAccessPolicyList.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheAccessPolicyList(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.accessPolicies().list("rg1", "cache1", com.azure.core.util.Context.NONE);
    }
}
```

### AccessPolicyAssignment_CreateUpdate

```java
/**
 * Samples for AccessPolicyAssignment CreateUpdate.
 */
public final class AccessPolicyAssignmentCreateUpdateSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheAccessPolicyAssignmentCreateUpdate.json
     */
    /**
     * Sample code: RedisCacheAccessPolicyAssignmentCreateUpdate.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void
        redisCacheAccessPolicyAssignmentCreateUpdate(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.accessPolicyAssignments()
            .define("accessPolicyAssignmentName1")
            .withExistingRedi("rg1", "cache1")
            .withObjectId("6497c918-11ad-41e7-1b0f-7c518a87d0b0")
            .withObjectIdAlias("TestAADAppRedis")
            .withAccessPolicyName("accessPolicy1")
            .create();
    }
}
```

### AccessPolicyAssignment_Delete

```java
/**
 * Samples for AccessPolicyAssignment Delete.
 */
public final class AccessPolicyAssignmentDeleteSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheAccessPolicyAssignmentDelete.json
     */
    /**
     * Sample code: RedisCacheAccessPolicyAssignmentDelete.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void
        redisCacheAccessPolicyAssignmentDelete(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.accessPolicyAssignments()
            .delete("rg1", "cache1", "accessPolicyAssignmentName1", com.azure.core.util.Context.NONE);
    }
}
```

### AccessPolicyAssignment_Get

```java
/**
 * Samples for AccessPolicyAssignment Get.
 */
public final class AccessPolicyAssignmentGetSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheAccessPolicyAssignmentGet.json
     */
    /**
     * Sample code: RedisCacheAccessPolicyAssignmentGet.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void
        redisCacheAccessPolicyAssignmentGet(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.accessPolicyAssignments()
            .getWithResponse("rg1", "cache1", "accessPolicyAssignmentName1", com.azure.core.util.Context.NONE);
    }
}
```

### AccessPolicyAssignment_List

```java
/**
 * Samples for AccessPolicyAssignment List.
 */
public final class AccessPolicyAssignmentListSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheAccessPolicyAssignmentList.json
     */
    /**
     * Sample code: RedisCacheAccessPolicyAssignmentList.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void
        redisCacheAccessPolicyAssignmentList(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.accessPolicyAssignments().list("rg1", "cache1", com.azure.core.util.Context.NONE);
    }
}
```

### AsyncOperationStatus_Get

```java
/**
 * Samples for AsyncOperationStatus Get.
 */
public final class AsyncOperationStatusGetSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheAsyncOperationStatus.json
     */
    /**
     * Sample code: RedisCacheAsyncOperationStatus.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheAsyncOperationStatus(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.asyncOperationStatus()
            .getWithResponse("East US", "c7ba2bf5-5939-4d79-b037-2964ccf097da", com.azure.core.util.Context.NONE);
    }
}
```

### FirewallRules_CreateOrUpdate

```java
import com.azure.resourcemanager.redis.generated.fluent.models.RedisFirewallRuleInner;

/**
 * Samples for FirewallRules CreateOrUpdate.
 */
public final class FirewallRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheFirewallRuleCreate.json
     */
    /**
     * Sample code: RedisCacheFirewallRuleCreate.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheFirewallRuleCreate(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.firewallRules()
            .createOrUpdateWithResponse("rg1", "cache1", "rule1",
                new RedisFirewallRuleInner().withStartIp("192.168.1.1").withEndIp("192.168.1.4"),
                com.azure.core.util.Context.NONE);
    }
}
```

### FirewallRules_Delete

```java
/**
 * Samples for FirewallRules Delete.
 */
public final class FirewallRulesDeleteSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheFirewallRuleDelete.json
     */
    /**
     * Sample code: RedisCacheFirewallRuleDelete.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheFirewallRuleDelete(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.firewallRules().deleteWithResponse("rg1", "cache1", "rule1", com.azure.core.util.Context.NONE);
    }
}
```

### FirewallRules_Get

```java
/**
 * Samples for FirewallRules Get.
 */
public final class FirewallRulesGetSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheFirewallRuleGet.json
     */
    /**
     * Sample code: RedisCacheFirewallRuleGet.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheFirewallRuleGet(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.firewallRules().getWithResponse("rg1", "cache1", "rule1", com.azure.core.util.Context.NONE);
    }
}
```

### FirewallRules_List

```java
/**
 * Samples for FirewallRules List.
 */
public final class FirewallRulesListSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheFirewallRulesList.json
     */
    /**
     * Sample code: RedisCacheFirewallRulesList.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheFirewallRulesList(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.firewallRules().list("rg1", "cache1", com.azure.core.util.Context.NONE);
    }
}
```

### LinkedServer_Create

```java
import com.azure.resourcemanager.redis.generated.models.ReplicationRole;

/**
 * Samples for LinkedServer Create.
 */
public final class LinkedServerCreateSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheLinkedServer_Create.json
     */
    /**
     * Sample code: LinkedServer_Create.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void linkedServerCreate(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.linkedServers()
            .define("cache2")
            .withExistingRedi("rg1", "cache1")
            .withLinkedRedisCacheId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Cache/Redis/cache2")
            .withLinkedRedisCacheLocation("West US")
            .withServerRole(ReplicationRole.SECONDARY)
            .create();
    }
}
```

### LinkedServer_Delete

```java
/**
 * Samples for LinkedServer Delete.
 */
public final class LinkedServerDeleteSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheLinkedServer_Delete.json
     */
    /**
     * Sample code: LinkedServerDelete.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void linkedServerDelete(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.linkedServers().delete("rg1", "cache1", "cache2", com.azure.core.util.Context.NONE);
    }
}
```

### LinkedServer_Get

```java
/**
 * Samples for LinkedServer Get.
 */
public final class LinkedServerGetSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheLinkedServer_Get.json
     */
    /**
     * Sample code: LinkedServer_Get.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void linkedServerGet(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.linkedServers().getWithResponse("rg1", "cache1", "cache2", com.azure.core.util.Context.NONE);
    }
}
```

### LinkedServer_List

```java
/**
 * Samples for LinkedServer List.
 */
public final class LinkedServerListSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheLinkedServer_List.json
     */
    /**
     * Sample code: LinkedServer_List.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void linkedServerList(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.linkedServers().list("rg1", "cache1", com.azure.core.util.Context.NONE);
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
     * specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/RedisCacheOperations.
     * json
     */
    /**
     * Sample code: RedisCacheOperations.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheOperations(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### PatchSchedules_CreateOrUpdate

```java
import com.azure.resourcemanager.redis.generated.models.DayOfWeek;
import com.azure.resourcemanager.redis.generated.models.DefaultName;
import com.azure.resourcemanager.redis.generated.models.ScheduleEntry;
import java.time.Duration;
import java.util.Arrays;

/**
 * Samples for PatchSchedules CreateOrUpdate.
 */
public final class PatchSchedulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCachePatchSchedulesCreateOrUpdate.json
     */
    /**
     * Sample code: RedisCachePatchSchedulesCreateOrUpdate.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void
        redisCachePatchSchedulesCreateOrUpdate(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.patchSchedules()
            .define(DefaultName.DEFAULT)
            .withExistingRedi("rg1", "cache1")
            .withScheduleEntries(Arrays.asList(
                new ScheduleEntry().withDayOfWeek(DayOfWeek.MONDAY)
                    .withStartHourUtc(12)
                    .withMaintenanceWindow(Duration.parse("PT5H")),
                new ScheduleEntry().withDayOfWeek(DayOfWeek.TUESDAY).withStartHourUtc(12)))
            .create();
    }
}
```

### PatchSchedules_Delete

```java
import com.azure.resourcemanager.redis.generated.models.DefaultName;

/**
 * Samples for PatchSchedules Delete.
 */
public final class PatchSchedulesDeleteSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCachePatchSchedulesDelete.json
     */
    /**
     * Sample code: RedisCachePatchSchedulesDelete.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCachePatchSchedulesDelete(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.patchSchedules()
            .deleteWithResponse("rg1", "cache1", DefaultName.DEFAULT, com.azure.core.util.Context.NONE);
    }
}
```

### PatchSchedules_Get

```java
import com.azure.resourcemanager.redis.generated.models.DefaultName;

/**
 * Samples for PatchSchedules Get.
 */
public final class PatchSchedulesGetSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCachePatchSchedulesGet.json
     */
    /**
     * Sample code: RedisCachePatchSchedulesGet.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCachePatchSchedulesGet(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.patchSchedules()
            .getWithResponse("rg1", "cache1", DefaultName.DEFAULT, com.azure.core.util.Context.NONE);
    }
}
```

### PatchSchedules_ListByRedisResource

```java
/**
 * Samples for PatchSchedules ListByRedisResource.
 */
public final class PatchSchedulesListByRedisResourceSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCachePatchSchedulesList.json
     */
    /**
     * Sample code: RedisCachePatchSchedulesList.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCachePatchSchedulesList(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.patchSchedules().listByRedisResource("rg1", "cache1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheDeletePrivateEndpointConnection.json
     */
    /**
     * Sample code: RedisCacheDeletePrivateEndpointConnection.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void
        redisCacheDeletePrivateEndpointConnection(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.privateEndpointConnections()
            .deleteWithResponse("rgtest01", "cachetest01", "pectest01", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
/**
 * Samples for PrivateEndpointConnections Get.
 */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheGetPrivateEndpointConnection.json
     */
    /**
     * Sample code: RedisCacheGetPrivateEndpointConnection.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void
        redisCacheGetPrivateEndpointConnection(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.privateEndpointConnections()
            .getWithResponse("rgtest01", "cachetest01", "pectest01", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_List

```java
/**
 * Samples for PrivateEndpointConnections List.
 */
public final class PrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheListPrivateEndpointConnections.json
     */
    /**
     * Sample code: RedisCacheListPrivateEndpointConnection.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void
        redisCacheListPrivateEndpointConnection(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.privateEndpointConnections().list("rgtest01", "cachetest01", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Put

```java
import com.azure.resourcemanager.redis.generated.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.redis.generated.models.PrivateLinkServiceConnectionState;

/**
 * Samples for PrivateEndpointConnections Put.
 */
public final class PrivateEndpointConnectionsPutSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCachePutPrivateEndpointConnection.json
     */
    /**
     * Sample code: RedisCachePutPrivateEndpointConnection.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void
        redisCachePutPrivateEndpointConnection(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.privateEndpointConnections()
            .define("pectest01")
            .withExistingRedi("rgtest01", "cachetest01")
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                    .withDescription("Auto-Approved"))
            .create();
    }
}
```

### PrivateLinkResources_ListByRedisCache

```java
/**
 * Samples for PrivateLinkResources ListByRedisCache.
 */
public final class PrivateLinkResourcesListByRedisCacheSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheListPrivateLinkResources.json
     */
    /**
     * Sample code: StorageAccountListPrivateLinkResources.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void
        storageAccountListPrivateLinkResources(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.privateLinkResources().listByRedisCache("rgtest01", "cacheTest01", com.azure.core.util.Context.NONE);
    }
}
```

### Redis_CheckNameAvailability

```java
import com.azure.resourcemanager.redis.generated.models.CheckNameAvailabilityParameters;

/**
 * Samples for Redis CheckNameAvailability.
 */
public final class RedisCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheCheckNameAvailability.json
     */
    /**
     * Sample code: RedisCacheCheckNameAvailability.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheCheckNameAvailability(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis()
            .checkNameAvailabilityWithResponse(
                new CheckNameAvailabilityParameters().withName("cacheName").withType("Microsoft.Cache/Redis"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Redis_Create

```java
import com.azure.resourcemanager.redis.generated.models.RedisCommonPropertiesRedisConfiguration;
import com.azure.resourcemanager.redis.generated.models.Sku;
import com.azure.resourcemanager.redis.generated.models.SkuFamily;
import com.azure.resourcemanager.redis.generated.models.SkuName;
import com.azure.resourcemanager.redis.generated.models.TlsVersion;
import com.azure.resourcemanager.redis.generated.models.ZonalAllocationPolicy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Redis Create.
 */
public final class RedisCreateSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheCreateAutomaticZonalAllocationPolicy.json
     */
    /**
     * Sample code: RedisCacheCreateAutomaticZonalAllocationPolicy.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void
        redisCacheCreateAutomaticZonalAllocationPolicy(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis()
            .define("cache1")
            .withRegion("East US")
            .withExistingResourceGroup("rg1")
            .withSku(new Sku().withName(SkuName.PREMIUM).withFamily(SkuFamily.P).withCapacity(1))
            .withSubnetId(
                "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Network/virtualNetworks/network1/subnets/subnet1")
            .withStaticIp("192.168.0.5")
            .withRedisConfiguration(new RedisCommonPropertiesRedisConfiguration().withMaxmemoryPolicy("allkeys-lru")
                .withAdditionalProperties(mapOf()))
            .withEnableNonSslPort(true)
            .withReplicasPerPrimary(2)
            .withShardCount(2)
            .withMinimumTlsVersion(TlsVersion.ONE_TWO)
            .withZonalAllocationPolicy(ZonalAllocationPolicy.AUTOMATIC)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/RedisCacheCreate.json
     */
    /**
     * Sample code: RedisCacheCreate.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheCreate(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis()
            .define("cache1")
            .withRegion("West US")
            .withExistingResourceGroup("rg1")
            .withSku(new Sku().withName(SkuName.PREMIUM).withFamily(SkuFamily.P).withCapacity(1))
            .withZones(Arrays.asList("1"))
            .withSubnetId(
                "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Network/virtualNetworks/network1/subnets/subnet1")
            .withStaticIp("192.168.0.5")
            .withRedisConfiguration(new RedisCommonPropertiesRedisConfiguration().withMaxmemoryPolicy("allkeys-lru")
                .withAdditionalProperties(mapOf()))
            .withRedisVersion("4")
            .withEnableNonSslPort(true)
            .withReplicasPerPrimary(2)
            .withShardCount(2)
            .withMinimumTlsVersion(TlsVersion.ONE_TWO)
            .create();
    }

    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheCreateDefaultVersion.json
     */
    /**
     * Sample code: RedisCacheCreateDefaultVersion.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheCreateDefaultVersion(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis()
            .define("cache1")
            .withRegion("West US")
            .withExistingResourceGroup("rg1")
            .withSku(new Sku().withName(SkuName.PREMIUM).withFamily(SkuFamily.P).withCapacity(1))
            .withZones(Arrays.asList("1"))
            .withSubnetId(
                "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Network/virtualNetworks/network1/subnets/subnet1")
            .withStaticIp("192.168.0.5")
            .withRedisConfiguration(new RedisCommonPropertiesRedisConfiguration().withMaxmemoryPolicy("allkeys-lru")
                .withAdditionalProperties(mapOf()))
            .withEnableNonSslPort(true)
            .withReplicasPerPrimary(2)
            .withShardCount(2)
            .withMinimumTlsVersion(TlsVersion.ONE_TWO)
            .create();
    }

    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheCreateLatestVersion.json
     */
    /**
     * Sample code: RedisCacheCreateLatestVersion.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheCreateLatestVersion(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis()
            .define("cache1")
            .withRegion("West US")
            .withExistingResourceGroup("rg1")
            .withSku(new Sku().withName(SkuName.PREMIUM).withFamily(SkuFamily.P).withCapacity(1))
            .withZones(Arrays.asList("1"))
            .withSubnetId(
                "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Network/virtualNetworks/network1/subnets/subnet1")
            .withStaticIp("192.168.0.5")
            .withRedisConfiguration(new RedisCommonPropertiesRedisConfiguration().withMaxmemoryPolicy("allkeys-lru")
                .withAdditionalProperties(mapOf()))
            .withRedisVersion("Latest")
            .withEnableNonSslPort(true)
            .withReplicasPerPrimary(2)
            .withShardCount(2)
            .withMinimumTlsVersion(TlsVersion.ONE_TWO)
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

### Redis_Delete

```java
/**
 * Samples for Redis Delete.
 */
public final class RedisDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/RedisCacheDelete.json
     */
    /**
     * Sample code: RedisCacheDelete.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheDelete(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis().delete("rg1", "cache1", com.azure.core.util.Context.NONE);
    }
}
```

### Redis_ExportData

```java
import com.azure.resourcemanager.redis.generated.models.ExportRdbParameters;

/**
 * Samples for Redis ExportData.
 */
public final class RedisExportDataSamples {
    /*
     * x-ms-original-file:
     * specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/RedisCacheExport.json
     */
    /**
     * Sample code: RedisCacheExport.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheExport(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis()
            .exportData("rg1", "cache1",
                new ExportRdbParameters().withFormat("RDB")
                    .withPrefix("datadump1")
                    .withContainer("https://contosostorage.blob.core.window.net/urltoBlobContainer?sasKeyParameters")
                    .withStorageSubscriptionId("storageSubId"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Redis_FlushCache

```java
/**
 * Samples for Redis FlushCache.
 */
public final class RedisFlushCacheSamples {
    /*
     * x-ms-original-file:
     * specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/RedisCacheFlush.json
     */
    /**
     * Sample code: RedisCacheFlush.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheFlush(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis().flushCache("resource-group-name", "cache-name", com.azure.core.util.Context.NONE);
    }
}
```

### Redis_ForceReboot

```java
import com.azure.resourcemanager.redis.generated.models.RebootType;
import com.azure.resourcemanager.redis.generated.models.RedisRebootParameters;
import java.util.Arrays;

/**
 * Samples for Redis ForceReboot.
 */
public final class RedisForceRebootSamples {
    /*
     * x-ms-original-file:
     * specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/RedisCacheForceReboot.
     * json
     */
    /**
     * Sample code: RedisCacheForceReboot.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheForceReboot(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis()
            .forceRebootWithResponse("rg1", "cache1",
                new RedisRebootParameters().withRebootType(RebootType.ALL_NODES)
                    .withShardId(0)
                    .withPorts(Arrays.asList(13000, 15001)),
                com.azure.core.util.Context.NONE);
    }
}
```

### Redis_GetByResourceGroup

```java
/**
 * Samples for Redis GetByResourceGroup.
 */
public final class RedisGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/RedisCacheGet.json
     */
    /**
     * Sample code: RedisCacheGet.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheGet(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis().getByResourceGroupWithResponse("rg1", "cache1", com.azure.core.util.Context.NONE);
    }
}
```

### Redis_ImportData

```java
import com.azure.resourcemanager.redis.generated.models.ImportRdbParameters;
import java.util.Arrays;

/**
 * Samples for Redis ImportData.
 */
public final class RedisImportDataSamples {
    /*
     * x-ms-original-file:
     * specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/RedisCacheImport.json
     */
    /**
     * Sample code: RedisCacheImport.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheImport(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis()
            .importData("rg1", "cache1",
                new ImportRdbParameters().withFormat("RDB")
                    .withFiles(Arrays.asList("http://fileuris.contoso.com/pathtofile1"))
                    .withStorageSubscriptionId("storageSubId"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Redis_List

```java
/**
 * Samples for Redis List.
 */
public final class RedisListSamples {
    /*
     * x-ms-original-file:
     * specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/RedisCacheList.json
     */
    /**
     * Sample code: RedisCacheList.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheList(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis().list(com.azure.core.util.Context.NONE);
    }
}
```

### Redis_ListByResourceGroup

```java
/**
 * Samples for Redis ListByResourceGroup.
 */
public final class RedisListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheListByResourceGroup.json
     */
    /**
     * Sample code: RedisCacheListByResourceGroup.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheListByResourceGroup(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### Redis_ListKeys

```java
/**
 * Samples for Redis ListKeys.
 */
public final class RedisListKeysSamples {
    /*
     * x-ms-original-file:
     * specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/RedisCacheListKeys.json
     */
    /**
     * Sample code: RedisCacheListKeys.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheListKeys(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis().listKeysWithResponse("rg1", "cache1", com.azure.core.util.Context.NONE);
    }
}
```

### Redis_ListUpgradeNotifications

```java
/**
 * Samples for Redis ListUpgradeNotifications.
 */
public final class RedisListUpgradeNotificationsSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/
     * RedisCacheListUpgradeNotifications.json
     */
    /**
     * Sample code: RedisCacheListUpgradeNotifications.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void
        redisCacheListUpgradeNotifications(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis().listUpgradeNotifications("rg1", "cache1", 5000.0, com.azure.core.util.Context.NONE);
    }
}
```

### Redis_RegenerateKey

```java
import com.azure.resourcemanager.redis.generated.models.RedisKeyType;
import com.azure.resourcemanager.redis.generated.models.RedisRegenerateKeyParameters;

/**
 * Samples for Redis RegenerateKey.
 */
public final class RedisRegenerateKeySamples {
    /*
     * x-ms-original-file:
     * specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/RedisCacheRegenerateKey.
     * json
     */
    /**
     * Sample code: RedisCacheRegenerateKey.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheRegenerateKey(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        manager.redis()
            .regenerateKeyWithResponse("rg1", "cache1",
                new RedisRegenerateKeyParameters().withKeyType(RedisKeyType.PRIMARY), com.azure.core.util.Context.NONE);
    }
}
```

### Redis_Update

```java
import com.azure.resourcemanager.redis.generated.models.RedisResource;

/**
 * Samples for Redis Update.
 */
public final class RedisUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/redis/resource-manager/Microsoft.Cache/preview/2024-04-01-preview/examples/RedisCacheUpdate.json
     */
    /**
     * Sample code: RedisCacheUpdate.
     * 
     * @param manager Entry point to RedisManager.
     */
    public static void redisCacheUpdate(com.azure.resourcemanager.redis.generated.RedisManager manager) {
        RedisResource resource = manager.redis()
            .getByResourceGroupWithResponse("rg1", "cache1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withEnableNonSslPort(true).withReplicasPerPrimary(2).apply();
    }
}
```

