// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A highlight list that consists of index fields id ,qualifiedName, name,
 * description, entityType. When the keyword appears in those fields, the value of
 * the field, attached with emphasis mark, is returned as an element of
 * &#064;search.highlights.
 */
@Immutable
public final class SearchHighlights implements JsonSerializable<SearchHighlights> {
    /*
     * Id
     */
    @Generated
    private List<String> id;

    /*
     * Qualified name
     */
    @Generated
    private List<String> qualifiedName;

    /*
     * Name
     */
    @Generated
    private List<String> name;

    /*
     * Description
     */
    @Generated
    private List<String> description;

    /*
     * Entity type
     */
    @Generated
    private List<String> entityType;

    /**
     * Creates an instance of SearchHighlights class.
     */
    @Generated
    private SearchHighlights() {
    }

    /**
     * Get the id property: Id.
     * 
     * @return the id value.
     */
    @Generated
    public List<String> getId() {
        return this.id;
    }

    /**
     * Get the qualifiedName property: Qualified name.
     * 
     * @return the qualifiedName value.
     */
    @Generated
    public List<String> getQualifiedName() {
        return this.qualifiedName;
    }

    /**
     * Get the name property: Name.
     * 
     * @return the name value.
     */
    @Generated
    public List<String> getName() {
        return this.name;
    }

    /**
     * Get the description property: Description.
     * 
     * @return the description value.
     */
    @Generated
    public List<String> getDescription() {
        return this.description;
    }

    /**
     * Get the entityType property: Entity type.
     * 
     * @return the entityType value.
     */
    @Generated
    public List<String> getEntityType() {
        return this.entityType;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("id", this.id, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("qualifiedName", this.qualifiedName,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("name", this.name, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("description", this.description, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("entityType", this.entityType, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchHighlights from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchHighlights if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SearchHighlights.
     */
    @Generated
    public static SearchHighlights fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SearchHighlights deserializedSearchHighlights = new SearchHighlights();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    List<String> id = reader.readArray(reader1 -> reader1.getString());
                    deserializedSearchHighlights.id = id;
                } else if ("qualifiedName".equals(fieldName)) {
                    List<String> qualifiedName = reader.readArray(reader1 -> reader1.getString());
                    deserializedSearchHighlights.qualifiedName = qualifiedName;
                } else if ("name".equals(fieldName)) {
                    List<String> name = reader.readArray(reader1 -> reader1.getString());
                    deserializedSearchHighlights.name = name;
                } else if ("description".equals(fieldName)) {
                    List<String> description = reader.readArray(reader1 -> reader1.getString());
                    deserializedSearchHighlights.description = description;
                } else if ("entityType".equals(fieldName)) {
                    List<String> entityType = reader.readArray(reader1 -> reader1.getString());
                    deserializedSearchHighlights.entityType = entityType;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSearchHighlights;
        });
    }
}
