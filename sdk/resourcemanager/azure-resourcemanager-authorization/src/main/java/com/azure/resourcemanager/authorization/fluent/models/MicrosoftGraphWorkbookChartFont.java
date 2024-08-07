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
 * workbookChartFont.
 */
@Fluent
public final class MicrosoftGraphWorkbookChartFont extends MicrosoftGraphEntity {
    /*
     * Represents the bold status of font.
     */
    private Boolean bold;

    /*
     * HTML color code representation of the text color. E.g. #FF0000 represents Red.
     */
    private String color;

    /*
     * Represents the italic status of the font.
     */
    private Boolean italic;

    /*
     * Font name (e.g. 'Calibri')
     */
    private String name;

    /*
     * Size of the font (e.g. 11)
     */
    private Double size;

    /*
     * Type of underline applied to the font. The possible values are: None, Single.
     */
    private String underline;

    /*
     * workbookChartFont
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphWorkbookChartFont class.
     */
    public MicrosoftGraphWorkbookChartFont() {
    }

    /**
     * Get the bold property: Represents the bold status of font.
     * 
     * @return the bold value.
     */
    public Boolean bold() {
        return this.bold;
    }

    /**
     * Set the bold property: Represents the bold status of font.
     * 
     * @param bold the bold value to set.
     * @return the MicrosoftGraphWorkbookChartFont object itself.
     */
    public MicrosoftGraphWorkbookChartFont withBold(Boolean bold) {
        this.bold = bold;
        return this;
    }

    /**
     * Get the color property: HTML color code representation of the text color. E.g. #FF0000 represents Red.
     * 
     * @return the color value.
     */
    public String color() {
        return this.color;
    }

    /**
     * Set the color property: HTML color code representation of the text color. E.g. #FF0000 represents Red.
     * 
     * @param color the color value to set.
     * @return the MicrosoftGraphWorkbookChartFont object itself.
     */
    public MicrosoftGraphWorkbookChartFont withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Get the italic property: Represents the italic status of the font.
     * 
     * @return the italic value.
     */
    public Boolean italic() {
        return this.italic;
    }

    /**
     * Set the italic property: Represents the italic status of the font.
     * 
     * @param italic the italic value to set.
     * @return the MicrosoftGraphWorkbookChartFont object itself.
     */
    public MicrosoftGraphWorkbookChartFont withItalic(Boolean italic) {
        this.italic = italic;
        return this;
    }

    /**
     * Get the name property: Font name (e.g. 'Calibri').
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Font name (e.g. 'Calibri').
     * 
     * @param name the name value to set.
     * @return the MicrosoftGraphWorkbookChartFont object itself.
     */
    public MicrosoftGraphWorkbookChartFont withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the size property: Size of the font (e.g. 11).
     * 
     * @return the size value.
     */
    public Double size() {
        return this.size;
    }

    /**
     * Set the size property: Size of the font (e.g. 11).
     * 
     * @param size the size value to set.
     * @return the MicrosoftGraphWorkbookChartFont object itself.
     */
    public MicrosoftGraphWorkbookChartFont withSize(Double size) {
        this.size = size;
        return this;
    }

    /**
     * Get the underline property: Type of underline applied to the font. The possible values are: None, Single.
     * 
     * @return the underline value.
     */
    public String underline() {
        return this.underline;
    }

    /**
     * Set the underline property: Type of underline applied to the font. The possible values are: None, Single.
     * 
     * @param underline the underline value to set.
     * @return the MicrosoftGraphWorkbookChartFont object itself.
     */
    public MicrosoftGraphWorkbookChartFont withUnderline(String underline) {
        this.underline = underline;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookChartFont.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookChartFont.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookChartFont object itself.
     */
    public MicrosoftGraphWorkbookChartFont withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphWorkbookChartFont withId(String id) {
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
        jsonWriter.writeBooleanField("bold", this.bold);
        jsonWriter.writeStringField("color", this.color);
        jsonWriter.writeBooleanField("italic", this.italic);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeNumberField("size", this.size);
        jsonWriter.writeStringField("underline", this.underline);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphWorkbookChartFont from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphWorkbookChartFont if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphWorkbookChartFont.
     */
    public static MicrosoftGraphWorkbookChartFont fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphWorkbookChartFont deserializedMicrosoftGraphWorkbookChartFont
                = new MicrosoftGraphWorkbookChartFont();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartFont.withId(reader.getString());
                } else if ("bold".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartFont.bold = reader.getNullable(JsonReader::getBoolean);
                } else if ("color".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartFont.color = reader.getString();
                } else if ("italic".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartFont.italic = reader.getNullable(JsonReader::getBoolean);
                } else if ("name".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartFont.name = reader.getString();
                } else if ("size".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartFont.size = reader.getNullable(JsonReader::getDouble);
                } else if ("underline".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartFont.underline = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphWorkbookChartFont.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphWorkbookChartFont;
        });
    }
}
