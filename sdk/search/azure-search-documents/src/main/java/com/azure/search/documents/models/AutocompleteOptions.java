// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Parameter group.
 */
@Fluent
public final class AutocompleteOptions implements JsonSerializable<AutocompleteOptions> {

    /*
     * Specifies the mode for Autocomplete. The default is 'oneTerm'. Use 'twoTerms' to get shingles and
     * 'oneTermWithContext' to use the current context while producing auto-completed terms.
     */
    @Generated
    private AutocompleteMode autocompleteMode;

    /*
     * An OData expression that filters the documents used to produce completed terms for the Autocomplete result.
     */
    @Generated
    private String filter;

    /*
     * A value indicating whether to use fuzzy matching for the autocomplete query. Default is false. When set to true,
     * the query will find terms even if there's a substituted or missing character in the search text. While this
     * provides a better experience in some scenarios, it comes at a performance cost as fuzzy autocomplete queries are
     * slower and consume more resources.
     */
    @Generated
    private Boolean useFuzzyMatching;

    /*
     * A string tag that is appended to hit highlights. Must be set with highlightPreTag. If omitted, hit highlighting
     * is disabled.
     */
    @Generated
    private String highlightPostTag;

    /*
     * A string tag that is prepended to hit highlights. Must be set with highlightPostTag. If omitted, hit highlighting
     * is disabled.
     */
    @Generated
    private String highlightPreTag;

    /*
     * A number between 0 and 100 indicating the percentage of the index that must be covered by an autocomplete query
     * in order for the query to be reported as a success. This parameter can be useful for ensuring search availability
     * even for services with only one replica. The default is 80.
     */
    @Generated
    private Double minimumCoverage;

    /*
     * The list of field names to consider when querying for auto-completed terms. Target fields must be included in the
     * specified suggester.
     */
    @Generated
    private List<String> searchFields;

    /*
     * The number of auto-completed terms to retrieve. This must be a value between 1 and 100. The default is 5.
     */
    @Generated
    private Integer top;

    /**
     * Creates an instance of AutocompleteOptions class.
     */
    @Generated
    public AutocompleteOptions() {
    }

    /**
     * Get the autocompleteMode property: Specifies the mode for Autocomplete. The default is 'oneTerm'. Use 'twoTerms'
     * to get shingles and 'oneTermWithContext' to use the current context while producing auto-completed terms.
     *
     * @return the autocompleteMode value.
     */
    @Generated
    public AutocompleteMode getAutocompleteMode() {
        return this.autocompleteMode;
    }

    /**
     * Set the autocompleteMode property: Specifies the mode for Autocomplete. The default is 'oneTerm'. Use 'twoTerms'
     * to get shingles and 'oneTermWithContext' to use the current context while producing auto-completed terms.
     *
     * @param autocompleteMode the autocompleteMode value to set.
     * @return the AutocompleteOptions object itself.
     */
    @Generated
    public AutocompleteOptions setAutocompleteMode(AutocompleteMode autocompleteMode) {
        this.autocompleteMode = autocompleteMode;
        return this;
    }

    /**
     * Get the filter property: An OData expression that filters the documents used to produce completed terms for the
     * Autocomplete result.
     *
     * @return the filter value.
     */
    @Generated
    public String getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: An OData expression that filters the documents used to produce completed terms for the
     * Autocomplete result.
     *
     * @param filter the filter value to set.
     * @return the AutocompleteOptions object itself.
     */
    @Generated
    public AutocompleteOptions setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the useFuzzyMatching property: A value indicating whether to use fuzzy matching for the autocomplete query.
     * Default is false. When set to true, the query will find terms even if there's a substituted or missing character
     * in the search text. While this provides a better experience in some scenarios, it comes at a performance cost as
     * fuzzy autocomplete queries are slower and consume more resources.
     *
     * @return the useFuzzyMatching value.
     */
    @Generated
    public Boolean useFuzzyMatching() {
        return this.useFuzzyMatching;
    }

    /**
     * Set the useFuzzyMatching property: A value indicating whether to use fuzzy matching for the autocomplete query.
     * Default is false. When set to true, the query will find terms even if there's a substituted or missing character
     * in the search text. While this provides a better experience in some scenarios, it comes at a performance cost as
     * fuzzy autocomplete queries are slower and consume more resources.
     *
     * @param useFuzzyMatching the useFuzzyMatching value to set.
     * @return the AutocompleteOptions object itself.
     */
    @Generated
    public AutocompleteOptions setUseFuzzyMatching(Boolean useFuzzyMatching) {
        this.useFuzzyMatching = useFuzzyMatching;
        return this;
    }

    /**
     * Get the highlightPostTag property: A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. If omitted, hit highlighting is disabled.
     *
     * @return the highlightPostTag value.
     */
    @Generated
    public String getHighlightPostTag() {
        return this.highlightPostTag;
    }

    /**
     * Set the highlightPostTag property: A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. If omitted, hit highlighting is disabled.
     *
     * @param highlightPostTag the highlightPostTag value to set.
     * @return the AutocompleteOptions object itself.
     */
    @Generated
    public AutocompleteOptions setHighlightPostTag(String highlightPostTag) {
        this.highlightPostTag = highlightPostTag;
        return this;
    }

