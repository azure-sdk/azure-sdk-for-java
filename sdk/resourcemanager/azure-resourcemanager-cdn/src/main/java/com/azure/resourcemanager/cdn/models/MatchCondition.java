// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Define match conditions.
 */
@Fluent
public final class MatchCondition implements JsonSerializable<MatchCondition> {
    /*
     * Match variable to compare against.
     */
    private WafMatchVariable matchVariable;

    /*
     * Selector can used to match a specific key for QueryString, Cookies, RequestHeader or PostArgs.
     */
    private String selector;

    /*
     * Describes operator to be matched
     */
    private Operator operator;

    /*
     * Describes if the result of this condition should be negated.
     */
    private Boolean negateCondition;

    /*
     * List of possible match values.
     */
    private List<String> matchValue;

    /*
     * List of transforms.
     */
    private List<TransformType> transforms;

    /**
     * Creates an instance of MatchCondition class.
     */
    public MatchCondition() {
    }

    /**
     * Get the matchVariable property: Match variable to compare against.
     * 
     * @return the matchVariable value.
     */
    public WafMatchVariable matchVariable() {
        return this.matchVariable;
    }

    /**
     * Set the matchVariable property: Match variable to compare against.
     * 
     * @param matchVariable the matchVariable value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withMatchVariable(WafMatchVariable matchVariable) {
        this.matchVariable = matchVariable;
        return this;
    }

    /**
     * Get the selector property: Selector can used to match a specific key for QueryString, Cookies, RequestHeader or
     * PostArgs.
     * 
     * @return the selector value.
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set the selector property: Selector can used to match a specific key for QueryString, Cookies, RequestHeader or
     * PostArgs.
     * 
     * @param selector the selector value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Get the operator property: Describes operator to be matched.
     * 
     * @return the operator value.
     */
    public Operator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: Describes operator to be matched.
     * 
     * @param operator the operator value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withOperator(Operator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the negateCondition property: Describes if the result of this condition should be negated.
     * 
     * @return the negateCondition value.
     */
    public Boolean negateCondition() {
        return this.negateCondition;
    }

    /**
     * Set the negateCondition property: Describes if the result of this condition should be negated.
     * 
     * @param negateCondition the negateCondition value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withNegateCondition(Boolean negateCondition) {
        this.negateCondition = negateCondition;
        return this;
    }

    /**
     * Get the matchValue property: List of possible match values.
     * 
     * @return the matchValue value.
     */
    public List<String> matchValue() {
        return this.matchValue;
    }

    /**
     * Set the matchValue property: List of possible match values.
     * 
     * @param matchValue the matchValue value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withMatchValue(List<String> matchValue) {
        this.matchValue = matchValue;
        return this;
    }

    /**
     * Get the transforms property: List of transforms.
     * 
     * @return the transforms value.
     */
    public List<TransformType> transforms() {
        return this.transforms;
    }

    /**
     * Set the transforms property: List of transforms.
     * 
     * @param transforms the transforms value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withTransforms(List<TransformType> transforms) {
        this.transforms = transforms;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (matchVariable() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property matchVariable in model MatchCondition"));
        }
        if (operator() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property operator in model MatchCondition"));
        }
        if (matchValue() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property matchValue in model MatchCondition"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MatchCondition.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("matchVariable", this.matchVariable == null ? null : this.matchVariable.toString());
        jsonWriter.writeStringField("operator", this.operator == null ? null : this.operator.toString());
        jsonWriter.writeArrayField("matchValue", this.matchValue, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("selector", this.selector);
        jsonWriter.writeBooleanField("negateCondition", this.negateCondition);
        jsonWriter.writeArrayField("transforms", this.transforms,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MatchCondition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MatchCondition if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MatchCondition.
     */
    public static MatchCondition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MatchCondition deserializedMatchCondition = new MatchCondition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("matchVariable".equals(fieldName)) {
                    deserializedMatchCondition.matchVariable = WafMatchVariable.fromString(reader.getString());
                } else if ("operator".equals(fieldName)) {
                    deserializedMatchCondition.operator = Operator.fromString(reader.getString());
                } else if ("matchValue".equals(fieldName)) {
                    List<String> matchValue = reader.readArray(reader1 -> reader1.getString());
                    deserializedMatchCondition.matchValue = matchValue;
                } else if ("selector".equals(fieldName)) {
                    deserializedMatchCondition.selector = reader.getString();
                } else if ("negateCondition".equals(fieldName)) {
                    deserializedMatchCondition.negateCondition = reader.getNullable(JsonReader::getBoolean);
                } else if ("transforms".equals(fieldName)) {
                    List<TransformType> transforms
                        = reader.readArray(reader1 -> TransformType.fromString(reader1.getString()));
                    deserializedMatchCondition.transforms = transforms;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMatchCondition;
        });
    }
}
