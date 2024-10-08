// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Image for the product.
 */
@Immutable
public final class ImageInformation implements JsonSerializable<ImageInformation> {
    /*
     * Type of the image
     */
    private ImageType imageType;

    /*
     * Url of the image
     */
    private String imageUrl;

    /**
     * Creates an instance of ImageInformation class.
     */
    public ImageInformation() {
    }

    /**
     * Get the imageType property: Type of the image.
     * 
     * @return the imageType value.
     */
    public ImageType imageType() {
        return this.imageType;
    }

    /**
     * Get the imageUrl property: Url of the image.
     * 
     * @return the imageUrl value.
     */
    public String imageUrl() {
        return this.imageUrl;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageInformation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageInformation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ImageInformation.
     */
    public static ImageInformation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageInformation deserializedImageInformation = new ImageInformation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("imageType".equals(fieldName)) {
                    deserializedImageInformation.imageType = ImageType.fromString(reader.getString());
                } else if ("imageUrl".equals(fieldName)) {
                    deserializedImageInformation.imageUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImageInformation;
        });
    }
}
