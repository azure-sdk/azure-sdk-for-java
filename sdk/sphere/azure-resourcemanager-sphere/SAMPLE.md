# Code snippets and samples


## Catalogs

- [CountDevices](#catalogs_countdevices)
- [CreateOrUpdate](#catalogs_createorupdate)
- [Delete](#catalogs_delete)
- [GetByResourceGroup](#catalogs_getbyresourcegroup)
- [List](#catalogs_list)
- [ListByResourceGroup](#catalogs_listbyresourcegroup)
- [ListDeployments](#catalogs_listdeployments)
- [ListDeviceGroups](#catalogs_listdevicegroups)
- [ListDeviceInsights](#catalogs_listdeviceinsights)
- [ListDevices](#catalogs_listdevices)
- [Update](#catalogs_update)
- [UploadImage](#catalogs_uploadimage)

## Certificates

- [Get](#certificates_get)
- [ListByCatalog](#certificates_listbycatalog)
- [RetrieveCertChain](#certificates_retrievecertchain)
- [RetrieveProofOfPossessionNonce](#certificates_retrieveproofofpossessionnonce)

## Deployments

- [CreateOrUpdate](#deployments_createorupdate)
- [Delete](#deployments_delete)
- [Get](#deployments_get)
- [ListByDeviceGroup](#deployments_listbydevicegroup)

## DeviceGroups

- [ClaimDevices](#devicegroups_claimdevices)
- [CountDevices](#devicegroups_countdevices)
- [CreateOrUpdate](#devicegroups_createorupdate)
- [Delete](#devicegroups_delete)
- [Get](#devicegroups_get)
- [ListByProduct](#devicegroups_listbyproduct)
- [Update](#devicegroups_update)

## Devices

- [CreateOrUpdate](#devices_createorupdate)
- [Delete](#devices_delete)
- [GenerateCapabilityImage](#devices_generatecapabilityimage)
- [Get](#devices_get)
- [ListByDeviceGroup](#devices_listbydevicegroup)
- [Update](#devices_update)

## Images

- [CreateOrUpdate](#images_createorupdate)
- [Delete](#images_delete)
- [Get](#images_get)
- [ListByCatalog](#images_listbycatalog)

## Operations

- [List](#operations_list)

## Products

- [CountDevices](#products_countdevices)
- [CreateOrUpdate](#products_createorupdate)
- [Delete](#products_delete)
- [GenerateDefaultDeviceGroups](#products_generatedefaultdevicegroups)
- [Get](#products_get)
- [ListByCatalog](#products_listbycatalog)
- [Update](#products_update)
### Catalogs_CountDevices

```java
/**
 * Samples for Catalogs CountDevices.
 */
public final class CatalogsCountDevicesSamples {
    /**
     * Sample code: Catalogs_CountDevices.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsCountDevices(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs().countDevicesWithResponse("MyResourceGroup1", "MyCatalog1", com.azure.core.util.Context.NONE);
    }
}
```

### Catalogs_CreateOrUpdate

```java
/**
 * Samples for Catalogs CreateOrUpdate.
 */
public final class CatalogsCreateOrUpdateSamples {
    /**
     * Sample code: Catalogs_CreateOrUpdate.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsCreateOrUpdate(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs()
            .define("MyCatalog1")
            .withRegion("global")
            .withExistingResourceGroup("MyResourceGroup1")
            .create();
    }
}
```

### Catalogs_Delete

```java
/**
 * Samples for Catalogs Delete.
 */
public final class CatalogsDeleteSamples {
    /**
     * Sample code: Catalogs_Delete.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsDelete(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs().delete("MyResourceGroup1", "MyCatalog1", com.azure.core.util.Context.NONE);
    }
}
```

### Catalogs_GetByResourceGroup

```java
/**
 * Samples for Catalogs GetByResourceGroup.
 */
public final class CatalogsGetByResourceGroupSamples {
    /**
     * Sample code: Catalogs_Get.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsGet(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs()
            .getByResourceGroupWithResponse("MyResourceGroup1", "MyCatalog1", com.azure.core.util.Context.NONE);
    }
}
```

### Catalogs_List

```java
/**
 * Samples for Catalogs List.
 */
public final class CatalogsListSamples {
    /**
     * Sample code: Catalogs_ListBySubscription.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsListBySubscription(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs().list(com.azure.core.util.Context.NONE);
    }
}
```

### Catalogs_ListByResourceGroup

```java
/**
 * Samples for Catalogs ListByResourceGroup.
 */
public final class CatalogsListByResourceGroupSamples {
    /**
     * Sample code: Catalogs_ListByResourceGroup.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsListByResourceGroup(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs().listByResourceGroup("MyResourceGroup1", com.azure.core.util.Context.NONE);
    }
}
```

### Catalogs_ListDeployments

```java
/**
 * Samples for Catalogs ListDeployments.
 */
public final class CatalogsListDeploymentsSamples {
    /**
     * Sample code: Catalogs_ListDeployments.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsListDeployments(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs()
            .listDeployments("MyResourceGroup1", "MyCatalog1", null, null, null, null,
                com.azure.core.util.Context.NONE);
    }
}
```

### Catalogs_ListDeviceGroups

```java

/**
 * Samples for Catalogs ListDeviceGroups.
 */
public final class CatalogsListDeviceGroupsSamples {
    /**
     * Sample code: Catalogs_ListDeviceGroups.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsListDeviceGroups(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs()
            .listDeviceGroups("MyResourceGroup1", "MyCatalog1", null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }
}
```

### Catalogs_ListDeviceInsights

```java
/**
 * Samples for Catalogs ListDeviceInsights.
 */
public final class CatalogsListDeviceInsightsSamples {
    /**
     * Sample code: Catalogs_ListDeviceInsights.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsListDeviceInsights(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs()
            .listDeviceInsights("MyResourceGroup1", "MyCatalog1", null, 10, null, null,
                com.azure.core.util.Context.NONE);
    }
}
```

### Catalogs_ListDevices

```java
/**
 * Samples for Catalogs ListDevices.
 */
public final class CatalogsListDevicesSamples {
    /**
     * Sample code: Catalogs_ListDevices.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsListDevices(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs()
            .listDevices("MyResourceGroup1", "MyCatalog1", null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Catalogs_Update

```java
import com.azure.resourcemanager.sphere.models.Catalog;

/**
 * Samples for Catalogs Update.
 */
public final class CatalogsUpdateSamples {
    /**
     * Sample code: Catalogs_Update.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsUpdate(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        Catalog resource = manager.catalogs()
            .getByResourceGroupWithResponse("MyResourceGroup1", "MyCatalog1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### Catalogs_UploadImage

```java

/**
 * Samples for Catalogs UploadImage.
 */
public final class CatalogsUploadImageSamples {
    /**
     * Sample code: Catalogs_UploadImage.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsUploadImage(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs().uploadImage("MyResourceGroup1", "MyCatalog1", null, com.azure.core.util.Context.NONE);
    }
}
```

### Certificates_Get

```java
/**
 * Samples for Certificates Get.
 */
public final class CertificatesGetSamples {
    /**
     * Sample code: Certificates_Get.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void certificatesGet(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.certificates()
            .getWithResponse("MyResourceGroup1", "MyCatalog1", "default", com.azure.core.util.Context.NONE);
    }
}
```

### Certificates_ListByCatalog

```java
/**
 * Samples for Certificates ListByCatalog.
 */
public final class CertificatesListByCatalogSamples {
    /**
     * Sample code: Certificates_ListByCatalog.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void certificatesListByCatalog(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.certificates()
            .listByCatalog("MyResourceGroup1", "MyCatalog1", null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Certificates_RetrieveCertChain

```java
/**
 * Samples for Certificates RetrieveCertChain.
 */
public final class CertificatesRetrieveCertChainSamples {
    /**
     * Sample code: Certificates_RetrieveCertChain.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void certificatesRetrieveCertChain(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.certificates()
            .retrieveCertChainWithResponse("MyResourceGroup1", "MyCatalog1", "active",
                com.azure.core.util.Context.NONE);
    }
}
```

### Certificates_RetrieveProofOfPossessionNonce

```java

/**
 * Samples for Certificates RetrieveProofOfPossessionNonce.
 */
public final class CertificatesRetrieveProofOfPossessionNonceSamples {
    /**
     * Sample code: Certificates_RetrieveProofOfPossessionNonce.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void
        certificatesRetrieveProofOfPossessionNonce(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.certificates()
            .retrieveProofOfPossessionNonceWithResponse("MyResourceGroup1", "MyCatalog1", "active", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_CreateOrUpdate

```java
/**
 * Samples for Deployments CreateOrUpdate.
 */
public final class DeploymentsCreateOrUpdateSamples {
    /**
     * Sample code: Deployments_CreateOrUpdate.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void deploymentsCreateOrUpdate(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.deployments()
            .define("MyDeployment1")
            .withExistingDeviceGroup("MyResourceGroup1", "MyCatalog1", "MyProduct1", "myDeviceGroup1")
            .create();
    }
}
```

### Deployments_Delete

```java
/**
 * Samples for Deployments Delete.
 */
public final class DeploymentsDeleteSamples {
    /**
     * Sample code: Deployments_Delete.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void deploymentsDelete(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.deployments()
            .delete("MyResourceGroup1", "MyCatalog1", "MyProductName1", "DeviceGroupName1", "MyDeploymentName1",
                com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_Get

```java
/**
 * Samples for Deployments Get.
 */
public final class DeploymentsGetSamples {
    /**
     * Sample code: Deployments_Get.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void deploymentsGet(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.deployments()
            .getWithResponse("MyResourceGroup1", "MyCatalog1", "MyProduct1", "myDeviceGroup1", "MyDeployment1",
                com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_ListByDeviceGroup

```java
/**
 * Samples for Deployments ListByDeviceGroup.
 */
public final class DeploymentsListByDeviceGroupSamples {
    /**
     * Sample code: Deployments_ListByDeviceGroup.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void deploymentsListByDeviceGroup(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.deployments()
            .listByDeviceGroup("MyResourceGroup1", "MyCatalog1", "MyProduct1", "myDeviceGroup1", null, null, null, null,
                com.azure.core.util.Context.NONE);
    }
}
```

### DeviceGroups_ClaimDevices

```java

/**
 * Samples for DeviceGroups ClaimDevices.
 */
public final class DeviceGroupsClaimDevicesSamples {
    /**
     * Sample code: DeviceGroups_ClaimDevices.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void deviceGroupsClaimDevices(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.deviceGroups()
            .claimDevices("MyResourceGroup1", "MyCatalog1", "MyProduct1", "MyDeviceGroup1", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### DeviceGroups_CountDevices

```java
/**
 * Samples for DeviceGroups CountDevices.
 */
public final class DeviceGroupsCountDevicesSamples {
    /**
     * Sample code: DeviceGroups_CountDevices.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void deviceGroupsCountDevices(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.deviceGroups()
            .countDevicesWithResponse("MyResourceGroup1", "MyCatalog1", "MyProduct1", "MyDeviceGroup1",
                com.azure.core.util.Context.NONE);
    }
}
```

### DeviceGroups_CreateOrUpdate

```java
import com.azure.resourcemanager.sphere.models.DeviceGroupProperties;
import com.azure.resourcemanager.sphere.models.OSFeedType;
import com.azure.resourcemanager.sphere.models.UpdatePolicy;

/**
 * Samples for DeviceGroups CreateOrUpdate.
 */
public final class DeviceGroupsCreateOrUpdateSamples {
    /**
     * Sample code: DeviceGroups_CreateOrUpdate.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void deviceGroupsCreateOrUpdate(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.deviceGroups()
            .define("MyDeviceGroup1")
            .withExistingProduct("MyResourceGroup1", "MyCatalog1", "MyProduct1")
            .withProperties(new DeviceGroupProperties().withDescription("Description for MyDeviceGroup1")
                .withOsFeedType(OSFeedType.RETAIL)
                .withUpdatePolicy(UpdatePolicy.UPDATE_ALL))
            .create();
    }
}
```

### DeviceGroups_Delete

```java
/**
 * Samples for DeviceGroups Delete.
 */
public final class DeviceGroupsDeleteSamples {
    /**
     * Sample code: DeviceGroups_Delete.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void deviceGroupsDelete(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.deviceGroups()
            .delete("MyResourceGroup1", "MyCatalog1", "MyProduct1", "MyDeviceGroup1", com.azure.core.util.Context.NONE);
    }
}
```

### DeviceGroups_Get

```java
/**
 * Samples for DeviceGroups Get.
 */
public final class DeviceGroupsGetSamples {
    /**
     * Sample code: DeviceGroups_Get.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void deviceGroupsGet(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.deviceGroups()
            .getWithResponse("MyResourceGroup1", "MyCatalog1", "MyProduct1", "MyDeviceGroup1",
                com.azure.core.util.Context.NONE);
    }
}
```

### DeviceGroups_ListByProduct

```java
/**
 * Samples for DeviceGroups ListByProduct.
 */
public final class DeviceGroupsListByProductSamples {
    /**
     * Sample code: DeviceGroups_ListByProduct.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void deviceGroupsListByProduct(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.deviceGroups()
            .listByProduct("MyResourceGroup1", "MyCatalog1", "MyProduct1", null, null, null, null,
                com.azure.core.util.Context.NONE);
    }
}
```

### DeviceGroups_Update

```java
import com.azure.resourcemanager.sphere.models.DeviceGroup;

/**
 * Samples for DeviceGroups Update.
 */
public final class DeviceGroupsUpdateSamples {
    /**
     * Sample code: DeviceGroups_Update.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void deviceGroupsUpdate(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        DeviceGroup resource = manager.deviceGroups()
            .getWithResponse("MyResourceGroup1", "MyCatalog1", "MyProduct1", "MyDeviceGroup1",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### Devices_CreateOrUpdate

```java
/**
 * Samples for Devices CreateOrUpdate.
 */
public final class DevicesCreateOrUpdateSamples {
    /**
     * Sample code: Devices_CreateOrUpdate.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void devicesCreateOrUpdate(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.devices()
            .define(
                "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000")
            .withExistingDeviceGroup("MyResourceGroup1", "MyCatalog1", "MyProduct1", "myDeviceGroup1")
            .create();
    }
}
```

### Devices_Delete

```java
/**
 * Samples for Devices Delete.
 */
public final class DevicesDeleteSamples {
    /**
     * Sample code: Devices_Delete.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void devicesDelete(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.devices()
            .delete("MyResourceGroup1", "MyCatalog1", "MyProductName1", "DeviceGroupName1",
                "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
                com.azure.core.util.Context.NONE);
    }
}
```

### Devices_GenerateCapabilityImage

```java

/**
 * Samples for Devices GenerateCapabilityImage.
 */
public final class DevicesGenerateCapabilityImageSamples {
    /**
     * Sample code: Devices_GenerateCapabilityImage.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void devicesGenerateCapabilityImage(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.devices()
            .generateCapabilityImage("MyResourceGroup1", "MyCatalog1", "MyProduct1", "myDeviceGroup1",
                "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
                null, com.azure.core.util.Context.NONE);
    }
}
```

### Devices_Get

```java
/**
 * Samples for Devices Get.
 */
public final class DevicesGetSamples {
    /**
     * Sample code: Devices_Get.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void devicesGet(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.devices()
            .getWithResponse("MyResourceGroup1", "MyCatalog1", "MyProduct1", "myDeviceGroup1",
                "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
                com.azure.core.util.Context.NONE);
    }
}
```

### Devices_ListByDeviceGroup

```java
/**
 * Samples for Devices ListByDeviceGroup.
 */
public final class DevicesListByDeviceGroupSamples {
    /**
     * Sample code: Devices_ListByDeviceGroup.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void devicesListByDeviceGroup(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.devices()
            .listByDeviceGroup("MyResourceGroup1", "MyCatalog1", "MyProduct1", "myDeviceGroup1",
                com.azure.core.util.Context.NONE);
    }
}
```

### Devices_Update

```java
import com.azure.resourcemanager.sphere.models.Device;

/**
 * Samples for Devices Update.
 */
public final class DevicesUpdateSamples {
    /**
     * Sample code: Devices_Update.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void devicesUpdate(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        Device resource = manager.devices()
            .getWithResponse("MyResourceGroup1", "MyCatalog1", "MyProduct1", "MyDeviceGroup1",
                "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### Images_CreateOrUpdate

```java
import com.azure.resourcemanager.sphere.models.ImageProperties;

/**
 * Samples for Images CreateOrUpdate.
 */
public final class ImagesCreateOrUpdateSamples {
    /**
     * Sample code: Image_CreateOrUpdate.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void imageCreateOrUpdate(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.images()
            .define("00000000-0000-0000-0000-000000000000")
            .withExistingCatalog("MyResourceGroup1", "MyCatalog1")
            .withProperties(new ImageProperties().withImage("bXliYXNlNjRzdHJpbmc="))
            .create();
    }
}
```

### Images_Delete

```java
/**
 * Samples for Images Delete.
 */
public final class ImagesDeleteSamples {
    /**
     * Sample code: Images_Delete.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void imagesDelete(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.images()
            .delete("MyResourceGroup1", "MyCatalog1", "00000000-0000-0000-0000-000000000000",
                com.azure.core.util.Context.NONE);
    }
}
```

### Images_Get

```java
/**
 * Samples for Images Get.
 */
public final class ImagesGetSamples {
    /**
     * Sample code: Images_Get.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void imagesGet(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.images()
            .getWithResponse("MyResourceGroup1", "MyCatalog1", "00000000-0000-0000-0000-000000000000",
                com.azure.core.util.Context.NONE);
    }
}
```

### Images_ListByCatalog

```java
/**
 * Samples for Images ListByCatalog.
 */
public final class ImagesListByCatalogSamples {
    /**
     * Sample code: Images_ListByCatalog.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void imagesListByCatalog(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.images()
            .listByCatalog("MyResourceGroup1", "MyCatalog1", null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void operationsList(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Products_CountDevices

```java
/**
 * Samples for Products CountDevices.
 */
public final class ProductsCountDevicesSamples {
    /**
     * Sample code: Products_CountDevices.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void productsCountDevices(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.products()
            .countDevicesWithResponse("MyResourceGroup1", "MyCatalog1", "MyProduct1", com.azure.core.util.Context.NONE);
    }
}
```

### Products_CreateOrUpdate

```java
/**
 * Samples for Products CreateOrUpdate.
 */
public final class ProductsCreateOrUpdateSamples {
    /**
     * Sample code: Products_CreateOrUpdate.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void productsCreateOrUpdate(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.products().define("MyProduct1").withExistingCatalog("MyResourceGroup1", "MyCatalog1").create();
    }
}
```

### Products_Delete

```java
/**
 * Samples for Products Delete.
 */
public final class ProductsDeleteSamples {
    /**
     * Sample code: Products_Delete.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void productsDelete(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.products().delete("MyResourceGroup1", "MyCatalog1", "MyProductName1", com.azure.core.util.Context.NONE);
    }
}
```

### Products_GenerateDefaultDeviceGroups

```java
/**
 * Samples for Products GenerateDefaultDeviceGroups.
 */
public final class ProductsGenerateDefaultDeviceGroupsSamples {
    /**
     * Sample code: Products_GenerateDefaultDeviceGroups.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void
        productsGenerateDefaultDeviceGroups(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.products()
            .generateDefaultDeviceGroups("MyResourceGroup1", "MyCatalog1", "MyProduct1",
                com.azure.core.util.Context.NONE);
    }
}
```

### Products_Get

```java
/**
 * Samples for Products Get.
 */
public final class ProductsGetSamples {
    /**
     * Sample code: Products_Get.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void productsGet(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.products()
            .getWithResponse("MyResourceGroup1", "MyCatalog1", "MyProduct1", com.azure.core.util.Context.NONE);
    }
}
```

### Products_ListByCatalog

```java
/**
 * Samples for Products ListByCatalog.
 */
public final class ProductsListByCatalogSamples {
    /**
     * Sample code: Products_ListByCatalog.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void productsListByCatalog(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.products().listByCatalog("MyResourceGroup1", "MyCatalog1", com.azure.core.util.Context.NONE);
    }
}
```

### Products_Update

```java
import com.azure.resourcemanager.sphere.models.Product;

/**
 * Samples for Products Update.
 */
public final class ProductsUpdateSamples {
    /**
     * Sample code: Products_Update.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void productsUpdate(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        Product resource = manager.products()
            .getWithResponse("MyResourceGroup1", "MyCatalog1", "MyProduct1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

