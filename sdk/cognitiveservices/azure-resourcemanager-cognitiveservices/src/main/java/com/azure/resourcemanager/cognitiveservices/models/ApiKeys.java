// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.resourcemanager.cognitiveservices.fluent.models.ApiKeysInner;

/**
 * An immutable client-side representation of ApiKeys.
 */
public interface ApiKeys {
    /**
     * Gets the key1 property: Gets the value of key 1.
     * 
     * @return the key1 value.
     */
    String key1();

    /**
     * Gets the key2 property: Gets the value of key 2.
     * 
     * @return the key2 value.
     */
    String key2();

    /**
     * Gets the inner com.azure.resourcemanager.cognitiveservices.fluent.models.ApiKeysInner object.
     * 
     * @return the inner object.
     */
    ApiKeysInner innerModel();
}
