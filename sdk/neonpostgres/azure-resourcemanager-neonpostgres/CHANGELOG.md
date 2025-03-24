# Release History

## 1.0.0-beta.2 (2025-03-24)

- Azure Resource Manager Neon Postgres client library for Java. This package contains Microsoft Azure SDK for Neon Postgres Management SDK. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.NeonDatabase$Definition` was added

* `models.NeonRole$DefinitionStages` was added

* `models.NeonRoles` was added

* `models.Project$DefinitionStages` was added

* `models.NeonDatabases` was added

* `implementation.models.EndpointListResult` was added

* `implementation.models.ProjectListResult` was added

* `implementation.models.NeonRoleListResult` was added

* `models.models.NeonRoleProperties` was added

* `models.Project$Update` was added

* `models.models.EndpointType` was added

* `models.Compute$DefinitionStages` was added

* `models.Branches` was added

* `models.Computes` was added

* `models.models.PgVersion` was added

* `models.Endpoint` was added

* `models.Endpoint$DefinitionStages` was added

* `models.Endpoint$Definition` was added

* `models.models.Attributes` was added

* `models.Project$Definition` was added

* `models.Endpoint$Update` was added

* `models.NeonDatabase` was added

* `models.NeonDatabase$Update` was added

* `implementation.models.NeonDatabaseListResult` was added

* `implementation.models.ComputeListResult` was added

* `models.Compute$Definition` was added

* `models.Compute$Update` was added

* `models.NeonRole$Definition` was added

* `models.models.ComputeProperties` was added

* `implementation.models.BranchListResult` was added

* `models.Branch` was added

* `models.models.ProjectProperties` was added

* `models.NeonRole` was added

* `models.models.BranchProperties` was added

* `models.models.EndpointProperties` was added

* `models.Branch$UpdateStages` was added

* `models.NeonDatabase$UpdateStages` was added

* `models.NeonRole$Update` was added

* `models.Endpoints` was added

* `models.NeonDatabase$DefinitionStages` was added

* `models.models.DefaultEndpointSettings` was added

* `models.Project` was added

* `models.Compute$UpdateStages` was added

* `models.Compute` was added

* `models.Branch$DefinitionStages` was added

* `models.Endpoint$UpdateStages` was added

* `models.Project$UpdateStages` was added

* `models.Branch$Definition` was added

* `models.Branch$Update` was added

* `models.Projects` was added

* `models.NeonRole$UpdateStages` was added

* `models.models.NeonDatabaseProperties` was added

#### `models.Organizations` was modified

* `getPostgresVersionsWithResponse(java.lang.String,models.models.PgVersion,com.azure.core.util.Context)` was added
* `getPostgresVersions(java.lang.String)` was added

#### `models.OrganizationProperties` was modified

* `projectProperties()` was added
* `withProjectProperties(models.models.ProjectProperties)` was added

#### `NeonPostgresManager` was modified

* `computes()` was added
* `branches()` was added
* `endpoints()` was added
* `neonDatabases()` was added
* `neonRoles()` was added
* `projects()` was added

## 1.0.0-beta.1 (2024-12-03)

- Azure Resource Manager Neon Postgres client library for Java. This package contains Microsoft Azure SDK for Neon Postgres Management SDK. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

- Initial release for the azure-resourcemanager-neonpostgres Java SDK.
