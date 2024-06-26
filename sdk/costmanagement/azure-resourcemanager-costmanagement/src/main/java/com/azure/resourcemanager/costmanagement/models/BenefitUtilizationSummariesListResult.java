// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.costmanagement.fluent.models.BenefitUtilizationSummaryInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of benefit utilization summaries. */
@Immutable
public final class BenefitUtilizationSummariesListResult {
    /*
     * The list of benefit utilization summaries.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<BenefitUtilizationSummaryInner> value;

    /*
     * The link (URL) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of BenefitUtilizationSummariesListResult class. */
    public BenefitUtilizationSummariesListResult() {
    }

    /**
     * Get the value property: The list of benefit utilization summaries.
     *
     * @return the value value.
     */
    public List<BenefitUtilizationSummaryInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link (URL) to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
