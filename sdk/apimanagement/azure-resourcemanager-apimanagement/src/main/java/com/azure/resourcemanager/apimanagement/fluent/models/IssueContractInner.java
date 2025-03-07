// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.apimanagement.models.State;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Issue Contract details.
 */
@Fluent
public final class IssueContractInner extends ProxyResource {
    /*
     * Properties of the Issue.
     */
    private IssueContractProperties innerProperties;

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
     * Creates an instance of IssueContractInner class.
     */
    public IssueContractInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Issue.
     * 
     * @return the innerProperties value.
     */
    private IssueContractProperties innerProperties() {
        return this.innerProperties;
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
     * Get the title property: The issue title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Set the title property: The issue title.
     * 
     * @param title the title value to set.
     * @return the IssueContractInner object itself.
     */
    public IssueContractInner withTitle(String title) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IssueContractProperties();
        }
        this.innerProperties().withTitle(title);
        return this;
    }

    /**
     * Get the description property: Text describing the issue.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Text describing the issue.
     * 
     * @param description the description value to set.
     * @return the IssueContractInner object itself.
     */
    public IssueContractInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IssueContractProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the userId property: A resource identifier for the user created the issue.
     * 
     * @return the userId value.
     */
    public String userId() {
        return this.innerProperties() == null ? null : this.innerProperties().userId();
    }

    /**
     * Set the userId property: A resource identifier for the user created the issue.
     * 
     * @param userId the userId value to set.
     * @return the IssueContractInner object itself.
     */
    public IssueContractInner withUserId(String userId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IssueContractProperties();
        }
        this.innerProperties().withUserId(userId);
        return this;
    }

    /**
     * Get the createdDate property: Date and time when the issue was created.
     * 
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDate();
    }

    /**
     * Set the createdDate property: Date and time when the issue was created.
     * 
     * @param createdDate the createdDate value to set.
     * @return the IssueContractInner object itself.
     */
    public IssueContractInner withCreatedDate(OffsetDateTime createdDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IssueContractProperties();
        }
        this.innerProperties().withCreatedDate(createdDate);
        return this;
    }

    /**
     * Get the state property: Status of the issue.
     * 
     * @return the state value.
     */
    public State state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Status of the issue.
     * 
     * @param state the state value to set.
     * @return the IssueContractInner object itself.
     */
    public IssueContractInner withState(State state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IssueContractProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the apiId property: A resource identifier for the API the issue was created for.
     * 
     * @return the apiId value.
     */
    public String apiId() {
        return this.innerProperties() == null ? null : this.innerProperties().apiId();
    }

    /**
     * Set the apiId property: A resource identifier for the API the issue was created for.
     * 
     * @param apiId the apiId value to set.
     * @return the IssueContractInner object itself.
     */
    public IssueContractInner withApiId(String apiId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IssueContractProperties();
        }
        this.innerProperties().withApiId(apiId);
        return this;
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IssueContractInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IssueContractInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IssueContractInner.
     */
    public static IssueContractInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IssueContractInner deserializedIssueContractInner = new IssueContractInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedIssueContractInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedIssueContractInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedIssueContractInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedIssueContractInner.innerProperties = IssueContractProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIssueContractInner;
        });
    }
}
