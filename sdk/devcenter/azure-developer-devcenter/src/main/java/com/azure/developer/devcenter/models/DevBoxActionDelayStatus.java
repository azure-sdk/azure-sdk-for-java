// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.devcenter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The result of the delay operation on this action.
 */
public final class DevBoxActionDelayStatus extends ExpandableStringEnum<DevBoxActionDelayStatus> {

    /**
     * The delay operation succeeded.
     */
    @Generated
    public static final DevBoxActionDelayStatus SUCCEEDED = fromString("Succeeded");

    /**
     * The delay operation failed.
     */
    @Generated
    public static final DevBoxActionDelayStatus FAILED = fromString("Failed");

    /**
     * Creates a new instance of DevBoxActionDelayStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public DevBoxActionDelayStatus() {
    }

    /**
     * Creates or finds a DevBoxActionDelayStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DevBoxActionDelayStatus.
     */
    @Generated
    public static DevBoxActionDelayStatus fromString(String name) {
        return fromString(name, DevBoxActionDelayStatus.class);
    }

    /**
     * Gets known DevBoxActionDelayStatus values.
     *
     * @return known DevBoxActionDelayStatus values.
     */
    @Generated
    public static Collection<DevBoxActionDelayStatus> values() {
        return values(DevBoxActionDelayStatus.class);
    }
}
