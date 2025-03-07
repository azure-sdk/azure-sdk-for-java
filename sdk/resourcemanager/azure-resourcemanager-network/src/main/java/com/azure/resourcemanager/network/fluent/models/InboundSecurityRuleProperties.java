// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.InboundSecurityRuleType;
import com.azure.resourcemanager.network.models.InboundSecurityRules;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the Inbound Security Rules resource.
 */
@Fluent
public final class InboundSecurityRuleProperties implements JsonSerializable<InboundSecurityRuleProperties> {
    /*
     * Rule Type. This should be either AutoExpire or Permanent. Auto Expire Rule only creates NSG rules. Permanent Rule
     * creates NSG rule and SLB LB Rule.
     */
    private InboundSecurityRuleType ruleType;

    /*
     * List of allowed rules.
     */
    private List<InboundSecurityRules> rules;

    /*
     * The provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of InboundSecurityRuleProperties class.
     */
    public InboundSecurityRuleProperties() {
    }

    /**
     * Get the ruleType property: Rule Type. This should be either AutoExpire or Permanent. Auto Expire Rule only
     * creates NSG rules. Permanent Rule creates NSG rule and SLB LB Rule.
     * 
     * @return the ruleType value.
     */
    public InboundSecurityRuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Set the ruleType property: Rule Type. This should be either AutoExpire or Permanent. Auto Expire Rule only
     * creates NSG rules. Permanent Rule creates NSG rule and SLB LB Rule.
     * 
     * @param ruleType the ruleType value to set.
     * @return the InboundSecurityRuleProperties object itself.
     */
    public InboundSecurityRuleProperties withRuleType(InboundSecurityRuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get the rules property: List of allowed rules.
     * 
     * @return the rules value.
     */
    public List<InboundSecurityRules> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: List of allowed rules.
     * 
     * @param rules the rules value to set.
     * @return the InboundSecurityRuleProperties object itself.
     */
    public InboundSecurityRuleProperties withRules(List<InboundSecurityRules> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("ruleType", this.ruleType == null ? null : this.ruleType.toString());
        jsonWriter.writeArrayField("rules", this.rules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InboundSecurityRuleProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InboundSecurityRuleProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the InboundSecurityRuleProperties.
     */
    public static InboundSecurityRuleProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InboundSecurityRuleProperties deserializedInboundSecurityRuleProperties
                = new InboundSecurityRuleProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ruleType".equals(fieldName)) {
                    deserializedInboundSecurityRuleProperties.ruleType
                        = InboundSecurityRuleType.fromString(reader.getString());
                } else if ("rules".equals(fieldName)) {
                    List<InboundSecurityRules> rules
                        = reader.readArray(reader1 -> InboundSecurityRules.fromJson(reader1));
                    deserializedInboundSecurityRuleProperties.rules = rules;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedInboundSecurityRuleProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInboundSecurityRuleProperties;
        });
    }
}
