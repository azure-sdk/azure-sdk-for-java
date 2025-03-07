// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes capacity information for a custom resource balancing metric. This can be used to limit the total
 * consumption of this metric by the services of this application.
 */
@Fluent
public final class ApplicationMetricDescription implements JsonSerializable<ApplicationMetricDescription> {
    /*
     * The name of the metric.
     */
    private String name;

    /*
     * The maximum node capacity for Service Fabric application.
     * This is the maximum Load for an instance of this application on a single node. Even if the capacity of node is
     * greater than this value, Service Fabric will limit the total load of services within the application on each node
     * to this value.
     * If set to zero, capacity for this metric is unlimited on each node.
     * When creating a new application with application capacity defined, the product of MaximumNodes and this value
     * must always be smaller than or equal to TotalApplicationCapacity.
     * When updating existing application with application capacity, the product of MaximumNodes and this value must
     * always be smaller than or equal to TotalApplicationCapacity.
     */
    private Long maximumCapacity;

    /*
     * The node reservation capacity for Service Fabric application.
     * This is the amount of load which is reserved on nodes which have instances of this application.
     * If MinimumNodes is specified, then the product of these values will be the capacity reserved in the cluster for
     * the application.
     * If set to zero, no capacity is reserved for this metric.
     * When setting application capacity or when updating application capacity; this value must be smaller than or equal
     * to MaximumCapacity for each metric.
     */
    private Long reservationCapacity;

    /*
     * The total metric capacity for Service Fabric application.
     * This is the total metric capacity for this application in the cluster. Service Fabric will try to limit the sum
     * of loads of services within the application to this value.
     * When creating a new application with application capacity defined, the product of MaximumNodes and
     * MaximumCapacity must always be smaller than or equal to this value.
     */
    private Long totalApplicationCapacity;

    /**
     * Creates an instance of ApplicationMetricDescription class.
     */
    public ApplicationMetricDescription() {
    }

    /**
     * Get the name property: The name of the metric.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the metric.
     * 
     * @param name the name value to set.
     * @return the ApplicationMetricDescription object itself.
     */
    public ApplicationMetricDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the maximumCapacity property: The maximum node capacity for Service Fabric application.
     * This is the maximum Load for an instance of this application on a single node. Even if the capacity of node is
     * greater than this value, Service Fabric will limit the total load of services within the application on each node
     * to this value.
     * If set to zero, capacity for this metric is unlimited on each node.
     * When creating a new application with application capacity defined, the product of MaximumNodes and this value
     * must always be smaller than or equal to TotalApplicationCapacity.
     * When updating existing application with application capacity, the product of MaximumNodes and this value must
     * always be smaller than or equal to TotalApplicationCapacity.
     * 
     * @return the maximumCapacity value.
     */
    public Long maximumCapacity() {
        return this.maximumCapacity;
    }

    /**
     * Set the maximumCapacity property: The maximum node capacity for Service Fabric application.
     * This is the maximum Load for an instance of this application on a single node. Even if the capacity of node is
     * greater than this value, Service Fabric will limit the total load of services within the application on each node
     * to this value.
     * If set to zero, capacity for this metric is unlimited on each node.
     * When creating a new application with application capacity defined, the product of MaximumNodes and this value
     * must always be smaller than or equal to TotalApplicationCapacity.
     * When updating existing application with application capacity, the product of MaximumNodes and this value must
     * always be smaller than or equal to TotalApplicationCapacity.
     * 
     * @param maximumCapacity the maximumCapacity value to set.
     * @return the ApplicationMetricDescription object itself.
     */
    public ApplicationMetricDescription withMaximumCapacity(Long maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        return this;
    }

    /**
     * Get the reservationCapacity property: The node reservation capacity for Service Fabric application.
     * This is the amount of load which is reserved on nodes which have instances of this application.
     * If MinimumNodes is specified, then the product of these values will be the capacity reserved in the cluster for
     * the application.
     * If set to zero, no capacity is reserved for this metric.
     * When setting application capacity or when updating application capacity; this value must be smaller than or equal
     * to MaximumCapacity for each metric.
     * 
     * @return the reservationCapacity value.
     */
    public Long reservationCapacity() {
        return this.reservationCapacity;
    }

    /**
     * Set the reservationCapacity property: The node reservation capacity for Service Fabric application.
     * This is the amount of load which is reserved on nodes which have instances of this application.
     * If MinimumNodes is specified, then the product of these values will be the capacity reserved in the cluster for
     * the application.
     * If set to zero, no capacity is reserved for this metric.
     * When setting application capacity or when updating application capacity; this value must be smaller than or equal
     * to MaximumCapacity for each metric.
     * 
     * @param reservationCapacity the reservationCapacity value to set.
     * @return the ApplicationMetricDescription object itself.
     */
    public ApplicationMetricDescription withReservationCapacity(Long reservationCapacity) {
        this.reservationCapacity = reservationCapacity;
        return this;
    }

    /**
     * Get the totalApplicationCapacity property: The total metric capacity for Service Fabric application.
     * This is the total metric capacity for this application in the cluster. Service Fabric will try to limit the sum
     * of loads of services within the application to this value.
     * When creating a new application with application capacity defined, the product of MaximumNodes and
     * MaximumCapacity must always be smaller than or equal to this value.
     * 
     * @return the totalApplicationCapacity value.
     */
    public Long totalApplicationCapacity() {
        return this.totalApplicationCapacity;
    }

    /**
     * Set the totalApplicationCapacity property: The total metric capacity for Service Fabric application.
     * This is the total metric capacity for this application in the cluster. Service Fabric will try to limit the sum
     * of loads of services within the application to this value.
     * When creating a new application with application capacity defined, the product of MaximumNodes and
     * MaximumCapacity must always be smaller than or equal to this value.
     * 
     * @param totalApplicationCapacity the totalApplicationCapacity value to set.
     * @return the ApplicationMetricDescription object itself.
     */
    public ApplicationMetricDescription withTotalApplicationCapacity(Long totalApplicationCapacity) {
        this.totalApplicationCapacity = totalApplicationCapacity;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeNumberField("maximumCapacity", this.maximumCapacity);
        jsonWriter.writeNumberField("reservationCapacity", this.reservationCapacity);
        jsonWriter.writeNumberField("totalApplicationCapacity", this.totalApplicationCapacity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationMetricDescription from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationMetricDescription if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationMetricDescription.
     */
    public static ApplicationMetricDescription fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationMetricDescription deserializedApplicationMetricDescription = new ApplicationMetricDescription();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedApplicationMetricDescription.name = reader.getString();
                } else if ("maximumCapacity".equals(fieldName)) {
                    deserializedApplicationMetricDescription.maximumCapacity = reader.getNullable(JsonReader::getLong);
                } else if ("reservationCapacity".equals(fieldName)) {
                    deserializedApplicationMetricDescription.reservationCapacity
                        = reader.getNullable(JsonReader::getLong);
                } else if ("totalApplicationCapacity".equals(fieldName)) {
                    deserializedApplicationMetricDescription.totalApplicationCapacity
                        = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationMetricDescription;
        });
    }
}
