// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.PrivateEndpointConnectionRequestStatus;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * Contains the operation result properties for import/export operation.
 */
@Immutable
public final class ImportExportExtensionsOperationResultProperties
    implements JsonSerializable<ImportExportExtensionsOperationResultProperties> {
    /*
     * Request Id.
     */
    private UUID requestId;

    /*
     * Request type.
     */
    private String requestType;

    /*
     * Last modified time.
     */
    private String lastModifiedTime;

    /*
     * Server name.
     */
    private String serverName;

    /*
     * Database name.
     */
    private String databaseName;

    /*
     * Operation status.
     */
    private String status;

    /*
     * Error message.
     */
    private String errorMessage;

    /*
     * Queued time.
     */
    private String queuedTime;

    /*
     * Blob URI.
     */
    private String blobUri;

    /*
     * Gets the status of private endpoints associated with this request.
     */
    private List<PrivateEndpointConnectionRequestStatus> privateEndpointConnections;

    /**
     * Creates an instance of ImportExportExtensionsOperationResultProperties class.
     */
    public ImportExportExtensionsOperationResultProperties() {
    }

    /**
     * Get the requestId property: Request Id.
     * 
     * @return the requestId value.
     */
    public UUID requestId() {
        return this.requestId;
    }

    /**
     * Get the requestType property: Request type.
     * 
     * @return the requestType value.
     */
    public String requestType() {
        return this.requestType;
    }

    /**
     * Get the lastModifiedTime property: Last modified time.
     * 
     * @return the lastModifiedTime value.
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the serverName property: Server name.
     * 
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get the databaseName property: Database name.
     * 
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the status property: Operation status.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the errorMessage property: Error message.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the queuedTime property: Queued time.
     * 
     * @return the queuedTime value.
     */
    public String queuedTime() {
        return this.queuedTime;
    }

    /**
     * Get the blobUri property: Blob URI.
     * 
     * @return the blobUri value.
     */
    public String blobUri() {
        return this.blobUri;
    }

    /**
     * Get the privateEndpointConnections property: Gets the status of private endpoints associated with this request.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionRequestStatus> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
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
     * Reads an instance of ImportExportExtensionsOperationResultProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImportExportExtensionsOperationResultProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ImportExportExtensionsOperationResultProperties.
     */
    public static ImportExportExtensionsOperationResultProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImportExportExtensionsOperationResultProperties deserializedImportExportExtensionsOperationResultProperties
                = new ImportExportExtensionsOperationResultProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("requestId".equals(fieldName)) {
                    deserializedImportExportExtensionsOperationResultProperties.requestId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("requestType".equals(fieldName)) {
                    deserializedImportExportExtensionsOperationResultProperties.requestType = reader.getString();
                } else if ("lastModifiedTime".equals(fieldName)) {
                    deserializedImportExportExtensionsOperationResultProperties.lastModifiedTime = reader.getString();
                } else if ("serverName".equals(fieldName)) {
                    deserializedImportExportExtensionsOperationResultProperties.serverName = reader.getString();
                } else if ("databaseName".equals(fieldName)) {
                    deserializedImportExportExtensionsOperationResultProperties.databaseName = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedImportExportExtensionsOperationResultProperties.status = reader.getString();
                } else if ("errorMessage".equals(fieldName)) {
                    deserializedImportExportExtensionsOperationResultProperties.errorMessage = reader.getString();
                } else if ("queuedTime".equals(fieldName)) {
                    deserializedImportExportExtensionsOperationResultProperties.queuedTime = reader.getString();
                } else if ("blobUri".equals(fieldName)) {
                    deserializedImportExportExtensionsOperationResultProperties.blobUri = reader.getString();
                } else if ("privateEndpointConnections".equals(fieldName)) {
                    List<PrivateEndpointConnectionRequestStatus> privateEndpointConnections
                        = reader.readArray(reader1 -> PrivateEndpointConnectionRequestStatus.fromJson(reader1));
                    deserializedImportExportExtensionsOperationResultProperties.privateEndpointConnections
                        = privateEndpointConnections;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImportExportExtensionsOperationResultProperties;
        });
    }
}
