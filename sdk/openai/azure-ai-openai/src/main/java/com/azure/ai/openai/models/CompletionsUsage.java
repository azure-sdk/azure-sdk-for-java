// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Representation of the token counts processed for a completions request.
 * Counts consider all tokens across prompts, choices, choice alternates, best_of generations, and
 * other consumers.
 */
@Immutable
public final class CompletionsUsage implements JsonSerializable<CompletionsUsage> {

    /*
     * The number of tokens generated across all completions emissions.
     */
    @Generated
    private final int completionTokens;

    /*
     * The number of tokens in the provided prompts for the completions request.
     */
    @Generated
    private final int promptTokens;

    /*
     * The total number of tokens processed for the completions request and response.
     */
    @Generated
    private final int totalTokens;

    /**
     * Creates an instance of CompletionsUsage class.
     *
     * @param completionTokens the completionTokens value to set.
     * @param promptTokens the promptTokens value to set.
     * @param totalTokens the totalTokens value to set.
     */
    @Generated
    private CompletionsUsage(int completionTokens, int promptTokens, int totalTokens) {
        this.completionTokens = completionTokens;
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
    }

    /**
     * Get the completionTokens property: The number of tokens generated across all completions emissions.
     *
     * @return the completionTokens value.
     */
    @Generated
    public int getCompletionTokens() {
        return this.completionTokens;
    }

    /**
     * Get the promptTokens property: The number of tokens in the provided prompts for the completions request.
     *
     * @return the promptTokens value.
     */
    @Generated
    public int getPromptTokens() {
        return this.promptTokens;
    }

    /**
     * Get the totalTokens property: The total number of tokens processed for the completions request and response.
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
        jsonWriter.writeIntField("completion_tokens", this.completionTokens);
        jsonWriter.writeIntField("prompt_tokens", this.promptTokens);
        jsonWriter.writeIntField("total_tokens", this.totalTokens);
        jsonWriter.writeJsonField("prompt_tokens_details", this.promptTokensDetails);
        jsonWriter.writeJsonField("completion_tokens_details", this.completionTokensDetails);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CompletionsUsage from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CompletionsUsage if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CompletionsUsage.
     */
    @Generated
    public static CompletionsUsage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int completionTokens = 0;
            int promptTokens = 0;
            int totalTokens = 0;
            CompletionsUsagePromptTokensDetails promptTokensDetails = null;
            CompletionsUsageCompletionTokensDetails completionTokensDetails = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("completion_tokens".equals(fieldName)) {
                    completionTokens = reader.getInt();
                } else if ("prompt_tokens".equals(fieldName)) {
                    promptTokens = reader.getInt();
                } else if ("total_tokens".equals(fieldName)) {
                    totalTokens = reader.getInt();
                } else if ("prompt_tokens_details".equals(fieldName)) {
                    promptTokensDetails = CompletionsUsagePromptTokensDetails.fromJson(reader);
                } else if ("completion_tokens_details".equals(fieldName)) {
                    completionTokensDetails = CompletionsUsageCompletionTokensDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            CompletionsUsage deserializedCompletionsUsage
                = new CompletionsUsage(completionTokens, promptTokens, totalTokens);
            deserializedCompletionsUsage.promptTokensDetails = promptTokensDetails;
            deserializedCompletionsUsage.completionTokensDetails = completionTokensDetails;
            return deserializedCompletionsUsage;
        });
    }

    /*
     * Details of the prompt tokens.
     */
    @Generated
    private CompletionsUsagePromptTokensDetails promptTokensDetails;

    /*
     * Breakdown of tokens used in a completion.
     */
    @Generated
    private CompletionsUsageCompletionTokensDetails completionTokensDetails;

    /**
     * Get the promptTokensDetails property: Details of the prompt tokens.
     *
     * @return the promptTokensDetails value.
     */
    @Generated
    public CompletionsUsagePromptTokensDetails getPromptTokensDetails() {
        return this.promptTokensDetails;
    }

    /**
     * Get the completionTokensDetails property: Breakdown of tokens used in a completion.
     *
     * @return the completionTokensDetails value.
     */
    @Generated
    public CompletionsUsageCompletionTokensDetails getCompletionTokensDetails() {
        return this.completionTokensDetails;
    }
}
