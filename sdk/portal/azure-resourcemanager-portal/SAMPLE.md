# Code snippets and samples


## Dashboards

- [CreateOrUpdate](#dashboards_createorupdate)
- [Delete](#dashboards_delete)
- [GetByResourceGroup](#dashboards_getbyresourcegroup)
- [List](#dashboards_list)
- [ListByResourceGroup](#dashboards_listbyresourcegroup)
- [Update](#dashboards_update)

## ListTenantConfigurationViolationsOperations

- [List](#listtenantconfigurationviolationsoperations_list)

## Operations

- [List](#operations_list)

## TenantConfigurations

- [Create](#tenantconfigurations_create)
- [Delete](#tenantconfigurations_delete)
- [Get](#tenantconfigurations_get)
- [ListByTenant](#tenantconfigurations_listbytenant)
### Dashboards_CreateOrUpdate

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.portal.models.DashboardLens;
import com.azure.resourcemanager.portal.models.DashboardParts;
import com.azure.resourcemanager.portal.models.DashboardPartsPosition;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Dashboards CreateOrUpdate.
 */
public final class DashboardsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2022-12-01-preview/examples/
     * Dashboards_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update a Dashboard.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void createOrUpdateADashboard(com.azure.resourcemanager.portal.PortalManager manager)
        throws IOException {
        manager.dashboards()
            .define("testDashboard")
            .withRegion("eastus")
            .withExistingResourceGroup("testRG")
            .withTags(mapOf("aKey", "fakeTokenPlaceholder", "anotherKey", "fakeTokenPlaceholder"))
            .withLenses(Arrays.asList(
                new DashboardLens().withOrder(1)
                    .withParts(Arrays.asList(
                        new DashboardParts()
                            .withPosition(new DashboardPartsPosition().withX(1).withY(2).withRowSpan(4).withColSpan(3)),
                        new DashboardParts().withPosition(
                            new DashboardPartsPosition().withX(5).withY(5).withRowSpan(6).withColSpan(6)))),
                new DashboardLens().withOrder(2).withParts(Arrays.asList())))
            .withMetadata(SerializerFactory.createDefaultManagementSerializerAdapter()
                .deserialize("{\"metadata\":{\"ColSpan\":2,\"RowSpan\":1,\"X\":4,\"Y\":3}}", Object.class,
                    SerializerEncoding.JSON))
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

### Dashboards_Delete

```java
/**
 * Samples for Dashboards Delete.
 */
public final class DashboardsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/portal/resource-manager/Microsoft.Portal/preview/2022-12-01-preview/examples/Dashboards_Delete.json
     */
    /**
     * Sample code: Delete a Dashboard.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void deleteADashboard(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.dashboards()
            .deleteByResourceGroupWithResponse("testRG", "testDashboard", com.azure.core.util.Context.NONE);
    }
}
```

### Dashboards_GetByResourceGroup

```java
/**
 * Samples for Dashboards GetByResourceGroup.
 */
public final class DashboardsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/portal/resource-manager/Microsoft.Portal/preview/2022-12-01-preview/examples/Dashboards_Get.json
     */
    /**
     * Sample code: Get a Dashboard.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void getADashboard(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.dashboards()
            .getByResourceGroupWithResponse("testRG", "testDashboard", com.azure.core.util.Context.NONE);
    }
}
```

### Dashboards_List

```java
/**
 * Samples for Dashboards List.
 */
public final class DashboardsListSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2022-12-01-preview/examples/
     * Dashboards_ListBySubscription.json
     */
    /**
     * Sample code: List all custom resource providers on the subscription.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void
        listAllCustomResourceProvidersOnTheSubscription(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.dashboards().list(com.azure.core.util.Context.NONE);
    }
}
```

### Dashboards_ListByResourceGroup

```java
/**
 * Samples for Dashboards ListByResourceGroup.
 */
public final class DashboardsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2022-12-01-preview/examples/
     * Dashboards_ListByResourceGroup.json
     */
    /**
     * Sample code: List all custom resource providers on the resourceGroup.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void
        listAllCustomResourceProvidersOnTheResourceGroup(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.dashboards().listByResourceGroup("testRG", com.azure.core.util.Context.NONE);
    }
}
```

### Dashboards_Update

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.portal.models.Dashboard;
import com.azure.resourcemanager.portal.models.DashboardLens;
import com.azure.resourcemanager.portal.models.DashboardParts;
import com.azure.resourcemanager.portal.models.DashboardPartsPosition;
import com.azure.resourcemanager.portal.models.DashboardProperties;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Dashboards Update.
 */
public final class DashboardsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/portal/resource-manager/Microsoft.Portal/preview/2022-12-01-preview/examples/Dashboards_Update.json
     */
    /**
     * Sample code: Update a Dashboard.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void updateADashboard(com.azure.resourcemanager.portal.PortalManager manager) throws IOException {
        Dashboard resource = manager.dashboards()
            .getByResourceGroupWithResponse("testRG", "testDashboard", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("aKey", "fakeTokenPlaceholder", "anotherKey", "fakeTokenPlaceholder"))
            .withProperties(
                new DashboardProperties()
                    .withLenses(
                        Arrays.asList(
                            new DashboardLens().withOrder(1)
                                .withParts(Arrays.asList(
                                    new DashboardParts().withPosition(
                                        new DashboardPartsPosition().withX(1).withY(2).withRowSpan(4).withColSpan(3)),
                                    new DashboardParts().withPosition(
                                        new DashboardPartsPosition().withX(5).withY(5).withRowSpan(6).withColSpan(6)))),
                            new DashboardLens().withOrder(2).withParts(Arrays.asList())))
                    .withMetadata(SerializerFactory.createDefaultManagementSerializerAdapter()
                        .deserialize("{\"metadata\":{\"ColSpan\":2,\"RowSpan\":1,\"X\":4,\"Y\":3}}", Object.class,
                            SerializerEncoding.JSON)))
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

### ListTenantConfigurationViolationsOperations_List

```java
/**
 * Samples for ListTenantConfigurationViolationsOperations List.
 */
public final class ListTenantConfigurationViolationsOperationsListSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2022-12-01-preview/examples/
     * ListTenantConfigurationViolationsOperations_List.json
     */
    /**
     * Sample code: List Tenant configuration Violations.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void listTenantConfigurationViolations(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.listTenantConfigurationViolationsOperations().list(com.azure.core.util.Context.NONE);
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
     * specification/portal/resource-manager/Microsoft.Portal/preview/2022-12-01-preview/examples/Operations_List.json
     */
    /**
     * Sample code: List of operations.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void listOfOperations(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### TenantConfigurations_Create

```java
import com.azure.resourcemanager.portal.fluent.models.TenantConfigurationInner;

/**
 * Samples for TenantConfigurations Create.
 */
public final class TenantConfigurationsCreateSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2022-12-01-preview/examples/
     * TenantConfigurations_Create.json
     */
    /**
     * Sample code: Create or update Tenant configuration.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void createOrUpdateTenantConfiguration(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.tenantConfigurations()
            .createWithResponse("default", new TenantConfigurationInner().withEnforcePrivateMarkdownStorage(true),
                com.azure.core.util.Context.NONE);
    }
}
```

### TenantConfigurations_Delete

```java
/**
 * Samples for TenantConfigurations Delete.
 */
public final class TenantConfigurationsDeleteSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2022-12-01-preview/examples/
     * TenantConfigurations_Delete.json
     */
    /**
     * Sample code: Delete Tenant configuration.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void deleteTenantConfiguration(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.tenantConfigurations().deleteWithResponse("default", com.azure.core.util.Context.NONE);
    }
}
```

### TenantConfigurations_Get

```java
/**
 * Samples for TenantConfigurations Get.
 */
public final class TenantConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2022-12-01-preview/examples/
     * TenantConfigurations_Get.json
     */
    /**
     * Sample code: Get Tenant configuration.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void getTenantConfiguration(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.tenantConfigurations().getWithResponse("default", com.azure.core.util.Context.NONE);
    }
}
```

### TenantConfigurations_ListByTenant

```java
/**
 * Samples for TenantConfigurations ListByTenant.
 */
public final class TenantConfigurationsListByTenantSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2022-12-01-preview/examples/
     * TenantConfigurations_ListByTenant.json
     */
    /**
     * Sample code: Get list of Tenant configurations.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void getListOfTenantConfigurations(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.tenantConfigurations().listByTenant(com.azure.core.util.Context.NONE);
    }
}
```

