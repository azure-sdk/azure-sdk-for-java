# Code snippets and samples


## EdgeSites

- [CreateOrUpdate](#edgesites_createorupdate)
- [Delete](#edgesites_delete)
- [GetByResourceGroup](#edgesites_getbyresourcegroup)
- [List](#edgesites_list)
- [ListByResourceGroup](#edgesites_listbyresourcegroup)
- [ListL2Connections](#edgesites_listl2connections)
- [UpdateTags](#edgesites_updatetags)

## GlobalCommunicationsSites

- [Get](#globalcommunicationssites_get)
- [List](#globalcommunicationssites_list)

## GroundStations

- [CreateOrUpdate](#groundstations_createorupdate)
- [Delete](#groundstations_delete)
- [GetByResourceGroup](#groundstations_getbyresourcegroup)
- [List](#groundstations_list)
- [ListByResourceGroup](#groundstations_listbyresourcegroup)
- [ListL2Connections](#groundstations_listl2connections)
- [UpdateTags](#groundstations_updatetags)

## L2Connections

- [CreateOrUpdate](#l2connections_createorupdate)
- [Delete](#l2connections_delete)
- [GetByResourceGroup](#l2connections_getbyresourcegroup)
- [List](#l2connections_list)
- [ListByResourceGroup](#l2connections_listbyresourcegroup)
- [UpdateTags](#l2connections_updatetags)

## Operations

- [List](#operations_list)
### EdgeSites_CreateOrUpdate

```java
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for EdgeSites CreateOrUpdate.
 */
public final class EdgeSitesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/EdgeSiteCreate.json
     */
    /**
     * Sample code: Create Edge Site.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void createEdgeSite(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.edgeSites().define("es1").withRegion("westus").withExistingResourceGroup("rg1").withIdPropertiesId("/subscriptions/c1be1141-a7c9-4aac-9608-3c2e2f1152c3/providers/Microsoft.Orbital/globalCommunicationsSites/contoso-Vernon").withTags(mapOf("tag1", "value1", "tag2", "value2")).create();
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

### EdgeSites_Delete

```java
/**
 * Samples for EdgeSites Delete.
 */
public final class EdgeSitesDeleteSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/EdgeSiteDelete.json
     */
    /**
     * Sample code: Delete Edge Site.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void deleteEdgeSite(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.edgeSites().deleteByResourceGroupWithResponse("rg1", "oep1", com.azure.core.util.Context.NONE);
    }
}
```

### EdgeSites_GetByResourceGroup

```java
/**
 * Samples for EdgeSites GetByResourceGroup.
 */
public final class EdgeSitesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/EdgeSiteGet.json
     */
    /**
     * Sample code: Get Edge Site.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void getEdgeSite(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.edgeSites().getByResourceGroupWithResponse("rg1", "es1", com.azure.core.util.Context.NONE);
    }
}
```

### EdgeSites_List

```java
/**
 * Samples for EdgeSites List.
 */
public final class EdgeSitesListSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/EdgeSitesBySubscriptionList.json
     */
    /**
     * Sample code: List of Edge Sites by Subscription.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void listOfEdgeSitesBySubscription(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.edgeSites().list("opaqueString", com.azure.core.util.Context.NONE);
    }
}
```

### EdgeSites_ListByResourceGroup

```java
/**
 * Samples for EdgeSites ListByResourceGroup.
 */
public final class EdgeSitesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/EdgeSitesByResourceGroupList.json
     */
    /**
     * Sample code: List of Edge Sites by Resource Group.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void listOfEdgeSitesByResourceGroup(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.edgeSites().listByResourceGroup("rg1", "opaqueString", com.azure.core.util.Context.NONE);
    }
}
```

### EdgeSites_ListL2Connections

```java
/**
 * Samples for EdgeSites ListL2Connections.
 */
public final class EdgeSitesListL2ConnectionsSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/L2ConnectionsByEdgeSiteNameList.json
     */
    /**
     * Sample code: List of L2 Connections by Edge site.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void listOfL2ConnectionsByEdgeSite(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.edgeSites().listL2Connections("rg1", "oep1", com.azure.core.util.Context.NONE);
    }
}
```

### EdgeSites_UpdateTags

```java
import com.azure.resourcemanager.aodgv1.models.EdgeSite;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for EdgeSites UpdateTags.
 */
public final class EdgeSitesUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/EdgeSiteUpdateTag.json
     */
    /**
     * Sample code: Update Edge Site tags.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void updateEdgeSiteTags(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        EdgeSite resource = manager.edgeSites().getByResourceGroupWithResponse("rg1", "oep1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### GlobalCommunicationsSites_Get

```java
/**
 * Samples for GlobalCommunicationsSites Get.
 */
public final class GlobalCommunicationsSitesGetSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/GlobalCommunicationsSiteGet.json
     */
    /**
     * Sample code: Get Global Communications Site.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void getGlobalCommunicationsSite(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.globalCommunicationsSites().getWithResponse("contoso-Vernon", com.azure.core.util.Context.NONE);
    }
}
```

### GlobalCommunicationsSites_List

```java
/**
 * Samples for GlobalCommunicationsSites List.
 */
public final class GlobalCommunicationsSitesListSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/GlobalCommunicationsSitesBySubscriptionList.json
     */
    /**
     * Sample code: List of Global Communications Sites.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void listOfGlobalCommunicationsSites(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.globalCommunicationsSites().list(com.azure.core.util.Context.NONE);
    }
}
```

### GroundStations_CreateOrUpdate

```java
import com.azure.resourcemanager.aodgv1.models.Capability;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for GroundStations CreateOrUpdate.
 */
public final class GroundStationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/GroundStationCreate.json
     */
    /**
     * Sample code: Create a ground station.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void createAGroundStation(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.groundStations().define("westus_gs1").withRegion("westus").withExistingResourceGroup("rg1").withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder")).withCity("redmond").withCapabilities(Arrays.asList(Capability.COMMUNICATION)).withProviderName("Microsoft").withLongitudeDegrees(47.674F).withLatitudeDegrees(-122.122F).withAltitudeMeters(1500.83F).withIdPropertiesId("/subscriptions/c1be1141-a7c9-4aac-9608-3c2e2f1152c3/providers/Microsoft.Orbital/globalCommunicationsSites/contoso-Vernon").create();
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

### GroundStations_Delete

```java
/**
 * Samples for GroundStations Delete.
 */
public final class GroundStationsDeleteSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/GroundStationDelete.json
     */
    /**
     * Sample code: Delete Ground Station.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void deleteGroundStation(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.groundStations().deleteByResourceGroupWithResponse("rg1", "westus_gs1", com.azure.core.util.Context.NONE);
    }
}
```

### GroundStations_GetByResourceGroup

```java
/**
 * Samples for GroundStations GetByResourceGroup.
 */
public final class GroundStationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/GroundStationGet.json
     */
    /**
     * Sample code: Get GroundStation.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void getGroundStation(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.groundStations().getByResourceGroupWithResponse("rg1", "westus_gs1", com.azure.core.util.Context.NONE);
    }
}
```

### GroundStations_List

```java
/**
 * Samples for GroundStations List.
 */
public final class GroundStationsListSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/GroundStationsBySubscription.json
     */
    /**
     * Sample code: List of Ground Stations by Subscription.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void listOfGroundStationsBySubscription(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.groundStations().list("opaqueString", com.azure.core.util.Context.NONE);
    }
}
```

### GroundStations_ListByResourceGroup

```java
/**
 * Samples for GroundStations ListByResourceGroup.
 */
public final class GroundStationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/GroundStationsList.json
     */
    /**
     * Sample code: List of Ground Stations.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void listOfGroundStations(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.groundStations().listByResourceGroup("rg1", "opaqueString", com.azure.core.util.Context.NONE);
    }
}
```

### GroundStations_ListL2Connections

```java
/**
 * Samples for GroundStations ListL2Connections.
 */
public final class GroundStationsListL2ConnectionsSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/L2ConnectionsByGroundStationNameList.json
     */
    /**
     * Sample code: List of L2 Connections by Ground Station.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void listOfL2ConnectionsByGroundStation(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.groundStations().listL2Connections("rg1", "gs1", com.azure.core.util.Context.NONE);
    }
}
```

### GroundStations_UpdateTags

```java
import com.azure.resourcemanager.aodgv1.models.GroundStation;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for GroundStations UpdateTags.
 */
public final class GroundStationsUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/GroundStationUpdateTags.json
     */
    /**
     * Sample code: Update Ground Station tags.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void updateGroundStationTags(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        GroundStation resource = manager.groundStations().getByResourceGroupWithResponse("rg1", "westus_gs1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### L2Connections_CreateOrUpdate

```java
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for L2Connections CreateOrUpdate.
 */
public final class L2ConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/L2ConnectionCreate.json
     */
    /**
     * Sample code: Create L2 Connection.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void createL2Connection(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.l2Connections().define("connection1").withRegion("westus").withExistingResourceGroup("rg1").withIdPropertiesId("/subscriptions/c1be1141-a7c9-4aac-9608-3c2e2f1152c3/resourceGroups/rg1/providers/Microsoft.Orbital/edgeSites/es1").withNamePropertiesName("customerName-SiteName-01").withVlanId(200).withTags(mapOf("tag1", "value1", "tag2", "value2")).create();
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

### L2Connections_Delete

```java
/**
 * Samples for L2Connections Delete.
 */
public final class L2ConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/L2ConnectionDelete.json
     */
    /**
     * Sample code: Delete L2 Connection.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void deleteL2Connection(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.l2Connections().delete("rg1", "connection1", com.azure.core.util.Context.NONE);
    }
}
```

### L2Connections_GetByResourceGroup

```java
/**
 * Samples for L2Connections GetByResourceGroup.
 */
public final class L2ConnectionsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/L2ConnectionGet.json
     */
    /**
     * Sample code: Get L2 Connection.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void getL2Connection(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.l2Connections().getByResourceGroupWithResponse("rg1", "connection1", com.azure.core.util.Context.NONE);
    }
}
```

### L2Connections_List

```java
/**
 * Samples for L2Connections List.
 */
public final class L2ConnectionsListSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/L2ConnectionsBySubscriptionList.json
     */
    /**
     * Sample code: List of L2 Connections by Subscription.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void listOfL2ConnectionsBySubscription(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.l2Connections().list("opaqueString", com.azure.core.util.Context.NONE);
    }
}
```

### L2Connections_ListByResourceGroup

```java
/**
 * Samples for L2Connections ListByResourceGroup.
 */
public final class L2ConnectionsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/L2ConnectionsByResourceGroupList.json
     */
    /**
     * Sample code: List of L2 Connections by Resource Group.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void listOfL2ConnectionsByResourceGroup(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.l2Connections().listByResourceGroup("rg1", "opaqueString", com.azure.core.util.Context.NONE);
    }
}
```

### L2Connections_UpdateTags

```java
import com.azure.resourcemanager.aodgv1.models.L2Connection;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for L2Connections UpdateTags.
 */
public final class L2ConnectionsUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/L2ConnectionUpdateTag.json
     */
    /**
     * Sample code: Update L2 Connection tags.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void updateL2ConnectionTags(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        L2Connection resource = manager.l2Connections().getByResourceGroupWithResponse("rg1", "connection1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/aodgv1/resource-manager/Microsoft.Orbital/preview/2024-03-01-preview/examples/OperationsList.json
     */
    /**
     * Sample code: OperationsList.
     * 
     * @param manager Entry point to Aodgv1Manager.
     */
    public static void operationsList(com.azure.resourcemanager.aodgv1.Aodgv1Manager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

