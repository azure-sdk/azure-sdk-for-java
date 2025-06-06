// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.costmanagement.CostManagementManager;
import com.azure.resourcemanager.costmanagement.models.ForecastAggregation;
import com.azure.resourcemanager.costmanagement.models.ForecastComparisonExpression;
import com.azure.resourcemanager.costmanagement.models.ForecastDataset;
import com.azure.resourcemanager.costmanagement.models.ForecastDatasetConfiguration;
import com.azure.resourcemanager.costmanagement.models.ForecastDefinition;
import com.azure.resourcemanager.costmanagement.models.ForecastFilter;
import com.azure.resourcemanager.costmanagement.models.ForecastOperatorType;
import com.azure.resourcemanager.costmanagement.models.ForecastResult;
import com.azure.resourcemanager.costmanagement.models.ForecastTimePeriod;
import com.azure.resourcemanager.costmanagement.models.ForecastTimeframe;
import com.azure.resourcemanager.costmanagement.models.ForecastType;
import com.azure.resourcemanager.costmanagement.models.FunctionName;
import com.azure.resourcemanager.costmanagement.models.FunctionType;
import com.azure.resourcemanager.costmanagement.models.GranularityType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ForecastsUsageWithResponseMockTests {
    @Test
    public void testUsageWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"nextLink\":\"pxwgsa\",\"columns\":[{\"name\":\"powzafcz\",\"type\":\"mlj\"}],\"rows\":[[\"datapefyc\",\"dataveitit\"]]},\"sku\":\"s\",\"eTag\":\"ajlnsjhwjuyxx\",\"location\":\"xqvmvuay\",\"tags\":{\"eqbw\":\"dxk\",\"xsl\":\"ntghyksarcdr\",\"x\":\"vlzladl\",\"wzdanojisgglmvo\":\"pbqhvfdqqjwkr\"},\"id\":\"atuztjct\",\"name\":\"bpvbkaehxsmzygd\",\"type\":\"wakwseivmakxhys\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CostManagementManager manager = CostManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ForecastResult response
            = manager.forecasts()
                .usageWithResponse("rmpwctofld",
                    new ForecastDefinition().withType(ForecastType.ACTUAL_COST)
                        .withTimeframe(ForecastTimeframe.CUSTOM)
                        .withTimePeriod(new ForecastTimePeriod().withFrom(OffsetDateTime.parse("2020-12-26T00:57:10Z"))
                            .withTo(OffsetDateTime.parse("2021-02-12T16:16:33Z")))
                        .withDataset(new ForecastDataset().withGranularity(GranularityType.DAILY)
                            .withConfiguration(new ForecastDatasetConfiguration()
                                .withColumns(Arrays.asList("rfgdrwj", "yewhfjsrwq", "xet")))
                            .withAggregation(mapOf("vrrmdqntycn",
                                new ForecastAggregation().withName(FunctionName.PRE_TAX_COST_USD)
                                    .withFunction(FunctionType.SUM),
                                "hvmaxgnuyeamcmhu",
                                new ForecastAggregation().withName(FunctionName.PRE_TAX_COST_USD)
                                    .withFunction(FunctionType.SUM),
                                "ecehokw",
                                new ForecastAggregation().withName(FunctionName.COST).withFunction(FunctionType.SUM),
                                "twloesqr", new ForecastAggregation().withName(FunctionName.PRE_TAX_COST)
                                    .withFunction(FunctionType.SUM)))
                            .withFilter(
                                new ForecastFilter()
                                    .withAnd(Arrays.asList(new ForecastFilter()
                                        .withAnd(Arrays.asList(new ForecastFilter(), new ForecastFilter()))
                                        .withOr(Arrays.asList(new ForecastFilter(), new ForecastFilter()))
                                        .withDimensions(new ForecastComparisonExpression()
                                            .withName("koilaci")
                                            .withOperator(ForecastOperatorType.IN)
                                            .withValues(Arrays.asList()))
                                        .withTags(new ForecastComparisonExpression()
                                            .withName("jleip")
                                            .withOperator(ForecastOperatorType.IN)
                                            .withValues(Arrays.asList())),
                                        new ForecastFilter()
                                            .withAnd(Arrays.asList(new ForecastFilter(), new ForecastFilter(),
                                                new ForecastFilter()))
                                            .withOr(Arrays.asList(new ForecastFilter(), new ForecastFilter(),
                                                new ForecastFilter()))
                                            .withDimensions(new ForecastComparisonExpression().withName("zr")
                                                .withOperator(ForecastOperatorType.IN)
                                                .withValues(Arrays.asList()))
                                            .withTags(
                                                new ForecastComparisonExpression().withName("thqkkwhbgxvellv")
                                                    .withOperator(ForecastOperatorType.IN)
                                                    .withValues(Arrays.asList())),
                                        new ForecastFilter()
                                            .withAnd(Arrays.asList(new ForecastFilter()))
                                            .withOr(Arrays.asList(new ForecastFilter(), new ForecastFilter()))
                                            .withDimensions(new ForecastComparisonExpression().withName("itmujdtvm")
                                                .withOperator(ForecastOperatorType.IN)
                                                .withValues(Arrays.asList()))
                                            .withTags(new ForecastComparisonExpression()
                                                .withName("ymffhmjpddnyx")
                                                .withOperator(ForecastOperatorType.IN)
                                                .withValues(Arrays.asList())),
                                        new ForecastFilter().withAnd(Arrays.asList(new ForecastFilter()))
                                            .withOr(Arrays.asList(new ForecastFilter(), new ForecastFilter(),
                                                new ForecastFilter()))
                                            .withDimensions(new ForecastComparisonExpression().withName("z")
                                                .withOperator(ForecastOperatorType.IN)
                                                .withValues(Arrays.asList()))
                                            .withTags(new ForecastComparisonExpression().withName("jqrbrpvnm")
                                                .withOperator(ForecastOperatorType.IN)
                                                .withValues(Arrays.asList()))))
                                    .withOr(Arrays.asList(
                                        new ForecastFilter()
                                            .withAnd(Arrays.asList(new ForecastFilter(), new ForecastFilter(),
                                                new ForecastFilter(), new ForecastFilter()))
                                            .withOr(Arrays.asList(new ForecastFilter(), new ForecastFilter()))
                                            .withDimensions(new ForecastComparisonExpression().withName("jpp")
                                                .withOperator(ForecastOperatorType.IN)
                                                .withValues(Arrays.asList()))
                                            .withTags(new ForecastComparisonExpression().withName("ohoqkpjtnqjilayw")
                                                .withOperator(ForecastOperatorType.IN)
                                                .withValues(Arrays.asList())),
                                        new ForecastFilter().withAnd(Arrays.asList(new ForecastFilter()))
                                            .withOr(Arrays.asList(new ForecastFilter(), new ForecastFilter(),
                                                new ForecastFilter(), new ForecastFilter()))
                                            .withDimensions(new ForecastComparisonExpression().withName("yrilmhxdqaolf")
                                                .withOperator(ForecastOperatorType.IN)
                                                .withValues(Arrays.asList()))
                                            .withTags(new ForecastComparisonExpression().withName("kkbjpjv")
                                                .withOperator(ForecastOperatorType.IN)
                                                .withValues(Arrays.asList())),
                                        new ForecastFilter().withAnd(Arrays.asList(new ForecastFilter()))
                                            .withOr(Arrays.asList(new ForecastFilter()))
                                            .withDimensions(new ForecastComparisonExpression().withName("wob")
                                                .withOperator(ForecastOperatorType.IN)
                                                .withValues(Arrays.asList()))
                                            .withTags(new ForecastComparisonExpression().withName("hlwyjfnqzocrd")
                                                .withOperator(ForecastOperatorType.IN)
                                                .withValues(Arrays.asList()))))
                                    .withDimensions(new ForecastComparisonExpression().withName("zeunt")
                                        .withOperator(ForecastOperatorType.IN)
                                        .withValues(Arrays.asList("ncaqttiekoifu")))
                                    .withTags(new ForecastComparisonExpression().withName("yttzgixgyrih")
                                        .withOperator(ForecastOperatorType.IN)
                                        .withValues(Arrays.asList("gbehlqtxnr")))))
                        .withIncludeActualCost(true)
                        .withIncludeFreshPartialCost(false),
                    "rndpgfjodhdaqotw", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("xqvmvuay", response.location());
        Assertions.assertEquals("dxk", response.tags().get("eqbw"));
        Assertions.assertEquals("pxwgsa", response.nextLink());
        Assertions.assertEquals("powzafcz", response.columns().get(0).name());
        Assertions.assertEquals("mlj", response.columns().get(0).type());
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
