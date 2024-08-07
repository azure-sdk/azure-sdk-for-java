// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Istio service mesh configuration.
 */
@Fluent
public final class IstioServiceMesh implements JsonSerializable<IstioServiceMesh> {
    /*
     * Istio components configuration.
     */
    private IstioComponents components;

    /*
     * Istio Service Mesh Certificate Authority (CA) configuration. For now, we only support plugin certificates as
     * described here https://aka.ms/asm-plugin-ca
     */
    private IstioCertificateAuthority certificateAuthority;

    /*
     * The list of revisions of the Istio control plane. When an upgrade is not in progress, this holds one value. When
     * canary upgrade is in progress, this can only hold two consecutive values. For more information, see:
     * https://learn.microsoft.com/en-us/azure/aks/istio-upgrade
     */
    private List<String> revisions;

    /**
     * Creates an instance of IstioServiceMesh class.
     */
    public IstioServiceMesh() {
    }

    /**
     * Get the components property: Istio components configuration.
     * 
     * @return the components value.
     */
    public IstioComponents components() {
        return this.components;
    }

    /**
     * Set the components property: Istio components configuration.
     * 
     * @param components the components value to set.
     * @return the IstioServiceMesh object itself.
     */
    public IstioServiceMesh withComponents(IstioComponents components) {
        this.components = components;
        return this;
    }

    /**
     * Get the certificateAuthority property: Istio Service Mesh Certificate Authority (CA) configuration. For now, we
     * only support plugin certificates as described here https://aka.ms/asm-plugin-ca.
     * 
     * @return the certificateAuthority value.
     */
    public IstioCertificateAuthority certificateAuthority() {
        return this.certificateAuthority;
    }

    /**
     * Set the certificateAuthority property: Istio Service Mesh Certificate Authority (CA) configuration. For now, we
     * only support plugin certificates as described here https://aka.ms/asm-plugin-ca.
     * 
     * @param certificateAuthority the certificateAuthority value to set.
     * @return the IstioServiceMesh object itself.
     */
    public IstioServiceMesh withCertificateAuthority(IstioCertificateAuthority certificateAuthority) {
        this.certificateAuthority = certificateAuthority;
        return this;
    }

    /**
     * Get the revisions property: The list of revisions of the Istio control plane. When an upgrade is not in progress,
     * this holds one value. When canary upgrade is in progress, this can only hold two consecutive values. For more
     * information, see: https://learn.microsoft.com/en-us/azure/aks/istio-upgrade.
     * 
     * @return the revisions value.
     */
    public List<String> revisions() {
        return this.revisions;
    }

    /**
     * Set the revisions property: The list of revisions of the Istio control plane. When an upgrade is not in progress,
     * this holds one value. When canary upgrade is in progress, this can only hold two consecutive values. For more
     * information, see: https://learn.microsoft.com/en-us/azure/aks/istio-upgrade.
     * 
     * @param revisions the revisions value to set.
     * @return the IstioServiceMesh object itself.
     */
    public IstioServiceMesh withRevisions(List<String> revisions) {
        this.revisions = revisions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (components() != null) {
            components().validate();
        }
        if (certificateAuthority() != null) {
            certificateAuthority().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("components", this.components);
        jsonWriter.writeJsonField("certificateAuthority", this.certificateAuthority);
        jsonWriter.writeArrayField("revisions", this.revisions, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IstioServiceMesh from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IstioServiceMesh if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IstioServiceMesh.
     */
    public static IstioServiceMesh fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IstioServiceMesh deserializedIstioServiceMesh = new IstioServiceMesh();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("components".equals(fieldName)) {
                    deserializedIstioServiceMesh.components = IstioComponents.fromJson(reader);
                } else if ("certificateAuthority".equals(fieldName)) {
                    deserializedIstioServiceMesh.certificateAuthority = IstioCertificateAuthority.fromJson(reader);
                } else if ("revisions".equals(fieldName)) {
                    List<String> revisions = reader.readArray(reader1 -> reader1.getString());
                    deserializedIstioServiceMesh.revisions = revisions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIstioServiceMesh;
        });
    }
}
