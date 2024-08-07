// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Linked server Id.
 */
@Immutable
public final class RedisLinkedServer implements JsonSerializable<RedisLinkedServer> {
    /*
     * Linked server Id.
     */
    private String id;

    /**
     * Creates an instance of RedisLinkedServer class.
     */
    public RedisLinkedServer() {
    }

    /**
     * Get the id property: Linked server Id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
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
     * Reads an instance of RedisLinkedServer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedisLinkedServer if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RedisLinkedServer.
     */
    public static RedisLinkedServer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedisLinkedServer deserializedRedisLinkedServer = new RedisLinkedServer();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRedisLinkedServer.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRedisLinkedServer;
        });
    }
}
