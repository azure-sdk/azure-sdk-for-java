// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.security.keyvault.administration;

import com.azure.v2.core.http.polling.Poller;
import com.azure.v2.identity.DefaultAzureCredentialBuilder;
import com.azure.v2.security.keyvault.administration.models.KeyVaultBackupOperation;
import com.azure.v2.security.keyvault.administration.models.KeyVaultRestoreOperation;
import com.azure.v2.security.keyvault.administration.models.KeyVaultRestoreResult;

/**
 * This sample demonstrates how to fully back up and restore a key vault.
 */
public class BackupAndRestoreHelloWorld {
    /**
     * Authenticates with the key vault and shows how to fully back up and restore a key vault.
     *
     * @param args Unused. Arguments to the program.
     * @throws IllegalArgumentException when an invalid key vault URL is passed.
     */
    public static void main(String[] args) {
        KeyVaultBackupClient backupClient = new KeyVaultBackupClientBuilder()
            .endpoint("<your-managed-hsm-url>")
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildClient();
        /* Instantiate a KeyVaultBackupClient that will be used to call the service. Notice that the client is using
        default Azure credentials. For more information on this and other types of credentials, see this document:
        https://docs.microsoft.com/java/api/overview/azure/identity-readme?view=azure-java-stable.

        To get started, you'll need a URL to an Azure Key Vault Managed HSM. See the README
        (https://github.com/vcolin7/azure-sdk-for-java/blob/feature/vicolina/keyvault/v2/sdk/keyvault-v2/azure-security-keyvault-administration/README.md)
        for links and instructions. */

        /* Using the KeyVaultBackupClient, you can back up your entire collection of keys. The backing store for full
        key backups is a blob storage container using Shared Access Signature authentication. For more details on
        creating a SAS token using the BlobServiceClient, see the Azure Storage Blobs client README (https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/storage/azure-storage-blob/README.md).
        Alternatively, it is possible to generate a SAS token in Storage Explorer (https://docs.microsoft.com/azure/vs-azure-tools-storage-manage-with-storage-explorer?tabs=windows#generate-a-shared-access-signature-in-storage-explorer).

        To ensure you have some keys for backup, you may want to first create a key using the KeyClient. To create a
        new KeyClient to create a key, see the 'Azure Key Vault Key client library for Java' README (https://github.com/vcolin7/azure-sdk-for-java/blob/feature/vicolina/keyvault/v2/sdk/keyvault-v2/azure-security-keyvault-keys/README.md#create-key-client).

        In the sample below, you can set blobStorageUrl and sasToken based on environment variables, configuration
        settings, or any way that works for your application. */
        String blobStorageUrl = "<blob-storage-url>";
        String sasToken = "<sas-token>";
        Poller<KeyVaultBackupOperation, String> backupPoller = backupClient.beginBackup(blobStorageUrl, sasToken);

        backupPoller.waitForCompletion();

        /* Now let's restore the entire collection of keys from the backup. We will need the get the URI for the
        location the backup, as well as Shared Access Signature for accessing it. */
        String backupFolderUrl = backupPoller.getFinalResult();

        Poller<KeyVaultRestoreOperation, KeyVaultRestoreResult> restorePoller =
            backupClient.beginRestore(backupFolderUrl, sasToken);

        restorePoller.waitForCompletion();
    }
}
