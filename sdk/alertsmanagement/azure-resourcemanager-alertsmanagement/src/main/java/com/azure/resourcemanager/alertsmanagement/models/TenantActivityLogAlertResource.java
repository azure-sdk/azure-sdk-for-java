// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.resourcemanager.alertsmanagement.fluent.models.TenantActivityLogAlertResourceInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of TenantActivityLogAlertResource.
 */
public interface TenantActivityLogAlertResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the tenantScope property: The tenant GUID. Must be provided for tenant-level and management group events
     * rules.
     * 
     * @return the tenantScope value.
     */
    String tenantScope();

    /**
     * Gets the scopes property: A list of resource IDs that will be used as prefixes. The alert will only apply to
     * Activity Log events with resource IDs that fall under one of these prefixes. This list must include at least one
     * item.
     * 
     * @return the scopes value.
     */
    List<String> scopes();

    /**
     * Gets the condition property: The condition that will cause this alert to activate.
     * 
     * @return the condition value.
     */
    AlertRuleAllOfCondition condition();

    /**
     * Gets the actions property: The actions that will activate when the condition is met.
     * 
     * @return the actions value.
     */
    ActionList actions();

    /**
     * Gets the enabled property: Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert
     * rule is not enabled, then none of its actions will be activated.
     * 
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the description property: A description of this Activity Log Alert rule.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the inner com.azure.resourcemanager.alertsmanagement.fluent.models.TenantActivityLogAlertResourceInner
     * object.
     * 
     * @return the inner object.
     */
    TenantActivityLogAlertResourceInner innerModel();
}
