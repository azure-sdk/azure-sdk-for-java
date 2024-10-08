// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.inference.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Measurement of the amount of tokens used in this request and response.
 */
@Immutable
public final class EmbeddingsUsage implements JsonSerializable<EmbeddingsUsage> {

    /*
     * Number of tokens in the request.
     */
    @Generated
    private final int promptTokens;

    /*
     * Total number of tokens transacted in this request/response. Should equal the
     * number of tokens in the request.
     */
    @Generated
    private final int totalTokens;

    /**
     * Creates an instance of EmbeddingsUsage class.
     *
     * @param promptTokens the promptTokens value to set.
     * @param totalTokens the totalTokens value to set.
     */
    @Generated
    private EmbeddingsUsage(int promptTokens, int totalTokens) {
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
    }

    /**
     * Get the promptTokens property: Number of tokens in the request.
     *
     * @return the promptTokens value.
     */
    @Generated
    public int getPromptTokens() {
        return this.promptTokens;
    }

    /**
     * Get the totalTokens property: Total number of tokens transacted in this request/response. Should equal the
     * number of tokens in the request.
     *
     * @return the totalTokens value.
     */
    @Generated
    public int getTotalTokens() {
        return this.totalTokens;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("prompt_tokens", this.promptTokens);
        jsonWriter.writeIntField("total_tokens", this.totalTokens);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EmbeddingsUsage from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of EmbeddingsUsage if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EmbeddingsUsage.
     */
    @Generated
    public static EmbeddingsUsage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int promptTokens = 0;
            int totalTokens = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("prompt_tokens".equals(fieldName)) {
                    promptTokens = reader.getInt();
                } else if ("total_tokens".equals(fieldName)) {
                    totalTokens = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }
            return new EmbeddingsUsage(promptTokens, totalTokens);
        });
    }
}
