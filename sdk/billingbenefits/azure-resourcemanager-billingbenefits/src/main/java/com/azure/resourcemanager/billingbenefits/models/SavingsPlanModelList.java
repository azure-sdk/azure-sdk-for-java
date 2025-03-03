// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanModelInner;
import java.io.IOException;
import java.util.List;

/**
 * The SavingsPlanModelList model.
 */
@Fluent
public final class SavingsPlanModelList implements JsonSerializable<SavingsPlanModelList> {
    /*
     * The value property.
     */
    private List<SavingsPlanModelInner> value;

    /*
     * Url to get the next page.
     */
    private String nextLink;

    /**
     * Creates an instance of SavingsPlanModelList class.
     */
    public SavingsPlanModelList() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public List<SavingsPlanModelInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the SavingsPlanModelList object itself.
     */
    public SavingsPlanModelList withValue(List<SavingsPlanModelInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Url to get the next page.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to get the next page.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SavingsPlanModelList object itself.
     */
    public SavingsPlanModelList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SavingsPlanModelList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SavingsPlanModelList if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SavingsPlanModelList.
     */
    public static SavingsPlanModelList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SavingsPlanModelList deserializedSavingsPlanModelList = new SavingsPlanModelList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SavingsPlanModelInner> value
                        = reader.readArray(reader1 -> SavingsPlanModelInner.fromJson(reader1));
                    deserializedSavingsPlanModelList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSavingsPlanModelList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSavingsPlanModelList;
        });
    }
}
