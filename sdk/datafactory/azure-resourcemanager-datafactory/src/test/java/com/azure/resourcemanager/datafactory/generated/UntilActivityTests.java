// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.Expression;
import com.azure.resourcemanager.datafactory.models.UntilActivity;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class UntilActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UntilActivity model = BinaryData.fromString(
            "{\"type\":\"Until\",\"typeProperties\":{\"expression\":{\"value\":\"udfixhxl\"},\"timeout\":\"datazqhtgtadtootkgxx\",\"activities\":[{\"type\":\"Activity\",\"name\":\"enlqwxskltzzp\",\"description\":\"wgtmpytomftubh\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"yj\",\"dependencyConditions\":[\"Succeeded\"],\"\":{\"llihwpsrdaoixgqt\":\"datazdazxfz\",\"ix\":\"datasjnlekotqhd\"}},{\"activity\":\"nchyoimt\",\"dependencyConditions\":[\"Skipped\",\"Completed\",\"Succeeded\"],\"\":{\"bgclgby\":\"datawxeknhvccxuntghw\",\"kcqvhwzeukumlnfx\":\"datacbc\",\"iywzgvcmuiqir\":\"dataoqvgw\",\"zbnqmxirspj\":\"datasznxz\"}},{\"activity\":\"akrbew\",\"dependencyConditions\":[\"Succeeded\",\"Succeeded\",\"Succeeded\"],\"\":{\"xgmzyqftlafeco\":\"dataourwvgnsdluqu\",\"za\":\"datafnxtynus\"}}],\"userProperties\":[{\"name\":\"t\",\"value\":\"datanylkwb\"}],\"\":{\"egu\":\"datajfjuzwi\",\"zyyyl\":\"datazlmhpuqlsdwtejx\",\"qpccp\":\"dataxu\",\"hogjaubpl\":\"dataychob\"}}]},\"name\":\"zjglfrwymwujt\",\"description\":\"d\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"ljytyqbtij\",\"dependencyConditions\":[\"Completed\"],\"\":{\"rsrgbfaq\":\"datagclppwdfxhz\"}},{\"activity\":\"zakisipjgvmrb\",\"dependencyConditions\":[\"Succeeded\",\"Succeeded\",\"Completed\",\"Failed\"],\"\":{\"ffgconiydgnxs\":\"dataxuubwjopkldubqfb\",\"s\":\"datayytnmhlank\",\"khkiaybdivx\":\"datafvmfyxle\",\"zndlgq\":\"dataxwdfm\"}}],\"userProperties\":[{\"name\":\"jczcorct\",\"value\":\"datawtxaaf\"},{\"name\":\"vqhmsdodmrzsni\",\"value\":\"datakhbmwlfo\"},{\"name\":\"yt\",\"value\":\"datajphzxmcpsepkrdge\"}],\"\":{\"bp\":\"dataxkpxrfulqhhmnd\",\"jmel\":\"datadg\",\"gfaiyvmpfebsummy\":\"datakzmfmgboyliopbo\",\"ckuhgbrvh\":\"datarxnneqxsdupmr\"}}")
            .toObject(UntilActivity.class);
        Assertions.assertEquals("zjglfrwymwujt", model.name());
        Assertions.assertEquals("d", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("ljytyqbtij", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("jczcorct", model.userProperties().get(0).name());
        Assertions.assertEquals("udfixhxl", model.expression().value());
        Assertions.assertEquals("enlqwxskltzzp", model.activities().get(0).name());
        Assertions.assertEquals("wgtmpytomftubh", model.activities().get(0).description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.activities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("yj", model.activities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED,
            model.activities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("t", model.activities().get(0).userProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UntilActivity model = new UntilActivity().withName("zjglfrwymwujt")
            .withDescription("d")
            .withState(ActivityState.ACTIVE)
            .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
            .withDependsOn(Arrays.asList(
                new ActivityDependency().withActivity("ljytyqbtij")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("zakisipjgvmrb")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED,
                        DependencyCondition.SUCCEEDED, DependencyCondition.COMPLETED, DependencyCondition.FAILED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("jczcorct").withValue("datawtxaaf"),
                new UserProperty().withName("vqhmsdodmrzsni").withValue("datakhbmwlfo"),
                new UserProperty().withName("yt").withValue("datajphzxmcpsepkrdge")))
            .withExpression(new Expression().withValue("udfixhxl"))
            .withTimeout("datazqhtgtadtootkgxx")
            .withActivities(Arrays.asList(new Activity().withName("enlqwxskltzzp")
                .withDescription("wgtmpytomftubh")
                .withState(ActivityState.INACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
                .withDependsOn(Arrays.asList(
                    new ActivityDependency().withActivity("yj")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("nchyoimt")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED,
                            DependencyCondition.COMPLETED, DependencyCondition.SUCCEEDED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("akrbew")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED,
                            DependencyCondition.SUCCEEDED, DependencyCondition.SUCCEEDED))
                        .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("t").withValue("datanylkwb")))
                .withAdditionalProperties(mapOf("type", "Activity"))));
        model = BinaryData.fromObject(model).toObject(UntilActivity.class);
        Assertions.assertEquals("zjglfrwymwujt", model.name());
        Assertions.assertEquals("d", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("ljytyqbtij", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("jczcorct", model.userProperties().get(0).name());
        Assertions.assertEquals("udfixhxl", model.expression().value());
        Assertions.assertEquals("enlqwxskltzzp", model.activities().get(0).name());
        Assertions.assertEquals("wgtmpytomftubh", model.activities().get(0).description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.activities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("yj", model.activities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED,
            model.activities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("t", model.activities().get(0).userProperties().get(0).name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
