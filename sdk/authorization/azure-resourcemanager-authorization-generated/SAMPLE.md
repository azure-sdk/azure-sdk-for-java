# Code snippets and samples


## AccessReviewInstanceMyDecisions

- [GetById](#accessreviewinstancemydecisions_getbyid)
- [List](#accessreviewinstancemydecisions_list)
- [Patch](#accessreviewinstancemydecisions_patch)

## AccessReviewInstanceOperation

- [AcceptRecommendations](#accessreviewinstanceoperation_acceptrecommendations)

## AccessReviewInstancesAssignedForMyApproval

- [GetById](#accessreviewinstancesassignedformyapproval_getbyid)
- [List](#accessreviewinstancesassignedformyapproval_list)

## AccessReviewScheduleDefinitionsAssignedForMyApproval

- [List](#accessreviewscheduledefinitionsassignedformyapproval_list)

## ScopeAccessReviewDefaultSettings

- [Get](#scopeaccessreviewdefaultsettings_get)
- [Put](#scopeaccessreviewdefaultsettings_put)

## ScopeAccessReviewHistoryDefinitionInstance

- [GenerateDownloadUri](#scopeaccessreviewhistorydefinitioninstance_generatedownloaduri)

## ScopeAccessReviewHistoryDefinitionInstancesOperation

- [List](#scopeaccessreviewhistorydefinitioninstancesoperation_list)

## ScopeAccessReviewHistoryDefinitionOperation

- [Create](#scopeaccessreviewhistorydefinitionoperation_create)
- [DeleteById](#scopeaccessreviewhistorydefinitionoperation_deletebyid)

## ScopeAccessReviewHistoryDefinitions

- [GetById](#scopeaccessreviewhistorydefinitions_getbyid)
- [List](#scopeaccessreviewhistorydefinitions_list)

## ScopeAccessReviewInstanceContactedReviewers

- [List](#scopeaccessreviewinstancecontactedreviewers_list)

## ScopeAccessReviewInstanceDecisions

- [List](#scopeaccessreviewinstancedecisions_list)

## ScopeAccessReviewInstanceOperation

- [ApplyDecisions](#scopeaccessreviewinstanceoperation_applydecisions)
- [RecordAllDecisions](#scopeaccessreviewinstanceoperation_recordalldecisions)
- [ResetDecisions](#scopeaccessreviewinstanceoperation_resetdecisions)
- [SendReminders](#scopeaccessreviewinstanceoperation_sendreminders)
- [Stop](#scopeaccessreviewinstanceoperation_stop)

## ScopeAccessReviewInstances

- [Create](#scopeaccessreviewinstances_create)
- [GetById](#scopeaccessreviewinstances_getbyid)
- [List](#scopeaccessreviewinstances_list)

## ScopeAccessReviewScheduleDefinitions

- [CreateOrUpdateById](#scopeaccessreviewscheduledefinitions_createorupdatebyid)
- [DeleteById](#scopeaccessreviewscheduledefinitions_deletebyid)
- [GetById](#scopeaccessreviewscheduledefinitions_getbyid)
- [List](#scopeaccessreviewscheduledefinitions_list)
- [Stop](#scopeaccessreviewscheduledefinitions_stop)

## TenantLevelAccessReviewInstanceContactedReviewers

- [List](#tenantlevelaccessreviewinstancecontactedreviewers_list)
### AccessReviewInstanceMyDecisions_GetById

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewInstanceMyDecisions GetById. */
public final class AccessReviewInstanceMyDecisionsGetByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewInstanceMyDecisionById.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviews(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstanceMyDecisions()
            .getByIdWithResponse(
                "488a6d0e-0a63-4946-86e3-1f5bbc934661",
                "4135f961-be78-4005-8101-c72a5af307a2",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                Context.NONE);
    }
}
```

### AccessReviewInstanceMyDecisions_List

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewInstanceMyDecisions List. */
public final class AccessReviewInstanceMyDecisionsListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewInstanceMyDecisions.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviews(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstanceMyDecisions()
            .list("488a6d0e-0a63-4946-86e3-1f5bbc934661", "4135f961-be78-4005-8101-c72a5af307a2", null, Context.NONE);
    }
}
```

### AccessReviewInstanceMyDecisions_Patch

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewDecisionProperties;

/** Samples for AccessReviewInstanceMyDecisions Patch. */
public final class AccessReviewInstanceMyDecisionsPatchSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/PatchAccessReviewInstanceMyDecisionById.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviews(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstanceMyDecisions()
            .patchWithResponse(
                "488a6d0e-0a63-4946-86e3-1f5bbc934661",
                "4135f961-be78-4005-8101-c72a5af307a2",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                new AccessReviewDecisionProperties(),
                Context.NONE);
    }
}
```

### AccessReviewInstanceOperation_AcceptRecommendations

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewInstanceOperation AcceptRecommendations. */
public final class AccessReviewInstanceOperationAcceptRecommendationsSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/AccessReviewInstanceAcceptRecommendations.json
     */
    /**
     * Sample code: GetAccessReview.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReview(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstanceOperations()
            .acceptRecommendationsWithResponse(
                "488a6d0e-0a63-4946-86e3-1f5bbc934661", "d9b9e056-7004-470b-bf21-1635e98487da", Context.NONE);
    }
}
```

### AccessReviewInstancesAssignedForMyApproval_GetById

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewInstancesAssignedForMyApproval GetById. */
public final class AccessReviewInstancesAssignedForMyApprovalGetByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewInstanceAssignedForMyApproval.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviews(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstancesAssignedForMyApprovals()
            .getByIdWithResponse(
                "488a6d0e-0a63-4946-86e3-1f5bbc934661", "4135f961-be78-4005-8101-c72a5af307a2", Context.NONE);
    }
}
```

### AccessReviewInstancesAssignedForMyApproval_List

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewInstancesAssignedForMyApproval List. */
public final class AccessReviewInstancesAssignedForMyApprovalListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewInstancesAssignedForMyApproval.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviews(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstancesAssignedForMyApprovals()
            .list("488a6d0e-0a63-4946-86e3-1f5bbc934661", "assignedToMeToReview()", Context.NONE);
    }
}
```

### AccessReviewScheduleDefinitionsAssignedForMyApproval_List

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewScheduleDefinitionsAssignedForMyApproval List. */
public final class AccessReviewScheduleDefinitionsAssignedForMyApprovalListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewScheduleDefinitionsAssignedForMyApproval.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviews(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.accessReviewScheduleDefinitionsAssignedForMyApprovals().list("assignedToMeToReview()", Context.NONE);
    }
}
```

### ScopeAccessReviewDefaultSettings_Get

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewDefaultSettings Get. */
public final class ScopeAccessReviewDefaultSettingsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewDefaultSettings.json
     */
    /**
     * Sample code: GetAccessReviewDefaultSettings.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewDefaultSettings(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewDefaultSettings()
            .getWithResponse("subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d", Context.NONE);
    }
}
```

### ScopeAccessReviewDefaultSettings_Put

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewScheduleSettings;

/** Samples for ScopeAccessReviewDefaultSettings Put. */
public final class ScopeAccessReviewDefaultSettingsPutSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/PutAccessReviewDefaultSettings.json
     */
    /**
     * Sample code: GetAccessReviewDefaultSettings.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewDefaultSettings(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewDefaultSettings()
            .putWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d", new AccessReviewScheduleSettings(), Context.NONE);
    }
}
```

### ScopeAccessReviewHistoryDefinitionInstance_GenerateDownloadUri

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewHistoryDefinitionInstance GenerateDownloadUri. */
public final class ScopeAccessReviewHistoryDefinitionInstanceGenerateDownloadUriSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/PostAccessReviewHistoryDefinitionInstance.json
     */
    /**
     * Sample code: PostAccessReviewHistoryDefinitionInstance.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void postAccessReviewHistoryDefinitionInstance(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewHistoryDefinitionInstances()
            .generateDownloadUriWithResponse(
                "subscriptions/129a304b-4aea-4b86-a9f7-ba7e2b23737a",
                "44724910-d7a5-4c29-b28f-db73e717165a",
                "9038f4f3-3d8d-43c3-8ede-669ea082c43b",
                Context.NONE);
    }
}
```

### ScopeAccessReviewHistoryDefinitionInstancesOperation_List

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewHistoryDefinitionInstancesOperation List. */
public final class ScopeAccessReviewHistoryDefinitionInstancesOperationListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewHistoryDefinitionInstances.json
     */
    /**
     * Sample code: GetAccessReviewHistoryDefinitionInstances.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewHistoryDefinitionInstances(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewHistoryDefinitionInstancesOperations()
            .list(
                "subscriptions/129a304b-4aea-4b86-a9f7-ba7e2b23737a",
                "44724910-d7a5-4c29-b28f-db73e717165a",
                Context.NONE);
    }
}
```

### ScopeAccessReviewHistoryDefinitionOperation_Create

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewHistoryDefinitionProperties;

/** Samples for ScopeAccessReviewHistoryDefinitionOperation Create. */
public final class ScopeAccessReviewHistoryDefinitionOperationCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/PutAccessReviewHistoryDefinition.json
     */
    /**
     * Sample code: PutAccessReviewHistoryDefinition.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void putAccessReviewHistoryDefinition(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewHistoryDefinitionOperations()
            .createWithResponse(
                "subscriptions/129a304b-4aea-4b86-a9f7-ba7e2b23737a",
                "44724910-d7a5-4c29-b28f-db73e717165a",
                new AccessReviewHistoryDefinitionProperties(),
                Context.NONE);
    }
}
```

### ScopeAccessReviewHistoryDefinitionOperation_DeleteById

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewHistoryDefinitionOperation DeleteById. */
public final class ScopeAccessReviewHistoryDefinitionOperationDeleteByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/DeleteAccessReviewHistoryDefinition.json
     */
    /**
     * Sample code: DeleteAccessReview.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void deleteAccessReview(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewHistoryDefinitionOperations()
            .deleteByIdWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                Context.NONE);
    }
}
```

### ScopeAccessReviewHistoryDefinitions_GetById

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewHistoryDefinitions GetById. */
public final class ScopeAccessReviewHistoryDefinitionsGetByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewHistoryDefinition.json
     */
    /**
     * Sample code: GetAccessReviewHistoryDefinition.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewHistoryDefinition(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewHistoryDefinitions()
            .getByIdWithResponse(
                "subscriptions/129a304b-4aea-4b86-a9f7-ba7e2b23737a",
                "44724910-d7a5-4c29-b28f-db73e717165a",
                Context.NONE);
    }
}
```

### ScopeAccessReviewHistoryDefinitions_List

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewHistoryDefinitions List. */
public final class ScopeAccessReviewHistoryDefinitionsListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewHistoryDefinitions.json
     */
    /**
     * Sample code: GetAccessReviewHistoryDefinitions.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewHistoryDefinitions(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewHistoryDefinitions()
            .list("subscriptions/129a304b-4aea-4b86-a9f7-ba7e2b23737a", null, Context.NONE);
    }
}
```

### ScopeAccessReviewInstanceContactedReviewers_List

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewInstanceContactedReviewers List. */
public final class ScopeAccessReviewInstanceContactedReviewersListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewInstanceContactedReviewers.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviews(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewInstanceContactedReviewers()
            .list(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "265785a7-a81f-4201-8a18-bb0db95982b7",
                "f25ed880-9c31-4101-bc57-825d8df3b58c",
                Context.NONE);
    }
}
```

### ScopeAccessReviewInstanceDecisions_List

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewInstanceDecisions List. */
public final class ScopeAccessReviewInstanceDecisionsListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewInstanceDecisions.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviews(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewInstanceDecisions()
            .list(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "265785a7-a81f-4201-8a18-bb0db95982b7",
                "f25ed880-9c31-4101-bc57-825d8df3b58c",
                null,
                Context.NONE);
    }
}
```

### ScopeAccessReviewInstanceOperation_ApplyDecisions

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewInstanceOperation ApplyDecisions. */
public final class ScopeAccessReviewInstanceOperationApplyDecisionsSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/AccessReviewInstanceApplyDecisions.json
     */
    /**
     * Sample code: GetAccessReview.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReview(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewInstanceOperations()
            .applyDecisionsWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "d9b9e056-7004-470b-bf21-1635e98487da",
                Context.NONE);
    }
}
```

### ScopeAccessReviewInstanceOperation_RecordAllDecisions

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.models.RecordAllDecisionsProperties;

/** Samples for ScopeAccessReviewInstanceOperation RecordAllDecisions. */
public final class ScopeAccessReviewInstanceOperationRecordAllDecisionsSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/AccessReviewInstanceRecordAllDecisions.json
     */
    /**
     * Sample code: AccessReviewInstanceRecordAllDecisions.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void accessReviewInstanceRecordAllDecisions(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewInstanceOperations()
            .recordAllDecisionsWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "d9b9e056-7004-470b-bf21-1635e98487da",
                new RecordAllDecisionsProperties(),
                Context.NONE);
    }
}
```

### ScopeAccessReviewInstanceOperation_ResetDecisions

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewInstanceOperation ResetDecisions. */
public final class ScopeAccessReviewInstanceOperationResetDecisionsSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/AccessReviewInstanceResetDecisions.json
     */
    /**
     * Sample code: GetAccessReview.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReview(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewInstanceOperations()
            .resetDecisionsWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "d9b9e056-7004-470b-bf21-1635e98487da",
                Context.NONE);
    }
}
```

### ScopeAccessReviewInstanceOperation_SendReminders

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewInstanceOperation SendReminders. */
public final class ScopeAccessReviewInstanceOperationSendRemindersSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/AccessReviewInstanceSendReminders.json
     */
    /**
     * Sample code: GetAccessReview.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReview(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewInstanceOperations()
            .sendRemindersWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "d9b9e056-7004-470b-bf21-1635e98487da",
                Context.NONE);
    }
}
```

### ScopeAccessReviewInstanceOperation_Stop

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewInstanceOperation Stop. */
public final class ScopeAccessReviewInstanceOperationStopSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/StopAccessReviewInstance.json
     */
    /**
     * Sample code: GetAccessReview.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReview(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewInstanceOperations()
            .stopWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "d9b9e056-7004-470b-bf21-1635e98487da",
                Context.NONE);
    }
}
```

### ScopeAccessReviewInstances_Create

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewInstanceProperties;

/** Samples for ScopeAccessReviewInstances Create. */
public final class ScopeAccessReviewInstancesCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/PutAccessReviewInstance.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviews(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewInstances()
            .createWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "4135f961-be78-4005-8101-c72a5af307a2",
                new AccessReviewInstanceProperties(),
                Context.NONE);
    }
}
```

### ScopeAccessReviewInstances_GetById

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewInstances GetById. */
public final class ScopeAccessReviewInstancesGetByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewInstance.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviews(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewInstances()
            .getByIdWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "4135f961-be78-4005-8101-c72a5af307a2",
                Context.NONE);
    }
}
```

### ScopeAccessReviewInstances_List

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewInstances List. */
public final class ScopeAccessReviewInstancesListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewInstances.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviews(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewInstances()
            .list(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "265785a7-a81f-4201-8a18-bb0db95982b7",
                null,
                Context.NONE);
    }
}
```

### ScopeAccessReviewScheduleDefinitions_CreateOrUpdateById

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewScheduleDefinitionProperties;

/** Samples for ScopeAccessReviewScheduleDefinitions CreateOrUpdateById. */
public final class ScopeAccessReviewScheduleDefinitionsCreateOrUpdateByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/PutAccessReviewScheduleDefinition.json
     */
    /**
     * Sample code: PutAccessReview.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void putAccessReview(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewScheduleDefinitions()
            .createOrUpdateByIdWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                new AccessReviewScheduleDefinitionProperties(),
                Context.NONE);
    }
}
```

### ScopeAccessReviewScheduleDefinitions_DeleteById

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewScheduleDefinitions DeleteById. */
public final class ScopeAccessReviewScheduleDefinitionsDeleteByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/DeleteAccessReviewScheduleDefinition.json
     */
    /**
     * Sample code: DeleteAccessReview.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void deleteAccessReview(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewScheduleDefinitions()
            .deleteByIdWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                Context.NONE);
    }
}
```

### ScopeAccessReviewScheduleDefinitions_GetById

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewScheduleDefinitions GetById. */
public final class ScopeAccessReviewScheduleDefinitionsGetByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewScheduleDefinition.json
     */
    /**
     * Sample code: GetAccessReview.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReview(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewScheduleDefinitions()
            .getByIdWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                Context.NONE);
    }
}
```

### ScopeAccessReviewScheduleDefinitions_List

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewScheduleDefinitions List. */
public final class ScopeAccessReviewScheduleDefinitionsListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewScheduleDefinitions.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviews(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewScheduleDefinitions()
            .list("subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d", null, Context.NONE);
    }
}
```

### ScopeAccessReviewScheduleDefinitions_Stop

```java
import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewScheduleDefinitions Stop. */
public final class ScopeAccessReviewScheduleDefinitionsStopSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/StopAccessReviewScheduleDefinition.json
     */
    /**
     * Sample code: GetAccessReview.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReview(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewScheduleDefinitions()
            .stopWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                Context.NONE);
    }
}
```

### TenantLevelAccessReviewInstanceContactedReviewers_List

```java
import com.azure.core.util.Context;

/** Samples for TenantLevelAccessReviewInstanceContactedReviewers List. */
public final class TenantLevelAccessReviewInstanceContactedReviewersListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/TenantLevelGetAccessReviewInstanceContactedReviewers.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviews(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .tenantLevelAccessReviewInstanceContactedReviewers()
            .list("265785a7-a81f-4201-8a18-bb0db95982b7", "f25ed880-9c31-4101-bc57-825d8df3b58c", Context.NONE);
    }
}
```

