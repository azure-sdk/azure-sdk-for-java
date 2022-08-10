# Code snippets and samples


## Application

- [Delete](#application_delete)
- [Get](#application_get)
- [List](#application_list)
- [Put](#application_put)

## ApplicationManager

- [Delete](#applicationmanager_delete)
- [GetByResourceGroup](#applicationmanager_getbyresourcegroup)
- [List](#applicationmanager_list)
- [ListAll](#applicationmanager_listall)
- [Put](#applicationmanager_put)
- [Update](#applicationmanager_update)

## ApplicationRegistration

- [SubscriptionLevelGet](#applicationregistration_subscriptionlevelget)
- [SubscriptionLevelList](#applicationregistration_subscriptionlevellist)
- [SubscriptionLevelPut](#applicationregistration_subscriptionlevelput)

## EventGridApplicationManagerFilter

- [Delete](#eventgridapplicationmanagerfilter_delete)
- [Get](#eventgridapplicationmanagerfilter_get)
- [List](#eventgridapplicationmanagerfilter_list)
- [Put](#eventgridapplicationmanagerfilter_put)

## EventGridWorkspaceFilter

- [Delete](#eventgridworkspacefilter_delete)
- [Get](#eventgridworkspacefilter_get)
- [List](#eventgridworkspacefilter_list)
- [Put](#eventgridworkspacefilter_put)

## Namespaces

- [CheckNameAvailability](#namespaces_checknameavailability)

## Operation

- [List](#operation_list)

## Share

- [Delete](#share_delete)
- [Get](#share_get)
- [List](#share_list)
- [Put](#share_put)
- [Update](#share_update)

## ShareInvite

- [List](#shareinvite_list)

## ShareSubscriptionsOperation

- [Accept](#sharesubscriptionsoperation_accept)
- [Get](#sharesubscriptionsoperation_get)
- [List](#sharesubscriptionsoperation_list)

## Workspace

- [Delete](#workspace_delete)
- [GetByResourceGroup](#workspace_getbyresourcegroup)
- [List](#workspace_list)
- [ListAll](#workspace_listall)
- [OperationStatus](#workspace_operationstatus)
- [Put](#workspace_put)
- [Update](#workspace_update)
### Application_Delete

```java
import com.azure.core.util.Context;

/** Samples for Application Delete. */
public final class ApplicationDeleteSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Application_Delete.json
     */
    /**
     * Sample code: Application Delete.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void applicationDelete(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.applications().deleteWithResponse("mygroup", "contosoWorkspace", "sampleapplication", Context.NONE);
    }
}
```

### Application_Get

```java
import com.azure.core.util.Context;

/** Samples for Application Get. */
public final class ApplicationGetSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Application_Get.json
     */
    /**
     * Sample code: Application Get.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void applicationGet(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.applications().getWithResponse("mygroup", "contosoWorkspace", "sampleapplication", Context.NONE);
    }
}
```

### Application_List

```java
import com.azure.core.util.Context;

/** Samples for Application List. */
public final class ApplicationListSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Application_List.json
     */
    /**
     * Sample code: Application List.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void applicationList(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.applications().list("mygroup", "contosoWorkspace", Context.NONE);
    }
}
```

### Application_Put

```java
import com.azure.resourcemanager.azurelogistics.models.AccessAssignment;
import com.azure.resourcemanager.azurelogistics.models.ApplicationProperties;
import com.azure.resourcemanager.azurelogistics.models.ApplicationResource;
import com.azure.resourcemanager.azurelogistics.models.ApplicationResourceShareProperties;
import com.azure.resourcemanager.azurelogistics.models.AttributeCondition;
import com.azure.resourcemanager.azurelogistics.models.AttributeMatchingScheme;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Application Put. */
public final class ApplicationPutSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Application_Put.json
     */
    /**
     * Sample code: Application Put.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void applicationPut(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .applications()
            .define("sampleapplication")
            .withExistingWorkspace("mygroup", "contosoWorkspace")
            .withProperties(
                new ApplicationProperties()
                    .withDisplayName("sample application name")
                    .withApplicationDefinitionId("oscp.manifest1")
                    .withParameters(mapOf("SampleInput1", "123", "SampleInput2", "XYZ"))
                    .withResources(
                        Arrays
                            .asList(
                                new ApplicationResource()
                                    .withType("shares")
                                    .withProperties(
                                        new ApplicationResourceShareProperties()
                                            .withAccessAssignments(
                                                Arrays
                                                    .asList(
                                                        new AccessAssignment()
                                                            .withActionIds(
                                                                Arrays
                                                                    .asList(
                                                                        "Microsoft.OpenLogisticsPlatform/workspaces/items/read"))
                                                            .withAttributeConditions(
                                                                Arrays
                                                                    .asList(
                                                                        new AttributeCondition()
                                                                            .withAttributeName(
                                                                                "Microsoft.OLP/workspaces/item/label")
                                                                            .withValues(
                                                                                Arrays
                                                                                    .asList(
                                                                                        "some_value1",
                                                                                        "some_value2",
                                                                                        "some_value3"))
                                                                            .withAttributeMatchingScheme(
                                                                                AttributeMatchingScheme
                                                                                    .ALLOFANY)))))))))
            .create();
    }

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

### ApplicationManager_Delete

```java
import com.azure.core.util.Context;

/** Samples for ApplicationManager Delete. */
public final class ApplicationManagerDeleteSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/ApplicationManager_Delete.json
     */
    /**
     * Sample code: applicationManager Delete.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void applicationManagerDelete(
        com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.applicationManagers().delete("mygroup", "contosoApplicationManager", Context.NONE);
    }
}
```

### ApplicationManager_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ApplicationManager GetByResourceGroup. */
public final class ApplicationManagerGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/ApplicationManager_Get.json
     */
    /**
     * Sample code: applicationManager Get.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void applicationManagerGet(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .applicationManagers()
            .getByResourceGroupWithResponse("mygroup", "contosoApplicationManager", Context.NONE);
    }
}
```

### ApplicationManager_List

```java
import com.azure.core.util.Context;

/** Samples for ApplicationManager List. */
public final class ApplicationManagerListSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/ApplicationManager_List.json
     */
    /**
     * Sample code: applicationManager List.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void applicationManagerList(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.applicationManagers().listWithResponse("mygroup", Context.NONE);
    }
}
```

### ApplicationManager_ListAll

```java
import com.azure.core.util.Context;

/** Samples for ApplicationManager ListAll. */
public final class ApplicationManagerListAllSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/ApplicationManager_ListAll.json
     */
    /**
     * Sample code: applicationManager ListAll.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void applicationManagerListAll(
        com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.applicationManagers().listAllWithResponse(Context.NONE);
    }
}
```

### ApplicationManager_Put

```java
import com.azure.resourcemanager.azurelogistics.models.ApplicationManagerProperties;

/** Samples for ApplicationManager Put. */
public final class ApplicationManagerPutSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/ApplicationManager_Put.json
     */
    /**
     * Sample code: applicationManager Put.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void applicationManagerPut(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .applicationManagers()
            .define("contosoApplicationManager")
            .withRegion("southeastasia")
            .withExistingResourceGroup("mygroup")
            .withProperties(new ApplicationManagerProperties())
            .create();
    }
}
```

### ApplicationManager_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurelogistics.models.ApplicationManager;
import java.util.HashMap;
import java.util.Map;

/** Samples for ApplicationManager Update. */
public final class ApplicationManagerUpdateSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/ApplicationManager_Update.json
     */
    /**
     * Sample code: applicationManager Update.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void applicationManagerUpdate(
        com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        ApplicationManager resource =
            manager
                .applicationManagers()
                .getByResourceGroupWithResponse("mygroup", "contosoApplicationManager", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key1", "tag-1", "key2", "tag-2")).apply();
    }

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

### ApplicationRegistration_SubscriptionLevelGet

```java
import com.azure.core.util.Context;

/** Samples for ApplicationRegistration SubscriptionLevelGet. */
public final class ApplicationRegistrationSubscriptionLevelGetSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/ApplicationRegistration_Get_SubscriptionLevel.json
     */
    /**
     * Sample code: ApplicationRegistration Get.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void applicationRegistrationGet(
        com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .applicationRegistrations()
            .subscriptionLevelGetWithResponse(
                "contosoResourceGroupName",
                "contosoApplicationManager",
                "db8c7461-a382-4ac8-b61e-2118dda25fce",
                Context.NONE);
    }
}
```

### ApplicationRegistration_SubscriptionLevelList

```java
import com.azure.core.util.Context;

/** Samples for ApplicationRegistration SubscriptionLevelList. */
public final class ApplicationRegistrationSubscriptionLevelListSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/ApplicationRegistration_List_SubscriptionLevel.json
     */
    /**
     * Sample code: ApplicationRegistration Get.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void applicationRegistrationGet(
        com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .applicationRegistrations()
            .subscriptionLevelList(
                "contosoResourceGroupName", "contosoApplicationManager", "sampleapplication1", Context.NONE);
    }
}
```

### ApplicationRegistration_SubscriptionLevelPut

```java
import com.azure.resourcemanager.azurelogistics.models.ApplicationRegistrationProperties;
import com.azure.resourcemanager.azurelogistics.models.ApplicationRegistrationResource;
import com.azure.resourcemanager.azurelogistics.models.ApplicationRegistrationResourceShareProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ApplicationRegistration SubscriptionLevelPut. */
public final class ApplicationRegistrationSubscriptionLevelPutSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/ApplicationRegistration_Put_SubscriptionLevel.json
     */
    /**
     * Sample code: ApplicationRegistration Put.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void applicationRegistrationPut(
        com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .applicationRegistrations()
            .define("db8c7461-a382-4ac8-b61e-2118dda25fce")
            .withExistingApplicationManager("contosoResourceGroupName", "contosoApplicationManager")
            .withProperties(
                new ApplicationRegistrationProperties()
                    .withDisplayName("sample application registration name")
                    .withApplicationDefinitionId("sampleapplication1")
                    .withParameters(mapOf("SampleInput1", "1235"))
                    .withResources(
                        Arrays
                            .asList(
                                new ApplicationRegistrationResource()
                                    .withType("shares")
                                    .withProperties(
                                        new ApplicationRegistrationResourceShareProperties()
                                            .withShareId(
                                                "74d5d449-70d6-4f1f-aa67-cfa5620fe31c_ab76a32e-43d8-4797-b138-171385c783a2"))))
                    .withSourceWorkspaceId("b123196f-8a17-4445-a7a0-74001573115a")
                    .withStatus("Active"))
            .create();
    }

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

### EventGridApplicationManagerFilter_Delete

```java
import com.azure.core.util.Context;

/** Samples for EventGridApplicationManagerFilter Delete. */
public final class EventGridApplicationManagerFilterDeleteSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/EventGridApplicationManagerFilter_Delete.json
     */
    /**
     * Sample code: EventGridFilter Delete.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void eventGridFilterDelete(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .eventGridApplicationManagerFilters()
            .deleteWithResponse("mygroup", "contosoApplicationManager", "EventGridFilterSample", Context.NONE);
    }
}
```

### EventGridApplicationManagerFilter_Get

```java
import com.azure.core.util.Context;

/** Samples for EventGridApplicationManagerFilter Get. */
public final class EventGridApplicationManagerFilterGetSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/EventGridApplicationManagerFilter_Get.json
     */
    /**
     * Sample code: EventGridFilter Get.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void eventGridFilterGet(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .eventGridApplicationManagerFilters()
            .getWithResponse("mygroup", "contosoApplicationManager", "Filter1", Context.NONE);
    }
}
```

### EventGridApplicationManagerFilter_List

```java
import com.azure.core.util.Context;

/** Samples for EventGridApplicationManagerFilter List. */
public final class EventGridApplicationManagerFilterListSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/EventGridApplicationManagerFilter_List.json
     */
    /**
     * Sample code: EventGridFilter List.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void eventGridFilterList(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.eventGridApplicationManagerFilters().list("UserRP-test", "contosoApplicationManager", Context.NONE);
    }
}
```

### EventGridApplicationManagerFilter_Put

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurelogistics.fluent.models.EventGridFilterInner;
import com.azure.resourcemanager.azurelogistics.models.EventGridFilterProperties;
import com.azure.resourcemanager.azurelogistics.models.Filter;
import java.util.Arrays;

/** Samples for EventGridApplicationManagerFilter Put. */
public final class EventGridApplicationManagerFilterPutSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/EventGridApplicationManagerFilter_Put.json
     */
    /**
     * Sample code: EventGridFilter Put.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void eventGridFilterPut(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .eventGridApplicationManagerFilters()
            .putWithResponse(
                "mygroup",
                "contosoApplicationManager",
                "_default",
                new EventGridFilterInner()
                    .withProperties(
                        new EventGridFilterProperties()
                            .withFilter(
                                new Filter()
                                    .withSubjectBeginsWith("subjectBeginsWith")
                                    .withSubjectEndsWith("subjectEndsWith")
                                    .withIncludedEventTypes(
                                        Arrays
                                            .asList(
                                                "Microsoft.OpenLogisticsPlatform.EventName1",
                                                "Microsoft.OpenLogisticsPlatform.EventName2")))),
                Context.NONE);
    }
}
```

### EventGridWorkspaceFilter_Delete

```java
import com.azure.core.util.Context;

/** Samples for EventGridWorkspaceFilter Delete. */
public final class EventGridWorkspaceFilterDeleteSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/EventGridWorkspaceFilter_Delete.json
     */
    /**
     * Sample code: EventGridFilter Delete.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void eventGridFilterDelete(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .eventGridWorkspaceFilters()
            .deleteWithResponse("mygroup", "contosoWorkspace", "EventGridFilterSample", Context.NONE);
    }
}
```

### EventGridWorkspaceFilter_Get

```java
import com.azure.core.util.Context;

/** Samples for EventGridWorkspaceFilter Get. */
public final class EventGridWorkspaceFilterGetSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/EventGridWorkspaceFilter_Get.json
     */
    /**
     * Sample code: EventGridFilter Get.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void eventGridFilterGet(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.eventGridWorkspaceFilters().getWithResponse("mygroup", "contosoWorkspace", "Filter1", Context.NONE);
    }
}
```

### EventGridWorkspaceFilter_List

```java
import com.azure.core.util.Context;

/** Samples for EventGridWorkspaceFilter List. */
public final class EventGridWorkspaceFilterListSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/EventGridWorkspaceFilter_List.json
     */
    /**
     * Sample code: EventGridFilter List.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void eventGridFilterList(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.eventGridWorkspaceFilters().list("UserRP-test", "contosoworkspace", Context.NONE);
    }
}
```

### EventGridWorkspaceFilter_Put

```java
import com.azure.resourcemanager.azurelogistics.models.EventGridFilterProperties;
import com.azure.resourcemanager.azurelogistics.models.Filter;
import java.util.Arrays;

/** Samples for EventGridWorkspaceFilter Put. */
public final class EventGridWorkspaceFilterPutSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/EventGridWorkspaceFilter_Put.json
     */
    /**
     * Sample code: EventGridFilter Put.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void eventGridFilterPut(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .eventGridWorkspaceFilters()
            .define("_default")
            .withExistingWorkspace("mygroup", "contosoWorkspace")
            .withProperties(
                new EventGridFilterProperties()
                    .withFilter(
                        new Filter()
                            .withSubjectBeginsWith("subjectBeginsWith")
                            .withSubjectEndsWith("subjectEndsWith")
                            .withIncludedEventTypes(
                                Arrays
                                    .asList(
                                        "Microsoft.OpenLogisticsPlatform.EventName1",
                                        "Microsoft.OpenLogisticsPlatform.EventName2"))))
            .create();
    }
}
```

### Namespaces_CheckNameAvailability

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurelogistics.models.NameAvailabilityRequest;

/** Samples for Namespaces CheckNameAvailability. */
public final class NamespacesCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Namespaces_CheckNameAvailability.json
     */
    /**
     * Sample code: Check Name Availability.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void checkNameAvailability(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .namespaces()
            .checkNameAvailabilityWithResponse(
                new NameAvailabilityRequest()
                    .withName("contosoWorkspace1")
                    .withType("Microsoft.OpenLogisticsPlatform/workspaces"),
                Context.NONE);
    }
}
```

### Operation_List

```java
import com.azure.core.util.Context;

/** Samples for Operation List. */
public final class OperationListSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Operation_List.json
     */
    /**
     * Sample code: Operation List.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void operationList(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

### Share_Delete

```java
import com.azure.core.util.Context;

/** Samples for Share Delete. */
public final class ShareDeleteSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Share_Delete.json
     */
    /**
     * Sample code: Share_Delete.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void shareDelete(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.shares().deleteWithResponse("mygroup", "contosoWorkspace", "sampleshare", Context.NONE);
    }
}
```

### Share_Get

```java
import com.azure.core.util.Context;

/** Samples for Share Get. */
public final class ShareGetSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Share_Get.json
     */
    /**
     * Sample code: Share Get.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void shareGet(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.shares().getWithResponse("mygroup", "contosoWorkspace", "sampleshare", Context.NONE);
    }
}
```

### Share_List

```java
import com.azure.core.util.Context;

/** Samples for Share List. */
public final class ShareListSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Share_List.json
     */
    /**
     * Sample code: Share_List.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void shareList(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.shares().listWithResponse("UserRP-test", "contosoworkspace", Context.NONE);
    }
}
```

### Share_Put

```java
import com.azure.resourcemanager.azurelogistics.models.ShareProperties;

/** Samples for Share Put. */
public final class SharePutSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Share_Put.json
     */
    /**
     * Sample code: Share Put.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void sharePut(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .shares()
            .define("sampleshare")
            .withExistingWorkspace("mygroup", "contosoWorkspace")
            .withProperties(
                new ShareProperties()
                    .withTargetTenantId("f686d426-8d16-42db-81b7-ab578e110ccd")
                    .withDescription("testendtoendshare"))
            .create();
    }
}
```

### Share_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurelogistics.models.Share;
import com.azure.resourcemanager.azurelogistics.models.ShareProperties;

/** Samples for Share Update. */
public final class ShareUpdateSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Share_Update.json
     */
    /**
     * Sample code: Share Update.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void shareUpdate(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        Share resource =
            manager.shares().getWithResponse("mygroup", "contosoWorkspace", "sampleshare", Context.NONE).getValue();
        resource.update().withProperties(new ShareProperties().withDescription("testendtoendshare")).apply();
    }
}
```

### ShareInvite_List

```java
import com.azure.core.util.Context;

/** Samples for ShareInvite List. */
public final class ShareInviteListSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Share_Invites_List.json
     */
    /**
     * Sample code: Share_Invites_List.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void shareInvitesList(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.shareInvites().listWithResponse(Context.NONE);
    }
}
```

### ShareSubscriptionsOperation_Accept

```java
import com.azure.core.util.Context;

/** Samples for ShareSubscriptionsOperation Accept. */
public final class ShareSubscriptionsOperationAcceptSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/ShareSubscriptions_Redeem.json
     */
    /**
     * Sample code: ShareSubscriptions_List.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void shareSubscriptionsList(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .shareSubscriptionsOperations()
            .acceptWithResponse(
                "UserRP-test",
                "contosoworkspace-projected",
                "0ffc4d8c-2e6a-4f7d-a153-13f4222bbbbc_sampleshare",
                Context.NONE);
    }
}
```

### ShareSubscriptionsOperation_Get

```java
import com.azure.core.util.Context;

/** Samples for ShareSubscriptionsOperation Get. */
public final class ShareSubscriptionsOperationGetSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/ShareSubscriptions_Get.json
     */
    /**
     * Sample code: ShareSubscriptions_List.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void shareSubscriptionsList(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .shareSubscriptionsOperations()
            .getWithResponse(
                "UserRP-test",
                "contosoworkspace-projected",
                "0ffc4d8c-2e6a-4f7d-a153-13f4222bbbbc_sampleshare",
                Context.NONE);
    }
}
```

### ShareSubscriptionsOperation_List

```java
import com.azure.core.util.Context;

/** Samples for ShareSubscriptionsOperation List. */
public final class ShareSubscriptionsOperationListSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/ShareSubscriptions_List.json
     */
    /**
     * Sample code: ShareSubscriptions_List.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void shareSubscriptionsList(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .shareSubscriptionsOperations()
            .listWithResponse("UserRP-test", "contosoworkspace-projected", Context.NONE);
    }
}
```

### Workspace_Delete

```java
import com.azure.core.util.Context;

/** Samples for Workspace Delete. */
public final class WorkspaceDeleteSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Workspace_Delete.json
     */
    /**
     * Sample code: Workspace Delete.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void workspaceDelete(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.workspaces().delete("mygroup", "contosoWorkspace", Context.NONE);
    }
}
```

### Workspace_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Workspace GetByResourceGroup. */
public final class WorkspaceGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Workspace_Get.json
     */
    /**
     * Sample code: Workspace Get.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void workspaceGet(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.workspaces().getByResourceGroupWithResponse("mygroup", "contosoWorkspace", Context.NONE);
    }
}
```

### Workspace_List

```java
import com.azure.core.util.Context;

/** Samples for Workspace List. */
public final class WorkspaceListSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Workspace_List.json
     */
    /**
     * Sample code: Workspace List.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void workspaceList(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.workspaces().listWithResponse("mygroup", Context.NONE);
    }
}
```

### Workspace_ListAll

```java
import com.azure.core.util.Context;

/** Samples for Workspace ListAll. */
public final class WorkspaceListAllSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Workspace_ListAll.json
     */
    /**
     * Sample code: Workspace ListAll.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void workspaceListAll(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager.workspaces().listAllWithResponse(Context.NONE);
    }
}
```

### Workspace_OperationStatus

```java
import com.azure.core.util.Context;

/** Samples for Workspace OperationStatus. */
public final class WorkspaceOperationStatusSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Workspace_OperationStatus.json
     */
    /**
     * Sample code: Workspace Operation Status.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void workspaceOperationStatus(
        com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .workspaces()
            .operationStatusWithResponse("westus2", "db5f291f-284d-46e9-9152-d5c83f7c14b8", Context.NONE);
    }
}
```

### Workspace_Put

```java
import com.azure.resourcemanager.azurelogistics.models.WorkspaceProperties;

/** Samples for Workspace Put. */
public final class WorkspacePutSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Workspace_Put.json
     */
    /**
     * Sample code: Workspace Put.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void workspacePut(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        manager
            .workspaces()
            .define("contosoWorkspace")
            .withRegion("southeastasia")
            .withExistingResourceGroup("mygroup")
            .withProperties(new WorkspaceProperties())
            .create();
    }
}
```

### Workspace_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurelogistics.models.Workspace;
import java.util.HashMap;
import java.util.Map;

/** Samples for Workspace Update. */
public final class WorkspaceUpdateSamples {
    /*
     * x-ms-original-file: specification/azurelogistics/resource-manager/Microsoft.OpenLogisticsPlatform/stable/2022-08-01/examples/Workspace_Update.json
     */
    /**
     * Sample code: Workspace Update.
     *
     * @param manager Entry point to AzurelogisticsManager.
     */
    public static void workspaceUpdate(com.azure.resourcemanager.azurelogistics.AzurelogisticsManager manager) {
        Workspace resource =
            manager.workspaces().getByResourceGroupWithResponse("mygroup", "contosoWorkspace", Context.NONE).getValue();
        resource.update().withTags(mapOf("key1", "tag-1", "key2", "tag-2")).apply();
    }

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

