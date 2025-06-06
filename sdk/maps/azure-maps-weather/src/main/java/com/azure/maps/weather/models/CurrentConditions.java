// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The CurrentConditions model.
 */
@Fluent
public final class CurrentConditions implements JsonSerializable<CurrentConditions> {

    /*
     * Date and time of the current observation displayed in ISO 8601 format, for example, 2019-10-27T19:39:57-08:00.
     */
    @Generated
    private OffsetDateTime dateTime;

    /*
     * Phrase description of the current weather condition. Displayed in specified language.
     */
    @Generated
    private String description;

    /*
     * Numeric value representing an image that displays the `iconPhrase`. Please refer to [Weather services in Azure
     * Maps](/azure/azure-maps/weather-services-concepts#weather-icons) for details.
     */
    @Generated
    private IconCode iconCode;

    /*
     * Indicates the presence or absence of precipitation. True indicates the presence of precipitation, false indicates
     * the absence of precipitation.
     */
    @Generated
    private Boolean hasPrecipitation;

    /*
     * Indicates the time of the day. True indicates 'day',', false indicates 'night.
     */
    @Generated
    private Boolean isDaytime;

    /*
     * Temperature being returned.
     */
    @Generated
    private WeatherUnitDetails temperature;

    /*
     * RealFeel™ Temperature being returned.
     */
    @Generated
    private WeatherUnitDetails realFeelTemperature;

    /*
     * RealFeel™ Temperature being returned. Describes what the temperature really feels like in the shade.
     */
    @Generated
    private WeatherUnitDetails realFeelTemperatureShade;

    /*
     * Relative humidity is the amount of water vapor present in air expressed as a percentage of the amount needed for
     * saturation at the same temperature.
     */
    @Generated
    private Integer relativeHumidity;

    /*
     * The dewpoint temperature in specified unit. The dewpoint temperature is the temperature that the air must be
     * cooled to in order to reach saturation.
     */
    @Generated
    private WeatherUnitDetails dewPoint;

    /*
     * Wind details being returned including speed and direction.
     */
    @Generated
    private WindDetails wind;

    /*
     * Wind gust. Wind gust is a sudden, brief increase in speed of the wind.
     */
    @Generated
    private WindDetails windGust;

    /*
     * Measure of the strength of the ultraviolet radiation from the sun. Supported values are:
     * * `0-2` - Low danger from the sun's UV rays or the average person.
     * * `3-5` - Moderate risk of harm from unprotected sun exposure.
     * * `6-7` - High risk of harm from unprotected sun exposure.
     * * `8-10` - Very high risk of harm from unprotected sun exposure.
     * * `11+` - Extreme risk of harm from unprotected sun exposure.
     */
    @Generated
    private Integer uvIndex;

    /*
     * Phrase associated with the `uvIndex`.
     */
    @Generated
    private String uvIndexDescription;

    /*
     * Visibility in specified unit. A measure of the distance at which an object or light can be clearly discerned.
     */
    @Generated
    private WeatherUnitDetails visibility;

    /*
     * Cause of limited visibility.
     * 
     * Possible values:
     * 
     * - _A = heavy thunderstorm/hail_
     * - _BD = blowing dust_
     * - _BN = blowing sand_
     * - _BS = blowing snow_
     * - _D = dust_
     * - _F = fog_
     * - _GF = ground fog_
     * - _HZ = haze_
     * - _I = ice_
     * - _IC = ice crystals_
     * - _IF = ice fog_
     * - _IP = ice pellets_
     * - _IPW = ice pellets shower_
     * - _K = smoke_
     * - _L = drizzle_
     * - _R = rain_
     * - _RS = rain/snow_
     * - _RW = rain shower_
     * - _S = snow_
     * - _SG = snow granules_
     * - _SP = snow pellets_
     * - _SW = snow shower_
     * - _T = thunderstorm_
     * - _UP = undefined precipitation_
     * - _ZL = freezing drizzle_
     * - _ZR = freezing rain_
     * - _+ = heavy_
     * - _- = light_
     */
    @Generated
    private String obstructionsToVisibility;

