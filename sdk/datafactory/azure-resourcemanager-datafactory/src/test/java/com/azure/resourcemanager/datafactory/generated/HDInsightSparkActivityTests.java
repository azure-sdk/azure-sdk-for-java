// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.HDInsightSparkActivity;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HDInsightSparkActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HDInsightSparkActivity model = BinaryData.fromString(
            "{\"type\":\"HDInsightSpark\",\"typeProperties\":{\"rootPath\":\"datatpgll\",\"entryFilePath\":\"datarrank\",\"arguments\":[\"datatn\",\"datarohlkgzczjwiz\",\"dataulrkw\",\"dataldttggc\"],\"getDebugInfo\":\"None\",\"sparkJobLinkedService\":{\"referenceName\":\"pobenaahdjn\",\"parameters\":{\"wpbvwuqhpph\":\"datahtvpeirhs\",\"zxdlrjspxoty\":\"dataimoecqpqkpnvsua\",\"ugfejiurl\":\"datag\"}},\"className\":\"ftmllcdqvunvngg\",\"proxyUser\":\"datacforuwqbendz\",\"sparkConfig\":{\"qqsvofocppph\":\"datascbsttjdioevif\",\"xsofsirit\":\"datavduuzpiooac\",\"nouxevizzcjnf\":\"dataqqpynr\",\"numpna\":\"dataubctwnfnq\"}},\"linkedServiceName\":{\"referenceName\":\"pkleieafpvbsllyo\",\"parameters\":{\"muylskbvv\":\"datadhnbofeucctppbgz\",\"urxvjdxl\":\"datadftrqsobu\"}},\"policy\":{\"timeout\":\"dataskck\",\"retry\":\"dataxtknywxpmefbn\",\"retryIntervalInSeconds\":342655149,\"secureInput\":true,\"secureOutput\":false,\"\":{\"dnugbisfnbt\":\"datamify\",\"vki\":\"datadrkwridroidhbu\"}},\"name\":\"yhnfqnekpxd\",\"description\":\"e\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"hnsmkt\",\"dependencyConditions\":[\"Succeeded\",\"Skipped\",\"Skipped\",\"Skipped\"],\"\":{\"aurviynt\":\"dataolobtzrgxn\",\"zoqtfbjk\":\"datablp\",\"blb\":\"datafkte\",\"fohipijfywmmqz\":\"datangrkjbdaxttoe\"}},{\"activity\":\"znrjws\",\"dependencyConditions\":[\"Skipped\",\"Succeeded\",\"Failed\"],\"\":{\"axdiund\":\"datankxj\",\"bfnt\":\"dataawotpiaklefwai\",\"feudcg\":\"datamkeaw\",\"ffnngiu\":\"dataljbnfw\"}},{\"activity\":\"bpgskgpwspxhhnv\",\"dependencyConditions\":[\"Completed\",\"Succeeded\",\"Completed\"],\"\":{\"wefstize\":\"datatgmd\"}}],\"userProperties\":[{\"name\":\"gzc\",\"value\":\"databgwl\"}],\"\":{\"jpxpwxabvxwoa\":\"dataddflckum\",\"ozkm\":\"dataoeillszdgy\",\"yrwdmgrfhvew\":\"databzuilynbdvbuxlji\"}}")
            .toObject(HDInsightSparkActivity.class);
        Assertions.assertEquals("yhnfqnekpxd", model.name());
        Assertions.assertEquals("e", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("hnsmkt", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("gzc", model.userProperties().get(0).name());
        Assertions.assertEquals("pkleieafpvbsllyo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(342655149, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.NONE, model.getDebugInfo());
        Assertions.assertEquals("pobenaahdjn", model.sparkJobLinkedService().referenceName());
        Assertions.assertEquals("ftmllcdqvunvngg", model.className());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HDInsightSparkActivity model
            = new HDInsightSparkActivity().withName("yhnfqnekpxd")
                .withDescription("e")
                .withState(ActivityState.ACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
                .withDependsOn(Arrays.asList(
                    new ActivityDependency().withActivity("hnsmkt")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED,
                            DependencyCondition.SKIPPED, DependencyCondition.SKIPPED, DependencyCondition.SKIPPED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("znrjws")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED,
                            DependencyCondition.SUCCEEDED, DependencyCondition.FAILED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("bpgskgpwspxhhnv")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED,
                            DependencyCondition.SUCCEEDED, DependencyCondition.COMPLETED))
                        .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("gzc").withValue("databgwl")))
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("pkleieafpvbsllyo")
                    .withParameters(mapOf("muylskbvv", "datadhnbofeucctppbgz", "urxvjdxl", "datadftrqsobu")))
                .withPolicy(new ActivityPolicy().withTimeout("dataskck")
                    .withRetry("dataxtknywxpmefbn")
                    .withRetryIntervalInSeconds(342655149)
                    .withSecureInput(true)
                    .withSecureOutput(false)
                    .withAdditionalProperties(mapOf()))
                .withRootPath("datatpgll")
                .withEntryFilePath("datarrank")
                .withArguments(Arrays.asList("datatn", "datarohlkgzczjwiz", "dataulrkw", "dataldttggc"))
                .withGetDebugInfo(HDInsightActivityDebugInfoOption.NONE)
                .withSparkJobLinkedService(new LinkedServiceReference().withReferenceName("pobenaahdjn")
                    .withParameters(mapOf("wpbvwuqhpph", "datahtvpeirhs", "zxdlrjspxoty", "dataimoecqpqkpnvsua",
                        "ugfejiurl", "datag")))
                .withClassName("ftmllcdqvunvngg")
                .withProxyUser("datacforuwqbendz")
                .withSparkConfig(mapOf("qqsvofocppph", "datascbsttjdioevif", "xsofsirit", "datavduuzpiooac",
                    "nouxevizzcjnf", "dataqqpynr", "numpna", "dataubctwnfnq"));
        model = BinaryData.fromObject(model).toObject(HDInsightSparkActivity.class);
        Assertions.assertEquals("yhnfqnekpxd", model.name());
        Assertions.assertEquals("e", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("hnsmkt", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("gzc", model.userProperties().get(0).name());
        Assertions.assertEquals("pkleieafpvbsllyo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(342655149, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.NONE, model.getDebugInfo());
        Assertions.assertEquals("pobenaahdjn", model.sparkJobLinkedService().referenceName());
        Assertions.assertEquals("ftmllcdqvunvngg", model.className());
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
