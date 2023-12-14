# Code snippets and samples


## CloudExadataInfrastructures

- [CreateOrUpdate](#cloudexadatainfrastructures_createorupdate)
- [Delete](#cloudexadatainfrastructures_delete)
- [GetByResourceGroup](#cloudexadatainfrastructures_getbyresourcegroup)
- [List](#cloudexadatainfrastructures_list)
- [ListByResourceGroup](#cloudexadatainfrastructures_listbyresourcegroup)
- [Update](#cloudexadatainfrastructures_update)

## CloudVmClusters

- [AddVms](#cloudvmclusters_addvms)
- [CreateOrUpdate](#cloudvmclusters_createorupdate)
- [Delete](#cloudvmclusters_delete)
- [GetByResourceGroup](#cloudvmclusters_getbyresourcegroup)
- [List](#cloudvmclusters_list)
- [ListByResourceGroup](#cloudvmclusters_listbyresourcegroup)
- [ListPrivateIpAddresses](#cloudvmclusters_listprivateipaddresses)
- [RemoveVms](#cloudvmclusters_removevms)
- [Update](#cloudvmclusters_update)

## DbNodes

- [Get](#dbnodes_get)
- [ListByCloudVmCluster](#dbnodes_listbycloudvmcluster)

## DbServers

- [Get](#dbservers_get)
- [ListByCloudExadataInfrastructure](#dbservers_listbycloudexadatainfrastructure)

## DbSystemShapes

- [Get](#dbsystemshapes_get)
- [ListByLocation](#dbsystemshapes_listbylocation)

## DnsPrivateViews

- [Get](#dnsprivateviews_get)
- [ListByLocation](#dnsprivateviews_listbylocation)

## DnsPrivateZones

- [Get](#dnsprivatezones_get)
- [ListByLocation](#dnsprivatezones_listbylocation)

## GiVersions

- [Get](#giversions_get)
- [ListByLocation](#giversions_listbylocation)

## Operations

- [List](#operations_list)

## OracleSubscriptions

- [CreateOrUpdate](#oraclesubscriptions_createorupdate)
- [Delete](#oraclesubscriptions_delete)
- [Get](#oraclesubscriptions_get)
- [List](#oraclesubscriptions_list)
- [ListCloudAccountDetails](#oraclesubscriptions_listcloudaccountdetails)
- [ListSaasSubscriptionDetails](#oraclesubscriptions_listsaassubscriptiondetails)
- [Update](#oraclesubscriptions_update)

## VirtualNetworkAddresses

- [CreateOrUpdate](#virtualnetworkaddresses_createorupdate)
- [Delete](#virtualnetworkaddresses_delete)
- [Get](#virtualnetworkaddresses_get)
- [ListByCloudVmCluster](#virtualnetworkaddresses_listbycloudvmcluster)
### CloudExadataInfrastructures_CreateOrUpdate

```java
import java.util.Arrays;

/**
 * Samples for CloudExadataInfrastructures CreateOrUpdate.
 */
public final class CloudExadataInfrastructuresCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/exaInfra_create.json
     */
    /**
     * Sample code: Create Exadata Infrastructure.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void createExadataInfrastructure(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.cloudExadataInfrastructures().define("infra1").withRegion("eastus").withExistingResourceGroup("rg000").withZones(Arrays.asList("AZ1")).withComputeCount(100).withStorageCount(10).withShape("EXADATA.X9M").withDisplayName("infra 1").create();
    }
}
```

### CloudExadataInfrastructures_Delete

```java
/**
 * Samples for CloudExadataInfrastructures Delete.
 */
public final class CloudExadataInfrastructuresDeleteSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/exaInfra_delete.json
     */
    /**
     * Sample code: Delete Exadata Infrastructure.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void deleteExadataInfrastructure(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.cloudExadataInfrastructures().delete("rg000", "infra1", com.azure.core.util.Context.NONE);
    }
}
```

### CloudExadataInfrastructures_GetByResourceGroup

```java
/**
 * Samples for CloudExadataInfrastructures GetByResourceGroup.
 */
public final class CloudExadataInfrastructuresGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/exaInfra_get.json
     */
    /**
     * Sample code: Get Exadata Infrastructure.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void getExadataInfrastructure(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.cloudExadataInfrastructures().getByResourceGroupWithResponse("rg000", "infra1", com.azure.core.util.Context.NONE);
    }
}
```

### CloudExadataInfrastructures_List

```java
/**
 * Samples for CloudExadataInfrastructures List.
 */
public final class CloudExadataInfrastructuresListSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/exaInfra_listBySubscription.json
     */
    /**
     * Sample code: List Exadata Infrastructure by subscription.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listExadataInfrastructureBySubscription(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.cloudExadataInfrastructures().list(com.azure.core.util.Context.NONE);
    }
}
```

### CloudExadataInfrastructures_ListByResourceGroup

```java
/**
 * Samples for CloudExadataInfrastructures ListByResourceGroup.
 */
public final class CloudExadataInfrastructuresListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/exaInfra_listByResourceGroup.json
     */
    /**
     * Sample code: List Exadata Infrastructure by resource group.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listExadataInfrastructureByResourceGroup(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.cloudExadataInfrastructures().listByResourceGroup("rg000", com.azure.core.util.Context.NONE);
    }
}
```

### CloudExadataInfrastructures_Update

```java
import com.azure.resourcemanager.oracle.models.CloudExadataInfrastructure;

/**
 * Samples for CloudExadataInfrastructures Update.
 */
public final class CloudExadataInfrastructuresUpdateSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/exaInfra_patch.json
     */
    /**
     * Sample code: Patch Exadata Infrastructure.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void patchExadataInfrastructure(com.azure.resourcemanager.oracle.OracleManager manager) {
        CloudExadataInfrastructure resource = manager.cloudExadataInfrastructures().getByResourceGroupWithResponse("rg000", "infra1", com.azure.core.util.Context.NONE).getValue();
        resource.update().apply();
    }
}
```

### CloudVmClusters_AddVms

```java
import com.azure.resourcemanager.oracle.models.AddRemoveDbNode;
import java.util.Arrays;

/**
 * Samples for CloudVmClusters AddVms.
 */
public final class CloudVmClustersAddVmsSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/vmClusters_addVms.json
     */
    /**
     * Sample code: Add VMs to VM Cluster.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void addVMsToVMCluster(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.cloudVmClusters().addVms("rg000", "cluster1", new AddRemoveDbNode().withDbServers(Arrays.asList("ocid1..aaaa", "ocid1..aaaaaa")), com.azure.core.util.Context.NONE);
    }
}
```

### CloudVmClusters_CreateOrUpdate

```java
import com.azure.resourcemanager.oracle.models.DataCollectionOptions;
import com.azure.resourcemanager.oracle.models.LicenseModel;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Samples for CloudVmClusters CreateOrUpdate.
 */
public final class CloudVmClustersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/vmClusters_create.json
     */
    /**
     * Sample code: Create VM Cluster.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void createVMCluster(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.cloudVmClusters().define("cluster1").withRegion("eastus").withExistingResourceGroup("rg000").withDataStorageSizeInTbs(1000.0D).withDbNodeStorageSizeInGbs(1000).withMemorySizeInGbs(1000).withTimeZone("UTC").withHostname("hostname1").withDomain("domain1").withCpuCoreCount(2).withOcpuCount(3.0F).withClusterName("cluster1").withDataStoragePercentage(100).withIsLocalBackupEnabled(false).withCloudExadataInfrastructureId("/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg000/providers/Oracle.Database/cloudExadataInfrastructures/infra1").withIsSparseDiskgroupEnabled(false).withSshPublicKeys(Arrays.asList("ssh-key 1")).withLicenseModel(LicenseModel.LICENSE_INCLUDED).withScanListenerPortTcp(1050).withScanListenerPortTcpSsl(1025).withVnetId("/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg000/providers/Microsoft.Network/virtualNetworks/vnet1").withGiVersion("19.0.0.0").withSubnetId("/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg000/providers/Microsoft.Network/virtualNetworks/vnet1/subnets/subnet1").withDataCollectionOptions(new DataCollectionOptions().withIsDiagnosticsEventsEnabled(false).withIsHealthMonitoringEnabled(false).withIsIncidentLogsEnabled(false)).withDisplayName("cluster 1").withDbServers(Arrays.asList("ocid1..aaaa")).create();
    }
}
```

### CloudVmClusters_Delete

```java
/**
 * Samples for CloudVmClusters Delete.
 */
public final class CloudVmClustersDeleteSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/vmClusters_delete.json
     */
    /**
     * Sample code: Delete VM Cluster.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void deleteVMCluster(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.cloudVmClusters().delete("rg000", "cluster1", com.azure.core.util.Context.NONE);
    }
}
```

### CloudVmClusters_GetByResourceGroup

```java
/**
 * Samples for CloudVmClusters GetByResourceGroup.
 */
public final class CloudVmClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/vmClusters_get.json
     */
    /**
     * Sample code: Get VM Cluster.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void getVMCluster(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.cloudVmClusters().getByResourceGroupWithResponse("rg000", "cluster1", com.azure.core.util.Context.NONE);
    }
}
```

### CloudVmClusters_List

```java
/**
 * Samples for CloudVmClusters List.
 */
public final class CloudVmClustersListSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/vmClusters_listBySubscription.json
     */
    /**
     * Sample code: List VM Clusters by subscription.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listVMClustersBySubscription(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.cloudVmClusters().list(com.azure.core.util.Context.NONE);
    }
}
```

### CloudVmClusters_ListByResourceGroup

```java
/**
 * Samples for CloudVmClusters ListByResourceGroup.
 */
public final class CloudVmClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/vmClusters_listByResourceGroup.json
     */
    /**
     * Sample code: List VM Clusters by resource group.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listVMClustersByResourceGroup(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.cloudVmClusters().listByResourceGroup("rg000", com.azure.core.util.Context.NONE);
    }
}
```

### CloudVmClusters_ListPrivateIpAddresses

```java
import com.azure.resourcemanager.oracle.models.PrivateIpAddressesFilter;

/**
 * Samples for CloudVmClusters ListPrivateIpAddresses.
 */
public final class CloudVmClustersListPrivateIpAddressesSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/vmClusters_listPrivateIpAddresses.json
     */
    /**
     * Sample code: List Private IP Addresses for VM Cluster.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listPrivateIPAddressesForVMCluster(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.cloudVmClusters().listPrivateIpAddressesWithResponse("rg000", "cluster1", new PrivateIpAddressesFilter().withSubnetId("ocid1..aaaaaa").withVnicId("ocid1..aaaaa"), com.azure.core.util.Context.NONE);
    }
}
```

### CloudVmClusters_RemoveVms

```java
import com.azure.resourcemanager.oracle.models.AddRemoveDbNode;
import java.util.Arrays;

/**
 * Samples for CloudVmClusters RemoveVms.
 */
public final class CloudVmClustersRemoveVmsSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/vmClusters_removeVms.json
     */
    /**
     * Sample code: Remove VMs from VM Cluster.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void removeVMsFromVMCluster(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.cloudVmClusters().removeVms("rg000", "cluster1", new AddRemoveDbNode().withDbServers(Arrays.asList("ocid1..aaaa")), com.azure.core.util.Context.NONE);
    }
}
```

### CloudVmClusters_Update

```java
import com.azure.resourcemanager.oracle.models.CloudVmCluster;

/**
 * Samples for CloudVmClusters Update.
 */
public final class CloudVmClustersUpdateSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/vmClusters_patch.json
     */
    /**
     * Sample code: Patch VM Cluster.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void patchVMCluster(com.azure.resourcemanager.oracle.OracleManager manager) {
        CloudVmCluster resource = manager.cloudVmClusters().getByResourceGroupWithResponse("rg000", "cluster1", com.azure.core.util.Context.NONE).getValue();
        resource.update().apply();
    }
}
```

### DbNodes_Get

```java
/**
 * Samples for DbNodes Get.
 */
public final class DbNodesGetSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/dbNodes_get.json
     */
    /**
     * Sample code: Get DbNode.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void getDbNode(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.dbNodes().getWithResponse("rg000", "cluster1", "ocid1....aaaaaa", com.azure.core.util.Context.NONE);
    }
}
```

### DbNodes_ListByCloudVmCluster

```java
/**
 * Samples for DbNodes ListByCloudVmCluster.
 */
public final class DbNodesListByCloudVmClusterSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/dbNodes_listByParent.json
     */
    /**
     * Sample code: List DbNodes by VM Cluster.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listDbNodesByVMCluster(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.dbNodes().listByCloudVmCluster("rg000", "cluster1", com.azure.core.util.Context.NONE);
    }
}
```

### DbServers_Get

```java
/**
 * Samples for DbServers Get.
 */
public final class DbServersGetSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/dbServers_get.json
     */
    /**
     * Sample code: Get DbServer by parent.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void getDbServerByParent(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.dbServers().getWithResponse("rg000", "infra1", "ocid1....aaaaaa", com.azure.core.util.Context.NONE);
    }
}
```

### DbServers_ListByCloudExadataInfrastructure

```java
/**
 * Samples for DbServers ListByCloudExadataInfrastructure.
 */
public final class DbServersListByCloudExadataInfrastructureSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/dbServers_listByParent.json
     */
    /**
     * Sample code: List DbServers by Exadata Infrastructure.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listDbServersByExadataInfrastructure(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.dbServers().listByCloudExadataInfrastructure("rg000", "infra1", com.azure.core.util.Context.NONE);
    }
}
```

### DbSystemShapes_Get

```java
/**
 * Samples for DbSystemShapes Get.
 */
public final class DbSystemShapesGetSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/dbSystemShapes_get.json
     */
    /**
     * Sample code: Get a DbSystemShape by name.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void getADbSystemShapeByName(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.dbSystemShapes().getWithResponse("eastus", "EXADATA.X9M", com.azure.core.util.Context.NONE);
    }
}
```

### DbSystemShapes_ListByLocation

```java
/**
 * Samples for DbSystemShapes ListByLocation.
 */
public final class DbSystemShapesListByLocationSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/dbSystemShapes_listByLocation.json
     */
    /**
     * Sample code: List DbSystemShapes by location.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listDbSystemShapesByLocation(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.dbSystemShapes().listByLocation("eastus", com.azure.core.util.Context.NONE);
    }
}
```

### DnsPrivateViews_Get

```java
/**
 * Samples for DnsPrivateViews Get.
 */
public final class DnsPrivateViewsGetSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/dnsPrivateViews_get.json
     */
    /**
     * Sample code: Get a DnsPrivateView by name.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void getADnsPrivateViewByName(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.dnsPrivateViews().getWithResponse("eastus", "ocid1....aaaaaa", com.azure.core.util.Context.NONE);
    }
}
```

### DnsPrivateViews_ListByLocation

```java
/**
 * Samples for DnsPrivateViews ListByLocation.
 */
public final class DnsPrivateViewsListByLocationSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/dnsPrivateViews_listByLocation.json
     */
    /**
     * Sample code: List DnsPrivateViews by location.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listDnsPrivateViewsByLocation(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.dnsPrivateViews().listByLocation("eastus", com.azure.core.util.Context.NONE);
    }
}
```

### DnsPrivateZones_Get

```java
/**
 * Samples for DnsPrivateZones Get.
 */
public final class DnsPrivateZonesGetSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/dnsPrivateZones_get.json
     */
    /**
     * Sample code: Get a DnsPrivateZone by name.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void getADnsPrivateZoneByName(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.dnsPrivateZones().getWithResponse("eastus", "example-dns-private-zone", com.azure.core.util.Context.NONE);
    }
}
```

### DnsPrivateZones_ListByLocation

```java
/**
 * Samples for DnsPrivateZones ListByLocation.
 */
public final class DnsPrivateZonesListByLocationSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/dnsPrivateZones_listByLocation.json
     */
    /**
     * Sample code: List DnsPrivateZones by location.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listDnsPrivateZonesByLocation(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.dnsPrivateZones().listByLocation("eastus", com.azure.core.util.Context.NONE);
    }
}
```

### GiVersions_Get

```java
/**
 * Samples for GiVersions Get.
 */
public final class GiVersionsGetSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/giVersions_get.json
     */
    /**
     * Sample code: Get a GiVersion by name.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void getAGiVersionByName(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.giVersions().getWithResponse("eastus", "19.0.0.0", com.azure.core.util.Context.NONE);
    }
}
```

### GiVersions_ListByLocation

```java
/**
 * Samples for GiVersions ListByLocation.
 */
public final class GiVersionsListByLocationSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/giVersions_listByLocation.json
     */
    /**
     * Sample code: List GiVersions by location.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listGiVersionsByLocation(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.giVersions().listByLocation("eastus", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/operations_list.json
     */
    /**
     * Sample code: List Operations.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listOperations(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### OracleSubscriptions_CreateOrUpdate

```java
import com.azure.resourcemanager.oracle.fluent.models.OracleSubscriptionInner;
import com.azure.resourcemanager.oracle.models.Plan;

/**
 * Samples for OracleSubscriptions CreateOrUpdate.
 */
public final class OracleSubscriptionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/oracleSubscriptions_create.json
     */
    /**
     * Sample code: Create or Update Oracle Subscription.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void createOrUpdateOracleSubscription(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.oracleSubscriptions().createOrUpdate(new OracleSubscriptionInner().withPlan(new Plan().withName("plan1").withPublisher("publisher1").withProduct("product1").withPromotionCode("fakeTokenPlaceholder").withVersion("alpha")), com.azure.core.util.Context.NONE);
    }
}
```

### OracleSubscriptions_Delete

```java
/**
 * Samples for OracleSubscriptions Delete.
 */
public final class OracleSubscriptionsDeleteSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/oracleSubscriptions_delete.json
     */
    /**
     * Sample code: Delete Oracle Subscription.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void deleteOracleSubscription(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.oracleSubscriptions().delete(com.azure.core.util.Context.NONE);
    }
}
```

### OracleSubscriptions_Get

```java
/**
 * Samples for OracleSubscriptions Get.
 */
public final class OracleSubscriptionsGetSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/oracleSubscriptions_get.json
     */
    /**
     * Sample code: Get Oracle Subscription.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void getOracleSubscription(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.oracleSubscriptions().getWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

### OracleSubscriptions_List

```java
/**
 * Samples for OracleSubscriptions List.
 */
public final class OracleSubscriptionsListSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/oracleSubscriptions_listBySubscription.json
     */
    /**
     * Sample code: List Oracle Subscriptions by subscription.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listOracleSubscriptionsBySubscription(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.oracleSubscriptions().list(com.azure.core.util.Context.NONE);
    }
}
```

### OracleSubscriptions_ListCloudAccountDetails

```java
/**
 * Samples for OracleSubscriptions ListCloudAccountDetails.
 */
public final class OracleSubscriptionsListCloudAccountDetailsSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/oracleSubscriptions_listCloudAccountDetails.json
     */
    /**
     * Sample code: List Cloud Account details for the Oracle Subscription.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listCloudAccountDetailsForTheOracleSubscription(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.oracleSubscriptions().listCloudAccountDetails(com.azure.core.util.Context.NONE);
    }
}
```

### OracleSubscriptions_ListSaasSubscriptionDetails

```java
/**
 * Samples for OracleSubscriptions ListSaasSubscriptionDetails.
 */
public final class OracleSubscriptionsListSaasSubscriptionDetailsSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/oracleSubscriptions_listSaasSubscriptionDetails.json
     */
    /**
     * Sample code: List Saas Subscription details for the Oracle Subscription.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listSaasSubscriptionDetailsForTheOracleSubscription(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.oracleSubscriptions().listSaasSubscriptionDetails(com.azure.core.util.Context.NONE);
    }
}
```

### OracleSubscriptions_Update

```java
import com.azure.resourcemanager.oracle.models.OracleSubscriptionUpdate;

/**
 * Samples for OracleSubscriptions Update.
 */
public final class OracleSubscriptionsUpdateSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/oracleSubscriptions_patch.json
     */
    /**
     * Sample code: Patch Oracle Subscription.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void patchOracleSubscription(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.oracleSubscriptions().update(new OracleSubscriptionUpdate(), com.azure.core.util.Context.NONE);
    }
}
```

### VirtualNetworkAddresses_CreateOrUpdate

```java
/**
 * Samples for VirtualNetworkAddresses CreateOrUpdate.
 */
public final class VirtualNetworkAddressesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/virtualNetworkAddresses_create.json
     */
    /**
     * Sample code: Create Virtual Network Address.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void createVirtualNetworkAddress(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.virtualNetworkAddresses().define("hosname1").withExistingCloudVmCluster("rg000", "cluster1").withIpAddress("192.168.0.1").withVmOcid("ocid1..aaaa").create();
    }
}
```

### VirtualNetworkAddresses_Delete

```java
/**
 * Samples for VirtualNetworkAddresses Delete.
 */
public final class VirtualNetworkAddressesDeleteSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/virtualNetworkAddresses_delete.json
     */
    /**
     * Sample code: Delete Virtual Network Address.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void deleteVirtualNetworkAddress(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.virtualNetworkAddresses().delete("rg000", "cluster1", "hosname1", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualNetworkAddresses_Get

```java
/**
 * Samples for VirtualNetworkAddresses Get.
 */
public final class VirtualNetworkAddressesGetSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/virtualNetworkAddresses_get.json
     */
    /**
     * Sample code: Get Virtual Network Address.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void getVirtualNetworkAddress(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.virtualNetworkAddresses().getWithResponse("rg000", "cluster1", "hosname1", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualNetworkAddresses_ListByCloudVmCluster

```java
/**
 * Samples for VirtualNetworkAddresses ListByCloudVmCluster.
 */
public final class VirtualNetworkAddressesListByCloudVmClusterSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/virtualNetworkAddresses_listByParent.json
     */
    /**
     * Sample code: List Virtual Network Addresses by VM Cluster.
     * 
     * @param manager Entry point to OracleManager.
     */
    public static void listVirtualNetworkAddressesByVMCluster(com.azure.resourcemanager.oracle.OracleManager manager) {
        manager.virtualNetworkAddresses().listByCloudVmCluster("rg000", "cluster1", com.azure.core.util.Context.NONE);
    }
}
```

