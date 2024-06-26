// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates the category status.
 */
public final class CategoryStatus extends ExpandableStringEnum<CategoryStatus> {
    /**
     * Static value Passed for CategoryStatus.
     */
    public static final CategoryStatus PASSED = fromString("Passed");

    /**
     * Static value Failed for CategoryStatus.
     */
    public static final CategoryStatus FAILED = fromString("Failed");

    /**
     * Static value NotApplicable for CategoryStatus.
     */
    public static final CategoryStatus NOT_APPLICABLE = fromString("NotApplicable");

    /**
     * Static value PendingApproval for CategoryStatus.
     */
    public static final CategoryStatus PENDING_APPROVAL = fromString("PendingApproval");

    /**
     * Creates a new instance of CategoryStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CategoryStatus() {
    }

    /**
     * Creates or finds a CategoryStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CategoryStatus.
     */
    public static CategoryStatus fromString(String name) {
        return fromString(name, CategoryStatus.class);
    }

    /**
     * Gets known CategoryStatus values.
     * 
     * @return known CategoryStatus values.
     */
    public static Collection<CategoryStatus> values() {
        return values(CategoryStatus.class);
    }
}