    /**
     * Get the highlightPreTag property: A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. If omitted, hit highlighting is disabled.
     *
     * @return the highlightPreTag value.
     */
    @Generated
    public String getHighlightPreTag() {
        return this.highlightPreTag;
    }

    /**
     * Set the highlightPreTag property: A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. If omitted, hit highlighting is disabled.
     *
     * @param highlightPreTag the highlightPreTag value to set.
     * @return the AutocompleteOptions object itself.
     */
    @Generated
    public AutocompleteOptions setHighlightPreTag(String highlightPreTag) {
        this.highlightPreTag = highlightPreTag;
        return this;
    }

    /**
     * Get the minimumCoverage property: A number between 0 and 100 indicating the percentage of the index that must be
     * covered by an autocomplete query in order for the query to be reported as a success. This parameter can be useful
     * for ensuring search availability even for services with only one replica. The default is 80.
     *
     * @return the minimumCoverage value.
     */
    @Generated
    public Double getMinimumCoverage() {
        return this.minimumCoverage;
    }

    /**
     * Set the minimumCoverage property: A number between 0 and 100 indicating the percentage of the index that must be
     * covered by an autocomplete query in order for the query to be reported as a success. This parameter can be useful
     * for ensuring search availability even for services with only one replica. The default is 80.
     *
     * @param minimumCoverage the minimumCoverage value to set.
     * @return the AutocompleteOptions object itself.
     */
    @Generated
    public AutocompleteOptions setMinimumCoverage(Double minimumCoverage) {
        this.minimumCoverage = minimumCoverage;
        return this;
    }

    /**
     * Get the searchFields property: The list of field names to consider when querying for auto-completed terms. Target
     * fields must be included in the specified suggester.
     *
     * @return the searchFields value.
     */
    @Generated
    public List<String> getSearchFields() {
        return this.searchFields;
    }

    /**
     * Set the searchFields property: The list of field names to consider when querying for auto-completed terms. Target
     * fields must be included in the specified suggester.
     *
     * @param searchFields the searchFields value to set.
     * @return the AutocompleteOptions object itself.
     */
    @Generated
    public AutocompleteOptions setSearchFields(List<String> searchFields) {
        this.searchFields = searchFields;
        return this;
    }

    /**
     * Get the top property: The number of auto-completed terms to retrieve. This must be a value between 1 and 100. The
     * default is 5.
     *
     * @return the top value.
     */
    @Generated
    public Integer getTop() {
        return this.top;
    }

    /**
     * Set the top property: The number of auto-completed terms to retrieve. This must be a value between 1 and 100. The
     * default is 5.
     *
     * @param top the top value to set.
     * @return the AutocompleteOptions object itself.
     */
    @Generated
    public AutocompleteOptions setTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * Set the searchFields property: The list of field names to consider when querying for auto-completed terms. Target
     * fields must be included in the specified suggester.
     *
     * @param searchFields the searchFields value to set.
     * @return the AutocompleteOptions object itself.
     */
    public AutocompleteOptions setSearchFields(String... searchFields) {
        this.searchFields = (searchFields == null) ? null : Arrays.asList(searchFields);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("autocompleteMode",
            this.autocompleteMode == null ? null : this.autocompleteMode.toString());
        jsonWriter.writeStringField("$filter", this.filter);
        jsonWriter.writeBooleanField("UseFuzzyMatching", this.useFuzzyMatching);
        jsonWriter.writeStringField("highlightPostTag", this.highlightPostTag);
        jsonWriter.writeStringField("highlightPreTag", this.highlightPreTag);
        jsonWriter.writeNumberField("minimumCoverage", this.minimumCoverage);
        jsonWriter.writeArrayField("searchFields", this.searchFields, (writer, element) -> writer.writeString(element));
        jsonWriter.writeNumberField("$top", this.top);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AutocompleteOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutocompleteOptions if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AutocompleteOptions.
     */
    public static AutocompleteOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AutocompleteOptions deserializedAutocompleteOptions = new AutocompleteOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("autocompleteMode".equals(fieldName)) {
                    deserializedAutocompleteOptions.autocompleteMode = AutocompleteMode.fromString(reader.getString());
                } else if ("$filter".equals(fieldName)) {
                    deserializedAutocompleteOptions.filter = reader.getString();
                } else if ("UseFuzzyMatching".equals(fieldName)) {
                    deserializedAutocompleteOptions.useFuzzyMatching = reader.getNullable(JsonReader::getBoolean);
                } else if ("highlightPostTag".equals(fieldName)) {
                    deserializedAutocompleteOptions.highlightPostTag = reader.getString();
                } else if ("highlightPreTag".equals(fieldName)) {
                    deserializedAutocompleteOptions.highlightPreTag = reader.getString();
                } else if ("minimumCoverage".equals(fieldName)) {
                    deserializedAutocompleteOptions.minimumCoverage = reader.getNullable(JsonReader::getDouble);
                } else if ("searchFields".equals(fieldName)) {
                    List<String> searchFields = reader.readArray(reader1 -> reader1.getString());
                    deserializedAutocompleteOptions.searchFields = searchFields;
                } else if ("$top".equals(fieldName)) {
                    deserializedAutocompleteOptions.top = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedAutocompleteOptions;
        });
    }
}
