// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes a storage profile.
 */
@Fluent
public final class ImageStorageProfile implements JsonSerializable<ImageStorageProfile> {
    /*
     * Specifies information about the operating system disk used by the virtual machine. <br><br> For more information
     * about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     */
    private ImageOSDisk osDisk;

    /*
     * Specifies the parameters that are used to add a data disk to a virtual machine. <br><br> For more information
     * about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     */
    private List<ImageDataDisk> dataDisks;

    /*
     * Specifies whether an image is zone resilient or not. Default is false. Zone resilient images can be created only
     * in regions that provide Zone Redundant Storage (ZRS).
     */
    private Boolean zoneResilient;

    /**
     * Creates an instance of ImageStorageProfile class.
     */
    public ImageStorageProfile() {
    }

    /**
     * Get the osDisk property: Specifies information about the operating system disk used by the virtual machine.
     * &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     * @return the osDisk value.
     */
    public ImageOSDisk osDisk() {
        return this.osDisk;
    }

    /**
     * Set the osDisk property: Specifies information about the operating system disk used by the virtual machine.
     * &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     * @param osDisk the osDisk value to set.
     * @return the ImageStorageProfile object itself.
     */
    public ImageStorageProfile withOsDisk(ImageOSDisk osDisk) {
        this.osDisk = osDisk;
        return this;
    }

    /**
     * Get the dataDisks property: Specifies the parameters that are used to add a data disk to a virtual machine.
     * &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     * @return the dataDisks value.
     */
    public List<ImageDataDisk> dataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks property: Specifies the parameters that are used to add a data disk to a virtual machine.
     * &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     * @param dataDisks the dataDisks value to set.
     * @return the ImageStorageProfile object itself.
     */
    public ImageStorageProfile withDataDisks(List<ImageDataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Get the zoneResilient property: Specifies whether an image is zone resilient or not. Default is false. Zone
     * resilient images can be created only in regions that provide Zone Redundant Storage (ZRS).
     * 
     * @return the zoneResilient value.
     */
    public Boolean zoneResilient() {
        return this.zoneResilient;
    }

    /**
     * Set the zoneResilient property: Specifies whether an image is zone resilient or not. Default is false. Zone
     * resilient images can be created only in regions that provide Zone Redundant Storage (ZRS).
     * 
     * @param zoneResilient the zoneResilient value to set.
     * @return the ImageStorageProfile object itself.
     */
    public ImageStorageProfile withZoneResilient(Boolean zoneResilient) {
        this.zoneResilient = zoneResilient;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osDisk() != null) {
            osDisk().validate();
        }
        if (dataDisks() != null) {
            dataDisks().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("osDisk", this.osDisk);
        jsonWriter.writeArrayField("dataDisks", this.dataDisks, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("zoneResilient", this.zoneResilient);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageStorageProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageStorageProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ImageStorageProfile.
     */
    public static ImageStorageProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageStorageProfile deserializedImageStorageProfile = new ImageStorageProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("osDisk".equals(fieldName)) {
                    deserializedImageStorageProfile.osDisk = ImageOSDisk.fromJson(reader);
                } else if ("dataDisks".equals(fieldName)) {
                    List<ImageDataDisk> dataDisks = reader.readArray(reader1 -> ImageDataDisk.fromJson(reader1));
                    deserializedImageStorageProfile.dataDisks = dataDisks;
                } else if ("zoneResilient".equals(fieldName)) {
                    deserializedImageStorageProfile.zoneResilient = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImageStorageProfile;
        });
    }
}
