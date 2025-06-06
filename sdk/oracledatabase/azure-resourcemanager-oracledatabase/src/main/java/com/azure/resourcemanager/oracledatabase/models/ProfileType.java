// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The connection string profile to allow clients to group, filter and select connection string values based on
 * structured metadata.
 */
@Immutable
public final class ProfileType implements JsonSerializable<ProfileType> {
    /*
     * Consumer group used by the connection.
     */
    private ConsumerGroup consumerGroup;

    /*
     * A user-friendly name for the connection.
     */
    private String displayName;

    /*
     * Host format used in connection string.
     */
    private HostFormatType hostFormat;

    /*
     * True for a regional connection string, applicable to cross-region DG only.
     */
    private Boolean isRegional;

    /*
     * Protocol used by the connection.
     */
    private ProtocolType protocol;

    /*
     * Specifies whether the listener performs a direct hand-off of the session, or redirects the session.
     */
    private SessionModeType sessionMode;

    /*
     * Specifies whether the connection string is using the long (LONG), Easy Connect (EZCONNECT), or Easy Connect Plus
     * (EZCONNECTPLUS) format.
     */
    private SyntaxFormatType syntaxFormat;

    /*
     * Specifies whether the TLS handshake is using one-way (SERVER) or mutual (MUTUAL) authentication.
     */
    private TlsAuthenticationType tlsAuthentication;

    /*
     * Connection string value.
     */
    private String value;

    /**
     * Creates an instance of ProfileType class.
     */
    private ProfileType() {
    }

    /**
     * Get the consumerGroup property: Consumer group used by the connection.
     * 
     * @return the consumerGroup value.
     */
    public ConsumerGroup consumerGroup() {
        return this.consumerGroup;
    }

    /**
     * Get the displayName property: A user-friendly name for the connection.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the hostFormat property: Host format used in connection string.
     * 
     * @return the hostFormat value.
     */
    public HostFormatType hostFormat() {
        return this.hostFormat;
    }

    /**
     * Get the isRegional property: True for a regional connection string, applicable to cross-region DG only.
     * 
     * @return the isRegional value.
     */
    public Boolean isRegional() {
        return this.isRegional;
    }

    /**
     * Get the protocol property: Protocol used by the connection.
     * 
     * @return the protocol value.
     */
    public ProtocolType protocol() {
        return this.protocol;
    }

    /**
     * Get the sessionMode property: Specifies whether the listener performs a direct hand-off of the session, or
     * redirects the session.
     * 
     * @return the sessionMode value.
     */
    public SessionModeType sessionMode() {
        return this.sessionMode;
    }

    /**
     * Get the syntaxFormat property: Specifies whether the connection string is using the long (LONG), Easy Connect
     * (EZCONNECT), or Easy Connect Plus (EZCONNECTPLUS) format.
     * 
     * @return the syntaxFormat value.
     */
    public SyntaxFormatType syntaxFormat() {
        return this.syntaxFormat;
    }

    /**
     * Get the tlsAuthentication property: Specifies whether the TLS handshake is using one-way (SERVER) or mutual
     * (MUTUAL) authentication.
     * 
     * @return the tlsAuthentication value.
     */
    public TlsAuthenticationType tlsAuthentication() {
        return this.tlsAuthentication;
    }

    /**
     * Get the value property: Connection string value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (displayName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property displayName in model ProfileType"));
        }
        if (hostFormat() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property hostFormat in model ProfileType"));
        }
        if (protocol() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property protocol in model ProfileType"));
        }
        if (sessionMode() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sessionMode in model ProfileType"));
        }
        if (syntaxFormat() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property syntaxFormat in model ProfileType"));
        }
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model ProfileType"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProfileType.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("hostFormat", this.hostFormat == null ? null : this.hostFormat.toString());
        jsonWriter.writeStringField("protocol", this.protocol == null ? null : this.protocol.toString());
        jsonWriter.writeStringField("sessionMode", this.sessionMode == null ? null : this.sessionMode.toString());
        jsonWriter.writeStringField("syntaxFormat", this.syntaxFormat == null ? null : this.syntaxFormat.toString());
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("consumerGroup", this.consumerGroup == null ? null : this.consumerGroup.toString());
        jsonWriter.writeBooleanField("isRegional", this.isRegional);
        jsonWriter.writeStringField("tlsAuthentication",
            this.tlsAuthentication == null ? null : this.tlsAuthentication.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProfileType from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProfileType if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ProfileType.
     */
    public static ProfileType fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProfileType deserializedProfileType = new ProfileType();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("displayName".equals(fieldName)) {
                    deserializedProfileType.displayName = reader.getString();
                } else if ("hostFormat".equals(fieldName)) {
                    deserializedProfileType.hostFormat = HostFormatType.fromString(reader.getString());
                } else if ("protocol".equals(fieldName)) {
                    deserializedProfileType.protocol = ProtocolType.fromString(reader.getString());
                } else if ("sessionMode".equals(fieldName)) {
                    deserializedProfileType.sessionMode = SessionModeType.fromString(reader.getString());
                } else if ("syntaxFormat".equals(fieldName)) {
                    deserializedProfileType.syntaxFormat = SyntaxFormatType.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    deserializedProfileType.value = reader.getString();
                } else if ("consumerGroup".equals(fieldName)) {
                    deserializedProfileType.consumerGroup = ConsumerGroup.fromString(reader.getString());
                } else if ("isRegional".equals(fieldName)) {
                    deserializedProfileType.isRegional = reader.getNullable(JsonReader::getBoolean);
                } else if ("tlsAuthentication".equals(fieldName)) {
                    deserializedProfileType.tlsAuthentication = TlsAuthenticationType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProfileType;
        });
    }
}
