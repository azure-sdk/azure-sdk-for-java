# Code snippets and samples


## ExportTerraform

- [ExportTerraform](#exportterraform_exportterraform)

## Operations

- [List](#operations_list)
### ExportTerraform_ExportTerraform

```java

/**
 * Samples for ExportTerraform ExportTerraform.
 */
public final class ExportTerraformExportTerraformSamples {
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
        manager.exportTerraforms().exportTerraform(null, com.azure.core.util.Context.NONE);
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

