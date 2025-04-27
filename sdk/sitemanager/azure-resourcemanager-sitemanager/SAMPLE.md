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
 * Samples for SitesBySubscription Get.
 */
public final class SitesBySubscriptionGetSamples {
    /*
     * x-ms-original-file: 2024-02-01-preview/SitesBySubscription_Get.json
     */
    /**
     * Sample code: Get Site Subscription.
     * 
     * @param manager Entry point to SitemanagerManager.
     */
    public static void getSiteSubscription(com.azure.resourcemanager.sitemanager.SitemanagerManager manager) {
        manager.sitesBySubscriptions().getWithResponse("string", com.azure.core.util.Context.NONE);
    }
}
```

### Sites_Delete

```java
import com.azure.resourcemanager.sitemanager.fluent.models.SiteInner;
import com.azure.resourcemanager.sitemanager.models.SiteProperties;

/**
 * Samples for SitesBySubscription CreateOrUpdate.
 */
public final class SitesBySubscriptionCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2024-02-01-preview/SitesBySubscription_CreateOrUpdate.json
     */
    /**
     * Sample code: Create Site Subscription.
     * 
     * @param manager Entry point to SitemanagerManager.
     */
    public static void createSiteSubscription(com.azure.resourcemanager.sitemanager.SitemanagerManager manager) {
        manager.sitesBySubscriptions()
            .createOrUpdate("string", new SiteInner().withProperties(new SiteProperties().withDisplayName("string")
                .withDescription("string")
                .withAddressResourceId(
                    "/subscriptions/680d0dad-59aa-4464-3df3-b34b2b42738c/resourceGroups/us-site-rg/providers/Microsoft.EdgeOrder/addresses/12343213")),
                com.azure.core.util.Context.NONE);
    }
}
```

### Sites_GetByResourceGroup

```java
import com.azure.resourcemanager.sitemanager.models.SiteProperties;

/**
 * Samples for Sites CreateOrUpdate.
 */
public final class SitesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2024-02-01-preview/Sites_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update Site.
     * 
     * @param manager Entry point to SitemanagerManager.
     */
    public static void createOrUpdateSite(com.azure.resourcemanager.sitemanager.SitemanagerManager manager) {
        manager.sites()
            .define("string")
            .withExistingResourceGroup("string")
            .withProperties(new SiteProperties().withDisplayName("string")
                .withDescription("string")
                .withAddressResourceId(
                    "/subscriptions/680d0dad-59aa-4464-3df3-b34b2b42738c/resourceGroups/us-site-rg/providers/Microsoft.EdgeOrder/addresses/12343213"))
            .create();
    }
}
```

### Sites_ListByResourceGroup

```java
/**
 * Samples for SitesBySubscription List.
 */
public final class SitesBySubscriptionListSamples {
    /*
     * x-ms-original-file: 2024-02-01-preview/SitesBySubscription_List.json
     */
    /**
     * Sample code: List by Subscription.
     * 
     * @param manager Entry point to SitemanagerManager.
     */
    public static void listBySubscription(com.azure.resourcemanager.sitemanager.SitemanagerManager manager) {
        manager.sitesBySubscriptions().list(com.azure.core.util.Context.NONE);
    }
}
```

### Sites_Update

```java
/**
 * Samples for Sites Delete.
 */
public final class SitesDeleteSamples {
    /*
     * x-ms-original-file: 2024-02-01-preview/Sites_Delete.json
     */
    /**
     * Sample code: Delete Site.
     * 
     * @param manager Entry point to SitemanagerManager.
     */
    public static void deleteSite(com.azure.resourcemanager.sitemanager.SitemanagerManager manager) {
        manager.sites().deleteByResourceGroupWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }
}
```

### SitesBySubscription_CreateOrUpdate

```java
import com.azure.resourcemanager.sitemanager.models.SiteUpdate;
import com.azure.resourcemanager.sitemanager.models.SiteUpdateProperties;

/**
 * Samples for SitesBySubscription Update.
 */
public final class SitesBySubscriptionUpdateSamples {
    /*
     * x-ms-original-file: 2024-02-01-preview/SitesBySubscription_Update.json
     */
    /**
     * Sample code: Patch Site Subscription.
     * 
     * @param manager Entry point to SitemanagerManager.
     */
    public static void patchSiteSubscription(com.azure.resourcemanager.sitemanager.SitemanagerManager manager) {
        manager.sitesBySubscriptions()
            .updateWithResponse("string", new SiteUpdate().withProperties(new SiteUpdateProperties()
                .withDisplayName("string")
                .withDescription("string")
                .withAddressResourceId(
                    "/subscriptions/0154f7fe-df09-4981-bf82-7ad5c1f596eb/resourceGroups/us-site-rg/providers/Microsoft.EdgeOrder/addresses/12343213")),
                com.azure.core.util.Context.NONE);
    }
}
```

### SitesBySubscription_Delete

```java
import com.azure.resourcemanager.sitemanager.models.Site;
import com.azure.resourcemanager.sitemanager.models.SiteUpdateProperties;

/**
 * Samples for Sites Update.
 */
public final class SitesUpdateSamples {
    /*
     * x-ms-original-file: 2024-02-01-preview/Sites_Update.json
     */
    /**
     * Sample code: Update Site.
     * 
     * @param manager Entry point to SitemanagerManager.
     */
    public static void updateSite(com.azure.resourcemanager.sitemanager.SitemanagerManager manager) {
        Site resource = manager.sites()
            .getByResourceGroupWithResponse("string", "string", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new SiteUpdateProperties().withDisplayName("string")
                .withDescription("string")
                .withAddressResourceId(
                    "/subscriptions/11111111-2222-3333-4444-55555555/resourceGroups/us-site-rg/providers/Microsoft.EdgeOrder/addresses/12343213"))
            .apply();
    }
}
```

### SitesBySubscription_Get

```java
/**
 * Samples for Sites GetByResourceGroup.
 */
public final class SitesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-02-01-preview/Sites_Get.json
     */
    /**
     * Sample code: Get Site.
     * 
     * @param manager Entry point to SitemanagerManager.
     */
    public static void getSite(com.azure.resourcemanager.sitemanager.SitemanagerManager manager) {
        manager.sites().getByResourceGroupWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }
}
```

### SitesBySubscription_List

```java
/**
 * Samples for Sites ListByResourceGroup.
 */
public final class SitesListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-02-01-preview/Sites_ListByResourceGroup.json
     */
    /**
     * Sample code: List by Site Subscription.
     * 
     * @param manager Entry point to SitemanagerManager.
     */
    public static void listBySiteSubscription(com.azure.resourcemanager.sitemanager.SitemanagerManager manager) {
        manager.sites().listByResourceGroup("string", com.azure.core.util.Context.NONE);
    }
}
```

### SitesBySubscription_Update

```java
/**
 * Samples for SitesBySubscription Delete.
 */
public final class SitesBySubscriptionDeleteSamples {
    /*
     * x-ms-original-file: 2024-02-01-preview/SitesBySubscription_Delete.json
     */
    /**
     * Sample code: Delete Site Subscription.
     * 
     * @param manager Entry point to SitemanagerManager.
     */
    public static void deleteSiteSubscription(com.azure.resourcemanager.sitemanager.SitemanagerManager manager) {
        manager.sitesBySubscriptions().deleteWithResponse("string", com.azure.core.util.Context.NONE);
    }
}
```

