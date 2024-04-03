## Generate autorest code

```yaml
use: '@autorest/java@4.1.26'
java: true
data-plane: true
title: LoadTestingClient
package-version: 1.0.0
security: AADToken
security-scopes: https://cnt-prod.loadtesting.azure.com/.default
artifact-id: azure-developer-loadtesting
namespace: com.azure.developer.loadtesting
generate-builder-per-client: true
enable-sync-stack: true
partial-update: true
output-folder: $(azure-sdk-for-java-folder)/sdk/loadtesting/azure-developer-loadtesting
service-versions:
  - '2022-11-01'
directive:
  - rename-operation:
      from: LoadTestRun_ListMetricNamespaces
      to: LoadTestRun_GetMetricNamespaces
  - rename-operation:
      from: LoadTestRun_ListMetricDefinitions
      to: LoadTestRun_GetMetricDefinitions
  - where-operation: LoadTestRun_ListMetrics
    transform: $['parameters'][3]['x-ms-client-name'] = 'metricName'
  - where-operation: LoadTestRun_ListMetricDimensionValues
    transform: $['parameters'][3]['x-ms-client-name'] = 'metricName'
require: /mnt/vss/_work/1/s/azure-rest-api-specs/specification/loadtestservice/data-plane/readme.md
```
