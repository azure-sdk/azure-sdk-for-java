# Code snippets and samples


## Clusters

- [Create](#clusters_create)
- [Delete](#clusters_delete)
- [GetByResourceGroup](#clusters_getbyresourcegroup)
- [List](#clusters_list)
- [ListByResourceGroup](#clusters_listbyresourcegroup)
- [Update](#clusters_update)

## Datastores

- [Create](#datastores_create)
- [Delete](#datastores_delete)
- [GetByResourceGroup](#datastores_getbyresourcegroup)
- [List](#datastores_list)
- [ListByResourceGroup](#datastores_listbyresourcegroup)
- [Update](#datastores_update)

## GuestAgents

- [Create](#guestagents_create)
- [Delete](#guestagents_delete)
- [Get](#guestagents_get)
- [List](#guestagents_list)

## Hosts

- [Create](#hosts_create)
- [Delete](#hosts_delete)
- [GetByResourceGroup](#hosts_getbyresourcegroup)
- [List](#hosts_list)
- [ListByResourceGroup](#hosts_listbyresourcegroup)
- [Update](#hosts_update)

## HybridIdentityMetadata

- [Create](#hybrididentitymetadata_create)
- [Delete](#hybrididentitymetadata_delete)
- [Get](#hybrididentitymetadata_get)
- [List](#hybrididentitymetadata_list)

## InventoryItems

- [Create](#inventoryitems_create)
- [Delete](#inventoryitems_delete)
- [Get](#inventoryitems_get)
- [ListByVCenter](#inventoryitems_listbyvcenter)

## MachineExtensions

- [CreateOrUpdate](#machineextensions_createorupdate)
- [Delete](#machineextensions_delete)
- [Get](#machineextensions_get)
- [List](#machineextensions_list)
- [Update](#machineextensions_update)

## Operations

- [List](#operations_list)

## ResourcePools

- [Create](#resourcepools_create)
- [Delete](#resourcepools_delete)
- [GetByResourceGroup](#resourcepools_getbyresourcegroup)
- [List](#resourcepools_list)
- [ListByResourceGroup](#resourcepools_listbyresourcegroup)
- [Update](#resourcepools_update)

## ResourceProvider

- [UpgradeExtensions](#resourceprovider_upgradeextensions)

## VCenters

- [Create](#vcenters_create)
- [Delete](#vcenters_delete)
- [GetByResourceGroup](#vcenters_getbyresourcegroup)
- [List](#vcenters_list)
- [ListByResourceGroup](#vcenters_listbyresourcegroup)
- [Update](#vcenters_update)

## VirtualMachineTemplates

- [Create](#virtualmachinetemplates_create)
- [Delete](#virtualmachinetemplates_delete)
- [GetByResourceGroup](#virtualmachinetemplates_getbyresourcegroup)
- [List](#virtualmachinetemplates_list)
- [ListByResourceGroup](#virtualmachinetemplates_listbyresourcegroup)
- [Update](#virtualmachinetemplates_update)

## VirtualMachines

- [AssessPatches](#virtualmachines_assesspatches)
- [CreateOrUpdate](#virtualmachines_createorupdate)
- [Delete](#virtualmachines_delete)
- [GetByResourceGroup](#virtualmachines_getbyresourcegroup)
- [InstallPatches](#virtualmachines_installpatches)
- [List](#virtualmachines_list)
- [ListByResourceGroup](#virtualmachines_listbyresourcegroup)
- [Restart](#virtualmachines_restart)
- [Start](#virtualmachines_start)
- [Stop](#virtualmachines_stop)
- [Update](#virtualmachines_update)

## VirtualNetworks

- [Create](#virtualnetworks_create)
- [Delete](#virtualnetworks_delete)
- [GetByResourceGroup](#virtualnetworks_getbyresourcegroup)
- [List](#virtualnetworks_list)
- [ListByResourceGroup](#virtualnetworks_listbyresourcegroup)
- [Update](#virtualnetworks_update)
### Clusters_Create

```java
import com.azure.resourcemanager.connectedvmware.models.ExtendedLocation;

/** Samples for Clusters Create. */
public final class ClustersCreateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/CreateCluster.json
     */
    /**
     * Sample code: CreateCluster.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void createCluster(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .clusters()
            .define("HRCluster")
            .withRegion("East US")
            .withExistingResourceGroup("testrg")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withType("customLocation")
                    .withName(
                        "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.ExtendedLocation/customLocations/contoso"))
            .withVCenterId(
                "/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VCenters/ContosoVCenter")
            .withMoRefId("aaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
            .create();
    }
}
```

### Clusters_Delete

```java
/** Samples for Clusters Delete. */
public final class ClustersDeleteSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/DeleteCluster.json
     */
    /**
     * Sample code: DeleteCluster.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void deleteCluster(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.clusters().delete("testrg", "HRCluster", null, com.azure.core.util.Context.NONE);
    }
}
```

### Clusters_GetByResourceGroup

```java
/** Samples for Clusters GetByResourceGroup. */
public final class ClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/GetCluster.json
     */
    /**
     * Sample code: GetCluster.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getCluster(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.clusters().getByResourceGroupWithResponse("testrg", "HRCluster", com.azure.core.util.Context.NONE);
    }
}
```

### Clusters_List

```java
/** Samples for Clusters List. */
public final class ClustersListSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListClusters.json
     */
    /**
     * Sample code: ListClusters.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listClusters(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.clusters().list(com.azure.core.util.Context.NONE);
    }
}
```

### Clusters_ListByResourceGroup

```java
/** Samples for Clusters ListByResourceGroup. */
public final class ClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListClustersByResourceGroup.json
     */
    /**
     * Sample code: ListClustersByResourceGroup.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listClustersByResourceGroup(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.clusters().listByResourceGroup("testrg", com.azure.core.util.Context.NONE);
    }
}
```

### Clusters_Update

```java
import com.azure.resourcemanager.connectedvmware.models.Cluster;
import java.util.HashMap;
import java.util.Map;

/** Samples for Clusters Update. */
public final class ClustersUpdateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/UpdateCluster.json
     */
    /**
     * Sample code: UpdateCluster.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void updateCluster(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        Cluster resource =
            manager
                .clusters()
                .getByResourceGroupWithResponse("testrg", "HRCluster", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### Datastores_Create

```java
import com.azure.resourcemanager.connectedvmware.models.ExtendedLocation;

/** Samples for Datastores Create. */
public final class DatastoresCreateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/CreateDatastore.json
     */
    /**
     * Sample code: CreateDatastore.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void createDatastore(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .datastores()
            .define("HRDatastore")
            .withRegion("East US")
            .withExistingResourceGroup("testrg")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withType("customLocation")
                    .withName(
                        "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.ExtendedLocation/customLocations/contoso"))
            .withVCenterId(
                "/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VCenters/ContosoVCenter")
            .withMoRefId("aaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
            .create();
    }
}
```

### Datastores_Delete

```java
/** Samples for Datastores Delete. */
public final class DatastoresDeleteSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/DeleteDatastore.json
     */
    /**
     * Sample code: DeleteDatastore.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void deleteDatastore(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.datastores().delete("testrg", "HRDatastore", null, com.azure.core.util.Context.NONE);
    }
}
```

### Datastores_GetByResourceGroup

```java
/** Samples for Datastores GetByResourceGroup. */
public final class DatastoresGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/GetDatastore.json
     */
    /**
     * Sample code: GetDatastore.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getDatastore(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.datastores().getByResourceGroupWithResponse("testrg", "HRDatastore", com.azure.core.util.Context.NONE);
    }
}
```

### Datastores_List

```java
/** Samples for Datastores List. */
public final class DatastoresListSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListDatastores.json
     */
    /**
     * Sample code: ListDatastores.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listDatastores(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.datastores().list(com.azure.core.util.Context.NONE);
    }
}
```

### Datastores_ListByResourceGroup

```java
/** Samples for Datastores ListByResourceGroup. */
public final class DatastoresListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListDatastoresByResourceGroup.json
     */
    /**
     * Sample code: ListDatastoresByResourceGroup.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listDatastoresByResourceGroup(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.datastores().listByResourceGroup("testrg", com.azure.core.util.Context.NONE);
    }
}
```

### Datastores_Update

```java
import com.azure.resourcemanager.connectedvmware.models.Datastore;
import java.util.HashMap;
import java.util.Map;

/** Samples for Datastores Update. */
public final class DatastoresUpdateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/UpdateDatastore.json
     */
    /**
     * Sample code: UpdateDatastore.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void updateDatastore(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        Datastore resource =
            manager
                .datastores()
                .getByResourceGroupWithResponse("testrg", "HRDatastore", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### GuestAgents_Create

```java
import com.azure.resourcemanager.connectedvmware.models.GuestCredential;
import com.azure.resourcemanager.connectedvmware.models.HttpProxyConfiguration;
import com.azure.resourcemanager.connectedvmware.models.ProvisioningAction;

/** Samples for GuestAgents Create. */
public final class GuestAgentsCreateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/CreateGuestAgent.json
     */
    /**
     * Sample code: CreateGuestAgent.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void createGuestAgent(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .guestAgents()
            .define("default")
            .withExistingVirtualMachine("testrg", "ContosoVm")
            .withCredentials(new GuestCredential().withUsername("tempuser").withPassword("fakeTokenPlaceholder"))
            .withHttpProxyConfig(new HttpProxyConfiguration().withHttpsProxy("http://192.1.2.3:8080"))
            .withProvisioningAction(ProvisioningAction.INSTALL)
            .create();
    }
}
```

### GuestAgents_Delete

```java
/** Samples for GuestAgents Delete. */
public final class GuestAgentsDeleteSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/DeleteGuestAgent.json
     */
    /**
     * Sample code: DeleteGuestAgent.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void deleteGuestAgent(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.guestAgents().delete("testrg", "ContosoVm", "default", com.azure.core.util.Context.NONE);
    }
}
```

### GuestAgents_Get

```java
/** Samples for GuestAgents Get. */
public final class GuestAgentsGetSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/GetGuestAgent.json
     */
    /**
     * Sample code: GetGuestAgent.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getGuestAgent(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.guestAgents().getWithResponse("testrg", "ContosoVm", "default", com.azure.core.util.Context.NONE);
    }
}
```

### GuestAgents_List

```java
/** Samples for GuestAgents List. */
public final class GuestAgentsListSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/GuestAgent_ListByVm.json
     */
    /**
     * Sample code: GuestAgentListByVm.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void guestAgentListByVm(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.guestAgents().list("testrg", "ContosoVm", com.azure.core.util.Context.NONE);
    }
}
```

### Hosts_Create

```java
import com.azure.resourcemanager.connectedvmware.models.ExtendedLocation;

/** Samples for Hosts Create. */
public final class HostsCreateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/CreateHost.json
     */
    /**
     * Sample code: CreateHost.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void createHost(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .hosts()
            .define("HRHost")
            .withRegion("East US")
            .withExistingResourceGroup("testrg")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withType("customLocation")
                    .withName(
                        "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.ExtendedLocation/customLocations/contoso"))
            .withVCenterId(
                "/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VCenters/ContosoVCenter")
            .withMoRefId("aaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
            .create();
    }
}
```

### Hosts_Delete

```java
/** Samples for Hosts Delete. */
public final class HostsDeleteSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/DeleteHost.json
     */
    /**
     * Sample code: DeleteHost.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void deleteHost(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.hosts().delete("testrg", "HRHost", null, com.azure.core.util.Context.NONE);
    }
}
```

### Hosts_GetByResourceGroup

```java
/** Samples for Hosts GetByResourceGroup. */
public final class HostsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/GetHost.json
     */
    /**
     * Sample code: GetHost.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getHost(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.hosts().getByResourceGroupWithResponse("testrg", "HRHost", com.azure.core.util.Context.NONE);
    }
}
```

### Hosts_List

```java
/** Samples for Hosts List. */
public final class HostsListSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListHosts.json
     */
    /**
     * Sample code: ListHosts.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listHosts(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.hosts().list(com.azure.core.util.Context.NONE);
    }
}
```

### Hosts_ListByResourceGroup

```java
/** Samples for Hosts ListByResourceGroup. */
public final class HostsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListHostsByResourceGroup.json
     */
    /**
     * Sample code: ListHostsByResourceGroup.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listHostsByResourceGroup(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.hosts().listByResourceGroup("testrg", com.azure.core.util.Context.NONE);
    }
}
```

### Hosts_Update

```java
import com.azure.resourcemanager.connectedvmware.models.HostModel;
import java.util.HashMap;
import java.util.Map;

/** Samples for Hosts Update. */
public final class HostsUpdateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/UpdateHost.json
     */
    /**
     * Sample code: UpdateHost.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void updateHost(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        HostModel resource =
            manager
                .hosts()
                .getByResourceGroupWithResponse("testrg", "HRHost", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### HybridIdentityMetadata_Create

```java
/** Samples for HybridIdentityMetadata Create. */
public final class HybridIdentityMetadataCreateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/CreateHybridIdentityMetadata.json
     */
    /**
     * Sample code: CreateHybridIdentityMetadata.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void createHybridIdentityMetadata(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .hybridIdentityMetadatas()
            .define("default")
            .withExistingVirtualMachine("testrg", "ContosoVm")
            .withVmId("f8b82dff-38ef-4220-99ef-d3a3f86ddc6c")
            .withPublicKey("8ec7d60c-9700-40b1-8e6e-e5b2f6f477f2")
            .create();
    }
}
```

### HybridIdentityMetadata_Delete

```java
/** Samples for HybridIdentityMetadata Delete. */
public final class HybridIdentityMetadataDeleteSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/DeleteHybridIdentityMetadata.json
     */
    /**
     * Sample code: DeleteHybridIdentityMetadata.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void deleteHybridIdentityMetadata(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .hybridIdentityMetadatas()
            .deleteWithResponse("testrg", "ContosoVm", "default", com.azure.core.util.Context.NONE);
    }
}
```

### HybridIdentityMetadata_Get

```java
/** Samples for HybridIdentityMetadata Get. */
public final class HybridIdentityMetadataGetSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/GetHybridIdentityMetadata.json
     */
    /**
     * Sample code: GetHybridIdentityMetadata.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getHybridIdentityMetadata(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .hybridIdentityMetadatas()
            .getWithResponse("testrg", "ContosoVm", "default", com.azure.core.util.Context.NONE);
    }
}
```

### HybridIdentityMetadata_List

```java
/** Samples for HybridIdentityMetadata List. */
public final class HybridIdentityMetadataListSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/HybridIdentityMetadata_ListByVm.json
     */
    /**
     * Sample code: HybridIdentityMetadataListByVm.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void hybridIdentityMetadataListByVm(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.hybridIdentityMetadatas().list("testrg", "ContosoVm", com.azure.core.util.Context.NONE);
    }
}
```

### InventoryItems_Create

```java
import com.azure.resourcemanager.connectedvmware.models.ResourcePoolInventoryItem;

/** Samples for InventoryItems Create. */
public final class InventoryItemsCreateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/CreateInventoryItem.json
     */
    /**
     * Sample code: CreateInventoryItem.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void createInventoryItem(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .inventoryItems()
            .define("testItem")
            .withExistingVcenter("testrg", "ContosoVCenter")
            .withProperties(new ResourcePoolInventoryItem())
            .create();
    }
}
```

### InventoryItems_Delete

```java
/** Samples for InventoryItems Delete. */
public final class InventoryItemsDeleteSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/DeleteInventoryItem.json
     */
    /**
     * Sample code: DeleteInventoryItem.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void deleteInventoryItem(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .inventoryItems()
            .deleteWithResponse("testrg", "ContosoVCenter", "testItem", com.azure.core.util.Context.NONE);
    }
}
```

### InventoryItems_Get

```java
/** Samples for InventoryItems Get. */
public final class InventoryItemsGetSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/GetInventoryItem.json
     */
    /**
     * Sample code: GetInventoryItem.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getInventoryItem(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .inventoryItems()
            .getWithResponse("testrg", "ContosoVCenter", "testItem", com.azure.core.util.Context.NONE);
    }
}
```

### InventoryItems_ListByVCenter

```java
/** Samples for InventoryItems ListByVCenter. */
public final class InventoryItemsListByVCenterSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/InventoryItems_ListByVCenter.json
     */
    /**
     * Sample code: InventoryItemsListByVCenter.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void inventoryItemsListByVCenter(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.inventoryItems().listByVCenter("testrg", "ContosoVCenter", com.azure.core.util.Context.NONE);
    }
}
```

### MachineExtensions_CreateOrUpdate

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;

/** Samples for MachineExtensions CreateOrUpdate. */
public final class MachineExtensionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/PUTExtension.json
     */
    /**
     * Sample code: Create or Update a Machine Extension (PUT).
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void createOrUpdateAMachineExtensionPUT(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) throws IOException {
        manager
            .machineExtensions()
            .define("CustomScriptExtension")
            .withRegion("eastus2euap")
            .withExistingVirtualMachine("myResourceGroup", "myMachine")
            .withPublisher("Microsoft.Compute")
            .withTypePropertiesType("CustomScriptExtension")
            .withTypeHandlerVersion("1.10")
            .withSettings(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize(
                        "{\"commandToExecute\":\"powershell.exe -c \\\"Get-Process | Where-Object { $_.CPU -gt 10000"
                            + " }\\\"\"}",
                        Object.class,
                        SerializerEncoding.JSON))
            .create();
    }
}
```

### MachineExtensions_Delete

```java
/** Samples for MachineExtensions Delete. */
public final class MachineExtensionsDeleteSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/DELETEExtension.json
     */
    /**
     * Sample code: Delete a Machine Extension.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void deleteAMachineExtension(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.machineExtensions().delete("myResourceGroup", "myMachine", "MMA", com.azure.core.util.Context.NONE);
    }
}
```

### MachineExtensions_Get

```java
/** Samples for MachineExtensions Get. */
public final class MachineExtensionsGetSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/GETExtension.json
     */
    /**
     * Sample code: Get Machine Extension.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getMachineExtension(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .machineExtensions()
            .getWithResponse("myResourceGroup", "myMachine", "CustomScriptExtension", com.azure.core.util.Context.NONE);
    }
}
```

### MachineExtensions_List

```java
/** Samples for MachineExtensions List. */
public final class MachineExtensionsListSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/LISTExtension.json
     */
    /**
     * Sample code: Get all Machine Extensions.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getAllMachineExtensions(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.machineExtensions().list("myResourceGroup", "myMachine", null, com.azure.core.util.Context.NONE);
    }
}
```

### MachineExtensions_Update

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.connectedvmware.models.MachineExtension;
import java.io.IOException;

/** Samples for MachineExtensions Update. */
public final class MachineExtensionsUpdateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/UpdateExtension.json
     */
    /**
     * Sample code: Create or Update a Machine Extension (PATCH).
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void createOrUpdateAMachineExtensionPATCH(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) throws IOException {
        MachineExtension resource =
            manager
                .machineExtensions()
                .getWithResponse(
                    "myResourceGroup", "myMachine", "CustomScriptExtension", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withPublisher("Microsoft.Compute")
            .withType("CustomScriptExtension")
            .withTypeHandlerVersion("1.10")
            .withSettings(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize(
                        "{\"commandToExecute\":\"powershell.exe -c \\\"Get-Process | Where-Object { $_.CPU -lt 100"
                            + " }\\\"\"}",
                        Object.class,
                        SerializerEncoding.JSON))
            .apply();
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListOperations.json
     */
    /**
     * Sample code: ListOperations.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listOperations(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### ResourcePools_Create

```java
import com.azure.resourcemanager.connectedvmware.models.ExtendedLocation;

/** Samples for ResourcePools Create. */
public final class ResourcePoolsCreateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/CreateResourcePool.json
     */
    /**
     * Sample code: CreateResourcePool.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void createResourcePool(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .resourcePools()
            .define("HRPool")
            .withRegion("East US")
            .withExistingResourceGroup("testrg")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withType("customLocation")
                    .withName(
                        "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.ExtendedLocation/customLocations/contoso"))
            .withVCenterId(
                "/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VCenters/ContosoVCenter")
            .withMoRefId("aaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
            .create();
    }
}
```

### ResourcePools_Delete

```java
/** Samples for ResourcePools Delete. */
public final class ResourcePoolsDeleteSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/DeleteResourcePool.json
     */
    /**
     * Sample code: DeleteResourcePool.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void deleteResourcePool(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.resourcePools().delete("testrg", "HRPool", null, com.azure.core.util.Context.NONE);
    }
}
```

### ResourcePools_GetByResourceGroup

```java
/** Samples for ResourcePools GetByResourceGroup. */
public final class ResourcePoolsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/GetResourcePool.json
     */
    /**
     * Sample code: GetResourcePool.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getResourcePool(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.resourcePools().getByResourceGroupWithResponse("testrg", "HRPool", com.azure.core.util.Context.NONE);
    }
}
```

### ResourcePools_List

```java
/** Samples for ResourcePools List. */
public final class ResourcePoolsListSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListResourcePools.json
     */
    /**
     * Sample code: ListResourcePools.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listResourcePools(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.resourcePools().list(com.azure.core.util.Context.NONE);
    }
}
```

### ResourcePools_ListByResourceGroup

```java
/** Samples for ResourcePools ListByResourceGroup. */
public final class ResourcePoolsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListResourcePoolsByResourceGroup.json
     */
    /**
     * Sample code: ListResourcePoolsByResourceGroup.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listResourcePoolsByResourceGroup(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.resourcePools().listByResourceGroup("testrg", com.azure.core.util.Context.NONE);
    }
}
```

### ResourcePools_Update

```java
import com.azure.resourcemanager.connectedvmware.models.ResourcePool;
import java.util.HashMap;
import java.util.Map;

/** Samples for ResourcePools Update. */
public final class ResourcePoolsUpdateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/UpdateResourcePool.json
     */
    /**
     * Sample code: UpdateResourcePool.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void updateResourcePool(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        ResourcePool resource =
            manager
                .resourcePools()
                .getByResourceGroupWithResponse("testrg", "HRPool", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### ResourceProvider_UpgradeExtensions

```java
import com.azure.resourcemanager.connectedvmware.models.ExtensionTargetProperties;
import com.azure.resourcemanager.connectedvmware.models.MachineExtensionUpgrade;
import java.util.HashMap;
import java.util.Map;

/** Samples for ResourceProvider UpgradeExtensions. */
public final class ResourceProviderUpgradeExtensionsSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/Extensions_Upgrade.json
     */
    /**
     * Sample code: Upgrade Machine Extensions.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void upgradeMachineExtensions(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .resourceProviders()
            .upgradeExtensions(
                "myResourceGroup",
                "myMachine",
                new MachineExtensionUpgrade()
                    .withExtensionTargets(
                        mapOf(
                            "Microsoft.Azure.Monitoring",
                            new ExtensionTargetProperties().withTargetVersion("2.0"),
                            "Microsoft.Compute.CustomScriptExtension",
                            new ExtensionTargetProperties().withTargetVersion("1.10"))),
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

### VCenters_Create

```java
import com.azure.resourcemanager.connectedvmware.models.ExtendedLocation;
import com.azure.resourcemanager.connectedvmware.models.VICredential;

/** Samples for VCenters Create. */
public final class VCentersCreateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/CreateVCenter.json
     */
    /**
     * Sample code: CreateVCenter.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void createVCenter(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .vCenters()
            .define("ContosoVCenter")
            .withRegion("East US")
            .withExistingResourceGroup("testrg")
            .withFqdn("ContosoVMware.contoso.com")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withType("customLocation")
                    .withName(
                        "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.ExtendedLocation/customLocations/contoso"))
            .withPort(1234)
            .withCredentials(new VICredential().withUsername("tempuser").withPassword("fakeTokenPlaceholder"))
            .create();
    }
}
```

### VCenters_Delete

```java
/** Samples for VCenters Delete. */
public final class VCentersDeleteSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/DeleteVCenter.json
     */
    /**
     * Sample code: DeleteVCenter.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void deleteVCenter(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.vCenters().delete("testrg", "ContosoVCenter", null, com.azure.core.util.Context.NONE);
    }
}
```

### VCenters_GetByResourceGroup

```java
/** Samples for VCenters GetByResourceGroup. */
public final class VCentersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/GetVCenter.json
     */
    /**
     * Sample code: GetVCenter.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getVCenter(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.vCenters().getByResourceGroupWithResponse("testrg", "ContosoVCenter", com.azure.core.util.Context.NONE);
    }
}
```

### VCenters_List

```java
/** Samples for VCenters List. */
public final class VCentersListSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListVCenters.json
     */
    /**
     * Sample code: ListVCenters.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listVCenters(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.vCenters().list(com.azure.core.util.Context.NONE);
    }
}
```

### VCenters_ListByResourceGroup

```java
/** Samples for VCenters ListByResourceGroup. */
public final class VCentersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListVCentersByResourceGroup.json
     */
    /**
     * Sample code: ListVCentersByResourceGroup.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listVCentersByResourceGroup(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.vCenters().listByResourceGroup("testrg", com.azure.core.util.Context.NONE);
    }
}
```

### VCenters_Update

```java
import com.azure.resourcemanager.connectedvmware.models.VCenter;
import java.util.HashMap;
import java.util.Map;

/** Samples for VCenters Update. */
public final class VCentersUpdateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/UpdateVCenter.json
     */
    /**
     * Sample code: UpdateVCenter.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void updateVCenter(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        VCenter resource =
            manager
                .vCenters()
                .getByResourceGroupWithResponse("testrg", "ContosoVCenter", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### VirtualMachineTemplates_Create

```java
import com.azure.resourcemanager.connectedvmware.models.ExtendedLocation;

/** Samples for VirtualMachineTemplates Create. */
public final class VirtualMachineTemplatesCreateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/CreateVirtualMachineTemplate.json
     */
    /**
     * Sample code: CreateVirtualMachineTemplate.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void createVirtualMachineTemplate(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .virtualMachineTemplates()
            .define("WebFrontEndTemplate")
            .withRegion("East US")
            .withExistingResourceGroup("testrg")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withType("customLocation")
                    .withName(
                        "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.ExtendedLocation/customLocations/contoso"))
            .withVCenterId(
                "/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VCenters/ContosoVCenter")
            .withMoRefId("aaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
            .create();
    }
}
```

### VirtualMachineTemplates_Delete

```java
/** Samples for VirtualMachineTemplates Delete. */
public final class VirtualMachineTemplatesDeleteSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/DeleteVirtualMachineTemplate.json
     */
    /**
     * Sample code: DeleteVirtualMachineTemplate.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void deleteVirtualMachineTemplate(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .virtualMachineTemplates()
            .delete("testrg", "WebFrontEndTemplate", null, com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachineTemplates_GetByResourceGroup

```java
/** Samples for VirtualMachineTemplates GetByResourceGroup. */
public final class VirtualMachineTemplatesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/GetVirtualMachineTemplate.json
     */
    /**
     * Sample code: GetVirtualMachineTemplate.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getVirtualMachineTemplate(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .virtualMachineTemplates()
            .getByResourceGroupWithResponse("testrg", "WebFrontEndTemplate", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachineTemplates_List

```java
/** Samples for VirtualMachineTemplates List. */
public final class VirtualMachineTemplatesListSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListVirtualMachineTemplates.json
     */
    /**
     * Sample code: ListVirtualMachineTemplates.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listVirtualMachineTemplates(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.virtualMachineTemplates().list(com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachineTemplates_ListByResourceGroup

```java
/** Samples for VirtualMachineTemplates ListByResourceGroup. */
public final class VirtualMachineTemplatesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListVirtualMachineTemplatesByResourceGroup.json
     */
    /**
     * Sample code: ListVirtualMachineTemplatesByResourceGroup.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listVirtualMachineTemplatesByResourceGroup(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.virtualMachineTemplates().listByResourceGroup("testrg", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachineTemplates_Update

```java
import com.azure.resourcemanager.connectedvmware.models.VirtualMachineTemplate;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualMachineTemplates Update. */
public final class VirtualMachineTemplatesUpdateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/UpdateVirtualMachineTemplate.json
     */
    /**
     * Sample code: UpdateVirtualMachineTemplate.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void updateVirtualMachineTemplate(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        VirtualMachineTemplate resource =
            manager
                .virtualMachineTemplates()
                .getByResourceGroupWithResponse("testrg", "WebFrontEndTemplate", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### VirtualMachines_AssessPatches

```java
/** Samples for VirtualMachines AssessPatches. */
public final class VirtualMachinesAssessPatchesSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/VirtualMachineAssessPatches.json
     */
    /**
     * Sample code: Assess patch state of a machine.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void assessPatchStateOfAMachine(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .virtualMachines()
            .assessPatches("myResourceGroupName", "myMachineName", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachines_CreateOrUpdate

```java
import com.azure.resourcemanager.connectedvmware.models.ExtendedLocation;
import com.azure.resourcemanager.connectedvmware.models.HardwareProfile;

/** Samples for VirtualMachines CreateOrUpdate. */
public final class VirtualMachinesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/CreateVirtualMachine.json
     */
    /**
     * Sample code: CreateVirtualMachine.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void createVirtualMachine(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .virtualMachines()
            .define("DemoVM")
            .withRegion("East US")
            .withExistingResourceGroup("testrg")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withType("customLocation")
                    .withName(
                        "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.ExtendedLocation/customLocations/contoso"))
            .withResourcePoolId(
                "/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/ResourcePools/HRPool")
            .withTemplateId(
                "/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VirtualMachineTemplates/WebFrontEndTemplate")
            .withVCenterId(
                "/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VCenters/ContosoVCenter")
            .withHardwareProfile(new HardwareProfile().withMemorySizeMB(4196).withNumCPUs(4))
            .create();
    }
}
```

### VirtualMachines_Delete

```java
/** Samples for VirtualMachines Delete. */
public final class VirtualMachinesDeleteSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/DeleteVirtualMachine.json
     */
    /**
     * Sample code: DeleteVirtualMachine.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void deleteVirtualMachine(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.virtualMachines().delete("testrg", "DemoVM", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachines_GetByResourceGroup

```java
/** Samples for VirtualMachines GetByResourceGroup. */
public final class VirtualMachinesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/GetVirtualMachine.json
     */
    /**
     * Sample code: GetVirtualMachine.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getVirtualMachine(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.virtualMachines().getByResourceGroupWithResponse("testrg", "DemoVM", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachines_InstallPatches

```java
import com.azure.resourcemanager.connectedvmware.models.VMGuestPatchClassificationWindows;
import com.azure.resourcemanager.connectedvmware.models.VMGuestPatchRebootSetting;
import com.azure.resourcemanager.connectedvmware.models.VirtualMachineInstallPatchesParameters;
import com.azure.resourcemanager.connectedvmware.models.WindowsParameters;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for VirtualMachines InstallPatches. */
public final class VirtualMachinesInstallPatchesSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/VirtualMachineInstallPatches.json
     */
    /**
     * Sample code: Install patch state of a machine.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void installPatchStateOfAMachine(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .virtualMachines()
            .installPatches(
                "myResourceGroupName",
                "myMachineName",
                new VirtualMachineInstallPatchesParameters()
                    .withMaximumDuration("PT3H")
                    .withRebootSetting(VMGuestPatchRebootSetting.IF_REQUIRED)
                    .withWindowsParameters(
                        new WindowsParameters()
                            .withClassificationsToInclude(
                                Arrays
                                    .asList(
                                        VMGuestPatchClassificationWindows.CRITICAL,
                                        VMGuestPatchClassificationWindows.SECURITY))
                            .withMaxPatchPublishDate(OffsetDateTime.parse("2022-01-15T02:36:43.0539904+00:00"))),
                com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachines_List

```java
/** Samples for VirtualMachines List. */
public final class VirtualMachinesListSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListVirtualMachines.json
     */
    /**
     * Sample code: ListVirtualMachines.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listVirtualMachines(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.virtualMachines().list(com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachines_ListByResourceGroup

```java
/** Samples for VirtualMachines ListByResourceGroup. */
public final class VirtualMachinesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListVirtualMachinesByResourceGroup.json
     */
    /**
     * Sample code: ListVirtualMachinesByResourceGroup.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listVirtualMachinesByResourceGroup(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.virtualMachines().listByResourceGroup("testrg", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachines_Restart

```java
/** Samples for VirtualMachines Restart. */
public final class VirtualMachinesRestartSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/RestartVirtualMachine.json
     */
    /**
     * Sample code: RestartVirtualMachine.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void restartVirtualMachine(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.virtualMachines().restart("testrg", "DemoVM", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachines_Start

```java
/** Samples for VirtualMachines Start. */
public final class VirtualMachinesStartSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/StartVirtualMachine.json
     */
    /**
     * Sample code: StartVirtualMachine.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void startVirtualMachine(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.virtualMachines().start("testrg", "DemoVM", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachines_Stop

```java
import com.azure.resourcemanager.connectedvmware.models.StopVirtualMachineOptions;

/** Samples for VirtualMachines Stop. */
public final class VirtualMachinesStopSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/StopVirtualMachine.json
     */
    /**
     * Sample code: StopVirtualMachine.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void stopVirtualMachine(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .virtualMachines()
            .stop(
                "testrg",
                "DemoVM",
                new StopVirtualMachineOptions().withSkipShutdown(true),
                com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachines_Update

```java
import com.azure.resourcemanager.connectedvmware.models.VirtualMachine;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualMachines Update. */
public final class VirtualMachinesUpdateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/UpdateVirtualMachine.json
     */
    /**
     * Sample code: UpdateVirtualMachine.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void updateVirtualMachine(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        VirtualMachine resource =
            manager
                .virtualMachines()
                .getByResourceGroupWithResponse("testrg", "DemoVM", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### VirtualNetworks_Create

```java
import com.azure.resourcemanager.connectedvmware.models.ExtendedLocation;

/** Samples for VirtualNetworks Create. */
public final class VirtualNetworksCreateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/CreateVirtualNetwork.json
     */
    /**
     * Sample code: CreateVirtualNetwork.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void createVirtualNetwork(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .virtualNetworks()
            .define("ProdNetwork")
            .withRegion("East US")
            .withExistingResourceGroup("testrg")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withType("customLocation")
                    .withName(
                        "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.ExtendedLocation/customLocations/contoso"))
            .withVCenterId(
                "/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VCenters/ContosoVCenter")
            .withMoRefId("aaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
            .create();
    }
}
```

### VirtualNetworks_Delete

```java
/** Samples for VirtualNetworks Delete. */
public final class VirtualNetworksDeleteSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/DeleteVirtualNetwork.json
     */
    /**
     * Sample code: DeleteVirtualNetwork.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void deleteVirtualNetwork(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.virtualNetworks().delete("testrg", "ProdNetwork", null, com.azure.core.util.Context.NONE);
    }
}
```

### VirtualNetworks_GetByResourceGroup

```java
/** Samples for VirtualNetworks GetByResourceGroup. */
public final class VirtualNetworksGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/GetVirtualNetwork.json
     */
    /**
     * Sample code: GetVirtualNetwork.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getVirtualNetwork(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager
            .virtualNetworks()
            .getByResourceGroupWithResponse("testrg", "ProdNetwork", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualNetworks_List

```java
/** Samples for VirtualNetworks List. */
public final class VirtualNetworksListSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListVirtualNetworks.json
     */
    /**
     * Sample code: ListVirtualNetworks.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listVirtualNetworks(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.virtualNetworks().list(com.azure.core.util.Context.NONE);
    }
}
```

### VirtualNetworks_ListByResourceGroup

```java
/** Samples for VirtualNetworks ListByResourceGroup. */
public final class VirtualNetworksListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/ListVirtualNetworksByResourceGroup.json
     */
    /**
     * Sample code: ListVirtualNetworksByResourceGroup.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listVirtualNetworksByResourceGroup(
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.virtualNetworks().listByResourceGroup("testrg", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualNetworks_Update

```java
import com.azure.resourcemanager.connectedvmware.models.VirtualNetwork;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualNetworks Update. */
public final class VirtualNetworksUpdateSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/preview/2022-07-15-preview/examples/UpdateVirtualNetwork.json
     */
    /**
     * Sample code: UpdateVirtualNetwork.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void updateVirtualNetwork(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        VirtualNetwork resource =
            manager
                .virtualNetworks()
                .getByResourceGroupWithResponse("testrg", "ProdNetwork", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

