// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseBackup;

/**
 * Samples for AutonomousDatabaseBackups Update.
 */
public final class AutonomousDatabaseBackupsUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01/autonomousDatabaseBackup_patch.json
     */
    /**
     * Sample code: AutonomousDatabaseBackups_Update.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void
        autonomousDatabaseBackupsUpdate(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        AutonomousDatabaseBackup resource = manager.autonomousDatabaseBackups()
            .getWithResponse("rg000", "databasedb1", "1711644130", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
