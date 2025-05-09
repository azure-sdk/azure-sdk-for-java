# Code snippets and samples


## CloudHsmClusters

- [Backup](#cloudhsmclusters_backup)
- [CloudHsmClusterBackupStatusGet](#cloudhsmclusters_cloudhsmclusterbackupstatusget)
- [CloudHsmClusterRestoreStatusGet](#cloudhsmclusters_cloudhsmclusterrestorestatusget)
- [CreateOrUpdate](#cloudhsmclusters_createorupdate)
- [Delete](#cloudhsmclusters_delete)
- [GetByResourceGroup](#cloudhsmclusters_getbyresourcegroup)
- [List](#cloudhsmclusters_list)
- [ListByCloudHsmCluster](#cloudhsmclusters_listbycloudhsmcluster)
- [ListByResourceGroup](#cloudhsmclusters_listbyresourcegroup)
- [Restore](#cloudhsmclusters_restore)
- [Update](#cloudhsmclusters_update)
- [ValidateBackupProperties](#cloudhsmclusters_validatebackupproperties)
- [ValidateRestoreProperties](#cloudhsmclusters_validaterestoreproperties)

## DedicatedHsms

- [CreateOrUpdate](#dedicatedhsms_createorupdate)
- [Delete](#dedicatedhsms_delete)
- [GetByResourceGroup](#dedicatedhsms_getbyresourcegroup)
- [List](#dedicatedhsms_list)
- [ListByResourceGroup](#dedicatedhsms_listbyresourcegroup)
- [ListOutboundNetworkDependenciesEndpoints](#dedicatedhsms_listoutboundnetworkdependenciesendpoints)
- [Update](#dedicatedhsms_update)

## Operations

- [List](#operations_list)

## PrivateEndpointConnections

- [Create](#privateendpointconnections_create)
- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [ListByCloudHsmCluster](#privateendpointconnections_listbycloudhsmcluster)
### CloudHsmClusters_Backup

```java
/**
 * Samples for PrivateEndpointConnections Get.
 */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmClusterPrivateEndpointConnection_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmClusterPrivateEndpointConnection_Get_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterPrivateEndpointConnectionGetMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.privateEndpointConnections()
            .getWithResponse("rgcloudhsm", "chsm1", "sample-pec", com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_CloudHsmClusterBackupStatusGet

```java
import com.azure.resourcemanager.hardwaresecuritymodules.models.BackupRequestProperties;

/**
 * Samples for CloudHsmClusters ValidateBackupProperties.
 */
public final class CloudHsmClustersValidateBackupPropertiesSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmCluster_CreateOrValidate_Backup_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_ValidateBackup_Validation_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterValidateBackupValidationMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.cloudHsmClusters()
            .validateBackupProperties("rgcloudhsm", "chsm1",
                new BackupRequestProperties()
                    .withAzureStorageBlobContainerUri(
                        "https://myaccount.blob.core.windows.net/sascontainer/sasContainer")
                    .withToken("fakeTokenPlaceholder"),
                com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_CloudHsmClusterRestoreStatusGet

```java
/**
 * Samples for CloudHsmClusters ListByCloudHsmCluster.
 */
public final class CloudHsmClustersListByCloudHsmClusterSamples {
    /*
     * x-ms-original-file:
     * 2024-06-30-preview/CloudHsmClusterPrivateLinkResource_ListByCloudHsmCluster_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmClusterPrivateLinkResources_ListByResource_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterPrivateLinkResourcesListByResourceMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.cloudHsmClusters().listByCloudHsmCluster("rgcloudhsm", "chsm1", com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_CreateOrUpdate

```java
/**
 * Samples for CloudHsmClusters Delete.
 */
public final class CloudHsmClustersDeleteSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmCluster_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_Delete_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterDeleteMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.cloudHsmClusters().delete("rgcloudhsm", "chsm1", com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_Delete

```java
/**
 * Samples for PrivateEndpointConnections Delete.
 */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmClusterPrivateEndpointConnection_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmClusterPrivateEndpointConnection_Delete_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterPrivateEndpointConnectionDeleteMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.privateEndpointConnections()
            .delete("rgcloudhsm", "chsm1", "sample-pec", com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_GetByResourceGroup

```java
import com.azure.resourcemanager.hardwaresecuritymodules.models.DedicatedHsm;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DedicatedHsms Update.
 */
public final class DedicatedHsmsUpdateSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/DedicatedHsm_Update.json
     */
    /**
     * Sample code: Update an existing dedicated HSM.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void updateAnExistingDedicatedHSM(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        DedicatedHsm resource = manager.dedicatedHsms()
            .getByResourceGroupWithResponse("hsm-group", "hsm1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("Dept", "hsm", "Environment", "dogfood", "Slice", "A")).apply();
    }

    /*
     * x-ms-original-file: 2024-06-30-preview/PaymentHsm_Update.json
     */
    /**
     * Sample code: Update an existing payment HSM.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void updateAnExistingPaymentHSM(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        DedicatedHsm resource = manager.dedicatedHsms()
            .getByResourceGroupWithResponse("hsm-group", "hsm1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("Dept", "hsm", "Environment", "dogfood", "Slice", "A")).apply();
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

### CloudHsmClusters_List

```java
/**
 * Samples for CloudHsmClusters List.
 */
public final class CloudHsmClustersListSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmCluster_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_ListBySubscription_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterListBySubscriptionMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.cloudHsmClusters().list(null, com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_ListByCloudHsmCluster

```java
/**
 * Samples for CloudHsmClusters CloudHsmClusterBackupStatusGet.
 */
public final class CloudHsmClustersCloudHsmClusterBackupStatusGetSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmCluster_Backup_Pending_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_Get_Backup_Status_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterGetBackupStatusMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.cloudHsmClusters()
            .cloudHsmClusterBackupStatusGetWithResponse("rgcloudhsm", "chsm1", "572a45927fc240e1ac075de27371680b",
                com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_ListByResourceGroup

```java
/**
 * Samples for CloudHsmClusters ListByResourceGroup.
 */
public final class CloudHsmClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmCluster_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_ListByResourceGroup_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.cloudHsmClusters().listByResourceGroup("rgcloudhsm", null, com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_Restore

```java
import com.azure.resourcemanager.hardwaresecuritymodules.models.ApiEntityReference;
import com.azure.resourcemanager.hardwaresecuritymodules.models.NetworkInterface;
import com.azure.resourcemanager.hardwaresecuritymodules.models.NetworkProfile;
import com.azure.resourcemanager.hardwaresecuritymodules.models.Sku;
import com.azure.resourcemanager.hardwaresecuritymodules.models.SkuName;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DedicatedHsms CreateOrUpdate.
 */
public final class DedicatedHsmsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/PaymentHsm_CreateOrUpdate_WithManagementProfile.json
     */
    /**
     * Sample code: Create a new or update an existing payment HSM with management profile.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void createANewOrUpdateAnExistingPaymentHSMWithManagementProfile(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.dedicatedHsms()
            .define("hsm1")
            .withRegion("westus")
            .withExistingResourceGroup("hsm-group")
            .withSku(new Sku().withName(SkuName.PAY_SHIELD10K_LMK1_CPS60))
            .withTags(mapOf("Dept", "hsm", "Environment", "dogfood"))
            .withNetworkProfile(new NetworkProfile().withSubnet(new ApiEntityReference().withResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/hsm-group/providers/Microsoft.Network/virtualNetworks/stamp01/subnets/stamp01"))
                .withNetworkInterfaces(Arrays.asList(new NetworkInterface().withPrivateIpAddress("1.0.0.1"))))
            .withManagementNetworkProfile(new NetworkProfile().withSubnet(new ApiEntityReference().withResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/hsm-group/providers/Microsoft.Network/virtualNetworks/stamp01/subnets/stamp01"))
                .withNetworkInterfaces(Arrays.asList(new NetworkInterface().withPrivateIpAddress("1.0.0.2"))))
            .withStampId("stamp01")
            .create();
    }

    /*
     * x-ms-original-file: 2024-06-30-preview/DedicatedHsm_CreateOrUpdate.json
     */
    /**
     * Sample code: Create a new or update an existing dedicated HSM.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void createANewOrUpdateAnExistingDedicatedHSM(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.dedicatedHsms()
            .define("hsm1")
            .withRegion("westus")
            .withExistingResourceGroup("hsm-group")
            .withSku(new Sku().withName(SkuName.SAFE_NET_LUNA_NETWORK_HSM_A790))
            .withTags(mapOf("Dept", "hsm", "Environment", "dogfood"))
            .withNetworkProfile(new NetworkProfile().withSubnet(new ApiEntityReference().withResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/hsm-group/providers/Microsoft.Network/virtualNetworks/stamp01/subnets/stamp01"))
                .withNetworkInterfaces(Arrays.asList(new NetworkInterface().withPrivateIpAddress("1.0.0.1"))))
            .withStampId("stamp01")
            .create();
    }

    /*
     * x-ms-original-file: 2024-06-30-preview/PaymentHsm_CreateOrUpdate.json
     */
    /**
     * Sample code: Create a new or update an existing payment HSM.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void createANewOrUpdateAnExistingPaymentHSM(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.dedicatedHsms()
            .define("hsm1")
            .withRegion("westus")
            .withExistingResourceGroup("hsm-group")
            .withSku(new Sku().withName(SkuName.PAY_SHIELD10K_LMK1_CPS60))
            .withTags(mapOf("Dept", "hsm", "Environment", "dogfood"))
            .withNetworkProfile(new NetworkProfile().withSubnet(new ApiEntityReference().withResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/hsm-group/providers/Microsoft.Network/virtualNetworks/stamp01/subnets/stamp01"))
                .withNetworkInterfaces(Arrays.asList(new NetworkInterface().withPrivateIpAddress("1.0.0.1"))))
            .withStampId("stamp01")
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

### CloudHsmClusters_Update

```java
/**
 * Samples for CloudHsmClusters CloudHsmClusterRestoreStatusGet.
 */
public final class CloudHsmClustersCloudHsmClusterRestoreStatusGetSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmCluster_Restore_Pending_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_Get_Restore_Status_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterGetRestoreStatusMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.cloudHsmClusters()
            .cloudHsmClusterRestoreStatusGetWithResponse("rgcloudhsm", "chsm1", "572a45927fc240e1ac075de27371680b",
                com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_ValidateBackupProperties

```java
/**
 * Samples for DedicatedHsms List.
 */
public final class DedicatedHsmsListSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/PaymentHsm_ListBySubscription.json
     */
    /**
     * Sample code: List dedicated HSM devices in a subscription including payment HSM.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void listDedicatedHSMDevicesInASubscriptionIncludingPaymentHSM(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.dedicatedHsms().list(null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-06-30-preview/DedicatedHsm_ListBySubscription.json
     */
    /**
     * Sample code: List dedicated HSM devices in a subscription.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void listDedicatedHSMDevicesInASubscription(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.dedicatedHsms().list(null, com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_ValidateRestoreProperties

```java
import com.azure.resourcemanager.hardwaresecuritymodules.models.RestoreRequestProperties;

/**
 * Samples for CloudHsmClusters Restore.
 */
public final class CloudHsmClustersRestoreSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmCluster_RequestOrValidate_Restore_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_Restore_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterRestoreMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.cloudHsmClusters()
            .restore("rgcloudhsm", "chsm1",
                new RestoreRequestProperties()
                    .withAzureStorageBlobContainerUri(
                        "https://myaccount.blob.core.windows.net/sascontainer/sasContainer")
                    .withBackupId("backupId"),
                com.azure.core.util.Context.NONE);
    }
}
```

### DedicatedHsms_CreateOrUpdate

```java
import com.azure.resourcemanager.hardwaresecuritymodules.models.BackupRequestProperties;

/**
 * Samples for CloudHsmClusters Backup.
 */
public final class CloudHsmClustersBackupSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmCluster_Create_Backup_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_Create_Backup_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterCreateBackupMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.cloudHsmClusters()
            .backup("rgcloudhsm", "chsm1",
                new BackupRequestProperties()
                    .withAzureStorageBlobContainerUri(
                        "https://myaccount.blob.core.windows.net/sascontainer/sasContainer")
                    .withToken("fakeTokenPlaceholder"),
                com.azure.core.util.Context.NONE);
    }
}
```

### DedicatedHsms_Delete

```java
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmCluster;
import com.azure.resourcemanager.hardwaresecuritymodules.models.ManagedServiceIdentity;
import com.azure.resourcemanager.hardwaresecuritymodules.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.hardwaresecuritymodules.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for CloudHsmClusters Update.
 */
public final class CloudHsmClustersUpdateSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmCluster_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_Update_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterUpdateMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        CloudHsmCluster resource = manager.cloudHsmClusters()
            .getByResourceGroupWithResponse("rgcloudhsm", "chsm1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("Dept", "hsm", "Environment", "dogfood", "Slice", "A"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/contoso-resources/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity-1",
                    new UserAssignedIdentity())))
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

### DedicatedHsms_GetByResourceGroup

```java
/**
 * Samples for DedicatedHsms Delete.
 */
public final class DedicatedHsmsDeleteSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/DedicatedHsm_Delete.json
     */
    /**
     * Sample code: Delete a dedicated HSM.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void
        deleteADedicatedHSM(com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.dedicatedHsms().delete("hsm-group", "hsm1", com.azure.core.util.Context.NONE);
    }
}
```

### DedicatedHsms_List

```java
/**
 * Samples for CloudHsmClusters GetByResourceGroup.
 */
public final class CloudHsmClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmCluster_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_Get_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterGetMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.cloudHsmClusters()
            .getByResourceGroupWithResponse("rgcloudhsm", "chsm1", com.azure.core.util.Context.NONE);
    }
}
```

### DedicatedHsms_ListByResourceGroup

```java
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateLinkServiceConnectionState;

/**
 * Samples for PrivateEndpointConnections Create.
 */
public final class PrivateEndpointConnectionsCreateSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmClusterPrivateEndpointConnection_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmClusterPrivateEndpointConnection_Create_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterPrivateEndpointConnectionCreateMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.privateEndpointConnections()
            .define("sample-pec")
            .withExistingCloudHsmCluster("rgcloudhsm", "chsm1")
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                    .withDescription("My name is Joe and I'm approving this."))
            .create();
    }
}
```

### DedicatedHsms_ListOutboundNetworkDependenciesEndpoints

```java
import com.azure.resourcemanager.hardwaresecuritymodules.models.RestoreRequestProperties;

/**
 * Samples for CloudHsmClusters ValidateRestoreProperties.
 */
public final class CloudHsmClustersValidateRestorePropertiesSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmCluster_RequestOrValidate_Restore_Properties_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_ValidateRestore_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterValidateRestoreMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.cloudHsmClusters()
            .validateRestoreProperties("rgcloudhsm", "chsm1",
                new RestoreRequestProperties()
                    .withAzureStorageBlobContainerUri(
                        "https://myaccount.blob.core.windows.net/sascontainer/sasContainer")
                    .withBackupId("backupId"),
                com.azure.core.util.Context.NONE);
    }
}
```

### DedicatedHsms_Update

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/OperationsList.json
     */
    /**
     * Sample code: Get a list of Payment HSM operations.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void getAListOfPaymentHSMOperations(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for DedicatedHsms ListByResourceGroup.
 */
public final class DedicatedHsmsListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/DedicatedHsm_ListByResourceGroup.json
     */
    /**
     * Sample code: List dedicated HSM devices in a resource group.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void listDedicatedHSMDevicesInAResourceGroup(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.dedicatedHsms().listByResourceGroup("hsm-group", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-06-30-preview/PaymentHsm_ListByResourceGroup.json
     */
    /**
     * Sample code: List dedicated HSM devices in a resource group including payment HSM.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void listDedicatedHSMDevicesInAResourceGroupIncludingPaymentHSM(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.dedicatedHsms().listByResourceGroup("hsm-group", null, com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Create

```java
/**
 * Samples for DedicatedHsms GetByResourceGroup.
 */
public final class DedicatedHsmsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/PaymentHsm_Get.json
     */
    /**
     * Sample code: Get a payment HSM.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void
        getAPaymentHSM(com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.dedicatedHsms().getByResourceGroupWithResponse("hsm-group", "hsm1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-06-30-preview/PaymentHsm_Get_With_2018-10-31Preview_Version.json
     */
    /**
     * Sample code: Get a payment HSM with 2018-10-31Preview api version.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void getAPaymentHSMWith20181031PreviewApiVersion(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.dedicatedHsms().getByResourceGroupWithResponse("hsm-group", "hsm1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-06-30-preview/DedicatedHsm_Get.json
     */
    /**
     * Sample code: Get a dedicated HSM.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void
        getADedicatedHSM(com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.dedicatedHsms().getByResourceGroupWithResponse("hsm-group", "hsm1", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Delete

```java
/**
 * Samples for PrivateEndpointConnections ListByCloudHsmCluster.
 */
public final class PrivateEndpointConnectionsListByCloudHsmClusterSamples {
    /*
     * x-ms-original-file:
     * 2024-06-30-preview/CloudHsmClusterPrivateEndpointConnection_ListByCloudHsmCluster_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmClusterPrivateEndpointConnection_ListByResource_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterPrivateEndpointConnectionListByResourceMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.privateEndpointConnections()
            .listByCloudHsmCluster("rgcloudhsm", "chsm1", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSku;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSkuFamily;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSkuName;
import com.azure.resourcemanager.hardwaresecuritymodules.models.ManagedServiceIdentity;
import com.azure.resourcemanager.hardwaresecuritymodules.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PublicNetworkAccess;
import com.azure.resourcemanager.hardwaresecuritymodules.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for CloudHsmClusters CreateOrUpdate.
 */
public final class CloudHsmClustersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/CloudHsmCluster_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_CreateOrUpdate_MaximumSet_Gen.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void cloudHsmClusterCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.cloudHsmClusters()
            .define("chsm1")
            .withRegion("eastus2")
            .withExistingResourceGroup("rgcloudhsm")
            .withTags(mapOf("Dept", "hsm", "Environment", "dogfood"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/contoso-resources/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity-1",
                    new UserAssignedIdentity())))
            .withSku(new CloudHsmClusterSku().withFamily(CloudHsmClusterSkuFamily.B)
                .withName(CloudHsmClusterSkuName.STANDARD_B1))
            .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
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

### PrivateEndpointConnections_ListByCloudHsmCluster

```java
/**
 * Samples for DedicatedHsms ListOutboundNetworkDependenciesEndpoints.
 */
public final class DedicatedHsmsListOutboundNetworkDependenciesEndpointsSamples {
    /*
     * x-ms-original-file: 2024-06-30-preview/GetOutboundNetworkDependenciesEndpointsList.json
     */
    /**
     * Sample code: List OutboundNetworkDependenciesEndpoints by Managed Cluster.
     * 
     * @param manager Entry point to HardwaresecuritymodulesManager.
     */
    public static void listOutboundNetworkDependenciesEndpointsByManagedCluster(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwaresecuritymodulesManager manager) {
        manager.dedicatedHsms()
            .listOutboundNetworkDependenciesEndpoints("hsm-group", "hsm1", com.azure.core.util.Context.NONE);
    }
}
```

