// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies a range of IP addresses permitted to connect to the cache.
 */
@Fluent
public final class RedisFirewallRuleProperties implements JsonSerializable<RedisFirewallRuleProperties> {
    /*
     * lowest IP address included in the range
     */
    private String startIp;

    /*
     * highest IP address included in the range
     */
    private String endIp;

    /**
     * Creates an instance of RedisFirewallRuleProperties class.
     */
    public RedisFirewallRuleProperties() {
    }

    /**
     * Get the startIp property: lowest IP address included in the range.
     * 
     * @return the startIp value.
     */
    public String startIp() {
        return this.startIp;
    }

    /**
     * Set the startIp property: lowest IP address included in the range.
     * 
     * @param startIp the startIp value to set.
     * @return the RedisFirewallRuleProperties object itself.
     */
    public RedisFirewallRuleProperties withStartIp(String startIp) {
        this.startIp = startIp;
        return this;
    }

    /**
     * Get the endIp property: highest IP address included in the range.
     * 
     * @return the endIp value.
     */
    public String endIp() {
        return this.endIp;
    }

    /**
     * Set the endIp property: highest IP address included in the range.
     * 
     * @param endIp the endIp value to set.
     * @return the RedisFirewallRuleProperties object itself.
     */
    public RedisFirewallRuleProperties withEndIp(String endIp) {
        this.endIp = endIp;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (startIp() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property startIp in model RedisFirewallRuleProperties"));
        }
        if (endIp() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property endIp in model RedisFirewallRuleProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RedisFirewallRuleProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("startIP", this.startIp);
        jsonWriter.writeStringField("endIP", this.endIp);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RedisFirewallRuleProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedisFirewallRuleProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RedisFirewallRuleProperties.
     */
    public static RedisFirewallRuleProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedisFirewallRuleProperties deserializedRedisFirewallRuleProperties = new RedisFirewallRuleProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("startIP".equals(fieldName)) {
                    deserializedRedisFirewallRuleProperties.startIp = reader.getString();
                } else if ("endIP".equals(fieldName)) {
                    deserializedRedisFirewallRuleProperties.endIp = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRedisFirewallRuleProperties;
        });
    }
}
