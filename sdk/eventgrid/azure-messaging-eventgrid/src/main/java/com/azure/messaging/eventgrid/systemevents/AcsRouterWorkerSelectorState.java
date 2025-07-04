// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Router Job Worker Selector State.
 * 
 * @deprecated This class is deprecated and may be removed in future releases. System events are now available in the
 * azure-messaging-eventgrid-systemevents package.
 */
@Deprecated
public final class AcsRouterWorkerSelectorState extends ExpandableStringEnum<AcsRouterWorkerSelectorState> {

    /**
     * Router Job Worker Selector is Active.
     */
    @Generated
    public static final AcsRouterWorkerSelectorState ACTIVE = fromString("active");

    /**
     * Router Job Worker Selector has Expire.
     */
    @Generated
    public static final AcsRouterWorkerSelectorState EXPIRED = fromString("expired");

    /**
     * Creates a new instance of AcsRouterWorkerSelectorState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AcsRouterWorkerSelectorState() {
    }

    /**
     * Creates or finds a AcsRouterWorkerSelectorState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AcsRouterWorkerSelectorState.
     */
    @Generated
    public static AcsRouterWorkerSelectorState fromString(String name) {
        return fromString(name, AcsRouterWorkerSelectorState.class);
    }

    /**
     * Gets known AcsRouterWorkerSelectorState values.
     *
     * @return known AcsRouterWorkerSelectorState values.
     */
    @Generated
    public static Collection<AcsRouterWorkerSelectorState> values() {
        return values(AcsRouterWorkerSelectorState.class);
    }
}
