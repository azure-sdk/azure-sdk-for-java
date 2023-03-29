# Code snippets and samples


## Databases

- [Create](#databases_create)
- [Delete](#databases_delete)
- [ExportRdb](#databases_exportrdb)
- [ForceUnlink](#databases_forceunlink)
- [Fush](#databases_fush)
- [Get](#databases_get)
- [ImportRdb](#databases_importrdb)
- [ListByCluster](#databases_listbycluster)
- [ListKeys](#databases_listkeys)
- [RegenerateKey](#databases_regeneratekey)
- [Update](#databases_update)

## OperationsStatus

- [Get](#operationsstatus_get)

## PrivateEndpointConnections

- [Create](#privateendpointconnections_create)
- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [ListByCluster](#privateendpointconnections_listbycluster)
- [Update](#privateendpointconnections_update)

## RedisEnterprise

- [Create](#redisenterprise_create)
- [Delete](#redisenterprise_delete)
- [GetByResourceGroup](#redisenterprise_getbyresourcegroup)
- [List](#redisenterprise_list)
- [ListByResourceGroup](#redisenterprise_listbyresourcegroup)
- [Update](#redisenterprise_update)

## Skus

- [List](#skus_list)
### Databases_Create

```java
/** Samples for Databases Create. */
public final class DatabasesCreateSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDatabasesCreate.json
     */
    /**
     * Sample code: RedisEnterpriseDatabases_Create.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesCreate(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.databases().define("default").withExistingRedisEnterprise("rg1", "cache1").create();
    }

    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDatabasesCreateWithGeoReplication.json
     */
    /**
     * Sample code: RedisEnterpriseDatabases_CreateWithGeoReplication.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesCreateWithGeoReplication(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.databases().define("default").withExistingRedisEnterprise("rg1", "cache1").create();
    }
}
```

### Databases_Delete

```java
/** Samples for Databases Delete. */
public final class DatabasesDeleteSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDatabasesDelete.json
     */
    /**
     * Sample code: RedisEnterpriseDatabases_Delete.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesDelete(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.databases().delete("rg1", "cache1", "db1", com.azure.core.util.Context.NONE);
    }
}
```

### Databases_ExportRdb

```java
/** Samples for Databases ExportRdb. */
public final class DatabasesExportRdbSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDatabasesExport.json
     */
    /**
     * Sample code: RedisEnterpriseDatabases_Export.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesExport(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.databases().exportRdb("rg1", "cache1", "default", null, com.azure.core.util.Context.NONE);
    }
}
```

### Databases_ForceUnlink

```java
/** Samples for Databases ForceUnlink. */
public final class DatabasesForceUnlinkSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDatabasesForceUnlink.json
     */
    /**
     * Sample code: RedisEnterpriseDatabases_ForceUnlink.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesForceUnlink(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.databases().forceUnlink("rg1", "cache1", "default", null, com.azure.core.util.Context.NONE);
    }
}
```

### Databases_Fush

```java
/** Samples for Databases Fush. */
public final class DatabasesFushSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDatabasesFlush.json
     */
    /**
     * Sample code: RedisEnterpriseDatabases_Flush.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesFlush(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.databases().fush("rg1", "cache1", "default", null, com.azure.core.util.Context.NONE);
    }
}
```

### Databases_Get

```java
/** Samples for Databases Get. */
public final class DatabasesGetSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDatabasesGet.json
     */
    /**
     * Sample code: RedisEnterpriseDatabases_Get.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesGet(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.databases().getWithResponse("rg1", "cache1", "default", com.azure.core.util.Context.NONE);
    }
}
```

### Databases_ImportRdb

```java
/** Samples for Databases ImportRdb. */
public final class DatabasesImportRdbSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDatabasesImport.json
     */
    /**
     * Sample code: RedisEnterpriseDatabases_Import.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesImport(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.databases().importRdb("rg1", "cache1", "default", null, com.azure.core.util.Context.NONE);
    }
}
```

### Databases_ListByCluster

```java
/** Samples for Databases ListByCluster. */
public final class DatabasesListByClusterSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDatabasesListByCluster.json
     */
    /**
     * Sample code: RedisEnterpriseDatabases_ListByCluster.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesListByCluster(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.databases().listByCluster("rg1", "cache1", com.azure.core.util.Context.NONE);
    }
}
```

### Databases_ListKeys

```java
/** Samples for Databases ListKeys. */
public final class DatabasesListKeysSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDatabasesListKeys.json
     */
    /**
     * Sample code: RedisEnterpriseDatabases_ListKeys.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesListKeys(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.databases().listKeysWithResponse("rg1", "cache1", "default", com.azure.core.util.Context.NONE);
    }
}
```

### Databases_RegenerateKey

```java
/** Samples for Databases RegenerateKey. */
public final class DatabasesRegenerateKeySamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDatabasesRegenerateKey.json
     */
    /**
     * Sample code: RedisEnterpriseDatabases_RegenerateKey.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesRegenerateKey(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.databases().regenerateKey("rg1", "cache1", "default", null, com.azure.core.util.Context.NONE);
    }
}
```

### Databases_Update

```java
/** Samples for Databases Update. */
public final class DatabasesUpdateSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDatabasesUpdate.json
     */
    /**
     * Sample code: RedisEnterpriseDatabases_Update.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesUpdate(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.databases().update("rg1", "cache1", "default", null, com.azure.core.util.Context.NONE);
    }
}
```

### OperationsStatus_Get

```java
/** Samples for OperationsStatus Get. */
public final class OperationsStatusGetSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/OperationsStatusGet.json
     */
    /**
     * Sample code: OperationsStatus_Get.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void operationsStatusGet(com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager
            .operationsStatus()
            .getWithResponse("subid", "West US", "testoperationid", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Create

```java
/** Samples for PrivateEndpointConnections Create. */
public final class PrivateEndpointConnectionsCreateSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterprisePrivateEndpointConnectionsCreate.json
     */
    /**
     * Sample code: RedisEnterprisePrivateEndpointConnections_Create.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterprisePrivateEndpointConnectionsCreate(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.privateEndpointConnections().define("pectest01").withExistingRedisEnterprise("rg1", "cache1").create();
    }
}
```

### PrivateEndpointConnections_Delete

```java
/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterprisePrivateEndpointConnectionsDelete.json
     */
    /**
     * Sample code: RedisEnterprisePrivateEndpointConnections_Delete.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterprisePrivateEndpointConnectionsDelete(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.privateEndpointConnections().delete("rg1", "cache1", "pectest01", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterprisePrivateEndpointConnectionsGet.json
     */
    /**
     * Sample code: RedisEnterprisePrivateEndpointConnections_Get.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterprisePrivateEndpointConnectionsGet(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse("rg1", "cache1", "pectest01", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_ListByCluster

```java
/** Samples for PrivateEndpointConnections ListByCluster. */
public final class PrivateEndpointConnectionsListByClusterSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterprisePrivateEndpointConnectionsListByCluster.json
     */
    /**
     * Sample code: RedisEnterprisePrivateEndpointConnections_ListByCluster.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterprisePrivateEndpointConnectionsListByCluster(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.privateEndpointConnections().listByCluster("rg1", "cache1", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Update

```java
/** Samples for PrivateEndpointConnections Update. */
public final class PrivateEndpointConnectionsUpdateSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: RedisEnterprisePrivateEndpointConnections_Update.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterprisePrivateEndpointConnectionsUpdate(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.privateEndpointConnections().update(null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### RedisEnterprise_Create

```java
import com.azure.resourcemanager.redisenterprise.models.Sku;

/** Samples for RedisEnterprise Create. */
public final class RedisEnterpriseCreateSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseCreate.json
     */
    /**
     * Sample code: RedisEnterprise_Create.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseCreate(com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager
            .redisEnterprises()
            .define("cache1")
            .withRegion((String) null)
            .withExistingResourceGroup("rg1")
            .withSku((Sku) null)
            .create();
    }
}
```

### RedisEnterprise_Delete

```java
/** Samples for RedisEnterprise Delete. */
public final class RedisEnterpriseDeleteSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDelete.json
     */
    /**
     * Sample code: RedisEnterprise_Delete.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDelete(com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.redisEnterprises().delete("rg1", "cache1", com.azure.core.util.Context.NONE);
    }
}
```

### RedisEnterprise_GetByResourceGroup

```java
/** Samples for RedisEnterprise GetByResourceGroup. */
public final class RedisEnterpriseGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseGet.json
     */
    /**
     * Sample code: RedisEnterprise_Get.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseGet(com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.redisEnterprises().getByResourceGroupWithResponse("rg1", "cache1", com.azure.core.util.Context.NONE);
    }
}
```

### RedisEnterprise_List

```java
/** Samples for RedisEnterprise List. */
public final class RedisEnterpriseListSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseList.json
     */
    /**
     * Sample code: RedisEnterprise_List.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseList(com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.redisEnterprises().list(com.azure.core.util.Context.NONE);
    }
}
```

### RedisEnterprise_ListByResourceGroup

```java
/** Samples for RedisEnterprise ListByResourceGroup. */
public final class RedisEnterpriseListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseListByResourceGroup.json
     */
    /**
     * Sample code: RedisEnterprise_ListByResourceGroup.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseListByResourceGroup(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.redisEnterprises().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### RedisEnterprise_Update

```java
import com.azure.resourcemanager.redisenterprise.models.Cluster;

/** Samples for RedisEnterprise Update. */
public final class RedisEnterpriseUpdateSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseUpdate.json
     */
    /**
     * Sample code: RedisEnterprise_Update.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseUpdate(com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        Cluster resource =
            manager
                .redisEnterprises()
                .getByResourceGroupWithResponse("rg1", "cache1", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
```

### Skus_List

```java
/** Samples for Skus List. */
public final class SkusListSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseSkusList.json
     */
    /**
     * Sample code: RedisEnterpriseSkus_List.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseSkusList(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.skus().list(com.azure.core.util.Context.NONE);
    }
}
```

