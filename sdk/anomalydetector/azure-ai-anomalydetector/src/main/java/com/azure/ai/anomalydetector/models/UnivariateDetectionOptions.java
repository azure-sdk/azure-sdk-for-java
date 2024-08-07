// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Request of the entire or last anomaly detection.
 */
@Fluent
public final class UnivariateDetectionOptions implements JsonSerializable<UnivariateDetectionOptions> {

    /*
     * Time series data points. Points should be sorted by time stamp in ascending
     * order to match the anomaly detection result. If the data is not sorted
     * correctly or there's a duplicated time stamp, the API won't work. In such
     * a case, an error message is returned.
     */
    @Generated
    private final List<TimeSeriesPoint> series;

    /*
     * Argument that indicates time granularity. If granularity is not present, the value
     * is none by default. If granularity is none, the time stamp property in the time
     * series point can be absent.
     */
    @Generated
    private TimeGranularity granularity;

    /*
     * A custom interval is used to set a nonstandard time interval. For example, if the
     * series is 5 minutes, the request can be set as {"granularity":"minutely",
     * "customInterval":5}.
     */
    @Generated
    private Integer customInterval;

    /*
     * Argument that indicates the periodic value of a time series. If the value is null or
     * is not present, the API determines the period automatically.
     */
    @Generated
    private Integer period;

    /*
     * Argument that indicates an advanced model parameter. It's the maximum anomaly ratio in a time series.
     */
    @Generated
    private Double maxAnomalyRatio;

    /*
     * Argument that indicates an advanced model parameter between 0 and 99. The lower the value
     * is, the larger the margin value is, which means fewer anomalies will be
     * accepted.
     */
    @Generated
    private Integer sensitivity;

    /*
     * Specifies how to deal with missing values in the input series. It's used
     * when granularity is not "none".
     */
    @Generated
    private ImputeMode imputeMode;

    /*
     * Specifies the value to fill. It's used when granularity is not "none"
     * and imputeMode is "fixed".
     */
    @Generated
    private Double imputeFixedValue;

    /**
     * Creates an instance of UnivariateDetectionOptions class.
     *
     * @param series the series value to set.
     */
    @Generated
    public UnivariateDetectionOptions(List<TimeSeriesPoint> series) {
        this.series = series;
    }

    /**
     * Get the series property: Time series data points. Points should be sorted by time stamp in ascending
     * order to match the anomaly detection result. If the data is not sorted
     * correctly or there's a duplicated time stamp, the API won't work. In such
     * a case, an error message is returned.
     *
     * @return the series value.
     */
    @Generated
    public List<TimeSeriesPoint> getSeries() {
        return this.series;
    }

    /**
     * Get the granularity property: Argument that indicates time granularity. If granularity is not present, the value
     * is none by default. If granularity is none, the time stamp property in the time
     * series point can be absent.
     *
     * @return the granularity value.
     */
    @Generated
    public TimeGranularity getGranularity() {
        return this.granularity;
    }

