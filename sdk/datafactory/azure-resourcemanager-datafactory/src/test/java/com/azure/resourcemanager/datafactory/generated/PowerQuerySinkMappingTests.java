// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.PowerQuerySink;
import com.azure.resourcemanager.datafactory.models.PowerQuerySinkMapping;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PowerQuerySinkMappingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PowerQuerySinkMapping model = BinaryData.fromString(
            "{\"queryName\":\"esbjohrvkpnmaa\",\"dataflowSinks\":[{\"script\":\"aiegrxooqq\",\"schemaLinkedService\":{\"referenceName\":\"mbuzkay\",\"parameters\":{\"yfgjxmgwk\":\"dataycogwj\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"lnosql\",\"parameters\":{\"zbvkoxlj\":\"datavwauqxhqcvai\",\"gtziyl\":\"datavefbio\",\"lkzzlokmrudepzl\":\"dataxoaallveezesdn\",\"vgpvhtx\":\"datauzcwlbefjh\"}},\"name\":\"tah\",\"description\":\"jgfp\",\"dataset\":{\"referenceName\":\"fmgudkfoybih\",\"parameters\":{\"wmddvfubr\":\"datakwtatkkufb\",\"rnggwujyukjfsb\":\"dataomff\"}},\"linkedService\":{\"referenceName\":\"gb\",\"parameters\":{\"gkbf\":\"dataihxwfmuwhgx\",\"avqqxtyhdik\":\"dataqsislaubij\",\"ryi\":\"dataratzgxta\",\"ovu\":\"datalfb\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"pichsbzgw\",\"datasetParameters\":\"dataarbjjswzkzwtfeg\",\"parameters\":{\"zl\":\"datawtagfebuqudewj\",\"cddwmnsapg\":\"datamuuljnang\"},\"\":{\"grzntpqvhkjbgcqq\":\"datapajr\"}}},{\"script\":\"tmyzoiqaijnahelf\",\"schemaLinkedService\":{\"referenceName\":\"ayplakqgljcr\",\"parameters\":{\"jbsfpaomlg\":\"dataxzeki\",\"pypsjokjjrj\":\"datanazefti\",\"jt\":\"datauql\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"tcjimsge\",\"parameters\":{\"nijcxvqjwli\":\"datawwedbcrkepjnyrtl\",\"vnbk\":\"datapqlna\"}},\"name\":\"qassnwvwluzs\",\"description\":\"qxbtkwatwvzj\",\"dataset\":{\"referenceName\":\"dn\",\"parameters\":{\"nrwua\":\"datawgrqiqlopbjxokm\"}},\"linkedService\":{\"referenceName\":\"jhoshin\",\"parameters\":{\"rgvcoulxh\":\"datauqepl\",\"eumyxpsovypwvhj\":\"datavurs\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"gsfmgypqmcal\",\"datasetParameters\":\"datazmix\",\"parameters\":{\"inzukzb\":\"datarhjfsehtzjbuz\",\"dhleuabsiqnyjjfj\":\"databc\",\"up\":\"datags\",\"jmbzph\":\"datanxexafql\"},\"\":{\"ltddif\":\"datajsgbcr\",\"afbijaqyiyefle\":\"datawxe\"}}},{\"script\":\"fackfupyivq\",\"schemaLinkedService\":{\"referenceName\":\"zxyzlxo\",\"parameters\":{\"rdfzynfmyjqrn\":\"datatkbperkeyhybcsx\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"gmntzeauifcz\",\"parameters\":{\"tztfnjpwbxannjrx\":\"datatfvzdobhejjb\",\"qwlbxny\":\"datathqjvoydeg\",\"azfrsm\":\"datakppnzaluafx\",\"rollntvfqrjfzfhs\":\"datagvfmbs\"}},\"name\":\"dsraxztain\",\"description\":\"xkzcfxzcp\",\"dataset\":{\"referenceName\":\"pqpwefzlreonsq\",\"parameters\":{\"mgra\":\"datagnfd\",\"lssqv\":\"datamftziracz\",\"njswnjoni\":\"dataghznltjxstjge\"}},\"linkedService\":{\"referenceName\":\"qwxsxswineyjerf\",\"parameters\":{\"smgsftk\":\"datalppnmrftnf\",\"gk\":\"datap\",\"zeemsfpmoiykts\":\"datafbfn\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"nikmwnzcenk\",\"datasetParameters\":\"dataqlvqkkceb\",\"parameters\":{\"shoeqpv\":\"datacuj\",\"mlkvaiolfrce\":\"datakpgi\",\"ajksmwrbw\":\"datacvsreicpsv\"},\"\":{\"qskkpoufupadtpb\":\"dataoccrla\",\"evdzvnyzh\":\"dataz\",\"agkndnenozsfln\":\"datat\"}}}]}")
            .toObject(PowerQuerySinkMapping.class);
        Assertions.assertEquals("esbjohrvkpnmaa", model.queryName());
        Assertions.assertEquals("tah", model.dataflowSinks().get(0).name());
        Assertions.assertEquals("jgfp", model.dataflowSinks().get(0).description());
        Assertions.assertEquals("fmgudkfoybih", model.dataflowSinks().get(0).dataset().referenceName());
        Assertions.assertEquals("gb", model.dataflowSinks().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE,
            model.dataflowSinks().get(0).flowlet().type());
        Assertions.assertEquals("pichsbzgw", model.dataflowSinks().get(0).flowlet().referenceName());
        Assertions.assertEquals("mbuzkay", model.dataflowSinks().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("lnosql", model.dataflowSinks().get(0).rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("aiegrxooqq", model.dataflowSinks().get(0).script());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PowerQuerySinkMapping model
            = new PowerQuerySinkMapping().withQueryName("esbjohrvkpnmaa")
                .withDataflowSinks(
                    Arrays
                        .asList(
                            new PowerQuerySink().withName("tah")
                                .withDescription("jgfp")
                                .withDataset(new DatasetReference().withReferenceName("fmgudkfoybih")
                                    .withParameters(mapOf("wmddvfubr", "datakwtatkkufb", "rnggwujyukjfsb", "dataomff")))
                                .withLinkedService(new LinkedServiceReference().withReferenceName("gb")
                                    .withParameters(mapOf("gkbf", "dataihxwfmuwhgx", "avqqxtyhdik", "dataqsislaubij",
                                        "ryi", "dataratzgxta", "ovu", "datalfb")))
                                .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                    .withReferenceName("pichsbzgw")
                                    .withDatasetParameters("dataarbjjswzkzwtfeg")
                                    .withParameters(mapOf("zl", "datawtagfebuqudewj", "cddwmnsapg", "datamuuljnang"))
                                    .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("mbuzkay")
                                    .withParameters(mapOf("yfgjxmgwk", "dataycogwj")))
                                .withRejectedDataLinkedService(new LinkedServiceReference().withReferenceName("lnosql")
                                    .withParameters(mapOf("zbvkoxlj", "datavwauqxhqcvai", "gtziyl", "datavefbio",
                                        "lkzzlokmrudepzl", "dataxoaallveezesdn", "vgpvhtx", "datauzcwlbefjh")))
                                .withScript("aiegrxooqq"),
                            new PowerQuerySink().withName("qassnwvwluzs")
                                .withDescription("qxbtkwatwvzj")
                                .withDataset(new DatasetReference().withReferenceName("dn")
                                    .withParameters(mapOf("nrwua", "datawgrqiqlopbjxokm")))
                                .withLinkedService(new LinkedServiceReference().withReferenceName("jhoshin")
                                    .withParameters(mapOf("rgvcoulxh", "datauqepl", "eumyxpsovypwvhj", "datavurs")))
                                .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                    .withReferenceName("gsfmgypqmcal")
                                    .withDatasetParameters("datazmix")
                                    .withParameters(mapOf("inzukzb", "datarhjfsehtzjbuz", "dhleuabsiqnyjjfj", "databc",
                                        "up", "datags", "jmbzph", "datanxexafql"))
                                    .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("ayplakqgljcr")
                                    .withParameters(mapOf("jbsfpaomlg", "dataxzeki", "pypsjokjjrj", "datanazefti", "jt",
                                        "datauql")))
                                .withRejectedDataLinkedService(
                                    new LinkedServiceReference().withReferenceName("tcjimsge")
                                        .withParameters(
                                            mapOf("nijcxvqjwli", "datawwedbcrkepjnyrtl", "vnbk", "datapqlna")))
                                .withScript("tmyzoiqaijnahelf"),
                            new PowerQuerySink().withName("dsraxztain")
                                .withDescription("xkzcfxzcp")
                                .withDataset(new DatasetReference().withReferenceName("pqpwefzlreonsq")
                                    .withParameters(mapOf("mgra", "datagnfd", "lssqv", "datamftziracz", "njswnjoni",
                                        "dataghznltjxstjge")))
                                .withLinkedService(new LinkedServiceReference().withReferenceName("qwxsxswineyjerf")
                                    .withParameters(mapOf("smgsftk", "datalppnmrftnf", "gk", "datap", "zeemsfpmoiykts",
                                        "datafbfn")))
                                .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                    .withReferenceName("nikmwnzcenk")
                                    .withDatasetParameters("dataqlvqkkceb")
                                    .withParameters(mapOf("shoeqpv", "datacuj", "mlkvaiolfrce", "datakpgi", "ajksmwrbw",
                                        "datacvsreicpsv"))
                                    .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(new LinkedServiceReference()
                                    .withReferenceName("zxyzlxo")
                                    .withParameters(mapOf("rdfzynfmyjqrn", "datatkbperkeyhybcsx")))
                                .withRejectedDataLinkedService(
                                    new LinkedServiceReference().withReferenceName("gmntzeauifcz")
                                        .withParameters(
                                            mapOf("tztfnjpwbxannjrx", "datatfvzdobhejjb", "qwlbxny", "datathqjvoydeg",
                                                "azfrsm", "datakppnzaluafx", "rollntvfqrjfzfhs", "datagvfmbs")))
                                .withScript("fackfupyivq")));
        model = BinaryData.fromObject(model).toObject(PowerQuerySinkMapping.class);
        Assertions.assertEquals("esbjohrvkpnmaa", model.queryName());
        Assertions.assertEquals("tah", model.dataflowSinks().get(0).name());
        Assertions.assertEquals("jgfp", model.dataflowSinks().get(0).description());
        Assertions.assertEquals("fmgudkfoybih", model.dataflowSinks().get(0).dataset().referenceName());
        Assertions.assertEquals("gb", model.dataflowSinks().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE,
            model.dataflowSinks().get(0).flowlet().type());
        Assertions.assertEquals("pichsbzgw", model.dataflowSinks().get(0).flowlet().referenceName());
        Assertions.assertEquals("mbuzkay", model.dataflowSinks().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("lnosql", model.dataflowSinks().get(0).rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("aiegrxooqq", model.dataflowSinks().get(0).script());
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
