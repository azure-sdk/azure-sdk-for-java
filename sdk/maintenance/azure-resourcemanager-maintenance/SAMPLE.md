# Code snippets and samples


## ApplyUpdateForResourceGroupOperationGroup

- [ListByResourceGroup](#applyupdateforresourcegroupoperationgroup_listbyresourcegroup)

## ApplyUpdateOperationGroup

- [CreateOrUpdateOrCancel](#applyupdateoperationgroup_createorupdateorcancel)
- [Get](#applyupdateoperationgroup_get)
- [List](#applyupdateoperationgroup_list)

## ApplyUpdates

- [GetParent](#applyupdates_getparent)

## ApplyUpdatesOperationGroup

- [CreateOrUpdate](#applyupdatesoperationgroup_createorupdate)
- [CreateOrUpdateParent](#applyupdatesoperationgroup_createorupdateparent)

## ConfigurationAssignmentForResourceGroupOperationGroup

- [List](#configurationassignmentforresourcegroupoperationgroup_list)

## ConfigurationAssignmentOperationGroup

- [CreateOrUpdate](#configurationassignmentoperationgroup_createorupdate)
- [Delete](#configurationassignmentoperationgroup_delete)
- [Get](#configurationassignmentoperationgroup_get)

## ConfigurationAssignments

- [CreateOrUpdateParent](#configurationassignments_createorupdateparent)
- [DeleteParent](#configurationassignments_deleteparent)
- [GetParent](#configurationassignments_getparent)
- [ListParent](#configurationassignments_listparent)

## ConfigurationAssignmentsForResourceGroup

- [CreateOrUpdate](#configurationassignmentsforresourcegroup_createorupdate)
- [Delete](#configurationassignmentsforresourcegroup_delete)
- [GetByResourceGroup](#configurationassignmentsforresourcegroup_getbyresourcegroup)
- [Update](#configurationassignmentsforresourcegroup_update)

## ConfigurationAssignmentsForSubscriptions

- [CreateOrUpdate](#configurationassignmentsforsubscriptions_createorupdate)
- [Delete](#configurationassignmentsforsubscriptions_delete)
- [Get](#configurationassignmentsforsubscriptions_get)
- [List](#configurationassignmentsforsubscriptions_list)
- [Update](#configurationassignmentsforsubscriptions_update)

## MaintenanceConfigurationOperationGroup

- [CreateOrUpdate](#maintenanceconfigurationoperationgroup_createorupdate)
- [Delete](#maintenanceconfigurationoperationgroup_delete)
- [GetByResourceGroup](#maintenanceconfigurationoperationgroup_getbyresourcegroup)
- [List](#maintenanceconfigurationoperationgroup_list)
- [ListByResourceGroup](#maintenanceconfigurationoperationgroup_listbyresourcegroup)
- [Update](#maintenanceconfigurationoperationgroup_update)

## MaintenanceConfigurations

- [Get](#maintenanceconfigurations_get)
- [List](#maintenanceconfigurations_list)

## Operations

- [List](#operations_list)

## ScheduledEventOperationGroup

- [Acknowledge](#scheduledeventoperationgroup_acknowledge)

## UpdatesOperationGroup

- [List](#updatesoperationgroup_list)
- [ListParent](#updatesoperationgroup_listparent)
### ApplyUpdateForResourceGroupOperationGroup_ListByResourceGroup

```java
/**
 * Samples for ApplyUpdates GetParent.
 */
public final class ApplyUpdatesGetParentSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ApplyUpdates_GetParent.json
     */
    /**
     * Sample code: ApplyUpdates_GetParent.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void applyUpdatesGetParent(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.applyUpdates()
            .getParentWithResponse("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                "virtualMachines", "smdvm1", "e9b9685d-78e4-44c4-a81c-64a14f9b87b6", com.azure.core.util.Context.NONE);
    }
}
```

### ApplyUpdateOperationGroup_CreateOrUpdateOrCancel

```java
/**
 * Samples for ConfigurationAssignments GetParent.
 */
public final class ConfigurationAssignmentsGetParentSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignments_GetParent.json
     */
    /**
     * Sample code: ConfigurationAssignments_GetParent.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        configurationAssignmentsGetParent(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignments()
            .getParentWithResponse("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                "virtualMachines", "smdvm1", "workervmPolicy", com.azure.core.util.Context.NONE);
    }
}
```

### ApplyUpdateOperationGroup_Get

```java
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;

/**
 * Samples for ConfigurationAssignmentOperationGroup CreateOrUpdate.
 */
public final class ConfigurationAssignmentOperationGroupCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignments_CreateOrUpdate.json
     */
    /**
     * Sample code: ConfigurationAssignments_CreateOrUpdate.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        configurationAssignmentsCreateOrUpdate(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentOperationGroups()
            .createOrUpdateWithResponse("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                "workervmConfiguration",
                new ConfigurationAssignmentInner().withMaintenanceConfigurationId(
                    "/subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourcegroups/examplerg/providers/Microsoft.Maintenance/maintenanceConfigurations/configuration1"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ApplyUpdateOperationGroup_List

```java
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignment;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignmentFilterProperties;
import com.azure.resourcemanager.maintenance.models.TagOperators;
import com.azure.resourcemanager.maintenance.models.TagSettingsProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ConfigurationAssignmentsForSubscriptions Update.
 */
public final class ConfigurationAssignmentsForSubscriptionsUpdateSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignmentsForSubscriptions_UpdateForResource.json
     */
    /**
     * Sample code: ConfigurationAssignmentsForSubscriptions_CreateOrUpdate.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void configurationAssignmentsForSubscriptionsCreateOrUpdate(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        ConfigurationAssignment resource = manager.configurationAssignmentsForSubscriptions()
            .getWithResponse("workervmConfiguration", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withMaintenanceConfigurationId(
                "/subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourcegroups/examplerg/providers/Microsoft.Maintenance/maintenanceConfigurations/configuration1")
            .withFilter(
                new ConfigurationAssignmentFilterProperties()
                    .withResourceTypes(
                        Arrays.asList("Microsoft.HybridCompute/machines", "Microsoft.Compute/virtualMachines"))
                    .withResourceGroups(Arrays.asList("RG1", "RG2"))
                    .withLocations(Arrays.asList("Japan East", "UK South"))
                    .withTagSettings(new TagSettingsProperties()
                        .withTags(mapOf("tag1", Arrays.asList("tag1Value1", "tag1Value2", "tag1Value3"), "tag2",
                            Arrays.asList("tag2Value1", "tag2Value2", "tag2Value3")))
                        .withFilterOperator(TagOperators.ANY)))
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

### ApplyUpdates_GetParent

```java
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignmentFilterProperties;
import com.azure.resourcemanager.maintenance.models.TagOperators;
import com.azure.resourcemanager.maintenance.models.TagSettingsProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ConfigurationAssignmentsForResourceGroup CreateOrUpdate.
 */
public final class ConfigurationAssignmentsForResourceGroupCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignmentsForResourceGroup_CreateOrUpdate.json
     */
    /**
     * Sample code: ConfigurationAssignmentsForResourceGroup_CreateOrUpdate.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void configurationAssignmentsForResourceGroupCreateOrUpdate(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentsForResourceGroups()
            .createOrUpdateWithResponse("examplerg", "workervmConfiguration",
                new ConfigurationAssignmentInner().withMaintenanceConfigurationId(
                    "/subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourcegroups/examplerg/providers/Microsoft.Maintenance/maintenanceConfigurations/configuration1")
                    .withFilter(new ConfigurationAssignmentFilterProperties()
                        .withResourceTypes(
                            Arrays.asList("Microsoft.HybridCompute/machines", "Microsoft.Compute/virtualMachines"))
                        .withLocations(Arrays.asList("Japan East", "UK South"))
                        .withTagSettings(new TagSettingsProperties()
                            .withTags(mapOf("tag1", Arrays.asList("tag1Value1", "tag1Value2", "tag1Value3"), "tag2",
                                Arrays.asList("tag2Value1", "tag2Value2", "tag2Value3")))
                            .withFilterOperator(TagOperators.ANY))),
                com.azure.core.util.Context.NONE);
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

### ApplyUpdatesOperationGroup_CreateOrUpdate

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void operationsList(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### ApplyUpdatesOperationGroup_CreateOrUpdateParent

```java
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignmentFilterProperties;
import com.azure.resourcemanager.maintenance.models.TagOperators;
import com.azure.resourcemanager.maintenance.models.TagSettingsProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ConfigurationAssignmentsForSubscriptions CreateOrUpdate.
 */
public final class ConfigurationAssignmentsForSubscriptionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignmentsForSubscriptions_CreateOrUpdate.json
     */
    /**
     * Sample code: ConfigurationAssignmentsForSubscriptions_CreateOrUpdate.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void configurationAssignmentsForSubscriptionsCreateOrUpdate(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentsForSubscriptions()
            .define("workervmConfiguration")
            .withMaintenanceConfigurationId(
                "/subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourcegroups/examplerg/providers/Microsoft.Maintenance/maintenanceConfigurations/configuration1")
            .withFilter(
                new ConfigurationAssignmentFilterProperties()
                    .withResourceTypes(
                        Arrays.asList("Microsoft.HybridCompute/machines", "Microsoft.Compute/virtualMachines"))
                    .withResourceGroups(Arrays.asList("RG1", "RG2"))
                    .withLocations(Arrays.asList("Japan East", "UK South"))
                    .withTagSettings(new TagSettingsProperties()
                        .withTags(mapOf("tag1", Arrays.asList("tag1Value1", "tag1Value2", "tag1Value3"), "tag2",
                            Arrays.asList("tag2Value1", "tag2Value2", "tag2Value3")))
                        .withFilterOperator(TagOperators.ANY)))
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

### ConfigurationAssignmentForResourceGroupOperationGroup_List

```java
/**
 * Samples for MaintenanceConfigurationOperationGroup ListByResourceGroup.
 */
public final class MaintenanceConfigurationOperationGroupListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/MaintenanceConfigurationsResourceGroup_List.json
     */
    /**
     * Sample code: MaintenanceConfigurationsResourceGroup_List.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        maintenanceConfigurationsResourceGroupList(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.maintenanceConfigurationOperationGroups()
            .listByResourceGroup("examplerg", com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignmentOperationGroup_CreateOrUpdate

```java
/**
 * Samples for ConfigurationAssignmentsForResourceGroup Delete.
 */
public final class ConfigurationAssignmentsForResourceGroupDeleteSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignmentsForResourceGroup_Delete.json
     */
    /**
     * Sample code: ConfigurationAssignmentsForResourceGroup_Delete.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void configurationAssignmentsForResourceGroupDelete(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentsForResourceGroups()
            .deleteByResourceGroupWithResponse("examplerg", "workervmConfiguration", com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignmentOperationGroup_Delete

```java
/**
 * Samples for ConfigurationAssignments DeleteParent.
 */
public final class ConfigurationAssignmentsDeleteParentSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignments_DeleteParent.json
     */
    /**
     * Sample code: ConfigurationAssignments_DeleteParent.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        configurationAssignmentsDeleteParent(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignments()
            .deleteParentWithResponse("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                "virtualMachines", "smdvm1", "workervmConfiguration", com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignmentOperationGroup_Get

```java
/**
 * Samples for ScheduledEventOperationGroup Acknowledge.
 */
public final class ScheduledEventOperationGroupAcknowledgeSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ScheduledEvents_Acknowledge.json
     */
    /**
     * Sample code: ScheduledEvents_Acknowledge.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void scheduledEventsAcknowledge(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.scheduledEventOperationGroups()
            .acknowledgeWithResponse("examplerg", "virtualMachines", "configuration1",
                "ad6d85cf-2c9e-4eec-9a1e-af3213cc0486", com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignments_CreateOrUpdateParent

```java
/**
 * Samples for ConfigurationAssignmentOperationGroup Delete.
 */
public final class ConfigurationAssignmentOperationGroupDeleteSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignments_Delete.json
     */
    /**
     * Sample code: ConfigurationAssignments_Delete.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        configurationAssignmentsDelete(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentOperationGroups()
            .deleteWithResponse("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                "workervmConfiguration", com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignments_DeleteParent

```java
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignmentFilterProperties;
import com.azure.resourcemanager.maintenance.models.TagOperators;
import com.azure.resourcemanager.maintenance.models.TagSettingsProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ConfigurationAssignmentsForResourceGroup Update.
 */
public final class ConfigurationAssignmentsForResourceGroupUpdateSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignmentsForResourceGroup_UpdateForResource.json
     */
    /**
     * Sample code: ConfigurationAssignmentsForResourceGroup_CreateOrUpdate.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void configurationAssignmentsForResourceGroupCreateOrUpdate(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentsForResourceGroups()
            .updateWithResponse("examplerg", "workervmConfiguration",
                new ConfigurationAssignmentInner().withMaintenanceConfigurationId(
                    "/subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourcegroups/examplerg/providers/Microsoft.Maintenance/maintenanceConfigurations/configuration1")
                    .withFilter(new ConfigurationAssignmentFilterProperties()
                        .withResourceTypes(
                            Arrays.asList("Microsoft.HybridCompute/machines", "Microsoft.Compute/virtualMachines"))
                        .withLocations(Arrays.asList("Japan East", "UK South"))
                        .withTagSettings(new TagSettingsProperties()
                            .withTags(mapOf("tag1", Arrays.asList("tag1Value1", "tag1Value2", "tag1Value3"), "tag2",
                                Arrays.asList("tag2Value1", "tag2Value2", "tag2Value3")))
                            .withFilterOperator(TagOperators.ANY))),
                com.azure.core.util.Context.NONE);
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

### ConfigurationAssignments_GetParent

```java
/**
 * Samples for MaintenanceConfigurationOperationGroup List.
 */
public final class MaintenanceConfigurationOperationGroupListSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/MaintenanceConfigurations_List.json
     */
    /**
     * Sample code: MaintenanceConfigurations_List.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void maintenanceConfigurationsList(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.maintenanceConfigurationOperationGroups().list(com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignments_ListParent

```java
/**
 * Samples for ConfigurationAssignmentsForSubscriptions Get.
 */
public final class ConfigurationAssignmentsForSubscriptionsGetSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignmentsForSubscriptions_Get.json
     */
    /**
     * Sample code: ConfigurationAssignments_GetParent.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        configurationAssignmentsGetParent(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentsForSubscriptions()
            .getWithResponse("workervmConfiguration", com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignmentsForResourceGroup_CreateOrUpdate

```java
/**
 * Samples for ConfigurationAssignmentOperationGroup Get.
 */
public final class ConfigurationAssignmentOperationGroupGetSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignments_Get.json
     */
    /**
     * Sample code: ConfigurationAssignments_Get.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void configurationAssignmentsGet(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentOperationGroups()
            .getWithResponse("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                "workervmConfiguration", com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignmentsForResourceGroup_Delete

```java
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;

/**
 * Samples for ConfigurationAssignments CreateOrUpdateParent.
 */
public final class ConfigurationAssignmentsCreateOrUpdateParentSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignments_CreateOrUpdateParent.json
     */
    /**
     * Sample code: ConfigurationAssignments_CreateOrUpdateParent.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        configurationAssignmentsCreateOrUpdateParent(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignments()
            .createOrUpdateParentWithResponse("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                "virtualMachines", "smdvm1", "workervmPolicy",
                new ConfigurationAssignmentInner().withMaintenanceConfigurationId(
                    "/subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourcegroups/examplerg/providers/Microsoft.Maintenance/maintenanceConfigurations/policy1"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignmentsForResourceGroup_GetByResourceGroup

```java
/**
 * Samples for MaintenanceConfigurationOperationGroup GetByResourceGroup.
 */
public final class MaintenanceConfigurationOperationGroupGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/MaintenanceConfigurations_GetForResource_GuestOSPatchWindows.json
     */
    /**
     * Sample code: MaintenanceConfigurations_GetForResource_GuestOSPatchWindows.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void maintenanceConfigurationsGetForResourceGuestOSPatchWindows(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.maintenanceConfigurationOperationGroups()
            .getByResourceGroupWithResponse("examplerg", "configuration1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2023-10-01-preview/MaintenanceConfigurations_GetForResource_GuestOSPatchLinux.json
     */
    /**
     * Sample code: MaintenanceConfigurations_GetForResource_GuestOSPatchLinux.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void maintenanceConfigurationsGetForResourceGuestOSPatchLinux(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.maintenanceConfigurationOperationGroups()
            .getByResourceGroupWithResponse("examplerg", "configuration1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2023-10-01-preview/MaintenanceConfigurations_GetForResource.json
     */
    /**
     * Sample code: MaintenanceConfigurations_GetForResource.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        maintenanceConfigurationsGetForResource(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.maintenanceConfigurationOperationGroups()
            .getByResourceGroupWithResponse("examplerg", "configuration1", com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignmentsForResourceGroup_Update

```java
/**
 * Samples for ApplyUpdatesOperationGroup CreateOrUpdate.
 */
public final class ApplyUpdatesOperationGroupCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ApplyUpdates_CreateOrUpdate.json
     */
    /**
     * Sample code: ApplyUpdates_CreateOrUpdate.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void applyUpdatesCreateOrUpdate(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.applyUpdatesOperationGroups()
            .createOrUpdateWithResponse("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignmentsForSubscriptions_CreateOrUpdate

```java
/**
 * Samples for ApplyUpdateOperationGroup List.
 */
public final class ApplyUpdateOperationGroupListSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ApplyUpdates_List.json
     */
    /**
     * Sample code: ApplyUpdates_List.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void applyUpdatesList(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.applyUpdateOperationGroups().list(com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignmentsForSubscriptions_Delete

```java
/**
 * Samples for ConfigurationAssignmentForResourceGroupOperationGroup List.
 */
public final class ConfigurationAssignmentForResourceGroupOperationGroupListSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignments_List.json
     */
    /**
     * Sample code: ConfigurationAssignments_List.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void configurationAssignmentsList(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentForResourceGroupOperationGroups()
            .list("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignmentsForSubscriptions_Get

```java
/**
 * Samples for MaintenanceConfigurationOperationGroup Delete.
 */
public final class MaintenanceConfigurationOperationGroupDeleteSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/MaintenanceConfigurations_DeleteForResource.json
     */
    /**
     * Sample code: MaintenanceConfigurations_DeleteForResource.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        maintenanceConfigurationsDeleteForResource(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.maintenanceConfigurationOperationGroups()
            .deleteByResourceGroupWithResponse("examplerg", "example1", com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignmentsForSubscriptions_List

```java
/**
 * Samples for ApplyUpdateOperationGroup Get.
 */
public final class ApplyUpdateOperationGroupGetSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ApplyUpdates_Get.json
     */
    /**
     * Sample code: ApplyUpdates_Get.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void applyUpdatesGet(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.applyUpdateOperationGroups()
            .getWithResponse("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                "e9b9685d-78e4-44c4-a81c-64a14f9b87b6", com.azure.core.util.Context.NONE);
    }
}
```

### ConfigurationAssignmentsForSubscriptions_Update

```java
/**
 * Samples for ConfigurationAssignments ListParent.
 */
public final class ConfigurationAssignmentsListParentSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignments_ListParent.json
     */
    /**
     * Sample code: ConfigurationAssignments_ListParent.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        configurationAssignmentsListParent(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignments()
            .listParent("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1", "virtualMachines",
                "smdtestvm1", com.azure.core.util.Context.NONE);
    }
}
```

### MaintenanceConfigurationOperationGroup_CreateOrUpdate

```java
/**
 * Samples for UpdatesOperationGroup List.
 */
public final class UpdatesOperationGroupListSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/Updates_List.json
     */
    /**
     * Sample code: Updates_List.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void updatesList(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.updatesOperationGroups()
            .list("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                com.azure.core.util.Context.NONE);
    }
}
```

### MaintenanceConfigurationOperationGroup_Delete

```java
/**
 * Samples for ConfigurationAssignmentsForSubscriptions Delete.
 */
public final class ConfigurationAssignmentsForSubscriptionsDeleteSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignmentsForSubscriptions_Delete.json
     */
    /**
     * Sample code: ConfigurationAssignmentsForSubscriptions_Delete.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void configurationAssignmentsForSubscriptionsDelete(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentsForSubscriptions()
            .deleteWithResponse("workervmConfiguration", com.azure.core.util.Context.NONE);
    }
}
```

### MaintenanceConfigurationOperationGroup_GetByResourceGroup

```java
import com.azure.resourcemanager.maintenance.models.MaintenanceScope;
import com.azure.resourcemanager.maintenance.models.Visibility;

/**
 * Samples for MaintenanceConfigurationOperationGroup CreateOrUpdate.
 */
public final class MaintenanceConfigurationOperationGroupCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/MaintenanceConfigurations_CreateOrUpdateForResource.json
     */
    /**
     * Sample code: MaintenanceConfigurations_CreateOrUpdateForResource.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void maintenanceConfigurationsCreateOrUpdateForResource(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.maintenanceConfigurationOperationGroups()
            .define("configuration1")
            .withRegion("westus2")
            .withExistingResourceGroup("examplerg")
            .withNamespace("Microsoft.Maintenance")
            .withMaintenanceScope(MaintenanceScope.OSIMAGE)
            .withVisibility(Visibility.CUSTOM)
            .withStartDateTime("2020-04-30 08:00")
            .withExpirationDateTime("9999-12-31 00:00")
            .withDuration("05:00")
            .withTimeZone("Pacific Standard Time")
            .withRecurEvery("Day")
            .create();
    }
}
```

### MaintenanceConfigurationOperationGroup_List

```java
/**
 * Samples for ConfigurationAssignmentsForResourceGroup GetByResourceGroup.
 */
public final class ConfigurationAssignmentsForResourceGroupGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignmentsForResourceGroup_Get.json
     */
    /**
     * Sample code: ConfigurationAssignmentsForResourceGroup_Get.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        configurationAssignmentsForResourceGroupGet(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentsForResourceGroups()
            .getByResourceGroupWithResponse("examplerg", "workervmConfiguration", com.azure.core.util.Context.NONE);
    }
}
```

### MaintenanceConfigurationOperationGroup_ListByResourceGroup

```java
/**
 * Samples for MaintenanceConfigurations List.
 */
public final class MaintenanceConfigurationsListSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/PublicMaintenanceConfigurations_List.json
     */
    /**
     * Sample code: PublicMaintenanceConfigurations_List.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        publicMaintenanceConfigurationsList(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.maintenanceConfigurations().list(com.azure.core.util.Context.NONE);
    }
}
```

### MaintenanceConfigurationOperationGroup_Update

```java
/**
 * Samples for MaintenanceConfigurations Get.
 */
public final class MaintenanceConfigurationsGetSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/PublicMaintenanceConfigurations_GetForResource.json
     */
    /**
     * Sample code: PublicMaintenanceConfigurations_GetForResource.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void publicMaintenanceConfigurationsGetForResource(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.maintenanceConfigurations().getWithResponse("configuration1", com.azure.core.util.Context.NONE);
    }
}
```

### MaintenanceConfigurations_Get

```java
/**
 * Samples for UpdatesOperationGroup ListParent.
 */
public final class UpdatesOperationGroupListParentSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/Updates_ListParent.json
     */
    /**
     * Sample code: Updates_ListParent.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void updatesListParent(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.updatesOperationGroups()
            .listParent("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1", "virtualMachines", "1",
                com.azure.core.util.Context.NONE);
    }
}
```

### MaintenanceConfigurations_List

```java
/**
 * Samples for ApplyUpdateForResourceGroupOperationGroup ListByResourceGroup.
 */
public final class ApplyUpdateForResourceGroupOperationGroupListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ApplyUpdatesResourceGroup_List.json
     */
    /**
     * Sample code: ApplyUpdatesResourceGroup_List.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void applyUpdatesResourceGroupList(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.applyUpdateForResourceGroupOperationGroups()
            .listByResourceGroup("examplerg", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.resourcemanager.maintenance.fluent.models.ApplyUpdateInner;
import com.azure.resourcemanager.maintenance.models.UpdateStatus;

/**
 * Samples for ApplyUpdateOperationGroup CreateOrUpdateOrCancel.
 */
public final class ApplyUpdateOperationGroupCreateOrUpdateOrCancelSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ApplyUpdates_CreateOrUpdateOnly_NoCancellation.json
     */
    /**
     * Sample code: ApplyUpdates_CreateOrUpdateOnly_NoCancellation.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        applyUpdatesCreateOrUpdateOnlyNoCancellation(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.applyUpdateOperationGroups()
            .createOrUpdateOrCancelWithResponse("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                "20230901121200", new ApplyUpdateInner(), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2023-10-01-preview/ApplyUpdates_CreateOrUpdate_CancelMaintenance.json
     */
    /**
     * Sample code: ApplyUpdates_CreateOrUpdateOrCancel.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        applyUpdatesCreateOrUpdateOrCancel(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.applyUpdateOperationGroups()
            .createOrUpdateOrCancelWithResponse("examplerg", "Microsoft.Maintenance", "maintenanceConfigurations",
                "maintenanceConfig1", "20230901121200", new ApplyUpdateInner().withStatus(UpdateStatus.CANCEL),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledEventOperationGroup_Acknowledge

```java
/**
 * Samples for ApplyUpdatesOperationGroup CreateOrUpdateParent.
 */
public final class ApplyUpdatesOperationGroupCreateOrUpdateParentSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ApplyUpdates_CreateOrUpdateParent.json
     */
    /**
     * Sample code: ApplyUpdates_CreateOrUpdateParent.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        applyUpdatesCreateOrUpdateParent(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.applyUpdatesOperationGroups()
            .createOrUpdateParentWithResponse("examplerg", "Microsoft.Compute", "virtualMachineScaleSets", "smdtest1",
                "virtualMachines", "smdvm1", com.azure.core.util.Context.NONE);
    }
}
```

### UpdatesOperationGroup_List

```java
/**
 * Samples for ConfigurationAssignmentsForSubscriptions List.
 */
public final class ConfigurationAssignmentsForSubscriptionsListSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/ConfigurationAssignmentsResultWithinSubscription_List.json
     */
    /**
     * Sample code: ConfigurationAssignmentsResultWithinSubscription_List.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void configurationAssignmentsResultWithinSubscriptionList(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.configurationAssignmentsForSubscriptions().list(com.azure.core.util.Context.NONE);
    }
}
```

### UpdatesOperationGroup_ListParent

```java
import com.azure.resourcemanager.maintenance.models.MaintenanceConfiguration;
import com.azure.resourcemanager.maintenance.models.MaintenanceScope;
import com.azure.resourcemanager.maintenance.models.Visibility;

/**
 * Samples for MaintenanceConfigurationOperationGroup Update.
 */
public final class MaintenanceConfigurationOperationGroupUpdateSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/MaintenanceConfigurations_UpdateForResource.json
     */
    /**
     * Sample code: MaintenanceConfigurations_UpdateForResource.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void
        maintenanceConfigurationsUpdateForResource(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        MaintenanceConfiguration resource = manager.maintenanceConfigurationOperationGroups()
            .getByResourceGroupWithResponse("examplerg", "configuration1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withNamespace("Microsoft.Maintenance")
            .withMaintenanceScope(MaintenanceScope.OSIMAGE)
            .withVisibility(Visibility.CUSTOM)
            .withStartDateTime("2020-04-30 08:00")
            .withExpirationDateTime("9999-12-31 00:00")
            .withDuration("05:00")
            .withTimeZone("Pacific Standard Time")
            .withRecurEvery("Month Third Sunday")
            .apply();
    }
}
```

