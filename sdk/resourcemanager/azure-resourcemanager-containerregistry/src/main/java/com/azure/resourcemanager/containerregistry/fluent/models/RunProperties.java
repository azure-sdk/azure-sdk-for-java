// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerregistry.models.AgentProperties;
import com.azure.resourcemanager.containerregistry.models.ImageDescriptor;
import com.azure.resourcemanager.containerregistry.models.ImageUpdateTrigger;
import com.azure.resourcemanager.containerregistry.models.PlatformProperties;
import com.azure.resourcemanager.containerregistry.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.models.RunStatus;
import com.azure.resourcemanager.containerregistry.models.RunType;
import com.azure.resourcemanager.containerregistry.models.SourceTriggerDescriptor;
import com.azure.resourcemanager.containerregistry.models.TimerTriggerDescriptor;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * The properties for a run.
 */
@Fluent
public final class RunProperties implements JsonSerializable<RunProperties> {
    /*
     * The unique identifier for the run.
     */
    private String runId;

    /*
     * The current status of the run.
     */
    private RunStatus status;

    /*
     * The last updated time for the run.
     */
    private OffsetDateTime lastUpdatedTime;

    /*
     * The type of run.
     */
    private RunType runType;

    /*
     * The dedicated agent pool for the run.
     */
    private String agentPoolName;

    /*
     * The time the run was scheduled.
     */
    private OffsetDateTime createTime;

    /*
     * The time the run started.
     */
    private OffsetDateTime startTime;

    /*
     * The time the run finished.
     */
    private OffsetDateTime finishTime;

    /*
     * The list of all images that were generated from the run. This is applicable if the run generates base image
     * dependencies.
     */
    private List<ImageDescriptor> outputImages;

    /*
     * The task against which run was scheduled.
     */
    private String task;

    /*
     * The image update trigger that caused the run. This is applicable if the task has base image trigger configured.
     */
    private ImageUpdateTrigger imageUpdateTrigger;

    /*
     * The source trigger that caused the run.
     */
    private SourceTriggerDescriptor sourceTrigger;

    /*
     * The timer trigger that caused the run.
     */
    private TimerTriggerDescriptor timerTrigger;

    /*
     * The platform properties against which the run will happen.
     */
    private PlatformProperties platform;

    /*
     * The machine configuration of the run agent.
     */
    private AgentProperties agentConfiguration;

    /*
     * The scope of the credentials that were used to login to the source registry during this run.
     */
    private String sourceRegistryAuth;

    /*
     * The list of custom registries that were logged in during this run.
     */
    private List<String> customRegistries;

    /*
     * The error message received from backend systems after the run is scheduled.
     */
    private String runErrorMessage;

    /*
     * The update trigger token passed for the Run.
     */
    private String updateTriggerToken;

    /*
     * The image description for the log artifact.
     */
    private ImageDescriptor logArtifact;

    /*
     * The provisioning state of a run.
     */
    private ProvisioningState provisioningState;

    /*
     * The value that indicates whether archiving is enabled or not.
     */
    private Boolean isArchiveEnabled;

    /**
     * Creates an instance of RunProperties class.
     */
    public RunProperties() {
    }

    /**
     * Get the runId property: The unique identifier for the run.
     * 
     * @return the runId value.
     */
    public String runId() {
        return this.runId;
    }

