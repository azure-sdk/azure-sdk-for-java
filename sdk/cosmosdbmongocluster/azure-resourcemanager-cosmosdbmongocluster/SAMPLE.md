# Code snippets and samples


## MongoClusters

- [CheckNameAvailability](#mongoclusters_checknameavailability)
- [CreateOrUpdate](#mongoclusters_createorupdate)
- [CreateOrUpdateFirewallRule](#mongoclusters_createorupdatefirewallrule)
- [Delete](#mongoclusters_delete)
- [DeleteFirewallRule](#mongoclusters_deletefirewallrule)
- [GetByResourceGroup](#mongoclusters_getbyresourcegroup)
- [GetFirewallRule](#mongoclusters_getfirewallrule)
- [List](#mongoclusters_list)
- [ListByResourceGroup](#mongoclusters_listbyresourcegroup)
- [ListConnectionStrings](#mongoclusters_listconnectionstrings)
- [ListFirewallRules](#mongoclusters_listfirewallrules)
- [Update](#mongoclusters_update)

## ResourceProvider

- [ListOperations](#resourceprovider_listoperations)
### MongoClusters_CheckNameAvailability

```java
import com.azure.resourcemanager.cosmosdbmongocluster.models.CheckNameAvailabilityRequest;

/** Samples for MongoClusters CheckNameAvailability. */
public final class MongoClustersCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterNameAvailability_AlreadyExists.json
     */
    /**
     * Sample code: Check name availability already exists result.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void checkNameAvailabilityAlreadyExistsResult(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager
            .mongoClusters()
            .checkNameAvailabilityWithResponse(
                "westus2",
                new CheckNameAvailabilityRequest()
                    .withName("existingmongocluster")
                    .withType("Microsoft.DocumentDB/mongoClusters"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterNameAvailability.json
     */
    /**
     * Sample code: Check name availability.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void checkNameAvailability(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager
            .mongoClusters()
            .checkNameAvailabilityWithResponse(
                "westus2",
                new CheckNameAvailabilityRequest()
                    .withName("newmongocluster")
                    .withType("Microsoft.DocumentDB/mongoClusters"),
                com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_CreateOrUpdate

```java
import com.azure.resourcemanager.cosmosdbmongocluster.models.CreateMode;
import com.azure.resourcemanager.cosmosdbmongocluster.models.MongoClusterRestoreParameters;
import com.azure.resourcemanager.cosmosdbmongocluster.models.NodeGroupSpec;
import com.azure.resourcemanager.cosmosdbmongocluster.models.NodeKind;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for MongoClusters CreateOrUpdate. */
public final class MongoClustersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterCreatePITR.json
     */
    /**
     * Sample code: Create a new mongo cluster with point in time restore.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void createANewMongoClusterWithPointInTimeRestore(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager
            .mongoClusters()
            .define("myMongoCluster")
            .withRegion("westus2")
            .withExistingResourceGroup("TestResourceGroup")
            .withCreateMode(CreateMode.POINT_IN_TIME_RESTORE)
            .withRestoreParameters(
                new MongoClusterRestoreParameters()
                    .withPointInTimeUtc(OffsetDateTime.parse("2023-01-13T20:07:35Z"))
                    .withSourceResourceId(
                        "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestResourceGroup/providers/Microsoft.DocumentDB/mongoClusters/myOtherMongoCluster"))
            .create();
    }

    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterCreate.json
     */
    /**
     * Sample code: Create a new mongo cluster.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void createANewMongoCluster(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager
            .mongoClusters()
            .define("myMongoCluster")
            .withRegion("westus2")
            .withExistingResourceGroup("TestResourceGroup")
            .withAdministratorLogin("mongoAdmin")
            .withAdministratorLoginPassword("password")
            .withServerVersion("5.0")
            .withNodeGroupSpecs(
                Arrays
                    .asList(
                        new NodeGroupSpec()
                            .withSku("M30")
                            .withDiskSizeGB(128L)
                            .withEnableHa(true)
                            .withKind(NodeKind.SHARD)
                            .withNodeCount(3)))
            .create();
    }
}
```

### MongoClusters_CreateOrUpdateFirewallRule

```java
/** Samples for MongoClusters CreateOrUpdateFirewallRule. */
public final class MongoClustersCreateOrUpdateFirewallRuleSamples {
    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterFirewallRuleCreate.json
     */
    /**
     * Sample code: Create a firewall rule of the mongo cluster.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void createAFirewallRuleOfTheMongoCluster(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager
            .mongoClusters()
            .defineFirewallRule("rule1")
            .withExistingMongoCluster("TestGroup", "myMongoCluster")
            .withStartIpAddress("0.0.0.0")
            .withEndIpAddress("255.255.255.255")
            .create();
    }
}
```

### MongoClusters_Delete

```java
/** Samples for MongoClusters Delete. */
public final class MongoClustersDeleteSamples {
    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterDelete.json
     */
    /**
     * Sample code: Delete the mongo cluster.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void deleteTheMongoCluster(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager.mongoClusters().delete("TestResourceGroup", "myMongoCluster", com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_DeleteFirewallRule

```java
/** Samples for MongoClusters DeleteFirewallRule. */
public final class MongoClustersDeleteFirewallRuleSamples {
    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterFirewallRuleDelete.json
     */
    /**
     * Sample code: Delete the firewall rule of the mongo cluster.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void deleteTheFirewallRuleOfTheMongoCluster(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager
            .mongoClusters()
            .deleteFirewallRule("TestGroup", "myMongoCluster", "rule1", com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_GetByResourceGroup

```java
/** Samples for MongoClusters GetByResourceGroup. */
public final class MongoClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterGet.json
     */
    /**
     * Sample code: Get the mongo cluster.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void getTheMongoCluster(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager
            .mongoClusters()
            .getByResourceGroupWithResponse("TestResourceGroup", "myMongoCluster", com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_GetFirewallRule

```java
/** Samples for MongoClusters GetFirewallRule. */
public final class MongoClustersGetFirewallRuleSamples {
    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterFirewallRuleGet.json
     */
    /**
     * Sample code: Get the firewall rule of the mongo cluster.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void getTheFirewallRuleOfTheMongoCluster(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager
            .mongoClusters()
            .getFirewallRuleWithResponse("TestGroup", "myMongoCluster", "rule1", com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_List

```java
/** Samples for MongoClusters List. */
public final class MongoClustersListSamples {
    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterList.json
     */
    /**
     * Sample code: List all the mongo clusters.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void listAllTheMongoClusters(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager.mongoClusters().list(com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_ListByResourceGroup

```java
/** Samples for MongoClusters ListByResourceGroup. */
public final class MongoClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterListByResourceGroup.json
     */
    /**
     * Sample code: List the mongo clusters by resource group.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void listTheMongoClustersByResourceGroup(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager.mongoClusters().listByResourceGroup("TestResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_ListConnectionStrings

```java
/** Samples for MongoClusters ListConnectionStrings. */
public final class MongoClustersListConnectionStringsSamples {
    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterListConnectionStrings.json
     */
    /**
     * Sample code: Get connection string.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void getConnectionString(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager
            .mongoClusters()
            .listConnectionStringsWithResponse("TestGroup", "myMongoCluster", com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_ListFirewallRules

```java
/** Samples for MongoClusters ListFirewallRules. */
public final class MongoClustersListFirewallRulesSamples {
    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterFirewallRuleList.json
     */
    /**
     * Sample code: List firewall rules of the mongo cluster.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void listFirewallRulesOfTheMongoCluster(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager.mongoClusters().listFirewallRules("TestGroup", "myMongoCluster", com.azure.core.util.Context.NONE);
    }
}
```

### MongoClusters_Update

```java
import com.azure.resourcemanager.cosmosdbmongocluster.models.MongoCluster;
import com.azure.resourcemanager.cosmosdbmongocluster.models.NodeGroupSpec;
import com.azure.resourcemanager.cosmosdbmongocluster.models.NodeKind;
import java.util.Arrays;

/** Samples for MongoClusters Update. */
public final class MongoClustersUpdateSamples {
    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterAddNode.json
     */
    /**
     * Sample code: Add new shard nodes.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void addNewShardNodes(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        MongoCluster resource =
            manager
                .mongoClusters()
                .getByResourceGroupWithResponse("TestResourceGroup", "myMongoCluster", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withNodeGroupSpecs(Arrays.asList(new NodeGroupSpec().withKind(NodeKind.SHARD).withNodeCount(4)))
            .apply();
    }

    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/CosmosDBMongoClusterUpdate.json
     */
    /**
     * Sample code: Update the mongo cluster.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void updateTheMongoCluster(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        MongoCluster resource =
            manager
                .mongoClusters()
                .getByResourceGroupWithResponse("TestResourceGroup", "myMongoCluster", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withAdministratorLogin("mongoAdmin")
            .withAdministratorLoginPassword("password")
            .withServerVersion("5.0")
            .withNodeGroupSpecs(
                Arrays
                    .asList(
                        new NodeGroupSpec()
                            .withSku("M50")
                            .withDiskSizeGB(256L)
                            .withEnableHa(true)
                            .withKind(NodeKind.SHARD)
                            .withNodeCount(4)))
            .apply();
    }
}
```

### ResourceProvider_ListOperations

```java
/** Samples for ResourceProvider ListOperations. */
public final class ResourceProviderListOperationsSamples {
    /*
     * x-ms-original-file: specification/cosmosdbmongocluster/resource-manager/Microsoft.DocumentDB/stable/2023-10-01/examples/OperationsList.json
     */
    /**
     * Sample code: OperationsList.
     *
     * @param manager Entry point to CosmosDBMongoClusterManager.
     */
    public static void operationsList(
        com.azure.resourcemanager.cosmosdbmongocluster.CosmosDBMongoClusterManager manager) {
        manager.resourceProviders().listOperations(com.azure.core.util.Context.NONE);
    }
}
```

