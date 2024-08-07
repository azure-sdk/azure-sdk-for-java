// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Network rule set.
 */
@Fluent
public final class NetworkRuleSet implements JsonSerializable<NetworkRuleSet> {
    /*
     * Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values are any combination of
     * Logging|Metrics|AzureServices (For example, "Logging, Metrics"), or None to bypass none of those traffics.
     */
    private Bypass bypass;

    /*
     * Sets the resource access rules
     */
    private List<ResourceAccessRule> resourceAccessRules;

    /*
     * Sets the virtual network rules
     */
    private List<VirtualNetworkRule> virtualNetworkRules;

    /*
     * Sets the IP ACL rules
     */
    private List<IpRule> ipRules;

    /*
     * Specifies the default action of allow or deny when no other rules match.
     */
    private DefaultAction defaultAction;

    /**
     * Creates an instance of NetworkRuleSet class.
     */
    public NetworkRuleSet() {
    }

    /**
     * Get the bypass property: Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values
     * are any combination of Logging|Metrics|AzureServices (For example, "Logging, Metrics"), or None to bypass none of
     * those traffics.
     * 
     * @return the bypass value.
     */
    public Bypass bypass() {
        return this.bypass;
    }

    /**
     * Set the bypass property: Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values
     * are any combination of Logging|Metrics|AzureServices (For example, "Logging, Metrics"), or None to bypass none of
     * those traffics.
     * 
     * @param bypass the bypass value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withBypass(Bypass bypass) {
        this.bypass = bypass;
        return this;
    }

    /**
     * Get the resourceAccessRules property: Sets the resource access rules.
     * 
     * @return the resourceAccessRules value.
     */
    public List<ResourceAccessRule> resourceAccessRules() {
        return this.resourceAccessRules;
    }

    /**
     * Set the resourceAccessRules property: Sets the resource access rules.
     * 
     * @param resourceAccessRules the resourceAccessRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withResourceAccessRules(List<ResourceAccessRule> resourceAccessRules) {
        this.resourceAccessRules = resourceAccessRules;
        return this;
    }

    /**
     * Get the virtualNetworkRules property: Sets the virtual network rules.
     * 
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: Sets the virtual network rules.
     * 
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the ipRules property: Sets the IP ACL rules.
     * 
     * @return the ipRules value.
     */
    public List<IpRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: Sets the IP ACL rules.
     * 
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withIpRules(List<IpRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the defaultAction property: Specifies the default action of allow or deny when no other rules match.
     * 
     * @return the defaultAction value.
     */
    public DefaultAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set the defaultAction property: Specifies the default action of allow or deny when no other rules match.
     * 
     * @param defaultAction the defaultAction value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceAccessRules() != null) {
            resourceAccessRules().forEach(e -> e.validate());
        }
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
        if (defaultAction() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property defaultAction in model NetworkRuleSet"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkRuleSet.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("defaultAction", this.defaultAction == null ? null : this.defaultAction.toString());
        jsonWriter.writeStringField("bypass", this.bypass == null ? null : this.bypass.toString());
        jsonWriter.writeArrayField("resourceAccessRules", this.resourceAccessRules,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("virtualNetworkRules", this.virtualNetworkRules,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("ipRules", this.ipRules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkRuleSet from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkRuleSet if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NetworkRuleSet.
     */
    public static NetworkRuleSet fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkRuleSet deserializedNetworkRuleSet = new NetworkRuleSet();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("defaultAction".equals(fieldName)) {
                    deserializedNetworkRuleSet.defaultAction = DefaultAction.fromString(reader.getString());
                } else if ("bypass".equals(fieldName)) {
                    deserializedNetworkRuleSet.bypass = Bypass.fromString(reader.getString());
                } else if ("resourceAccessRules".equals(fieldName)) {
                    List<ResourceAccessRule> resourceAccessRules
                        = reader.readArray(reader1 -> ResourceAccessRule.fromJson(reader1));
                    deserializedNetworkRuleSet.resourceAccessRules = resourceAccessRules;
                } else if ("virtualNetworkRules".equals(fieldName)) {
                    List<VirtualNetworkRule> virtualNetworkRules
                        = reader.readArray(reader1 -> VirtualNetworkRule.fromJson(reader1));
                    deserializedNetworkRuleSet.virtualNetworkRules = virtualNetworkRules;
                } else if ("ipRules".equals(fieldName)) {
                    List<IpRule> ipRules = reader.readArray(reader1 -> IpRule.fromJson(reader1));
                    deserializedNetworkRuleSet.ipRules = ipRules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkRuleSet;
        });
    }
}
