// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.models.ApiType;
import com.azure.resourcemanager.cosmos.models.RestorableLocationResource;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * The properties of a restorable database account.
 */
@Fluent
public final class RestorableDatabaseAccountProperties
    implements JsonSerializable<RestorableDatabaseAccountProperties> {
    /*
     * The name of the global database account
     */
    private String accountName;

    /*
     * The creation time of the restorable database account (ISO-8601 format).
     */
    private OffsetDateTime creationTime;

    /*
     * The time at which the restorable database account has been deleted (ISO-8601 format).
     */
    private OffsetDateTime deletionTime;

    /*
     * The least recent time at which the database account can be restored to (ISO-8601 format).
     */
    private OffsetDateTime oldestRestorableTime;

    /*
     * The API type of the restorable database account.
     */
    private ApiType apiType;

    /*
     * List of regions where the of the database account can be restored from.
     */
    private List<RestorableLocationResource> restorableLocations;

    /**
     * Creates an instance of RestorableDatabaseAccountProperties class.
     */
    public RestorableDatabaseAccountProperties() {
    }

    /**
     * Get the accountName property: The name of the global database account.
     * 
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The name of the global database account.
     * 
     * @param accountName the accountName value to set.
     * @return the RestorableDatabaseAccountProperties object itself.
     */
    public RestorableDatabaseAccountProperties withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the creationTime property: The creation time of the restorable database account (ISO-8601 format).
     * 
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: The creation time of the restorable database account (ISO-8601 format).
     * 
     * @param creationTime the creationTime value to set.
     * @return the RestorableDatabaseAccountProperties object itself.
     */
    public RestorableDatabaseAccountProperties withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the deletionTime property: The time at which the restorable database account has been deleted (ISO-8601
     * format).
     * 
     * @return the deletionTime value.
     */
    public OffsetDateTime deletionTime() {
        return this.deletionTime;
    }

    /**
     * Set the deletionTime property: The time at which the restorable database account has been deleted (ISO-8601
     * format).
     * 
     * @param deletionTime the deletionTime value to set.
     * @return the RestorableDatabaseAccountProperties object itself.
     */
    public RestorableDatabaseAccountProperties withDeletionTime(OffsetDateTime deletionTime) {
        this.deletionTime = deletionTime;
        return this;
    }

    /**
     * Get the oldestRestorableTime property: The least recent time at which the database account can be restored to
     * (ISO-8601 format).
     * 
     * @return the oldestRestorableTime value.
     */
    public OffsetDateTime oldestRestorableTime() {
        return this.oldestRestorableTime;
    }

    /**
     * Set the oldestRestorableTime property: The least recent time at which the database account can be restored to
     * (ISO-8601 format).
     * 
     * @param oldestRestorableTime the oldestRestorableTime value to set.
     * @return the RestorableDatabaseAccountProperties object itself.
     */
    public RestorableDatabaseAccountProperties withOldestRestorableTime(OffsetDateTime oldestRestorableTime) {
        this.oldestRestorableTime = oldestRestorableTime;
        return this;
    }

    /**
     * Get the apiType property: The API type of the restorable database account.
     * 
     * @return the apiType value.
     */
    public ApiType apiType() {
        return this.apiType;
    }

    /**
     * Get the restorableLocations property: List of regions where the of the database account can be restored from.
     * 
     * @return the restorableLocations value.
     */
    public List<RestorableLocationResource> restorableLocations() {
        return this.restorableLocations;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (restorableLocations() != null) {
            restorableLocations().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("accountName", this.accountName);
        jsonWriter.writeStringField("creationTime",
            this.creationTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.creationTime));
        jsonWriter.writeStringField("deletionTime",
            this.deletionTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.deletionTime));
        jsonWriter.writeStringField("oldestRestorableTime",
            this.oldestRestorableTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.oldestRestorableTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestorableDatabaseAccountProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestorableDatabaseAccountProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RestorableDatabaseAccountProperties.
     */
    public static RestorableDatabaseAccountProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestorableDatabaseAccountProperties deserializedRestorableDatabaseAccountProperties
                = new RestorableDatabaseAccountProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("accountName".equals(fieldName)) {
                    deserializedRestorableDatabaseAccountProperties.accountName = reader.getString();
                } else if ("creationTime".equals(fieldName)) {
                    deserializedRestorableDatabaseAccountProperties.creationTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("deletionTime".equals(fieldName)) {
                    deserializedRestorableDatabaseAccountProperties.deletionTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("oldestRestorableTime".equals(fieldName)) {
                    deserializedRestorableDatabaseAccountProperties.oldestRestorableTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("apiType".equals(fieldName)) {
                    deserializedRestorableDatabaseAccountProperties.apiType = ApiType.fromString(reader.getString());
                } else if ("restorableLocations".equals(fieldName)) {
                    List<RestorableLocationResource> restorableLocations
                        = reader.readArray(reader1 -> RestorableLocationResource.fromJson(reader1));
                    deserializedRestorableDatabaseAccountProperties.restorableLocations = restorableLocations;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestorableDatabaseAccountProperties;
        });
    }
}
