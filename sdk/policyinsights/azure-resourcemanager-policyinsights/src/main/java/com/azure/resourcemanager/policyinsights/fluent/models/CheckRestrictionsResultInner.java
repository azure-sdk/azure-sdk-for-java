// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.policyinsights.models.CheckRestrictionsResultContentEvaluationResult;
import com.azure.resourcemanager.policyinsights.models.FieldRestrictions;
import java.io.IOException;
import java.util.List;

/**
 * The result of a check policy restrictions evaluation on a resource.
 */
@Immutable
public final class CheckRestrictionsResultInner implements JsonSerializable<CheckRestrictionsResultInner> {
    /*
     * The restrictions that will be placed on various fields in the resource by policy.
     */
    private List<FieldRestrictions> fieldRestrictions;

    /*
     * Evaluation results for the provided partial resource content.
     */
    private CheckRestrictionsResultContentEvaluationResult contentEvaluationResult;

    /**
     * Creates an instance of CheckRestrictionsResultInner class.
     */
    public CheckRestrictionsResultInner() {
    }

    /**
     * Get the fieldRestrictions property: The restrictions that will be placed on various fields in the resource by
     * policy.
     * 
     * @return the fieldRestrictions value.
     */
    public List<FieldRestrictions> fieldRestrictions() {
        return this.fieldRestrictions;
    }

    /**
     * Get the contentEvaluationResult property: Evaluation results for the provided partial resource content.
     * 
     * @return the contentEvaluationResult value.
     */
    public CheckRestrictionsResultContentEvaluationResult contentEvaluationResult() {
        return this.contentEvaluationResult;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fieldRestrictions() != null) {
            fieldRestrictions().forEach(e -> e.validate());
        }
        if (contentEvaluationResult() != null) {
            contentEvaluationResult().validate();
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
     * Reads an instance of CheckRestrictionsResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CheckRestrictionsResultInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CheckRestrictionsResultInner.
     */
    public static CheckRestrictionsResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CheckRestrictionsResultInner deserializedCheckRestrictionsResultInner = new CheckRestrictionsResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("fieldRestrictions".equals(fieldName)) {
                    List<FieldRestrictions> fieldRestrictions
                        = reader.readArray(reader1 -> FieldRestrictions.fromJson(reader1));
                    deserializedCheckRestrictionsResultInner.fieldRestrictions = fieldRestrictions;
                } else if ("contentEvaluationResult".equals(fieldName)) {
                    deserializedCheckRestrictionsResultInner.contentEvaluationResult
                        = CheckRestrictionsResultContentEvaluationResult.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCheckRestrictionsResultInner;
        });
    }
}
