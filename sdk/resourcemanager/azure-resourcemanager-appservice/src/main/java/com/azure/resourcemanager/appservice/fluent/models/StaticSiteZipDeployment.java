// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A static site zip deployment.
 */
@Fluent
public final class StaticSiteZipDeployment implements JsonSerializable<StaticSiteZipDeployment> {
    /*
     * URL for the zipped app content
     */
    private String appZipUrl;

    /*
     * URL for the zipped api content
     */
    private String apiZipUrl;

    /*
     * A title to label the deployment
     */
    private String deploymentTitle;

    /*
     * The provider submitting this deployment
     */
    private String provider;

    /*
     * The language of the api content, if it exists
     */
    private String functionLanguage;

    /**
     * Creates an instance of StaticSiteZipDeployment class.
     */
    public StaticSiteZipDeployment() {
    }

    /**
     * Get the appZipUrl property: URL for the zipped app content.
     * 
     * @return the appZipUrl value.
     */
    public String appZipUrl() {
        return this.appZipUrl;
    }

    /**
     * Set the appZipUrl property: URL for the zipped app content.
     * 
     * @param appZipUrl the appZipUrl value to set.
     * @return the StaticSiteZipDeployment object itself.
     */
    public StaticSiteZipDeployment withAppZipUrl(String appZipUrl) {
        this.appZipUrl = appZipUrl;
        return this;
    }

    /**
     * Get the apiZipUrl property: URL for the zipped api content.
     * 
     * @return the apiZipUrl value.
     */
    public String apiZipUrl() {
        return this.apiZipUrl;
    }

    /**
     * Set the apiZipUrl property: URL for the zipped api content.
     * 
     * @param apiZipUrl the apiZipUrl value to set.
     * @return the StaticSiteZipDeployment object itself.
     */
    public StaticSiteZipDeployment withApiZipUrl(String apiZipUrl) {
        this.apiZipUrl = apiZipUrl;
        return this;
    }

    /**
     * Get the deploymentTitle property: A title to label the deployment.
     * 
     * @return the deploymentTitle value.
     */
    public String deploymentTitle() {
        return this.deploymentTitle;
    }

    /**
     * Set the deploymentTitle property: A title to label the deployment.
     * 
     * @param deploymentTitle the deploymentTitle value to set.
     * @return the StaticSiteZipDeployment object itself.
     */
    public StaticSiteZipDeployment withDeploymentTitle(String deploymentTitle) {
        this.deploymentTitle = deploymentTitle;
        return this;
    }

    /**
     * Get the provider property: The provider submitting this deployment.
     * 
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: The provider submitting this deployment.
     * 
     * @param provider the provider value to set.
     * @return the StaticSiteZipDeployment object itself.
     */
    public StaticSiteZipDeployment withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the functionLanguage property: The language of the api content, if it exists.
     * 
     * @return the functionLanguage value.
     */
    public String functionLanguage() {
        return this.functionLanguage;
    }

    /**
     * Set the functionLanguage property: The language of the api content, if it exists.
     * 
     * @param functionLanguage the functionLanguage value to set.
     * @return the StaticSiteZipDeployment object itself.
     */
    public StaticSiteZipDeployment withFunctionLanguage(String functionLanguage) {
        this.functionLanguage = functionLanguage;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("appZipUrl", this.appZipUrl);
        jsonWriter.writeStringField("apiZipUrl", this.apiZipUrl);
        jsonWriter.writeStringField("deploymentTitle", this.deploymentTitle);
        jsonWriter.writeStringField("provider", this.provider);
        jsonWriter.writeStringField("functionLanguage", this.functionLanguage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSiteZipDeployment from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSiteZipDeployment if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StaticSiteZipDeployment.
     */
    public static StaticSiteZipDeployment fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSiteZipDeployment deserializedStaticSiteZipDeployment = new StaticSiteZipDeployment();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("appZipUrl".equals(fieldName)) {
                    deserializedStaticSiteZipDeployment.appZipUrl = reader.getString();
                } else if ("apiZipUrl".equals(fieldName)) {
                    deserializedStaticSiteZipDeployment.apiZipUrl = reader.getString();
                } else if ("deploymentTitle".equals(fieldName)) {
                    deserializedStaticSiteZipDeployment.deploymentTitle = reader.getString();
                } else if ("provider".equals(fieldName)) {
                    deserializedStaticSiteZipDeployment.provider = reader.getString();
                } else if ("functionLanguage".equals(fieldName)) {
                    deserializedStaticSiteZipDeployment.functionLanguage = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSiteZipDeployment;
        });
    }
}
