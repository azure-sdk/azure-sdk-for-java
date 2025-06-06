// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.models.ClusterProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * The properties of a cluster.
 */
@Fluent
public final class ClusterProperties implements JsonSerializable<ClusterProperties> {
    /*
     * The cluster size
     */
    private Integer clusterSize;

    /*
     * The state of the cluster provisioning
     */
    private ClusterProvisioningState provisioningState;

    /*
     * The identity
     */
    private Integer clusterId;

    /*
     * The hosts
     */
    private List<String> hosts;

    /*
     * Name of the vsan datastore associated with the cluster
     */
    private String vsanDatastoreName;

    /**
     * Creates an instance of ClusterProperties class.
     */
    public ClusterProperties() {
    }

    /**
     * Get the clusterSize property: The cluster size.
     * 
     * @return the clusterSize value.
     */
    public Integer clusterSize() {
        return this.clusterSize;
    }

    /**
     * Set the clusterSize property: The cluster size.
     * 
     * @param clusterSize the clusterSize value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withClusterSize(Integer clusterSize) {
        this.clusterSize = clusterSize;
        return this;
    }

    /**
     * Get the provisioningState property: The state of the cluster provisioning.
     * 
     * @return the provisioningState value.
     */
    public ClusterProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the clusterId property: The identity.
     * 
     * @return the clusterId value.
     */
    public Integer clusterId() {
        return this.clusterId;
    }

    /**
     * Get the hosts property: The hosts.
     * 
     * @return the hosts value.
     */
    public List<String> hosts() {
        return this.hosts;
    }

    /**
     * Set the hosts property: The hosts.
     * 
     * @param hosts the hosts value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    /**
     * Get the vsanDatastoreName property: Name of the vsan datastore associated with the cluster.
     * 
     * @return the vsanDatastoreName value.
     */
    public String vsanDatastoreName() {
        return this.vsanDatastoreName;
    }

    /**
     * Set the vsanDatastoreName property: Name of the vsan datastore associated with the cluster.
     * 
     * @param vsanDatastoreName the vsanDatastoreName value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withVsanDatastoreName(String vsanDatastoreName) {
        this.vsanDatastoreName = vsanDatastoreName;
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
        jsonWriter.writeNumberField("clusterSize", this.clusterSize);
        jsonWriter.writeArrayField("hosts", this.hosts, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("vsanDatastoreName", this.vsanDatastoreName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterProperties.
     */
    public static ClusterProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterProperties deserializedClusterProperties = new ClusterProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("clusterSize".equals(fieldName)) {
                    deserializedClusterProperties.clusterSize = reader.getNullable(JsonReader::getInt);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedClusterProperties.provisioningState
                        = ClusterProvisioningState.fromString(reader.getString());
                } else if ("clusterId".equals(fieldName)) {
                    deserializedClusterProperties.clusterId = reader.getNullable(JsonReader::getInt);
                } else if ("hosts".equals(fieldName)) {
                    List<String> hosts = reader.readArray(reader1 -> reader1.getString());
                    deserializedClusterProperties.hosts = hosts;
                } else if ("vsanDatastoreName".equals(fieldName)) {
                    deserializedClusterProperties.vsanDatastoreName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterProperties;
        });
    }
}
