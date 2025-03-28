// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for AzureAvsVmSuitabilityExplanation.
 */
public final class AzureAvsVmSuitabilityExplanation extends ExpandableStringEnum<AzureAvsVmSuitabilityExplanation> {
    /**
     * Static value Unknown for AzureAvsVmSuitabilityExplanation.
     */
    public static final AzureAvsVmSuitabilityExplanation UNKNOWN = fromString("Unknown");

    /**
     * Static value NotApplicable for AzureAvsVmSuitabilityExplanation.
     */
    public static final AzureAvsVmSuitabilityExplanation NOT_APPLICABLE = fromString("NotApplicable");

    /**
     * Static value IpV6NotSupported for AzureAvsVmSuitabilityExplanation.
     */
    public static final AzureAvsVmSuitabilityExplanation IP_V6NOT_SUPPORTED = fromString("IpV6NotSupported");

    /**
     * Static value UnsupportedOperatingSystem for AzureAvsVmSuitabilityExplanation.
     */
    public static final AzureAvsVmSuitabilityExplanation UNSUPPORTED_OPERATING_SYSTEM
        = fromString("UnsupportedOperatingSystem");

    /**
     * Creates a new instance of AzureAvsVmSuitabilityExplanation value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureAvsVmSuitabilityExplanation() {
    }

    /**
     * Creates or finds a AzureAvsVmSuitabilityExplanation from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AzureAvsVmSuitabilityExplanation.
     */
    public static AzureAvsVmSuitabilityExplanation fromString(String name) {
        return fromString(name, AzureAvsVmSuitabilityExplanation.class);
    }

    /**
     * Gets known AzureAvsVmSuitabilityExplanation values.
     * 
     * @return known AzureAvsVmSuitabilityExplanation values.
     */
    public static Collection<AzureAvsVmSuitabilityExplanation> values() {
        return values(AzureAvsVmSuitabilityExplanation.class);
    }
}
