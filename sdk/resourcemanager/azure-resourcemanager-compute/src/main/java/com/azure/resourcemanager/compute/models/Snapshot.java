// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.ComputeManager;
import com.azure.resourcemanager.compute.fluent.models.SnapshotInner;
import com.azure.resourcemanager.resources.fluentcore.arm.models.GroupableResource;
import com.azure.resourcemanager.resources.fluentcore.arm.models.Resource;
import com.azure.resourcemanager.resources.fluentcore.model.Accepted;
import com.azure.resourcemanager.resources.fluentcore.model.Appliable;
import com.azure.resourcemanager.resources.fluentcore.model.Creatable;
import com.azure.resourcemanager.resources.fluentcore.model.Refreshable;
import com.azure.resourcemanager.resources.fluentcore.model.Updatable;
import reactor.core.publisher.Mono;

import java.time.Duration;

/** An immutable client-side representation of an Azure managed snapshot. */
@Fluent
public interface Snapshot
    extends GroupableResource<ComputeManager, SnapshotInner>, Refreshable<Snapshot>, Updatable<Snapshot.Update> {
    /**
     * Gets the snapshot SKU type.
     *
     * @return the snapshot SKU type.
     */
    SnapshotSkuType skuType();

    /**
     * Checks whether a snapshot id incremental.
     *
     * @return whether a snapshot is incremental
     */
    boolean incremental();

    /**
     * Gets the snapshot creation method.
     *
     * @return the snapshot creation method
     */
    DiskCreateOption creationMethod();

    /**
     * Gets disk size in GB.
     *
     * @return disk size in GB
     */
    int sizeInGB();

    /**
     * Gets the type of operating system in the snapshot.
     *
     * @return the type of operating system in the snapshot
     */
    OperatingSystemTypes osType();

    /**
     * Gets the details of the source from which snapshot is created.
     *
     * @return the details of the source from which snapshot is created
     */
    CreationSource source();

    /**
     * Gets the percentage complete for the background copy when a resource is created via the CopyStart operation.
     * <p>For latest progress,{@link Snapshot#refresh()} or {@link Snapshot#refreshAsync()} should be called prior to this method.</p>
     *
     * @return the percentage complete, ranging from 0 to 100, or null if {@link Snapshot#creationMethod()} is not {@link DiskCreateOption#COPY_START}
     */
    Float copyCompletionPercent();

    /**
     * Gets the error details if the background copy of a resource created via the CopyStart operation fails.
     * <p>For latest progress,{@link Snapshot#refresh()} or {@link Snapshot#refreshAsync()} should be called
     * prior to this method. </p>
     *
     * @return the error details
     */
    CopyCompletionError copyCompletionError();

    /**
     * Grants access to the snapshot.
     *
     * @param accessDurationInSeconds the access duration in seconds
     * @return the read-only SAS URI to the snapshot
     */
    String grantAccess(int accessDurationInSeconds);

    /**
     * Grants access to the snapshot asynchronously.
     *
     * @param accessDurationInSeconds the access duration in seconds
     * @return a representation of the deferred computation of this call returning a read-only SAS URI to the disk
     */
    Mono<String> grantAccessAsync(int accessDurationInSeconds);

    /** Revoke access granted to the snapshot. */
    void revokeAccess();

    /**
     * Revoke access granted to the snapshot asynchronously.
     *
     * @return a representation of the deferred computation of this call
     */
    Mono<Void> revokeAccessAsync();

    /**
     * Await CopyStart completion indefinitely unless errors are encountered.
     */
    void awaitCopyStartCompletion();

    /**
     * Await CopyStart completion for a specified timeout.
     *
     * @param maxWaitTime max timeout to wait for completion
     * @return true if CopyStart complete successfully, false if timeout
     * @throws com.azure.core.management.exception.ManagementException if exceptions are encountered
     */
    Boolean awaitCopyStartCompletion(Duration maxWaitTime);

    /**
     * Checks whether the snapshot can be accessed from public network.
     *
     * @return whether the snapshot can be accessed from public network.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Await CopyStart completion in async manner.
     *
     * @return a representation of the deferred computation of this call
     */
    Mono<Void> awaitCopyStartCompletionAsync();

    /** The entirety of the managed snapshot definition. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup,
        DefinitionStages.WithSnapshotSource, DefinitionStages.WithWindowsSnapshotSource,
        DefinitionStages.WithLinuxSnapshotSource, DefinitionStages.WithDataSnapshotSource,
        DefinitionStages.WithDataSnapshotFromVhd, DefinitionStages.WithDataSnapshotFromDisk,
        DefinitionStages.WithDataSnapshotFromSnapshot, DefinitionStages.WithCreate {
    }

    /** Grouping of managed snapshot definition stages. */
    interface DefinitionStages {
        /** The first stage of a managed snapshot definition. */
        interface Blank extends GroupableResource.DefinitionWithRegion<WithGroup> {
        }

        /** The stage of the managed snapshot definition allowing to specify the resource group. */
        interface WithGroup extends GroupableResource.DefinitionStages.WithGroup<WithSnapshotSource> {
        }

        /** The stage of the managed snapshot definition allowing to choose OS source or data source. */
        interface WithSnapshotSource
            extends WithWindowsSnapshotSource, WithLinuxSnapshotSource, WithDataSnapshotSource {
        }

        /** The stage of the managed snapshot definition allowing to choose Windows OS source. */
        interface WithWindowsSnapshotSource {
            /**
             * Specifies the source Windows OS managed disk.
             *
             * @param sourceDiskId a source managed disk resource ID
             * @return the next stage of the definition
             */
            WithCreate withWindowsFromDisk(String sourceDiskId);

            /**
             * Specifies the source Windows OS managed disk.
             *
             * @param sourceDisk a source managed disk
             * @return the next stage of the definition
             */
            WithCreate withWindowsFromDisk(Disk sourceDisk);

            /**
             * Specifies the source Windows OS managed snapshot.
             *
             * @param sourceSnapshotId a snapshot resource ID
             * @return the next stage of the definition
             */
            WithCreate withWindowsFromSnapshot(String sourceSnapshotId);

            /**
             * Specifies the source Windows OS managed snapshot.
             *
             * @param sourceSnapshot a source snapshot
             * @return the next stage of the definition
             */
            WithCreate withWindowsFromSnapshot(Snapshot sourceSnapshot);

            /**
             * Specifies the source specialized or generalized Windows OS VHD when it belongs to the same subscription.
             *
             * @param vhdUrl the source VHD URL
             * @return the next stage of the definition
             */
            WithCreate withWindowsFromVhd(String vhdUrl);

            /**
             * Specifies the source specialized or generalized Windows OS VHD and the storage account ID.
             *
             * @param vhdUrl the source VHD URL
             * @param storageAccountId the storage account ID
             * @return the next stage of the definition
             */
            WithCreate withWindowsFromVhd(String vhdUrl, String storageAccountId);
        }

        /** The stage of the managed snapshot definition allowing to choose a Linux OS source. */
        interface WithLinuxSnapshotSource {
            /**
             * Specifies the source Linux OS managed disk.
             *
             * @param sourceDiskId a source managed disk resource ID
             * @return the next stage of the definition
             */
            WithCreate withLinuxFromDisk(String sourceDiskId);

            /**
             * Specifies the source Linux OS managed disk.
             *
             * @param sourceDisk a source managed disk
             * @return the next stage of the definition
             */
            WithCreate withLinuxFromDisk(Disk sourceDisk);

            /**
             * Specifies the source Linux OS managed snapshot.
             *
             * @param sourceSnapshotId a snapshot resource ID
             * @return the next stage of the definition
             */
            WithCreate withLinuxFromSnapshot(String sourceSnapshotId);

            /**
             * Specifies the source Linux OS managed snapshot.
             *
             * @param sourceSnapshot a source snapshot
             * @return the next stage of the definition
             */
            WithCreate withLinuxFromSnapshot(Snapshot sourceSnapshot);

            /**
             * Specifies the source specialized or generalized Linux OS VHD when it belongs to the same subscription.
             *
             * @param vhdUrl the source VHD URL
             * @return the next stage of the definition
             */
            WithCreate withLinuxFromVhd(String vhdUrl);

            /**
             * Specifies the source specialized or generalized Linux OS VHD and the storage account ID.
             *
             * @param vhdUrl the source VHD URL
             * @param storageAccountId the storage account ID
             * @return the next stage of the definition
             */
            WithCreate withLinuxFromVhd(String vhdUrl, String storageAccountId);
        }

        /** The stage of the managed snapshot definition allowing to choose data source. */
        interface WithDataSnapshotSource
            extends WithDataSnapshotFromVhd, WithDataSnapshotFromDisk, WithDataSnapshotFromSnapshot {
        }

        /** The stage of the managed disk definition allowing to choose source data disk VHD. */
        interface WithDataSnapshotFromVhd {
            /**
             * Specifies the source data VHD when it belongs to the same subscription.
             *
             * @param vhdUrl a source VHD URL
             * @return the next stage of the definition
             */
            WithCreate withDataFromVhd(String vhdUrl);

            /**
             * Specifies the source data VHD and the storage account ID.
             *
             * @param vhdUrl a source VHD URL
             * @param storageAccountId the storage account ID
             * @return the next stage of the definition
             */
            WithCreate withDataFromVhd(String vhdUrl, String storageAccountId);
        }

        /** The stage of the managed disk definition allowing to choose managed disk containing data. */
        interface WithDataSnapshotFromDisk {
            /**
             * Specifies the ID of source data managed disk.
             *
             * @param managedDiskId source managed disk resource ID
             * @return the next stage of the definition
             */
            WithCreate withDataFromDisk(String managedDiskId);

            /**
             * Specifies the source data managed disk.
             *
             * @param managedDisk a source managed disk
             * @return the next stage of the definition
             */
            WithCreate withDataFromDisk(Disk managedDisk);
        }

        /** The stage of the managed disk definition allowing to choose managed snapshot containing data. */
        interface WithDataSnapshotFromSnapshot {
            /**
             * Specifies the source data managed snapshot.
             *
             * @param snapshotId a snapshot resource ID
             * @return the next stage of the definition
             */
            WithCreate withDataFromSnapshot(String snapshotId);

            /**
             * Specifies the source data managed snapshot.
             *
             * @param snapshot a snapshot resource
             * @return the next stage of the definition
             */
            WithCreate withDataFromSnapshot(Snapshot snapshot);
        }

        /** The stage of the managed snapshot definition allowing to set creationOption to CopyStart. */
        interface WithCopyStart {
            /**
             * Specifies CopyStart for CreateOption.
             * <p>CopyStart can be used when source and target regions are different as well as when they are the same.
             * There are important scenarios (copying across zones, copying from main region to edge location and other way around)
             * where it is necessary to use CopyStart within the same region. </p>
             * <p>Note: For now, CopyStart is only supported for creating an incremental snapshot from an incremental snapshot.</p>
             * <p>Before you can use the copied snapshot for future use (e.g. create disk), you should wait for the CopyStart
             * completion by calling {@link Snapshot#awaitCopyStartCompletion()} or {@link Snapshot#awaitCopyStartCompletion(Duration)}
             * to wait synchronously, or {@link Snapshot#awaitCopyStartCompletionAsync()} to wait asynchronously.</p>
             *
             * @see DiskCreateOption
             * @return the next stage of the definition
             */
            WithCreate withCopyStart();
        }

        /** The stage of the managed disk definition allowing to choose a source operating system image. */
        interface WithOSSnapshotFromImage {
            /**
             * Specifies an image containing an operating system.
             *
             * @param imageId image resource ID
             * @param osType operating system type
             * @return the next stage of the definition
             */
            WithCreate fromImage(String imageId, OperatingSystemTypes osType);

            /**
             * Specifies an image containing an operating system.
             *
             * @param image the image
             * @return the next stage of the definition
             */
            WithCreate fromImage(VirtualMachineImage image);

            /**
             * Specifies a custom image containing an operating system.
             *
             * @param image the image
             * @return the next stage of the definition
             */
            WithCreate fromImage(VirtualMachineCustomImage image);
        }

        /** The stage of the managed disk definition allowing to choose source data disk image. */
        interface WithDataSnapshotFromImage {
            /**
             * Specifies an image containing source data disk image.
             *
             * @param imageId an image resource ID
             * @param diskLun LUN of the disk image
             * @return the next stage of the definition
             */
            WithCreate fromImage(String imageId, int diskLun);

            /**
             * Specifies an image containing a source data disk image.
             *
             * @param image an image
             * @param diskLun LUN of the disk image
             * @return the next stage of the definition
             */
            WithCreate fromImage(VirtualMachineImage image, int diskLun);

            /**
             * Specifies a custom image containing a source data disk image.
             *
             * @param image the image
             * @param diskLun LUN of the disk image
             * @return the next stage of the definition
             */
            WithCreate fromImage(VirtualMachineCustomImage image, int diskLun);
        }

        /** The stage of the managed snapshot allowing to specify the size. */
        interface WithSize {
            /**
             * Specifies the disk size.
             *
             * @param sizeInGB the disk size in GB
             * @return the next stage of the definition
             */
            WithCreate withSizeInGB(int sizeInGB);
        }

        /** The stage of the managed snapshot allowing to specify incremental snapshot. */
        interface WithIncremental {
            /**
             * Specifies whether a snapshot is incremental.
             *
             * @param enabled whether to enable incremental snapshot
             * @return the next stage of the definition
             */
            WithCreate withIncremental(boolean enabled);
        }

        /** The stage of the snapshot definition allowing to choose account type. */
        interface WithSku {
            /**
             * Specifies the SKU type.
             *
             * @param sku SKU type
             * @return the next stage of the definition
             */
            WithCreate withSku(SnapshotSkuType sku);
        }

        /** The stage of snapshot definition allowing to configure network access settings. */
        interface WithPublicNetworkAccess {
            /**
             * Disables public network access for the snapshot.
             *
             * @return the next stage of the definition
             */
            WithCreate disablePublicNetworkAccess();
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for the resource to be created,
         * but also allows for any other optional settings to be specified.
         */
        interface WithCreate
            extends Creatable<Snapshot>, Resource.DefinitionWithTags<Snapshot.DefinitionStages.WithCreate>, WithSize,
            WithSku, WithIncremental, WithCopyStart, WithPublicNetworkAccess {
            /**
             * Begins creating the snapshot resource.
             *
             * @return the accepted create operation
             */
            default Accepted<Snapshot> beginCreate() {
                throw new UnsupportedOperationException("[beginCreate] is not supported in " + getClass());
            }

            /**
             * Begins creating the snapshot resource.
             *
             * @param context the {@link Context} of the request
             * @return the accepted create operation
             */
            default Accepted<Snapshot> beginCreate(Context context) {
                throw new UnsupportedOperationException("[beginCreate(Context)] is not supported in " + getClass());
            }
        }
    }

    /** Grouping of managed snapshot update stages. */
    interface UpdateStages {
        /** The stage of the managed snapshot update allowing to choose account type. */
        interface WithSku {
            /**
             * Specifies the SKU type.
             *
             * @param sku SKU type
             * @return the next stage of the update
             */
            Update withSku(SnapshotSkuType sku);
        }

        /** The stage of the managed snapshot update allowing to specify OS settings. */
        interface WithOSSettings {
            /**
             * Specifies the operating system type.
             *
             * @param osType operating system type
             * @return the next stage of the update
             */
            Update withOSType(OperatingSystemTypes osType);
        }

        /** The stage of snapshot update allowing to configure network access settings. */
        interface WithPublicNetworkAccess {
            /**
             * Enables public network access for the snapshot.
             *
             * @return the next stage of the update
             */
            Update enablePublicNetworkAccess();

            /**
             * Disables public network access for the snapshot.
             *
             * @return the next stage of the update
             */
            Update disablePublicNetworkAccess();
        }
    }

    /** The template for an update operation, containing all the settings that can be modified. */
    interface Update extends Appliable<Snapshot>, Resource.UpdateWithTags<Snapshot.Update>, UpdateStages.WithSku,
        UpdateStages.WithOSSettings, UpdateStages.WithPublicNetworkAccess {
    }
}
