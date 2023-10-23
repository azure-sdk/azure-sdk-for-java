# Code snippets and samples


## OperationGroup

- [Get](#operationgroup_get)
### OperationGroup_Get

```java
/** Samples for OperationGroup Get. */
public final class OperationGroupGetSamples {
    /*
     * x-ms-original-file: specification/iotoperationsmq/resource-manager/Microsoft.IoTOperationsMQ/preview/2023-10-04-preview/examples/OperationGroupGet.json
     */
    /**
     * Sample code: BatchAccountDelete.
     *
     * @param manager Entry point to IotoperationsmqManager.
     */
    public static void batchAccountDelete(com.azure.resourcemanager.iotoperationsmq.IotoperationsmqManager manager) {
        manager.operationGroups().getWithResponse("iotoperationsmqClient", com.azure.core.util.Context.NONE);
    }
}
```

