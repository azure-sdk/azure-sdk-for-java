# Code snippets and samples


## ContainerServices

- [CreateOrUpdate](#containerservices_createorupdate)
- [Delete](#containerservices_delete)
- [GetByResourceGroup](#containerservices_getbyresourcegroup)
- [List](#containerservices_list)
- [ListByResourceGroup](#containerservices_listbyresourcegroup)
### ContainerServices_CreateOrUpdate

```java
/** Samples for ContainerServices CreateOrUpdate. */
public final class ContainerServicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.ContainerService/preview/2022-05-08/examples/ContainerServicesCreate_Update.json
     */
    /**
     * Sample code: Create/Update Container Service.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createUpdateContainerService(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.containerServices().define("acs1").withRegion("location1").withExistingResourceGroup("rg1").create();
    }
}
```

### ContainerServices_Delete

```java
import com.azure.core.util.Context;

/** Samples for ContainerServices Delete. */
public final class ContainerServicesDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.ContainerService/preview/2022-05-08/examples/ContainerServicesDelete.json
     */
    /**
     * Sample code: Delete Container Service.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteContainerService(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.containerServices().delete("rg1", "acs1", Context.NONE);
    }
}
```

### ContainerServices_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ContainerServices GetByResourceGroup. */
public final class ContainerServicesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.ContainerService/preview/2022-05-08/examples/ContainerServicesGet.json
     */
    /**
     * Sample code: Get Container Service.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getContainerService(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.containerServices().getByResourceGroupWithResponse("rg1", "acs1", Context.NONE);
    }
}
```

### ContainerServices_List

```java
import com.azure.core.util.Context;

/** Samples for ContainerServices List. */
public final class ContainerServicesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.ContainerService/preview/2022-05-08/examples/ContainerServicesList.json
     */
    /**
     * Sample code: List Container Services.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listContainerServices(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.containerServices().list(Context.NONE);
    }
}
```

### ContainerServices_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ContainerServices ListByResourceGroup. */
public final class ContainerServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.ContainerService/preview/2022-05-08/examples/ContainerServicesListByResourceGroup.json
     */
    /**
     * Sample code: List Container Services by Resource Group.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listContainerServicesByResourceGroup(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.containerServices().listByResourceGroup("rg1", Context.NONE);
    }
}
```

