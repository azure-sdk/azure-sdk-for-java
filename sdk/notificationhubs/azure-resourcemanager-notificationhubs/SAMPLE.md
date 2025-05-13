# Code snippets and samples


## Operations

- [List](#operations_list)
### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2023-10-01-preview/NHOperationsList.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to NotificationhubsManager.
     */
    public static void operationsList(com.azure.resourcemanager.notificationhubs.NotificationhubsManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

