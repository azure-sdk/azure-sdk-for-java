// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * AzureWorkload SQL-specific restore with integrated rehydration of recovery point.
 */
@Fluent
public final class AzureWorkloadSqlRestoreWithRehydrateRequest extends AzureWorkloadSqlRestoreRequest {
    /*
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of
     * types.
     */
    private String objectType = "AzureWorkloadSQLRestoreWithRehydrateRequest";

    /*
     * RP Rehydration Info
     */
    private RecoveryPointRehydrationInfo recoveryPointRehydrationInfo;

    /**
     * Creates an instance of AzureWorkloadSqlRestoreWithRehydrateRequest class.
     */
    public AzureWorkloadSqlRestoreWithRehydrateRequest() {
    }

    /**
     * Get the objectType property: This property will be used as the discriminator for deciding the specific types in
     * the polymorphic chain of types.
     * 
     * @return the objectType value.
     */
    @Override
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the recoveryPointRehydrationInfo property: RP Rehydration Info.
     * 
     * @return the recoveryPointRehydrationInfo value.
     */
    public RecoveryPointRehydrationInfo recoveryPointRehydrationInfo() {
        return this.recoveryPointRehydrationInfo;
    }

    /**
     * Set the recoveryPointRehydrationInfo property: RP Rehydration Info.
     * 
     * @param recoveryPointRehydrationInfo the recoveryPointRehydrationInfo value to set.
     * @return the AzureWorkloadSqlRestoreWithRehydrateRequest object itself.
     */
    public AzureWorkloadSqlRestoreWithRehydrateRequest
        withRecoveryPointRehydrationInfo(RecoveryPointRehydrationInfo recoveryPointRehydrationInfo) {
        this.recoveryPointRehydrationInfo = recoveryPointRehydrationInfo;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreWithRehydrateRequest
        withShouldUseAlternateTargetLocation(Boolean shouldUseAlternateTargetLocation) {
        super.withShouldUseAlternateTargetLocation(shouldUseAlternateTargetLocation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreWithRehydrateRequest withIsNonRecoverable(Boolean isNonRecoverable) {
        super.withIsNonRecoverable(isNonRecoverable);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreWithRehydrateRequest
        withAlternateDirectoryPaths(List<SqlDataDirectoryMapping> alternateDirectoryPaths) {
        super.withAlternateDirectoryPaths(alternateDirectoryPaths);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreWithRehydrateRequest withRecoveryType(RecoveryType recoveryType) {
        super.withRecoveryType(recoveryType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreWithRehydrateRequest withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreWithRehydrateRequest withPropertyBag(Map<String, String> propertyBag) {
        super.withPropertyBag(propertyBag);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreWithRehydrateRequest withTargetInfo(TargetRestoreInfo targetInfo) {
        super.withTargetInfo(targetInfo);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreWithRehydrateRequest withRecoveryMode(RecoveryMode recoveryMode) {
        super.withRecoveryMode(recoveryMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreWithRehydrateRequest withTargetResourceGroupName(String targetResourceGroupName) {
        super.withTargetResourceGroupName(targetResourceGroupName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreWithRehydrateRequest
        withUserAssignedManagedIdentityDetails(UserAssignedManagedIdentityDetails userAssignedManagedIdentityDetails) {
        super.withUserAssignedManagedIdentityDetails(userAssignedManagedIdentityDetails);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreWithRehydrateRequest
        withSnapshotRestoreParameters(SnapshotRestoreParameters snapshotRestoreParameters) {
        super.withSnapshotRestoreParameters(snapshotRestoreParameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreWithRehydrateRequest withTargetVirtualMachineId(String targetVirtualMachineId) {
        super.withTargetVirtualMachineId(targetVirtualMachineId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreWithRehydrateRequest
        withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        super.withResourceGuardOperationRequests(resourceGuardOperationRequests);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (recoveryPointRehydrationInfo() != null) {
            recoveryPointRehydrationInfo().validate();
        }
        if (targetInfo() != null) {
            targetInfo().validate();
        }
        if (userAssignedManagedIdentityDetails() != null) {
            userAssignedManagedIdentityDetails().validate();
        }
        if (snapshotRestoreParameters() != null) {
            snapshotRestoreParameters().validate();
        }
        if (alternateDirectoryPaths() != null) {
            alternateDirectoryPaths().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("resourceGuardOperationRequests", resourceGuardOperationRequests(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("recoveryType", recoveryType() == null ? null : recoveryType().toString());
        jsonWriter.writeStringField("sourceResourceId", sourceResourceId());
        jsonWriter.writeMapField("propertyBag", propertyBag(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("targetInfo", targetInfo());
        jsonWriter.writeStringField("recoveryMode", recoveryMode() == null ? null : recoveryMode().toString());
        jsonWriter.writeStringField("targetResourceGroupName", targetResourceGroupName());
        jsonWriter.writeJsonField("userAssignedManagedIdentityDetails", userAssignedManagedIdentityDetails());
        jsonWriter.writeJsonField("snapshotRestoreParameters", snapshotRestoreParameters());
        jsonWriter.writeStringField("targetVirtualMachineId", targetVirtualMachineId());
        jsonWriter.writeBooleanField("shouldUseAlternateTargetLocation", shouldUseAlternateTargetLocation());
        jsonWriter.writeBooleanField("isNonRecoverable", isNonRecoverable());
        jsonWriter.writeArrayField("alternateDirectoryPaths", alternateDirectoryPaths(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("objectType", this.objectType);
        jsonWriter.writeJsonField("recoveryPointRehydrationInfo", this.recoveryPointRehydrationInfo);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureWorkloadSqlRestoreWithRehydrateRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureWorkloadSqlRestoreWithRehydrateRequest if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureWorkloadSqlRestoreWithRehydrateRequest.
     */
    public static AzureWorkloadSqlRestoreWithRehydrateRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureWorkloadSqlRestoreWithRehydrateRequest deserializedAzureWorkloadSqlRestoreWithRehydrateRequest
                = new AzureWorkloadSqlRestoreWithRehydrateRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceGuardOperationRequests".equals(fieldName)) {
                    List<String> resourceGuardOperationRequests = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest
                        .withResourceGuardOperationRequests(resourceGuardOperationRequests);
                } else if ("recoveryType".equals(fieldName)) {
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest
                        .withRecoveryType(RecoveryType.fromString(reader.getString()));
                } else if ("sourceResourceId".equals(fieldName)) {
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest.withSourceResourceId(reader.getString());
                } else if ("propertyBag".equals(fieldName)) {
                    Map<String, String> propertyBag = reader.readMap(reader1 -> reader1.getString());
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest.withPropertyBag(propertyBag);
                } else if ("targetInfo".equals(fieldName)) {
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest
                        .withTargetInfo(TargetRestoreInfo.fromJson(reader));
                } else if ("recoveryMode".equals(fieldName)) {
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest
                        .withRecoveryMode(RecoveryMode.fromString(reader.getString()));
                } else if ("targetResourceGroupName".equals(fieldName)) {
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest
                        .withTargetResourceGroupName(reader.getString());
                } else if ("userAssignedManagedIdentityDetails".equals(fieldName)) {
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest
                        .withUserAssignedManagedIdentityDetails(UserAssignedManagedIdentityDetails.fromJson(reader));
                } else if ("snapshotRestoreParameters".equals(fieldName)) {
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest
                        .withSnapshotRestoreParameters(SnapshotRestoreParameters.fromJson(reader));
                } else if ("targetVirtualMachineId".equals(fieldName)) {
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest
                        .withTargetVirtualMachineId(reader.getString());
                } else if ("shouldUseAlternateTargetLocation".equals(fieldName)) {
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest
                        .withShouldUseAlternateTargetLocation(reader.getNullable(JsonReader::getBoolean));
                } else if ("isNonRecoverable".equals(fieldName)) {
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest
                        .withIsNonRecoverable(reader.getNullable(JsonReader::getBoolean));
                } else if ("alternateDirectoryPaths".equals(fieldName)) {
                    List<SqlDataDirectoryMapping> alternateDirectoryPaths
                        = reader.readArray(reader1 -> SqlDataDirectoryMapping.fromJson(reader1));
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest
                        .withAlternateDirectoryPaths(alternateDirectoryPaths);
                } else if ("objectType".equals(fieldName)) {
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest.objectType = reader.getString();
                } else if ("recoveryPointRehydrationInfo".equals(fieldName)) {
                    deserializedAzureWorkloadSqlRestoreWithRehydrateRequest.recoveryPointRehydrationInfo
                        = RecoveryPointRehydrationInfo.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureWorkloadSqlRestoreWithRehydrateRequest;
        });
    }
}
