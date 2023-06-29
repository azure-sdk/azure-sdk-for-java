# Code snippets and samples


## Application

- [Get](#application_get)
- [List](#application_list)
- [ListByRuleId](#application_listbyruleid)
- [Update](#application_update)

## ApplicationMappingRules

- [CreateOrUpdate](#applicationmappingrules_createorupdate)
- [Delete](#applicationmappingrules_delete)
- [Get](#applicationmappingrules_get)
- [List](#applicationmappingrules_list)
### Application_Get

```java
/** Samples for Application Get. */
public final class ApplicationGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/Applications/GetApplicationSingle_example.json
     */
    /**
     * Sample code: Retrieve an application.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void retrieveAnApplication(com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .applications()
            .getWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23",
                "ad9a8e26-29d9-4829-bb30-e597a58cdb45",
                "ad9a8e26-29d9-4829-bb30-e597a58cds72",
                com.azure.core.util.Context.NONE);
    }
}
```

### Application_List

```java
/** Samples for Application List. */
public final class ApplicationListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/Applications/ListApplicationsByEnvironment_example.json
     */
    /**
     * Sample code: Get a list of applications by environment.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getAListOfApplicationsByEnvironment(com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .applications()
            .list("subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23", com.azure.core.util.Context.NONE);
    }
}
```

### Application_ListByRuleId

```java
/** Samples for Application ListByRuleId. */
public final class ApplicationListByRuleIdSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/Applications/ListApplicationsByRuleId_example.json
     */
    /**
     * Sample code: Get list of applications by rule Id.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getListOfApplicationsByRuleId(com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .applications()
            .listByRuleId(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23",
                "ad9a8e26-29d9-4829-bb30-e597a58cdb45",
                com.azure.core.util.Context.NONE);
    }
}
```

### Application_Update

```java
import com.azure.resourcemanager.security.fluent.models.ApplicationInner;
import com.azure.resourcemanager.security.models.BusinessCriticality;

/** Samples for Application Update. */
public final class ApplicationUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/Applications/PutApplication_example.json
     */
    /**
     * Sample code: Update an application.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void updateAnApplication(com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .applications()
            .updateWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23",
                "ad9a8e26-29d9-4829-bb30-e597a58cdb45",
                "ad9a8e26-29d9-4829-bb30-e597a58cds72",
                new ApplicationInner()
                    .withTenantId("f0b6d37b-e4bc-4719-9291-c066c3194f23")
                    .withKqlQuery("")
                    .withApplicationOwner("")
                    .withBusinessCriticality(BusinessCriticality.HIGH),
                com.azure.core.util.Context.NONE);
    }
}
```

### ApplicationMappingRules_CreateOrUpdate

```java
import com.azure.resourcemanager.security.models.ApplicationMappingRule;
import java.util.Arrays;

/** Samples for ApplicationMappingRules CreateOrUpdate. */
public final class ApplicationMappingRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/ApplicationMappingRules/PutManagementGroupApplicationMappingRule_example.json
     */
    /**
     * Sample code: Update an application mapping rule over management group scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void updateAnApplicationMappingRuleOverManagementGroupScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        ApplicationMappingRule resource =
            manager
                .applicationMappingRules()
                .getWithResponse(
                    "providers/Microsoft.Management/managementGroups/contoso",
                    "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTenantId("f0b6d37b-e4bc-4719-9291-c066c3194f23")
            .withDisplayName("Admin's rule")
            .withDescription("A rule for application business criticality")
            .withMappingTagKeys(Arrays.asList("prod"))
            .withIncludedMappingTagValues(Arrays.asList())
            .withDeploymentEnvironment("prod")
            .withExcludedScopes(Arrays.asList())
            .withIncludeMemberScopes(false)
            .apply();
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/ApplicationMappingRules/PutSecurityConnectorApplicationMappingRule_example.json
     */
    /**
     * Sample code: Update an application mapping rule over security connector scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void updateAnApplicationMappingRuleOverSecurityConnectorScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        ApplicationMappingRule resource =
            manager
                .applicationMappingRules()
                .getWithResponse(
                    "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourcegroups/gcpResourceGroup/providers/Microsoft.Security/securityConnectors/gcpconnector",
                    "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTenantId("f0b6d37b-e4bc-4719-9291-c066c3194f23")
            .withDisplayName("Admin's rule")
            .withDescription("A rule for application business criticality")
            .withMappingTagKeys(Arrays.asList("prod"))
            .withIncludedMappingTagValues(Arrays.asList())
            .withDeploymentEnvironment("prod")
            .withExcludedScopes(Arrays.asList())
            .withIncludeMemberScopes(false)
            .apply();
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/ApplicationMappingRules/PutApplicationMappingRule_example.json
     */
    /**
     * Sample code: Update an application mapping rule over subscription scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void updateAnApplicationMappingRuleOverSubscriptionScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        ApplicationMappingRule resource =
            manager
                .applicationMappingRules()
                .getWithResponse(
                    "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23",
                    "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTenantId("f0b6d37b-e4bc-4719-9291-c066c3194f23")
            .withDisplayName("Admin's rule")
            .withDescription("A rule for application business criticality")
            .withMappingTagKeys(Arrays.asList("prod"))
            .withIncludedMappingTagValues(Arrays.asList())
            .withDeploymentEnvironment("prod")
            .withExcludedScopes(Arrays.asList())
            .withIncludeMemberScopes(false)
            .apply();
    }
}
```

### ApplicationMappingRules_Delete

```java
/** Samples for ApplicationMappingRules Delete. */
public final class ApplicationMappingRulesDeleteSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/ApplicationMappingRules/DeleteSecurityConnectorApplicationMappingRule_example.json
     */
    /**
     * Sample code: Delete an application mapping rule over security connector scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void deleteAnApplicationMappingRuleOverSecurityConnectorScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .applicationMappingRules()
            .deleteByResourceGroupWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/gcpResourceGroup/providers/Microsoft.Security/securityConnectors/gcpconnector",
                "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/ApplicationMappingRules/DeleteManagementGroupApplicationMappingRule_example.json
     */
    /**
     * Sample code: Delete an application mapping rule over management group scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void deleteAnApplicationMappingRuleOverManagementGroupScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .applicationMappingRules()
            .deleteByResourceGroupWithResponse(
                "providers/Microsoft.Management/managementGroups/contoso",
                "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/ApplicationMappingRules/DeleteApplicationMappingRule_example.json
     */
    /**
     * Sample code: Delete an application mapping rule over subscription scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void deleteAnApplicationMappingRuleOverSubscriptionScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .applicationMappingRules()
            .deleteByResourceGroupWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23",
                "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                com.azure.core.util.Context.NONE);
    }
}
```

### ApplicationMappingRules_Get

```java
/** Samples for ApplicationMappingRules Get. */
public final class ApplicationMappingRulesGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/ApplicationMappingRules/GetApplicationMappingRule_example.json
     */
    /**
     * Sample code: Get an application mapping rule over subscription scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getAnApplicationMappingRuleOverSubscriptionScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .applicationMappingRules()
            .getWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23",
                "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/ApplicationMappingRules/GetSecurityConnectorApplicationMappingRule_example.json
     */
    /**
     * Sample code: Get an application mapping rule over security connector scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getAnApplicationMappingRuleOverSecurityConnectorScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .applicationMappingRules()
            .getWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/gcpResourceGroup/providers/Microsoft.Security/securityConnectors/gcpconnector",
                "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/ApplicationMappingRules/GetManagementGroupApplicationMappingRule_example.json
     */
    /**
     * Sample code: Get an application mapping rule over management group scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getAnApplicationMappingRuleOverManagementGroupScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .applicationMappingRules()
            .getWithResponse(
                "providers/Microsoft.Management/managementGroups/contoso",
                "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                com.azure.core.util.Context.NONE);
    }
}
```

### ApplicationMappingRules_List

```java
/** Samples for ApplicationMappingRules List. */
public final class ApplicationMappingRulesListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/ApplicationMappingRules/ListApplicationMappingRulesBySubscription_example.json
     */
    /**
     * Sample code: Get a list of application mapping rules by subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getAListOfApplicationMappingRulesBySubscription(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .applicationMappingRules()
            .list("subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/ApplicationMappingRules/ListApplicationMappingRulesByManagementGroup_example.json
     */
    /**
     * Sample code: Get a list of application mapping rules by management group.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getAListOfApplicationMappingRulesByManagementGroup(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .applicationMappingRules()
            .list("providers/Microsoft.Management/managementGroups/contoso", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-07-01-preview/examples/ApplicationMappingRules/ListApplicationMappingRulesBySecurityConnector_example.json
     */
    /**
     * Sample code: Get a list of application mapping rules by security connector.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getAListOfApplicationMappingRulesBySecurityConnector(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .applicationMappingRules()
            .list(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/gcpResourceGroup/providers/Microsoft.Security/securityConnectors/gcpconnector",
                com.azure.core.util.Context.NONE);
    }
}
```

