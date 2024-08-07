// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataProviderMetadata;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataProviderMetadataPropertyBagItem;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataTableResponseColumn;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataTableResponseObject;
import com.azure.resourcemanager.appcontainers.models.DiagnosticRendering;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsDataApiResponse;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsDefinition;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsProperties;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsStatus;
import com.azure.resourcemanager.appcontainers.models.DiagnosticSupportTopic;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DiagnosticsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticsProperties model = BinaryData.fromString(
            "{\"metadata\":{\"id\":\"qabqgzslesjcb\",\"name\":\"rnntiewdjcv\",\"description\":\"uwrbehwagoh\",\"author\":\"f\",\"category\":\"mrqemvvhmx\",\"supportTopicList\":[{\"id\":\"futacoebjvewzc\",\"pesId\":\"nmwcpmgu\"},{\"id\":\"draufactkah\",\"pesId\":\"v\"}],\"analysisTypes\":[\"ziuxxpshnee\"],\"type\":\"lfg\",\"score\":26.94627},\"dataset\":[{\"table\":{\"tableName\":\"dlenrdsutujbazpj\",\"columns\":[{\"columnName\":\"inyflnorwmduvwp\",\"dataType\":\"vxwmygd\",\"columnType\":\"gpqch\"},{\"columnName\":\"zepn\",\"dataType\":\"jcrxgibbdaxcon\",\"columnType\":\"zauorsuk\"},{\"columnName\":\"wbqpl\",\"dataType\":\"vnuuepzl\",\"columnType\":\"hw\"},{\"columnName\":\"oldweyuqdu\",\"dataType\":\"mnnrwr\",\"columnType\":\"ork\"}],\"rows\":[\"dataywjhhgdnhx\",\"datasivfomilo\"]},\"renderingProperties\":{\"type\":1187169893,\"title\":\"fi\",\"description\":\"dieuzaofj\",\"isVisible\":false}},{\"table\":{\"tableName\":\"yysfgdot\",\"columns\":[{\"columnName\":\"ip\",\"dataType\":\"pwoqo\",\"columnType\":\"acjekni\"},{\"columnName\":\"hqvcimpevfgmblr\",\"dataType\":\"lbywdxsm\",\"columnType\":\"cwrwfs\"}],\"rows\":[\"datan\",\"datanszqujiz\",\"datavoqyt\",\"databyowbblgyavutp\"]},\"renderingProperties\":{\"type\":1107140158,\"title\":\"oismsksbpimlqol\",\"description\":\"kcgxxlxsffgcvi\",\"isVisible\":true}},{\"table\":{\"tableName\":\"l\",\"columns\":[{\"columnName\":\"oupfgfb\",\"dataType\":\"ubdyhgk\",\"columnType\":\"in\"},{\"columnName\":\"owzfttsttkt\",\"dataType\":\"hbq\",\"columnType\":\"tx\"},{\"columnName\":\"zukxitmmqtgqq\",\"dataType\":\"hrnxrxc\",\"columnType\":\"uisavokq\"}],\"rows\":[\"datavazivjlfr\",\"datattbaj\",\"datakatnwxyi\",\"datapidkqqfkuvscxkdm\"]},\"renderingProperties\":{\"type\":2101179664,\"title\":\"ibrxkp\",\"description\":\"oaz\",\"isVisible\":false}}],\"status\":{\"message\":\"bgo\",\"statusId\":1644940787},\"dataProviderMetadata\":{\"providerName\":\"oybfhjxakvvj\",\"propertyBag\":[{\"name\":\"r\",\"value\":\"lmywwtkgkxnyed\"},{\"name\":\"gyvudtjuewbc\",\"value\":\"xuuwhcj\"},{\"name\":\"ccybvp\",\"value\":\"akkud\"},{\"name\":\"xgwjplmagstcyoh\",\"value\":\"kyrk\"}]}}")
            .toObject(DiagnosticsProperties.class);
        Assertions.assertEquals("ziuxxpshnee", model.metadata().analysisTypes().get(0));
        Assertions.assertEquals("dlenrdsutujbazpj", model.dataset().get(0).table().tableName());
        Assertions.assertEquals("inyflnorwmduvwp", model.dataset().get(0).table().columns().get(0).columnName());
        Assertions.assertEquals("vxwmygd", model.dataset().get(0).table().columns().get(0).dataType());
        Assertions.assertEquals("gpqch", model.dataset().get(0).table().columns().get(0).columnType());
        Assertions.assertEquals(1187169893, model.dataset().get(0).renderingProperties().type());
        Assertions.assertEquals("fi", model.dataset().get(0).renderingProperties().title());
        Assertions.assertEquals("dieuzaofj", model.dataset().get(0).renderingProperties().description());
        Assertions.assertEquals(false, model.dataset().get(0).renderingProperties().isVisible());
        Assertions.assertEquals("bgo", model.status().message());
        Assertions.assertEquals(1644940787, model.status().statusId());
        Assertions.assertEquals("oybfhjxakvvj", model.dataProviderMetadata().providerName());
        Assertions.assertEquals("r", model.dataProviderMetadata().propertyBag().get(0).name());
        Assertions.assertEquals("lmywwtkgkxnyed", model.dataProviderMetadata().propertyBag().get(0).value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticsProperties model = new DiagnosticsProperties()
            .withMetadata(new DiagnosticsDefinition()
                .withSupportTopicList(Arrays.asList(new DiagnosticSupportTopic(), new DiagnosticSupportTopic()))
                .withAnalysisTypes(Arrays.asList("ziuxxpshnee")))
            .withDataset(Arrays.asList(
                new DiagnosticsDataApiResponse()
                    .withTable(new DiagnosticDataTableResponseObject().withTableName("dlenrdsutujbazpj")
                        .withColumns(Arrays.asList(
                            new DiagnosticDataTableResponseColumn().withColumnName("inyflnorwmduvwp")
                                .withDataType("vxwmygd")
                                .withColumnType("gpqch"),
                            new DiagnosticDataTableResponseColumn().withColumnName("zepn")
                                .withDataType("jcrxgibbdaxcon")
                                .withColumnType("zauorsuk"),
                            new DiagnosticDataTableResponseColumn().withColumnName("wbqpl")
                                .withDataType("vnuuepzl")
                                .withColumnType("hw"),
                            new DiagnosticDataTableResponseColumn().withColumnName("oldweyuqdu")
                                .withDataType("mnnrwr")
                                .withColumnType("ork")))
                        .withRows(Arrays.asList("dataywjhhgdnhx", "datasivfomilo")))
                    .withRenderingProperties(new DiagnosticRendering().withType(1187169893)
                        .withTitle("fi")
                        .withDescription("dieuzaofj")
                        .withIsVisible(false)),
                new DiagnosticsDataApiResponse()
                    .withTable(new DiagnosticDataTableResponseObject().withTableName("yysfgdot")
                        .withColumns(Arrays.asList(
                            new DiagnosticDataTableResponseColumn().withColumnName("ip")
                                .withDataType("pwoqo")
                                .withColumnType("acjekni"),
                            new DiagnosticDataTableResponseColumn().withColumnName("hqvcimpevfgmblr")
                                .withDataType("lbywdxsm")
                                .withColumnType("cwrwfs")))
                        .withRows(Arrays.asList("datan", "datanszqujiz", "datavoqyt", "databyowbblgyavutp")))
                    .withRenderingProperties(new DiagnosticRendering().withType(1107140158)
                        .withTitle("oismsksbpimlqol")
                        .withDescription("kcgxxlxsffgcvi")
                        .withIsVisible(true)),
                new DiagnosticsDataApiResponse()
                    .withTable(new DiagnosticDataTableResponseObject().withTableName("l")
                        .withColumns(Arrays.asList(
                            new DiagnosticDataTableResponseColumn().withColumnName("oupfgfb")
                                .withDataType("ubdyhgk")
                                .withColumnType("in"),
                            new DiagnosticDataTableResponseColumn().withColumnName("owzfttsttkt")
                                .withDataType("hbq")
                                .withColumnType("tx"),
                            new DiagnosticDataTableResponseColumn().withColumnName("zukxitmmqtgqq")
                                .withDataType("hrnxrxc")
                                .withColumnType("uisavokq")))
                        .withRows(Arrays.asList("datavazivjlfr", "datattbaj", "datakatnwxyi", "datapidkqqfkuvscxkdm")))
                    .withRenderingProperties(new DiagnosticRendering().withType(2101179664)
                        .withTitle("ibrxkp")
                        .withDescription("oaz")
                        .withIsVisible(false))))
            .withStatus(new DiagnosticsStatus().withMessage("bgo").withStatusId(1644940787))
            .withDataProviderMetadata(new DiagnosticDataProviderMetadata().withProviderName("oybfhjxakvvj")
                .withPropertyBag(Arrays.asList(
                    new DiagnosticDataProviderMetadataPropertyBagItem().withName("r").withValue("lmywwtkgkxnyed"),
                    new DiagnosticDataProviderMetadataPropertyBagItem().withName("gyvudtjuewbc").withValue("xuuwhcj"),
                    new DiagnosticDataProviderMetadataPropertyBagItem().withName("ccybvp").withValue("akkud"),
                    new DiagnosticDataProviderMetadataPropertyBagItem().withName("xgwjplmagstcyoh")
                        .withValue("kyrk"))));
        model = BinaryData.fromObject(model).toObject(DiagnosticsProperties.class);
        Assertions.assertEquals("ziuxxpshnee", model.metadata().analysisTypes().get(0));
        Assertions.assertEquals("dlenrdsutujbazpj", model.dataset().get(0).table().tableName());
        Assertions.assertEquals("inyflnorwmduvwp", model.dataset().get(0).table().columns().get(0).columnName());
        Assertions.assertEquals("vxwmygd", model.dataset().get(0).table().columns().get(0).dataType());
        Assertions.assertEquals("gpqch", model.dataset().get(0).table().columns().get(0).columnType());
        Assertions.assertEquals(1187169893, model.dataset().get(0).renderingProperties().type());
        Assertions.assertEquals("fi", model.dataset().get(0).renderingProperties().title());
        Assertions.assertEquals("dieuzaofj", model.dataset().get(0).renderingProperties().description());
        Assertions.assertEquals(false, model.dataset().get(0).renderingProperties().isVisible());
        Assertions.assertEquals("bgo", model.status().message());
        Assertions.assertEquals(1644940787, model.status().statusId());
        Assertions.assertEquals("oybfhjxakvvj", model.dataProviderMetadata().providerName());
        Assertions.assertEquals("r", model.dataProviderMetadata().propertyBag().get(0).name());
        Assertions.assertEquals("lmywwtkgkxnyed", model.dataProviderMetadata().propertyBag().get(0).value());
    }
}
