// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Replication group details. This will be used in case of San.
 */
@Immutable
public final class ReplicationGroupDetails extends ConfigurationSettings {
    /*
     * Gets the class type. Overridden in derived classes.
     */
    private String instanceType = "ReplicationGroupDetails";

    /**
     * Creates an instance of ReplicationGroupDetails class.
     */
    public ReplicationGroupDetails() {
    }

    /**
     * Get the instanceType property: Gets the class type. Overridden in derived classes.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceType", this.instanceType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReplicationGroupDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReplicationGroupDetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReplicationGroupDetails.
     */
    public static ReplicationGroupDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReplicationGroupDetails deserializedReplicationGroupDetails = new ReplicationGroupDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedReplicationGroupDetails.instanceType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReplicationGroupDetails;
        });
    }
}
