# Code snippets and samples


## AddressResources

- [Create](#addressresources_create)
- [Delete](#addressresources_delete)
- [GetByResourceGroup](#addressresources_getbyresourcegroup)
- [List](#addressresources_list)
- [ListByResourceGroup](#addressresources_listbyresourcegroup)
- [Update](#addressresources_update)

## Operations

- [List](#operations_list)

## OrderItemResources

- [Cancel](#orderitemresources_cancel)
- [Create](#orderitemresources_create)
- [Delete](#orderitemresources_delete)
- [GetByResourceGroup](#orderitemresources_getbyresourcegroup)
- [List](#orderitemresources_list)
- [ListByResourceGroup](#orderitemresources_listbyresourcegroup)
- [ReturnOrderItem](#orderitemresources_returnorderitem)
- [Update](#orderitemresources_update)

## OrderResources

- [Get](#orderresources_get)

## OrdersOperationGroup

- [List](#ordersoperationgroup_list)
- [ListByResourceGroup](#ordersoperationgroup_listbyresourcegroup)

## ProductsAndConfigurationsOperationGroup

- [ListConfigurations](#productsandconfigurationsoperationgroup_listconfigurations)
- [ListProductFamilies](#productsandconfigurationsoperationgroup_listproductfamilies)
- [ListProductFamiliesMetadata](#productsandconfigurationsoperationgroup_listproductfamiliesmetadata)
### AddressResources_Create

```java
import com.azure.resourcemanager.edgeorder.models.AddressClassification;
import com.azure.resourcemanager.edgeorder.models.AddressType;
import com.azure.resourcemanager.edgeorder.models.ContactDetails;
import com.azure.resourcemanager.edgeorder.models.ShippingAddress;
import java.util.Arrays;

/**
 * Samples for AddressResources Create.
 */
public final class AddressResourcesCreateSamples {
    /*
     * x-ms-original-file: 2024-02-01/CreateAddress.json
     */
    /**
     * Sample code: CreateAddress.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void createAddress(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.addressResources()
            .define("TestAddressName2")
            .withRegion("eastus")
            .withExistingResourceGroup("YourResourceGroupName")
            .withAddressClassification(AddressClassification.SHIPPING)
            .withShippingAddress(new ShippingAddress().withStreetAddress1("16 TOWNSEND ST")
                .withStreetAddress2("UNIT 1")
                .withCity("San Francisco")
                .withStateOrProvince("CA")
                .withCountry("US")
                .withPostalCode("fakeTokenPlaceholder")
                .withCompanyName("Microsoft")
                .withAddressType(AddressType.NONE))
            .withContactDetails(new ContactDetails().withContactName("XXXX XXXX")
                .withPhone("0000000000")
                .withPhoneExtension("")
                .withEmailList(Arrays.asList("xxxx@xxxx.xxx")))
            .create();
    }
}
```

### AddressResources_Delete

```java
/**
 * Samples for OrderResources Get.
 */
public final class OrderResourcesGetSamples {
    /*
     * x-ms-original-file: 2024-02-01/GetOrderByName.json
     */
    /**
     * Sample code: GetOrderByName.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void getOrderByName(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.orderResources()
            .getWithResponse("YourResourceGroupName", "eastus", "TestOrderName3", com.azure.core.util.Context.NONE);
    }
}
```

### AddressResources_GetByResourceGroup

```java
/**
 * Samples for AddressResources List.
 */
public final class AddressResourcesListSamples {
    /*
     * x-ms-original-file: 2024-02-01/ListAddressesAtSubscriptionLevel.json
     */
    /**
     * Sample code: ListAddressesAtSubscriptionLevel.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void listAddressesAtSubscriptionLevel(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.addressResources().list(null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### AddressResources_List

```java
import com.azure.resourcemanager.edgeorder.models.CancellationReason;

/**
 * Samples for OrderItemResources Cancel.
 */
public final class OrderItemResourcesCancelSamples {
    /*
     * x-ms-original-file: 2024-02-01/CancelOrderItem.json
     */
    /**
     * Sample code: CancelOrderItem.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void cancelOrderItem(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.orderItemResources()
            .cancelWithResponse("YourResourceGroupName", "TestOrderItemName3",
                new CancellationReason().withReason("Order cancelled"), com.azure.core.util.Context.NONE);
    }
}
```

### AddressResources_ListByResourceGroup

```java
import com.azure.resourcemanager.edgeorder.fluent.models.AddressProperties;
import com.azure.resourcemanager.edgeorder.models.AddressDetails;
import com.azure.resourcemanager.edgeorder.models.AddressType;
import com.azure.resourcemanager.edgeorder.models.ContactDetails;
import com.azure.resourcemanager.edgeorder.models.HierarchyInformation;
import com.azure.resourcemanager.edgeorder.models.OrderItemDetails;
import com.azure.resourcemanager.edgeorder.models.OrderItemType;
import com.azure.resourcemanager.edgeorder.models.Preferences;
import com.azure.resourcemanager.edgeorder.models.ProductDetails;
import com.azure.resourcemanager.edgeorder.models.ShippingAddress;
import com.azure.resourcemanager.edgeorder.models.TransportPreferences;
import com.azure.resourcemanager.edgeorder.models.TransportShipmentTypes;
import java.util.Arrays;

/**
 * Samples for OrderItemResources Create.
 */
public final class OrderItemResourcesCreateSamples {
    /*
     * x-ms-original-file: 2024-02-01/CreateOrderItem.json
     */
    /**
     * Sample code: CreateOrderItem.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void createOrderItem(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.orderItemResources()
            .define("TestOrderItemName2")
            .withRegion("eastus")
            .withExistingResourceGroup("YourResourceGroupName")
            .withOrderItemDetails(new OrderItemDetails()
                .withProductDetails(new ProductDetails()
                    .withHierarchyInformation(new HierarchyInformation().withProductFamilyName("azurestackedge")
                        .withProductLineName("azurestackedge")
                        .withProductName("azurestackedgegpu")
                        .withConfigurationName("edgep_base")))
                .withOrderItemType(OrderItemType.PURCHASE)
                .withPreferences(new Preferences().withTransportPreferences(
                    new TransportPreferences().withPreferredShipmentType(TransportShipmentTypes.MICROSOFT_MANAGED))))
            .withOrderId(
                "/subscriptions/eb5dc900-6186-49d8-b7d7-febd866fdc1d/resourceGroups/YourResourceGroupName/providers/Microsoft.EdgeOrder/locations/eastus/orders/TestOrderName2")
            .withAddressDetails(new AddressDetails().withForwardAddress(new AddressProperties()
                .withShippingAddress(new ShippingAddress().withStreetAddress1("16 TOWNSEND ST")
                    .withStreetAddress2("UNIT 1")
                    .withCity("San Francisco")
                    .withStateOrProvince("CA")
                    .withCountry("US")
                    .withPostalCode("fakeTokenPlaceholder")
                    .withCompanyName("Microsoft")
                    .withAddressType(AddressType.NONE))
                .withContactDetails(new ContactDetails().withContactName("XXXX XXXX")
                    .withPhone("0000000000")
                    .withPhoneExtension("")
                    .withEmailList(Arrays.asList("xxxx@xxxx.xxx")))))
            .create();
    }
}
```

### AddressResources_Update

```java
/**
 * Samples for AddressResources GetByResourceGroup.
 */
public final class AddressResourcesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-02-01/GetAddressByName.json
     */
    /**
     * Sample code: GetAddressByName.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void getAddressByName(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.addressResources()
            .getByResourceGroupWithResponse("YourResourceGroupName", "TestAddressName1",
                com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for AddressResources Delete.
 */
public final class AddressResourcesDeleteSamples {
    /*
     * x-ms-original-file: 2024-02-01/DeleteAddressByName.json
     */
    /**
     * Sample code: DeleteAddressByName.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void deleteAddressByName(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.addressResources()
            .delete("YourResourceGroupName", "TestAddressName1", com.azure.core.util.Context.NONE);
    }
}
```

### OrderItemResources_Cancel

```java
import com.azure.resourcemanager.edgeorder.models.AddressResource;
import com.azure.resourcemanager.edgeorder.models.AddressType;
import com.azure.resourcemanager.edgeorder.models.ContactDetails;
import com.azure.resourcemanager.edgeorder.models.ShippingAddress;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AddressResources Update.
 */
public final class AddressResourcesUpdateSamples {
    /*
     * x-ms-original-file: 2024-02-01/UpdateAddress.json
     */
    /**
     * Sample code: UpdateAddress.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void updateAddress(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        AddressResource resource = manager.addressResources()
            .getByResourceGroupWithResponse("YourResourceGroupName", "TestAddressName2",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withShippingAddress(new ShippingAddress().withStreetAddress1("16 TOWNSEND ST")
                .withStreetAddress2("UNIT 1")
                .withCity("San Francisco")
                .withStateOrProvince("CA")
                .withCountry("US")
                .withPostalCode("fakeTokenPlaceholder")
                .withCompanyName("Microsoft")
                .withAddressType(AddressType.NONE))
            .withContactDetails(new ContactDetails().withContactName("YYYY YYYY")
                .withPhone("0000000000")
                .withPhoneExtension("")
                .withEmailList(Arrays.asList("xxxx@xxxx.xxx")))
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

### OrderItemResources_Create

```java
import com.azure.resourcemanager.edgeorder.models.FilterableProperty;
import com.azure.resourcemanager.edgeorder.models.ProductFamiliesRequest;
import com.azure.resourcemanager.edgeorder.models.SupportedFilterTypes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ProductsAndConfigurationsOperationGroup ListProductFamilies.
 */
public final class ProductsAndConfigurationsOperationGroupListProductFamiliesSamples {
    /*
     * x-ms-original-file: 2024-02-01/ListProductFamilies.json
     */
    /**
     * Sample code: ListProductFamilies.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void listProductFamilies(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.productsAndConfigurationsOperationGroups()
            .listProductFamilies(
                new ProductFamiliesRequest().withFilterableProperties(mapOf("azurestackedge",
                    Arrays.asList(new FilterableProperty().withType(SupportedFilterTypes.SHIP_TO_COUNTRIES)
                        .withSupportedValues(Arrays.asList("US"))))),
                "configurations", null, com.azure.core.util.Context.NONE);
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

### OrderItemResources_Delete

```java
/**
 * Samples for OrderItemResources ListByResourceGroup.
 */
public final class OrderItemResourcesListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-02-01/ListOrderItemsAtResourceGroupLevel.json
     */
    /**
     * Sample code: ListOrderItemsAtResourceGroupLevel.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void
        listOrderItemsAtResourceGroupLevel(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.orderItemResources()
            .listByResourceGroup("YourResourceGroupName", null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### OrderItemResources_GetByResourceGroup

```java
/**
 * Samples for OrderItemResources GetByResourceGroup.
 */
public final class OrderItemResourcesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-02-01/GetOrderItemByName.json
     */
    /**
     * Sample code: GetOrderItemByName.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void getOrderItemByName(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.orderItemResources()
            .getByResourceGroupWithResponse("YourResourceGroupName", "TestOrderItemName1", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### OrderItemResources_List

```java
import com.azure.resourcemanager.edgeorder.models.ReturnOrderItemDetails;

/**
 * Samples for OrderItemResources ReturnOrderItem.
 */
public final class OrderItemResourcesReturnOrderItemSamples {
    /*
     * x-ms-original-file: 2024-02-01/ReturnOrderItem.json
     */
    /**
     * Sample code: ReturnOrderItem.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void returnOrderItem(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.orderItemResources()
            .returnOrderItem("YourResourceGroupName", "TestOrderName4",
                new ReturnOrderItemDetails().withReturnReason("Order returned"), com.azure.core.util.Context.NONE);
    }
}
```

### OrderItemResources_ListByResourceGroup

```java
/**
 * Samples for ProductsAndConfigurationsOperationGroup ListProductFamiliesMetadata.
 */
public final class ProductsAndConfigurationsOperationGroupListProductFamiliesMetadataSamples {
    /*
     * x-ms-original-file: 2024-02-01/ListProductFamiliesMetadata.json
     */
    /**
     * Sample code: ListProductFamiliesMetadata.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void listProductFamiliesMetadata(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.productsAndConfigurationsOperationGroups()
            .listProductFamiliesMetadata(null, com.azure.core.util.Context.NONE);
    }
}
```

### OrderItemResources_ReturnOrderItem

```java
import com.azure.resourcemanager.edgeorder.models.ConfigurationFilter;
import com.azure.resourcemanager.edgeorder.models.ConfigurationsRequest;
import com.azure.resourcemanager.edgeorder.models.FilterableProperty;
import com.azure.resourcemanager.edgeorder.models.HierarchyInformation;
import com.azure.resourcemanager.edgeorder.models.SupportedFilterTypes;
import java.util.Arrays;

/**
 * Samples for ProductsAndConfigurationsOperationGroup ListConfigurations.
 */
public final class ProductsAndConfigurationsOperationGroupListConfigurationsSamples {
    /*
     * x-ms-original-file: 2024-02-01/ListConfigurations.json
     */
    /**
     * Sample code: ListConfigurations.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void listConfigurations(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.productsAndConfigurationsOperationGroups()
            .listConfigurations(new ConfigurationsRequest().withConfigurationFilter(new ConfigurationFilter()
                .withHierarchyInformation(new HierarchyInformation().withProductFamilyName("azurestackedge")
                    .withProductLineName("azurestackedge")
                    .withProductName("azurestackedgegpu"))
                .withFilterableProperty(
                    Arrays.asList(new FilterableProperty().withType(SupportedFilterTypes.SHIP_TO_COUNTRIES)
                        .withSupportedValues(Arrays.asList("US"))))),
                null, com.azure.core.util.Context.NONE);
    }
}
```

### OrderItemResources_Update

```java
/**
 * Samples for AddressResources ListByResourceGroup.
 */
public final class AddressResourcesListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-02-01/ListAddressesAtResourceGroupLevel.json
     */
    /**
     * Sample code: ListAddressesAtResourceGroupLevel.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void listAddressesAtResourceGroupLevel(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.addressResources()
            .listByResourceGroup("YourResourceGroupName", null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### OrderResources_Get

```java
/**
 * Samples for OrderItemResources List.
 */
public final class OrderItemResourcesListSamples {
    /*
     * x-ms-original-file: 2024-02-01/ListOrderItemsAtSubscriptionLevel.json
     */
    /**
     * Sample code: ListOrderItemsAtSubscriptionLevel.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void listOrderItemsAtSubscriptionLevel(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.orderItemResources().list(null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### OrdersOperationGroup_List

```java
/**
 * Samples for OrdersOperationGroup ListByResourceGroup.
 */
public final class OrdersOperationGroupListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-02-01/ListOrderAtResourceGroupLevel.json
     */
    /**
     * Sample code: ListOrderAtResourceGroupLevel.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void listOrderAtResourceGroupLevel(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.ordersOperationGroups()
            .listByResourceGroup("YourResourceGroupName", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### OrdersOperationGroup_ListByResourceGroup

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2024-02-01/ListOperations.json
     */
    /**
     * Sample code: ListOperations.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void listOperations(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### ProductsAndConfigurationsOperationGroup_ListConfigurations

```java
import com.azure.resourcemanager.edgeorder.models.OrderItemResource;
import com.azure.resourcemanager.edgeorder.models.Preferences;
import com.azure.resourcemanager.edgeorder.models.TransportPreferences;
import com.azure.resourcemanager.edgeorder.models.TransportShipmentTypes;

/**
 * Samples for OrderItemResources Update.
 */
public final class OrderItemResourcesUpdateSamples {
    /*
     * x-ms-original-file: 2024-02-01/UpdateOrderItem.json
     */
    /**
     * Sample code: UpdateOrderItem.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void updateOrderItem(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        OrderItemResource resource = manager.orderItemResources()
            .getByResourceGroupWithResponse("YourResourceGroupName", "TestOrderItemName3", null,
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withPreferences(new Preferences().withTransportPreferences(
                new TransportPreferences().withPreferredShipmentType(TransportShipmentTypes.CUSTOMER_MANAGED)))
            .apply();
    }
}
```

### ProductsAndConfigurationsOperationGroup_ListProductFamilies

```java
/**
 * Samples for OrderItemResources Delete.
 */
public final class OrderItemResourcesDeleteSamples {
    /*
     * x-ms-original-file: 2024-02-01/DeleteOrderItemByName.json
     */
    /**
     * Sample code: DeleteOrderItemByName.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void deleteOrderItemByName(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.orderItemResources()
            .delete("YourResourceGroupName", "TestOrderItemName3", com.azure.core.util.Context.NONE);
    }
}
```

### ProductsAndConfigurationsOperationGroup_ListProductFamiliesMetadata

```java
/**
 * Samples for OrdersOperationGroup List.
 */
public final class OrdersOperationGroupListSamples {
    /*
     * x-ms-original-file: 2024-02-01/ListOrderAtSubscriptionLevel.json
     */
    /**
     * Sample code: ListOrderAtSubscriptionLevel.
     * 
     * @param manager Entry point to EdgeorderManager.
     */
    public static void listOrderAtSubscriptionLevel(com.azure.resourcemanager.edgeorder.EdgeorderManager manager) {
        manager.ordersOperationGroups().list(null, null, com.azure.core.util.Context.NONE);
    }
}
```

