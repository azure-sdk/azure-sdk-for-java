// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated;

import com.azure.core.util.Context;

/** Samples for Configurations ListByServer. */
public final class ConfigurationsListByServerSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/stable/2017-12-01/examples/ConfigurationListByServer.json
     */
    /**
     * Sample code: ConfigurationList.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void configurationList(com.azure.resourcemanager.mysql.MySqlManager manager) {
        manager.configurations().listByServer("testrg", "mysqltestsvc1", Context.NONE);
    }
}
