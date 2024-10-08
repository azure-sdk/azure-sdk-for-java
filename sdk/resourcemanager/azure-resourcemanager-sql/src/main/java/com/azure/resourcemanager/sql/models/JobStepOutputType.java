// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The output destination type.
 */
public final class JobStepOutputType extends ExpandableStringEnum<JobStepOutputType> {
    /**
     * Static value SqlDatabase for JobStepOutputType.
     */
    public static final JobStepOutputType SQL_DATABASE = fromString("SqlDatabase");

    /**
     * Creates a new instance of JobStepOutputType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public JobStepOutputType() {
    }

    /**
     * Creates or finds a JobStepOutputType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding JobStepOutputType.
     */
    public static JobStepOutputType fromString(String name) {
        return fromString(name, JobStepOutputType.class);
    }

    /**
     * Gets known JobStepOutputType values.
     * 
     * @return known JobStepOutputType values.
     */
    public static Collection<JobStepOutputType> values() {
        return values(JobStepOutputType.class);
    }
}
