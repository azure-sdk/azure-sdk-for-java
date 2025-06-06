// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.fluxconfigurations.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The Kustomization defining how to reconcile the artifact pulled by the source type on the cluster.
 */
@Fluent
public final class KustomizationDefinition implements JsonSerializable<KustomizationDefinition> {
    /*
     * Name of the Kustomization, matching the key in the Kustomizations object map.
     */
    private String name;

    /*
     * The path in the source reference to reconcile on the cluster.
     */
    private String path;

    /*
     * Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until
     * all dependencies have completed their reconciliation.
     */
    private List<String> dependsOn;

    /*
     * The maximum time to attempt to reconcile the Kustomization on the cluster.
     */
    private Long timeoutInSeconds;

    /*
     * The interval at which to re-reconcile the Kustomization on the cluster.
     */
    private Long syncIntervalInSeconds;

    /*
     * The interval at which to re-reconcile the Kustomization on the cluster in the event of failure on reconciliation.
     */
    private Long retryIntervalInSeconds;

    /*
     * Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
     */
    private Boolean prune;

    /*
     * Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to an immutable field
     * change.
     */
    private Boolean force;

    /*
     * Enable/disable health check for all Kubernetes objects created by this Kustomization.
     */
    private Boolean enableWait;

    /*
     * Used for variable substitution for this Kustomization after kustomize build.
     */
    private PostBuildDefinition postBuild;

    /**
     * Creates an instance of KustomizationDefinition class.
     */
    public KustomizationDefinition() {
    }

