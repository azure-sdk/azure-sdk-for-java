// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The IP address range in the CIDR scheme.
 */
@Fluent
public final class IpRange implements JsonSerializable<IpRange> {
    /*
     * The friendly name for the IP address range.
     */
    private String name;

    /*
     * The IP address.
     */
    private String address;

    /*
     * The subnet mask prefix length (see CIDR notation).
     */
    private Integer subnetPrefixLength;

    /**
     * Creates an instance of IpRange class.
     */
    public IpRange() {
    }

    /**
     * Get the name property: The friendly name for the IP address range.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The friendly name for the IP address range.
     * 
     * @param name the name value to set.
     * @return the IpRange object itself.
     */
    public IpRange withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the address property: The IP address.
     * 
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: The IP address.
     * 
     * @param address the address value to set.
     * @return the IpRange object itself.
     */
    public IpRange withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the subnetPrefixLength property: The subnet mask prefix length (see CIDR notation).
     * 
     * @return the subnetPrefixLength value.
     */
    public Integer subnetPrefixLength() {
        return this.subnetPrefixLength;
    }

    /**
     * Set the subnetPrefixLength property: The subnet mask prefix length (see CIDR notation).
     * 
     * @param subnetPrefixLength the subnetPrefixLength value to set.
     * @return the IpRange object itself.
     */
    public IpRange withSubnetPrefixLength(Integer subnetPrefixLength) {
        this.subnetPrefixLength = subnetPrefixLength;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("address", this.address);
        jsonWriter.writeNumberField("subnetPrefixLength", this.subnetPrefixLength);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpRange from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpRange if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the IpRange.
     */
    public static IpRange fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpRange deserializedIpRange = new IpRange();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedIpRange.name = reader.getString();
                } else if ("address".equals(fieldName)) {
                    deserializedIpRange.address = reader.getString();
                } else if ("subnetPrefixLength".equals(fieldName)) {
                    deserializedIpRange.subnetPrefixLength = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpRange;
        });
    }
}
