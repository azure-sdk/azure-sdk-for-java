# Code snippets and samples


## ListSites

- [List](#listsites_list)
- [ListByResourceGroup](#listsites_listbyresourcegroup)

## Operations

- [List](#operations_list)

## SiteAwareResourceTypes

- [List](#siteawareresourcetypes_list)

## SitesCreate

- [AtSubscription](#sitescreate_atsubscription)
- [ByResourceGroup](#sitescreate_byresourcegroup)

## SitesDelete

- [AtSubscription](#sitesdelete_atsubscription)
- [Delete](#sitesdelete_delete)

## SitesGet

- [AtSubscription](#sitesget_atsubscription)
- [GetByResourceGroup](#sitesget_getbyresourcegroup)

## SitesUpdate

- [AtSubscription](#sitesupdate_atsubscription)
- [ByResourceGroup](#sitesupdate_byresourcegroup)
### ListSites_List

```java
/**
 * Samples for ListSites List.
 */
public final class ListSitesListSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2023-08-01-preview/examples/SubscriptionScope_ListSites.json
     */
    /**
     * Sample code: List by Subscription.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void listBySubscription(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.listSites().list(com.azure.core.util.Context.NONE);
    }
}
```

### ListSites_ListByResourceGroup

```java
/**
 * Samples for ListSites ListByResourceGroup.
 */
public final class ListSitesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2023-08-01-preview/examples/ResourceGroupScope_ListSites.json
     */
    /**
     * Sample code: List by Resource Group.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void listByResourceGroup(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.listSites().listByResourceGroup("string", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2023-08-01-preview/examples/OperationGroupGet.json
     */
    /**
     * Sample code: List by subscription.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void listBySubscription(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### SiteAwareResourceTypes_List

```java
/**
 * Samples for SiteAwareResourceTypes List.
 */
public final class SiteAwareResourceTypesListSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2023-08-01-preview/examples/GetSiteAwareResourceTypesList.json
     */
    /**
     * Sample code: List Site Aware Resource Types.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void listSiteAwareResourceTypes(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.siteAwareResourceTypes().list(com.azure.core.util.Context.NONE);
    }
}
```

### SitesCreate_AtSubscription

```java
import com.azure.resourcemanager.edgemicrosoftedgesites.fluent.models.SiteInner;
import com.azure.resourcemanager.edgemicrosoftedgesites.models.ManagedServiceIdentityType;
import java.util.stream.Collectors;

/**
 * Samples for SitesCreate AtSubscription.
 */
public final class SitesCreateAtSubscriptionSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2023-08-01-preview/examples/SubscriptionScope_CreateSite.json
     */
    /**
     * Sample code: Create Site Subscription.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void createSiteSubscription(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sitesCreates().atSubscription("string", new SiteInner().withTypeIdentityType(ManagedServiceIdentityType.SYSTEM_ASSIGNED).withDisplayName("string").withDescription("string").withAddressResourceId("/subscriptions/680d0dad-59aa-4464-3df3-b34b2b42738c/resourceGroups/us-site-rg/providers/Microsoft.EdgeOrder/addresses/12343213"), com.azure.core.util.Context.NONE);
    }
}
```

### SitesCreate_ByResourceGroup

```java
import com.azure.resourcemanager.edgemicrosoftedgesites.models.ManagedServiceIdentityType;
import java.util.stream.Collectors;

/**
 * Samples for SitesCreate ByResourceGroup.
 */
public final class SitesCreateByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2023-08-01-preview/examples/ResourceGroupScope_CreateSite.json
     */
    /**
     * Sample code: Create Site Resource Group.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void createSiteResourceGroup(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sitesCreates().define("string").withExistingResourceGroup("string").withTypeIdentityType(ManagedServiceIdentityType.SYSTEM_ASSIGNED).withDisplayName("string").withDescription("string").withAddressResourceId("/subscriptions/680d0dad-59aa-4464-3df3-b34b2b42738c/resourceGroups/us-site-rg/providers/Microsoft.EdgeOrder/addresses/12343213").create();
    }
}
```

### SitesDelete_AtSubscription

```java
/**
 * Samples for SitesDelete AtSubscription.
 */
public final class SitesDeleteAtSubscriptionSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2023-08-01-preview/examples/SubscriptionScope_DeleteSite.json
     */
    /**
     * Sample code: Delete Site Subscription.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void deleteSiteSubscription(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sitesDeletes().atSubscriptionWithResponse("string", com.azure.core.util.Context.NONE);
    }
}
```

### SitesDelete_Delete

```java
/**
 * Samples for SitesDelete Delete.
 */
public final class SitesDeleteDeleteSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2023-08-01-preview/examples/ResourceGroupScope_DeleteSite.json
     */
    /**
     * Sample code: Delete Site.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void deleteSite(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sitesDeletes().deleteByResourceGroupWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }
}
```

### SitesGet_AtSubscription

```java
/**
 * Samples for SitesGet AtSubscription.
 */
public final class SitesGetAtSubscriptionSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2023-08-01-preview/examples/SubscriptionScope_GetSite.json
     */
    /**
     * Sample code: Get Site Subscription.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void getSiteSubscription(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sitesGets().atSubscriptionWithResponse("string", com.azure.core.util.Context.NONE);
    }
}
```

### SitesGet_GetByResourceGroup

```java
/**
 * Samples for SitesGet GetByResourceGroup.
 */
public final class SitesGetGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2023-08-01-preview/examples/ResourceGroupScope_GetSite.json
     */
    /**
     * Sample code: Get Site Resource Group.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void getSiteResourceGroup(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sitesGets().getByResourceGroupWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }
}
```

### SitesUpdate_AtSubscription

```java
import com.azure.resourcemanager.edgemicrosoftedgesites.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.edgemicrosoftedgesites.models.SiteUpdate;
import java.util.stream.Collectors;

/**
 * Samples for SitesUpdate AtSubscription.
 */
public final class SitesUpdateAtSubscriptionSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2023-08-01-preview/examples/SubscriptionScope_PatchSite.json
     */
    /**
     * Sample code: Patch Site Subscription.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void patchSiteSubscription(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sitesUpdates().atSubscriptionWithResponse("string", new SiteUpdate().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED).withDisplayName("string").withDescription("string").withAddressResourceId("/subscriptions/0154f7fe-df09-4981-bf82-7ad5c1f596eb/resourceGroups/us-site-rg/providers/Microsoft.EdgeOrder/addresses/12343213"), com.azure.core.util.Context.NONE);
    }
}
```

### SitesUpdate_ByResourceGroup

```java
import com.azure.resourcemanager.edgemicrosoftedgesites.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.edgemicrosoftedgesites.models.SiteUpdate;
import java.util.stream.Collectors;

/**
 * Samples for SitesUpdate ByResourceGroup.
 */
public final class SitesUpdateByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2023-08-01-preview/examples/ResourceGroupScope_PatchSite.json
     */
    /**
     * Sample code: Patch Site Resource Group.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void patchSiteResourceGroup(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sitesUpdates().byResourceGroupWithResponse("string", "string", new SiteUpdate().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED).withDisplayName("string").withDescription("string").withAddressResourceId("/subscriptions/11111111-2222-3333-4444-55555555/resourceGroups/us-site-rg/providers/Microsoft.EdgeOrder/addresses/12343213"), com.azure.core.util.Context.NONE);
    }
}
```

