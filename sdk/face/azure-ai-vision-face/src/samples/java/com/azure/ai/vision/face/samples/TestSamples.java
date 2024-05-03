// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.vision.face.samples;

import com.azure.ai.vision.face.FaceClient;
import com.azure.ai.vision.face.FaceClientBuilder;
import com.azure.ai.vision.face.FaceSessionClient;
import com.azure.ai.vision.face.FaceSessionClientBuilder;
import com.azure.ai.vision.face.models.CreateLivenessSessionContent;
import com.azure.ai.vision.face.models.CreateLivenessWithVerifySessionResult;
import com.azure.ai.vision.face.models.FaceAttributeType;
import com.azure.ai.vision.face.models.FaceDetectionModel;
import com.azure.ai.vision.face.models.FaceDetectionResult;
import com.azure.ai.vision.face.models.FaceRecognitionModel;
import com.azure.ai.vision.face.models.LivenessOperationMode;
import com.azure.ai.vision.face.models.LivenessSessionAuditEntry;
import com.azure.ai.vision.face.models.LivenessSessionItem;
import com.azure.ai.vision.face.models.LivenessWithVerifySession;
import com.azure.ai.vision.face.samples.utils.ApplicationManager;
import com.azure.ai.vision.face.samples.utils.ConfigurationHelper;
import com.azure.ai.vision.face.samples.utils.Resources;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.BinaryData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

import static com.azure.ai.vision.face.samples.utils.Utils.log;

public final class TestSamples {
    private static final ApplicationManager APPLICATION_MANAGER = new ApplicationManager();

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
//        System.setProperty("http.proxyHost", "127.0.0.1");
//        System.setProperty("http.proxyPort", "8888");
//        System.setProperty("https.proxyHost", "127.0.0.1");
//        System.setProperty("https.proxyPort", "8888");
//        System.setProperty("javax.net.ssl.trustStore", "e:\\FiddlerKeystore");
//        System.setProperty("javax.net.ssl.trustStorePassword", "leareai");
        String endpoint = ConfigurationHelper.getEndpoint();
        String accountKey = ConfigurationHelper.getAccountKey();


        log("accountName:" + endpoint + ", accountKey:" + accountKey + ", dir:" + System.getProperty("user.dir"));

//        var request = HttpRequest.newBuilder()
//            .uri(new URI("http://localhost:8081/detect"))
//            .setHeader("apim-subscription-id", "lel")
//            .setHeader("Content-Type","application/octet-stream")
//            .POST(HttpRequest.BodyPublishers.ofFile(
//                Path.of(SampleUtils.TEST_IMAGE_PATH_FAMILY1_DAD1)))
//            .build();
//        var httpClient = HttpClient.newHttpClient();
//        HttpResponse<String> resp = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//        log("result:" + resp.body());

        FaceClient client = new FaceClientBuilder()
            .endpoint(endpoint)
            .credential(new AzureKeyCredential(accountKey))
//            .credential(new DefaultAzureCredentialBuilder()
            .buildClient();


        Path path = FileSystems.getDefault().getPath(Resources.TEST_IMAGE_PATH_FAMILY1_DAD1);
        BinaryData data = BinaryData.fromFile(path);
        List<FaceDetectionResult> results = client.detect(data,
            FaceDetectionModel.DETECTION_01,
            FaceRecognitionModel.RECOGNITION_04,
            true,
            Collections.singletonList(FaceAttributeType.Detection01.BLUR));

        FaceDetectionResult result = results.get(0);
        log("result:" + result.getFaceId());

//
//        RequestOptions requestOptions = new RequestOptions();
//        requestOptions.setHeader("apim-subscription-id", "lel");
//
//        Response<BinaryData> response = client.detectWithResponse(data, requestOptions);
//        log("result:" + response.getStatusCode());




//        client.verifyFaceToFace(result.getFaceId(), result.getFaceId());

//        FaceAdministrationClient administrationClient = new FaceAdministrationClientBuilder()
//            .endpoint(endpoint)
//            .credential(new AzureKeyCredential(accountKey))
////            .credential(new DefaultAzureCredentialBuilder()
//            .buildClient();

//        LargePersonGroup lpg = new LargePersonGroup("Bill");
//        lpg.setUserData("No data");
//        String id = "lpg01";
//        administrationClient.createLargePersonGroup(id, lpg);
//        SyncPoller<CollectionTrainingStatus, Void>  poller = administrationClient.beginTrainPersonGroup(id);
//        PollResponse<CollectionTrainingStatus> response = poller.waitForCompletion();
//        CollectionTrainingStatus status = response.getValue();

