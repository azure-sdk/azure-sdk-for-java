# Code snippets and samples


## ContainerGroups

- [CreateOrUpdate](#containergroups_createorupdate)
- [Delete](#containergroups_delete)
- [GetByResourceGroup](#containergroups_getbyresourcegroup)
- [List](#containergroups_list)
- [ListByResourceGroup](#containergroups_listbyresourcegroup)
- [Restart](#containergroups_restart)
- [Start](#containergroups_start)
- [Stop](#containergroups_stop)
- [Update](#containergroups_update)

## Containers

- [Attach](#containers_attach)
- [ExecuteCommand](#containers_executecommand)
- [ListLogs](#containers_listlogs)

## Location

- [ListCachedImages](#location_listcachedimages)
- [ListCapabilities](#location_listcapabilities)
- [ListUsage](#location_listusage)

## Operations

- [List](#operations_list)

## SubnetServiceAssociationLink

- [Delete](#subnetserviceassociationlink_delete)
### ContainerGroups_CreateOrUpdate

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.containerinstance.generated.models.AzureFileVolume;
import com.azure.resourcemanager.containerinstance.generated.models.ConfidentialComputeProperties;
import com.azure.resourcemanager.containerinstance.generated.models.Container;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerGroupDiagnostics;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerGroupIdentity;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerGroupIpAddressType;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerGroupNetworkProtocol;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerGroupPriority;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerGroupRestartPolicy;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerGroupSku;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerGroupSubnetId;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerPort;
import com.azure.resourcemanager.containerinstance.generated.models.DeploymentExtensionSpec;
import com.azure.resourcemanager.containerinstance.generated.models.DnsConfiguration;
import com.azure.resourcemanager.containerinstance.generated.models.DnsNameLabelReusePolicy;
import com.azure.resourcemanager.containerinstance.generated.models.EncryptionProperties;
import com.azure.resourcemanager.containerinstance.generated.models.EnvironmentVariable;
import com.azure.resourcemanager.containerinstance.generated.models.GpuResource;
import com.azure.resourcemanager.containerinstance.generated.models.GpuSku;
import com.azure.resourcemanager.containerinstance.generated.models.ImageRegistryCredential;
import com.azure.resourcemanager.containerinstance.generated.models.IpAddress;
import com.azure.resourcemanager.containerinstance.generated.models.LogAnalytics;
import com.azure.resourcemanager.containerinstance.generated.models.LogAnalyticsLogType;
import com.azure.resourcemanager.containerinstance.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.containerinstance.generated.models.Port;
import com.azure.resourcemanager.containerinstance.generated.models.ResourceIdentityType;
import com.azure.resourcemanager.containerinstance.generated.models.ResourceRequests;
import com.azure.resourcemanager.containerinstance.generated.models.ResourceRequirements;
import com.azure.resourcemanager.containerinstance.generated.models.SecretReference;
import com.azure.resourcemanager.containerinstance.generated.models.SecurityContextCapabilitiesDefinition;
import com.azure.resourcemanager.containerinstance.generated.models.SecurityContextDefinition;
import com.azure.resourcemanager.containerinstance.generated.models.UserAssignedIdentities;
import com.azure.resourcemanager.containerinstance.generated.models.Volume;
import com.azure.resourcemanager.containerinstance.generated.models.VolumeMount;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ContainerGroups CreateOrUpdate.
 */
public final class ContainerGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupExtensions.json
     */
    /**
     * Sample code: ContainerGroupCreateWithExtensions.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void containerGroupCreateWithExtensions(
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) throws IOException {
        manager.containerGroups()
            .define("demo1")
            .withRegion("eastus2")
            .withExistingResourceGroup("demo")
            .withContainers(
                Arrays.asList(new Container().withName("demo1")
                    .withImage("nginx")
                    .withCommand(Arrays.asList())
                    .withPorts(Arrays.asList(new ContainerPort().withPort(80)))
                    .withEnvironmentVariables(Arrays.asList())
                    .withResources(new ResourceRequirements()
                        .withRequests(new ResourceRequests().withMemoryInGB(1.5).withCpu(1.0)))))
            .withOsType(OperatingSystemTypes.LINUX)
            .withImageRegistryCredentials(Arrays.asList())
            .withIpAddress(new IpAddress()
                .withPorts(Arrays.asList(new Port().withProtocol(ContainerGroupNetworkProtocol.TCP).withPort(80)))
                .withType(ContainerGroupIpAddressType.PRIVATE))
            .withSubnetIds(Arrays.asList(new ContainerGroupSubnetId().withId(
                "/subscriptions/00000000-0000-0000-0000-00000000/resourceGroups/test-rg/providers/Microsoft.Network/virtualNetworks/test-rg-vnet/subnets/test-subnet")))
            .withExtensions(Arrays.asList(
                new DeploymentExtensionSpec().withName("kube-proxy")
                    .withExtensionType("kube-proxy")
                    .withVersion("1.0")
                    .withSettings(SerializerFactory.createDefaultManagementSerializerAdapter()
                        .deserialize("{\"clusterCidr\":\"10.240.0.0/16\",\"kubeVersion\":\"v1.9.10\"}", Object.class,
                            SerializerEncoding.JSON))
                    .withProtectedSettings(SerializerFactory.createDefaultManagementSerializerAdapter()
                        .deserialize("{\"kubeConfig\":\"<kubeconfig encoded string>\"}", Object.class,
                            SerializerEncoding.JSON)),
                new DeploymentExtensionSpec().withName("vk-realtime-metrics")
                    .withExtensionType("realtime-metrics")
                    .withVersion("1.0")))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupEncryptionProperties.json
     */
    /**
     * Sample code: ContainerGroupWithEncryptionProperties.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void containerGroupWithEncryptionProperties(
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containerGroups()
            .define("demo1")
            .withRegion("eastus2")
            .withExistingResourceGroup("demo")
            .withContainers(
                Arrays.asList(new Container().withName("demo1")
                    .withImage("nginx")
                    .withCommand(Arrays.asList())
                    .withPorts(Arrays.asList(new ContainerPort().withPort(80)))
                    .withEnvironmentVariables(Arrays.asList())
                    .withResources(new ResourceRequirements()
                        .withRequests(new ResourceRequests().withMemoryInGB(1.5).withCpu(1.0)))))
            .withOsType(OperatingSystemTypes.LINUX)
            .withIdentity(new ContainerGroupIdentity().withType(ResourceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/test-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/container-group-identity",
                    new UserAssignedIdentities())))
            .withImageRegistryCredentials(Arrays.asList())
            .withIpAddress(new IpAddress()
                .withPorts(Arrays.asList(new Port().withProtocol(ContainerGroupNetworkProtocol.TCP).withPort(80)))
                .withType(ContainerGroupIpAddressType.PUBLIC))
            .withEncryptionProperties(new EncryptionProperties()
                .withVaultBaseUrl("https://testkeyvault.vault.azure.net")
                .withKeyName("fakeTokenPlaceholder")
                .withKeyVersion("fakeTokenPlaceholder")
                .withIdentity(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/test-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/container-group-identity"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupsCreateOrUpdateSecretReference.json
     */
    /**
     * Sample code: ContainerGroupsCreateOrUpdateSecretReference.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void containerGroupsCreateOrUpdateSecretReference(
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) throws IOException {
        manager.containerGroups()
            .define("demo1")
            .withRegion("west us")
            .withExistingResourceGroup("demo")
            .withContainers(Arrays.asList(new Container().withName("demo1")
                .withImage("privateRegistryImage")
                .withCommand(Arrays.asList())
                .withPorts(Arrays.asList(new ContainerPort().withPort(80)))
                .withEnvironmentVariables(Arrays
                    .asList(new EnvironmentVariable().withName("envSecret").withSecureValueReference("envSecretRef")))
                .withResources(new ResourceRequirements().withRequests(new ResourceRequests().withMemoryInGB(1.5)
                    .withCpu(1.0)
                    .withGpu(new GpuResource().withCount(1).withSku(GpuSku.K80))))
                .withVolumeMounts(Arrays.asList(
                    new VolumeMount().withName("volume1").withMountPath("/mnt/volume1").withReadOnly(false),
                    new VolumeMount().withName("volume2").withMountPath("/mnt/volume2").withReadOnly(false),
                    new VolumeMount().withName("volume3").withMountPath("/mnt/volume3").withReadOnly(true)))))
            .withOsType(OperatingSystemTypes.LINUX)
            .withIdentity(new ContainerGroupIdentity().withType(ResourceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity-name",
                    new UserAssignedIdentities())))
            .withSecretReferences(Arrays.asList(new SecretReference().withName("envSecretRef")
                .withIdentity(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity-name")
                .withSecretReferenceUri("fakeTokenPlaceholder"),
                new SecretReference().withName("accountKeyRef")
                    .withIdentity(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity-name")
                    .withSecretReferenceUri("fakeTokenPlaceholder"),
                new SecretReference().withName("volumeSecretRef")
                    .withIdentity(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity-name")
                    .withSecretReferenceUri("fakeTokenPlaceholder"),
                new SecretReference().withName("privateRegistryKeyRef")
                    .withIdentity(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity-name")
                    .withSecretReferenceUri("fakeTokenPlaceholder")))
            .withImageRegistryCredentials(
                Arrays.asList(new ImageRegistryCredential().withServer("demoregistry.azurecr.io")
                    .withUsername("registryUserName")
                    .withPasswordReference("fakeTokenPlaceholder")))
            .withIpAddress(new IpAddress()
                .withPorts(Arrays.asList(new Port().withProtocol(ContainerGroupNetworkProtocol.TCP).withPort(80)))
                .withType(ContainerGroupIpAddressType.PUBLIC)
                .withDnsNameLabel("dnsnamelabel1")
                .withAutoGeneratedDomainNameLabelScope(DnsNameLabelReusePolicy.UNSECURE))
            .withVolumes(Arrays.asList(
                new Volume().withName("volume1")
                    .withAzureFile(new AzureFileVolume().withShareName("shareName")
                        .withStorageAccountName("accountName")
                        .withStorageAccountKeyReference("fakeTokenPlaceholder")),
                new Volume().withName("volume2")
                    .withEmptyDir(SerializerFactory.createDefaultManagementSerializerAdapter()
                        .deserialize("{}", Object.class, SerializerEncoding.JSON)),
                new Volume().withName("volume3")
                    .withSecret(mapOf("secretKey1", "fakeTokenPlaceholder"))
                    .withSecretReference(mapOf("secretKey2", "fakeTokenPlaceholder"))))
            .withDiagnostics(new ContainerGroupDiagnostics().withLogAnalytics(new LogAnalytics()
                .withWorkspaceId("workspaceid")
                .withWorkspaceKey("fakeTokenPlaceholder")
                .withLogType(LogAnalyticsLogType.CONTAINER_INSIGHTS)
                .withMetadata(mapOf("test-key", "fakeTokenPlaceholder"))
                .withWorkspaceResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg/providers/microsoft.operationalinsights/workspaces/workspace")))
            .withSubnetIds(Arrays.asList(new ContainerGroupSubnetId().withId(
                "[resourceId('Microsoft.Network/virtualNetworks/subnets', parameters('vnetName'), parameters('subnetName'))]")))
            .withDnsConfig(new DnsConfiguration().withNameServers(Arrays.asList("1.1.1.1"))
                .withSearchDomains("cluster.local svc.cluster.local")
                .withOptions("ndots:2"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupCreateConfidential.json
     */
    /**
     * Sample code: ConfidentialContainerGroup.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void confidentialContainerGroup(
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containerGroups()
            .define("demo1")
            .withRegion("westeurope")
            .withExistingResourceGroup("demo")
            .withContainers(
                Arrays
                    .asList(
                        new Container().withName("accdemo")
                            .withImage("confiimage")
                            .withCommand(Arrays.asList())
                            .withPorts(Arrays.asList(new ContainerPort().withPort(8000)))
                            .withEnvironmentVariables(Arrays.asList())
                            .withResources(new ResourceRequirements()
                                .withRequests(new ResourceRequests().withMemoryInGB(1.5).withCpu(1.0)))
                            .withSecurityContext(new SecurityContextDefinition().withPrivileged(false)
                                .withCapabilities(new SecurityContextCapabilitiesDefinition()
                                    .withAdd(Arrays.asList("CAP_NET_ADMIN"))))))
            .withOsType(OperatingSystemTypes.LINUX)
            .withImageRegistryCredentials(Arrays.asList())
            .withIpAddress(new IpAddress()
                .withPorts(Arrays.asList(new Port().withProtocol(ContainerGroupNetworkProtocol.TCP).withPort(8000)))
                .withType(ContainerGroupIpAddressType.PUBLIC))
            .withSku(ContainerGroupSku.CONFIDENTIAL)
            .withConfidentialComputeProperties(new ConfidentialComputeProperties().withCcePolicy(
                "eyJhbGxvd19hbGwiOiB0cnVlLCAiY29udGFpbmVycyI6IHsibGVuZ3RoIjogMCwgImVsZW1lbnRzIjogbnVsbH19"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupsCreateOrUpdate.json
     */
    /**
     * Sample code: ContainerGroupsCreateOrUpdate.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void containerGroupsCreateOrUpdate(
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) throws IOException {
        manager.containerGroups()
            .define("demo1")
            .withRegion("west us")
            .withExistingResourceGroup("demo")
            .withContainers(Arrays.asList(new Container().withName("demo1")
                .withImage("nginx")
                .withCommand(Arrays.asList())
                .withPorts(Arrays.asList(new ContainerPort().withPort(80)))
                .withEnvironmentVariables(Arrays.asList())
                .withResources(new ResourceRequirements().withRequests(new ResourceRequests().withMemoryInGB(1.5)
                    .withCpu(1.0)
                    .withGpu(new GpuResource().withCount(1).withSku(GpuSku.K80))))
                .withVolumeMounts(Arrays.asList(
                    new VolumeMount().withName("volume1").withMountPath("/mnt/volume1").withReadOnly(false),
                    new VolumeMount().withName("volume2").withMountPath("/mnt/volume2").withReadOnly(false),
                    new VolumeMount().withName("volume3").withMountPath("/mnt/volume3").withReadOnly(true)))))
            .withOsType(OperatingSystemTypes.LINUX)
            .withIdentity(new ContainerGroupIdentity().withType(ResourceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity-name",
                    new UserAssignedIdentities())))
            .withImageRegistryCredentials(Arrays.asList())
            .withIpAddress(new IpAddress()
                .withPorts(Arrays.asList(new Port().withProtocol(ContainerGroupNetworkProtocol.TCP).withPort(80)))
                .withType(ContainerGroupIpAddressType.PUBLIC)
                .withDnsNameLabel("dnsnamelabel1")
                .withAutoGeneratedDomainNameLabelScope(DnsNameLabelReusePolicy.UNSECURE))
            .withVolumes(Arrays.asList(
                new Volume().withName("volume1")
                    .withAzureFile(new AzureFileVolume().withShareName("shareName")
                        .withStorageAccountName("accountName")
                        .withStorageAccountKey("fakeTokenPlaceholder")),
                new Volume().withName("volume2")
                    .withEmptyDir(SerializerFactory.createDefaultManagementSerializerAdapter()
                        .deserialize("{}", Object.class, SerializerEncoding.JSON)),
                new Volume().withName("volume3")
                    .withSecret(mapOf("secretKey1", "fakeTokenPlaceholder", "secretKey2", "fakeTokenPlaceholder"))))
            .withDiagnostics(new ContainerGroupDiagnostics().withLogAnalytics(new LogAnalytics()
                .withWorkspaceId("workspaceid")
                .withWorkspaceKey("fakeTokenPlaceholder")
                .withLogType(LogAnalyticsLogType.CONTAINER_INSIGHTS)
                .withMetadata(mapOf("test-key", "fakeTokenPlaceholder"))
                .withWorkspaceResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg/providers/microsoft.operationalinsights/workspaces/workspace")))
            .withSubnetIds(Arrays.asList(new ContainerGroupSubnetId().withId(
                "[resourceId('Microsoft.Network/virtualNetworks/subnets', parameters('vnetName'), parameters('subnetName'))]")))
            .withDnsConfig(new DnsConfiguration().withNameServers(Arrays.asList("1.1.1.1"))
                .withSearchDomains("cluster.local svc.cluster.local")
                .withOptions("ndots:2"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupsCreatePriority.json
     */
    /**
     * Sample code: ContainerGroupsCreateWithPriority.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void containerGroupsCreateWithPriority(
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containerGroups()
            .define("demo1")
            .withRegion("eastus")
            .withExistingResourceGroup("demo")
            .withContainers(
                Arrays.asList(new Container().withName("test-container-001")
                    .withImage("alpine:latest")
                    .withCommand(Arrays.asList("/bin/sh", "-c", "sleep 10"))
                    .withResources(new ResourceRequirements()
                        .withRequests(new ResourceRequests().withMemoryInGB(1.0).withCpu(1.0)))))
            .withOsType(OperatingSystemTypes.LINUX)
            .withRestartPolicy(ContainerGroupRestartPolicy.NEVER)
            .withSku(ContainerGroupSku.STANDARD)
            .withPriority(ContainerGroupPriority.SPOT)
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

### ContainerGroups_Delete

```java
/**
 * Samples for ContainerGroups Delete.
 */
public final class ContainerGroupsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupsDelete.json
     */
    /**
     * Sample code: ContainerGroupsDelete.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void
        containerGroupsDelete(com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containerGroups().delete("demo", "demo1", com.azure.core.util.Context.NONE);
    }
}
```

### ContainerGroups_GetByResourceGroup

```java
/**
 * Samples for ContainerGroups GetByResourceGroup.
 */
public final class ContainerGroupsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupsGetPriority.json
     */
    /**
     * Sample code: ContainerGroupsGetWithPriority.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void containerGroupsGetWithPriority(
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containerGroups().getByResourceGroupWithResponse("demo", "demo1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupsGet_Succeeded.json
     */
    /**
     * Sample code: ContainerGroupsGet_Succeeded.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void containerGroupsGetSucceeded(
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containerGroups().getByResourceGroupWithResponse("demo", "demo1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupsGet_Failed.json
     */
    /**
     * Sample code: ContainerGroupsGet_Failed.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void containerGroupsGetFailed(
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containerGroups().getByResourceGroupWithResponse("demo", "demo1", com.azure.core.util.Context.NONE);
    }
}
```

### ContainerGroups_List

```java
/**
 * Samples for ContainerGroups List.
 */
public final class ContainerGroupsListSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupsList.json
     */
    /**
     * Sample code: ContainerGroupsList.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void
        containerGroupsList(com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containerGroups().list(com.azure.core.util.Context.NONE);
    }
}
```

### ContainerGroups_ListByResourceGroup

```java
/**
 * Samples for ContainerGroups ListByResourceGroup.
 */
public final class ContainerGroupsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupsListByResourceGroup.json
     */
    /**
     * Sample code: ContainerGroupsListByResourceGroup.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void containerGroupsListByResourceGroup(
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containerGroups().listByResourceGroup("demo", com.azure.core.util.Context.NONE);
    }
}
```

### ContainerGroups_Restart

```java
/**
 * Samples for ContainerGroups Restart.
 */
public final class ContainerGroupsRestartSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupsRestart.json
     */
    /**
     * Sample code: ContainerRestart.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void
        containerRestart(com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containerGroups().restart("demo", "demo1", com.azure.core.util.Context.NONE);
    }
}
```

### ContainerGroups_Start

```java
/**
 * Samples for ContainerGroups Start.
 */
public final class ContainerGroupsStartSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupsStart.json
     */
    /**
     * Sample code: ContainerStart.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void
        containerStart(com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containerGroups().start("demo", "demo1", com.azure.core.util.Context.NONE);
    }
}
```

### ContainerGroups_Stop

```java
/**
 * Samples for ContainerGroups Stop.
 */
public final class ContainerGroupsStopSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupsStop.json
     */
    /**
     * Sample code: ContainerStop.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void
        containerStop(com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containerGroups().stopWithResponse("demo", "demo1", com.azure.core.util.Context.NONE);
    }
}
```

### ContainerGroups_Update

```java
import com.azure.core.management.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ContainerGroups Update.
 */
public final class ContainerGroupsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupsUpdate.json
     */
    /**
     * Sample code: ContainerGroupsUpdate.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void
        containerGroupsUpdate(com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containerGroups()
            .updateWithResponse("demoResource", "demo1",
                new Resource().withTags(mapOf("tag1key", "fakeTokenPlaceholder", "tag2key", "fakeTokenPlaceholder")),
                com.azure.core.util.Context.NONE);
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

### Containers_Attach

```java
/**
 * Samples for Containers Attach.
 */
public final class ContainersAttachSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerAttach.json
     */
    /**
     * Sample code: ContainerAttach.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void
        containerAttach(com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containers().attachWithResponse("demo", "demo1", "container1", com.azure.core.util.Context.NONE);
    }
}
```

### Containers_ExecuteCommand

```java
import com.azure.resourcemanager.containerinstance.generated.models.ContainerExecRequest;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerExecRequestTerminalSize;

/**
 * Samples for Containers ExecuteCommand.
 */
public final class ContainersExecuteCommandSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerExec.json
     */
    /**
     * Sample code: ContainerExec.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void
        containerExec(com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containers()
            .executeCommandWithResponse("demo", "demo1", "container1",
                new ContainerExecRequest().withCommand("/bin/bash")
                    .withTerminalSize(new ContainerExecRequestTerminalSize().withRows(12).withCols(12)),
                com.azure.core.util.Context.NONE);
    }
}
```

### Containers_ListLogs

```java
/**
 * Samples for Containers ListLogs.
 */
public final class ContainersListLogsSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerListLogs.json
     */
    /**
     * Sample code: ContainerListLogs.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void
        containerListLogs(com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.containers()
            .listLogsWithResponse("demo", "demo1", "container1", 10, null, com.azure.core.util.Context.NONE);
    }
}
```

### Location_ListCachedImages

```java
/**
 * Samples for Location ListCachedImages.
 */
public final class LocationListCachedImagesSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * CachedImagesList.json
     */
    /**
     * Sample code: CachedImages.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void
        cachedImages(com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.locations().listCachedImages("westcentralus", com.azure.core.util.Context.NONE);
    }
}
```

### Location_ListCapabilities

```java
/**
 * Samples for Location ListCapabilities.
 */
public final class LocationListCapabilitiesSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * CapabilitiesList.json
     */
    /**
     * Sample code: GetCapabilities.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void
        getCapabilities(com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.locations().listCapabilities("westus", com.azure.core.util.Context.NONE);
    }
}
```

### Location_ListUsage

```java
/**
 * Samples for Location ListUsage.
 */
public final class LocationListUsageSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * ContainerGroupUsage.json
     */
    /**
     * Sample code: ContainerUsage.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void
        containerUsage(com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.locations().listUsage("westcentralus", com.azure.core.util.Context.NONE);
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
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * OperationsList.json
     */
    /**
     * Sample code: OperationsList.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void
        operationsList(com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### SubnetServiceAssociationLink_Delete

```java
/**
 * Samples for SubnetServiceAssociationLink Delete.
 */
public final class SubnetServiceAssociationLinkDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/preview/2024-11-01-preview/examples/
     * SubnetServiceAssociationLinkDelete.json
     */
    /**
     * Sample code: SubnetServiceAssociationLinkDelete.
     * 
     * @param manager Entry point to ContainerInstanceManager.
     */
    public static void subnetServiceAssociationLinkDelete(
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager) {
        manager.subnetServiceAssociationLinks().delete("demo", "demo2", "demo3", com.azure.core.util.Context.NONE);
    }
}
```

