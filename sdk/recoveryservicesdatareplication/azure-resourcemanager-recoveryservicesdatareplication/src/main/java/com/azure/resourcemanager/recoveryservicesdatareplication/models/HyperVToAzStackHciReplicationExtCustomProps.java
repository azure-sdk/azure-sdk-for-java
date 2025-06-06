// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * HyperV to AzStackHCI Replication extension model custom properties.
 */
@Fluent
public final class HyperVToAzStackHciReplicationExtCustomProps extends ReplicationExtensionModelCustomProperties {
    /*
     * Discriminator property for ReplicationExtensionModelCustomProperties.
     */
    private String instanceType = "HyperVToAzStackHCI";

    /*
     * Gets or sets the ARM Id of the source HyperV fabric.
     */
    private String hyperVFabricArmId;

    /*
     * Gets or sets the ARM Id of the HyperV site.
     */
    private String hyperVSiteId;

    /*
     * Gets or sets the ARM Id of the target AzStackHCI fabric.
     */
    private String azStackHciFabricArmId;

    /*
     * Gets or sets the ARM Id of the AzStackHCI site.
     */
    private String azStackHciSiteId;

    /*
     * Gets or sets the storage account Id.
     */
    private String storageAccountId;

    /*
     * Gets or sets the Sas Secret of storage account.
     */
    private String storageAccountSasSecretName;

    /*
     * Gets or sets the Uri of ASR.
     */
    private String asrServiceUri;

    /*
     * Gets or sets the Uri of Rcm.
     */
    private String rcmServiceUri;

    /*
     * Gets or sets the Uri of Gateway.
     */
    private String gatewayServiceUri;

    /*
     * Gets or sets the gateway service Id of source.
     */
    private String sourceGatewayServiceId;

    /*
     * Gets or sets the gateway service Id of target.
     */
    private String targetGatewayServiceId;

    /*
     * Gets or sets the source storage container name.
     */
    private String sourceStorageContainerName;

    /*
     * Gets or sets the target storage container name.
     */
    private String targetStorageContainerName;

    /*
     * Gets or sets the resource location.
     */
    private String resourceLocation;

    /*
     * Gets or sets the subscription.
     */
    private String subscriptionId;

    /*
     * Gets or sets the resource group.
     */
    private String resourceGroup;

    /**
     * Creates an instance of HyperVToAzStackHciReplicationExtCustomProps class.
     */
    public HyperVToAzStackHciReplicationExtCustomProps() {
    }

    /**
     * Get the instanceType property: Discriminator property for ReplicationExtensionModelCustomProperties.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the hyperVFabricArmId property: Gets or sets the ARM Id of the source HyperV fabric.
     * 
     * @return the hyperVFabricArmId value.
     */
    public String hyperVFabricArmId() {
        return this.hyperVFabricArmId;
    }

    /**
     * Set the hyperVFabricArmId property: Gets or sets the ARM Id of the source HyperV fabric.
     * 
     * @param hyperVFabricArmId the hyperVFabricArmId value to set.
     * @return the HyperVToAzStackHciReplicationExtCustomProps object itself.
     */
    public HyperVToAzStackHciReplicationExtCustomProps withHyperVFabricArmId(String hyperVFabricArmId) {
        this.hyperVFabricArmId = hyperVFabricArmId;
        return this;
    }

    /**
     * Get the hyperVSiteId property: Gets or sets the ARM Id of the HyperV site.
     * 
     * @return the hyperVSiteId value.
     */
    public String hyperVSiteId() {
        return this.hyperVSiteId;
    }

    /**
     * Get the azStackHciFabricArmId property: Gets or sets the ARM Id of the target AzStackHCI fabric.
     * 
     * @return the azStackHciFabricArmId value.
     */
    public String azStackHciFabricArmId() {
        return this.azStackHciFabricArmId;
    }

    /**
     * Set the azStackHciFabricArmId property: Gets or sets the ARM Id of the target AzStackHCI fabric.
     * 
     * @param azStackHciFabricArmId the azStackHciFabricArmId value to set.
     * @return the HyperVToAzStackHciReplicationExtCustomProps object itself.
     */
    public HyperVToAzStackHciReplicationExtCustomProps withAzStackHciFabricArmId(String azStackHciFabricArmId) {
        this.azStackHciFabricArmId = azStackHciFabricArmId;
        return this;
    }

    /**
     * Get the azStackHciSiteId property: Gets or sets the ARM Id of the AzStackHCI site.
     * 
     * @return the azStackHciSiteId value.
     */
    public String azStackHciSiteId() {
        return this.azStackHciSiteId;
    }

    /**
     * Get the storageAccountId property: Gets or sets the storage account Id.
     * 
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the storageAccountId property: Gets or sets the storage account Id.
     * 
     * @param storageAccountId the storageAccountId value to set.
     * @return the HyperVToAzStackHciReplicationExtCustomProps object itself.
     */
    public HyperVToAzStackHciReplicationExtCustomProps withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get the storageAccountSasSecretName property: Gets or sets the Sas Secret of storage account.
     * 
     * @return the storageAccountSasSecretName value.
     */
    public String storageAccountSasSecretName() {
        return this.storageAccountSasSecretName;
    }

