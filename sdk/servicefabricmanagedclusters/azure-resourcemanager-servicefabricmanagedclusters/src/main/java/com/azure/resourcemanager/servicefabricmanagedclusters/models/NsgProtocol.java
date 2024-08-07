// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Network protocol this rule applies to.
 */
public final class NsgProtocol extends ExpandableStringEnum<NsgProtocol> {
    /**
     * Static value http for NsgProtocol.
     */
    public static final NsgProtocol HTTP = fromString("http");

    /**
     * Static value https for NsgProtocol.
     */
    public static final NsgProtocol HTTPS = fromString("https");

    /**
     * Static value tcp for NsgProtocol.
     */
    public static final NsgProtocol TCP = fromString("tcp");

    /**
     * Static value udp for NsgProtocol.
     */
    public static final NsgProtocol UDP = fromString("udp");

    /**
     * Static value icmp for NsgProtocol.
     */
    public static final NsgProtocol ICMP = fromString("icmp");

    /**
     * Static value ah for NsgProtocol.
     */
    public static final NsgProtocol AH = fromString("ah");

    /**
     * Static value esp for NsgProtocol.
     */
    public static final NsgProtocol ESP = fromString("esp");

    /**
     * Creates a new instance of NsgProtocol value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NsgProtocol() {
    }

    /**
     * Creates or finds a NsgProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NsgProtocol.
     */
    public static NsgProtocol fromString(String name) {
        return fromString(name, NsgProtocol.class);
    }

    /**
     * Gets known NsgProtocol values.
     * 
     * @return known NsgProtocol values.
     */
    public static Collection<NsgProtocol> values() {
        return values(NsgProtocol.class);
    }
}
