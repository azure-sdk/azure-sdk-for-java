// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties describing occlusions on a given face.
 */
@Immutable
public final class OcclusionProperties implements JsonSerializable<OcclusionProperties> {

    /*
     * A boolean value indicating whether forehead is occluded.
     */
    @Generated
    private final boolean foreheadOccluded;

    /*
     * A boolean value indicating whether eyes are occluded.
     */
    @Generated
    private final boolean eyeOccluded;

    /*
     * A boolean value indicating whether the mouth is occluded.
     */
    @Generated
    private final boolean mouthOccluded;

    /**
     * Creates an instance of OcclusionProperties class.
     *
     * @param foreheadOccluded the foreheadOccluded value to set.
     * @param eyeOccluded the eyeOccluded value to set.
     * @param mouthOccluded the mouthOccluded value to set.
     */
    @Generated
    private OcclusionProperties(boolean foreheadOccluded, boolean eyeOccluded, boolean mouthOccluded) {
        this.foreheadOccluded = foreheadOccluded;
        this.eyeOccluded = eyeOccluded;
        this.mouthOccluded = mouthOccluded;
    }

    /**
     * Get the foreheadOccluded property: A boolean value indicating whether forehead is occluded.
     *
     * @return the foreheadOccluded value.
     */
    @Generated
    public boolean isForeheadOccluded() {
        return this.foreheadOccluded;
    }

    /**
     * Get the eyeOccluded property: A boolean value indicating whether eyes are occluded.
     *
     * @return the eyeOccluded value.
     */
    @Generated
    public boolean isEyeOccluded() {
        return this.eyeOccluded;
    }

    /**
     * Get the mouthOccluded property: A boolean value indicating whether the mouth is occluded.
     *
     * @return the mouthOccluded value.
     */
    @Generated
    public boolean isMouthOccluded() {
        return this.mouthOccluded;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("foreheadOccluded", this.foreheadOccluded);
        jsonWriter.writeBooleanField("eyeOccluded", this.eyeOccluded);
        jsonWriter.writeBooleanField("mouthOccluded", this.mouthOccluded);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OcclusionProperties from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of OcclusionProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OcclusionProperties.
     */
    @Generated
    public static OcclusionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean foreheadOccluded = false;
            boolean eyeOccluded = false;
            boolean mouthOccluded = false;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("foreheadOccluded".equals(fieldName)) {
                    foreheadOccluded = reader.getBoolean();
                } else if ("eyeOccluded".equals(fieldName)) {
                    eyeOccluded = reader.getBoolean();
                } else if ("mouthOccluded".equals(fieldName)) {
                    mouthOccluded = reader.getBoolean();
                } else {
                    reader.skipChildren();
                }
            }
            return new OcclusionProperties(foreheadOccluded, eyeOccluded, mouthOccluded);
        });
    }
}
