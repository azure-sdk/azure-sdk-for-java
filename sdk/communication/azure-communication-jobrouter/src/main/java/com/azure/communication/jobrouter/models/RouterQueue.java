// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A queue that can contain jobs to be routed.
 */
@Fluent
public final class RouterQueue implements JsonSerializable<RouterQueue> {

    /*
     * The entity tag for this resource.
     */
    @Generated
    private String etag;

    /*
     * Id of a queue.
     */
    @Generated
    private String id;

    /*
     * Friendly name of this queue.
     */
    @Generated
    private String name;

    /*
     * Id of a distribution policy that will determine how a job is distributed to workers.
     */
    @Generated
    private String distributionPolicyId;

    /*
     * A set of key/value pairs that are identifying attributes used by the rules engines to make decisions. Values must
     * be primitive values - number, string, boolean.
     */
    @Generated
    private Map<String, RouterValue> labels;

    /*
     * Id of an exception policy that determines various job escalation rules.
     */
    @Generated
    private String exceptionPolicyId;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    private boolean jsonMergePatch;

    @Generated
    private void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setRouterQueueAccessor(new JsonMergePatchHelper.RouterQueueAccessor() {

            @Override
            public RouterQueue prepareModelForJsonMergePatch(RouterQueue model, boolean jsonMergePatchEnabled) {
                model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
                return model;
            }

            @Override
            public boolean isJsonMergePatch(RouterQueue model) {
                return model.jsonMergePatch;
            }
        });
    }

    /**
     * Creates an instance of RouterQueue class.
     */
    @Generated
    public RouterQueue() {
    }

    /**
     * Get the etag property: The entity tag for this resource.
     *
     * @return the etag value.
     */
    @Generated
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the id property: Id of a queue.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: Friendly name of this queue.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Friendly name of this queue.
     *
     * @param name the name value to set.
     * @return the RouterQueue object itself.
     */
    @Generated
    public RouterQueue setName(String name) {
        this.name = name;
        this.updatedProperties.add("name");
        return this;
    }

    /**
     * Get the distributionPolicyId property: Id of a distribution policy that will determine how a job is distributed
     * to workers.
     *
     * @return the distributionPolicyId value.
     */
    @Generated
    public String getDistributionPolicyId() {
        return this.distributionPolicyId;
    }

    /**
     * Set the distributionPolicyId property: Id of a distribution policy that will determine how a job is distributed
     * to workers.
     *
     * @param distributionPolicyId the distributionPolicyId value to set.
     * @return the RouterQueue object itself.
     */
    @Generated
    public RouterQueue setDistributionPolicyId(String distributionPolicyId) {
        this.distributionPolicyId = distributionPolicyId;
        this.updatedProperties.add("distributionPolicyId");
        return this;
    }

    /**
     * Get the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions. Values must be primitive values - number, string, boolean.
     *
     * @return the labels value.
     */
    @Generated
    public Map<String, RouterValue> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions. Values must be primitive values - number, string, boolean.
     *
     * @param labels the labels value to set.
     * @return the RouterQueue object itself.
     */
    @Generated
    public RouterQueue setLabels(Map<String, RouterValue> labels) {
        this.labels = labels;
        this.updatedProperties.add("labels");
        return this;
    }

    /**
     * Get the exceptionPolicyId property: Id of an exception policy that determines various job escalation rules.
     *
     * @return the exceptionPolicyId value.
     */
    @Generated
    public String getExceptionPolicyId() {
        return this.exceptionPolicyId;
    }

    /**
     * Set the exceptionPolicyId property: Id of an exception policy that determines various job escalation rules.
     *
     * @param exceptionPolicyId the exceptionPolicyId value to set.
     * @return the RouterQueue object itself.
     */
    @Generated
    public RouterQueue setExceptionPolicyId(String exceptionPolicyId) {
        this.exceptionPolicyId = exceptionPolicyId;
        this.updatedProperties.add("exceptionPolicyId");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("name", this.name);
            jsonWriter.writeStringField("distributionPolicyId", this.distributionPolicyId);
            jsonWriter.writeMapField("labels", this.labels, (writer, element) -> writer.writeJson(element));
            jsonWriter.writeStringField("exceptionPolicyId", this.exceptionPolicyId);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("name")) {
            if (this.name == null) {
                jsonWriter.writeNullField("name");
            } else {
                jsonWriter.writeStringField("name", this.name);
            }
        }
        if (updatedProperties.contains("distributionPolicyId")) {
            if (this.distributionPolicyId == null) {
                jsonWriter.writeNullField("distributionPolicyId");
            } else {
                jsonWriter.writeStringField("distributionPolicyId", this.distributionPolicyId);
            }
        }
        if (updatedProperties.contains("labels")) {
            if (this.labels == null) {
                jsonWriter.writeNullField("labels");
            } else {
                jsonWriter.writeMapField("labels", this.labels, (writer, element) -> writer.writeJson(element));
            }
        }
        if (updatedProperties.contains("exceptionPolicyId")) {
            if (this.exceptionPolicyId == null) {
                jsonWriter.writeNullField("exceptionPolicyId");
            } else {
                jsonWriter.writeStringField("exceptionPolicyId", this.exceptionPolicyId);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RouterQueue from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RouterQueue if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RouterQueue.
     */
    @Generated
    public static RouterQueue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RouterQueue deserializedRouterQueue = new RouterQueue();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("etag".equals(fieldName)) {
                    deserializedRouterQueue.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedRouterQueue.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRouterQueue.name = reader.getString();
                } else if ("distributionPolicyId".equals(fieldName)) {
                    deserializedRouterQueue.distributionPolicyId = reader.getString();
                } else if ("labels".equals(fieldName)) {
                    Map<String, RouterValue> labels = reader.readMap(reader1 -> RouterValue.fromJson(reader1));
                    deserializedRouterQueue.labels = labels;
                } else if ("exceptionPolicyId".equals(fieldName)) {
                    deserializedRouterQueue.exceptionPolicyId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRouterQueue;
        });
    }
}
