// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The StorageQoSPolicy definition.
 */
@Fluent
public final class StorageQosPolicy implements JsonSerializable<StorageQosPolicy> {
    /*
     * The name of the policy.
     */
    private String name;

    /*
     * The ID of the QoS policy.
     */
    private String id;

    /*
     * The maximum IO operations per second.
     */
    private Long iopsMaximum;

    /*
     * The minimum IO operations per second.
     */
    private Long iopsMinimum;

    /*
     * The Bandwidth Limit for internet traffic.
     */
    private Long bandwidthLimit;

    /*
     * The underlying policy.
     */
    private String policyId;

    /**
     * Creates an instance of StorageQosPolicy class.
     */
    public StorageQosPolicy() {
    }

    /**
     * Get the name property: The name of the policy.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the policy.
     * 
     * @param name the name value to set.
     * @return the StorageQosPolicy object itself.
     */
    public StorageQosPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: The ID of the QoS policy.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the QoS policy.
     * 
     * @param id the id value to set.
     * @return the StorageQosPolicy object itself.
     */
    public StorageQosPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the iopsMaximum property: The maximum IO operations per second.
     * 
     * @return the iopsMaximum value.
     */
    public Long iopsMaximum() {
        return this.iopsMaximum;
    }

    /**
     * Set the iopsMaximum property: The maximum IO operations per second.
     * 
     * @param iopsMaximum the iopsMaximum value to set.
     * @return the StorageQosPolicy object itself.
     */
    public StorageQosPolicy withIopsMaximum(Long iopsMaximum) {
        this.iopsMaximum = iopsMaximum;
        return this;
    }

    /**
     * Get the iopsMinimum property: The minimum IO operations per second.
     * 
     * @return the iopsMinimum value.
     */
    public Long iopsMinimum() {
        return this.iopsMinimum;
    }

    /**
     * Set the iopsMinimum property: The minimum IO operations per second.
     * 
     * @param iopsMinimum the iopsMinimum value to set.
     * @return the StorageQosPolicy object itself.
     */
    public StorageQosPolicy withIopsMinimum(Long iopsMinimum) {
        this.iopsMinimum = iopsMinimum;
        return this;
    }

    /**
     * Get the bandwidthLimit property: The Bandwidth Limit for internet traffic.
     * 
     * @return the bandwidthLimit value.
     */
    public Long bandwidthLimit() {
        return this.bandwidthLimit;
    }

    /**
     * Set the bandwidthLimit property: The Bandwidth Limit for internet traffic.
     * 
     * @param bandwidthLimit the bandwidthLimit value to set.
     * @return the StorageQosPolicy object itself.
     */
    public StorageQosPolicy withBandwidthLimit(Long bandwidthLimit) {
        this.bandwidthLimit = bandwidthLimit;
        return this;
    }

    /**
     * Get the policyId property: The underlying policy.
     * 
     * @return the policyId value.
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Set the policyId property: The underlying policy.
     * 
     * @param policyId the policyId value to set.
     * @return the StorageQosPolicy object itself.
     */
    public StorageQosPolicy withPolicyId(String policyId) {
        this.policyId = policyId;
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
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeNumberField("iopsMaximum", this.iopsMaximum);
        jsonWriter.writeNumberField("iopsMinimum", this.iopsMinimum);
        jsonWriter.writeNumberField("bandwidthLimit", this.bandwidthLimit);
        jsonWriter.writeStringField("policyId", this.policyId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageQosPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageQosPolicy if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageQosPolicy.
     */
    public static StorageQosPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageQosPolicy deserializedStorageQosPolicy = new StorageQosPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedStorageQosPolicy.name = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedStorageQosPolicy.id = reader.getString();
                } else if ("iopsMaximum".equals(fieldName)) {
                    deserializedStorageQosPolicy.iopsMaximum = reader.getNullable(JsonReader::getLong);
                } else if ("iopsMinimum".equals(fieldName)) {
                    deserializedStorageQosPolicy.iopsMinimum = reader.getNullable(JsonReader::getLong);
                } else if ("bandwidthLimit".equals(fieldName)) {
                    deserializedStorageQosPolicy.bandwidthLimit = reader.getNullable(JsonReader::getLong);
                } else if ("policyId".equals(fieldName)) {
                    deserializedStorageQosPolicy.policyId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageQosPolicy;
        });
    }
}
