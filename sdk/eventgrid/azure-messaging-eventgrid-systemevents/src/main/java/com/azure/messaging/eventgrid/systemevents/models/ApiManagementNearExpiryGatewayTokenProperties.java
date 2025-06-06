// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.messaging.eventgrid.systemevents.models;

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

/**
 * Information related to a gateway token that is near expiry for a self-hosted gateway deployment.
 */
@Immutable
public final class ApiManagementNearExpiryGatewayTokenProperties
    implements JsonSerializable<ApiManagementNearExpiryGatewayTokenProperties> {
    /*
     * Timestamp when the gateway token will expire.
     */
    @Generated
    private final OffsetDateTime expiresOn;

    /**
     * Creates an instance of ApiManagementNearExpiryGatewayTokenProperties class.
     * 
     * @param expiresOn the expiresOn value to set.
     */
    @Generated
    private ApiManagementNearExpiryGatewayTokenProperties(OffsetDateTime expiresOn) {
        this.expiresOn = expiresOn;
    }

    /**
     * Get the expiresOn property: Timestamp when the gateway token will expire.
     * 
     * @return the expiresOn value.
     */
    @Generated
    public OffsetDateTime getExpiresOn() {
        return this.expiresOn;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("expiredAtUtc",
            this.expiresOn == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expiresOn));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApiManagementNearExpiryGatewayTokenProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiManagementNearExpiryGatewayTokenProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApiManagementNearExpiryGatewayTokenProperties.
     */
    @Generated
    public static ApiManagementNearExpiryGatewayTokenProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OffsetDateTime expiresOn = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("expiredAtUtc".equals(fieldName)) {
                    expiresOn = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }
            return new ApiManagementNearExpiryGatewayTokenProperties(expiresOn);
        });
    }
}
