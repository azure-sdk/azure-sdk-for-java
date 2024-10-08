// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The cluster definition.
 */
@Fluent
public final class ClusterDefinition implements JsonSerializable<ClusterDefinition> {
    /*
     * The link to the blueprint.
     */
    private String blueprint;

    /*
     * The type of cluster.
     */
    private String kind;

    /*
     * The versions of different services in the cluster.
     */
    private Map<String, String> componentVersion;

    /*
     * The cluster configurations.
     */
    private Object configurations;

    /**
     * Creates an instance of ClusterDefinition class.
     */
    public ClusterDefinition() {
    }

    /**
     * Get the blueprint property: The link to the blueprint.
     * 
     * @return the blueprint value.
     */
    public String blueprint() {
        return this.blueprint;
    }

    /**
     * Set the blueprint property: The link to the blueprint.
     * 
     * @param blueprint the blueprint value to set.
     * @return the ClusterDefinition object itself.
     */
    public ClusterDefinition withBlueprint(String blueprint) {
        this.blueprint = blueprint;
        return this;
    }

    /**
     * Get the kind property: The type of cluster.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The type of cluster.
     * 
     * @param kind the kind value to set.
     * @return the ClusterDefinition object itself.
     */
    public ClusterDefinition withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the componentVersion property: The versions of different services in the cluster.
     * 
     * @return the componentVersion value.
     */
    public Map<String, String> componentVersion() {
        return this.componentVersion;
    }

    /**
     * Set the componentVersion property: The versions of different services in the cluster.
     * 
     * @param componentVersion the componentVersion value to set.
     * @return the ClusterDefinition object itself.
     */
    public ClusterDefinition withComponentVersion(Map<String, String> componentVersion) {
        this.componentVersion = componentVersion;
        return this;
    }

    /**
     * Get the configurations property: The cluster configurations.
     * 
     * @return the configurations value.
     */
    public Object configurations() {
        return this.configurations;
    }

    /**
     * Set the configurations property: The cluster configurations.
     * 
     * @param configurations the configurations value to set.
     * @return the ClusterDefinition object itself.
     */
    public ClusterDefinition withConfigurations(Object configurations) {
        this.configurations = configurations;
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
        jsonWriter.writeStringField("blueprint", this.blueprint);
        jsonWriter.writeStringField("kind", this.kind);
        jsonWriter.writeMapField("componentVersion", this.componentVersion,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeUntypedField("configurations", this.configurations);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterDefinition if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterDefinition.
     */
    public static ClusterDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterDefinition deserializedClusterDefinition = new ClusterDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("blueprint".equals(fieldName)) {
                    deserializedClusterDefinition.blueprint = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedClusterDefinition.kind = reader.getString();
                } else if ("componentVersion".equals(fieldName)) {
                    Map<String, String> componentVersion = reader.readMap(reader1 -> reader1.getString());
                    deserializedClusterDefinition.componentVersion = componentVersion;
                } else if ("configurations".equals(fieldName)) {
                    deserializedClusterDefinition.configurations = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterDefinition;
        });
    }
}
