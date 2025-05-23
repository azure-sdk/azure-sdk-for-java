// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.security.keyvault.keys;

import com.azure.v2.identity.DefaultAzureCredentialBuilder;
import com.azure.v2.security.keyvault.keys.models.CreateEcKeyOptions;
import com.azure.v2.security.keyvault.keys.models.CreateRsaKeyOptions;
import com.azure.v2.security.keyvault.keys.models.KeyProperties;
import com.azure.v2.security.keyvault.keys.models.KeyVaultKey;

import java.time.OffsetDateTime;

/**
 * Sample demonstrates how to list keys and versions of a given key in the key vault.
 */
public class ListOperations {
    /**
     * Authenticates with the key vault and shows how to list keys and list versions of a specific key in the key vault.
     *
     * @param args Unused. Arguments to the program.
     *
     * @throws IllegalArgumentException when invalid key vault endpoint is passed.
     */
    public static void main(String[] args) throws IllegalArgumentException {
        /* Instantiate a KeyClient that will be used to call the service. Notice that the client is using default Azure
        credentials. For more information on this and other types of credentials, see this document:
        https://docs.microsoft.com/java/api/overview/azure/identity-readme?view=azure-java-stable.

        To get started, you'll need a URL to an Azure Key Vault. See the README
        (https://github.com/vcolin7/azure-sdk-for-java/blob/feature/vicolina/keyvault/v2/sdk/keyvault-v2/azure-security-keyvault-keys/README.md)
        for links and instructions. */
        KeyClient keyClient = new KeyClientBuilder()
            .endpoint("<your-key-vault-url>")
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildClient();

        // Let's create EC and ESA keys valid for 1 year. If a key already exists in the key vault, then a new version
        // of the key is created.
        keyClient.createRsaKey(new CreateRsaKeyOptions("CloudRsaKey")
            .setExpiresOn(OffsetDateTime.now().plusYears(1))
            .setKeySize(2048));

        keyClient.createEcKey(new CreateEcKeyOptions("CloudEcKey")
            .setExpiresOn(OffsetDateTime.now().plusYears(1)));

        // You need to check te type of keys already exist in your key vault. Let's list the keys and print their types.
        // List operations don't return the keys with key material information. So, for each returned key we call
        // getKey() to get the key with its key material information.
        for (KeyProperties key : keyClient.listPropertiesOfKeys()) {
            KeyVaultKey keyWithMaterial = keyClient.getKey(key.getName(), key.getVersion());

            System.out.printf("Received key with name %s and type %s", keyWithMaterial.getName(),
                keyWithMaterial.getKeyType());
        }

        // We need the RSA key with a bigger key size, so you want to update the key in key vault to ensure it has the
        // required size. Calling createRsaKey() on an existing key creates a new version of the key in the key vault
        // with the new specified size.
        keyClient.createRsaKey(new CreateRsaKeyOptions("CloudRsaKey")
            .setExpiresOn(OffsetDateTime.now().plusYears(1))
            .setKeySize(4096));

        // You need to check all the different versions RSA key had previously. Let's print all the versions of this
        // key.
        for (KeyProperties key : keyClient.listPropertiesOfKeyVersions("CloudRsaKey")) {
            KeyVaultKey keyWithMaterial = keyClient.getKey(key.getName(), key.getVersion());

            System.out.printf("Received key's version with name %s, type %s and version %s", keyWithMaterial.getName(),
                keyWithMaterial.getKeyType(), keyWithMaterial.getProperties().getVersion());
        }
    }
}
