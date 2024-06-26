// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Microsoft Fabric Warehouse sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = WarehouseSink.class, visible = true)
@JsonTypeName("WarehouseSink")
@Fluent
public final class WarehouseSink extends CopySink {
    /*
     * Copy sink type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "WarehouseSink";

    /*
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /*
     * Indicates to use Copy Command to copy data into SQL Data Warehouse. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "allowCopyCommand")
    private Object allowCopyCommand;

    /*
     * Specifies Copy Command related settings when allowCopyCommand is true.
     */
    @JsonProperty(value = "copyCommandSettings")
    private DWCopyCommandSettings copyCommandSettings;

    /*
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "tableOption")
    private Object tableOption;

    /*
     * Write behavior when copying data into azure Microsoft Fabric Data Warehouse. Type: DWWriteBehaviorEnum (or
     * Expression with resultType DWWriteBehaviorEnum)
     */
    @JsonProperty(value = "writeBehavior")
    private Object writeBehavior;

    /**
     * Creates an instance of WarehouseSink class.
     */
    public WarehouseSink() {
    }

    /**
     * Get the type property: Copy sink type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     * @return the preCopyScript value.
     */
    public Object preCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     * @param preCopyScript the preCopyScript value to set.
     * @return the WarehouseSink object itself.
     */
    public WarehouseSink withPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /**
     * Get the allowCopyCommand property: Indicates to use Copy Command to copy data into SQL Data Warehouse. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the allowCopyCommand value.
     */
    public Object allowCopyCommand() {
        return this.allowCopyCommand;
    }

    /**
     * Set the allowCopyCommand property: Indicates to use Copy Command to copy data into SQL Data Warehouse. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param allowCopyCommand the allowCopyCommand value to set.
     * @return the WarehouseSink object itself.
     */
    public WarehouseSink withAllowCopyCommand(Object allowCopyCommand) {
        this.allowCopyCommand = allowCopyCommand;
        return this;
    }

    /**
     * Get the copyCommandSettings property: Specifies Copy Command related settings when allowCopyCommand is true.
     * 
     * @return the copyCommandSettings value.
     */
    public DWCopyCommandSettings copyCommandSettings() {
        return this.copyCommandSettings;
    }

    /**
     * Set the copyCommandSettings property: Specifies Copy Command related settings when allowCopyCommand is true.
     * 
     * @param copyCommandSettings the copyCommandSettings value to set.
     * @return the WarehouseSink object itself.
     */
    public WarehouseSink withCopyCommandSettings(DWCopyCommandSettings copyCommandSettings) {
        this.copyCommandSettings = copyCommandSettings;
        return this;
    }

    /**
     * Get the tableOption property: The option to handle sink table, such as autoCreate. For now only 'autoCreate'
     * value is supported. Type: string (or Expression with resultType string).
     * 
     * @return the tableOption value.
     */
    public Object tableOption() {
        return this.tableOption;
    }

    /**
     * Set the tableOption property: The option to handle sink table, such as autoCreate. For now only 'autoCreate'
     * value is supported. Type: string (or Expression with resultType string).
     * 
     * @param tableOption the tableOption value to set.
     * @return the WarehouseSink object itself.
     */
    public WarehouseSink withTableOption(Object tableOption) {
        this.tableOption = tableOption;
        return this;
    }

    /**
     * Get the writeBehavior property: Write behavior when copying data into azure Microsoft Fabric Data Warehouse.
     * Type: DWWriteBehaviorEnum (or Expression with resultType DWWriteBehaviorEnum).
     * 
     * @return the writeBehavior value.
     */
    public Object writeBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: Write behavior when copying data into azure Microsoft Fabric Data Warehouse.
     * Type: DWWriteBehaviorEnum (or Expression with resultType DWWriteBehaviorEnum).
     * 
     * @param writeBehavior the writeBehavior value to set.
     * @return the WarehouseSink object itself.
     */
    public WarehouseSink withWriteBehavior(Object writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WarehouseSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WarehouseSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WarehouseSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WarehouseSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WarehouseSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WarehouseSink withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
        if (copyCommandSettings() != null) {
            copyCommandSettings().validate();
        }
    }
}
