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
 * Cluster HTTP proxy configuration.
 */
@Fluent
public final class ManagedClusterHttpProxyConfig implements JsonSerializable<ManagedClusterHttpProxyConfig> {
    /*
     * The HTTP proxy server endpoint to use.
     */
    private String httpProxy;

    /*
     * The HTTPS proxy server endpoint to use.
     */
    private String httpsProxy;

    /*
     * The endpoints that should not go through proxy.
     */
    private List<String> noProxy;

    /*
     * Alternative CA cert to use for connecting to proxy servers.
     */
    private String trustedCa;

    /**
     * Creates an instance of ManagedClusterHttpProxyConfig class.
     */
    public ManagedClusterHttpProxyConfig() {
    }

    /**
     * Get the httpProxy property: The HTTP proxy server endpoint to use.
     * 
     * @return the httpProxy value.
     */
    public String httpProxy() {
        return this.httpProxy;
    }

    /**
     * Set the httpProxy property: The HTTP proxy server endpoint to use.
     * 
     * @param httpProxy the httpProxy value to set.
     * @return the ManagedClusterHttpProxyConfig object itself.
     */
    public ManagedClusterHttpProxyConfig withHttpProxy(String httpProxy) {
        this.httpProxy = httpProxy;
        return this;
    }

    /**
     * Get the httpsProxy property: The HTTPS proxy server endpoint to use.
     * 
     * @return the httpsProxy value.
     */
    public String httpsProxy() {
        return this.httpsProxy;
    }

    /**
     * Set the httpsProxy property: The HTTPS proxy server endpoint to use.
     * 
     * @param httpsProxy the httpsProxy value to set.
     * @return the ManagedClusterHttpProxyConfig object itself.
     */
    public ManagedClusterHttpProxyConfig withHttpsProxy(String httpsProxy) {
        this.httpsProxy = httpsProxy;
        return this;
    }

    /**
     * Get the noProxy property: The endpoints that should not go through proxy.
     * 
     * @return the noProxy value.
     */
    public List<String> noProxy() {
        return this.noProxy;
    }

    /**
     * Set the noProxy property: The endpoints that should not go through proxy.
     * 
     * @param noProxy the noProxy value to set.
     * @return the ManagedClusterHttpProxyConfig object itself.
     */
    public ManagedClusterHttpProxyConfig withNoProxy(List<String> noProxy) {
        this.noProxy = noProxy;
        return this;
    }

    /**
     * Get the trustedCa property: Alternative CA cert to use for connecting to proxy servers.
     * 
     * @return the trustedCa value.
     */
    public String trustedCa() {
        return this.trustedCa;
    }

    /**
     * Set the trustedCa property: Alternative CA cert to use for connecting to proxy servers.
     * 
     * @param trustedCa the trustedCa value to set.
     * @return the ManagedClusterHttpProxyConfig object itself.
     */
    public ManagedClusterHttpProxyConfig withTrustedCa(String trustedCa) {
        this.trustedCa = trustedCa;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("httpProxy", this.httpProxy);
        jsonWriter.writeStringField("httpsProxy", this.httpsProxy);
        jsonWriter.writeArrayField("noProxy", this.noProxy, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("trustedCa", this.trustedCa);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedClusterHttpProxyConfig from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedClusterHttpProxyConfig if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedClusterHttpProxyConfig.
     */
    public static ManagedClusterHttpProxyConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedClusterHttpProxyConfig deserializedManagedClusterHttpProxyConfig
                = new ManagedClusterHttpProxyConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("httpProxy".equals(fieldName)) {
                    deserializedManagedClusterHttpProxyConfig.httpProxy = reader.getString();
                } else if ("httpsProxy".equals(fieldName)) {
                    deserializedManagedClusterHttpProxyConfig.httpsProxy = reader.getString();
                } else if ("noProxy".equals(fieldName)) {
                    List<String> noProxy = reader.readArray(reader1 -> reader1.getString());
                    deserializedManagedClusterHttpProxyConfig.noProxy = noProxy;
                } else if ("trustedCa".equals(fieldName)) {
                    deserializedManagedClusterHttpProxyConfig.trustedCa = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedClusterHttpProxyConfig;
        });
    }
}
