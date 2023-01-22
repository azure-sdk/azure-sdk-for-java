## Generate autorest code

```yaml
java: true
data-plane: true
title: LoadTestingClient
package-version: 1.0.0-beta.2
security: AADToken
security-scopes: https://cnt-prod.loadtesting.azure.com/.default
artifact-id: azure-developer-loadtesting
namespace: com.azure.developer.loadtesting
generate-builder-per-client: false
partial-update: true
output-folder: $(azure-sdk-for-java-folder)/sdk/loadtesting/azure-developer-loadtesting
service-versions:
  - '2022-11-01'
require: /mnt/vss/_work/1/s/azure-rest-api-specs/specification/loadtestservice/data-plane/readme.md
```
