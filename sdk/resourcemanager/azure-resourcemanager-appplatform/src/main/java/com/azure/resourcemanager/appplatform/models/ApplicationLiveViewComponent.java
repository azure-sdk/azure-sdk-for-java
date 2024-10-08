// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Application Live View properties payload.
 */
@Immutable
public final class ApplicationLiveViewComponent implements JsonSerializable<ApplicationLiveViewComponent> {
    /*
     * Name of the component.
     */
    private Object name;

    /*
     * The requested resource quantity for required CPU and Memory.
     */
    private ApplicationLiveViewResourceRequests resourceRequests;

    /*
     * Collection of instances belong to Application Live View.
     */
    private List<ApplicationLiveViewInstance> instances;

    /**
     * Creates an instance of ApplicationLiveViewComponent class.
     */
    public ApplicationLiveViewComponent() {
    }

    /**
     * Get the name property: Name of the component.
     * 
     * @return the name value.
     */
    public Object name() {
        return this.name;
    }

    /**
     * Get the resourceRequests property: The requested resource quantity for required CPU and Memory.
     * 
     * @return the resourceRequests value.
     */
    public ApplicationLiveViewResourceRequests resourceRequests() {
        return this.resourceRequests;
    }

    /**
     * Get the instances property: Collection of instances belong to Application Live View.
     * 
     * @return the instances value.
     */
    public List<ApplicationLiveViewInstance> instances() {
        return this.instances;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceRequests() != null) {
            resourceRequests().validate();
        }
        if (instances() != null) {
            instances().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationLiveViewComponent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationLiveViewComponent if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationLiveViewComponent.
     */
    public static ApplicationLiveViewComponent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationLiveViewComponent deserializedApplicationLiveViewComponent = new ApplicationLiveViewComponent();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedApplicationLiveViewComponent.name = reader.readUntyped();
                } else if ("resourceRequests".equals(fieldName)) {
                    deserializedApplicationLiveViewComponent.resourceRequests
                        = ApplicationLiveViewResourceRequests.fromJson(reader);
                } else if ("instances".equals(fieldName)) {
                    List<ApplicationLiveViewInstance> instances
                        = reader.readArray(reader1 -> ApplicationLiveViewInstance.fromJson(reader1));
                    deserializedApplicationLiveViewComponent.instances = instances;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationLiveViewComponent;
        });
    }
}
