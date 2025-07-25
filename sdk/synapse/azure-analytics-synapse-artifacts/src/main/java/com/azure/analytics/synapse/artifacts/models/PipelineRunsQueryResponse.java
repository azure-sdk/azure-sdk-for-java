// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A list pipeline runs.
 */
@Fluent
public final class PipelineRunsQueryResponse implements JsonSerializable<PipelineRunsQueryResponse> {
    /*
     * List of pipeline runs.
     */
    @Generated
    private List<PipelineRun> value;

    /*
     * The continuation token for getting the next page of results, if any remaining results exist, null otherwise.
     */
    @Generated
    private String continuationToken;

    /**
     * Creates an instance of PipelineRunsQueryResponse class.
     */
    @Generated
    public PipelineRunsQueryResponse() {
    }

    /**
     * Get the value property: List of pipeline runs.
     * 
     * @return the value value.
     */
    @Generated
    public List<PipelineRun> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of pipeline runs.
     * 
     * @param value the value value to set.
     * @return the PipelineRunsQueryResponse object itself.
     */
    @Generated
    public PipelineRunsQueryResponse setValue(List<PipelineRun> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the continuationToken property: The continuation token for getting the next page of results, if any remaining
     * results exist, null otherwise.
     * 
     * @return the continuationToken value.
     */
    @Generated
    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuationToken property: The continuation token for getting the next page of results, if any remaining
     * results exist, null otherwise.
     * 
     * @param continuationToken the continuationToken value to set.
     * @return the PipelineRunsQueryResponse object itself.
     */
    @Generated
    public PipelineRunsQueryResponse setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("continuationToken", this.continuationToken);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PipelineRunsQueryResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PipelineRunsQueryResponse if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PipelineRunsQueryResponse.
     */
    @Generated
    public static PipelineRunsQueryResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PipelineRunsQueryResponse deserializedPipelineRunsQueryResponse = new PipelineRunsQueryResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PipelineRun> value = reader.readArray(reader1 -> PipelineRun.fromJson(reader1));
                    deserializedPipelineRunsQueryResponse.value = value;
                } else if ("continuationToken".equals(fieldName)) {
                    deserializedPipelineRunsQueryResponse.continuationToken = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPipelineRunsQueryResponse;
        });
    }
}
