// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ScalingPlanPooledScheduleInner;
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostLoadBalancingAlgorithm;
import com.azure.resourcemanager.desktopvirtualization.models.StopHostsWhen;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScalingPlanPooledScheduleInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScalingPlanPooledScheduleInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"daysOfWeek\":[\"Wednesday\",\"Tuesday\"],\"rampUpStartTime\":{\"hour\":1990735678,\"minute\":876126569},\"rampUpLoadBalancingAlgorithm\":\"DepthFirst\",\"rampUpMinimumHostsPct\":138354171,\"rampUpCapacityThresholdPct\":1131914831,\"peakStartTime\":{\"hour\":1267034334,\"minute\":872540735},\"peakLoadBalancingAlgorithm\":\"BreadthFirst\",\"rampDownStartTime\":{\"hour\":284483918,\"minute\":31023932},\"rampDownLoadBalancingAlgorithm\":\"BreadthFirst\",\"rampDownMinimumHostsPct\":1662245915,\"rampDownCapacityThresholdPct\":1149825898,\"rampDownForceLogoffUsers\":false,\"rampDownStopHostsWhen\":\"ZeroActiveSessions\",\"rampDownWaitTimeMinutes\":990417532,\"rampDownNotificationMessage\":\"pjmkhfxobbc\",\"offPeakStartTime\":{\"hour\":198742016,\"minute\":1117876876},\"offPeakLoadBalancingAlgorithm\":\"DepthFirst\"},\"id\":\"riplrbpbewtg\",\"name\":\"fgb\",\"type\":\"c\"}")
                .toObject(ScalingPlanPooledScheduleInner.class);
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(1990735678, model.rampUpStartTime().hour());
        Assertions.assertEquals(876126569, model.rampUpStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.rampUpLoadBalancingAlgorithm());
        Assertions.assertEquals(138354171, model.rampUpMinimumHostsPct());
        Assertions.assertEquals(1131914831, model.rampUpCapacityThresholdPct());
        Assertions.assertEquals(1267034334, model.peakStartTime().hour());
        Assertions.assertEquals(872540735, model.peakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST, model.peakLoadBalancingAlgorithm());
        Assertions.assertEquals(284483918, model.rampDownStartTime().hour());
        Assertions.assertEquals(31023932, model.rampDownStartTime().minute());
        Assertions
            .assertEquals(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST, model.rampDownLoadBalancingAlgorithm());
        Assertions.assertEquals(1662245915, model.rampDownMinimumHostsPct());
        Assertions.assertEquals(1149825898, model.rampDownCapacityThresholdPct());
        Assertions.assertEquals(false, model.rampDownForceLogoffUsers());
        Assertions.assertEquals(StopHostsWhen.ZERO_ACTIVE_SESSIONS, model.rampDownStopHostsWhen());
        Assertions.assertEquals(990417532, model.rampDownWaitTimeMinutes());
        Assertions.assertEquals("pjmkhfxobbc", model.rampDownNotificationMessage());
        Assertions.assertEquals(198742016, model.offPeakStartTime().hour());
        Assertions.assertEquals(1117876876, model.offPeakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.offPeakLoadBalancingAlgorithm());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScalingPlanPooledScheduleInner model =
            new ScalingPlanPooledScheduleInner()
                .withDaysOfWeek(Arrays.asList(DayOfWeek.WEDNESDAY, DayOfWeek.TUESDAY))
                .withRampUpStartTime(new Time().withHour(1990735678).withMinute(876126569))
                .withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                .withRampUpMinimumHostsPct(138354171)
                .withRampUpCapacityThresholdPct(1131914831)
                .withPeakStartTime(new Time().withHour(1267034334).withMinute(872540735))
                .withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST)
                .withRampDownStartTime(new Time().withHour(284483918).withMinute(31023932))
                .withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST)
                .withRampDownMinimumHostsPct(1662245915)
                .withRampDownCapacityThresholdPct(1149825898)
                .withRampDownForceLogoffUsers(false)
                .withRampDownStopHostsWhen(StopHostsWhen.ZERO_ACTIVE_SESSIONS)
                .withRampDownWaitTimeMinutes(990417532)
                .withRampDownNotificationMessage("pjmkhfxobbc")
                .withOffPeakStartTime(new Time().withHour(198742016).withMinute(1117876876))
                .withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST);
        model = BinaryData.fromObject(model).toObject(ScalingPlanPooledScheduleInner.class);
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(1990735678, model.rampUpStartTime().hour());
        Assertions.assertEquals(876126569, model.rampUpStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.rampUpLoadBalancingAlgorithm());
        Assertions.assertEquals(138354171, model.rampUpMinimumHostsPct());
        Assertions.assertEquals(1131914831, model.rampUpCapacityThresholdPct());
        Assertions.assertEquals(1267034334, model.peakStartTime().hour());
        Assertions.assertEquals(872540735, model.peakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST, model.peakLoadBalancingAlgorithm());
        Assertions.assertEquals(284483918, model.rampDownStartTime().hour());
        Assertions.assertEquals(31023932, model.rampDownStartTime().minute());
        Assertions
            .assertEquals(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST, model.rampDownLoadBalancingAlgorithm());
        Assertions.assertEquals(1662245915, model.rampDownMinimumHostsPct());
        Assertions.assertEquals(1149825898, model.rampDownCapacityThresholdPct());
        Assertions.assertEquals(false, model.rampDownForceLogoffUsers());
        Assertions.assertEquals(StopHostsWhen.ZERO_ACTIVE_SESSIONS, model.rampDownStopHostsWhen());
        Assertions.assertEquals(990417532, model.rampDownWaitTimeMinutes());
        Assertions.assertEquals("pjmkhfxobbc", model.rampDownNotificationMessage());
        Assertions.assertEquals(198742016, model.offPeakStartTime().hour());
        Assertions.assertEquals(1117876876, model.offPeakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.offPeakLoadBalancingAlgorithm());
    }
}
