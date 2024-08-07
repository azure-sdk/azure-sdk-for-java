// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The TimerTriggerDescriptor model.
 */
@Fluent
public final class TimerTriggerDescriptor implements JsonSerializable<TimerTriggerDescriptor> {
    /*
     * The timer trigger name that caused the run.
     */
    private String timerTriggerName;

    /*
     * The occurrence that triggered the run.
     */
    private String scheduleOccurrence;

    /**
     * Creates an instance of TimerTriggerDescriptor class.
     */
    public TimerTriggerDescriptor() {
    }

    /**
     * Get the timerTriggerName property: The timer trigger name that caused the run.
     * 
     * @return the timerTriggerName value.
     */
    public String timerTriggerName() {
        return this.timerTriggerName;
    }

    /**
     * Set the timerTriggerName property: The timer trigger name that caused the run.
     * 
     * @param timerTriggerName the timerTriggerName value to set.
     * @return the TimerTriggerDescriptor object itself.
     */
    public TimerTriggerDescriptor withTimerTriggerName(String timerTriggerName) {
        this.timerTriggerName = timerTriggerName;
        return this;
    }

    /**
     * Get the scheduleOccurrence property: The occurrence that triggered the run.
     * 
     * @return the scheduleOccurrence value.
     */
    public String scheduleOccurrence() {
        return this.scheduleOccurrence;
    }

    /**
     * Set the scheduleOccurrence property: The occurrence that triggered the run.
     * 
     * @param scheduleOccurrence the scheduleOccurrence value to set.
     * @return the TimerTriggerDescriptor object itself.
     */
    public TimerTriggerDescriptor withScheduleOccurrence(String scheduleOccurrence) {
        this.scheduleOccurrence = scheduleOccurrence;
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
        jsonWriter.writeStringField("timerTriggerName", this.timerTriggerName);
        jsonWriter.writeStringField("scheduleOccurrence", this.scheduleOccurrence);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TimerTriggerDescriptor from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TimerTriggerDescriptor if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TimerTriggerDescriptor.
     */
    public static TimerTriggerDescriptor fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TimerTriggerDescriptor deserializedTimerTriggerDescriptor = new TimerTriggerDescriptor();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("timerTriggerName".equals(fieldName)) {
                    deserializedTimerTriggerDescriptor.timerTriggerName = reader.getString();
                } else if ("scheduleOccurrence".equals(fieldName)) {
                    deserializedTimerTriggerDescriptor.scheduleOccurrence = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTimerTriggerDescriptor;
        });
    }
}
