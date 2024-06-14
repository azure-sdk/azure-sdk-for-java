# Code snippets and samples


## Operations

- [List](#operations_list)

## Triggers

- [CreateOrUpdate](#triggers_createorupdate)
- [Delete](#triggers_delete)
- [Get](#triggers_get)
- [ListByImageTemplate](#triggers_listbyimagetemplate)

## VirtualMachineImageTemplates

- [Cancel](#virtualmachineimagetemplates_cancel)
- [CreateOrUpdate](#virtualmachineimagetemplates_createorupdate)
- [Delete](#virtualmachineimagetemplates_delete)
- [GetByResourceGroup](#virtualmachineimagetemplates_getbyresourcegroup)
- [GetRunOutput](#virtualmachineimagetemplates_getrunoutput)
- [List](#virtualmachineimagetemplates_list)
- [ListByResourceGroup](#virtualmachineimagetemplates_listbyresourcegroup)
- [ListRunOutputs](#virtualmachineimagetemplates_listrunoutputs)
- [Run](#virtualmachineimagetemplates_run)
- [Update](#virtualmachineimagetemplates_update)
### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /**
     * Sample code: Retrieve operations list.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void retrieveOperationsList(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Triggers_CreateOrUpdate

```java
/**
 * Samples for Triggers CreateOrUpdate.
 */
public final class TriggersCreateOrUpdateSamples {
    /**
     * Sample code: Create or update a source image type trigger.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void
        createOrUpdateASourceImageTypeTrigger(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.triggers().define((String) null).withExistingImageTemplate(null, null).create();
    }
}
```

### Triggers_Delete

```java
/**
 * Samples for Triggers Delete.
 */
public final class TriggersDeleteSamples {
    /**
     * Sample code: Delete a trigger resource.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void deleteATriggerResource(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.triggers().delete(null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Triggers_Get

```java
/**
 * Samples for Triggers Get.
 */
public final class TriggersGetSamples {
    /**
     * Sample code: Get a trigger resource.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void getATriggerResource(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.triggers().getWithResponse(null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Triggers_ListByImageTemplate

```java
/**
 * Samples for Triggers ListByImageTemplate.
 */
public final class TriggersListByImageTemplateSamples {
    /**
     * Sample code: List triggers by image template.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void listTriggersByImageTemplate(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.triggers().listByImageTemplate(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachineImageTemplates_Cancel

```java
/**
 * Samples for VirtualMachineImageTemplates Cancel.
 */
public final class VirtualMachineImageTemplatesCancelSamples {
    /**
     * Sample code: Cancel the image build based on the imageTemplate.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void
        cancelTheImageBuildBasedOnTheImageTemplate(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.virtualMachineImageTemplates().cancel(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachineImageTemplates_CreateOrUpdate

```java
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateIdentity;

/**
 * Samples for VirtualMachineImageTemplates CreateOrUpdate.
 */
public final class VirtualMachineImageTemplatesCreateOrUpdateSamples {
    /**
     * Sample code: Create an Image Template for Linux.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void
        createAnImageTemplateForLinux(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.virtualMachineImageTemplates()
            .define((String) null)
            .withRegion((String) null)
            .withExistingResourceGroup((String) null)
            .withIdentity((ImageTemplateIdentity) null)
            .create();
    }

    /**
     * Sample code: Create an Image Template for Windows.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void
        createAnImageTemplateForWindows(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.virtualMachineImageTemplates()
            .define((String) null)
            .withRegion((String) null)
            .withExistingResourceGroup((String) null)
            .withIdentity((ImageTemplateIdentity) null)
            .create();
    }
}
```

### VirtualMachineImageTemplates_Delete

```java
/**
 * Samples for VirtualMachineImageTemplates Delete.
 */
public final class VirtualMachineImageTemplatesDeleteSamples {
    /**
     * Sample code: Delete an Image Template.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void deleteAnImageTemplate(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.virtualMachineImageTemplates().delete(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachineImageTemplates_GetByResourceGroup

```java
/**
 * Samples for VirtualMachineImageTemplates GetByResourceGroup.
 */
public final class VirtualMachineImageTemplatesGetByResourceGroupSamples {
    /**
     * Sample code: Retrieve an Image Template.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void retrieveAnImageTemplate(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.virtualMachineImageTemplates()
            .getByResourceGroupWithResponse(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachineImageTemplates_GetRunOutput

```java
/**
 * Samples for VirtualMachineImageTemplates GetRunOutput.
 */
public final class VirtualMachineImageTemplatesGetRunOutputSamples {
    /**
     * Sample code: Retrieve single runOutput.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void retrieveSingleRunOutput(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.virtualMachineImageTemplates()
            .getRunOutputWithResponse(null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachineImageTemplates_List

```java
/**
 * Samples for VirtualMachineImageTemplates List.
 */
public final class VirtualMachineImageTemplatesListSamples {
    /**
     * Sample code: List images by subscription.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void listImagesBySubscription(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.virtualMachineImageTemplates().list(com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachineImageTemplates_ListByResourceGroup

```java
/**
 * Samples for VirtualMachineImageTemplates ListByResourceGroup.
 */
public final class VirtualMachineImageTemplatesListByResourceGroupSamples {
    /**
     * Sample code: List images by resource group.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void listImagesByResourceGroup(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.virtualMachineImageTemplates().listByResourceGroup(null, com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachineImageTemplates_ListRunOutputs

```java
/**
 * Samples for VirtualMachineImageTemplates ListRunOutputs.
 */
public final class VirtualMachineImageTemplatesListRunOutputsSamples {
    /**
     * Sample code: Retrieve a list of all outputs created by the last run of an Image Template.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void retrieveAListOfAllOutputsCreatedByTheLastRunOfAnImageTemplate(
        com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.virtualMachineImageTemplates().listRunOutputs(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachineImageTemplates_Run

```java
/**
 * Samples for VirtualMachineImageTemplates Run.
 */
public final class VirtualMachineImageTemplatesRunSamples {
    /**
     * Sample code: Create image(s) from existing imageTemplate.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void
        createImageSFromExistingImageTemplate(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.virtualMachineImageTemplates().run(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### VirtualMachineImageTemplates_Update

```java
import com.azure.resourcemanager.imagebuilder.models.ImageTemplate;

/**
 * Samples for VirtualMachineImageTemplates Update.
 */
public final class VirtualMachineImageTemplatesUpdateSamples {
    /**
     * Sample code: Remove identities for an Image Template.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void
        removeIdentitiesForAnImageTemplate(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        ImageTemplate resource = manager.virtualMachineImageTemplates()
            .getByResourceGroupWithResponse(null, null, com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }

    /**
     * Sample code: Update the tags for an Image Template.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void
        updateTheTagsForAnImageTemplate(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        ImageTemplate resource = manager.virtualMachineImageTemplates()
            .getByResourceGroupWithResponse(null, null, com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

