// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email,
 * etc.
 * See https://www.hl7.org/fhir/R4/datatypes.html#ContactPoint.
 */
@Immutable
public final class FhirR4ContactPoint implements JsonSerializable<FhirR4ContactPoint> {

    /*
     * phone | fax | email | pager | url | sms | other
     */
    @Generated
    private ContactPointSystem system;

    /*
     * The actual contact point details
     */
    @Generated
    private String value;

    /*
     * home | work | temp | old | mobile - purpose of this contact point
     */
    @Generated
    private ContactPointUse use;

    /*
     * Specify preferred order of use (1 = highest)
     */
    @Generated
    private Integer rank;

    /*
     * Time period when the contact point was/is in use
     */
    @Generated
    private FhirR4Period period;

    /**
     * Creates an instance of FhirR4ContactPoint class.
     */
    @Generated
    private FhirR4ContactPoint() {
    }

    /**
     * Get the system property: phone | fax | email | pager | url | sms | other.
     *
     * @return the system value.
     */
    @Generated
    public ContactPointSystem getSystem() {
        return this.system;
    }

    /**
     * Get the value property: The actual contact point details.
     *
     * @return the value value.
     */
    @Generated
    public String getValue() {
        return this.value;
    }

    /**
     * Get the use property: home | work | temp | old | mobile - purpose of this contact point.
     *
     * @return the use value.
     */
    @Generated
    public ContactPointUse getUse() {
        return this.use;
    }

    /**
     * Get the rank property: Specify preferred order of use (1 = highest).
     *
     * @return the rank value.
     */
    @Generated
    public Integer getRank() {
        return this.rank;
    }

    /**
     * Get the period property: Time period when the contact point was/is in use.
     *
     * @return the period value.
     */
    @Generated
    public FhirR4Period getPeriod() {
        return this.period;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("system", this.system == null ? null : this.system.toString());
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("use", this.use == null ? null : this.use.toString());
        jsonWriter.writeNumberField("rank", this.rank);
        jsonWriter.writeJsonField("period", this.period);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FhirR4ContactPoint from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of FhirR4ContactPoint if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FhirR4ContactPoint.
     */
    @Generated
    public static FhirR4ContactPoint fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FhirR4ContactPoint deserializedFhirR4ContactPoint = new FhirR4ContactPoint();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("system".equals(fieldName)) {
                    deserializedFhirR4ContactPoint.system = ContactPointSystem.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    deserializedFhirR4ContactPoint.value = reader.getString();
                } else if ("use".equals(fieldName)) {
                    deserializedFhirR4ContactPoint.use = ContactPointUse.fromString(reader.getString());
                } else if ("rank".equals(fieldName)) {
                    deserializedFhirR4ContactPoint.rank = reader.getNullable(JsonReader::getInt);
                } else if ("period".equals(fieldName)) {
                    deserializedFhirR4ContactPoint.period = FhirR4Period.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedFhirR4ContactPoint;
        });
    }
}
