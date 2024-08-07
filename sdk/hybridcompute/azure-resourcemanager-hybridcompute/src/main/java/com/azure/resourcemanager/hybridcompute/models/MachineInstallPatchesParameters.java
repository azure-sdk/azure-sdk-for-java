// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * Input for InstallPatches as directly received by the API.
 */
@Fluent
public final class MachineInstallPatchesParameters implements JsonSerializable<MachineInstallPatchesParameters> {
    /*
     * Specifies the maximum amount of time that the operation will run. It must be an ISO 8601-compliant duration
     * string such as PT4H (4 hours)
     */
    private Duration maximumDuration;

    /*
     * Defines when it is acceptable to reboot a VM during a software update operation.
     */
    private VMGuestPatchRebootSetting rebootSetting;

    /*
     * Input for InstallPatches on a Windows VM, as directly received by the API
     */
    private WindowsParameters windowsParameters;

    /*
     * Input for InstallPatches on a Linux VM, as directly received by the API
     */
    private LinuxParameters linuxParameters;

    /**
     * Creates an instance of MachineInstallPatchesParameters class.
     */
    public MachineInstallPatchesParameters() {
    }

    /**
     * Get the maximumDuration property: Specifies the maximum amount of time that the operation will run. It must be an
     * ISO 8601-compliant duration string such as PT4H (4 hours).
     * 
     * @return the maximumDuration value.
     */
    public Duration maximumDuration() {
        return this.maximumDuration;
    }

    /**
     * Set the maximumDuration property: Specifies the maximum amount of time that the operation will run. It must be an
     * ISO 8601-compliant duration string such as PT4H (4 hours).
     * 
     * @param maximumDuration the maximumDuration value to set.
     * @return the MachineInstallPatchesParameters object itself.
     */
    public MachineInstallPatchesParameters withMaximumDuration(Duration maximumDuration) {
        this.maximumDuration = maximumDuration;
        return this;
    }

    /**
     * Get the rebootSetting property: Defines when it is acceptable to reboot a VM during a software update operation.
     * 
     * @return the rebootSetting value.
     */
    public VMGuestPatchRebootSetting rebootSetting() {
        return this.rebootSetting;
    }

    /**
     * Set the rebootSetting property: Defines when it is acceptable to reboot a VM during a software update operation.
     * 
     * @param rebootSetting the rebootSetting value to set.
     * @return the MachineInstallPatchesParameters object itself.
     */
    public MachineInstallPatchesParameters withRebootSetting(VMGuestPatchRebootSetting rebootSetting) {
        this.rebootSetting = rebootSetting;
        return this;
    }

    /**
     * Get the windowsParameters property: Input for InstallPatches on a Windows VM, as directly received by the API.
     * 
     * @return the windowsParameters value.
     */
    public WindowsParameters windowsParameters() {
        return this.windowsParameters;
    }

    /**
     * Set the windowsParameters property: Input for InstallPatches on a Windows VM, as directly received by the API.
     * 
     * @param windowsParameters the windowsParameters value to set.
     * @return the MachineInstallPatchesParameters object itself.
     */
    public MachineInstallPatchesParameters withWindowsParameters(WindowsParameters windowsParameters) {
        this.windowsParameters = windowsParameters;
        return this;
    }

    /**
     * Get the linuxParameters property: Input for InstallPatches on a Linux VM, as directly received by the API.
     * 
     * @return the linuxParameters value.
     */
    public LinuxParameters linuxParameters() {
        return this.linuxParameters;
    }

    /**
     * Set the linuxParameters property: Input for InstallPatches on a Linux VM, as directly received by the API.
     * 
     * @param linuxParameters the linuxParameters value to set.
     * @return the MachineInstallPatchesParameters object itself.
     */
    public MachineInstallPatchesParameters withLinuxParameters(LinuxParameters linuxParameters) {
        this.linuxParameters = linuxParameters;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (maximumDuration() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property maximumDuration in model MachineInstallPatchesParameters"));
        }
        if (rebootSetting() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property rebootSetting in model MachineInstallPatchesParameters"));
        }
        if (windowsParameters() != null) {
            windowsParameters().validate();
        }
        if (linuxParameters() != null) {
            linuxParameters().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MachineInstallPatchesParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("maximumDuration", CoreUtils.durationToStringWithDays(this.maximumDuration));
        jsonWriter.writeStringField("rebootSetting", this.rebootSetting == null ? null : this.rebootSetting.toString());
        jsonWriter.writeJsonField("windowsParameters", this.windowsParameters);
        jsonWriter.writeJsonField("linuxParameters", this.linuxParameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MachineInstallPatchesParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MachineInstallPatchesParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MachineInstallPatchesParameters.
     */
    public static MachineInstallPatchesParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MachineInstallPatchesParameters deserializedMachineInstallPatchesParameters
                = new MachineInstallPatchesParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maximumDuration".equals(fieldName)) {
                    deserializedMachineInstallPatchesParameters.maximumDuration
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("rebootSetting".equals(fieldName)) {
                    deserializedMachineInstallPatchesParameters.rebootSetting
                        = VMGuestPatchRebootSetting.fromString(reader.getString());
                } else if ("windowsParameters".equals(fieldName)) {
                    deserializedMachineInstallPatchesParameters.windowsParameters = WindowsParameters.fromJson(reader);
                } else if ("linuxParameters".equals(fieldName)) {
                    deserializedMachineInstallPatchesParameters.linuxParameters = LinuxParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMachineInstallPatchesParameters;
        });
    }
}
