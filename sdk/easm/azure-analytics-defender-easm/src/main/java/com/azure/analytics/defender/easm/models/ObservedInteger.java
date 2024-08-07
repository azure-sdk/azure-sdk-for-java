// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * The ObservedInteger model.
 */
@Immutable
public final class ObservedInteger extends ObservedValue {

    /*
     * The value property.
     */
    @Generated
    private Integer value;

    /*
     * The sources property.
     */
    @Generated
    private List<Source> sources;

    /*
     * The firstSeen property.
     */
    @Generated
    private OffsetDateTime firstSeen;

    /*
     * The lastSeen property.
     */
    @Generated
    private OffsetDateTime lastSeen;

    /*
     * The count property.
     */
    @Generated
    private Long count;

    /*
     * The recent property.
     */
    @Generated
    private Boolean recent;

    /**
     * Creates an instance of ObservedInteger class.
     */
    @Generated
    private ObservedInteger() {
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    @Generated
    public Integer getValue() {
        return this.value;
    }

    /**
     * Get the sources property: The sources property.
     *
     * @return the sources value.
     */
    @Generated
    public List<Source> getSources() {
        return this.sources;
    }

    /**
     * Get the firstSeen property: The firstSeen property.
     *
     * @return the firstSeen value.
     */
    @Generated
    @Override
    public OffsetDateTime getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * Get the lastSeen property: The lastSeen property.
     *
     * @return the lastSeen value.
     */
    @Generated
    @Override
    public OffsetDateTime getLastSeen() {
        return this.lastSeen;
    }

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    @Generated
    @Override
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the recent property: The recent property.
     *
     * @return the recent value.
     */
    @Generated
    @Override
    public Boolean isRecent() {
        return this.recent;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("firstSeen",
            getFirstSeen() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getFirstSeen()));
        jsonWriter.writeStringField("lastSeen",
            getLastSeen() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getLastSeen()));
        jsonWriter.writeNumberField("count", getCount());
        jsonWriter.writeBooleanField("recent", isRecent());
        jsonWriter.writeNumberField("value", this.value);
        jsonWriter.writeArrayField("sources", this.sources, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ObservedInteger from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ObservedInteger if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ObservedInteger.
     */
    @Generated
    public static ObservedInteger fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ObservedInteger deserializedObservedInteger = new ObservedInteger();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("firstSeen".equals(fieldName)) {
                    deserializedObservedInteger.firstSeen = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastSeen".equals(fieldName)) {
                    deserializedObservedInteger.lastSeen = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("count".equals(fieldName)) {
                    deserializedObservedInteger.count = reader.getNullable(JsonReader::getLong);
                } else if ("recent".equals(fieldName)) {
                    deserializedObservedInteger.recent = reader.getNullable(JsonReader::getBoolean);
                } else if ("value".equals(fieldName)) {
                    deserializedObservedInteger.value = reader.getNullable(JsonReader::getInt);
                } else if ("sources".equals(fieldName)) {
                    List<Source> sources = reader.readArray(reader1 -> Source.fromJson(reader1));
                    deserializedObservedInteger.sources = sources;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedObservedInteger;
        });
    }
}
