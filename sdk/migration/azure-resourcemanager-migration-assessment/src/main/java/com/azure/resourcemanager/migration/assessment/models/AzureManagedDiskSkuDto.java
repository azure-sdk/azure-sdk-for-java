// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Class representing an Azure Managed Disk SKU.
 */
@Immutable
public final class AzureManagedDiskSkuDto implements JsonSerializable<AzureManagedDiskSkuDto> {
    /*
     * Gets the Type ("tier") of disk - e.g. standard, premium, ultra.
     */
    private AzureManagedDiskSkuDtoDiskType diskType;

    /*
     * Gets the Size of the managed disk - e.g. P30, P40.
     */
    private AzureDiskSize diskSize;

    /*
     * Gets disk redundancy - e.g. LRS, ZRS.
     */
    private AzureManagedDiskSkuDtoDiskRedundancy diskRedundancy;

    /*
     * Gets the managed disk storage cost.
     */
    private Float storageCost;

    /*
     * Gets the recommended in GB of the managed disk.
     */
    private Float recommendedSizeInGib;

    /*
     * Gets the recommended throughput in MBPS of the managed disk.
     */
    private Float recommendedThroughputInMbps;

    /*
     * Gets the recommended IOPS of the managed disk.
     */
    private Float recommendedIops;

    /**
     * Creates an instance of AzureManagedDiskSkuDto class.
     */
    public AzureManagedDiskSkuDto() {
    }

    /**
     * Get the diskType property: Gets the Type ("tier") of disk - e.g. standard, premium, ultra.
     * 
     * @return the diskType value.
     */
    public AzureManagedDiskSkuDtoDiskType diskType() {
        return this.diskType;
    }

    /**
     * Get the diskSize property: Gets the Size of the managed disk - e.g. P30, P40.
     * 
     * @return the diskSize value.
     */
    public AzureDiskSize diskSize() {
        return this.diskSize;
    }

    /**
     * Get the diskRedundancy property: Gets disk redundancy - e.g. LRS, ZRS.
     * 
     * @return the diskRedundancy value.
     */
    public AzureManagedDiskSkuDtoDiskRedundancy diskRedundancy() {
        return this.diskRedundancy;
    }

    /**
     * Get the storageCost property: Gets the managed disk storage cost.
     * 
     * @return the storageCost value.
     */
    public Float storageCost() {
        return this.storageCost;
    }

    /**
     * Get the recommendedSizeInGib property: Gets the recommended in GB of the managed disk.
     * 
     * @return the recommendedSizeInGib value.
     */
    public Float recommendedSizeInGib() {
        return this.recommendedSizeInGib;
    }

    /**
     * Get the recommendedThroughputInMbps property: Gets the recommended throughput in MBPS of the managed disk.
     * 
     * @return the recommendedThroughputInMbps value.
     */
    public Float recommendedThroughputInMbps() {
        return this.recommendedThroughputInMbps;
    }

    /**
     * Get the recommendedIops property: Gets the recommended IOPS of the managed disk.
     * 
     * @return the recommendedIops value.
     */
    public Float recommendedIops() {
        return this.recommendedIops;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureManagedDiskSkuDto from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureManagedDiskSkuDto if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureManagedDiskSkuDto.
     */
    public static AzureManagedDiskSkuDto fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureManagedDiskSkuDto deserializedAzureManagedDiskSkuDto = new AzureManagedDiskSkuDto();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("diskType".equals(fieldName)) {
                    deserializedAzureManagedDiskSkuDto.diskType
                        = AzureManagedDiskSkuDtoDiskType.fromString(reader.getString());
                } else if ("diskSize".equals(fieldName)) {
                    deserializedAzureManagedDiskSkuDto.diskSize = AzureDiskSize.fromString(reader.getString());
                } else if ("diskRedundancy".equals(fieldName)) {
                    deserializedAzureManagedDiskSkuDto.diskRedundancy
                        = AzureManagedDiskSkuDtoDiskRedundancy.fromString(reader.getString());
                } else if ("storageCost".equals(fieldName)) {
                    deserializedAzureManagedDiskSkuDto.storageCost = reader.getNullable(JsonReader::getFloat);
                } else if ("recommendedSizeInGib".equals(fieldName)) {
                    deserializedAzureManagedDiskSkuDto.recommendedSizeInGib = reader.getNullable(JsonReader::getFloat);
                } else if ("recommendedThroughputInMbps".equals(fieldName)) {
                    deserializedAzureManagedDiskSkuDto.recommendedThroughputInMbps
                        = reader.getNullable(JsonReader::getFloat);
                } else if ("recommendedIops".equals(fieldName)) {
                    deserializedAzureManagedDiskSkuDto.recommendedIops = reader.getNullable(JsonReader::getFloat);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureManagedDiskSkuDto;
        });
    }
}
