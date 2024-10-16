// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligenceMetric;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligenceMetricEntity;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligenceMetrics;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ThreatIntelligenceMetricsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ThreatIntelligenceMetrics model = BinaryData.fromString(
            "{\"properties\":{\"lastUpdatedTimeUtc\":\"d\",\"threatTypeMetrics\":[{\"metricName\":\"zralcxpjbyyps\",\"metricValue\":235471293},{\"metricName\":\"jenkyh\",\"metricValue\":327752705}],\"patternTypeMetrics\":[{\"metricName\":\"xfxjelgcmpzqj\",\"metricValue\":977918878},{\"metricName\":\"xuwyvc\",\"metricValue\":240512876},{\"metricName\":\"v\",\"metricValue\":1355684710},{\"metricName\":\"izus\",\"metricValue\":997858640}],\"sourceMetrics\":[{\"metricName\":\"cmnlzijiufehg\",\"metricValue\":1219920563}]}}")
            .toObject(ThreatIntelligenceMetrics.class);
        Assertions.assertEquals("d", model.properties().lastUpdatedTimeUtc());
        Assertions.assertEquals("zralcxpjbyyps", model.properties().threatTypeMetrics().get(0).metricName());
        Assertions.assertEquals(235471293, model.properties().threatTypeMetrics().get(0).metricValue());
        Assertions.assertEquals("xfxjelgcmpzqj", model.properties().patternTypeMetrics().get(0).metricName());
        Assertions.assertEquals(977918878, model.properties().patternTypeMetrics().get(0).metricValue());
        Assertions.assertEquals("cmnlzijiufehg", model.properties().sourceMetrics().get(0).metricName());
        Assertions.assertEquals(1219920563, model.properties().sourceMetrics().get(0).metricValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ThreatIntelligenceMetrics model
            = new ThreatIntelligenceMetrics().withProperties(new ThreatIntelligenceMetric().withLastUpdatedTimeUtc("d")
                .withThreatTypeMetrics(Arrays.asList(
                    new ThreatIntelligenceMetricEntity().withMetricName("zralcxpjbyyps").withMetricValue(235471293),
                    new ThreatIntelligenceMetricEntity().withMetricName("jenkyh").withMetricValue(327752705)))
                .withPatternTypeMetrics(Arrays.asList(
                    new ThreatIntelligenceMetricEntity().withMetricName("xfxjelgcmpzqj").withMetricValue(977918878),
                    new ThreatIntelligenceMetricEntity().withMetricName("xuwyvc").withMetricValue(240512876),
                    new ThreatIntelligenceMetricEntity().withMetricName("v").withMetricValue(1355684710),
                    new ThreatIntelligenceMetricEntity().withMetricName("izus").withMetricValue(997858640)))
                .withSourceMetrics(Arrays.asList(
                    new ThreatIntelligenceMetricEntity().withMetricName("cmnlzijiufehg").withMetricValue(1219920563))));
        model = BinaryData.fromObject(model).toObject(ThreatIntelligenceMetrics.class);
        Assertions.assertEquals("d", model.properties().lastUpdatedTimeUtc());
        Assertions.assertEquals("zralcxpjbyyps", model.properties().threatTypeMetrics().get(0).metricName());
        Assertions.assertEquals(235471293, model.properties().threatTypeMetrics().get(0).metricValue());
        Assertions.assertEquals("xfxjelgcmpzqj", model.properties().patternTypeMetrics().get(0).metricName());
        Assertions.assertEquals(977918878, model.properties().patternTypeMetrics().get(0).metricValue());
        Assertions.assertEquals("cmnlzijiufehg", model.properties().sourceMetrics().get(0).metricName());
        Assertions.assertEquals(1219920563, model.properties().sourceMetrics().get(0).metricValue());
    }
}
