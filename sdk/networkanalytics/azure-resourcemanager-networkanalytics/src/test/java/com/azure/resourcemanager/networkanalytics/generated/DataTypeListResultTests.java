// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkanalytics.fluent.models.DataTypeInner;
import com.azure.resourcemanager.networkanalytics.models.DataTypeListResult;
import com.azure.resourcemanager.networkanalytics.models.DataTypeProperties;
import com.azure.resourcemanager.networkanalytics.models.DataTypeState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DataTypeListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataTypeListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Deleting\",\"state\":\"Running\",\"stateReason\":\"dcsi\",\"storageOutputRetention\":1906498488,\"databaseCacheRetention\":1750107554,\"databaseRetention\":1611277697,\"visualizationUrl\":\"ectehf\"},\"id\":\"scjeypv\",\"name\":\"ezrkgqhcjrefo\",\"type\":\"gm\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"state\":\"Running\",\"stateReason\":\"vxyqjpkcattpngjc\",\"storageOutputRetention\":183805680,\"databaseCacheRetention\":957799467,\"databaseRetention\":822789925,\"visualizationUrl\":\"hvmdajvnysounq\"},\"id\":\"a\",\"name\":\"oaeupfhyhltrpmo\",\"type\":\"jmcmatuokthfu\"},{\"properties\":{\"provisioningState\":\"Failed\",\"state\":\"Running\",\"stateReason\":\"cpkvxodp\",\"storageOutputRetention\":182574553,\"databaseCacheRetention\":1621494681,\"databaseRetention\":466984415,\"visualizationUrl\":\"agfuaxbezyiu\"},\"id\":\"ktwh\",\"name\":\"dxwzywqsmbsurexi\",\"type\":\"o\"},{\"properties\":{\"provisioningState\":\"Accepted\",\"state\":\"Stopped\",\"stateReason\":\"ksymd\",\"storageOutputRetention\":830050857,\"databaseCacheRetention\":1193107670,\"databaseRetention\":980316888,\"visualizationUrl\":\"xhqyudxorrqnb\"},\"id\":\"czvyifq\",\"name\":\"vkd\",\"type\":\"jsllrmv\"}],\"nextLink\":\"f\"}")
            .toObject(DataTypeListResult.class);
        Assertions.assertEquals(DataTypeState.RUNNING, model.value().get(0).properties().state());
        Assertions.assertEquals(1906498488, model.value().get(0).properties().storageOutputRetention());
        Assertions.assertEquals(1750107554, model.value().get(0).properties().databaseCacheRetention());
        Assertions.assertEquals(1611277697, model.value().get(0).properties().databaseRetention());
        Assertions.assertEquals("f", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataTypeListResult model = new DataTypeListResult().withValue(Arrays.asList(
            new DataTypeInner().withProperties(new DataTypeProperties().withState(DataTypeState.RUNNING)
                .withStorageOutputRetention(1906498488)
                .withDatabaseCacheRetention(1750107554)
                .withDatabaseRetention(1611277697)),
            new DataTypeInner().withProperties(new DataTypeProperties().withState(DataTypeState.RUNNING)
                .withStorageOutputRetention(183805680)
                .withDatabaseCacheRetention(957799467)
                .withDatabaseRetention(822789925)),
            new DataTypeInner().withProperties(new DataTypeProperties().withState(DataTypeState.RUNNING)
                .withStorageOutputRetention(182574553)
                .withDatabaseCacheRetention(1621494681)
                .withDatabaseRetention(466984415)),
            new DataTypeInner().withProperties(new DataTypeProperties().withState(DataTypeState.STOPPED)
                .withStorageOutputRetention(830050857)
                .withDatabaseCacheRetention(1193107670)
                .withDatabaseRetention(980316888))))
            .withNextLink("f");
        model = BinaryData.fromObject(model).toObject(DataTypeListResult.class);
        Assertions.assertEquals(DataTypeState.RUNNING, model.value().get(0).properties().state());
        Assertions.assertEquals(1906498488, model.value().get(0).properties().storageOutputRetention());
        Assertions.assertEquals(1750107554, model.value().get(0).properties().databaseCacheRetention());
        Assertions.assertEquals(1611277697, model.value().get(0).properties().databaseRetention());
        Assertions.assertEquals("f", model.nextLink());
    }
}
