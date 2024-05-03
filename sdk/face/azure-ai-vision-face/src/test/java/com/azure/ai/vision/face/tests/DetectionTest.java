// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.vision.face.tests;

import com.azure.ai.vision.face.FaceAsyncClient;
import com.azure.ai.vision.face.FaceClient;
import com.azure.ai.vision.face.samples.utils.Resources;
import com.azure.ai.vision.face.samples.utils.Utils;
import com.azure.ai.vision.face.models.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static com.azure.ai.vision.face.tests.utils.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DetectionTest extends FaceClientTestBase {
    private static FaceAsyncClient mFaceAsyncClient;
    private static FaceClient mFaceClient;

    @BeforeEach
    public void createClients() {
        mFaceClient = createClient(FaceClient.class);
        mFaceAsyncClient = createClient((FaceAsyncClient.class));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getParametersFortTestDetectFaceReturnFaceIdAndReturnRecognitionModelSync")
    public void testDetectFaceReturnFaceIdAndReturnRecognitionModelSync(
        boolean returnFaceId, boolean returnRecognitionModel, FaceRecognitionModel recognitionModel, Supplier<List<FaceDetectionResult>> detectRequest) {
        testDetectFaceReturnFaceIdAndReturnRecognitionModel(returnFaceId, returnRecognitionModel, recognitionModel, detectRequest.get());
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getParametersFortTestDetectFaceReturnFaceIdAndReturnRecognitionModelAsync")
    public void testDetectFaceReturnFaceIdAndReturnRecognitionModelAsync(
        boolean returnFaceId, boolean returnRecognitionModel, FaceRecognitionModel recognitionModel, Supplier<Mono<List<FaceDetectionResult>>> detectRequest) {
        Mono<List<FaceDetectionResult>> mono = detectRequest.get();
        mono.subscribe();
        testDetectFaceReturnFaceIdAndReturnRecognitionModel(returnFaceId, returnRecognitionModel, recognitionModel, mono.block());
    }

    private void testDetectFaceReturnFaceIdAndReturnRecognitionModel(
        boolean returnFaceId, boolean returnRecognitionModel, FaceRecognitionModel recognitionModel, List<FaceDetectionResult> detectResults) {
        Assertions.assertNotNull(detectResults);

        Assertions.assertEquals(detectResults.size(), 1);
        FaceDetectionResult result = detectResults.get(0);

        Assertions.assertEquals(returnFaceId, result.getFaceId() != null);

        FaceRecognitionModel expectReturnedModel = returnFaceId && returnRecognitionModel ? recognitionModel : null;
        Assertions.assertEquals(expectReturnedModel, result.getRecognitionModel());
    }

    private Stream<Arguments> getParametersFortTestDetectFaceReturnFaceIdAndReturnRecognitionModelSync() {
        return getParametersFortTestDetectFaceReturnFaceIdAndReturnRecognitionModelGeneral(
            this::getSyncDetectFunctions);
    }

    private Stream<Arguments> getParametersFortTestDetectFaceReturnFaceIdAndReturnRecognitionModelAsync() {
        return getParametersFortTestDetectFaceReturnFaceIdAndReturnRecognitionModelGeneral(
            this::getAsyncDetectFunctions);
    }

    private <T> Stream<Arguments> getParametersFortTestDetectFaceReturnFaceIdAndReturnRecognitionModelGeneral(
        BiFunction<String, String, Stream<DetectFunction<FaceDetectionModel, FaceRecognitionModel, Boolean, List<FaceAttributeType>, Boolean, Boolean, Integer,
            T>>> getDetectionFunctions) {
        FaceDetectionModel detectionModel = FaceDetectionModel.DETECTION_03;
        FaceRecognitionModel recognitionModel = FaceRecognitionModel.RECOGNITION_04;
        Boolean[] booleanArray = {true, false};

        Stream<BiFunction<Boolean, Boolean, T>> testFunctions = getDetectionFunctions.apply(
                Resources.TEST_IMAGE_PATH_FAMILY1_DAD1,
                Resources.TEST_IMAGE_URL_DETECT_SAMPLE)
            .map(function ->
                (Boolean returnFaceId, Boolean returnRecognitionModel)
                    -> function.apply(detectionModel, recognitionModel, returnFaceId, null, null, returnRecognitionModel, null));

        return testFunctions.
            flatMap(binFunction -> Arrays.stream(booleanArray)
                .flatMap(returnFaceId -> Arrays.stream(booleanArray)
                    .map(returnRecognitionModel -> Arguments.of(returnFaceId, returnRecognitionModel, recognitionModel,
                        (Supplier<T>) () -> binFunction.apply(returnFaceId, returnRecognitionModel)))));
    }

    private Stream<DetectFunction<FaceDetectionModel, FaceRecognitionModel, Boolean, List<FaceAttributeType>, Boolean, Boolean, Integer,
        List<FaceDetectionResult>>> getSyncDetectFunctions(String path, String url) {
        return Stream.of(
            (detectionModel, recognitionModel, returnFaceId, returnFaceAttributes, returnFaceLandmarks, returnRecognitionModel, faceIdTimeToLive)
                -> mFaceClient.detect(Utils.loadFromFile(path), detectionModel, recognitionModel, returnFaceId,
                returnFaceAttributes, returnFaceLandmarks, returnRecognitionModel, faceIdTimeToLive),
            (detectionModel, recognitionModel, returnFaceId, returnFaceAttributes, returnFaceLandmarks, returnRecognitionModel, faceIdTimeToLive)
                -> mFaceClient.detect(Utils.loadFromFile(path),
                    new DetectOptions(detectionModel, recognitionModel, returnFaceId)
                        .setReturnFaceAttributes(returnFaceAttributes)
                        .setReturnFaceLandmarks(returnFaceLandmarks)
                        .setReturnRecognitionModel(returnRecognitionModel)
                        .setFaceIdTimeToLive(faceIdTimeToLive)),
            (detectionModel, recognitionModel, returnFaceId, returnFaceAttributes, returnFaceLandmarks, returnRecognitionModel, faceIdTimeToLive)
                -> mFaceClient.detectFromUrl(url, detectionModel, recognitionModel, returnFaceId,
                returnFaceAttributes, returnFaceLandmarks, returnRecognitionModel, faceIdTimeToLive),
            (detectionModel, recognitionModel, returnFaceId, returnFaceAttributes, returnFaceLandmarks, returnRecognitionModel, faceIdTimeToLive)
                -> mFaceClient.detectFromUrl(url,
                    new DetectOptions(detectionModel, recognitionModel, returnFaceId)
                        .setReturnFaceAttributes(returnFaceAttributes)
                        .setReturnFaceLandmarks(returnFaceLandmarks)
                        .setReturnRecognitionModel(returnRecognitionModel)
                        .setFaceIdTimeToLive(faceIdTimeToLive))
        );
    }

    private Stream<DetectFunction<FaceDetectionModel, FaceRecognitionModel, Boolean, List<FaceAttributeType>, Boolean, Boolean, Integer,
        Mono<List<FaceDetectionResult>>>> getAsyncDetectFunctions(String path, String url) {
        return Stream.of(
            (detectionModel, recognitionModel, returnFaceId, returnFaceAttributes, returnFaceLandmarks, returnRecognitionModel, faceIdTimeToLive)
                -> mFaceAsyncClient.detect(Utils.loadFromFile(path), detectionModel, recognitionModel, returnFaceId,
                returnFaceAttributes, returnFaceLandmarks, returnRecognitionModel, faceIdTimeToLive),
            (detectionModel, recognitionModel, returnFaceId, returnFaceAttributes, returnFaceLandmarks, returnRecognitionModel, faceIdTimeToLive)
                -> mFaceAsyncClient.detect(Utils.loadFromFile(path),
                    new DetectOptions(detectionModel, recognitionModel, returnFaceId)
                        .setReturnFaceAttributes(returnFaceAttributes)
                        .setReturnFaceLandmarks(returnFaceLandmarks)
                        .setReturnRecognitionModel(returnRecognitionModel)
                        .setFaceIdTimeToLive(faceIdTimeToLive)),
            (detectionModel, recognitionModel, returnFaceId, returnFaceAttributes, returnFaceLandmarks, returnRecognitionModel, faceIdTimeToLive)
                -> mFaceAsyncClient.detectFromUrl(url, detectionModel, recognitionModel, returnFaceId,
                returnFaceAttributes, returnFaceLandmarks, returnRecognitionModel, faceIdTimeToLive),
            (detectionModel, recognitionModel, returnFaceId, returnFaceAttributes, returnFaceLandmarks, returnRecognitionModel, faceIdTimeToLive)
                -> mFaceAsyncClient.detectFromUrl(url,
                    new DetectOptions(detectionModel, recognitionModel, returnFaceId)
                        .setReturnFaceAttributes(returnFaceAttributes)
                        .setReturnFaceLandmarks(returnFaceLandmarks)
                        .setReturnRecognitionModel(returnRecognitionModel)
                        .setFaceIdTimeToLive(faceIdTimeToLive))
        );
    }
}

@FunctionalInterface
interface DetectFunction<A1, A2, A3, A4, A5, A6, A7, TReturn> {
    TReturn apply(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5, A6 a6, A7 a7);
}
