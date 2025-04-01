# Release History

## 1.0.0-beta.1 (2025-04-01)

- Azure Resource Manager Advisor client library for Java. This package contains Microsoft Azure SDK for Advisor Management SDK. REST APIs for Azure Advisor. Package tag package-2024-11-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.Assessments` was added

* `models.RecommendationPropertiesResourceWorkload` was added

* `models.TriageResource` was added

* `models.ReviewStatus` was added

* `models.RecommendationRejectBody` was added

* `models.Workloads` was added

* `models.TrackedRecommendationPropertiesPayloadProperties` was added

* `models.AdvisorScoreEntityProperties` was added

* `models.PredictionType` was added

* `models.AdvisorScoreResponse` was added

* `models.WorkloadListResult` was added

* `models.ScoreEntity` was added

* `models.AssessmentResult$UpdateStages` was added

* `models.PredictionRequest` was added

* `models.AssessmentTypes` was added

* `models.PredictionResponse` was added

* `models.TriageRecommendation` was added

* `models.AssessmentResult` was added

* `models.AssessmentResult$DefinitionStages` was added

* `models.State` was added

* `models.ReasonForRejectionName` was added

* `models.ResiliencyReviews` was added

* `models.Priority` was added

* `models.Risk` was added

* `models.TrackedRecommendationPropertiesPayload` was added

* `models.TriageRecommendations` was added

* `models.ResiliencyReview` was added

* `models.AssessmentResult$Definition` was added

* `models.AssessmentResult$Update` was added

* `models.AdvisorScores` was added

* `models.TriageRecommendationCollection` was added

* `models.AssessmentTypeListResult` was added

* `models.TrackedRecommendationProperties` was added

* `models.RecommendationPropertiesReview` was added

* `models.DurationModel` was added

* `models.ResiliencyReviewCollection` was added

* `models.AdvisorScoreEntity` was added

* `models.RecommendationStatusName` was added

* `models.AssessmentTypeResult` was added

* `models.Reason` was added

* `models.TriageResourceCollection` was added

* `models.AssessmentListResult` was added

* `models.ResourceProviders` was added

* `models.WorkloadResult` was added

* `models.TimeSeriesEntityItem` was added

* `models.PriorityName` was added

* `models.Aggregated` was added

* `models.TriageResources` was added

#### `models.ConfigData` was modified

* `duration()` was added
* `systemData()` was added

#### `models.Recommendations` was modified

* `patch(java.lang.String,java.lang.String,models.TrackedRecommendationPropertiesPayload)` was added
* `patchWithResponse(java.lang.String,java.lang.String,models.TrackedRecommendationPropertiesPayload,com.azure.core.util.Context)` was added

#### `models.ConfigData$Definition` was modified

* `withDuration(models.DurationModel)` was added

#### `AdvisorManager` was modified

* `triageResources()` was added
* `workloads()` was added
* `resourceProviders()` was added
* `triageRecommendations()` was added
* `assessments()` was added
* `advisorScores()` was added
* `assessmentTypes()` was added
* `resiliencyReviews()` was added

#### `models.SuppressionContract` was modified

* `systemData()` was added

#### `models.ResourceRecommendationBase` was modified

* `risk()` was added
* `resourceWorkload()` was added
* `trackedProperties()` was added
* `systemData()` was added
* `review()` was added
* `tracked()` was added
* `notes()` was added
* `sourceSystem()` was added

## 1.0.0 (2024-12-23)

- Azure Resource Manager Advisor client library for Java. This package contains Microsoft Azure SDK for Advisor Management SDK. REST APIs for Azure Advisor. Package tag package-2020-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Other Changes

- Release for Azure Resource Manager Advisor client library for Java.

## 1.0.0-beta.3 (2024-10-14)

- Azure Resource Manager Advisor client library for Java. This package contains Microsoft Azure SDK for Advisor Management SDK. REST APIs for Azure Advisor. Package tag package-2020-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.ConfigurationListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationEntityListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResourceMetadata` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MetadataSupportedValueDetail` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MetadataEntityListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationDisplayInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DigestConfig` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResourceRecommendationBaseListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SuppressionContractListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ShortDescription` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.0.0-beta.2 (2023-01-11)

- Azure Resource Manager Advisor client library for Java. This package contains Microsoft Azure SDK for Advisor Management SDK. REST APIs for Azure Advisor. Package tag package-2020-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.Risk` was removed

#### `models.ResourceRecommendationBase` was modified

* `risk()` was removed

### Features Added

#### `AdvisorManager$Configurable` was modified

* `withScope(java.lang.String)` was added
* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added

#### `AdvisorManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

## 1.0.0-beta.1 (2021-04-12)

- Azure Resource Manager Advisor client library for Java. This package contains Microsoft Azure SDK for Advisor Management SDK. REST APIs for Azure Advisor. Package tag package-2020-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
