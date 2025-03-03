// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Environment Auth Token.
 */
@Fluent
public final class EnvironmentAuthTokenInner extends Resource {
    /*
     * Environment auth token resource specific properties
     */
    private EnvironmentAuthTokenProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of EnvironmentAuthTokenInner class.
     */
    public EnvironmentAuthTokenInner() {
    }

    /**
     * Get the innerProperties property: Environment auth token resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private EnvironmentAuthTokenProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnvironmentAuthTokenInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnvironmentAuthTokenInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the token property: Auth token value.
     * 
     * @return the token value.
     */
    public String token() {
        return this.innerProperties() == null ? null : this.innerProperties().token();
    }

    /**
     * Get the expires property: Token expiration date.
     * 
     * @return the expires value.
     */
    public OffsetDateTime expires() {
        return this.innerProperties() == null ? null : this.innerProperties().expires();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EnvironmentAuthTokenInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EnvironmentAuthTokenInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EnvironmentAuthTokenInner.
     */
    public static EnvironmentAuthTokenInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EnvironmentAuthTokenInner deserializedEnvironmentAuthTokenInner = new EnvironmentAuthTokenInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedEnvironmentAuthTokenInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedEnvironmentAuthTokenInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedEnvironmentAuthTokenInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedEnvironmentAuthTokenInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedEnvironmentAuthTokenInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedEnvironmentAuthTokenInner.innerProperties
                        = EnvironmentAuthTokenProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedEnvironmentAuthTokenInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEnvironmentAuthTokenInner;
        });
    }
}
