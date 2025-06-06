// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.messaging.eventgrid.systemevents.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The content of the event request message.
 */
@Immutable
public class ContainerRegistryEventData implements JsonSerializable<ContainerRegistryEventData> {

    /*
     * The event ID.
     */
    @Generated
    private final String id;

    /*
     * The time at which the event occurred.
     */
    @Generated
    private final OffsetDateTime timestamp;

    /*
     * The action that encompasses the provided event.
     */
    @Generated
    private final String action;

    /*
     * The location of the event.
     */
    @Generated
    private final String location;

    /*
     * The target of the event.
     */
    @Generated
    private final ContainerRegistryEventTarget target;

    /*
     * The request that generated the event.
     */
    @Generated
    private ContainerRegistryEventRequest request;

    /*
     * The agent that initiated the event. For most situations, this could be from the authorization context of the
     * request.
     */
    @Generated
    private ContainerRegistryEventActor actor;

    /*
     * The registry node that generated the event. Put differently, while the actor initiates the event, the source
     * generates it.
     */
    @Generated
    private ContainerRegistryEventSource source;

    /*
     * The connected registry information if the event is generated by a connected registry.
     */
    @Generated
    private ContainerRegistryEventConnectedRegistry connectedRegistry;

    /**
     * Creates an instance of ContainerRegistryEventData class.
     *
     * @param id the id value to set.
     * @param timestamp the timestamp value to set.
     * @param action the action value to set.
     * @param location the location value to set.
     * @param target the target value to set.
     */
    @Generated
    protected ContainerRegistryEventData(String id, OffsetDateTime timestamp, String action, String location,
        ContainerRegistryEventTarget target) {
        this.id = id;
        this.timestamp = timestamp;
        this.action = action;
        this.location = location;
        this.target = target;
    }

    /**
     * Get the id property: The event ID.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the timestamp property: The time at which the event occurred.
     *
     * @return the timestamp value.
     */
    @Generated
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the action property: The action that encompasses the provided event.
     *
     * @return the action value.
     */
    @Generated
    public String getAction() {
        return this.action;
    }

    /**
     * Get the location property: The location of the event.
     *
     * @return the location value.
     */
    @Generated
    public String getLocation() {
        return this.location;
    }

    /**
     * Get the target property: The target of the event.
     *
     * @return the target value.
     */
    @Generated
    public ContainerRegistryEventTarget getTarget() {
        return this.target;
    }

    /**
     * Get the request property: The request that generated the event.
     *
     * @return the request value.
     */
    @Generated
    public ContainerRegistryEventRequest getRequest() {
        return this.request;
    }

    /**
     * Set the request property: The request that generated the event.
     *
     * @param request the request value to set.
     * @return the ContainerRegistryEventData object itself.
     */
    @Generated
    ContainerRegistryEventData setRequest(ContainerRegistryEventRequest request) {
        this.request = request;
        return this;
    }

    /**
     * Get the actor property: The agent that initiated the event. For most situations, this could be from the
     * authorization context of the request.
     *
     * @return the actor value.
     */
    @Generated
    public ContainerRegistryEventActor getActor() {
        return this.actor;
    }

    /**
     * Set the actor property: The agent that initiated the event. For most situations, this could be from the
     * authorization context of the request.
     *
     * @param actor the actor value to set.
     * @return the ContainerRegistryEventData object itself.
     */
    @Generated
    ContainerRegistryEventData setActor(ContainerRegistryEventActor actor) {
        this.actor = actor;
        return this;
    }

    /**
     * Get the source property: The registry node that generated the event. Put differently, while the actor initiates
     * the event, the source generates it.
     *
     * @return the source value.
     */
    @Generated
    public ContainerRegistryEventSource getSource() {
        return this.source;
    }

    /**
     * Set the source property: The registry node that generated the event. Put differently, while the actor initiates
     * the event, the source generates it.
     *
     * @param source the source value to set.
     * @return the ContainerRegistryEventData object itself.
     */
    @Generated
    ContainerRegistryEventData setSource(ContainerRegistryEventSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the connectedRegistry property: The connected registry information if the event is generated by a connected
     * registry.
     *
     * @return the connectedRegistry value.
     */
    @Generated
    public ContainerRegistryEventConnectedRegistry getConnectedRegistry() {
        return this.connectedRegistry;
    }

    /**
     * Set the connectedRegistry property: The connected registry information if the event is generated by a connected
     * registry.
     *
     * @param connectedRegistry the connectedRegistry value to set.
     * @return the ContainerRegistryEventData object itself.
     */
    @Generated
    ContainerRegistryEventData setConnectedRegistry(ContainerRegistryEventConnectedRegistry connectedRegistry) {
        this.connectedRegistry = connectedRegistry;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("timestamp",
            this.timestamp == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.timestamp));
        jsonWriter.writeStringField("action", this.action);
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeJsonField("target", this.target);
        jsonWriter.writeJsonField("request", this.request);
        jsonWriter.writeJsonField("actor", this.actor);
        jsonWriter.writeJsonField("source", this.source);
        jsonWriter.writeJsonField("connectedRegistry", this.connectedRegistry);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerRegistryEventData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerRegistryEventData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContainerRegistryEventData.
     */
    @Generated
    public static ContainerRegistryEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            OffsetDateTime timestamp = null;
            String action = null;
            String location = null;
            ContainerRegistryEventTarget target = null;
            ContainerRegistryEventRequest request = null;
            ContainerRegistryEventActor actor = null;
            ContainerRegistryEventSource source = null;
            ContainerRegistryEventConnectedRegistry connectedRegistry = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("timestamp".equals(fieldName)) {
                    timestamp = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("action".equals(fieldName)) {
                    action = reader.getString();
                } else if ("location".equals(fieldName)) {
                    location = reader.getString();
                } else if ("target".equals(fieldName)) {
                    target = ContainerRegistryEventTarget.fromJson(reader);
                } else if ("request".equals(fieldName)) {
                    request = ContainerRegistryEventRequest.fromJson(reader);
                } else if ("actor".equals(fieldName)) {
                    actor = ContainerRegistryEventActor.fromJson(reader);
                } else if ("source".equals(fieldName)) {
                    source = ContainerRegistryEventSource.fromJson(reader);
                } else if ("connectedRegistry".equals(fieldName)) {
                    connectedRegistry = ContainerRegistryEventConnectedRegistry.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            ContainerRegistryEventData deserializedContainerRegistryEventData
                = new ContainerRegistryEventData(id, timestamp, action, location, target);
            deserializedContainerRegistryEventData.request = request;
            deserializedContainerRegistryEventData.actor = actor;
            deserializedContainerRegistryEventData.source = source;
            deserializedContainerRegistryEventData.connectedRegistry = connectedRegistry;
            return deserializedContainerRegistryEventData;
        });
    }
}
