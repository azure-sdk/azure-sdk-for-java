# Release History

## 1.1.0-beta.1 (Unreleased)

### Breaking Changes

* `implementation.models.MessageDataStream` was removed

#### `implementation.NotificationMessagesClientImpl$NotificationMessagesClientService` was modified

* `sendSync(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `send(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed

### Features Added

* `models.ImageNotificationContent` was added

* `models.CommunicationMessagesChannel` was added

* `implementation.accesshelpers.MessageTemplateItemAccessHelper` was added

* `models.AudioNotificationContent` was added

* `models.ReactionNotificationContent` was added

* `models.DocumentNotificationContent` was added

* `implementation.accesshelpers.MessageTemplateItemAccessHelper$MessageTemplateItemAccessor` was added

* `models.VideoNotificationContent` was added

* `models.MessageTemplateValueKind` was added

* `models.CommunicationMessageKind` was added

* `models.MessageTemplateBindingsKind` was added

* `models.StickerNotificationContent` was added

#### `models.MessageTemplateImage` was modified

* `getKind()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SendMessageResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MessageTemplate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MessageTemplateQuickAction` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `getKind()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MessageTemplateBindings` was modified

* `getKind()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.channels.WhatsAppMessageTemplateBindings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `getKind()` was added

#### `models.MessageTemplateVideo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `getKind()` was added

#### `models.MessageTemplateText` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `getKind()` was added

#### `models.NotificationContent` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `getKind()` was added

#### `models.TextNotificationContent` was modified

* `getKind()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MediaNotificationContent` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `getKind()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MessageTemplateItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `getKind()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MessageTemplateValue` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `getKind()` was added

#### `models.TemplateNotificationContent` was modified

* `getKind()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MessageReceipt` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MessageTemplateLocation` was modified

* `getKind()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.channels.WhatsAppMessageTemplateBindingsButton` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MessageTemplateDocument` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `getKind()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.channels.WhatsAppMessageTemplateItem` was modified

* `getKind()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.channels.WhatsAppMessageTemplateBindingsComponent` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `implementation.NotificationMessagesClientImpl$NotificationMessagesClientService` was modified

* `send(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `sendSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added

## 1.0.7 (2024-09-27)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.15.3` to version `1.15.4`.
- Upgraded `azure-communication-common` from `1.3.5` to version `1.3.7`.
- Upgraded `azure-core` from `1.51.0` to version `1.52.0`.


## 1.0.6 (2024-08-24)

### Other Changes

#### Dependency Updates

- Upgraded `azure-communication-common` from `1.3.4` to version `1.3.5`.
- Upgraded `azure-core` from `1.50.0` to version `1.51.0`.
- Upgraded `azure-core-http-netty` from `1.15.2` to version `1.15.3`.


## 1.0.5 (2024-07-26)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.15.1` to version `1.15.2`.
- Upgraded `azure-communication-common` from `1.3.3` to version `1.3.4`.
- Upgraded `azure-core` from `1.49.1` to version `1.50.0`.


## 1.0.4 (2024-06-27)

### Other Changes

#### Dependency Updates

- Upgraded `azure-communication-common` from `1.3.3` to version `1.3.4`.
- Upgraded `azure-core` from `1.49.0` to version `1.49.1`.
- Upgraded `azure-core-http-netty` from `1.15.0` to version `1.15.1`.


## 1.0.3 (2024-05-28)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.48.0` to version `1.49.0`.
- Upgraded `azure-core-http-netty` from `1.14.2` to version `1.15.0`.
- Upgraded `azure-communication-common` from `1.3.2` to version `1.3.3`.


## 1.0.2 (2024-04-23)

### Other Changes

#### Dependency Updates

- Upgraded `azure-communication-common` from `1.3.1` to version `1.3.2`.
- Upgraded `azure-core` from `1.47.0` to version `1.48.0`.
- Upgraded `azure-core-http-netty` from `1.14.1` to version `1.14.2`.


## 1.0.1 (2024-03-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core-http-netty` from `1.14.0` to version `1.14.1`.
- Upgraded `azure-core` from `1.46.0` to version `1.47.0`.
- Upgraded `azure-communication-common` from `1.3.0` to version `1.3.1`.


## 1.0.0 (2024-02-29)

### Features Added

The public release of the Java SDK for Azure Communication Messages Services has the following features:
- Send Template, Text or Media message to WhatsApp Channel.
- List WhatsApp Templates for given Channel Registration Id.
- Download Media files from WhatsApp for incoming media message from WhatsApp.

