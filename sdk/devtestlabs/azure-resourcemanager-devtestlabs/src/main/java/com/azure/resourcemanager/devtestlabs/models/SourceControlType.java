// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The artifact source's type.
 */
public final class SourceControlType extends ExpandableStringEnum<SourceControlType> {
    /**
     * Static value VsoGit for SourceControlType.
     */
    public static final SourceControlType VSO_GIT = fromString("VsoGit");

    /**
     * Static value GitHub for SourceControlType.
     */
    public static final SourceControlType GIT_HUB = fromString("GitHub");

    /**
     * Static value StorageAccount for SourceControlType.
     */
    public static final SourceControlType STORAGE_ACCOUNT = fromString("StorageAccount");

    /**
     * Creates a new instance of SourceControlType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SourceControlType() {
    }

    /**
     * Creates or finds a SourceControlType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SourceControlType.
     */
    public static SourceControlType fromString(String name) {
        return fromString(name, SourceControlType.class);
    }

    /**
     * Gets known SourceControlType values.
     * 
     * @return known SourceControlType values.
     */
    public static Collection<SourceControlType> values() {
        return values(SourceControlType.class);
    }
}
