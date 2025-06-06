// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The DailyHistoricalActualsResult model.
 */
@Fluent
public final class DailyHistoricalActualsResult implements JsonSerializable<DailyHistoricalActualsResult> {

    /*
     * Historical actuals for each requested day.
     */
    @Generated
    private List<DailyHistoricalActuals> historicalActuals;

    /*
     * The is the link to the next page of the features returned. If it's the last page, no this field.
     */
    @Generated
    private String nextLink;

    /**
     * Set default DailyHistoricalActualsResult constructor to private
     */
    @Generated
    private DailyHistoricalActualsResult() {
    }

    /**
     * Get the historicalActuals property: Historical actuals for each requested day.
     *
     * @return the historicalActuals value.
     */
    @Generated
    public List<DailyHistoricalActuals> getHistoricalActuals() {
        return this.historicalActuals;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("results", this.historicalActuals, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DailyHistoricalActualsResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DailyHistoricalActualsResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DailyHistoricalActualsResult.
     */
    @Generated
    public static DailyHistoricalActualsResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DailyHistoricalActualsResult deserializedDailyHistoricalActualsResult = new DailyHistoricalActualsResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("results".equals(fieldName)) {
                    List<DailyHistoricalActuals> historicalActuals
                        = reader.readArray(reader1 -> DailyHistoricalActuals.fromJson(reader1));
                    deserializedDailyHistoricalActualsResult.historicalActuals = historicalActuals;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedDailyHistoricalActualsResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedDailyHistoricalActualsResult;
        });
    }
}
