// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A PTR record.
 */
@Fluent
public final class PtrRecord implements JsonSerializable<PtrRecord> {
    /*
     * The PTR target domain name for this PTR record.
     */
    private String ptrdname;

    /**
     * Creates an instance of PtrRecord class.
     */
    public PtrRecord() {
    }

    /**
     * Get the ptrdname property: The PTR target domain name for this PTR record.
     * 
     * @return the ptrdname value.
     */
    public String ptrdname() {
        return this.ptrdname;
    }

    /**
     * Set the ptrdname property: The PTR target domain name for this PTR record.
     * 
     * @param ptrdname the ptrdname value to set.
     * @return the PtrRecord object itself.
     */
    public PtrRecord withPtrdname(String ptrdname) {
        this.ptrdname = ptrdname;
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
        jsonWriter.writeStringField("ptrdname", this.ptrdname);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PtrRecord from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PtrRecord if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the PtrRecord.
     */
    public static PtrRecord fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PtrRecord deserializedPtrRecord = new PtrRecord();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ptrdname".equals(fieldName)) {
                    deserializedPtrRecord.ptrdname = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPtrRecord;
        });
    }
}
