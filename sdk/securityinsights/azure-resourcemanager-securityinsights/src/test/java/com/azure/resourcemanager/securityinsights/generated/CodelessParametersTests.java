// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.CodelessParameters;
import com.azure.resourcemanager.securityinsights.models.Availability;
import com.azure.resourcemanager.securityinsights.models.AvailabilityStatus;
import com.azure.resourcemanager.securityinsights.models.CodelessUiConnectorConfigProperties;
import com.azure.resourcemanager.securityinsights.models.CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem;
import com.azure.resourcemanager.securityinsights.models.CodelessUiConnectorConfigPropertiesDataTypesItem;
import com.azure.resourcemanager.securityinsights.models.CodelessUiConnectorConfigPropertiesGraphQueriesItem;
import com.azure.resourcemanager.securityinsights.models.CodelessUiConnectorConfigPropertiesInstructionStepsItem;
import com.azure.resourcemanager.securityinsights.models.CodelessUiConnectorConfigPropertiesSampleQueriesItem;
import com.azure.resourcemanager.securityinsights.models.ConnectivityType;
import com.azure.resourcemanager.securityinsights.models.InstructionStepsInstructionsItem;
import com.azure.resourcemanager.securityinsights.models.PermissionProviderScope;
import com.azure.resourcemanager.securityinsights.models.Permissions;
import com.azure.resourcemanager.securityinsights.models.PermissionsCustomsItem;
import com.azure.resourcemanager.securityinsights.models.PermissionsResourceProviderItem;
import com.azure.resourcemanager.securityinsights.models.ProviderName;
import com.azure.resourcemanager.securityinsights.models.RequiredPermissions;
import com.azure.resourcemanager.securityinsights.models.SettingType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CodelessParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CodelessParameters model = BinaryData.fromString(
            "{\"connectorUiConfig\":{\"title\":\"weghlwwbogvgfk\",\"publisher\":\"qiyndveqels\",\"descriptionMarkdown\":\"fvdstrkzxsgt\",\"customImage\":\"svlrdsmovpimynd\",\"graphQueriesTableName\":\"oxaxnrqaqotn\",\"graphQueries\":[{\"metricName\":\"olousdvrg\",\"legend\":\"qmawzjdrpizfu\",\"baseQuery\":\"yctsdbtqgkuj\"},{\"metricName\":\"ooxrqwoeurb\",\"legend\":\"gapdyarikeej\",\"baseQuery\":\"dfhtwmmkfqbriqul\"},{\"metricName\":\"trj\",\"legend\":\"qkvyhzokpoyuohu\",\"baseQuery\":\"snaajph\"}],\"sampleQueries\":[{\"description\":\"ejnglpwsadaxjsum\",\"query\":\"ezcoioyj\"},{\"description\":\"fqzwqdnxkeed\",\"query\":\"wmywxfqzkvemy\"},{\"description\":\"pczaqpqif\",\"query\":\"m\"}],\"dataTypes\":[{\"name\":\"wtxzuisam\",\"lastDataReceivedQuery\":\"at\"},{\"name\":\"zexroqsqjgh\",\"lastDataReceivedQuery\":\"thsplwsttxsr\"},{\"name\":\"fq\",\"lastDataReceivedQuery\":\"niceovxgzwh\"}],\"connectivityCriteria\":[{\"type\":\"IsConnectedQuery\",\"value\":[\"mtikesliky\",\"hzixyqhfnkvy\"]},{\"type\":\"IsConnectedQuery\",\"value\":[\"seip\",\"quwzxhrptyodl\",\"kfktltdds\",\"bjop\"]}],\"availability\":{\"status\":1,\"isPreview\":true},\"permissions\":{\"resourceProvider\":[{\"provider\":\"Microsoft.OperationalInsights/workspaces\",\"permissionsDisplayText\":\"xs\",\"providerDisplayName\":\"uzyigfcvcewbwqhd\",\"scope\":\"Workspace\",\"requiredPermissions\":{\"action\":false,\"write\":true,\"read\":false,\"delete\":true}},{\"provider\":\"microsoft.aadiam/diagnosticSettings\",\"permissionsDisplayText\":\"s\",\"providerDisplayName\":\"hyqmrejparnpv\",\"scope\":\"ResourceGroup\",\"requiredPermissions\":{\"action\":false,\"write\":true,\"read\":true,\"delete\":true}},{\"provider\":\"Microsoft.OperationalInsights/solutions\",\"permissionsDisplayText\":\"ll\",\"providerDisplayName\":\"lhhfi\",\"scope\":\"Subscription\",\"requiredPermissions\":{\"action\":false,\"write\":true,\"read\":false,\"delete\":false}}],\"customs\":[{\"name\":\"wvyldqpzf\",\"description\":\"soxinu\"},{\"name\":\"lzkdrocqsxy\",\"description\":\"qtcmiwdwisv\"},{\"name\":\"eylajamcajyhft\",\"description\":\"c\"},{\"name\":\"yklleynqanhkiggl\",\"description\":\"walhvubh\"}]},\"instructionSteps\":[{\"title\":\"hetxdqcmyctajqz\",\"description\":\"alec\",\"instructions\":[{\"parameters\":\"datai\",\"type\":\"InfoMessage\"},{\"parameters\":\"datadegyxsbfpzvo\",\"type\":\"CopyableLabel\"},{\"parameters\":\"datantwczfzwushlc\",\"type\":\"InfoMessage\"},{\"parameters\":\"datalalhhezpfkiss\",\"type\":\"CopyableLabel\"}]},{\"title\":\"qzsaaoq\",\"description\":\"gpto\",\"instructions\":[{\"parameters\":\"datafiafc\",\"type\":\"CopyableLabel\"}]},{\"title\":\"tbfijz\",\"description\":\"aoijolb\",\"instructions\":[{\"parameters\":\"datatwieopexelxqdwr\",\"type\":\"InfoMessage\"},{\"parameters\":\"datailjpibk\",\"type\":\"InfoMessage\"},{\"parameters\":\"dataxyauxre\",\"type\":\"InfoMessage\"},{\"parameters\":\"databmcnltmwytku\",\"type\":\"CopyableLabel\"}]}]}}")
            .toObject(CodelessParameters.class);
        Assertions.assertEquals("weghlwwbogvgfk", model.connectorUiConfig().title());
        Assertions.assertEquals("qiyndveqels", model.connectorUiConfig().publisher());
        Assertions.assertEquals("fvdstrkzxsgt", model.connectorUiConfig().descriptionMarkdown());
        Assertions.assertEquals("svlrdsmovpimynd", model.connectorUiConfig().customImage());
        Assertions.assertEquals("oxaxnrqaqotn", model.connectorUiConfig().graphQueriesTableName());
        Assertions.assertEquals("olousdvrg", model.connectorUiConfig().graphQueries().get(0).metricName());
        Assertions.assertEquals("qmawzjdrpizfu", model.connectorUiConfig().graphQueries().get(0).legend());
        Assertions.assertEquals("yctsdbtqgkuj", model.connectorUiConfig().graphQueries().get(0).baseQuery());
        Assertions.assertEquals("ejnglpwsadaxjsum", model.connectorUiConfig().sampleQueries().get(0).description());
        Assertions.assertEquals("ezcoioyj", model.connectorUiConfig().sampleQueries().get(0).query());
        Assertions.assertEquals("wtxzuisam", model.connectorUiConfig().dataTypes().get(0).name());
        Assertions.assertEquals("at", model.connectorUiConfig().dataTypes().get(0).lastDataReceivedQuery());
        Assertions.assertEquals(ConnectivityType.IS_CONNECTED_QUERY,
            model.connectorUiConfig().connectivityCriteria().get(0).type());
        Assertions.assertEquals("mtikesliky", model.connectorUiConfig().connectivityCriteria().get(0).value().get(0));
        Assertions.assertEquals(AvailabilityStatus.ONE, model.connectorUiConfig().availability().status());
        Assertions.assertEquals(true, model.connectorUiConfig().availability().isPreview());
        Assertions.assertEquals(ProviderName.MICROSOFT_OPERATIONAL_INSIGHTS_WORKSPACES,
            model.connectorUiConfig().permissions().resourceProvider().get(0).provider());
        Assertions.assertEquals("xs",
            model.connectorUiConfig().permissions().resourceProvider().get(0).permissionsDisplayText());
        Assertions.assertEquals("uzyigfcvcewbwqhd",
            model.connectorUiConfig().permissions().resourceProvider().get(0).providerDisplayName());
        Assertions.assertEquals(PermissionProviderScope.WORKSPACE,
            model.connectorUiConfig().permissions().resourceProvider().get(0).scope());
        Assertions.assertEquals(false,
            model.connectorUiConfig().permissions().resourceProvider().get(0).requiredPermissions().action());
        Assertions.assertEquals(true,
            model.connectorUiConfig().permissions().resourceProvider().get(0).requiredPermissions().write());
        Assertions.assertEquals(false,
            model.connectorUiConfig().permissions().resourceProvider().get(0).requiredPermissions().read());
        Assertions.assertEquals(true,
            model.connectorUiConfig().permissions().resourceProvider().get(0).requiredPermissions().delete());
        Assertions.assertEquals("wvyldqpzf", model.connectorUiConfig().permissions().customs().get(0).name());
        Assertions.assertEquals("soxinu", model.connectorUiConfig().permissions().customs().get(0).description());
        Assertions.assertEquals("hetxdqcmyctajqz", model.connectorUiConfig().instructionSteps().get(0).title());
        Assertions.assertEquals("alec", model.connectorUiConfig().instructionSteps().get(0).description());
        Assertions.assertEquals(SettingType.INFO_MESSAGE,
            model.connectorUiConfig().instructionSteps().get(0).instructions().get(0).type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CodelessParameters model = new CodelessParameters()
            .withConnectorUiConfig(new CodelessUiConnectorConfigProperties().withTitle("weghlwwbogvgfk")
                .withPublisher("qiyndveqels")
                .withDescriptionMarkdown("fvdstrkzxsgt")
                .withCustomImage("svlrdsmovpimynd")
                .withGraphQueriesTableName("oxaxnrqaqotn")
                .withGraphQueries(Arrays.asList(
                    new CodelessUiConnectorConfigPropertiesGraphQueriesItem().withMetricName("olousdvrg")
                        .withLegend("qmawzjdrpizfu")
                        .withBaseQuery("yctsdbtqgkuj"),
                    new CodelessUiConnectorConfigPropertiesGraphQueriesItem().withMetricName("ooxrqwoeurb")
                        .withLegend("gapdyarikeej")
                        .withBaseQuery("dfhtwmmkfqbriqul"),
                    new CodelessUiConnectorConfigPropertiesGraphQueriesItem().withMetricName("trj")
                        .withLegend("qkvyhzokpoyuohu")
                        .withBaseQuery("snaajph")))
                .withSampleQueries(Arrays.asList(
                    new CodelessUiConnectorConfigPropertiesSampleQueriesItem().withDescription("ejnglpwsadaxjsum")
                        .withQuery("ezcoioyj"),
                    new CodelessUiConnectorConfigPropertiesSampleQueriesItem().withDescription("fqzwqdnxkeed")
                        .withQuery("wmywxfqzkvemy"),
                    new CodelessUiConnectorConfigPropertiesSampleQueriesItem().withDescription("pczaqpqif")
                        .withQuery("m")))
                .withDataTypes(Arrays.asList(
                    new CodelessUiConnectorConfigPropertiesDataTypesItem().withName("wtxzuisam")
                        .withLastDataReceivedQuery("at"),
                    new CodelessUiConnectorConfigPropertiesDataTypesItem().withName("zexroqsqjgh")
                        .withLastDataReceivedQuery("thsplwsttxsr"),
                    new CodelessUiConnectorConfigPropertiesDataTypesItem().withName("fq")
                        .withLastDataReceivedQuery("niceovxgzwh")))
                .withConnectivityCriteria(Arrays.asList(
                    new CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem()
                        .withType(ConnectivityType.IS_CONNECTED_QUERY)
                        .withValue(Arrays.asList("mtikesliky", "hzixyqhfnkvy")),
                    new CodelessUiConnectorConfigPropertiesConnectivityCriteriaItem()
                        .withType(ConnectivityType.IS_CONNECTED_QUERY)
                        .withValue(Arrays.asList("seip", "quwzxhrptyodl", "kfktltdds", "bjop"))))
                .withAvailability(new Availability().withStatus(AvailabilityStatus.ONE).withIsPreview(true))
                .withPermissions(new Permissions()
                    .withResourceProvider(Arrays.asList(
                        new PermissionsResourceProviderItem()
                            .withProvider(ProviderName.MICROSOFT_OPERATIONAL_INSIGHTS_WORKSPACES)
                            .withPermissionsDisplayText("xs")
                            .withProviderDisplayName("uzyigfcvcewbwqhd")
                            .withScope(PermissionProviderScope.WORKSPACE)
                            .withRequiredPermissions(new RequiredPermissions().withAction(false)
                                .withWrite(true)
                                .withRead(false)
                                .withDelete(true)),
                        new PermissionsResourceProviderItem()
                            .withProvider(ProviderName.MICROSOFT_AADIAM_DIAGNOSTIC_SETTINGS)
                            .withPermissionsDisplayText("s")
                            .withProviderDisplayName("hyqmrejparnpv")
                            .withScope(PermissionProviderScope.RESOURCE_GROUP)
                            .withRequiredPermissions(new RequiredPermissions().withAction(false)
                                .withWrite(true)
                                .withRead(true)
                                .withDelete(true)),
                        new PermissionsResourceProviderItem()
                            .withProvider(ProviderName.MICROSOFT_OPERATIONAL_INSIGHTS_SOLUTIONS)
                            .withPermissionsDisplayText("ll")
                            .withProviderDisplayName("lhhfi")
                            .withScope(PermissionProviderScope.SUBSCRIPTION)
                            .withRequiredPermissions(new RequiredPermissions().withAction(false)
                                .withWrite(true)
                                .withRead(false)
                                .withDelete(false))))
                    .withCustoms(
                        Arrays.asList(new PermissionsCustomsItem().withName("wvyldqpzf").withDescription("soxinu"),
                            new PermissionsCustomsItem().withName("lzkdrocqsxy").withDescription("qtcmiwdwisv"),
                            new PermissionsCustomsItem().withName("eylajamcajyhft").withDescription("c"),
                            new PermissionsCustomsItem().withName("yklleynqanhkiggl").withDescription("walhvubh"))))
                .withInstructionSteps(Arrays.asList(
                    new CodelessUiConnectorConfigPropertiesInstructionStepsItem().withTitle("hetxdqcmyctajqz")
                        .withDescription("alec")
                        .withInstructions(Arrays.asList(
                            new InstructionStepsInstructionsItem().withParameters("datai")
                                .withType(SettingType.INFO_MESSAGE),
                            new InstructionStepsInstructionsItem().withParameters("datadegyxsbfpzvo")
                                .withType(SettingType.COPYABLE_LABEL),
                            new InstructionStepsInstructionsItem().withParameters("datantwczfzwushlc")
                                .withType(SettingType.INFO_MESSAGE),
                            new InstructionStepsInstructionsItem().withParameters("datalalhhezpfkiss")
                                .withType(SettingType.COPYABLE_LABEL))),
                    new CodelessUiConnectorConfigPropertiesInstructionStepsItem().withTitle("qzsaaoq")
                        .withDescription("gpto")
                        .withInstructions(
                            Arrays.asList(new InstructionStepsInstructionsItem().withParameters("datafiafc")
                                .withType(SettingType.COPYABLE_LABEL))),
                    new CodelessUiConnectorConfigPropertiesInstructionStepsItem().withTitle("tbfijz")
                        .withDescription("aoijolb")
                        .withInstructions(Arrays.asList(
                            new InstructionStepsInstructionsItem().withParameters("datatwieopexelxqdwr")
                                .withType(SettingType.INFO_MESSAGE),
                            new InstructionStepsInstructionsItem().withParameters("datailjpibk")
                                .withType(SettingType.INFO_MESSAGE),
                            new InstructionStepsInstructionsItem().withParameters("dataxyauxre")
                                .withType(SettingType.INFO_MESSAGE),
                            new InstructionStepsInstructionsItem().withParameters("databmcnltmwytku")
                                .withType(SettingType.COPYABLE_LABEL))))));
        model = BinaryData.fromObject(model).toObject(CodelessParameters.class);
        Assertions.assertEquals("weghlwwbogvgfk", model.connectorUiConfig().title());
        Assertions.assertEquals("qiyndveqels", model.connectorUiConfig().publisher());
        Assertions.assertEquals("fvdstrkzxsgt", model.connectorUiConfig().descriptionMarkdown());
        Assertions.assertEquals("svlrdsmovpimynd", model.connectorUiConfig().customImage());
        Assertions.assertEquals("oxaxnrqaqotn", model.connectorUiConfig().graphQueriesTableName());
        Assertions.assertEquals("olousdvrg", model.connectorUiConfig().graphQueries().get(0).metricName());
        Assertions.assertEquals("qmawzjdrpizfu", model.connectorUiConfig().graphQueries().get(0).legend());
        Assertions.assertEquals("yctsdbtqgkuj", model.connectorUiConfig().graphQueries().get(0).baseQuery());
        Assertions.assertEquals("ejnglpwsadaxjsum", model.connectorUiConfig().sampleQueries().get(0).description());
        Assertions.assertEquals("ezcoioyj", model.connectorUiConfig().sampleQueries().get(0).query());
        Assertions.assertEquals("wtxzuisam", model.connectorUiConfig().dataTypes().get(0).name());
        Assertions.assertEquals("at", model.connectorUiConfig().dataTypes().get(0).lastDataReceivedQuery());
        Assertions.assertEquals(ConnectivityType.IS_CONNECTED_QUERY,
            model.connectorUiConfig().connectivityCriteria().get(0).type());
        Assertions.assertEquals("mtikesliky", model.connectorUiConfig().connectivityCriteria().get(0).value().get(0));
        Assertions.assertEquals(AvailabilityStatus.ONE, model.connectorUiConfig().availability().status());
        Assertions.assertEquals(true, model.connectorUiConfig().availability().isPreview());
        Assertions.assertEquals(ProviderName.MICROSOFT_OPERATIONAL_INSIGHTS_WORKSPACES,
            model.connectorUiConfig().permissions().resourceProvider().get(0).provider());
        Assertions.assertEquals("xs",
            model.connectorUiConfig().permissions().resourceProvider().get(0).permissionsDisplayText());
        Assertions.assertEquals("uzyigfcvcewbwqhd",
            model.connectorUiConfig().permissions().resourceProvider().get(0).providerDisplayName());
        Assertions.assertEquals(PermissionProviderScope.WORKSPACE,
            model.connectorUiConfig().permissions().resourceProvider().get(0).scope());
        Assertions.assertEquals(false,
            model.connectorUiConfig().permissions().resourceProvider().get(0).requiredPermissions().action());
        Assertions.assertEquals(true,
            model.connectorUiConfig().permissions().resourceProvider().get(0).requiredPermissions().write());
        Assertions.assertEquals(false,
            model.connectorUiConfig().permissions().resourceProvider().get(0).requiredPermissions().read());
        Assertions.assertEquals(true,
            model.connectorUiConfig().permissions().resourceProvider().get(0).requiredPermissions().delete());
        Assertions.assertEquals("wvyldqpzf", model.connectorUiConfig().permissions().customs().get(0).name());
        Assertions.assertEquals("soxinu", model.connectorUiConfig().permissions().customs().get(0).description());
        Assertions.assertEquals("hetxdqcmyctajqz", model.connectorUiConfig().instructionSteps().get(0).title());
        Assertions.assertEquals("alec", model.connectorUiConfig().instructionSteps().get(0).description());
        Assertions.assertEquals(SettingType.INFO_MESSAGE,
            model.connectorUiConfig().instructionSteps().get(0).instructions().get(0).type());
    }
}
