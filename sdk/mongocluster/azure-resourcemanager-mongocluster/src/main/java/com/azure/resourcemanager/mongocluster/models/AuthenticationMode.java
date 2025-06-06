// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The authentication modes supporting on the Mongo cluster.
 */
public final class AuthenticationMode extends ExpandableStringEnum<AuthenticationMode> {
    /**
     * Native mongo authentication mode using username and password with auth mechanism 'SCRAM-SHA-256'.
     */
    public static final AuthenticationMode NATIVE_AUTH = fromString("NativeAuth");

    /**
     * Microsoft Entra ID authentication mode using Entra users assigned to the cluster and auth mechanism
     * 'MONGODB-OIDC'.
     */
    public static final AuthenticationMode MICROSOFT_ENTRA_ID = fromString("MicrosoftEntraID");

    /**
     * Creates a new instance of AuthenticationMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AuthenticationMode() {
    }

    /**
     * Creates or finds a AuthenticationMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AuthenticationMode.
     */
    public static AuthenticationMode fromString(String name) {
        return fromString(name, AuthenticationMode.class);
    }

    /**
     * Gets known AuthenticationMode values.
     * 
     * @return known AuthenticationMode values.
     */
    public static Collection<AuthenticationMode> values() {
        return values(AuthenticationMode.class);
    }
}
