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
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.azurefleet.models.AdditionalUnattendContent;
import com.azure.resourcemanager.azurefleet.models.ApiEntityReference;
import com.azure.resourcemanager.azurefleet.models.ApplicationProfile;
import com.azure.resourcemanager.azurefleet.models.BootDiagnostics;
import com.azure.resourcemanager.azurefleet.models.CachingTypes;
import com.azure.resourcemanager.azurefleet.models.CapacityReservationProfile;
import com.azure.resourcemanager.azurefleet.models.ComponentNames;
import com.azure.resourcemanager.azurefleet.models.ComputeProfile;
import com.azure.resourcemanager.azurefleet.models.DeleteOptions;
import com.azure.resourcemanager.azurefleet.models.DiagnosticsProfile;
import com.azure.resourcemanager.azurefleet.models.DiffDiskOptions;
import com.azure.resourcemanager.azurefleet.models.DiffDiskPlacement;
import com.azure.resourcemanager.azurefleet.models.DiffDiskSettings;
import com.azure.resourcemanager.azurefleet.models.DiskCreateOptionTypes;
import com.azure.resourcemanager.azurefleet.models.DiskDeleteOptionTypes;
import com.azure.resourcemanager.azurefleet.models.DiskEncryptionSetParameters;
import com.azure.resourcemanager.azurefleet.models.DomainNameLabelScopeTypes;
import com.azure.resourcemanager.azurefleet.models.EncryptionIdentity;
import com.azure.resourcemanager.azurefleet.models.EvictionPolicy;
import com.azure.resourcemanager.azurefleet.models.ImageReference;
import com.azure.resourcemanager.azurefleet.models.InstanceViewStatus;
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
import com.azure.resourcemanager.azurefleet.models.PassNames;
import com.azure.resourcemanager.azurefleet.models.PatchSettings;
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
import com.azure.resourcemanager.azurefleet.models.StatusLevelTypes;
import com.azure.resourcemanager.azurefleet.models.StorageAccountTypes;
import com.azure.resourcemanager.azurefleet.models.TerminateNotificationProfile;
import com.azure.resourcemanager.azurefleet.models.UefiSettings;
import com.azure.resourcemanager.azurefleet.models.UserAssignedIdentity;
import com.azure.resourcemanager.azurefleet.models.VaultCertificate;
import com.azure.resourcemanager.azurefleet.models.VaultSecretGroup;
import com.azure.resourcemanager.azurefleet.models.VirtualHardDisk;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineExtension;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineExtensionInstanceView;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetDataDisk;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetExtension;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetExtensionProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetHardwareProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetIpConfiguration;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetIpTag;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetManagedDiskParameters;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkConfiguration;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkConfigurationDnsSettings;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetOSDisk;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetOSProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetPublicIpAddressConfiguration;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetStorageProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetVMProfile;
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
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Fleets CreateOrUpdate.
 */
