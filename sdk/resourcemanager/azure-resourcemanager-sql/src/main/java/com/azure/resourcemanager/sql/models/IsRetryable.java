// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

/**
 * Gets whether the error could be ignored and recommended action could be retried. Possible values are: Yes/No.
 */
public enum IsRetryable {
    /**
     * Enum value Yes.
     */
    YES("Yes"),

    /**
     * Enum value No.
     */
    NO("No");

    /**
     * The actual serialized value for a IsRetryable instance.
     */
    private final String value;

    IsRetryable(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IsRetryable instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed IsRetryable object, or null if unable to parse.
     */
    public static IsRetryable fromString(String value) {
        if (value == null) {
            return null;
        }
        IsRetryable[] items = IsRetryable.values();
        for (IsRetryable item : items) {
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
