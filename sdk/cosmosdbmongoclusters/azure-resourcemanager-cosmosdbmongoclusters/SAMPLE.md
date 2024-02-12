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
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterFirewallRuleCreate.json
     */
    /**
     * Sample code: Creates a firewall rule on a Mongo Cluster resource.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void createsAFirewallRuleOnAMongoClusterResource(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
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
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterFirewallRuleDelete.json
     */
    /**
     * Sample code: Deletes a firewall rule on a Mongo Cluster resource.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void deletesAFirewallRuleOnAMongoClusterResource(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
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
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterFirewallRuleGet.json
     */
    /**
     * Sample code: Gets a firewall rule on a Mongo Cluster resource.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void getsAFirewallRuleOnAMongoClusterResource(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
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
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterFirewallRuleList.json
     */
    /**
     * Sample code: List the firewall rules on a Mongo Cluster resource.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void listTheFirewallRulesOnAMongoClusterResource(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
        manager.firewallRules().listByMongoCluster("TestGroup", "myMongoCluster", com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_CheckNameAvailability

```java
import com.azure.resourcemanager.cosmosdbmongoclusters.models.CheckNameAvailabilityRequest;

/**
 * Samples for MongoClusters CheckNameAvailability.
 */
public final class MongoClustersCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterNameAvailability.json
     */
    /**
     * Sample code: Checks and confirms the Mongo Cluster name is availability for use.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void checksAndConfirmsTheMongoClusterNameIsAvailabilityForUse(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
        manager.mongoClusters().checkNameAvailabilityWithResponse("westus2", new CheckNameAvailabilityRequest()
            .withName("newmongocluster").withType("Microsoft.DocumentDB/mongoClusters"),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterNameAvailability_AlreadyExists.json
     */
    /**
     * Sample code: Checks and returns that the Mongo Cluster name is already in-use.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void checksAndReturnsThatTheMongoClusterNameIsAlreadyInUse(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
        manager.mongoClusters()
            .checkNameAvailabilityWithResponse("westus2", new CheckNameAvailabilityRequest()
                .withName("existingmongocluster").withType("Microsoft.DocumentDB/mongoClusters"),
                com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_CreateOrUpdate

```java
import com.azure.resourcemanager.cosmosdbmongoclusters.models.CreateMode;
import com.azure.resourcemanager.cosmosdbmongoclusters.models.MongoClusterRestoreParameters;
import com.azure.resourcemanager.cosmosdbmongoclusters.models.NodeGroupSpec;
import com.azure.resourcemanager.cosmosdbmongoclusters.models.NodeKind;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for MongoClusters CreateOrUpdate.
 */
public final class MongoClustersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterCreatePITR.json
     */
    /**
     * Sample code: Creates a Mongo Cluster resource from a point in time restore.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void createsAMongoClusterResourceFromAPointInTimeRestore(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
        manager.mongoClusters().define("myMongoCluster").withRegion("westus2")
            .withExistingResourceGroup("TestResourceGroup").withCreateMode(CreateMode.POINT_IN_TIME_RESTORE)
            .withRestoreParameters(new MongoClusterRestoreParameters()
                .withPointInTimeUtc(OffsetDateTime.parse("2023-01-13T20:07:35Z")).withSourceResourceId(
                    "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestResourceGroup/providers/Microsoft.DocumentDB/mongoClusters/myOtherMongoCluster"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterCreate.json
     */
    /**
     * Sample code: Creates a new Mongo Cluster resource.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void createsANewMongoClusterResource(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
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
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterDelete.json
     */
    /**
     * Sample code: Deletes a Mongo Cluster resource.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void deletesAMongoClusterResource(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
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
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterGet.json
     */
    /**
     * Sample code: Gets a Mongo Cluster resource.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void
        getsAMongoClusterResource(com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
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
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterList.json
     */
    /**
     * Sample code: Lists the Mongo Cluster resources in a subscription.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void listsTheMongoClusterResourcesInASubscription(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
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
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterListByResourceGroup.json
     */
    /**
     * Sample code: Lists the Mongo Cluster resources in a resource group.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void listsTheMongoClusterResourcesInAResourceGroup(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
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
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterListConnectionStrings.json
     */
    /**
     * Sample code: List the available connection strings for the Mongo Cluster resource.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void listTheAvailableConnectionStringsForTheMongoClusterResource(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
        manager.mongoClusters().listConnectionStringsWithResponse("TestGroup", "myMongoCluster",
            com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_Update

```java
import com.azure.resourcemanager.cosmosdbmongoclusters.models.MongoCluster;
import com.azure.resourcemanager.cosmosdbmongoclusters.models.NodeGroupSpec;
import com.azure.resourcemanager.cosmosdbmongoclusters.models.NodeKind;
import com.azure.resourcemanager.cosmosdbmongoclusters.models.PublicNetworkAccess;
import java.util.Arrays;

/**
 * Samples for MongoClusters Update.
 */
public final class MongoClustersUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterPatchDiskSize.json
     */
    /**
     * Sample code: Updates the disk size on a Mongo Cluster resource.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void updatesTheDiskSizeOnAMongoClusterResource(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
        MongoCluster resource = manager.mongoClusters()
            .getByResourceGroupWithResponse("TestResourceGroup", "myMongoCluster", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withNodeGroupSpecs(Arrays.asList(new NodeGroupSpec().withDiskSizeGB(256L).withKind(NodeKind.SHARD)))
            .apply();
    }

    /*
     * x-ms-original-file:
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterPatchPrivateNetworkAccess.json
     */
    /**
     * Sample code: Disables public network access on a Mongo Cluster resource with a private endpoint connection.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void disablesPublicNetworkAccessOnAMongoClusterResourceWithAPrivateEndpointConnection(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
        MongoCluster resource = manager.mongoClusters()
            .getByResourceGroupWithResponse("TestResourceGroup", "myMongoCluster", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withPublicNetworkAccess(PublicNetworkAccess.DISABLED).apply();
    }

    /*
     * x-ms-original-file:
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * CosmosDBMongoClusterUpdate.json
     */
    /**
     * Sample code: Updates a Mongo Cluster resource.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void updatesAMongoClusterResource(
        com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
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
     * specification/cosmosdbmongoclusters/resource-manager/Microsoft.DocumentDB/preview/2024-03-01-preview/examples/
     * OperationsGet.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void
        operationsList(com.azure.resourcemanager.cosmosdbmongoclusters.CosmosDBMongoClusterManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