    /*
     * Percent representing cloud cover.
     */
    @Generated
    private Integer cloudCover;

    /*
     * Cloud ceiling in specified unit. The ceiling is a measurement of the height of the base of the lowest clouds.
     */
    @Generated
    private WeatherUnitDetails cloudCeiling;

    /*
     * Atmospheric pressure in specified unit.
     */
    @Generated
    private WeatherUnitDetails pressure;

    /*
     * Atmospheric pressure change.
     */
    @Generated
    private PressureTendency pressureTendency;

    /*
     * Departure from the temperature observed 24 hours ago in specified unit.
     */
    @Generated
    private WeatherUnitDetails pastTwentyFourHourTemperatureDeparture;

    /*
     * Perceived outdoor temperature caused by the combination of air temperature, relative humidity, and wind speed in
     * specified unit.
     */
    @Generated
    private WeatherUnitDetails apparentTemperature;

    /*
     * Perceived air temperature on exposed skin due to wind.
     */
    @Generated
    private WeatherUnitDetails windChillTemperature;

    /*
     * The temperature to which air may be cooled by evaporating water into it at constant pressure until it reaches
     * saturation.
     */
    @Generated
    private WeatherUnitDetails wetBulbTemperature;

    /*
     * Summary of precipitation amounts over the past 24 hours.
     */
    @Generated
    private PrecipitationSummary precipitationSummary;

    /*
     * Summary of temperature fluctuations over the past 6, 12, and 24 hours.
     */
    @Generated
    private TemperatureSummary temperatureSummary;

    /**
     * Set default CurrentConditions constructor to private
     */
    @Generated
    private CurrentConditions() {
    }

    /**
     * Get the dateTime property: Date and time of the current observation displayed in ISO 8601 format, for example,
     * 2019-10-27T19:39:57-08:00.
     *
     * @return the dateTime value.
     */
    @Generated
    public OffsetDateTime getDateTime() {
        return this.dateTime;
    }

    /**
     * Get the description property: Phrase description of the current weather condition. Displayed in specified
     * language.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the iconCode property: Numeric value representing an image that displays the `iconPhrase`. Please refer to
     * [Weather services in Azure Maps](/azure/azure-maps/weather-services-concepts#weather-icons) for details.
     *
     * @return the iconCode value.
     */
    @Generated
    public IconCode getIconCode() {
        return this.iconCode;
    }

    /**
     * Get the hasPrecipitation property: Indicates the presence or absence of precipitation. True indicates the
     * presence of precipitation, false indicates the absence of precipitation.
     *
     * @return the hasPrecipitation value.
     */
    @Generated
    public Boolean isHasPrecipitation() {
        return this.hasPrecipitation;
    }

    /**
     * Get the isDaytime property: Indicates the time of the day. True indicates 'day',', false indicates 'night.
     *
     * @return the isDaytime value.
     */
    @Generated
    public Boolean isDaytime() {
        return this.isDaytime;
    }

    /**
     * Get the temperature property: Temperature being returned.
     *
     * @return the temperature value.
     */
    @Generated
    public WeatherUnitDetails getTemperature() {
        return this.temperature;
    }

    /**
     * Get the realFeelTemperature property: RealFeel™ Temperature being returned.
     *
     * @return the realFeelTemperature value.
     */
    @Generated
    public WeatherUnitDetails getRealFeelTemperature() {
        return this.realFeelTemperature;
    }

    /**
     * Get the realFeelTemperatureShade property: RealFeel™ Temperature being returned. Describes what the temperature
     * really feels like in the shade.
     *
     * @return the realFeelTemperatureShade value.
     */
    @Generated
    public WeatherUnitDetails getRealFeelTemperatureShade() {
        return this.realFeelTemperatureShade;
    }

    /**
     * Get the relativeHumidity property: Relative humidity is the amount of water vapor present in air expressed as a
     * percentage of the amount needed for saturation at the same temperature.
     *
     * @return the relativeHumidity value.
     */
    @Generated
    public Integer getRelativeHumidity() {
        return this.relativeHumidity;
    }

