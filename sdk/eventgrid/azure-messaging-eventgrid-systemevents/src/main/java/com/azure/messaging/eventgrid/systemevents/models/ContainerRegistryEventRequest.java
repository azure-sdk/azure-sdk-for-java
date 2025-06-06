// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.messaging.eventgrid.systemevents.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The request that generated the event.
 */
@Immutable
public final class ContainerRegistryEventRequest implements JsonSerializable<ContainerRegistryEventRequest> {
    /*
     * The ID of the request that initiated the event.
     */
    @Generated
    private final String id;

    /*
     * The IP or hostname and possibly port of the client connection that initiated the event. This is the RemoteAddr
     * from the standard http request.
     */
    @Generated
    private String addr;

    /*
     * The externally accessible hostname of the registry instance, as specified by the http host header on incoming
     * requests.
     */
    @Generated
    private final String host;

    /*
     * The request method that generated the event.
     */
    @Generated
    private final String method;

    /*
     * The user agent header of the request.
     */
    @Generated
    private String useragent;

    /**
     * Creates an instance of ContainerRegistryEventRequest class.
     * 
     * @param id the id value to set.
     * @param host the host value to set.
     * @param method the method value to set.
     */
    @Generated
    private ContainerRegistryEventRequest(String id, String host, String method) {
        this.id = id;
        this.host = host;
        this.method = method;
    }

    /**
     * Get the id property: The ID of the request that initiated the event.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the addr property: The IP or hostname and possibly port of the client connection that initiated the event.
     * This is the RemoteAddr from the standard http request.
     * 
     * @return the addr value.
     */
    @Generated
    public String getAddr() {
        return this.addr;
    }

    /**
     * Get the host property: The externally accessible hostname of the registry instance, as specified by the http host
     * header on incoming requests.
     * 
     * @return the host value.
     */
    @Generated
    public String getHost() {
        return this.host;
    }

    /**
     * Get the method property: The request method that generated the event.
     * 
     * @return the method value.
     */
    @Generated
    public String getMethod() {
        return this.method;
    }

    /**
     * Get the useragent property: The user agent header of the request.
     * 
     * @return the useragent value.
     */
    @Generated
    public String getUseragent() {
        return this.useragent;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("host", this.host);
        jsonWriter.writeStringField("method", this.method);
        jsonWriter.writeStringField("addr", this.addr);
        jsonWriter.writeStringField("useragent", this.useragent);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerRegistryEventRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerRegistryEventRequest if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContainerRegistryEventRequest.
     */
    @Generated
    public static ContainerRegistryEventRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            String host = null;
            String method = null;
            String addr = null;
            String useragent = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("host".equals(fieldName)) {
                    host = reader.getString();
                } else if ("method".equals(fieldName)) {
                    method = reader.getString();
                } else if ("addr".equals(fieldName)) {
                    addr = reader.getString();
                } else if ("useragent".equals(fieldName)) {
                    useragent = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            ContainerRegistryEventRequest deserializedContainerRegistryEventRequest
                = new ContainerRegistryEventRequest(id, host, method);
            deserializedContainerRegistryEventRequest.addr = addr;
            deserializedContainerRegistryEventRequest.useragent = useragent;

            return deserializedContainerRegistryEventRequest;
        });
    }
}
