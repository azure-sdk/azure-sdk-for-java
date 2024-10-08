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
 * Cluster pool version properties.
 */
@Fluent
public final class ClusterPoolVersionProperties implements JsonSerializable<ClusterPoolVersionProperties> {
    /*
     * Cluster pool version is a 2-part version.
     */
    private String clusterPoolVersion;

    /*
     * AKS version.
     */
    private String aksVersion;

    /*
     * Indicate if this version is in preview or not.
     */
    private Boolean isPreview;

    /**
     * Creates an instance of ClusterPoolVersionProperties class.
     */
    public ClusterPoolVersionProperties() {
    }

    /**
     * Get the clusterPoolVersion property: Cluster pool version is a 2-part version.
     * 
     * @return the clusterPoolVersion value.
     */
    public String clusterPoolVersion() {
        return this.clusterPoolVersion;
    }

    /**
     * Set the clusterPoolVersion property: Cluster pool version is a 2-part version.
     * 
     * @param clusterPoolVersion the clusterPoolVersion value to set.
     * @return the ClusterPoolVersionProperties object itself.
     */
    public ClusterPoolVersionProperties withClusterPoolVersion(String clusterPoolVersion) {
        this.clusterPoolVersion = clusterPoolVersion;
        return this;
    }

    /**
     * Get the aksVersion property: AKS version.
     * 
     * @return the aksVersion value.
     */
    public String aksVersion() {
        return this.aksVersion;
    }

    /**
     * Set the aksVersion property: AKS version.
     * 
     * @param aksVersion the aksVersion value to set.
     * @return the ClusterPoolVersionProperties object itself.
     */
    public ClusterPoolVersionProperties withAksVersion(String aksVersion) {
        this.aksVersion = aksVersion;
        return this;
    }

    /**
     * Get the isPreview property: Indicate if this version is in preview or not.
     * 
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Set the isPreview property: Indicate if this version is in preview or not.
     * 
     * @param isPreview the isPreview value to set.
     * @return the ClusterPoolVersionProperties object itself.
     */
    public ClusterPoolVersionProperties withIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
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
        jsonWriter.writeStringField("clusterPoolVersion", this.clusterPoolVersion);
        jsonWriter.writeStringField("aksVersion", this.aksVersion);
        jsonWriter.writeBooleanField("isPreview", this.isPreview);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterPoolVersionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPoolVersionProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterPoolVersionProperties.
     */
    public static ClusterPoolVersionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPoolVersionProperties deserializedClusterPoolVersionProperties = new ClusterPoolVersionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("clusterPoolVersion".equals(fieldName)) {
                    deserializedClusterPoolVersionProperties.clusterPoolVersion = reader.getString();
                } else if ("aksVersion".equals(fieldName)) {
                    deserializedClusterPoolVersionProperties.aksVersion = reader.getString();
                } else if ("isPreview".equals(fieldName)) {
                    deserializedClusterPoolVersionProperties.isPreview = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPoolVersionProperties;
        });
    }
}
