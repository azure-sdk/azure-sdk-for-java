// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Status of an indexing operation for a single document.
 */
@Immutable
public final class IndexingResult implements JsonSerializable<IndexingResult>, Serializable {

    /**
     * The key of a document that was in the indexing request.
     */
    @Generated
    private final String key;

    /**
     * The error message explaining why the indexing operation failed for the document identified by the key; null if
     * indexing succeeded.
     */
    @Generated
    private String errorMessage;

    /**
     * A value indicating whether the indexing operation succeeded for the document identified by the key.
     */
    @Generated
    private final boolean succeeded;

    /**
     * The status code of the indexing operation. Possible values include: 200 for a successful update or delete, 201
     * for successful document creation, 400 for a malformed input document, 404 for document not found, 409 for a
     * version conflict, 422 when the index is temporarily unavailable, or 503 for when the service is too busy.
     */
    @Generated
    private final int statusCode;

    /**
     * Creates an instance of IndexingResult class.
     *
     * @param key the key value to set.
     * @param succeeded the succeeded value to set.
     * @param statusCode the statusCode value to set.
     */
    @Generated
    public IndexingResult(String key, boolean succeeded, int statusCode) {
        this.key = key;
        this.succeeded = succeeded;
        this.statusCode = statusCode;
    }

    /**
     * Get the key property: The key of a document that was in the indexing request.
     *
     * @return the key value.
     */
    @Generated
    public String getKey() {
        return this.key;
    }

    /**
     * Get the errorMessage property: The error message explaining why the indexing operation failed for the document
     * identified by the key; null if indexing succeeded.
     *
     * @return the errorMessage value.
     */
    @Generated
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the succeeded property: A value indicating whether the indexing operation succeeded for the document
     * identified by the key.
     *
     * @return the succeeded value.
     */
    @Generated
    public boolean isSucceeded() {
        return this.succeeded;
    }

    /**
     * Get the statusCode property: The status code of the indexing operation. Possible values include: 200 for a
     * successful update or delete, 201 for successful document creation, 400 for a malformed input document, 404 for
     * document not found, 409 for a version conflict, 422 when the index is temporarily unavailable, or 503 for when
     * the service is too busy.
     *
     * @return the statusCode value.
     */
    @Generated
    public int getStatusCode() {
        return this.statusCode;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IndexingResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of IndexingResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IndexingResult.
     */
    @Generated
    public static IndexingResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean keyFound = false;
            String key = null;
            boolean succeededFound = false;
            boolean succeeded = false;
            boolean statusCodeFound = false;
            int statusCode = 0;
            String errorMessage = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("key".equals(fieldName)) {
                    key = reader.getString();
                    keyFound = true;
                } else if ("status".equals(fieldName)) {
                    succeeded = reader.getBoolean();
                    succeededFound = true;
                } else if ("statusCode".equals(fieldName)) {
                    statusCode = reader.getInt();
                    statusCodeFound = true;
                } else if ("errorMessage".equals(fieldName)) {
                    errorMessage = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (keyFound && succeededFound && statusCodeFound) {
                IndexingResult deserializedIndexingResult = new IndexingResult(key, succeeded, statusCode);
                deserializedIndexingResult.errorMessage = errorMessage;
                return deserializedIndexingResult;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!keyFound) {
                missingProperties.add("key");
            }
            if (!succeededFound) {
                missingProperties.add("status");
            }
            if (!statusCodeFound) {
                missingProperties.add("statusCode");
            }
            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }

    private static final long serialVersionUID = -8604424005271188140L;
}