        ObjectMapper objectMapper = JsonMapper.builder().addModule(new JavaTimeModule()).build();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
//
//
        FaceSessionClient faceSessionClient = new FaceSessionClientBuilder()
            .endpoint(endpoint)
            .credential(new AzureKeyCredential(accountKey))
//            .credential(new DefaultAzureCredentialBuilder().build())
            .buildClient();
//
//        LivenessSessionCreationContent content = new LivenessSessionCreationContent(LivenessOperationMode.PASSIVE)
//            .setDeviceCorrelationId("device_"+ UUID.randomUUID())
//            //            .setDeviceCorrelationIdSetInClient(true)
//            .setSendResultsToClient(true)
//            .setAuthTokenTimeToLiveInSeconds(60);
//
//
//        LivenessSessionCreationResult livenessSessionCreationResult = faceSessionClient.createLivenessSession(content);
//        log("livenessSessionCreationResult:" + objectMapper.writeValueAsString(livenessSessionCreationResult));
//
//        List<LivenessSessionItem> sessions = faceSessionClient.getLivenessSessions();
//        log("livenessSession:" + objectMapper.writeValueAsString(sessions));
//
//        LivenessSession livenessSession = faceSessionClient.getLivenessSessionResult(livenessSessionCreationResult.getSessionId());
//        log("LivenessSession Resulut:" + objectMapper.writeValueAsString(livenessSession));
//        log("result:" + objectMapper.writeValueAsString(livenessSession.getResult()));
//        log("id:" + livenessSession.getId() + ", status:" + livenessSession.getStatus() + ", createdDateTime:" + livenessSession.getCreatedDateTime() +
//            ", sessionStartDateTime:" + livenessSession.getSessionStartDateTime() + ", sessionExpired:" + livenessSession.isSessionExpired());
//
//
//        List<LivenessSessionAuditEntry> livenessSessionAuditEntries = faceSessionClient.getLivenessSessionAuditEntries(livenessSessionCreationResult.getSessionId());
//        log("livenessSessionAuditEntries for id " + livenessSessionCreationResult.getSessionId() + ": " + objectMapper.writeValueAsString(livenessSessionAuditEntries));
//
//        faceSessionClient.deleteLivenessSession(livenessSessionCreationResult.getSessionId());

        CreateLivenessSessionContent parameters = new CreateLivenessSessionContent(LivenessOperationMode.PASSIVE)
            .setSendResultsToClient(true)
            .setDeviceCorrelationIdSetInClient(true)
            .setAuthTokenTimeToLiveInSeconds(60);

        CreateLivenessWithVerifySessionResult livenessSessionWithVerifyCreationResult =
            faceSessionClient.createLivenessWithVerifySession(parameters, data);

        CreateLivenessWithVerifySessionResult livenessSessionWithVerifyCreationResult2 =
            faceSessionClient.createLivenessWithVerifySession(parameters, null);