    /**
     * Set the granularity property: Argument that indicates time granularity. If granularity is not present, the value
     * is none by default. If granularity is none, the time stamp property in the time
     * series point can be absent.
     *
     * @param granularity the granularity value to set.
     * @return the UnivariateDetectionOptions object itself.
     */
    @Generated
    public UnivariateDetectionOptions setGranularity(TimeGranularity granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * Get the customInterval property: A custom interval is used to set a nonstandard time interval. For example, if
     * the
     * series is 5 minutes, the request can be set as {"granularity":"minutely",
     * "customInterval":5}.
     *
     * @return the customInterval value.
     */
    @Generated
    public Integer getCustomInterval() {
        return this.customInterval;
    }

    /**
     * Set the customInterval property: A custom interval is used to set a nonstandard time interval. For example, if
     * the
     * series is 5 minutes, the request can be set as {"granularity":"minutely",
     * "customInterval":5}.
     *
     * @param customInterval the customInterval value to set.
     * @return the UnivariateDetectionOptions object itself.
     */
    @Generated
    public UnivariateDetectionOptions setCustomInterval(Integer customInterval) {
        this.customInterval = customInterval;
        return this;
    }

    /**
     * Get the period property: Argument that indicates the periodic value of a time series. If the value is null or
     * is not present, the API determines the period automatically.
     *
     * @return the period value.
     */
    @Generated
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * Set the period property: Argument that indicates the periodic value of a time series. If the value is null or
     * is not present, the API determines the period automatically.
     *
     * @param period the period value to set.
     * @return the UnivariateDetectionOptions object itself.
     */
    @Generated
    public UnivariateDetectionOptions setPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * Get the maxAnomalyRatio property: Argument that indicates an advanced model parameter. It's the maximum anomaly
     * ratio in a time series.
     *
     * @return the maxAnomalyRatio value.
     */
    @Generated
    public Double getMaxAnomalyRatio() {
        return this.maxAnomalyRatio;
    }

    /**
     * Set the maxAnomalyRatio property: Argument that indicates an advanced model parameter. It's the maximum anomaly
     * ratio in a time series.
     *
     * @param maxAnomalyRatio the maxAnomalyRatio value to set.
     * @return the UnivariateDetectionOptions object itself.
     */
    @Generated
    public UnivariateDetectionOptions setMaxAnomalyRatio(Double maxAnomalyRatio) {
        this.maxAnomalyRatio = maxAnomalyRatio;
        return this;
    }

    /**
     * Get the sensitivity property: Argument that indicates an advanced model parameter between 0 and 99. The lower the
     * value
     * is, the larger the margin value is, which means fewer anomalies will be
     * accepted.
     *
     * @return the sensitivity value.
     */
    @Generated
    public Integer getSensitivity() {
        return this.sensitivity;
    }

    /**
     * Set the sensitivity property: Argument that indicates an advanced model parameter between 0 and 99. The lower the
     * value
     * is, the larger the margin value is, which means fewer anomalies will be
     * accepted.
     *
     * @param sensitivity the sensitivity value to set.
     * @return the UnivariateDetectionOptions object itself.
     */
    @Generated
    public UnivariateDetectionOptions setSensitivity(Integer sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }

    /**
     * Get the imputeMode property: Specifies how to deal with missing values in the input series. It's used
     * when granularity is not "none".
     *
     * @return the imputeMode value.
     */
    @Generated
    public ImputeMode getImputeMode() {
        return this.imputeMode;
    }

    /**
     * Set the imputeMode property: Specifies how to deal with missing values in the input series. It's used
     * when granularity is not "none".
     *
     * @param imputeMode the imputeMode value to set.
     * @return the UnivariateDetectionOptions object itself.
     */
    @Generated
    public UnivariateDetectionOptions setImputeMode(ImputeMode imputeMode) {
        this.imputeMode = imputeMode;
        return this;
    }

    /**
     * Get the imputeFixedValue property: Specifies the value to fill. It's used when granularity is not "none"
     * and imputeMode is "fixed".
     *
     * @return the imputeFixedValue value.
     */
    @Generated
    public Double getImputeFixedValue() {
        return this.imputeFixedValue;
    }

    /**
     * Set the imputeFixedValue property: Specifies the value to fill. It's used when granularity is not "none"
     * and imputeMode is "fixed".
     *
     * @param imputeFixedValue the imputeFixedValue value to set.
     * @return the UnivariateDetectionOptions object itself.
     */
    @Generated
    public UnivariateDetectionOptions setImputeFixedValue(Double imputeFixedValue) {
        this.imputeFixedValue = imputeFixedValue;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("series", this.series, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("granularity", this.granularity == null ? null : this.granularity.toString());
        jsonWriter.writeNumberField("customInterval", this.customInterval);
        jsonWriter.writeNumberField("period", this.period);
        jsonWriter.writeNumberField("maxAnomalyRatio", this.maxAnomalyRatio);
        jsonWriter.writeNumberField("sensitivity", this.sensitivity);
        jsonWriter.writeStringField("imputeMode", this.imputeMode == null ? null : this.imputeMode.toString());
        jsonWriter.writeNumberField("imputeFixedValue", this.imputeFixedValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UnivariateDetectionOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of UnivariateDetectionOptions if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UnivariateDetectionOptions.
     */
    @Generated
    public static UnivariateDetectionOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<TimeSeriesPoint> series = null;
            TimeGranularity granularity = null;
            Integer customInterval = null;
            Integer period = null;
            Double maxAnomalyRatio = null;
            Integer sensitivity = null;
            ImputeMode imputeMode = null;
            Double imputeFixedValue = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("series".equals(fieldName)) {
                    series = reader.readArray(reader1 -> TimeSeriesPoint.fromJson(reader1));
                } else if ("granularity".equals(fieldName)) {
                    granularity = TimeGranularity.fromString(reader.getString());
                } else if ("customInterval".equals(fieldName)) {
                    customInterval = reader.getNullable(JsonReader::getInt);
                } else if ("period".equals(fieldName)) {
                    period = reader.getNullable(JsonReader::getInt);
                } else if ("maxAnomalyRatio".equals(fieldName)) {
                    maxAnomalyRatio = reader.getNullable(JsonReader::getDouble);
                } else if ("sensitivity".equals(fieldName)) {
                    sensitivity = reader.getNullable(JsonReader::getInt);
                } else if ("imputeMode".equals(fieldName)) {
                    imputeMode = ImputeMode.fromString(reader.getString());
                } else if ("imputeFixedValue".equals(fieldName)) {
                    imputeFixedValue = reader.getNullable(JsonReader::getDouble);
                } else {
                    reader.skipChildren();
                }
            }
            UnivariateDetectionOptions deserializedUnivariateDetectionOptions = new UnivariateDetectionOptions(series);
            deserializedUnivariateDetectionOptions.granularity = granularity;
            deserializedUnivariateDetectionOptions.customInterval = customInterval;
            deserializedUnivariateDetectionOptions.period = period;
            deserializedUnivariateDetectionOptions.maxAnomalyRatio = maxAnomalyRatio;
            deserializedUnivariateDetectionOptions.sensitivity = sensitivity;
            deserializedUnivariateDetectionOptions.imputeMode = imputeMode;
            deserializedUnivariateDetectionOptions.imputeFixedValue = imputeFixedValue;
            return deserializedUnivariateDetectionOptions;
        });
    }
}
