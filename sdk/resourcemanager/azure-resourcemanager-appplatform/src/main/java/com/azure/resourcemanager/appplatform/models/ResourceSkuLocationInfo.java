// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Locations and availability zones where the SKU is available.
 */
@Fluent
public final class ResourceSkuLocationInfo implements JsonSerializable<ResourceSkuLocationInfo> {
    /*
     * Gets location of the SKU
     */
    private String location;

    /*
     * Gets list of availability zones where the SKU is supported.
     */
    private List<String> zones;

    /*
     * Gets details of capabilities available to a SKU in specific zones.
     */
    private List<ResourceSkuZoneDetails> zoneDetails;

    /**
     * Creates an instance of ResourceSkuLocationInfo class.
     */
    public ResourceSkuLocationInfo() {
    }

    /**
     * Get the location property: Gets location of the SKU.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Gets location of the SKU.
     * 
     * @param location the location value to set.
     * @return the ResourceSkuLocationInfo object itself.
     */
    public ResourceSkuLocationInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the zones property: Gets list of availability zones where the SKU is supported.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Gets list of availability zones where the SKU is supported.
     * 
     * @param zones the zones value to set.
     * @return the ResourceSkuLocationInfo object itself.
     */
    public ResourceSkuLocationInfo withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the zoneDetails property: Gets details of capabilities available to a SKU in specific zones.
     * 
     * @return the zoneDetails value.
     */
    public List<ResourceSkuZoneDetails> zoneDetails() {
        return this.zoneDetails;
    }

    /**
     * Set the zoneDetails property: Gets details of capabilities available to a SKU in specific zones.
     * 
     * @param zoneDetails the zoneDetails value to set.
     * @return the ResourceSkuLocationInfo object itself.
     */
    public ResourceSkuLocationInfo withZoneDetails(List<ResourceSkuZoneDetails> zoneDetails) {
        this.zoneDetails = zoneDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (zoneDetails() != null) {
            zoneDetails().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeArrayField("zones", this.zones, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("zoneDetails", this.zoneDetails, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceSkuLocationInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceSkuLocationInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceSkuLocationInfo.
     */
    public static ResourceSkuLocationInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceSkuLocationInfo deserializedResourceSkuLocationInfo = new ResourceSkuLocationInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedResourceSkuLocationInfo.location = reader.getString();
                } else if ("zones".equals(fieldName)) {
                    List<String> zones = reader.readArray(reader1 -> reader1.getString());
                    deserializedResourceSkuLocationInfo.zones = zones;
                } else if ("zoneDetails".equals(fieldName)) {
                    List<ResourceSkuZoneDetails> zoneDetails
                        = reader.readArray(reader1 -> ResourceSkuZoneDetails.fromJson(reader1));
                    deserializedResourceSkuLocationInfo.zoneDetails = zoneDetails;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceSkuLocationInfo;
        });
    }
}
