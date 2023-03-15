# Code snippets and samples


## Chambers

- [CreateOrUpdate](#chambers_createorupdate)
- [Delete](#chambers_delete)
- [Get](#chambers_get)
- [GetUploadUri](#chambers_getuploaduri)
- [LicenseRestart](#chambers_licenserestart)
- [LicenseUpdate](#chambers_licenseupdate)
- [List](#chambers_list)
- [Restart](#chambers_restart)
- [Start](#chambers_start)
- [Stop](#chambers_stop)
- [Update](#chambers_update)

## Connectors

- [CreateOrUpdate](#connectors_createorupdate)
- [Delete](#connectors_delete)
- [Get](#connectors_get)
- [LicenseAdd](#connectors_licenseadd)
- [List](#connectors_list)
- [Restart](#connectors_restart)
- [Start](#connectors_start)
- [Stop](#connectors_stop)
- [Update](#connectors_update)

## FileOperation

- [Manage](#fileoperation_manage)

## FileRequestOperation

- [GetDownloadUri](#filerequestoperation_getdownloaduri)

## FileRequests

- [Get](#filerequests_get)
- [List](#filerequests_list)
- [Manage](#filerequests_manage)

## Files

- [DownloadRequest](#files_downloadrequest)
- [Get](#files_get)
- [List](#files_list)

## Operations

- [List](#operations_list)

## Storages

- [CreateOrUpdate](#storages_createorupdate)
- [Delete](#storages_delete)
- [Get](#storages_get)
- [List](#storages_list)
- [Update](#storages_update)

## Workbenches

- [CreateOrUpdate](#workbenches_createorupdate)
- [Delete](#workbenches_delete)
- [GetByResourceGroup](#workbenches_getbyresourcegroup)
- [List](#workbenches_list)
- [ListByResourceGroup](#workbenches_listbyresourcegroup)
- [Update](#workbenches_update)

## Workloads

- [CreateOrUpdate](#workloads_createorupdate)
- [Delete](#workloads_delete)
- [Get](#workloads_get)
- [List](#workloads_list)
- [Restart](#workloads_restart)
- [Start](#workloads_start)
- [Stop](#workloads_stop)
- [Update](#workloads_update)
### Chambers_CreateOrUpdate

```java
/** Samples for Chambers CreateOrUpdate. */
public final class ChambersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ChambersCreateOrUpdate.json
     */
    /**
     * Sample code: Create Chamber.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void createChamber(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .chambers()
            .define("test-chamber")
            .withRegion((String) null)
            .withExistingWorkbenche("resourceGroup", "test-workbench")
            .create();
    }
}
```

### Chambers_Delete

```java
/** Samples for Chambers Delete. */
public final class ChambersDeleteSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ChambersDelete.json
     */
    /**
     * Sample code: Delete Chamber.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void deleteChamber(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.chambers().delete("resourceGroup", "test-workbench", "test-chamber", com.azure.core.util.Context.NONE);
    }
}
```

### Chambers_Get

```java
/** Samples for Chambers Get. */
public final class ChambersGetSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ChambersGet.json
     */
    /**
     * Sample code: Get Chamber.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void getChamber(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .chambers()
            .getWithResponse("resourceGroup", "test-workbench", "test-chamber", com.azure.core.util.Context.NONE);
    }
}
```

### Chambers_GetUploadUri

```java
import com.azure.resourcemanager.modsimworkbench.models.FileUploadParameters;

/** Samples for Chambers GetUploadUri. */
public final class ChambersGetUploadUriSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ChambersGetUploadUri.json
     */
    /**
     * Sample code: Chambers get upload Uri.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void chambersGetUploadUri(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .chambers()
            .getUploadUriWithResponse(
                "resourceGroup",
                "test-workbench",
                "test-chamber",
                new FileUploadParameters().withFileSize(1073741824L),
                com.azure.core.util.Context.NONE);
    }
}
```

### Chambers_LicenseRestart

```java
/** Samples for Chambers LicenseRestart. */
public final class ChambersLicenseRestartSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ChambersLicenseRestart.json
     */
    /**
     * Sample code: Chamber License Restart.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void chamberLicenseRestart(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .chambers()
            .licenseRestart("resourceGroup", "test-workbench", "test-chamber", null, com.azure.core.util.Context.NONE);
    }
}
```

### Chambers_LicenseUpdate

```java
import com.azure.resourcemanager.modsimworkbench.models.LicenseService;
import com.azure.resourcemanager.modsimworkbench.models.UpdateLicenseParameters;

/** Samples for Chambers LicenseUpdate. */
public final class ChambersLicenseUpdateSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ChambersLicenseUpdate.json
     */
    /**
     * Sample code: Update chamber license.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void updateChamberLicense(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .chambers()
            .licenseUpdate(
                "resourceGroup",
                "test-workbench",
                "test-chamber",
                new UpdateLicenseParameters()
                    .withLicenseService(LicenseService.ANSYS)
                    .withEnable(true)
                    .withLicenseKey("fakeTokenPlaceholder"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Chambers_List

```java
/** Samples for Chambers List. */
public final class ChambersListSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ChambersList.json
     */
    /**
     * Sample code: List all Chambers.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void listAllChambers(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.chambers().list("resourceGroup", "test-workbench", com.azure.core.util.Context.NONE);
    }
}
```

### Chambers_Restart

```java
/** Samples for Chambers Restart. */
public final class ChambersRestartSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ChambersRestart.json
     */
    /**
     * Sample code: Chambers Restart.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void chambersRestart(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.chambers().restart("resourceGroup", "test-workbench", "test-chamber", com.azure.core.util.Context.NONE);
    }
}
```

### Chambers_Start

```java
/** Samples for Chambers Start. */
public final class ChambersStartSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ChambersStart.json
     */
    /**
     * Sample code: Chambers start.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void chambersStart(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.chambers().start("resourceGroup", "test-workbench", "test-chamber", com.azure.core.util.Context.NONE);
    }
}
```

### Chambers_Stop

```java
/** Samples for Chambers Stop. */
public final class ChambersStopSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ChambersStop.json
     */
    /**
     * Sample code: Chambers stop.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void chambersStop(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.chambers().stop("resourceGroup", "test-workbench", "test-chamber", com.azure.core.util.Context.NONE);
    }
}
```

### Chambers_Update

```java
import com.azure.resourcemanager.modsimworkbench.models.Chamber;

/** Samples for Chambers Update. */
public final class ChambersUpdateSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ChambersPatch.json
     */
    /**
     * Sample code: Update Chamber.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void updateChamber(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        Chamber resource =
            manager
                .chambers()
                .getWithResponse("resourceGroup", "test-workbench", "test-chamber", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
```

### Connectors_CreateOrUpdate

```java
/** Samples for Connectors CreateOrUpdate. */
public final class ConnectorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ConnectorsCreateOrUpdate.json
     */
    /**
     * Sample code: Create Connector.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void createConnector(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .connectors()
            .define("test-connector")
            .withRegion((String) null)
            .withExistingChamber("resourceGroup", "test-workbench", "test-chamber")
            .create();
    }
}
```

### Connectors_Delete

```java
/** Samples for Connectors Delete. */
public final class ConnectorsDeleteSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ConnectorsDelete.json
     */
    /**
     * Sample code: Delete Connector.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void deleteConnector(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .connectors()
            .delete(
                "resourceGroup", "test-workbench", "test-chamber", "test-connector", com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_Get

```java
/** Samples for Connectors Get. */
public final class ConnectorsGetSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ConnectorsGet.json
     */
    /**
     * Sample code: Get Connector.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void getConnector(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .connectors()
            .getWithResponse(
                "resourceGroup", "test-workbench", "test-chamber", "test-connector", com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_LicenseAdd

```java
import com.azure.resourcemanager.modsimworkbench.models.LicenseKeyParameters;

/** Samples for Connectors LicenseAdd. */
public final class ConnectorsLicenseAddSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ConnectorsLicenseAdd.json
     */
    /**
     * Sample code: Connectors License Add.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void connectorsLicenseAdd(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .connectors()
            .licenseAdd(
                "resourceGroup",
                "test-workbench",
                "test-chamber",
                "test-connector",
                new LicenseKeyParameters().withLicenseKey("fakeTokenPlaceholder"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_List

```java
/** Samples for Connectors List. */
public final class ConnectorsListSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ConnectorsList.json
     */
    /**
     * Sample code: List all connectors.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void listAllConnectors(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.connectors().list("resourceGroup", "test-workbench", "test-chamber", com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_Restart

```java
/** Samples for Connectors Restart. */
public final class ConnectorsRestartSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ConnectorsRestart.json
     */
    /**
     * Sample code: Connectors Restart.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void connectorsRestart(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .connectors()
            .restart(
                "resourceGroup", "test-workbench", "test-chamber", "test-connector", com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_Start

```java
/** Samples for Connectors Start. */
public final class ConnectorsStartSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ConnectorsStart.json
     */
    /**
     * Sample code: Connectors Start.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void connectorsStart(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .connectors()
            .start(
                "resourceGroup", "test-workbench", "test-chamber", "test-connector", com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_Stop

```java
/** Samples for Connectors Stop. */
public final class ConnectorsStopSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ConnectorsStop.json
     */
    /**
     * Sample code: Connectors stop.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void connectorsStop(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .connectors()
            .stop(
                "resourceGroup", "test-workbench", "test-chamber", "test-connector", com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_Update

```java
import com.azure.resourcemanager.modsimworkbench.models.Connector;

/** Samples for Connectors Update. */
public final class ConnectorsUpdateSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/ConnectorsPatch.json
     */
    /**
     * Sample code: Update Connector.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void updateConnector(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        Connector resource =
            manager
                .connectors()
                .getWithResponse(
                    "resourceGroup",
                    "test-workbench",
                    "test-chamber",
                    "test-connector",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
```

### FileOperation_Manage

```java
import com.azure.resourcemanager.modsimworkbench.models.Action;
import com.azure.resourcemanager.modsimworkbench.models.DataPipeline;
import com.azure.resourcemanager.modsimworkbench.models.FilesManageParameters;
import com.azure.resourcemanager.modsimworkbench.models.Force;

/** Samples for FileOperation Manage. */
public final class FileOperationManageSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/FilesManage.json
     */
    /**
     * Sample code: Files Data Inbound Sync.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void filesDataInboundSync(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .fileOperations()
            .manage(
                "resourceGroup",
                "test-workbench",
                "test-chamber",
                "test-file",
                new FilesManageParameters()
                    .withDataPipeline(DataPipeline.OUTBOUND)
                    .withAction(Action.DELETE)
                    .withForce(Force.FALSE),
                com.azure.core.util.Context.NONE);
    }
}
```

### FileRequestOperation_GetDownloadUri

```java
/** Samples for FileRequestOperation GetDownloadUri. */
public final class FileRequestOperationGetDownloadUriSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/FileRequestsGetDownloadUri.json
     */
    /**
     * Sample code: Files Data Inbound Sync.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void filesDataInboundSync(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .fileRequestOperations()
            .getDownloadUri(
                "resourceGroup", "test-workbench", "test-chamber", "request-name", com.azure.core.util.Context.NONE);
    }
}
```

### FileRequests_Get

```java
/** Samples for FileRequests Get. */
public final class FileRequestsGetSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/FileRequestsGet.json
     */
    /**
     * Sample code: Request Get.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void requestGet(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .fileRequests()
            .getWithResponse(
                "resourceGroup", "test-workbench", "test-chamber", "request-name", com.azure.core.util.Context.NONE);
    }
}
```

### FileRequests_List

```java
/** Samples for FileRequests List. */
public final class FileRequestsListSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/FileRequestsList.json
     */
    /**
     * Sample code: List all files.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void listAllFiles(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .fileRequests()
            .list("resourceGroup", "test-workbench", "test-chamber", com.azure.core.util.Context.NONE);
    }
}
```

### FileRequests_Manage

```java
import com.azure.resourcemanager.modsimworkbench.models.FileRequestsAction;
import com.azure.resourcemanager.modsimworkbench.models.FileRequestsManageParameters;

/** Samples for FileRequests Manage. */
public final class FileRequestsManageSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/FileRequestsManage.json
     */
    /**
     * Sample code: Files Data Inbound Sync.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void filesDataInboundSync(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .fileRequests()
            .manage(
                "resourceGroup",
                "test-workbench",
                "test-chamber",
                "request-name",
                new FileRequestsManageParameters()
                    .withAction(FileRequestsAction.APPROVE)
                    .withDescription("Manage ModSim Workbench chamber data pipeline file request"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Files_DownloadRequest

```java
/** Samples for Files DownloadRequest. */
public final class FilesDownloadRequestSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/FilesDownloadRequest.json
     */
    /**
     * Sample code: Files downloadRequest.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void filesDownloadRequest(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .files()
            .downloadRequest(
                "resourceGroup", "test-workbench", "test-chamber", "test-file", null, com.azure.core.util.Context.NONE);
    }
}
```

### Files_Get

```java
/** Samples for Files Get. */
public final class FilesGetSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/FilesGet.json
     */
    /**
     * Sample code: Files Get.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void filesGet(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .files()
            .getWithResponse(
                "resourceGroup", "test-workbench", "test-chamber", "test-file", com.azure.core.util.Context.NONE);
    }
}
```

### Files_List

```java
/** Samples for Files List. */
public final class FilesListSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/FilesList.json
     */
    /**
     * Sample code: List all files.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void listAllFiles(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.files().list("resourceGroup", "test-workbench", "test-chamber", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkbenchesOperationList.json
     */
    /**
     * Sample code: Lists Operations.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void listsOperations(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.operations().listWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

### Storages_CreateOrUpdate

```java
/** Samples for Storages CreateOrUpdate. */
public final class StoragesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/StoragesCreateOrUpdate.json
     */
    /**
     * Sample code: Create storage.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void createStorage(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .storages()
            .define("test-storage")
            .withRegion((String) null)
            .withExistingChamber("resourceGroup", "test-workbench", "test-chamber")
            .create();
    }
}
```

### Storages_Delete

```java
/** Samples for Storages Delete. */
public final class StoragesDeleteSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/StoragesDelete.json
     */
    /**
     * Sample code: Delete Storage.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void deleteStorage(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .storages()
            .delete(
                "resourceGroup", "test-workbench", "test-chamber", "test-storage", com.azure.core.util.Context.NONE);
    }
}
```

### Storages_Get

```java
/** Samples for Storages Get. */
public final class StoragesGetSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/StoragesGet.json
     */
    /**
     * Sample code: Get Storage.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void getStorage(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .storages()
            .getWithResponse(
                "resourceGroup", "test-workbench", "test-chamber", "test-storage", com.azure.core.util.Context.NONE);
    }
}
```

### Storages_List

```java
/** Samples for Storages List. */
public final class StoragesListSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/StoragesList.json
     */
    /**
     * Sample code: List all storages.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void listAllStorages(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.storages().list("resourceGroup", "test-workbench", "test-chamber", com.azure.core.util.Context.NONE);
    }
}
```

### Storages_Update

```java
import com.azure.resourcemanager.modsimworkbench.models.Storage;

/** Samples for Storages Update. */
public final class StoragesUpdateSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/StoragesPatch.json
     */
    /**
     * Sample code: Update storage.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void updateStorage(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        Storage resource =
            manager
                .storages()
                .getWithResponse(
                    "rg1", "test-workbench", "test-chamber", "test-storage", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
```

### Workbenches_CreateOrUpdate

```java
import com.azure.resourcemanager.modsimworkbench.models.AppOidc;

/** Samples for Workbenches CreateOrUpdate. */
public final class WorkbenchesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkbenchesCreateOrUpdate.json
     */
    /**
     * Sample code: Workbenches create or update.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void workbenchesCreateOrUpdate(
        com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .workbenches()
            .define("test-workbench")
            .withRegion((String) null)
            .withExistingResourceGroup("rg1")
            .withAddressSpace("192.168.0.0/24")
            .withAppOidc(new AppOidc().withClientId("test-clientid").withSecretUri("fakeTokenPlaceholder"))
            .withSkuPropertiesSku("Basic")
            .create();
    }
}
```

### Workbenches_Delete

```java
/** Samples for Workbenches Delete. */
public final class WorkbenchesDeleteSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkbenchesDelete.json
     */
    /**
     * Sample code: Workbenches Update.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void workbenchesUpdate(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.workbenches().delete("test-resourcegroup", "test-workbench", com.azure.core.util.Context.NONE);
    }
}
```

### Workbenches_GetByResourceGroup

```java
/** Samples for Workbenches GetByResourceGroup. */
public final class WorkbenchesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkbenchesGet.json
     */
    /**
     * Sample code: Workbenches Get.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void workbenchesGet(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.workbenches().getByResourceGroup("rg1", "test-workbench", com.azure.core.util.Context.NONE);
    }
}
```

### Workbenches_List

```java
/** Samples for Workbenches List. */
public final class WorkbenchesListSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkbenchesListBySubscription.json
     */
    /**
     * Sample code: List Workbenches by Subscription.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void listWorkbenchesBySubscription(
        com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.workbenches().list(com.azure.core.util.Context.NONE);
    }
}
```

### Workbenches_ListByResourceGroup

```java
/** Samples for Workbenches ListByResourceGroup. */
public final class WorkbenchesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkbenchesListByResourceGroup.json
     */
    /**
     * Sample code: List Workbenches by Resource Group.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void listWorkbenchesByResourceGroup(
        com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.workbenches().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### Workbenches_Update

```java
import com.azure.resourcemanager.modsimworkbench.models.AppOidc;
import com.azure.resourcemanager.modsimworkbench.models.Workbench;

/** Samples for Workbenches Update. */
public final class WorkbenchesUpdateSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkbenchesPatch.json
     */
    /**
     * Sample code: Workbenches Update.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void workbenchesUpdate(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        Workbench resource =
            manager
                .workbenches()
                .getByResourceGroup("rg1", "test-workbench", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withAddressSpace("192.168.0.0/24")
            .withAppOidc(new AppOidc().withClientId("test-clientid").withSecretUri("fakeTokenPlaceholder"))
            .apply();
    }
}
```

### Workloads_CreateOrUpdate

```java
/** Samples for Workloads CreateOrUpdate. */
public final class WorkloadsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkloadsCreateOrUpdate.json
     */
    /**
     * Sample code: Create Workload.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void createWorkload(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .workloads()
            .define("test-workload")
            .withRegion((String) null)
            .withExistingChamber("resourceGroup", "test-workbench", "test-chamber")
            .create();
    }
}
```

### Workloads_Delete

```java
/** Samples for Workloads Delete. */
public final class WorkloadsDeleteSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkloadsDelete.json
     */
    /**
     * Sample code: Delete Workload.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void deleteWorkload(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .workloads()
            .delete(
                "resourceGroup", "test-workbench", "test-chamber", "test-workload", com.azure.core.util.Context.NONE);
    }
}
```

### Workloads_Get

```java
/** Samples for Workloads Get. */
public final class WorkloadsGetSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkloadsGet.json
     */
    /**
     * Sample code: Get Workload.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void getWorkload(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .workloads()
            .getWithResponse(
                "resourceGroup", "test-workbench", "test-chamber", "test-workload", com.azure.core.util.Context.NONE);
    }
}
```

### Workloads_List

```java
/** Samples for Workloads List. */
public final class WorkloadsListSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkloadsList.json
     */
    /**
     * Sample code: List all workloads.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void listAllWorkloads(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager.workloads().list("resourceGroup", "test-workbench", "test-chamber", com.azure.core.util.Context.NONE);
    }
}
```

### Workloads_Restart

```java
/** Samples for Workloads Restart. */
public final class WorkloadsRestartSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkloadsRestart.json
     */
    /**
     * Sample code: Workloads Restart.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void workloadsRestart(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .workloads()
            .restart(
                "resourceGroup", "test-workbench", "test-chamber", "test-workload", com.azure.core.util.Context.NONE);
    }
}
```

### Workloads_Start

```java
/** Samples for Workloads Start. */
public final class WorkloadsStartSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkloadsStart.json
     */
    /**
     * Sample code: Workloads Start.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void workloadsStart(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .workloads()
            .start(
                "resourceGroup", "test-workbench", "test-chamber", "test-workload", com.azure.core.util.Context.NONE);
    }
}
```

### Workloads_Stop

```java
/** Samples for Workloads Stop. */
public final class WorkloadsStopSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkloadsStop.json
     */
    /**
     * Sample code: Workloads Stop.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void workloadsStop(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        manager
            .workloads()
            .stop("resourceGroup", "test-workbench", "test-chamber", "test-workload", com.azure.core.util.Context.NONE);
    }
}
```

### Workloads_Update

```java
import com.azure.resourcemanager.modsimworkbench.models.Workload;

/** Samples for Workloads Update. */
public final class WorkloadsUpdateSamples {
    /*
     * x-ms-original-file: specification/modsimworkbench/resource-manager/Microsoft.ModSimWorkbench/preview/2021-03-01-preview/examples/WorkloadsPatch.json
     */
    /**
     * Sample code: Update workload.
     *
     * @param manager Entry point to ModsimworkbenchManager.
     */
    public static void updateWorkload(com.azure.resourcemanager.modsimworkbench.ModsimworkbenchManager manager) {
        Workload resource =
            manager
                .workloads()
                .getWithResponse(
                    "rg1", "test-workbench", "test-chamber", "test-workload", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
```

