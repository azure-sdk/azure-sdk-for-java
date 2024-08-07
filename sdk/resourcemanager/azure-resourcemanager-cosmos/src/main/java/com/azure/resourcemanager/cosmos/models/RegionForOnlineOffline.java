// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Cosmos DB region to online or offline.
 */
@Fluent
public final class RegionForOnlineOffline implements JsonSerializable<RegionForOnlineOffline> {
    /*
     * Cosmos DB region, with spaces between words and each word capitalized.
     */
    private String region;

    /**
     * Creates an instance of RegionForOnlineOffline class.
     */
    public RegionForOnlineOffline() {
    }

    /**
     * Get the region property: Cosmos DB region, with spaces between words and each word capitalized.
     * 
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: Cosmos DB region, with spaces between words and each word capitalized.
     * 
     * @param region the region value to set.
     * @return the RegionForOnlineOffline object itself.
     */
    public RegionForOnlineOffline withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (region() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property region in model RegionForOnlineOffline"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RegionForOnlineOffline.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("region", this.region);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RegionForOnlineOffline from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RegionForOnlineOffline if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RegionForOnlineOffline.
     */
    public static RegionForOnlineOffline fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RegionForOnlineOffline deserializedRegionForOnlineOffline = new RegionForOnlineOffline();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("region".equals(fieldName)) {
                    deserializedRegionForOnlineOffline.region = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRegionForOnlineOffline;
        });
    }
}
