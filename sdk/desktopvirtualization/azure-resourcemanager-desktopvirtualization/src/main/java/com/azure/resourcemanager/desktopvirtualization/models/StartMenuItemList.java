// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.StartMenuItemInner;
import java.io.IOException;
import java.util.List;

/**
 * StartMenuItemList
 * 
 * List of StartMenuItem definitions.
 */
@Fluent
public final class StartMenuItemList implements JsonSerializable<StartMenuItemList> {
    /*
     * List of StartMenuItem definitions.
     */
    private List<StartMenuItemInner> value;

    /*
     * Link to the next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of StartMenuItemList class.
     */
    public StartMenuItemList() {
    }

    /**
     * Get the value property: List of StartMenuItem definitions.
     * 
     * @return the value value.
     */
    public List<StartMenuItemInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of StartMenuItem definitions.
     * 
     * @param value the value value to set.
     * @return the StartMenuItemList object itself.
     */
    public StartMenuItemList withValue(List<StartMenuItemInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StartMenuItemList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StartMenuItemList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the StartMenuItemList.
     */
    public static StartMenuItemList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StartMenuItemList deserializedStartMenuItemList = new StartMenuItemList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<StartMenuItemInner> value = reader.readArray(reader1 -> StartMenuItemInner.fromJson(reader1));
                    deserializedStartMenuItemList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedStartMenuItemList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStartMenuItemList;
        });
    }
}
