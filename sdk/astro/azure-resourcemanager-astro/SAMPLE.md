# Code snippets and samples


## Operations

- [List](#operations_list)

## Organizations

- [CreateOrUpdate](#organizations_createorupdate)
- [Delete](#organizations_delete)
- [GetByResourceGroup](#organizations_getbyresourcegroup)
- [GetResources](#organizations_getresources)
- [GetRoles](#organizations_getroles)
- [GetUsers](#organizations_getusers)
- [List](#organizations_list)
- [ListByResourceGroup](#organizations_listbyresourcegroup)
- [ManageRoles](#organizations_manageroles)
- [RemoveUser](#organizations_removeuser)
- [Update](#organizations_update)
### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MinimumSet.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void operationsListMinimumSet(com.azure.resourcemanager.astro.AstroManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MaximumSet.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void operationsListMaximumSet(com.azure.resourcemanager.astro.AstroManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_CreateOrUpdate

```java
import com.azure.resourcemanager.astro.models.LiftrBaseDataOrganizationProperties;
import com.azure.resourcemanager.astro.models.LiftrBaseDataPartnerOrganizationProperties;
import com.azure.resourcemanager.astro.models.LiftrBaseMarketplaceDetails;
import com.azure.resourcemanager.astro.models.LiftrBaseOfferDetails;
import com.azure.resourcemanager.astro.models.LiftrBaseSingleSignOnProperties;
import com.azure.resourcemanager.astro.models.LiftrBaseUserDetails;
import com.azure.resourcemanager.astro.models.ManagedServiceIdentity;
import com.azure.resourcemanager.astro.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.astro.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.astro.models.RenewalMode;
import com.azure.resourcemanager.astro.models.SingleSignOnStates;
import com.azure.resourcemanager.astro.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Organizations CreateOrUpdate.
 */
public final class OrganizationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Organizations_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_CreateOrUpdate_MaximumSet.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void organizationsCreateOrUpdateMaximumSet(com.azure.resourcemanager.astro.AstroManager manager) {
        manager.organizations()
            .define("org-name")
            .withRegion("f")
            .withExistingResourceGroup("rgastronomer")
            .withTags(mapOf("key5519", "fakeTokenPlaceholder"))
            .withProperties(new LiftrBaseDataOrganizationProperties()
                .withMarketplace(new LiftrBaseMarketplaceDetails().withSubscriptionId("rfhehneum")
                    .withSubscriptionStatus(MarketplaceSubscriptionStatus.PENDING_FULFILLMENT_START)
                    .withOfferDetails(new LiftrBaseOfferDetails().withPublisherId("csznrzfxzdluimbnjvtosmcpbatcj")
                        .withOfferId("ausxbidbjgdvlvfvukgeeidonweyz")
                        .withPlanId("teftanyhefgrsgjijt")
                        .withPlanName("gac")
                        .withTermUnit("mglyizbeguwtmfebb")
                        .withTermId("l")
                        .withRenewalMode(RenewalMode.AUTO)))
                .withUser(new LiftrBaseUserDetails().withFirstName("mpeyuktucjztbpil")
                    .withLastName("mph")
                    .withEmailAddress("test@microsoft.com")
                    .withUpn("pgv")
                    .withPhoneNumber("azmeefwjnhma"))
                .withPartnerOrganizationProperties(
                    new LiftrBaseDataPartnerOrganizationProperties().withOrganizationId("zrqrfxhejnchfoelaqzpyenqyua")
                        .withWorkspaceId("ieceblxelrfbusotmeyakgcl")
                        .withOrganizationName("org-name")
                        .withWorkspaceName("org-name")
                        .withSingleSignOnProperties(
                            new LiftrBaseSingleSignOnProperties().withSingleSignOnState(SingleSignOnStates.INITIAL)
                                .withEnterpriseAppId("rmlbwbbfwoaqauafgwhlvuics")
                                .withSingleSignOnUrl("kfwqhhftpdaveuwloqs")
                                .withAadDomains(Arrays.asList("mpf")))))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.NONE)
                .withUserAssignedIdentities(mapOf("key9286", new UserAssignedIdentity())))
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

### Organizations_Delete

```java
/**
 * Samples for Organizations Delete.
 */
public final class OrganizationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Organizations_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Delete_MaximumSet.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void organizationsDeleteMaximumSet(com.azure.resourcemanager.astro.AstroManager manager) {
        manager.organizations().delete("rgastronomer", "org-name", com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_GetByResourceGroup

```java
/**
 * Samples for Organizations GetByResourceGroup.
 */
public final class OrganizationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Organizations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Get_MaximumSet.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void organizationsGetMaximumSet(com.azure.resourcemanager.astro.AstroManager manager) {
        manager.organizations()
            .getByResourceGroupWithResponse("rgastronomer", "org-name", com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_GetResources

```java
import com.azure.resourcemanager.astro.models.GetResourcesRequest;
import com.azure.resourcemanager.astro.models.PageInfo;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Organizations GetResources.
 */
public final class OrganizationsGetResourcesSamples {
    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Organizations_GetResources_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_GetResources_MaximumSet.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void organizationsGetResourcesMaximumSet(com.azure.resourcemanager.astro.AstroManager manager) {
        manager.organizations()
            .getResourcesWithResponse("rgastronomer", "org-name",
                new GetResourcesRequest().withSearchParamsDictionary(mapOf("key136", "fakeTokenPlaceholder"))
                    .withPageInfo(new PageInfo().withOffset(24L).withLimit(21L).withTotalCount(24L)),
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

### Organizations_GetRoles

```java
import com.azure.resourcemanager.astro.models.GetRolesRequest;
import com.azure.resourcemanager.astro.models.PageInfo;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Organizations GetRoles.
 */
public final class OrganizationsGetRolesSamples {
    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Organizations_GetRoles_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_GetRoles_MaximumSet.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void organizationsGetRolesMaximumSet(com.azure.resourcemanager.astro.AstroManager manager) {
        manager.organizations()
            .getRolesWithResponse("rgastronomer", "org-name",
                new GetRolesRequest().withSearchParamsDictionary(mapOf("key6100", "fakeTokenPlaceholder"))
                    .withPageInfo(new PageInfo().withOffset(24L).withLimit(21L).withTotalCount(24L)),
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

### Organizations_GetUsers

```java
import com.azure.resourcemanager.astro.models.GetUsersRequest;
import com.azure.resourcemanager.astro.models.PageInfo;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Organizations GetUsers.
 */
public final class OrganizationsGetUsersSamples {
    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Organizations_GetUsers_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_GetUsers_MaximumSet.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void organizationsGetUsersMaximumSet(com.azure.resourcemanager.astro.AstroManager manager) {
        manager.organizations()
            .getUsersWithResponse("rgastronomer", "org-name",
                new GetUsersRequest().withSearchParamsDictionary(mapOf("key1623", "fakeTokenPlaceholder"))
                    .withPageInfo(new PageInfo().withOffset(24L).withLimit(21L).withTotalCount(24L)),
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

### Organizations_List

```java
/**
 * Samples for Organizations List.
 */
public final class OrganizationsListSamples {
    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Organizations_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListBySubscription_MaximumSet.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void organizationsListBySubscriptionMaximumSet(com.azure.resourcemanager.astro.AstroManager manager) {
        manager.organizations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Organizations_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListBySubscription - generated by [MinimumSet] rule.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void
        organizationsListBySubscriptionGeneratedByMinimumSetRule(com.azure.resourcemanager.astro.AstroManager manager) {
        manager.organizations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_ListByResourceGroup

```java
/**
 * Samples for Organizations ListByResourceGroup.
 */
public final class OrganizationsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Organizations_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListByResourceGroup_MaximumSet.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void
        organizationsListByResourceGroupMaximumSet(com.azure.resourcemanager.astro.AstroManager manager) {
        manager.organizations().listByResourceGroup("rgastronomer", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Organizations_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListByResourceGroup - generated by [MinimumSet] rule.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void organizationsListByResourceGroupGeneratedByMinimumSetRule(
        com.azure.resourcemanager.astro.AstroManager manager) {
        manager.organizations().listByResourceGroup("rgastronomer", com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_ManageRoles

```java
import com.azure.resourcemanager.astro.fluent.models.ManageRolesModelInner;
import com.azure.resourcemanager.astro.models.Role;
import com.azure.resourcemanager.astro.models.User;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Organizations ManageRoles.
 */
public final class OrganizationsManageRolesSamples {
    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Organizations_ManageRoles_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ManageRoles_MaximumSet.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void organizationsManageRolesMaximumSet(com.azure.resourcemanager.astro.AstroManager manager) {
        manager.organizations()
            .manageRolesWithResponse("rgastronomer", "org-name",
                new ManageRolesModelInner()
                    .withPrincipals(Arrays.asList(new User().withId("gsh")
                        .withType("dqnjmerknyoylaehuwoii")
                        .withEmail("btiwfypyqal")
                        .withFullName("bb")
                        .withAuthType("fpjnkmmxz")
                        .withStatus("nmwplgtpjhxl")
                        .withAvatarUrl("ikaa")
                        .withRoles(Arrays.asList(new Role().withId("ktjhvzz")
                            .withName("jftawjwkidbknkmndvputaifiacwd")
                            .withType("lxmmkmbyyuiswhipiiadlpdpmxffqq")
                            .withDescription("bwmgpajuplmjqmtlghu")
                            .withScope("mfwdicszmsduouxdpskent")))
                        .withMetadataUser(mapOf("key7719", "fakeTokenPlaceholder"))))
                    .withRoles(Arrays.asList(new Role().withId("ktjhvzz")
                        .withName("jftawjwkidbknkmndvputaifiacwd")
                        .withType("lxmmkmbyyuiswhipiiadlpdpmxffqq")
                        .withDescription("bwmgpajuplmjqmtlghu")
                        .withScope("mfwdicszmsduouxdpskent")))
                    .withAdditionalData(mapOf("key5340", "fakeTokenPlaceholder")),
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

### Organizations_RemoveUser

```java
import com.azure.resourcemanager.astro.models.RemoveUserRequest;
import com.azure.resourcemanager.astro.models.Role;
import com.azure.resourcemanager.astro.models.User;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Organizations RemoveUser.
 */
public final class OrganizationsRemoveUserSamples {
    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Organizations_RemoveUser_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_RemoveUser_MaximumSet.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void organizationsRemoveUserMaximumSet(com.azure.resourcemanager.astro.AstroManager manager) {
        manager.organizations()
            .removeUserWithResponse("rgastronomer", "org-name",
                new RemoveUserRequest()
                    .withPrincipal(new User().withId("gsh")
                        .withType("dqnjmerknyoylaehuwoii")
                        .withEmail("btiwfypyqal")
                        .withFullName("bb")
                        .withAuthType("fpjnkmmxz")
                        .withStatus("nmwplgtpjhxl")
                        .withAvatarUrl("ikaa")
                        .withRoles(Arrays.asList(new Role().withId("ktjhvzz")
                            .withName("jftawjwkidbknkmndvputaifiacwd")
                            .withType("lxmmkmbyyuiswhipiiadlpdpmxffqq")
                            .withDescription("bwmgpajuplmjqmtlghu")
                            .withScope("mfwdicszmsduouxdpskent")))
                        .withMetadataUser(mapOf("key7719", "fakeTokenPlaceholder")))
                    .withAdditionalData(mapOf("key759", "fakeTokenPlaceholder")),
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

### Organizations_Update

```java
import com.azure.resourcemanager.astro.models.LiftrBaseDataPartnerOrganizationPropertiesUpdate;
import com.azure.resourcemanager.astro.models.LiftrBaseMarketplaceDetailsUpdate;
import com.azure.resourcemanager.astro.models.LiftrBaseOfferDetailsUpdate;
import com.azure.resourcemanager.astro.models.LiftrBaseSingleSignOnProperties;
import com.azure.resourcemanager.astro.models.LiftrBaseUserDetailsUpdate;
import com.azure.resourcemanager.astro.models.ManagedServiceIdentity;
import com.azure.resourcemanager.astro.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.astro.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.astro.models.OrganizationResource;
import com.azure.resourcemanager.astro.models.OrganizationResourceUpdateProperties;
import com.azure.resourcemanager.astro.models.RenewalMode;
import com.azure.resourcemanager.astro.models.SingleSignOnStates;
import com.azure.resourcemanager.astro.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Organizations Update.
 */
public final class OrganizationsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/liftrastronomer/resource-manager/Astronomer.Astro/preview/2024-11-01-preview/examples/
     * Organizations_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Update_MaximumSet.
     * 
     * @param manager Entry point to AstroManager.
     */
    public static void organizationsUpdateMaximumSet(com.azure.resourcemanager.astro.AstroManager manager) {
        OrganizationResource resource = manager.organizations()
            .getByResourceGroupWithResponse("rgastronomer", "org-name", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("key9852", "fakeTokenPlaceholder"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.NONE)
                .withUserAssignedIdentities(mapOf("key9286", new UserAssignedIdentity())))
            .withProperties(new OrganizationResourceUpdateProperties()
                .withMarketplace(new LiftrBaseMarketplaceDetailsUpdate().withSubscriptionId("nkcsegq")
                    .withSubscriptionStatus(MarketplaceSubscriptionStatus.PENDING_FULFILLMENT_START)
                    .withOfferDetails(new LiftrBaseOfferDetailsUpdate().withPublisherId("lmwmclwdsecdpbpq")
                        .withOfferId("xsta")
                        .withPlanId("fqqucecxoevhjlxqcdgjwmmsrzttbp")
                        .withPlanName("gvinyrhjmpbggxyloat")
                        .withTermUnit("vaomfejhbskxuhmocluwoettfib")
                        .withTermId("hmdexaapsrqrhmxmbofhwvr")
                        .withRenewalMode(RenewalMode.AUTO)))
                .withUser(new LiftrBaseUserDetailsUpdate().withFirstName("udtkhkmlnbfklcbbl")
                    .withLastName("fuqkvskj")
                    .withEmailAddress("test@microsoft.com")
                    .withUpn("pwqvhwqmerlshgkuxyctzmry")
                    .withPhoneNumber("dugfmdmvhibsqeankiafs"))
                .withPartnerOrganizationProperties(
                    new LiftrBaseDataPartnerOrganizationPropertiesUpdate().withOrganizationId("wncyfiaz")
                        .withWorkspaceId("qjomwrywxxydravkumubtqh")
                        .withOrganizationName("org-name")
                        .withWorkspaceName("org-name")
                        .withSingleSignOnProperties(
                            new LiftrBaseSingleSignOnProperties().withSingleSignOnState(SingleSignOnStates.INITIAL)
                                .withEnterpriseAppId("rmlbwbbfwoaqauafgwhlvuics")
                                .withSingleSignOnUrl("kfwqhhftpdaveuwloqs")
                                .withAadDomains(Arrays.asList("mpf")))))
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

