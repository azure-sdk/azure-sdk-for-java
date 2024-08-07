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
import java.util.List;

/**
 * Metric specification of operation.
 */
@Fluent
public final class MetricSpecification implements JsonSerializable<MetricSpecification> {
    /*
     * Name of metric specification.
     */
    private String name;

    /*
     * Display name of metric specification.
     */
    private String displayName;

    /*
     * Display description of metric specification.
     */
    private String displayDescription;

    /*
     * The metric unit. Possible values include: 'Bytes', 'Count', 'Milliseconds'.
     */
    private String unit;

    /*
     * The metric aggregation type. Possible values include: 'Average', 'Count', 'Total'.
     */
    private String aggregationType;

    /*
     * The supported aggregation types for the metrics.
     */
    private List<String> supportedAggregationTypes;

    /*
     * The supported time grain types for the metrics.
     */
    private List<String> supportedTimeGrainTypes;

    /*
     * The metric lock aggregation type.
     */
    private String lockAggregationType;

    /*
     * The dimensions of metric
     */
    private List<DimensionProperties> dimensions;

    /*
     * Property to specify whether to fill gap with zero.
     */
    private Boolean fillGapWithZero;

    /*
     * The internal metric name.
     */
    private String internalMetricName;

    /**
     * Creates an instance of MetricSpecification class.
     */
    public MetricSpecification() {
    }

    /**
     * Get the name property: Name of metric specification.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of metric specification.
     * 
     * @param name the name value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Display name of metric specification.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of metric specification.
     * 
     * @param displayName the displayName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription property: Display description of metric specification.
     * 
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: Display description of metric specification.
     * 
     * @param displayDescription the displayDescription value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit property: The metric unit. Possible values include: 'Bytes', 'Count', 'Milliseconds'.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The metric unit. Possible values include: 'Bytes', 'Count', 'Milliseconds'.
     * 
     * @param unit the unit value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the aggregationType property: The metric aggregation type. Possible values include: 'Average', 'Count',
     * 'Total'.
     * 
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: The metric aggregation type. Possible values include: 'Average', 'Count',
     * 'Total'.
     * 
     * @param aggregationType the aggregationType value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the supportedAggregationTypes property: The supported aggregation types for the metrics.
     * 
     * @return the supportedAggregationTypes value.
     */
    public List<String> supportedAggregationTypes() {
        return this.supportedAggregationTypes;
    }

    /**
     * Set the supportedAggregationTypes property: The supported aggregation types for the metrics.
     * 
     * @param supportedAggregationTypes the supportedAggregationTypes value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSupportedAggregationTypes(List<String> supportedAggregationTypes) {
        this.supportedAggregationTypes = supportedAggregationTypes;
        return this;
    }

    /**
     * Get the supportedTimeGrainTypes property: The supported time grain types for the metrics.
     * 
     * @return the supportedTimeGrainTypes value.
     */
    public List<String> supportedTimeGrainTypes() {
        return this.supportedTimeGrainTypes;
    }

    /**
     * Set the supportedTimeGrainTypes property: The supported time grain types for the metrics.
     * 
     * @param supportedTimeGrainTypes the supportedTimeGrainTypes value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSupportedTimeGrainTypes(List<String> supportedTimeGrainTypes) {
        this.supportedTimeGrainTypes = supportedTimeGrainTypes;
        return this;
    }

    /**
     * Get the lockAggregationType property: The metric lock aggregation type.
     * 
     * @return the lockAggregationType value.
     */
    public String lockAggregationType() {
        return this.lockAggregationType;
    }

    /**
     * Set the lockAggregationType property: The metric lock aggregation type.
     * 
     * @param lockAggregationType the lockAggregationType value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withLockAggregationType(String lockAggregationType) {
        this.lockAggregationType = lockAggregationType;
        return this;
    }

    /**
     * Get the dimensions property: The dimensions of metric.
     * 
     * @return the dimensions value.
     */
    public List<DimensionProperties> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: The dimensions of metric.
     * 
     * @param dimensions the dimensions value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<DimensionProperties> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the fillGapWithZero property: Property to specify whether to fill gap with zero.
     * 
     * @return the fillGapWithZero value.
     */
    public Boolean fillGapWithZero() {
        return this.fillGapWithZero;
    }

    /**
     * Set the fillGapWithZero property: Property to specify whether to fill gap with zero.
     * 
     * @param fillGapWithZero the fillGapWithZero value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withFillGapWithZero(Boolean fillGapWithZero) {
        this.fillGapWithZero = fillGapWithZero;
        return this;
    }

    /**
     * Get the internalMetricName property: The internal metric name.
     * 
     * @return the internalMetricName value.
     */
    public String internalMetricName() {
        return this.internalMetricName;
    }

    /**
     * Set the internalMetricName property: The internal metric name.
     * 
     * @param internalMetricName the internalMetricName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withInternalMetricName(String internalMetricName) {
        this.internalMetricName = internalMetricName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("displayDescription", this.displayDescription);
        jsonWriter.writeStringField("unit", this.unit);
        jsonWriter.writeStringField("aggregationType", this.aggregationType);
        jsonWriter.writeArrayField("supportedAggregationTypes", this.supportedAggregationTypes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("supportedTimeGrainTypes", this.supportedTimeGrainTypes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("lockAggregationType", this.lockAggregationType);
        jsonWriter.writeArrayField("dimensions", this.dimensions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("fillGapWithZero", this.fillGapWithZero);
        jsonWriter.writeStringField("internalMetricName", this.internalMetricName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricSpecification from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricSpecification if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MetricSpecification.
     */
    public static MetricSpecification fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricSpecification deserializedMetricSpecification = new MetricSpecification();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedMetricSpecification.name = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedMetricSpecification.displayName = reader.getString();
                } else if ("displayDescription".equals(fieldName)) {
                    deserializedMetricSpecification.displayDescription = reader.getString();
                } else if ("unit".equals(fieldName)) {
                    deserializedMetricSpecification.unit = reader.getString();
                } else if ("aggregationType".equals(fieldName)) {
                    deserializedMetricSpecification.aggregationType = reader.getString();
                } else if ("supportedAggregationTypes".equals(fieldName)) {
                    List<String> supportedAggregationTypes = reader.readArray(reader1 -> reader1.getString());
                    deserializedMetricSpecification.supportedAggregationTypes = supportedAggregationTypes;
                } else if ("supportedTimeGrainTypes".equals(fieldName)) {
                    List<String> supportedTimeGrainTypes = reader.readArray(reader1 -> reader1.getString());
                    deserializedMetricSpecification.supportedTimeGrainTypes = supportedTimeGrainTypes;
                } else if ("lockAggregationType".equals(fieldName)) {
                    deserializedMetricSpecification.lockAggregationType = reader.getString();
                } else if ("dimensions".equals(fieldName)) {
                    List<DimensionProperties> dimensions
                        = reader.readArray(reader1 -> DimensionProperties.fromJson(reader1));
                    deserializedMetricSpecification.dimensions = dimensions;
                } else if ("fillGapWithZero".equals(fieldName)) {
                    deserializedMetricSpecification.fillGapWithZero = reader.getNullable(JsonReader::getBoolean);
                } else if ("internalMetricName".equals(fieldName)) {
                    deserializedMetricSpecification.internalMetricName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetricSpecification;
        });
    }
}
