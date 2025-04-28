# Code snippets and samples


## ProviderResourceTypes

- [List](#providerresourcetypes_list)

## Providers

- [Get](#providers_get)
- [GetAtTenantScope](#providers_getattenantscope)
- [List](#providers_list)
- [ProviderPermissions](#providers_providerpermissions)

## ResourceGroups

- [CreateOrUpdate](#resourcegroups_createorupdate)
- [Delete](#resourcegroups_delete)
- [ExportTemplate](#resourcegroups_exporttemplate)

## TagOperations

- [CreateOrUpdateAtScope](#tagoperations_createorupdateatscope)
- [DeleteAtScope](#tagoperations_deleteatscope)
- [GetAtScope](#tagoperations_getatscope)
- [UpdateAtScope](#tagoperations_updateatscope)
### ProviderResourceTypes_List

```java
/**
 * Samples for Providers List.
 */
public final class ProvidersListSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetProviders.json
     */
    /**
     * Sample code: Get providers.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getProviders(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.providers().list(null, com.azure.core.util.Context.NONE);
    }
}
```

### Providers_Get

```java
/**
 * Samples for TagOperations DeleteAtScope.
 */
public final class TagOperationsDeleteAtScopeSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/DeleteTagsResource.json
     */
    /**
     * Sample code: Update tags on a resource.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void updateTagsOnAResource(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .deleteAtScope(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/my-resource-group/providers/myPRNameSpace/VM/myVm",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/DeleteTagsSubscription.
     * json
     */
    /**
     * Sample code: Update tags on a subscription.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        updateTagsOnASubscription(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .deleteAtScope("subscriptions/00000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
    }
}
```

### Providers_GetAtTenantScope

```java
import com.azure.resourcemanager.resources.generated.models.Tags;
import com.azure.resourcemanager.resources.generated.models.TagsPatchOperation;
import com.azure.resourcemanager.resources.generated.models.TagsPatchResource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for TagOperations UpdateAtScope.
 */
public final class TagOperationsUpdateAtScopeSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/PatchTagsResource.json
     */
    /**
     * Sample code: Update tags on a resource.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void updateTagsOnAResource(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .updateAtScope(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/my-resource-group/providers/myPRNameSpace/VM/myVm",
                new TagsPatchResource().withOperation(TagsPatchOperation.REPLACE)
                    .withProperties(new Tags()
                        .withTags(mapOf("tagKey1", "fakeTokenPlaceholder", "tagKey2", "fakeTokenPlaceholder"))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/PatchTagsSubscription.
     * json
     */
    /**
     * Sample code: Update tags on a subscription.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        updateTagsOnASubscription(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .updateAtScope("subscriptions/00000000-0000-0000-0000-000000000000",
                new TagsPatchResource().withOperation(TagsPatchOperation.REPLACE)
                    .withProperties(new Tags()
                        .withTags(mapOf("tagKey1", "fakeTokenPlaceholder", "tagKey2", "fakeTokenPlaceholder"))),
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

### Providers_List

```java
/**
 * Samples for Providers Get.
 */
public final class ProvidersGetSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetProvider.json
     */
    /**
     * Sample code: Get provider.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getProvider(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.providers().getWithResponse("Microsoft.TestRP1", null, com.azure.core.util.Context.NONE);
    }
}
```

### Providers_ProviderPermissions

```java
/**
 * Samples for Providers GetAtTenantScope.
 */
public final class ProvidersGetAtTenantScopeSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetNamedProviderAtTenant.
     * json
     */
    /**
     * Sample code: Get a resource provider at tenant scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        getAResourceProviderAtTenantScope(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.providers()
            .getAtTenantScopeWithResponse("Microsoft.Storage", "resourceTypes/aliases",
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceGroups_CreateOrUpdate

```java
/**
 * Samples for Providers ProviderPermissions.
 */
public final class ProvidersProviderPermissionsSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetProviderPermissions.
     * json
     */
    /**
     * Sample code: Get provider resource types.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getProviderResourceTypes(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.providers().providerPermissionsWithResponse("Microsoft.TestRP", com.azure.core.util.Context.NONE);
    }
}
```

### ResourceGroups_Delete

```java
/**
 * Samples for ResourceGroups Delete.
 */
public final class ResourceGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * ForceDeleteVMsInResourceGroup.json
     */
    /**
     * Sample code: Force delete all the Virtual Machines in a resource group.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void forceDeleteAllTheVirtualMachinesInAResourceGroup(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups()
            .delete("my-resource-group", "Microsoft.Compute/virtualMachines", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * ForceDeleteVMsAndVMSSInResourceGroup.json
     */
    /**
     * Sample code: Force delete all the Virtual Machines and Virtual Machine Scale Sets in a resource group.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void forceDeleteAllTheVirtualMachinesAndVirtualMachineScaleSetsInAResourceGroup(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups()
            .delete("my-resource-group", "Microsoft.Compute/virtualMachines,Microsoft.Compute/virtualMachineScaleSets",
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceGroups_ExportTemplate

```java
import com.azure.resourcemanager.resources.generated.models.ExportTemplateOutputFormat;
import com.azure.resourcemanager.resources.generated.models.ExportTemplateRequest;
import java.util.Arrays;

/**
 * Samples for ResourceGroups ExportTemplate.
 */
public final class ResourceGroupsExportTemplateSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * ExportResourceGroupAsBicep.json
     */
    /**
     * Sample code: Export a resource group as Bicep.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        exportAResourceGroupAsBicep(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups()
            .exportTemplate("my-resource-group",
                new ExportTemplateRequest().withResources(Arrays.asList("*"))
                    .withOptions("IncludeParameterDefaultValue,IncludeComments")
                    .withOutputFormat(ExportTemplateOutputFormat.BICEP),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/ExportResourceGroup.json
     */
    /**
     * Sample code: Export a resource group.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void exportAResourceGroup(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups()
            .exportTemplate("my-resource-group", new ExportTemplateRequest().withResources(Arrays.asList("*"))
                .withOptions("IncludeParameterDefaultValue,IncludeComments"), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * ExportResourceGroupWithFiltering.json
     */
    /**
     * Sample code: Export a resource group with filtering.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        exportAResourceGroupWithFiltering(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups()
            .exportTemplate("my-resource-group", new ExportTemplateRequest().withResources(Arrays.asList(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/my-resource-group/providers/My.RP/myResourceType/myFirstResource"))
                .withOptions("SkipResourceNameParameterization"), com.azure.core.util.Context.NONE);
    }
}
```

### TagOperations_CreateOrUpdateAtScope

```java
/**
 * Samples for ProviderResourceTypes List.
 */
public final class ProviderResourceTypesListSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetProviderResourceTypes.
     * json
     */
    /**
     * Sample code: Get provider resource types.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getProviderResourceTypes(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.providerResourceTypes().listWithResponse("Microsoft.TestRP", null, com.azure.core.util.Context.NONE);
    }
}
```

### TagOperations_DeleteAtScope

```java
import com.azure.resourcemanager.resources.generated.fluent.models.TagsResourceInner;
import com.azure.resourcemanager.resources.generated.models.Tags;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for TagOperations CreateOrUpdateAtScope.
 */
public final class TagOperationsCreateOrUpdateAtScopeSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/PutTagsResource.json
     */
    /**
     * Sample code: Update tags on a resource.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void updateTagsOnAResource(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .createOrUpdateAtScope(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/my-resource-group/providers/myPRNameSpace/VM/myVm",
                new TagsResourceInner().withProperties(
                    new Tags().withTags(mapOf("tagKey1", "fakeTokenPlaceholder", "tagKey2", "fakeTokenPlaceholder"))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/PutTagsSubscription.json
     */
    /**
     * Sample code: Update tags on a subscription.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        updateTagsOnASubscription(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .createOrUpdateAtScope("subscriptions/00000000-0000-0000-0000-000000000000",
                new TagsResourceInner().withProperties(
                    new Tags().withTags(mapOf("tagKey1", "fakeTokenPlaceholder", "tagKey2", "fakeTokenPlaceholder"))),
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

### TagOperations_GetAtScope

```java
/**
 * Samples for ResourceGroups CreateOrUpdate.
 */
public final class ResourceGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/CreateResourceGroup.json
     */
    /**
     * Sample code: Create or update a resource group.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        createOrUpdateAResourceGroup(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups().define("my-resource-group").withRegion("eastus").create();
    }
}
```

### TagOperations_UpdateAtScope

```java
/**
 * Samples for TagOperations GetAtScope.
 */
public final class TagOperationsGetAtScopeSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetTagsResource.json
     */
    /**
     * Sample code: Get tags on a resource.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getTagsOnAResource(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .getAtScopeWithResponse(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/my-resource-group/providers/myPRNameSpace/VM/myVm",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetTagsSubscription.json
     */
    /**
     * Sample code: Get tags on a subscription.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getTagsOnASubscription(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .getAtScopeWithResponse("subscriptions/00000000-0000-0000-0000-000000000000",
                com.azure.core.util.Context.NONE);
    }
}
```

