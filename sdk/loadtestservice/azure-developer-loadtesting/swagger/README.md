## Generate autorest code

```yaml
require: /mnt/vss/_work/1/s/azure-rest-api-specs/specification/loadtestservice/data-plane/readme.md
output-folder: ../
java: true
regenerate-pom: false
title: LoadTestingClient
security: AADToken
security-scopes: https://loadtest.azure-dev.com/.default
data-plane: true
generate-tests: true
generate-samples: true
namespace: com.azure.developer.loadtesting
service-versions:
- '2022-11-01'
```
