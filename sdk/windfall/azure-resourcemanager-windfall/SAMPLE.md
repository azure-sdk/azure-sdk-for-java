# Code snippets and samples


## Operations

- [List](#operations_list)

## WindfallDeployments

- [CreateOrUpdate](#windfalldeployments_createorupdate)
- [Delete](#windfalldeployments_delete)
- [GetByResourceGroup](#windfalldeployments_getbyresourcegroup)
- [List](#windfalldeployments_list)
- [ListByResourceGroup](#windfalldeployments_listbyresourcegroup)
- [Update](#windfalldeployments_update)
### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/windfall/resource-manager/Microsoft.Windfall/preview/2022-12-31-preview/examples/Operations_List.json
     */
    /**
     * Sample code: OperationsList.
     *
     * @param manager Entry point to WindfallManager.
     */
    public static void operationsList(com.azure.resourcemanager.windfall.WindfallManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

### WindfallDeployments_CreateOrUpdate

```java
/** Samples for WindfallDeployments CreateOrUpdate. */
public final class WindfallDeploymentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/windfall/resource-manager/Microsoft.Windfall/preview/2022-12-31-preview/examples/WindfallDeployments_CreateOrUpdate.json
     */
    /**
     * Sample code: CreateWindfallDeploymentResource.
     *
     * @param manager Entry point to WindfallManager.
     */
    public static void createWindfallDeploymentResource(com.azure.resourcemanager.windfall.WindfallManager manager) {
        manager
            .windfallDeployments()
            .define("myname")
            .withRegion("useast")
            .withExistingResourceGroup("testrg")
            .withProperty1("foo")
            .create();
    }
}
```

### WindfallDeployments_Delete

```java
import com.azure.core.util.Context;

/** Samples for WindfallDeployments Delete. */
public final class WindfallDeploymentsDeleteSamples {
    /*
     * x-ms-original-file: specification/windfall/resource-manager/Microsoft.Windfall/preview/2022-12-31-preview/examples/WindfallDeployments_Delete.json
     */
    /**
     * Sample code: DeleteWindfallDeploymentResource.
     *
     * @param manager Entry point to WindfallManager.
     */
    public static void deleteWindfallDeploymentResource(com.azure.resourcemanager.windfall.WindfallManager manager) {
        manager.windfallDeployments().delete("testrg", "myname", Context.NONE);
    }
}
```

### WindfallDeployments_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for WindfallDeployments GetByResourceGroup. */
public final class WindfallDeploymentsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/windfall/resource-manager/Microsoft.Windfall/preview/2022-12-31-preview/examples/WindfallDeployments_Get.json
     */
    /**
     * Sample code: GetWindfallDeploymentResource.
     *
     * @param manager Entry point to WindfallManager.
     */
    public static void getWindfallDeploymentResource(com.azure.resourcemanager.windfall.WindfallManager manager) {
        manager.windfallDeployments().getByResourceGroupWithResponse("testrg", "myname", Context.NONE);
    }
}
```

### WindfallDeployments_List

```java
import com.azure.core.util.Context;

/** Samples for WindfallDeployments List. */
public final class WindfallDeploymentsListSamples {
    /*
     * x-ms-original-file: specification/windfall/resource-manager/Microsoft.Windfall/preview/2022-12-31-preview/examples/WindfallDeployments_ListBySubscription.json
     */
    /**
     * Sample code: ListWindfallDeploymentResourceSub.
     *
     * @param manager Entry point to WindfallManager.
     */
    public static void listWindfallDeploymentResourceSub(com.azure.resourcemanager.windfall.WindfallManager manager) {
        manager.windfallDeployments().list(Context.NONE);
    }
}
```

### WindfallDeployments_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for WindfallDeployments ListByResourceGroup. */
public final class WindfallDeploymentsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/windfall/resource-manager/Microsoft.Windfall/preview/2022-12-31-preview/examples/WindfallDeployments_ListByResourceGroup.json
     */
    /**
     * Sample code: ListWindfallDeploymentResource.
     *
     * @param manager Entry point to WindfallManager.
     */
    public static void listWindfallDeploymentResource(com.azure.resourcemanager.windfall.WindfallManager manager) {
        manager.windfallDeployments().listByResourceGroup("testrg", Context.NONE);
    }
}
```

### WindfallDeployments_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.windfall.models.WindfallDeployment;

/** Samples for WindfallDeployments Update. */
public final class WindfallDeploymentsUpdateSamples {
    /*
     * x-ms-original-file: specification/windfall/resource-manager/Microsoft.Windfall/preview/2022-12-31-preview/examples/WindfallDeployments_Update.json
     */
    /**
     * Sample code: UpdateWindfallDeploymentResource.
     *
     * @param manager Entry point to WindfallManager.
     */
    public static void updateWindfallDeploymentResource(com.azure.resourcemanager.windfall.WindfallManager manager) {
        WindfallDeployment resource =
            manager.windfallDeployments().getByResourceGroupWithResponse("testrg", "myname", Context.NONE).getValue();
        resource.update().apply();
    }
}
```

