// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Contains guidance related elements. This field is present only when guidance was requested and is available.
 */
@Immutable
public final class RouteGuidance implements JsonSerializable<RouteGuidance> {
    /*
     * A list of instructions describing maneuvers.
     */
    @Generated
    private List<RouteInstruction> instructions;

    /*
     * Groups a sequence of instruction elements which are related to each other.
     */
    @Generated
    private List<RouteInstructionGroup> instructionGroups;

    /**
     * Creates an instance of RouteGuidance class.
     */
    @Generated
    public RouteGuidance() {
    }

    /**
     * Get the instructions property: A list of instructions describing maneuvers.
     * 
     * @return the instructions value.
     */
    @Generated
    public List<RouteInstruction> getInstructions() {
        return this.instructions;
    }

    /**
     * Get the instructionGroups property: Groups a sequence of instruction elements which are related to each other.
     * 
     * @return the instructionGroups value.
     */
    @Generated
    public List<RouteInstructionGroup> getInstructionGroups() {
        return this.instructionGroups;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RouteGuidance from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RouteGuidance if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RouteGuidance.
     */
    @Generated
    public static RouteGuidance fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RouteGuidance deserializedRouteGuidance = new RouteGuidance();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instructions".equals(fieldName)) {
                    List<RouteInstruction> instructions
                        = reader.readArray(reader1 -> RouteInstruction.fromJson(reader1));
                    deserializedRouteGuidance.instructions = instructions;
                } else if ("instructionGroups".equals(fieldName)) {
                    List<RouteInstructionGroup> instructionGroups
                        = reader.readArray(reader1 -> RouteInstructionGroup.fromJson(reader1));
                    deserializedRouteGuidance.instructionGroups = instructionGroups;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRouteGuidance;
        });
    }
}