    /**
     * Set the runId property: The unique identifier for the run.
     * 
     * @param runId the runId value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get the status property: The current status of the run.
     * 
     * @return the status value.
     */
    public RunStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The current status of the run.
     * 
     * @param status the status value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withStatus(RunStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the lastUpdatedTime property: The last updated time for the run.
     * 
     * @return the lastUpdatedTime value.
     */
    public OffsetDateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Set the lastUpdatedTime property: The last updated time for the run.
     * 
     * @param lastUpdatedTime the lastUpdatedTime value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withLastUpdatedTime(OffsetDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * Get the runType property: The type of run.
     * 
     * @return the runType value.
     */
    public RunType runType() {
        return this.runType;
    }

    /**
     * Set the runType property: The type of run.
     * 
     * @param runType the runType value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withRunType(RunType runType) {
        this.runType = runType;
        return this;
    }

    /**
     * Get the agentPoolName property: The dedicated agent pool for the run.
     * 
     * @return the agentPoolName value.
     */
    public String agentPoolName() {
        return this.agentPoolName;
    }

    /**
     * Set the agentPoolName property: The dedicated agent pool for the run.
     * 
     * @param agentPoolName the agentPoolName value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withAgentPoolName(String agentPoolName) {
        this.agentPoolName = agentPoolName;
        return this;
    }

    /**
     * Get the createTime property: The time the run was scheduled.
     * 
     * @return the createTime value.
     */
    public OffsetDateTime createTime() {
        return this.createTime;
    }

    /**
     * Set the createTime property: The time the run was scheduled.
     * 
     * @param createTime the createTime value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get the startTime property: The time the run started.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The time the run started.
     * 
     * @param startTime the startTime value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the finishTime property: The time the run finished.
     * 
     * @return the finishTime value.
     */
    public OffsetDateTime finishTime() {
        return this.finishTime;
    }

    /**
     * Set the finishTime property: The time the run finished.
     * 
     * @param finishTime the finishTime value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * Get the outputImages property: The list of all images that were generated from the run. This is applicable if the
     * run generates base image dependencies.
     * 
     * @return the outputImages value.
     */
    public List<ImageDescriptor> outputImages() {
        return this.outputImages;
    }

    /**
     * Set the outputImages property: The list of all images that were generated from the run. This is applicable if the
     * run generates base image dependencies.
     * 
     * @param outputImages the outputImages value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withOutputImages(List<ImageDescriptor> outputImages) {
        this.outputImages = outputImages;
        return this;
    }

    /**
     * Get the task property: The task against which run was scheduled.
     * 
     * @return the task value.
     */
    public String task() {
        return this.task;
    }

    /**
     * Set the task property: The task against which run was scheduled.
     * 
     * @param task the task value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withTask(String task) {
        this.task = task;
        return this;
    }

    /**
     * Get the imageUpdateTrigger property: The image update trigger that caused the run. This is applicable if the task
     * has base image trigger configured.
     * 
     * @return the imageUpdateTrigger value.
     */
    public ImageUpdateTrigger imageUpdateTrigger() {
        return this.imageUpdateTrigger;
    }

    /**
     * Set the imageUpdateTrigger property: The image update trigger that caused the run. This is applicable if the task
     * has base image trigger configured.
     * 
     * @param imageUpdateTrigger the imageUpdateTrigger value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withImageUpdateTrigger(ImageUpdateTrigger imageUpdateTrigger) {
        this.imageUpdateTrigger = imageUpdateTrigger;
        return this;
    }

    /**
     * Get the sourceTrigger property: The source trigger that caused the run.
     * 
     * @return the sourceTrigger value.
     */
    public SourceTriggerDescriptor sourceTrigger() {
        return this.sourceTrigger;
    }

    /**
     * Set the sourceTrigger property: The source trigger that caused the run.
     * 
     * @param sourceTrigger the sourceTrigger value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withSourceTrigger(SourceTriggerDescriptor sourceTrigger) {
        this.sourceTrigger = sourceTrigger;
        return this;
    }

    /**
     * Get the timerTrigger property: The timer trigger that caused the run.
     * 
     * @return the timerTrigger value.
     */
    public TimerTriggerDescriptor timerTrigger() {
        return this.timerTrigger;
    }

    /**
     * Set the timerTrigger property: The timer trigger that caused the run.
     * 
     * @param timerTrigger the timerTrigger value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withTimerTrigger(TimerTriggerDescriptor timerTrigger) {
        this.timerTrigger = timerTrigger;
        return this;
    }

    /**
     * Get the platform property: The platform properties against which the run will happen.
     * 
     * @return the platform value.
     */
    public PlatformProperties platform() {
        return this.platform;
    }

    /**
     * Set the platform property: The platform properties against which the run will happen.
     * 
     * @param platform the platform value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withPlatform(PlatformProperties platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the agentConfiguration property: The machine configuration of the run agent.
     * 
     * @return the agentConfiguration value.
     */
    public AgentProperties agentConfiguration() {
        return this.agentConfiguration;
    }

    /**
     * Set the agentConfiguration property: The machine configuration of the run agent.
     * 
     * @param agentConfiguration the agentConfiguration value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withAgentConfiguration(AgentProperties agentConfiguration) {
        this.agentConfiguration = agentConfiguration;
        return this;
    }

    /**
     * Get the sourceRegistryAuth property: The scope of the credentials that were used to login to the source registry
     * during this run.
     * 
     * @return the sourceRegistryAuth value.
     */
    public String sourceRegistryAuth() {
        return this.sourceRegistryAuth;
    }

    /**
     * Set the sourceRegistryAuth property: The scope of the credentials that were used to login to the source registry
     * during this run.
     * 
     * @param sourceRegistryAuth the sourceRegistryAuth value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withSourceRegistryAuth(String sourceRegistryAuth) {
        this.sourceRegistryAuth = sourceRegistryAuth;
        return this;
    }

    /**
     * Get the customRegistries property: The list of custom registries that were logged in during this run.
     * 
     * @return the customRegistries value.
     */
    public List<String> customRegistries() {
        return this.customRegistries;
    }

    /**
     * Set the customRegistries property: The list of custom registries that were logged in during this run.
     * 
     * @param customRegistries the customRegistries value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withCustomRegistries(List<String> customRegistries) {
        this.customRegistries = customRegistries;
        return this;
    }

    /**
     * Get the runErrorMessage property: The error message received from backend systems after the run is scheduled.
     * 
     * @return the runErrorMessage value.
     */
    public String runErrorMessage() {
        return this.runErrorMessage;
    }

    /**
     * Get the updateTriggerToken property: The update trigger token passed for the Run.
     * 
     * @return the updateTriggerToken value.
     */
    public String updateTriggerToken() {
        return this.updateTriggerToken;
    }

    /**
     * Set the updateTriggerToken property: The update trigger token passed for the Run.
     * 
     * @param updateTriggerToken the updateTriggerToken value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withUpdateTriggerToken(String updateTriggerToken) {
        this.updateTriggerToken = updateTriggerToken;
        return this;
    }

    /**
     * Get the logArtifact property: The image description for the log artifact.
     * 
     * @return the logArtifact value.
     */
    public ImageDescriptor logArtifact() {
        return this.logArtifact;
    }

    /**
     * Get the provisioningState property: The provisioning state of a run.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of a run.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the isArchiveEnabled property: The value that indicates whether archiving is enabled or not.
     * 
     * @return the isArchiveEnabled value.
     */
    public Boolean isArchiveEnabled() {
        return this.isArchiveEnabled;
    }

    /**
     * Set the isArchiveEnabled property: The value that indicates whether archiving is enabled or not.
     * 
     * @param isArchiveEnabled the isArchiveEnabled value to set.
     * @return the RunProperties object itself.
     */
    public RunProperties withIsArchiveEnabled(Boolean isArchiveEnabled) {
        this.isArchiveEnabled = isArchiveEnabled;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (outputImages() != null) {
            outputImages().forEach(e -> e.validate());
        }
        if (imageUpdateTrigger() != null) {
            imageUpdateTrigger().validate();
        }
        if (sourceTrigger() != null) {
            sourceTrigger().validate();
        }
        if (timerTrigger() != null) {
            timerTrigger().validate();
        }
        if (platform() != null) {
            platform().validate();
        }
        if (agentConfiguration() != null) {
            agentConfiguration().validate();
        }
        if (logArtifact() != null) {
            logArtifact().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("runId", this.runId);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("lastUpdatedTime",
            this.lastUpdatedTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastUpdatedTime));
        jsonWriter.writeStringField("runType", this.runType == null ? null : this.runType.toString());
        jsonWriter.writeStringField("agentPoolName", this.agentPoolName);
        jsonWriter.writeStringField("createTime",
            this.createTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createTime));
        jsonWriter.writeStringField("startTime",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        jsonWriter.writeStringField("finishTime",
            this.finishTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.finishTime));
        jsonWriter.writeArrayField("outputImages", this.outputImages, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("task", this.task);
        jsonWriter.writeJsonField("imageUpdateTrigger", this.imageUpdateTrigger);
        jsonWriter.writeJsonField("sourceTrigger", this.sourceTrigger);
        jsonWriter.writeJsonField("timerTrigger", this.timerTrigger);
        jsonWriter.writeJsonField("platform", this.platform);
        jsonWriter.writeJsonField("agentConfiguration", this.agentConfiguration);
        jsonWriter.writeStringField("sourceRegistryAuth", this.sourceRegistryAuth);
        jsonWriter.writeArrayField("customRegistries", this.customRegistries,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("updateTriggerToken", this.updateTriggerToken);
        jsonWriter.writeStringField("provisioningState",
            this.provisioningState == null ? null : this.provisioningState.toString());
        jsonWriter.writeBooleanField("isArchiveEnabled", this.isArchiveEnabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RunProperties.
     */
    public static RunProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunProperties deserializedRunProperties = new RunProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("runId".equals(fieldName)) {
                    deserializedRunProperties.runId = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedRunProperties.status = RunStatus.fromString(reader.getString());
                } else if ("lastUpdatedTime".equals(fieldName)) {
                    deserializedRunProperties.lastUpdatedTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("runType".equals(fieldName)) {
                    deserializedRunProperties.runType = RunType.fromString(reader.getString());
                } else if ("agentPoolName".equals(fieldName)) {
                    deserializedRunProperties.agentPoolName = reader.getString();
                } else if ("createTime".equals(fieldName)) {
                    deserializedRunProperties.createTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("startTime".equals(fieldName)) {
                    deserializedRunProperties.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("finishTime".equals(fieldName)) {
                    deserializedRunProperties.finishTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("outputImages".equals(fieldName)) {
                    List<ImageDescriptor> outputImages = reader.readArray(reader1 -> ImageDescriptor.fromJson(reader1));
                    deserializedRunProperties.outputImages = outputImages;
                } else if ("task".equals(fieldName)) {
                    deserializedRunProperties.task = reader.getString();
                } else if ("imageUpdateTrigger".equals(fieldName)) {
                    deserializedRunProperties.imageUpdateTrigger = ImageUpdateTrigger.fromJson(reader);
                } else if ("sourceTrigger".equals(fieldName)) {
                    deserializedRunProperties.sourceTrigger = SourceTriggerDescriptor.fromJson(reader);
                } else if ("timerTrigger".equals(fieldName)) {
                    deserializedRunProperties.timerTrigger = TimerTriggerDescriptor.fromJson(reader);
                } else if ("platform".equals(fieldName)) {
                    deserializedRunProperties.platform = PlatformProperties.fromJson(reader);
                } else if ("agentConfiguration".equals(fieldName)) {
                    deserializedRunProperties.agentConfiguration = AgentProperties.fromJson(reader);
                } else if ("sourceRegistryAuth".equals(fieldName)) {
                    deserializedRunProperties.sourceRegistryAuth = reader.getString();
                } else if ("customRegistries".equals(fieldName)) {
                    List<String> customRegistries = reader.readArray(reader1 -> reader1.getString());
                    deserializedRunProperties.customRegistries = customRegistries;
                } else if ("runErrorMessage".equals(fieldName)) {
                    deserializedRunProperties.runErrorMessage = reader.getString();
                } else if ("updateTriggerToken".equals(fieldName)) {
                    deserializedRunProperties.updateTriggerToken = reader.getString();
                } else if ("logArtifact".equals(fieldName)) {
                    deserializedRunProperties.logArtifact = ImageDescriptor.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedRunProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else if ("isArchiveEnabled".equals(fieldName)) {
                    deserializedRunProperties.isArchiveEnabled = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRunProperties;
        });
    }
}
