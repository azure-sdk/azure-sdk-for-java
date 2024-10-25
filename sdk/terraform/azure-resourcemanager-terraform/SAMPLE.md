# Code snippets and samples


## Operations

- [List](#operations_list)

## Terraform

- [ExportTerraform](#terraform_exportterraform)
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

### Terraform_ExportTerraform

```java
import com.azure.resourcemanager.terraform.models.ExportResourceGroup;

/**
 * Samples for Terraform ExportTerraform.
 */
public final class TerraformExportTerraformSamples {
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
        manager.terraforms()
            .exportTerraform(new ExportResourceGroup().withResourceGroupName("rg1"), com.azure.core.util.Context.NONE);
    }
}
```

