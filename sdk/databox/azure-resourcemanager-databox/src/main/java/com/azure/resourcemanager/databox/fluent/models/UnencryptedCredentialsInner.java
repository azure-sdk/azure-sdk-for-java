// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databox.models.JobSecrets;
import java.io.IOException;

/**
 * Unencrypted credentials for accessing device.
 */
@Immutable
public final class UnencryptedCredentialsInner implements JsonSerializable<UnencryptedCredentialsInner> {
    /*
     * Name of the job.
     */
    private String jobName;

    /*
     * Secrets related to this job.
     */
    private JobSecrets jobSecrets;

    /**
     * Creates an instance of UnencryptedCredentialsInner class.
     */
    public UnencryptedCredentialsInner() {
    }

    /**
     * Get the jobName property: Name of the job.
     * 
     * @return the jobName value.
     */
    public String jobName() {
        return this.jobName;
    }

    /**
     * Get the jobSecrets property: Secrets related to this job.
     * 
     * @return the jobSecrets value.
     */
    public JobSecrets jobSecrets() {
        return this.jobSecrets;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (jobSecrets() != null) {
            jobSecrets().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UnencryptedCredentialsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UnencryptedCredentialsInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UnencryptedCredentialsInner.
     */
    public static UnencryptedCredentialsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UnencryptedCredentialsInner deserializedUnencryptedCredentialsInner = new UnencryptedCredentialsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("jobName".equals(fieldName)) {
                    deserializedUnencryptedCredentialsInner.jobName = reader.getString();
                } else if ("jobSecrets".equals(fieldName)) {
                    deserializedUnencryptedCredentialsInner.jobSecrets = JobSecrets.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUnencryptedCredentialsInner;
        });
    }
}
