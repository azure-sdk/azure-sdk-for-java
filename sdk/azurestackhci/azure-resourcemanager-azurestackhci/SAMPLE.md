# Code snippets and samples


## ArcSettings

- [Create](#arcsettings_create)
- [CreateIdentity](#arcsettings_createidentity)
- [Delete](#arcsettings_delete)
- [GeneratePassword](#arcsettings_generatepassword)
- [Get](#arcsettings_get)
- [ListByCluster](#arcsettings_listbycluster)
- [Update](#arcsettings_update)

## Clusters

- [Create](#clusters_create)
- [CreateIdentity](#clusters_createidentity)
- [Delete](#clusters_delete)
- [ExtendSoftwareAssuranceBenefit](#clusters_extendsoftwareassurancebenefit)
- [GetByResourceGroup](#clusters_getbyresourcegroup)
- [List](#clusters_list)
- [ListByResourceGroup](#clusters_listbyresourcegroup)
- [Update](#clusters_update)
- [UploadCertificate](#clusters_uploadcertificate)

## Extensions

- [Create](#extensions_create)
- [Delete](#extensions_delete)
- [Get](#extensions_get)
- [ListByArcSetting](#extensions_listbyarcsetting)
- [Update](#extensions_update)

## Offers

- [Get](#offers_get)
- [ListByCluster](#offers_listbycluster)
- [ListByPublisher](#offers_listbypublisher)

## Operations

- [List](#operations_list)

## Publishers

- [Get](#publishers_get)
- [ListByCluster](#publishers_listbycluster)

## Skus

- [Get](#skus_get)
- [ListByOffer](#skus_listbyoffer)

## UpdateRuns

- [Delete](#updateruns_delete)
- [Get](#updateruns_get)
- [List](#updateruns_list)
- [Put](#updateruns_put)

## UpdateSummariesOperation

- [Delete](#updatesummariesoperation_delete)
- [Get](#updatesummariesoperation_get)
- [List](#updatesummariesoperation_list)
- [Put](#updatesummariesoperation_put)

## Updates

- [Delete](#updates_delete)
- [Get](#updates_get)
- [List](#updates_list)
- [Post](#updates_post)
- [Put](#updates_put)
### ArcSettings_Create

```java
/** Samples for ArcSettings Create. */
public final class ArcSettingsCreateSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/PutArcSetting.json
     */
    /**
     * Sample code: Create ArcSetting.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void createArcSetting(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.arcSettings().define("default").withExistingCluster("test-rg", "myCluster").create();
    }
}
```

### ArcSettings_CreateIdentity

```java
import com.azure.core.util.Context;

/** Samples for ArcSettings CreateIdentity. */
public final class ArcSettingsCreateIdentitySamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/CreateArcIdentity.json
     */
    /**
     * Sample code: Create Arc Identity.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void createArcIdentity(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.arcSettings().createIdentity("test-rg", "myCluster", "default", Context.NONE);
    }
}
```

### ArcSettings_Delete

```java
import com.azure.core.util.Context;

/** Samples for ArcSettings Delete. */
public final class ArcSettingsDeleteSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/DeleteArcSetting.json
     */
    /**
     * Sample code: Delete ArcSetting.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void deleteArcSetting(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.arcSettings().delete("test-rg", "myCluster", "default", Context.NONE);
    }
}
```

### ArcSettings_GeneratePassword

```java
import com.azure.core.util.Context;

/** Samples for ArcSettings GeneratePassword. */
public final class ArcSettingsGeneratePasswordSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/GeneratePassword.json
     */
    /**
     * Sample code: Generate Password.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void generatePassword(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.arcSettings().generatePasswordWithResponse("test-rg", "myCluster", "default", Context.NONE);
    }
}
```

### ArcSettings_Get

```java
import com.azure.core.util.Context;

/** Samples for ArcSettings Get. */
public final class ArcSettingsGetSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/GetArcSetting.json
     */
    /**
     * Sample code: Get ArcSetting.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void getArcSetting(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.arcSettings().getWithResponse("test-rg", "myCluster", "default", Context.NONE);
    }
}
```

### ArcSettings_ListByCluster

```java
import com.azure.core.util.Context;

/** Samples for ArcSettings ListByCluster. */
public final class ArcSettingsListByClusterSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/ListArcSettingsByCluster.json
     */
    /**
     * Sample code: List ArcSetting resources by HCI Cluster.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void listArcSettingResourcesByHCICluster(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.arcSettings().listByCluster("test-rg", "myCluster", Context.NONE);
    }
}
```

### ArcSettings_Update

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.azurestackhci.models.ArcSetting;
import java.io.IOException;

/** Samples for ArcSettings Update. */
public final class ArcSettingsUpdateSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/PatchArcSetting.json
     */
    /**
     * Sample code: Patch ArcSetting.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void patchArcSetting(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager)
        throws IOException {
        ArcSetting resource =
            manager.arcSettings().getWithResponse("test-rg", "myCluster", "default", Context.NONE).getValue();
        resource
            .update()
            .withConnectivityProperties(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{\"enabled\":true}", Object.class, SerializerEncoding.JSON))
            .apply();
    }
}
```

### Clusters_Create

```java
import com.azure.resourcemanager.azurestackhci.models.ManagedServiceIdentityType;

/** Samples for Clusters Create. */
public final class ClustersCreateSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/CreateCluster.json
     */
    /**
     * Sample code: Create cluster.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void createCluster(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager
            .clusters()
            .define("myCluster")
            .withRegion("East US")
            .withExistingResourceGroup("test-rg")
            .withTypeIdentityType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
            .withCloudManagementEndpoint("https://98294836-31be-4668-aeae-698667faf99b.waconazure.com")
            .withAadClientId("24a6e53d-04e5-44d2-b7cc-1b732a847dfc")
            .withAadTenantId("7e589cc1-a8b6-4dff-91bd-5ec0fa18db94")
            .create();
    }
}
```

### Clusters_CreateIdentity

```java
import com.azure.core.util.Context;

/** Samples for Clusters CreateIdentity. */
public final class ClustersCreateIdentitySamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/CreateClusterIdentity.json
     */
    /**
     * Sample code: Create cluster Identity.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void createClusterIdentity(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.clusters().createIdentity("test-rg", "myCluster", Context.NONE);
    }
}
```

### Clusters_Delete

```java
import com.azure.core.util.Context;

/** Samples for Clusters Delete. */
public final class ClustersDeleteSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/DeleteCluster.json
     */
    /**
     * Sample code: Delete cluster.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void deleteCluster(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.clusters().delete("test-rg", "myCluster", Context.NONE);
    }
}
```

### Clusters_ExtendSoftwareAssuranceBenefit

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.models.SoftwareAssuranceChangeRequest;
import com.azure.resourcemanager.azurestackhci.models.SoftwareAssuranceChangeRequestProperties;
import com.azure.resourcemanager.azurestackhci.models.SoftwareAssuranceIntent;

/** Samples for Clusters ExtendSoftwareAssuranceBenefit. */
public final class ClustersExtendSoftwareAssuranceBenefitSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/ExtendSoftwareAssuranceBenefit.json
     */
    /**
     * Sample code: Create cluster Identity.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void createClusterIdentity(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager
            .clusters()
            .extendSoftwareAssuranceBenefit(
                "test-rg",
                "myCluster",
                new SoftwareAssuranceChangeRequest()
                    .withProperties(
                        new SoftwareAssuranceChangeRequestProperties()
                            .withSoftwareAssuranceIntent(SoftwareAssuranceIntent.ENABLE)),
                Context.NONE);
    }
}
```

### Clusters_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Clusters GetByResourceGroup. */
public final class ClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/GetCluster.json
     */
    /**
     * Sample code: Get cluster.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void getCluster(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.clusters().getByResourceGroupWithResponse("test-rg", "myCluster", Context.NONE);
    }
}
```

### Clusters_List

```java
import com.azure.core.util.Context;

/** Samples for Clusters List. */
public final class ClustersListSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/ListClustersBySubscription.json
     */
    /**
     * Sample code: List clusters in a given subscription.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void listClustersInAGivenSubscription(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.clusters().list(Context.NONE);
    }
}
```

### Clusters_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Clusters ListByResourceGroup. */
public final class ClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/ListClustersByResourceGroup.json
     */
    /**
     * Sample code: List clusters in a given resource group.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void listClustersInAGivenResourceGroup(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.clusters().listByResourceGroup("test-rg", Context.NONE);
    }
}
```

### Clusters_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.models.Cluster;
import com.azure.resourcemanager.azurestackhci.models.ClusterDesiredProperties;
import com.azure.resourcemanager.azurestackhci.models.DiagnosticLevel;
import com.azure.resourcemanager.azurestackhci.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.azurestackhci.models.WindowsServerSubscription;
import java.util.HashMap;
import java.util.Map;

/** Samples for Clusters Update. */
public final class ClustersUpdateSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/UpdateCluster.json
     */
    /**
     * Sample code: Update cluster.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void updateCluster(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        Cluster resource =
            manager.clusters().getByResourceGroupWithResponse("test-rg", "myCluster", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
            .withCloudManagementEndpoint("https://98294836-31be-4668-aeae-698667faf99b.waconazure.com")
            .withDesiredProperties(
                new ClusterDesiredProperties()
                    .withWindowsServerSubscription(WindowsServerSubscription.ENABLED)
                    .withDiagnosticLevel(DiagnosticLevel.BASIC))
            .apply();
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

### Clusters_UploadCertificate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.models.RawCertificateData;
import com.azure.resourcemanager.azurestackhci.models.UploadCertificateRequest;
import java.util.Arrays;

/** Samples for Clusters UploadCertificate. */
public final class ClustersUploadCertificateSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/UploadCertificate.json
     */
    /**
     * Sample code: Upload certificate.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void uploadCertificate(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager
            .clusters()
            .uploadCertificate(
                "test-rg",
                "myCluster",
                new UploadCertificateRequest()
                    .withProperties(
                        new RawCertificateData().withCertificates(Arrays.asList("base64cert", "base64cert"))),
                Context.NONE);
    }
}
```

### Extensions_Create

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;

/** Samples for Extensions Create. */
public final class ExtensionsCreateSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/PutExtension.json
     */
    /**
     * Sample code: Create Arc Extension.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void createArcExtension(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager)
        throws IOException {
        manager
            .extensions()
            .define("MicrosoftMonitoringAgent")
            .withExistingArcSetting("test-rg", "myCluster", "default")
            .withPublisher("Microsoft.Compute")
            .withTypePropertiesType("MicrosoftMonitoringAgent")
            .withTypeHandlerVersion("1.10")
            .withSettings(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{\"workspaceId\":\"xx\"}", Object.class, SerializerEncoding.JSON))
            .withProtectedSettings(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{\"workspaceKey\":\"xx\"}", Object.class, SerializerEncoding.JSON))
            .create();
    }
}
```

### Extensions_Delete

```java
import com.azure.core.util.Context;

/** Samples for Extensions Delete. */
public final class ExtensionsDeleteSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/DeleteExtension.json
     */
    /**
     * Sample code: Delete Arc Extension.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void deleteArcExtension(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.extensions().delete("test-rg", "myCluster", "default", "MicrosoftMonitoringAgent", Context.NONE);
    }
}
```

### Extensions_Get

```java
import com.azure.core.util.Context;

/** Samples for Extensions Get. */
public final class ExtensionsGetSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/GetExtension.json
     */
    /**
     * Sample code: Get ArcSettings Extension.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void getArcSettingsExtension(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager
            .extensions()
            .getWithResponse("test-rg", "myCluster", "default", "MicrosoftMonitoringAgent", Context.NONE);
    }
}
```

### Extensions_ListByArcSetting

```java
import com.azure.core.util.Context;

/** Samples for Extensions ListByArcSetting. */
public final class ExtensionsListByArcSettingSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/ListExtensionsByArcSetting.json
     */
    /**
     * Sample code: List Extensions under ArcSetting resource.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void listExtensionsUnderArcSettingResource(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.extensions().listByArcSetting("test-rg", "myCluster", "default", Context.NONE);
    }
}
```

### Extensions_Update

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.azurestackhci.models.Extension;
import java.io.IOException;

/** Samples for Extensions Update. */
public final class ExtensionsUpdateSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/PatchExtension.json
     */
    /**
     * Sample code: Update Arc Extension.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void updateArcExtension(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager)
        throws IOException {
        Extension resource =
            manager
                .extensions()
                .getWithResponse("test-rg", "myCluster", "default", "MicrosoftMonitoringAgent", Context.NONE)
                .getValue();
        resource
            .update()
            .withPublisher("Microsoft.Compute")
            .withTypePropertiesType("MicrosoftMonitoringAgent")
            .withTypeHandlerVersion("1.10")
            .withSettings(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{\"workspaceId\":\"xx\"}", Object.class, SerializerEncoding.JSON))
            .apply();
    }
}
```

### Offers_Get

```java
import com.azure.core.util.Context;

/** Samples for Offers Get. */
public final class OffersGetSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/GetOffer.json
     */
    /**
     * Sample code: Get Offer.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void getOffer(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.offers().getWithResponse("test-rg", "myCluster", "publisher1", "offer1", null, Context.NONE);
    }
}
```

### Offers_ListByCluster

```java
import com.azure.core.util.Context;

/** Samples for Offers ListByCluster. */
public final class OffersListByClusterSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/ListOffersByCluster.json
     */
    /**
     * Sample code: List Offer resources by HCI Cluster.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void listOfferResourcesByHCICluster(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.offers().listByCluster("test-rg", "myCluster", null, Context.NONE);
    }
}
```

### Offers_ListByPublisher

```java
import com.azure.core.util.Context;

/** Samples for Offers ListByPublisher. */
public final class OffersListByPublisherSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/ListOffersByPublisher.json
     */
    /**
     * Sample code: List Offer resources by publisher for the HCI Cluster.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void listOfferResourcesByPublisherForTheHCICluster(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.offers().listByPublisher("test-rg", "myCluster", "publisher1", null, Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/ListOperations.json
     */
    /**
     * Sample code: Create cluster.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void createCluster(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.operations().listWithResponse(Context.NONE);
    }
}
```

### Publishers_Get

```java
import com.azure.core.util.Context;

/** Samples for Publishers Get. */
public final class PublishersGetSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/GetPublisher.json
     */
    /**
     * Sample code: Get Publisher.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void getPublisher(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.publishers().getWithResponse("test-rg", "myCluster", "publisher1", Context.NONE);
    }
}
```

### Publishers_ListByCluster

```java
import com.azure.core.util.Context;

/** Samples for Publishers ListByCluster. */
public final class PublishersListByClusterSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/ListPublishersByCluster.json
     */
    /**
     * Sample code: List Publisher resources by HCI Cluster.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void listPublisherResourcesByHCICluster(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.publishers().listByCluster("test-rg", "myCluster", Context.NONE);
    }
}
```

### Skus_Get

```java
import com.azure.core.util.Context;

/** Samples for Skus Get. */
public final class SkusGetSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/GetSku.json
     */
    /**
     * Sample code: Get Sku.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void getSku(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.skus().getWithResponse("test-rg", "myCluster", "publisher1", "offer1", "sku1", null, Context.NONE);
    }
}
```

### Skus_ListByOffer

```java
import com.azure.core.util.Context;

/** Samples for Skus ListByOffer. */
public final class SkusListByOfferSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/ListSkusByOffer.json
     */
    /**
     * Sample code: List SKU resources by offer for the HCI Cluster.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void listSKUResourcesByOfferForTheHCICluster(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.skus().listByOffer("test-rg", "myCluster", "publisher1", "offer1", null, Context.NONE);
    }
}
```

### UpdateRuns_Delete

```java
import com.azure.core.util.Context;

/** Samples for UpdateRuns Delete. */
public final class UpdateRunsDeleteSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/DeleteUpdateRuns.json
     */
    /**
     * Sample code: Delete an Update.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void deleteAnUpdate(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager
            .updateRuns()
            .delete(
                "testrg", "testcluster", "Microsoft4.2203.2.32", "23b779ba-0d52-4a80-8571-45ca74664ec3", Context.NONE);
    }
}
```

### UpdateRuns_Get

```java
import com.azure.core.util.Context;

/** Samples for UpdateRuns Get. */
public final class UpdateRunsGetSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/GetUpdateRuns.json
     */
    /**
     * Sample code: Get Update runs under cluster resource.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void getUpdateRunsUnderClusterResource(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager
            .updateRuns()
            .getWithResponse(
                "testrg", "testcluster", "Microsoft4.2203.2.32", "23b779ba-0d52-4a80-8571-45ca74664ec3", Context.NONE);
    }
}
```

### UpdateRuns_List

```java
import com.azure.core.util.Context;

/** Samples for UpdateRuns List. */
public final class UpdateRunsListSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/ListUpdateRuns.json
     */
    /**
     * Sample code: List Update runs under cluster resource.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void listUpdateRunsUnderClusterResource(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.updateRuns().list("testrg", "testcluster", "Microsoft4.2203.2.32", Context.NONE);
    }
}
```

### UpdateRuns_Put

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.fluent.models.Step;
import com.azure.resourcemanager.azurestackhci.models.UpdateRun;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for UpdateRuns Put. */
public final class UpdateRunsPutSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/PutUpdateRuns.json
     */
    /**
     * Sample code: Get Update runs under cluster resource.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void getUpdateRunsUnderClusterResource(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        UpdateRun resource =
            manager
                .updateRuns()
                .getWithResponse(
                    "testrg",
                    "testcluster",
                    "Microsoft4.2203.2.32",
                    "23b779ba-0d52-4a80-8571-45ca74664ec3",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withNamePropertiesName("Unnamed step")
            .withDescription("Update Azure Stack.")
            .withErrorMessage("")
            .withStatus("Success")
            .withStartTimeUtc(OffsetDateTime.parse("2022-04-06T01:36:33.3876751+00:00"))
            .withEndTimeUtc(OffsetDateTime.parse("2022-04-06T13:58:42.969006+00:00"))
            .withLastUpdatedTimeUtc(OffsetDateTime.parse("2022-04-06T13:58:42.969006+00:00"))
            .withSteps(
                Arrays
                    .asList(
                        new Step()
                            .withName("PreUpdate Cloud")
                            .withDescription("Prepare for SSU update")
                            .withErrorMessage("")
                            .withStatus("Success")
                            .withStartTimeUtc(OffsetDateTime.parse("2022-04-06T01:36:33.3876751+00:00"))
                            .withEndTimeUtc(OffsetDateTime.parse("2022-04-06T01:37:16.8728314+00:00"))
                            .withLastUpdatedTimeUtc(OffsetDateTime.parse("2022-04-06T01:37:16.8728314+00:00"))
                            .withSteps(Arrays.asList())))
            .apply();
    }
}
```

### UpdateSummariesOperation_Delete

```java
import com.azure.core.util.Context;

/** Samples for UpdateSummariesOperation Delete. */
public final class UpdateSummariesOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/DeleteUpdateSummaries.json
     */
    /**
     * Sample code: Delete an Update.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void deleteAnUpdate(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.updateSummariesOperations().delete("testrg", "testcluster", Context.NONE);
    }
}
```

### UpdateSummariesOperation_Get

```java
import com.azure.core.util.Context;

/** Samples for UpdateSummariesOperation Get. */
public final class UpdateSummariesOperationGetSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/GetUpdateSummaries.json
     */
    /**
     * Sample code: Get Update summaries under cluster resource.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void getUpdateSummariesUnderClusterResource(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.updateSummariesOperations().getWithResponse("testrg", "testcluster", Context.NONE);
    }
}
```

### UpdateSummariesOperation_List

```java
import com.azure.core.util.Context;

/** Samples for UpdateSummariesOperation List. */
public final class UpdateSummariesOperationListSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/ListUpdateSummaries.json
     */
    /**
     * Sample code: Get Update summaries under cluster resource.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void getUpdateSummariesUnderClusterResource(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.updateSummariesOperations().list("testrg", "testcluster", Context.NONE);
    }
}
```

### UpdateSummariesOperation_Put

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.fluent.models.UpdateSummariesInner;
import com.azure.resourcemanager.azurestackhci.models.UpdateSummariesPropertiesState;
import java.time.OffsetDateTime;

/** Samples for UpdateSummariesOperation Put. */
public final class UpdateSummariesOperationPutSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/PutUpdateSummaries.json
     */
    /**
     * Sample code: Put Update summaries under cluster resource.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void putUpdateSummariesUnderClusterResource(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager
            .updateSummariesOperations()
            .putWithResponse(
                "testrg",
                "testcluster",
                new UpdateSummariesInner()
                    .withOemFamily("DellEMC")
                    .withHardwareModel("PowerEdge R730xd")
                    .withCurrentVersion("4.2203.2.32")
                    .withLastUpdated(OffsetDateTime.parse("2022-04-06T14:08:18.254Z"))
                    .withLastChecked(OffsetDateTime.parse("2022-04-07T18:04:07Z"))
                    .withState(UpdateSummariesPropertiesState.APPLIED_SUCCESSFULLY),
                Context.NONE);
    }
}
```

### Updates_Delete

```java
import com.azure.core.util.Context;

/** Samples for Updates Delete. */
public final class UpdatesDeleteSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/DeleteUpdates.json
     */
    /**
     * Sample code: Delete an Update.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void deleteAnUpdate(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.updates().delete("testrg", "testcluster", "Microsoft4.2203.2.32", Context.NONE);
    }
}
```

### Updates_Get

```java
import com.azure.core.util.Context;

/** Samples for Updates Get. */
public final class UpdatesGetSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/GetUpdates.json
     */
    /**
     * Sample code: Get a specific update.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void getASpecificUpdate(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.updates().getWithResponse("testrg", "testcluster", "Microsoft4.2203.2.32", Context.NONE);
    }
}
```

### Updates_List

```java
import com.azure.core.util.Context;

/** Samples for Updates List. */
public final class UpdatesListSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/ListUpdates.json
     */
    /**
     * Sample code: List available updates.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void listAvailableUpdates(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.updates().list("testrg", "testcluster", Context.NONE);
    }
}
```

### Updates_Post

```java
import com.azure.core.util.Context;

/** Samples for Updates Post. */
public final class UpdatesPostSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/PostUpdates.json
     */
    /**
     * Sample code: List available updates.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void listAvailableUpdates(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.updates().post("testrg", "testcluster", "Microsoft4.2203.2.32", Context.NONE);
    }
}
```

### Updates_Put

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.models.AvailabilityType;
import com.azure.resourcemanager.azurestackhci.models.State;
import com.azure.resourcemanager.azurestackhci.models.Update;
import com.azure.resourcemanager.azurestackhci.models.UpdatePrerequisite;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for Updates Put. */
public final class UpdatesPutSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2022-12-30-preview/examples/PutUpdates.json
     */
    /**
     * Sample code: Put a specific update.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void putASpecificUpdate(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        Update resource =
            manager.updates().getWithResponse("testrg", "testcluster", "Microsoft4.2203.2.32", Context.NONE).getValue();
        resource
            .update()
            .withInstalledDate(OffsetDateTime.parse("2022-04-06T14:08:18.254Z"))
            .withDescription("AzS Update 4.2203.2.32")
            .withState(State.INSTALLED)
            .withPrerequisites(
                Arrays
                    .asList(
                        new UpdatePrerequisite()
                            .withUpdateType("update type")
                            .withVersion("prerequisite version")
                            .withPackageName("update package name")))
            .withPackagePath("\\\\SU1FileServer\\SU1_Infrastructure_2\\Updates\\Packages\\Microsoft4.2203.2.32")
            .withPackageSizeInMb(18858.0F)
            .withDisplayName("AzS Update - 4.2203.2.32")
            .withVersion("4.2203.2.32")
            .withPublisher("Microsoft")
            .withReleaseLink("https://docs.microsoft.com/azure-stack/operator/release-notes?view=azs-2203")
            .withAvailabilityType(AvailabilityType.LOCAL)
            .withPackageType("Infrastructure")
            .withAdditionalProperties("additional properties")
            .withProgressPercentage(0.0F)
            .withNotifyMessage("Brief message with instructions for updates of AvailabilityType Notify")
            .apply();
    }
}
```

