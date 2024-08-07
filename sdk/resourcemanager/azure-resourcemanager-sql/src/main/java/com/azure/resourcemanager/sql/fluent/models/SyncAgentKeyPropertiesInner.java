// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of an Azure SQL Database sync agent key.
 */
@Immutable
public final class SyncAgentKeyPropertiesInner implements JsonSerializable<SyncAgentKeyPropertiesInner> {
    /*
     * Key of sync agent.
     */
    private String syncAgentKey;

    /**
     * Creates an instance of SyncAgentKeyPropertiesInner class.
     */
    public SyncAgentKeyPropertiesInner() {
    }

    /**
     * Get the syncAgentKey property: Key of sync agent.
     * 
     * @return the syncAgentKey value.
     */
    public String syncAgentKey() {
        return this.syncAgentKey;
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
     * Reads an instance of SyncAgentKeyPropertiesInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SyncAgentKeyPropertiesInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SyncAgentKeyPropertiesInner.
     */
    public static SyncAgentKeyPropertiesInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SyncAgentKeyPropertiesInner deserializedSyncAgentKeyPropertiesInner = new SyncAgentKeyPropertiesInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("syncAgentKey".equals(fieldName)) {
                    deserializedSyncAgentKeyPropertiesInner.syncAgentKey = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSyncAgentKeyPropertiesInner;
        });
    }
}
