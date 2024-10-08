// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Parameters to indicate the information about the restore.
 */
@Fluent
public final class ResourceRestoreParameters extends RestoreParametersBase {
    /**
     * Creates an instance of ResourceRestoreParameters class.
     */
    public ResourceRestoreParameters() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceRestoreParameters withRestoreSource(String restoreSource) {
        super.withRestoreSource(restoreSource);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceRestoreParameters withRestoreTimestampInUtc(OffsetDateTime restoreTimestampInUtc) {
        super.withRestoreTimestampInUtc(restoreTimestampInUtc);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceRestoreParameters withRestoreWithTtlDisabled(Boolean restoreWithTtlDisabled) {
        super.withRestoreWithTtlDisabled(restoreWithTtlDisabled);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("restoreSource", restoreSource());
        jsonWriter.writeStringField("restoreTimestampInUtc",
            restoreTimestampInUtc() == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(restoreTimestampInUtc()));
        jsonWriter.writeBooleanField("restoreWithTtlDisabled", restoreWithTtlDisabled());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceRestoreParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceRestoreParameters if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceRestoreParameters.
     */
    public static ResourceRestoreParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceRestoreParameters deserializedResourceRestoreParameters = new ResourceRestoreParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("restoreSource".equals(fieldName)) {
                    deserializedResourceRestoreParameters.withRestoreSource(reader.getString());
                } else if ("restoreTimestampInUtc".equals(fieldName)) {
                    deserializedResourceRestoreParameters.withRestoreTimestampInUtc(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("restoreWithTtlDisabled".equals(fieldName)) {
                    deserializedResourceRestoreParameters
                        .withRestoreWithTtlDisabled(reader.getNullable(JsonReader::getBoolean));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceRestoreParameters;
        });
    }
}
