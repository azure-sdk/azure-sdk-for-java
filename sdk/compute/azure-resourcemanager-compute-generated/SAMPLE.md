# Code snippets and samples


## CommunityGalleries

- [Get](#communitygalleries_get)

## CommunityGalleryImageVersions

- [Get](#communitygalleryimageversions_get)
- [List](#communitygalleryimageversions_list)

## CommunityGalleryImages

- [Get](#communitygalleryimages_get)
- [List](#communitygalleryimages_list)

## Galleries

- [CreateOrUpdate](#galleries_createorupdate)
- [Delete](#galleries_delete)
- [GetByResourceGroup](#galleries_getbyresourcegroup)
- [List](#galleries_list)
- [ListByResourceGroup](#galleries_listbyresourcegroup)
- [Update](#galleries_update)

## GalleryApplicationVersions

- [CreateOrUpdate](#galleryapplicationversions_createorupdate)
- [Delete](#galleryapplicationversions_delete)
- [Get](#galleryapplicationversions_get)
- [ListByGalleryApplication](#galleryapplicationversions_listbygalleryapplication)
- [Update](#galleryapplicationversions_update)

## GalleryApplications

- [CreateOrUpdate](#galleryapplications_createorupdate)
- [Delete](#galleryapplications_delete)
- [Get](#galleryapplications_get)
- [ListByGallery](#galleryapplications_listbygallery)
- [Update](#galleryapplications_update)

## GalleryImageVersions

- [CreateOrUpdate](#galleryimageversions_createorupdate)
- [Delete](#galleryimageversions_delete)
- [Get](#galleryimageversions_get)
- [ListByGalleryImage](#galleryimageversions_listbygalleryimage)
- [Update](#galleryimageversions_update)

## GalleryImages

- [CreateOrUpdate](#galleryimages_createorupdate)
- [Delete](#galleryimages_delete)
- [Get](#galleryimages_get)
- [ListByGallery](#galleryimages_listbygallery)
- [Update](#galleryimages_update)

## GallerySharingProfile

- [Update](#gallerysharingprofile_update)

## SharedGalleries

- [Get](#sharedgalleries_get)
- [List](#sharedgalleries_list)

## SharedGalleryImageVersions

- [Get](#sharedgalleryimageversions_get)
- [List](#sharedgalleryimageversions_list)

## SharedGalleryImages

- [Get](#sharedgalleryimages_get)
- [List](#sharedgalleryimages_list)
### CommunityGalleries_Get

```java
/** Samples for CommunityGalleries Get. */
public final class CommunityGalleriesGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/communityGalleryExamples/CommunityGallery_Get.json
     */
    /**
     * Sample code: Get a community gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getACommunityGallery(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .communityGalleries()
            .getWithResponse("myLocation", "publicGalleryName", com.azure.core.util.Context.NONE);
    }
}
```

### CommunityGalleryImageVersions_Get

```java
/** Samples for CommunityGalleryImageVersions Get. */
public final class CommunityGalleryImageVersionsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/communityGalleryExamples/CommunityGalleryImageVersion_Get.json
     */
    /**
     * Sample code: Get a community gallery image version.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getACommunityGalleryImageVersion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .communityGalleryImageVersions()
            .getWithResponse(
                "myLocation",
                "publicGalleryName",
                "myGalleryImageName",
                "myGalleryImageVersionName",
                com.azure.core.util.Context.NONE);
    }
}
```

### CommunityGalleryImageVersions_List

```java
/** Samples for CommunityGalleryImageVersions List. */
public final class CommunityGalleryImageVersionsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/communityGalleryExamples/CommunityGalleryImageVersion_List.json
     */
    /**
     * Sample code: List community gallery image versions.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listCommunityGalleryImageVersions(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .communityGalleryImageVersions()
            .list("myLocation", "publicGalleryName", "myGalleryImageName", com.azure.core.util.Context.NONE);
    }
}
```

### CommunityGalleryImages_Get

```java
/** Samples for CommunityGalleryImages Get. */
public final class CommunityGalleryImagesGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/communityGalleryExamples/CommunityGalleryImage_Get.json
     */
    /**
     * Sample code: Get a community gallery image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getACommunityGalleryImage(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .communityGalleryImages()
            .getWithResponse("myLocation", "publicGalleryName", "myGalleryImageName", com.azure.core.util.Context.NONE);
    }
}
```

### CommunityGalleryImages_List

```java
/** Samples for CommunityGalleryImages List. */
public final class CommunityGalleryImagesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/communityGalleryExamples/CommunityGalleryImage_List.json
     */
    /**
     * Sample code: List community gallery images.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listCommunityGalleryImages(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.communityGalleryImages().list("myLocation", "publicGalleryName", com.azure.core.util.Context.NONE);
    }
}
```

### Galleries_CreateOrUpdate

```java
import com.azure.resourcemanager.compute.generated.models.CommunityGalleryInfo;
import com.azure.resourcemanager.compute.generated.models.GallerySharingPermissionTypes;
import com.azure.resourcemanager.compute.generated.models.SharingProfile;
import com.azure.resourcemanager.compute.generated.models.SoftDeletePolicy;

/** Samples for Galleries CreateOrUpdate. */
public final class GalleriesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/CommunityGallery_Create.json
     */
    /**
     * Sample code: Create a community gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createACommunityGallery(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleries()
            .define("myGalleryName")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withDescription("This is the gallery description.")
            .withSharingProfile(
                new SharingProfile()
                    .withPermissions(GallerySharingPermissionTypes.COMMUNITY)
                    .withCommunityGalleryInfo(
                        new CommunityGalleryInfo()
                            .withPublisherUri("uri")
                            .withPublisherContact("pir@microsoft.com")
                            .withEula("eula")
                            .withPublicNamePrefix("PirPublic")))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/Gallery_Create_WithSharingProfile.json
     */
    /**
     * Sample code: Create or update a simple gallery with sharing profile.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryWithSharingProfile(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleries()
            .define("myGalleryName")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withDescription("This is the gallery description.")
            .withSharingProfile(new SharingProfile().withPermissions(GallerySharingPermissionTypes.GROUPS))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/Gallery_Create.json
     */
    /**
     * Sample code: Create or update a simple gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGallery(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleries()
            .define("myGalleryName")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withDescription("This is the gallery description.")
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/Gallery_Create_SoftDeletionEnabled.json
     */
    /**
     * Sample code: Create or update a simple gallery with soft deletion enabled.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryWithSoftDeletionEnabled(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleries()
            .define("myGalleryName")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withDescription("This is the gallery description.")
            .withSoftDeletePolicy(new SoftDeletePolicy().withIsSoftDeleteEnabled(true))
            .create();
    }
}
```

### Galleries_Delete

```java
/** Samples for Galleries Delete. */
public final class GalleriesDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/Gallery_Delete.json
     */
    /**
     * Sample code: Delete a gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteAGallery(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.galleries().delete("myResourceGroup", "myGalleryName", com.azure.core.util.Context.NONE);
    }
}
```

### Galleries_GetByResourceGroup

```java
import com.azure.resourcemanager.compute.generated.models.GalleryExpandParams;
import com.azure.resourcemanager.compute.generated.models.SelectPermissions;

/** Samples for Galleries GetByResourceGroup. */
public final class GalleriesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/CommunityGallery_Get.json
     */
    /**
     * Sample code: Get a community gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getACommunityGallery(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleries()
            .getByResourceGroupWithResponse(
                "myResourceGroup", "myGalleryName", null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/Gallery_Get_WithSelectPermissions.json
     */
    /**
     * Sample code: Get a gallery with select permissions.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryWithSelectPermissions(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleries()
            .getByResourceGroupWithResponse(
                "myResourceGroup",
                "myGalleryName",
                SelectPermissions.PERMISSIONS,
                null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/Gallery_Get.json
     */
    /**
     * Sample code: Get a gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGallery(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleries()
            .getByResourceGroupWithResponse(
                "myResourceGroup", "myGalleryName", null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/Gallery_Get_WithExpandSharingProfileGroups.json
     */
    /**
     * Sample code: Get a gallery with expand sharingProfile groups.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryWithExpandSharingProfileGroups(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleries()
            .getByResourceGroupWithResponse(
                "myResourceGroup",
                "myGalleryName",
                null,
                GalleryExpandParams.SHARING_PROFILE_GROUPS,
                com.azure.core.util.Context.NONE);
    }
}
```

### Galleries_List

```java
/** Samples for Galleries List. */
public final class GalleriesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/Gallery_ListBySubscription.json
     */
    /**
     * Sample code: List galleries in a subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listGalleriesInASubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.galleries().list(com.azure.core.util.Context.NONE);
    }
}
```

### Galleries_ListByResourceGroup

```java
/** Samples for Galleries ListByResourceGroup. */
public final class GalleriesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/Gallery_ListByResourceGroup.json
     */
    /**
     * Sample code: List galleries in a resource group.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listGalleriesInAResourceGroup(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.galleries().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### Galleries_Update

```java
import com.azure.resourcemanager.compute.generated.models.Gallery;

/** Samples for Galleries Update. */
public final class GalleriesUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/Gallery_Update.json
     */
    /**
     * Sample code: Update a simple gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateASimpleGallery(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        Gallery resource =
            manager
                .galleries()
                .getByResourceGroupWithResponse(
                    "myResourceGroup", "myGalleryName", null, null, com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withDescription("This is the gallery description.").apply();
    }
}
```

### GalleryApplicationVersions_CreateOrUpdate

```java
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationCustomAction;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationCustomActionParameter;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationCustomActionParameterType;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationVersionPublishingProfile;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationVersionSafetyProfile;
import com.azure.resourcemanager.compute.generated.models.StorageAccountType;
import com.azure.resourcemanager.compute.generated.models.TargetRegion;
import com.azure.resourcemanager.compute.generated.models.UserArtifactManage;
import com.azure.resourcemanager.compute.generated.models.UserArtifactSource;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for GalleryApplicationVersions CreateOrUpdate. */
public final class GalleryApplicationVersionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryApplicationVersion_Create.json
     */
    /**
     * Sample code: Create or update a simple gallery Application Version.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryApplicationVersion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplicationVersions()
            .define("1.0.0")
            .withRegion("West US")
            .withExistingApplication("myResourceGroup", "myGalleryName", "myGalleryApplicationName")
            .withPublishingProfile(
                new GalleryApplicationVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion()
                                    .withName("West US")
                                    .withRegionalReplicaCount(1)
                                    .withStorageAccountType(StorageAccountType.STANDARD_LRS)
                                    .withExcludeFromLatest(false)))
                    .withReplicaCount(1)
                    .withEndOfLifeDate(OffsetDateTime.parse("2019-07-01T07:00:00Z"))
                    .withStorageAccountType(StorageAccountType.STANDARD_LRS)
                    .withSource(
                        new UserArtifactSource()
                            .withMediaLink(
                                "https://mystorageaccount.blob.core.windows.net/mycontainer/package.zip?{sasKey}"))
                    .withManageActions(
                        new UserArtifactManage()
                            .withInstall(
                                "powershell -command \"Expand-Archive -Path package.zip -DestinationPath C:\\package\"")
                            .withRemove("del C:\\package "))
                    .withCustomActions(
                        Arrays
                            .asList(
                                new GalleryApplicationCustomAction()
                                    .withName("myCustomAction")
                                    .withScript("myCustomActionScript")
                                    .withDescription("This is the custom action description.")
                                    .withParameters(
                                        Arrays
                                            .asList(
                                                new GalleryApplicationCustomActionParameter()
                                                    .withName("myCustomActionParameter")
                                                    .withRequired(false)
                                                    .withType(GalleryApplicationCustomActionParameterType.STRING)
                                                    .withDefaultValue("default value of parameter.")
                                                    .withDescription("This is the description of the parameter"))))))
            .withSafetyProfile(
                new GalleryApplicationVersionSafetyProfile().withAllowDeletionOfReplicatedLocations(false))
            .create();
    }
}
```

### GalleryApplicationVersions_Delete

```java
/** Samples for GalleryApplicationVersions Delete. */
public final class GalleryApplicationVersionsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryApplicationVersion_Delete.json
     */
    /**
     * Sample code: Delete a gallery Application Version.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteAGalleryApplicationVersion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplicationVersions()
            .delete(
                "myResourceGroup",
                "myGalleryName",
                "myGalleryApplicationName",
                "1.0.0",
                com.azure.core.util.Context.NONE);
    }
}
```

### GalleryApplicationVersions_Get

```java
import com.azure.resourcemanager.compute.generated.models.ReplicationStatusTypes;

/** Samples for GalleryApplicationVersions Get. */
public final class GalleryApplicationVersionsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryApplicationVersion_Get.json
     */
    /**
     * Sample code: Get a gallery Application Version.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryApplicationVersion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplicationVersions()
            .getWithResponse(
                "myResourceGroup",
                "myGalleryName",
                "myGalleryApplicationName",
                "1.0.0",
                null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryApplicationVersion_Get_WithReplicationStatus.json
     */
    /**
     * Sample code: Get a gallery Application Version with replication status.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryApplicationVersionWithReplicationStatus(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplicationVersions()
            .getWithResponse(
                "myResourceGroup",
                "myGalleryName",
                "myGalleryApplicationName",
                "1.0.0",
                ReplicationStatusTypes.REPLICATION_STATUS,
                com.azure.core.util.Context.NONE);
    }
}
```

### GalleryApplicationVersions_ListByGalleryApplication

```java
/** Samples for GalleryApplicationVersions ListByGalleryApplication. */
public final class GalleryApplicationVersionsListByGalleryApplicationSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryApplicationVersion_ListByGalleryApplication.json
     */
    /**
     * Sample code: List gallery Application Versions in a gallery Application Definition.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listGalleryApplicationVersionsInAGalleryApplicationDefinition(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplicationVersions()
            .listByGalleryApplication(
                "myResourceGroup", "myGalleryName", "myGalleryApplicationName", com.azure.core.util.Context.NONE);
    }
}
```

### GalleryApplicationVersions_Update

```java
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationVersion;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationVersionPublishingProfile;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationVersionSafetyProfile;
import com.azure.resourcemanager.compute.generated.models.StorageAccountType;
import com.azure.resourcemanager.compute.generated.models.TargetRegion;
import com.azure.resourcemanager.compute.generated.models.UserArtifactManage;
import com.azure.resourcemanager.compute.generated.models.UserArtifactSource;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for GalleryApplicationVersions Update. */
public final class GalleryApplicationVersionsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryApplicationVersion_Update.json
     */
    /**
     * Sample code: Update a simple gallery Application Version.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateASimpleGalleryApplicationVersion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        GalleryApplicationVersion resource =
            manager
                .galleryApplicationVersions()
                .getWithResponse(
                    "myResourceGroup",
                    "myGalleryName",
                    "myGalleryApplicationName",
                    "1.0.0",
                    null,
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withPublishingProfile(
                new GalleryApplicationVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion()
                                    .withName("West US")
                                    .withRegionalReplicaCount(1)
                                    .withStorageAccountType(StorageAccountType.STANDARD_LRS)
                                    .withExcludeFromLatest(false)))
                    .withReplicaCount(1)
                    .withEndOfLifeDate(OffsetDateTime.parse("2019-07-01T07:00:00Z"))
                    .withStorageAccountType(StorageAccountType.STANDARD_LRS)
                    .withSource(
                        new UserArtifactSource()
                            .withMediaLink(
                                "https://mystorageaccount.blob.core.windows.net/mycontainer/package.zip?{sasKey}"))
                    .withManageActions(
                        new UserArtifactManage()
                            .withInstall(
                                "powershell -command \"Expand-Archive -Path package.zip -DestinationPath C:\\package\"")
                            .withRemove("del C:\\package ")))
            .withSafetyProfile(
                new GalleryApplicationVersionSafetyProfile().withAllowDeletionOfReplicatedLocations(false))
            .apply();
    }
}
```

### GalleryApplications_CreateOrUpdate

```java
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationCustomAction;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationCustomActionParameter;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationCustomActionParameterType;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import java.util.Arrays;

/** Samples for GalleryApplications CreateOrUpdate. */
public final class GalleryApplicationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryApplication_Create.json
     */
    /**
     * Sample code: Create or update a simple gallery Application.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryApplication(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplications()
            .define("myGalleryApplicationName")
            .withRegion("West US")
            .withExistingGallery("myResourceGroup", "myGalleryName")
            .withDescription("This is the gallery application description.")
            .withEula("This is the gallery application EULA.")
            .withPrivacyStatementUri("myPrivacyStatementUri}")
            .withReleaseNoteUri("myReleaseNoteUri")
            .withSupportedOSType(OperatingSystemTypes.WINDOWS)
            .withCustomActions(
                Arrays
                    .asList(
                        new GalleryApplicationCustomAction()
                            .withName("myCustomAction")
                            .withScript("myCustomActionScript")
                            .withDescription("This is the custom action description.")
                            .withParameters(
                                Arrays
                                    .asList(
                                        new GalleryApplicationCustomActionParameter()
                                            .withName("myCustomActionParameter")
                                            .withRequired(false)
                                            .withType(GalleryApplicationCustomActionParameterType.STRING)
                                            .withDefaultValue("default value of parameter.")
                                            .withDescription("This is the description of the parameter")))))
            .create();
    }
}
```

### GalleryApplications_Delete

```java
/** Samples for GalleryApplications Delete. */
public final class GalleryApplicationsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryApplication_Delete.json
     */
    /**
     * Sample code: Delete a gallery Application.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteAGalleryApplication(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplications()
            .delete("myResourceGroup", "myGalleryName", "myGalleryApplicationName", com.azure.core.util.Context.NONE);
    }
}
```

### GalleryApplications_Get

```java
/** Samples for GalleryApplications Get. */
public final class GalleryApplicationsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryApplication_Get.json
     */
    /**
     * Sample code: Get a gallery Application.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryApplication(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplications()
            .getWithResponse(
                "myResourceGroup", "myGalleryName", "myGalleryApplicationName", com.azure.core.util.Context.NONE);
    }
}
```

### GalleryApplications_ListByGallery

```java
/** Samples for GalleryApplications ListByGallery. */
public final class GalleryApplicationsListByGallerySamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryApplication_ListByGallery.json
     */
    /**
     * Sample code: List gallery Applications in a gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listGalleryApplicationsInAGallery(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryApplications()
            .listByGallery("myResourceGroup", "myGalleryName", com.azure.core.util.Context.NONE);
    }
}
```

### GalleryApplications_Update

```java
import com.azure.resourcemanager.compute.generated.models.GalleryApplication;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationCustomAction;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationCustomActionParameter;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationCustomActionParameterType;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import java.util.Arrays;

/** Samples for GalleryApplications Update. */
public final class GalleryApplicationsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryApplication_Update.json
     */
    /**
     * Sample code: Update a simple gallery Application.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateASimpleGalleryApplication(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        GalleryApplication resource =
            manager
                .galleryApplications()
                .getWithResponse(
                    "myResourceGroup", "myGalleryName", "myGalleryApplicationName", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withDescription("This is the gallery application description.")
            .withEula("This is the gallery application EULA.")
            .withPrivacyStatementUri("myPrivacyStatementUri}")
            .withReleaseNoteUri("myReleaseNoteUri")
            .withSupportedOSType(OperatingSystemTypes.WINDOWS)
            .withCustomActions(
                Arrays
                    .asList(
                        new GalleryApplicationCustomAction()
                            .withName("myCustomAction")
                            .withScript("myCustomActionScript")
                            .withDescription("This is the custom action description.")
                            .withParameters(
                                Arrays
                                    .asList(
                                        new GalleryApplicationCustomActionParameter()
                                            .withName("myCustomActionParameter")
                                            .withRequired(false)
                                            .withType(GalleryApplicationCustomActionParameterType.STRING)
                                            .withDefaultValue("default value of parameter.")
                                            .withDescription("This is the description of the parameter")))))
            .apply();
    }
}
```

### GalleryImageVersions_CreateOrUpdate

```java
import com.azure.resourcemanager.compute.generated.models.DataDiskImageEncryption;
import com.azure.resourcemanager.compute.generated.models.EncryptionImages;
import com.azure.resourcemanager.compute.generated.models.GalleryArtifactVersionFullSource;
import com.azure.resourcemanager.compute.generated.models.GalleryDataDiskImage;
import com.azure.resourcemanager.compute.generated.models.GalleryDiskImageSource;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersionPublishingProfile;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersionSafetyProfile;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersionStorageProfile;
import com.azure.resourcemanager.compute.generated.models.GalleryOSDiskImage;
import com.azure.resourcemanager.compute.generated.models.HostCaching;
import com.azure.resourcemanager.compute.generated.models.OSDiskImageEncryption;
import com.azure.resourcemanager.compute.generated.models.ReplicationMode;
import com.azure.resourcemanager.compute.generated.models.StorageAccountType;
import com.azure.resourcemanager.compute.generated.models.TargetRegion;
import java.util.Arrays;

/** Samples for GalleryImageVersions CreateOrUpdate. */
public final class GalleryImageVersionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Create_WithShallowReplicationMode.json
     */
    /**
     * Sample code: Create or update a simple Gallery Image Version using shallow replication mode.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryImageVersionUsingShallowReplicationMode(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .define("1.0.0")
            .withRegion("West US")
            .withExistingImage("myResourceGroup", "myGalleryName", "myGalleryImageName")
            .withPublishingProfile(
                new GalleryImageVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion()
                                    .withName("West US")
                                    .withRegionalReplicaCount(1)
                                    .withExcludeFromLatest(false)))
                    .withReplicationMode(ReplicationMode.SHALLOW))
            .withStorageProfile(
                new GalleryImageVersionStorageProfile()
                    .withSource(
                        new GalleryArtifactVersionFullSource()
                            .withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/images/{imageName}")))
            .withSafetyProfile(new GalleryImageVersionSafetyProfile().withAllowDeletionOfReplicatedLocations(false))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Create_WithVHD.json
     */
    /**
     * Sample code: Create or update a simple Gallery Image Version using vhd as a source.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryImageVersionUsingVhdAsASource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .define("1.0.0")
            .withRegion("West US")
            .withExistingImage("myResourceGroup", "myGalleryName", "myGalleryImageName")
            .withPublishingProfile(
                new GalleryImageVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion()
                                    .withName("West US")
                                    .withRegionalReplicaCount(1)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myOtherDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false),
                                new TargetRegion()
                                    .withName("East US")
                                    .withRegionalReplicaCount(2)
                                    .withStorageAccountType(StorageAccountType.STANDARD_ZRS)
                                    .withExcludeFromLatest(false))))
            .withStorageProfile(
                new GalleryImageVersionStorageProfile()
                    .withOsDiskImage(
                        new GalleryOSDiskImage()
                            .withHostCaching(HostCaching.READ_ONLY)
                            .withSource(
                                new GalleryDiskImageSource()
                                    .withId(
                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/{storageAccount}")
                                    .withUri(
                                        "https://gallerysourcencus.blob.core.windows.net/myvhds/Windows-Server-2012-R2-20171216-en.us-128GB.vhd")))
                    .withDataDiskImages(
                        Arrays
                            .asList(
                                new GalleryDataDiskImage()
                                    .withHostCaching(HostCaching.NONE)
                                    .withSource(
                                        new GalleryDiskImageSource()
                                            .withId(
                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/{storageAccount}")
                                            .withUri(
                                                "https://gallerysourcencus.blob.core.windows.net/myvhds/Windows-Server-2012-R2-20171216-en.us-128GB.vhd"))
                                    .withLun(1))))
            .withSafetyProfile(new GalleryImageVersionSafetyProfile().withAllowDeletionOfReplicatedLocations(false))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Create_WithVmAsSource.json
     */
    /**
     * Sample code: Create or update a simple Gallery Image Version using VM as source.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryImageVersionUsingVMAsSource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .define("1.0.0")
            .withRegion("West US")
            .withExistingImage("myResourceGroup", "myGalleryName", "myGalleryImageName")
            .withPublishingProfile(
                new GalleryImageVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion()
                                    .withName("West US")
                                    .withRegionalReplicaCount(2)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myOtherWestUSDiskEncryptionSet")
                                                            .withLun(0),
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false),
                                new TargetRegion()
                                    .withName("East US")
                                    .withRegionalReplicaCount(2)
                                    .withStorageAccountType(StorageAccountType.STANDARD_ZRS)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myOtherEastUSDiskEncryptionSet")
                                                            .withLun(0),
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false))))
            .withStorageProfile(
                new GalleryImageVersionStorageProfile()
                    .withSource(
                        new GalleryArtifactVersionFullSource()
                            .withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/virtualMachines/{vmName}")))
            .withSafetyProfile(new GalleryImageVersionSafetyProfile().withAllowDeletionOfReplicatedLocations(false))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Create_WithImageVersionAsSource.json
     */
    /**
     * Sample code: Create or update a simple Gallery Image Version using shared image as source.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryImageVersionUsingSharedImageAsSource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .define("1.0.0")
            .withRegion("West US")
            .withExistingImage("myResourceGroup", "myGalleryName", "myGalleryImageName")
            .withPublishingProfile(
                new GalleryImageVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion()
                                    .withName("West US")
                                    .withRegionalReplicaCount(1)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myOtherWestUSDiskEncryptionSet")
                                                            .withLun(0),
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false),
                                new TargetRegion()
                                    .withName("East US")
                                    .withRegionalReplicaCount(2)
                                    .withStorageAccountType(StorageAccountType.STANDARD_ZRS)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myOtherEastUSDiskEncryptionSet")
                                                            .withLun(0),
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false))))
            .withStorageProfile(
                new GalleryImageVersionStorageProfile()
                    .withSource(
                        new GalleryArtifactVersionFullSource()
                            .withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/galleries/{galleryName}/images/{imageDefinitionName}/versions/{versionName}")))
            .withSafetyProfile(new GalleryImageVersionSafetyProfile().withAllowDeletionOfReplicatedLocations(false))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Create_WithSnapshotsAsSource.json
     */
    /**
     * Sample code: Create or update a simple Gallery Image Version using mix of disks and snapshots as a source.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryImageVersionUsingMixOfDisksAndSnapshotsAsASource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .define("1.0.0")
            .withRegion("West US")
            .withExistingImage("myResourceGroup", "myGalleryName", "myGalleryImageName")
            .withPublishingProfile(
                new GalleryImageVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion()
                                    .withName("West US")
                                    .withRegionalReplicaCount(1)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false),
                                new TargetRegion()
                                    .withName("East US")
                                    .withRegionalReplicaCount(2)
                                    .withStorageAccountType(StorageAccountType.STANDARD_ZRS)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false))))
            .withStorageProfile(
                new GalleryImageVersionStorageProfile()
                    .withOsDiskImage(
                        new GalleryOSDiskImage()
                            .withHostCaching(HostCaching.READ_ONLY)
                            .withSource(
                                new GalleryDiskImageSource()
                                    .withId(
                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/snapshots/{osSnapshotName}")))
                    .withDataDiskImages(
                        Arrays
                            .asList(
                                new GalleryDataDiskImage()
                                    .withHostCaching(HostCaching.NONE)
                                    .withSource(
                                        new GalleryDiskImageSource()
                                            .withId(
                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/disks/{dataDiskName}"))
                                    .withLun(1))))
            .withSafetyProfile(new GalleryImageVersionSafetyProfile().withAllowDeletionOfReplicatedLocations(false))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Create_WithSnapshotsAsSource.json
     */
    /**
     * Sample code: Create or update a simple Gallery Image Version using snapshots as a source.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryImageVersionUsingSnapshotsAsASource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .define("1.0.0")
            .withRegion("West US")
            .withExistingImage("myResourceGroup", "myGalleryName", "myGalleryImageName")
            .withPublishingProfile(
                new GalleryImageVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion()
                                    .withName("West US")
                                    .withRegionalReplicaCount(1)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false),
                                new TargetRegion()
                                    .withName("East US")
                                    .withRegionalReplicaCount(2)
                                    .withStorageAccountType(StorageAccountType.STANDARD_ZRS)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false))))
            .withStorageProfile(
                new GalleryImageVersionStorageProfile()
                    .withOsDiskImage(
                        new GalleryOSDiskImage()
                            .withHostCaching(HostCaching.READ_ONLY)
                            .withSource(
                                new GalleryDiskImageSource()
                                    .withId(
                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/snapshots/{osSnapshotName}")))
                    .withDataDiskImages(
                        Arrays
                            .asList(
                                new GalleryDataDiskImage()
                                    .withHostCaching(HostCaching.NONE)
                                    .withSource(
                                        new GalleryDiskImageSource()
                                            .withId(
                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/disks/{dataDiskName}"))
                                    .withLun(1))))
            .withSafetyProfile(new GalleryImageVersionSafetyProfile().withAllowDeletionOfReplicatedLocations(false))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Create_WithTargetExtendedLocations.json
     */
    /**
     * Sample code: Create or update a simple gallery image version with target extended locations specified.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryImageVersionWithTargetExtendedLocationsSpecified(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .define("1.0.0")
            .withRegion("West US")
            .withExistingImage("myResourceGroup", "myGalleryName", "myGalleryImageName")
            .withPublishingProfile(
                new GalleryImageVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion()
                                    .withName("West US")
                                    .withRegionalReplicaCount(1)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myOtherWestUSDiskEncryptionSet")
                                                            .withLun(0),
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false),
                                new TargetRegion()
                                    .withName("East US")
                                    .withRegionalReplicaCount(2)
                                    .withStorageAccountType(StorageAccountType.STANDARD_ZRS)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myOtherEastUSDiskEncryptionSet")
                                                            .withLun(0),
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false))))
            .withStorageProfile(
                new GalleryImageVersionStorageProfile()
                    .withSource(
                        new GalleryArtifactVersionFullSource()
                            .withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/images/{imageName}")))
            .withSafetyProfile(new GalleryImageVersionSafetyProfile().withAllowDeletionOfReplicatedLocations(false))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Create_WithCommunityImageVersionAsSource.json
     */
    /**
     * Sample code: Create or update a simple Gallery Image Version using community gallery image as source.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryImageVersionUsingCommunityGalleryImageAsSource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .define("1.0.0")
            .withRegion("West US")
            .withExistingImage("myResourceGroup", "myGalleryName", "myGalleryImageName")
            .withPublishingProfile(
                new GalleryImageVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion()
                                    .withName("West US")
                                    .withRegionalReplicaCount(1)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myOtherWestUSDiskEncryptionSet")
                                                            .withLun(0),
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false),
                                new TargetRegion()
                                    .withName("East US")
                                    .withRegionalReplicaCount(2)
                                    .withStorageAccountType(StorageAccountType.STANDARD_ZRS)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myOtherEastUSDiskEncryptionSet")
                                                            .withLun(0),
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false))))
            .withStorageProfile(
                new GalleryImageVersionStorageProfile()
                    .withSource(
                        new GalleryArtifactVersionFullSource()
                            .withCommunityGalleryImageId(
                                "/communityGalleries/{communityGalleryName}/images/{communityGalleryImageName}")))
            .withSafetyProfile(new GalleryImageVersionSafetyProfile().withAllowDeletionOfReplicatedLocations(false))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Create.json
     */
    /**
     * Sample code: Create or update a simple Gallery Image Version using managed image as source.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryImageVersionUsingManagedImageAsSource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .define("1.0.0")
            .withRegion("West US")
            .withExistingImage("myResourceGroup", "myGalleryName", "myGalleryImageName")
            .withPublishingProfile(
                new GalleryImageVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion()
                                    .withName("West US")
                                    .withRegionalReplicaCount(1)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myOtherWestUSDiskEncryptionSet")
                                                            .withLun(0),
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myWestUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false),
                                new TargetRegion()
                                    .withName("East US")
                                    .withRegionalReplicaCount(2)
                                    .withStorageAccountType(StorageAccountType.STANDARD_ZRS)
                                    .withEncryption(
                                        new EncryptionImages()
                                            .withOsDiskImage(
                                                new OSDiskImageEncryption()
                                                    .withDiskEncryptionSetId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet"))
                                            .withDataDiskImages(
                                                Arrays
                                                    .asList(
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myOtherEastUSDiskEncryptionSet")
                                                            .withLun(0),
                                                        new DataDiskImageEncryption()
                                                            .withDiskEncryptionSetId(
                                                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSet/myEastUSDiskEncryptionSet")
                                                            .withLun(1))))
                                    .withExcludeFromLatest(false))))
            .withStorageProfile(
                new GalleryImageVersionStorageProfile()
                    .withSource(
                        new GalleryArtifactVersionFullSource()
                            .withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/images/{imageName}")))
            .withSafetyProfile(new GalleryImageVersionSafetyProfile().withAllowDeletionOfReplicatedLocations(false))
            .create();
    }
}
```

### GalleryImageVersions_Delete

```java
/** Samples for GalleryImageVersions Delete. */
public final class GalleryImageVersionsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Delete.json
     */
    /**
     * Sample code: Delete a gallery image version.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteAGalleryImageVersion(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .delete(
                "myResourceGroup", "myGalleryName", "myGalleryImageName", "1.0.0", com.azure.core.util.Context.NONE);
    }
}
```

### GalleryImageVersions_Get

```java
import com.azure.resourcemanager.compute.generated.models.ReplicationStatusTypes;

/** Samples for GalleryImageVersions Get. */
public final class GalleryImageVersionsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Get_WithVhdAsSource.json
     */
    /**
     * Sample code: Get a gallery image version with vhd as a source.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryImageVersionWithVhdAsASource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .getWithResponse(
                "myResourceGroup",
                "myGalleryName",
                "myGalleryImageName",
                "1.0.0",
                null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Get.json
     */
    /**
     * Sample code: Get a gallery image version.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryImageVersion(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .getWithResponse(
                "myResourceGroup",
                "myGalleryName",
                "myGalleryImageName",
                "1.0.0",
                null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Get_WithReplicationStatus.json
     */
    /**
     * Sample code: Get a gallery image version with replication status.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryImageVersionWithReplicationStatus(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .getWithResponse(
                "myResourceGroup",
                "myGalleryName",
                "myGalleryImageName",
                "1.0.0",
                ReplicationStatusTypes.REPLICATION_STATUS,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Get_WithSnapshotsAsSource.json
     */
    /**
     * Sample code: Get a gallery image version with snapshots as a source.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryImageVersionWithSnapshotsAsASource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .getWithResponse(
                "myResourceGroup",
                "myGalleryName",
                "myGalleryImageName",
                "1.0.0",
                null,
                com.azure.core.util.Context.NONE);
    }
}
```

### GalleryImageVersions_ListByGalleryImage

```java
/** Samples for GalleryImageVersions ListByGalleryImage. */
public final class GalleryImageVersionsListByGalleryImageSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_ListByGalleryImage.json
     */
    /**
     * Sample code: List gallery image versions in a gallery image definition.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listGalleryImageVersionsInAGalleryImageDefinition(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImageVersions()
            .listByGalleryImage(
                "myResourceGroup", "myGalleryName", "myGalleryImageName", com.azure.core.util.Context.NONE);
    }
}
```

### GalleryImageVersions_Update

```java
import com.azure.resourcemanager.compute.generated.models.GalleryArtifactVersionFullSource;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersion;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersionPublishingProfile;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersionStorageProfile;
import com.azure.resourcemanager.compute.generated.models.StorageAccountType;
import com.azure.resourcemanager.compute.generated.models.TargetRegion;
import java.util.Arrays;

/** Samples for GalleryImageVersions Update. */
public final class GalleryImageVersionsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Update.json
     */
    /**
     * Sample code: Update a simple Gallery Image Version (Managed Image as source).
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateASimpleGalleryImageVersionManagedImageAsSource(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        GalleryImageVersion resource =
            manager
                .galleryImageVersions()
                .getWithResponse(
                    "myResourceGroup",
                    "myGalleryName",
                    "myGalleryImageName",
                    "1.0.0",
                    null,
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withPublishingProfile(
                new GalleryImageVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion().withName("West US").withRegionalReplicaCount(1),
                                new TargetRegion()
                                    .withName("East US")
                                    .withRegionalReplicaCount(2)
                                    .withStorageAccountType(StorageAccountType.STANDARD_ZRS))))
            .withStorageProfile(
                new GalleryImageVersionStorageProfile()
                    .withSource(
                        new GalleryArtifactVersionFullSource()
                            .withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/images/{imageName}")))
            .apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImageVersion_Update_WithoutSourceId.json
     */
    /**
     * Sample code: Update a simple Gallery Image Version without source id.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateASimpleGalleryImageVersionWithoutSourceId(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        GalleryImageVersion resource =
            manager
                .galleryImageVersions()
                .getWithResponse(
                    "myResourceGroup",
                    "myGalleryName",
                    "myGalleryImageName",
                    "1.0.0",
                    null,
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withPublishingProfile(
                new GalleryImageVersionPublishingProfile()
                    .withTargetRegions(
                        Arrays
                            .asList(
                                new TargetRegion().withName("West US").withRegionalReplicaCount(1),
                                new TargetRegion()
                                    .withName("East US")
                                    .withRegionalReplicaCount(2)
                                    .withStorageAccountType(StorageAccountType.STANDARD_ZRS))))
            .withStorageProfile(new GalleryImageVersionStorageProfile())
            .apply();
    }
}
```

### GalleryImages_CreateOrUpdate

```java
import com.azure.resourcemanager.compute.generated.models.GalleryImageIdentifier;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;

/** Samples for GalleryImages CreateOrUpdate. */
public final class GalleryImagesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImage_Create.json
     */
    /**
     * Sample code: Create or update a simple gallery image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateASimpleGalleryImage(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImages()
            .define("myGalleryImageName")
            .withRegion("West US")
            .withExistingGallery("myResourceGroup", "myGalleryName")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withOsState(OperatingSystemStateTypes.GENERALIZED)
            .withHyperVGeneration(HyperVGeneration.V1)
            .withIdentifier(
                new GalleryImageIdentifier()
                    .withPublisher("myPublisherName")
                    .withOffer("myOfferName")
                    .withSku("mySkuName"))
            .create();
    }
}
```

### GalleryImages_Delete

```java
/** Samples for GalleryImages Delete. */
public final class GalleryImagesDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImage_Delete.json
     */
    /**
     * Sample code: Delete a gallery image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void deleteAGalleryImage(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImages()
            .delete("myResourceGroup", "myGalleryName", "myGalleryImageName", com.azure.core.util.Context.NONE);
    }
}
```

### GalleryImages_Get

```java
/** Samples for GalleryImages Get. */
public final class GalleryImagesGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImage_Get.json
     */
    /**
     * Sample code: Get a gallery image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getAGalleryImage(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .galleryImages()
            .getWithResponse(
                "myResourceGroup", "myGalleryName", "myGalleryImageName", com.azure.core.util.Context.NONE);
    }
}
```

### GalleryImages_ListByGallery

```java
/** Samples for GalleryImages ListByGallery. */
public final class GalleryImagesListByGallerySamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImage_ListByGallery.json
     */
    /**
     * Sample code: List gallery images in a gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listGalleryImagesInAGallery(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.galleryImages().listByGallery("myResourceGroup", "myGalleryName", com.azure.core.util.Context.NONE);
    }
}
```

### GalleryImages_Update

```java
import com.azure.resourcemanager.compute.generated.models.GalleryImage;
import com.azure.resourcemanager.compute.generated.models.GalleryImageIdentifier;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;

/** Samples for GalleryImages Update. */
public final class GalleryImagesUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/GalleryImage_Update.json
     */
    /**
     * Sample code: Update a simple gallery image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void updateASimpleGalleryImage(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        GalleryImage resource =
            manager
                .galleryImages()
                .getWithResponse(
                    "myResourceGroup", "myGalleryName", "myGalleryImageName", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withOsState(OperatingSystemStateTypes.GENERALIZED)
            .withHyperVGeneration(HyperVGeneration.V1)
            .withIdentifier(
                new GalleryImageIdentifier()
                    .withPublisher("myPublisherName")
                    .withOffer("myOfferName")
                    .withSku("mySkuName"))
            .apply();
    }
}
```

### GallerySharingProfile_Update

```java
import com.azure.resourcemanager.compute.generated.fluent.models.SharingUpdateInner;
import com.azure.resourcemanager.compute.generated.models.SharingProfileGroup;
import com.azure.resourcemanager.compute.generated.models.SharingProfileGroupTypes;
import com.azure.resourcemanager.compute.generated.models.SharingUpdateOperationTypes;
import java.util.Arrays;

/** Samples for GallerySharingProfile Update. */
public final class GallerySharingProfileUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/Gallery_EnableCommunityGallery.json
     */
    /**
     * Sample code: share a gallery to community.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void shareAGalleryToCommunity(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .gallerySharingProfiles()
            .update(
                "myResourceGroup",
                "myGalleryName",
                new SharingUpdateInner().withOperationType(SharingUpdateOperationTypes.ENABLE_COMMUNITY),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/Gallery_ResetSharingProfile.json
     */
    /**
     * Sample code: reset sharing profile of a gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void resetSharingProfileOfAGallery(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .gallerySharingProfiles()
            .update(
                "myResourceGroup",
                "myGalleryName",
                new SharingUpdateInner().withOperationType(SharingUpdateOperationTypes.RESET),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/galleryExamples/Gallery_AddToSharingProfile.json
     */
    /**
     * Sample code: Add sharing id to the sharing profile of a gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void addSharingIdToTheSharingProfileOfAGallery(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .gallerySharingProfiles()
            .update(
                "myResourceGroup",
                "myGalleryName",
                new SharingUpdateInner()
                    .withOperationType(SharingUpdateOperationTypes.ADD)
                    .withGroups(
                        Arrays
                            .asList(
                                new SharingProfileGroup()
                                    .withType(SharingProfileGroupTypes.SUBSCRIPTIONS)
                                    .withIds(
                                        Arrays
                                            .asList(
                                                "34a4ab42-0d72-47d9-bd1a-aed207386dac",
                                                "380fd389-260b-41aa-bad9-0a83108c370b")),
                                new SharingProfileGroup()
                                    .withType(SharingProfileGroupTypes.AADTENANTS)
                                    .withIds(Arrays.asList("c24c76aa-8897-4027-9b03-8f7928b54ff6")))),
                com.azure.core.util.Context.NONE);
    }
}
```

### SharedGalleries_Get

```java
/** Samples for SharedGalleries Get. */
public final class SharedGalleriesGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/sharedGalleryExamples/SharedGallery_Get.json
     */
    /**
     * Sample code: Get a shared gallery.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getASharedGallery(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sharedGalleries().getWithResponse("myLocation", "galleryUniqueName", com.azure.core.util.Context.NONE);
    }
}
```

### SharedGalleries_List

```java
/** Samples for SharedGalleries List. */
public final class SharedGalleriesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/sharedGalleryExamples/SharedGallery_List.json
     */
    /**
     * Sample code: List shared galleries.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listSharedGalleries(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sharedGalleries().list("myLocation", null, com.azure.core.util.Context.NONE);
    }
}
```

### SharedGalleryImageVersions_Get

```java
/** Samples for SharedGalleryImageVersions Get. */
public final class SharedGalleryImageVersionsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/sharedGalleryExamples/SharedGalleryImageVersion_Get.json
     */
    /**
     * Sample code: Get a shared gallery image version.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getASharedGalleryImageVersion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .sharedGalleryImageVersions()
            .getWithResponse(
                "myLocation",
                "galleryUniqueName",
                "myGalleryImageName",
                "myGalleryImageVersionName",
                com.azure.core.util.Context.NONE);
    }
}
```

### SharedGalleryImageVersions_List

```java
/** Samples for SharedGalleryImageVersions List. */
public final class SharedGalleryImageVersionsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/sharedGalleryExamples/SharedGalleryImageVersions_List.json
     */
    /**
     * Sample code: List shared gallery image versions.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listSharedGalleryImageVersions(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .sharedGalleryImageVersions()
            .list("myLocation", "galleryUniqueName", "myGalleryImageName", null, com.azure.core.util.Context.NONE);
    }
}
```

### SharedGalleryImages_Get

```java
/** Samples for SharedGalleryImages Get. */
public final class SharedGalleryImagesGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/sharedGalleryExamples/SharedGalleryImage_Get.json
     */
    /**
     * Sample code: Get a shared gallery image.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getASharedGalleryImage(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .sharedGalleryImages()
            .getWithResponse("myLocation", "galleryUniqueName", "myGalleryImageName", com.azure.core.util.Context.NONE);
    }
}
```

### SharedGalleryImages_List

```java
/** Samples for SharedGalleryImages List. */
public final class SharedGalleryImagesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-08-03/examples/sharedGalleryExamples/SharedGalleryImages_List.json
     */
    /**
     * Sample code: List shared gallery images.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void listSharedGalleryImages(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sharedGalleryImages().list("myLocation", "galleryUniqueName", null, com.azure.core.util.Context.NONE);
    }
}
```

