// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * A value to describe how the outbound dependencies of a HDInsight cluster are managed. 'Managed' means that the
 * outbound dependencies are managed by the HDInsight service. 'External' means that the outbound dependencies are
 * managed by a customer specific solution.
 */
public final class OutboundDependenciesManagedType extends ExpandableStringEnum<OutboundDependenciesManagedType> {
    /**
     * Static value Managed for OutboundDependenciesManagedType.
     */
    public static final OutboundDependenciesManagedType MANAGED = fromString("Managed");

    /**
     * Static value External for OutboundDependenciesManagedType.
     */
    public static final OutboundDependenciesManagedType EXTERNAL = fromString("External");

    /**
     * Creates a new instance of OutboundDependenciesManagedType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OutboundDependenciesManagedType() {
    }

    /**
     * Creates or finds a OutboundDependenciesManagedType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OutboundDependenciesManagedType.
     */
    public static OutboundDependenciesManagedType fromString(String name) {
        return fromString(name, OutboundDependenciesManagedType.class);
    }

    /**
     * Gets known OutboundDependenciesManagedType values.
     * 
     * @return known OutboundDependenciesManagedType values.
     */
    public static Collection<OutboundDependenciesManagedType> values() {
        return values(OutboundDependenciesManagedType.class);
    }
}
