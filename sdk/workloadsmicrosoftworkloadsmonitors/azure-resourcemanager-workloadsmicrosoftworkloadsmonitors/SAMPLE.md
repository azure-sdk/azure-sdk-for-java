# Code snippets and samples


## AlertTemplates

- [Get](#alerttemplates_get)
- [List](#alerttemplates_list)

## Alerts

- [Create](#alerts_create)
- [Delete](#alerts_delete)
- [Get](#alerts_get)
- [List](#alerts_list)

## Monitors

- [Create](#monitors_create)
- [Delete](#monitors_delete)
- [GetByResourceGroup](#monitors_getbyresourcegroup)
- [List](#monitors_list)
- [ListByResourceGroup](#monitors_listbyresourcegroup)
- [Update](#monitors_update)

## Operations

- [List](#operations_list)

## ProviderInstances

- [Create](#providerinstances_create)
- [Delete](#providerinstances_delete)
- [Get](#providerinstances_get)
- [ListByMonitor](#providerinstances_listbymonitor)

## SapLandscapeMonitor

- [Create](#saplandscapemonitor_create)
- [Delete](#saplandscapemonitor_delete)
- [Get](#saplandscapemonitor_get)
- [ListByMonitor](#saplandscapemonitor_listbymonitor)
- [Update](#saplandscapemonitor_update)
### AlertTemplates_Get

```java
/**
 * Samples for AlertTemplates Get.
 */
public final class AlertTemplatesGetSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * AlertTemplates_Get.json
     */
    /**
     * Sample code: Get properties of an Alert Template.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void getPropertiesOfAnAlertTemplate(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.alertTemplates()
            .getWithResponse("myResourceGroup", "mySapMonitor", "saphana-cpu-memory-health",
                com.azure.core.util.Context.NONE);
    }
}
```

### AlertTemplates_List

```java
/**
 * Samples for AlertTemplates List.
 */
public final class AlertTemplatesListSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * AlertTemplates_List.json
     */
    /**
     * Sample code: List all Alert Templates in a subscription.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void listAllAlertTemplatesInASubscription(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.alertTemplates().list("myResourceGroup", "mySapMonitor", "SapHana", com.azure.core.util.Context.NONE);
    }
}
```

### Alerts_Create

```java
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.AlertAutoMitigate;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.AlertQueryParameter;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.AlertRuleProperties;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.AlertRuleStatus;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.ConditionalOperator;
import java.util.Arrays;

/**
 * Samples for Alerts Create.
 */
public final class AlertsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * Alerts_Create.json
     */
    /**
     * Sample code: Creates an Alert.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        createsAnAlert(com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.alerts()
            .define("myAlert")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withTemplateName("saphana-cpu-memory-health")
            .withProviderType("SapHana")
            .withProviderNames(Arrays.asList("hana-provider-1", "hana-provider-2"))
            .withAlertRuleProperties(new AlertRuleProperties().withStatus(AlertRuleStatus.ENABLED)
                .withSeverity(3)
                .withActionGroups(Arrays.asList(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.insights/actiongroups/actiongroup1",
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.insights/actiongroups/actiongroup2"))
                .withThreshold(80)
                .withThresholdOperator(ConditionalOperator.GREATER_THAN)
                .withWindowSize(15)
                .withEvaluationFrequency(5)
                .withFailingPeriodsToAlert(3)
                .withFailingPeriodsOperator(ConditionalOperator.GREATER_THAN)
                .withMuteActionsDuration(0)
                .withAutoMitigate(AlertAutoMitigate.DISABLE)
                .withDimension("cpu")
                .withAlertQueryParameters(
                    Arrays.asList(new AlertQueryParameter().withName("providerInstance").withValue(""),
                        new AlertQueryParameter().withName("workType").withValue(""))))
            .create();
    }
}
```

### Alerts_Delete

```java
/**
 * Samples for Alerts Delete.
 */
public final class AlertsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * Alerts_Delete.json
     */
    /**
     * Sample code: Deletes an Alert.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        deletesAnAlert(com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.alerts().delete("myResourceGroup", "mySapMonitor", "myAlert", com.azure.core.util.Context.NONE);
    }
}
```

### Alerts_Get

```java
/**
 * Samples for Alerts Get.
 */
public final class AlertsGetSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * Alerts_Get.json
     */
    /**
     * Sample code: Get properties of an Alert.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        getPropertiesOfAnAlert(com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.alerts()
            .getWithResponse("myResourceGroup", "mySapMonitor", "myAlert", com.azure.core.util.Context.NONE);
    }
}
```

### Alerts_List

```java
/**
 * Samples for Alerts List.
 */
public final class AlertsListSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * Alerts_List.json
     */
    /**
     * Sample code: List all Alerts in a subscription.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void listAllAlertsInASubscription(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.alerts().list("myResourceGroup", "mySapMonitor", com.azure.core.util.Context.NONE);
    }
}
```

### Monitors_Create

```java
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.AppServicePlanConfiguration;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.AppServicePlanTier;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.ManagedResourceGroupConfiguration;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.ManagedServiceIdentity;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.RoutingPreference;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Monitors Create.
 */
public final class MonitorsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * Monitors_Create_Create_A_Sap_Monitor.json
     */
    /**
     * Sample code: Create a SAP monitor.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        createASAPMonitor(com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.monitors()
            .define("mySapMonitor")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("key", "fakeTokenPlaceholder"))
            .withAppLocation("westus")
            .withRoutingPreference(RoutingPreference.ROUTE_ALL)
            .withManagedResourceGroupConfiguration(new ManagedResourceGroupConfiguration().withName("myManagedRg"))
            .withLogAnalyticsWorkspaceArmId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/microsoft.operationalinsights/workspaces/myWorkspace")
            .withMonitorSubnet(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/myVnet/subnets/mySubnet")
            .withAppServicePlanConfiguration(
                new AppServicePlanConfiguration().withTier(AppServicePlanTier.ELASTIC_PREMIUM).withCapacity(1))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * Monitors_Create_Create_A_Sap_Monitor_With_System_Assigned_Identity.json
     */
    /**
     * Sample code: Create a SAP monitor with system assigned identity.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createASAPMonitorWithSystemAssignedIdentity(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.monitors()
            .define("mySapMonitor")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("key", "fakeTokenPlaceholder"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED))
            .withAppLocation("westus")
            .withRoutingPreference(RoutingPreference.ROUTE_ALL)
            .withManagedResourceGroupConfiguration(new ManagedResourceGroupConfiguration().withName("myManagedRg"))
            .withLogAnalyticsWorkspaceArmId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/microsoft.operationalinsights/workspaces/myWorkspace")
            .withMonitorSubnet(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/myVnet/subnets/mySubnet")
            .withAppServicePlanConfiguration(
                new AppServicePlanConfiguration().withTier(AppServicePlanTier.ELASTIC_PREMIUM).withCapacity(1))
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

### Monitors_Delete

```java
/**
 * Samples for Monitors Delete.
 */
public final class MonitorsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * Monitors_Delete.json
     */
    /**
     * Sample code: Deletes a SAP monitor.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        deletesASAPMonitor(com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.monitors().delete("myResourceGroup", "mySapMonitor", com.azure.core.util.Context.NONE);
    }
}
```

### Monitors_GetByResourceGroup

```java
/**
 * Samples for Monitors GetByResourceGroup.
 */
public final class MonitorsGetByResourceGroup {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * Monitors_Get.json
     */
    /**
     * Sample code: Get properties of a SAP monitor.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void getPropertiesOfASAPMonitor(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.monitors()
            .getByResourceGroupWithResponse("myResourceGroup", "mySapMonitor", com.azure.core.util.Context.NONE);
    }
}
```

### Monitors_List

```java
/**
 * Samples for Monitors List.
 */
public final class MonitorsListSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * Monitors_List.json
     */
    /**
     * Sample code: List all SAP monitors in a subscription.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void listAllSAPMonitorsInASubscription(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.monitors().list(com.azure.core.util.Context.NONE);
    }
}
```

### Monitors_ListByResourceGroup

```java
/**
 * Samples for Monitors ListByResourceGroup.
 */
public final class MonitorsListByResourceGrou {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * Monitors_ListByResourceGroup.json
     */
    /**
     * Sample code: List all SAP monitors in a resource group.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void listAllSAPMonitorsInAResourceGroup(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.monitors().listByResourceGroup("example-rg", com.azure.core.util.Context.NONE);
    }
}
```

### Monitors_Update

```java
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.ManagedServiceIdentity;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.Monitor;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Monitors Update.
 */
public final class MonitorsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * Monitors_Update_Delete_Tags_Field_Of_A_Sap_Monitor.json
     */
    /**
     * Sample code: Delete Tags field of a SAP monitor.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void deleteTagsFieldOfASAPMonitor(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        Monitor resource = manager.monitors()
            .getByResourceGroupWithResponse("myResourceGroup", "mySapMonitor", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf())
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.NONE))
            .apply();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * Monitors_Update_Update_Tags_Field_Of_A_Sap_Monitor.json
     */
    /**
     * Sample code: Update Tags field of a SAP monitor.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void updateTagsFieldOfASAPMonitor(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        Monitor resource = manager.monitors()
            .getByResourceGroupWithResponse("myResourceGroup", "mySapMonitor", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("testkey", "fakeTokenPlaceholder"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED))
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

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/operations/preview/2024-02-01-preview/examples/
     * Operations_List.json
     */
    /**
     * Sample code: List the operations for the provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void listTheOperationsForTheProvider(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### ProviderInstances_Create

```java
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.Db2ProviderInstanceProperties;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.HanaDbProviderInstanceProperties;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.MsSqlServerProviderInstanceProperties;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.OracleProviderInstanceProperties;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.PrometheusHaClusterProviderInstanceProperties;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.PrometheusOsProviderInstanceProperties;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.SapNetWeaverProviderInstanceProperties;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.SslPreference;
import java.util.Arrays;

/**
 * Samples for ProviderInstances Create.
 */
public final class ProviderInstancesCreateSam {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Db2_Provider_With_Root_Certificate.json
     */
    /**
     * Sample code: Create a Db2 provider with Root Certificate.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createADb2ProviderWithRootCertificate(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new Db2ProviderInstanceProperties().withHostname("hostname")
                .withDbName("dbName")
                .withDbPort("dbPort")
                .withDbUsername("username")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSapSid("SID")
                .withSslPreference(SslPreference.ROOT_CERTIFICATE))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Sap_Monitor_Oracle_provider.json
     */
    /**
     * Sample code: Create a Oracle provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        createAOracleProvider(com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new OracleProviderInstanceProperties().withHostname("hostname")
                .withDbPort("dbPort")
                .withDbName("dbName")
                .withDbUsername("username")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSapSid("SID")
                .withSslPreference(SslPreference.SERVER_CERTIFICATE)
                .withSslCertificateUri("https://storageaccount.blob.core.windows.net/containername/filename"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Sap_Monitor_Hana_Provider.json
     */
    /**
     * Sample code: Create a SAP monitor Hana provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createASAPMonitorHanaProvider(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new HanaDbProviderInstanceProperties().withHostname("name")
                .withDbName("db")
                .withSqlPort("0000")
                .withInstanceNumber("00")
                .withDbUsername("user")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSslCertificateUri("https://storageaccount.blob.core.windows.net/containername/filename")
                .withSslHostnameInCertificate("xyz.domain.com")
                .withSslPreference(SslPreference.SERVER_CERTIFICATE)
                .withSapSid("SID"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Sap_Monitor_Net_Weaver_Provider_With_Root_Certificate.json
     */
    /**
     * Sample code: Create a SAP monitor NetWeaver provider with Root Certificate.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createASAPMonitorNetWeaverProviderWithRootCertificate(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new SapNetWeaverProviderInstanceProperties().withSapSid("SID")
                .withSapHostname("name")
                .withSapInstanceNr("00")
                .withSapHostFileEntries(Arrays.asList("127.0.0.1 name fqdn"))
                .withSapUsername("username")
                .withSapPassword("fakeTokenPlaceholder")
                .withSapPasswordUri("fakeTokenPlaceholder")
                .withSapClientId("111")
                .withSapPortNumber("1234")
                .withSslPreference(SslPreference.ROOT_CERTIFICATE))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Ms_Sql_Server_Provider_With_Root_Certificate.json
     */
    /**
     * Sample code: Create a MsSqlServer provider with Root Certificate.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createAMsSqlServerProviderWithRootCertificate(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new MsSqlServerProviderInstanceProperties().withHostname("hostname")
                .withDbPort("5912")
                .withDbUsername("user")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSapSid("sid")
                .withSslPreference(SslPreference.ROOT_CERTIFICATE))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Os_Provider_With_Root_Certificate.json
     */
    /**
     * Sample code: Create a OS provider with Root Certificate.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createAOSProviderWithRootCertificate(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(
                new PrometheusOsProviderInstanceProperties().withPrometheusUrl("http://192.168.0.0:9090/metrics")
                    .withSslPreference(SslPreference.ROOT_CERTIFICATE)
                    .withSapSid("SID"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Sap_Monitor_Hana_Provider_With_Root_Certificate.json
     */
    /**
     * Sample code: Create a SAP monitor Hana provider with Root Certificate.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createASAPMonitorHanaProviderWithRootCertificate(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new HanaDbProviderInstanceProperties().withHostname("name")
                .withDbName("db")
                .withSqlPort("0000")
                .withInstanceNumber("00")
                .withDbUsername("user")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSslHostnameInCertificate("xyz.domain.com")
                .withSslPreference(SslPreference.ROOT_CERTIFICATE)
                .withSapSid("SID"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Ms_Sql_Server_Provider.json
     */
    /**
     * Sample code: Create a MsSqlServer provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createAMsSqlServerProvider(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new MsSqlServerProviderInstanceProperties().withHostname("hostname")
                .withDbPort("5912")
                .withDbUsername("user")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSapSid("sid")
                .withSslPreference(SslPreference.SERVER_CERTIFICATE)
                .withSslCertificateUri("https://storageaccount.blob.core.windows.net/containername/filename"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Sap_Monitor_Oracle_Provider_With_Root_Certificate.json
     */
    /**
     * Sample code: Create a SAP monitor Oracle provider with Root Certificate.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createASAPMonitorOracleProviderWithRootCertificate(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new OracleProviderInstanceProperties().withHostname("hostname")
                .withDbPort("dbPort")
                .withDbName("dbName")
                .withDbUsername("username")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSapSid("SID")
                .withSslPreference(SslPreference.ROOT_CERTIFICATE))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Prometheus_Ha_Cluster_Provider.json
     */
    /**
     * Sample code: Create a PrometheusHaCluster provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createAPrometheusHaClusterProvider(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(
                new PrometheusHaClusterProviderInstanceProperties().withPrometheusUrl("http://192.168.0.0:9090/metrics")
                    .withHostname("hostname")
                    .withSid("sid")
                    .withClusterName("clusterName")
                    .withSslPreference(SslPreference.SERVER_CERTIFICATE)
                    .withSslCertificateUri("https://storageaccount.blob.core.windows.net/containername/filename"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Prometheus_Ha_Cluster_Provider_With_Root_Certificate.json
     */
    /**
     * Sample code: Create a PrometheusHaCluster provider with Root Certificate.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createAPrometheusHaClusterProviderWithRootCertificate(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(
                new PrometheusHaClusterProviderInstanceProperties().withPrometheusUrl("http://192.168.0.0:9090/metrics")
                    .withHostname("hostname")
                    .withSid("sid")
                    .withClusterName("clusterName")
                    .withSslPreference(SslPreference.ROOT_CERTIFICATE))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Db2_Provider.json
     */
    /**
     * Sample code: Create a Db2 provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        createADb2Provider(com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new Db2ProviderInstanceProperties().withHostname("hostname")
                .withDbName("dbName")
                .withDbPort("dbPort")
                .withDbUsername("username")
                .withDbPassword("fakeTokenPlaceholder")
                .withDbPasswordUri("fakeTokenPlaceholder")
                .withSapSid("SID")
                .withSslPreference(SslPreference.SERVER_CERTIFICATE)
                .withSslCertificateUri("https://storageaccount.blob.core.windows.net/containername/filename"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Os_Provider.json
     */
    /**
     * Sample code: Create a OS provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void
        createAOSProvider(com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(
                new PrometheusOsProviderInstanceProperties().withPrometheusUrl("http://192.168.0.0:9090/metrics")
                    .withSslPreference(SslPreference.SERVER_CERTIFICATE)
                    .withSslCertificateUri("https://storageaccount.blob.core.windows.net/containername/filename")
                    .withSapSid("SID"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Create_Create_A_Sap_Monitor_Net_Weaver_Provider.json
     */
    /**
     * Sample code: Create a SAP monitor NetWeaver provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createASAPMonitorNetWeaverProvider(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .define("myProviderInstance")
            .withExistingMonitor("myResourceGroup", "mySapMonitor")
            .withProviderSettings(new SapNetWeaverProviderInstanceProperties().withSapSid("SID")
                .withSapHostname("name")
                .withSapInstanceNr("00")
                .withSapHostFileEntries(Arrays.asList("127.0.0.1 name fqdn"))
                .withSapUsername("username")
                .withSapPassword("fakeTokenPlaceholder")
                .withSapPasswordUri("fakeTokenPlaceholder")
                .withSapClientId("111")
                .withSapPortNumber("1234")
                .withSslCertificateUri("https://storageaccount.blob.core.windows.net/containername/filename")
                .withSslPreference(SslPreference.SERVER_CERTIFICATE))
            .create();
    }
}
```

### ProviderInstances_Delete

```java
/**
 * Samples for ProviderInstances Delete.
 */
public final class ProviderInstancesDeleteSam {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Delete.json
     */
    /**
     * Sample code: Deletes a SAP monitor provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void deletesASAPMonitorProvider(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .delete("myResourceGroup", "mySapMonitor", "myProviderInstance", com.azure.core.util.Context.NONE);
    }
}
```

### ProviderInstances_Get

```java
/**
 * Samples for ProviderInstances Get.
 */
public final class ProviderInstancesGetSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Get_Get_Properties_Of_A_Sap_Monitor_Hana_Provider.json
     */
    /**
     * Sample code: Get properties of a SAP monitor Hana provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void getPropertiesOfASAPMonitorHanaProvider(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .getWithResponse("myResourceGroup", "mySapMonitor", "myProviderInstance", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Get_Get_Properties_Of_A_Sap_Monitor_Oracle_Provider.json
     */
    /**
     * Sample code: Get properties of a SAP monitor Oracle provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void getPropertiesOfASAPMonitorOracleProvider(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .getWithResponse("myResourceGroup", "mySapMonitor", "myProviderInstance", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Get_Get_Properties_Of_A_Prometheus_Ha_Cluster_Provider.json
     */
    /**
     * Sample code: Get properties of a PrometheusHaCluster provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void getPropertiesOfAPrometheusHaClusterProvider(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .getWithResponse("myResourceGroup", "mySapMonitor", "myProviderInstance", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Get_Get_Properties_Of_A_Os_Provider.json
     */
    /**
     * Sample code: Get properties of a OS provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void getPropertiesOfAOSProvider(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .getWithResponse("myResourceGroup", "mySapMonitor", "myProviderInstance", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Get_Get_Properties_Of_A_Db2_Provider.json
     */
    /**
     * Sample code: Get properties of a Db2 provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void getPropertiesOfADb2Provider(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .getWithResponse("myResourceGroup", "mySapMonitor", "myProviderInstance", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Get_Get_Properties_Of_A_Ms_Sql_Server_Provider.json
     */
    /**
     * Sample code: Get properties of a MsSqlServer provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void getPropertiesOfAMsSqlServerProvider(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .getWithResponse("myResourceGroup", "mySapMonitor", "myProviderInstance", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_Get_Get_Properties_Of_A_Sap_Monitor_Net_Weaver_Provider.json
     */
    /**
     * Sample code: Get properties of a SAP monitor NetWeaver provider.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void getPropertiesOfASAPMonitorNetWeaverProvider(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances()
            .getWithResponse("myResourceGroup", "mySapMonitor", "myProviderInstance", com.azure.core.util.Context.NONE);
    }
}
```

### ProviderInstances_ListByMonitor

```java
/**
 * Samples for ProviderInstances ListByMonitor.
 */
public final class ProviderInstancesListByMon {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * ProviderInstances_List.json
     */
    /**
     * Sample code: List all SAP monitors providers in a subscription.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void listAllSAPMonitorsProvidersInASubscription(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.providerInstances().listByMonitor("myResourceGroup", "mySapMonitor", com.azure.core.util.Context.NONE);
    }
}
```

### SapLandscapeMonitor_Create

```java
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.fluent.models.SapLandscapeMonitorResourceInner;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.SapLandscapeMonitorMetricThresholds;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.SapLandscapeMonitorPropertiesGrouping;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.SapLandscapeMonitorSidMapping;
import java.util.Arrays;

/**
 * Samples for SapLandscapeMonitor Create.
 */
public final class SapLandscapeMonitorCreateS {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * SapLandscapeMonitor_Create.json
     */
    /**
     * Sample code: Create SAP landscape monitor.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createSAPLandscapeMonitor(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.sapLandscapeMonitors()
            .createWithResponse("myResourceGroup", "mySapMonitor",
                new SapLandscapeMonitorResourceInner()
                    .withGrouping(new SapLandscapeMonitorPropertiesGrouping()
                        .withLandscape(Arrays.asList(new SapLandscapeMonitorSidMapping().withName("Prod")
                            .withTopSid(Arrays.asList("SID1", "SID2"))))
                        .withSapApplication(Arrays.asList(new SapLandscapeMonitorSidMapping().withName("ERP1")
                            .withTopSid(Arrays.asList("SID1", "SID2")))))
                    .withTopMetricsThresholds(
                        Arrays.asList(new SapLandscapeMonitorMetricThresholds().withName("Instance Availability")
                            .withGreen(90.0F)
                            .withYellow(75.0F)
                            .withRed(50.0F))),
                com.azure.core.util.Context.NONE);
    }
}
```

### SapLandscapeMonitor_Delete

```java
/**
 * Samples for SapLandscapeMonitor Delete.
 */
public final class SapLandscapeMonitorDeleteS {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * SapLandscapeMonitor_Delete.json
     */
    /**
     * Sample code: Deletes SAP landscape monitor.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void deletesSAPLandscapeMonitor(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.sapLandscapeMonitors()
            .deleteByResourceGroupWithResponse("myResourceGroup", "mySapMonitor", com.azure.core.util.Context.NONE);
    }
}
```

### SapLandscapeMonitor_Get

```java
/**
 * Samples for SapLandscapeMonitor Get.
 */
public final class SapLandscapeMonitorGetSamp {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * SapLandscapeMonitor_Get.json
     */
    /**
     * Sample code: Get properties of SAP landscape monitor.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void getPropertiesOfSAPLandscapeMonitor(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.sapLandscapeMonitors()
            .getWithResponse("myResourceGroup", "mySapMonitor", com.azure.core.util.Context.NONE);
    }
}
```

### SapLandscapeMonitor_ListByMonitor

```java
/**
 * Samples for SapLandscapeMonitor ListByMonitor.
 */
public final class SapLandscapeMonitorListByM {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * SapLandscapeMonitor_List.json
     */
    /**
     * Sample code: List the SAP landscape monitor(s).
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void listTheSAPLandscapeMonitorS(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.sapLandscapeMonitors()
            .listByMonitor("myResourceGroup", "mySapMonitor", com.azure.core.util.Context.NONE);
    }
}
```

### SapLandscapeMonitor_Update

```java
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.fluent.models.SapLandscapeMonitorResourceInner;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.SapLandscapeMonitorMetricThresholds;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.SapLandscapeMonitorPropertiesGrouping;
import com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.models.SapLandscapeMonitorSidMapping;
import java.util.Arrays;

/**
 * Samples for SapLandscapeMonitor Update.
 */
public final class SapLandscapeMonitorUpdateS {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/monitors/preview/2024-02-01-preview/examples/
     * SapLandscapeMonitor_Update.json
     */
    /**
     * Sample code: Update SAP landscape monitor.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void updateSAPLandscapeMonitor(
        com.azure.resourcemanager.workloadsmicrosoftworkloadsmonitors.WorkloadsManager manager) {
        manager.sapLandscapeMonitors()
            .updateWithResponse("myResourceGroup", "mySapMonitor",
                new SapLandscapeMonitorResourceInner()
                    .withGrouping(new SapLandscapeMonitorPropertiesGrouping()
                        .withLandscape(Arrays.asList(new SapLandscapeMonitorSidMapping().withName("Prod")
                            .withTopSid(Arrays.asList("SID1", "SID2"))))
                        .withSapApplication(Arrays.asList(new SapLandscapeMonitorSidMapping().withName("ERP1")
                            .withTopSid(Arrays.asList("SID1", "SID2")))))
                    .withTopMetricsThresholds(
                        Arrays.asList(new SapLandscapeMonitorMetricThresholds().withName("Instance Availability")
                            .withGreen(90.0F)
                            .withYellow(75.0F)
                            .withRed(50.0F))),
                com.azure.core.util.Context.NONE);
    }
}
```

