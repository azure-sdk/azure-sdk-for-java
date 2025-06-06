// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.v2.security.keyvault.secrets.implementation.models;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Map;

/**
 * A Deleted Secret consisting of its previous id, attributes and its tags, as well as information on when it will be
 * purged.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class DeletedSecretBundle implements JsonSerializable<DeletedSecretBundle> {
    /*
     * The secret value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String value;

    /*
     * The secret id.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String id;

    /*
     * The content type of the secret.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String contentType;

    /*
     * The secret management attributes.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SecretAttributes attributes;

    /*
     * Application specific metadata in the form of key-value pairs.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, String> tags;

    /*
     * If this is a secret backing a KV certificate, then this field specifies the corresponding key backing the KV
     * certificate.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String kid;

    /*
     * True if the secret's lifetime is managed by key vault. If this is a secret backing a certificate, then managed
     * will be true.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean managed;

    /*
     * The url of the recovery object, used to identify and recover the deleted secret.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String recoveryId;

    /*
     * The time when the secret is scheduled to be purged, in UTC
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long scheduledPurgeDate;

    /*
     * The time when the secret was deleted, in UTC
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long deletedDate;

    /**
     * Creates an instance of DeletedSecretBundle class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private DeletedSecretBundle() {
    }

    /**
     * Get the value property: The secret value.
     * 
     * @return the value value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getValue() {
        return this.value;
    }

    /**
     * Get the id property: The secret id.
     * 
     * @return the id value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getId() {
        return this.id;
    }

    /**
     * Get the contentType property: The content type of the secret.
     * 
     * @return the contentType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Get the attributes property: The secret management attributes.
     * 
     * @return the attributes value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SecretAttributes getAttributes() {
        return this.attributes;
    }

    /**
     * Get the tags property: Application specific metadata in the form of key-value pairs.
     * 
     * @return the tags value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Get the kid property: If this is a secret backing a KV certificate, then this field specifies the corresponding
     * key backing the KV certificate.
     * 
     * @return the kid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getKid() {
        return this.kid;
    }

    /**
     * Get the managed property: True if the secret's lifetime is managed by key vault. If this is a secret backing a
     * certificate, then managed will be true.
     * 
     * @return the managed value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isManaged() {
        return this.managed;
    }

    /**
     * Get the recoveryId property: The url of the recovery object, used to identify and recover the deleted secret.
     * 
     * @return the recoveryId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRecoveryId() {
        return this.recoveryId;
    }

    /**
     * Get the scheduledPurgeDate property: The time when the secret is scheduled to be purged, in UTC.
     * 
     * @return the scheduledPurgeDate value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public OffsetDateTime getScheduledPurgeDate() {
        if (this.scheduledPurgeDate == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.scheduledPurgeDate), ZoneOffset.UTC);
    }

    /**
     * Get the deletedDate property: The time when the secret was deleted, in UTC.
     * 
     * @return the deletedDate value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public OffsetDateTime getDeletedDate() {
        if (this.deletedDate == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.deletedDate), ZoneOffset.UTC);
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("contentType", this.contentType);
        jsonWriter.writeJsonField("attributes", this.attributes);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("recoveryId", this.recoveryId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeletedSecretBundle from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeletedSecretBundle if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeletedSecretBundle.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static DeletedSecretBundle fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeletedSecretBundle deserializedDeletedSecretBundle = new DeletedSecretBundle();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedDeletedSecretBundle.value = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedDeletedSecretBundle.id = reader.getString();
                } else if ("contentType".equals(fieldName)) {
                    deserializedDeletedSecretBundle.contentType = reader.getString();
                } else if ("attributes".equals(fieldName)) {
                    deserializedDeletedSecretBundle.attributes = SecretAttributes.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedDeletedSecretBundle.tags = tags;
                } else if ("kid".equals(fieldName)) {
                    deserializedDeletedSecretBundle.kid = reader.getString();
                } else if ("managed".equals(fieldName)) {
                    deserializedDeletedSecretBundle.managed = reader.getNullable(JsonReader::getBoolean);
                } else if ("recoveryId".equals(fieldName)) {
                    deserializedDeletedSecretBundle.recoveryId = reader.getString();
                } else if ("scheduledPurgeDate".equals(fieldName)) {
                    deserializedDeletedSecretBundle.scheduledPurgeDate = reader.getNullable(JsonReader::getLong);
                } else if ("deletedDate".equals(fieldName)) {
                    deserializedDeletedSecretBundle.deletedDate = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeletedSecretBundle;
        });
    }
}