    /**
     * Get the dewPoint property: The dewpoint temperature in specified unit. The dewpoint temperature is the
     * temperature that the air must be cooled to in order to reach saturation.
     *
     * @return the dewPoint value.
     */
    @Generated
    public WeatherUnitDetails getDewPoint() {
        return this.dewPoint;
    }

    /**
     * Get the wind property: Wind details being returned including speed and direction.
     *
     * @return the wind value.
     */
    @Generated
    public WindDetails getWind() {
        return this.wind;
    }

    /**
     * Get the windGust property: Wind gust. Wind gust is a sudden, brief increase in speed of the wind.
     *
     * @return the windGust value.
     */
    @Generated
    public WindDetails getWindGust() {
        return this.windGust;
    }

    /**
     * Get the uvIndex property: Measure of the strength of the ultraviolet radiation from the sun. Supported values
     * are:
     * * `0-2` - Low danger from the sun's UV rays or the average person.
     * * `3-5` - Moderate risk of harm from unprotected sun exposure.
     * * `6-7` - High risk of harm from unprotected sun exposure.
     * * `8-10` - Very high risk of harm from unprotected sun exposure.
     * * `11+` - Extreme risk of harm from unprotected sun exposure.
     *
     * @return the uvIndex value.
     */
    @Generated
    public Integer getUvIndex() {
        return this.uvIndex;
    }

    /**
     * Get the uvIndexDescription property: Phrase associated with the `uvIndex`.
     *
     * @return the uvIndexDescription value.
     */
    @Generated
    public String getUvIndexDescription() {
        return this.uvIndexDescription;
    }

    /**
     * Get the visibility property: Visibility in specified unit. A measure of the distance at which an object or light
     * can be clearly discerned.
     *
     * @return the visibility value.
     */
    @Generated
    public WeatherUnitDetails getVisibility() {
        return this.visibility;
    }

    /**
     * Get the obstructionsToVisibility property: Cause of limited visibility.
     *
     * Possible values:
     *
     * - _A = heavy thunderstorm/hail_
     * - _BD = blowing dust_
     * - _BN = blowing sand_
     * - _BS = blowing snow_
     * - _D = dust_
     * - _F = fog_
     * - _GF = ground fog_
     * - _HZ = haze_
     * - _I = ice_
     * - _IC = ice crystals_
     * - _IF = ice fog_
     * - _IP = ice pellets_
     * - _IPW = ice pellets shower_
     * - _K = smoke_
     * - _L = drizzle_
     * - _R = rain_
     * - _RS = rain/snow_
     * - _RW = rain shower_
     * - _S = snow_
     * - _SG = snow granules_
     * - _SP = snow pellets_
     * - _SW = snow shower_
     * - _T = thunderstorm_
     * - _UP = undefined precipitation_
     * - _ZL = freezing drizzle_
     * - _ZR = freezing rain_
     * - _+ = heavy_
     * - _- = light_.
     *
     * @return the obstructionsToVisibility value.
     */
    @Generated
    public String getObstructionsToVisibility() {
        return this.obstructionsToVisibility;
    }

    /**
     * Get the cloudCover property: Percent representing cloud cover.
     *
     * @return the cloudCover value.
     */
    @Generated
    public Integer getCloudCover() {
        return this.cloudCover;
    }

    /**
     * Get the cloudCeiling property: Cloud ceiling in specified unit. The ceiling is a measurement of the height of the
     * base of the lowest clouds.
     *
     * @return the cloudCeiling value.
     */
    @Generated
    public WeatherUnitDetails getCloudCeiling() {
        return this.cloudCeiling;
    }

    /**
     * Get the pressure property: Atmospheric pressure in specified unit.
     *
     * @return the pressure value.
     */
    @Generated
    public WeatherUnitDetails getPressure() {
        return this.pressure;
    }

    /**
     * Get the pressureTendency property: Atmospheric pressure change.
     *
     * @return the pressureTendency value.
     */
    @Generated
    public PressureTendency getPressureTendency() {
        return this.pressureTendency;
    }

