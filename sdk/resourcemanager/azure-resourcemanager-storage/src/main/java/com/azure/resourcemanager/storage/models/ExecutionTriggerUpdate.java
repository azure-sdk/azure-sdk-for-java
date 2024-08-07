// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Execution trigger update for storage task assignment.
 */
@Fluent
public final class ExecutionTriggerUpdate implements JsonSerializable<ExecutionTriggerUpdate> {
    /*
     * The trigger type of the storage task assignment execution
     */
    private TriggerType type;

    /*
     * The trigger parameters of the storage task assignment execution
     */
    private TriggerParametersUpdate parameters;

    /**
     * Creates an instance of ExecutionTriggerUpdate class.
     */
    public ExecutionTriggerUpdate() {
    }

    /**
     * Get the type property: The trigger type of the storage task assignment execution.
     * 
     * @return the type value.
     */
    public TriggerType type() {
        return this.type;
    }

    /**
     * Set the type property: The trigger type of the storage task assignment execution.
     * 
     * @param type the type value to set.
     * @return the ExecutionTriggerUpdate object itself.
     */
    public ExecutionTriggerUpdate withType(TriggerType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the parameters property: The trigger parameters of the storage task assignment execution.
     * 
     * @return the parameters value.
     */
    public TriggerParametersUpdate parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The trigger parameters of the storage task assignment execution.
     * 
     * @param parameters the parameters value to set.
     * @return the ExecutionTriggerUpdate object itself.
     */
    public ExecutionTriggerUpdate withParameters(TriggerParametersUpdate parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameters() != null) {
            parameters().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeJsonField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExecutionTriggerUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExecutionTriggerUpdate if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExecutionTriggerUpdate.
     */
    public static ExecutionTriggerUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExecutionTriggerUpdate deserializedExecutionTriggerUpdate = new ExecutionTriggerUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedExecutionTriggerUpdate.type = TriggerType.fromString(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    deserializedExecutionTriggerUpdate.parameters = TriggerParametersUpdate.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExecutionTriggerUpdate;
        });
    }
}
