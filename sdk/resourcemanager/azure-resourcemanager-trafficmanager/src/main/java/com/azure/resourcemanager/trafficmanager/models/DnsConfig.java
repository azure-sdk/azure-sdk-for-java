// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Class containing DNS settings in a Traffic Manager profile.
 */
@Fluent
public final class DnsConfig implements JsonSerializable<DnsConfig> {
    /*
     * The relative DNS name provided by this Traffic Manager profile. This value is combined with the DNS domain name
     * used by Azure Traffic Manager to form the fully-qualified domain name (FQDN) of the profile.
     */
    private String relativeName;

    /*
     * The fully-qualified domain name (FQDN) of the Traffic Manager profile. This is formed from the concatenation of
     * the RelativeName with the DNS domain used by Azure Traffic Manager.
     */
    private String fqdn;

    /*
     * The DNS Time-To-Live (TTL), in seconds. This informs the local DNS resolvers and DNS clients how long to cache
     * DNS responses provided by this Traffic Manager profile.
     */
    private Long ttl;

    /**
     * Creates an instance of DnsConfig class.
     */
    public DnsConfig() {
    }

    /**
     * Get the relativeName property: The relative DNS name provided by this Traffic Manager profile. This value is
     * combined with the DNS domain name used by Azure Traffic Manager to form the fully-qualified domain name (FQDN) of
     * the profile.
     * 
     * @return the relativeName value.
     */
    public String relativeName() {
        return this.relativeName;
    }

    /**
     * Set the relativeName property: The relative DNS name provided by this Traffic Manager profile. This value is
     * combined with the DNS domain name used by Azure Traffic Manager to form the fully-qualified domain name (FQDN) of
     * the profile.
     * 
     * @param relativeName the relativeName value to set.
     * @return the DnsConfig object itself.
     */
    public DnsConfig withRelativeName(String relativeName) {
        this.relativeName = relativeName;
        return this;
    }

    /**
     * Get the fqdn property: The fully-qualified domain name (FQDN) of the Traffic Manager profile. This is formed from
     * the concatenation of the RelativeName with the DNS domain used by Azure Traffic Manager.
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the ttl property: The DNS Time-To-Live (TTL), in seconds. This informs the local DNS resolvers and DNS
     * clients how long to cache DNS responses provided by this Traffic Manager profile.
     * 
     * @return the ttl value.
     */
    public Long ttl() {
        return this.ttl;
    }

    /**
     * Set the ttl property: The DNS Time-To-Live (TTL), in seconds. This informs the local DNS resolvers and DNS
     * clients how long to cache DNS responses provided by this Traffic Manager profile.
     * 
     * @param ttl the ttl value to set.
     * @return the DnsConfig object itself.
     */
    public DnsConfig withTtl(Long ttl) {
        this.ttl = ttl;
        return this;
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
        jsonWriter.writeStringField("relativeName", this.relativeName);
        jsonWriter.writeNumberField("ttl", this.ttl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DnsConfig from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DnsConfig if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the DnsConfig.
     */
    public static DnsConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DnsConfig deserializedDnsConfig = new DnsConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("relativeName".equals(fieldName)) {
                    deserializedDnsConfig.relativeName = reader.getString();
                } else if ("fqdn".equals(fieldName)) {
                    deserializedDnsConfig.fqdn = reader.getString();
                } else if ("ttl".equals(fieldName)) {
                    deserializedDnsConfig.ttl = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDnsConfig;
        });
    }
}
