// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The storage method for the original full-precision vectors used for rescoring and internal index operations.
 */
public final class VectorSearchCompressionRescoreStorageMethod
    extends ExpandableStringEnum<VectorSearchCompressionRescoreStorageMethod> {
    /**
     * This option preserves the original full-precision vectors. Choose this option for maximum flexibility and highest
     * quality of compressed search results. This consumes more storage but allows for rescoring and oversampling.
     */
    @Generated
    public static final VectorSearchCompressionRescoreStorageMethod PRESERVE_ORIGINALS
        = fromString("preserveOriginals");

    /**
     * This option discards the original full-precision vectors. Choose this option for maximum storage savings. Since
     * this option does not allow for rescoring and oversampling, it will often cause slight to moderate reductions in
     * quality.
     */
    @Generated
    public static final VectorSearchCompressionRescoreStorageMethod DISCARD_ORIGINALS = fromString("discardOriginals");

    /**
     * Creates a new instance of VectorSearchCompressionRescoreStorageMethod value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public VectorSearchCompressionRescoreStorageMethod() {
    }

    /**
     * Creates or finds a VectorSearchCompressionRescoreStorageMethod from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VectorSearchCompressionRescoreStorageMethod.
     */
    @Generated
    public static VectorSearchCompressionRescoreStorageMethod fromString(String name) {
        return fromString(name, VectorSearchCompressionRescoreStorageMethod.class);
    }

    /**
     * Gets known VectorSearchCompressionRescoreStorageMethod values.
     * 
     * @return known VectorSearchCompressionRescoreStorageMethod values.
     */
    @Generated
    public static Collection<VectorSearchCompressionRescoreStorageMethod> values() {
        return values(VectorSearchCompressionRescoreStorageMethod.class);
    }
}