    /**
     * Set the storageAccountSasSecretName property: Gets or sets the Sas Secret of storage account.
     * 
     * @param storageAccountSasSecretName the storageAccountSasSecretName value to set.
     * @return the HyperVToAzStackHciReplicationExtCustomProps object itself.
     */
    public HyperVToAzStackHciReplicationExtCustomProps
        withStorageAccountSasSecretName(String storageAccountSasSecretName) {
        this.storageAccountSasSecretName = storageAccountSasSecretName;
        return this;
    }

    /**
     * Get the asrServiceUri property: Gets or sets the Uri of ASR.
     * 
     * @return the asrServiceUri value.
     */
    public String asrServiceUri() {
        return this.asrServiceUri;
    }

    /**
     * Get the rcmServiceUri property: Gets or sets the Uri of Rcm.
     * 
     * @return the rcmServiceUri value.
     */
    public String rcmServiceUri() {
        return this.rcmServiceUri;
    }

    /**
     * Get the gatewayServiceUri property: Gets or sets the Uri of Gateway.
     * 
     * @return the gatewayServiceUri value.
     */
    public String gatewayServiceUri() {
        return this.gatewayServiceUri;
    }

    /**
     * Get the sourceGatewayServiceId property: Gets or sets the gateway service Id of source.
     * 
     * @return the sourceGatewayServiceId value.
     */
    public String sourceGatewayServiceId() {
        return this.sourceGatewayServiceId;
    }

    /**
     * Get the targetGatewayServiceId property: Gets or sets the gateway service Id of target.
     * 
     * @return the targetGatewayServiceId value.
     */
    public String targetGatewayServiceId() {
        return this.targetGatewayServiceId;
    }

    /**
     * Get the sourceStorageContainerName property: Gets or sets the source storage container name.
     * 
     * @return the sourceStorageContainerName value.
     */
    public String sourceStorageContainerName() {
        return this.sourceStorageContainerName;
    }

    /**
     * Get the targetStorageContainerName property: Gets or sets the target storage container name.
     * 
     * @return the targetStorageContainerName value.
     */
    public String targetStorageContainerName() {
        return this.targetStorageContainerName;
    }

    /**
     * Get the resourceLocation property: Gets or sets the resource location.
     * 
     * @return the resourceLocation value.
     */
    public String resourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Get the subscriptionId property: Gets or sets the subscription.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the resourceGroup property: Gets or sets the resource group.
     * 
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (hyperVFabricArmId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property hyperVFabricArmId in model HyperVToAzStackHciReplicationExtCustomProps"));
        }
        if (azStackHciFabricArmId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property azStackHciFabricArmId in model HyperVToAzStackHciReplicationExtCustomProps"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HyperVToAzStackHciReplicationExtCustomProps.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("hyperVFabricArmId", this.hyperVFabricArmId);
        jsonWriter.writeStringField("azStackHciFabricArmId", this.azStackHciFabricArmId);
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeStringField("storageAccountId", this.storageAccountId);
        jsonWriter.writeStringField("storageAccountSasSecretName", this.storageAccountSasSecretName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HyperVToAzStackHciReplicationExtCustomProps from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HyperVToAzStackHciReplicationExtCustomProps if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HyperVToAzStackHciReplicationExtCustomProps.
     */
    public static HyperVToAzStackHciReplicationExtCustomProps fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HyperVToAzStackHciReplicationExtCustomProps deserializedHyperVToAzStackHciReplicationExtCustomProps
                = new HyperVToAzStackHciReplicationExtCustomProps();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hyperVFabricArmId".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.hyperVFabricArmId = reader.getString();
                } else if ("azStackHciFabricArmId".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.azStackHciFabricArmId = reader.getString();
                } else if ("instanceType".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.instanceType = reader.getString();
                } else if ("hyperVSiteId".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.hyperVSiteId = reader.getString();
                } else if ("azStackHciSiteId".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.azStackHciSiteId = reader.getString();
                } else if ("storageAccountId".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.storageAccountId = reader.getString();
                } else if ("storageAccountSasSecretName".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.storageAccountSasSecretName
                        = reader.getString();
                } else if ("asrServiceUri".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.asrServiceUri = reader.getString();
                } else if ("rcmServiceUri".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.rcmServiceUri = reader.getString();
                } else if ("gatewayServiceUri".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.gatewayServiceUri = reader.getString();
                } else if ("sourceGatewayServiceId".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.sourceGatewayServiceId = reader.getString();
                } else if ("targetGatewayServiceId".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.targetGatewayServiceId = reader.getString();
                } else if ("sourceStorageContainerName".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.sourceStorageContainerName
                        = reader.getString();
                } else if ("targetStorageContainerName".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.targetStorageContainerName
                        = reader.getString();
                } else if ("resourceLocation".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.resourceLocation = reader.getString();
                } else if ("subscriptionId".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.subscriptionId = reader.getString();
                } else if ("resourceGroup".equals(fieldName)) {
                    deserializedHyperVToAzStackHciReplicationExtCustomProps.resourceGroup = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHyperVToAzStackHciReplicationExtCustomProps;
        });
    }
}
