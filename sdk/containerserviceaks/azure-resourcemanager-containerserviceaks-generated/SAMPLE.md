# Code snippets and samples


## AgentPools

- [AbortLatestOperation](#agentpools_abortlatestoperation)
- [CreateOrUpdate](#agentpools_createorupdate)
- [Delete](#agentpools_delete)
- [DeleteMachines](#agentpools_deletemachines)
- [Get](#agentpools_get)
- [GetAvailableAgentPoolVersions](#agentpools_getavailableagentpoolversions)
- [GetUpgradeProfile](#agentpools_getupgradeprofile)
- [List](#agentpools_list)
- [UpgradeNodeImageVersion](#agentpools_upgradenodeimageversion)

## ContainerServices

- [ListOrchestrators](#containerservices_listorchestrators)

## Machines

- [Get](#machines_get)
- [List](#machines_list)

## MaintenanceConfigurations

- [CreateOrUpdate](#maintenanceconfigurations_createorupdate)
- [Delete](#maintenanceconfigurations_delete)
- [Get](#maintenanceconfigurations_get)
- [ListByManagedCluster](#maintenanceconfigurations_listbymanagedcluster)

## ManagedClusters

- [AbortLatestOperation](#managedclusters_abortlatestoperation)
- [CreateOrUpdate](#managedclusters_createorupdate)
- [Delete](#managedclusters_delete)
- [GetAccessProfile](#managedclusters_getaccessprofile)
- [GetByResourceGroup](#managedclusters_getbyresourcegroup)
- [GetCommandResult](#managedclusters_getcommandresult)
- [GetMeshRevisionProfile](#managedclusters_getmeshrevisionprofile)
- [GetMeshUpgradeProfile](#managedclusters_getmeshupgradeprofile)
- [GetUpgradeProfile](#managedclusters_getupgradeprofile)
- [List](#managedclusters_list)
- [ListByResourceGroup](#managedclusters_listbyresourcegroup)
- [ListClusterAdminCredentials](#managedclusters_listclusteradmincredentials)
- [ListClusterMonitoringUserCredentials](#managedclusters_listclustermonitoringusercredentials)
- [ListClusterUserCredentials](#managedclusters_listclusterusercredentials)
- [ListKubernetesVersions](#managedclusters_listkubernetesversions)
- [ListMeshRevisionProfiles](#managedclusters_listmeshrevisionprofiles)
- [ListMeshUpgradeProfiles](#managedclusters_listmeshupgradeprofiles)
- [ListOutboundNetworkDependenciesEndpoints](#managedclusters_listoutboundnetworkdependenciesendpoints)
- [ResetAadProfile](#managedclusters_resetaadprofile)
- [ResetServicePrincipalProfile](#managedclusters_resetserviceprincipalprofile)
- [RotateClusterCertificates](#managedclusters_rotateclustercertificates)
- [RotateServiceAccountSigningKeys](#managedclusters_rotateserviceaccountsigningkeys)
- [RunCommand](#managedclusters_runcommand)
- [Start](#managedclusters_start)
- [Stop](#managedclusters_stop)
- [UpdateTags](#managedclusters_updatetags)

## OpenShiftManagedClusters

- [CreateOrUpdate](#openshiftmanagedclusters_createorupdate)
- [Delete](#openshiftmanagedclusters_delete)
- [GetByResourceGroup](#openshiftmanagedclusters_getbyresourcegroup)
- [List](#openshiftmanagedclusters_list)
- [ListByResourceGroup](#openshiftmanagedclusters_listbyresourcegroup)
- [UpdateTags](#openshiftmanagedclusters_updatetags)

## Operations

- [List](#operations_list)

## PrivateEndpointConnections

- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [List](#privateendpointconnections_list)
- [Update](#privateendpointconnections_update)

## PrivateLinkResources

- [List](#privatelinkresources_list)

## ResolvePrivateLinkServiceId

- [Post](#resolveprivatelinkserviceid_post)

## Snapshots

- [CreateOrUpdate](#snapshots_createorupdate)
- [Delete](#snapshots_delete)
- [GetByResourceGroup](#snapshots_getbyresourcegroup)
- [List](#snapshots_list)
- [ListByResourceGroup](#snapshots_listbyresourcegroup)
- [UpdateTags](#snapshots_updatetags)

## TrustedAccessRoleBindings

- [CreateOrUpdate](#trustedaccessrolebindings_createorupdate)
- [Delete](#trustedaccessrolebindings_delete)
- [Get](#trustedaccessrolebindings_get)
- [List](#trustedaccessrolebindings_list)

## TrustedAccessRoles

- [List](#trustedaccessroles_list)
### AgentPools_AbortLatestOperation

```java
import com.azure.resourcemanager.containerserviceaks.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.containerserviceaks.generated.models.ConnectionStatus;
import com.azure.resourcemanager.containerserviceaks.generated.models.PrivateLinkServiceConnectionState;

/**
 * Samples for PrivateEndpointConnections Update.
 */
public final class PrivateEndpointConnectionsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * PrivateEndpointConnectionsUpdate.json
     */
    /**
     * Sample code: Update Private Endpoint Connection.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void updatePrivateEndpointConnection(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.privateEndpointConnections()
            .updateWithResponse("rg1", "clustername1", "privateendpointconnection1",
                new PrivateEndpointConnectionInner().withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState().withStatus(ConnectionStatus.APPROVED)),
                com.azure.core.util.Context.NONE);
    }
}
```

### AgentPools_CreateOrUpdate

```java
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterServicePrincipalProfile;

/**
 * Samples for ManagedClusters ResetServicePrincipalProfile.
 */
public final class ManagedClustersResetServicePrincipalProfileSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersResetServicePrincipalProfile.json
     */
    /**
     * Sample code: Reset Service Principal Profile.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void resetServicePrincipalProfile(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .resetServicePrincipalProfile("rg1", "clustername1",
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"),
                com.azure.core.util.Context.NONE);
    }
}
```

### AgentPools_Delete

```java
/**
 * Samples for ManagedClusters GetCommandResult.
 */
public final class ManagedClustersGetCommandResultSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * RunCommandResultFailed.json
     */
    /**
     * Sample code: commandFailedResult.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        commandFailedResult(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .getCommandResultWithResponse("rg1", "clustername1", "def7b3ea71bd4f7e9d226ddbc0f00ad9",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * RunCommandResultSucceed.json
     */
    /**
     * Sample code: commandSucceedResult.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        commandSucceedResult(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .getCommandResultWithResponse("rg1", "clustername1", "def7b3ea71bd4f7e9d226ddbc0f00ad9",
                com.azure.core.util.Context.NONE);
    }
}
```

### AgentPools_DeleteMachines

```java
/**
 * Samples for Snapshots Delete.
 */
public final class SnapshotsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * SnapshotsDelete.json
     */
    /**
     * Sample code: Delete Snapshot.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        deleteSnapshot(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.snapshots().deleteByResourceGroupWithResponse("rg1", "snapshot1", com.azure.core.util.Context.NONE);
    }
}
```

### AgentPools_Get

```java
/**
 * Samples for ManagedClusters Stop.
 */
public final class ManagedClustersStopSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersStop.json
     */
    /**
     * Sample code: Stop Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        stopManagedCluster(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters().stop("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### AgentPools_GetAvailableAgentPoolVersions

```java
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedCluster;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ManagedClusters UpdateTags.
 */
public final class ManagedClustersUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersUpdateTags.json
     */
    /**
     * Sample code: Update Managed Cluster Tags.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void updateManagedClusterTags(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        ManagedCluster resource = manager.managedClusters()
            .getByResourceGroupWithResponse("rg1", "clustername1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("archv3", "", "tier", "testing")).apply();
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

### AgentPools_GetUpgradeProfile

```java
/**
 * Samples for ManagedClusters List.
 */
public final class ManagedClustersListSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersList.json
     */
    /**
     * Sample code: List Managed Clusters.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        listManagedClusters(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters().list(com.azure.core.util.Context.NONE);
    }
}
```

### AgentPools_List

```java
/**
 * Samples for OpenShiftManagedClusters GetByResourceGroup.
 */
public final class OpenShiftManagedClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2019-04-30/examples/
     * OpenShiftManagedClustersGet.json
     */
    /**
     * Sample code: Get OpenShift Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getOpenShiftManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.openShiftManagedClusters()
            .getByResourceGroupWithResponse("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### AgentPools_UpgradeNodeImageVersion

```java
import com.azure.resourcemanager.containerserviceaks.generated.models.NetworkProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.OSType;
import com.azure.resourcemanager.containerserviceaks.generated.models.OpenShiftAgentPoolProfileRole;
import com.azure.resourcemanager.containerserviceaks.generated.models.OpenShiftContainerServiceVMSize;
import com.azure.resourcemanager.containerserviceaks.generated.models.OpenShiftManagedClusterAadIdentityProvider;
import com.azure.resourcemanager.containerserviceaks.generated.models.OpenShiftManagedClusterAgentPoolProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.OpenShiftManagedClusterAuthProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.OpenShiftManagedClusterIdentityProvider;
import com.azure.resourcemanager.containerserviceaks.generated.models.OpenShiftManagedClusterMasterPoolProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.OpenShiftRouterProfile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for OpenShiftManagedClusters CreateOrUpdate.
 */
public final class OpenShiftManagedClustersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2019-04-30/examples/
     * OpenShiftManagedClustersCreate_Update.json
     */
    /**
     * Sample code: Create/Update OpenShift Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createUpdateOpenShiftManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.openShiftManagedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withOpenShiftVersion("v3.11")
            .withNetworkProfile(new NetworkProfile().withVnetCidr("10.0.0.0/8"))
            .withRouterProfiles(Arrays.asList(new OpenShiftRouterProfile().withName("default")))
            .withMasterPoolProfile(new OpenShiftManagedClusterMasterPoolProfile().withName("master")
                .withCount(3)
                .withVmSize(OpenShiftContainerServiceVMSize.STANDARD_D4S_V3)
                .withSubnetCidr("10.0.0.0/24")
                .withOsType(OSType.LINUX))
            .withAgentPoolProfiles(Arrays.asList(
                new OpenShiftManagedClusterAgentPoolProfile().withName("infra")
                    .withCount(2)
                    .withVmSize(OpenShiftContainerServiceVMSize.STANDARD_D4S_V3)
                    .withSubnetCidr("10.0.0.0/24")
                    .withOsType(OSType.LINUX)
                    .withRole(OpenShiftAgentPoolProfileRole.INFRA),
                new OpenShiftManagedClusterAgentPoolProfile().withName("compute")
                    .withCount(4)
                    .withVmSize(OpenShiftContainerServiceVMSize.STANDARD_D4S_V3)
                    .withSubnetCidr("10.0.0.0/24")
                    .withOsType(OSType.LINUX)
                    .withRole(OpenShiftAgentPoolProfileRole.COMPUTE)))
            .withAuthProfile(new OpenShiftManagedClusterAuthProfile()
                .withIdentityProviders(Arrays.asList(new OpenShiftManagedClusterIdentityProvider().withName("Azure AD")
                    .withProvider(new OpenShiftManagedClusterAadIdentityProvider().withClientId("clientId")
                        .withSecret("fakeTokenPlaceholder")
                        .withTenantId("tenantId")
                        .withCustomerAdminGroupId("customerAdminGroupId")))))
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

### ContainerServices_ListOrchestrators

```java
/**
 * Samples for AgentPools GetAvailableAgentPoolVersions.
 */
public final class AgentPoolsGetAvailableAgentPoolVersionsSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsGetAgentPoolAvailableVersions.json
     */
    /**
     * Sample code: Get available versions for agent pool.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getAvailableVersionsForAgentPool(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .getAvailableAgentPoolVersionsWithResponse("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### Machines_Get

```java
/**
 * Samples for AgentPools Get.
 */
public final class AgentPoolsGetSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsGet.json
     */
    /**
     * Sample code: Get Agent Pool.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        getAgentPool(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools().getWithResponse("rg1", "clustername1", "agentpool1", com.azure.core.util.Context.NONE);
    }
}
```

### Machines_List

```java
/**
 * Samples for ManagedClusters GetMeshUpgradeProfile.
 */
public final class ManagedClustersGetMeshUpgradeProfileSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersGet_MeshUpgradeProfile.json
     */
    /**
     * Sample code: Gets version compatibility and upgrade profile for a service mesh in a cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getsVersionCompatibilityAndUpgradeProfileForAServiceMeshInACluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .getMeshUpgradeProfileWithResponse("rg1", "clustername1", "istio", com.azure.core.util.Context.NONE);
    }
}
```

### MaintenanceConfigurations_CreateOrUpdate

```java
/**
 * Samples for MaintenanceConfigurations Delete.
 */
public final class MaintenanceConfigurationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * MaintenanceConfigurationsDelete.json
     */
    /**
     * Sample code: Delete Maintenance Configuration.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void deleteMaintenanceConfiguration(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.maintenanceConfigurations()
            .deleteWithResponse("rg1", "clustername1", "default", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * MaintenanceConfigurationsDelete_MaintenanceWindow.json
     */
    /**
     * Sample code: Delete Maintenance Configuration For Node OS Upgrade.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void deleteMaintenanceConfigurationForNodeOSUpgrade(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.maintenanceConfigurations()
            .deleteWithResponse("rg1", "clustername1", "aksManagedNodeOSUpgradeSchedule",
                com.azure.core.util.Context.NONE);
    }
}
```

### MaintenanceConfigurations_Delete

```java
/**
 * Samples for ManagedClusters ListClusterAdminCredentials.
 */
public final class ManagedClustersListClusterAdminCredentialsSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersListClusterAdminCredentials.json
     */
    /**
     * Sample code: Get Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        getManagedCluster(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .listClusterAdminCredentialsWithResponse("rg1", "clustername1", null, com.azure.core.util.Context.NONE);
    }
}
```

### MaintenanceConfigurations_Get

```java
/**
 * Samples for AgentPools GetUpgradeProfile.
 */
public final class AgentPoolsGetUpgradeProfileSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsGetUpgradeProfile.json
     */
    /**
     * Sample code: Get Upgrade Profile for Agent Pool.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getUpgradeProfileForAgentPool(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .getUpgradeProfileWithResponse("rg1", "clustername1", "agentpool1", com.azure.core.util.Context.NONE);
    }
}
```

### MaintenanceConfigurations_ListByManagedCluster

```java
/**
 * Samples for ContainerServices ListOrchestrators.
 */
public final class ContainerServicesListOrchestratorsSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2019-08-01/examples/
     * ContainerServiceListOrchestrators.json
     */
    /**
     * Sample code: List Container Service Orchestrators.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listContainerServiceOrchestrators(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.containerServices().listOrchestratorsWithResponse("location1", null, com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_AbortLatestOperation

```java
/**
 * Samples for Snapshots GetByResourceGroup.
 */
public final class SnapshotsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * SnapshotsGet.json
     */
    /**
     * Sample code: Get Snapshot.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        getSnapshot(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.snapshots().getByResourceGroupWithResponse("rg1", "snapshot1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_CreateOrUpdate

```java
/**
 * Samples for Snapshots ListByResourceGroup.
 */
public final class SnapshotsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * SnapshotsListByResourceGroup.json
     */
    /**
     * Sample code: List Snapshots by Resource Group.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listSnapshotsByResourceGroup(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.snapshots().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_Delete

```java
/**
 * Samples for ManagedClusters Delete.
 */
public final class ManagedClustersDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersDelete.json
     */
    /**
     * Sample code: Delete Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        deleteManagedCluster(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters().delete("rg1", "clustername1", null, com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_GetAccessProfile

```java
/**
 * Samples for ManagedClusters RotateServiceAccountSigningKeys.
 */
public final class ManagedClustersRotateServiceAccountSigningKeysSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersRotateServiceAccountSigningKeys.json
     */
    /**
     * Sample code: Rotate Cluster Service Account Signing Keys.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void rotateClusterServiceAccountSigningKeys(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .rotateServiceAccountSigningKeys("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_GetByResourceGroup

```java
import com.azure.resourcemanager.containerserviceaks.generated.models.RunCommandRequest;

/**
 * Samples for ManagedClusters RunCommand.
 */
public final class ManagedClustersRunCommandSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * RunCommandRequest.json
     */
    /**
     * Sample code: submitNewCommand.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        submitNewCommand(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .runCommand("rg1", "clustername1",
                new RunCommandRequest().withCommand("kubectl apply -f ns.yaml")
                    .withContext("")
                    .withClusterToken("fakeTokenPlaceholder"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_GetCommandResult

```java

/**
 * Samples for ManagedClusters ListClusterUserCredentials.
 */
public final class ManagedClustersListClusterUserCredentialsSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersListClusterUserCredentials.json
     */
    /**
     * Sample code: Get Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        getManagedCluster(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .listClusterUserCredentialsWithResponse("rg1", "clustername1", null, null,
                com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_GetMeshRevisionProfile

```java
/**
 * Samples for ManagedClusters AbortLatestOperation.
 */
public final class ManagedClustersAbortLatestOperationSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersAbortOperation.json
     */
    /**
     * Sample code: Abort operation on managed cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void abortOperationOnManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters().abortLatestOperation("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_GetMeshUpgradeProfile

```java
/**
 * Samples for ManagedClusters GetMeshRevisionProfile.
 */
public final class ManagedClustersGetMeshRevisionProfileSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersGet_MeshRevisionProfile.json
     */
    /**
     * Sample code: Get a mesh revision profile for a mesh mode.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getAMeshRevisionProfileForAMeshMode(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .getMeshRevisionProfileWithResponse("location1", "istio", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_GetUpgradeProfile

```java
/**
 * Samples for MaintenanceConfigurations Get.
 */
public final class MaintenanceConfigurationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * MaintenanceConfigurationsGet.json
     */
    /**
     * Sample code: Get Maintenance Configuration.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getMaintenanceConfiguration(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.maintenanceConfigurations()
            .getWithResponse("rg1", "clustername1", "default", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * MaintenanceConfigurationsGet_MaintenanceWindow.json
     */
    /**
     * Sample code: Get Maintenance Configuration Configured With Maintenance Window.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getMaintenanceConfigurationConfiguredWithMaintenanceWindow(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.maintenanceConfigurations()
            .getWithResponse("rg1", "clustername1", "aksManagedNodeOSUpgradeSchedule",
                com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_List

```java
/**
 * Samples for PrivateEndpointConnections List.
 */
public final class PrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * PrivateEndpointConnectionsList.json
     */
    /**
     * Sample code: List Private Endpoint Connections by Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listPrivateEndpointConnectionsByManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.privateEndpointConnections().listWithResponse("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_ListByResourceGroup

```java
/**
 * Samples for PrivateLinkResources List.
 */
public final class PrivateLinkResourcesListSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * PrivateLinkResourcesList.json
     */
    /**
     * Sample code: List Private Link Resources by Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listPrivateLinkResourcesByManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.privateLinkResources().listWithResponse("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_ListClusterAdminCredentials

```java
/**
 * Samples for Snapshots List.
 */
public final class SnapshotsListSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * SnapshotsList.json
     */
    /**
     * Sample code: List Snapshots.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        listSnapshots(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.snapshots().list(com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_ListClusterMonitoringUserCredentials

```java
/**
 * Samples for ManagedClusters GetUpgradeProfile.
 */
public final class ManagedClustersGetUpgradeProfileSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersGetUpgradeProfile.json
     */
    /**
     * Sample code: Get Upgrade Profile for Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getUpgradeProfileForManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .getUpgradeProfileWithResponse("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_ListClusterUserCredentials

```java
/**
 * Samples for MaintenanceConfigurations ListByManagedCluster.
 */
public final class MaintenanceConfigurationsListByManagedClusterSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * MaintenanceConfigurationsList_MaintenanceWindow.json
     */
    /**
     * Sample code: List maintenance configurations configured with maintenance window by Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listMaintenanceConfigurationsConfiguredWithMaintenanceWindowByManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.maintenanceConfigurations()
            .listByManagedCluster("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * MaintenanceConfigurationsList.json
     */
    /**
     * Sample code: List maintenance configurations by Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listMaintenanceConfigurationsByManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.maintenanceConfigurations()
            .listByManagedCluster("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_ListKubernetesVersions

```java
import com.azure.resourcemanager.containerserviceaks.generated.models.AgentPool;
import com.azure.resourcemanager.containerserviceaks.generated.models.AgentPoolMode;
import com.azure.resourcemanager.containerserviceaks.generated.models.AgentPoolWindowsProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.Code;
import com.azure.resourcemanager.containerserviceaks.generated.models.CreationData;
import com.azure.resourcemanager.containerserviceaks.generated.models.GpuInstanceProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.KubeletConfig;
import com.azure.resourcemanager.containerserviceaks.generated.models.LinuxOSConfig;
import com.azure.resourcemanager.containerserviceaks.generated.models.OSDiskType;
import com.azure.resourcemanager.containerserviceaks.generated.models.OSType;
import com.azure.resourcemanager.containerserviceaks.generated.models.Ossku;
import com.azure.resourcemanager.containerserviceaks.generated.models.PowerState;
import com.azure.resourcemanager.containerserviceaks.generated.models.ScaleSetEvictionPolicy;
import com.azure.resourcemanager.containerserviceaks.generated.models.ScaleSetPriority;
import com.azure.resourcemanager.containerserviceaks.generated.models.SysctlConfig;
import com.azure.resourcemanager.containerserviceaks.generated.models.WorkloadRuntime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AgentPools CreateOrUpdate.
 */
public final class AgentPoolsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_EnableFIPS.json
     */
    /**
     * Sample code: Create Agent Pool with FIPS enabled OS.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithFIPSEnabledOS(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withEnableFips(true)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_GPUMIG.json
     */
    /**
     * Sample code: Create Agent Pool with GPUMIG.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithGPUMIG(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_ND96asr_v4")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withKubeletConfig(new KubeletConfig().withCpuManagerPolicy("static")
                .withCpuCfsQuota(true)
                .withCpuCfsQuotaPeriod("200ms")
                .withImageGcHighThreshold(90)
                .withImageGcLowThreshold(70)
                .withTopologyManagerPolicy("best-effort")
                .withAllowedUnsafeSysctls(Arrays.asList("kernel.msg*", "net.core.somaxconn"))
                .withFailSwapOn(false))
            .withLinuxOSConfig(new LinuxOSConfig()
                .withSysctls(new SysctlConfig().withNetCoreWmemDefault(12345)
                    .withNetIpv4TcpTwReuse(true)
                    .withNetIpv4IpLocalPortRange("20000 60000")
                    .withKernelThreadsMax(99999))
                .withTransparentHugePageEnabled("always")
                .withTransparentHugePageDefrag("madvise")
                .withSwapFileSizeMB(1500))
            .withGpuInstanceProfile(GpuInstanceProfile.MIG2G)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_WindowsOSSKU.json
     */
    /**
     * Sample code: Create Agent Pool with Windows OSSKU.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithWindowsOSSKU(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("wnp2")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_D4s_v3")
            .withOsType(OSType.WINDOWS)
            .withOsSku(Ossku.WINDOWS2022)
            .withOrchestratorVersion("1.23.3")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_DedicatedHostGroup.json
     */
    /**
     * Sample code: Create Agent Pool with Dedicated Host Group.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithDedicatedHostGroup(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withHostGroupId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg/providers/Microsoft.Compute/hostGroups/hostgroup1")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_Update.json
     */
    /**
     * Sample code: Create/Update Agent Pool.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        createUpdateAgentPool(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withTags(mapOf("name1", "val1"))
            .withCount(3)
            .withVmSize("Standard_DS1_v2")
            .withOsType(OSType.LINUX)
            .withMode(AgentPoolMode.USER)
            .withOrchestratorVersion("")
            .withScaleSetPriority(ScaleSetPriority.SPOT)
            .withScaleSetEvictionPolicy(ScaleSetEvictionPolicy.DELETE)
            .withNodeLabels(mapOf("key1", "fakeTokenPlaceholder"))
            .withNodeTaints(Arrays.asList("Key1=Value1:NoSchedule"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_WindowsDisableOutboundNAT.json
     */
    /**
     * Sample code: Create Windows Agent Pool with disabling OutboundNAT.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createWindowsAgentPoolWithDisablingOutboundNAT(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("wnp2")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_D4s_v3")
            .withOsType(OSType.WINDOWS)
            .withOsSku(Ossku.WINDOWS2022)
            .withOrchestratorVersion("1.23.8")
            .withWindowsProfile(new AgentPoolWindowsProfile().withDisableOutboundNat(true))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPools_Start.json
     */
    /**
     * Sample code: Start Agent Pool.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        startAgentPool(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withPowerState(new PowerState().withCode(Code.RUNNING))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_Spot.json
     */
    /**
     * Sample code: Create Spot Agent Pool.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        createSpotAgentPool(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withTags(mapOf("name1", "val1"))
            .withCount(3)
            .withVmSize("Standard_DS1_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withScaleSetPriority(ScaleSetPriority.SPOT)
            .withScaleSetEvictionPolicy(ScaleSetEvictionPolicy.DELETE)
            .withNodeLabels(mapOf("key1", "fakeTokenPlaceholder"))
            .withNodeTaints(Arrays.asList("Key1=Value1:NoSchedule"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_Ephemeral.json
     */
    /**
     * Sample code: Create Agent Pool with Ephemeral OS Disk.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithEphemeralOSDisk(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsDiskSizeGB(64)
            .withOsDiskType(OSDiskType.EPHEMERAL)
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_EnableEncryptionAtHost.json
     */
    /**
     * Sample code: Create Agent Pool with EncryptionAtHost enabled.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithEncryptionAtHostEnabled(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withEnableEncryptionAtHost(true)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_EnableUltraSSD.json
     */
    /**
     * Sample code: Create Agent Pool with UltraSSD enabled.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithUltraSSDEnabled(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withEnableUltraSsd(true)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_WasmWasi.json
     */
    /**
     * Sample code: Create Agent Pool with Krustlet and the WASI runtime.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithKrustletAndTheWASIRuntime(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsDiskSizeGB(64)
            .withWorkloadRuntime(WorkloadRuntime.WASM_WASI)
            .withOsType(OSType.LINUX)
            .withMode(AgentPoolMode.USER)
            .withOrchestratorVersion("")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_Snapshot.json
     */
    /**
     * Sample code: Create Agent Pool using an agent pool snapshot.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolUsingAnAgentPoolSnapshot(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withEnableFips(true)
            .withCreationData(new CreationData().withSourceResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.ContainerService/snapshots/snapshot1"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_PPG.json
     */
    /**
     * Sample code: Create Agent Pool with PPG.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithPPG(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withProximityPlacementGroupId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/proximityPlacementGroups/ppg1")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_CustomNodeConfig.json
     */
    /**
     * Sample code: Create Agent Pool with KubeletConfig and LinuxOSConfig.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithKubeletConfigAndLinuxOSConfig(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withKubeletConfig(new KubeletConfig().withCpuManagerPolicy("static")
                .withCpuCfsQuota(true)
                .withCpuCfsQuotaPeriod("200ms")
                .withImageGcHighThreshold(90)
                .withImageGcLowThreshold(70)
                .withTopologyManagerPolicy("best-effort")
                .withAllowedUnsafeSysctls(Arrays.asList("kernel.msg*", "net.core.somaxconn"))
                .withFailSwapOn(false))
            .withLinuxOSConfig(new LinuxOSConfig()
                .withSysctls(new SysctlConfig().withNetCoreWmemDefault(12345)
                    .withNetIpv4TcpTwReuse(true)
                    .withNetIpv4IpLocalPortRange("20000 60000")
                    .withKernelThreadsMax(99999))
                .withTransparentHugePageEnabled("always")
                .withTransparentHugePageDefrag("madvise")
                .withSwapFileSizeMB(1500))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPools_Stop.json
     */
    /**
     * Sample code: Stop Agent Pool.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        stopAgentPool(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withPowerState(new PowerState().withCode(Code.STOPPED))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_MessageOfTheDay.json
     */
    /**
     * Sample code: Create Agent Pool with Message of the Day.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithMessageOfTheDay(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsDiskSizeGB(64)
            .withMessageOfTheDay("Zm9vCg==")
            .withOsType(OSType.LINUX)
            .withMode(AgentPoolMode.USER)
            .withOrchestratorVersion("")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_CRG.json
     */
    /**
     * Sample code: Create Agent Pool with Capacity Reservation Group.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithCapacityReservationGroup(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOrchestratorVersion("")
            .withCapacityReservationGroupId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/CapacityReservationGroups/crg1")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsCreate_OSSKU.json
     */
    /**
     * Sample code: Create Agent Pool with OSSKU.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createAgentPoolWithOSSKU(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .define("agentpool1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withCount(3)
            .withVmSize("Standard_DS2_v2")
            .withOsType(OSType.LINUX)
            .withOsSku(Ossku.AZURE_LINUX)
            .withOrchestratorVersion("")
            .withKubeletConfig(new KubeletConfig().withCpuManagerPolicy("static")
                .withCpuCfsQuota(true)
                .withCpuCfsQuotaPeriod("200ms")
                .withImageGcHighThreshold(90)
                .withImageGcLowThreshold(70)
                .withTopologyManagerPolicy("best-effort")
                .withAllowedUnsafeSysctls(Arrays.asList("kernel.msg*", "net.core.somaxconn"))
                .withFailSwapOn(false))
            .withLinuxOSConfig(new LinuxOSConfig()
                .withSysctls(new SysctlConfig().withNetCoreWmemDefault(12345)
                    .withNetIpv4TcpTwReuse(true)
                    .withNetIpv4IpLocalPortRange("20000 60000")
                    .withKernelThreadsMax(99999))
                .withTransparentHugePageEnabled("always")
                .withTransparentHugePageDefrag("madvise")
                .withSwapFileSizeMB(1500))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPools_Update.json
     */
    /**
     * Sample code: Update Agent Pool.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        updateAgentPool(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        AgentPool resource = manager.agentPools()
            .getWithResponse("rg1", "clustername1", "agentpool1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withCount(3)
            .withVmSize("Standard_DS1_v2")
            .withOsType(OSType.LINUX)
            .withMaxCount(2)
            .withMinCount(2)
            .withEnableAutoScaling(true)
            .withOrchestratorVersion("")
            .withScaleSetPriority(ScaleSetPriority.SPOT)
            .withScaleSetEvictionPolicy(ScaleSetEvictionPolicy.DELETE)
            .withNodeTaints(Arrays.asList("Key1=Value1:NoSchedule"))
            .apply();
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

### ManagedClusters_ListMeshRevisionProfiles

```java
/**
 * Samples for ManagedClusters ListOutboundNetworkDependenciesEndpoints.
 */
public final class ManagedClustersListOutboundNetworkDependenciesEndpointsSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * OutboundNetworkDependenciesEndpointsList.json
     */
    /**
     * Sample code: List OutboundNetworkDependenciesEndpoints by Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listOutboundNetworkDependenciesEndpointsByManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .listOutboundNetworkDependenciesEndpoints("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_ListMeshUpgradeProfiles

```java
/**
 * Samples for OpenShiftManagedClusters Delete.
 */
public final class OpenShiftManagedClustersDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2019-04-30/examples/
     * OpenShiftManagedClustersDelete.json
     */
    /**
     * Sample code: Delete OpenShift Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void deleteOpenShiftManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.openShiftManagedClusters().delete("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_ListOutboundNetworkDependenciesEndpoints

```java
import com.azure.resourcemanager.containerserviceaks.generated.models.OpenShiftManagedCluster;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for OpenShiftManagedClusters UpdateTags.
 */
public final class OpenShiftManagedClustersUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2019-04-30/examples/
     * OpenShiftManagedClustersUpdateTags.json
     */
    /**
     * Sample code: Update OpenShift Managed Cluster Tags.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void updateOpenShiftManagedClusterTags(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        OpenShiftManagedCluster resource = manager.openShiftManagedClusters()
            .getByResourceGroupWithResponse("rg1", "clustername1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("archv3", "", "tier", "testing")).apply();
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

### ManagedClusters_ResetAadProfile

```java
/**
 * Samples for Machines List.
 */
public final class MachinesListSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * MachineList.json
     */
    /**
     * Sample code: List Machines in an Agentpool by Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listMachinesInAnAgentpoolByManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.machines().list("rg1", "clustername1", "agentpool1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_ResetServicePrincipalProfile

```java
/**
 * Samples for AgentPools Delete.
 */
public final class AgentPoolsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsDelete.json
     */
    /**
     * Sample code: Delete Agent Pool.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        deleteAgentPool(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools().delete("rg1", "clustername1", "agentpool1", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_RotateClusterCertificates

```java
/**
 * Samples for AgentPools AbortLatestOperation.
 */
public final class AgentPoolsAbortLatestOperationSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsAbortOperation.json
     */
    /**
     * Sample code: Abort operation on agent pool.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void abortOperationOnAgentPool(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .abortLatestOperation("rg1", "clustername1", "agentpool1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_RotateServiceAccountSigningKeys

```java
/**
 * Samples for AgentPools UpgradeNodeImageVersion.
 */
public final class AgentPoolsUpgradeNodeImageVersionSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsUpgradeNodeImageVersion.json
     */
    /**
     * Sample code: Upgrade Agent Pool Node Image Version.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void upgradeAgentPoolNodeImageVersion(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .upgradeNodeImageVersion("rg1", "clustername1", "agentpool1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_RunCommand

```java
/**
 * Samples for ManagedClusters ListByResourceGroup.
 */
public final class ManagedClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersListByResourceGroup.json
     */
    /**
     * Sample code: Get Managed Clusters by Resource Group.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getManagedClustersByResourceGroup(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_Start

```java
import com.azure.resourcemanager.containerserviceaks.generated.fluent.models.PrivateLinkResourceInner;

/**
 * Samples for ResolvePrivateLinkServiceId Post.
 */
public final class ResolvePrivateLinkServiceIdPostSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ResolvePrivateLinkServiceId.json
     */
    /**
     * Sample code: Resolve the Private Link Service ID for Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void resolveThePrivateLinkServiceIDForManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.resolvePrivateLinkServiceIds()
            .postWithResponse("rg1", "clustername1", new PrivateLinkResourceInner().withName("management"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_Stop

```java
/**
 * Samples for TrustedAccessRoleBindings List.
 */
public final class TrustedAccessRoleBindingsListSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * TrustedAccessRoleBindings_List.json
     */
    /**
     * Sample code: List trusted access role bindings.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listTrustedAccessRoleBindings(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.trustedAccessRoleBindings().list("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedClusters_UpdateTags

```java
/**
 * Samples for TrustedAccessRoles List.
 */
public final class TrustedAccessRolesListSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * TrustedAccessRoles_List.json
     */
    /**
     * Sample code: List trusted access roles.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listTrustedAccessRoles(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.trustedAccessRoles().list("westus2", com.azure.core.util.Context.NONE);
    }
}
```

### OpenShiftManagedClusters_CreateOrUpdate

```java
/**
 * Samples for TrustedAccessRoleBindings Get.
 */
public final class TrustedAccessRoleBindingsGetSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * TrustedAccessRoleBindings_Get.json
     */
    /**
     * Sample code: Get a trusted access role binding.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getATrustedAccessRoleBinding(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.trustedAccessRoleBindings()
            .getWithResponse("rg1", "clustername1", "binding1", com.azure.core.util.Context.NONE);
    }
}
```

### OpenShiftManagedClusters_Delete

```java
/**
 * Samples for ManagedClusters ListKubernetesVersions.
 */
public final class ManagedClustersListKubernetesVersionsSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * KubernetesVersions_List.json
     */
    /**
     * Sample code: List Kubernetes Versions.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listKubernetesVersions(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters().listKubernetesVersionsWithResponse("location1", com.azure.core.util.Context.NONE);
    }
}
```

### OpenShiftManagedClusters_GetByResourceGroup

```java
/**
 * Samples for TrustedAccessRoleBindings Delete.
 */
public final class TrustedAccessRoleBindingsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * TrustedAccessRoleBindings_Delete.json
     */
    /**
     * Sample code: Delete a trusted access role binding.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void deleteATrustedAccessRoleBinding(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.trustedAccessRoleBindings().delete("rg1", "clustername1", "binding1", com.azure.core.util.Context.NONE);
    }
}
```

### OpenShiftManagedClusters_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * Operation_List.json
     */
    /**
     * Sample code: List available operations for the container service resource provider.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listAvailableOperationsForTheContainerServiceResourceProvider(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### OpenShiftManagedClusters_ListByResourceGroup

```java
/**
 * Samples for Machines Get.
 */
public final class MachinesGetSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * MachineGet.json
     */
    /**
     * Sample code: Get a Machine in an Agent Pools by Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getAMachineInAnAgentPoolsByManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.machines()
            .getWithResponse("rg1", "clustername1", "agentpool1", "aks-nodepool1-42263519-vmss00000t",
                com.azure.core.util.Context.NONE);
    }
}
```

### OpenShiftManagedClusters_UpdateTags

```java
/**
 * Samples for ManagedClusters GetAccessProfile.
 */
public final class ManagedClustersGetAccessProfileSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersGetAccessProfile.json
     */
    /**
     * Sample code: Get Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        getManagedCluster(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .getAccessProfileWithResponse("rg1", "clustername1", "clusterUser", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.resourcemanager.containerserviceaks.generated.models.AgentPoolMode;
import com.azure.resourcemanager.containerserviceaks.generated.models.AgentPoolType;
import com.azure.resourcemanager.containerserviceaks.generated.models.ClusterUpgradeSettings;
import com.azure.resourcemanager.containerserviceaks.generated.models.ContainerServiceLinuxProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ContainerServiceNetworkProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ContainerServiceSshConfiguration;
import com.azure.resourcemanager.containerserviceaks.generated.models.ContainerServiceSshPublicKey;
import com.azure.resourcemanager.containerserviceaks.generated.models.CreationData;
import com.azure.resourcemanager.containerserviceaks.generated.models.Expander;
import com.azure.resourcemanager.containerserviceaks.generated.models.GpuInstanceProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.IpFamily;
import com.azure.resourcemanager.containerserviceaks.generated.models.IstioCertificateAuthority;
import com.azure.resourcemanager.containerserviceaks.generated.models.IstioComponents;
import com.azure.resourcemanager.containerserviceaks.generated.models.IstioEgressGateway;
import com.azure.resourcemanager.containerserviceaks.generated.models.IstioIngressGateway;
import com.azure.resourcemanager.containerserviceaks.generated.models.IstioIngressGatewayMode;
import com.azure.resourcemanager.containerserviceaks.generated.models.IstioPluginCertificateAuthority;
import com.azure.resourcemanager.containerserviceaks.generated.models.IstioServiceMesh;
import com.azure.resourcemanager.containerserviceaks.generated.models.KubernetesSupportPlan;
import com.azure.resourcemanager.containerserviceaks.generated.models.LicenseType;
import com.azure.resourcemanager.containerserviceaks.generated.models.LoadBalancerSku;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterAadProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterAddonProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterAgentPoolProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterApiServerAccessProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterHttpProxyConfig;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterIdentity;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterIngressProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterIngressProfileWebAppRouting;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterLoadBalancerProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterLoadBalancerProfileManagedOutboundIPs;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterManagedOutboundIpProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterNatGatewayProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterPodIdentityProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterPropertiesAutoScalerProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterSecurityProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterSecurityProfileDefender;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterSecurityProfileDefenderSecurityMonitoring;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterSecurityProfileWorkloadIdentity;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterServicePrincipalProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterSku;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterSkuName;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterSkuTier;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterWindowsProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedServiceIdentityUserAssignedIdentitiesValue;
import com.azure.resourcemanager.containerserviceaks.generated.models.OSType;
import com.azure.resourcemanager.containerserviceaks.generated.models.Ossku;
import com.azure.resourcemanager.containerserviceaks.generated.models.OutboundType;
import com.azure.resourcemanager.containerserviceaks.generated.models.ResourceIdentityType;
import com.azure.resourcemanager.containerserviceaks.generated.models.ScaleDownMode;
import com.azure.resourcemanager.containerserviceaks.generated.models.ServiceMeshMode;
import com.azure.resourcemanager.containerserviceaks.generated.models.ServiceMeshProfile;
import com.azure.resourcemanager.containerserviceaks.generated.models.UpgradeOverrideSettings;
import com.azure.resourcemanager.containerserviceaks.generated.models.WindowsGmsaProfile;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ManagedClusters CreateOrUpdate.
 */
public final class ManagedClustersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_CRG.json
     */
    /**
     * Sample code: Create Managed Cluster with Capacity Reservation Group.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithCapacityReservationGroup(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withCapacityReservationGroupId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/capacityReservationGroups/crg1")
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_CustomCATrustCertificates.json
     */
    /**
     * Sample code: Create Managed Cluster with Custom CA Trust Certificates.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithCustomCATrustCertificates(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .withSecurityProfile(new ManagedClusterSecurityProfile().withCustomCATrustCertificates(
                Arrays.asList("ZHVtbXlFeGFtcGxlVGVzdFZhbHVlRm9yQ2VydGlmaWNhdGVUb0JlQWRkZWQ=".getBytes())))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_DualStackNetworking.json
     */
    /**
     * Sample code: Create/Update Managed Cluster with dual-stack networking.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createUpdateManagedClusterWithDualStackNetworking(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withIdentity(new ManagedClusterIdentity().withType(ResourceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rgName1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity1",
                    new ManagedServiceIdentityUserAssignedIdentitiesValue())))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS1_v2")
                .withOsType(OSType.LINUX)
                .withScaleDownMode(ScaleDownMode.DEALLOCATE)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withAvailabilityZones(Arrays.asList("1", "2", "3"))
                .withEnableNodePublicIp(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2)))
                .withIpFamilies(Arrays.asList(IpFamily.IPV4, IpFamily.IPV6)))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withBalanceSimilarNodeGroups("true")
                .withExpander(Expander.PRIORITY)
                .withMaxNodeProvisionTime("15m")
                .withNewPodScaleUpDelay("1m")
                .withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m")
                .withSkipNodesWithSystemPods("false"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_PodIdentity.json
     */
    /**
     * Sample code: Create Managed Cluster with PodIdentity enabled.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithPodIdentityEnabled(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withPodIdentityProfile(
                new ManagedClusterPodIdentityProfile().withEnabled(true).withAllowNetworkPluginKubenet(true))
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_UserAssignedNATGateway.json
     */
    /**
     * Sample code: Create Managed Cluster with user-assigned NAT gateway as outbound type.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithUserAssignedNATGatewayAsOutboundType(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(false)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(
                new ContainerServiceNetworkProfile().withOutboundType(OutboundType.USER_ASSIGNED_NATGATEWAY)
                    .withLoadBalancerSku(LoadBalancerSku.STANDARD))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_Update.json
     */
    /**
     * Sample code: Create/Update Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createUpdateManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withIdentity(new ManagedClusterIdentity().withType(ResourceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rgName1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity1",
                    new ManagedServiceIdentityUserAssignedIdentitiesValue())))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS1_v2")
                .withOsType(OSType.LINUX)
                .withScaleDownMode(ScaleDownMode.DEALLOCATE)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withAvailabilityZones(Arrays.asList("1", "2", "3"))
                .withEnableNodePublicIp(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withUpgradeSettings(
                new ClusterUpgradeSettings().withOverrideSettings(new UpgradeOverrideSettings().withForceUpgrade(false)
                    .withUntil(OffsetDateTime.parse("2022-11-01T13:00:00Z"))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withBalanceSimilarNodeGroups("true")
                .withExpander(Expander.PRIORITY)
                .withMaxNodeProvisionTime("15m")
                .withNewPodScaleUpDelay("1m")
                .withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m")
                .withSkipNodesWithSystemPods("false"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_PrivateClusterFQDNSubdomain.json
     */
    /**
     * Sample code: Create Managed Private Cluster with fqdn subdomain specified.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedPrivateClusterWithFqdnSubdomainSpecified(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withFqdnSubdomain("domain1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withEnableEncryptionAtHost(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withApiServerAccessProfile(new ManagedClusterApiServerAccessProfile().withEnablePrivateCluster(true)
                .withPrivateDnsZone(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Network/privateDnsZones/privatelink.location1.azmk8s.io"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_ManagedNATGateway.json
     */
    /**
     * Sample code: Create Managed Cluster with AKS-managed NAT gateway as outbound type.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithAKSManagedNATGatewayAsOutboundType(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(false)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.MANAGED_NATGATEWAY)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withNatGatewayProfile(new ManagedClusterNatGatewayProfile()
                    .withManagedOutboundIpProfile(new ManagedClusterManagedOutboundIpProfile().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_Premium.json
     */
    /**
     * Sample code: Create Managed Cluster with LongTermSupport.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithLongTermSupport(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(
                new ManagedClusterSku().withName(ManagedClusterSkuName.BASE).withTier(ManagedClusterSkuTier.PREMIUM))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withEnableEncryptionAtHost(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withSupportPlan(KubernetesSupportPlan.AKSLONG_TERM_SUPPORT)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withApiServerAccessProfile(new ManagedClusterApiServerAccessProfile().withDisableRunCommand(true))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_NodePublicIPPrefix.json
     */
    /**
     * Sample code: Create Managed Cluster with Node Public IP Prefix.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithNodePublicIPPrefix(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withNodePublicIpPrefixId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Network/publicIPPrefixes/public-ip-prefix")
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_EnableEncryptionAtHost.json
     */
    /**
     * Sample code: Create Managed Cluster with EncryptionAtHost enabled.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithEncryptionAtHostEnabled(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withEnableEncryptionAtHost(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_PrivateClusterPublicFQDN.json
     */
    /**
     * Sample code: Create Managed Private Cluster with Public FQDN specified.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedPrivateClusterWithPublicFQDNSpecified(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withEnableEncryptionAtHost(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withApiServerAccessProfile(new ManagedClusterApiServerAccessProfile().withEnablePrivateCluster(true)
                .withEnablePrivateClusterPublicFqdn(true))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_HTTPProxy.json
     */
    /**
     * Sample code: Create Managed Cluster with HTTP proxy configured.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithHTTPProxyConfigured(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .withHttpProxyConfig(new ManagedClusterHttpProxyConfig().withHttpProxy("http://myproxy.server.com:8080")
                .withHttpsProxy("https://myproxy.server.com:8080")
                .withNoProxy(Arrays.asList("localhost", "127.0.0.1"))
                .withTrustedCa("Q29uZ3JhdHMhIFlvdSBoYXZlIGZvdW5kIGEgaGlkZGVuIG1lc3NhZ2U="))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_DedicatedHostGroup.json
     */
    /**
     * Sample code: Create Managed Cluster with Dedicated Host Group.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithDedicatedHostGroup(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withEnableNodePublicIp(true)
                .withHostGroupId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg/providers/Microsoft.Compute/hostGroups/hostgroup1")
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_EnabledFIPS.json
     */
    /**
     * Sample code: Create Managed Cluster with FIPS enabled OS.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithFIPSEnabledOS(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withEnableFips(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_SecurityProfile.json
     */
    /**
     * Sample code: Create Managed Cluster with Security Profile configured.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithSecurityProfileConfigured(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withSecurityProfile(new ManagedClusterSecurityProfile()
                .withDefender(new ManagedClusterSecurityProfileDefender().withLogAnalyticsWorkspaceResourceId(
                    "/subscriptions/SUB_ID/resourcegroups/RG_NAME/providers/microsoft.operationalinsights/workspaces/WORKSPACE_NAME")
                    .withSecurityMonitoring(
                        new ManagedClusterSecurityProfileDefenderSecurityMonitoring().withEnabled(true)))
                .withWorkloadIdentity(new ManagedClusterSecurityProfileWorkloadIdentity().withEnabled(true)))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_PPG.json
     */
    /**
     * Sample code: Create Managed Cluster with PPG.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithPPG(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withProximityPlacementGroupId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/proximityPlacementGroups/ppg1")
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_IngressProfile_WebAppRouting.json
     */
    /**
     * Sample code: Create Managed Cluster with Web App Routing Ingress Profile configured.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithWebAppRoutingIngressProfileConfigured(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withIngressProfile(new ManagedClusterIngressProfile()
                .withWebAppRouting(new ManagedClusterIngressProfileWebAppRouting().withEnabled(true)
                    .withDnsZoneResourceIds(Arrays.asList(
                        "/subscriptions/SUB_ID/resourceGroups/RG_NAME/providers/Microsoft.Network/dnszones/DNS_ZONE_NAME"))))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_UpdateWithAHUB.json
     */
    /**
     * Sample code: Create/Update Managed Cluster with EnableAHUB.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createUpdateManagedClusterWithEnableAHUB(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withIdentity(new ManagedClusterIdentity().withType(ResourceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rgName1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity1",
                    new ManagedServiceIdentityUserAssignedIdentitiesValue())))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS1_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withAvailabilityZones(Arrays.asList("1", "2", "3"))
                .withEnableNodePublicIp(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder")
                .withLicenseType(LicenseType.WINDOWS_SERVER))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_DisableRunCommand.json
     */
    /**
     * Sample code: Create Managed Cluster with RunCommand disabled.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithRunCommandDisabled(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withEnableEncryptionAtHost(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withApiServerAccessProfile(new ManagedClusterApiServerAccessProfile().withDisableRunCommand(true))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_Snapshot.json
     */
    /**
     * Sample code: Create Managed Cluster using an agent pool snapshot.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterUsingAnAgentPoolSnapshot(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withEnableFips(true)
                .withCreationData(new CreationData().withSourceResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.ContainerService/snapshots/snapshot1"))
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_AzureServiceMesh.json
     */
    /**
     * Sample code: Create/Update Managed Cluster with Azure Service Mesh.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createUpdateManagedClusterWithAzureServiceMesh(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf("azureKeyvaultSecretsProvider",
                new ManagedClusterAddonProfile().withEnabled(true)
                    .withConfig(mapOf("enableSecretRotation", "fakeTokenPlaceholder", "rotationPollInterval", "2m"))))
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .withServiceMeshProfile(
                new ServiceMeshProfile().withMode(ServiceMeshMode.ISTIO)
                    .withIstio(
                        new IstioServiceMesh()
                            .withComponents(new IstioComponents()
                                .withIngressGateways(
                                    Arrays.asList(new IstioIngressGateway().withMode(IstioIngressGatewayMode.INTERNAL)
                                        .withEnabled(true)))
                                .withEgressGateways(Arrays.asList(new IstioEgressGateway().withEnabled(true))))
                            .withCertificateAuthority(new IstioCertificateAuthority()
                                .withPlugin(new IstioPluginCertificateAuthority().withKeyVaultId("fakeTokenPlaceholder")
                                    .withCertObjectName("ca-cert")
                                    .withKeyObjectName("fakeTokenPlaceholder")
                                    .withRootCertObjectName("root-cert")
                                    .withCertChainObjectName("cert-chain")))))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_AzureKeyvaultSecretsProvider.json
     */
    /**
     * Sample code: Create Managed Cluster with Azure KeyVault Secrets Provider Addon.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithAzureKeyVaultSecretsProviderAddon(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf("azureKeyvaultSecretsProvider",
                new ManagedClusterAddonProfile().withEnabled(true)
                    .withConfig(mapOf("enableSecretRotation", "fakeTokenPlaceholder", "rotationPollInterval", "2m"))))
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_OSSKU.json
     */
    /**
     * Sample code: Create Managed Cluster with OSSKU.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithOSSKU(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withOsSku(Ossku.AZURE_LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .withHttpProxyConfig(new ManagedClusterHttpProxyConfig().withHttpProxy("http://myproxy.server.com:8080")
                .withHttpsProxy("https://myproxy.server.com:8080")
                .withNoProxy(Arrays.asList("localhost", "127.0.0.1"))
                .withTrustedCa("Q29uZ3JhdHMhIFlvdSBoYXZlIGZvdW5kIGEgaGlkZGVuIG1lc3NhZ2U="))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_UpdateWithEnableAzureRBAC.json
     */
    /**
     * Sample code: Create/Update AAD Managed Cluster with EnableAzureRBAC.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createUpdateAADManagedClusterWithEnableAzureRBAC(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS1_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withAvailabilityZones(Arrays.asList("1", "2", "3"))
                .withEnableNodePublicIp(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAadProfile(new ManagedClusterAadProfile().withManaged(true).withEnableAzureRbac(true))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_EnableUltraSSD.json
     */
    /**
     * Sample code: Create Managed Cluster with UltraSSD enabled.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithUltraSSDEnabled(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS2_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withEnableUltraSsd(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_UpdateWindowsGmsa.json
     */
    /**
     * Sample code: Create/Update Managed Cluster with Windows gMSA enabled.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createUpdateManagedClusterWithWindowsGMSAEnabled(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withIdentity(new ManagedClusterIdentity().withType(ResourceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rgName1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity1",
                    new ManagedServiceIdentityUserAssignedIdentitiesValue())))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_DS1_v2")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withAvailabilityZones(Arrays.asList("1", "2", "3"))
                .withEnableNodePublicIp(true)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder")
                .withGmsaProfile(new WindowsGmsaProfile().withEnabled(true)))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersCreate_GPUMIG.json
     */
    /**
     * Sample code: Create Managed Cluster with GPUMIG.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createManagedClusterWithGPUMIG(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .define("clustername1")
            .withRegion("location1")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("archv2", "", "tier", "production"))
            .withSku(new ManagedClusterSku().withName(ManagedClusterSkuName.fromString("Basic"))
                .withTier(ManagedClusterSkuTier.FREE))
            .withKubernetesVersion("")
            .withDnsPrefix("dnsprefix1")
            .withAgentPoolProfiles(Arrays.asList(new ManagedClusterAgentPoolProfile().withCount(3)
                .withVmSize("Standard_ND96asr_v4")
                .withOsType(OSType.LINUX)
                .withType(AgentPoolType.VIRTUAL_MACHINE_SCALE_SETS)
                .withMode(AgentPoolMode.SYSTEM)
                .withEnableNodePublicIp(true)
                .withGpuInstanceProfile(GpuInstanceProfile.MIG3G)
                .withName("nodepool1")))
            .withLinuxProfile(new ContainerServiceLinuxProfile().withAdminUsername("azureuser")
                .withSsh(new ContainerServiceSshConfiguration().withPublicKeys(
                    Arrays.asList(new ContainerServiceSshPublicKey().withKeyData("fakeTokenPlaceholder")))))
            .withWindowsProfile(new ManagedClusterWindowsProfile().withAdminUsername("azureuser")
                .withAdminPassword("fakeTokenPlaceholder"))
            .withServicePrincipalProfile(
                new ManagedClusterServicePrincipalProfile().withClientId("clientid").withSecret("fakeTokenPlaceholder"))
            .withAddonProfiles(mapOf())
            .withEnableRbac(true)
            .withNetworkProfile(new ContainerServiceNetworkProfile().withOutboundType(OutboundType.LOAD_BALANCER)
                .withLoadBalancerSku(LoadBalancerSku.STANDARD)
                .withLoadBalancerProfile(new ManagedClusterLoadBalancerProfile()
                    .withManagedOutboundIPs(new ManagedClusterLoadBalancerProfileManagedOutboundIPs().withCount(2))))
            .withAutoScalerProfile(new ManagedClusterPropertiesAutoScalerProfile().withScanInterval("20s")
                .withScaleDownDelayAfterAdd("15m"))
            .withDiskEncryptionSetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.Compute/diskEncryptionSets/des")
            .withHttpProxyConfig(new ManagedClusterHttpProxyConfig().withHttpProxy("http://myproxy.server.com:8080")
                .withHttpsProxy("https://myproxy.server.com:8080")
                .withNoProxy(Arrays.asList("localhost", "127.0.0.1"))
                .withTrustedCa("Q29uZ3JhdHMhIFlvdSBoYXZlIGZvdW5kIGEgaGlkZGVuIG1lc3NhZ2U="))
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

### PrivateEndpointConnections_Delete

```java
/**
 * Samples for ManagedClusters Start.
 */
public final class ManagedClustersStartSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersStart.json
     */
    /**
     * Sample code: Start Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        startManagedCluster(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters().start("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
import com.azure.resourcemanager.containerserviceaks.generated.models.DateSpan;
import com.azure.resourcemanager.containerserviceaks.generated.models.MaintenanceWindow;
import com.azure.resourcemanager.containerserviceaks.generated.models.RelativeMonthlySchedule;
import com.azure.resourcemanager.containerserviceaks.generated.models.Schedule;
import com.azure.resourcemanager.containerserviceaks.generated.models.TimeInWeek;
import com.azure.resourcemanager.containerserviceaks.generated.models.TimeSpan;
import com.azure.resourcemanager.containerserviceaks.generated.models.Type;
import com.azure.resourcemanager.containerserviceaks.generated.models.WeekDay;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for MaintenanceConfigurations CreateOrUpdate.
 */
public final class MaintenanceConfigurationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * MaintenanceConfigurationsCreate_Update.json
     */
    /**
     * Sample code: Create/Update Maintenance Configuration.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createUpdateMaintenanceConfiguration(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.maintenanceConfigurations()
            .define("default")
            .withExistingManagedCluster("rg1", "clustername1")
            .withTimeInWeek(Arrays.asList(new TimeInWeek().withDay(WeekDay.MONDAY).withHourSlots(Arrays.asList(1, 2))))
            .withNotAllowedTime(Arrays.asList(new TimeSpan().withStart(OffsetDateTime.parse("2020-11-26T03:00:00Z"))
                .withEnd(OffsetDateTime.parse("2020-11-30T12:00:00Z"))))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * MaintenanceConfigurationsCreate_Update_MaintenanceWindow.json
     */
    /**
     * Sample code: Create/Update Maintenance Configuration with Maintenance Window.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createUpdateMaintenanceConfigurationWithMaintenanceWindow(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.maintenanceConfigurations()
            .define("aksManagedAutoUpgradeSchedule")
            .withExistingManagedCluster("rg1", "clustername1")
            .withMaintenanceWindow(new MaintenanceWindow()
                .withSchedule(new Schedule().withRelativeMonthly(new RelativeMonthlySchedule().withIntervalMonths(3)
                    .withWeekIndex(Type.FIRST)
                    .withDayOfWeek(WeekDay.MONDAY)))
                .withDurationHours(10)
                .withUtcOffset("+05:30")
                .withStartDate(LocalDate.parse("2023-01-01"))
                .withStartTime("08:30")
                .withNotAllowedDates(Arrays.asList(
                    new DateSpan().withStart(LocalDate.parse("2023-02-18")).withEnd(LocalDate.parse("2023-02-25")),
                    new DateSpan().withStart(LocalDate.parse("2023-12-23")).withEnd(LocalDate.parse("2024-01-05")))))
            .create();
    }
}
```

### PrivateEndpointConnections_List

```java
/**
 * Samples for AgentPools List.
 */
public final class AgentPoolsListSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsList.json
     */
    /**
     * Sample code: List Agent Pools by Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listAgentPoolsByManagedCluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools().list("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Update

```java
/**
 * Samples for OpenShiftManagedClusters List.
 */
public final class OpenShiftManagedClustersListSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2019-04-30/examples/
     * OpenShiftManagedClustersList.json
     */
    /**
     * Sample code: List Managed Clusters.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        listManagedClusters(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.openShiftManagedClusters().list(com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_List

```java
/**
 * Samples for PrivateEndpointConnections Delete.
 */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * PrivateEndpointConnectionsDelete.json
     */
    /**
     * Sample code: Delete Private Endpoint Connection.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void deletePrivateEndpointConnection(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.privateEndpointConnections()
            .delete("rg1", "clustername1", "privateendpointconnection1", com.azure.core.util.Context.NONE);
    }
}
```

### ResolvePrivateLinkServiceId_Post

```java
import com.azure.resourcemanager.containerserviceaks.generated.models.AgentPoolDeleteMachinesParameter;
import java.util.Arrays;

/**
 * Samples for AgentPools DeleteMachines.
 */
public final class AgentPoolsDeleteMachinesSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * AgentPoolsDeleteMachines.json
     */
    /**
     * Sample code: Delete Specific Machines in an Agent Pool.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void deleteSpecificMachinesInAnAgentPool(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.agentPools()
            .deleteMachines("rg1", "clustername1", "agentpool1",
                new AgentPoolDeleteMachinesParameter().withMachineNames(
                    Arrays.asList("aks-nodepool1-42263519-vmss00000a", "aks-nodepool1-42263519-vmss00000b")),
                com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_CreateOrUpdate

```java
/**
 * Samples for ManagedClusters ListMeshRevisionProfiles.
 */
public final class ManagedClustersListMeshRevisionProfilesSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersList_MeshRevisionProfiles.json
     */
    /**
     * Sample code: List mesh revision profiles in a location.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listMeshRevisionProfilesInALocation(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters().listMeshRevisionProfiles("location1", com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_Delete

```java
/**
 * Samples for PrivateEndpointConnections Get.
 */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * PrivateEndpointConnectionsGet.json
     */
    /**
     * Sample code: Get Private Endpoint Connection.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getPrivateEndpointConnection(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.privateEndpointConnections()
            .getWithResponse("rg1", "clustername1", "privateendpointconnection1", com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_GetByResourceGroup

```java
/**
 * Samples for ManagedClusters ListClusterMonitoringUserCredentials.
 */
public final class ManagedClustersListClusterMonitoringUserCredentialsSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersListClusterMonitoringUserCredentials.json
     */
    /**
     * Sample code: Get Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        getManagedCluster(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .listClusterMonitoringUserCredentialsWithResponse("rg1", "clustername1", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_List

```java
/**
 * Samples for ManagedClusters GetByResourceGroup.
 */
public final class ManagedClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersGet.json
     */
    /**
     * Sample code: Get Managed Cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        getManagedCluster(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .getByResourceGroupWithResponse("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_ListByResourceGroup

```java
import java.util.Arrays;

/**
 * Samples for TrustedAccessRoleBindings CreateOrUpdate.
 */
public final class TrustedAccessRoleBindingsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * TrustedAccessRoleBindings_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update a trusted access role binding.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void createOrUpdateATrustedAccessRoleBinding(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.trustedAccessRoleBindings()
            .define("binding1")
            .withExistingManagedCluster("rg1", "clustername1")
            .withSourceResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/b/providers/Microsoft.MachineLearningServices/workspaces/c")
            .withRoles(Arrays.asList("Microsoft.MachineLearningServices/workspaces/reader",
                "Microsoft.MachineLearningServices/workspaces/writer"))
            .create();
    }
}
```

### Snapshots_UpdateTags

```java
/**
 * Samples for ManagedClusters ListMeshUpgradeProfiles.
 */
public final class ManagedClustersListMeshUpgradeProfilesSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersList_MeshUpgradeProfiles.json
     */
    /**
     * Sample code: Lists version compatibility and upgrade profile for all service meshes in a cluster.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listsVersionCompatibilityAndUpgradeProfileForAllServiceMeshesInACluster(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters().listMeshUpgradeProfiles("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### TrustedAccessRoleBindings_CreateOrUpdate

```java
import com.azure.resourcemanager.containerserviceaks.generated.models.CreationData;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Snapshots CreateOrUpdate.
 */
public final class SnapshotsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * SnapshotsCreate.json
     */
    /**
     * Sample code: Create/Update Snapshot.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        createUpdateSnapshot(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.snapshots()
            .define("snapshot1")
            .withRegion("westus")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder"))
            .withCreationData(new CreationData().withSourceResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.ContainerService/managedClusters/cluster1/agentPools/pool0"))
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

### TrustedAccessRoleBindings_Delete

```java
import com.azure.resourcemanager.containerserviceaks.generated.models.Snapshot;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Snapshots UpdateTags.
 */
public final class SnapshotsUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * SnapshotsUpdateTags.json
     */
    /**
     * Sample code: Update Snapshot Tags.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        updateSnapshotTags(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        Snapshot resource = manager.snapshots()
            .getByResourceGroupWithResponse("rg1", "snapshot1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("key2", "fakeTokenPlaceholder", "key3", "fakeTokenPlaceholder")).apply();
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

### TrustedAccessRoleBindings_Get

```java
import com.azure.resourcemanager.containerserviceaks.generated.models.ManagedClusterAadProfile;

/**
 * Samples for ManagedClusters ResetAadProfile.
 */
public final class ManagedClustersResetAadProfileSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersResetAADProfile.json
     */
    /**
     * Sample code: Reset AAD Profile.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void
        resetAADProfile(com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters()
            .resetAadProfile("rg1", "clustername1",
                new ManagedClusterAadProfile().withClientAppId("clientappid")
                    .withServerAppId("serverappid")
                    .withServerAppSecret("fakeTokenPlaceholder")
                    .withTenantId("tenantid"),
                com.azure.core.util.Context.NONE);
    }
}
```

### TrustedAccessRoleBindings_List

```java
/**
 * Samples for ManagedClusters RotateClusterCertificates.
 */
public final class ManagedClustersRotateClusterCertificatesSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2025-03-01/examples/
     * ManagedClustersRotateClusterCertificates.json
     */
    /**
     * Sample code: Rotate Cluster Certificates.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void rotateClusterCertificates(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.managedClusters().rotateClusterCertificates("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
```

### TrustedAccessRoles_List

```java
/**
 * Samples for OpenShiftManagedClusters ListByResourceGroup.
 */
public final class OpenShiftManagedClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2019-04-30/examples/
     * OpenShiftManagedClustersListByResourceGroup.json
     */
    /**
     * Sample code: Get Managed Clusters by Resource Group.
     * 
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void getManagedClustersByResourceGroup(
        com.azure.resourcemanager.containerserviceaks.generated.ContainerServiceManager manager) {
        manager.openShiftManagedClusters().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