    /**
     * Get the pastTwentyFourHourTemperatureDeparture property: Departure from the temperature observed 24 hours ago in
     * specified unit.
     *
     * @return the pastTwentyFourHourTemperatureDeparture value.
     */
    @Generated
    public WeatherUnitDetails getPastTwentyFourHourTemperatureDeparture() {
        return this.pastTwentyFourHourTemperatureDeparture;
    }

    /**
     * Get the apparentTemperature property: Perceived outdoor temperature caused by the combination of air temperature,
     * relative humidity, and wind speed in specified unit.
     *
     * @return the apparentTemperature value.
     */
    @Generated
    public WeatherUnitDetails getApparentTemperature() {
        return this.apparentTemperature;
    }

    /**
     * Get the windChillTemperature property: Perceived air temperature on exposed skin due to wind.
     *
     * @return the windChillTemperature value.
     */
    @Generated
    public WeatherUnitDetails getWindChillTemperature() {
        return this.windChillTemperature;
    }

    /**
     * Get the wetBulbTemperature property: The temperature to which air may be cooled by evaporating water into it at
     * constant pressure until it reaches saturation.
     *
     * @return the wetBulbTemperature value.
     */
    @Generated
    public WeatherUnitDetails getWetBulbTemperature() {
        return this.wetBulbTemperature;
    }

    /**
     * Get the precipitationSummary property: Summary of precipitation amounts over the past 24 hours.
     *
     * @return the precipitationSummary value.
     */
    @Generated
    public PrecipitationSummary getPrecipitationSummary() {
        return this.precipitationSummary;
    }

