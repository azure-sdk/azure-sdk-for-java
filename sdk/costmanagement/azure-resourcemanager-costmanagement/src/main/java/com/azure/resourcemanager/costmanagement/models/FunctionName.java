// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The name of the column to aggregate.
 */
public final class FunctionName extends ExpandableStringEnum<FunctionName> {
    /**
     * Static value PreTaxCostUSD for FunctionName.
     */
    public static final FunctionName PRE_TAX_COST_USD = fromString("PreTaxCostUSD");

    /**
     * Static value Cost for FunctionName.
     */
    public static final FunctionName COST = fromString("Cost");

    /**
     * Static value CostUSD for FunctionName.
     */
    public static final FunctionName COST_USD = fromString("CostUSD");

    /**
     * Static value PreTaxCost for FunctionName.
     */
    public static final FunctionName PRE_TAX_COST = fromString("PreTaxCost");

    /**
     * Creates a new instance of FunctionName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FunctionName() {
    }

    /**
     * Creates or finds a FunctionName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FunctionName.
     */
    public static FunctionName fromString(String name) {
        return fromString(name, FunctionName.class);
    }

    /**
     * Gets known FunctionName values.
     * 
     * @return known FunctionName values.
     */
    public static Collection<FunctionName> values() {
        return values(FunctionName.class);
    }
}
