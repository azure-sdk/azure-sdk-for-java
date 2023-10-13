# Code snippets and samples


## OperationGroup

- [Get](#operationgroup_get)
### OperationGroup_Get

```java
/** Samples for OperationGroup Get. */
public final class OperationGroupGetSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OperationGroupGet.json
     */
    /**
     * Sample code: BatchAccountDelete.
     *
     * @param manager Entry point to ProgrammableconnectivityManager.
     */
    public static void batchAccountDelete(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableconnectivityManager manager) {
        manager.operationGroups().getWithResponse("programmableconnectivityClient", com.azure.core.util.Context.NONE);
    }
}
```

