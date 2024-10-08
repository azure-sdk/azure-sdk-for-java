// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for AlertsSummaryGroupByFields.
 */
public final class AlertsSummaryGroupByFields extends ExpandableStringEnum<AlertsSummaryGroupByFields> {
    /**
     * Static value severity for AlertsSummaryGroupByFields.
     */
    public static final AlertsSummaryGroupByFields SEVERITY = fromString("severity");

    /**
     * Static value alertState for AlertsSummaryGroupByFields.
     */
    public static final AlertsSummaryGroupByFields ALERT_STATE = fromString("alertState");

    /**
     * Static value monitorCondition for AlertsSummaryGroupByFields.
     */
    public static final AlertsSummaryGroupByFields MONITOR_CONDITION = fromString("monitorCondition");

    /**
     * Static value monitorService for AlertsSummaryGroupByFields.
     */
    public static final AlertsSummaryGroupByFields MONITOR_SERVICE = fromString("monitorService");

    /**
     * Static value signalType for AlertsSummaryGroupByFields.
     */
    public static final AlertsSummaryGroupByFields SIGNAL_TYPE = fromString("signalType");

    /**
     * Static value alertRule for AlertsSummaryGroupByFields.
     */
    public static final AlertsSummaryGroupByFields ALERT_RULE = fromString("alertRule");

    /**
     * Creates a new instance of AlertsSummaryGroupByFields value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AlertsSummaryGroupByFields() {
    }

    /**
     * Creates or finds a AlertsSummaryGroupByFields from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AlertsSummaryGroupByFields.
     */
    public static AlertsSummaryGroupByFields fromString(String name) {
        return fromString(name, AlertsSummaryGroupByFields.class);
    }

    /**
     * Gets known AlertsSummaryGroupByFields values.
     * 
     * @return known AlertsSummaryGroupByFields values.
     */
    public static Collection<AlertsSummaryGroupByFields> values() {
        return values(AlertsSummaryGroupByFields.class);
    }
}
