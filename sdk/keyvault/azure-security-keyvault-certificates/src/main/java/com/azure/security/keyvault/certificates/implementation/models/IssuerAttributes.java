// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.security.keyvault.certificates.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * The attributes of an issuer managed by the Key Vault service.
 */
@Fluent
public final class IssuerAttributes implements JsonSerializable<IssuerAttributes> {
    /*
     * Determines whether the issuer is enabled.
     */
    @Generated
    private Boolean enabled;

    /*
     * Creation time in UTC.
     */
    @Generated
    private Long created;

    /*
     * Last updated time in UTC.
     */
    @Generated
    private Long updated;

    /**
     * Creates an instance of IssuerAttributes class.
     */
    @Generated
    public IssuerAttributes() {
    }

    /**
     * Get the enabled property: Determines whether the issuer is enabled.
     * 
     * @return the enabled value.
     */
    @Generated
    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Determines whether the issuer is enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the IssuerAttributes object itself.
     */
    @Generated
    public IssuerAttributes setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the created property: Creation time in UTC.
     * 
     * @return the created value.
     */
    @Generated
    public OffsetDateTime getCreated() {
        if (this.created == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.created), ZoneOffset.UTC);
    }

    /**
     * Get the updated property: Last updated time in UTC.
     * 
     * @return the updated value.
     */
    @Generated
    public OffsetDateTime getUpdated() {
        if (this.updated == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.updated), ZoneOffset.UTC);
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IssuerAttributes from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IssuerAttributes if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IssuerAttributes.
     */
    @Generated
    public static IssuerAttributes fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IssuerAttributes deserializedIssuerAttributes = new IssuerAttributes();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedIssuerAttributes.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("created".equals(fieldName)) {
                    deserializedIssuerAttributes.created = reader.getNullable(JsonReader::getLong);
                } else if ("updated".equals(fieldName)) {
                    deserializedIssuerAttributes.updated = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIssuerAttributes;
        });
    }
}
