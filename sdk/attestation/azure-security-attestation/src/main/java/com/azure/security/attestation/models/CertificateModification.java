// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The result of the operation.
 */
public final class CertificateModification extends ExpandableStringEnum<CertificateModification> {
    /**
     * After the operation was performed, the certificate is in the set of certificates.
     */
    @Generated
    public static final CertificateModification IS_PRESENT = fromString("IsPresent");

    /**
     * After the operation was performed, the certificate is no longer present in the set of certificates.
     */
    @Generated
    public static final CertificateModification IS_ABSENT = fromString("IsAbsent");

    /**
     * Creates a new instance of CertificateModification value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public CertificateModification() {
    }

    /**
     * Creates or finds a CertificateModification from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CertificateModification.
     */
    @Generated
    public static CertificateModification fromString(String name) {
        return fromString(name, CertificateModification.class);
    }

    /**
     * Gets known CertificateModification values.
     * 
     * @return known CertificateModification values.
     */
    @Generated
    public static Collection<CertificateModification> values() {
        return values(CertificateModification.class);
    }
}
