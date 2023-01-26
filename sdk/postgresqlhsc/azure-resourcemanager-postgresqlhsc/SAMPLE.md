# Code snippets and samples


## Clusters

- [CheckNameAvailability](#clusters_checknameavailability)
- [CreateOrUpdate](#clusters_createorupdate)
- [Delete](#clusters_delete)
- [GetByResourceGroup](#clusters_getbyresourcegroup)
- [List](#clusters_list)
- [ListByResourceGroup](#clusters_listbyresourcegroup)
- [PromoteReadReplica](#clusters_promotereadreplica)
- [Restart](#clusters_restart)
- [Start](#clusters_start)
- [Stop](#clusters_stop)
- [Update](#clusters_update)

## Configurations

- [Get](#configurations_get)
- [ListByCluster](#configurations_listbycluster)
- [ListByServer](#configurations_listbyserver)
- [UpdateCoordinator](#configurations_updatecoordinator)
- [UpdateNode](#configurations_updatenode)

## FirewallRules

- [CreateOrUpdate](#firewallrules_createorupdate)
- [Delete](#firewallrules_delete)
- [Get](#firewallrules_get)
- [ListByCluster](#firewallrules_listbycluster)

## Operations

- [List](#operations_list)

## PrivateEndpointConnections

- [CreateOrUpdate](#privateendpointconnections_createorupdate)
- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [ListByCluster](#privateendpointconnections_listbycluster)

## PrivateLinkResources

- [Get](#privatelinkresources_get)
- [ListByCluster](#privatelinkresources_listbycluster)

## Roles

- [Create](#roles_create)
- [Delete](#roles_delete)
- [ListByCluster](#roles_listbycluster)

## Servers

- [Get](#servers_get)
- [ListByCluster](#servers_listbycluster)
### Clusters_CheckNameAvailability

```java
import com.azure.resourcemanager.postgresqlhsc.models.NameAvailabilityRequest;

/** Samples for Clusters CheckNameAvailability. */
public final class ClustersCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/CheckNameAvailability.json
     */
    /**
     * Sample code: Check name availability.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void checkNameAvailability(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .clusters()
            .checkNameAvailabilityWithResponse(
                new NameAvailabilityRequest().withName("name1"), com.azure.core.util.Context.NONE);
    }
}
```

### Clusters_CreateOrUpdate

```java
import com.azure.resourcemanager.postgresqlhsc.models.CoordinatorEnablePublicIpEnum;
import com.azure.resourcemanager.postgresqlhsc.models.EnableHaEnum;
import com.azure.resourcemanager.postgresqlhsc.models.EnableShardsOnCoordinatorEnum;
import com.azure.resourcemanager.postgresqlhsc.models.NodeEnablePublicIpEnum;
import java.util.HashMap;
import java.util.Map;

/** Samples for Clusters CreateOrUpdate. */
public final class ClustersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterCreateReadReplica.json
     */
    /**
     * Sample code: Create a new cluster as a read replica.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void createANewClusterAsAReadReplica(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .clusters()
            .define("hsctestsg")
            .withRegion("westus")
            .withExistingResourceGroup("TestGroup")
            .withSourceResourceId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestResourceGroup/providers/Microsoft.DBforPostgreSQL/serverGroupsv2/pgtests-source-cluster")
            .withSourceLocation("westus")
            .create();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterCreatePITR.json
     */
    /**
     * Sample code: Create a new cluster as a point in time restore.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void createANewClusterAsAPointInTimeRestore(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .clusters()
            .define("hsctestsg")
            .withRegion("westus")
            .withExistingResourceGroup("TestGroup")
            .withSourceResourceId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestResourceGroup/providers/Microsoft.DBforPostgreSQL/serverGroupsv2/pgtests-source-cluster")
            .withSourceLocation("westus")
            .create();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterCreate.json
     */
    /**
     * Sample code: Create a new cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void createANewCluster(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .clusters()
            .define("hsctestsg")
            .withRegion("westus")
            .withExistingResourceGroup("TestGroup")
            .withTags(mapOf())
            .withAdministratorLoginPassword("password")
            .withPostgresqlVersion("15")
            .withCitusVersion("11.1")
            .withEnableShardsOnCoordinator(EnableShardsOnCoordinatorEnum.FALSE)
            .withEnableHa(EnableHaEnum.TRUE)
            .withPreferredPrimaryZone("1")
            .withCoordinatorServerEdition("GeneralPurpose")
            .withCoordinatorStorageQuotaInMb(524288L)
            .withCoordinatorVCores(4L)
            .withCoordinatorEnablePublicIpAccess(CoordinatorEnablePublicIpEnum.TRUE)
            .withNodeServerEdition("MemoryOptimized")
            .withNodeCount(3L)
            .withNodeStorageQuotaInMb(524288L)
            .withNodeVCores(8L)
            .withNodeEnablePublicIpAccess(NodeEnablePublicIpEnum.FALSE)
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

### Clusters_Delete

```java
/** Samples for Clusters Delete. */
public final class ClustersDeleteSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterDelete.json
     */
    /**
     * Sample code: Delete the cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void deleteTheCluster(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.clusters().delete("TestGroup", "testcluster", com.azure.core.util.Context.NONE);
    }
}
```

### Clusters_GetByResourceGroup

```java
/** Samples for Clusters GetByResourceGroup. */
public final class ClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterGet.json
     */
    /**
     * Sample code: Get the cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void getTheCluster(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.clusters().getByResourceGroupWithResponse("TestGroup", "hsctestsg1", com.azure.core.util.Context.NONE);
    }
}
```

### Clusters_List

```java
/** Samples for Clusters List. */
public final class ClustersListSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterList.json
     */
    /**
     * Sample code: List all the clusters.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void listAllTheClusters(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.clusters().list(com.azure.core.util.Context.NONE);
    }
}
```

### Clusters_ListByResourceGroup

```java
/** Samples for Clusters ListByResourceGroup. */
public final class ClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterListByResourceGroup.json
     */
    /**
     * Sample code: List the clusters by resource group.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void listTheClustersByResourceGroup(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.clusters().listByResourceGroup("TestGroup", com.azure.core.util.Context.NONE);
    }
}
```

### Clusters_PromoteReadReplica

```java
/** Samples for Clusters PromoteReadReplica. */
public final class ClustersPromoteReadReplicaSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterPromoteReadReplica.json
     */
    /**
     * Sample code: Promote the read replica.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void promoteTheReadReplica(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.clusters().promoteReadReplica("TestGroup", "hsctestsg1", com.azure.core.util.Context.NONE);
    }
}
```

### Clusters_Restart

```java
/** Samples for Clusters Restart. */
public final class ClustersRestartSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterRestart.json
     */
    /**
     * Sample code: Restart all servers in the cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void restartAllServersInTheCluster(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.clusters().restart("TestGroup", "hsctestsg1", com.azure.core.util.Context.NONE);
    }
}
```

### Clusters_Start

```java
/** Samples for Clusters Start. */
public final class ClustersStartSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterStart.json
     */
    /**
     * Sample code: Start all servers in the cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void startAllServersInTheCluster(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.clusters().start("TestGroup", "hsctestsg1", com.azure.core.util.Context.NONE);
    }
}
```

### Clusters_Stop

```java
/** Samples for Clusters Stop. */
public final class ClustersStopSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterStop.json
     */
    /**
     * Sample code: Stop all servers in the cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void stopAllServersInTheCluster(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.clusters().stop("TestGroup", "hsctestsg1", com.azure.core.util.Context.NONE);
    }
}
```

### Clusters_Update

```java
import com.azure.resourcemanager.postgresqlhsc.models.ClusterResponse;
import com.azure.resourcemanager.postgresqlhsc.models.MaintenanceWindow;

/** Samples for Clusters Update. */
public final class ClustersUpdateSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterScaleStorage.json
     */
    /**
     * Sample code: Scale storage.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void scaleStorage(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        ClusterResponse resource =
            manager
                .clusters()
                .getByResourceGroupWithResponse("TestGroup", "hsctestsg", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withNodeStorageQuotaInMb(2097152L).apply();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterAddNode.json
     */
    /**
     * Sample code: Add new worker nodes.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void addNewWorkerNodes(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        ClusterResponse resource =
            manager
                .clusters()
                .getByResourceGroupWithResponse("TestGroup", "hsctestsg", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withNodeCount(2L).apply();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterUpdateMaintenanceWindow.json
     */
    /**
     * Sample code: Update customer maintenance window.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void updateCustomerMaintenanceWindow(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        ClusterResponse resource =
            manager
                .clusters()
                .getByResourceGroupWithResponse("TestGroup", "hsctestsg", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withMaintenanceWindow(
                new MaintenanceWindow()
                    .withCustomWindow("Enabled")
                    .withStartHour(8)
                    .withStartMinute(0)
                    .withDayOfWeek(0))
            .apply();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterUpdate.json
     */
    /**
     * Sample code: Update the cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void updateTheCluster(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        ClusterResponse resource =
            manager
                .clusters()
                .getByResourceGroupWithResponse("TestGroup", "hsctestsg", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withAdministratorLoginPassword("password")
            .withCoordinatorVCores(16L)
            .withNodeCount(4L)
            .withNodeVCores(16L)
            .apply();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterScaleCompute.json
     */
    /**
     * Sample code: Scale compute.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void scaleCompute(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        ClusterResponse resource =
            manager
                .clusters()
                .getByResourceGroupWithResponse("TestGroup", "hsctestsg", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withNodeVCores(16L).apply();
    }
}
```

### Configurations_Get

```java
/** Samples for Configurations Get. */
public final class ConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ConfigurationGet.json
     */
    /**
     * Sample code: Get configuration details.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void getConfigurationDetails(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .configurations()
            .getWithResponse("TestResourceGroup", "hsctestsg", "array_nulls", com.azure.core.util.Context.NONE);
    }
}
```

### Configurations_ListByCluster

```java
/** Samples for Configurations ListByCluster. */
public final class ConfigurationsListByClusterSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ConfigurationListByCluster.json
     */
    /**
     * Sample code: List configurations of the cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void listConfigurationsOfTheCluster(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.configurations().listByCluster("TestResourceGroup", "hsctestsg", com.azure.core.util.Context.NONE);
    }
}
```

### Configurations_ListByServer

```java
/** Samples for Configurations ListByServer. */
public final class ConfigurationsListByServerSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ConfigurationListByServer.json
     */
    /**
     * Sample code: List configurations of the server that in the cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void listConfigurationsOfTheServerThatInTheCluster(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .configurations()
            .listByServer("TestResourceGroup", "hsctestsg", "testserver", com.azure.core.util.Context.NONE);
    }
}
```

### Configurations_UpdateCoordinator

```java
import com.azure.resourcemanager.postgresqlhsc.models.ServerConfigurationRequest;

/** Samples for Configurations UpdateCoordinator. */
public final class ConfigurationsUpdateCoordinatorSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ConfigurationUpdateCoordinator.json
     */
    /**
     * Sample code: Update single configuration of coordinator.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void updateSingleConfigurationOfCoordinator(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .configurations()
            .updateCoordinator(
                "TestResourceGroup",
                "hsctestsg",
                "array_nulls",
                new ServerConfigurationRequest().withValue("on"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Configurations_UpdateNode

```java
import com.azure.resourcemanager.postgresqlhsc.models.ServerConfigurationRequest;

/** Samples for Configurations UpdateNode. */
public final class ConfigurationsUpdateNodeSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ConfigurationUpdateNode.json
     */
    /**
     * Sample code: Update single configuration of nodes.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void updateSingleConfigurationOfNodes(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .configurations()
            .updateNode(
                "TestResourceGroup",
                "hsctestsg",
                "array_nulls",
                new ServerConfigurationRequest().withValue("off"),
                com.azure.core.util.Context.NONE);
    }
}
```

### FirewallRules_CreateOrUpdate

```java
/** Samples for FirewallRules CreateOrUpdate. */
public final class FirewallRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/FirewallRuleCreate.json
     */
    /**
     * Sample code: Create a firewall rule of the cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void createAFirewallRuleOfTheCluster(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .firewallRules()
            .define("rule1")
            .withExistingServerGroupsv2("TestGroup", "pgtestsvc4")
            .withStartIpAddress("0.0.0.0")
            .withEndIpAddress("255.255.255.255")
            .create();
    }
}
```

### FirewallRules_Delete

```java
/** Samples for FirewallRules Delete. */
public final class FirewallRulesDeleteSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/FirewallRuleDelete.json
     */
    /**
     * Sample code: Delete the firewall rule of the cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void deleteTheFirewallRuleOfTheCluster(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.firewallRules().delete("TestGroup", "pgtestsvc4", "rule1", com.azure.core.util.Context.NONE);
    }
}
```

### FirewallRules_Get

```java
/** Samples for FirewallRules Get. */
public final class FirewallRulesGetSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/FirewallRuleGet.json
     */
    /**
     * Sample code: Get the firewall rule of the cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void getTheFirewallRuleOfTheCluster(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.firewallRules().getWithResponse("TestGroup", "pgtestsvc4", "rule1", com.azure.core.util.Context.NONE);
    }
}
```

### FirewallRules_ListByCluster

```java
/** Samples for FirewallRules ListByCluster. */
public final class FirewallRulesListByClusterSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/FirewallRuleListByCluster.json
     */
    /**
     * Sample code: List firewall rules of the cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void listFirewallRulesOfTheCluster(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.firewallRules().listByCluster("TestGroup", "pgtestsvc4", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/OperationList.json
     */
    /**
     * Sample code: List all available operations.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void listAllAvailableOperations(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_CreateOrUpdate

```java
import com.azure.resourcemanager.postgresqlhsc.models.PrivateLinkServiceConnectionRequestState;

/** Samples for PrivateEndpointConnections CreateOrUpdate. */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/PrivateEndpointConnectionCreateOrUpdate.json
     */
    /**
     * Sample code: Approve or reject a private endpoint connection with a given name.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void approveOrRejectAPrivateEndpointConnectionWithAGivenName(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .privateEndpointConnections()
            .define("private-endpoint-connection-name")
            .withExistingServerGroupsv2("TestGroup", "hsctestsg")
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionRequestState()
                    .withDescription("Approved by johndoe@contoso.com")
                    .withStatus("Approved"))
            .create();
    }
}
```

### PrivateEndpointConnections_Delete

```java
/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/PrivateEndpointConnectionsDelete.json
     */
    /**
     * Sample code: Deletes a private endpoint connection with a given name.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void deletesAPrivateEndpointConnectionWithAGivenName(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .privateEndpointConnections()
            .delete("TestGroup", "hsctestsg", "private-endpoint-connection-name", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/PrivateEndpointConnectionsGet.json
     */
    /**
     * Sample code: Gets private endpoint connection.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void getsPrivateEndpointConnection(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse(
                "TestGroup", "hsctestsg", "private-endpoint-connection-name", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_ListByCluster

```java
/** Samples for PrivateEndpointConnections ListByCluster. */
public final class PrivateEndpointConnectionsListByClusterSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/PrivateEndpointConnectionsListByCluster.json
     */
    /**
     * Sample code: Gets list of private endpoint connections on a cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void getsListOfPrivateEndpointConnectionsOnACluster(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .privateEndpointConnections()
            .listByCluster("TestResourceGroup", "hsctestsg", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_Get

```java
/** Samples for PrivateLinkResources Get. */
public final class PrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/PrivateLinkResourcesGet.json
     */
    /**
     * Sample code: Gets a private link resource for cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void getsAPrivateLinkResourceForCluster(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .privateLinkResources()
            .getWithResponse("TestGroup", "hsctestsg", "plr", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_ListByCluster

```java
/** Samples for PrivateLinkResources ListByCluster. */
public final class PrivateLinkResourcesListByClusterSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/PrivateLinkResourceListByCluster.json
     */
    /**
     * Sample code: Gets the private link resources for cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void getsThePrivateLinkResourcesForCluster(
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .privateLinkResources()
            .listByCluster("TestResourceGroup", "hsctestsg", com.azure.core.util.Context.NONE);
    }
}
```

### Roles_Create

```java
/** Samples for Roles Create. */
public final class RolesCreateSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/RoleCreate.json
     */
    /**
     * Sample code: RoleCreate.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void roleCreate(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager
            .roles()
            .define("role1")
            .withExistingServerGroupsv2("TestGroup", "pgtestsvc4")
            .withPassword("secret")
            .create();
    }
}
```

### Roles_Delete

```java
/** Samples for Roles Delete. */
public final class RolesDeleteSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/RoleDelete.json
     */
    /**
     * Sample code: RoleDelete.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void roleDelete(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.roles().delete("TestGroup", "pgtestsvc4", "role1", com.azure.core.util.Context.NONE);
    }
}
```

### Roles_ListByCluster

```java
/** Samples for Roles ListByCluster. */
public final class RolesListByClusterSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/RoleListByCluster.json
     */
    /**
     * Sample code: RoleList.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void roleList(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.roles().listByCluster("TestGroup", "pgtestsvc4", com.azure.core.util.Context.NONE);
    }
}
```

### Servers_Get

```java
/** Samples for Servers Get. */
public final class ServersGetSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ServerGet.json
     */
    /**
     * Sample code: Get the server of cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void getTheServerOfCluster(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.servers().getWithResponse("TestGroup", "hsctestsg1", "hsctestsg1-c", com.azure.core.util.Context.NONE);
    }
}
```

### Servers_ListByCluster

```java
/** Samples for Servers ListByCluster. */
public final class ServersListByClusterSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ServerListByCluster.json
     */
    /**
     * Sample code: List servers of the cluster.
     *
     * @param manager Entry point to PostgresqlhscManager.
     */
    public static void listServersOfTheCluster(com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager) {
        manager.servers().listByCluster("TestGroup", "hsctestsg1", com.azure.core.util.Context.NONE);
    }
}
```

