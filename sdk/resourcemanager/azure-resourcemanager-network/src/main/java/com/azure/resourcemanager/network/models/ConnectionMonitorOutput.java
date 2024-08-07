// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes a connection monitor output destination.
 */
@Fluent
public final class ConnectionMonitorOutput implements JsonSerializable<ConnectionMonitorOutput> {
    /*
     * Connection monitor output destination type. Currently, only "Workspace" is supported.
     */
    private OutputType type;

    /*
     * Describes the settings for producing output into a log analytics workspace.
     */
    private ConnectionMonitorWorkspaceSettings workspaceSettings;

    /**
     * Creates an instance of ConnectionMonitorOutput class.
     */
    public ConnectionMonitorOutput() {
    }

    /**
     * Get the type property: Connection monitor output destination type. Currently, only "Workspace" is supported.
     * 
     * @return the type value.
     */
    public OutputType type() {
        return this.type;
    }

    /**
     * Set the type property: Connection monitor output destination type. Currently, only "Workspace" is supported.
     * 
     * @param type the type value to set.
     * @return the ConnectionMonitorOutput object itself.
     */
    public ConnectionMonitorOutput withType(OutputType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the workspaceSettings property: Describes the settings for producing output into a log analytics workspace.
     * 
     * @return the workspaceSettings value.
     */
    public ConnectionMonitorWorkspaceSettings workspaceSettings() {
        return this.workspaceSettings;
    }

    /**
     * Set the workspaceSettings property: Describes the settings for producing output into a log analytics workspace.
     * 
     * @param workspaceSettings the workspaceSettings value to set.
     * @return the ConnectionMonitorOutput object itself.
     */
    public ConnectionMonitorOutput withWorkspaceSettings(ConnectionMonitorWorkspaceSettings workspaceSettings) {
        this.workspaceSettings = workspaceSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (workspaceSettings() != null) {
            workspaceSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeJsonField("workspaceSettings", this.workspaceSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectionMonitorOutput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectionMonitorOutput if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectionMonitorOutput.
     */
    public static ConnectionMonitorOutput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectionMonitorOutput deserializedConnectionMonitorOutput = new ConnectionMonitorOutput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedConnectionMonitorOutput.type = OutputType.fromString(reader.getString());
                } else if ("workspaceSettings".equals(fieldName)) {
                    deserializedConnectionMonitorOutput.workspaceSettings
                        = ConnectionMonitorWorkspaceSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectionMonitorOutput;
        });
    }
}
