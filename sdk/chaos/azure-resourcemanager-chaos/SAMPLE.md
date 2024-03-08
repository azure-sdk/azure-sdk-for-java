# Code snippets and samples


## ExperimentExecutions

- [ListByExperiment](#experimentexecutions_listbyexperiment)

## Experiments

- [Cancel](#experiments_cancel)
### ExperimentExecutions_ListByExperiment

```java
/**
 * Samples for ExperimentExecutions ListByExperiment.
 */
public final class ExperimentExecutionsListByExperimentSamples {
    /*
     * x-ms-original-file:
     * specification/chaos/resource-manager/Microsoft.Chaos/stable/2024-01-01/examples/ListExperimentsInASubscription.
     * json
     */
    /**
     * Sample code: ListExperimentExecutionsInASubscription.
     * 
     * @param manager Entry point to ChaosManager.
     */
    public static void listExperimentExecutionsInASubscription(com.azure.resourcemanager.chaos.ChaosManager manager) {
        manager.experimentExecutions().listByExperiment(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Experiments_Cancel

```java
/**
 * Samples for Experiments Cancel.
 */
public final class ExperimentsCancelSamples {
    /*
     * x-ms-original-file:
     * specification/chaos/resource-manager/Microsoft.Chaos/stable/2024-01-01/examples/CancelExperiment.json
     */
    /**
     * Sample code: CancelExperiment.
     * 
     * @param manager Entry point to ChaosManager.
     */
    public static void cancelExperiment(com.azure.resourcemanager.chaos.ChaosManager manager) {
        manager.experiments().cancel("exampleRG", "exampleExperiment", null, com.azure.core.util.Context.NONE);
    }
}
```

