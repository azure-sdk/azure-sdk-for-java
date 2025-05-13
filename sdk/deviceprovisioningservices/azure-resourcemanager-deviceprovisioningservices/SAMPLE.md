# Code snippets and samples


## DpsCertificate

- [CreateOrUpdate](#dpscertificate_createorupdate)
- [Delete](#dpscertificate_delete)
- [GenerateVerificationCode](#dpscertificate_generateverificationcode)
- [Get](#dpscertificate_get)
- [List](#dpscertificate_list)
- [VerifyCertificate](#dpscertificate_verifycertificate)

## IotDpsResource

- [CheckProvisioningServiceNameAvailability](#iotdpsresource_checkprovisioningservicenameavailability)
- [CreateOrUpdate](#iotdpsresource_createorupdate)
- [CreateOrUpdatePrivateEndpointConnection](#iotdpsresource_createorupdateprivateendpointconnection)
- [Delete](#iotdpsresource_delete)
- [DeletePrivateEndpointConnection](#iotdpsresource_deleteprivateendpointconnection)
- [GetByResourceGroup](#iotdpsresource_getbyresourcegroup)
- [GetOperationResult](#iotdpsresource_getoperationresult)
- [GetPrivateEndpointConnection](#iotdpsresource_getprivateendpointconnection)
- [GetPrivateLinkResources](#iotdpsresource_getprivatelinkresources)
- [List](#iotdpsresource_list)
- [ListByResourceGroup](#iotdpsresource_listbyresourcegroup)
- [ListKeys](#iotdpsresource_listkeys)
- [ListKeysForKeyName](#iotdpsresource_listkeysforkeyname)
- [ListPrivateEndpointConnections](#iotdpsresource_listprivateendpointconnections)
- [ListPrivateLinkResources](#iotdpsresource_listprivatelinkresources)
- [ListValidSkus](#iotdpsresource_listvalidskus)
- [Update](#iotdpsresource_update)

## Operations

- [List](#operations_list)
### DpsCertificate_CreateOrUpdate

```java
/**
 * Samples for IotDpsResource GetPrivateEndpointConnection.
 */
public final class IotDpsResourceGetPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSGetPrivateEndpointConnection.json
     */
    /**
     * Sample code: PrivateEndpointConnection_Get.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void
        privateEndpointConnectionGet(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .getPrivateEndpointConnectionWithResponse("myResourceGroup", null, "myPrivateEndpointConnection",
                com.azure.core.util.Context.NONE);
    }
}
```

### DpsCertificate_Delete

```java
/**
 * Samples for IotDpsResource ListByResourceGroup.
 */
public final class IotDpsResourceListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSListByResourceGroup.json
     */
    /**
     * Sample code: DPSListByResourceGroup.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void
        dPSListByResourceGroup(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### DpsCertificate_GenerateVerificationCode

```java
import com.azure.resourcemanager.deviceprovisioningservices.models.CertificateProperties;

/**
 * Samples for DpsCertificate CreateOrUpdate.
 */
public final class DpsCertificateCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSCertificateCreateOrUpdate.json
     */
    /**
     * Sample code: DPSCreateOrUpdateCertificate.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void
        dPSCreateOrUpdateCertificate(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.dpsCertificates()
            .define("cert")
            .withExistingProvisioningService("myResourceGroup", "myFirstProvisioningService")
            .withProperties(new CertificateProperties().withCertificate("MA==".getBytes()))
            .create();
    }
}
```

### DpsCertificate_Get

```java
/**
 * Samples for IotDpsResource GetPrivateLinkResources.
 */
public final class IotDpsResourceGetPrivateLinkResourcesSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSGetPrivateLinkResources.json
     */
    /**
     * Sample code: PrivateLinkResources_List.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void
        privateLinkResourcesList(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .getPrivateLinkResourcesWithResponse("myResourceGroup", null, "iotDps", com.azure.core.util.Context.NONE);
    }
}
```

### DpsCertificate_List

```java
/**
 * Samples for IotDpsResource ListPrivateLinkResources.
 */
public final class IotDpsResourceListPrivateLinkResourcesSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSListPrivateLinkResources.json
     */
    /**
     * Sample code: PrivateLinkResources_List.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void
        privateLinkResourcesList(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .listPrivateLinkResourcesWithResponse("myResourceGroup", null, com.azure.core.util.Context.NONE);
    }
}
```

### DpsCertificate_VerifyCertificate

```java

/**
 * Samples for DpsCertificate Delete.
 */
public final class DpsCertificateDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSDeleteCertificate.json
     */
    /**
     * Sample code: DPSDeleteCertificate.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void
        dPSDeleteCertificate(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.dpsCertificates()
            .deleteWithResponse("myResourceGroup", "myFirstProvisioningService", "cert", "AAAAAAAADGk=", null, null,
                null, null, null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_CheckProvisioningServiceNameAvailability

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSOperations.json
     */
    /**
     * Sample code: DPSOperations.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSOperations(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_CreateOrUpdate

```java

/**
 * Samples for DpsCertificate GenerateVerificationCode.
 */
public final class DpsCertificateGenerateVerificationCodeSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSGenerateVerificationCode.json
     */
    /**
     * Sample code: DPSGenerateVerificationCode.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void
        dPSGenerateVerificationCode(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.dpsCertificates()
            .generateVerificationCodeWithResponse("myResourceGroup", "myFirstProvisioningService", "cert",
                "AAAAAAAADGk=", null, null, null, null, null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_CreateOrUpdatePrivateEndpointConnection

```java
/**
 * Samples for IotDpsResource GetByResourceGroup.
 */
public final class IotDpsResourceGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSGet.json
     */
    /**
     * Sample code: DPSGet.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSGet(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .getByResourceGroupWithResponse("myResourceGroup", "myFirstProvisioningService",
                com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_Delete

```java
/**
 * Samples for IotDpsResource ListValidSkus.
 */
public final class IotDpsResourceListValidSkusSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSGetValidSku.json
     */
    /**
     * Sample code: DPSGetValidSku.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSGetValidSku(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .listValidSkus("myResourceGroup", "myFirstProvisioningService", com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_DeletePrivateEndpointConnection

```java
import com.azure.resourcemanager.deviceprovisioningservices.models.VerificationCodeRequest;

/**
 * Samples for DpsCertificate VerifyCertificate.
 */
public final class DpsCertificateVerifyCertificateSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSVerifyCertificate.json
     */
    /**
     * Sample code: DPSVerifyCertificate.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void
        dPSVerifyCertificate(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.dpsCertificates()
            .verifyCertificateWithResponse("myResourceGroup", "myFirstProvisioningService", "cert", "AAAAAAAADGk=",
                new VerificationCodeRequest().withCertificate("#####################################"), null, null,
                null, null, null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_GetByResourceGroup

```java
/**
 * Samples for IotDpsResource ListKeys.
 */
public final class IotDpsResourceListKeysSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSListKeys.json
     */
    /**
     * Sample code: DPSListKeys.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSListKeys(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .listKeys("myResourceGroup", "myFirstProvisioningService", com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_GetOperationResult

```java
/**
 * Samples for IotDpsResource DeletePrivateEndpointConnection.
 */
public final class IotDpsResourceDeletePrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSDeletePrivateEndpointConnection.json
     */
    /**
     * Sample code: PrivateEndpointConnection_Delete.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void
        privateEndpointConnectionDelete(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .deletePrivateEndpointConnection("myResourceGroup", null, "myPrivateEndpointConnection",
                com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_GetPrivateEndpointConnection

```java
/**
 * Samples for DpsCertificate Get.
 */
public final class DpsCertificateGetSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSGetCertificate.json
     */
    /**
     * Sample code: DPSGetCertificate.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSGetCertificate(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.dpsCertificates()
            .getWithResponse("myResourceGroup", "myFirstProvisioningService", "cert", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_GetPrivateLinkResources

```java
/**
 * Samples for IotDpsResource GetOperationResult.
 */
public final class IotDpsResourceGetOperationResultSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSGetOperationResult.json
     */
    /**
     * Sample code: DPSGetOperationResult.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void
        dPSGetOperationResult(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .getOperationResultWithResponse("myResourceGroup", "myFirstProvisioningService",
                "MTY5OTNmZDctODI5Yy00N2E2LTkxNDQtMDU1NGIyYzY1ZjRl", "1508265712453", com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_List

```java
/**
 * Samples for IotDpsResource ListKeysForKeyName.
 */
public final class IotDpsResourceListKeysForKeyNameSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSGetKey.json
     */
    /**
     * Sample code: DPSGetKey.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSGetKey(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .listKeysForKeyNameWithResponse("myResourceGroup", "myFirstProvisioningService", "testKey",
                com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_ListByResourceGroup

```java
import com.azure.resourcemanager.deviceprovisioningservices.models.IotDpsPropertiesDescription;
import com.azure.resourcemanager.deviceprovisioningservices.models.IotDpsSku;
import com.azure.resourcemanager.deviceprovisioningservices.models.IotDpsSkuInfo;
import com.azure.resourcemanager.deviceprovisioningservices.models.ManagedServiceIdentity;
import com.azure.resourcemanager.deviceprovisioningservices.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.deviceprovisioningservices.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for IotDpsResource CreateOrUpdate.
 */
public final class IotDpsResourceCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSUpdate.json
     */
    /**
     * Sample code: DPSUpdate.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSUpdate(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .define("myFirstProvisioningService")
            .withRegion("East US")
            .withExistingResourceGroup("myResourceGroup")
            .withProperties(new IotDpsPropertiesDescription().withEnableDataResidency(false))
            .withSku(new IotDpsSkuInfo().withName(IotDpsSku.S1).withCapacity(1L))
            .withTags(mapOf())
            .withIdentity(new ManagedServiceIdentity()
                .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/91d12660-3dec-467a-be2a-213b5544ddc0/resourcegroups/testrg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/testidentity",
                    new UserAssignedIdentity())))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSCreate.json
     */
    /**
     * Sample code: DPSCreate.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSCreate(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .define("myFirstProvisioningService")
            .withRegion("East US")
            .withExistingResourceGroup("myResourceGroup")
            .withProperties(new IotDpsPropertiesDescription().withEnableDataResidency(false))
            .withSku(new IotDpsSkuInfo().withName(IotDpsSku.S1).withCapacity(1L))
            .withTags(mapOf())
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

### IotDpsResource_ListKeys

```java
import com.azure.resourcemanager.deviceprovisioningservices.models.OperationInputs;

/**
 * Samples for IotDpsResource CheckProvisioningServiceNameAvailability.
 */
public final class IotDpsResourceCheckProvisioningServiceNameAvailabilit {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSCheckNameAvailability.json
     */
    /**
     * Sample code: DPSCheckName.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSCheckName(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .checkProvisioningServiceNameAvailabilityWithResponse(new OperationInputs().withName("test213123"),
                com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_ListKeysForKeyName

```java
/**
 * Samples for IotDpsResource List.
 */
public final class IotDpsResourceListSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSListBySubscription.json
     */
    /**
     * Sample code: DPSListBySubscription.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void
        dPSListBySubscription(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources().list(com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_ListPrivateEndpointConnections

```java
import com.azure.resourcemanager.deviceprovisioningservices.models.ProvisioningServiceDescription;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for IotDpsResource Update.
 */
public final class IotDpsResourceUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSPatch.json
     */
    /**
     * Sample code: DPSPatch.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSPatch(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        ProvisioningServiceDescription resource = manager.iotDpsResources()
            .getByResourceGroupWithResponse("myResourceGroup", "myFirstProvisioningService",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("foo", "bar")).apply();
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

### IotDpsResource_ListPrivateLinkResources

```java
import com.azure.resourcemanager.deviceprovisioningservices.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.deviceprovisioningservices.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.deviceprovisioningservices.models.PrivateLinkServiceConnectionStatus;

/**
 * Samples for IotDpsResource CreateOrUpdatePrivateEndpointConnection.
 */
public final class IotDpsResourceCreateOrUpdatePrivateEndpointConnection {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSCreateOrUpdatePrivateEndpointConnection.json
     */
    /**
     * Sample code: PrivateEndpointConnection_CreateOrUpdate.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void privateEndpointConnectionCreateOrUpdate(
        com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .definePrivateEndpointConnection("myPrivateEndpointConnection")
            .withExistingProvisioningService("myResourceGroup", null)
            .withProperties(new PrivateEndpointConnectionProperties().withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState().withStatus(PrivateLinkServiceConnectionStatus.APPROVED)
                    .withDescription("Approved by johndoe@contoso.com")))
            .create();
    }
}
```

### IotDpsResource_ListValidSkus

```java
/**
 * Samples for DpsCertificate List.
 */
public final class DpsCertificateListSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSGetCertificates.json
     */
    /**
     * Sample code: DPSGetCertificates.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSGetCertificates(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.dpsCertificates()
            .listWithResponse("myResourceGroup", "myFirstProvisioningService", com.azure.core.util.Context.NONE);
    }
}
```

### IotDpsResource_Update

```java
/**
 * Samples for IotDpsResource Delete.
 */
public final class IotDpsResourceDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSDelete.json
     */
    /**
     * Sample code: DPSDelete.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSDelete(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .delete("myResourceGroup", "myFirstProvisioningService", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for IotDpsResource ListPrivateEndpointConnections.
 */
public final class IotDpsResourceListPrivateEndpointConnectionsSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/preview/2025-02-01-preview/examples/
     * DPSListPrivateEndpointConnections.json
     */
    /**
     * Sample code: PrivateEndpointConnections_List.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void
        privateEndpointConnectionsList(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .listPrivateEndpointConnectionsWithResponse("myResourceGroup", null, com.azure.core.util.Context.NONE);
    }
}
```