    /**
     * Get the temperatureSummary property: Summary of temperature fluctuations over the past 6, 12, and 24 hours.
     *
     * @return the temperatureSummary value.
     */
    @Generated
    public TemperatureSummary getTemperatureSummary() {
        return this.temperatureSummary;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dateTime",
            this.dateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.dateTime));
        jsonWriter.writeStringField("phrase", this.description);
        jsonWriter.writeNumberField("iconCode", this.iconCode == null ? null : this.iconCode.getValue());
        jsonWriter.writeBooleanField("hasPrecipitation", this.hasPrecipitation);
        jsonWriter.writeBooleanField("isDayTime", this.isDaytime);
        jsonWriter.writeJsonField("temperature", this.temperature);
        jsonWriter.writeJsonField("realFeelTemperature", this.realFeelTemperature);
        jsonWriter.writeJsonField("realFeelTemperatureShade", this.realFeelTemperatureShade);
        jsonWriter.writeNumberField("relativeHumidity", this.relativeHumidity);
        jsonWriter.writeJsonField("dewPoint", this.dewPoint);
        jsonWriter.writeJsonField("wind", this.wind);
        jsonWriter.writeJsonField("windGust", this.windGust);
        jsonWriter.writeNumberField("uvIndex", this.uvIndex);
        jsonWriter.writeStringField("uvIndexPhrase", this.uvIndexDescription);
        jsonWriter.writeJsonField("visibility", this.visibility);
        jsonWriter.writeStringField("obstructionsToVisibility", this.obstructionsToVisibility);
        jsonWriter.writeNumberField("cloudCover", this.cloudCover);
        jsonWriter.writeJsonField("ceiling", this.cloudCeiling);
        jsonWriter.writeJsonField("pressure", this.pressure);
        jsonWriter.writeJsonField("pressureTendency", this.pressureTendency);
        jsonWriter.writeJsonField("pastTwentyFourHourTemperatureDeparture",
            this.pastTwentyFourHourTemperatureDeparture);
        jsonWriter.writeJsonField("apparentTemperature", this.apparentTemperature);
        jsonWriter.writeJsonField("windChillTemperature", this.windChillTemperature);
        jsonWriter.writeJsonField("wetBulbTemperature", this.wetBulbTemperature);
        jsonWriter.writeJsonField("precipitationSummary", this.precipitationSummary);
        jsonWriter.writeJsonField("temperatureSummary", this.temperatureSummary);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CurrentConditions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CurrentConditions if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CurrentConditions.
     */
    @Generated
    public static CurrentConditions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CurrentConditions deserializedCurrentConditions = new CurrentConditions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("dateTime".equals(fieldName)) {
                    deserializedCurrentConditions.dateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("phrase".equals(fieldName)) {
                    deserializedCurrentConditions.description = reader.getString();
                } else if ("iconCode".equals(fieldName)) {
                    deserializedCurrentConditions.iconCode = IconCode.fromValue(reader.getInt());
                } else if ("hasPrecipitation".equals(fieldName)) {
                    deserializedCurrentConditions.hasPrecipitation = reader.getNullable(JsonReader::getBoolean);
                } else if ("isDayTime".equals(fieldName)) {
                    deserializedCurrentConditions.isDaytime = reader.getNullable(JsonReader::getBoolean);
                } else if ("temperature".equals(fieldName)) {
                    deserializedCurrentConditions.temperature = WeatherUnitDetails.fromJson(reader);
                } else if ("realFeelTemperature".equals(fieldName)) {
                    deserializedCurrentConditions.realFeelTemperature = WeatherUnitDetails.fromJson(reader);
                } else if ("realFeelTemperatureShade".equals(fieldName)) {
                    deserializedCurrentConditions.realFeelTemperatureShade = WeatherUnitDetails.fromJson(reader);
                } else if ("relativeHumidity".equals(fieldName)) {
                    deserializedCurrentConditions.relativeHumidity = reader.getNullable(JsonReader::getInt);
                } else if ("dewPoint".equals(fieldName)) {
                    deserializedCurrentConditions.dewPoint = WeatherUnitDetails.fromJson(reader);
                } else if ("wind".equals(fieldName)) {
                    deserializedCurrentConditions.wind = WindDetails.fromJson(reader);
                } else if ("windGust".equals(fieldName)) {
                    deserializedCurrentConditions.windGust = WindDetails.fromJson(reader);
                } else if ("uvIndex".equals(fieldName)) {
                    deserializedCurrentConditions.uvIndex = reader.getNullable(JsonReader::getInt);
                } else if ("uvIndexPhrase".equals(fieldName)) {
                    deserializedCurrentConditions.uvIndexDescription = reader.getString();
                } else if ("visibility".equals(fieldName)) {
                    deserializedCurrentConditions.visibility = WeatherUnitDetails.fromJson(reader);
                } else if ("obstructionsToVisibility".equals(fieldName)) {
                    deserializedCurrentConditions.obstructionsToVisibility = reader.getString();
                } else if ("cloudCover".equals(fieldName)) {
                    deserializedCurrentConditions.cloudCover = reader.getNullable(JsonReader::getInt);
                } else if ("ceiling".equals(fieldName)) {
                    deserializedCurrentConditions.cloudCeiling = WeatherUnitDetails.fromJson(reader);
                } else if ("pressure".equals(fieldName)) {
                    deserializedCurrentConditions.pressure = WeatherUnitDetails.fromJson(reader);
                } else if ("pressureTendency".equals(fieldName)) {
                    deserializedCurrentConditions.pressureTendency = PressureTendency.fromJson(reader);
                } else if ("pastTwentyFourHourTemperatureDeparture".equals(fieldName)) {
                    deserializedCurrentConditions.pastTwentyFourHourTemperatureDeparture
                        = WeatherUnitDetails.fromJson(reader);
                } else if ("apparentTemperature".equals(fieldName)) {
                    deserializedCurrentConditions.apparentTemperature = WeatherUnitDetails.fromJson(reader);
                } else if ("windChillTemperature".equals(fieldName)) {
                    deserializedCurrentConditions.windChillTemperature = WeatherUnitDetails.fromJson(reader);
                } else if ("wetBulbTemperature".equals(fieldName)) {
                    deserializedCurrentConditions.wetBulbTemperature = WeatherUnitDetails.fromJson(reader);
                } else if ("precipitationSummary".equals(fieldName)) {
                    deserializedCurrentConditions.precipitationSummary = PrecipitationSummary.fromJson(reader);
                } else if ("temperatureSummary".equals(fieldName)) {
                    deserializedCurrentConditions.temperatureSummary = TemperatureSummary.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedCurrentConditions;
        });
    }
}
