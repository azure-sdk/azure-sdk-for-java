// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

/**
 * Describes whether the search service is compliant or not with respect to having non-customer-encrypted resources. If
 * a service has more than one non-customer-encrypted resource and 'Enforcement' is 'enabled' then the service will be
 * marked as 'nonCompliant'.
 */
public enum SearchEncryptionComplianceStatus {
    /**
     * Enum value Compliant.
     */
    COMPLIANT("Compliant"),

    /**
     * Enum value NonCompliant.
     */
    NON_COMPLIANT("NonCompliant");

    /**
     * The actual serialized value for a SearchEncryptionComplianceStatus instance.
     */
    private final String value;

    SearchEncryptionComplianceStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SearchEncryptionComplianceStatus instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed SearchEncryptionComplianceStatus object, or null if unable to parse.
     */
    public static SearchEncryptionComplianceStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        SearchEncryptionComplianceStatus[] items = SearchEncryptionComplianceStatus.values();
        for (SearchEncryptionComplianceStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
