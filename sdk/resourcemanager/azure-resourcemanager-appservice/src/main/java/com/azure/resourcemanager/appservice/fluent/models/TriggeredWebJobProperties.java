// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.TriggeredJobRun;
import com.azure.resourcemanager.appservice.models.WebJobType;
import java.io.IOException;
import java.util.Map;

/**
 * TriggeredWebJob resource specific properties.
 */
@Fluent
public final class TriggeredWebJobProperties implements JsonSerializable<TriggeredWebJobProperties> {
    /*
     * Latest job run information.
     */
    private TriggeredJobRun latestRun;

    /*
     * History URL.
     */
    private String historyUrl;

    /*
     * Scheduler Logs URL.
     */
    private String schedulerLogsUrl;

    /*
     * Run command.
     */
    private String runCommand;

    /*
     * Job URL.
     */
    private String url;

    /*
     * Extra Info URL.
     */
    private String extraInfoUrl;

    /*
     * Job type.
     */
    private WebJobType webJobType;

    /*
     * Error information.
     */
    private String error;

    /*
     * Using SDK?
     */
    private Boolean usingSdk;

    /*
     * Property to allow or block all public traffic. Allowed Values: 'Enabled', 'Disabled' or an empty string.
     */
    private String publicNetworkAccess;

    /*
     * Checks if Customer provided storage account is required
     */
    private Boolean storageAccountRequired;

    /*
     * Job settings.
     */
    private Map<String, Object> settings;

    /**
     * Creates an instance of TriggeredWebJobProperties class.
     */
    public TriggeredWebJobProperties() {
    }

    /**
     * Get the latestRun property: Latest job run information.
     * 
     * @return the latestRun value.
     */
    public TriggeredJobRun latestRun() {
        return this.latestRun;
    }

    /**
     * Set the latestRun property: Latest job run information.
     * 
     * @param latestRun the latestRun value to set.
     * @return the TriggeredWebJobProperties object itself.
     */
    public TriggeredWebJobProperties withLatestRun(TriggeredJobRun latestRun) {
        this.latestRun = latestRun;
        return this;
    }

    /**
     * Get the historyUrl property: History URL.
     * 
     * @return the historyUrl value.
     */
    public String historyUrl() {
        return this.historyUrl;
    }

    /**
     * Set the historyUrl property: History URL.
     * 
     * @param historyUrl the historyUrl value to set.
     * @return the TriggeredWebJobProperties object itself.
     */
    public TriggeredWebJobProperties withHistoryUrl(String historyUrl) {
        this.historyUrl = historyUrl;
        return this;
    }

    /**
     * Get the schedulerLogsUrl property: Scheduler Logs URL.
     * 
     * @return the schedulerLogsUrl value.
     */
    public String schedulerLogsUrl() {
        return this.schedulerLogsUrl;
    }

    /**
     * Set the schedulerLogsUrl property: Scheduler Logs URL.
     * 
     * @param schedulerLogsUrl the schedulerLogsUrl value to set.
     * @return the TriggeredWebJobProperties object itself.
     */
    public TriggeredWebJobProperties withSchedulerLogsUrl(String schedulerLogsUrl) {
        this.schedulerLogsUrl = schedulerLogsUrl;
        return this;
    }

    /**
     * Get the runCommand property: Run command.
     * 
     * @return the runCommand value.
     */
    public String runCommand() {
        return this.runCommand;
    }

    /**
     * Set the runCommand property: Run command.
     * 
     * @param runCommand the runCommand value to set.
     * @return the TriggeredWebJobProperties object itself.
     */
    public TriggeredWebJobProperties withRunCommand(String runCommand) {
        this.runCommand = runCommand;
        return this;
    }

    /**
     * Get the url property: Job URL.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: Job URL.
     * 
     * @param url the url value to set.
     * @return the TriggeredWebJobProperties object itself.
     */
    public TriggeredWebJobProperties withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the extraInfoUrl property: Extra Info URL.
     * 
     * @return the extraInfoUrl value.
     */
    public String extraInfoUrl() {
        return this.extraInfoUrl;
    }

    /**
     * Set the extraInfoUrl property: Extra Info URL.
     * 
     * @param extraInfoUrl the extraInfoUrl value to set.
     * @return the TriggeredWebJobProperties object itself.
     */
    public TriggeredWebJobProperties withExtraInfoUrl(String extraInfoUrl) {
        this.extraInfoUrl = extraInfoUrl;
        return this;
    }

    /**
     * Get the webJobType property: Job type.
     * 
     * @return the webJobType value.
     */
    public WebJobType webJobType() {
        return this.webJobType;
    }

    /**
     * Set the webJobType property: Job type.
     * 
     * @param webJobType the webJobType value to set.
     * @return the TriggeredWebJobProperties object itself.
     */
    public TriggeredWebJobProperties withWebJobType(WebJobType webJobType) {
        this.webJobType = webJobType;
        return this;
    }

