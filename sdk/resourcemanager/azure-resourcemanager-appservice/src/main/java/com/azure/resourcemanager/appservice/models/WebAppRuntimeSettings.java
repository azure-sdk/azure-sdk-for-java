// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Web App runtime settings.
 */
@Immutable
public final class WebAppRuntimeSettings implements JsonSerializable<WebAppRuntimeSettings> {
    /*
     * Web App stack minor version (runtime only).
     */
    private String runtimeVersion;

    /*
     * <code>true</code> if remote debugging is supported for the stack; otherwise, <code>false</code>.
     */
    private Boolean remoteDebuggingSupported;

    /*
     * Application Insights settings associated with the minor version.
     */
    private AppInsightsWebAppStackSettings appInsightsSettings;

    /*
     * GitHub Actions settings associated with the minor version.
     */
    private GitHubActionWebAppStackSettings gitHubActionSettings;

    /*
     * <code>true</code> if the stack is in preview; otherwise, <code>false</code>.
     */
    private Boolean isPreview;

    /*
     * <code>true</code> if the stack is deprecated; otherwise, <code>false</code>.
     */
    private Boolean isDeprecated;

    /*
     * <code>true</code> if the stack should be hidden; otherwise, <code>false</code>.
     */
    private Boolean isHidden;

    /*
     * End-of-life date for the minor version.
     */
    private OffsetDateTime endOfLifeDate;

    /*
     * <code>true</code> if the stack version is auto-updated; otherwise, <code>false</code>.
     */
    private Boolean isAutoUpdate;

    /*
     * <code>true</code> if the minor version is early-access; otherwise, <code>false</code>.
     */
    private Boolean isEarlyAccess;

    /**
     * Creates an instance of WebAppRuntimeSettings class.
     */
    public WebAppRuntimeSettings() {
    }

    /**
     * Get the runtimeVersion property: Web App stack minor version (runtime only).
     * 
     * @return the runtimeVersion value.
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Get the remoteDebuggingSupported property: &lt;code&gt;true&lt;/code&gt; if remote debugging is supported for the
     * stack; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the remoteDebuggingSupported value.
     */
    public Boolean remoteDebuggingSupported() {
        return this.remoteDebuggingSupported;
    }

    /**
     * Get the appInsightsSettings property: Application Insights settings associated with the minor version.
     * 
     * @return the appInsightsSettings value.
     */
    public AppInsightsWebAppStackSettings appInsightsSettings() {
        return this.appInsightsSettings;
    }

    /**
     * Get the gitHubActionSettings property: GitHub Actions settings associated with the minor version.
     * 
     * @return the gitHubActionSettings value.
     */
    public GitHubActionWebAppStackSettings gitHubActionSettings() {
        return this.gitHubActionSettings;
    }

    /**
     * Get the isPreview property: &lt;code&gt;true&lt;/code&gt; if the stack is in preview; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Get the isDeprecated property: &lt;code&gt;true&lt;/code&gt; if the stack is deprecated; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the isDeprecated value.
     */
    public Boolean isDeprecated() {
        return this.isDeprecated;
    }

    /**
     * Get the isHidden property: &lt;code&gt;true&lt;/code&gt; if the stack should be hidden; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the isHidden value.
     */
    public Boolean isHidden() {
        return this.isHidden;
    }

    /**
     * Get the endOfLifeDate property: End-of-life date for the minor version.
     * 
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Get the isAutoUpdate property: &lt;code&gt;true&lt;/code&gt; if the stack version is auto-updated; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the isAutoUpdate value.
     */
    public Boolean isAutoUpdate() {
        return this.isAutoUpdate;
    }

    /**
     * Get the isEarlyAccess property: &lt;code&gt;true&lt;/code&gt; if the minor version is early-access; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the isEarlyAccess value.
     */
    public Boolean isEarlyAccess() {
        return this.isEarlyAccess;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (appInsightsSettings() != null) {
            appInsightsSettings().validate();
        }
        if (gitHubActionSettings() != null) {
            gitHubActionSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebAppRuntimeSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebAppRuntimeSettings if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WebAppRuntimeSettings.
     */
    public static WebAppRuntimeSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebAppRuntimeSettings deserializedWebAppRuntimeSettings = new WebAppRuntimeSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("runtimeVersion".equals(fieldName)) {
                    deserializedWebAppRuntimeSettings.runtimeVersion = reader.getString();
                } else if ("remoteDebuggingSupported".equals(fieldName)) {
                    deserializedWebAppRuntimeSettings.remoteDebuggingSupported
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("appInsightsSettings".equals(fieldName)) {
                    deserializedWebAppRuntimeSettings.appInsightsSettings
                        = AppInsightsWebAppStackSettings.fromJson(reader);
                } else if ("gitHubActionSettings".equals(fieldName)) {
                    deserializedWebAppRuntimeSettings.gitHubActionSettings
                        = GitHubActionWebAppStackSettings.fromJson(reader);
                } else if ("isPreview".equals(fieldName)) {
                    deserializedWebAppRuntimeSettings.isPreview = reader.getNullable(JsonReader::getBoolean);
                } else if ("isDeprecated".equals(fieldName)) {
                    deserializedWebAppRuntimeSettings.isDeprecated = reader.getNullable(JsonReader::getBoolean);
                } else if ("isHidden".equals(fieldName)) {
                    deserializedWebAppRuntimeSettings.isHidden = reader.getNullable(JsonReader::getBoolean);
                } else if ("endOfLifeDate".equals(fieldName)) {
                    deserializedWebAppRuntimeSettings.endOfLifeDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("isAutoUpdate".equals(fieldName)) {
                    deserializedWebAppRuntimeSettings.isAutoUpdate = reader.getNullable(JsonReader::getBoolean);
                } else if ("isEarlyAccess".equals(fieldName)) {
                    deserializedWebAppRuntimeSettings.isEarlyAccess = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebAppRuntimeSettings;
        });
    }
}
