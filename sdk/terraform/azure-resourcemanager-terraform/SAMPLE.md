# Code snippets and samples


## OperationStatuses

- [Get](#operationstatuses_get)

## Operations

- [List](#operations_list)

## ResourceProvider

- [ExportTerraform](#resourceprovider_exportterraform)
### OperationStatuses_Get

```java
/**
 * Samples for OperationStatuses Get.
 */
public final class OperationStatusesGetSamples {
    /*
     * x-ms-original-file:
     * specification/terraform/resource-manager/Microsoft.AzureTerraform/preview/2023-07-01-preview/examples/
     * GetOperationStatus.json
     */
    /**
     * Sample code: Get specific operation status.
     * 
     * @param manager Entry point to AzureTerraformManager.
     */
    public static void getSpecificOperationStatus(com.azure.resourcemanager.terraform.AzureTerraformManager manager) {
        manager.operationStatuses()
            .getWithResponse("00000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
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
     * specification/terraform/resource-manager/Microsoft.AzureTerraform/preview/2023-07-01-preview/examples/
     * ListOperations.json
     */
    /**
     * Sample code: Get a list of operations for a resource provider.
     * 
     * @param manager Entry point to AzureTerraformManager.
     */
    public static void
        getAListOfOperationsForAResourceProvider(com.azure.resourcemanager.terraform.AzureTerraformManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_ExportTerraform

```java
import com.azure.resourcemanager.terraform.models.ExportResourceGroup;

/**
 * Samples for ResourceProvider ExportTerraform.
 */
public final class ResourceProviderExportTerraformSamples {
    /*
     * x-ms-original-file:
     * specification/terraform/resource-manager/Microsoft.AzureTerraform/preview/2023-07-01-preview/examples/
     * ExportTerraform.json
     */
    /**
     * Sample code: ExportTerraform.
     * 
     * @param manager Entry point to AzureTerraformManager.
     */
    public static void exportTerraform(com.azure.resourcemanager.terraform.AzureTerraformManager manager) {
        manager.resourceProviders()
            .exportTerraform(new ExportResourceGroup().withResourceGroupName("rg1"), com.azure.core.util.Context.NONE);
    }
}
```