    /**
     * Get the error property: Error information.
     * 
     * @return the error value.
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error property: Error information.
     * 
     * @param error the error value to set.
     * @return the TriggeredWebJobProperties object itself.
     */
    public TriggeredWebJobProperties withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get the usingSdk property: Using SDK?.
     * 
     * @return the usingSdk value.
     */
    public Boolean usingSdk() {
        return this.usingSdk;
    }

    /**
     * Set the usingSdk property: Using SDK?.
     * 
     * @param usingSdk the usingSdk value to set.
     * @return the TriggeredWebJobProperties object itself.
     */
    public TriggeredWebJobProperties withUsingSdk(Boolean usingSdk) {
        this.usingSdk = usingSdk;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Property to allow or block all public traffic. Allowed Values: 'Enabled',
     * 'Disabled' or an empty string.
     * 
     * @return the publicNetworkAccess value.
     */
    public String publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Property to allow or block all public traffic. Allowed Values: 'Enabled',
     * 'Disabled' or an empty string.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the TriggeredWebJobProperties object itself.
     */
    public TriggeredWebJobProperties withPublicNetworkAccess(String publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the storageAccountRequired property: Checks if Customer provided storage account is required.
     * 
     * @return the storageAccountRequired value.
     */
    public Boolean storageAccountRequired() {
        return this.storageAccountRequired;
    }

    /**
     * Set the storageAccountRequired property: Checks if Customer provided storage account is required.
     * 
     * @param storageAccountRequired the storageAccountRequired value to set.
     * @return the TriggeredWebJobProperties object itself.
     */
    public TriggeredWebJobProperties withStorageAccountRequired(Boolean storageAccountRequired) {
        this.storageAccountRequired = storageAccountRequired;
        return this;
    }

    /**
     * Get the settings property: Job settings.
     * 
     * @return the settings value.
     */
    public Map<String, Object> settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Job settings.
     * 
     * @param settings the settings value to set.
     * @return the TriggeredWebJobProperties object itself.
     */
    public TriggeredWebJobProperties withSettings(Map<String, Object> settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (latestRun() != null) {
            latestRun().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("latest_run", this.latestRun);
        jsonWriter.writeStringField("history_url", this.historyUrl);
        jsonWriter.writeStringField("scheduler_logs_url", this.schedulerLogsUrl);
        jsonWriter.writeStringField("run_command", this.runCommand);
        jsonWriter.writeStringField("url", this.url);
        jsonWriter.writeStringField("extra_info_url", this.extraInfoUrl);
        jsonWriter.writeStringField("web_job_type", this.webJobType == null ? null : this.webJobType.toString());
        jsonWriter.writeStringField("error", this.error);
        jsonWriter.writeBooleanField("using_sdk", this.usingSdk);
        jsonWriter.writeStringField("publicNetworkAccess", this.publicNetworkAccess);
        jsonWriter.writeBooleanField("storageAccountRequired", this.storageAccountRequired);
        jsonWriter.writeMapField("settings", this.settings, (writer, element) -> writer.writeUntyped(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TriggeredWebJobProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TriggeredWebJobProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TriggeredWebJobProperties.
     */
    public static TriggeredWebJobProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TriggeredWebJobProperties deserializedTriggeredWebJobProperties = new TriggeredWebJobProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("latest_run".equals(fieldName)) {
                    deserializedTriggeredWebJobProperties.latestRun = TriggeredJobRun.fromJson(reader);
                } else if ("history_url".equals(fieldName)) {
                    deserializedTriggeredWebJobProperties.historyUrl = reader.getString();
                } else if ("scheduler_logs_url".equals(fieldName)) {
                    deserializedTriggeredWebJobProperties.schedulerLogsUrl = reader.getString();
                } else if ("run_command".equals(fieldName)) {
                    deserializedTriggeredWebJobProperties.runCommand = reader.getString();
                } else if ("url".equals(fieldName)) {
                    deserializedTriggeredWebJobProperties.url = reader.getString();
                } else if ("extra_info_url".equals(fieldName)) {
                    deserializedTriggeredWebJobProperties.extraInfoUrl = reader.getString();
                } else if ("web_job_type".equals(fieldName)) {
                    deserializedTriggeredWebJobProperties.webJobType = WebJobType.fromString(reader.getString());
                } else if ("error".equals(fieldName)) {
                    deserializedTriggeredWebJobProperties.error = reader.getString();
                } else if ("using_sdk".equals(fieldName)) {
                    deserializedTriggeredWebJobProperties.usingSdk = reader.getNullable(JsonReader::getBoolean);
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedTriggeredWebJobProperties.publicNetworkAccess = reader.getString();
                } else if ("storageAccountRequired".equals(fieldName)) {
                    deserializedTriggeredWebJobProperties.storageAccountRequired
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("settings".equals(fieldName)) {
                    Map<String, Object> settings = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedTriggeredWebJobProperties.settings = settings;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTriggeredWebJobProperties;
        });
    }
}
