// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.vision.face.tests;

import com.azure.ai.vision.face.FaceAsyncClient;
import com.azure.ai.vision.face.FaceClient;
import com.azure.ai.vision.face.FaceServiceVersion;
import com.azure.ai.vision.face.samples.utils.Resources;
import com.azure.ai.vision.face.models.FaceDetectionModel;
import com.azure.ai.vision.face.models.FaceDetectionResult;
import com.azure.ai.vision.face.models.FaceRecognitionModel;
import com.azure.core.http.HttpClient;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.nio.file.FileSystems;
import java.util.List;

import static com.azure.ai.vision.face.tests.utils.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;

public class ClientTest extends FaceClientTestBase {

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.vision.face.tests.utils.TestUtils#getTestParameters")
    public void testFaceClient(HttpClient httpClient, FaceServiceVersion serviceVersion) {
        FaceClient faceClient = createClient(FaceClient.class,
            buildSyncAssertingClient(httpClient),
//            httpClient,
            serviceVersion);

        BinaryData imageBinary = BinaryData.fromFile(FileSystems.getDefault().getPath(Resources.TEST_IMAGE_PATH_FAMILY1_DAD1));
        List<FaceDetectionResult> detectResult = faceClient.detect(
            imageBinary,
            FaceDetectionModel.DETECTION_03,
            FaceRecognitionModel.RECOGNITION_04,
            false);

        Assertions.assertEquals(detectResult.size(), 1);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.vision.face.tests.utils.TestUtils#getTestParameters")
    public void testFaceAsyncClient(HttpClient httpClient, FaceServiceVersion serviceVersion) {
        FaceAsyncClient faceClient = createClient(
            FaceAsyncClient.class, buildAsyncAssertingClient(httpClient), serviceVersion);

        BinaryData imageBinary = BinaryData.fromFile(FileSystems.getDefault().getPath(Resources.TEST_IMAGE_PATH_FAMILY1_DAD1));
        List<FaceDetectionResult> detectResult = faceClient.detect(
            imageBinary,
            FaceDetectionModel.DETECTION_03,
            FaceRecognitionModel.RECOGNITION_04,
            false).block();

        Assertions.assertNotNull(detectResult);
        Assertions.assertEquals(detectResult.size(), 1);
    }
}
