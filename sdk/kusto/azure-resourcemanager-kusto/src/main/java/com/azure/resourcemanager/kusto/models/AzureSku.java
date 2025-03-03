// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Azure SKU definition.
 */
@Fluent
public final class AzureSku implements JsonSerializable<AzureSku> {
    /*
     * SKU name.
     */
    private AzureSkuName name;

    /*
     * The number of instances of the cluster.
     */
    private Integer capacity;

    /*
     * SKU tier.
     */
    private AzureSkuTier tier;

    /**
     * Creates an instance of AzureSku class.
     */
    public AzureSku() {
    }

    /**
     * Get the name property: SKU name.
     * 
     * @return the name value.
     */
    public AzureSkuName name() {
        return this.name;
    }

    /**
     * Set the name property: SKU name.
     * 
     * @param name the name value to set.
     * @return the AzureSku object itself.
     */
    public AzureSku withName(AzureSkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the capacity property: The number of instances of the cluster.
     * 
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The number of instances of the cluster.
     * 
     * @param capacity the capacity value to set.
     * @return the AzureSku object itself.
     */
    public AzureSku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the tier property: SKU tier.
     * 
     * @return the tier value.
     */
    public AzureSkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: SKU tier.
     * 
     * @param tier the tier value to set.
     * @return the AzureSku object itself.
     */
    public AzureSku withTier(AzureSkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model AzureSku"));
        }
        if (tier() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property tier in model AzureSku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureSku.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name == null ? null : this.name.toString());
        jsonWriter.writeStringField("tier", this.tier == null ? null : this.tier.toString());
        jsonWriter.writeNumberField("capacity", this.capacity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureSku from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureSku if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureSku.
     */
    public static AzureSku fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureSku deserializedAzureSku = new AzureSku();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAzureSku.name = AzureSkuName.fromString(reader.getString());
                } else if ("tier".equals(fieldName)) {
                    deserializedAzureSku.tier = AzureSkuTier.fromString(reader.getString());
                } else if ("capacity".equals(fieldName)) {
                    deserializedAzureSku.capacity = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureSku;
        });
    }
}
