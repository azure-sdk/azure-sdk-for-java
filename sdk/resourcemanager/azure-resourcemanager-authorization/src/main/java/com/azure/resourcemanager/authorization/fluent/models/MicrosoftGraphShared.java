// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * shared.
 */
@Fluent
public final class MicrosoftGraphShared implements JsonSerializable<MicrosoftGraphShared> {
    /*
     * identitySet
     */
    private MicrosoftGraphIdentitySet owner;

    /*
     * Indicates the scope of how the item is shared: anonymous, organization, or users. Read-only.
     */
    private String scope;

    /*
     * identitySet
     */
    private MicrosoftGraphIdentitySet sharedBy;

    /*
     * The UTC date and time when the item was shared. Read-only.
     */
    private OffsetDateTime sharedDateTime;

    /*
     * shared
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphShared class.
     */
    public MicrosoftGraphShared() {
    }

    /**
     * Get the owner property: identitySet.
     * 
     * @return the owner value.
     */
    public MicrosoftGraphIdentitySet owner() {
        return this.owner;
    }

    /**
     * Set the owner property: identitySet.
     * 
     * @param owner the owner value to set.
     * @return the MicrosoftGraphShared object itself.
     */
    public MicrosoftGraphShared withOwner(MicrosoftGraphIdentitySet owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get the scope property: Indicates the scope of how the item is shared: anonymous, organization, or users.
     * Read-only.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Indicates the scope of how the item is shared: anonymous, organization, or users.
     * Read-only.
     * 
     * @param scope the scope value to set.
     * @return the MicrosoftGraphShared object itself.
     */
    public MicrosoftGraphShared withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the sharedBy property: identitySet.
     * 
     * @return the sharedBy value.
     */
    public MicrosoftGraphIdentitySet sharedBy() {
        return this.sharedBy;
    }

    /**
     * Set the sharedBy property: identitySet.
     * 
     * @param sharedBy the sharedBy value to set.
     * @return the MicrosoftGraphShared object itself.
     */
    public MicrosoftGraphShared withSharedBy(MicrosoftGraphIdentitySet sharedBy) {
        this.sharedBy = sharedBy;
        return this;
    }

    /**
     * Get the sharedDateTime property: The UTC date and time when the item was shared. Read-only.
     * 
     * @return the sharedDateTime value.
     */
    public OffsetDateTime sharedDateTime() {
        return this.sharedDateTime;
    }

    /**
     * Set the sharedDateTime property: The UTC date and time when the item was shared. Read-only.
     * 
     * @param sharedDateTime the sharedDateTime value to set.
     * @return the MicrosoftGraphShared object itself.
     */
    public MicrosoftGraphShared withSharedDateTime(OffsetDateTime sharedDateTime) {
        this.sharedDateTime = sharedDateTime;
        return this;
    }

    /**
     * Get the additionalProperties property: shared.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: shared.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphShared object itself.
     */
    public MicrosoftGraphShared withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (owner() != null) {
            owner().validate();
        }
        if (sharedBy() != null) {
            sharedBy().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("owner", this.owner);
        jsonWriter.writeStringField("scope", this.scope);
        jsonWriter.writeJsonField("sharedBy", this.sharedBy);
        jsonWriter.writeStringField("sharedDateTime",
            this.sharedDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.sharedDateTime));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphShared from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphShared if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphShared.
     */
    public static MicrosoftGraphShared fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphShared deserializedMicrosoftGraphShared = new MicrosoftGraphShared();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("owner".equals(fieldName)) {
                    deserializedMicrosoftGraphShared.owner = MicrosoftGraphIdentitySet.fromJson(reader);
                } else if ("scope".equals(fieldName)) {
                    deserializedMicrosoftGraphShared.scope = reader.getString();
                } else if ("sharedBy".equals(fieldName)) {
                    deserializedMicrosoftGraphShared.sharedBy = MicrosoftGraphIdentitySet.fromJson(reader);
                } else if ("sharedDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphShared.sharedDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphShared.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphShared;
        });
    }
}
