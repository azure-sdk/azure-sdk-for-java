// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.iothub.models.ArmIdentity;
import com.azure.resourcemanager.iothub.models.IotHubProperties;
import com.azure.resourcemanager.iothub.models.IotHubSkuInfo;
import java.io.IOException;
import java.util.Map;

/**
 * The description of the IoT hub.
 */
@Fluent
public final class IotHubDescriptionInner extends Resource {
    /*
     * The Etag field is *not* required. If it is provided in the response body, it must also be provided as a header
     * per the normal ETag convention.
     */
    private String etag;

    /*
     * IotHub properties
     */
    private IotHubProperties properties;

    /*
     * IotHub SKU info
     */
    private IotHubSkuInfo sku;

    /*
     * The managed identities for the IotHub.
     */
    private ArmIdentity identity;

    /*
     * The system meta data relating to this resource.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of IotHubDescriptionInner class.
     */
    public IotHubDescriptionInner() {
    }

    /**
     * Get the etag property: The Etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal ETag convention.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The Etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal ETag convention.
     * 
     * @param etag the etag value to set.
     * @return the IotHubDescriptionInner object itself.
     */
    public IotHubDescriptionInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the properties property: IotHub properties.
     * 
     * @return the properties value.
     */
    public IotHubProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: IotHub properties.
     * 
     * @param properties the properties value to set.
     * @return the IotHubDescriptionInner object itself.
     */
    public IotHubDescriptionInner withProperties(IotHubProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: IotHub SKU info.
     * 
     * @return the sku value.
     */
    public IotHubSkuInfo sku() {
        return this.sku;
    }

    /**
     * Set the sku property: IotHub SKU info.
     * 
     * @param sku the sku value to set.
     * @return the IotHubDescriptionInner object itself.
     */
    public IotHubDescriptionInner withSku(IotHubSkuInfo sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: The managed identities for the IotHub.
     * 
     * @return the identity value.
     */
    public ArmIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identities for the IotHub.
     * 
     * @param identity the identity value to set.
     * @return the IotHubDescriptionInner object itself.
     */
    public IotHubDescriptionInner withIdentity(ArmIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IotHubDescriptionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IotHubDescriptionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (sku() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sku in model IotHubDescriptionInner"));
        } else {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IotHubDescriptionInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeStringField("etag", this.etag);
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IotHubDescriptionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IotHubDescriptionInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IotHubDescriptionInner.
     */
    public static IotHubDescriptionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IotHubDescriptionInner deserializedIotHubDescriptionInner = new IotHubDescriptionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedIotHubDescriptionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedIotHubDescriptionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedIotHubDescriptionInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedIotHubDescriptionInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedIotHubDescriptionInner.withTags(tags);
                } else if ("sku".equals(fieldName)) {
                    deserializedIotHubDescriptionInner.sku = IotHubSkuInfo.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedIotHubDescriptionInner.etag = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedIotHubDescriptionInner.properties = IotHubProperties.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedIotHubDescriptionInner.identity = ArmIdentity.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedIotHubDescriptionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIotHubDescriptionInner;
        });
    }
}
