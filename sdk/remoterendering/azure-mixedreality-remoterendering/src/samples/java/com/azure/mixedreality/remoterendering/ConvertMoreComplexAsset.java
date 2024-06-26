// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.mixedreality.remoterendering;

// These tests assume that the storage account is accessible from the remote rendering account.
// See https://docs.microsoft.com/azure/remote-rendering/how-tos/create-an-account
// Since the roles can take a while to propagate, we do not live test these samples.

import com.azure.core.util.polling.SyncPoller;
import com.azure.mixedreality.remoterendering.models.AssetConversion;
import com.azure.mixedreality.remoterendering.models.AssetConversionOptions;
import com.azure.mixedreality.remoterendering.models.AssetConversionStatus;

import java.util.UUID;

/**
 * Sample class demonstrating how to convert a complex asset.
 */
public class ConvertMoreComplexAsset extends SampleBase {

    /**
     * Main method to invoke this demo about how to convert a complex asset.
     *
     * @param args Unused arguments to the program.
     */
    public static void main(String[] args) {
        new ConvertMoreComplexAsset().convertMoreComplexAsset();
    }

    /**
     * Sample method demonstrating how to convert a complex asset.
     */
    public void convertMoreComplexAsset() {
        // In a real world scenario you'd want these to be different.
        String inputStorageURL = getStorageURL();
        String outputStorageURL = getStorageURL();

        // BEGIN: readme-sample-convertMoreComplexAsset
        AssetConversionOptions conversionOptions = new AssetConversionOptions()
            .setInputStorageContainerUrl(inputStorageURL)
            .setInputRelativeAssetPath("bicycle.gltf")
            .setInputBlobPrefix("Bicycle")
            .setOutputStorageContainerUrl(outputStorageURL)
            .setOutputBlobPrefix("ConvertedBicycle");

        String conversionId = UUID.randomUUID().toString();

        SyncPoller<AssetConversion, AssetConversion> conversionOperation = client.beginConversion(conversionId, conversionOptions);
        // END: readme-sample-convertMoreComplexAsset

        // BEGIN: readme-sample-convertMoreComplexAssetCheckStatus
        AssetConversion conversion = conversionOperation.getFinalResult();
        if (conversion.getStatus() == AssetConversionStatus.SUCCEEDED) {
            logger.info("Conversion succeeded: Output written to {}", conversion.getOutputAssetUrl());
        } else if (conversion.getStatus() == AssetConversionStatus.FAILED) {
            logger.error("Conversion failed: {} {}", conversion.getError().getCode(), conversion.getError().getMessage());
        } else {
            logger.error("Unexpected conversion status: {}", conversion.getStatus());
        }
        // END: readme-sample-convertMoreComplexAssetCheckStatus
    }
}
