// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Buildpack Binding Type.
 */
public final class BindingType extends ExpandableStringEnum<BindingType> {
    /**
     * Static value ApplicationInsights for BindingType.
     */
    public static final BindingType APPLICATION_INSIGHTS = fromString("ApplicationInsights");

    /**
     * Static value ApacheSkyWalking for BindingType.
     */
    public static final BindingType APACHE_SKY_WALKING = fromString("ApacheSkyWalking");

    /**
     * Static value AppDynamics for BindingType.
     */
    public static final BindingType APP_DYNAMICS = fromString("AppDynamics");

    /**
     * Static value Dynatrace for BindingType.
     */
    public static final BindingType DYNATRACE = fromString("Dynatrace");

    /**
     * Static value NewRelic for BindingType.
     */
    public static final BindingType NEW_RELIC = fromString("NewRelic");

    /**
     * Static value ElasticAPM for BindingType.
     */
    public static final BindingType ELASTIC_APM = fromString("ElasticAPM");

    /**
     * Creates a new instance of BindingType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BindingType() {
    }

    /**
     * Creates or finds a BindingType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BindingType.
     */
    public static BindingType fromString(String name) {
        return fromString(name, BindingType.class);
    }

    /**
     * Gets known BindingType values.
     * 
     * @return known BindingType values.
     */
    public static Collection<BindingType> values() {
        return values(BindingType.class);
    }
}
