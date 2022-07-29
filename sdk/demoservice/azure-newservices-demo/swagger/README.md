## Generate autorest code

```yaml
require: /mnt/vss/_work/1/s/azure-rest-api-specs/specification/demoservice/data-plane/readme.md
output-folder: ../
java: true
regenerate-pom: false
title: DemoNewServiceClient
security: AADToken
security-scopes: https://api.adu.microsoft.com/.default
data-plane: true
generate-tests: true
generate-samples: true
namespace: com.azure.newservices.demo
service-versions:
- 2022-07-01-preview
```
