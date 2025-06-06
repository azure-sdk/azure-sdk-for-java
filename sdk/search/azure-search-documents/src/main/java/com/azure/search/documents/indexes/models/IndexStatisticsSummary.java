// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Statistics for a given index. Statistics are collected periodically and are not guaranteed to always be up-to-date.
 */
@Immutable
public final class IndexStatisticsSummary implements JsonSerializable<IndexStatisticsSummary> {
    /*
     * The name of the index.
     */
    @Generated
    private final String name;

    /*
     * The number of documents in the index.
     */
    @Generated
    private final long documentCount;

    /*
     * The amount of storage in bytes consumed by the index.
     */
    @Generated
    private final long storageSize;

    /*
     * The amount of memory in bytes consumed by vectors in the index.
     */
    @Generated
    private final long vectorIndexSize;

    /**
     * Creates an instance of IndexStatisticsSummary class.
     * 
     * @param name the name value to set.
     * @param documentCount the documentCount value to set.
     * @param storageSize the storageSize value to set.
     * @param vectorIndexSize the vectorIndexSize value to set.
     */
    @Generated
    public IndexStatisticsSummary(String name, long documentCount, long storageSize, long vectorIndexSize) {
        this.name = name;
        this.documentCount = documentCount;
        this.storageSize = storageSize;
        this.vectorIndexSize = vectorIndexSize;
    }

    /**
     * Get the name property: The name of the index.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the documentCount property: The number of documents in the index.
     * 
     * @return the documentCount value.
     */
    @Generated
    public long getDocumentCount() {
        return this.documentCount;
    }

    /**
     * Get the storageSize property: The amount of storage in bytes consumed by the index.
     * 
     * @return the storageSize value.
     */
    @Generated
    public long getStorageSize() {
        return this.storageSize;
    }

    /**
     * Get the vectorIndexSize property: The amount of memory in bytes consumed by vectors in the index.
     * 
     * @return the vectorIndexSize value.
     */
    @Generated
    public long getVectorIndexSize() {
        return this.vectorIndexSize;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IndexStatisticsSummary from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IndexStatisticsSummary if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IndexStatisticsSummary.
     */
    @Generated
    public static IndexStatisticsSummary fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            boolean documentCountFound = false;
            long documentCount = 0L;
            boolean storageSizeFound = false;
            long storageSize = 0L;
            boolean vectorIndexSizeFound = false;
            long vectorIndexSize = 0L;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("documentCount".equals(fieldName)) {
                    documentCount = reader.getLong();
                    documentCountFound = true;
                } else if ("storageSize".equals(fieldName)) {
                    storageSize = reader.getLong();
                    storageSizeFound = true;
                } else if ("vectorIndexSize".equals(fieldName)) {
                    vectorIndexSize = reader.getLong();
                    vectorIndexSizeFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound && documentCountFound && storageSizeFound && vectorIndexSizeFound) {
                return new IndexStatisticsSummary(name, documentCount, storageSize, vectorIndexSize);
            }
            List<String> missingProperties = new ArrayList<>();
            if (!nameFound) {
                missingProperties.add("name");
            }
            if (!documentCountFound) {
                missingProperties.add("documentCount");
            }
            if (!storageSizeFound) {
                missingProperties.add("storageSize");
            }
            if (!vectorIndexSizeFound) {
                missingProperties.add("vectorIndexSize");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
