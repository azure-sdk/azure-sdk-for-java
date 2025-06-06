// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines a user's identity provider definition.
 */
@Immutable
public class IdentityProvider implements JsonSerializable<IdentityProvider> {
    /*
     * The type of identity provider that the user belongs to.
     */
    private IdentityProviderType type = IdentityProviderType.fromString("IdentityProvider");

    /**
     * Creates an instance of IdentityProvider class.
     */
    public IdentityProvider() {
    }

    /**
     * Get the type property: The type of identity provider that the user belongs to.
     * 
     * @return the type value.
     */
    public IdentityProviderType type() {
        return this.type;
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
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IdentityProvider from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IdentityProvider if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IdentityProvider.
     */
    public static IdentityProvider fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("MicrosoftEntraID".equals(discriminatorValue)) {
                    return EntraIdentityProvider.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static IdentityProvider fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IdentityProvider deserializedIdentityProvider = new IdentityProvider();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedIdentityProvider.type = IdentityProviderType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIdentityProvider;
        });
    }
}
