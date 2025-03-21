# Code snippets and samples


## Branches

- [CreateOrUpdate](#branches_createorupdate)
- [Delete](#branches_delete)
- [Get](#branches_get)
- [List](#branches_list)
- [Update](#branches_update)

## Computes

- [CreateOrUpdate](#computes_createorupdate)
- [Delete](#computes_delete)
- [Get](#computes_get)
- [List](#computes_list)
- [Update](#computes_update)

## Endpoints

- [CreateOrUpdate](#endpoints_createorupdate)
- [Delete](#endpoints_delete)
- [Get](#endpoints_get)
- [List](#endpoints_list)
- [Update](#endpoints_update)

## NeonDatabases

- [CreateOrUpdate](#neondatabases_createorupdate)
- [Delete](#neondatabases_delete)
- [Get](#neondatabases_get)
- [List](#neondatabases_list)
- [Update](#neondatabases_update)

## NeonRoles

- [CreateOrUpdate](#neonroles_createorupdate)
- [Delete](#neonroles_delete)
- [Get](#neonroles_get)
- [List](#neonroles_list)
- [Update](#neonroles_update)

## Operations

- [List](#operations_list)

## Organizations

- [CreateOrUpdate](#organizations_createorupdate)
- [Delete](#organizations_delete)
- [GetByResourceGroup](#organizations_getbyresourcegroup)
- [GetPostgresVersions](#organizations_getpostgresversions)
- [List](#organizations_list)
- [ListByResourceGroup](#organizations_listbyresourcegroup)
- [Update](#organizations_update)

## Projects

- [CreateOrUpdate](#projects_createorupdate)
- [Delete](#projects_delete)
- [Get](#projects_get)
- [GetConnectionUri](#projects_getconnectionuri)
- [List](#projects_list)
- [Update](#projects_update)
### Branches_CreateOrUpdate

```java
/**
 * Samples for Computes Get.
 */
public final class ComputesGetSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Computes_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Computes_Get_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void computesGetMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.computes()
            .getWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", "test-entity",
                com.azure.core.util.Context.NONE);
    }
}
```

### Branches_Delete

```java
import com.azure.resourcemanager.neonpostgres.models.fluent.models.ConnectionUriPropertiesInner;

/**
 * Samples for Projects GetConnectionUri.
 */
public final class ProjectsGetConnectionUriSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Projects_GetConnectionUri_MaximumSet_Gen.json
     */
    /**
     * Sample code: Projects_GetConnectionUri_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        projectsGetConnectionUriMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.projects()
            .getConnectionUriWithResponse("rgneon", "testOrg123", "test-entity",
                new ConnectionUriPropertiesInner().withProjectId("jfbzabgdsxnaopubcgavnykgza")
                    .withBranchId("rxfwxomuukix")
                    .withDatabaseName("kqjsyemrjhe")
                    .withRoleName("vven")
                    .withEndpointId("mnjkdgqhlfqcdxmnzoyqiaakt")
                    .withIsPooled(true),
                com.azure.core.util.Context.NONE);
    }
}
```

### Branches_Get

```java
/**
 * Samples for NeonDatabases List.
 */
public final class NeonDatabasesListSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/NeonDatabases_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: NeonDatabases_List_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void neonDatabasesListMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.neonDatabases()
            .list("rgneon", "testOrg123", "test-entity", "test-entity", com.azure.core.util.Context.NONE);
    }
}
```

### Branches_List

```java
/**
 * Samples for Organizations GetByResourceGroup.
 */
public final class OrganizationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Organizations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Get_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void organizationsGetMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.organizations()
            .getByResourceGroupWithResponse("rgneon", "testOrg123", com.azure.core.util.Context.NONE);
    }
}
```

### Branches_Update

```java
/**
 * Samples for Organizations ListByResourceGroup.
 */
public final class OrganizationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Organizations_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListByResourceGroup_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        organizationsListByResourceGroupMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.organizations().listByResourceGroup("rgneon", com.azure.core.util.Context.NONE);
    }
}
```

### Computes_CreateOrUpdate

```java
/**
 * Samples for Projects Get.
 */
public final class ProjectsGetSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Projects_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Projects_Get_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void projectsGetMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.projects().getWithResponse("rgneon", "testOrg123", "testProject123", com.azure.core.util.Context.NONE);
    }
}
```

### Computes_Delete

```java
/**
 * Samples for Branches List.
 */
public final class BranchesListSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Branches_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Branches_List_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void branchesListMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.branches().list("rgneon", "testOrg123", "test-entity", com.azure.core.util.Context.NONE);
    }
}
```

### Computes_Get

```java
/**
 * Samples for NeonRoles Delete.
 */
public final class NeonRolesDeleteSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/NeonRoles_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: NeonRoles_Delete_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void neonRolesDeleteMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.neonRoles()
            .deleteWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", "test-entity",
                com.azure.core.util.Context.NONE);
    }
}
```

### Computes_List

```java
import com.azure.resourcemanager.neonpostgres.models.Project;
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.BranchProperties;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointProperties;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointType;
import com.azure.resourcemanager.neonpostgres.models.models.NeonDatabaseProperties;
import com.azure.resourcemanager.neonpostgres.models.models.NeonRoleProperties;
import com.azure.resourcemanager.neonpostgres.models.models.ProjectProperties;
import java.util.Arrays;

/**
 * Samples for Projects Update.
 */
public final class ProjectsUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Projects_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Projects_Update_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void projectsUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        Project resource = manager.projects()
            .getWithResponse("rgneon", "testOrg123", "test-entity", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new ProjectProperties().withEntityName("test-name")
                .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                .withRegionId("cpnssldzuftdqgjdaqzjayqujpb")
                .withStorage(3L)
                .withPgVersion(1)
                .withBranch(new BranchProperties().withEntityName("test-name")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withProjectId("vtdzaxdiwnzvq")
                    .withParentId("test-id")
                    .withRoleName("imfhfgfpamibgcgibgxor")
                    .withDatabaseName("xargveemydmqrdtjcdhf")
                    .withRoles(Arrays.asList(new NeonRoleProperties().withEntityName("test-name")
                        .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                        .withBranchId("iecxepxhnzhjzeiguki")
                        .withPermissions(Arrays.asList("ddwmkyztotgspcbetfokelddpmq"))
                        .withIsSuperUser(true)))
                    .withDatabases(Arrays.asList(new NeonDatabaseProperties().withEntityName("test-name")
                        .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                        .withBranchId("zoaopvqitcgjdmsllgzdbrb")
                        .withOwnerName("cutdyjupbqghhxfkmsslzvmjwa")))
                    .withEndpoints(Arrays.asList(new EndpointProperties().withEntityName("test-name")
                        .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                        .withProjectId("fhfdyuiaaftqormerayks")
                        .withBranchId("oejenjawxexhuotsxodbl")
                        .withEndpointType(EndpointType.READ_ONLY))))
                .withRoles(Arrays.asList(new NeonRoleProperties().withEntityName("test-name")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withBranchId("iecxepxhnzhjzeiguki")
                    .withPermissions(Arrays.asList("ddwmkyztotgspcbetfokelddpmq"))
                    .withIsSuperUser(true)))
                .withDatabases(Arrays.asList(new NeonDatabaseProperties().withEntityName("test-name")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withBranchId("zoaopvqitcgjdmsllgzdbrb")
                    .withOwnerName("cutdyjupbqghhxfkmsslzvmjwa")))
                .withEndpoints(Arrays.asList(new EndpointProperties().withEntityName("test-name")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withProjectId("fhfdyuiaaftqormerayks")
                    .withBranchId("oejenjawxexhuotsxodbl")
                    .withEndpointType(EndpointType.READ_ONLY))))
            .apply();
    }
}
```

### Computes_Update

```java
/**
 * Samples for Endpoints List.
 */
public final class EndpointsListSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Endpoints_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Endpoints_List_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void endpointsListMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.endpoints()
            .list("rgneon", "testOrg123", "test-entity", "test-entity", com.azure.core.util.Context.NONE);
    }
}
```

### Endpoints_CreateOrUpdate

```java
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.BranchProperties;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointProperties;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointType;
import com.azure.resourcemanager.neonpostgres.models.models.NeonDatabaseProperties;
import com.azure.resourcemanager.neonpostgres.models.models.NeonRoleProperties;
import java.util.Arrays;

/**
 * Samples for Branches CreateOrUpdate.
 */
public final class BranchesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Branches_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Branches_CreateOrUpdate_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        branchesCreateOrUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.branches()
            .define("test-entity")
            .withExistingProject("rgneon", "testOrg123", "test-entity")
            .withProperties(new BranchProperties().withEntityName("test-entity")
                .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                .withProjectId("vtdzaxdiwnzvq")
                .withParentId("test-id")
                .withRoleName("imfhfgfpamibgcgibgxor")
                .withDatabaseName("xargveemydmqrdtjcdhf")
                .withRoles(Arrays.asList(new NeonRoleProperties().withEntityName("test-entity")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withBranchId("iecxepxhnzhjzeiguki")
                    .withPermissions(Arrays.asList("ddwmkyztotgspcbetfokelddpmq"))
                    .withIsSuperUser(true)))
                .withDatabases(Arrays.asList(new NeonDatabaseProperties().withEntityName("test-entity")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withBranchId("zoaopvqitcgjdmsllgzdbrb")
                    .withOwnerName("cutdyjupbqghhxfkmsslzvmjwa")))
                .withEndpoints(Arrays.asList(new EndpointProperties().withEntityName("test-entity")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withProjectId("fhfdyuiaaftqormerayks")
                    .withBranchId("oejenjawxexhuotsxodbl")
                    .withEndpointType(EndpointType.READ_ONLY))))
            .create();
    }
}
```

### Endpoints_Delete

```java
import com.azure.resourcemanager.neonpostgres.models.Endpoint;
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointProperties;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointType;
import java.util.Arrays;

/**
 * Samples for Endpoints Update.
 */
public final class EndpointsUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Endpoints_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Endpoints_Update_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void endpointsUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        Endpoint resource = manager.endpoints()
            .getWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", "test-entity",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new EndpointProperties().withEntityName("test-name")
                .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                .withProjectId("fhfdyuiaaftqormerayks")
                .withBranchId("oejenjawxexhuotsxodbl")
                .withEndpointType(EndpointType.READ_ONLY))
            .apply();
    }
}
```

### Endpoints_Get

```java
/**
 * Samples for Projects List.
 */
public final class ProjectsListSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Projects_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Projects_List_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void projectsListMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.projects().list("rgneon", "testOrg123", com.azure.core.util.Context.NONE);
    }
}
```

### Endpoints_List

```java
/**
 * Samples for Branches Delete.
 */
public final class BranchesDeleteSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Branches_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Branches_Delete_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void branchesDeleteMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.branches()
            .deleteWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", com.azure.core.util.Context.NONE);
    }
}
```

### Endpoints_Update

```java
/**
 * Samples for Endpoints Get.
 */
public final class EndpointsGetSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Endpoints_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Endpoints_Get_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void endpointsGetMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.endpoints()
            .getWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", "test-entity",
                com.azure.core.util.Context.NONE);
    }
}
```

### NeonDatabases_CreateOrUpdate

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MinimumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void operationsListMinimumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2025-03-01-preview/Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void operationsListMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### NeonDatabases_Delete

```java
import com.azure.resourcemanager.neonpostgres.models.Compute;
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.ComputeProperties;
import java.util.Arrays;

/**
 * Samples for Computes Update.
 */
public final class ComputesUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Computes_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Computes_Update_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void computesUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        Compute resource = manager.computes()
            .getWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", "test-entity",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new ComputeProperties().withEntityName("test-name")
                .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                .withRegion("zgwbivhuqnyyy")
                .withCpuCores(26)
                .withMemory(4)
                .withStatus("lvivnemgmdnwshhpfimppxmmpkv"))
            .apply();
    }
}
```

### NeonDatabases_Get

```java
/**
 * Samples for NeonRoles Get.
 */
public final class NeonRolesGetSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/NeonRoles_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: NeonRoles_Get_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void neonRolesGetMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.neonRoles()
            .getWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", "test-entity",
                com.azure.core.util.Context.NONE);
    }
}
```

### NeonDatabases_List

```java
/**
 * Samples for Branches Get.
 */
public final class BranchesGetSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Branches_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Branches_Get_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void branchesGetMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.branches()
            .getWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", com.azure.core.util.Context.NONE);
    }
}
```

### NeonDatabases_Update

```java
/**
 * Samples for Organizations Delete.
 */
public final class OrganizationsDeleteSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Organizations_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Delete_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        organizationsDeleteMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.organizations().delete("rgneon", "testOrg123", com.azure.core.util.Context.NONE);
    }
}
```

### NeonRoles_CreateOrUpdate

```java
/**
 * Samples for NeonDatabases Delete.
 */
public final class NeonDatabasesDeleteSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/NeonDatabases_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: NeonDatabases_Delete_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        neonDatabasesDeleteMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.neonDatabases()
            .deleteWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", "test-entity",
                com.azure.core.util.Context.NONE);
    }
}
```

### NeonRoles_Delete

```java
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.NeonDatabaseProperties;
import java.util.Arrays;

/**
 * Samples for NeonDatabases CreateOrUpdate.
 */
public final class NeonDatabasesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/NeonDatabases_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: NeonDatabases_CreateOrUpdate_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        neonDatabasesCreateOrUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.neonDatabases()
            .define("test-entity")
            .withExistingBranche("rgneon", "testOrg123", "test-entity", "test-entity")
            .withProperties(new NeonDatabaseProperties().withEntityName("test-name")
                .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                .withBranchId("zoaopvqitcgjdmsllgzdbrb")
                .withOwnerName("cutdyjupbqghhxfkmsslzvmjwa"))
            .create();
    }
}
```

### NeonRoles_Get

```java
/**
 * Samples for NeonDatabases Get.
 */
public final class NeonDatabasesGetSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/NeonDatabases_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: NeonDatabases_Get_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void neonDatabasesGetMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.neonDatabases()
            .getWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", "test-entity",
                com.azure.core.util.Context.NONE);
    }
}
```

### NeonRoles_List

```java
import com.azure.resourcemanager.neonpostgres.models.NeonRole;
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.NeonRoleProperties;
import java.util.Arrays;

/**
 * Samples for NeonRoles Update.
 */
public final class NeonRolesUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/NeonRoles_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: NeonRoles_Update_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void neonRolesUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        NeonRole resource = manager.neonRoles()
            .getWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", "test-entity",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new NeonRoleProperties().withEntityName("test-name")
                .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                .withBranchId("iecxepxhnzhjzeiguki")
                .withPermissions(Arrays.asList("ddwmkyztotgspcbetfokelddpmq"))
                .withIsSuperUser(true))
            .apply();
    }
}
```

### NeonRoles_Update

```java
/**
 * Samples for Projects Delete.
 */
public final class ProjectsDeleteSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Projects_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Projects_Delete_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void projectsDeleteMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.projects().deleteWithResponse("rgneon", "testOrg123", "test-entity", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.resourcemanager.neonpostgres.models.CompanyDetails;
import com.azure.resourcemanager.neonpostgres.models.MarketplaceDetails;
import com.azure.resourcemanager.neonpostgres.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.neonpostgres.models.OfferDetails;
import com.azure.resourcemanager.neonpostgres.models.OrganizationProperties;
import com.azure.resourcemanager.neonpostgres.models.PartnerOrganizationProperties;
import com.azure.resourcemanager.neonpostgres.models.SingleSignOnProperties;
import com.azure.resourcemanager.neonpostgres.models.SingleSignOnStates;
import com.azure.resourcemanager.neonpostgres.models.UserDetails;
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.BranchProperties;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointProperties;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointType;
import com.azure.resourcemanager.neonpostgres.models.models.NeonDatabaseProperties;
import com.azure.resourcemanager.neonpostgres.models.models.NeonRoleProperties;
import com.azure.resourcemanager.neonpostgres.models.models.ProjectProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Organizations CreateOrUpdate.
 */
public final class OrganizationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Organizations_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_CreateOrUpdate_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        organizationsCreateOrUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.organizations()
            .define("testOrg123")
            .withRegion("mxlsmperqlxtaalsunpleuta")
            .withExistingResourceGroup("rgneon")
            .withTags(mapOf("key9495", "fakeTokenPlaceholder"))
            .withProperties(new OrganizationProperties()
                .withMarketplaceDetails(new MarketplaceDetails().withSubscriptionId("olwmihml")
                    .withSubscriptionStatus(MarketplaceSubscriptionStatus.PENDING_FULFILLMENT_START)
                    .withOfferDetails(new OfferDetails().withPublisherId("wxfrcxidpruciyy")
                        .withOfferId("mg")
                        .withPlanId("ddjcvdyflljaoyfvdnunqgecfhtz")
                        .withPlanName("uciiaiirecatgizjitryrfcxlsrll")
                        .withTermUnit("vljoeixsyfqnilhy")
                        .withTermId("spwiydyzbdi")))
                .withUserDetails(new UserDetails().withFirstName("zoqvvuxxyldsfswe")
                    .withLastName("rzvayulpqh")
                    .withEmailAddress("test@microsoft.com")
                    .withUpn("nbh")
                    .withPhoneNumber("lxxghuhwknsivwcrkug"))
                .withCompanyDetails(new CompanyDetails().withCompanyName("bdplqyy")
                    .withCountry("wdtegxupoepgebaudbdi")
                    .withOfficeAddress("aqxujkkctyhsefilbcvlo")
                    .withBusinessPhone("nshcjawuxfzplbzeyjbd")
                    .withDomain("jxnqzzdhtguhtuouqhx")
                    .withNumberOfEmployees(15L))
                .withPartnerOrganizationProperties(
                    new PartnerOrganizationProperties().withOrganizationId("yneivfklykgwuqnfzsphgtgbvqew")
                        .withOrganizationName("test-entity")
                        .withSingleSignOnProperties(new SingleSignOnProperties()
                            .withSingleSignOnState(SingleSignOnStates.INITIAL)
                            .withEnterpriseAppId("jstu")
                            .withSingleSignOnUrl("rduuuystfxtrjaxjbrslrsqxajtou")
                            .withAadDomains(Arrays.asList("xwcoekddrjlvwogssbfrv"))))
                .withProjectProperties(new ProjectProperties().withEntityName("test-entity")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withRegionId("cpnssldzuftdqgjdaqzjayqujpb")
                    .withStorage(3L)
                    .withPgVersion(1)
                    .withBranch(new BranchProperties().withEntityName("test-entity")
                        .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                        .withProjectId("vtdzaxdiwnzvq")
                        .withParentId("test-id")
                        .withRoleName("imfhfgfpamibgcgibgxor")
                        .withDatabaseName("xargveemydmqrdtjcdhf")
                        .withRoles(Arrays.asList(new NeonRoleProperties().withEntityName("test-entity")
                            .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                            .withBranchId("iecxepxhnzhjzeiguki")
                            .withPermissions(Arrays.asList("ddwmkyztotgspcbetfokelddpmq"))
                            .withIsSuperUser(true)))
                        .withDatabases(Arrays.asList(new NeonDatabaseProperties().withEntityName("test-entity")
                            .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                            .withBranchId("zoaopvqitcgjdmsllgzdbrb")
                            .withOwnerName("cutdyjupbqghhxfkmsslzvmjwa")))
                        .withEndpoints(Arrays.asList(new EndpointProperties().withEntityName("test-entity")
                            .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                            .withProjectId("fhfdyuiaaftqormerayks")
                            .withBranchId("oejenjawxexhuotsxodbl")
                            .withEndpointType(EndpointType.READ_ONLY))))
                    .withRoles(Arrays.asList(new NeonRoleProperties().withEntityName("test-entity")
                        .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                        .withBranchId("iecxepxhnzhjzeiguki")
                        .withPermissions(Arrays.asList("ddwmkyztotgspcbetfokelddpmq"))
                        .withIsSuperUser(true)))
                    .withDatabases(Arrays.asList(new NeonDatabaseProperties().withEntityName("test-entity")
                        .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                        .withBranchId("zoaopvqitcgjdmsllgzdbrb")
                        .withOwnerName("cutdyjupbqghhxfkmsslzvmjwa")))
                    .withEndpoints(Arrays.asList(new EndpointProperties().withEntityName("test-entity")
                        .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                        .withProjectId("fhfdyuiaaftqormerayks")
                        .withBranchId("oejenjawxexhuotsxodbl")
                        .withEndpointType(EndpointType.READ_ONLY)))))
            .create();
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

### Organizations_CreateOrUpdate

```java
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.ComputeProperties;
import java.util.Arrays;

/**
 * Samples for Computes CreateOrUpdate.
 */
public final class ComputesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Computes_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Computes_CreateOrUpdate_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        computesCreateOrUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.computes()
            .define("test-entity")
            .withExistingBranche("rgneon", "testOrg123", "test-entity", "test-entity")
            .withProperties(new ComputeProperties().withEntityName("test-name")
                .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                .withRegion("zgwbivhuqnyyy")
                .withCpuCores(26)
                .withMemory(4)
                .withStatus("lvivnemgmdnwshhpfimppxmmpkv"))
            .create();
    }
}
```

### Organizations_Delete

```java
import com.azure.resourcemanager.neonpostgres.models.models.PgVersion;

/**
 * Samples for Organizations GetPostgresVersions.
 */
public final class OrganizationsGetPostgresVersionsSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Organizations_GetPostgresVersions_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_GetPostgresVersions_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        organizationsGetPostgresVersionsMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.organizations()
            .getPostgresVersionsWithResponse("rgneon", new PgVersion().withVersion(9),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2025-03-01-preview/Organizations_GetPostgresVersions_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_GetPostgresVersions_MinimumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        organizationsGetPostgresVersionsMinimumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.organizations().getPostgresVersionsWithResponse("rgneon", null, com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_GetByResourceGroup

```java
/**
 * Samples for Computes List.
 */
public final class ComputesListSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Computes_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Computes_List_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void computesListMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.computes().list("rgneon", "testOrg123", "test-entity", "test-entity", com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_GetPostgresVersions

```java
/**
 * Samples for Organizations List.
 */
public final class OrganizationsListSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Organizations_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListBySubscription_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        organizationsListBySubscriptionMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.organizations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_List

```java
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.NeonRoleProperties;
import java.util.Arrays;

/**
 * Samples for NeonRoles CreateOrUpdate.
 */
public final class NeonRolesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/NeonRoles_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: NeonRoles_CreateOrUpdate_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        neonRolesCreateOrUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.neonRoles()
            .define("test-entity")
            .withExistingBranche("rgneon", "testOrg123", "test-entity", "test-entity")
            .withProperties(new NeonRoleProperties().withEntityName("test-name")
                .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                .withBranchId("iecxepxhnzhjzeiguki")
                .withPermissions(Arrays.asList("ddwmkyztotgspcbetfokelddpmq"))
                .withIsSuperUser(true))
            .create();
    }
}
```

### Organizations_ListByResourceGroup

```java
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointProperties;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointType;
import java.util.Arrays;

/**
 * Samples for Endpoints CreateOrUpdate.
 */
public final class EndpointsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Endpoints_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Endpoints_CreateOrUpdate_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        endpointsCreateOrUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.endpoints()
            .define("test-entity")
            .withExistingBranche("rgneon", "testOrg123", "test-entity", "test-entity")
            .withProperties(new EndpointProperties().withEntityName("test-name")
                .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                .withProjectId("fhfdyuiaaftqormerayks")
                .withBranchId("oejenjawxexhuotsxodbl")
                .withEndpointType(EndpointType.READ_ONLY))
            .create();
    }
}
```

### Organizations_Update

```java
/**
 * Samples for Endpoints Delete.
 */
public final class EndpointsDeleteSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Endpoints_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Endpoints_Delete_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void endpointsDeleteMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.endpoints()
            .deleteWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", "test-entity",
                com.azure.core.util.Context.NONE);
    }
}
```

### Projects_CreateOrUpdate

```java
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.BranchProperties;
import com.azure.resourcemanager.neonpostgres.models.models.DefaultEndpointSettings;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointProperties;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointType;
import com.azure.resourcemanager.neonpostgres.models.models.NeonDatabaseProperties;
import com.azure.resourcemanager.neonpostgres.models.models.NeonRoleProperties;
import com.azure.resourcemanager.neonpostgres.models.models.ProjectProperties;
import java.util.Arrays;

/**
 * Samples for Projects CreateOrUpdate.
 */
public final class ProjectsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Projects_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Projects_CreateOrUpdate_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        projectsCreateOrUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.projects()
            .define("test-entity")
            .withExistingOrganization("rgneon", "testOrg123")
            .withProperties(new ProjectProperties().withEntityName("test-name")
                .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                .withRegionId("cpnssldzuftdqgjdaqzjayqujpb")
                .withStorage(3L)
                .withPgVersion(1)
                .withHistoryRetention(3600)
                .withDefaultEndpointSettings(
                    new DefaultEndpointSettings().withAutoscalingLimitMinCu(0.25).withAutoscalingLimitMaxCu(4.0))
                .withBranch(new BranchProperties().withEntityName("test-name")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withProjectId("vtdzaxdiwnzvq")
                    .withParentId("test-id")
                    .withRoleName("imfhfgfpamibgcgibgxor")
                    .withDatabaseName("xargveemydmqrdtjcdhf")
                    .withRoles(Arrays.asList(new NeonRoleProperties().withEntityName("test-name")
                        .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                        .withBranchId("iecxepxhnzhjzeiguki")
                        .withPermissions(Arrays.asList("ddwmkyztotgspcbetfokelddpmq"))
                        .withIsSuperUser(true)))
                    .withDatabases(Arrays.asList(new NeonDatabaseProperties().withEntityName("test-name")
                        .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                        .withBranchId("zoaopvqitcgjdmsllgzdbrb")
                        .withOwnerName("cutdyjupbqghhxfkmsslzvmjwa")))
                    .withEndpoints(Arrays.asList(new EndpointProperties().withEntityName("test-name")
                        .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                        .withProjectId("fhfdyuiaaftqormerayks")
                        .withBranchId("oejenjawxexhuotsxodbl")
                        .withEndpointType(EndpointType.READ_ONLY))))
                .withRoles(Arrays.asList(new NeonRoleProperties().withEntityName("test-name")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withBranchId("iecxepxhnzhjzeiguki")
                    .withPermissions(Arrays.asList("ddwmkyztotgspcbetfokelddpmq"))
                    .withIsSuperUser(true)))
                .withDatabases(Arrays.asList(new NeonDatabaseProperties().withEntityName("test-name")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withBranchId("zoaopvqitcgjdmsllgzdbrb")
                    .withOwnerName("cutdyjupbqghhxfkmsslzvmjwa")))
                .withEndpoints(Arrays.asList(new EndpointProperties().withEntityName("test-name")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withProjectId("fhfdyuiaaftqormerayks")
                    .withBranchId("oejenjawxexhuotsxodbl")
                    .withEndpointType(EndpointType.READ_ONLY))))
            .create();
    }
}
```

### Projects_Delete

```java
import com.azure.resourcemanager.neonpostgres.models.Branch;
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.BranchProperties;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointProperties;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointType;
import com.azure.resourcemanager.neonpostgres.models.models.NeonDatabaseProperties;
import com.azure.resourcemanager.neonpostgres.models.models.NeonRoleProperties;
import java.util.Arrays;

/**
 * Samples for Branches Update.
 */
public final class BranchesUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Branches_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Branches_Update_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void branchesUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        Branch resource = manager.branches()
            .getWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new BranchProperties().withEntityName("test-name")
                .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                .withProjectId("vtdzaxdiwnzvq")
                .withParentId("test-id")
                .withRoleName("imfhfgfpamibgcgibgxor")
                .withDatabaseName("xargveemydmqrdtjcdhf")
                .withRoles(Arrays.asList(new NeonRoleProperties().withEntityName("test-name")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withBranchId("iecxepxhnzhjzeiguki")
                    .withPermissions(Arrays.asList("ddwmkyztotgspcbetfokelddpmq"))
                    .withIsSuperUser(true)))
                .withDatabases(Arrays.asList(new NeonDatabaseProperties().withEntityName("test-name")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withBranchId("zoaopvqitcgjdmsllgzdbrb")
                    .withOwnerName("cutdyjupbqghhxfkmsslzvmjwa")))
                .withEndpoints(Arrays.asList(new EndpointProperties().withEntityName("test-name")
                    .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                    .withProjectId("fhfdyuiaaftqormerayks")
                    .withBranchId("oejenjawxexhuotsxodbl")
                    .withEndpointType(EndpointType.READ_ONLY))))
            .apply();
    }
}
```

### Projects_Get

```java
import com.azure.resourcemanager.neonpostgres.models.CompanyDetails;
import com.azure.resourcemanager.neonpostgres.models.OrganizationProperties;
import com.azure.resourcemanager.neonpostgres.models.OrganizationResource;
import com.azure.resourcemanager.neonpostgres.models.PartnerOrganizationProperties;
import com.azure.resourcemanager.neonpostgres.models.SingleSignOnProperties;
import com.azure.resourcemanager.neonpostgres.models.SingleSignOnStates;
import com.azure.resourcemanager.neonpostgres.models.UserDetails;
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.BranchProperties;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointProperties;
import com.azure.resourcemanager.neonpostgres.models.models.EndpointType;
import com.azure.resourcemanager.neonpostgres.models.models.NeonDatabaseProperties;
import com.azure.resourcemanager.neonpostgres.models.models.NeonRoleProperties;
import com.azure.resourcemanager.neonpostgres.models.models.ProjectProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Organizations Update.
 */
public final class OrganizationsUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Organizations_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Update_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        organizationsUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        OrganizationResource resource = manager.organizations()
            .getByResourceGroupWithResponse("rgneon", "testOrg123", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("key4550", "fakeTokenPlaceholder"))
            .withProperties(
                new OrganizationProperties()
                    .withUserDetails(new UserDetails().withFirstName("zoqvvuxxyldsfswe")
                        .withLastName("rzvayulpqh")
                        .withEmailAddress("test@microsoft.com")
                        .withUpn("nbh")
                        .withPhoneNumber("lxxghuhwknsivwcrkug"))
                    .withCompanyDetails(new CompanyDetails().withCompanyName("bdplqyy")
                        .withCountry("wdtegxupoepgebaudbdi")
                        .withOfficeAddress("aqxujkkctyhsefilbcvlo")
                        .withBusinessPhone("nshcjawuxfzplbzeyjbd")
                        .withDomain("jxnqzzdhtguhtuouqhx")
                        .withNumberOfEmployees(15L))
                    .withPartnerOrganizationProperties(new PartnerOrganizationProperties().withOrganizationId("hzwspmh")
                        .withOrganizationName("test-entity")
                        .withSingleSignOnProperties(new SingleSignOnProperties()
                            .withSingleSignOnState(SingleSignOnStates.INITIAL)
                            .withEnterpriseAppId("jstu")
                            .withSingleSignOnUrl("rduuuystfxtrjaxjbrslrsqxajtou")
                            .withAadDomains(Arrays.asList("xwcoekddrjlvwogssbfrv"))))
                    .withProjectProperties(new ProjectProperties().withEntityName("test-entity")
                        .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                        .withRegionId("cpnssldzuftdqgjdaqzjayqujpb")
                        .withStorage(3L)
                        .withPgVersion(1)
                        .withBranch(new BranchProperties().withEntityName("test-entity")
                            .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                            .withProjectId("vtdzaxdiwnzvq")
                            .withParentId("test-id")
                            .withRoleName("imfhfgfpamibgcgibgxor")
                            .withDatabaseName("xargveemydmqrdtjcdhf")
                            .withRoles(Arrays.asList(new NeonRoleProperties().withEntityName("test-entity")
                                .withAttributes(
                                    Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                                .withBranchId("iecxepxhnzhjzeiguki")
                                .withPermissions(Arrays.asList("ddwmkyztotgspcbetfokelddpmq"))
                                .withIsSuperUser(true)))
                            .withDatabases(Arrays.asList(new NeonDatabaseProperties().withEntityName("test-entity")
                                .withAttributes(
                                    Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                                .withBranchId("zoaopvqitcgjdmsllgzdbrb")
                                .withOwnerName("cutdyjupbqghhxfkmsslzvmjwa")))
                            .withEndpoints(Arrays.asList(new EndpointProperties().withEntityName("test-entity")
                                .withAttributes(
                                    Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                                .withProjectId("fhfdyuiaaftqormerayks")
                                .withBranchId("oejenjawxexhuotsxodbl")
                                .withEndpointType(EndpointType.READ_ONLY))))
                        .withRoles(Arrays.asList(new NeonRoleProperties().withEntityName("test-entity")
                            .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                            .withBranchId("iecxepxhnzhjzeiguki")
                            .withPermissions(Arrays.asList("ddwmkyztotgspcbetfokelddpmq"))
                            .withIsSuperUser(true)))
                        .withDatabases(Arrays.asList(new NeonDatabaseProperties().withEntityName("test-entity")
                            .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                            .withBranchId("zoaopvqitcgjdmsllgzdbrb")
                            .withOwnerName("cutdyjupbqghhxfkmsslzvmjwa")))
                        .withEndpoints(Arrays.asList(new EndpointProperties().withEntityName("test-entity")
                            .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                            .withProjectId("fhfdyuiaaftqormerayks")
                            .withBranchId("oejenjawxexhuotsxodbl")
                            .withEndpointType(EndpointType.READ_ONLY)))))
            .apply();
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

### Projects_GetConnectionUri

```java
/**
 * Samples for NeonRoles List.
 */
public final class NeonRolesListSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/NeonRoles_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: NeonRoles_List_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void neonRolesListMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.neonRoles()
            .list("rgneon", "testOrg123", "test-entity", "test-entity", com.azure.core.util.Context.NONE);
    }
}
```

### Projects_List

```java
/**
 * Samples for Computes Delete.
 */
public final class ComputesDeleteSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/Computes_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Computes_Delete_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void computesDeleteMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        manager.computes()
            .deleteWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", "test-entity",
                com.azure.core.util.Context.NONE);
    }
}
```

### Projects_Update

```java
import com.azure.resourcemanager.neonpostgres.models.NeonDatabase;
import com.azure.resourcemanager.neonpostgres.models.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.models.NeonDatabaseProperties;
import java.util.Arrays;

/**
 * Samples for NeonDatabases Update.
 */
public final class NeonDatabasesUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01-preview/NeonDatabases_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: NeonDatabases_Update_MaximumSet.
     * 
     * @param manager Entry point to NeonPostgresManager.
     */
    public static void
        neonDatabasesUpdateMaximumSet(com.azure.resourcemanager.neonpostgres.NeonPostgresManager manager) {
        NeonDatabase resource = manager.neonDatabases()
            .getWithResponse("rgneon", "testOrg123", "test-entity", "test-entity", "test-entity",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new NeonDatabaseProperties().withEntityName("test-name")
                .withAttributes(Arrays.asList(new Attributes().withName("ioyjfywmt").withValue("sfbpcr")))
                .withBranchId("zoaopvqitcgjdmsllgzdbrb")
                .withOwnerName("cutdyjupbqghhxfkmsslzvmjwa"))
            .apply();
    }
}
```

