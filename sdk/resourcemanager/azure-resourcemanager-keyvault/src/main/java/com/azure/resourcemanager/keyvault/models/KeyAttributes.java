// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The object attributes managed by the Azure Key Vault service.
 */
@Fluent
public final class KeyAttributes implements JsonSerializable<KeyAttributes> {
    /*
     * Determines whether or not the object is enabled.
     */
    private Boolean enabled;

    /*
     * Not before date in seconds since 1970-01-01T00:00:00Z.
     */
    private Long notBefore;

    /*
     * Expiry date in seconds since 1970-01-01T00:00:00Z.
     */
    private Long expires;

    /*
     * Creation time in seconds since 1970-01-01T00:00:00Z.
     */
    private Long created;

    /*
     * Last updated time in seconds since 1970-01-01T00:00:00Z.
     */
    private Long updated;

    /*
     * The deletion recovery level currently in effect for the object. If it contains 'Purgeable', then the object can
     * be permanently deleted by a privileged user; otherwise, only the system can purge the object at the end of the
     * retention interval.
     */
    private DeletionRecoveryLevel recoveryLevel;

    /*
     * Indicates if the private key can be exported.
     */
    private Boolean exportable;

    /**
     * Creates an instance of KeyAttributes class.
     */
    public KeyAttributes() {
    }

    /**
     * Get the enabled property: Determines whether or not the object is enabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Determines whether or not the object is enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the KeyAttributes object itself.
     */
    public KeyAttributes withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the notBefore property: Not before date in seconds since 1970-01-01T00:00:00Z.
     * 
     * @return the notBefore value.
     */
    public Long notBefore() {
        return this.notBefore;
    }

    /**
     * Set the notBefore property: Not before date in seconds since 1970-01-01T00:00:00Z.
     * 
     * @param notBefore the notBefore value to set.
     * @return the KeyAttributes object itself.
     */
    public KeyAttributes withNotBefore(Long notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * Get the expires property: Expiry date in seconds since 1970-01-01T00:00:00Z.
     * 
     * @return the expires value.
     */
    public Long expires() {
        return this.expires;
    }

    /**
     * Set the expires property: Expiry date in seconds since 1970-01-01T00:00:00Z.
     * 
     * @param expires the expires value to set.
     * @return the KeyAttributes object itself.
     */
    public KeyAttributes withExpires(Long expires) {
        this.expires = expires;
        return this;
    }

    /**
     * Get the created property: Creation time in seconds since 1970-01-01T00:00:00Z.
     * 
     * @return the created value.
     */
    public Long created() {
        return this.created;
    }

    /**
     * Get the updated property: Last updated time in seconds since 1970-01-01T00:00:00Z.
     * 
     * @return the updated value.
     */
    public Long updated() {
        return this.updated;
    }

    /**
     * Get the recoveryLevel property: The deletion recovery level currently in effect for the object. If it contains
     * 'Purgeable', then the object can be permanently deleted by a privileged user; otherwise, only the system can
     * purge the object at the end of the retention interval.
     * 
     * @return the recoveryLevel value.
     */
    public DeletionRecoveryLevel recoveryLevel() {
        return this.recoveryLevel;
    }

    /**
     * Get the exportable property: Indicates if the private key can be exported.
     * 
     * @return the exportable value.
     */
    public Boolean exportable() {
        return this.exportable;
    }

    /**
     * Set the exportable property: Indicates if the private key can be exported.
     * 
     * @param exportable the exportable value to set.
     * @return the KeyAttributes object itself.
     */
    public KeyAttributes withExportable(Boolean exportable) {
        this.exportable = exportable;
        return this;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeNumberField("nbf", this.notBefore);
        jsonWriter.writeNumberField("exp", this.expires);
        jsonWriter.writeBooleanField("exportable", this.exportable);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyAttributes from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyAttributes if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyAttributes.
     */
    public static KeyAttributes fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyAttributes deserializedKeyAttributes = new KeyAttributes();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedKeyAttributes.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("nbf".equals(fieldName)) {
                    deserializedKeyAttributes.notBefore = reader.getNullable(JsonReader::getLong);
                } else if ("exp".equals(fieldName)) {
                    deserializedKeyAttributes.expires = reader.getNullable(JsonReader::getLong);
                } else if ("created".equals(fieldName)) {
                    deserializedKeyAttributes.created = reader.getNullable(JsonReader::getLong);
                } else if ("updated".equals(fieldName)) {
                    deserializedKeyAttributes.updated = reader.getNullable(JsonReader::getLong);
                } else if ("recoveryLevel".equals(fieldName)) {
                    deserializedKeyAttributes.recoveryLevel = DeletionRecoveryLevel.fromString(reader.getString());
                } else if ("exportable".equals(fieldName)) {
                    deserializedKeyAttributes.exportable = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyAttributes;
        });
    }
}
