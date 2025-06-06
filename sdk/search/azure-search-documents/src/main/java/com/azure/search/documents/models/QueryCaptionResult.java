// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Captions are the most representative passages from the document relatively to the search query. They are often used
 * as document summary. Captions are only returned for queries of type `semantic`.
 */
@Fluent
public final class QueryCaptionResult implements JsonSerializable<QueryCaptionResult> {

    /*
     * A representative text passage extracted from the document most relevant to the search query.
     */
    @Generated
    private String text;

    /*
     * Same text passage as in the Text property with highlighted phrases most relevant to the query.
     */
    @Generated
    private String highlights;

    /*
     * Captions are the most representative passages from the document relatively to the search query. They are often
     * used as document summary. Captions are only returned for queries of type `semantic`.
     */
    @Generated
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of QueryCaptionResult class.
     */
    @Generated
    public QueryCaptionResult() {
    }

    /**
     * Get the text property: A representative text passage extracted from the document most relevant to the search
     * query.
     *
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }

    /**
     * Get the highlights property: Same text passage as in the Text property with highlighted phrases most relevant to
     * the query.
     *
     * @return the highlights value.
     */
    @Generated
    public String getHighlights() {
        return this.highlights;
    }

    /**
     * Get the additionalProperties property: Captions are the most representative passages from the document relatively
     * to the search query. They are often used as document summary. Captions are only returned for queries of type
     * `semantic`.
     *
     * @return the additionalProperties value.
     */
    @Generated
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QueryCaptionResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of QueryCaptionResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the QueryCaptionResult.
     */
    @Generated
    public static QueryCaptionResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QueryCaptionResult deserializedQueryCaptionResult = new QueryCaptionResult();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("text".equals(fieldName)) {
                    deserializedQueryCaptionResult.text = reader.getString();
                } else if ("highlights".equals(fieldName)) {
                    deserializedQueryCaptionResult.highlights = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }
                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedQueryCaptionResult.additionalProperties = additionalProperties;
            return deserializedQueryCaptionResult;
        });
    }
}
