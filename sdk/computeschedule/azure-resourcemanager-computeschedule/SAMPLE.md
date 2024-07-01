# Code snippets and samples


## Operations

- [List](#operations_list)

## ScheduledActions

- [VirtualMachinesCancelOperations](#scheduledactions_virtualmachinescanceloperations)
- [VirtualMachinesExecuteDeallocate](#scheduledactions_virtualmachinesexecutedeallocate)
- [VirtualMachinesExecuteHibernate](#scheduledactions_virtualmachinesexecutehibernate)
- [VirtualMachinesExecuteStart](#scheduledactions_virtualmachinesexecutestart)
- [VirtualMachinesGetOperationStatus](#scheduledactions_virtualmachinesgetoperationstatus)
- [VirtualMachinesSubmitDeallocate](#scheduledactions_virtualmachinessubmitdeallocate)
- [VirtualMachinesSubmitHibernate](#scheduledactions_virtualmachinessubmithibernate)
- [VirtualMachinesSubmitStart](#scheduledactions_virtualmachinessubmitstart)
### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void operationsList(com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: ListOperations.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void listOperations(com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesCancelOperations

```java
import com.azure.resourcemanager.computeschedule.models.CancelOperationsRequest;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesCancelOperations.
 */
public final class ScheduledActionsVirtualMachinesCancelOperationsSamples {
    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesCancelOperations_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachinesCancelOperations.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void
        virtualMachinesCancelOperations(com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesCancelOperationsWithResponse("x",
                new CancelOperationsRequest().withOperationIds(Arrays.asList("hthxnybuel"))
                    .withCorrelationid("kcieaznejazchjncgdbqkuwus"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesCancelOperations_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesCancelOperations.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void scheduledActionsVirtualMachinesCancelOperations(
        com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesCancelOperationsWithResponse("xn",
                new CancelOperationsRequest().withOperationIds(Arrays.asList("hthxnybuel"))
                    .withCorrelationid("kcieaznejazchjncgdbqkuwus"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesExecuteDeallocate

```java
import com.azure.resourcemanager.computeschedule.models.ExecuteDeallocateRequest;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.Resources;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesExecuteDeallocate.
 */
public final class ScheduledActionsVirtualMachinesExecuteDeallocateSamples {
    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesExecuteDeallocate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesExecuteDeallocate.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void scheduledActionsVirtualMachinesExecuteDeallocate(
        com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesExecuteDeallocateWithResponse("snmaovwvr",
                new ExecuteDeallocateRequest()
                    .withExecutionParameters(new ExecutionParameters().withStopRetriesAfter(25)
                        .withOptimizationPreference(OptimizationPreference.COST))
                    .withResources(new Resources().withIds(Arrays.asList("wiu")))
                    .withCorrelationid("vyqcptybxjupoihnzrkyxayghbamyx"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesExecuteDeallocate_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachinesExecuteDeallocate.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void
        virtualMachinesExecuteDeallocate(com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesExecuteDeallocateWithResponse("cnuwivqjkkqefrjvnjjkjprimlsjaa",
                new ExecuteDeallocateRequest().withExecutionParameters(new ExecutionParameters())
                    .withResources(new Resources().withIds(Arrays.asList("wiu")))
                    .withCorrelationid("vyqcptybxjupoihnzrkyxayghbamyx"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesExecuteHibernate

```java
import com.azure.resourcemanager.computeschedule.models.ExecuteHibernateRequest;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.Resources;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesExecuteHibernate.
 */
public final class ScheduledActionsVirtualMachinesExecuteHibernateSamples {
    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesExecuteHibernate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesExecuteHibernate.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void scheduledActionsVirtualMachinesExecuteHibernate(
        com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesExecuteHibernateWithResponse("hjbczfxbdxtqluvrsclpg",
                new ExecuteHibernateRequest()
                    .withExecutionParameters(new ExecutionParameters().withStopRetriesAfter(25)
                        .withOptimizationPreference(OptimizationPreference.COST))
                    .withResources(new Resources().withIds(Arrays.asList("wiu")))
                    .withCorrelationid("xovcnttwqgtjqejznjfxnz"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesExecuteHibernate_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachinesExecuteHibernate.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void
        virtualMachinesExecuteHibernate(com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesExecuteHibernateWithResponse("bkazscvxcwiy",
                new ExecuteHibernateRequest().withExecutionParameters(new ExecutionParameters())
                    .withResources(new Resources().withIds(Arrays.asList("wiu")))
                    .withCorrelationid("xovcnttwqgtjqejznjfxnz"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesExecuteStart

```java
import com.azure.resourcemanager.computeschedule.models.ExecuteStartRequest;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.Resources;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesExecuteStart.
 */
public final class ScheduledActionsVirtualMachinesExecuteStartSamples {
    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesExecuteStart_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesExecuteStart.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void scheduledActionsVirtualMachinesExecuteStart(
        com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesExecuteStartWithResponse("hylyhwxfwdggu",
                new ExecuteStartRequest()
                    .withExecutionParameters(new ExecutionParameters().withStopRetriesAfter(25)
                        .withOptimizationPreference(OptimizationPreference.COST))
                    .withResources(new Resources().withIds(Arrays.asList("wiu")))
                    .withCorrelationid("nrobdckjzkn"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesExecuteStart_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachinesExecuteStart.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void
        virtualMachinesExecuteStart(com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesExecuteStartWithResponse("tgp",
                new ExecuteStartRequest().withExecutionParameters(new ExecutionParameters())
                    .withResources(new Resources().withIds(Arrays.asList("wiu")))
                    .withCorrelationid("nrobdckjzkn"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesGetOperationStatus

```java
import com.azure.resourcemanager.computeschedule.models.GetOperationStatusRequest;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesGetOperationStatus.
 */
public final class ScheduledActionsVirtualMachinesGetOperationStatusSamples {
    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesGetOperationStatus_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachinesGetOperationStatus.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void
        virtualMachinesGetOperationStatus(com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesGetOperationStatusWithResponse("lloxseiyxkunpvyvnvsnn",
                new GetOperationStatusRequest().withOperationIds(Arrays.asList("ndpzrngwneyfchfrwiqppedjwqvf"))
                    .withCorrelationid("fdjcinxauy"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesGetOperationStatus_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesGetOperationStatus.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void scheduledActionsVirtualMachinesGetOperationStatus(
        com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesGetOperationStatusWithResponse("gxpncuwqoufrimodvkfrqohloluv",
                new GetOperationStatusRequest().withOperationIds(Arrays.asList("ndpzrngwneyfchfrwiqppedjwqvf"))
                    .withCorrelationid("fdjcinxauy"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesSubmitDeallocate

```java
import com.azure.resourcemanager.computeschedule.models.DeadlineType;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.Resources;
import com.azure.resourcemanager.computeschedule.models.Schedule;
import com.azure.resourcemanager.computeschedule.models.SubmitDeallocateRequest;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesSubmitDeallocate.
 */
public final class ScheduledActionsVirtualMachinesSubmitDeallocateSamples {
    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesSubmitDeallocate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesSubmitDeallocate.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void scheduledActionsVirtualMachinesSubmitDeallocate(
        com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesSubmitDeallocateWithResponse("ppjgpzpfm",
                new SubmitDeallocateRequest()
                    .withSchedule(new Schedule().withDeadLine(OffsetDateTime.parse("2023-12-11T20:40:37.695Z"))
                        .withTimeZone("khbuiowsrknyxcgmcwvyib")
                        .withDeadlineType(DeadlineType.UNKNOWN))
                    .withExecutionParameters(new ExecutionParameters().withStopRetriesAfter(25)
                        .withOptimizationPreference(OptimizationPreference.COST))
                    .withResources(new Resources().withIds(Arrays.asList("wiu")))
                    .withCorrelationid("ehvjuaykslumubmh"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesSubmitDeallocate_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachinesSubmitDeallocate.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void
        virtualMachinesSubmitDeallocate(com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesSubmitDeallocateWithResponse("yotzpkbeglwshbjslqjp",
                new SubmitDeallocateRequest()
                    .withSchedule(new Schedule().withDeadLine(OffsetDateTime.parse("2023-12-11T20:40:37.695Z"))
                        .withTimeZone("khbuiowsrknyxcgmcwvyib")
                        .withDeadlineType(DeadlineType.UNKNOWN))
                    .withExecutionParameters(new ExecutionParameters())
                    .withResources(new Resources().withIds(Arrays.asList("wiu")))
                    .withCorrelationid("ehvjuaykslumubmh"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesSubmitHibernate

```java
import com.azure.resourcemanager.computeschedule.models.DeadlineType;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.Resources;
import com.azure.resourcemanager.computeschedule.models.Schedule;
import com.azure.resourcemanager.computeschedule.models.SubmitHibernateRequest;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesSubmitHibernate.
 */
public final class ScheduledActionsVirtualMachinesSubmitHibernateSamples {
    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesSubmitHibernate_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachinesSubmitHibernate.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void
        virtualMachinesSubmitHibernate(com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesSubmitHibernateWithResponse("lkmwxpnwko",
                new SubmitHibernateRequest()
                    .withSchedule(new Schedule().withDeadLine(OffsetDateTime.parse("2023-12-11T20:40:37.695Z"))
                        .withTimeZone("khbuiowsrknyxcgmcwvyib")
                        .withDeadlineType(DeadlineType.UNKNOWN))
                    .withExecutionParameters(new ExecutionParameters())
                    .withResources(new Resources().withIds(Arrays.asList("wiu")))
                    .withCorrelationid("mkaruggx"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesSubmitHibernate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesSubmitHibernate.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void scheduledActionsVirtualMachinesSubmitHibernate(
        com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesSubmitHibernateWithResponse("l",
                new SubmitHibernateRequest()
                    .withSchedule(new Schedule().withDeadLine(OffsetDateTime.parse("2023-12-11T20:40:37.695Z"))
                        .withTimeZone("khbuiowsrknyxcgmcwvyib")
                        .withDeadlineType(DeadlineType.UNKNOWN))
                    .withExecutionParameters(new ExecutionParameters().withStopRetriesAfter(25)
                        .withOptimizationPreference(OptimizationPreference.COST))
                    .withResources(new Resources().withIds(Arrays.asList("wiu")))
                    .withCorrelationid("mkaruggx"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesSubmitStart

```java
import com.azure.resourcemanager.computeschedule.models.DeadlineType;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.Resources;
import com.azure.resourcemanager.computeschedule.models.Schedule;
import com.azure.resourcemanager.computeschedule.models.SubmitStartRequest;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesSubmitStart.
 */
public final class ScheduledActionsVirtualMachinesSubmitStartSamples {
    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesSubmitStart_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesSubmitStart.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void scheduledActionsVirtualMachinesSubmitStart(
        com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesSubmitStartWithResponse("ffhmpekophuwgyctxihjeuehqrt",
                new SubmitStartRequest()
                    .withSchedule(new Schedule().withDeadLine(OffsetDateTime.parse("2023-12-11T20:40:37.695Z"))
                        .withTimeZone("khbuiowsrknyxcgmcwvyib")
                        .withDeadlineType(DeadlineType.UNKNOWN))
                    .withExecutionParameters(new ExecutionParameters().withStopRetriesAfter(25)
                        .withOptimizationPreference(OptimizationPreference.COST))
                    .withResources(new Resources().withIds(Arrays.asList("wiu")))
                    .withCorrelationid("inimdjmkqeyqsiptfleqvyocdvfzq"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/computeschedule/resource-manager/Microsoft.ComputeSchedule/preview/2023-12-01-preview/examples/
     * ScheduledActions_VirtualMachinesSubmitStart_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachinesSubmitStart.
     * 
     * @param manager Entry point to ComputescheduleManager.
     */
    public static void
        virtualMachinesSubmitStart(com.azure.resourcemanager.computeschedule.ComputescheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesSubmitStartWithResponse("sdbglrmzgpsmymkh",
                new SubmitStartRequest()
                    .withSchedule(new Schedule().withDeadLine(OffsetDateTime.parse("2023-12-11T20:40:37.695Z"))
                        .withTimeZone("khbuiowsrknyxcgmcwvyib")
                        .withDeadlineType(DeadlineType.UNKNOWN))
                    .withExecutionParameters(new ExecutionParameters())
                    .withResources(new Resources().withIds(Arrays.asList("wiu")))
                    .withCorrelationid("inimdjmkqeyqsiptfleqvyocdvfzq"),
                com.azure.core.util.Context.NONE);
    }
}
```

