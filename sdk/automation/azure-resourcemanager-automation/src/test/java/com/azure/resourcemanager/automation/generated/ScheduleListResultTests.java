// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.fluent.models.ScheduleInner;
import com.azure.resourcemanager.automation.models.AdvancedSchedule;
import com.azure.resourcemanager.automation.models.AdvancedScheduleMonthlyOccurrence;
import com.azure.resourcemanager.automation.models.ScheduleFrequency;
import com.azure.resourcemanager.automation.models.ScheduleListResult;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScheduleListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"startTime\":\"2021-04-22T16:40:06Z\",\"startTimeOffsetMinutes\":91.20411784575664,\"expiryTime\":\"2021-03-02T03:59:46Z\",\"expiryTimeOffsetMinutes\":42.219058248980744,\"isEnabled\":true,\"nextRun\":\"2021-04-30T06:28:47Z\",\"nextRunOffsetMinutes\":91.09711780122397,\"interval\":\"dataagr\",\"frequency\":\"Minute\",\"timeZone\":\"teusqczkvyklxu\",\"advancedSchedule\":{\"weekDays\":[\"ff\",\"mfblcqcuubg\",\"ibrta\"],\"monthDays\":[1066879045,1690066547,38344578,1172631030],\"monthlyOccurrences\":[{},{},{},{}]},\"creationTime\":\"2021-03-28T07:37:54Z\",\"lastModifiedTime\":\"2021-04-12T11:40:34Z\",\"description\":\"hhrmooizqsey\"},\"id\":\"xiutcx\",\"name\":\"pzhyr\",\"type\":\"etoge\"},{\"properties\":{\"startTime\":\"2021-07-24T12:15:08Z\",\"startTimeOffsetMinutes\":43.94759869596445,\"expiryTime\":\"2020-12-28T12:20:27Z\",\"expiryTimeOffsetMinutes\":89.317452250987,\"isEnabled\":true,\"nextRun\":\"2021-09-04T15:55:16Z\",\"nextRunOffsetMinutes\":64.15137412035955,\"interval\":\"datacjbtrgaehvvib\",\"frequency\":\"Minute\",\"timeZone\":\"s\",\"advancedSchedule\":{\"weekDays\":[\"eitpkxztmo\",\"bklftidgfcwqmpim\"],\"monthDays\":[754106802,1167127831],\"monthlyOccurrences\":[{},{},{},{}]},\"creationTime\":\"2021-09-13T09:48:54Z\",\"lastModifiedTime\":\"2021-01-27T14:02:54Z\",\"description\":\"jswtwkozzwc\"},\"id\":\"lkb\",\"name\":\"wpfaj\",\"type\":\"jwltlwtjjgu\"}],\"nextLink\":\"alhsnvkc\"}")
            .toObject(ScheduleListResult.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-22T16:40:06Z"), model.value().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-02T03:59:46Z"), model.value().get(0).expiryTime());
        Assertions.assertEquals(42.219058248980744D, model.value().get(0).expiryTimeOffsetMinutes());
        Assertions.assertEquals(true, model.value().get(0).isEnabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-30T06:28:47Z"), model.value().get(0).nextRun());
        Assertions.assertEquals(91.09711780122397D, model.value().get(0).nextRunOffsetMinutes());
        Assertions.assertEquals(ScheduleFrequency.MINUTE, model.value().get(0).frequency());
        Assertions.assertEquals("teusqczkvyklxu", model.value().get(0).timeZone());
        Assertions.assertEquals("ff", model.value().get(0).advancedSchedule().weekDays().get(0));
        Assertions.assertEquals(1066879045, model.value().get(0).advancedSchedule().monthDays().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-28T07:37:54Z"), model.value().get(0).creationTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-12T11:40:34Z"), model.value().get(0).lastModifiedTime());
        Assertions.assertEquals("hhrmooizqsey", model.value().get(0).description());
        Assertions.assertEquals("alhsnvkc", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleListResult model
            = new ScheduleListResult()
                .withValue(
                    Arrays.asList(
                        new ScheduleInner().withStartTime(OffsetDateTime.parse("2021-04-22T16:40:06Z"))
                            .withExpiryTime(OffsetDateTime.parse("2021-03-02T03:59:46Z"))
                            .withExpiryTimeOffsetMinutes(42.219058248980744D)
                            .withIsEnabled(true)
                            .withNextRun(OffsetDateTime.parse("2021-04-30T06:28:47Z"))
                            .withNextRunOffsetMinutes(91.09711780122397D)
                            .withInterval("dataagr")
                            .withFrequency(ScheduleFrequency.MINUTE)
                            .withTimeZone("teusqczkvyklxu")
                            .withAdvancedSchedule(new AdvancedSchedule()
                                .withWeekDays(Arrays.asList("ff", "mfblcqcuubg", "ibrta"))
                                .withMonthDays(Arrays.asList(1066879045, 1690066547, 38344578, 1172631030))
                                .withMonthlyOccurrences(Arrays.asList(new AdvancedScheduleMonthlyOccurrence(),
                                    new AdvancedScheduleMonthlyOccurrence(), new AdvancedScheduleMonthlyOccurrence(),
                                    new AdvancedScheduleMonthlyOccurrence())))
                            .withCreationTime(OffsetDateTime.parse("2021-03-28T07:37:54Z"))
                            .withLastModifiedTime(OffsetDateTime.parse("2021-04-12T11:40:34Z"))
                            .withDescription("hhrmooizqsey"),
                        new ScheduleInner().withStartTime(OffsetDateTime.parse("2021-07-24T12:15:08Z"))
                            .withExpiryTime(OffsetDateTime.parse("2020-12-28T12:20:27Z"))
                            .withExpiryTimeOffsetMinutes(89.317452250987D)
                            .withIsEnabled(true)
                            .withNextRun(OffsetDateTime.parse("2021-09-04T15:55:16Z"))
                            .withNextRunOffsetMinutes(64.15137412035955D)
                            .withInterval("datacjbtrgaehvvib")
                            .withFrequency(ScheduleFrequency.MINUTE)
                            .withTimeZone("s")
                            .withAdvancedSchedule(new AdvancedSchedule()
                                .withWeekDays(Arrays.asList("eitpkxztmo", "bklftidgfcwqmpim"))
                                .withMonthDays(Arrays.asList(754106802, 1167127831))
                                .withMonthlyOccurrences(Arrays.asList(new AdvancedScheduleMonthlyOccurrence(),
                                    new AdvancedScheduleMonthlyOccurrence(), new AdvancedScheduleMonthlyOccurrence(),
                                    new AdvancedScheduleMonthlyOccurrence())))
                            .withCreationTime(OffsetDateTime.parse("2021-09-13T09:48:54Z"))
                            .withLastModifiedTime(OffsetDateTime.parse("2021-01-27T14:02:54Z"))
                            .withDescription("jswtwkozzwc")))
                .withNextLink("alhsnvkc");
        model = BinaryData.fromObject(model).toObject(ScheduleListResult.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-22T16:40:06Z"), model.value().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-02T03:59:46Z"), model.value().get(0).expiryTime());
        Assertions.assertEquals(42.219058248980744D, model.value().get(0).expiryTimeOffsetMinutes());
        Assertions.assertEquals(true, model.value().get(0).isEnabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-30T06:28:47Z"), model.value().get(0).nextRun());
        Assertions.assertEquals(91.09711780122397D, model.value().get(0).nextRunOffsetMinutes());
        Assertions.assertEquals(ScheduleFrequency.MINUTE, model.value().get(0).frequency());
        Assertions.assertEquals("teusqczkvyklxu", model.value().get(0).timeZone());
        Assertions.assertEquals("ff", model.value().get(0).advancedSchedule().weekDays().get(0));
        Assertions.assertEquals(1066879045, model.value().get(0).advancedSchedule().monthDays().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-28T07:37:54Z"), model.value().get(0).creationTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-12T11:40:34Z"), model.value().get(0).lastModifiedTime());
        Assertions.assertEquals("hhrmooizqsey", model.value().get(0).description());
        Assertions.assertEquals("alhsnvkc", model.nextLink());
    }
}