    /**
     * Get the name property: Name of the Kustomization, matching the key in the Kustomizations object map.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the path property: The path in the source reference to reconcile on the cluster.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path in the source reference to reconcile on the cluster.
     * 
     * @param path the path value to set.
     * @return the KustomizationDefinition object itself.
     */
    public KustomizationDefinition withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the dependsOn property: Specifies other Kustomizations that this Kustomization depends on. This Kustomization
     * will not reconcile until all dependencies have completed their reconciliation.
     * 
     * @return the dependsOn value.
     */
    public List<String> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set the dependsOn property: Specifies other Kustomizations that this Kustomization depends on. This Kustomization
     * will not reconcile until all dependencies have completed their reconciliation.
     * 
     * @param dependsOn the dependsOn value to set.
     * @return the KustomizationDefinition object itself.
     */
    public KustomizationDefinition withDependsOn(List<String> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get the timeoutInSeconds property: The maximum time to attempt to reconcile the Kustomization on the cluster.
     * 
     * @return the timeoutInSeconds value.
     */
    public Long timeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * Set the timeoutInSeconds property: The maximum time to attempt to reconcile the Kustomization on the cluster.
     * 
     * @param timeoutInSeconds the timeoutInSeconds value to set.
     * @return the KustomizationDefinition object itself.
     */
    public KustomizationDefinition withTimeoutInSeconds(Long timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
        return this;
    }

    /**
     * Get the syncIntervalInSeconds property: The interval at which to re-reconcile the Kustomization on the cluster.
     * 
     * @return the syncIntervalInSeconds value.
     */
    public Long syncIntervalInSeconds() {
        return this.syncIntervalInSeconds;
    }

    /**
     * Set the syncIntervalInSeconds property: The interval at which to re-reconcile the Kustomization on the cluster.
     * 
     * @param syncIntervalInSeconds the syncIntervalInSeconds value to set.
     * @return the KustomizationDefinition object itself.
     */
    public KustomizationDefinition withSyncIntervalInSeconds(Long syncIntervalInSeconds) {
        this.syncIntervalInSeconds = syncIntervalInSeconds;
        return this;
    }

    /**
     * Get the retryIntervalInSeconds property: The interval at which to re-reconcile the Kustomization on the cluster
     * in the event of failure on reconciliation.
     * 
     * @return the retryIntervalInSeconds value.
     */
    public Long retryIntervalInSeconds() {
        return this.retryIntervalInSeconds;
    }

    /**
     * Set the retryIntervalInSeconds property: The interval at which to re-reconcile the Kustomization on the cluster
     * in the event of failure on reconciliation.
     * 
     * @param retryIntervalInSeconds the retryIntervalInSeconds value to set.
     * @return the KustomizationDefinition object itself.
     */
    public KustomizationDefinition withRetryIntervalInSeconds(Long retryIntervalInSeconds) {
        this.retryIntervalInSeconds = retryIntervalInSeconds;
        return this;
    }

    /**
     * Get the prune property: Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
     * 
     * @return the prune value.
     */
    public Boolean prune() {
        return this.prune;
    }

    /**
     * Set the prune property: Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
     * 
     * @param prune the prune value to set.
     * @return the KustomizationDefinition object itself.
     */
    public KustomizationDefinition withPrune(Boolean prune) {
        this.prune = prune;
        return this;
    }

    /**
     * Get the force property: Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to
     * an immutable field change.
     * 
     * @return the force value.
     */
    public Boolean force() {
        return this.force;
    }

    /**
     * Set the force property: Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to
     * an immutable field change.
     * 
     * @param force the force value to set.
     * @return the KustomizationDefinition object itself.
     */
    public KustomizationDefinition withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * Get the enableWait property: Enable/disable health check for all Kubernetes objects created by this
     * Kustomization.
     * 
     * @return the enableWait value.
     */
    public Boolean enableWait() {
        return this.enableWait;
    }

    /**
     * Set the enableWait property: Enable/disable health check for all Kubernetes objects created by this
     * Kustomization.
     * 
     * @param enableWait the enableWait value to set.
     * @return the KustomizationDefinition object itself.
     */
    public KustomizationDefinition withEnableWait(Boolean enableWait) {
        this.enableWait = enableWait;
        return this;
    }

    /**
     * Get the postBuild property: Used for variable substitution for this Kustomization after kustomize build.
     * 
     * @return the postBuild value.
     */
    public PostBuildDefinition postBuild() {
        return this.postBuild;
    }

    /**
     * Set the postBuild property: Used for variable substitution for this Kustomization after kustomize build.
     * 
     * @param postBuild the postBuild value to set.
     * @return the KustomizationDefinition object itself.
     */
    public KustomizationDefinition withPostBuild(PostBuildDefinition postBuild) {
        this.postBuild = postBuild;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (postBuild() != null) {
            postBuild().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("path", this.path);
        jsonWriter.writeArrayField("dependsOn", this.dependsOn, (writer, element) -> writer.writeString(element));
        jsonWriter.writeNumberField("timeoutInSeconds", this.timeoutInSeconds);
        jsonWriter.writeNumberField("syncIntervalInSeconds", this.syncIntervalInSeconds);
        jsonWriter.writeNumberField("retryIntervalInSeconds", this.retryIntervalInSeconds);
        jsonWriter.writeBooleanField("prune", this.prune);
        jsonWriter.writeBooleanField("force", this.force);
        jsonWriter.writeBooleanField("wait", this.enableWait);
        jsonWriter.writeJsonField("postBuild", this.postBuild);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KustomizationDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KustomizationDefinition if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the KustomizationDefinition.
     */
    public static KustomizationDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KustomizationDefinition deserializedKustomizationDefinition = new KustomizationDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedKustomizationDefinition.name = reader.getString();
                } else if ("path".equals(fieldName)) {
                    deserializedKustomizationDefinition.path = reader.getString();
                } else if ("dependsOn".equals(fieldName)) {
                    List<String> dependsOn = reader.readArray(reader1 -> reader1.getString());
                    deserializedKustomizationDefinition.dependsOn = dependsOn;
                } else if ("timeoutInSeconds".equals(fieldName)) {
                    deserializedKustomizationDefinition.timeoutInSeconds = reader.getNullable(JsonReader::getLong);
                } else if ("syncIntervalInSeconds".equals(fieldName)) {
                    deserializedKustomizationDefinition.syncIntervalInSeconds = reader.getNullable(JsonReader::getLong);
                } else if ("retryIntervalInSeconds".equals(fieldName)) {
                    deserializedKustomizationDefinition.retryIntervalInSeconds
                        = reader.getNullable(JsonReader::getLong);
                } else if ("prune".equals(fieldName)) {
                    deserializedKustomizationDefinition.prune = reader.getNullable(JsonReader::getBoolean);
                } else if ("force".equals(fieldName)) {
                    deserializedKustomizationDefinition.force = reader.getNullable(JsonReader::getBoolean);
                } else if ("wait".equals(fieldName)) {
                    deserializedKustomizationDefinition.enableWait = reader.getNullable(JsonReader::getBoolean);
                } else if ("postBuild".equals(fieldName)) {
                    deserializedKustomizationDefinition.postBuild = PostBuildDefinition.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKustomizationDefinition;
        });
    }
}
