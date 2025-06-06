// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.security.keyvault.keys.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * JsonWebKey Key Type (kty), as defined in https://tools.ietf.org/html/draft-ietf-jose-json-web-algorithms-40.
 */
public final class KeyType extends ExpandableStringEnum<KeyType> {
    /**
     * Elliptic Curve.
     */
    @Generated
    public static final KeyType EC = fromString("EC");

    /**
     * Elliptic Curve with a private key which is stored in the HSM.
     */
    @Generated
    public static final KeyType EC_HSM = fromString("EC-HSM");

    /**
     * RSA (https://tools.ietf.org/html/rfc3447).
     */
    @Generated
    public static final KeyType RSA = fromString("RSA");

    /**
     * RSA with a private key which is stored in the HSM.
     */
    @Generated
    public static final KeyType RSA_HSM = fromString("RSA-HSM");

    /**
     * Octet sequence (used to represent symmetric keys).
     */
    @Generated
    public static final KeyType OCT = fromString("oct");

    /**
     * Octet sequence (used to represent symmetric keys) which is stored the HSM.
     */
    @Generated
    public static final KeyType OCT_HSM = fromString("oct-HSM");

    /**
     * Creates a new instance of KeyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public KeyType() {
    }

    /**
     * Creates or finds a KeyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding KeyType.
     */
    @Generated
    public static KeyType fromString(String name) {
        return fromString(name, KeyType.class);
    }

    /**
     * Gets known KeyType values.
     * 
     * @return known KeyType values.
     */
    @Generated
    public static Collection<KeyType> values() {
        return values(KeyType.class);
    }
}
