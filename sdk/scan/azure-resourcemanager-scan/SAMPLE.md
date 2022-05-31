# Code snippets and samples


## AzureScanningAccount

- [Create](#azurescanningaccount_create)
- [Delete](#azurescanningaccount_delete)
- [GetByResourceGroup](#azurescanningaccount_getbyresourcegroup)
- [List](#azurescanningaccount_list)
- [ListByResourceGroup](#azurescanningaccount_listbyresourcegroup)
- [Update](#azurescanningaccount_update)

## Operations

- [List](#operations_list)
### AzureScanningAccount_Create

```java
/** Samples for AzureScanningAccount Create. */
public final class AzureScanningAccountCreateSamples {
    /*
     * x-ms-original-file: specification/scan/resource-manager/Microsoft.AzureScan/preview/2022-05-17-preview/examples/createScanningAccount.json
     */
    /**
     * Sample code: BatchAccountDelete.
     *
     * @param manager Entry point to AzureScanningManager.
     */
    public static void batchAccountDelete(com.azure.resourcemanager.scan.AzureScanningManager manager) {
        manager
            .azureScanningAccounts()
            .define("MyAccount")
            .withRegion("westcentralus")
            .withExistingResourceGroup("MyResourceGroup")
            .withAadClientId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
            .create();
    }
}
```

### AzureScanningAccount_Delete

```java
import com.azure.core.util.Context;

/** Samples for AzureScanningAccount Delete. */
public final class AzureScanningAccountDeleteSamples {
    /*
     * x-ms-original-file: specification/scan/resource-manager/Microsoft.AzureScan/preview/2022-05-17-preview/examples/deleteScanningAccount.json
     */
    /**
     * Sample code: Delete Scanning Account.
     *
     * @param manager Entry point to AzureScanningManager.
     */
    public static void deleteScanningAccount(com.azure.resourcemanager.scan.AzureScanningManager manager) {
        manager.azureScanningAccounts().delete("MyResourceGroup", "MyAccount", Context.NONE);
    }
}
```

### AzureScanningAccount_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for AzureScanningAccount GetByResourceGroup. */
public final class AzureScanningAccountGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/scan/resource-manager/Microsoft.AzureScan/preview/2022-05-17-preview/examples/getScanningAccount.json
     */
    /**
     * Sample code: Get Scanning Account.
     *
     * @param manager Entry point to AzureScanningManager.
     */
    public static void getScanningAccount(com.azure.resourcemanager.scan.AzureScanningManager manager) {
        manager.azureScanningAccounts().getByResourceGroupWithResponse("MyResourceGroup", "MyAccount", Context.NONE);
    }
}
```

### AzureScanningAccount_List

```java
import com.azure.core.util.Context;

/** Samples for AzureScanningAccount List. */
public final class AzureScanningAccountListSamples {
    /*
     * x-ms-original-file: specification/scan/resource-manager/Microsoft.AzureScan/preview/2022-05-17-preview/examples/listScanningAccountsBySubscription.json
     */
    /**
     * Sample code: List Scanning Accounts by Subscription.
     *
     * @param manager Entry point to AzureScanningManager.
     */
    public static void listScanningAccountsBySubscription(com.azure.resourcemanager.scan.AzureScanningManager manager) {
        manager.azureScanningAccounts().list(Context.NONE);
    }
}
```

### AzureScanningAccount_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for AzureScanningAccount ListByResourceGroup. */
public final class AzureScanningAccountListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/scan/resource-manager/Microsoft.AzureScan/preview/2022-05-17-preview/examples/listScanningAccountsByResourceGroup.json
     */
    /**
     * Sample code: List Scanning Accounts by Resource Group.
     *
     * @param manager Entry point to AzureScanningManager.
     */
    public static void listScanningAccountsByResourceGroup(
        com.azure.resourcemanager.scan.AzureScanningManager manager) {
        manager.azureScanningAccounts().listByResourceGroup("MyResourceGroup", Context.NONE);
    }
}
```

### AzureScanningAccount_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.scan.models.ScanningAccount;

/** Samples for AzureScanningAccount Update. */
public final class AzureScanningAccountUpdateSamples {
    /*
     * x-ms-original-file: specification/scan/resource-manager/Microsoft.AzureScan/preview/2022-05-17-preview/examples/updateScanningAccount.json
     */
    /**
     * Sample code: BatchAccountDelete.
     *
     * @param manager Entry point to AzureScanningManager.
     */
    public static void batchAccountDelete(com.azure.resourcemanager.scan.AzureScanningManager manager) {
        ScanningAccount resource =
            manager
                .azureScanningAccounts()
                .getByResourceGroupWithResponse("MyResourceGroup", "MyAccount", Context.NONE)
                .getValue();
        resource.update().withAadClientId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx").apply();
    }
}
```

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/scan/resource-manager/Microsoft.AzureScan/preview/2022-05-17-preview/examples/listScanningAccountOperations.json
     */
    /**
     * Sample code: List Scanning Account operations.
     *
     * @param manager Entry point to AzureScanningManager.
     */
    public static void listScanningAccountOperations(com.azure.resourcemanager.scan.AzureScanningManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

