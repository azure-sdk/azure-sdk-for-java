// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.securityinsights.SecurityInsightsManager;
import com.azure.resourcemanager.securityinsights.models.Kind;
import com.azure.resourcemanager.securityinsights.models.MetadataAuthor;
import com.azure.resourcemanager.securityinsights.models.MetadataCategories;
import com.azure.resourcemanager.securityinsights.models.MetadataDependencies;
import com.azure.resourcemanager.securityinsights.models.MetadataModel;
import com.azure.resourcemanager.securityinsights.models.MetadataSource;
import com.azure.resourcemanager.securityinsights.models.MetadataSupport;
import com.azure.resourcemanager.securityinsights.models.Operator;
import com.azure.resourcemanager.securityinsights.models.SourceKind;
import com.azure.resourcemanager.securityinsights.models.SupportTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class MetadatasCreateWithResponseMockTests {
    @Test
    public void testCreateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"contentId\":\"gy\",\"parentId\":\"tgbqpfyrv\",\"version\":\"vijvwmrgcnzhr\",\"kind\":\"AzureFunction\",\"source\":{\"kind\":\"Community\",\"name\":\"mbzquu\",\"sourceId\":\"q\"},\"author\":{\"name\":\"tqyzyc\",\"email\":\"mbky\",\"link\":\"xjdqosxzmdzlybq\"},\"support\":{\"tier\":\"Microsoft\",\"name\":\"ekzfkicx\",\"email\":\"evmnk\",\"link\":\"hvsr\"},\"dependencies\":{\"contentId\":\"kvlwvb\",\"kind\":\"LogicAppsCustomConnector\",\"version\":\"xsv\",\"name\":\"pabwbpzgfgqpudhg\",\"operator\":\"OR\",\"criteria\":[{\"contentId\":\"bfpxxavlozukg\",\"kind\":\"Watchlist\",\"version\":\"wyxjsfmaxcebnbeo\",\"name\":\"emqqerwqx\",\"operator\":\"OR\",\"criteria\":[{},{}]},{\"contentId\":\"dfkhttuobrxz\",\"kind\":\"HuntingQuery\",\"version\":\"e\",\"name\":\"kjgeecwtfma\",\"operator\":\"OR\",\"criteria\":[{},{},{},{}]}]},\"categories\":{\"domains\":[\"ofxfmhlvyqnslbq\",\"mlqkiekhj\",\"qqrugwespscvs\"],\"verticals\":[\"tluwozfvzasupc\",\"qgxcvwio\",\"hcmcgm\",\"m\"]},\"providers\":[\"qxuyi\",\"rzn\",\"dqseypdlmajpuy\",\"oaf\"],\"customVersion\":\"ccynbuv\",\"contentSchemaVersion\":\"iehedm\",\"icon\":\"oneeyrxpa\",\"threatAnalysisTactics\":[\"za\",\"qwddigebls\"],\"threatAnalysisTechniques\":[\"d\"],\"previewImages\":[\"wwveeozbjkjq\",\"izdnuehx\",\"ltssjdywbnklge\"],\"previewImagesDark\":[\"ctsawvxcimpthjrm\",\"lzmslubnknyfuy\",\"jhvrrllfswarmy\",\"w\"]},\"etag\":\"otgeysyqnipe\",\"id\":\"wwcbfnxiaj\",\"name\":\"vjucfjisosfzl\",\"type\":\"raxnfyzguax\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityInsightsManager manager = SecurityInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        MetadataModel response = manager.metadatas()
            .define("mryddnqivahfcq")
            .withExistingWorkspace("qoqovqhgphgx", "wudgcyqruv")
            .withEtag("ish")
            .withContentId("zebpicci")
            .withParentId("oypoedkspwwibpy")
            .withVersion("eig")
            .withKind(Kind.WATCHLIST_TEMPLATE)
            .withSource(new MetadataSource().withKind(SourceKind.SOURCE_REPOSITORY)
                .withName("xteuikhznfffnh")
                .withSourceId("n"))
            .withAuthor(
                new MetadataAuthor().withName("rmrfqderkrgsdco").withEmail("mgqlwyqznbbyzpo").withLink("futgpbygbnb"))
            .withSupport(new MetadataSupport().withTier(SupportTier.COMMUNITY)
                .withName("qgtzpvqewflwzhx")
                .withEmail("xerx")
                .withLink("wl"))
            .withDependencies(new MetadataDependencies().withContentId("sqvvdkfpfjdajdqx")
                .withKind(Kind.DATA_TYPE)
                .withVersion("yfrdjidcetfvg")
                .withName("wsldigwouppvyd")
                .withOperator(Operator.AND)
                .withCriteria(Arrays.asList(new MetadataDependencies().withContentId("rsnxfrp")
                    .withKind(Kind.HUNTING_QUERY)
                    .withVersion("clmdmtfxxepzpx")
                    .withName("lcqzfxai")
                    .withOperator(Operator.OR)
                    .withCriteria(Arrays.asList(new MetadataDependencies())))))
            .withCategories(new MetadataCategories().withDomains(Arrays.asList("mkirpqn", "pudmhkcomeobw"))
                .withVerticals(Arrays.asList("zltenlbfxl", "xozesn")))
            .withProviders(Arrays.asList("uomtxj", "ri", "ymckik"))
            .withCustomVersion("urhwishy")
            .withContentSchemaVersion("rzcqfevnkyakckte")
            .withIcon("gns")
            .withThreatAnalysisTactics(Arrays.asList("kkdede"))
            .withThreatAnalysisTechniques(Arrays.asList("zogfcnxcxg", "umtcqxmyvkxixypa"))
            .withPreviewImages(Arrays.asList("jczgohv", "suwichmxczbyfkoc", "mzdctsnlwscrngt", "gxrolw"))
            .withPreviewImagesDark(Arrays.asList("ksdksutacuctih"))
            .create();

        Assertions.assertEquals("otgeysyqnipe", response.etag());
        Assertions.assertEquals("gy", response.contentId());
        Assertions.assertEquals("tgbqpfyrv", response.parentId());
        Assertions.assertEquals("vijvwmrgcnzhr", response.version());
        Assertions.assertEquals(Kind.AZURE_FUNCTION, response.kind());
        Assertions.assertEquals(SourceKind.COMMUNITY, response.source().kind());
        Assertions.assertEquals("mbzquu", response.source().name());
        Assertions.assertEquals("q", response.source().sourceId());
        Assertions.assertEquals("tqyzyc", response.author().name());
        Assertions.assertEquals("mbky", response.author().email());
        Assertions.assertEquals("xjdqosxzmdzlybq", response.author().link());
        Assertions.assertEquals(SupportTier.MICROSOFT, response.support().tier());
        Assertions.assertEquals("ekzfkicx", response.support().name());
        Assertions.assertEquals("evmnk", response.support().email());
        Assertions.assertEquals("hvsr", response.support().link());
        Assertions.assertEquals("kvlwvb", response.dependencies().contentId());
        Assertions.assertEquals(Kind.LOGIC_APPS_CUSTOM_CONNECTOR, response.dependencies().kind());
        Assertions.assertEquals("xsv", response.dependencies().version());
        Assertions.assertEquals("pabwbpzgfgqpudhg", response.dependencies().name());
        Assertions.assertEquals(Operator.OR, response.dependencies().operator());
        Assertions.assertEquals("bfpxxavlozukg", response.dependencies().criteria().get(0).contentId());
        Assertions.assertEquals(Kind.WATCHLIST, response.dependencies().criteria().get(0).kind());
        Assertions.assertEquals("wyxjsfmaxcebnbeo", response.dependencies().criteria().get(0).version());
        Assertions.assertEquals("emqqerwqx", response.dependencies().criteria().get(0).name());
        Assertions.assertEquals(Operator.OR, response.dependencies().criteria().get(0).operator());
        Assertions.assertEquals("ofxfmhlvyqnslbq", response.categories().domains().get(0));
        Assertions.assertEquals("tluwozfvzasupc", response.categories().verticals().get(0));
        Assertions.assertEquals("qxuyi", response.providers().get(0));
        Assertions.assertEquals("ccynbuv", response.customVersion());
        Assertions.assertEquals("iehedm", response.contentSchemaVersion());
        Assertions.assertEquals("oneeyrxpa", response.icon());
        Assertions.assertEquals("za", response.threatAnalysisTactics().get(0));
        Assertions.assertEquals("d", response.threatAnalysisTechniques().get(0));
        Assertions.assertEquals("wwveeozbjkjq", response.previewImages().get(0));
        Assertions.assertEquals("ctsawvxcimpthjrm", response.previewImagesDark().get(0));
    }
}
