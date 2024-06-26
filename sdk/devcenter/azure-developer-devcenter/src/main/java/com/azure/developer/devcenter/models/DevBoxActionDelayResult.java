// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.devcenter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.models.ResponseError;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The action delay result.
 */
@Immutable
public final class DevBoxActionDelayResult implements JsonSerializable<DevBoxActionDelayResult> {

    /*
     * The name of the action.
     */
    @Generated
    private final String actionName;

    /*
     * The delayed action.
     */
    @Generated
    private DevBoxAction action;

    /*
     * Information about the error that occurred. Only populated on error.
     */
    @Generated
    private ResponseError error;

    /**
     * Creates an instance of DevBoxActionDelayResult class.
     *
     * @param actionName the actionName value to set.
     * @param delayStatus the delayStatus value to set.
     */
    @Generated
    private DevBoxActionDelayResult(String actionName, DevBoxActionDelayStatus delayStatus) {
        this.actionName = actionName;
        this.delayStatus = delayStatus;
    }

    /**
     * Get the actionName property: The name of the action.
     *
     * @return the actionName value.
     */
    @Generated
    public String getActionName() {
        return this.actionName;
    }

    /**
     * Get the action property: The delayed action.
     *
     * @return the action value.
     */
    @Generated
    public DevBoxAction getAction() {
        return this.action;
    }

    /**
     * Get the error property: Information about the error that occurred. Only populated on error.
     *
     * @return the error value.
     */
    @Generated
    public ResponseError getError() {
        return this.error;
    }

    /*
     * The result of the delay operation on this action.
     */
    @Generated
    private final DevBoxActionDelayStatus delayStatus;

    /**
     * Get the delayStatus property: The result of the delay operation on this action.
     *
     * @return the delayStatus value.
     */
    @Generated
    public DevBoxActionDelayStatus getDelayStatus() {
        return this.delayStatus;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.actionName);
        jsonWriter.writeStringField("result", this.delayStatus == null ? null : this.delayStatus.toString());
        jsonWriter.writeJsonField("action", this.action);
        jsonWriter.writeJsonField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DevBoxActionDelayResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DevBoxActionDelayResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DevBoxActionDelayResult.
     */
    @Generated
    public static DevBoxActionDelayResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String actionName = null;
            DevBoxActionDelayStatus delayStatus = null;
            DevBoxAction action = null;
            ResponseError error = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("name".equals(fieldName)) {
                    actionName = reader.getString();
                } else if ("result".equals(fieldName)) {
                    delayStatus = DevBoxActionDelayStatus.fromString(reader.getString());
                } else if ("action".equals(fieldName)) {
                    action = DevBoxAction.fromJson(reader);
                } else if ("error".equals(fieldName)) {
                    error = ResponseError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            DevBoxActionDelayResult deserializedDevBoxActionDelayResult
                = new DevBoxActionDelayResult(actionName, delayStatus);
            deserializedDevBoxActionDelayResult.action = action;
            deserializedDevBoxActionDelayResult.error = error;
            return deserializedDevBoxActionDelayResult;
        });
    }
}