        log("livenessSessionCreationResult:" + objectMapper.writeValueAsString(livenessSessionWithVerifyCreationResult));
        log("livenessSessionCreationResult2:" + objectMapper.writeValueAsString(livenessSessionWithVerifyCreationResult2));
//
        List<LivenessSessionItem> sessions = faceSessionClient.getLivenessWithVerifySessions();
        log("get all sessions forLivenessWithVerify " + objectMapper.writeValueAsString(sessions));
//
        LivenessWithVerifySession livenessWithVerifySession = faceSessionClient.getLivenessWithVerifySessionResult(livenessSessionWithVerifyCreationResult.getSessionId());
        log("livenessWithVerifySession result:" + objectMapper.writeValueAsString(livenessWithVerifySession));
        LivenessWithVerifySession livenessWithVerifySession2 = faceSessionClient.getLivenessWithVerifySessionResult(livenessSessionWithVerifyCreationResult2.getSessionId());
        log("livenessWithVerifySession result2:" + objectMapper.writeValueAsString(livenessWithVerifySession2));
//
        List<LivenessSessionAuditEntry> livenessSessionAuditEntries = faceSessionClient.getLivenessWithVerifySessionAuditEntries(livenessSessionWithVerifyCreationResult.getSessionId());
        log("livenessSessionAuditEntries for id " + livenessSessionWithVerifyCreationResult.getSessionId() + ": " + objectMapper.writeValueAsString(livenessSessionAuditEntries));
//
        faceSessionClient.deleteLivenessWithVerifySession(livenessSessionWithVerifyCreationResult.getSessionId());
        faceSessionClient.deleteLivenessWithVerifySession(livenessSessionWithVerifyCreationResult2.getSessionId());


//        client.detectWithResponse()

//        Response<BinaryData> binaryDataResponse = client.detectWithResponse(data, new RequestOptions());
//
//        TestModel(client, objectMapper, data, FaceRecognitionModel.RECOGNITION_04,  FaceDetectionModel.DETECTION_01,
//            new FaceAttributeType[] {FaceAttributeType.AGE, FaceAttributeType.ACCESSORIES, FaceAttributeType.BLUR, FaceAttributeType.EMOTION, FaceAttributeType.EXPOSURE,
//                FaceAttributeType.FACIAL_HAIR, FaceAttributeType.GENDER, FaceAttributeType.GLASSES, FaceAttributeType.HAIR, FaceAttributeType.HEAD_POSE,
//                FaceAttributeType.MAKEUP, FaceAttributeType.NOISE, FaceAttributeType.OCCLUSION, FaceAttributeType.QUALITY_FOR_RECOGNITION, FaceAttributeType.SMILE, FaceAttributeType.MASK});

//        TestModel(client, objectMapper, data, FaceRecognitionModel.RECOGNITION_04,  FaceDetectionModel.DETECTION_01,
//            Arrays.asList(FaceAttributeType.ACCESSORIES, FaceAttributeType.BLUR,  FaceAttributeType.EXPOSURE,
//                FaceAttributeType.GLASSES, FaceAttributeType.HEAD_POSE,
//                FaceAttributeType.NOISE, FaceAttributeType.OCCLUSION, FaceAttributeType.QUALITY_FOR_RECOGNITION,
//                MyFaceAttributeType.AGE,
//                MyFaceAttributeType.EMOTION,
//                MyFaceAttributeType.FACIAL_HAIR,
//                MyFaceAttributeType.GENDER,
//                MyFaceAttributeType.HAIR,
//                MyFaceAttributeType.MAKEUP,
//                MyFaceAttributeType.SMILE));
//
//        TestModel(client, objectMapper, data, FaceRecognitionModel.RECOGNITION_04,  FaceDetectionModel.DETECTION_02, null);
//        TestModel(client, objectMapper, data, FaceRecognitionModel.RECOGNITION_04,  FaceDetectionModel.DETECTION_03,
//            Arrays.asList(FaceAttributeType.HEAD_POSE, FaceAttributeType.MASK, FaceAttributeType.QUALITY_FOR_RECOGNITION));


//        FaceAsyncClient asyncClient = new FaceClientBuilder()
//            .endpoint(endpoint)
//            .credential(new AzureKeyCredential(accountKey))
//            .buildAsyncClient();
//
//        Mono<List<FaceDetectionResult>> listMono =  asyncClient.detect(data);
//        log("start");
//        listMono
//            .subscribeOn(Schedulers.boundedElastic())
//            .subscribe(result -> {
//            try {
//                Thread.sleep(1000);
//                log(
//                    "Face:" + objectMapper.writeValueAsString(result));
//            } catch (JsonProcessingException | InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            sApplicationManager.stopApplication();
//            log("Done");
//        });

        log("end");

//        sApplicationManager.waitingForApplicationStop();
    }

    private static void testModel(
        FaceClient client,
        ObjectMapper objectMapper,
        BinaryData data,
        FaceRecognitionModel recognitionModel,
        FaceDetectionModel detectionModel,
        List<FaceAttributeType> attributesArray) {

        List<FaceDetectionResult> results = client.detect(
            data,
            detectionModel,
            recognitionModel,
            detectionModel != FaceDetectionModel.DETECTION_02,
            attributesArray,
            true,
            true,
            86400);

        results.forEach(result -> {
            try {
                log(
                    "Face:" + objectMapper.writeValueAsString(result));
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
