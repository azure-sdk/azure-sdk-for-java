// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A charge summary resource.
 */
@Fluent
public class ChargeSummary extends ProxyResource {
    /*
     * Specifies the kind of charge summary.
     */
    private ChargeSummaryKind kind = ChargeSummaryKind.fromString("ChargeSummary");

    /*
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user
     * is updating the latest version or not.
     */
    private String etag;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ChargeSummary class.
     */
    public ChargeSummary() {
    }

    /**
     * Get the kind property: Specifies the kind of charge summary.
     * 
     * @return the kind value.
     */
    public ChargeSummaryKind kind() {
        return this.kind;
    }

    /**
     * Get the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     * 
     * @param etag the etag value to set.
     * @return the ChargeSummary object itself.
     */
    public ChargeSummary withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
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
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeStringField("eTag", this.etag);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChargeSummary from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChargeSummary if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChargeSummary.
     */
    public static ChargeSummary fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("kind".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("legacy".equals(discriminatorValue)) {
                    return LegacyChargeSummary.fromJson(readerToUse.reset());
                } else if ("modern".equals(discriminatorValue)) {
                    return ModernChargeSummary.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static ChargeSummary fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChargeSummary deserializedChargeSummary = new ChargeSummary();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedChargeSummary.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedChargeSummary.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedChargeSummary.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedChargeSummary.kind = ChargeSummaryKind.fromString(reader.getString());
                } else if ("eTag".equals(fieldName)) {
                    deserializedChargeSummary.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedChargeSummary;
        });
    }
}
