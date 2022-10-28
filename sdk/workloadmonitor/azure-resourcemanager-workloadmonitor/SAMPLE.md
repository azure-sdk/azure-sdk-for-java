# Code snippets and samples


## HealthMonitors

- [Get](#healthmonitors_get)
- [GetStateChange](#healthmonitors_getstatechange)
- [List](#healthmonitors_list)
- [ListStateChanges](#healthmonitors_liststatechanges)

## Operations

- [List](#operations_list)
### HealthMonitors_Get

```java
import com.azure.core.util.Context;

/** Samples for HealthMonitors Get. */
public final class HealthMonitorsGetSamples {
    /*
     * x-ms-original-file: specification/workloadmonitor/resource-manager/Microsoft.WorkloadMonitor/preview/2020-01-13-preview/examples/Monitor_GetDefault.json
     */
    /**
     * Sample code: Get monitor with default values.
     *
     * @param manager Entry point to WorkloadMonitorManager.
     */
    public static void getMonitorWithDefaultValues(
        com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager manager) {
        manager
            .healthMonitors()
            .getWithResponse(
                "bc27da3b-3ba2-4e00-a6ec-1fde64aa1e21",
                "tugamidiAlerts",
                "Microsoft.Compute",
                "virtualMachines",
                "linuxEUS",
                "logical-disks|C@3A|free-space",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloadmonitor/resource-manager/Microsoft.WorkloadMonitor/preview/2020-01-13-preview/examples/Monitor_GetExpanded.json
     */
    /**
     * Sample code: Get monitor with expanded values.
     *
     * @param manager Entry point to WorkloadMonitorManager.
     */
    public static void getMonitorWithExpandedValues(
        com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager manager) {
        manager
            .healthMonitors()
            .getWithResponse(
                "bc27da3b-3ba2-4e00-a6ec-1fde64aa1e21",
                "tugamidiAlerts",
                "Microsoft.Compute",
                "virtualMachines",
                "linuxEUS",
                "logical-disks|C@3A|free-space",
                "evidence",
                Context.NONE);
    }
}
```

### HealthMonitors_GetStateChange

```java
import com.azure.core.util.Context;

/** Samples for HealthMonitors GetStateChange. */
public final class HealthMonitorsGetStateChangeSamples {
    /*
     * x-ms-original-file: specification/workloadmonitor/resource-manager/Microsoft.WorkloadMonitor/preview/2020-01-13-preview/examples/MonitorStateChange_GetDefault.json
     */
    /**
     * Sample code: Get monitor state change with default values.
     *
     * @param manager Entry point to WorkloadMonitorManager.
     */
    public static void getMonitorStateChangeWithDefaultValues(
        com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager manager) {
        manager
            .healthMonitors()
            .getStateChangeWithResponse(
                "bc27da3b-3ba2-4e00-a6ec-1fde64aa1e21",
                "tugamidiAlerts",
                "Microsoft.Compute",
                "virtualMachines",
                "linuxEUS",
                "logical-disks|C@3A",
                "1584316800",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloadmonitor/resource-manager/Microsoft.WorkloadMonitor/preview/2020-01-13-preview/examples/MonitorStateChange_GetExpanded.json
     */
    /**
     * Sample code: Get monitor state change with expanded values.
     *
     * @param manager Entry point to WorkloadMonitorManager.
     */
    public static void getMonitorStateChangeWithExpandedValues(
        com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager manager) {
        manager
            .healthMonitors()
            .getStateChangeWithResponse(
                "bc27da3b-3ba2-4e00-a6ec-1fde64aa1e21",
                "tugamidiAlerts",
                "Microsoft.Compute",
                "virtualMachines",
                "linuxEUS",
                "logical-disks|C@3A",
                "1584316800",
                "evidence",
                Context.NONE);
    }
}
```

### HealthMonitors_List

```java
import com.azure.core.util.Context;

/** Samples for HealthMonitors List. */
public final class HealthMonitorsListSamples {
    /*
     * x-ms-original-file: specification/workloadmonitor/resource-manager/Microsoft.WorkloadMonitor/preview/2020-01-13-preview/examples/MonitorList_GetDefault.json
     */
    /**
     * Sample code: Get monitor list with default values.
     *
     * @param manager Entry point to WorkloadMonitorManager.
     */
    public static void getMonitorListWithDefaultValues(
        com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager manager) {
        manager
            .healthMonitors()
            .list(
                "bc27da3b-3ba2-4e00-a6ec-1fde64aa1e21",
                "tugamidiAlerts",
                "Microsoft.Compute",
                "virtualMachines",
                "linuxEUS",
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloadmonitor/resource-manager/Microsoft.WorkloadMonitor/preview/2020-01-13-preview/examples/MonitorList_GetFiltered.json
     */
    /**
     * Sample code: Get monitor list with filtered values.
     *
     * @param manager Entry point to WorkloadMonitorManager.
     */
    public static void getMonitorListWithFilteredValues(
        com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager manager) {
        manager
            .healthMonitors()
            .list(
                "bc27da3b-3ba2-4e00-a6ec-1fde64aa1e21",
                "tugamidiAlerts",
                "Microsoft.Compute",
                "virtualMachines",
                "linuxEUS",
                "monitorName eq 'root'",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloadmonitor/resource-manager/Microsoft.WorkloadMonitor/preview/2020-01-13-preview/examples/MonitorList_GetExpanded.json
     */
    /**
     * Sample code: Get monitor list with expanded values.
     *
     * @param manager Entry point to WorkloadMonitorManager.
     */
    public static void getMonitorListWithExpandedValues(
        com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager manager) {
        manager
            .healthMonitors()
            .list(
                "bc27da3b-3ba2-4e00-a6ec-1fde64aa1e21",
                "tugamidiAlerts",
                "Microsoft.Compute",
                "virtualMachines",
                "linuxEUS",
                null,
                "evidence,configuration",
                Context.NONE);
    }
}
```

### HealthMonitors_ListStateChanges

```java
import com.azure.core.util.Context;
import java.time.OffsetDateTime;

/** Samples for HealthMonitors ListStateChanges. */
public final class HealthMonitorsListStateChangesSamples {
    /*
     * x-ms-original-file: specification/workloadmonitor/resource-manager/Microsoft.WorkloadMonitor/preview/2020-01-13-preview/examples/MonitorHistory_GetFiltered.json
     */
    /**
     * Sample code: Get monitor state changes with filtered values.
     *
     * @param manager Entry point to WorkloadMonitorManager.
     */
    public static void getMonitorStateChangesWithFilteredValues(
        com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager manager) {
        manager
            .healthMonitors()
            .listStateChanges(
                "bc27da3b-3ba2-4e00-a6ec-1fde64aa1e21",
                "tugamidiAlerts",
                "Microsoft.Compute",
                "virtualMachines",
                "linuxEUS",
                "logical-disks|C@3A|free-space",
                "isHeartbeat eq false",
                null,
                OffsetDateTime.parse("2020-01-04T20:20:18.5765757Z"),
                OffsetDateTime.parse("2020-01-09T20:20:18.5765757Z"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloadmonitor/resource-manager/Microsoft.WorkloadMonitor/preview/2020-01-13-preview/examples/MonitorHistory_GetExpanded.json
     */
    /**
     * Sample code: Get monitor state changes with expanded values.
     *
     * @param manager Entry point to WorkloadMonitorManager.
     */
    public static void getMonitorStateChangesWithExpandedValues(
        com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager manager) {
        manager
            .healthMonitors()
            .listStateChanges(
                "bc27da3b-3ba2-4e00-a6ec-1fde64aa1e21",
                "tugamidiAlerts",
                "Microsoft.Compute",
                "virtualMachines",
                "linuxEUS",
                "logical-disks|C@3A",
                null,
                "evidence,configuration",
                OffsetDateTime.parse("2020-10-19T07:22:25.824Z"),
                OffsetDateTime.parse("2020-10-21T13:22:25.822Z"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloadmonitor/resource-manager/Microsoft.WorkloadMonitor/preview/2020-01-13-preview/examples/MonitorHistory_GetDefault.json
     */
    /**
     * Sample code: Get monitor state changes with default values.
     *
     * @param manager Entry point to WorkloadMonitorManager.
     */
    public static void getMonitorStateChangesWithDefaultValues(
        com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager manager) {
        manager
            .healthMonitors()
            .listStateChanges(
                "bc27da3b-3ba2-4e00-a6ec-1fde64aa1e21",
                "tugamidiAlerts",
                "Microsoft.Compute",
                "virtualMachines",
                "linuxEUS",
                "logical-disks|C@3A",
                null,
                null,
                OffsetDateTime.parse("2020-10-19T19:24:14Z"),
                OffsetDateTime.parse("2020-10-20T01:24:14Z"),
                Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/workloadmonitor/resource-manager/Microsoft.WorkloadMonitor/preview/2020-01-13-preview/examples/OperationList_Get.json
     */
    /**
     * Sample code: OperationList_Get.
     *
     * @param manager Entry point to WorkloadMonitorManager.
     */
    public static void operationListGet(com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

