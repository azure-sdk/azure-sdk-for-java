# Code snippets and samples


## Operations

- [List](#operations_list)

## ScheduledActions

- [VirtualMachinesCancelOperations](#scheduledactions_virtualmachinescanceloperations)
- [VirtualMachinesExecuteCreate](#scheduledactions_virtualmachinesexecutecreate)
- [VirtualMachinesExecuteDeallocate](#scheduledactions_virtualmachinesexecutedeallocate)
- [VirtualMachinesExecuteDelete](#scheduledactions_virtualmachinesexecutedelete)
- [VirtualMachinesExecuteHibernate](#scheduledactions_virtualmachinesexecutehibernate)
- [VirtualMachinesExecuteStart](#scheduledactions_virtualmachinesexecutestart)
- [VirtualMachinesGetOperationErrors](#scheduledactions_virtualmachinesgetoperationerrors)
- [VirtualMachinesGetOperationStatus](#scheduledactions_virtualmachinesgetoperationstatus)
- [VirtualMachinesSubmitDeallocate](#scheduledactions_virtualmachinessubmitdeallocate)
- [VirtualMachinesSubmitHibernate](#scheduledactions_virtualmachinessubmithibernate)
- [VirtualMachinesSubmitStart](#scheduledactions_virtualmachinessubmitstart)
### Operations_List

```java
import com.azure.resourcemanager.computeschedule.models.ExecuteStartRequest;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.Resources;
import com.azure.resourcemanager.computeschedule.models.RetryPolicy;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesExecuteStart.
 */
public final class ScheduledActionsVirtualMachinesExecuteStartSamples {
    /*
     * x-ms-original-file: 2025-05-01/ScheduledActions_VirtualMachinesExecuteStart_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesExecuteStart.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void scheduledActionsVirtualMachinesExecuteStart(
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesExecuteStartWithResponse("aniuyuffau",
                new ExecuteStartRequest()
                    .withExecutionParameters(
                        new ExecutionParameters().withOptimizationPreference(OptimizationPreference.COST)
                            .withRetryPolicy(new RetryPolicy().withRetryCount(1).withRetryWindowInMinutes(8)))
                    .withResources(new Resources().withIds(Arrays.asList("npfmjea")))
                    .withCorrelationid("rfwibowqbubbdvx"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesCancelOperations

```java
import com.azure.resourcemanager.computeschedule.models.ExecuteCreateRequest;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.ResourceProvisionPayload;
import com.azure.resourcemanager.computeschedule.models.RetryPolicy;
import com.azure.resourcemanager.computeschedule.models.VirtualMachineExtensionData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ScheduledActions VirtualMachinesExecuteCreate.
 */
public final class ScheduledActionsVirtualMachinesExecuteCreateSamples {
    /*
     * x-ms-original-file: 2025-05-01/ScheduledActions_VirtualMachinesExecuteCreate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesExecuteCreate.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void scheduledActionsVirtualMachinesExecuteCreate(
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesExecuteCreateWithResponse("hwhriqxufntnszxshwjtbhou",
                new ExecuteCreateRequest()
                    .withResourceConfigParameters(new ResourceProvisionPayload().withBaseProfile("hwgtzdafsbnogpykejd")
                        .withResourceOverrides(Arrays.asList("hayhiqbpqezhquiceha"))
                        .withVmExtensions(Arrays.asList(new VirtualMachineExtensionData().withName("qrptgusfvzxfaczhex")
                            .withLocation("jntxjvecxcdshemmcocck")
                            .withProperties(mapOf())
                            .withTags(mapOf())))
                        .withResourceCount(16)
                        .withResourcePrefix("wdoeue"))
                    .withExecutionParameters(
                        new ExecutionParameters().withOptimizationPreference(OptimizationPreference.COST)
                            .withRetryPolicy(new RetryPolicy().withRetryCount(1).withRetryWindowInMinutes(8)))
                    .withCorrelationid("inwslrqaqbcatbgezhxbuubq"),
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

### ScheduledActions_VirtualMachinesExecuteCreate

```java
import com.azure.resourcemanager.computeschedule.models.GetOperationStatusRequest;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesGetOperationStatus.
 */
public final class ScheduledActionsVirtualMachinesGetOperationStatusSamples {
    /*
     * x-ms-original-file: 2025-05-01/ScheduledActions_VirtualMachinesGetOperationStatus_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesGetOperationStatus.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void scheduledActionsVirtualMachinesGetOperationStatus(
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesGetOperationStatusWithResponse("rboizuorywnykz",
                new GetOperationStatusRequest().withOperationIds(Arrays.asList("ziuci")).withCorrelationid("dommasl"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesExecuteDeallocate

```java
import com.azure.resourcemanager.computeschedule.models.ExecuteDeleteRequest;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.Resources;
import com.azure.resourcemanager.computeschedule.models.RetryPolicy;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesExecuteDelete.
 */
public final class ScheduledActionsVirtualMachinesExecuteDeleteSamples {
    /*
     * x-ms-original-file: 2025-05-01/ScheduledActions_VirtualMachinesExecuteDelete_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesExecuteDelete.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void scheduledActionsVirtualMachinesExecuteDelete(
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesExecuteDeleteWithResponse("fbf",
                new ExecuteDeleteRequest()
                    .withExecutionParameters(
                        new ExecutionParameters().withOptimizationPreference(OptimizationPreference.COST)
                            .withRetryPolicy(new RetryPolicy().withRetryCount(1).withRetryWindowInMinutes(8)))
                    .withResources(new Resources().withIds(Arrays.asList("npfmjea")))
                    .withCorrelationid("mbkmatbycmmph"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesExecuteDelete

```java
import com.azure.resourcemanager.computeschedule.models.CancelOperationsRequest;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesCancelOperations.
 */
public final class ScheduledActionsVirtualMachinesCancelOperationsSamples {
    /*
     * x-ms-original-file: 2025-05-01/ScheduledActions_VirtualMachinesCancelOperations_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesCancelOperations.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void scheduledActionsVirtualMachinesCancelOperations(
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesCancelOperationsWithResponse("rqftdooona",
                new CancelOperationsRequest().withOperationIds(Arrays.asList("lmgwkjlng"))
                    .withCorrelationid("vhgqpkvmxkzusevudcelljti"),
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
import com.azure.resourcemanager.computeschedule.models.RetryPolicy;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesExecuteHibernate.
 */
public final class ScheduledActionsVirtualMachinesExecuteHibernateSamples {
    /*
     * x-ms-original-file: 2025-05-01/ScheduledActions_VirtualMachinesExecuteHibernate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesExecuteHibernate.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void scheduledActionsVirtualMachinesExecuteHibernate(
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesExecuteHibernateWithResponse("icxzmxvgkaowvmrcr",
                new ExecuteHibernateRequest()
                    .withExecutionParameters(
                        new ExecutionParameters().withOptimizationPreference(OptimizationPreference.COST)
                            .withRetryPolicy(new RetryPolicy().withRetryCount(1).withRetryWindowInMinutes(8)))
                    .withResources(new Resources().withIds(Arrays.asList("npfmjea")))
                    .withCorrelationid("vmeqhhsyvnxxvzzdskmh"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesExecuteStart

```java
import com.azure.resourcemanager.computeschedule.models.DeadlineType;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.Resources;
import com.azure.resourcemanager.computeschedule.models.RetryPolicy;
import com.azure.resourcemanager.computeschedule.models.Schedule;
import com.azure.resourcemanager.computeschedule.models.SubmitDeallocateRequest;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesSubmitDeallocate.
 */
public final class ScheduledActionsVirtualMachinesSubmitDeallocateSamples {
    /*
     * x-ms-original-file: 2025-05-01/ScheduledActions_VirtualMachinesSubmitDeallocate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesSubmitDeallocate.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void scheduledActionsVirtualMachinesSubmitDeallocate(
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesSubmitDeallocateWithResponse("lawcyjjebyry",
                new SubmitDeallocateRequest()
                    .withSchedule(new Schedule().withDeadline(OffsetDateTime.parse("2025-04-04T20:33:27.504Z"))
                        .withDeadLine(OffsetDateTime.parse("2025-04-04T20:33:27.504Z"))
                        .withTimezone("vnmijvfoqyplvcttbjdl")
                        .withTimeZone("ahowpd")
                        .withDeadlineType(DeadlineType.UNKNOWN))
                    .withExecutionParameters(
                        new ExecutionParameters().withOptimizationPreference(OptimizationPreference.COST)
                            .withRetryPolicy(new RetryPolicy().withRetryCount(1).withRetryWindowInMinutes(8)))
                    .withResources(new Resources().withIds(Arrays.asList("npfmjea")))
                    .withCorrelationid("yecdtyugquymakkxgzrrplbrx"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesGetOperationErrors

```java
import com.azure.resourcemanager.computeschedule.models.DeadlineType;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.Resources;
import com.azure.resourcemanager.computeschedule.models.RetryPolicy;
import com.azure.resourcemanager.computeschedule.models.Schedule;
import com.azure.resourcemanager.computeschedule.models.SubmitStartRequest;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesSubmitStart.
 */
public final class ScheduledActionsVirtualMachinesSubmitStartSamples {
    /*
     * x-ms-original-file: 2025-05-01/ScheduledActions_VirtualMachinesSubmitStart_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesSubmitStart.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void scheduledActionsVirtualMachinesSubmitStart(
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesSubmitStartWithResponse("kqpkdbti",
                new SubmitStartRequest()
                    .withSchedule(new Schedule().withDeadline(OffsetDateTime.parse("2025-04-04T20:33:27.504Z"))
                        .withDeadLine(OffsetDateTime.parse("2025-04-04T20:33:27.504Z"))
                        .withTimezone("vnmijvfoqyplvcttbjdl")
                        .withTimeZone("ahowpd")
                        .withDeadlineType(DeadlineType.UNKNOWN))
                    .withExecutionParameters(
                        new ExecutionParameters().withOptimizationPreference(OptimizationPreference.COST)
                            .withRetryPolicy(new RetryPolicy().withRetryCount(1).withRetryWindowInMinutes(8)))
                    .withResources(new Resources().withIds(Arrays.asList("npfmjea")))
                    .withCorrelationid("r"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesGetOperationStatus

```java
import com.azure.resourcemanager.computeschedule.models.GetOperationErrorsRequest;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesGetOperationErrors.
 */
public final class ScheduledActionsVirtualMachinesGetOperationErrorsSamples {
    /*
     * x-ms-original-file: 2025-05-01/ScheduledActions_VirtualMachinesGetOperationErrors_MinimumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesGetOperationErrors.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void scheduledActionsVirtualMachinesGetOperationErrors(
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesGetOperationErrorsWithResponse("qcxlwgpfxkxonanr",
                new GetOperationErrorsRequest().withOperationIds(Arrays.asList("xqdknmquvfghcphlgantujwqtssab")),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesSubmitDeallocate

```java
import com.azure.resourcemanager.computeschedule.models.ExecuteDeallocateRequest;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.Resources;
import com.azure.resourcemanager.computeschedule.models.RetryPolicy;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesExecuteDeallocate.
 */
public final class ScheduledActionsVirtualMachinesExecuteDeallocateSamples {
    /*
     * x-ms-original-file: 2025-05-01/ScheduledActions_VirtualMachinesExecuteDeallocate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesExecuteDeallocate.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void scheduledActionsVirtualMachinesExecuteDeallocate(
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesExecuteDeallocateWithResponse("lqbea",
                new ExecuteDeallocateRequest()
                    .withExecutionParameters(
                        new ExecutionParameters().withOptimizationPreference(OptimizationPreference.COST)
                            .withRetryPolicy(new RetryPolicy().withRetryCount(1).withRetryWindowInMinutes(8)))
                    .withResources(new Resources().withIds(Arrays.asList("npfmjea")))
                    .withCorrelationid("wmfrxicixogubeuvikqzrry"),
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
import com.azure.resourcemanager.computeschedule.models.RetryPolicy;
import com.azure.resourcemanager.computeschedule.models.Schedule;
import com.azure.resourcemanager.computeschedule.models.SubmitHibernateRequest;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesSubmitHibernate.
 */
public final class ScheduledActionsVirtualMachinesSubmitHibernateSamples {
    /*
     * x-ms-original-file: 2025-05-01/ScheduledActions_VirtualMachinesSubmitHibernate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesSubmitHibernate.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void scheduledActionsVirtualMachinesSubmitHibernate(
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesSubmitHibernateWithResponse("gbuoeotacdqmfpuranhzra",
                new SubmitHibernateRequest()
                    .withSchedule(new Schedule().withDeadline(OffsetDateTime.parse("2025-04-04T20:33:27.504Z"))
                        .withDeadLine(OffsetDateTime.parse("2025-04-04T20:33:27.504Z"))
                        .withTimezone("vnmijvfoqyplvcttbjdl")
                        .withTimeZone("ahowpd")
                        .withDeadlineType(DeadlineType.UNKNOWN))
                    .withExecutionParameters(
                        new ExecutionParameters().withOptimizationPreference(OptimizationPreference.COST)
                            .withRetryPolicy(new RetryPolicy().withRetryCount(1).withRetryWindowInMinutes(8)))
                    .withResources(new Resources().withIds(Arrays.asList("npfmjea")))
                    .withCorrelationid("dwxgvhjwuezth"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledActions_VirtualMachinesSubmitStart

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2025-05-01/Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void operationsList(com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

