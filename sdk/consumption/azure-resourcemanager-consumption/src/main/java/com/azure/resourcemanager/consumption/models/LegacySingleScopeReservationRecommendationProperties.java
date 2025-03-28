// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/**
 * The properties of the legacy reservation recommendation for single scope.
 */
@Immutable
public final class LegacySingleScopeReservationRecommendationProperties
    extends LegacyReservationRecommendationProperties {
    /*
     * Shared or single recommendation.
     */
    private String scope = "Single";

    /*
     * Subscription id associated with single scoped recommendation.
     */
    private UUID subscriptionId;

    /**
     * Creates an instance of LegacySingleScopeReservationRecommendationProperties class.
     */
    public LegacySingleScopeReservationRecommendationProperties() {
    }

    /**
     * Get the scope property: Shared or single recommendation.
     * 
     * @return the scope value.
     */
    @Override
    public String scope() {
        return this.scope;
    }

    /**
     * Get the subscriptionId property: Subscription id associated with single scoped recommendation.
     * 
     * @return the subscriptionId value.
     */
    public UUID subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (skuProperties() != null) {
            skuProperties().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("scope", this.scope);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LegacySingleScopeReservationRecommendationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LegacySingleScopeReservationRecommendationProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LegacySingleScopeReservationRecommendationProperties.
     */
    public static LegacySingleScopeReservationRecommendationProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            LegacySingleScopeReservationRecommendationProperties deserializedLegacySingleScopeReservationRecommendationProperties
                = new LegacySingleScopeReservationRecommendationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("lookBackPeriod".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties
                        .withLookBackPeriod(reader.getString());
                } else if ("instanceFlexibilityRatio".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties
                        .withInstanceFlexibilityRatio(reader.getNullable(JsonReader::getFloat));
                } else if ("instanceFlexibilityGroup".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties
                        .withInstanceFlexibilityGroup(reader.getString());
                } else if ("normalizedSize".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties
                        .withNormalizedSize(reader.getString());
                } else if ("recommendedQuantityNormalized".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties
                        .withRecommendedQuantityNormalized(reader.getNullable(JsonReader::getFloat));
                } else if ("meterId".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties
                        .withMeterId(reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString())));
                } else if ("resourceType".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties
                        .withResourceType(reader.getString());
                } else if ("term".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties.withTerm(reader.getString());
                } else if ("costWithNoReservedInstances".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties.withCostWithNoReservedInstances(
                        reader.getNullable(nonNullReader -> new BigDecimal(nonNullReader.getString())));
                } else if ("recommendedQuantity".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties.withRecommendedQuantity(
                        reader.getNullable(nonNullReader -> new BigDecimal(nonNullReader.getString())));
                } else if ("totalCostWithReservedInstances".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties.withTotalCostWithReservedInstances(
                        reader.getNullable(nonNullReader -> new BigDecimal(nonNullReader.getString())));
                } else if ("netSavings".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties
                        .withNetSavings(reader.getNullable(nonNullReader -> new BigDecimal(nonNullReader.getString())));
                } else if ("firstUsageDate".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties.withFirstUsageDate(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("skuProperties".equals(fieldName)) {
                    List<SkuProperty> skuProperties = reader.readArray(reader1 -> SkuProperty.fromJson(reader1));
                    deserializedLegacySingleScopeReservationRecommendationProperties.withSkuProperties(skuProperties);
                } else if ("scope".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties.scope = reader.getString();
                } else if ("subscriptionId".equals(fieldName)) {
                    deserializedLegacySingleScopeReservationRecommendationProperties.subscriptionId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLegacySingleScopeReservationRecommendationProperties;
        });
    }
}
