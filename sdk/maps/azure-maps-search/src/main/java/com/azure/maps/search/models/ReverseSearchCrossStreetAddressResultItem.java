// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import com.azure.core.models.GeoPosition;

/**
 * Result object for a Search Address Reverse Cross Street response.
 */
@Immutable
public final class ReverseSearchCrossStreetAddressResultItem
    implements JsonSerializable<ReverseSearchCrossStreetAddressResultItem> {

    /*
     * The address of the result
     */
    private MapsSearchAddress address;

    /*
     * Position property in the form of "{latitude},{longitude}"
     */
    private String position;

    /**
     * Creates an instance of ReverseSearchCrossStreetAddressResultItem class.
     */
    public ReverseSearchCrossStreetAddressResultItem() {
    }

    /**
     * Get the address property: The address of the result.
     *
     * @return the address value.
     */
    public MapsSearchAddress getAddress() {
        return this.address;
    }

    /**
     * Get the position property: Position property in the form of "{latitude},{longitude}".
     *
     * @return the position value.
     */
    public GeoPosition getPosition() {
        return com.azure.maps.search.implementation.helpers.Utility.fromCommaSeparatedString(this.position);
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
     * Reads an instance of ReverseSearchCrossStreetAddressResultItem from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReverseSearchCrossStreetAddressResultItem if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReverseSearchCrossStreetAddressResultItem.
     */
    public static ReverseSearchCrossStreetAddressResultItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReverseSearchCrossStreetAddressResultItem deserializedReverseSearchCrossStreetAddressResultItem
                = new ReverseSearchCrossStreetAddressResultItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("address".equals(fieldName)) {
                    deserializedReverseSearchCrossStreetAddressResultItem.address = MapsSearchAddress.fromJson(reader);
                } else if ("position".equals(fieldName)) {
                    deserializedReverseSearchCrossStreetAddressResultItem.position = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedReverseSearchCrossStreetAddressResultItem;
        });
    }
}
