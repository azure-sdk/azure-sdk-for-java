// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

/**
 * Email channel auth method. 0 Password (Default); 1 Graph.
 */
public enum EmailChannelAuthMethod {
    /**
     * Enum value 0.
     */
    ZERO(0f),

    /**
     * Enum value 1.
     */
    ONE(1f);

    /**
     * The actual serialized value for a EmailChannelAuthMethod instance.
     */
    private final float value;

    EmailChannelAuthMethod(float value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EmailChannelAuthMethod instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed EmailChannelAuthMethod object, or null if unable to parse.
     */
    public static EmailChannelAuthMethod fromFloat(float value) {
        EmailChannelAuthMethod[] items = EmailChannelAuthMethod.values();
        for (EmailChannelAuthMethod item : items) {
            if (Float.floatToIntBits(item.toFloat()) == Float.floatToIntBits(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * De-serializes the instance to float value.
     * 
     * @return the float value.
     */
    public float toFloat() {
        return this.value;
    }
}
