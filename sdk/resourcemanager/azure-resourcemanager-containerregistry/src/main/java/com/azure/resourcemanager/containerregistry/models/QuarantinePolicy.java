// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The quarantine policy for a container registry.
 */
@Fluent
public final class QuarantinePolicy implements JsonSerializable<QuarantinePolicy> {
    /*
     * The value that indicates whether the policy is enabled or not.
     */
    private PolicyStatus status;

    /**
     * Creates an instance of QuarantinePolicy class.
     */
    public QuarantinePolicy() {
    }

    /**
     * Get the status property: The value that indicates whether the policy is enabled or not.
     * 
     * @return the status value.
     */
    public PolicyStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The value that indicates whether the policy is enabled or not.
     * 
     * @param status the status value to set.
     * @return the QuarantinePolicy object itself.
     */
    public QuarantinePolicy withStatus(PolicyStatus status) {
        this.status = status;
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
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QuarantinePolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QuarantinePolicy if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the QuarantinePolicy.
     */
    public static QuarantinePolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QuarantinePolicy deserializedQuarantinePolicy = new QuarantinePolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedQuarantinePolicy.status = PolicyStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQuarantinePolicy;
        });
    }
}
