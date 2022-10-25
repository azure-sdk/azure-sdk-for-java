# Code snippets and samples


## AlertConfigurations

- [Get](#alertconfigurations_get)
- [ListForScope](#alertconfigurations_listforscope)
- [Update](#alertconfigurations_update)

## AlertDefinitions

- [Get](#alertdefinitions_get)
- [ListForScope](#alertdefinitions_listforscope)

## AlertIncidents

- [Get](#alertincidents_get)
- [ListForScope](#alertincidents_listforscope)
- [Remediate](#alertincidents_remediate)

## AlertOperation

- [Get](#alertoperation_get)
- [ListForScope](#alertoperation_listforscope)

## Alerts

- [Get](#alerts_get)
- [ListForScope](#alerts_listforscope)
- [Refresh](#alerts_refresh)
- [RefreshAll](#alerts_refreshall)
- [Update](#alerts_update)
### AlertConfigurations_Get

```java
import com.azure.core.util.Context;

/** Samples for AlertConfigurations Get. */
public final class AlertConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/GetAlertConfigurationById.json
     */
    /**
     * Sample code: GetAlertConfigurationById.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAlertConfigurationById(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .alertConfigurations()
            .getWithResponse(
                "subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f", "TooManyOwnersAssignedToResource", Context.NONE);
    }
}
```

### AlertConfigurations_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for AlertConfigurations ListForScope. */
public final class AlertConfigurationsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/GetAlertConfigurations.json
     */
    /**
     * Sample code: GetAlertConfigurations.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAlertConfigurations(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.alertConfigurations().listForScope("subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f", Context.NONE);
    }
}
```

### AlertConfigurations_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.AlertConfigurationInner;
import com.azure.resourcemanager.authorization.generated.models.TooManyOwnersAssignedToResourceAlertConfigurationProperties;

/** Samples for AlertConfigurations Update. */
public final class AlertConfigurationsUpdateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/UpdateAlertConfiguration.json
     */
    /**
     * Sample code: UpdateAlertConfiguration.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void updateAlertConfiguration(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .alertConfigurations()
            .updateWithResponse(
                "subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f",
                "TooManyOwnersAssignedToResource",
                new AlertConfigurationInner()
                    .withProperties(
                        new TooManyOwnersAssignedToResourceAlertConfigurationProperties()
                            .withIsEnabled(true)
                            .withThresholdNumberOfOwners(2)),
                Context.NONE);
    }
}
```

### AlertDefinitions_Get

```java
import com.azure.core.util.Context;

/** Samples for AlertDefinitions Get. */
public final class AlertDefinitionsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/GetAlertDefinitionById.json
     */
    /**
     * Sample code: GetAlertDefinitionById.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAlertDefinitionById(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .alertDefinitions()
            .getWithResponse(
                "subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f",
                "TooManyPermanentOwnersAssignedToResource",
                Context.NONE);
    }
}
```

### AlertDefinitions_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for AlertDefinitions ListForScope. */
public final class AlertDefinitionsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/GetAlertDefinitions.json
     */
    /**
     * Sample code: GetAlertDefinitions.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAlertDefinitions(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.alertDefinitions().listForScope("subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f", Context.NONE);
    }
}
```

### AlertIncidents_Get

```java
import com.azure.core.util.Context;

/** Samples for AlertIncidents Get. */
public final class AlertIncidentsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/GetAlertIncidentById.json
     */
    /**
     * Sample code: GetAlertIncidentById.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAlertIncidentById(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .alertIncidents()
            .getWithResponse(
                "subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f",
                "TooManyOwnersAssignedToResource",
                "5cf9ee65-d22e-4784-8b17-3de1c3b7bdcc",
                Context.NONE);
    }
}
```

### AlertIncidents_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for AlertIncidents ListForScope. */
public final class AlertIncidentsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/GetAlertIncidents.json
     */
    /**
     * Sample code: GetAlertIncidents.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAlertIncidents(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .alertIncidents()
            .listForScope(
                "subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f", "TooManyOwnersAssignedToResource", Context.NONE);
    }
}
```

### AlertIncidents_Remediate

```java
import com.azure.core.util.Context;

/** Samples for AlertIncidents Remediate. */
public final class AlertIncidentsRemediateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/RemediateAlertIncident.json
     */
    /**
     * Sample code: RemediateAlertIncident.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void remediateAlertIncident(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .alertIncidents()
            .remediateWithResponse(
                "subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f",
                "DuplicateRoleCreated",
                "0645231d-16ba-4ebf-851a-0875df4052bd",
                Context.NONE);
    }
}
```

### AlertOperation_Get

```java
import com.azure.core.util.Context;

/** Samples for AlertOperation Get. */
public final class AlertOperationGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/GetAlertOperationById.json
     */
    /**
     * Sample code: GetAlertOperation.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAlertOperation(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .alertOperations()
            .getWithResponse("subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f", "{operationId}", Context.NONE);
    }
}
```

### AlertOperation_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for AlertOperation ListForScope. */
public final class AlertOperationListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/GetAlertOperations.json
     */
    /**
     * Sample code: GetAlertOperations.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAlertOperations(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .alertOperations()
            .listForScopeWithResponse("subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f", Context.NONE);
    }
}
```

### Alerts_Get

```java
import com.azure.core.util.Context;

/** Samples for Alerts Get. */
public final class AlertsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/GetAlertById.json
     */
    /**
     * Sample code: GetAlertById.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAlertById(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .alerts()
            .getWithResponse(
                "subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f", "TooManyOwnersAssignedToResource", Context.NONE);
    }
}
```

### Alerts_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for Alerts ListForScope. */
public final class AlertsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/GetAlerts.json
     */
    /**
     * Sample code: GetAlerts.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAlerts(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.alerts().listForScope("subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f", Context.NONE);
    }
}
```

### Alerts_Refresh

```java
import com.azure.core.util.Context;

/** Samples for Alerts Refresh. */
public final class AlertsRefreshSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/RefreshAlert.json
     */
    /**
     * Sample code: RefreshAlert.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void refreshAlert(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .alerts()
            .refresh(
                "subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f",
                "AzureRolesAssignedOutsidePimAlert",
                Context.NONE);
    }
}
```

### Alerts_RefreshAll

```java
import com.azure.core.util.Context;

/** Samples for Alerts RefreshAll. */
public final class AlertsRefreshAllSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/RefreshAllAlerts.json
     */
    /**
     * Sample code: RefreshAllAlerts.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void refreshAllAlerts(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.alerts().refreshAll("subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f", Context.NONE);
    }
}
```

### Alerts_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.AlertInner;

/** Samples for Alerts Update. */
public final class AlertsUpdateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-01-07/examples/UpdateAlert.json
     */
    /**
     * Sample code: DeactivateAlert.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void deactivateAlert(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .alerts()
            .updateWithResponse(
                "subscriptions/afa2a084-766f-4003-8ae1-c4aeb893a99f",
                "TooManyPermanentOwnersAssignedToResource",
                new AlertInner().withIsActive(false),
                Context.NONE);
    }
}
```

