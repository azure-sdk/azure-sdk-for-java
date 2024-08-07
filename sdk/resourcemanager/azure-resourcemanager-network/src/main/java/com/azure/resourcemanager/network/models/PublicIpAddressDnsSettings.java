// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Contains FQDN of the DNS record associated with the public IP address.
 */
@Fluent
public final class PublicIpAddressDnsSettings implements JsonSerializable<PublicIpAddressDnsSettings> {
    /*
     * The domain name label. The concatenation of the domain name label and the regionalized DNS zone make up the fully
     * qualified domain name associated with the public IP address. If a domain name label is specified, an A DNS record
     * is created for the public IP in the Microsoft Azure DNS system.
     */
    private String domainNameLabel;

    /*
     * The domain name label scope. If a domain name label and a domain name label scope are specified, an A DNS record
     * is created for the public IP in the Microsoft Azure DNS system with a hashed value includes in FQDN.
     */
    private PublicIpAddressDnsSettingsDomainNameLabelScope domainNameLabelScope;

    /*
     * The Fully Qualified Domain Name of the A DNS record associated with the public IP. This is the concatenation of
     * the domainNameLabel and the regionalized DNS zone.
     */
    private String fqdn;

    /*
     * The reverse FQDN. A user-visible, fully qualified domain name that resolves to this public IP address. If the
     * reverseFqdn is specified, then a PTR DNS record is created pointing from the IP address in the in-addr.arpa
     * domain to the reverse FQDN.
     */
    private String reverseFqdn;

    /**
     * Creates an instance of PublicIpAddressDnsSettings class.
     */
    public PublicIpAddressDnsSettings() {
    }

    /**
     * Get the domainNameLabel property: The domain name label. The concatenation of the domain name label and the
     * regionalized DNS zone make up the fully qualified domain name associated with the public IP address. If a domain
     * name label is specified, an A DNS record is created for the public IP in the Microsoft Azure DNS system.
     * 
     * @return the domainNameLabel value.
     */
    public String domainNameLabel() {
        return this.domainNameLabel;
    }

    /**
     * Set the domainNameLabel property: The domain name label. The concatenation of the domain name label and the
     * regionalized DNS zone make up the fully qualified domain name associated with the public IP address. If a domain
     * name label is specified, an A DNS record is created for the public IP in the Microsoft Azure DNS system.
     * 
     * @param domainNameLabel the domainNameLabel value to set.
     * @return the PublicIpAddressDnsSettings object itself.
     */
    public PublicIpAddressDnsSettings withDomainNameLabel(String domainNameLabel) {
        this.domainNameLabel = domainNameLabel;
        return this;
    }

    /**
     * Get the domainNameLabelScope property: The domain name label scope. If a domain name label and a domain name
     * label scope are specified, an A DNS record is created for the public IP in the Microsoft Azure DNS system with a
     * hashed value includes in FQDN.
     * 
     * @return the domainNameLabelScope value.
     */
    public PublicIpAddressDnsSettingsDomainNameLabelScope domainNameLabelScope() {
        return this.domainNameLabelScope;
    }

    /**
     * Set the domainNameLabelScope property: The domain name label scope. If a domain name label and a domain name
     * label scope are specified, an A DNS record is created for the public IP in the Microsoft Azure DNS system with a
     * hashed value includes in FQDN.
     * 
     * @param domainNameLabelScope the domainNameLabelScope value to set.
     * @return the PublicIpAddressDnsSettings object itself.
     */
    public PublicIpAddressDnsSettings
        withDomainNameLabelScope(PublicIpAddressDnsSettingsDomainNameLabelScope domainNameLabelScope) {
        this.domainNameLabelScope = domainNameLabelScope;
        return this;
    }

    /**
     * Get the fqdn property: The Fully Qualified Domain Name of the A DNS record associated with the public IP. This is
     * the concatenation of the domainNameLabel and the regionalized DNS zone.
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: The Fully Qualified Domain Name of the A DNS record associated with the public IP. This is
     * the concatenation of the domainNameLabel and the regionalized DNS zone.
     * 
     * @param fqdn the fqdn value to set.
     * @return the PublicIpAddressDnsSettings object itself.
     */
    public PublicIpAddressDnsSettings withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the reverseFqdn property: The reverse FQDN. A user-visible, fully qualified domain name that resolves to this
     * public IP address. If the reverseFqdn is specified, then a PTR DNS record is created pointing from the IP address
     * in the in-addr.arpa domain to the reverse FQDN.
     * 
     * @return the reverseFqdn value.
     */
    public String reverseFqdn() {
        return this.reverseFqdn;
    }

    /**
     * Set the reverseFqdn property: The reverse FQDN. A user-visible, fully qualified domain name that resolves to this
     * public IP address. If the reverseFqdn is specified, then a PTR DNS record is created pointing from the IP address
     * in the in-addr.arpa domain to the reverse FQDN.
     * 
     * @param reverseFqdn the reverseFqdn value to set.
     * @return the PublicIpAddressDnsSettings object itself.
     */
    public PublicIpAddressDnsSettings withReverseFqdn(String reverseFqdn) {
        this.reverseFqdn = reverseFqdn;
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
        jsonWriter.writeStringField("domainNameLabel", this.domainNameLabel);
        jsonWriter.writeStringField("domainNameLabelScope",
            this.domainNameLabelScope == null ? null : this.domainNameLabelScope.toString());
        jsonWriter.writeStringField("fqdn", this.fqdn);
        jsonWriter.writeStringField("reverseFqdn", this.reverseFqdn);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PublicIpAddressDnsSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PublicIpAddressDnsSettings if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PublicIpAddressDnsSettings.
     */
    public static PublicIpAddressDnsSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PublicIpAddressDnsSettings deserializedPublicIpAddressDnsSettings = new PublicIpAddressDnsSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("domainNameLabel".equals(fieldName)) {
                    deserializedPublicIpAddressDnsSettings.domainNameLabel = reader.getString();
                } else if ("domainNameLabelScope".equals(fieldName)) {
                    deserializedPublicIpAddressDnsSettings.domainNameLabelScope
                        = PublicIpAddressDnsSettingsDomainNameLabelScope.fromString(reader.getString());
                } else if ("fqdn".equals(fieldName)) {
                    deserializedPublicIpAddressDnsSettings.fqdn = reader.getString();
                } else if ("reverseFqdn".equals(fieldName)) {
                    deserializedPublicIpAddressDnsSettings.reverseFqdn = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPublicIpAddressDnsSettings;
        });
    }
}
