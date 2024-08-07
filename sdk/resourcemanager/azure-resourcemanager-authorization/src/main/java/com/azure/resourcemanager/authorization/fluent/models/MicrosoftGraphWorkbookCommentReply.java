// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * workbookCommentReply.
 */
@Fluent
public final class MicrosoftGraphWorkbookCommentReply extends MicrosoftGraphEntity {
    /*
     * The content of a comment reply.
     */
    private String content;

    /*
     * Indicates the type for the comment reply.
     */
    private String contentType;

    /*
     * workbookCommentReply
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphWorkbookCommentReply class.
     */
    public MicrosoftGraphWorkbookCommentReply() {
    }

    /**
     * Get the content property: The content of a comment reply.
     * 
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: The content of a comment reply.
     * 
     * @param content the content value to set.
     * @return the MicrosoftGraphWorkbookCommentReply object itself.
     */
    public MicrosoftGraphWorkbookCommentReply withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the contentType property: Indicates the type for the comment reply.
     * 
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: Indicates the type for the comment reply.
     * 
     * @param contentType the contentType value to set.
     * @return the MicrosoftGraphWorkbookCommentReply object itself.
     */
    public MicrosoftGraphWorkbookCommentReply withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookCommentReply.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookCommentReply.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookCommentReply object itself.
     */
    public MicrosoftGraphWorkbookCommentReply withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphWorkbookCommentReply withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeStringField("contentType", this.contentType);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphWorkbookCommentReply from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphWorkbookCommentReply if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphWorkbookCommentReply.
     */
    public static MicrosoftGraphWorkbookCommentReply fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphWorkbookCommentReply deserializedMicrosoftGraphWorkbookCommentReply
                = new MicrosoftGraphWorkbookCommentReply();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookCommentReply.withId(reader.getString());
                } else if ("content".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookCommentReply.content = reader.getString();
                } else if ("contentType".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookCommentReply.contentType = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphWorkbookCommentReply.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphWorkbookCommentReply;
        });
    }
}
