// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Extracted information from a single page.
 */
@Fluent
public final class PageResult implements JsonSerializable<PageResult> {
    /*
     * Page number.
     */
    @Generated
    private int page;

    /*
     * Cluster identifier.
     */
    @Generated
    private Integer clusterId;

    /*
     * List of key-value pairs extracted from the page.
     */
    @Generated
    private List<KeyValuePair> keyValuePairs;

    /*
     * List of data tables extracted from the page.
     */
    @Generated
    private List<DataTable> tables;

    /**
     * Creates an instance of PageResult class.
     */
    @Generated
    public PageResult() {
    }

    /**
     * Get the page property: Page number.
     * 
     * @return the page value.
     */
    @Generated
    public int getPage() {
        return this.page;
    }

    /**
     * Set the page property: Page number.
     * 
     * @param page the page value to set.
     * @return the PageResult object itself.
     */
    @Generated
    public PageResult setPage(int page) {
        this.page = page;
        return this;
    }

    /**
     * Get the clusterId property: Cluster identifier.
     * 
     * @return the clusterId value.
     */
    @Generated
    public Integer getClusterId() {
        return this.clusterId;
    }

    /**
     * Set the clusterId property: Cluster identifier.
     * 
     * @param clusterId the clusterId value to set.
     * @return the PageResult object itself.
     */
    @Generated
    public PageResult setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get the keyValuePairs property: List of key-value pairs extracted from the page.
     * 
     * @return the keyValuePairs value.
     */
    @Generated
    public List<KeyValuePair> getKeyValuePairs() {
        return this.keyValuePairs;
    }

    /**
     * Set the keyValuePairs property: List of key-value pairs extracted from the page.
     * 
     * @param keyValuePairs the keyValuePairs value to set.
     * @return the PageResult object itself.
     */
    @Generated
    public PageResult setKeyValuePairs(List<KeyValuePair> keyValuePairs) {
        this.keyValuePairs = keyValuePairs;
        return this;
    }

    /**
     * Get the tables property: List of data tables extracted from the page.
     * 
     * @return the tables value.
     */
    @Generated
    public List<DataTable> getTables() {
        return this.tables;
    }

    /**
     * Set the tables property: List of data tables extracted from the page.
     * 
     * @param tables the tables value to set.
     * @return the PageResult object itself.
     */
    @Generated
    public PageResult setTables(List<DataTable> tables) {
        this.tables = tables;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("page", this.page);
        jsonWriter.writeNumberField("clusterId", this.clusterId);
        jsonWriter.writeArrayField("keyValuePairs", this.keyValuePairs, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("tables", this.tables, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PageResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PageResult if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PageResult.
     */
    @Generated
    public static PageResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PageResult deserializedPageResult = new PageResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("page".equals(fieldName)) {
                    deserializedPageResult.page = reader.getInt();
                } else if ("clusterId".equals(fieldName)) {
                    deserializedPageResult.clusterId = reader.getNullable(JsonReader::getInt);
                } else if ("keyValuePairs".equals(fieldName)) {
                    List<KeyValuePair> keyValuePairs = reader.readArray(reader1 -> KeyValuePair.fromJson(reader1));
                    deserializedPageResult.keyValuePairs = keyValuePairs;
                } else if ("tables".equals(fieldName)) {
                    List<DataTable> tables = reader.readArray(reader1 -> DataTable.fromJson(reader1));
                    deserializedPageResult.tables = tables;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPageResult;
        });
    }
}
