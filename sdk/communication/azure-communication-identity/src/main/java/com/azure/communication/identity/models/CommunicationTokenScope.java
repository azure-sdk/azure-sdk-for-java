// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.identity.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * List of scopes for an access token.
 */
public final class CommunicationTokenScope extends ExpandableStringEnum<CommunicationTokenScope> {
    /**
     * Use this for full access to Chat APIs.
     */
    @Generated
    public static final CommunicationTokenScope CHAT = fromString("chat");

    /**
     * Use this for full access to Calling APIs.
     */
    @Generated
    public static final CommunicationTokenScope VOIP = fromString("voip");

    /**
     * Access to Chat APIs but without the authorization to create, delete or update chat threads.
     */
    @Generated
    public static final CommunicationTokenScope CHAT_JOIN = fromString("chat.join");

    /**
     * A more limited version of chat.join that doesn't allow to add or remove participants. Use this scope when the
     * token bearer is not fully trusted, for example in guest scenarios.
     */
    @Generated
    public static final CommunicationTokenScope CHAT_JOIN_LIMITED = fromString("chat.join.limited");

    /**
     * Access to Calling APIs but without the authorization to start new calls.
     */
    @Generated
    public static final CommunicationTokenScope VOIP_JOIN = fromString("voip.join");

    /**
     * Creates a new instance of CommunicationTokenScope value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public CommunicationTokenScope() {
    }

    /**
     * Creates or finds a CommunicationTokenScope from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CommunicationTokenScope.
     */
    @Generated
    public static CommunicationTokenScope fromString(String name) {
        return fromString(name, CommunicationTokenScope.class);
    }

    /**
     * Gets known CommunicationTokenScope values.
     * 
     * @return known CommunicationTokenScope values.
     */
    @Generated
    public static Collection<CommunicationTokenScope> values() {
        return values(CommunicationTokenScope.class);
    }
}
