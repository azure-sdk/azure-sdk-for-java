// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Rule for trusted access role.
 */
@Immutable
public final class TrustedAccessRoleRule implements JsonSerializable<TrustedAccessRoleRule> {
    /*
     * List of allowed verbs
     */
    private List<String> verbs;

    /*
     * List of allowed apiGroups
     */
    private List<String> apiGroups;

    /*
     * List of allowed resources
     */
    private List<String> resources;

    /*
     * List of allowed names
     */
    private List<String> resourceNames;

    /*
     * List of allowed nonResourceURLs
     */
    private List<String> nonResourceUrls;

    /**
     * Creates an instance of TrustedAccessRoleRule class.
     */
    public TrustedAccessRoleRule() {
    }

    /**
     * Get the verbs property: List of allowed verbs.
     * 
     * @return the verbs value.
     */
    public List<String> verbs() {
        return this.verbs;
    }

    /**
     * Get the apiGroups property: List of allowed apiGroups.
     * 
     * @return the apiGroups value.
     */
    public List<String> apiGroups() {
        return this.apiGroups;
    }

    /**
     * Get the resources property: List of allowed resources.
     * 
     * @return the resources value.
     */
    public List<String> resources() {
        return this.resources;
    }

    /**
     * Get the resourceNames property: List of allowed names.
     * 
     * @return the resourceNames value.
     */
    public List<String> resourceNames() {
        return this.resourceNames;
    }

    /**
     * Get the nonResourceUrls property: List of allowed nonResourceURLs.
     * 
     * @return the nonResourceUrls value.
     */
    public List<String> nonResourceUrls() {
        return this.nonResourceUrls;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TrustedAccessRoleRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrustedAccessRoleRule if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TrustedAccessRoleRule.
     */
    public static TrustedAccessRoleRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TrustedAccessRoleRule deserializedTrustedAccessRoleRule = new TrustedAccessRoleRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("verbs".equals(fieldName)) {
                    List<String> verbs = reader.readArray(reader1 -> reader1.getString());
                    deserializedTrustedAccessRoleRule.verbs = verbs;
                } else if ("apiGroups".equals(fieldName)) {
                    List<String> apiGroups = reader.readArray(reader1 -> reader1.getString());
                    deserializedTrustedAccessRoleRule.apiGroups = apiGroups;
                } else if ("resources".equals(fieldName)) {
                    List<String> resources = reader.readArray(reader1 -> reader1.getString());
                    deserializedTrustedAccessRoleRule.resources = resources;
                } else if ("resourceNames".equals(fieldName)) {
                    List<String> resourceNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedTrustedAccessRoleRule.resourceNames = resourceNames;
                } else if ("nonResourceURLs".equals(fieldName)) {
                    List<String> nonResourceUrls = reader.readArray(reader1 -> reader1.getString());
                    deserializedTrustedAccessRoleRule.nonResourceUrls = nonResourceUrls;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTrustedAccessRoleRule;
        });
    }
}
