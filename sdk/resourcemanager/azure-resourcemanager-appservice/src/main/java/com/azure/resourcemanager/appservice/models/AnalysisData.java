// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.fluent.models.DetectorDefinition;
import java.io.IOException;
import java.util.List;

/**
 * Class Representing Detector Evidence used for analysis.
 */
@Fluent
public final class AnalysisData implements JsonSerializable<AnalysisData> {
    /*
     * Name of the Detector
     */
    private String source;

    /*
     * Detector Definition
     */
    private DetectorDefinition detectorDefinition;

    /*
     * Source Metrics
     */
    private List<DiagnosticMetricSet> metrics;

    /*
     * Additional Source Data
     */
    private List<List<NameValuePair>> data;

    /*
     * Detector Meta Data
     */
    private ResponseMetadata detectorMetadata;

    /**
     * Creates an instance of AnalysisData class.
     */
    public AnalysisData() {
    }

    /**
     * Get the source property: Name of the Detector.
     * 
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Name of the Detector.
     * 
     * @param source the source value to set.
     * @return the AnalysisData object itself.
     */
    public AnalysisData withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the detectorDefinition property: Detector Definition.
     * 
     * @return the detectorDefinition value.
     */
    public DetectorDefinition detectorDefinition() {
        return this.detectorDefinition;
    }

    /**
     * Set the detectorDefinition property: Detector Definition.
     * 
     * @param detectorDefinition the detectorDefinition value to set.
     * @return the AnalysisData object itself.
     */
    public AnalysisData withDetectorDefinition(DetectorDefinition detectorDefinition) {
        this.detectorDefinition = detectorDefinition;
        return this;
    }

    /**
     * Get the metrics property: Source Metrics.
     * 
     * @return the metrics value.
     */
    public List<DiagnosticMetricSet> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: Source Metrics.
     * 
     * @param metrics the metrics value to set.
     * @return the AnalysisData object itself.
     */
    public AnalysisData withMetrics(List<DiagnosticMetricSet> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the data property: Additional Source Data.
     * 
     * @return the data value.
     */
    public List<List<NameValuePair>> data() {
        return this.data;
    }

    /**
     * Set the data property: Additional Source Data.
     * 
     * @param data the data value to set.
     * @return the AnalysisData object itself.
     */
    public AnalysisData withData(List<List<NameValuePair>> data) {
        this.data = data;
        return this;
    }

    /**
     * Get the detectorMetadata property: Detector Meta Data.
     * 
     * @return the detectorMetadata value.
     */
    public ResponseMetadata detectorMetadata() {
        return this.detectorMetadata;
    }

    /**
     * Set the detectorMetadata property: Detector Meta Data.
     * 
     * @param detectorMetadata the detectorMetadata value to set.
     * @return the AnalysisData object itself.
     */
    public AnalysisData withDetectorMetadata(ResponseMetadata detectorMetadata) {
        this.detectorMetadata = detectorMetadata;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (detectorDefinition() != null) {
            detectorDefinition().validate();
        }
        if (metrics() != null) {
            metrics().forEach(e -> e.validate());
        }
        if (data() != null) {
            data().forEach(e -> e.forEach(e1 -> e1.validate()));
        }
        if (detectorMetadata() != null) {
            detectorMetadata().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("source", this.source);
        jsonWriter.writeJsonField("detectorDefinition", this.detectorDefinition);
        jsonWriter.writeArrayField("metrics", this.metrics, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("data", this.data,
            (writer, element) -> writer.writeArray(element, (writer1, element1) -> writer1.writeJson(element1)));
        jsonWriter.writeJsonField("detectorMetaData", this.detectorMetadata);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnalysisData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnalysisData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AnalysisData.
     */
    public static AnalysisData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnalysisData deserializedAnalysisData = new AnalysisData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("source".equals(fieldName)) {
                    deserializedAnalysisData.source = reader.getString();
                } else if ("detectorDefinition".equals(fieldName)) {
                    deserializedAnalysisData.detectorDefinition = DetectorDefinition.fromJson(reader);
                } else if ("metrics".equals(fieldName)) {
                    List<DiagnosticMetricSet> metrics
                        = reader.readArray(reader1 -> DiagnosticMetricSet.fromJson(reader1));
                    deserializedAnalysisData.metrics = metrics;
                } else if ("data".equals(fieldName)) {
                    List<List<NameValuePair>> data
                        = reader.readArray(reader1 -> reader1.readArray(reader2 -> NameValuePair.fromJson(reader2)));
                    deserializedAnalysisData.data = data;
                } else if ("detectorMetaData".equals(fieldName)) {
                    deserializedAnalysisData.detectorMetadata = ResponseMetadata.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAnalysisData;
        });
    }
}
