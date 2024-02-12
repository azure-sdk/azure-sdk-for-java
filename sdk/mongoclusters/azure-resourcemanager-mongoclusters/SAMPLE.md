# Code snippets and samples


## FirewallRules

- [CreateOrUpdate](#firewallrules_createorupdate)
- [Delete](#firewallrules_delete)
- [Get](#firewallrules_get)
- [ListByMongoCluster](#firewallrules_listbymongocluster)

## MongoClusters

- [CheckNameAvailability](#mongoclusters_checknameavailability)
- [CreateOrUpdate](#mongoclusters_createorupdate)
- [Delete](#mongoclusters_delete)
- [GetByResourceGroup](#mongoclusters_getbyresourcegroup)
- [List](#mongoclusters_list)
- [ListByResourceGroup](#mongoclusters_listbyresourcegroup)
- [ListConnectionStrings](#mongoclusters_listconnectionstrings)
- [Update](#mongoclusters_update)

## Operations

- [List](#operations_list)
### FirewallRules_CreateOrUpdate

```java
/**
 * Samples for FirewallRules CreateOrUpdate.
 */
public final class FirewallRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterFirewallRuleCreate.json
     */
    /**
     * Sample code: Creates a firewall rule on a Mongo Cluster resource.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void createsAFirewallRuleOnAMongoClusterResource(
        com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.firewallRules().define("rule1").withExistingMongoCluster("TestGroup", "myMongoCluster")
            .withStartIpAddress("0.0.0.0").withEndIpAddress("255.255.255.255").create();
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
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterFirewallRuleDelete.json
     */
    /**
     * Sample code: Deletes a firewall rule on a Mongo Cluster resource.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void deletesAFirewallRuleOnAMongoClusterResource(
        com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.firewallRules().delete("TestGroup", "myMongoCluster", "rule1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterFirewallRuleGet.json
     */
    /**
     * Sample code: Gets a firewall rule on a Mongo Cluster resource.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void
        getsAFirewallRuleOnAMongoClusterResource(com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.firewallRules().getWithResponse("TestGroup", "myMongoCluster", "rule1",
            com.azure.core.util.Context.NONE);
    }
}
```

### FirewallRules_ListByMongoCluster

```java
/**
 * Samples for FirewallRules ListByMongoCluster.
 */
public final class FirewallRulesListByMongoClusterSamples {
    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterFirewallRuleList.json
     */
    /**
     * Sample code: List the firewall rules on a Mongo Cluster resource.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void listTheFirewallRulesOnAMongoClusterResource(
        com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.firewallRules().listByMongoCluster("TestGroup", "myMongoCluster", com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_CheckNameAvailability

```java
import com.azure.resourcemanager.mongoclusters.models.CheckNameAvailabilityRequest;

/**
 * Samples for MongoClusters CheckNameAvailability.
 */
public final class MongoClustersCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterNameAvailability.json
     */
    /**
     * Sample code: Checks and confirms the Mongo Cluster name is availability for use.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void checksAndConfirmsTheMongoClusterNameIsAvailabilityForUse(
        com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.mongoClusters().checkNameAvailabilityWithResponse("westus2", new CheckNameAvailabilityRequest()
            .withName("newmongocluster").withType("Microsoft.DocumentDB/mongoClusters"),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterNameAvailability_AlreadyExists.json
     */
    /**
     * Sample code: Checks and returns that the Mongo Cluster name is already in-use.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void checksAndReturnsThatTheMongoClusterNameIsAlreadyInUse(
        com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.mongoClusters()
            .checkNameAvailabilityWithResponse("westus2", new CheckNameAvailabilityRequest()
                .withName("existingmongocluster").withType("Microsoft.DocumentDB/mongoClusters"),
                com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_CreateOrUpdate

```java
import com.azure.resourcemanager.mongoclusters.models.CreateMode;
import com.azure.resourcemanager.mongoclusters.models.MongoClusterRestoreParameters;
import com.azure.resourcemanager.mongoclusters.models.NodeGroupSpec;
import com.azure.resourcemanager.mongoclusters.models.NodeKind;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for MongoClusters CreateOrUpdate.
 */
public final class MongoClustersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterCreatePITR.json
     */
    /**
     * Sample code: Creates a Mongo Cluster resource from a point in time restore.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void createsAMongoClusterResourceFromAPointInTimeRestore(
        com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.mongoClusters().define("myMongoCluster").withRegion("westus2")
            .withExistingResourceGroup("TestResourceGroup").withCreateMode(CreateMode.POINT_IN_TIME_RESTORE)
            .withRestoreParameters(new MongoClusterRestoreParameters()
                .withPointInTimeUtc(OffsetDateTime.parse("2023-01-13T20:07:35Z")).withSourceResourceId(
                    "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestResourceGroup/providers/Microsoft.DocumentDB/mongoClusters/myOtherMongoCluster"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterCreate.json
     */
    /**
     * Sample code: Creates a new Mongo Cluster resource.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void
        createsANewMongoClusterResource(com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.mongoClusters().define("myMongoCluster").withRegion("westus2")
            .withExistingResourceGroup("TestResourceGroup").withAdministratorLogin("mongoAdmin")
            .withAdministratorLoginPassword("password").withServerVersion("5.0")
            .withNodeGroupSpecs(Arrays.asList(new NodeGroupSpec().withSku("M30").withDiskSizeGB(128L).withEnableHa(true)
                .withKind(NodeKind.SHARD).withNodeCount(1)))
            .create();
    }
}
```

### MongoClusters_Delete

```java
/**
 * Samples for MongoClusters Delete.
 */
public final class MongoClustersDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterDelete.json
     */
    /**
     * Sample code: Deletes a Mongo Cluster resource.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void
        deletesAMongoClusterResource(com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.mongoClusters().delete("TestResourceGroup", "myMongoCluster", com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_GetByResourceGroup

```java
/**
 * Samples for MongoClusters GetByResourceGroup.
 */
public final class MongoClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterGet.json
     */
    /**
     * Sample code: Gets a Mongo Cluster resource.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void getsAMongoClusterResource(com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.mongoClusters().getByResourceGroupWithResponse("TestResourceGroup", "myMongoCluster",
            com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_List

```java
/**
 * Samples for MongoClusters List.
 */
public final class MongoClustersListSamples {
    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterList.json
     */
    /**
     * Sample code: Lists the Mongo Cluster resources in a subscription.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void listsTheMongoClusterResourcesInASubscription(
        com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.mongoClusters().list(com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_ListByResourceGroup

```java
/**
 * Samples for MongoClusters ListByResourceGroup.
 */
public final class MongoClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterListByResourceGroup.json
     */
    /**
     * Sample code: Lists the Mongo Cluster resources in a resource group.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void listsTheMongoClusterResourcesInAResourceGroup(
        com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.mongoClusters().listByResourceGroup("TestResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_ListConnectionStrings

```java
/**
 * Samples for MongoClusters ListConnectionStrings.
 */
public final class MongoClustersListConnectionStringsSamples {
    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterListConnectionStrings.json
     */
    /**
     * Sample code: List the available connection strings for the Mongo Cluster resource.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void listTheAvailableConnectionStringsForTheMongoClusterResource(
        com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.mongoClusters().listConnectionStringsWithResponse("TestGroup", "myMongoCluster",
            com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_Update

```java
import com.azure.resourcemanager.mongoclusters.models.MongoCluster;
import com.azure.resourcemanager.mongoclusters.models.NodeGroupSpec;
import com.azure.resourcemanager.mongoclusters.models.NodeKind;
import com.azure.resourcemanager.mongoclusters.models.PublicNetworkAccess;
import java.util.Arrays;

/**
 * Samples for MongoClusters Update.
 */
public final class MongoClustersUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterPatchDiskSize.json
     */
    /**
     * Sample code: Updates the disk size on a Mongo Cluster resource.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void
        updatesTheDiskSizeOnAMongoClusterResource(com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        MongoCluster resource = manager.mongoClusters()
            .getByResourceGroupWithResponse("TestResourceGroup", "myMongoCluster", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withNodeGroupSpecs(Arrays.asList(new NodeGroupSpec().withDiskSizeGB(256L).withKind(NodeKind.SHARD)))
            .apply();
    }

    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterPatchPrivateNetworkAccess.json
     */
    /**
     * Sample code: Disables public network access on a Mongo Cluster resource with a private endpoint connection.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void disablesPublicNetworkAccessOnAMongoClusterResourceWithAPrivateEndpointConnection(
        com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        MongoCluster resource = manager.mongoClusters()
            .getByResourceGroupWithResponse("TestResourceGroup", "myMongoCluster", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withPublicNetworkAccess(PublicNetworkAccess.DISABLED).apply();
    }

    /*
     * x-ms-original-file:
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * MongoClusterUpdate.json
     */
    /**
     * Sample code: Updates a Mongo Cluster resource.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void
        updatesAMongoClusterResource(com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        MongoCluster resource = manager.mongoClusters()
            .getByResourceGroupWithResponse("TestResourceGroup", "myMongoCluster", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withAdministratorLogin("mongoAdmin").withAdministratorLoginPassword("password")
            .withServerVersion("5.0").withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
            .withNodeGroupSpecs(Arrays.asList(new NodeGroupSpec().withSku("M50").withDiskSizeGB(256L).withEnableHa(true)
                .withKind(NodeKind.SHARD).withNodeCount(1)))
            .apply();
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
     * specification/mongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * OperationsGet.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void operationsList(com.azure.resourcemanager.mongoclusters.MongoClusterManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

