# Code snippets and samples


## AccessReviewDefaultSettingsOperation

- [Get](#accessreviewdefaultsettingsoperation_get)
- [Put](#accessreviewdefaultsettingsoperation_put)

## AccessReviewInstance

- [AcceptRecommendations](#accessreviewinstance_acceptrecommendations)
- [ApplyDecisions](#accessreviewinstance_applydecisions)
- [ResetDecisions](#accessreviewinstance_resetdecisions)
- [SendReminders](#accessreviewinstance_sendreminders)
- [Stop](#accessreviewinstance_stop)

## AccessReviewInstanceContactedReviewers

- [List](#accessreviewinstancecontactedreviewers_list)

## AccessReviewInstanceMyDecisions

- [GetById](#accessreviewinstancemydecisions_getbyid)
- [List](#accessreviewinstancemydecisions_list)
- [Patch](#accessreviewinstancemydecisions_patch)

## AccessReviewScheduleDefinitions

- [Stop](#accessreviewscheduledefinitions_stop)

## TenantLevelAccessReviewInstanceContactedReviewers

- [List](#tenantlevelaccessreviewinstancecontactedreviewers_list)
### AccessReviewDefaultSettingsOperation_Get

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewDefaultSettingsOperation Get. */
public final class AccessReviewDefaultSettingsOperationGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/GetAccessReviewDefaultSettings.json
     */
    /**
     * Sample code: GetAccessReviewDefaultSettings.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewDefaultSettings(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.accessReviewDefaultSettingsOperations().getWithResponse(Context.NONE);
    }
}
```

### AccessReviewDefaultSettingsOperation_Put

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.AccessReviewScheduleSettings;

/** Samples for AccessReviewDefaultSettingsOperation Put. */
public final class AccessReviewDefaultSettingsOperationPutSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/PutAccessReviewDefaultSettings.json
     */
    /**
     * Sample code: PutAccessReviewDefaultSettings.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void putAccessReviewDefaultSettings(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewDefaultSettingsOperations()
            .putWithResponse(new AccessReviewScheduleSettings(), Context.NONE);
    }
}
```

### AccessReviewInstance_AcceptRecommendations

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewInstance AcceptRecommendations. */
public final class AccessReviewInstanceAcceptRecommendationsSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/AccessReviewInstanceAcceptRecommendations.json
     */
    /**
     * Sample code: AccessReviewInstanceAcceptRecommmendations.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void accessReviewInstanceAcceptRecommmendations(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstances()
            .acceptRecommendationsWithResponse(
                "488a6d0e-0a63-4946-86e3-1f5bbc934661", "d9b9e056-7004-470b-bf21-1635e98487da", Context.NONE);
    }
}
```

### AccessReviewInstance_ApplyDecisions

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewInstance ApplyDecisions. */
public final class AccessReviewInstanceApplyDecisionsSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/AccessReviewInstanceApplyDecisions.json
     */
    /**
     * Sample code: AccessReviewInstanceApplyDecisions.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void accessReviewInstanceApplyDecisions(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstances()
            .applyDecisionsWithResponse(
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d", "d9b9e056-7004-470b-bf21-1635e98487da", Context.NONE);
    }
}
```

### AccessReviewInstance_ResetDecisions

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewInstance ResetDecisions. */
public final class AccessReviewInstanceResetDecisionsSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/AccessReviewInstanceResetDecisions.json
     */
    /**
     * Sample code: AccessReviewInstanceResetDecisions.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void accessReviewInstanceResetDecisions(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstances()
            .resetDecisionsWithResponse(
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d", "d9b9e056-7004-470b-bf21-1635e98487da", Context.NONE);
    }
}
```

### AccessReviewInstance_SendReminders

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewInstance SendReminders. */
public final class AccessReviewInstanceSendRemindersSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/AccessReviewInstanceSendReminders.json
     */
    /**
     * Sample code: AccessReviewInstanceSendReminders.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void accessReviewInstanceSendReminders(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstances()
            .sendRemindersWithResponse(
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d", "d9b9e056-7004-470b-bf21-1635e98487da", Context.NONE);
    }
}
```

### AccessReviewInstance_Stop

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewInstance Stop. */
public final class AccessReviewInstanceStopSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/StopAccessReviewInstance.json
     */
    /**
     * Sample code: AccessReviewInstanceStop.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void accessReviewInstanceStop(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstances()
            .stopWithResponse(
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d", "d9b9e056-7004-470b-bf21-1635e98487da", Context.NONE);
    }
}
```

### AccessReviewInstanceContactedReviewers_List

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewInstanceContactedReviewers List. */
public final class AccessReviewInstanceContactedReviewersListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/GetAccessReviewInstanceContactedReviewers.json
     */
    /**
     * Sample code: GetAccessReviewInstanceContactedReviewers.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewInstanceContactedReviewers(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstanceContactedReviewers()
            .list("265785a7-a81f-4201-8a18-bb0db95982b7", "f25ed880-9c31-4101-bc57-825d8df3b58c", Context.NONE);
    }
}
```

### AccessReviewInstanceMyDecisions_GetById

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewInstanceMyDecisions GetById. */
public final class AccessReviewInstanceMyDecisionsGetByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/GetAccessReviewInstanceMyDecisionById.json
     */
    /**
     * Sample code: GetAccessReviewMyInstanceDecision.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewMyInstanceDecision(
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
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/GetAccessReviewInstanceMyDecisions.json
     */
    /**
     * Sample code: GetAccessReviewMyInstanceDecisions.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewMyInstanceDecisions(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstanceMyDecisions()
            .list("488a6d0e-0a63-4946-86e3-1f5bbc934661", null, null, Context.NONE);
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
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/PatchAccessReviewInstanceMyDecisionById.json
     */
    /**
     * Sample code: PatchAccessReviewMyInstanceDecision.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void patchAccessReviewMyInstanceDecision(
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

### AccessReviewScheduleDefinitions_Stop

```java
import com.azure.core.util.Context;

/** Samples for AccessReviewScheduleDefinitions Stop. */
public final class AccessReviewScheduleDefinitionsStopSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/StopAccessReviewScheduleDefinition.json
     */
    /**
     * Sample code: AccessReviewScheduleDefinitionStop.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void accessReviewScheduleDefinitionStop(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewScheduleDefinitions()
            .stopWithResponse("fa73e90b-5bf1-45fd-a182-35ce5fc0674d", Context.NONE);
    }
}
```

### TenantLevelAccessReviewInstanceContactedReviewers_List

```java
import com.azure.core.util.Context;

/** Samples for TenantLevelAccessReviewInstanceContactedReviewers List. */
public final class TenantLevelAccessReviewInstanceContactedReviewersListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/TenantLevelGetAccessReviewInstanceContactedReviewers.json
     */
    /**
     * Sample code: TenantLevelGetAccessReviewInstanceContactedReviewers.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void tenantLevelGetAccessReviewInstanceContactedReviewers(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .tenantLevelAccessReviewInstanceContactedReviewers()
            .list("265785a7-a81f-4201-8a18-bb0db95982b7", "f25ed880-9c31-4101-bc57-825d8df3b58c", Context.NONE);
    }
}
```

