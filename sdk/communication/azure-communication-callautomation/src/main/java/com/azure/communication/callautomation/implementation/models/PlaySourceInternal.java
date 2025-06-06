// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The PlaySourceInternal model.
 */
@Fluent
public final class PlaySourceInternal implements JsonSerializable<PlaySourceInternal> {
    /*
     * Defines the type of the play source
     */
    @Generated
    private PlaySourceTypeInternal kind;

    /*
     * Defines the identifier to be used for caching related media
     */
    @Generated
    private String playSourceCacheId;

    /*
     * Defines the file source info to be used for play
     */
    @Generated
    private FileSourceInternal file;

    /*
     * Defines the text source info to be used for play
     */
    @Generated
    private TextSourceInternal text;

    /*
     * Defines the ssml(Speech Synthesis Markup Language) source info to be used for play
     */
    @Generated
    private SsmlSourceInternal ssml;

    /**
     * Creates an instance of PlaySourceInternal class.
     */
    @Generated
    public PlaySourceInternal() {
    }

    /**
     * Get the kind property: Defines the type of the play source.
     * 
     * @return the kind value.
     */
    @Generated
    public PlaySourceTypeInternal getKind() {
        return this.kind;
    }

    /**
     * Set the kind property: Defines the type of the play source.
     * 
     * @param kind the kind value to set.
     * @return the PlaySourceInternal object itself.
     */
    @Generated
    public PlaySourceInternal setKind(PlaySourceTypeInternal kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the playSourceCacheId property: Defines the identifier to be used for caching related media.
     * 
     * @return the playSourceCacheId value.
     */
    @Generated
    public String getPlaySourceCacheId() {
        return this.playSourceCacheId;
    }

    /**
     * Set the playSourceCacheId property: Defines the identifier to be used for caching related media.
     * 
     * @param playSourceCacheId the playSourceCacheId value to set.
     * @return the PlaySourceInternal object itself.
     */
    @Generated
    public PlaySourceInternal setPlaySourceCacheId(String playSourceCacheId) {
        this.playSourceCacheId = playSourceCacheId;
        return this;
    }

    /**
     * Get the file property: Defines the file source info to be used for play.
     * 
     * @return the file value.
     */
    @Generated
    public FileSourceInternal getFile() {
        return this.file;
    }

    /**
     * Set the file property: Defines the file source info to be used for play.
     * 
     * @param file the file value to set.
     * @return the PlaySourceInternal object itself.
     */
    @Generated
    public PlaySourceInternal setFile(FileSourceInternal file) {
        this.file = file;
        return this;
    }

    /**
     * Get the text property: Defines the text source info to be used for play.
     * 
     * @return the text value.
     */
    @Generated
    public TextSourceInternal getText() {
        return this.text;
    }

    /**
     * Set the text property: Defines the text source info to be used for play.
     * 
     * @param text the text value to set.
     * @return the PlaySourceInternal object itself.
     */
    @Generated
    public PlaySourceInternal setText(TextSourceInternal text) {
        this.text = text;
        return this;
    }

    /**
     * Get the ssml property: Defines the ssml(Speech Synthesis Markup Language) source info to be used for play.
     * 
     * @return the ssml value.
     */
    @Generated
    public SsmlSourceInternal getSsml() {
        return this.ssml;
    }

    /**
     * Set the ssml property: Defines the ssml(Speech Synthesis Markup Language) source info to be used for play.
     * 
     * @param ssml the ssml value to set.
     * @return the PlaySourceInternal object itself.
     */
    @Generated
    public PlaySourceInternal setSsml(SsmlSourceInternal ssml) {
        this.ssml = ssml;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeStringField("playSourceCacheId", this.playSourceCacheId);
        jsonWriter.writeJsonField("file", this.file);
        jsonWriter.writeJsonField("text", this.text);
        jsonWriter.writeJsonField("ssml", this.ssml);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PlaySourceInternal from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PlaySourceInternal if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PlaySourceInternal.
     */
    @Generated
    public static PlaySourceInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PlaySourceInternal deserializedPlaySourceInternal = new PlaySourceInternal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    deserializedPlaySourceInternal.kind = PlaySourceTypeInternal.fromString(reader.getString());
                } else if ("playSourceCacheId".equals(fieldName)) {
                    deserializedPlaySourceInternal.playSourceCacheId = reader.getString();
                } else if ("file".equals(fieldName)) {
                    deserializedPlaySourceInternal.file = FileSourceInternal.fromJson(reader);
                } else if ("text".equals(fieldName)) {
                    deserializedPlaySourceInternal.text = TextSourceInternal.fromJson(reader);
                } else if ("ssml".equals(fieldName)) {
                    deserializedPlaySourceInternal.ssml = SsmlSourceInternal.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPlaySourceInternal;
        });
    }
}
