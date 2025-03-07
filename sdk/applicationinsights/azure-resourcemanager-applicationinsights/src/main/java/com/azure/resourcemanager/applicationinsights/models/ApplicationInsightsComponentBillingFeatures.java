// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentBillingFeaturesInner;
import java.util.List;

/**
 * An immutable client-side representation of ApplicationInsightsComponentBillingFeatures.
 */
public interface ApplicationInsightsComponentBillingFeatures {
    /**
     * Gets the dataVolumeCap property: An Application Insights component daily data volume cap.
     * 
     * @return the dataVolumeCap value.
     */
    ApplicationInsightsComponentDataVolumeCap dataVolumeCap();

    /**
     * Gets the currentBillingFeatures property: Current enabled pricing plan. When the component is in the Enterprise
     * plan, this will list both 'Basic' and 'Application Insights Enterprise'.
     * 
     * @return the currentBillingFeatures value.
     */
    List<String> currentBillingFeatures();

    /**
     * Gets the inner
     * com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentBillingFeaturesInner
     * object.
     * 
     * @return the inner object.
     */
    ApplicationInsightsComponentBillingFeaturesInner innerModel();
}
