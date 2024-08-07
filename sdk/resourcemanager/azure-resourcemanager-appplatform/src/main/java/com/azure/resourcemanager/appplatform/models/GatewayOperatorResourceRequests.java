// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of the Spring Cloud Gateway Operator.
 */
@Immutable
public final class GatewayOperatorResourceRequests implements JsonSerializable<GatewayOperatorResourceRequests> {
    /*
     * Cpu allocated to each Spring Cloud Gateway Operator instance.
     */
    private String cpu;

    /*
     * Memory allocated to each Spring Cloud Gateway Operator instance.
     */
    private String memory;

    /*
     * Instance count of the Spring Cloud Gateway Operator.
     */
    private Integer instanceCount;

    /**
     * Creates an instance of GatewayOperatorResourceRequests class.
     */
    public GatewayOperatorResourceRequests() {
    }

    /**
     * Get the cpu property: Cpu allocated to each Spring Cloud Gateway Operator instance.
     * 
     * @return the cpu value.
     */
    public String cpu() {
        return this.cpu;
    }

    /**
     * Get the memory property: Memory allocated to each Spring Cloud Gateway Operator instance.
     * 
     * @return the memory value.
     */
    public String memory() {
        return this.memory;
    }

    /**
     * Get the instanceCount property: Instance count of the Spring Cloud Gateway Operator.
     * 
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.instanceCount;
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
     * Reads an instance of GatewayOperatorResourceRequests from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GatewayOperatorResourceRequests if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GatewayOperatorResourceRequests.
     */
    public static GatewayOperatorResourceRequests fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GatewayOperatorResourceRequests deserializedGatewayOperatorResourceRequests
                = new GatewayOperatorResourceRequests();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("cpu".equals(fieldName)) {
                    deserializedGatewayOperatorResourceRequests.cpu = reader.getString();
                } else if ("memory".equals(fieldName)) {
                    deserializedGatewayOperatorResourceRequests.memory = reader.getString();
                } else if ("instanceCount".equals(fieldName)) {
                    deserializedGatewayOperatorResourceRequests.instanceCount = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGatewayOperatorResourceRequests;
        });
    }
}
