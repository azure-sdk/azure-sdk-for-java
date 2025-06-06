// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.deploymentstacks.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The Deployment stack validation result details.
 */
@Fluent
public final class DeploymentStackValidateProperties implements JsonSerializable<DeploymentStackValidateProperties> {
    /*
     * Defines the behavior of resources that are no longer managed after the Deployment stack is updated or deleted.
     */
    private ActionOnUnmanage actionOnUnmanage;

    /*
     * The correlation id of the Deployment stack validate operation. It is in GUID format and is used for tracing.
     */
    private String correlationId;

    /*
     * The Deployment stack deny settings.
     */
    private DenySettings denySettings;

    /*
     * The Deployment stack deployment scope.
     */
    private String deploymentScope;

    /*
     * The Deployment stack validation description.
     */
    private String description;

    /*
     * Deployment parameters.
     */
    private Map<String, DeploymentParameter> parameters;

    /*
     * The URI of the template.
     */
    private DeploymentStacksTemplateLink templateLink;

    /*
     * The array of resources that were validated.
     */
    private List<ResourceReference> validatedResources;

    /**
     * Creates an instance of DeploymentStackValidateProperties class.
     */
    public DeploymentStackValidateProperties() {
    }

    /**
     * Get the actionOnUnmanage property: Defines the behavior of resources that are no longer managed after the
     * Deployment stack is updated or deleted.
     * 
     * @return the actionOnUnmanage value.
     */
    public ActionOnUnmanage actionOnUnmanage() {
        return this.actionOnUnmanage;
    }

    /**
     * Set the actionOnUnmanage property: Defines the behavior of resources that are no longer managed after the
     * Deployment stack is updated or deleted.
     * 
     * @param actionOnUnmanage the actionOnUnmanage value to set.
     * @return the DeploymentStackValidateProperties object itself.
     */
    public DeploymentStackValidateProperties withActionOnUnmanage(ActionOnUnmanage actionOnUnmanage) {
        this.actionOnUnmanage = actionOnUnmanage;
        return this;
    }

    /**
     * Get the correlationId property: The correlation id of the Deployment stack validate operation. It is in GUID
     * format and is used for tracing.
     * 
     * @return the correlationId value.
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: The correlation id of the Deployment stack validate operation. It is in GUID
     * format and is used for tracing.
     * 
     * @param correlationId the correlationId value to set.
     * @return the DeploymentStackValidateProperties object itself.
     */
    public DeploymentStackValidateProperties withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the denySettings property: The Deployment stack deny settings.
     * 
     * @return the denySettings value.
     */
    public DenySettings denySettings() {
        return this.denySettings;
    }

    /**
     * Set the denySettings property: The Deployment stack deny settings.
     * 
     * @param denySettings the denySettings value to set.
     * @return the DeploymentStackValidateProperties object itself.
     */
    public DeploymentStackValidateProperties withDenySettings(DenySettings denySettings) {
        this.denySettings = denySettings;
        return this;
    }

    /**
     * Get the deploymentScope property: The Deployment stack deployment scope.
     * 
     * @return the deploymentScope value.
     */
    public String deploymentScope() {
        return this.deploymentScope;
    }

    /**
     * Set the deploymentScope property: The Deployment stack deployment scope.
     * 
     * @param deploymentScope the deploymentScope value to set.
     * @return the DeploymentStackValidateProperties object itself.
     */
    public DeploymentStackValidateProperties withDeploymentScope(String deploymentScope) {
        this.deploymentScope = deploymentScope;
        return this;
    }

    /**
     * Get the description property: The Deployment stack validation description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The Deployment stack validation description.
     * 
     * @param description the description value to set.
     * @return the DeploymentStackValidateProperties object itself.
     */
    public DeploymentStackValidateProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the parameters property: Deployment parameters.
     * 
     * @return the parameters value.
     */
    public Map<String, DeploymentParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Deployment parameters.
     * 
     * @param parameters the parameters value to set.
     * @return the DeploymentStackValidateProperties object itself.
     */
    public DeploymentStackValidateProperties withParameters(Map<String, DeploymentParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the templateLink property: The URI of the template.
     * 
     * @return the templateLink value.
     */
    public DeploymentStacksTemplateLink templateLink() {
        return this.templateLink;
    }

    /**
     * Set the templateLink property: The URI of the template.
     * 
     * @param templateLink the templateLink value to set.
     * @return the DeploymentStackValidateProperties object itself.
     */
    public DeploymentStackValidateProperties withTemplateLink(DeploymentStacksTemplateLink templateLink) {
        this.templateLink = templateLink;
        return this;
    }

    /**
     * Get the validatedResources property: The array of resources that were validated.
     * 
     * @return the validatedResources value.
     */
    public List<ResourceReference> validatedResources() {
        return this.validatedResources;
    }

    /**
     * Set the validatedResources property: The array of resources that were validated.
     * 
     * @param validatedResources the validatedResources value to set.
     * @return the DeploymentStackValidateProperties object itself.
     */
    public DeploymentStackValidateProperties withValidatedResources(List<ResourceReference> validatedResources) {
        this.validatedResources = validatedResources;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (actionOnUnmanage() != null) {
            actionOnUnmanage().validate();
        }
        if (denySettings() != null) {
            denySettings().validate();
        }
        if (parameters() != null) {
            parameters().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (templateLink() != null) {
            templateLink().validate();
        }
        if (validatedResources() != null) {
            validatedResources().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("actionOnUnmanage", this.actionOnUnmanage);
        jsonWriter.writeStringField("correlationId", this.correlationId);
        jsonWriter.writeJsonField("denySettings", this.denySettings);
        jsonWriter.writeStringField("deploymentScope", this.deploymentScope);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeMapField("parameters", this.parameters, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("templateLink", this.templateLink);
        jsonWriter.writeArrayField("validatedResources", this.validatedResources,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeploymentStackValidateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeploymentStackValidateProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeploymentStackValidateProperties.
     */
    public static DeploymentStackValidateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeploymentStackValidateProperties deserializedDeploymentStackValidateProperties
                = new DeploymentStackValidateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("actionOnUnmanage".equals(fieldName)) {
                    deserializedDeploymentStackValidateProperties.actionOnUnmanage = ActionOnUnmanage.fromJson(reader);
                } else if ("correlationId".equals(fieldName)) {
                    deserializedDeploymentStackValidateProperties.correlationId = reader.getString();
                } else if ("denySettings".equals(fieldName)) {
                    deserializedDeploymentStackValidateProperties.denySettings = DenySettings.fromJson(reader);
                } else if ("deploymentScope".equals(fieldName)) {
                    deserializedDeploymentStackValidateProperties.deploymentScope = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedDeploymentStackValidateProperties.description = reader.getString();
                } else if ("parameters".equals(fieldName)) {
                    Map<String, DeploymentParameter> parameters
                        = reader.readMap(reader1 -> DeploymentParameter.fromJson(reader1));
                    deserializedDeploymentStackValidateProperties.parameters = parameters;
                } else if ("templateLink".equals(fieldName)) {
                    deserializedDeploymentStackValidateProperties.templateLink
                        = DeploymentStacksTemplateLink.fromJson(reader);
                } else if ("validatedResources".equals(fieldName)) {
                    List<ResourceReference> validatedResources
                        = reader.readArray(reader1 -> ResourceReference.fromJson(reader1));
                    deserializedDeploymentStackValidateProperties.validatedResources = validatedResources;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeploymentStackValidateProperties;
        });
    }
}
