// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported.
 */
@Fluent
public final class ContainerAppProbeTcpSocket implements JsonSerializable<ContainerAppProbeTcpSocket> {
    /*
     * Optional: Host name to connect to, defaults to the pod IP.
     */
    private String host;

    /*
     * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
     * IANA_SVC_NAME.
     */
    private int port;

    /**
     * Creates an instance of ContainerAppProbeTcpSocket class.
     */
    public ContainerAppProbeTcpSocket() {
    }

    /**
     * Get the host property: Optional: Host name to connect to, defaults to the pod IP.
     * 
     * @return the host value.
     */
    public String host() {
        return this.host;
    }

    /**
     * Set the host property: Optional: Host name to connect to, defaults to the pod IP.
     * 
     * @param host the host value to set.
     * @return the ContainerAppProbeTcpSocket object itself.
     */
    public ContainerAppProbeTcpSocket withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get the port property: Number or name of the port to access on the container. Number must be in the range 1 to
     * 65535. Name must be an IANA_SVC_NAME.
     * 
     * @return the port value.
     */
    public int port() {
        return this.port;
    }

    /**
     * Set the port property: Number or name of the port to access on the container. Number must be in the range 1 to
     * 65535. Name must be an IANA_SVC_NAME.
     * 
     * @param port the port value to set.
     * @return the ContainerAppProbeTcpSocket object itself.
     */
    public ContainerAppProbeTcpSocket withPort(int port) {
        this.port = port;
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
        jsonWriter.writeIntField("port", this.port);
        jsonWriter.writeStringField("host", this.host);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerAppProbeTcpSocket from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerAppProbeTcpSocket if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContainerAppProbeTcpSocket.
     */
    public static ContainerAppProbeTcpSocket fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerAppProbeTcpSocket deserializedContainerAppProbeTcpSocket = new ContainerAppProbeTcpSocket();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("port".equals(fieldName)) {
                    deserializedContainerAppProbeTcpSocket.port = reader.getInt();
                } else if ("host".equals(fieldName)) {
                    deserializedContainerAppProbeTcpSocket.host = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerAppProbeTcpSocket;
        });
    }
}
