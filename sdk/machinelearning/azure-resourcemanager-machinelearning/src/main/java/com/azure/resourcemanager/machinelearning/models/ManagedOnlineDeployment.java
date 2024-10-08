// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Properties specific to a ManagedOnlineDeployment.
 */
@Fluent
public final class ManagedOnlineDeployment extends OnlineDeploymentProperties {
    /*
     * [Required] The compute type of the endpoint.
     */
    private EndpointComputeType endpointComputeType = EndpointComputeType.MANAGED;

    /*
     * Provisioning state for the endpoint deployment.
     */
    private DeploymentProvisioningState provisioningState;

    /**
     * Creates an instance of ManagedOnlineDeployment class.
     */
    public ManagedOnlineDeployment() {
    }

    /**
     * Get the endpointComputeType property: [Required] The compute type of the endpoint.
     * 
     * @return the endpointComputeType value.
     */
    @Override
    public EndpointComputeType endpointComputeType() {
        return this.endpointComputeType;
    }

    /**
     * Get the provisioningState property: Provisioning state for the endpoint deployment.
     * 
     * @return the provisioningState value.
     */
    @Override
    public DeploymentProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withScaleSettings(OnlineScaleSettings scaleSettings) {
        super.withScaleSettings(scaleSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withRequestSettings(OnlineRequestSettings requestSettings) {
        super.withRequestSettings(requestSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withModelMountPath(String modelMountPath) {
        super.withModelMountPath(modelMountPath);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withAppInsightsEnabled(Boolean appInsightsEnabled) {
        super.withAppInsightsEnabled(appInsightsEnabled);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withLivenessProbe(ProbeSettings livenessProbe) {
        super.withLivenessProbe(livenessProbe);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withReadinessProbe(ProbeSettings readinessProbe) {
        super.withReadinessProbe(readinessProbe);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withInstanceType(String instanceType) {
        super.withInstanceType(instanceType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withModel(String model) {
        super.withModel(model);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment
        withEgressPublicNetworkAccess(EgressPublicNetworkAccessType egressPublicNetworkAccess) {
        super.withEgressPublicNetworkAccess(egressPublicNetworkAccess);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withDataCollector(DataCollector dataCollector) {
        super.withDataCollector(dataCollector);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withCodeConfiguration(CodeConfiguration codeConfiguration) {
        super.withCodeConfiguration(codeConfiguration);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withEnvironmentId(String environmentId) {
        super.withEnvironmentId(environmentId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedOnlineDeployment withEnvironmentVariables(Map<String, String> environmentVariables) {
        super.withEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeMapField("properties", properties(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("codeConfiguration", codeConfiguration());
        jsonWriter.writeStringField("environmentId", environmentId());
        jsonWriter.writeMapField("environmentVariables", environmentVariables(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("scaleSettings", scaleSettings());
        jsonWriter.writeJsonField("requestSettings", requestSettings());
        jsonWriter.writeStringField("modelMountPath", modelMountPath());
        jsonWriter.writeBooleanField("appInsightsEnabled", appInsightsEnabled());
        jsonWriter.writeJsonField("livenessProbe", livenessProbe());
        jsonWriter.writeJsonField("readinessProbe", readinessProbe());
        jsonWriter.writeStringField("instanceType", instanceType());
        jsonWriter.writeStringField("model", model());
        jsonWriter.writeStringField("egressPublicNetworkAccess",
            egressPublicNetworkAccess() == null ? null : egressPublicNetworkAccess().toString());
        jsonWriter.writeJsonField("dataCollector", dataCollector());
        jsonWriter.writeStringField("endpointComputeType",
            this.endpointComputeType == null ? null : this.endpointComputeType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedOnlineDeployment from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedOnlineDeployment if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedOnlineDeployment.
     */
    public static ManagedOnlineDeployment fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedOnlineDeployment deserializedManagedOnlineDeployment = new ManagedOnlineDeployment();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedManagedOnlineDeployment.withDescription(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedManagedOnlineDeployment.withProperties(properties);
                } else if ("codeConfiguration".equals(fieldName)) {
                    deserializedManagedOnlineDeployment.withCodeConfiguration(CodeConfiguration.fromJson(reader));
                } else if ("environmentId".equals(fieldName)) {
                    deserializedManagedOnlineDeployment.withEnvironmentId(reader.getString());
                } else if ("environmentVariables".equals(fieldName)) {
                    Map<String, String> environmentVariables = reader.readMap(reader1 -> reader1.getString());
                    deserializedManagedOnlineDeployment.withEnvironmentVariables(environmentVariables);
                } else if ("scaleSettings".equals(fieldName)) {
                    deserializedManagedOnlineDeployment.withScaleSettings(OnlineScaleSettings.fromJson(reader));
                } else if ("requestSettings".equals(fieldName)) {
                    deserializedManagedOnlineDeployment.withRequestSettings(OnlineRequestSettings.fromJson(reader));
                } else if ("modelMountPath".equals(fieldName)) {
                    deserializedManagedOnlineDeployment.withModelMountPath(reader.getString());
                } else if ("appInsightsEnabled".equals(fieldName)) {
                    deserializedManagedOnlineDeployment
                        .withAppInsightsEnabled(reader.getNullable(JsonReader::getBoolean));
                } else if ("livenessProbe".equals(fieldName)) {
                    deserializedManagedOnlineDeployment.withLivenessProbe(ProbeSettings.fromJson(reader));
                } else if ("readinessProbe".equals(fieldName)) {
                    deserializedManagedOnlineDeployment.withReadinessProbe(ProbeSettings.fromJson(reader));
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedManagedOnlineDeployment.provisioningState
                        = DeploymentProvisioningState.fromString(reader.getString());
                } else if ("instanceType".equals(fieldName)) {
                    deserializedManagedOnlineDeployment.withInstanceType(reader.getString());
                } else if ("model".equals(fieldName)) {
                    deserializedManagedOnlineDeployment.withModel(reader.getString());
                } else if ("egressPublicNetworkAccess".equals(fieldName)) {
                    deserializedManagedOnlineDeployment
                        .withEgressPublicNetworkAccess(EgressPublicNetworkAccessType.fromString(reader.getString()));
                } else if ("dataCollector".equals(fieldName)) {
                    deserializedManagedOnlineDeployment.withDataCollector(DataCollector.fromJson(reader));
                } else if ("endpointComputeType".equals(fieldName)) {
                    deserializedManagedOnlineDeployment.endpointComputeType
                        = EndpointComputeType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedOnlineDeployment;
        });
    }
}
