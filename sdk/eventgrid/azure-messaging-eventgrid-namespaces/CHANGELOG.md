# Release History

## 1.1.0-beta.1 (Unreleased)

### Breaking Changes

#### `implementation.EventGridReceiverClientImpl$EventGridReceiverClientService` was modified

* `releaseSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `acknowledgeSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `reject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `release(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `rejectSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `acknowledge(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `renewLocksSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed
* `renewLocks(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was removed

### Features Added

#### `EventGridReceiverClient` was modified

* `releaseWithResponse(java.util.List,models.ReleaseDelay,com.azure.core.http.rest.RequestOptions)` was added
* `renewLocksWithResponse(java.util.List,com.azure.core.http.rest.RequestOptions)` was added
* `rejectWithResponse(java.util.List,com.azure.core.http.rest.RequestOptions)` was added
* `acknowledgeWithResponse(java.util.List,com.azure.core.http.rest.RequestOptions)` was added
* `receiveWithResponse(java.lang.Integer,java.time.Duration,com.azure.core.http.rest.RequestOptions)` was added

#### `EventGridSenderClient` was modified

* `sendWithResponse(java.util.List,com.azure.core.http.rest.RequestOptions)` was added
* `sendWithResponse(com.azure.core.models.CloudEvent,com.azure.core.http.rest.RequestOptions)` was added

#### `implementation.EventGridReceiverClientImpl$EventGridReceiverClientService` was modified

* `releaseSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `renewLocksSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `acknowledge(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `acknowledgeSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `release(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `reject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `renewLocks(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added
* `rejectSync(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.BinaryData,com.azure.core.http.rest.RequestOptions,com.azure.core.util.Context)` was added

#### `EventGridReceiverAsyncClient` was modified

* `rejectWithResponse(java.util.List,com.azure.core.http.rest.RequestOptions)` was added
* `acknowledgeWithResponse(java.util.List,com.azure.core.http.rest.RequestOptions)` was added
* `renewLocksWithResponse(java.util.List,com.azure.core.http.rest.RequestOptions)` was added
* `receiveWithResponse(java.lang.Integer,java.time.Duration,com.azure.core.http.rest.RequestOptions)` was added
* `releaseWithResponse(java.util.List,models.ReleaseDelay,com.azure.core.http.rest.RequestOptions)` was added

#### `EventGridSenderAsyncClient` was modified

* `sendWithResponse(com.azure.core.models.CloudEvent,com.azure.core.http.rest.RequestOptions)` was added
* `sendWithResponse(java.util.List,com.azure.core.http.rest.RequestOptions)` was added

## 1.0.0 (2024-06-18)

### Features Added
- Initial GA release
