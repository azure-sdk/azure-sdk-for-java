// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.cloudhealth.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Signal operator.
 */
public final class SignalOperator extends ExpandableStringEnum<SignalOperator> {
    /**
     * Lower than.
     */
    public static final SignalOperator LOWER_THAN = fromString("LowerThan");

    /**
     * Lower than or equal to.
     */
    public static final SignalOperator LOWER_OR_EQUALS = fromString("LowerOrEquals");

    /**
     * Greater than.
     */
    public static final SignalOperator GREATER_THAN = fromString("GreaterThan");

    /**
     * Greater than or equal to.
     */
    public static final SignalOperator GREATER_OR_EQUALS = fromString("GreaterOrEquals");

    /**
     * Equal to.
     */
    public static final SignalOperator EQUALS = fromString("Equals");

    /**
     * Creates a new instance of SignalOperator value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SignalOperator() {
    }

    /**
     * Creates or finds a SignalOperator from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SignalOperator.
     */
    public static SignalOperator fromString(String name) {
        return fromString(name, SignalOperator.class);
    }

    /**
     * Gets known SignalOperator values.
     * 
     * @return known SignalOperator values.
     */
    public static Collection<SignalOperator> values() {
        return values(SignalOperator.class);
    }
}
