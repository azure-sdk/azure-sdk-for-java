// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ConnectionError model.
 */
@Fluent
public final class ConnectionError implements JsonSerializable<ConnectionError> {
    /*
     * The kind of connection error that occurred.
     */
    private ConnectionState connectionState;

    /*
     * The IP of host that originated the failed connection.
     */
    private String iPFrom;

    /*
     * The IP that the connection attempted to reach.
     */
    private String iPTo;

    /*
     * The TCP port the connection was attempted on.
     */
    private Integer port;

    /*
     * Detailed error message about the failed connection.
     */
    private String exception;

    /**
     * Creates an instance of ConnectionError class.
     */
    public ConnectionError() {
    }

    /**
     * Get the connectionState property: The kind of connection error that occurred.
     * 
     * @return the connectionState value.
     */
    public ConnectionState connectionState() {
        return this.connectionState;
    }

    /**
     * Set the connectionState property: The kind of connection error that occurred.
     * 
     * @param connectionState the connectionState value to set.
     * @return the ConnectionError object itself.
     */
    public ConnectionError withConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState;
        return this;
    }

    /**
     * Get the iPFrom property: The IP of host that originated the failed connection.
     * 
     * @return the iPFrom value.
     */
    public String iPFrom() {
        return this.iPFrom;
    }

    /**
     * Set the iPFrom property: The IP of host that originated the failed connection.
     * 
     * @param iPFrom the iPFrom value to set.
     * @return the ConnectionError object itself.
     */
    public ConnectionError withIPFrom(String iPFrom) {
        this.iPFrom = iPFrom;
        return this;
    }

    /**
     * Get the iPTo property: The IP that the connection attempted to reach.
     * 
     * @return the iPTo value.
     */
    public String iPTo() {
        return this.iPTo;
    }

    /**
     * Set the iPTo property: The IP that the connection attempted to reach.
     * 
     * @param iPTo the iPTo value to set.
     * @return the ConnectionError object itself.
     */
    public ConnectionError withIPTo(String iPTo) {
        this.iPTo = iPTo;
        return this;
    }

    /**
     * Get the port property: The TCP port the connection was attempted on.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port the connection was attempted on.
     * 
     * @param port the port value to set.
     * @return the ConnectionError object itself.
     */
    public ConnectionError withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the exception property: Detailed error message about the failed connection.
     * 
     * @return the exception value.
     */
    public String exception() {
        return this.exception;
    }

    /**
     * Set the exception property: Detailed error message about the failed connection.
     * 
     * @param exception the exception value to set.
     * @return the ConnectionError object itself.
     */
    public ConnectionError withException(String exception) {
        this.exception = exception;
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
        jsonWriter.writeStringField("connectionState",
            this.connectionState == null ? null : this.connectionState.toString());
        jsonWriter.writeStringField("iPFrom", this.iPFrom);
        jsonWriter.writeStringField("iPTo", this.iPTo);
        jsonWriter.writeNumberField("port", this.port);
        jsonWriter.writeStringField("exception", this.exception);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectionError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectionError if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectionError.
     */
    public static ConnectionError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectionError deserializedConnectionError = new ConnectionError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectionState".equals(fieldName)) {
                    deserializedConnectionError.connectionState = ConnectionState.fromString(reader.getString());
                } else if ("iPFrom".equals(fieldName)) {
                    deserializedConnectionError.iPFrom = reader.getString();
                } else if ("iPTo".equals(fieldName)) {
                    deserializedConnectionError.iPTo = reader.getString();
                } else if ("port".equals(fieldName)) {
                    deserializedConnectionError.port = reader.getNullable(JsonReader::getInt);
                } else if ("exception".equals(fieldName)) {
                    deserializedConnectionError.exception = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectionError;
        });
    }
}
