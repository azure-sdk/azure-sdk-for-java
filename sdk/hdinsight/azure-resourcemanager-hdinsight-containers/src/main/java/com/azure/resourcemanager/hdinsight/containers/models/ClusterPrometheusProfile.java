// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Cluster Prometheus profile.
 */
@Fluent
public final class ClusterPrometheusProfile implements JsonSerializable<ClusterPrometheusProfile> {
    /*
     * Enable Prometheus for cluster or not.
     */
    private boolean enabled;

    /**
     * Creates an instance of ClusterPrometheusProfile class.
     */
    public ClusterPrometheusProfile() {
    }

    /**
     * Get the enabled property: Enable Prometheus for cluster or not.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Enable Prometheus for cluster or not.
     * 
     * @param enabled the enabled value to set.
     * @return the ClusterPrometheusProfile object itself.
     */
    public ClusterPrometheusProfile withEnabled(boolean enabled) {
        this.enabled = enabled;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterPrometheusProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPrometheusProfile if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterPrometheusProfile.
     */
    public static ClusterPrometheusProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPrometheusProfile deserializedClusterPrometheusProfile = new ClusterPrometheusProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedClusterPrometheusProfile.enabled = reader.getBoolean();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPrometheusProfile;
        });
    }
}
