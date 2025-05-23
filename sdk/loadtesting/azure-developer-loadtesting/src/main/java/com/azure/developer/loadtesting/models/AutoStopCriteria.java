// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.developer.loadtesting.implementation.JsonMergePatchHelper;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

/**
 * Auto stop criteria for a test. This will automatically stop a load test if the error percentage is high for a certain
 * time window.
 */
@Fluent
public final class AutoStopCriteria implements JsonSerializable<AutoStopCriteria> {

    /*
     * Whether auto-stop should be disabled. The default value is false.
     */
    @Generated
    private Boolean autoStopDisabled;

    /*
     * Threshold percentage of errors on which test run should be automatically stopped. Allowed values are in range of
     * 0.0-100.0
     */
    @Generated
    private Double errorRate;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    private boolean jsonMergePatch;

    @Generated
    private void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setAutoStopCriteriaAccessor(new JsonMergePatchHelper.AutoStopCriteriaAccessor() {

            @Override
            public AutoStopCriteria prepareModelForJsonMergePatch(AutoStopCriteria model,
                boolean jsonMergePatchEnabled) {
                model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
                return model;
            }

            @Override
            public boolean isJsonMergePatch(AutoStopCriteria model) {
                return model.jsonMergePatch;
            }
        });
    }

    /**
     * Creates an instance of AutoStopCriteria class.
     */
    @Generated
    public AutoStopCriteria() {
    }

    /**
     * Get the autoStopDisabled property: Whether auto-stop should be disabled. The default value is false.
     *
     * @return the autoStopDisabled value.
     */
    @Generated
    public Boolean isAutoStopDisabled() {
        return this.autoStopDisabled;
    }

    /**
     * Set the autoStopDisabled property: Whether auto-stop should be disabled. The default value is false.
     *
     * @param autoStopDisabled the autoStopDisabled value to set.
     * @return the AutoStopCriteria object itself.
     */
    @Generated
    public AutoStopCriteria setAutoStopDisabled(Boolean autoStopDisabled) {
        this.autoStopDisabled = autoStopDisabled;
        this.updatedProperties.add("autoStopDisabled");
        return this;
    }

    /**
     * Get the errorRate property: Threshold percentage of errors on which test run should be automatically stopped.
     * Allowed values are in range of 0.0-100.0.
     *
     * @return the errorRate value.
     */
    @Generated
    public Double getErrorRate() {
        return this.errorRate;
    }

    /**
     * Set the errorRate property: Threshold percentage of errors on which test run should be automatically stopped.
     * Allowed values are in range of 0.0-100.0.
     *
     * @param errorRate the errorRate value to set.
     * @return the AutoStopCriteria object itself.
     */
    @Generated
    public AutoStopCriteria setErrorRate(Double errorRate) {
        this.errorRate = errorRate;
        this.updatedProperties.add("errorRate");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeBooleanField("autoStopDisabled", this.autoStopDisabled);
            jsonWriter.writeNumberField("errorRate", this.errorRate);
            jsonWriter.writeNumberField("errorRateTimeWindowInSeconds", this.errorRateTimeWindow);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("autoStopDisabled")) {
            if (this.autoStopDisabled == null) {
                jsonWriter.writeNullField("autoStopDisabled");
            } else {
                jsonWriter.writeBooleanField("autoStopDisabled", this.autoStopDisabled);
            }
        }
        if (updatedProperties.contains("errorRate")) {
            if (this.errorRate == null) {
                jsonWriter.writeNullField("errorRate");
            } else {
                jsonWriter.writeNumberField("errorRate", this.errorRate);
            }
        }
        if (updatedProperties.contains("errorRateTimeWindow")) {
            if (this.errorRateTimeWindow == null) {
                jsonWriter.writeNullField("errorRateTimeWindowInSeconds");
            } else {
                jsonWriter.writeNumberField("errorRateTimeWindowInSeconds", this.errorRateTimeWindow);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AutoStopCriteria from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutoStopCriteria if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AutoStopCriteria.
     */
    @Generated
    public static AutoStopCriteria fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AutoStopCriteria deserializedAutoStopCriteria = new AutoStopCriteria();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("autoStopDisabled".equals(fieldName)) {
                    deserializedAutoStopCriteria.autoStopDisabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("errorRate".equals(fieldName)) {
                    deserializedAutoStopCriteria.errorRate = reader.getNullable(JsonReader::getDouble);
                } else if ("errorRateTimeWindowInSeconds".equals(fieldName)) {
                    deserializedAutoStopCriteria.errorRateTimeWindow = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedAutoStopCriteria;
        });
    }

    /*
     * Time window during which the error percentage should be evaluated in seconds.
     */
    @Generated
    private Long errorRateTimeWindow;

    /**
     * Get the errorRateTimeWindow property: Time window during which the error percentage should be evaluated in
     * seconds.
     *
     * @return the errorRateTimeWindow value.
     */
    @Generated
    public Duration getErrorRateTimeWindow() {
        if (this.errorRateTimeWindow == null) {
            return null;
        }
        return Duration.ofSeconds(this.errorRateTimeWindow);
    }

    /**
     * Set the errorRateTimeWindow property: Time window during which the error percentage should be evaluated in
     * seconds.
     *
     * @param errorRateTimeWindow the errorRateTimeWindow value to set.
     * @return the AutoStopCriteria object itself.
     */
    @Generated
    public AutoStopCriteria setErrorRateTimeWindow(Duration errorRateTimeWindow) {
        if (errorRateTimeWindow == null) {
            this.errorRateTimeWindow = null;
        } else {
            this.errorRateTimeWindow = errorRateTimeWindow.getSeconds();
        }
        this.updatedProperties.add("errorRateTimeWindow");
        return this;
    }
}
