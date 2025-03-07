// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.defendereasm.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.defendereasm.models.ResourceBaseProperties;
import com.azure.resourcemanager.defendereasm.models.ResourceState;
import java.io.IOException;

/**
 * Task properties.
 */
@Fluent
public final class TaskResourceProperties extends ResourceBaseProperties {
    /*
     * The time the task started
     */
    private String startedAt;

    /*
     * The time the task completed
     */
    private String completedAt;

    /*
     * The last time the task was polled
     */
    private String lastPolledAt;

    /*
     * the state the task is in
     */
    private String state;

    /*
     * the phase the task is in
     */
    private String phase;

    /*
     * The reason the task was moved into its current state, if the task wasn't completed.
     */
    private String reason;

    /*
     * The reason the task was moved into its current state, if the task wasn't completed.
     */
    private Object metadata;

    /*
     * Resource provisioning state.
     */
    private ResourceState provisioningState;

    /**
     * Creates an instance of TaskResourceProperties class.
     */
    public TaskResourceProperties() {
    }

    /**
     * Get the startedAt property: The time the task started.
     * 
     * @return the startedAt value.
     */
    public String startedAt() {
        return this.startedAt;
    }

    /**
     * Set the startedAt property: The time the task started.
     * 
     * @param startedAt the startedAt value to set.
     * @return the TaskResourceProperties object itself.
     */
    public TaskResourceProperties withStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get the completedAt property: The time the task completed.
     * 
     * @return the completedAt value.
     */
    public String completedAt() {
        return this.completedAt;
    }

    /**
     * Set the completedAt property: The time the task completed.
     * 
     * @param completedAt the completedAt value to set.
     * @return the TaskResourceProperties object itself.
     */
    public TaskResourceProperties withCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * Get the lastPolledAt property: The last time the task was polled.
     * 
     * @return the lastPolledAt value.
     */
    public String lastPolledAt() {
        return this.lastPolledAt;
    }

    /**
     * Set the lastPolledAt property: The last time the task was polled.
     * 
     * @param lastPolledAt the lastPolledAt value to set.
     * @return the TaskResourceProperties object itself.
     */
    public TaskResourceProperties withLastPolledAt(String lastPolledAt) {
        this.lastPolledAt = lastPolledAt;
        return this;
    }

    /**
     * Get the state property: the state the task is in.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: the state the task is in.
     * 
     * @param state the state value to set.
     * @return the TaskResourceProperties object itself.
     */
    public TaskResourceProperties withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the phase property: the phase the task is in.
     * 
     * @return the phase value.
     */
    public String phase() {
        return this.phase;
    }

    /**
     * Set the phase property: the phase the task is in.
     * 
     * @param phase the phase value to set.
     * @return the TaskResourceProperties object itself.
     */
    public TaskResourceProperties withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * Get the reason property: The reason the task was moved into its current state, if the task wasn't completed.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason the task was moved into its current state, if the task wasn't completed.
     * 
     * @param reason the reason value to set.
     * @return the TaskResourceProperties object itself.
     */
    public TaskResourceProperties withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the metadata property: The reason the task was moved into its current state, if the task wasn't completed.
     * 
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The reason the task was moved into its current state, if the task wasn't completed.
     * 
     * @param metadata the metadata value to set.
     * @return the TaskResourceProperties object itself.
     */
    public TaskResourceProperties withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the provisioningState property: Resource provisioning state.
     * 
     * @return the provisioningState value.
     */
    @Override
    public ResourceState provisioningState() {
        return this.provisioningState;
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
        jsonWriter.writeStringField("startedAt", this.startedAt);
        jsonWriter.writeStringField("completedAt", this.completedAt);
        jsonWriter.writeStringField("lastPolledAt", this.lastPolledAt);
        jsonWriter.writeStringField("state", this.state);
        jsonWriter.writeStringField("phase", this.phase);
        jsonWriter.writeStringField("reason", this.reason);
        jsonWriter.writeUntypedField("metadata", this.metadata);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TaskResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TaskResourceProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TaskResourceProperties.
     */
    public static TaskResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TaskResourceProperties deserializedTaskResourceProperties = new TaskResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedTaskResourceProperties.provisioningState = ResourceState.fromString(reader.getString());
                } else if ("startedAt".equals(fieldName)) {
                    deserializedTaskResourceProperties.startedAt = reader.getString();
                } else if ("completedAt".equals(fieldName)) {
                    deserializedTaskResourceProperties.completedAt = reader.getString();
                } else if ("lastPolledAt".equals(fieldName)) {
                    deserializedTaskResourceProperties.lastPolledAt = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedTaskResourceProperties.state = reader.getString();
                } else if ("phase".equals(fieldName)) {
                    deserializedTaskResourceProperties.phase = reader.getString();
                } else if ("reason".equals(fieldName)) {
                    deserializedTaskResourceProperties.reason = reader.getString();
                } else if ("metadata".equals(fieldName)) {
                    deserializedTaskResourceProperties.metadata = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTaskResourceProperties;
        });
    }
}
