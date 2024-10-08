// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The MaterializationSettings model.
 */
@Fluent
public final class MaterializationSettings implements JsonSerializable<MaterializationSettings> {
    /*
     * Specifies the stores to which materialization should happen
     */
    private MaterializationStoreType storeType;

    /*
     * Specifies the schedule details
     */
    private RecurrenceTrigger schedule;

    /*
     * Specifies the notification details
     */
    private NotificationSetting notification;

    /*
     * Specifies the compute resource settings
     */
    private MaterializationComputeResource resource;

    /*
     * Specifies the spark compute settings
     */
    private Map<String, String> sparkConfiguration;

    /**
     * Creates an instance of MaterializationSettings class.
     */
    public MaterializationSettings() {
    }

    /**
     * Get the storeType property: Specifies the stores to which materialization should happen.
     * 
     * @return the storeType value.
     */
    public MaterializationStoreType storeType() {
        return this.storeType;
    }

    /**
     * Set the storeType property: Specifies the stores to which materialization should happen.
     * 
     * @param storeType the storeType value to set.
     * @return the MaterializationSettings object itself.
     */
    public MaterializationSettings withStoreType(MaterializationStoreType storeType) {
        this.storeType = storeType;
        return this;
    }

    /**
     * Get the schedule property: Specifies the schedule details.
     * 
     * @return the schedule value.
     */
    public RecurrenceTrigger schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: Specifies the schedule details.
     * 
     * @param schedule the schedule value to set.
     * @return the MaterializationSettings object itself.
     */
    public MaterializationSettings withSchedule(RecurrenceTrigger schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the notification property: Specifies the notification details.
     * 
     * @return the notification value.
     */
    public NotificationSetting notification() {
        return this.notification;
    }

    /**
     * Set the notification property: Specifies the notification details.
     * 
     * @param notification the notification value to set.
     * @return the MaterializationSettings object itself.
     */
    public MaterializationSettings withNotification(NotificationSetting notification) {
        this.notification = notification;
        return this;
    }

    /**
     * Get the resource property: Specifies the compute resource settings.
     * 
     * @return the resource value.
     */
    public MaterializationComputeResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Specifies the compute resource settings.
     * 
     * @param resource the resource value to set.
     * @return the MaterializationSettings object itself.
     */
    public MaterializationSettings withResource(MaterializationComputeResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the sparkConfiguration property: Specifies the spark compute settings.
     * 
     * @return the sparkConfiguration value.
     */
    public Map<String, String> sparkConfiguration() {
        return this.sparkConfiguration;
    }

    /**
     * Set the sparkConfiguration property: Specifies the spark compute settings.
     * 
     * @param sparkConfiguration the sparkConfiguration value to set.
     * @return the MaterializationSettings object itself.
     */
    public MaterializationSettings withSparkConfiguration(Map<String, String> sparkConfiguration) {
        this.sparkConfiguration = sparkConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schedule() != null) {
            schedule().validate();
        }
        if (notification() != null) {
            notification().validate();
        }
        if (resource() != null) {
            resource().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("storeType", this.storeType == null ? null : this.storeType.toString());
        jsonWriter.writeJsonField("schedule", this.schedule);
        jsonWriter.writeJsonField("notification", this.notification);
        jsonWriter.writeJsonField("resource", this.resource);
        jsonWriter.writeMapField("sparkConfiguration", this.sparkConfiguration,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MaterializationSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MaterializationSettings if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MaterializationSettings.
     */
    public static MaterializationSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MaterializationSettings deserializedMaterializationSettings = new MaterializationSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("storeType".equals(fieldName)) {
                    deserializedMaterializationSettings.storeType
                        = MaterializationStoreType.fromString(reader.getString());
                } else if ("schedule".equals(fieldName)) {
                    deserializedMaterializationSettings.schedule = RecurrenceTrigger.fromJson(reader);
                } else if ("notification".equals(fieldName)) {
                    deserializedMaterializationSettings.notification = NotificationSetting.fromJson(reader);
                } else if ("resource".equals(fieldName)) {
                    deserializedMaterializationSettings.resource = MaterializationComputeResource.fromJson(reader);
                } else if ("sparkConfiguration".equals(fieldName)) {
                    Map<String, String> sparkConfiguration = reader.readMap(reader1 -> reader1.getString());
                    deserializedMaterializationSettings.sparkConfiguration = sparkConfiguration;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMaterializationSettings;
        });
    }
}
