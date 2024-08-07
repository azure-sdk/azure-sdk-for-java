// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Network Security Perimeter profile.
 */
@Immutable
public final class NetworkSecurityPerimeterProfile implements JsonSerializable<NetworkSecurityPerimeterProfile> {
    /*
     * Name of the resource
     */
    private String name;

    /*
     * Access rules version number
     */
    private Integer accessRulesVersion;

    /*
     * Collection of access rules for the profile
     */
    private List<AccessRule> accessRules;

    /*
     * Diagnostic settings version number
     */
    private Integer diagnosticSettingsVersion;

    /*
     * Collection of enabled log categories for the profile
     */
    private List<String> enabledLogCategories;

    /**
     * Creates an instance of NetworkSecurityPerimeterProfile class.
     */
    public NetworkSecurityPerimeterProfile() {
    }

    /**
     * Get the name property: Name of the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the accessRulesVersion property: Access rules version number.
     * 
     * @return the accessRulesVersion value.
     */
    public Integer accessRulesVersion() {
        return this.accessRulesVersion;
    }

    /**
     * Get the accessRules property: Collection of access rules for the profile.
     * 
     * @return the accessRules value.
     */
    public List<AccessRule> accessRules() {
        return this.accessRules;
    }

    /**
     * Get the diagnosticSettingsVersion property: Diagnostic settings version number.
     * 
     * @return the diagnosticSettingsVersion value.
     */
    public Integer diagnosticSettingsVersion() {
        return this.diagnosticSettingsVersion;
    }

    /**
     * Get the enabledLogCategories property: Collection of enabled log categories for the profile.
     * 
     * @return the enabledLogCategories value.
     */
    public List<String> enabledLogCategories() {
        return this.enabledLogCategories;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accessRules() != null) {
            accessRules().forEach(e -> e.validate());
        }
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
     * Reads an instance of NetworkSecurityPerimeterProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkSecurityPerimeterProfile if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkSecurityPerimeterProfile.
     */
    public static NetworkSecurityPerimeterProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkSecurityPerimeterProfile deserializedNetworkSecurityPerimeterProfile
                = new NetworkSecurityPerimeterProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeterProfile.name = reader.getString();
                } else if ("accessRulesVersion".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeterProfile.accessRulesVersion
                        = reader.getNullable(JsonReader::getInt);
                } else if ("accessRules".equals(fieldName)) {
                    List<AccessRule> accessRules = reader.readArray(reader1 -> AccessRule.fromJson(reader1));
                    deserializedNetworkSecurityPerimeterProfile.accessRules = accessRules;
                } else if ("diagnosticSettingsVersion".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeterProfile.diagnosticSettingsVersion
                        = reader.getNullable(JsonReader::getInt);
                } else if ("enabledLogCategories".equals(fieldName)) {
                    List<String> enabledLogCategories = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkSecurityPerimeterProfile.enabledLogCategories = enabledLogCategories;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkSecurityPerimeterProfile;
        });
    }
}
