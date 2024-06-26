// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * A label selector is composed of two parts, matchLabels and matchExpressions. The first part, matchLabels is a map of
 * {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose
 * key field is 'key', the operator is 'In', and the values array contains only 'value'. The second part,
 * matchExpressions is a list of resource selector requirements. Valid operators include In, NotIn, Exists, and
 * DoesNotExist. The values set must be non-empty in the case of In and NotIn. The values set must be empty in the case
 * of Exists and DoesNotExist. All of the requirements, from both matchLabels and matchExpressions must all be satisfied
 * in order to match.
 */
@Fluent
public final class ResourceSyncRulePropertiesSelector {
    /*
     * MatchExpressions is a list of resource selector requirements. Valid
     * operators include In, NotIn, Exists, and DoesNotExist. The values set
     * must be non-empty in the case of In and NotIn. The values set must be
     * empty in the case of Exists and DoesNotExist.
     */
    @JsonProperty(value = "matchExpressions")
    private List<MatchExpressionsProperties> matchExpressions;

    /*
     * MatchLabels is a map of {key,value} pairs. A single {key,value} in the
     * matchLabels map is equivalent to an element of matchExpressions, whose
     * key field is 'key', the operator is 'In', and the values array contains
     * only 'value'.
     */
    @JsonProperty(value = "matchLabels")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> matchLabels;

    /**
     * Get the matchExpressions property: MatchExpressions is a list of resource selector requirements. Valid operators
     * include In, NotIn, Exists, and DoesNotExist. The values set must be non-empty in the case of In and NotIn. The
     * values set must be empty in the case of Exists and DoesNotExist.
     *
     * @return the matchExpressions value.
     */
    public List<MatchExpressionsProperties> matchExpressions() {
        return this.matchExpressions;
    }

    /**
     * Set the matchExpressions property: MatchExpressions is a list of resource selector requirements. Valid operators
     * include In, NotIn, Exists, and DoesNotExist. The values set must be non-empty in the case of In and NotIn. The
     * values set must be empty in the case of Exists and DoesNotExist.
     *
     * @param matchExpressions the matchExpressions value to set.
     * @return the ResourceSyncRulePropertiesSelector object itself.
     */
    public ResourceSyncRulePropertiesSelector withMatchExpressions(List<MatchExpressionsProperties> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    /**
     * Get the matchLabels property: MatchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels
     * map is equivalent to an element of matchExpressions, whose key field is 'key', the operator is 'In', and the
     * values array contains only 'value'.
     *
     * @return the matchLabels value.
     */
    public Map<String, String> matchLabels() {
        return this.matchLabels;
    }

    /**
     * Set the matchLabels property: MatchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels
     * map is equivalent to an element of matchExpressions, whose key field is 'key', the operator is 'In', and the
     * values array contains only 'value'.
     *
     * @param matchLabels the matchLabels value to set.
     * @return the ResourceSyncRulePropertiesSelector object itself.
     */
    public ResourceSyncRulePropertiesSelector withMatchLabels(Map<String, String> matchLabels) {
        this.matchLabels = matchLabels;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (matchExpressions() != null) {
            matchExpressions().forEach(e -> e.validate());
        }
    }
}
