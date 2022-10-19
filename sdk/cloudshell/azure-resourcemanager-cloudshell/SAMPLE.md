# Code snippets and samples


## ResourceProvider

- [DeleteConsole](#resourceprovider_deleteconsole)
- [DeleteConsoleWithLocation](#resourceprovider_deleteconsolewithlocation)
- [DeleteUserSettings](#resourceprovider_deleteusersettings)
- [DeleteUserSettingsWithLocation](#resourceprovider_deleteusersettingswithlocation)
- [GetConsole](#resourceprovider_getconsole)
- [GetConsoleWithLocation](#resourceprovider_getconsolewithlocation)
- [GetUserSettings](#resourceprovider_getusersettings)
- [GetUserSettingsWithLocation](#resourceprovider_getusersettingswithlocation)
- [KeepAlive](#resourceprovider_keepalive)
- [KeepAliveWithLocation](#resourceprovider_keepalivewithlocation)
- [PatchUserSettings](#resourceprovider_patchusersettings)
- [PatchUserSettingsWithLocation](#resourceprovider_patchusersettingswithlocation)
- [PutConsole](#resourceprovider_putconsole)
- [PutConsoleWithLocation](#resourceprovider_putconsolewithlocation)
- [PutUserSettings](#resourceprovider_putusersettings)
- [PutUserSettingsWithLocation](#resourceprovider_putusersettingswithlocation)
### ResourceProvider_DeleteConsole

```java
import com.azure.core.util.Context;

/** Samples for ResourceProvider DeleteConsole. */
public final class ResourceProviderDeleteConsoleSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/DeleteConsole.json
     */
    /**
     * Sample code: DeleteConsole.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void deleteConsole(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager.resourceProviders().deleteConsoleWithResponse("default", Context.NONE);
    }
}
```

### ResourceProvider_DeleteConsoleWithLocation

```java
import com.azure.core.util.Context;

/** Samples for ResourceProvider DeleteConsoleWithLocation. */
public final class ResourceProviderDeleteConsoleWithLocationSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/DeleteConsole_Location.json
     */
    /**
     * Sample code: DeleteConsole.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void deleteConsole(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager.resourceProviders().deleteConsoleWithLocationWithResponse("default", "eastus", Context.NONE);
    }
}
```

### ResourceProvider_DeleteUserSettings

```java
import com.azure.core.util.Context;

/** Samples for ResourceProvider DeleteUserSettings. */
public final class ResourceProviderDeleteUserSettingsSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/DeleteUserSettings.json
     */
    /**
     * Sample code: DeleteUserSettings.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void deleteUserSettings(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager.resourceProviders().deleteUserSettingsWithResponse("cloudconsole", Context.NONE);
    }
}
```

### ResourceProvider_DeleteUserSettingsWithLocation

```java
import com.azure.core.util.Context;

/** Samples for ResourceProvider DeleteUserSettingsWithLocation. */
public final class ResourceProviderDeleteUserSettingsWithLocationSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/DeleteUserSettings_Location.json
     */
    /**
     * Sample code: DeleteUserSettings.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void deleteUserSettings(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager.resourceProviders().deleteUserSettingsWithLocationWithResponse("cloudconsole", "eastus", Context.NONE);
    }
}
```

### ResourceProvider_GetConsole

```java
import com.azure.core.util.Context;

/** Samples for ResourceProvider GetConsole. */
public final class ResourceProviderGetConsoleSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/GetConsole.json
     */
    /**
     * Sample code: GetConsole.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void getConsole(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager.resourceProviders().getConsoleWithResponse("default", Context.NONE);
    }
}
```

### ResourceProvider_GetConsoleWithLocation

```java
import com.azure.core.util.Context;

/** Samples for ResourceProvider GetConsoleWithLocation. */
public final class ResourceProviderGetConsoleWithLocationSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/GetConsole_Location.json
     */
    /**
     * Sample code: GetConsole.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void getConsole(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager.resourceProviders().getConsoleWithLocationWithResponse("default", "eastus", Context.NONE);
    }
}
```

### ResourceProvider_GetUserSettings

```java
import com.azure.core.util.Context;

/** Samples for ResourceProvider GetUserSettings. */
public final class ResourceProviderGetUserSettingsSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/GetUserSettings.json
     */
    /**
     * Sample code: GetUserSettings.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void getUserSettings(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager.resourceProviders().getUserSettingsWithResponse("cloudconsole", Context.NONE);
    }
}
```

### ResourceProvider_GetUserSettingsWithLocation

```java
import com.azure.core.util.Context;

/** Samples for ResourceProvider GetUserSettingsWithLocation. */
public final class ResourceProviderGetUserSettingsWithLocationSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/GetUserSettings_Location.json
     */
    /**
     * Sample code: GetUserSettings.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void getUserSettings(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager.resourceProviders().getUserSettingsWithLocationWithResponse("cloudconsole", "eastus", Context.NONE);
    }
}
```

### ResourceProvider_KeepAlive

```java
import com.azure.core.util.Context;

/** Samples for ResourceProvider KeepAlive. */
public final class ResourceProviderKeepAliveSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/KeepAlive.json
     */
    /**
     * Sample code: KeepAlive.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void keepAlive(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager.resourceProviders().keepAliveWithResponse("default", Context.NONE);
    }
}
```

### ResourceProvider_KeepAliveWithLocation

```java
import com.azure.core.util.Context;

/** Samples for ResourceProvider KeepAliveWithLocation. */
public final class ResourceProviderKeepAliveWithLocationSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/KeepAlive_Location.json
     */
    /**
     * Sample code: GetUserSettings.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void getUserSettings(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager.resourceProviders().keepAliveWithLocationWithResponse("default", "eastus", Context.NONE);
    }
}
```

### ResourceProvider_PatchUserSettings

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.cloudshell.models.CloudShellPatchUserSettings;
import com.azure.resourcemanager.cloudshell.models.OsType;
import com.azure.resourcemanager.cloudshell.models.ShellType;
import com.azure.resourcemanager.cloudshell.models.StorageProfile;
import com.azure.resourcemanager.cloudshell.models.TerminalSettings;
import com.azure.resourcemanager.cloudshell.models.UserProperties;

/** Samples for ResourceProvider PatchUserSettings. */
public final class ResourceProviderPatchUserSettingsSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/PatchUserSettings.json
     */
    /**
     * Sample code: PatchUserSettings.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void patchUserSettings(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager
            .resourceProviders()
            .patchUserSettingsWithResponse(
                "cloudconsole",
                new CloudShellPatchUserSettings()
                    .withProperties(
                        new UserProperties()
                            .withPreferredOsType(OsType.LINUX)
                            .withPreferredLocation("")
                            .withStorageProfile(new StorageProfile())
                            .withTerminalSettings(new TerminalSettings())
                            .withPreferredShellType(ShellType.BASH)),
                Context.NONE);
    }
}
```

### ResourceProvider_PatchUserSettingsWithLocation

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.cloudshell.models.CloudShellPatchUserSettings;
import com.azure.resourcemanager.cloudshell.models.OsType;
import com.azure.resourcemanager.cloudshell.models.ShellType;
import com.azure.resourcemanager.cloudshell.models.StorageProfile;
import com.azure.resourcemanager.cloudshell.models.TerminalSettings;
import com.azure.resourcemanager.cloudshell.models.UserProperties;

/** Samples for ResourceProvider PatchUserSettingsWithLocation. */
public final class ResourceProviderPatchUserSettingsWithLocationSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/PatchUserSettings_Location.json
     */
    /**
     * Sample code: PatchUserSettings.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void patchUserSettings(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager
            .resourceProviders()
            .patchUserSettingsWithLocationWithResponse(
                "cloudconsole",
                "eastus",
                new CloudShellPatchUserSettings()
                    .withProperties(
                        new UserProperties()
                            .withPreferredOsType(OsType.LINUX)
                            .withPreferredLocation("")
                            .withStorageProfile(new StorageProfile())
                            .withTerminalSettings(new TerminalSettings())
                            .withPreferredShellType(ShellType.BASH)),
                Context.NONE);
    }
}
```

### ResourceProvider_PutConsole

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.cloudshell.models.ConsoleCreateProperties;
import com.azure.resourcemanager.cloudshell.models.ConsoleDefinition;
import com.azure.resourcemanager.cloudshell.models.OsType;

/** Samples for ResourceProvider PutConsole. */
public final class ResourceProviderPutConsoleSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/PutConsole.json
     */
    /**
     * Sample code: PutConsole.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void putConsole(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager
            .resourceProviders()
            .putConsoleWithResponse(
                "default",
                new ConsoleDefinition().withProperties(new ConsoleCreateProperties().withOsType(OsType.LINUX)),
                Context.NONE);
    }
}
```

### ResourceProvider_PutConsoleWithLocation

```java
import com.azure.core.util.Context;

/** Samples for ResourceProvider PutConsoleWithLocation. */
public final class ResourceProviderPutConsoleWithLocationSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/PutConsole_Location.json
     */
    /**
     * Sample code: PutConsole.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void putConsole(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager.resourceProviders().putConsoleWithLocationWithResponse("default", "eastus", Context.NONE);
    }
}
```

### ResourceProvider_PutUserSettings

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.cloudshell.models.CloudShellUserSettings;
import com.azure.resourcemanager.cloudshell.models.FontSize;
import com.azure.resourcemanager.cloudshell.models.FontStyle;
import com.azure.resourcemanager.cloudshell.models.OsType;
import com.azure.resourcemanager.cloudshell.models.ShellType;
import com.azure.resourcemanager.cloudshell.models.StorageProfile;
import com.azure.resourcemanager.cloudshell.models.TerminalSettings;
import com.azure.resourcemanager.cloudshell.models.UserProperties;

/** Samples for ResourceProvider PutUserSettings. */
public final class ResourceProviderPutUserSettingsSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/PutUserSettings.json
     */
    /**
     * Sample code: PutUserSettings.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void putUserSettings(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager
            .resourceProviders()
            .putUserSettingsWithResponse(
                "cloudconsole",
                new CloudShellUserSettings()
                    .withProperties(
                        new UserProperties()
                            .withPreferredOsType(OsType.LINUX)
                            .withPreferredLocation("eastus")
                            .withStorageProfile(
                                new StorageProfile()
                                    .withStorageAccountResourceId("string")
                                    .withFileShareName("string")
                                    .withDiskSizeInGB(5))
                            .withTerminalSettings(
                                new TerminalSettings().withFontSize(FontSize.MEDIUM).withFontStyle(FontStyle.MONOSPACE))
                            .withPreferredShellType(ShellType.BASH)),
                Context.NONE);
    }
}
```

### ResourceProvider_PutUserSettingsWithLocation

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.cloudshell.models.CloudShellUserSettings;
import com.azure.resourcemanager.cloudshell.models.FontSize;
import com.azure.resourcemanager.cloudshell.models.FontStyle;
import com.azure.resourcemanager.cloudshell.models.OsType;
import com.azure.resourcemanager.cloudshell.models.ShellType;
import com.azure.resourcemanager.cloudshell.models.StorageProfile;
import com.azure.resourcemanager.cloudshell.models.TerminalSettings;
import com.azure.resourcemanager.cloudshell.models.UserProperties;

/** Samples for ResourceProvider PutUserSettingsWithLocation. */
public final class ResourceProviderPutUserSettingsWithLocationSamples {
    /*
     * x-ms-original-file: specification/cloudshell/resource-manager/Microsoft.Portal/stable/2018-10-01/examples/PutUserSettings_Location.json
     */
    /**
     * Sample code: PutUserSettings.
     *
     * @param manager Entry point to CloudShellManager.
     */
    public static void putUserSettings(com.azure.resourcemanager.cloudshell.CloudShellManager manager) {
        manager
            .resourceProviders()
            .putUserSettingsWithLocationWithResponse(
                "cloudconsole",
                "eastus",
                new CloudShellUserSettings()
                    .withProperties(
                        new UserProperties()
                            .withPreferredOsType(OsType.LINUX)
                            .withPreferredLocation("eastus")
                            .withStorageProfile(
                                new StorageProfile()
                                    .withStorageAccountResourceId("string")
                                    .withFileShareName("string")
                                    .withDiskSizeInGB(5))
                            .withTerminalSettings(
                                new TerminalSettings().withFontSize(FontSize.MEDIUM).withFontStyle(FontStyle.MONOSPACE))
                            .withPreferredShellType(ShellType.BASH)),
                Context.NONE);
    }
}
```

