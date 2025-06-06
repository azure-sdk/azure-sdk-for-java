// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Result of testing route.
 */
public final class TestResultStatus extends ExpandableStringEnum<TestResultStatus> {
    /**
     * Static value undefined for TestResultStatus.
     */
    public static final TestResultStatus UNDEFINED = fromString("undefined");

    /**
     * Static value false for TestResultStatus.
     */
    public static final TestResultStatus FALSE = fromString("false");

    /**
     * Static value true for TestResultStatus.
     */
    public static final TestResultStatus TRUE = fromString("true");

    /**
     * Creates a new instance of TestResultStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TestResultStatus() {
    }

    /**
     * Creates or finds a TestResultStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TestResultStatus.
     */
    public static TestResultStatus fromString(String name) {
        return fromString(name, TestResultStatus.class);
    }

    /**
     * Gets known TestResultStatus values.
     * 
     * @return known TestResultStatus values.
     */
    public static Collection<TestResultStatus> values() {
        return values(TestResultStatus.class);
    }
}
