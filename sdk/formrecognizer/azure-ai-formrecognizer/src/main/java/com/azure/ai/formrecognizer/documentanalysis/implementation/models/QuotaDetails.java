// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Quota used, limit, and next reset date/time.
 */
@Immutable
public final class QuotaDetails implements JsonSerializable<QuotaDetails> {
    /*
     * Amount of the resource quota used.
     */
    @Generated
    private final int used;

    /*
     * Resource quota limit.
     */
    @Generated
    private final int quota;

    /*
     * Date/time when the resource quota usage will be reset.
     */
    @Generated
    private final OffsetDateTime quotaResetDateTime;

    /**
     * Creates an instance of QuotaDetails class.
     * 
     * @param used the used value to set.
     * @param quota the quota value to set.
     * @param quotaResetDateTime the quotaResetDateTime value to set.
     */
    @Generated
    public QuotaDetails(int used, int quota, OffsetDateTime quotaResetDateTime) {
        this.used = used;
        this.quota = quota;
        this.quotaResetDateTime = quotaResetDateTime;
    }

    /**
     * Get the used property: Amount of the resource quota used.
     * 
     * @return the used value.
     */
    @Generated
    public int getUsed() {
        return this.used;
    }

    /**
     * Get the quota property: Resource quota limit.
     * 
     * @return the quota value.
     */
    @Generated
    public int getQuota() {
        return this.quota;
    }

    /**
     * Get the quotaResetDateTime property: Date/time when the resource quota usage will be reset.
     * 
     * @return the quotaResetDateTime value.
     */
    @Generated
    public OffsetDateTime getQuotaResetDateTime() {
        return this.quotaResetDateTime;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("used", this.used);
        jsonWriter.writeIntField("quota", this.quota);
        jsonWriter.writeStringField("quotaResetDateTime",
            this.quotaResetDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.quotaResetDateTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QuotaDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QuotaDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the QuotaDetails.
     */
    @Generated
    public static QuotaDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean usedFound = false;
            int used = 0;
            boolean quotaFound = false;
            int quota = 0;
            boolean quotaResetDateTimeFound = false;
            OffsetDateTime quotaResetDateTime = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("used".equals(fieldName)) {
                    used = reader.getInt();
                    usedFound = true;
                } else if ("quota".equals(fieldName)) {
                    quota = reader.getInt();
                    quotaFound = true;
                } else if ("quotaResetDateTime".equals(fieldName)) {
                    quotaResetDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                    quotaResetDateTimeFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (usedFound && quotaFound && quotaResetDateTimeFound) {
                return new QuotaDetails(used, quota, quotaResetDateTime);
            }
            List<String> missingProperties = new ArrayList<>();
            if (!usedFound) {
                missingProperties.add("used");
            }
            if (!quotaFound) {
                missingProperties.add("quota");
            }
            if (!quotaResetDateTimeFound) {
                missingProperties.add("quotaResetDateTime");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
