# Code snippets and samples


## Sites

- [CreateOrUpdate](#sites_createorupdate)
- [Delete](#sites_delete)
- [GetByResourceGroup](#sites_getbyresourcegroup)
- [ListByResourceGroup](#sites_listbyresourcegroup)
- [Update](#sites_update)

## SitesBySubscription

- [CreateOrUpdate](#sitesbysubscription_createorupdate)
- [Delete](#sitesbysubscription_delete)
- [Get](#sitesbysubscription_get)
- [List](#sitesbysubscription_list)
- [Update](#sitesbysubscription_update)
### Sites_CreateOrUpdate

```java
/**
 * Samples for Sites GetByResourceGroup.
 */
public final class SitesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/edge/resource-manager/Microsoft.Edge/sites/preview/2024-02-01-preview/examples/Sites_Get.json
     */
    /**
     * Sample code: Get Site.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void getSite(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sites().getByResourceGroupWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }
}
```

### Sites_Delete

```java
/**
 * Samples for SitesBySubscription List.
 */
public final class SitesBySubscriptionListSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2024-02-01-preview/examples/
     * SitesBySubscription_List.json
     */
    /**
     * Sample code: List by Subscription.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void
        listBySubscription(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sitesBySubscriptions().list(com.azure.core.util.Context.NONE);
    }
}
```

### Sites_GetByResourceGroup

```java
/**
 * Samples for SitesBySubscription Get.
 */
public final class SitesBySubscriptionGetSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2024-02-01-preview/examples/
     * SitesBySubscription_Get.json
     */
    /**
     * Sample code: Get Site Subscription.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void
        getSiteSubscription(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sitesBySubscriptions().getWithResponse("string", com.azure.core.util.Context.NONE);
    }
}
```

### Sites_ListByResourceGroup

```java
import com.azure.resourcemanager.edgemicrosoftedgesites.models.Site;
import com.azure.resourcemanager.edgemicrosoftedgesites.models.SiteUpdateProperties;

/**
 * Samples for SitesBySubscription Update.
 */
public final class SitesBySubscriptionUpdateSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2024-02-01-preview/examples/
     * SitesBySubscription_Update.json
     */
    /**
     * Sample code: Patch Site Subscription.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void
        patchSiteSubscription(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        Site resource
            = manager.sitesBySubscriptions().getWithResponse("string", com.azure.core.util.Context.NONE).getValue();
        resource.update()
            .withProperties(new SiteUpdateProperties().withDisplayName("string")
                .withDescription("string")
                .withAddressResourceId(
                    "/subscriptions/0154f7fe-df09-4981-bf82-7ad5c1f596eb/resourceGroups/us-site-rg/providers/Microsoft.EdgeOrder/addresses/12343213"))
            .apply();
    }
}
```

### Sites_Update

```java
import com.azure.resourcemanager.edgemicrosoftedgesites.fluent.models.SiteInner;
import com.azure.resourcemanager.edgemicrosoftedgesites.models.SiteProperties;

/**
 * Samples for Sites CreateOrUpdate.
 */
public final class SitesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/edge/resource-manager/Microsoft.Edge/sites/preview/2024-02-01-preview/examples/Sites_CreateOrUpdate
     * .json
     */
    /**
     * Sample code: Create or update Site.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void
        createOrUpdateSite(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sites()
            .createOrUpdate("string", "string", new SiteInner().withProperties(new SiteProperties()
                .withDisplayName("string")
                .withDescription("string")
                .withAddressResourceId(
                    "/subscriptions/680d0dad-59aa-4464-3df3-b34b2b42738c/resourceGroups/us-site-rg/providers/Microsoft.EdgeOrder/addresses/12343213")),
                com.azure.core.util.Context.NONE);
    }
}
```

### SitesBySubscription_CreateOrUpdate

```java
/**
 * Samples for SitesBySubscription Delete.
 */
public final class SitesBySubscriptionDeleteSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2024-02-01-preview/examples/
     * SitesBySubscription_Delete.json
     */
    /**
     * Sample code: Delete Site Subscription.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void
        deleteSiteSubscription(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sitesBySubscriptions().deleteWithResponse("string", com.azure.core.util.Context.NONE);
    }
}
```

### SitesBySubscription_Delete

```java
import com.azure.resourcemanager.edgemicrosoftedgesites.models.SiteProperties;

/**
 * Samples for SitesBySubscription CreateOrUpdate.
 */
public final class SitesBySubscriptionCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2024-02-01-preview/examples/
     * SitesBySubscription_CreateOrUpdate.json
     */
    /**
     * Sample code: Create Site Subscription.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void
        createSiteSubscription(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sitesBySubscriptions()
            .define("string")
            .withProperties(new SiteProperties().withDisplayName("string")
                .withDescription("string")
                .withAddressResourceId(
                    "/subscriptions/680d0dad-59aa-4464-3df3-b34b2b42738c/resourceGroups/us-site-rg/providers/Microsoft.EdgeOrder/addresses/12343213"))
            .create();
    }
}
```

### SitesBySubscription_Get

```java
/**
 * Samples for Sites ListByResourceGroup.
 */
public final class SitesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/sites/preview/2024-02-01-preview/examples/
     * Sites_ListByResourceGroup.json
     */
    /**
     * Sample code: List by Site Subscription.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void
        listBySiteSubscription(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sites().listByResourceGroup("string", com.azure.core.util.Context.NONE);
    }
}
```

### SitesBySubscription_List

```java
import com.azure.resourcemanager.edgemicrosoftedgesites.models.SiteUpdate;
import com.azure.resourcemanager.edgemicrosoftedgesites.models.SiteUpdateProperties;

/**
 * Samples for Sites Update.
 */
public final class SitesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/edge/resource-manager/Microsoft.Edge/sites/preview/2024-02-01-preview/examples/Sites_Update.json
     */
    /**
     * Sample code: Update Site.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void
        updateSite(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sites()
            .updateWithResponse("string", "string", new SiteUpdate().withProperties(new SiteUpdateProperties()
                .withDisplayName("string")
                .withDescription("string")
                .withAddressResourceId(
                    "/subscriptions/11111111-2222-3333-4444-55555555/resourceGroups/us-site-rg/providers/Microsoft.EdgeOrder/addresses/12343213")),
                com.azure.core.util.Context.NONE);
    }
}
```

### SitesBySubscription_Update

```java
/**
 * Samples for Sites Delete.
 */
public final class SitesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/edge/resource-manager/Microsoft.Edge/sites/preview/2024-02-01-preview/examples/Sites_Delete.json
     */
    /**
     * Sample code: Delete Site.
     * 
     * @param manager Entry point to EdgemicrosoftedgesitesManager.
     */
    public static void
        deleteSite(com.azure.resourcemanager.edgemicrosoftedgesites.EdgemicrosoftedgesitesManager manager) {
        manager.sites().deleteByResourceGroupWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }
}
```

