# Code snippets and samples


## CheckNameAvailability

- [CheckNameAvailability](#checknameavailability_checknameavailability)

## DataConnectors

- [CreateOrUpdate](#dataconnectors_createorupdate)
- [Delete](#dataconnectors_delete)
- [Get](#dataconnectors_get)
- [List](#dataconnectors_list)

## DataManagerForAgricultureExtensions

- [Get](#datamanagerforagricultureextensions_get)
- [List](#datamanagerforagricultureextensions_list)

## DataManagerForAgricultureResources

- [CreateOrUpdate](#datamanagerforagricultureresources_createorupdate)
- [Delete](#datamanagerforagricultureresources_delete)
- [GetByResourceGroup](#datamanagerforagricultureresources_getbyresourcegroup)
- [List](#datamanagerforagricultureresources_list)
- [ListByResourceGroup](#datamanagerforagricultureresources_listbyresourcegroup)
- [Update](#datamanagerforagricultureresources_update)

## Extensions

- [CreateOrUpdate](#extensions_createorupdate)
- [Delete](#extensions_delete)
- [Get](#extensions_get)
- [ListByDataManagerForAgriculture](#extensions_listbydatamanagerforagriculture)

## OperationResults

- [Get](#operationresults_get)

## Operations

- [List](#operations_list)

## PrivateEndpointConnections

- [CreateOrUpdate](#privateendpointconnections_createorupdate)
- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [ListByResource](#privateendpointconnections_listbyresource)

## PrivateLinkResources

- [Get](#privatelinkresources_get)
- [ListByResource](#privatelinkresources_listbyresource)

## Solutions

- [CreateOrUpdate](#solutions_createorupdate)
- [Delete](#solutions_delete)
- [Get](#solutions_get)
- [List](#solutions_list)

## SolutionsDiscoverability

- [Get](#solutionsdiscoverability_get)
- [List](#solutionsdiscoverability_list)
### CheckNameAvailability_CheckNameAvailability

```java
import com.azure.resourcemanager.agrifood.models.CheckNameAvailabilityRequest;

/**
 * Samples for CheckNameAvailability CheckNameAvailability.
 */
public final class CheckNameAvailabilityCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * CheckNameAvailability_CheckNameAvailability_AlreadyExists.json
     */
    /**
     * Sample code: CheckNameAvailability_CheckNameAvailability_AlreadyExists.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void checkNameAvailabilityCheckNameAvailabilityAlreadyExists(
        com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.checkNameAvailabilities().checkNameAvailabilityWithResponse(new CheckNameAvailabilityRequest()
            .withName("existingaccountname").withType("Microsoft.AgFoodPlatform/farmBeats"),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * CheckNameAvailability_CheckNameAvailability_Available.json
     */
    /**
     * Sample code: CheckNameAvailability_CheckNameAvailability_Available.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void checkNameAvailabilityCheckNameAvailabilityAvailable(
        com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.checkNameAvailabilities().checkNameAvailabilityWithResponse(new CheckNameAvailabilityRequest()
            .withName("newaccountname").withType("Microsoft.AgFoodPlatform/farmBeats"),
            com.azure.core.util.Context.NONE);
    }
}
```

### DataConnectors_CreateOrUpdate

```java
import com.azure.resourcemanager.agrifood.models.ApiKeyAuthCredentials;
import com.azure.resourcemanager.agrifood.models.DataConnectorProperties;
import com.azure.resourcemanager.agrifood.models.KeyVaultProperties;

/**
 * Samples for DataConnectors CreateOrUpdate.
 */
public final class DataConnectorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * DataConnectors_CreateOrUpdate.json
     */
    /**
     * Sample code: DataConnectors_CreateOrUpdate.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void dataConnectorsCreateOrUpdate(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.dataConnectors().define("WeatherIBM")
            .withExistingFarmBeat("examples-rg", "examples-dataManagerForAgricultureResourceName")
            .withProperties(new DataConnectorProperties().withCredentials(
                new ApiKeyAuthCredentials().withApiKey(new KeyVaultProperties().withKeyVaultUri("fakeTokenPlaceholder")
                    .withKeyName("fakeTokenPlaceholder").withKeyVersion("fakeTokenPlaceholder"))))
            .create();
    }
}
```

### DataConnectors_Delete

```java
/**
 * Samples for DataConnectors Delete.
 */
public final class DataConnectorsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * DataConnectors_Delete.json
     */
    /**
     * Sample code: DataConnectors_Delete.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void dataConnectorsDelete(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.dataConnectors().deleteWithResponse("examples-rg", "examples-dataManagerForAgricultureResourceName",
            "SatelliteSentinelHub", com.azure.core.util.Context.NONE);
    }
}
```

### DataConnectors_Get

```java
/**
 * Samples for DataConnectors Get.
 */
public final class DataConnectorsGetSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * DataConnectors_Get.json
     */
    /**
     * Sample code: DataConnectors_Get.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void dataConnectorsGet(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.dataConnectors().getWithResponse("examples-rg", "examples-dataManagerForAgricultureResourceName",
            "SatelliteSentinelHub", com.azure.core.util.Context.NONE);
    }
}
```

### DataConnectors_List

```java
/**
 * Samples for DataConnectors List.
 */
public final class DataConnectorsListSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * DataConnectors_List.json
     */
    /**
     * Sample code: DataConnectors_List.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void dataConnectorsList(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.dataConnectors().list("examples-rg", "examples-dataManagerForAgricultureResourceName", null, null,
            com.azure.core.util.Context.NONE);
    }
}
```

### DataManagerForAgricultureExtensions_Get

```java
/**
 * Samples for DataManagerForAgricultureExtensions Get.
 */
public final class DataManagerForAgricultureExtensionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * DataManagerForAgricultureExtensions_Get.json
     */
    /**
     * Sample code: DataManagerForAgricultureExtensions_Get.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void
        dataManagerForAgricultureExtensionsGet(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.dataManagerForAgricultureExtensions().getWithResponse("DTN.ContentServices",
            com.azure.core.util.Context.NONE);
    }
}
```

### DataManagerForAgricultureExtensions_List

```java

/**
 * Samples for DataManagerForAgricultureExtensions List.
 */
public final class DataManagerForAgricultureExtensionsListSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * DataManagerForAgricultureExtensions_List.json
     */
    /**
     * Sample code: DataManagerForAgricultureExtensions_List.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void
        dataManagerForAgricultureExtensionsList(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.dataManagerForAgricultureExtensions().list(null, null, null, null, null,
            com.azure.core.util.Context.NONE);
    }
}
```

### DataManagerForAgricultureResources_CreateOrUpdate

```java
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DataManagerForAgricultureResources CreateOrUpdate.
 */
public final class DataManagerForAgricultureResourcesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * DataManagerForAgricultureResources_CreateOrUpdate.json
     */
    /**
     * Sample code: DataManagerForAgricultureResources_CreateOrUpdate.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void
        dataManagerForAgricultureResourcesCreateOrUpdate(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.dataManagerForAgricultureResources().define("examples-farmbeatsResourceName").withRegion("eastus2")
            .withExistingResourceGroup("examples-rg")
            .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder")).create();
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

### DataManagerForAgricultureResources_Delete

```java
/**
 * Samples for DataManagerForAgricultureResources Delete.
 */
public final class DataManagerForAgricultureResourcesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * DataManagerForAgricultureResources_Delete.json
     */
    /**
     * Sample code: DataManagerForAgricultureResources_Delete.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void
        dataManagerForAgricultureResourcesDelete(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.dataManagerForAgricultureResources().deleteByResourceGroupWithResponse("examples-rg",
            "examples-dataManagerForAgricultureResourceName", com.azure.core.util.Context.NONE);
    }
}
```

### DataManagerForAgricultureResources_GetByResourceGroup

```java
/**
 * Samples for DataManagerForAgricultureResources GetByResourceGroup.
 */
public final class DataManagerForAgricultureResourcesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * DataManagerForAgricultureResources_Get.json
     */
    /**
     * Sample code: DataManagerForAgricultureResources_Get.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void
        dataManagerForAgricultureResourcesGet(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.dataManagerForAgricultureResources().getByResourceGroupWithResponse("examples-rg",
            "examples-farmBeatsResourceName", com.azure.core.util.Context.NONE);
    }
}
```

### DataManagerForAgricultureResources_List

```java
/**
 * Samples for DataManagerForAgricultureResources List.
 */
public final class DataManagerForAgricultureResourcesListSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * DataManagerForAgricultureResources_ListBySubscription.json
     */
    /**
     * Sample code: DataManagerForAgricultureResources_ListBySubscription.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void dataManagerForAgricultureResourcesListBySubscription(
        com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.dataManagerForAgricultureResources().list(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### DataManagerForAgricultureResources_ListByResourceGroup

```java
/**
 * Samples for DataManagerForAgricultureResources ListByResourceGroup.
 */
public final class DataManagerForAgricultureResourcesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * DataManagerForAgricultureResources_ListByResourceGroup.json
     */
    /**
     * Sample code: DataManagerForAgricultureResources_ListByResourceGroup.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void dataManagerForAgricultureResourcesListByResourceGroup(
        com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.dataManagerForAgricultureResources().listByResourceGroup("examples-rg", null, null,
            com.azure.core.util.Context.NONE);
    }
}
```

### DataManagerForAgricultureResources_Update

```java
import com.azure.resourcemanager.agrifood.models.DataManagerForAgriculture;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DataManagerForAgricultureResources Update.
 */
public final class DataManagerForAgricultureResourcesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * DataManagerForAgricultureResources_Update.json
     */
    /**
     * Sample code: DataManagerForAgricultureResources_Update.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void
        dataManagerForAgricultureResourcesUpdate(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        DataManagerForAgriculture resource
            = manager.dataManagerForAgricultureResources().getByResourceGroupWithResponse("examples-rg",
                "examples-farmBeatsResourceName", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder")).apply();
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

### Extensions_CreateOrUpdate

```java
/**
 * Samples for Extensions CreateOrUpdate.
 */
public final class ExtensionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * Extensions_CreateOrUpdate.json
     */
    /**
     * Sample code: Extensions_CreateOrUpdate.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void extensionsCreateOrUpdate(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.extensions().define("provider.extension")
            .withExistingFarmBeat("examples-rg", "examples-dataManagerForAgricultureResourceName").create();
    }
}
```

### Extensions_Delete

```java
/**
 * Samples for Extensions Delete.
 */
public final class ExtensionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * Extensions_Delete.json
     */
    /**
     * Sample code: Extensions_Delete.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void extensionsDelete(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.extensions().deleteWithResponse("examples-rg", "examples-farmbeatsResourceName", "provider.extension",
            com.azure.core.util.Context.NONE);
    }
}
```

### Extensions_Get

```java
/**
 * Samples for Extensions Get.
 */
public final class ExtensionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * Extensions_Get.json
     */
    /**
     * Sample code: Extensions_Get.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void extensionsGet(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.extensions().getWithResponse("examples-rg", "examples-farmbeatsResourceName", "provider.extension",
            com.azure.core.util.Context.NONE);
    }
}
```

### Extensions_ListByDataManagerForAgriculture

```java

/**
 * Samples for Extensions ListByDataManagerForAgriculture.
 */
public final class ExtensionsListByDataManagerForAgricultureSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * Extensions_ListByDataManagerForAgriculture.json
     */
    /**
     * Sample code: Extensions_ListByDataManagerForAgriculture.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void
        extensionsListByDataManagerForAgriculture(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.extensions().listByDataManagerForAgriculture("examples-rg", "examples-farmbeatsResourceName", null,
            null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### OperationResults_Get

```java
/**
 * Samples for OperationResults Get.
 */
public final class OperationResultsGetSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * OperationResults_Get.json
     */
    /**
     * Sample code: OperationResults_Get.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void operationResultsGet(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.operationResults().getWithResponse("westus", "resource-provisioning-id-farmBeatsResourceName",
            com.azure.core.util.Context.NONE);
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
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void operationsList(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_CreateOrUpdate

```java
import com.azure.resourcemanager.agrifood.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.agrifood.models.PrivateLinkServiceConnectionState;

/**
 * Samples for PrivateEndpointConnections CreateOrUpdate.
 */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * PrivateEndpointConnections_CreateOrUpdate.json
     */
    /**
     * Sample code: PrivateEndpointConnections_CreateOrUpdate.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void
        privateEndpointConnectionsCreateOrUpdate(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.privateEndpointConnections().define("privateEndpointConnectionName")
            .withExistingFarmBeat("examples-rg", "examples-farmbeatsResourceName")
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                    .withDescription("Approved by johndoe@contoso.com"))
            .create();
    }
}
```

### PrivateEndpointConnections_Delete

```java
/**
 * Samples for PrivateEndpointConnections Delete.
 */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * PrivateEndpointConnections_Delete.json
     */
    /**
     * Sample code: PrivateEndpointConnections_Delete.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void privateEndpointConnectionsDelete(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.privateEndpointConnections().delete("examples-rg", "examples-farmbeatsResourceName",
            "privateEndpointConnectionName", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
/**
 * Samples for PrivateEndpointConnections Get.
 */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * PrivateEndpointConnections_Get.json
     */
    /**
     * Sample code: PrivateEndpointConnections_Get.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void privateEndpointConnectionsGet(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.privateEndpointConnections().getWithResponse("examples-rg", "examples-farmbeatsResourceName",
            "privateEndpointConnectionName", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_ListByResource

```java
/**
 * Samples for PrivateEndpointConnections ListByResource.
 */
public final class PrivateEndpointConnectionsListByResourceSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * PrivateEndpointConnections_ListByResource.json
     */
    /**
     * Sample code: PrivateEndpointConnections_ListByResource.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void
        privateEndpointConnectionsListByResource(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.privateEndpointConnections().listByResourceWithResponse("examples-rg", "examples-farmbeatsResourceName",
            com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_Get

```java
/**
 * Samples for PrivateLinkResources Get.
 */
public final class PrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * PrivateLinkResources_Get.json
     */
    /**
     * Sample code: PrivateLinkResources_Get.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void privateLinkResourcesGet(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.privateLinkResources().getWithResponse("examples-rg", "examples-farmbeatsResourceName", "farmbeats",
            com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_ListByResource

```java
/**
 * Samples for PrivateLinkResources ListByResource.
 */
public final class PrivateLinkResourcesListByResourceSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * PrivateLinkResources_ListByResource.json
     */
    /**
     * Sample code: PrivateLinkResources_ListByResource.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void privateLinkResourcesListByResource(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.privateLinkResources().listByResourceWithResponse("examples-rg", "examples-farmbeatsResourceName",
            com.azure.core.util.Context.NONE);
    }
}
```

### Solutions_CreateOrUpdate

```java
/**
 * Samples for Solutions CreateOrUpdate.
 */
public final class SolutionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * Solutions_CreateOrUpdate.json
     */
    /**
     * Sample code: Solutions_CreateOrUpdate.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void solutionsCreateOrUpdate(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.solutions().define("abc.partner").withExistingFarmBeat("examples-rg", "examples-farmbeatsResourceName")
            .create();
    }
}
```

### Solutions_Delete

```java
/**
 * Samples for Solutions Delete.
 */
public final class SolutionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * Solutions_Delete.json
     */
    /**
     * Sample code: Solutions_Delete.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void solutionsDelete(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.solutions().deleteWithResponse("examples-rg", "examples-farmbeatsResourceName", "provider.solution",
            com.azure.core.util.Context.NONE);
    }
}
```

### Solutions_Get

```java
/**
 * Samples for Solutions Get.
 */
public final class SolutionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * Solutions_Get.json
     */
    /**
     * Sample code: Solutions_Get.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void solutionsGet(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.solutions().getWithResponse("examples-rg", "examples-farmbeatsResourceName", "provider.solution",
            com.azure.core.util.Context.NONE);
    }
}
```

### Solutions_List

```java

/**
 * Samples for Solutions List.
 */
public final class SolutionsListSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * Solutions_List.json
     */
    /**
     * Sample code: Solutions_List.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void solutionsList(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.solutions().list("examples-rg", "examples-farmbeatsResourceName", null, null, null, null, null, null,
            null, null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### SolutionsDiscoverability_Get

```java
/**
 * Samples for SolutionsDiscoverability Get.
 */
public final class SolutionsDiscoverabilityGetSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * SolutionsDiscoverability_Get.json
     */
    /**
     * Sample code: SolutionsDiscoverability_Get.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void solutionsDiscoverabilityGet(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.solutionsDiscoverabilities().getWithResponse("bayerAgPowered.gdu", com.azure.core.util.Context.NONE);
    }
}
```

### SolutionsDiscoverability_List

```java

/**
 * Samples for SolutionsDiscoverability List.
 */
public final class SolutionsDiscoverabilityListSamples {
    /*
     * x-ms-original-file:
     * specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/
     * SolutionsDiscoverability_List.json
     */
    /**
     * Sample code: SolutionsDiscoverability_List.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void solutionsDiscoverabilityList(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.solutionsDiscoverabilities().list(null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

