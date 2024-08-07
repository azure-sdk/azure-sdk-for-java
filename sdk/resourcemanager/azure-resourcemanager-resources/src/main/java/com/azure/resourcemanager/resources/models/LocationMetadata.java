// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Location metadata information.
 */
@Fluent
public final class LocationMetadata implements JsonSerializable<LocationMetadata> {
    /*
     * The type of the region.
     */
    private RegionType regionType;

    /*
     * The category of the region.
     */
    private RegionCategory regionCategory;

    /*
     * The geography of the location.
     */
    private String geography;

    /*
     * The geography group of the location.
     */
    private String geographyGroup;

    /*
     * The longitude of the location.
     */
    private String longitude;

    /*
     * The latitude of the location.
     */
    private String latitude;

    /*
     * The physical location of the Azure location.
     */
    private String physicalLocation;

    /*
     * The regions paired to this region.
     */
    private List<PairedRegion> pairedRegion;

    /*
     * The home location of an edge zone.
     */
    private String homeLocation;

    /**
     * Creates an instance of LocationMetadata class.
     */
    public LocationMetadata() {
    }

    /**
     * Get the regionType property: The type of the region.
     * 
     * @return the regionType value.
     */
    public RegionType regionType() {
        return this.regionType;
    }

    /**
     * Get the regionCategory property: The category of the region.
     * 
     * @return the regionCategory value.
     */
    public RegionCategory regionCategory() {
        return this.regionCategory;
    }

    /**
     * Get the geography property: The geography of the location.
     * 
     * @return the geography value.
     */
    public String geography() {
        return this.geography;
    }

    /**
     * Get the geographyGroup property: The geography group of the location.
     * 
     * @return the geographyGroup value.
     */
    public String geographyGroup() {
        return this.geographyGroup;
    }

    /**
     * Get the longitude property: The longitude of the location.
     * 
     * @return the longitude value.
     */
    public String longitude() {
        return this.longitude;
    }

    /**
     * Get the latitude property: The latitude of the location.
     * 
     * @return the latitude value.
     */
    public String latitude() {
        return this.latitude;
    }

    /**
     * Get the physicalLocation property: The physical location of the Azure location.
     * 
     * @return the physicalLocation value.
     */
    public String physicalLocation() {
        return this.physicalLocation;
    }

    /**
     * Get the pairedRegion property: The regions paired to this region.
     * 
     * @return the pairedRegion value.
     */
    public List<PairedRegion> pairedRegion() {
        return this.pairedRegion;
    }

    /**
     * Set the pairedRegion property: The regions paired to this region.
     * 
     * @param pairedRegion the pairedRegion value to set.
     * @return the LocationMetadata object itself.
     */
    public LocationMetadata withPairedRegion(List<PairedRegion> pairedRegion) {
        this.pairedRegion = pairedRegion;
        return this;
    }

    /**
     * Get the homeLocation property: The home location of an edge zone.
     * 
     * @return the homeLocation value.
     */
    public String homeLocation() {
        return this.homeLocation;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pairedRegion() != null) {
            pairedRegion().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("pairedRegion", this.pairedRegion, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LocationMetadata from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LocationMetadata if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LocationMetadata.
     */
    public static LocationMetadata fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LocationMetadata deserializedLocationMetadata = new LocationMetadata();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("regionType".equals(fieldName)) {
                    deserializedLocationMetadata.regionType = RegionType.fromString(reader.getString());
                } else if ("regionCategory".equals(fieldName)) {
                    deserializedLocationMetadata.regionCategory = RegionCategory.fromString(reader.getString());
                } else if ("geography".equals(fieldName)) {
                    deserializedLocationMetadata.geography = reader.getString();
                } else if ("geographyGroup".equals(fieldName)) {
                    deserializedLocationMetadata.geographyGroup = reader.getString();
                } else if ("longitude".equals(fieldName)) {
                    deserializedLocationMetadata.longitude = reader.getString();
                } else if ("latitude".equals(fieldName)) {
                    deserializedLocationMetadata.latitude = reader.getString();
                } else if ("physicalLocation".equals(fieldName)) {
                    deserializedLocationMetadata.physicalLocation = reader.getString();
                } else if ("pairedRegion".equals(fieldName)) {
                    List<PairedRegion> pairedRegion = reader.readArray(reader1 -> PairedRegion.fromJson(reader1));
                    deserializedLocationMetadata.pairedRegion = pairedRegion;
                } else if ("homeLocation".equals(fieldName)) {
                    deserializedLocationMetadata.homeLocation = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLocationMetadata;
        });
    }
}
