// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.implementation;

import com.azure.resourcemanager.streamanalytics.fluent.models.FunctionInner;
import com.azure.resourcemanager.streamanalytics.fluent.models.InputInner;
import com.azure.resourcemanager.streamanalytics.fluent.models.OutputInner;
import com.azure.resourcemanager.streamanalytics.fluent.models.StreamingJobPropertiesInner;
import com.azure.resourcemanager.streamanalytics.fluent.models.TransformationInner;
import com.azure.resourcemanager.streamanalytics.models.ClusterInfo;
import com.azure.resourcemanager.streamanalytics.models.CompatibilityLevel;
import com.azure.resourcemanager.streamanalytics.models.ContentStoragePolicy;
import com.azure.resourcemanager.streamanalytics.models.EventsOutOfOrderPolicy;
import com.azure.resourcemanager.streamanalytics.models.Function;
import com.azure.resourcemanager.streamanalytics.models.Input;
import com.azure.resourcemanager.streamanalytics.models.JobStorageAccount;
import com.azure.resourcemanager.streamanalytics.models.JobType;
import com.azure.resourcemanager.streamanalytics.models.Output;
import com.azure.resourcemanager.streamanalytics.models.OutputErrorPolicy;
import com.azure.resourcemanager.streamanalytics.models.OutputStartMode;
import com.azure.resourcemanager.streamanalytics.models.Sku;
import com.azure.resourcemanager.streamanalytics.models.StreamingJobProperties;
import com.azure.resourcemanager.streamanalytics.models.Transformation;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class StreamingJobPropertiesImpl implements StreamingJobProperties {
    private StreamingJobPropertiesInner innerObject;

    private final com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager;

    StreamingJobPropertiesImpl(StreamingJobPropertiesInner innerObject,
        com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public String jobId() {
        return this.innerModel().jobId();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String jobState() {
        return this.innerModel().jobState();
    }

    public JobType jobType() {
        return this.innerModel().jobType();
    }

    public OutputStartMode outputStartMode() {
        return this.innerModel().outputStartMode();
    }

    public OffsetDateTime outputStartTime() {
        return this.innerModel().outputStartTime();
    }

    public OffsetDateTime lastOutputEventTime() {
        return this.innerModel().lastOutputEventTime();
    }

    public EventsOutOfOrderPolicy eventsOutOfOrderPolicy() {
        return this.innerModel().eventsOutOfOrderPolicy();
    }

    public OutputErrorPolicy outputErrorPolicy() {
        return this.innerModel().outputErrorPolicy();
    }

    public Integer eventsOutOfOrderMaxDelayInSeconds() {
        return this.innerModel().eventsOutOfOrderMaxDelayInSeconds();
    }

    public Integer eventsLateArrivalMaxDelayInSeconds() {
        return this.innerModel().eventsLateArrivalMaxDelayInSeconds();
    }

    public String dataLocale() {
        return this.innerModel().dataLocale();
    }

    public CompatibilityLevel compatibilityLevel() {
        return this.innerModel().compatibilityLevel();
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public List<Input> inputs() {
        List<InputInner> inner = this.innerModel().inputs();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new InputImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Transformation transformation() {
        TransformationInner inner = this.innerModel().transformation();
        if (inner != null) {
            return new TransformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<Output> outputs() {
        List<OutputInner> inner = this.innerModel().outputs();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new OutputImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<Function> functions() {
        List<FunctionInner> inner = this.innerModel().functions();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new FunctionImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public JobStorageAccount jobStorageAccount() {
        return this.innerModel().jobStorageAccount();
    }

    public ContentStoragePolicy contentStoragePolicy() {
        return this.innerModel().contentStoragePolicy();
    }

    public ClusterInfo cluster() {
        return this.innerModel().cluster();
    }

    public StreamingJobPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager() {
        return this.serviceManager;
    }
}
