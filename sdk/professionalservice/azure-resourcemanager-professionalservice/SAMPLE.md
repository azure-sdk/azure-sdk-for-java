# Code snippets and samples


## Operations

- [List](#operations_list)

## ProfessionalService

- [CreateOrUpdate](#professionalservice_createorupdate)
- [Delete](#professionalservice_delete)
- [Get](#professionalservice_get)

## ProfessionalServiceForEnrollment

- [CreateOrUpdate](#professionalserviceforenrollment_createorupdate)
- [Delete](#professionalserviceforenrollment_delete)
- [Get](#professionalserviceforenrollment_get)

## ProfessionalServiceOperation

- [Get](#professionalserviceoperation_get)
### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/professionalservice/resource-manager/Microsoft.ProfessionalService/stable/2020-05-01/examples/OperationsRp/GetRpOperations.json
     */
    /**
     * Sample code: Get professional service operations.
     *
     * @param manager Entry point to ProfessionalServiceManager.
     */
    public static void getProfessionalServiceOperations(
        com.azure.resourcemanager.professionalservice.ProfessionalServiceManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

### ProfessionalService_CreateOrUpdate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.professionalservice.models.ProfessionalServiceCreationProperties;
import com.azure.resourcemanager.professionalservice.models.ProfessionalServiceResourceCreation;
import java.util.HashMap;
import java.util.Map;

/** Samples for ProfessionalService CreateOrUpdate. */
public final class ProfessionalServiceCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/professionalservice/resource-manager/Microsoft.ProfessionalService/stable/2020-05-01/examples/ProfessionalService/ProfessionalServicePut.json
     */
    /**
     * Sample code: Create professional service resource.
     *
     * @param manager Entry point to ProfessionalServiceManager.
     */
    public static void createProfessionalServiceResource(
        com.azure.resourcemanager.professionalservice.ProfessionalServiceManager manager) {
        manager
            .professionalServices()
            .createOrUpdate(
                "48cb92a8-b67e-5a1b-4c7b-7bafbb523123",
                "AYOE-3HRP-BG7-ABC",
                "GOSZ-YOKV-PJA-ABC",
                "ps_subscription",
                new ProfessionalServiceResourceCreation()
                    .withName("ps_subscription")
                    .withLocation("global")
                    .withProperties(
                        new ProfessionalServiceCreationProperties()
                            .withOfferId("testprofservice")
                            .withPublisherId("profservicepublisher")
                            .withSkuId("ff051f4f-a6d9-4cbc-8d9a-2a41bd468abc")
                            .withPaymentChannelMetadata(
                                mapOf("OrganizationId", "fe8fd1af-1f5d-47f5-9db2-600bc5c74123_2018-09-30"))
                            .withTermId("hjdtn7tfnxcy")
                            .withQuoteId("quoteabc")),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### ProfessionalService_Delete

```java
import com.azure.core.util.Context;

/** Samples for ProfessionalService Delete. */
public final class ProfessionalServiceDeleteSamples {
    /*
     * x-ms-original-file: specification/professionalservice/resource-manager/Microsoft.ProfessionalService/stable/2020-05-01/examples/ProfessionalService/ProfessionalServiceDelete.json
     */
    /**
     * Sample code: Delete professional service resource.
     *
     * @param manager Entry point to ProfessionalServiceManager.
     */
    public static void deleteProfessionalServiceResource(
        com.azure.resourcemanager.professionalservice.ProfessionalServiceManager manager) {
        manager
            .professionalServices()
            .delete(
                "48cb92a8-b67e-5a1b-4c7b-7bafbb523123",
                "AYOE-3HRP-BG7-ABC",
                "GOSZ-YOKV-PJA-ABC",
                "ps_subscription",
                Context.NONE);
    }
}
```

### ProfessionalService_Get

```java
import com.azure.core.util.Context;

/** Samples for ProfessionalService Get. */
public final class ProfessionalServiceGetSamples {
    /*
     * x-ms-original-file: specification/professionalservice/resource-manager/Microsoft.ProfessionalService/stable/2020-05-01/examples/ProfessionalService/ProfessionalServiceGet.json
     */
    /**
     * Sample code: Get professional service resource.
     *
     * @param manager Entry point to ProfessionalServiceManager.
     */
    public static void getProfessionalServiceResource(
        com.azure.resourcemanager.professionalservice.ProfessionalServiceManager manager) {
        manager
            .professionalServices()
            .getWithResponse(
                "48cb92a8-b67e-5a1b-4c7b-7bafbb523123",
                "AYOE-3HRP-BG7-ABC",
                "GOSZ-YOKV-PJA-ABC",
                "ps_subscription",
                Context.NONE);
    }
}
```

### ProfessionalServiceForEnrollment_CreateOrUpdate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.professionalservice.models.ProfessionalServiceCreationProperties;
import com.azure.resourcemanager.professionalservice.models.ProfessionalServiceResourceCreation;
import java.util.HashMap;
import java.util.Map;

/** Samples for ProfessionalServiceForEnrollment CreateOrUpdate. */
public final class ProfessionalServiceForEnrollmentCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/professionalservice/resource-manager/Microsoft.ProfessionalService/stable/2020-05-01/examples/ProfessionalService/ProfessionalServiceEnrollmentPut.json
     */
    /**
     * Sample code: Create professional service resource.
     *
     * @param manager Entry point to ProfessionalServiceManager.
     */
    public static void createProfessionalServiceResource(
        com.azure.resourcemanager.professionalservice.ProfessionalServiceManager manager) {
        manager
            .professionalServiceForEnrollments()
            .createOrUpdate(
                "123456",
                "ps_subscription",
                new ProfessionalServiceResourceCreation()
                    .withName("ps_subscription")
                    .withLocation("global")
                    .withProperties(
                        new ProfessionalServiceCreationProperties()
                            .withOfferId("testprofservice")
                            .withPublisherId("profservicepublisher")
                            .withSkuId("ff051f4f-a6d9-4cbc-8d9a-2a41bd468abc")
                            .withPaymentChannelMetadata(
                                mapOf("OrganizationId", "fe8fd1af-1f5d-47f5-9db2-600bc5c74123_2018-09-30"))
                            .withTermId("hjdtn7tfnxcy")
                            .withQuoteId("quoteabc")),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### ProfessionalServiceForEnrollment_Delete

```java
import com.azure.core.util.Context;

/** Samples for ProfessionalServiceForEnrollment Delete. */
public final class ProfessionalServiceForEnrollmentDeleteSamples {
    /*
     * x-ms-original-file: specification/professionalservice/resource-manager/Microsoft.ProfessionalService/stable/2020-05-01/examples/ProfessionalService/ProfessionalServiceEnrollmentDelete.json
     */
    /**
     * Sample code: Delete professional service resource.
     *
     * @param manager Entry point to ProfessionalServiceManager.
     */
    public static void deleteProfessionalServiceResource(
        com.azure.resourcemanager.professionalservice.ProfessionalServiceManager manager) {
        manager.professionalServiceForEnrollments().delete("123456", "ps_subscription", Context.NONE);
    }
}
```

### ProfessionalServiceForEnrollment_Get

```java
import com.azure.core.util.Context;

/** Samples for ProfessionalServiceForEnrollment Get. */
public final class ProfessionalServiceForEnrollmentGetSamples {
    /*
     * x-ms-original-file: specification/professionalservice/resource-manager/Microsoft.ProfessionalService/stable/2020-05-01/examples/ProfessionalService/ProfessionalServiceEnrollmentGet.json
     */
    /**
     * Sample code: Get professional service resource.
     *
     * @param manager Entry point to ProfessionalServiceManager.
     */
    public static void getProfessionalServiceResource(
        com.azure.resourcemanager.professionalservice.ProfessionalServiceManager manager) {
        manager.professionalServiceForEnrollments().getWithResponse("123456", "ps_subscription", Context.NONE);
    }
}
```

### ProfessionalServiceOperation_Get

```java
import com.azure.core.util.Context;

/** Samples for ProfessionalServiceOperation Get. */
public final class ProfessionalServiceOperationGetSamples {
    /*
     * x-ms-original-file: specification/professionalservice/resource-manager/Microsoft.ProfessionalService/stable/2020-05-01/examples/OperationResults/Get.json
     */
    /**
     * Sample code: Get operation status.
     *
     * @param manager Entry point to ProfessionalServiceManager.
     */
    public static void getOperationStatus(
        com.azure.resourcemanager.professionalservice.ProfessionalServiceManager manager) {
        manager.professionalServiceOperations().get("2499e7c2-d251-4a54-9b0f-7673fe325283", Context.NONE);
    }
}
```

