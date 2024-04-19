# Code snippets and samples


## AzureDevOpsOrgs

- [CreateOrUpdate](#azuredevopsorgs_createorupdate)
- [Get](#azuredevopsorgs_get)
- [List](#azuredevopsorgs_list)
- [ListAvailable](#azuredevopsorgs_listavailable)
- [Update](#azuredevopsorgs_update)

## AzureDevOpsProjects

- [CreateOrUpdate](#azuredevopsprojects_createorupdate)
- [Get](#azuredevopsprojects_get)
- [List](#azuredevopsprojects_list)
- [Update](#azuredevopsprojects_update)

## AzureDevOpsRepos

- [CreateOrUpdate](#azuredevopsrepos_createorupdate)
- [Get](#azuredevopsrepos_get)
- [List](#azuredevopsrepos_list)
- [Update](#azuredevopsrepos_update)

## DevOpsConfigurations

- [CreateOrUpdate](#devopsconfigurations_createorupdate)
- [Delete](#devopsconfigurations_delete)
- [Get](#devopsconfigurations_get)
- [List](#devopsconfigurations_list)
- [Update](#devopsconfigurations_update)

## DevOpsOperationResults

- [Get](#devopsoperationresults_get)

## GitHubOwners

- [Get](#githubowners_get)
- [List](#githubowners_list)
- [ListAvailable](#githubowners_listavailable)

## GitHubRepos

- [Get](#githubrepos_get)
- [List](#githubrepos_list)

## GitLabGroups

- [Get](#gitlabgroups_get)
- [List](#gitlabgroups_list)
- [ListAvailable](#gitlabgroups_listavailable)

## GitLabProjects

- [Get](#gitlabprojects_get)
- [List](#gitlabprojects_list)

## GitLabSubgroups

- [List](#gitlabsubgroups_list)
### AzureDevOpsOrgs_CreateOrUpdate

```java
import com.azure.resourcemanager.security.models.ActionableRemediation;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AzureDevOpsOrgProperties;
import com.azure.resourcemanager.security.models.OnboardingState;

/**
 * Samples for AzureDevOpsOrgs CreateOrUpdate.
 */
public final class AzureDevOpsOrgsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/CreateOrUpdateAzureDevOpsOrgs_example.json
     */
    /**
     * Sample code: CreateOrUpdate_AzureDevOpsOrgs.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void createOrUpdateAzureDevOpsOrgs(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.azureDevOpsOrgs()
            .define("myAzDevOpsOrg")
            .withExistingSecurityConnector("myRg", "mySecurityConnectorName")
            .withProperties(new AzureDevOpsOrgProperties().withOnboardingState(OnboardingState.NOT_APPLICABLE)
                .withActionableRemediation(new ActionableRemediation().withState(ActionableRemediationState.ENABLED)))
            .create();
    }
}
```

### AzureDevOpsOrgs_Get

```java
/**
 * Samples for AzureDevOpsOrgs Get.
 */
public final class AzureDevOpsOrgsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/GetAzureDevOpsOrgs_example.json
     */
    /**
     * Sample code: Get_AzureDevOpsOrgs.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getAzureDevOpsOrgs(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.azureDevOpsOrgs()
            .getWithResponse("myRg", "mySecurityConnectorName", "myAzDevOpsOrg", com.azure.core.util.Context.NONE);
    }
}
```

### AzureDevOpsOrgs_List

```java
/**
 * Samples for AzureDevOpsOrgs List.
 */
public final class AzureDevOpsOrgsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/ListAzureDevOpsOrgs_example.json
     */
    /**
     * Sample code: List_AzureDevOpsOrgs.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listAzureDevOpsOrgs(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.azureDevOpsOrgs().list("myRg", "mySecurityConnectorName", com.azure.core.util.Context.NONE);
    }
}
```

### AzureDevOpsOrgs_ListAvailable

```java
/**
 * Samples for AzureDevOpsOrgs ListAvailable.
 */
public final class AzureDevOpsOrgsListAvailableSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/ListAvailableAzureDevOpsOrgs_example.json
     */
    /**
     * Sample code: ListAvailable_AzureDevOpsOrgs.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listAvailableAzureDevOpsOrgs(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.azureDevOpsOrgs()
            .listAvailableWithResponse("myRg", "mySecurityConnectorName", com.azure.core.util.Context.NONE);
    }
}
```

### AzureDevOpsOrgs_Update

```java
import com.azure.resourcemanager.security.models.ActionableRemediation;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AzureDevOpsOrg;
import com.azure.resourcemanager.security.models.AzureDevOpsOrgProperties;
import com.azure.resourcemanager.security.models.OnboardingState;

/**
 * Samples for AzureDevOpsOrgs Update.
 */
public final class AzureDevOpsOrgsUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/UpdateAzureDevOpsOrgs_example.json
     */
    /**
     * Sample code: Update_AzureDevOpsOrgs.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void updateAzureDevOpsOrgs(com.azure.resourcemanager.security.SecurityManager manager) {
        AzureDevOpsOrg resource = manager.azureDevOpsOrgs()
            .getWithResponse("myRg", "mySecurityConnectorName", "myAzDevOpsOrg", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new AzureDevOpsOrgProperties().withOnboardingState(OnboardingState.NOT_APPLICABLE)
                .withActionableRemediation(new ActionableRemediation().withState(ActionableRemediationState.ENABLED)))
            .apply();
    }
}
```

### AzureDevOpsProjects_CreateOrUpdate

```java
import com.azure.resourcemanager.security.models.ActionableRemediation;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AzureDevOpsProjectProperties;
import com.azure.resourcemanager.security.models.OnboardingState;

/**
 * Samples for AzureDevOpsProjects CreateOrUpdate.
 */
public final class AzureDevOpsProjectsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/CreateOrUpdateAzureDevOpsProjects_example.json
     */
    /**
     * Sample code: CreateOrUpdate_AzureDevOpsProjects.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void createOrUpdateAzureDevOpsProjects(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.azureDevOpsProjects()
            .define("myAzDevOpsProject")
            .withExistingAzureDevOpsOrg("myRg", "mySecurityConnectorName", "myAzDevOpsOrg")
            .withProperties(new AzureDevOpsProjectProperties().withOnboardingState(OnboardingState.NOT_APPLICABLE)
                .withActionableRemediation(new ActionableRemediation().withState(ActionableRemediationState.ENABLED)))
            .create();
    }
}
```

### AzureDevOpsProjects_Get

```java
/**
 * Samples for AzureDevOpsProjects Get.
 */
public final class AzureDevOpsProjectsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/GetAzureDevOpsProjects_example.json
     */
    /**
     * Sample code: Get_AzureDevOpsProjects.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getAzureDevOpsProjects(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.azureDevOpsProjects()
            .getWithResponse("myRg", "mySecurityConnectorName", "myAzDevOpsOrg", "myAzDevOpsProject",
                com.azure.core.util.Context.NONE);
    }
}
```

### AzureDevOpsProjects_List

```java
/**
 * Samples for AzureDevOpsProjects List.
 */
public final class AzureDevOpsProjectsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/ListAzureDevOpsProjects_example.json
     */
    /**
     * Sample code: List_AzureDevOpsProjects.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listAzureDevOpsProjects(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.azureDevOpsProjects()
            .list("myRg", "mySecurityConnectorName", "myAzDevOpsOrg", com.azure.core.util.Context.NONE);
    }
}
```

### AzureDevOpsProjects_Update

```java
import com.azure.resourcemanager.security.models.ActionableRemediation;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AzureDevOpsProject;
import com.azure.resourcemanager.security.models.AzureDevOpsProjectProperties;
import com.azure.resourcemanager.security.models.OnboardingState;

/**
 * Samples for AzureDevOpsProjects Update.
 */
public final class AzureDevOpsProjectsUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/UpdateAzureDevOpsProjects_example.json
     */
    /**
     * Sample code: Update_AzureDevOpsProjects.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void updateAzureDevOpsProjects(com.azure.resourcemanager.security.SecurityManager manager) {
        AzureDevOpsProject resource = manager.azureDevOpsProjects()
            .getWithResponse("myRg", "mySecurityConnectorName", "myAzDevOpsOrg", "myAzDevOpsProject",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new AzureDevOpsProjectProperties().withOnboardingState(OnboardingState.NOT_APPLICABLE)
                .withActionableRemediation(new ActionableRemediation().withState(ActionableRemediationState.ENABLED)))
            .apply();
    }
}
```

### AzureDevOpsRepos_CreateOrUpdate

```java
import com.azure.resourcemanager.security.models.ActionableRemediation;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AzureDevOpsRepositoryProperties;
import com.azure.resourcemanager.security.models.OnboardingState;

/**
 * Samples for AzureDevOpsRepos CreateOrUpdate.
 */
public final class AzureDevOpsReposCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/CreateOrUpdateAzureDevOpsRepos_example.json
     */
    /**
     * Sample code: CreateOrUpdate_AzureDevOpsRepos.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void createOrUpdateAzureDevOpsRepos(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.azureDevOpsRepos()
            .define("myAzDevOpsRepo")
            .withExistingProject("myRg", "mySecurityConnectorName", "myAzDevOpsOrg", "myAzDevOpsProject")
            .withProperties(new AzureDevOpsRepositoryProperties().withOnboardingState(OnboardingState.NOT_APPLICABLE)
                .withActionableRemediation(new ActionableRemediation().withState(ActionableRemediationState.ENABLED)))
            .create();
    }
}
```

### AzureDevOpsRepos_Get

```java
/**
 * Samples for AzureDevOpsRepos Get.
 */
public final class AzureDevOpsReposGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/GetAzureDevOpsRepos_example.json
     */
    /**
     * Sample code: Get_AzureDevOpsRepos.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getAzureDevOpsRepos(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.azureDevOpsRepos()
            .getWithResponse("myRg", "mySecurityConnectorName", "myAzDevOpsOrg", "myAzDevOpsProject", "myAzDevOpsRepo",
                com.azure.core.util.Context.NONE);
    }
}
```

### AzureDevOpsRepos_List

```java
/**
 * Samples for AzureDevOpsRepos List.
 */
public final class AzureDevOpsReposListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/ListAzureDevOpsRepos_example.json
     */
    /**
     * Sample code: List_AzureDevOpsRepos.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listAzureDevOpsRepos(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.azureDevOpsRepos()
            .list("myRg", "mySecurityConnectorName", "myAzDevOpsOrg", "myAzDevOpsProject",
                com.azure.core.util.Context.NONE);
    }
}
```

### AzureDevOpsRepos_Update

```java
import com.azure.resourcemanager.security.models.ActionableRemediation;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AzureDevOpsRepository;
import com.azure.resourcemanager.security.models.AzureDevOpsRepositoryProperties;
import com.azure.resourcemanager.security.models.OnboardingState;

/**
 * Samples for AzureDevOpsRepos Update.
 */
public final class AzureDevOpsReposUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/UpdateAzureDevOpsRepos_example.json
     */
    /**
     * Sample code: Update_AzureDevOpsRepos.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void updateAzureDevOpsRepos(com.azure.resourcemanager.security.SecurityManager manager) {
        AzureDevOpsRepository resource = manager.azureDevOpsRepos()
            .getWithResponse("myRg", "mySecurityConnectorName", "myAzDevOpsOrg", "myAzDevOpsProject", "myAzDevOpsRepo",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new AzureDevOpsRepositoryProperties().withOnboardingState(OnboardingState.NOT_APPLICABLE)
                .withActionableRemediation(new ActionableRemediation().withState(ActionableRemediationState.ENABLED)))
            .apply();
    }
}
```

### DevOpsConfigurations_CreateOrUpdate

```java
import com.azure.resourcemanager.security.fluent.models.DevOpsConfigurationInner;
import com.azure.resourcemanager.security.models.Authorization;
import com.azure.resourcemanager.security.models.AutoDiscovery;
import com.azure.resourcemanager.security.models.DevOpsConfigurationProperties;
import java.util.Arrays;

/**
 * Samples for DevOpsConfigurations CreateOrUpdate.
 */
public final class DevOpsConfigurationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/CreateOrUpdateDevOpsConfigurationsOnboardCurrentAndFuture_example.json
     */
    /**
     * Sample code: CreateOrUpdate_DevOpsConfigurations_OnboardCurrentAndFuture.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void createOrUpdateDevOpsConfigurationsOnboardCurrentAndFuture(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.devOpsConfigurations()
            .createOrUpdate("myRg", "mySecurityConnectorName",
                new DevOpsConfigurationInner().withProperties(new DevOpsConfigurationProperties()
                    .withAuthorization(new Authorization().withCode("fakeTokenPlaceholder"))
                    .withAutoDiscovery(AutoDiscovery.ENABLED)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/CreateOrUpdateDevOpsConfigurationsOnboardCurrentOnly_example.json
     */
    /**
     * Sample code: CreateOrUpdate_DevOpsConfigurations_OnboardCurrentOnly.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void createOrUpdateDevOpsConfigurationsOnboardCurrentOnly(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.devOpsConfigurations()
            .createOrUpdate("myRg", "mySecurityConnectorName",
                new DevOpsConfigurationInner().withProperties(new DevOpsConfigurationProperties()
                    .withAuthorization(new Authorization().withCode("fakeTokenPlaceholder"))
                    .withAutoDiscovery(AutoDiscovery.DISABLED)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/CreateOrUpdateDevOpsConfigurationsOnboardSelected_example.json
     */
    /**
     * Sample code: CreateOrUpdate_DevOpsConfigurations_OnboardSelected.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        createOrUpdateDevOpsConfigurationsOnboardSelected(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.devOpsConfigurations()
            .createOrUpdate("myRg", "mySecurityConnectorName",
                new DevOpsConfigurationInner().withProperties(new DevOpsConfigurationProperties()
                    .withAuthorization(new Authorization().withCode("fakeTokenPlaceholder"))
                    .withAutoDiscovery(AutoDiscovery.DISABLED)
                    .withTopLevelInventoryList(Arrays.asList("org1", "org2"))),
                com.azure.core.util.Context.NONE);
    }
}
```

### DevOpsConfigurations_Delete

```java
/**
 * Samples for DevOpsConfigurations Delete.
 */
public final class DevOpsConfigurationsDeleteSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/DeleteDevOpsConfigurations_example.json
     */
    /**
     * Sample code: Delete_DevOpsConfigurations.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void deleteDevOpsConfigurations(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.devOpsConfigurations().delete("myRg", "mySecurityConnectorName", com.azure.core.util.Context.NONE);
    }
}
```

### DevOpsConfigurations_Get

```java
/**
 * Samples for DevOpsConfigurations Get.
 */
public final class DevOpsConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/GetDevOpsConfigurationsWithCapabilities_example.json
     */
    /**
     * Sample code: Get_DevOpsConfigurations_WithCapabilities.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        getDevOpsConfigurationsWithCapabilities(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.devOpsConfigurations()
            .getWithResponse("myRg", "mySecurityConnectorName", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/GetDevOpsConfigurations_example.json
     */
    /**
     * Sample code: Get_DevOpsConfigurations.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getDevOpsConfigurations(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.devOpsConfigurations()
            .getWithResponse("myRg", "mySecurityConnectorName", com.azure.core.util.Context.NONE);
    }
}
```

### DevOpsConfigurations_List

```java
/**
 * Samples for DevOpsConfigurations List.
 */
public final class DevOpsConfigurationsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/ListDevOpsConfigurations_example.json
     */
    /**
     * Sample code: List_DevOpsConfigurations.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listDevOpsConfigurations(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.devOpsConfigurations().list("myRg", "mySecurityConnectorName", com.azure.core.util.Context.NONE);
    }
}
```

### DevOpsConfigurations_Update

```java
import com.azure.resourcemanager.security.fluent.models.DevOpsConfigurationInner;
import com.azure.resourcemanager.security.models.AutoDiscovery;
import com.azure.resourcemanager.security.models.DevOpsConfigurationProperties;

/**
 * Samples for DevOpsConfigurations Update.
 */
public final class DevOpsConfigurationsUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/UpdateDevOpsConfigurations_example.json
     */
    /**
     * Sample code: Update_DevOpsConfigurations.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void updateDevOpsConfigurations(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.devOpsConfigurations()
            .update("myRg", "mySecurityConnectorName",
                new DevOpsConfigurationInner()
                    .withProperties(new DevOpsConfigurationProperties().withAutoDiscovery(AutoDiscovery.ENABLED)),
                com.azure.core.util.Context.NONE);
    }
}
```

### DevOpsOperationResults_Get

```java
/**
 * Samples for DevOpsOperationResults Get.
 */
public final class DevOpsOperationResultsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/GetDevOpsOperationResultsFailed_example.json
     */
    /**
     * Sample code: Get_DevOpsOperationResults_Failed.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getDevOpsOperationResultsFailed(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.devOpsOperationResults()
            .getWithResponse("myRg", "mySecurityConnectorName", "8d4caace-e7b3-4b3e-af99-73f76829ebcf",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/GetDevOpsOperationResultsSucceeded_example.json
     */
    /**
     * Sample code: Get_DevOpsOperationResults_Succeeded.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getDevOpsOperationResultsSucceeded(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.devOpsOperationResults()
            .getWithResponse("myRg", "mySecurityConnectorName", "4e826cf1-5c36-4808-a7d2-fb4f5170978b",
                com.azure.core.util.Context.NONE);
    }
}
```

### GitHubOwners_Get

```java
/**
 * Samples for GitHubOwners Get.
 */
public final class GitHubOwnersGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/GetGitHubOwners_example.json
     */
    /**
     * Sample code: Get_GitHubOwners.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getGitHubOwners(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.gitHubOwners()
            .getWithResponse("myRg", "mySecurityConnectorName", "myGitHubOwner", com.azure.core.util.Context.NONE);
    }
}
```

### GitHubOwners_List

```java
/**
 * Samples for GitHubOwners List.
 */
public final class GitHubOwnersListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/ListGitHubOwners_example.json
     */
    /**
     * Sample code: List_GitHubOwners.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listGitHubOwners(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.gitHubOwners().list("myRg", "mySecurityConnectorName", com.azure.core.util.Context.NONE);
    }
}
```

### GitHubOwners_ListAvailable

```java
/**
 * Samples for GitHubOwners ListAvailable.
 */
public final class GitHubOwnersListAvailableSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/ListAvailableGitHubOwners_example.json
     */
    /**
     * Sample code: ListAvailable_GitHubOwners.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listAvailableGitHubOwners(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.gitHubOwners()
            .listAvailableWithResponse("myRg", "mySecurityConnectorName", com.azure.core.util.Context.NONE);
    }
}
```

### GitHubRepos_Get

```java
/**
 * Samples for GitHubRepos Get.
 */
public final class GitHubReposGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/GetGitHubRepos_example.json
     */
    /**
     * Sample code: Get_GitHubRepos.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getGitHubRepos(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.gitHubRepos()
            .getWithResponse("myRg", "mySecurityConnectorName", "myGitHubOwner", "myGitHubRepo",
                com.azure.core.util.Context.NONE);
    }
}
```

### GitHubRepos_List

```java
/**
 * Samples for GitHubRepos List.
 */
public final class GitHubReposListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/ListGitHubRepos_example.json
     */
    /**
     * Sample code: List_GitHubRepos.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listGitHubRepos(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.gitHubRepos()
            .list("myRg", "mySecurityConnectorName", "myGitHubOwner", com.azure.core.util.Context.NONE);
    }
}
```

### GitLabGroups_Get

```java
/**
 * Samples for GitLabGroups Get.
 */
public final class GitLabGroupsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/GetGitLabGroups_example.json
     */
    /**
     * Sample code: Get_GitLabGroups.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getGitLabGroups(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.gitLabGroups()
            .getWithResponse("myRg", "mySecurityConnectorName", "myGitLabGroup$mySubGroup",
                com.azure.core.util.Context.NONE);
    }
}
```

### GitLabGroups_List

```java
/**
 * Samples for GitLabGroups List.
 */
public final class GitLabGroupsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/ListGitLabGroups_example.json
     */
    /**
     * Sample code: List_GitLabGroups.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listGitLabGroups(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.gitLabGroups().list("myRg", "mySecurityConnectorName", com.azure.core.util.Context.NONE);
    }
}
```

### GitLabGroups_ListAvailable

```java
/**
 * Samples for GitLabGroups ListAvailable.
 */
public final class GitLabGroupsListAvailableSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/ListAvailableGitLabGroups_example.json
     */
    /**
     * Sample code: ListAvailable_GitLabGroups.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listAvailableGitLabGroups(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.gitLabGroups()
            .listAvailableWithResponse("myRg", "mySecurityConnectorName", com.azure.core.util.Context.NONE);
    }
}
```

### GitLabProjects_Get

```java
/**
 * Samples for GitLabProjects Get.
 */
public final class GitLabProjectsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/GetGitLabProjects_example.json
     */
    /**
     * Sample code: Get_GitLabProjects.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getGitLabProjects(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.gitLabProjects()
            .getWithResponse("myRg", "mySecurityConnectorName", "myGitLabGroup$mySubGroup", "myGitLabProject",
                com.azure.core.util.Context.NONE);
    }
}
```

### GitLabProjects_List

```java
/**
 * Samples for GitLabProjects List.
 */
public final class GitLabProjectsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/ListGitLabProjects_example.json
     */
    /**
     * Sample code: List_GitLabProjects.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listGitLabProjects(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.gitLabProjects()
            .list("myRg", "mySecurityConnectorName", "myGitLabGroup$mySubGroup", com.azure.core.util.Context.NONE);
    }
}
```

### GitLabSubgroups_List

```java
/**
 * Samples for GitLabSubgroups List.
 */
public final class GitLabSubgroupsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2025-05-15-preview/examples/SecurityConnectorsDevOps/ListGitLabSubgroups_example.json
     */
    /**
     * Sample code: List_GitLabSubgroups.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listGitLabSubgroups(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.gitLabSubgroups()
            .listWithResponse("myRg", "mySecurityConnectorName", "myGitLabGroup", com.azure.core.util.Context.NONE);
    }
}
```

