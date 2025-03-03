// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.keys.cryptography.models;

import com.azure.core.util.ExpandableStringEnum;

import java.util.Collection;

/**
 * Defines values for KeyWrapAlgorithm.
 */
public final class KeyWrapAlgorithm extends ExpandableStringEnum<KeyWrapAlgorithm> {

    /**
     * Static value RSA-OAEP for KeyWrapAlgorithm.
     */
    public static final KeyWrapAlgorithm RSA_OAEP = fromString("RSA-OAEP");

    /**
     * Static value RSA-OAEP-256 for KeyWrapAlgorithm.
     */
    public static final KeyWrapAlgorithm RSA_OAEP_256 = fromString("RSA-OAEP-256");

    /**
     * Static value RSA1_5 for KeyWrapAlgorithm.
     */
    public static final KeyWrapAlgorithm RSA1_5 = fromString("RSA1_5");

    /**
     * Static value A192KW for KeyWrapAlgorithm.
     */
    public static final KeyWrapAlgorithm A192KW = fromString("A192KW");

    /**
     * Static value A128KW for KeyWrapAlgorithm.
     */
    public static final KeyWrapAlgorithm A128KW = fromString("A128KW");

    /**
     * Static value Unwrap Key for KeyWrapAlgorithm.
     */
    public static final KeyWrapAlgorithm A256KW = fromString("A256KW");

    /**
     * Creates a new instance of {@link KeyWrapAlgorithm} without a {@link #toString()} value.
     * <p>
     * This constructor shouldn't be called as it will produce a {@link KeyWrapAlgorithm} which doesn't
     * have a String enum value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public KeyWrapAlgorithm() {
    }

    /**
     * Creates or finds a KeyWrapAlgorithm from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KeyWrapAlgorithm.
     */
    public static KeyWrapAlgorithm fromString(String name) {
        return fromString(name, KeyWrapAlgorithm.class);
    }

    /**
     * Gets known KeyWrapAlgorithm values.
     *
     * @return known KeyWrapAlgorithm values.
     */
    public static Collection<KeyWrapAlgorithm> values() {
        return values(KeyWrapAlgorithm.class);
    }
}
