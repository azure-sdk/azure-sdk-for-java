# Code snippets and samples


## Dashboards

- [CreateOrUpdate](#dashboards_createorupdate)
- [Delete](#dashboards_delete)
- [GetByResourceGroup](#dashboards_getbyresourcegroup)
- [List](#dashboards_list)
- [ListByResourceGroup](#dashboards_listbyresourcegroup)
- [Update](#dashboards_update)

## ListTenantConfigurationViolations

- [List](#listtenantconfigurationviolations_list)

## Operations

- [List](#operations_list)

## TenantConfigurations

- [Create](#tenantconfigurations_create)
- [Delete](#tenantconfigurations_delete)
- [Get](#tenantconfigurations_get)
- [List](#tenantconfigurations_list)
### Dashboards_CreateOrUpdate

```java
import com.azure.resourcemanager.portal.models.Dashboard;

/**
 * Samples for Dashboards Update.
 */
public final class DashboardsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/portal/resource-manager/Microsoft.Portal/preview/2025-04-01-preview/examples/Dashboards_Update.json
     */
    /**
     * Sample code: Update a Dashboard.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void updateADashboard(com.azure.resourcemanager.portal.PortalManager manager) {
        Dashboard resource = manager.dashboards()
            .getByResourceGroupWithResponse("testRG", "testDashboard", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
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
     * specification/portal/resource-manager/Microsoft.Portal/preview/2025-04-01-preview/examples/Dashboards_Delete.json
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
 * Samples for TenantConfigurations Create.
 */
public final class TenantConfigurationsCreateSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2025-04-01-preview/examples/
     * TenantConfigurations_Create.json
     */
    /**
     * Sample code: Create or update Tenant configuration.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void createOrUpdateTenantConfiguration(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.tenantConfigurations().createWithResponse("default", null, com.azure.core.util.Context.NONE);
    }
}
```

### Dashboards_List

```java
/**
 * Samples for TenantConfigurations Delete.
 */
public final class TenantConfigurationsDeleteSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2025-04-01-preview/examples/
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

### Dashboards_ListByResourceGroup

```java
/**
 * Samples for TenantConfigurations List.
 */
public final class TenantConfigurationsListSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2025-04-01-preview/examples/
     * TenantConfigurations_List.json
     */
    /**
     * Sample code: Get list of Tenant configurations.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void getListOfTenantConfigurations(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.tenantConfigurations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Dashboards_Update

```java
/**
 * Samples for Dashboards List.
 */
public final class DashboardsListSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2025-04-01-preview/examples/
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

### ListTenantConfigurationViolations_List

```java
/**
 * Samples for Dashboards ListByResourceGroup.
 */
public final class DashboardsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2025-04-01-preview/examples/
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

### Operations_List

```java
/**
 * Samples for ListTenantConfigurationViolations List.
 */
public final class ListTenantConfigurationViolationsListSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2025-04-01-preview/examples/
     * ListTenantConfigurationViolations_List.json
     */
    /**
     * Sample code: List Tenant configuration Violations.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void listTenantConfigurationViolations(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.listTenantConfigurationViolations().list(com.azure.core.util.Context.NONE);
    }
}
```

### TenantConfigurations_Create

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/portal/resource-manager/Microsoft.Portal/preview/2025-04-01-preview/examples/Operations_List.json
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

### TenantConfigurations_Delete

```java
/**
 * Samples for TenantConfigurations Get.
 */
public final class TenantConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2025-04-01-preview/examples/
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

### TenantConfigurations_Get

```java
/**
 * Samples for Dashboards CreateOrUpdate.
 */
public final class DashboardsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/portal/resource-manager/Microsoft.Portal/preview/2025-04-01-preview/examples/
     * Dashboards_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update a Dashboard.
     * 
     * @param manager Entry point to PortalManager.
     */
    public static void createOrUpdateADashboard(com.azure.resourcemanager.portal.PortalManager manager) {
        manager.dashboards()
            .define("testDashboard")
            .withRegion((String) null)
            .withExistingResourceGroup("testRG")
            .create();
    }
}
```

### TenantConfigurations_List

```java
/**
 * Samples for Dashboards GetByResourceGroup.
 */
public final class DashboardsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/portal/resource-manager/Microsoft.Portal/preview/2025-04-01-preview/examples/Dashboards_Get.json
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

