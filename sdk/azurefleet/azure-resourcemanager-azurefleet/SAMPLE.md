# Code snippets and samples


## Fleets

- [CreateOrUpdate](#fleets_createorupdate)
- [Delete](#fleets_delete)
- [GetByResourceGroup](#fleets_getbyresourcegroup)
- [List](#fleets_list)
- [ListByResourceGroup](#fleets_listbyresourcegroup)
- [ListVirtualMachineScaleSets](#fleets_listvirtualmachinescalesets)
- [Update](#fleets_update)

## Operations

- [List](#operations_list)
### Fleets_CreateOrUpdate

```java
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.azurefleet.models.AdditionalUnattendContent;
import com.azure.resourcemanager.azurefleet.models.AdditionalUnattendContentComponentName;
import com.azure.resourcemanager.azurefleet.models.AdditionalUnattendContentPassName;
import com.azure.resourcemanager.azurefleet.models.ApiEntityReference;
import com.azure.resourcemanager.azurefleet.models.ApplicationProfile;
import com.azure.resourcemanager.azurefleet.models.BaseVirtualMachineProfile;
import com.azure.resourcemanager.azurefleet.models.BootDiagnostics;
import com.azure.resourcemanager.azurefleet.models.CachingTypes;
import com.azure.resourcemanager.azurefleet.models.CapacityReservationProfile;
import com.azure.resourcemanager.azurefleet.models.ComputeProfile;
import com.azure.resourcemanager.azurefleet.models.DeleteOptions;
import com.azure.resourcemanager.azurefleet.models.DiagnosticsProfile;
import com.azure.resourcemanager.azurefleet.models.DiffDiskOptions;
import com.azure.resourcemanager.azurefleet.models.DiffDiskPlacement;
import com.azure.resourcemanager.azurefleet.models.DiffDiskSettings;
import com.azure.resourcemanager.azurefleet.models.DiskControllerTypes;
import com.azure.resourcemanager.azurefleet.models.DiskCreateOptionTypes;
import com.azure.resourcemanager.azurefleet.models.DiskDeleteOptionTypes;
import com.azure.resourcemanager.azurefleet.models.DiskEncryptionSetParameters;
import com.azure.resourcemanager.azurefleet.models.DomainNameLabelScopeTypes;
import com.azure.resourcemanager.azurefleet.models.EncryptionIdentity;
import com.azure.resourcemanager.azurefleet.models.EvictionPolicy;
import com.azure.resourcemanager.azurefleet.models.ImageReference;
import com.azure.resourcemanager.azurefleet.models.IpVersion;
import com.azure.resourcemanager.azurefleet.models.KeyVaultSecretReference;
import com.azure.resourcemanager.azurefleet.models.LinuxConfiguration;
import com.azure.resourcemanager.azurefleet.models.LinuxPatchAssessmentMode;
import com.azure.resourcemanager.azurefleet.models.LinuxPatchSettings;
import com.azure.resourcemanager.azurefleet.models.LinuxVMGuestPatchAutomaticByPlatformRebootSetting;
import com.azure.resourcemanager.azurefleet.models.LinuxVMGuestPatchAutomaticByPlatformSettings;
import com.azure.resourcemanager.azurefleet.models.LinuxVMGuestPatchMode;
import com.azure.resourcemanager.azurefleet.models.ManagedServiceIdentity;
import com.azure.resourcemanager.azurefleet.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.azurefleet.models.Mode;
import com.azure.resourcemanager.azurefleet.models.NetworkApiVersion;
import com.azure.resourcemanager.azurefleet.models.NetworkInterfaceAuxiliaryMode;
import com.azure.resourcemanager.azurefleet.models.NetworkInterfaceAuxiliarySku;
import com.azure.resourcemanager.azurefleet.models.OperatingSystemTypes;
import com.azure.resourcemanager.azurefleet.models.OSImageNotificationProfile;
import com.azure.resourcemanager.azurefleet.models.PatchSettings;
import com.azure.resourcemanager.azurefleet.models.Plan;
import com.azure.resourcemanager.azurefleet.models.ProtocolTypes;
import com.azure.resourcemanager.azurefleet.models.ProxyAgentSettings;
import com.azure.resourcemanager.azurefleet.models.PublicIpAddressSku;
import com.azure.resourcemanager.azurefleet.models.PublicIpAddressSkuName;
import com.azure.resourcemanager.azurefleet.models.PublicIpAddressSkuTier;
import com.azure.resourcemanager.azurefleet.models.RegularPriorityAllocationStrategy;
import com.azure.resourcemanager.azurefleet.models.RegularPriorityProfile;
import com.azure.resourcemanager.azurefleet.models.ScheduledEventsProfile;
import com.azure.resourcemanager.azurefleet.models.SecurityEncryptionTypes;
import com.azure.resourcemanager.azurefleet.models.SecurityPostureReference;
import com.azure.resourcemanager.azurefleet.models.SecurityProfile;
import com.azure.resourcemanager.azurefleet.models.SecurityTypes;
import com.azure.resourcemanager.azurefleet.models.ServiceArtifactReference;
import com.azure.resourcemanager.azurefleet.models.SettingNames;
import com.azure.resourcemanager.azurefleet.models.SpotAllocationStrategy;
import com.azure.resourcemanager.azurefleet.models.SpotPriorityProfile;
import com.azure.resourcemanager.azurefleet.models.SshConfiguration;
import com.azure.resourcemanager.azurefleet.models.SshPublicKey;
import com.azure.resourcemanager.azurefleet.models.StorageAccountTypes;
import com.azure.resourcemanager.azurefleet.models.TerminateNotificationProfile;
import com.azure.resourcemanager.azurefleet.models.UefiSettings;
import com.azure.resourcemanager.azurefleet.models.UserAssignedIdentity;
import com.azure.resourcemanager.azurefleet.models.VaultCertificate;
import com.azure.resourcemanager.azurefleet.models.VaultSecretGroup;
import com.azure.resourcemanager.azurefleet.models.VirtualHardDisk;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetDataDisk;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetExtension;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetExtensionProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetExtensionProperties;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetHardwareProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetIpConfiguration;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetIpConfigurationProperties;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetIpTag;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetManagedDiskParameters;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkConfiguration;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkConfigurationDnsSettings;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkConfigurationProperties;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetOSDisk;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetOSProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetPublicIpAddressConfiguration;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetPublicIpAddressConfigurationProperties;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetStorageProfile;
import com.azure.resourcemanager.azurefleet.models.VMDiskSecurityProfile;
import com.azure.resourcemanager.azurefleet.models.VMGalleryApplication;
import com.azure.resourcemanager.azurefleet.models.VmSizeProfile;
import com.azure.resourcemanager.azurefleet.models.VMSizeProperties;
import com.azure.resourcemanager.azurefleet.models.WindowsConfiguration;
import com.azure.resourcemanager.azurefleet.models.WindowsPatchAssessmentMode;
import com.azure.resourcemanager.azurefleet.models.WindowsVMGuestPatchAutomaticByPlatformRebootSetting;
import com.azure.resourcemanager.azurefleet.models.WindowsVMGuestPatchAutomaticByPlatformSettings;
import com.azure.resourcemanager.azurefleet.models.WindowsVMGuestPatchMode;
import com.azure.resourcemanager.azurefleet.models.WinRMConfiguration;
import com.azure.resourcemanager.azurefleet.models.WinRMListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Fleets CreateOrUpdate.
 */
public final class FleetsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-05-01-preview/examples/
     * Fleets_CreateOrUpdate.json
     */
    /**
     * Sample code: Fleets_CreateOrUpdate.
     * 
     * @param manager Entry point to AzurefleetManager.
     */
    public static void fleetsCreateOrUpdate(com.azure.resourcemanager.azurefleet.AzurefleetManager manager) {
        manager.fleets()
            .define("testFleet")
            .withRegion("westus")
            .withExistingResourceGroup("rgazurefleet")
            .withTags(mapOf("key3518", "fakeTokenPlaceholder"))
            .withZones(Arrays.asList("zone1", "zone2"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf("key9851", new UserAssignedIdentity())))
            .withPlan(new Plan().withName("jwgrcrnrtfoxn")
                .withPublisher("iozjbiqqckqm")
                .withProduct("cgopbyvdyqikahwyxfpzwaqk")
                .withPromotionCode("fakeTokenPlaceholder")
                .withVersion("wa"))
            .withSpotPriorityProfile(new SpotPriorityProfile().withCapacity(20)
                .withMinCapacity(10)
                .withMaxPricePerVM(0.00865F)
                .withEvictionPolicy(EvictionPolicy.DELETE)
                .withAllocationStrategy(SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED)
                .withMaintain(true))
            .withRegularPriorityProfile(new RegularPriorityProfile().withCapacity(20)
                .withMinCapacity(10)
                .withAllocationStrategy(RegularPriorityAllocationStrategy.LOWEST_PRICE))
            .withVmSizesProfile(new VmSizeProfile())
            .withComputeProfile(new ComputeProfile()
                .withBaseVirtualMachineProfile(
                    new BaseVirtualMachineProfile()
                        .withOsProfile(new VirtualMachineScaleSetOSProfile().withComputerNamePrefix("o")
                            .withAdminUsername("nrgzqciiaaxjrqldbmjbqkyhntp")
                            .withAdminPassword("fakeTokenPlaceholder")
                            .withCustomData("xjjib")
                            .withWindowsConfiguration(new WindowsConfiguration().withProvisionVMAgent(true)
                                .withEnableAutomaticUpdates(true)
                                .withTimeZone("hlyjiqcfksgrpjrct")
                                .withAdditionalUnattendContent(
                                    Arrays.asList(new AdditionalUnattendContent()
                                        .withPassName(AdditionalUnattendContentPassName.OOBE_SYSTEM)
                                        .withComponentName(
                                            AdditionalUnattendContentComponentName.MICROSOFT_WINDOWS_SHELL_SETUP)
                                        .withSettingName(SettingNames.AUTO_LOGON)
                                        .withContent("bubmqbxjkj")))
                                .withPatchSettings(new PatchSettings().withPatchMode(WindowsVMGuestPatchMode.MANUAL)
                                    .withEnableHotpatching(true)
                                    .withAssessmentMode(WindowsPatchAssessmentMode.IMAGE_DEFAULT)
                                    .withAutomaticByPlatformSettings(
                                        new WindowsVMGuestPatchAutomaticByPlatformSettings()
                                            .withRebootSetting(
                                                WindowsVMGuestPatchAutomaticByPlatformRebootSetting.UNKNOWN)
                                            .withBypassPlatformSafetyChecksOnUserSchedule(true)))
                                .withWinRM(new WinRMConfiguration()
                                    .withListeners(Arrays.asList(new WinRMListener().withProtocol(ProtocolTypes.HTTP)
                                        .withCertificateUrl("phwesineizrl"))))
                                .withEnableVMAgentPlatformUpdates(true))
                            .withLinuxConfiguration(new LinuxConfiguration().withDisablePasswordAuthentication(true)
                                .withSsh(new SshConfiguration().withPublicKeys(Arrays
                                    .asList(new SshPublicKey().withPath("kmqz").withKeyData("fakeTokenPlaceholder"))))
                                .withProvisionVMAgent(true)
                                .withPatchSettings(new LinuxPatchSettings()
                                    .withPatchMode(LinuxVMGuestPatchMode.IMAGE_DEFAULT)
                                    .withAssessmentMode(LinuxPatchAssessmentMode.IMAGE_DEFAULT)
                                    .withAutomaticByPlatformSettings(new LinuxVMGuestPatchAutomaticByPlatformSettings()
                                        .withRebootSetting(LinuxVMGuestPatchAutomaticByPlatformRebootSetting.UNKNOWN)
                                        .withBypassPlatformSafetyChecksOnUserSchedule(true)))
                                .withEnableVMAgentPlatformUpdates(true))
                            .withSecrets(Arrays.asList(new VaultSecretGroup().withSourceVault(new SubResource().withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}"))
                                .withVaultCertificates(
                                    Arrays.asList(new VaultCertificate().withCertificateUrl("tyldwkzafmnkvpo")
                                        .withCertificateStore("nlxrwavpzhueffxsshlun")))))
                            .withAllowExtensionOperations(true)
                            .withRequireGuestProvisionSignal(true))
                        .withStorageProfile(new VirtualMachineScaleSetStorageProfile()
                            .withImageReference(new ImageReference().withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images/{imageName}/versions/{versionName}")
                                .withPublisher("mqxgwbiyjzmxavhbkd")
                                .withOffer("isxgumkarlkomp")
                                .withSku("eojmppqcrnpmxirtp")
                                .withVersion("wvpcqefgtmqdgltiuz")
                                .withSharedGalleryImageId("kmkgihoxwlawuuhcinfirktdwkmx")
                                .withCommunityGalleryImageId("vlqe"))
                            .withOsDisk(new VirtualMachineScaleSetOSDisk().withName("wfttw")
                                .withCaching(CachingTypes.NONE)
                                .withWriteAcceleratorEnabled(true)
                                .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                                .withDiffDiskSettings(new DiffDiskSettings()
                                    .withOption(DiffDiskOptions.LOCAL)
                                    .withPlacement(DiffDiskPlacement.CACHE_DISK))
                                .withDiskSizeGB(14)
                                .withOsType(OperatingSystemTypes.WINDOWS)
                                .withImage(new VirtualHardDisk().withUri("thqceubivdrjs"))
                                .withVhdContainers(Arrays.asList("tkzcwddtinkfpnfklatw"))
                                .withManagedDisk(new VirtualMachineScaleSetManagedDiskParameters()
                                    .withStorageAccountType(StorageAccountTypes.STANDARD_LRS)
                                    .withDiskEncryptionSet(new DiskEncryptionSetParameters().withId(
                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/diskEncryptionSets/{diskEncryptionSetName}"))
                                    .withSecurityProfile(new VMDiskSecurityProfile()
                                        .withSecurityEncryptionType(SecurityEncryptionTypes.VMGUEST_STATE_ONLY)
                                        .withDiskEncryptionSet(
                                            new DiskEncryptionSetParameters().withId(
                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/diskEncryptionSets/{diskEncryptionSetName}"))))
                                .withDeleteOption(DiskDeleteOptionTypes.DELETE))
                            .withDataDisks(Arrays.asList(new VirtualMachineScaleSetDataDisk()
                                .withName("eogiykmdmeikswxmigjws")
                                .withLun(14)
                                .withCaching(CachingTypes.NONE)
                                .withWriteAcceleratorEnabled(true)
                                .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                                .withDiskSizeGB(6)
                                .withManagedDisk(new VirtualMachineScaleSetManagedDiskParameters()
                                    .withStorageAccountType(StorageAccountTypes.STANDARD_LRS)
                                    .withDiskEncryptionSet(new DiskEncryptionSetParameters().withId(
                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/diskEncryptionSets/{diskEncryptionSetName}"))
                                    .withSecurityProfile(new VMDiskSecurityProfile()
                                        .withSecurityEncryptionType(SecurityEncryptionTypes.VMGUEST_STATE_ONLY)
                                        .withDiskEncryptionSet(
                                            new DiskEncryptionSetParameters().withId(
                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/diskEncryptionSets/{diskEncryptionSetName}"))))
                                .withDiskIopsReadWrite(27L)
                                .withDiskMBpsReadWrite(2L)
                                .withDeleteOption(DiskDeleteOptionTypes.DELETE)))
                            .withDiskControllerType(DiskControllerTypes.fromString("uzb")))
                        .withNetworkProfile(new VirtualMachineScaleSetNetworkProfile()
                            .withHealthProbe(new ApiEntityReference().withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}"))
                            .withNetworkInterfaceConfigurations(
                                Arrays.asList(new VirtualMachineScaleSetNetworkConfiguration().withName("i")
                                    .withProperties(new VirtualMachineScaleSetNetworkConfigurationProperties()
                                        .withPrimary(true)
                                        .withEnableAcceleratedNetworking(true)
                                        .withDisableTcpStateTracking(true)
                                        .withEnableFpga(true)
                                        .withNetworkSecurityGroup(new SubResource().withId(
                                            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups/{networkSecurityGroupName}"))
                                        .withDnsSettings(new VirtualMachineScaleSetNetworkConfigurationDnsSettings()
                                            .withDnsServers(Arrays.asList("nxmmfolhclsesu")))
                                        .withIpConfigurations(Arrays.asList(new VirtualMachineScaleSetIpConfiguration()
                                            .withName("oezqhkidfhyywlfzwuotilrpbqnjg")
                                            .withProperties(new VirtualMachineScaleSetIpConfigurationProperties()
                                                .withSubnet(new ApiEntityReference().withId(
                                                    "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}"))
                                                .withPrimary(true)
                                                .withPublicIpAddressConfiguration(
                                                    new VirtualMachineScaleSetPublicIpAddressConfiguration()
                                                        .withName("fvpqf")
                                                        .withProperties(
                                                            new VirtualMachineScaleSetPublicIpAddressConfigurationProperties()
                                                                .withIdleTimeoutInMinutes(9)
                                                                .withDnsSettings(
                                                                    new VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings()
                                                                        .withDomainNameLabel("ukrddzvmorpmfsczjwtbvp")
                                                                        .withDomainNameLabelScope(
                                                                            DomainNameLabelScopeTypes.TENANT_REUSE))
                                                                .withIpTags(
                                                                    Arrays.asList(new VirtualMachineScaleSetIpTag()
                                                                        .withIpTagType("sddgsoemnzgqizale")
                                                                        .withTag("wufmhrjsakbiaetyara")))
                                                                .withPublicIpPrefix(new SubResource().withId(
                                                                    "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPPrefixes/{publicIPPrefixName}"))
                                                                .withPublicIpAddressVersion(IpVersion.IPV4)
                                                                .withDeleteOption(DeleteOptions.DELETE))
                                                        .withSku(new PublicIpAddressSku()
                                                            .withName(PublicIpAddressSkuName.BASIC)
                                                            .withTier(PublicIpAddressSkuTier.REGIONAL)))
                                                .withPrivateIpAddressVersion(IpVersion.IPV4)
                                                .withApplicationGatewayBackendAddressPools(Arrays
                                                    .asList(new SubResource().withId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/applicationGateways/{applicationGatewayName}/backendAddressPools/{backendAddressPoolName}")))
                                                .withApplicationSecurityGroups(Arrays.asList(
                                                    new SubResource().withId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/applicationSecurityGroups/{applicationSecurityGroupName}")))
                                                .withLoadBalancerBackendAddressPools(Arrays.asList(
                                                    new SubResource().withId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/backendAddressPools/{backendAddressPoolName}")))
                                                .withLoadBalancerInboundNatPools(
                                                    Arrays.asList(new SubResource().withId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/inboundNatPools/{inboundNatPoolName}"))))))
                                        .withEnableIpForwarding(true)
                                        .withDeleteOption(DeleteOptions.DELETE)
                                        .withAuxiliaryMode(NetworkInterfaceAuxiliaryMode.NONE)
                                        .withAuxiliarySku(NetworkInterfaceAuxiliarySku.NONE))))
                            .withNetworkApiVersion(NetworkApiVersion.TWO_ZERO_TWO_ZERO_ONE_ONE_ZERO_ONE))
                        .withSecurityProfile(new SecurityProfile()
                            .withUefiSettings(new UefiSettings().withSecureBootEnabled(true).withVTpmEnabled(true))
                            .withEncryptionAtHost(true)
                            .withSecurityType(SecurityTypes.TRUSTED_LAUNCH)
                            .withEncryptionIdentity(new EncryptionIdentity().withUserAssignedIdentityResourceId(
                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{userAssignedIdentityName}"))
                            .withProxyAgentSettings(new ProxyAgentSettings().withEnabled(true)
                                .withMode(Mode.AUDIT)
                                .withKeyIncarnationId(20)))
                        .withDiagnosticsProfile(
                            new DiagnosticsProfile().withBootDiagnostics(new BootDiagnostics()
                                .withEnabled(true)
                                .withStorageUri("rzamfwghybpx")))
                        .withExtensionProfile(new VirtualMachineScaleSetExtensionProfile()
                            .withExtensions(Arrays.asList(new VirtualMachineScaleSetExtension().withName("bndxuxx")
                                .withProperties(new VirtualMachineScaleSetExtensionProperties()
                                    .withForceUpdateTag("yhgxw")
                                    .withPublisher("kpxtirxjfprhs")
                                    .withType("pgjilctjjwaa")
                                    .withTypeHandlerVersion("zevivcoilxmbwlrihhhibq")
                                    .withAutoUpgradeMinorVersion(true)
                                    .withEnableAutomaticUpgrade(true)
                                    .withSettings(mapOf())
                                    .withProtectedSettings(mapOf())
                                    .withProvisionAfterExtensions(Arrays.asList("nftzosroolbcwmpupujzqwqe"))
                                    .withSuppressFailures(true)
                                    .withProtectedSettingsFromKeyVault(new KeyVaultSecretReference()
                                        .withSecretUrl("fakeTokenPlaceholder")
                                        .withSourceVault(new SubResource().withId(
                                            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}"))))))
                            .withExtensionsTimeBudget("mbhjahtdygwgyszdwjtvlvtgchdwil"))
                        .withLicenseType("v")
                        .withScheduledEventsProfile(new ScheduledEventsProfile()
                            .withTerminateNotificationProfile(new TerminateNotificationProfile()
                                .withNotBeforeTimeout("iljppmmw")
                                .withEnable(true))
                            .withOsImageNotificationProfile(
                                new OSImageNotificationProfile().withNotBeforeTimeout("olbpadmevekyczfokodtfprxti")
                                    .withEnable(true)))
                        .withUserData("s")
                        .withCapacityReservation(new CapacityReservationProfile()
                            .withCapacityReservationGroup(new SubResource().withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/capacityReservationGroups/{capacityReservationGroupName}")))
                        .withApplicationProfile(new ApplicationProfile().withGalleryApplications(
                            Arrays.asList(new VMGalleryApplication().withTags("eyrqjbib")
                                .withOrder(5)
                                .withPackageReferenceId(
                                    "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/applications/{applicationName}/versions/{versionName}")
                                .withConfigurationReference("ulztmiavpojpbpbddgnuuiimxcpau")
                                .withTreatFailureAsDeploymentFailure(true)
                                .withEnableAutomaticUpgrade(true))))
                        .withHardwareProfile(new VirtualMachineScaleSetHardwareProfile()
                            .withVmSizeProperties(new VMSizeProperties().withVCpusAvailable(16).withVCpusPerCore(23)))
                        .withServiceArtifactReference(new ServiceArtifactReference().withId(
                            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/serviceArtifacts/{serviceArtifactsName}/vmArtifactsProfiles/{vmArtifactsProfileName}"))
                        .withSecurityPostureReference(new SecurityPostureReference().withId(
                            "/CommunityGalleries/{communityGalleryName}/securityPostures/{securityPostureName}/versions/{major.minor.patch}|{major.*}|latest")
                            .withExcludeExtensions(Arrays.asList("{securityPostureVMExtensionName}"))
                            .withIsOverridable(true)))
                .withComputeApiVersion("2023-07-01")
                .withPlatformFaultDomainCount(1))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-05-01-preview/examples/
     * Fleets_CreateOrUpdate_MinimumSet.json
     */
    /**
     * Sample code: Fleets_CreateOrUpdate_MinimumSet.
     * 
     * @param manager Entry point to AzurefleetManager.
     */
    public static void fleetsCreateOrUpdateMinimumSet(com.azure.resourcemanager.azurefleet.AzurefleetManager manager) {
        manager.fleets()
            .define("testFleet")
            .withRegion("eastus2euap")
            .withExistingResourceGroup("rgazurefleet")
            .withTags(mapOf("key", "fakeTokenPlaceholder"))
            .withSpotPriorityProfile(new SpotPriorityProfile().withCapacity(2)
                .withMinCapacity(1)
                .withEvictionPolicy(EvictionPolicy.DELETE)
                .withAllocationStrategy(SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED)
                .withMaintain(true))
            .withRegularPriorityProfile(new RegularPriorityProfile().withCapacity(2)
                .withMinCapacity(1)
                .withAllocationStrategy(RegularPriorityAllocationStrategy.LOWEST_PRICE))
            .withVmSizesProfile(new VmSizeProfile())
            .withComputeProfile(new ComputeProfile()
                .withBaseVirtualMachineProfile(new BaseVirtualMachineProfile()
                    .withOsProfile(new VirtualMachineScaleSetOSProfile().withComputerNamePrefix("prefix")
                        .withAdminUsername("azureuser")
                        .withAdminPassword("fakeTokenPlaceholder")
                        .withLinuxConfiguration(new LinuxConfiguration().withDisablePasswordAuthentication(false)))
                    .withStorageProfile(new VirtualMachineScaleSetStorageProfile()
                        .withImageReference(new ImageReference().withPublisher("canonical")
                            .withOffer("0001-com-ubuntu-server-focal")
                            .withSku("20_04-lts-gen2")
                            .withVersion("latest"))
                        .withOsDisk(new VirtualMachineScaleSetOSDisk()
                            .withCaching(CachingTypes.READ_WRITE)
                            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                            .withOsType(OperatingSystemTypes.LINUX)
                            .withManagedDisk(new VirtualMachineScaleSetManagedDiskParameters()
                                .withStorageAccountType(StorageAccountTypes.STANDARD_LRS))))
                    .withNetworkProfile(new VirtualMachineScaleSetNetworkProfile().withNetworkInterfaceConfigurations(
                        Arrays.asList(new VirtualMachineScaleSetNetworkConfiguration().withName("vmNameTest")
                            .withProperties(new VirtualMachineScaleSetNetworkConfigurationProperties().withPrimary(true)
                                .withEnableAcceleratedNetworking(false)
                                .withIpConfigurations(Arrays.asList(new VirtualMachineScaleSetIpConfiguration()
                                    .withName("vmNameTest")
                                    .withProperties(new VirtualMachineScaleSetIpConfigurationProperties()
                                        .withSubnet(new ApiEntityReference().withId(
                                            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}"))
                                        .withPrimary(true)
                                        .withLoadBalancerBackendAddressPools(Arrays.asList(new SubResource().withId(
                                            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/backendAddressPools/{backendAddressPoolName}"))))))
                                .withEnableIpForwarding(true))))
                        .withNetworkApiVersion(NetworkApiVersion.fromString("2022-07-01"))))
                .withComputeApiVersion("2023-09-01")
                .withPlatformFaultDomainCount(1))
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### Fleets_Delete

```java
/**
 * Samples for Fleets Delete.
 */
public final class FleetsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-05-01-preview/examples/Fleets_Delete.
     * json
     */
    /**
     * Sample code: Fleets_Delete.
     * 
     * @param manager Entry point to AzurefleetManager.
     */
    public static void fleetsDelete(com.azure.resourcemanager.azurefleet.AzurefleetManager manager) {
        manager.fleets().delete("rgazurefleet", "testFleet", com.azure.core.util.Context.NONE);
    }
}
```

### Fleets_GetByResourceGroup

```java
/**
 * Samples for Fleets GetByResourceGroup.
 */
public final class FleetsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-05-01-preview/examples/Fleets_Get.
     * json
     */
    /**
     * Sample code: Fleets_Get.
     * 
     * @param manager Entry point to AzurefleetManager.
     */
    public static void fleetsGet(com.azure.resourcemanager.azurefleet.AzurefleetManager manager) {
        manager.fleets().getByResourceGroupWithResponse("rgazurefleet", "testFleet", com.azure.core.util.Context.NONE);
    }
}
```

### Fleets_List

```java
/**
 * Samples for Fleets List.
 */
public final class FleetsListSamples {
    /*
     * x-ms-original-file:
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-05-01-preview/examples/
     * Fleets_ListBySubscription.json
     */
    /**
     * Sample code: Fleets_ListBySubscription.
     * 
     * @param manager Entry point to AzurefleetManager.
     */
    public static void fleetsListBySubscription(com.azure.resourcemanager.azurefleet.AzurefleetManager manager) {
        manager.fleets().list(com.azure.core.util.Context.NONE);
    }
}
```

### Fleets_ListByResourceGroup

```java
/**
 * Samples for Fleets ListByResourceGroup.
 */
public final class FleetsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-05-01-preview/examples/
     * Fleets_ListByResourceGroup.json
     */
    /**
     * Sample code: Fleets_ListByResourceGroup.
     * 
     * @param manager Entry point to AzurefleetManager.
     */
    public static void fleetsListByResourceGroup(com.azure.resourcemanager.azurefleet.AzurefleetManager manager) {
        manager.fleets().listByResourceGroup("rgazurefleet", com.azure.core.util.Context.NONE);
    }
}
```

### Fleets_ListVirtualMachineScaleSets

```java
/**
 * Samples for Fleets ListVirtualMachineScaleSets.
 */
public final class FleetsListVirtualMachineScaleSetsSamples {
    /*
     * x-ms-original-file:
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-05-01-preview/examples/
     * Fleets_ListVirtualMachineScaleSets.json
     */
    /**
     * Sample code: Fleets_ListVirtualMachineScaleSets.
     * 
     * @param manager Entry point to AzurefleetManager.
     */
    public static void
        fleetsListVirtualMachineScaleSets(com.azure.resourcemanager.azurefleet.AzurefleetManager manager) {
        manager.fleets().listVirtualMachineScaleSets("rgazurefleet", "myFleet", com.azure.core.util.Context.NONE);
    }
}
```

### Fleets_Update

```java
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.azurefleet.fluent.models.FleetProperties;
import com.azure.resourcemanager.azurefleet.models.AdditionalUnattendContent;
import com.azure.resourcemanager.azurefleet.models.AdditionalUnattendContentComponentName;
import com.azure.resourcemanager.azurefleet.models.AdditionalUnattendContentPassName;
import com.azure.resourcemanager.azurefleet.models.ApiEntityReference;
import com.azure.resourcemanager.azurefleet.models.ApplicationProfile;
import com.azure.resourcemanager.azurefleet.models.BaseVirtualMachineProfile;
import com.azure.resourcemanager.azurefleet.models.BootDiagnostics;
import com.azure.resourcemanager.azurefleet.models.CachingTypes;
import com.azure.resourcemanager.azurefleet.models.CapacityReservationProfile;
import com.azure.resourcemanager.azurefleet.models.ComputeProfile;
import com.azure.resourcemanager.azurefleet.models.DeleteOptions;
import com.azure.resourcemanager.azurefleet.models.DiagnosticsProfile;
import com.azure.resourcemanager.azurefleet.models.DiffDiskOptions;
import com.azure.resourcemanager.azurefleet.models.DiffDiskPlacement;
import com.azure.resourcemanager.azurefleet.models.DiffDiskSettings;
import com.azure.resourcemanager.azurefleet.models.DiskControllerTypes;
import com.azure.resourcemanager.azurefleet.models.DiskCreateOptionTypes;
import com.azure.resourcemanager.azurefleet.models.DiskDeleteOptionTypes;
import com.azure.resourcemanager.azurefleet.models.DiskEncryptionSetParameters;
import com.azure.resourcemanager.azurefleet.models.DomainNameLabelScopeTypes;
import com.azure.resourcemanager.azurefleet.models.EncryptionIdentity;
import com.azure.resourcemanager.azurefleet.models.EvictionPolicy;
import com.azure.resourcemanager.azurefleet.models.Fleet;
import com.azure.resourcemanager.azurefleet.models.ImageReference;
import com.azure.resourcemanager.azurefleet.models.IpVersion;
import com.azure.resourcemanager.azurefleet.models.KeyVaultSecretReference;
import com.azure.resourcemanager.azurefleet.models.LinuxConfiguration;
import com.azure.resourcemanager.azurefleet.models.LinuxPatchAssessmentMode;
import com.azure.resourcemanager.azurefleet.models.LinuxPatchSettings;
import com.azure.resourcemanager.azurefleet.models.LinuxVMGuestPatchAutomaticByPlatformRebootSetting;
import com.azure.resourcemanager.azurefleet.models.LinuxVMGuestPatchAutomaticByPlatformSettings;
import com.azure.resourcemanager.azurefleet.models.LinuxVMGuestPatchMode;
import com.azure.resourcemanager.azurefleet.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.azurefleet.models.ManagedServiceIdentityUpdate;
import com.azure.resourcemanager.azurefleet.models.Mode;
import com.azure.resourcemanager.azurefleet.models.NetworkApiVersion;
import com.azure.resourcemanager.azurefleet.models.NetworkInterfaceAuxiliaryMode;
import com.azure.resourcemanager.azurefleet.models.NetworkInterfaceAuxiliarySku;
import com.azure.resourcemanager.azurefleet.models.OperatingSystemTypes;
import com.azure.resourcemanager.azurefleet.models.OSImageNotificationProfile;
import com.azure.resourcemanager.azurefleet.models.PatchSettings;
import com.azure.resourcemanager.azurefleet.models.ProtocolTypes;
import com.azure.resourcemanager.azurefleet.models.ProxyAgentSettings;
import com.azure.resourcemanager.azurefleet.models.PublicIpAddressSku;
import com.azure.resourcemanager.azurefleet.models.PublicIpAddressSkuName;
import com.azure.resourcemanager.azurefleet.models.PublicIpAddressSkuTier;
import com.azure.resourcemanager.azurefleet.models.RegularPriorityAllocationStrategy;
import com.azure.resourcemanager.azurefleet.models.RegularPriorityProfile;
import com.azure.resourcemanager.azurefleet.models.ResourcePlanUpdate;
import com.azure.resourcemanager.azurefleet.models.ScheduledEventsProfile;
import com.azure.resourcemanager.azurefleet.models.SecurityEncryptionTypes;
import com.azure.resourcemanager.azurefleet.models.SecurityPostureReference;
import com.azure.resourcemanager.azurefleet.models.SecurityProfile;
import com.azure.resourcemanager.azurefleet.models.SecurityTypes;
import com.azure.resourcemanager.azurefleet.models.ServiceArtifactReference;
import com.azure.resourcemanager.azurefleet.models.SettingNames;
import com.azure.resourcemanager.azurefleet.models.SpotAllocationStrategy;
import com.azure.resourcemanager.azurefleet.models.SpotPriorityProfile;
import com.azure.resourcemanager.azurefleet.models.SshConfiguration;
import com.azure.resourcemanager.azurefleet.models.SshPublicKey;
import com.azure.resourcemanager.azurefleet.models.StorageAccountTypes;
import com.azure.resourcemanager.azurefleet.models.TerminateNotificationProfile;
import com.azure.resourcemanager.azurefleet.models.UefiSettings;
import com.azure.resourcemanager.azurefleet.models.VaultCertificate;
import com.azure.resourcemanager.azurefleet.models.VaultSecretGroup;
import com.azure.resourcemanager.azurefleet.models.VirtualHardDisk;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetDataDisk;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetExtension;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetExtensionProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetExtensionProperties;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetHardwareProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetIpConfiguration;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetIpConfigurationProperties;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetIpTag;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetManagedDiskParameters;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkConfiguration;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkConfigurationDnsSettings;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkConfigurationProperties;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetOSDisk;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetOSProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetPublicIpAddressConfiguration;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetPublicIpAddressConfigurationProperties;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetStorageProfile;
import com.azure.resourcemanager.azurefleet.models.VMDiskSecurityProfile;
import com.azure.resourcemanager.azurefleet.models.VMGalleryApplication;
import com.azure.resourcemanager.azurefleet.models.VmSizeProfile;
import com.azure.resourcemanager.azurefleet.models.VMSizeProperties;
import com.azure.resourcemanager.azurefleet.models.WindowsConfiguration;
import com.azure.resourcemanager.azurefleet.models.WindowsPatchAssessmentMode;
import com.azure.resourcemanager.azurefleet.models.WindowsVMGuestPatchAutomaticByPlatformRebootSetting;
import com.azure.resourcemanager.azurefleet.models.WindowsVMGuestPatchAutomaticByPlatformSettings;
import com.azure.resourcemanager.azurefleet.models.WindowsVMGuestPatchMode;
import com.azure.resourcemanager.azurefleet.models.WinRMConfiguration;
import com.azure.resourcemanager.azurefleet.models.WinRMListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Fleets Update.
 */
public final class FleetsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-05-01-preview/examples/Fleets_Update.
     * json
     */
    /**
     * Sample code: Fleets_Update.
     * 
     * @param manager Entry point to AzurefleetManager.
     */
    public static void fleetsUpdate(com.azure.resourcemanager.azurefleet.AzurefleetManager manager) {
        Fleet resource = manager.fleets()
            .getByResourceGroupWithResponse("rgazurefleet", "testFleet", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf())
            .withIdentity(new ManagedServiceIdentityUpdate().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf()))
            .withPlan(new ResourcePlanUpdate().withName("jwgrcrnrtfoxn")
                .withPublisher("iozjbiqqckqm")
                .withProduct("cgopbyvdyqikahwyxfpzwaqk")
                .withPromotionCode("fakeTokenPlaceholder")
                .withVersion("wa"))
            .withProperties(new FleetProperties()
                .withSpotPriorityProfile(new SpotPriorityProfile().withCapacity(20)
                    .withMinCapacity(10)
                    .withMaxPricePerVM(0.00865F)
                    .withEvictionPolicy(EvictionPolicy.DELETE)
                    .withAllocationStrategy(SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED)
                    .withMaintain(true))
                .withRegularPriorityProfile(new RegularPriorityProfile().withCapacity(20)
                    .withMinCapacity(10)
                    .withAllocationStrategy(RegularPriorityAllocationStrategy.LOWEST_PRICE))
                .withVmSizesProfile(new VmSizeProfile())
                .withComputeProfile(
                    new ComputeProfile()
                        .withBaseVirtualMachineProfile(
                            new BaseVirtualMachineProfile()
                                .withOsProfile(new VirtualMachineScaleSetOSProfile().withComputerNamePrefix("o")
                                    .withAdminUsername("nrgzqciiaaxjrqldbmjbqkyhntp")
                                    .withAdminPassword("fakeTokenPlaceholder")
                                    .withCustomData("xjjib")
                                    .withWindowsConfiguration(new WindowsConfiguration().withProvisionVMAgent(true)
                                        .withEnableAutomaticUpdates(true)
                                        .withTimeZone("hlyjiqcfksgrpjrct")
                                        .withAdditionalUnattendContent(Arrays.asList(new AdditionalUnattendContent()
                                            .withPassName(AdditionalUnattendContentPassName.OOBE_SYSTEM)
                                            .withComponentName(
                                                AdditionalUnattendContentComponentName.MICROSOFT_WINDOWS_SHELL_SETUP)
                                            .withSettingName(SettingNames.AUTO_LOGON)
                                            .withContent("bubmqbxjkj")))
                                        .withPatchSettings(
                                            new PatchSettings().withPatchMode(WindowsVMGuestPatchMode.MANUAL)
                                                .withEnableHotpatching(true)
                                                .withAssessmentMode(WindowsPatchAssessmentMode.IMAGE_DEFAULT)
                                                .withAutomaticByPlatformSettings(
                                                    new WindowsVMGuestPatchAutomaticByPlatformSettings()
                                                        .withRebootSetting(
                                                            WindowsVMGuestPatchAutomaticByPlatformRebootSetting.UNKNOWN)
                                                        .withBypassPlatformSafetyChecksOnUserSchedule(true)))
                                        .withWinRM(new WinRMConfiguration().withListeners(
                                            Arrays.asList(new WinRMListener().withProtocol(ProtocolTypes.HTTP)
                                                .withCertificateUrl("phwesineizrl"))))
                                        .withEnableVMAgentPlatformUpdates(true))
                                    .withLinuxConfiguration(new LinuxConfiguration()
                                        .withDisablePasswordAuthentication(true)
                                        .withSsh(new SshConfiguration().withPublicKeys(
                                            Arrays.asList(new SshPublicKey().withPath("kmqz")
                                                .withKeyData("fakeTokenPlaceholder"))))
                                        .withProvisionVMAgent(true)
                                        .withPatchSettings(new LinuxPatchSettings()
                                            .withPatchMode(LinuxVMGuestPatchMode.IMAGE_DEFAULT)
                                            .withAssessmentMode(LinuxPatchAssessmentMode.IMAGE_DEFAULT)
                                            .withAutomaticByPlatformSettings(
                                                new LinuxVMGuestPatchAutomaticByPlatformSettings()
                                                    .withRebootSetting(
                                                        LinuxVMGuestPatchAutomaticByPlatformRebootSetting.UNKNOWN)
                                                    .withBypassPlatformSafetyChecksOnUserSchedule(true)))
                                        .withEnableVMAgentPlatformUpdates(true))
                                    .withSecrets(Arrays.asList(new VaultSecretGroup()
                                        .withSourceVault(new SubResource().withId(
                                            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}"))
                                        .withVaultCertificates(
                                            Arrays.asList(new VaultCertificate().withCertificateUrl("tyldwkzafmnkvpo")
                                                .withCertificateStore("nlxrwavpzhueffxsshlun")))))
                                    .withAllowExtensionOperations(true)
                                    .withRequireGuestProvisionSignal(true))
                                .withStorageProfile(new VirtualMachineScaleSetStorageProfile()
                                    .withImageReference(new ImageReference().withId(
                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/images/{imageName}/versions/{versionName}")
                                        .withPublisher("mqxgwbiyjzmxavhbkd")
                                        .withOffer("isxgumkarlkomp")
                                        .withSku("eojmppqcrnpmxirtp")
                                        .withVersion("wvpcqefgtmqdgltiuz")
                                        .withSharedGalleryImageId("kmkgihoxwlawuuhcinfirktdwkmx")
                                        .withCommunityGalleryImageId("vlqe"))
                                    .withOsDisk(new VirtualMachineScaleSetOSDisk().withName("wfttw")
                                        .withCaching(CachingTypes.NONE)
                                        .withWriteAcceleratorEnabled(true)
                                        .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                                        .withDiffDiskSettings(new DiffDiskSettings()
                                            .withOption(DiffDiskOptions.LOCAL)
                                            .withPlacement(DiffDiskPlacement.CACHE_DISK))
                                        .withDiskSizeGB(14)
                                        .withOsType(OperatingSystemTypes.WINDOWS)
                                        .withImage(new VirtualHardDisk().withUri("thqceubivdrjs"))
                                        .withVhdContainers(Arrays.asList("tkzcwddtinkfpnfklatw"))
                                        .withManagedDisk(new VirtualMachineScaleSetManagedDiskParameters()
                                            .withStorageAccountType(StorageAccountTypes.STANDARD_LRS)
                                            .withDiskEncryptionSet(new DiskEncryptionSetParameters().withId(
                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/diskEncryptionSets/{diskEncryptionSetName}"))
                                            .withSecurityProfile(new VMDiskSecurityProfile()
                                                .withSecurityEncryptionType(SecurityEncryptionTypes.VMGUEST_STATE_ONLY)
                                                .withDiskEncryptionSet(
                                                    new DiskEncryptionSetParameters().withId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/diskEncryptionSets/{diskEncryptionSetName}"))))
                                        .withDeleteOption(DiskDeleteOptionTypes.DELETE))
                                    .withDataDisks(Arrays.asList(new VirtualMachineScaleSetDataDisk()
                                        .withName("eogiykmdmeikswxmigjws")
                                        .withLun(14)
                                        .withCaching(CachingTypes.NONE)
                                        .withWriteAcceleratorEnabled(true)
                                        .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                                        .withDiskSizeGB(6)
                                        .withManagedDisk(new VirtualMachineScaleSetManagedDiskParameters()
                                            .withStorageAccountType(StorageAccountTypes.STANDARD_LRS)
                                            .withDiskEncryptionSet(new DiskEncryptionSetParameters().withId(
                                                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/diskEncryptionSets/{diskEncryptionSetName}"))
                                            .withSecurityProfile(new VMDiskSecurityProfile()
                                                .withSecurityEncryptionType(SecurityEncryptionTypes.VMGUEST_STATE_ONLY)
                                                .withDiskEncryptionSet(
                                                    new DiskEncryptionSetParameters().withId(
                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/diskEncryptionSets/{diskEncryptionSetName}"))))
                                        .withDiskIopsReadWrite(27L)
                                        .withDiskMBpsReadWrite(2L)
                                        .withDeleteOption(DiskDeleteOptionTypes.DELETE)))
                                    .withDiskControllerType(DiskControllerTypes.fromString("uzb")))
                                .withNetworkProfile(new VirtualMachineScaleSetNetworkProfile().withHealthProbe(
                                    new ApiEntityReference().withId(
                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}"))
                                    .withNetworkInterfaceConfigurations(
                                        Arrays.asList(new VirtualMachineScaleSetNetworkConfiguration().withName("i")
                                            .withProperties(new VirtualMachineScaleSetNetworkConfigurationProperties()
                                                .withPrimary(true)
                                                .withEnableAcceleratedNetworking(true)
                                                .withDisableTcpStateTracking(true)
                                                .withEnableFpga(true)
                                                .withNetworkSecurityGroup(new SubResource().withId(
                                                    "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups/{networkSecurityGroupName}"))
                                                .withDnsSettings(
                                                    new VirtualMachineScaleSetNetworkConfigurationDnsSettings()
                                                        .withDnsServers(Arrays.asList("nxmmfolhclsesu")))
                                                .withIpConfigurations(
                                                    Arrays.asList(new VirtualMachineScaleSetIpConfiguration()
                                                        .withName("oezqhkidfhyywlfzwuotilrpbqnjg")
                                                        .withProperties(
                                                            new VirtualMachineScaleSetIpConfigurationProperties()
                                                                .withSubnet(new ApiEntityReference().withId(
                                                                    "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}"))
                                                                .withPrimary(true)
                                                                .withPublicIpAddressConfiguration(
                                                                    new VirtualMachineScaleSetPublicIpAddressConfiguration()
                                                                        .withName("fvpqf")
                                                                        .withProperties(
                                                                            new VirtualMachineScaleSetPublicIpAddressConfigurationProperties()
                                                                                .withIdleTimeoutInMinutes(9)
                                                                                .withDnsSettings(
                                                                                    new VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings()
                                                                                        .withDomainNameLabel(
                                                                                            "ukrddzvmorpmfsczjwtbvp")
                                                                                        .withDomainNameLabelScope(
                                                                                            DomainNameLabelScopeTypes.TENANT_REUSE))
                                                                                .withIpTags(Arrays.asList(
                                                                                    new VirtualMachineScaleSetIpTag()
                                                                                        .withIpTagType(
                                                                                            "sddgsoemnzgqizale")
                                                                                        .withTag(
                                                                                            "wufmhrjsakbiaetyara")))
                                                                                .withPublicIpPrefix(
                                                                                    new SubResource().withId(
                                                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPPrefixes/{publicIPPrefixName}"))
                                                                                .withPublicIpAddressVersion(
                                                                                    IpVersion.IPV4)
                                                                                .withDeleteOption(DeleteOptions.DELETE))
                                                                        .withSku(new PublicIpAddressSku()
                                                                            .withName(PublicIpAddressSkuName.BASIC)
                                                                            .withTier(PublicIpAddressSkuTier.REGIONAL)))
                                                                .withPrivateIpAddressVersion(IpVersion.IPV4)
                                                                .withApplicationGatewayBackendAddressPools(
                                                                    Arrays.asList(
                                                                        new SubResource().withId(
                                                                            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/applicationGateways/{applicationGatewayName}/backendAddressPools/{backendAddressPoolName}")))
                                                                .withApplicationSecurityGroups(Arrays
                                                                    .asList(new SubResource().withId(
                                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/applicationSecurityGroups/{applicationSecurityGroupName}")))
                                                                .withLoadBalancerBackendAddressPools(Arrays
                                                                    .asList(new SubResource().withId(
                                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/backendAddressPools/{backendAddressPoolName}")))
                                                                .withLoadBalancerInboundNatPools(
                                                                    Arrays.asList(new SubResource().withId(
                                                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/inboundNatPools/{inboundNatPoolName}"))))))
                                                .withEnableIpForwarding(true)
                                                .withDeleteOption(DeleteOptions.DELETE)
                                                .withAuxiliaryMode(NetworkInterfaceAuxiliaryMode.NONE)
                                                .withAuxiliarySku(NetworkInterfaceAuxiliarySku.NONE))))
                                    .withNetworkApiVersion(NetworkApiVersion.TWO_ZERO_TWO_ZERO_ONE_ONE_ZERO_ONE))
                                .withSecurityProfile(new SecurityProfile()
                                    .withUefiSettings(
                                        new UefiSettings().withSecureBootEnabled(true).withVTpmEnabled(true))
                                    .withEncryptionAtHost(true)
                                    .withSecurityType(SecurityTypes.TRUSTED_LAUNCH)
                                    .withEncryptionIdentity(new EncryptionIdentity().withUserAssignedIdentityResourceId(
                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{userAssignedIdentityName}"))
                                    .withProxyAgentSettings(new ProxyAgentSettings()
                                        .withEnabled(true)
                                        .withMode(Mode.AUDIT)
                                        .withKeyIncarnationId(20)))
                                .withDiagnosticsProfile(
                                    new DiagnosticsProfile().withBootDiagnostics(new BootDiagnostics()
                                        .withEnabled(true)
                                        .withStorageUri("rzamfwghybpx")))
                                .withExtensionProfile(new VirtualMachineScaleSetExtensionProfile()
                                    .withExtensions(Arrays.asList(new VirtualMachineScaleSetExtension()
                                        .withName("bndxuxx")
                                        .withProperties(
                                            new VirtualMachineScaleSetExtensionProperties().withForceUpdateTag("yhgxw")
                                                .withPublisher("kpxtirxjfprhs")
                                                .withType("pgjilctjjwaa")
                                                .withTypeHandlerVersion("zevivcoilxmbwlrihhhibq")
                                                .withAutoUpgradeMinorVersion(true)
                                                .withEnableAutomaticUpgrade(true)
                                                .withSettings(mapOf())
                                                .withProtectedSettings(mapOf())
                                                .withProvisionAfterExtensions(Arrays.asList("nftzosroolbcwmpupujzqwqe"))
                                                .withSuppressFailures(true)
                                                .withProtectedSettingsFromKeyVault(new KeyVaultSecretReference()
                                                    .withSecretUrl("fakeTokenPlaceholder")
                                                    .withSourceVault(
                                                        new SubResource().withId(
                                                            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}"))))))
                                    .withExtensionsTimeBudget("mbhjahtdygwgyszdwjtvlvtgchdwil"))
                                .withLicenseType("v")
                                .withScheduledEventsProfile(new ScheduledEventsProfile()
                                    .withTerminateNotificationProfile(
                                        new TerminateNotificationProfile().withNotBeforeTimeout("iljppmmw")
                                            .withEnable(true))
                                    .withOsImageNotificationProfile(new OSImageNotificationProfile()
                                        .withNotBeforeTimeout("olbpadmevekyczfokodtfprxti")
                                        .withEnable(true)))
                                .withUserData("s")
                                .withCapacityReservation(new CapacityReservationProfile()
                                    .withCapacityReservationGroup(new SubResource().withId(
                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/capacityReservationGroups/{capacityReservationGroupName}")))
                                .withApplicationProfile(new ApplicationProfile().withGalleryApplications(Arrays
                                    .asList(new VMGalleryApplication().withTags("eyrqjbib")
                                        .withOrder(5)
                                        .withPackageReferenceId(
                                            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/applications/{applicationName}/versions/{versionName}")
                                        .withConfigurationReference("ulztmiavpojpbpbddgnuuiimxcpau")
                                        .withTreatFailureAsDeploymentFailure(true)
                                        .withEnableAutomaticUpgrade(true))))
                                .withHardwareProfile(new VirtualMachineScaleSetHardwareProfile()
                                    .withVmSizeProperties(new VMSizeProperties()
                                        .withVCpusAvailable(16)
                                        .withVCpusPerCore(23)))
                                .withServiceArtifactReference(new ServiceArtifactReference().withId(
                                    "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName}/serviceArtifacts/{serviceArtifactsName}/vmArtifactsProfiles/{vmArtifactsProfileName}"))
                                .withSecurityPostureReference(new SecurityPostureReference().withId(
                                    "/CommunityGalleries/{communityGalleryName}/securityPostures/{securityPostureName}/versions/{major.minor.patch}|{major.*}|latest")
                                    .withExcludeExtensions(Arrays.asList("{securityPostureVMExtensionName}"))
                                    .withIsOverridable(true)))
                        .withComputeApiVersion("2023-07-01")
                        .withPlatformFaultDomainCount(1)))
            .apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-05-01-preview/examples/
     * Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to AzurefleetManager.
     */
    public static void operationsList(com.azure.resourcemanager.azurefleet.AzurefleetManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

