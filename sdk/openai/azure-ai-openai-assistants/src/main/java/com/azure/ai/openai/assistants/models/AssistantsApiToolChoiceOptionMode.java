// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies how the tool choice will be used.
 */
public final class AssistantsApiToolChoiceOptionMode extends ExpandableStringEnum<AssistantsApiToolChoiceOptionMode> {

    /**
     * The model will not call a function and instead generates a message.
     */
    @Generated
    public static final AssistantsApiToolChoiceOptionMode NONE = fromString("none");

    /**
     * The model can pick between generating a message or calling a function.
     */
    @Generated
    public static final AssistantsApiToolChoiceOptionMode AUTO = fromString("auto");

    /**
     * Creates a new instance of AssistantsApiToolChoiceOptionMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AssistantsApiToolChoiceOptionMode() {
    }

    /**
     * Creates or finds a AssistantsApiToolChoiceOptionMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AssistantsApiToolChoiceOptionMode.
     */
    @Generated
    public static AssistantsApiToolChoiceOptionMode fromString(String name) {
        return fromString(name, AssistantsApiToolChoiceOptionMode.class);
    }

    /**
     * Gets known AssistantsApiToolChoiceOptionMode values.
     *
     * @return known AssistantsApiToolChoiceOptionMode values.
     */
    @Generated
    public static Collection<AssistantsApiToolChoiceOptionMode> values() {
        return values(AssistantsApiToolChoiceOptionMode.class);
    }
}
