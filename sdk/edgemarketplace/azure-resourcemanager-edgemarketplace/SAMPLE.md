# Code snippets and samples


## Offers

- [Get](#offers_get)
- [GetAccessToken](#offers_getaccesstoken)
- [List](#offers_list)
- [Search](#offers_search)

## Operations

- [List](#operations_list)

## Publishers

- [Get](#publishers_get)
- [List](#publishers_list)
### Offers_Get

```java
/** Samples for Offers Get. */
public final class OffersGetSamples {
    /*
     * x-ms-original-file: specification/edgemarketplace/resource-manager/Microsoft.EdgeMarketPlace/preview/2023-04-01-preview/examples/GetOffer.json
     */
    /**
     * Sample code: Get offer.
     *
     * @param manager Entry point to EdgeMarketPlaceManager.
     */
    public static void getOffer(com.azure.resourcemanager.edgemarketplace.EdgeMarketPlaceManager manager) {
        manager
            .offers()
            .getWithResponse(
                "subscriptions/4bed37fd-19a1-4d31-8b44-40267555bec5/resourceGroups/edgemarketplace-rg/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/edgemarketplace-demo",
                "0001-com-ubuntu-pro-jammy",
                com.azure.core.util.Context.NONE);
    }
}
```

### Offers_GetAccessToken

```java
import com.azure.resourcemanager.edgemarketplace.models.AccessTokenRequest;

/** Samples for Offers GetAccessToken. */
public final class OffersGetAccessTokenSamples {
    /*
     * x-ms-original-file: specification/edgemarketplace/resource-manager/Microsoft.EdgeMarketPlace/preview/2023-04-01-preview/examples/GetAccessToken.json
     */
    /**
     * Sample code: Get AccessToken.
     *
     * @param manager Entry point to EdgeMarketPlaceManager.
     */
    public static void getAccessToken(com.azure.resourcemanager.edgemarketplace.EdgeMarketPlaceManager manager) {
        manager
            .offers()
            .getAccessToken(
                "subscriptions/4bed37fd-19a1-4d31-8b44-40267555bec5/resourceGroups/edgemarketplace-rg/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/edgemarketplace-demo",
                "0001-com-ubuntu-pro-jammy",
                new AccessTokenRequest()
                    .withEdgeMarketPlaceRegion("EastUS2Euap")
                    .withEgeMarketPlaceResourceId("testid")
                    .withHypervGeneration("V2")
                    .withMarketPlaceSku("2022-datacenter-azure-edition-core")
                    .withMarketPlaceSkuVersion("20348.1129.221007")
                    .withDeviceSku("edge")
                    .withDeviceVersion("1.0.18062.1"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Offers_List

```java
/** Samples for Offers List. */
public final class OffersListSamples {
    /*
     * x-ms-original-file: specification/edgemarketplace/resource-manager/Microsoft.EdgeMarketPlace/preview/2023-04-01-preview/examples/ListOffers.json
     */
    /**
     * Sample code: List offers.
     *
     * @param manager Entry point to EdgeMarketPlaceManager.
     */
    public static void listOffers(com.azure.resourcemanager.edgemarketplace.EdgeMarketPlaceManager manager) {
        manager
            .offers()
            .list(
                "subscriptions/4bed37fd-19a1-4d31-8b44-40267555bec5/resourceGroups/edgemarketplace-rg/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/edgemarketplace-demo",
                com.azure.core.util.Context.NONE);
    }
}
```

### Offers_Search

```java
/** Samples for Offers Search. */
public final class OffersSearchSamples {
    /*
     * x-ms-original-file: specification/edgemarketplace/resource-manager/Microsoft.EdgeMarketPlace/preview/2023-04-01-preview/examples/OffersSearch.json
     */
    /**
     * Sample code: Search offers.
     *
     * @param manager Entry point to EdgeMarketPlaceManager.
     */
    public static void searchOffers(com.azure.resourcemanager.edgemarketplace.EdgeMarketPlaceManager manager) {
        manager
            .offers()
            .search(
                "subscriptions/4bed37fd-19a1-4d31-8b44-40267555bec5/resourceGroups/edgemarketplace-rg/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/edgemarketplace-demo",
                null,
                com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/edgemarketplace/resource-manager/Microsoft.EdgeMarketPlace/preview/2023-04-01-preview/examples/ListOperations.json
     */
    /**
     * Sample code: List operations.
     *
     * @param manager Entry point to EdgeMarketPlaceManager.
     */
    public static void listOperations(com.azure.resourcemanager.edgemarketplace.EdgeMarketPlaceManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Publishers_Get

```java
/** Samples for Publishers Get. */
public final class PublishersGetSamples {
    /*
     * x-ms-original-file: specification/edgemarketplace/resource-manager/Microsoft.EdgeMarketPlace/preview/2023-04-01-preview/examples/GetPublisher.json
     */
    /**
     * Sample code: Get publisher.
     *
     * @param manager Entry point to EdgeMarketPlaceManager.
     */
    public static void getPublisher(com.azure.resourcemanager.edgemarketplace.EdgeMarketPlaceManager manager) {
        manager
            .publishers()
            .getWithResponse(
                "subscriptions/4bed37fd-19a1-4d31-8b44-40267555bec5/resourceGroups/edgemarketplace-rg/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/edgemarketplace-demo",
                "canonical",
                com.azure.core.util.Context.NONE);
    }
}
```

### Publishers_List

```java
/** Samples for Publishers List. */
public final class PublishersListSamples {
    /*
     * x-ms-original-file: specification/edgemarketplace/resource-manager/Microsoft.EdgeMarketPlace/preview/2023-04-01-preview/examples/ListPublishers.json
     */
    /**
     * Sample code: List publishers.
     *
     * @param manager Entry point to EdgeMarketPlaceManager.
     */
    public static void listPublishers(com.azure.resourcemanager.edgemarketplace.EdgeMarketPlaceManager manager) {
        manager
            .publishers()
            .list(
                "subscriptions/4bed37fd-19a1-4d31-8b44-40267555bec5/resourceGroups/edgemarketplace-rg/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/edgemarketplace-demo",
                com.azure.core.util.Context.NONE);
    }
}
```

