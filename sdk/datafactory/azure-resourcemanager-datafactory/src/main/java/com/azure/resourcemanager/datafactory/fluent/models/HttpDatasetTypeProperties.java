// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import java.io.IOException;

/**
 * Properties specific to this dataset type.
 */
@Fluent
public final class HttpDatasetTypeProperties implements JsonSerializable<HttpDatasetTypeProperties> {
    /*
     * The relative URL based on the URL in the HttpLinkedService refers to an HTTP file Type: string (or Expression
     * with resultType string).
     */
    private Object relativeUrl;

    /*
     * The HTTP method for the HTTP request. Type: string (or Expression with resultType string).
     */
    private Object requestMethod;

    /*
     * The body for the HTTP request. Type: string (or Expression with resultType string).
     */
    private Object requestBody;

    /*
     * The headers for the HTTP Request. e.g. request-header-name-1:request-header-value-1
     * ...
     * request-header-name-n:request-header-value-n Type: string (or Expression with resultType string).
     */
    private Object additionalHeaders;

    /*
     * The format of files.
     */
    private DatasetStorageFormat format;

    /*
     * The data compression method used on files.
     */
    private DatasetCompression compression;

    /**
     * Creates an instance of HttpDatasetTypeProperties class.
     */
    public HttpDatasetTypeProperties() {
    }

    /**
     * Get the relativeUrl property: The relative URL based on the URL in the HttpLinkedService refers to an HTTP file
     * Type: string (or Expression with resultType string).
     * 
     * @return the relativeUrl value.
     */
    public Object relativeUrl() {
        return this.relativeUrl;
    }

    /**
     * Set the relativeUrl property: The relative URL based on the URL in the HttpLinkedService refers to an HTTP file
     * Type: string (or Expression with resultType string).
     * 
     * @param relativeUrl the relativeUrl value to set.
     * @return the HttpDatasetTypeProperties object itself.
     */
    public HttpDatasetTypeProperties withRelativeUrl(Object relativeUrl) {
        this.relativeUrl = relativeUrl;
        return this;
    }

    /**
     * Get the requestMethod property: The HTTP method for the HTTP request. Type: string (or Expression with resultType
     * string).
     * 
     * @return the requestMethod value.
     */
    public Object requestMethod() {
        return this.requestMethod;
    }

    /**
     * Set the requestMethod property: The HTTP method for the HTTP request. Type: string (or Expression with resultType
     * string).
     * 
     * @param requestMethod the requestMethod value to set.
     * @return the HttpDatasetTypeProperties object itself.
     */
    public HttpDatasetTypeProperties withRequestMethod(Object requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * Get the requestBody property: The body for the HTTP request. Type: string (or Expression with resultType string).
     * 
     * @return the requestBody value.
     */
    public Object requestBody() {
        return this.requestBody;
    }

    /**
     * Set the requestBody property: The body for the HTTP request. Type: string (or Expression with resultType string).
     * 
     * @param requestBody the requestBody value to set.
     * @return the HttpDatasetTypeProperties object itself.
     */
    public HttpDatasetTypeProperties withRequestBody(Object requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Get the additionalHeaders property: The headers for the HTTP Request. e.g.
     * request-header-name-1:request-header-value-1
     * ...
     * request-header-name-n:request-header-value-n Type: string (or Expression with resultType string).
     * 
     * @return the additionalHeaders value.
     */
    public Object additionalHeaders() {
        return this.additionalHeaders;
    }

    /**
     * Set the additionalHeaders property: The headers for the HTTP Request. e.g.
     * request-header-name-1:request-header-value-1
     * ...
     * request-header-name-n:request-header-value-n Type: string (or Expression with resultType string).
     * 
     * @param additionalHeaders the additionalHeaders value to set.
     * @return the HttpDatasetTypeProperties object itself.
     */
    public HttpDatasetTypeProperties withAdditionalHeaders(Object additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    /**
     * Get the format property: The format of files.
     * 
     * @return the format value.
     */
    public DatasetStorageFormat format() {
        return this.format;
    }

    /**
     * Set the format property: The format of files.
     * 
     * @param format the format value to set.
     * @return the HttpDatasetTypeProperties object itself.
     */
    public HttpDatasetTypeProperties withFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the compression property: The data compression method used on files.
     * 
     * @return the compression value.
     */
    public DatasetCompression compression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used on files.
     * 
     * @param compression the compression value to set.
     * @return the HttpDatasetTypeProperties object itself.
     */
    public HttpDatasetTypeProperties withCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (format() != null) {
            format().validate();
        }
        if (compression() != null) {
            compression().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (this.relativeUrl != null) {
            jsonWriter.writeUntypedField("relativeUrl", this.relativeUrl);
        }
        if (this.requestMethod != null) {
            jsonWriter.writeUntypedField("requestMethod", this.requestMethod);
        }
        if (this.requestBody != null) {
            jsonWriter.writeUntypedField("requestBody", this.requestBody);
        }
        if (this.additionalHeaders != null) {
            jsonWriter.writeUntypedField("additionalHeaders", this.additionalHeaders);
        }
        jsonWriter.writeJsonField("format", this.format);
        jsonWriter.writeJsonField("compression", this.compression);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HttpDatasetTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HttpDatasetTypeProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HttpDatasetTypeProperties.
     */
    public static HttpDatasetTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HttpDatasetTypeProperties deserializedHttpDatasetTypeProperties = new HttpDatasetTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("relativeUrl".equals(fieldName)) {
                    deserializedHttpDatasetTypeProperties.relativeUrl = reader.readUntyped();
                } else if ("requestMethod".equals(fieldName)) {
                    deserializedHttpDatasetTypeProperties.requestMethod = reader.readUntyped();
                } else if ("requestBody".equals(fieldName)) {
                    deserializedHttpDatasetTypeProperties.requestBody = reader.readUntyped();
                } else if ("additionalHeaders".equals(fieldName)) {
                    deserializedHttpDatasetTypeProperties.additionalHeaders = reader.readUntyped();
                } else if ("format".equals(fieldName)) {
                    deserializedHttpDatasetTypeProperties.format = DatasetStorageFormat.fromJson(reader);
                } else if ("compression".equals(fieldName)) {
                    deserializedHttpDatasetTypeProperties.compression = DatasetCompression.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHttpDatasetTypeProperties;
        });
    }
}
