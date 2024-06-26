// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Flink cluster profile.
 */
@Fluent
public final class FlinkProfile {
    /*
     * The storage profile
     */
    @JsonProperty(value = "storage", required = true)
    private FlinkStorageProfile storage;

    /*
     * The number of task managers.
     */
    @JsonProperty(value = "numReplicas")
    private Integer numReplicas;

    /*
     * Job Manager container/ process CPU and memory requirements
     */
    @JsonProperty(value = "jobManager", required = true)
    private ComputeResourceDefinition jobManager;

    /*
     * History Server container/ process CPU and memory requirements
     */
    @JsonProperty(value = "historyServer")
    private ComputeResourceDefinition historyServer;

    /*
     * Task Manager container/ process CPU and memory requirements
     */
    @JsonProperty(value = "taskManager", required = true)
    private ComputeResourceDefinition taskManager;

    /*
     * Flink cluster catalog options.
     */
    @JsonProperty(value = "catalogOptions")
    private FlinkCatalogOptions catalogOptions;

    /*
     * A string property that indicates the deployment mode of Flink cluster. It can have one of the following enum
     * values => Application, Session. Default value is Session
     */
    @JsonProperty(value = "deploymentMode")
    private DeploymentMode deploymentMode;

    /*
     * Job specifications for flink clusters in application deployment mode. The specification is immutable even if job
     * properties are changed by calling the RunJob API, please use the ListJob API to get the latest job information.
     */
    @JsonProperty(value = "jobSpec")
    private FlinkJobProfile jobSpec;

    /**
     * Creates an instance of FlinkProfile class.
     */
    public FlinkProfile() {
    }

    /**
     * Get the storage property: The storage profile.
     * 
     * @return the storage value.
     */
    public FlinkStorageProfile storage() {
        return this.storage;
    }

    /**
     * Set the storage property: The storage profile.
     * 
     * @param storage the storage value to set.
     * @return the FlinkProfile object itself.
     */
    public FlinkProfile withStorage(FlinkStorageProfile storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Get the numReplicas property: The number of task managers.
     * 
     * @return the numReplicas value.
     */
    public Integer numReplicas() {
        return this.numReplicas;
    }

    /**
     * Set the numReplicas property: The number of task managers.
     * 
     * @param numReplicas the numReplicas value to set.
     * @return the FlinkProfile object itself.
     */
    public FlinkProfile withNumReplicas(Integer numReplicas) {
        this.numReplicas = numReplicas;
        return this;
    }

    /**
     * Get the jobManager property: Job Manager container/ process CPU and memory requirements.
     * 
     * @return the jobManager value.
     */
    public ComputeResourceDefinition jobManager() {
        return this.jobManager;
    }

    /**
     * Set the jobManager property: Job Manager container/ process CPU and memory requirements.
     * 
     * @param jobManager the jobManager value to set.
     * @return the FlinkProfile object itself.
     */
    public FlinkProfile withJobManager(ComputeResourceDefinition jobManager) {
        this.jobManager = jobManager;
        return this;
    }

    /**
     * Get the historyServer property: History Server container/ process CPU and memory requirements.
     * 
     * @return the historyServer value.
     */
    public ComputeResourceDefinition historyServer() {
        return this.historyServer;
    }

    /**
     * Set the historyServer property: History Server container/ process CPU and memory requirements.
     * 
     * @param historyServer the historyServer value to set.
     * @return the FlinkProfile object itself.
     */
    public FlinkProfile withHistoryServer(ComputeResourceDefinition historyServer) {
        this.historyServer = historyServer;
        return this;
    }

    /**
     * Get the taskManager property: Task Manager container/ process CPU and memory requirements.
     * 
     * @return the taskManager value.
     */
    public ComputeResourceDefinition taskManager() {
        return this.taskManager;
    }

    /**
     * Set the taskManager property: Task Manager container/ process CPU and memory requirements.
     * 
     * @param taskManager the taskManager value to set.
     * @return the FlinkProfile object itself.
     */
    public FlinkProfile withTaskManager(ComputeResourceDefinition taskManager) {
        this.taskManager = taskManager;
        return this;
    }

    /**
     * Get the catalogOptions property: Flink cluster catalog options.
     * 
     * @return the catalogOptions value.
     */
    public FlinkCatalogOptions catalogOptions() {
        return this.catalogOptions;
    }

    /**
     * Set the catalogOptions property: Flink cluster catalog options.
     * 
     * @param catalogOptions the catalogOptions value to set.
     * @return the FlinkProfile object itself.
     */
    public FlinkProfile withCatalogOptions(FlinkCatalogOptions catalogOptions) {
        this.catalogOptions = catalogOptions;
        return this;
    }

    /**
     * Get the deploymentMode property: A string property that indicates the deployment mode of Flink cluster. It can
     * have one of the following enum values =&gt; Application, Session. Default value is Session.
     * 
     * @return the deploymentMode value.
     */
    public DeploymentMode deploymentMode() {
        return this.deploymentMode;
    }

    /**
     * Set the deploymentMode property: A string property that indicates the deployment mode of Flink cluster. It can
     * have one of the following enum values =&gt; Application, Session. Default value is Session.
     * 
     * @param deploymentMode the deploymentMode value to set.
     * @return the FlinkProfile object itself.
     */
    public FlinkProfile withDeploymentMode(DeploymentMode deploymentMode) {
        this.deploymentMode = deploymentMode;
        return this;
    }

    /**
     * Get the jobSpec property: Job specifications for flink clusters in application deployment mode. The
     * specification is immutable even if job properties are changed by calling the RunJob API, please use the ListJob
     * API to get the latest job information.
     * 
     * @return the jobSpec value.
     */
    public FlinkJobProfile jobSpec() {
        return this.jobSpec;
    }

    /**
     * Set the jobSpec property: Job specifications for flink clusters in application deployment mode. The
     * specification is immutable even if job properties are changed by calling the RunJob API, please use the ListJob
     * API to get the latest job information.
     * 
     * @param jobSpec the jobSpec value to set.
     * @return the FlinkProfile object itself.
     */
    public FlinkProfile withJobSpec(FlinkJobProfile jobSpec) {
        this.jobSpec = jobSpec;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storage() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property storage in model FlinkProfile"));
        } else {
            storage().validate();
        }
        if (jobManager() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property jobManager in model FlinkProfile"));
        } else {
            jobManager().validate();
        }
        if (historyServer() != null) {
            historyServer().validate();
        }
        if (taskManager() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property taskManager in model FlinkProfile"));
        } else {
            taskManager().validate();
        }
        if (catalogOptions() != null) {
            catalogOptions().validate();
        }
        if (jobSpec() != null) {
            jobSpec().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FlinkProfile.class);
}
