// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Vertica linked service.
 */
@Fluent
public class VerticaLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    @Generated
    private String type = "Vertica";

    /*
     * An ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    @Generated
    private Object connectionString;

    /*
     * Server name for connection. Type: string.
     */
    @Generated
    private Object server;

    /*
     * The port for the connection. Type: integer.
     */
    @Generated
    private Object port;

    /*
     * Username for authentication. Type: string.
     */
    @Generated
    private Object uid;

    /*
     * Database name for connection. Type: string.
     */
    @Generated
    private Object database;

    /*
     * The Azure key vault secret reference of password in connection string.
     */
    @Generated
    private AzureKeyVaultSecretReference pwd;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object encryptedCredential;

    /**
     * Creates an instance of VerticaLinkedService class.
     */
    @Generated
    public VerticaLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    @Generated
    public Object getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the VerticaLinkedService object itself.
     */
    @Generated
    public VerticaLinkedService setConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the server property: Server name for connection. Type: string.
     * 
     * @return the server value.
     */
    @Generated
    public Object getServer() {
        return this.server;
    }

    /**
     * Set the server property: Server name for connection. Type: string.
     * 
     * @param server the server value to set.
     * @return the VerticaLinkedService object itself.
     */
    @Generated
    public VerticaLinkedService setServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the port property: The port for the connection. Type: integer.
     * 
     * @return the port value.
     */
    @Generated
    public Object getPort() {
        return this.port;
    }

    /**
     * Set the port property: The port for the connection. Type: integer.
     * 
     * @param port the port value to set.
     * @return the VerticaLinkedService object itself.
     */
    @Generated
    public VerticaLinkedService setPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the uid property: Username for authentication. Type: string.
     * 
     * @return the uid value.
     */
    @Generated
    public Object getUid() {
        return this.uid;
    }

    /**
     * Set the uid property: Username for authentication. Type: string.
     * 
     * @param uid the uid value to set.
     * @return the VerticaLinkedService object itself.
     */
    @Generated
    public VerticaLinkedService setUid(Object uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Get the database property: Database name for connection. Type: string.
     * 
     * @return the database value.
     */
    @Generated
    public Object getDatabase() {
        return this.database;
    }

    /**
     * Set the database property: Database name for connection. Type: string.
     * 
     * @param database the database value to set.
     * @return the VerticaLinkedService object itself.
     */
    @Generated
    public VerticaLinkedService setDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the pwd property: The Azure key vault secret reference of password in connection string.
     * 
     * @return the pwd value.
     */
    @Generated
    public AzureKeyVaultSecretReference getPwd() {
        return this.pwd;
    }

    /**
     * Set the pwd property: The Azure key vault secret reference of password in connection string.
     * 
     * @param pwd the pwd value to set.
     * @return the VerticaLinkedService object itself.
     */
    @Generated
    public VerticaLinkedService setPwd(AzureKeyVaultSecretReference pwd) {
        this.pwd = pwd;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    @Generated
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the VerticaLinkedService object itself.
     */
    @Generated
    public VerticaLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public VerticaLinkedService setVersion(String version) {
        super.setVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public VerticaLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public VerticaLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public VerticaLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public VerticaLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("version", getVersion());
        jsonWriter.writeJsonField("connectVia", getConnectVia());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeMapField("parameters", getParameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", getAnnotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeStringField("type", this.type);
        if (connectionString != null
            || server != null
            || port != null
            || uid != null
            || database != null
            || pwd != null
            || encryptedCredential != null) {
            jsonWriter.writeStartObject("typeProperties");
            if (this.connectionString != null) {
                jsonWriter.writeUntypedField("connectionString", this.connectionString);
            }
            if (this.server != null) {
                jsonWriter.writeUntypedField("server", this.server);
            }
            if (this.port != null) {
                jsonWriter.writeUntypedField("port", this.port);
            }
            if (this.uid != null) {
                jsonWriter.writeUntypedField("uid", this.uid);
            }
            if (this.database != null) {
                jsonWriter.writeUntypedField("database", this.database);
            }
            jsonWriter.writeJsonField("pwd", this.pwd);
            if (this.encryptedCredential != null) {
                jsonWriter.writeUntypedField("encryptedCredential", this.encryptedCredential);
            }
            jsonWriter.writeEndObject();
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VerticaLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VerticaLinkedService if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VerticaLinkedService.
     */
    @Generated
    public static VerticaLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VerticaLinkedService deserializedVerticaLinkedService = new VerticaLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedVerticaLinkedService.setVersion(reader.getString());
                } else if ("connectVia".equals(fieldName)) {
                    deserializedVerticaLinkedService.setConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedVerticaLinkedService.setDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedVerticaLinkedService.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedVerticaLinkedService.setAnnotations(annotations);
                } else if ("type".equals(fieldName)) {
                    deserializedVerticaLinkedService.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("connectionString".equals(fieldName)) {
                            deserializedVerticaLinkedService.connectionString = reader.readUntyped();
                        } else if ("server".equals(fieldName)) {
                            deserializedVerticaLinkedService.server = reader.readUntyped();
                        } else if ("port".equals(fieldName)) {
                            deserializedVerticaLinkedService.port = reader.readUntyped();
                        } else if ("uid".equals(fieldName)) {
                            deserializedVerticaLinkedService.uid = reader.readUntyped();
                        } else if ("database".equals(fieldName)) {
                            deserializedVerticaLinkedService.database = reader.readUntyped();
                        } else if ("pwd".equals(fieldName)) {
                            deserializedVerticaLinkedService.pwd = AzureKeyVaultSecretReference.fromJson(reader);
                        } else if ("encryptedCredential".equals(fieldName)) {
                            deserializedVerticaLinkedService.encryptedCredential = reader.readUntyped();
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedVerticaLinkedService.setAdditionalProperties(additionalProperties);

            return deserializedVerticaLinkedService;
        });
    }
}
