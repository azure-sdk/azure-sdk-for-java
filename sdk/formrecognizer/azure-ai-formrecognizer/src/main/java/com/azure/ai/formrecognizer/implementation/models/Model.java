// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Response to the get custom model operation.
 */
@Fluent
public final class Model implements JsonSerializable<Model> {
    /*
     * Basic custom model information.
     */
    @Generated
    private ModelInfo modelInfo;

    /*
     * Keys extracted by the custom model.
     */
    @Generated
    private KeysResult keys;

    /*
     * Training result for custom model.
     */
    @Generated
    private TrainResult trainResult;

    /*
     * Training result for composed model.
     */
    @Generated
    private List<TrainResult> composedTrainResults;

    /**
     * Creates an instance of Model class.
     */
    @Generated
    public Model() {
    }

    /**
     * Get the modelInfo property: Basic custom model information.
     * 
     * @return the modelInfo value.
     */
    @Generated
    public ModelInfo getModelInfo() {
        return this.modelInfo;
    }

    /**
     * Set the modelInfo property: Basic custom model information.
     * 
     * @param modelInfo the modelInfo value to set.
     * @return the Model object itself.
     */
    @Generated
    public Model setModelInfo(ModelInfo modelInfo) {
        this.modelInfo = modelInfo;
        return this;
    }

    /**
     * Get the keys property: Keys extracted by the custom model.
     * 
     * @return the keys value.
     */
    @Generated
    public KeysResult getKeys() {
        return this.keys;
    }

    /**
     * Set the keys property: Keys extracted by the custom model.
     * 
     * @param keys the keys value to set.
     * @return the Model object itself.
     */
    @Generated
    public Model setKeys(KeysResult keys) {
        this.keys = keys;
        return this;
    }

    /**
     * Get the trainResult property: Training result for custom model.
     * 
     * @return the trainResult value.
     */
    @Generated
    public TrainResult getTrainResult() {
        return this.trainResult;
    }

    /**
     * Set the trainResult property: Training result for custom model.
     * 
     * @param trainResult the trainResult value to set.
     * @return the Model object itself.
     */
    @Generated
    public Model setTrainResult(TrainResult trainResult) {
        this.trainResult = trainResult;
        return this;
    }

    /**
     * Get the composedTrainResults property: Training result for composed model.
     * 
     * @return the composedTrainResults value.
     */
    @Generated
    public List<TrainResult> getComposedTrainResults() {
        return this.composedTrainResults;
    }

    /**
     * Set the composedTrainResults property: Training result for composed model.
     * 
     * @param composedTrainResults the composedTrainResults value to set.
     * @return the Model object itself.
     */
    @Generated
    public Model setComposedTrainResults(List<TrainResult> composedTrainResults) {
        this.composedTrainResults = composedTrainResults;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("modelInfo", this.modelInfo);
        jsonWriter.writeJsonField("keys", this.keys);
        jsonWriter.writeJsonField("trainResult", this.trainResult);
        jsonWriter.writeArrayField("composedTrainResults", this.composedTrainResults,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Model from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Model if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Model.
     */
    @Generated
    public static Model fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Model deserializedModel = new Model();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("modelInfo".equals(fieldName)) {
                    deserializedModel.modelInfo = ModelInfo.fromJson(reader);
                } else if ("keys".equals(fieldName)) {
                    deserializedModel.keys = KeysResult.fromJson(reader);
                } else if ("trainResult".equals(fieldName)) {
                    deserializedModel.trainResult = TrainResult.fromJson(reader);
                } else if ("composedTrainResults".equals(fieldName)) {
                    List<TrainResult> composedTrainResults = reader.readArray(reader1 -> TrainResult.fromJson(reader1));
                    deserializedModel.composedTrainResults = composedTrainResults;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedModel;
        });
    }
}
