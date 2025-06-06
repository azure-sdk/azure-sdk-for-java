// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The SAP BW cube dataset.
 */
@Fluent
public final class SapBwCubeDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "SapBwCube";

    /**
     * Creates an instance of SapBwCubeDataset class.
     */
    public SapBwCubeDataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapBwCubeDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapBwCubeDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapBwCubeDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapBwCubeDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapBwCubeDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapBwCubeDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapBwCubeDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (linkedServiceName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property linkedServiceName in model SapBwCubeDataset"));
        } else {
            linkedServiceName().validate();
        }
        if (parameters() != null) {
            parameters().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (folder() != null) {
            folder().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapBwCubeDataset.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("linkedServiceName", linkedServiceName());
        jsonWriter.writeStringField("description", description());
        if (structure() != null) {
            jsonWriter.writeUntypedField("structure", structure());
        }
        if (schema() != null) {
            jsonWriter.writeUntypedField("schema", schema());
        }
        jsonWriter.writeMapField("parameters", parameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", annotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("folder", folder());
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SapBwCubeDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SapBwCubeDataset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SapBwCubeDataset.
     */
    public static SapBwCubeDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SapBwCubeDataset deserializedSapBwCubeDataset = new SapBwCubeDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedSapBwCubeDataset.withLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedSapBwCubeDataset.withDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedSapBwCubeDataset.withStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedSapBwCubeDataset.withSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedSapBwCubeDataset.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedSapBwCubeDataset.withAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedSapBwCubeDataset.withFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedSapBwCubeDataset.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSapBwCubeDataset.withAdditionalProperties(additionalProperties);

            return deserializedSapBwCubeDataset;
        });
    }
}