public final class FleetsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-07-01-preview/examples/
     * Fleets_CreateOrUpdate.json
     */
    /**
     * Sample code: Fleets_CreateOrUpdate.
     * 
     * @param manager Entry point to AzurefleetManager.
     */
    public static void fleetsCreateOrUpdate(com.azure.resourcemanager.azurefleet.AzurefleetManager manager)
        throws IOException {
        manager.fleets()
            .define("testFleet")
            .withRegion("westus")
            .withExistingResourceGroup("rgazurefleet")
            .withTags(mapOf("key3518", "fakeTokenPlaceholder"))
            .withZones(Arrays.asList("zone1", "zone2"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf("key9851", new UserAssignedIdentity())))
            .withSpotPriorityProfile(new SpotPriorityProfile().withCapacity(20)
                .withMinCapacity(10)
                .withMaxPricePerVM(0.00865F)
                .withEvictionPolicy(EvictionPolicy.DELETE)
                .withAllocationStrategy(SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED)
                .withMaintain(true))
            .withRegularPriorityProfile(new RegularPriorityProfile().withCapacity(20)
                .withMinCapacity(10)
                .withAllocationStrategy(RegularPriorityAllocationStrategy.LOWEST_PRICE))
            .withVmSizesProfile(Arrays.asList(new VmSizeProfile().withName("Standard_d1_v2").withRank(19225)))
            .withComputeProfile(
                new ComputeProfile()
                    .withBaseVirtualMachineProfile(new VirtualMachineScaleSetVMProfile()
                        .withOsProfile(new VirtualMachineScaleSetOSProfile().withComputerNamePrefix("o")
                            .withAdminUsername("nrgzqciiaaxjrqldbmjbqkyhntp")
                            .withAdminPassword("fakeTokenPlaceholder")
                            .withCustomData("xjjib")
                            .withWindowsConfiguration(new WindowsConfiguration().withProvisionVMAgent(true)
                                .withEnableAutomaticUpdates(true)
                                .withTimeZone("hlyjiqcfksgrpjrct")
                                .withAdditionalUnattendContent(Arrays
                                    .asList(new AdditionalUnattendContent().withPassName(PassNames.OOBE_SYSTEM)
                                        .withComponentName(ComponentNames.MICROSOFT_WINDOWS_SHELL_SETUP)
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
                            .withSecrets(
                                Arrays.asList(new VaultSecretGroup().withSourceVault(new SubResource().withId("groxwd"))
                                    .withVaultCertificates(
                                        Arrays.asList(new VaultCertificate().withCertificateUrl("tyldwkzafmnkvpo")
                                            .withCertificateStore("nlxrwavpzhueffxsshlun")))))
                            .withAllowExtensionOperations(true)
                            .withRequireGuestProvisionSignal(true))
                        .withStorageProfile(new VirtualMachineScaleSetStorageProfile()
                            .withImageReference(new ImageReference().withId("aiunknwgksu")
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
                                .withDiffDiskSettings(new DiffDiskSettings().withOption(DiffDiskOptions.LOCAL)
                                    .withPlacement(DiffDiskPlacement.CACHE_DISK))
                                .withDiskSizeGB(14)
                                .withOsType(OperatingSystemTypes.WINDOWS)
                                .withImage(new VirtualHardDisk().withUri("thqceubivdrjs"))
                                .withVhdContainers(Arrays.asList("tkzcwddtinkfpnfklatw"))
                                .withManagedDisk(new VirtualMachineScaleSetManagedDiskParameters()
                                    .withStorageAccountType(StorageAccountTypes.STANDARD_LRS)
                                    .withDiskEncryptionSet(
                                        new DiskEncryptionSetParameters().withId("vmatqblzjalbatdepyzqmnd"))
                                    .withSecurityProfile(new VMDiskSecurityProfile()
                                        .withSecurityEncryptionType(SecurityEncryptionTypes.VMGUEST_STATE_ONLY)
                                        .withDiskEncryptionSet(
                                            new DiskEncryptionSetParameters().withId("vmatqblzjalbatdepyzqmnd"))))
                                .withDeleteOption(DiskDeleteOptionTypes.DELETE))
                            .withDataDisks(
                                Arrays
                                    .asList(new VirtualMachineScaleSetDataDisk().withName("eogiykmdmeikswxmigjws")
                                        .withLun(14)
                                        .withCaching(CachingTypes.NONE)
                                        .withWriteAcceleratorEnabled(true)
                                        .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                                        .withDiskSizeGB(6)
                                        .withManagedDisk(new VirtualMachineScaleSetManagedDiskParameters()
                                            .withStorageAccountType(StorageAccountTypes.STANDARD_LRS)
                                            .withDiskEncryptionSet(
                                                new DiskEncryptionSetParameters().withId("vmatqblzjalbatdepyzqmnd"))
                                            .withSecurityProfile(new VMDiskSecurityProfile()
                                                .withSecurityEncryptionType(SecurityEncryptionTypes.VMGUEST_STATE_ONLY)
                                                .withDiskEncryptionSet(new DiskEncryptionSetParameters()
                                                    .withId("vmatqblzjalbatdepyzqmnd"))))
                                        .withDiskIopsReadWrite(27L)
                                        .withDiskMBpsReadWrite(2L)
                                        .withDeleteOption(DiskDeleteOptionTypes.DELETE)))
                            .withDiskControllerType("uzb"))
                        .withNetworkProfile(new VirtualMachineScaleSetNetworkProfile()
                            .withHealthProbe(new ApiEntityReference().withId("cmkfcjhmrwxwqtac"))
                            .withNetworkInterfaceConfigurations(
                                Arrays.asList(new VirtualMachineScaleSetNetworkConfiguration().withName("i")
                                    .withPrimary(true)
                                    .withEnableAcceleratedNetworking(true)
                                    .withDisableTcpStateTracking(true)
                                    .withEnableFpga(true)
                                    .withNetworkSecurityGroup(new SubResource().withId("groxwd"))
                                    .withDnsSettings(new VirtualMachineScaleSetNetworkConfigurationDnsSettings()
                                        .withDnsServers(Arrays.asList("nxmmfolhclsesu")))
                                    .withIpConfigurations(Arrays.asList(new VirtualMachineScaleSetIpConfiguration()
                                        .withName("oezqhkidfhyywlfzwuotilrpbqnjg")
                                        .withSubnet(new ApiEntityReference().withId("cmkfcjhmrwxwqtac"))
                                        .withPrimary(true)
                                        .withPublicIpAddressConfiguration(
                                            new VirtualMachineScaleSetPublicIpAddressConfiguration().withName("fvpqf")
                                                .withSku(new PublicIpAddressSku().withName(PublicIpAddressSkuName.BASIC)
                                                    .withTier(PublicIpAddressSkuTier.REGIONAL))
                                                .withIdleTimeoutInMinutes(9)
                                                .withDnsSettings(
                                                    new VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings()
                                                        .withDomainNameLabel("ukrddzvmorpmfsczjwtbvp")
                                                        .withDomainNameLabelScope(
                                                            DomainNameLabelScopeTypes.TENANT_REUSE))
                                                .withIpTags(Arrays.asList(
                                                    new VirtualMachineScaleSetIpTag().withIpTagType("sddgsoemnzgqizale")
                                                        .withTag("wufmhrjsakbiaetyara")))
                                                .withPublicIpPrefix(new SubResource().withId("groxwd"))
                                                .withPublicIpAddressVersion(IpVersion.IPV4)
                                                .withDeleteOption(DeleteOptions.DELETE))
                                        .withPrivateIpAddressVersion(IpVersion.IPV4)
                                        .withApplicationGatewayBackendAddressPools(
                                            Arrays.asList(new SubResource().withId("groxwd")))
                                        .withApplicationSecurityGroups(
                                            Arrays.asList(new SubResource().withId("groxwd")))
                                        .withLoadBalancerBackendAddressPools(
                                            Arrays.asList(new SubResource().withId("groxwd")))
                                        .withLoadBalancerInboundNatPools(
                                            Arrays.asList(new SubResource().withId("groxwd")))))
                                    .withEnableIpForwarding(true)
                                    .withDeleteOption(DeleteOptions.DELETE)
                                    .withAuxiliaryMode(NetworkInterfaceAuxiliaryMode.NONE)
                                    .withAuxiliarySku(NetworkInterfaceAuxiliarySku.NONE)))
                            .withNetworkApiVersion(NetworkApiVersion.TWO_ZERO_TWO_ZERO_ONE_ONE_ZERO_ONE))
                        .withSecurityProfile(new SecurityProfile()
                            .withUefiSettings(new UefiSettings().withSecureBootEnabled(true).withVTpmEnabled(true))
                            .withEncryptionAtHost(true)
                            .withSecurityType(SecurityTypes.TRUSTED_LAUNCH)
                            .withEncryptionIdentity(
                                new EncryptionIdentity().withUserAssignedIdentityResourceId("qoersmt"))
                            .withProxyAgentSettings(new ProxyAgentSettings().withEnabled(true)
                                .withMode(Mode.AUDIT)
                                .withKeyIncarnationId(20)))
                        .withDiagnosticsProfile(new DiagnosticsProfile().withBootDiagnostics(
                            new BootDiagnostics().withEnabled(true).withStorageUri("rzamfwghybpx")))
                        .withExtensionProfile(new VirtualMachineScaleSetExtensionProfile()
                            .withExtensions(Arrays.asList(new VirtualMachineScaleSetExtension().withName("bndxuxx")
                                .withForceUpdateTag("yhgxw")
                                .withPublisher("kpxtirxjfprhs")
                                .withTypePropertiesType("pgjilctjjwaa")
                                .withTypeHandlerVersion("zevivcoilxmbwlrihhhibq")
                                .withAutoUpgradeMinorVersion(true)
                                .withEnableAutomaticUpgrade(true)
                                .withSettings(SerializerFactory.createDefaultManagementSerializerAdapter()
                                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                                .withProtectedSettings(SerializerFactory.createDefaultManagementSerializerAdapter()
                                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                                .withProvisionAfterExtensions(Arrays.asList("nftzosroolbcwmpupujzqwqe"))
                                .withSuppressFailures(true)
                                .withProtectedSettingsFromKeyVault(
                                    new KeyVaultSecretReference().withSecretUrl("fakeTokenPlaceholder")
                                        .withSourceVault(new SubResource().withId("groxwd")))))
                            .withExtensionsTimeBudget("mbhjahtdygwgyszdwjtvlvtgchdwil"))
                        .withLicenseType("v")
                        .withScheduledEventsProfile(new ScheduledEventsProfile()
                            .withTerminateNotificationProfile(
                                new TerminateNotificationProfile().withNotBeforeTimeout("iljppmmw").withEnable(true))
                            .withOsImageNotificationProfile(
                                new OSImageNotificationProfile().withNotBeforeTimeout("olbpadmevekyczfokodtfprxti")
                                    .withEnable(true)))
                        .withUserData("s")
                        .withCapacityReservation(new CapacityReservationProfile()
                            .withCapacityReservationGroup(new SubResource().withId("groxwd")))
                        .withApplicationProfile(new ApplicationProfile()
                            .withGalleryApplications(Arrays.asList(new VMGalleryApplication().withTags("eyrqjbib")
                                .withOrder(5)
                                .withPackageReferenceId("lfxqiadouhmbovcd")
                                .withConfigurationReference("ulztmiavpojpbpbddgnuuiimxcpau")
                                .withTreatFailureAsDeploymentFailure(true)
                                .withEnableAutomaticUpgrade(true))))
                        .withHardwareProfile(new VirtualMachineScaleSetHardwareProfile()
                            .withVmSizeProperties(new VMSizeProperties().withVCpusAvailable(16).withVCpusPerCore(23)))
                        .withServiceArtifactReference(new ServiceArtifactReference().withId("qlkeeyskyr"))
                        .withSecurityPostureReference(new SecurityPostureReference()
                            .withId("mubredelfbshboaxrsxiajihahaa")
                            .withExcludeExtensions(Arrays.asList(new VirtualMachineExtension()
                                .withLocation("wrqxhbqaebwkzmcdmngyqmhogc")
                                .withTags(mapOf("key7356", "fakeTokenPlaceholder"))
                                .withForceUpdateTag("oriasdwawveilgusfrn")
                                .withPublisher("rxoajzb")
                                .withTypePropertiesType("vhrtgbaqdkbrrqxsdiiaqxksmqukl")
                                .withTypeHandlerVersion("bvzbiibps")
                                .withAutoUpgradeMinorVersion(true)
                                .withEnableAutomaticUpgrade(true)
                                .withSettings(SerializerFactory.createDefaultManagementSerializerAdapter()
                                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                                .withProtectedSettings(SerializerFactory
                                    .createDefaultManagementSerializerAdapter()
                                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                                .withInstanceView(new VirtualMachineExtensionInstanceView().withName("ip")
                                    .withType("woadxvobquacooaujyg")
                                    .withTypeHandlerVersion("ftkkqxdqiofgsusvxekdcpua")
                                    .withSubstatuses(
                                        Arrays.asList(new InstanceViewStatus().withCode("fakeTokenPlaceholder")
                                            .withLevel(StatusLevelTypes.INFO)
                                            .withDisplayStatus("pomenhgqjoelbxvsqwxxexqxv")
                                            .withMessage("jxjjmlwbjylzvrislyyflhnmizhiu")
                                            .withTime(OffsetDateTime.parse("2024-04-29T21:51:44.042Z"))))
                                    .withStatuses(
                                        Arrays.asList(new InstanceViewStatus().withCode("fakeTokenPlaceholder")
                                            .withLevel(StatusLevelTypes.INFO)
                                            .withDisplayStatus("pomenhgqjoelbxvsqwxxexqxv")
                                            .withMessage("jxjjmlwbjylzvrislyyflhnmizhiu")
                                            .withTime(OffsetDateTime.parse("2024-04-29T21:51:44.042Z")))))
                                .withSuppressFailures(true)
                                .withProtectedSettingsFromKeyVault(
                                    new KeyVaultSecretReference().withSecretUrl("fakeTokenPlaceholder")
                                        .withSourceVault(new SubResource().withId("groxwd")))
                                .withProvisionAfterExtensions(Arrays.asList("lwsfavklrgzuwmyxscskt"))))))
                    .withComputeApiVersion("2023-07-01")
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
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-07-01-preview/examples/Fleets_Delete.
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
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-07-01-preview/examples/Fleets_Get.
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
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-07-01-preview/examples/
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
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-07-01-preview/examples/
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
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-07-01-preview/examples/
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
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.azurefleet.models.AdditionalUnattendContent;
import com.azure.resourcemanager.azurefleet.models.ApiEntityReference;
import com.azure.resourcemanager.azurefleet.models.ApplicationProfile;
import com.azure.resourcemanager.azurefleet.models.BootDiagnostics;
import com.azure.resourcemanager.azurefleet.models.CachingTypes;
import com.azure.resourcemanager.azurefleet.models.CapacityReservationProfile;
import com.azure.resourcemanager.azurefleet.models.ComponentNames;
import com.azure.resourcemanager.azurefleet.models.ComputeProfileUpdate;
import com.azure.resourcemanager.azurefleet.models.DeleteOptions;
import com.azure.resourcemanager.azurefleet.models.DiagnosticsProfile;
import com.azure.resourcemanager.azurefleet.models.DiffDiskOptions;
import com.azure.resourcemanager.azurefleet.models.DiffDiskPlacement;
import com.azure.resourcemanager.azurefleet.models.DiffDiskSettings;
import com.azure.resourcemanager.azurefleet.models.DiskCreateOptionTypes;
import com.azure.resourcemanager.azurefleet.models.DiskDeleteOptionTypes;
import com.azure.resourcemanager.azurefleet.models.DiskEncryptionSetParameters;
import com.azure.resourcemanager.azurefleet.models.DomainNameLabelScopeTypes;
import com.azure.resourcemanager.azurefleet.models.EncryptionIdentity;
import com.azure.resourcemanager.azurefleet.models.EvictionPolicy;
import com.azure.resourcemanager.azurefleet.models.Fleet;
import com.azure.resourcemanager.azurefleet.models.FleetPropertiesUpdate;
import com.azure.resourcemanager.azurefleet.models.ImageReference;
import com.azure.resourcemanager.azurefleet.models.InstanceViewStatus;
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
import com.azure.resourcemanager.azurefleet.models.PassNames;
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
import com.azure.resourcemanager.azurefleet.models.StatusLevelTypes;
import com.azure.resourcemanager.azurefleet.models.StorageAccountTypes;
import com.azure.resourcemanager.azurefleet.models.TerminateNotificationProfile;
import com.azure.resourcemanager.azurefleet.models.UefiSettings;
import com.azure.resourcemanager.azurefleet.models.VaultCertificate;
import com.azure.resourcemanager.azurefleet.models.VaultSecretGroup;
import com.azure.resourcemanager.azurefleet.models.VirtualHardDisk;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineExtension;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineExtensionInstanceView;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetDataDisk;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetExtension;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetExtensionProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetHardwareProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetIpConfiguration;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetIpTag;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetManagedDiskParameters;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkConfiguration;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkConfigurationDnsSettings;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetNetworkProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetOSDisk;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetOSProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetPublicIpAddressConfiguration;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetStorageProfile;
import com.azure.resourcemanager.azurefleet.models.VirtualMachineScaleSetVMProfile;
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
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Fleets Update.
 */
public final class FleetsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-07-01-preview/examples/Fleets_Update.
     * json
     */
    /**
     * Sample code: Fleets_Update.
     * 
     * @param manager Entry point to AzurefleetManager.
     */
    public static void fleetsUpdate(com.azure.resourcemanager.azurefleet.AzurefleetManager manager) throws IOException {
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
            .withProperties(new FleetPropertiesUpdate()
                .withSpotPriorityProfile(new SpotPriorityProfile().withCapacity(20)
                    .withMinCapacity(10)
                    .withMaxPricePerVM(0.00865F)
                    .withEvictionPolicy(EvictionPolicy.DELETE)
                    .withAllocationStrategy(SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED)
                    .withMaintain(true))
                .withRegularPriorityProfile(new RegularPriorityProfile().withCapacity(20)
                    .withMinCapacity(10)
                    .withAllocationStrategy(RegularPriorityAllocationStrategy.LOWEST_PRICE))
                .withVmSizesProfile(Arrays.asList(new VmSizeProfile().withName("Standard_d1_v2").withRank(19225)))
                .withComputeProfile(new ComputeProfileUpdate()
                    .withBaseVirtualMachineProfile(new VirtualMachineScaleSetVMProfile()
                        .withOsProfile(new VirtualMachineScaleSetOSProfile().withComputerNamePrefix("o")
                            .withAdminUsername("nrgzqciiaaxjrqldbmjbqkyhntp")
                            .withAdminPassword("fakeTokenPlaceholder")
                            .withCustomData("xjjib")
                            .withWindowsConfiguration(new WindowsConfiguration().withProvisionVMAgent(true)
                                .withEnableAutomaticUpdates(true)
                                .withTimeZone("hlyjiqcfksgrpjrct")
                                .withAdditionalUnattendContent(Arrays
                                    .asList(new AdditionalUnattendContent().withPassName(PassNames.OOBE_SYSTEM)
                                        .withComponentName(ComponentNames.MICROSOFT_WINDOWS_SHELL_SETUP)
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
                            .withSecrets(
                                Arrays.asList(new VaultSecretGroup().withSourceVault(new SubResource().withId("groxwd"))
                                    .withVaultCertificates(
                                        Arrays.asList(new VaultCertificate().withCertificateUrl("tyldwkzafmnkvpo")
                                            .withCertificateStore("nlxrwavpzhueffxsshlun")))))
                            .withAllowExtensionOperations(true)
                            .withRequireGuestProvisionSignal(true))
                        .withStorageProfile(
                            new VirtualMachineScaleSetStorageProfile()
                                .withImageReference(new ImageReference().withId("aiunknwgksu")
                                    .withPublisher("mqxgwbiyjzmxavhbkd")
                                    .withOffer("isxgumkarlkomp")
                                    .withSku("eojmppqcrnpmxirtp")
                                    .withVersion("wvpcqefgtmqdgltiuz")
                                    .withSharedGalleryImageId("kmkgihoxwlawuuhcinfirktdwkmx")
                                    .withCommunityGalleryImageId("vlqe"))
                                .withOsDisk(
                                    new VirtualMachineScaleSetOSDisk().withName("wfttw")
                                        .withCaching(CachingTypes.NONE)
                                        .withWriteAcceleratorEnabled(true)
                                        .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                                        .withDiffDiskSettings(new DiffDiskSettings().withOption(DiffDiskOptions.LOCAL)
                                            .withPlacement(DiffDiskPlacement.CACHE_DISK))
                                        .withDiskSizeGB(14)
                                        .withOsType(OperatingSystemTypes.WINDOWS)
                                        .withImage(new VirtualHardDisk().withUri("thqceubivdrjs"))
                                        .withVhdContainers(Arrays.asList("tkzcwddtinkfpnfklatw"))
                                        .withManagedDisk(new VirtualMachineScaleSetManagedDiskParameters()
                                            .withStorageAccountType(StorageAccountTypes.STANDARD_LRS)
                                            .withDiskEncryptionSet(
                                                new DiskEncryptionSetParameters().withId("vmatqblzjalbatdepyzqmnd"))
                                            .withSecurityProfile(new VMDiskSecurityProfile()
                                                .withSecurityEncryptionType(SecurityEncryptionTypes.VMGUEST_STATE_ONLY)
                                                .withDiskEncryptionSet(new DiskEncryptionSetParameters()
                                                    .withId("vmatqblzjalbatdepyzqmnd"))))
                                        .withDeleteOption(DiskDeleteOptionTypes.DELETE))
                                .withDataDisks(
                                    Arrays.asList(new VirtualMachineScaleSetDataDisk().withName("eogiykmdmeikswxmigjws")
                                        .withLun(14)
                                        .withCaching(CachingTypes.NONE)
                                        .withWriteAcceleratorEnabled(true)
                                        .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE)
                                        .withDiskSizeGB(6)
                                        .withManagedDisk(new VirtualMachineScaleSetManagedDiskParameters()
                                            .withStorageAccountType(StorageAccountTypes.STANDARD_LRS)
                                            .withDiskEncryptionSet(
                                                new DiskEncryptionSetParameters().withId("vmatqblzjalbatdepyzqmnd"))
                                            .withSecurityProfile(new VMDiskSecurityProfile()
                                                .withSecurityEncryptionType(SecurityEncryptionTypes.VMGUEST_STATE_ONLY)
                                                .withDiskEncryptionSet(new DiskEncryptionSetParameters()
                                                    .withId("vmatqblzjalbatdepyzqmnd"))))
                                        .withDiskIopsReadWrite(27L)
                                        .withDiskMBpsReadWrite(2L)
                                        .withDeleteOption(DiskDeleteOptionTypes.DELETE)))
                                .withDiskControllerType("uzb"))
                        .withNetworkProfile(new VirtualMachineScaleSetNetworkProfile()
                            .withHealthProbe(new ApiEntityReference().withId("cmkfcjhmrwxwqtac"))
                            .withNetworkInterfaceConfigurations(
                                Arrays.asList(new VirtualMachineScaleSetNetworkConfiguration().withName("i")
                                    .withPrimary(true)
                                    .withEnableAcceleratedNetworking(true)
                                    .withDisableTcpStateTracking(true)
                                    .withEnableFpga(true)
                                    .withNetworkSecurityGroup(new SubResource().withId("groxwd"))
                                    .withDnsSettings(new VirtualMachineScaleSetNetworkConfigurationDnsSettings()
                                        .withDnsServers(Arrays.asList("nxmmfolhclsesu")))
                                    .withIpConfigurations(Arrays.asList(new VirtualMachineScaleSetIpConfiguration()
                                        .withName("oezqhkidfhyywlfzwuotilrpbqnjg")
                                        .withSubnet(new ApiEntityReference().withId("cmkfcjhmrwxwqtac"))
                                        .withPrimary(true)
                                        .withPublicIpAddressConfiguration(
                                            new VirtualMachineScaleSetPublicIpAddressConfiguration().withName("fvpqf")
                                                .withSku(new PublicIpAddressSku().withName(PublicIpAddressSkuName.BASIC)
                                                    .withTier(PublicIpAddressSkuTier.REGIONAL))
                                                .withIdleTimeoutInMinutes(9)
                                                .withDnsSettings(
                                                    new VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings()
                                                        .withDomainNameLabel("ukrddzvmorpmfsczjwtbvp")
                                                        .withDomainNameLabelScope(
                                                            DomainNameLabelScopeTypes.TENANT_REUSE))
                                                .withIpTags(Arrays.asList(
                                                    new VirtualMachineScaleSetIpTag().withIpTagType("sddgsoemnzgqizale")
                                                        .withTag("wufmhrjsakbiaetyara")))
                                                .withPublicIpPrefix(new SubResource().withId("groxwd"))
                                                .withPublicIpAddressVersion(IpVersion.IPV4)
                                                .withDeleteOption(DeleteOptions.DELETE))
                                        .withPrivateIpAddressVersion(IpVersion.IPV4)
                                        .withApplicationGatewayBackendAddressPools(
                                            Arrays.asList(new SubResource().withId("groxwd")))
                                        .withApplicationSecurityGroups(
                                            Arrays.asList(new SubResource().withId("groxwd")))
                                        .withLoadBalancerBackendAddressPools(
                                            Arrays.asList(new SubResource().withId("groxwd")))
                                        .withLoadBalancerInboundNatPools(
                                            Arrays.asList(new SubResource().withId("groxwd")))))
                                    .withEnableIpForwarding(true)
                                    .withDeleteOption(DeleteOptions.DELETE)
                                    .withAuxiliaryMode(NetworkInterfaceAuxiliaryMode.NONE)
                                    .withAuxiliarySku(NetworkInterfaceAuxiliarySku.NONE)))
                            .withNetworkApiVersion(NetworkApiVersion.TWO_ZERO_TWO_ZERO_ONE_ONE_ZERO_ONE))
                        .withSecurityProfile(new SecurityProfile()
                            .withUefiSettings(new UefiSettings().withSecureBootEnabled(true).withVTpmEnabled(true))
                            .withEncryptionAtHost(true)
                            .withSecurityType(SecurityTypes.TRUSTED_LAUNCH)
                            .withEncryptionIdentity(
                                new EncryptionIdentity().withUserAssignedIdentityResourceId("qoersmt"))
                            .withProxyAgentSettings(new ProxyAgentSettings().withEnabled(true)
                                .withMode(Mode.AUDIT)
                                .withKeyIncarnationId(20)))
                        .withDiagnosticsProfile(new DiagnosticsProfile().withBootDiagnostics(
                            new BootDiagnostics().withEnabled(true).withStorageUri("rzamfwghybpx")))
                        .withExtensionProfile(new VirtualMachineScaleSetExtensionProfile()
                            .withExtensions(Arrays.asList(new VirtualMachineScaleSetExtension().withName("bndxuxx")
                                .withForceUpdateTag("yhgxw")
                                .withPublisher("kpxtirxjfprhs")
                                .withTypePropertiesType("pgjilctjjwaa")
                                .withTypeHandlerVersion("zevivcoilxmbwlrihhhibq")
                                .withAutoUpgradeMinorVersion(true)
                                .withEnableAutomaticUpgrade(true)
                                .withSettings(SerializerFactory.createDefaultManagementSerializerAdapter()
                                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                                .withProtectedSettings(SerializerFactory.createDefaultManagementSerializerAdapter()
                                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                                .withProvisionAfterExtensions(Arrays.asList("nftzosroolbcwmpupujzqwqe"))
                                .withSuppressFailures(true)
                                .withProtectedSettingsFromKeyVault(
                                    new KeyVaultSecretReference().withSecretUrl("fakeTokenPlaceholder")
                                        .withSourceVault(new SubResource().withId("groxwd")))))
                            .withExtensionsTimeBudget("mbhjahtdygwgyszdwjtvlvtgchdwil"))
                        .withLicenseType("v")
                        .withScheduledEventsProfile(new ScheduledEventsProfile()
                            .withTerminateNotificationProfile(
                                new TerminateNotificationProfile().withNotBeforeTimeout("iljppmmw").withEnable(true))
                            .withOsImageNotificationProfile(
                                new OSImageNotificationProfile().withNotBeforeTimeout("olbpadmevekyczfokodtfprxti")
                                    .withEnable(true)))
                        .withUserData("s")
                        .withCapacityReservation(new CapacityReservationProfile()
                            .withCapacityReservationGroup(new SubResource().withId("groxwd")))
                        .withApplicationProfile(new ApplicationProfile()
                            .withGalleryApplications(Arrays.asList(new VMGalleryApplication().withTags("eyrqjbib")
                                .withOrder(5)
                                .withPackageReferenceId("lfxqiadouhmbovcd")
                                .withConfigurationReference("ulztmiavpojpbpbddgnuuiimxcpau")
                                .withTreatFailureAsDeploymentFailure(true)
                                .withEnableAutomaticUpgrade(true))))
                        .withHardwareProfile(new VirtualMachineScaleSetHardwareProfile()
                            .withVmSizeProperties(new VMSizeProperties().withVCpusAvailable(16).withVCpusPerCore(23)))
                        .withServiceArtifactReference(new ServiceArtifactReference().withId("qlkeeyskyr"))
                        .withSecurityPostureReference(
                            new SecurityPostureReference().withId("mubredelfbshboaxrsxiajihahaa")
                                .withExcludeExtensions(Arrays.asList(new VirtualMachineExtension()
                                    .withLocation("wrqxhbqaebwkzmcdmngyqmhogc")
                                    .withTags(mapOf())
                                    .withForceUpdateTag("oriasdwawveilgusfrn")
                                    .withPublisher("rxoajzb")
                                    .withTypePropertiesType("vhrtgbaqdkbrrqxsdiiaqxksmqukl")
                                    .withTypeHandlerVersion("bvzbiibps")
                                    .withAutoUpgradeMinorVersion(true)
                                    .withEnableAutomaticUpgrade(true)
                                    .withSettings(SerializerFactory.createDefaultManagementSerializerAdapter()
                                        .deserialize("{}", Object.class, SerializerEncoding.JSON))
                                    .withProtectedSettings(SerializerFactory.createDefaultManagementSerializerAdapter()
                                        .deserialize("{}", Object.class, SerializerEncoding.JSON))
                                    .withInstanceView(new VirtualMachineExtensionInstanceView().withName("ip")
                                        .withType("woadxvobquacooaujyg")
                                        .withTypeHandlerVersion("ftkkqxdqiofgsusvxekdcpua")
                                        .withSubstatuses(
                                            Arrays.asList(new InstanceViewStatus().withCode("fakeTokenPlaceholder")
                                                .withLevel(StatusLevelTypes.INFO)
                                                .withDisplayStatus("pomenhgqjoelbxvsqwxxexqxv")
                                                .withMessage("jxjjmlwbjylzvrislyyflhnmizhiu")
                                                .withTime(OffsetDateTime.parse("2024-04-29T21:51:44.042Z"))))
                                        .withStatuses(
                                            Arrays.asList(new InstanceViewStatus().withCode("fakeTokenPlaceholder")
                                                .withLevel(StatusLevelTypes.INFO)
                                                .withDisplayStatus("pomenhgqjoelbxvsqwxxexqxv")
                                                .withMessage("jxjjmlwbjylzvrislyyflhnmizhiu")
                                                .withTime(OffsetDateTime.parse("2024-04-29T21:51:44.042Z")))))
                                    .withSuppressFailures(true)
                                    .withProtectedSettingsFromKeyVault(
                                        new KeyVaultSecretReference().withSecretUrl("fakeTokenPlaceholder")
                                            .withSourceVault(new SubResource().withId("groxwd")))
                                    .withProvisionAfterExtensions(Arrays.asList("lwsfavklrgzuwmyxscskt"))))))
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
     * specification/azurefleet/resource-manager/Microsoft.AzureFleet/preview/2024-07-01-preview/examples/
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

