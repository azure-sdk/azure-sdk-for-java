// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobFSDataset;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureBlobFSDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobFSDataset model = BinaryData.fromString(
            "{\"type\":\"AzureBlobFSFile\",\"typeProperties\":{\"folderPath\":\"datakkvxu\",\"fileName\":\"dataqzbvbpsuvqhxt\",\"format\":{\"type\":\"DatasetStorageFormat\",\"serializer\":\"datagdkwbkurklpiigfu\",\"deserializer\":\"dataeutuipjclz\",\"\":{\"ydewuwxyll\":\"dataqdz\",\"k\":\"datazzevtzqwczochwb\",\"kyvnhiysdhork\":\"datauynf\",\"qki\":\"datalhr\"}},\"compression\":{\"type\":\"datawkffla\",\"level\":\"datamwqoguflteatnege\",\"\":{\"hnvxwtd\":\"dataxnjtqbgysib\",\"kxunsaujqgbb\":\"datatcbjdbtqy\",\"hgjsmbcsloy\":\"datavovoa\"}}},\"description\":\"abdgdheronsd\",\"structure\":\"datarkzvz\",\"schema\":\"datatqhgz\",\"linkedServiceName\":{\"referenceName\":\"yxtrvfdbqsk\",\"parameters\":{\"ptpvsffavdhpiw\":\"databvi\",\"bwxyldqtmggcpd\":\"datamuwkgjwbyfdw\",\"zctwymzsk\":\"datamegaj\"}},\"parameters\":{\"gliupqscoob\":{\"type\":\"Object\",\"defaultValue\":\"dataeseip\"},\"incev\":{\"type\":\"Object\",\"defaultValue\":\"datacaxsqcomjiq\"},\"duvtvod\":{\"type\":\"Int\",\"defaultValue\":\"datadevpximziizmeq\"},\"hm\":{\"type\":\"SecureString\",\"defaultValue\":\"datap\"}},\"annotations\":[\"datab\",\"datablmcvrjaznotdof\",\"datavpbqsdqkpsbqs\",\"databmitaftazgcxsvq\"],\"folder\":{\"name\":\"ufylamxowbg\"},\"\":{\"xiknsgofuns\":\"datayutehlkarvtipquk\",\"xn\":\"datahpcekggvmfnnb\"}}")
            .toObject(AzureBlobFSDataset.class);
        Assertions.assertEquals("abdgdheronsd", model.description());
        Assertions.assertEquals("yxtrvfdbqsk", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("gliupqscoob").type());
        Assertions.assertEquals("ufylamxowbg", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobFSDataset model
            = new AzureBlobFSDataset().withDescription("abdgdheronsd")
                .withStructure("datarkzvz")
                .withSchema("datatqhgz")
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("yxtrvfdbqsk")
                    .withParameters(mapOf("ptpvsffavdhpiw", "databvi", "bwxyldqtmggcpd", "datamuwkgjwbyfdw",
                        "zctwymzsk", "datamegaj")))
                .withParameters(mapOf("gliupqscoob",
                    new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("dataeseip"), "incev",
                    new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datacaxsqcomjiq"),
                    "duvtvod",
                    new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datadevpximziizmeq"),
                    "hm", new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datap")))
                .withAnnotations(
                    Arrays.asList("datab", "datablmcvrjaznotdof", "datavpbqsdqkpsbqs", "databmitaftazgcxsvq"))
                .withFolder(new DatasetFolder().withName("ufylamxowbg"))
                .withFolderPath("datakkvxu")
                .withFileName("dataqzbvbpsuvqhxt")
                .withFormat(new DatasetStorageFormat().withSerializer("datagdkwbkurklpiigfu")
                    .withDeserializer("dataeutuipjclz")
                    .withAdditionalProperties(mapOf("type", "DatasetStorageFormat")))
                .withCompression(new DatasetCompression().withType("datawkffla")
                    .withLevel("datamwqoguflteatnege")
                    .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(AzureBlobFSDataset.class);
        Assertions.assertEquals("abdgdheronsd", model.description());
        Assertions.assertEquals("yxtrvfdbqsk", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("gliupqscoob").type());
        Assertions.assertEquals("ufylamxowbg", model.folder().name());
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
