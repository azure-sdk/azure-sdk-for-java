// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Network-specific rules that determine how the search service can be reached.
 */
@Fluent
public final class NetworkRuleSet implements JsonSerializable<NetworkRuleSet> {
    /*
     * A list of IP restriction rules used for an IP firewall. Any IPs that do not match the rules are blocked by the
     * firewall. These rules are only applied when the 'publicNetworkAccess' of the search service is 'enabled'.
     */
    private List<IpRule> ipRules;

    /**
     * Creates an instance of NetworkRuleSet class.
     */
    public NetworkRuleSet() {
    }

    /**
     * Get the ipRules property: A list of IP restriction rules used for an IP firewall. Any IPs that do not match the
     * rules are blocked by the firewall. These rules are only applied when the 'publicNetworkAccess' of the search
     * service is 'enabled'.
     * 
     * @return the ipRules value.
     */
    public List<IpRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: A list of IP restriction rules used for an IP firewall. Any IPs that do not match the
     * rules are blocked by the firewall. These rules are only applied when the 'publicNetworkAccess' of the search
     * service is 'enabled'.
     * 
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withIpRules(List<IpRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("ipRules", this.ipRules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkRuleSet from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkRuleSet if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkRuleSet.
     */
    public static NetworkRuleSet fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkRuleSet deserializedNetworkRuleSet = new NetworkRuleSet();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ipRules".equals(fieldName)) {
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
