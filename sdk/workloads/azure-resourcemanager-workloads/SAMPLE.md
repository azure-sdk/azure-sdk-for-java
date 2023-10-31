# Code snippets and samples


## AcssBackupConnections

- [Create](#acssbackupconnections_create)
- [Delete](#acssbackupconnections_delete)
- [Get](#acssbackupconnections_get)
- [List](#acssbackupconnections_list)
- [Update](#acssbackupconnections_update)

## Connectors

- [Create](#connectors_create)
- [Delete](#connectors_delete)
- [GetByResourceGroup](#connectors_getbyresourcegroup)
- [List](#connectors_list)
- [ListByResourceGroup](#connectors_listbyresourcegroup)
- [Update](#connectors_update)

## Operations

- [List](#operations_list)

## ResourceProvider

- [SapAvailabilityZoneDetails](#resourceprovider_sapavailabilityzonedetails)
- [SapDiskConfigurations](#resourceprovider_sapdiskconfigurations)
- [SapSizingRecommendations](#resourceprovider_sapsizingrecommendations)
- [SapSupportedSku](#resourceprovider_sapsupportedsku)

## SapApplicationServerInstances

- [Create](#sapapplicationserverinstances_create)
- [Delete](#sapapplicationserverinstances_delete)
- [Get](#sapapplicationserverinstances_get)
- [List](#sapapplicationserverinstances_list)
- [StartInstance](#sapapplicationserverinstances_startinstance)
- [StopInstance](#sapapplicationserverinstances_stopinstance)
- [Update](#sapapplicationserverinstances_update)

## SapCentralInstances

- [Create](#sapcentralinstances_create)
- [Delete](#sapcentralinstances_delete)
- [Get](#sapcentralinstances_get)
- [List](#sapcentralinstances_list)
- [StartInstance](#sapcentralinstances_startinstance)
- [StopInstance](#sapcentralinstances_stopinstance)
- [Update](#sapcentralinstances_update)

## SapDatabaseInstances

- [Create](#sapdatabaseinstances_create)
- [Delete](#sapdatabaseinstances_delete)
- [Get](#sapdatabaseinstances_get)
- [List](#sapdatabaseinstances_list)
- [StartInstance](#sapdatabaseinstances_startinstance)
- [StopInstance](#sapdatabaseinstances_stopinstance)
- [Update](#sapdatabaseinstances_update)

## SapVirtualInstances

- [Create](#sapvirtualinstances_create)
- [Delete](#sapvirtualinstances_delete)
- [GetByResourceGroup](#sapvirtualinstances_getbyresourcegroup)
- [List](#sapvirtualinstances_list)
- [ListByResourceGroup](#sapvirtualinstances_listbyresourcegroup)
- [Start](#sapvirtualinstances_start)
- [Stop](#sapvirtualinstances_stop)
- [Update](#sapvirtualinstances_update)
### AcssBackupConnections_Create

```java
import com.azure.resourcemanager.workloads.models.AzureIaaSvmProtectionPolicy;
import com.azure.resourcemanager.workloads.models.AzureVmWorkloadProtectionPolicy;
import com.azure.resourcemanager.workloads.models.DBBackupPolicyProperties;
import com.azure.resourcemanager.workloads.models.DailyRetentionSchedule;
import com.azure.resourcemanager.workloads.models.DayOfWeek;
import com.azure.resourcemanager.workloads.models.DiskExclusionProperties;
import com.azure.resourcemanager.workloads.models.ExistingRecoveryServicesVault;
import com.azure.resourcemanager.workloads.models.HanaBackupData;
import com.azure.resourcemanager.workloads.models.IaasvmPolicyType;
import com.azure.resourcemanager.workloads.models.InstantRPAdditionalDetails;
import com.azure.resourcemanager.workloads.models.LogSchedulePolicy;
import com.azure.resourcemanager.workloads.models.LongTermRetentionPolicy;
import com.azure.resourcemanager.workloads.models.MonthOfYear;
import com.azure.resourcemanager.workloads.models.MonthlyRetentionSchedule;
import com.azure.resourcemanager.workloads.models.NewRecoveryServicesVault;
import com.azure.resourcemanager.workloads.models.PolicyType;
import com.azure.resourcemanager.workloads.models.RetentionDuration;
import com.azure.resourcemanager.workloads.models.RetentionDurationType;
import com.azure.resourcemanager.workloads.models.RetentionScheduleFormat;
import com.azure.resourcemanager.workloads.models.ScheduleRunType;
import com.azure.resourcemanager.workloads.models.Settings;
import com.azure.resourcemanager.workloads.models.SimpleRetentionPolicy;
import com.azure.resourcemanager.workloads.models.SimpleSchedulePolicy;
import com.azure.resourcemanager.workloads.models.SnapshotBackupAdditionalDetails;
import com.azure.resourcemanager.workloads.models.SqlBackupData;
import com.azure.resourcemanager.workloads.models.SslConfiguration;
import com.azure.resourcemanager.workloads.models.SslCryptoProvider;
import com.azure.resourcemanager.workloads.models.SubProtectionPolicy;
import com.azure.resourcemanager.workloads.models.TieringMode;
import com.azure.resourcemanager.workloads.models.TieringPolicy;
import com.azure.resourcemanager.workloads.models.UserAssignedIdentityProperties;
import com.azure.resourcemanager.workloads.models.UserAssignedManagedIdentityDetails;
import com.azure.resourcemanager.workloads.models.VMBackupData;
import com.azure.resourcemanager.workloads.models.VMBackupPolicyProperties;
import com.azure.resourcemanager.workloads.models.WeekOfMonth;
import com.azure.resourcemanager.workloads.models.WeeklyRetentionFormat;
import com.azure.resourcemanager.workloads.models.WeeklyRetentionSchedule;
import com.azure.resourcemanager.workloads.models.WorkloadType;
import com.azure.resourcemanager.workloads.models.YearlyRetentionSchedule;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for AcssBackupConnections Create. */
public final class AcssBackupConnectionsCreateSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/ACSSBackup/SQL_NewPolicy.json
     */
    /**
     * Sample code: Create a SQL backup connection with a new backup policy.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createASQLBackupConnectionWithANewBackupPolicy(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .acssBackupConnections()
            .define("dbBackup")
            .withRegion("westcentralus")
            .withExistingConnector("test-rg", "C1")
            .withTags(mapOf())
            .withBackupData(
                new SqlBackupData()
                    .withRecoveryServicesVault(
                        new NewRecoveryServicesVault().withName("test-vault").withResourceGroup("test-rg"))
                    .withBackupPolicy(
                        new DBBackupPolicyProperties()
                            .withName("defaultSqlPolicy")
                            .withProperties(
                                new AzureVmWorkloadProtectionPolicy()
                                    .withProtectedItemsCount(0)
                                    .withWorkLoadType(WorkloadType.SQLDATA_BASE)
                                    .withSettings(
                                        new Settings()
                                            .withTimeZone("UTC")
                                            .withIssqlcompression(true)
                                            .withIsCompression(true))
                                    .withSubProtectionPolicy(
                                        Arrays
                                            .asList(
                                                new SubProtectionPolicy()
                                                    .withPolicyType(PolicyType.FULL)
                                                    .withSchedulePolicy(
                                                        new SimpleSchedulePolicy()
                                                            .withScheduleRunFrequency(ScheduleRunType.WEEKLY)
                                                            .withScheduleRunDays(Arrays.asList(DayOfWeek.SUNDAY))
                                                            .withScheduleRunTimes(
                                                                Arrays
                                                                    .asList(
                                                                        OffsetDateTime
                                                                            .parse("2022-11-29T19:30:00.000Z"))))
                                                    .withRetentionPolicy(
                                                        new LongTermRetentionPolicy()
                                                            .withWeeklySchedule(
                                                                new WeeklyRetentionSchedule()
                                                                    .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                                                    .withRetentionTimes(
                                                                        Arrays
                                                                            .asList(
                                                                                OffsetDateTime
                                                                                    .parse("2022-11-29T19:30:00.000Z")))
                                                                    .withRetentionDuration(
                                                                        new RetentionDuration()
                                                                            .withCount(104)
                                                                            .withDurationType(
                                                                                RetentionDurationType.WEEKS)))
                                                            .withMonthlySchedule(
                                                                new MonthlyRetentionSchedule()
                                                                    .withRetentionScheduleFormatType(
                                                                        RetentionScheduleFormat.WEEKLY)
                                                                    .withRetentionScheduleWeekly(
                                                                        new WeeklyRetentionFormat()
                                                                            .withDaysOfTheWeek(
                                                                                Arrays.asList(DayOfWeek.SUNDAY))
                                                                            .withWeeksOfTheMonth(
                                                                                Arrays.asList(WeekOfMonth.FIRST)))
                                                                    .withRetentionTimes(
                                                                        Arrays
                                                                            .asList(
                                                                                OffsetDateTime
                                                                                    .parse("2022-11-29T19:30:00.000Z")))
                                                                    .withRetentionDuration(
                                                                        new RetentionDuration()
                                                                            .withCount(60)
                                                                            .withDurationType(
                                                                                RetentionDurationType.MONTHS)))
                                                            .withYearlySchedule(
                                                                new YearlyRetentionSchedule()
                                                                    .withRetentionScheduleFormatType(
                                                                        RetentionScheduleFormat.WEEKLY)
                                                                    .withMonthsOfYear(
                                                                        Arrays.asList(MonthOfYear.JANUARY))
                                                                    .withRetentionScheduleWeekly(
                                                                        new WeeklyRetentionFormat()
                                                                            .withDaysOfTheWeek(
                                                                                Arrays.asList(DayOfWeek.SUNDAY))
                                                                            .withWeeksOfTheMonth(
                                                                                Arrays.asList(WeekOfMonth.FIRST)))
                                                                    .withRetentionTimes(
                                                                        Arrays
                                                                            .asList(
                                                                                OffsetDateTime
                                                                                    .parse("2022-11-29T19:30:00.000Z")))
                                                                    .withRetentionDuration(
                                                                        new RetentionDuration()
                                                                            .withCount(10)
                                                                            .withDurationType(
                                                                                RetentionDurationType.YEARS))))
                                                    .withTieringPolicy(
                                                        mapOf(
                                                            "ArchivedRP",
                                                            new TieringPolicy()
                                                                .withTieringMode(TieringMode.TIER_AFTER)
                                                                .withDuration(45)
                                                                .withDurationType(RetentionDurationType.DAYS))),
                                                new SubProtectionPolicy()
                                                    .withPolicyType(PolicyType.DIFFERENTIAL)
                                                    .withSchedulePolicy(
                                                        new SimpleSchedulePolicy()
                                                            .withScheduleRunFrequency(ScheduleRunType.WEEKLY)
                                                            .withScheduleRunDays(Arrays.asList(DayOfWeek.MONDAY))
                                                            .withScheduleRunTimes(
                                                                Arrays
                                                                    .asList(
                                                                        OffsetDateTime.parse("2022-09-29T02:00:00Z")))
                                                            .withScheduleWeeklyFrequency(0))
                                                    .withRetentionPolicy(
                                                        new SimpleRetentionPolicy()
                                                            .withRetentionDuration(
                                                                new RetentionDuration()
                                                                    .withCount(30)
                                                                    .withDurationType(RetentionDurationType.DAYS))),
                                                new SubProtectionPolicy()
                                                    .withPolicyType(PolicyType.LOG)
                                                    .withSchedulePolicy(
                                                        new LogSchedulePolicy().withScheduleFrequencyInMins(120))
                                                    .withRetentionPolicy(
                                                        new SimpleRetentionPolicy()
                                                            .withRetentionDuration(
                                                                new RetentionDuration()
                                                                    .withCount(20)
                                                                    .withDurationType(RetentionDurationType.DAYS))))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/ACSSBackup/VM_NewPolicy.json
     */
    /**
     * Sample code: Create a VM backup connection with a new backup policy with tieringPolicy.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createAVMBackupConnectionWithANewBackupPolicyWithTieringPolicy(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .acssBackupConnections()
            .define("vmBackup")
            .withRegion("westcentralus")
            .withExistingConnector("test-rg", "C1")
            .withTags(mapOf())
            .withBackupData(
                new VMBackupData()
                    .withRecoveryServicesVault(
                        new NewRecoveryServicesVault().withName("test-vault").withResourceGroup("test-rg"))
                    .withBackupPolicy(
                        new VMBackupPolicyProperties()
                            .withName("defaultVmPolicy")
                            .withProperties(
                                new AzureIaaSvmProtectionPolicy()
                                    .withProtectedItemsCount(0)
                                    .withInstantRPDetails(
                                        new InstantRPAdditionalDetails()
                                            .withAzureBackupRGNamePrefix("dasas")
                                            .withAzureBackupRGNameSuffix("a"))
                                    .withSchedulePolicy(
                                        new SimpleSchedulePolicy()
                                            .withScheduleRunFrequency(ScheduleRunType.DAILY)
                                            .withScheduleRunTimes(
                                                Arrays.asList(OffsetDateTime.parse("2022-11-29T19:30:00.000Z"))))
                                    .withRetentionPolicy(
                                        new LongTermRetentionPolicy()
                                            .withDailySchedule(
                                                new DailyRetentionSchedule()
                                                    .withRetentionTimes(
                                                        Arrays.asList(OffsetDateTime.parse("2022-11-29T19:30:00.000Z")))
                                                    .withRetentionDuration(
                                                        new RetentionDuration()
                                                            .withCount(30)
                                                            .withDurationType(RetentionDurationType.DAYS)))
                                            .withWeeklySchedule(
                                                new WeeklyRetentionSchedule()
                                                    .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                                    .withRetentionTimes(
                                                        Arrays.asList(OffsetDateTime.parse("2022-11-29T19:30:00.000Z")))
                                                    .withRetentionDuration(
                                                        new RetentionDuration()
                                                            .withCount(12)
                                                            .withDurationType(RetentionDurationType.WEEKS)))
                                            .withMonthlySchedule(
                                                new MonthlyRetentionSchedule()
                                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                                    .withRetentionScheduleWeekly(
                                                        new WeeklyRetentionFormat()
                                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FIRST)))
                                                    .withRetentionTimes(
                                                        Arrays.asList(OffsetDateTime.parse("2022-11-29T19:30:00.000Z")))
                                                    .withRetentionDuration(
                                                        new RetentionDuration()
                                                            .withCount(60)
                                                            .withDurationType(RetentionDurationType.MONTHS)))
                                            .withYearlySchedule(
                                                new YearlyRetentionSchedule()
                                                    .withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                                                    .withMonthsOfYear(Arrays.asList(MonthOfYear.JANUARY))
                                                    .withRetentionScheduleWeekly(
                                                        new WeeklyRetentionFormat()
                                                            .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                                            .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FIRST)))
                                                    .withRetentionTimes(
                                                        Arrays.asList(OffsetDateTime.parse("2022-11-29T19:30:00.000Z")))
                                                    .withRetentionDuration(
                                                        new RetentionDuration()
                                                            .withCount(10)
                                                            .withDurationType(RetentionDurationType.YEARS))))
                                    .withTieringPolicy(
                                        mapOf(
                                            "ArchivedRP",
                                            new TieringPolicy()
                                                .withTieringMode(TieringMode.TIER_AFTER)
                                                .withDuration(3)
                                                .withDurationType(RetentionDurationType.MONTHS)))
                                    .withInstantRpRetentionRangeInDays(2)
                                    .withTimeZone("UTC")
                                    .withPolicyType(IaasvmPolicyType.V1)))
                    .withDiskExclusionProperties(
                        new DiskExclusionProperties().withDiskLunList(Arrays.asList()).withIsInclusionList(true)))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/ACSSBackup/DB_New_Create.json
     */
    /**
     * Sample code: Create a db backup connection with a new backup policy.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createADbBackupConnectionWithANewBackupPolicy(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .acssBackupConnections()
            .define("dbBackup")
            .withRegion("westcentralus")
            .withExistingConnector("test-rg", "C1")
            .withTags(mapOf())
            .withBackupData(
                new SqlBackupData()
                    .withRecoveryServicesVault(
                        new ExistingRecoveryServicesVault()
                            .withId(
                                "/subscriptions/6d875e77-e412-4d7d-9af4-8895278b4443/resourceGroups/test-rg/providers/Microsoft.RecoveryServices/vaults/test-vault"))
                    .withBackupPolicy(
                        new DBBackupPolicyProperties()
                            .withName("defaultDbPolicy")
                            .withProperties(
                                new AzureVmWorkloadProtectionPolicy()
                                    .withProtectedItemsCount(0)
                                    .withWorkLoadType(WorkloadType.SQLDATA_BASE)
                                    .withSettings(
                                        new Settings()
                                            .withTimeZone("UTC")
                                            .withIssqlcompression(false)
                                            .withIsCompression(false))
                                    .withSubProtectionPolicy(
                                        Arrays
                                            .asList(
                                                new SubProtectionPolicy()
                                                    .withPolicyType(PolicyType.FULL)
                                                    .withSchedulePolicy(
                                                        new SimpleSchedulePolicy()
                                                            .withScheduleRunFrequency(ScheduleRunType.DAILY)
                                                            .withScheduleRunTimes(
                                                                Arrays
                                                                    .asList(
                                                                        OffsetDateTime.parse("2018-01-10T18:30:00Z")))
                                                            .withScheduleWeeklyFrequency(0))
                                                    .withRetentionPolicy(
                                                        new LongTermRetentionPolicy()
                                                            .withDailySchedule(
                                                                new DailyRetentionSchedule()
                                                                    .withRetentionTimes(
                                                                        Arrays
                                                                            .asList(
                                                                                OffsetDateTime
                                                                                    .parse("2018-01-10T18:30:00Z")))
                                                                    .withRetentionDuration(
                                                                        new RetentionDuration()
                                                                            .withCount(30)
                                                                            .withDurationType(
                                                                                RetentionDurationType.DAYS)))),
                                                new SubProtectionPolicy()
                                                    .withPolicyType(PolicyType.LOG)
                                                    .withSchedulePolicy(
                                                        new LogSchedulePolicy().withScheduleFrequencyInMins(60))
                                                    .withRetentionPolicy(
                                                        new SimpleRetentionPolicy()
                                                            .withRetentionDuration(
                                                                new RetentionDuration()
                                                                    .withCount(30)
                                                                    .withDurationType(RetentionDurationType.DAYS))))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/ACSSBackup/HANA_NewPolicy.json
     */
    /**
     * Sample code: Create a HANA backup connection with a new backup policy.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createAHANABackupConnectionWithANewBackupPolicy(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .acssBackupConnections()
            .define("dbBackup")
            .withRegion("westcentralus")
            .withExistingConnector("test-rg", "C1")
            .withTags(mapOf())
            .withBackupData(
                new HanaBackupData()
                    .withRecoveryServicesVault(
                        new NewRecoveryServicesVault().withName("test-vault").withResourceGroup("test-rg"))
                    .withSslConfiguration(
                        new SslConfiguration()
                            .withSslKeyStore("fakeTokenPlaceholder")
                            .withSslTrustStore("sapsrv.pse")
                            .withSslHostnameInCertificate("hostname")
                            .withSslCryptoProvider(SslCryptoProvider.COMMONCRYPTO))
                    .withBackupPolicy(
                        new DBBackupPolicyProperties()
                            .withName("defaultHanaPolicy")
                            .withProperties(
                                new AzureVmWorkloadProtectionPolicy()
                                    .withProtectedItemsCount(0)
                                    .withWorkLoadType(WorkloadType.SAPHANA_DATABASE)
                                    .withSettings(
                                        new Settings()
                                            .withTimeZone("UTC")
                                            .withIssqlcompression(false)
                                            .withIsCompression(false))
                                    .withSubProtectionPolicy(
                                        Arrays
                                            .asList(
                                                new SubProtectionPolicy()
                                                    .withPolicyType(PolicyType.FULL)
                                                    .withSchedulePolicy(
                                                        new SimpleSchedulePolicy()
                                                            .withScheduleRunFrequency(ScheduleRunType.WEEKLY)
                                                            .withScheduleRunDays(Arrays.asList(DayOfWeek.SUNDAY))
                                                            .withScheduleRunTimes(
                                                                Arrays
                                                                    .asList(
                                                                        OffsetDateTime
                                                                            .parse("2022-11-29T19:30:00.000Z"))))
                                                    .withRetentionPolicy(
                                                        new LongTermRetentionPolicy()
                                                            .withWeeklySchedule(
                                                                new WeeklyRetentionSchedule()
                                                                    .withDaysOfTheWeek(Arrays.asList(DayOfWeek.SUNDAY))
                                                                    .withRetentionTimes(
                                                                        Arrays
                                                                            .asList(
                                                                                OffsetDateTime
                                                                                    .parse("2022-11-29T19:30:00.000Z")))
                                                                    .withRetentionDuration(
                                                                        new RetentionDuration()
                                                                            .withCount(104)
                                                                            .withDurationType(
                                                                                RetentionDurationType.WEEKS)))
                                                            .withMonthlySchedule(
                                                                new MonthlyRetentionSchedule()
                                                                    .withRetentionScheduleFormatType(
                                                                        RetentionScheduleFormat.WEEKLY)
                                                                    .withRetentionScheduleWeekly(
                                                                        new WeeklyRetentionFormat()
                                                                            .withDaysOfTheWeek(
                                                                                Arrays.asList(DayOfWeek.SUNDAY))
                                                                            .withWeeksOfTheMonth(
                                                                                Arrays.asList(WeekOfMonth.FIRST)))
                                                                    .withRetentionTimes(
                                                                        Arrays
                                                                            .asList(
                                                                                OffsetDateTime
                                                                                    .parse("2022-11-29T19:30:00.000Z")))
                                                                    .withRetentionDuration(
                                                                        new RetentionDuration()
                                                                            .withCount(60)
                                                                            .withDurationType(
                                                                                RetentionDurationType.MONTHS)))
                                                            .withYearlySchedule(
                                                                new YearlyRetentionSchedule()
                                                                    .withRetentionScheduleFormatType(
                                                                        RetentionScheduleFormat.WEEKLY)
                                                                    .withMonthsOfYear(
                                                                        Arrays.asList(MonthOfYear.JANUARY))
                                                                    .withRetentionScheduleWeekly(
                                                                        new WeeklyRetentionFormat()
                                                                            .withDaysOfTheWeek(
                                                                                Arrays.asList(DayOfWeek.SUNDAY))
                                                                            .withWeeksOfTheMonth(
                                                                                Arrays.asList(WeekOfMonth.FIRST)))
                                                                    .withRetentionTimes(
                                                                        Arrays
                                                                            .asList(
                                                                                OffsetDateTime
                                                                                    .parse("2022-11-29T19:30:00.000Z")))
                                                                    .withRetentionDuration(
                                                                        new RetentionDuration()
                                                                            .withCount(10)
                                                                            .withDurationType(
                                                                                RetentionDurationType.YEARS))))
                                                    .withTieringPolicy(
                                                        mapOf(
                                                            "ArchivedRP",
                                                            new TieringPolicy()
                                                                .withTieringMode(TieringMode.DO_NOT_TIER))),
                                                new SubProtectionPolicy()
                                                    .withPolicyType(PolicyType.DIFFERENTIAL)
                                                    .withSchedulePolicy(
                                                        new SimpleSchedulePolicy()
                                                            .withScheduleRunFrequency(ScheduleRunType.WEEKLY)
                                                            .withScheduleRunDays(Arrays.asList(DayOfWeek.MONDAY))
                                                            .withScheduleRunTimes(
                                                                Arrays
                                                                    .asList(
                                                                        OffsetDateTime.parse("2022-09-29T02:00:00Z")))
                                                            .withScheduleWeeklyFrequency(0))
                                                    .withRetentionPolicy(
                                                        new SimpleRetentionPolicy()
                                                            .withRetentionDuration(
                                                                new RetentionDuration()
                                                                    .withCount(30)
                                                                    .withDurationType(RetentionDurationType.DAYS))),
                                                new SubProtectionPolicy()
                                                    .withPolicyType(PolicyType.LOG)
                                                    .withSchedulePolicy(
                                                        new LogSchedulePolicy().withScheduleFrequencyInMins(120))
                                                    .withRetentionPolicy(
                                                        new SimpleRetentionPolicy()
                                                            .withRetentionDuration(
                                                                new RetentionDuration()
                                                                    .withCount(20)
                                                                    .withDurationType(RetentionDurationType.DAYS)))))))
                    .withHdbuserstoreKeyName("fakeTokenPlaceholder")
                    .withInstanceNumber("00")
                    .withDbInstanceSnapshotBackupPolicy(
                        new DBBackupPolicyProperties()
                            .withName("defaultDbInstanceSnapshotPolicy")
                            .withProperties(
                                new AzureVmWorkloadProtectionPolicy()
                                    .withWorkLoadType(WorkloadType.SAPHANA_DBINSTANCE)
                                    .withSettings(
                                        new Settings()
                                            .withTimeZone("UTC")
                                            .withIssqlcompression(false)
                                            .withIsCompression(false))
                                    .withSubProtectionPolicy(
                                        Arrays
                                            .asList(
                                                new SubProtectionPolicy()
                                                    .withPolicyType(PolicyType.SNAPSHOT_FULL)
                                                    .withSchedulePolicy(
                                                        new SimpleSchedulePolicy()
                                                            .withScheduleRunFrequency(ScheduleRunType.DAILY)
                                                            .withScheduleRunTimes(
                                                                Arrays
                                                                    .asList(
                                                                        OffsetDateTime
                                                                            .parse("2023-09-18T06:30:00.000Z"))))
                                                    .withSnapshotBackupAdditionalDetails(
                                                        new SnapshotBackupAdditionalDetails()
                                                            .withInstantRpRetentionRangeInDays(1)
                                                            .withInstantRPDetails("test-rg")
                                                            .withUserAssignedManagedIdentityDetails(
                                                                new UserAssignedManagedIdentityDetails()
                                                                    .withIdentityArmId(
                                                                        "/subscriptions/6d875e77-e412-4d7d-9af4-8895278b4443/resourcegroups/test-rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/testMsi")
                                                                    .withIdentityName("testMsi")
                                                                    .withUserAssignedIdentityProperties(
                                                                        new UserAssignedIdentityProperties()
                                                                            .withClientId(
                                                                                "c3a877cf-51f8-4031-8f17-ab562d1e7737")
                                                                            .withPrincipalId(
                                                                                "2f5834bd-4b86-4d85-a8df-6dd829a6418c")))))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/ACSSBackup/VM_Existing_Create.json
     */
    /**
     * Sample code: Create a vm backup connection with an existing backup policy.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createAVmBackupConnectionWithAnExistingBackupPolicy(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .acssBackupConnections()
            .define("vmBackup")
            .withRegion("westcentralus")
            .withExistingConnector("test-rg", "C1")
            .withTags(mapOf())
            .withBackupData(
                new VMBackupData()
                    .withRecoveryServicesVault(
                        new ExistingRecoveryServicesVault()
                            .withId(
                                "/subscriptions/6d875e77-e412-4d7d-9af4-8895278b4443/resourceGroups/test-rg/providers/Microsoft.RecoveryServices/vaults/test-vault"))
                    .withBackupPolicy(new VMBackupPolicyProperties().withName("defaultVmPolicy"))
                    .withDiskExclusionProperties(
                        new DiskExclusionProperties().withDiskLunList(Arrays.asList()).withIsInclusionList(true)))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/ACSSBackup/DB_Existing_Create.json
     */
    /**
     * Sample code: Create a db backup connection with an existing backup policy.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createADbBackupConnectionWithAnExistingBackupPolicy(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .acssBackupConnections()
            .define("dbBackup")
            .withRegion("westcentralus")
            .withExistingConnector("test-rg", "C1")
            .withTags(mapOf())
            .withBackupData(
                new SqlBackupData()
                    .withRecoveryServicesVault(
                        new ExistingRecoveryServicesVault()
                            .withId(
                                "/subscriptions/6d875e77-e412-4d7d-9af4-8895278b4443/resourceGroups/test-rg/providers/Microsoft.RecoveryServices/vaults/test-vault"))
                    .withBackupPolicy(new DBBackupPolicyProperties().withName("defaultDbPolicy")))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/ACSSBackup/VM_New_Create.json
     */
    /**
     * Sample code: Create a vm backup connection with a new backup policy.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createAVmBackupConnectionWithANewBackupPolicy(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .acssBackupConnections()
            .define("vmBackup")
            .withRegion("westcentralus")
            .withExistingConnector("test-rg", "C1")
            .withTags(mapOf())
            .withBackupData(
                new VMBackupData()
                    .withRecoveryServicesVault(
                        new NewRecoveryServicesVault().withName("test-vault").withResourceGroup("test-rg"))
                    .withBackupPolicy(
                        new VMBackupPolicyProperties()
                            .withName("defaultVmPolicy")
                            .withProperties(
                                new AzureIaaSvmProtectionPolicy()
                                    .withProtectedItemsCount(0)
                                    .withInstantRPDetails(new InstantRPAdditionalDetails())
                                    .withSchedulePolicy(
                                        new SimpleSchedulePolicy()
                                            .withScheduleRunFrequency(ScheduleRunType.DAILY)
                                            .withScheduleRunTimes(
                                                Arrays.asList(OffsetDateTime.parse("2018-01-10T18:30:00Z")))
                                            .withScheduleWeeklyFrequency(0))
                                    .withRetentionPolicy(
                                        new LongTermRetentionPolicy()
                                            .withDailySchedule(
                                                new DailyRetentionSchedule()
                                                    .withRetentionTimes(
                                                        Arrays.asList(OffsetDateTime.parse("2018-01-10T18:30:00Z")))
                                                    .withRetentionDuration(
                                                        new RetentionDuration()
                                                            .withCount(30)
                                                            .withDurationType(RetentionDurationType.DAYS))))
                                    .withInstantRpRetentionRangeInDays(2)))
                    .withDiskExclusionProperties(
                        new DiskExclusionProperties().withDiskLunList(Arrays.asList()).withIsInclusionList(true)))
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

### AcssBackupConnections_Delete

```java
/** Samples for AcssBackupConnections Delete. */
public final class AcssBackupConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/ACSSBackup/Delete.json
     */
    /**
     * Sample code: Delete a backup connection resource of virtual instance for SAP.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void deleteABackupConnectionResourceOfVirtualInstanceForSAP(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.acssBackupConnections().delete("test-rg", "C1", "vmBackup", com.azure.core.util.Context.NONE);
    }
}
```

### AcssBackupConnections_Get

```java
/** Samples for AcssBackupConnections Get. */
public final class AcssBackupConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/ACSSBackup/Get.json
     */
    /**
     * Sample code: Get the backup connection resource of virtual instance for SAP.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void getTheBackupConnectionResourceOfVirtualInstanceForSAP(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.acssBackupConnections().getWithResponse("test-rg", "C1", "vmBackup", com.azure.core.util.Context.NONE);
    }
}
```

### AcssBackupConnections_List

```java
/** Samples for AcssBackupConnections List. */
public final class AcssBackupConnectionsListSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/ACSSBackup/List.json
     */
    /**
     * Sample code: List the backup connection resources of virtual instance for SAP under the given connector resource.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void listTheBackupConnectionResourcesOfVirtualInstanceForSAPUnderTheGivenConnectorResource(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.acssBackupConnections().list("test-rg", "C1", com.azure.core.util.Context.NONE);
    }
}
```

### AcssBackupConnections_Update

```java
import com.azure.resourcemanager.workloads.models.AcssBackupConnection;
import java.util.HashMap;
import java.util.Map;

/** Samples for AcssBackupConnections Update. */
public final class AcssBackupConnectionsUpdateSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/ACSSBackup/Update.json
     */
    /**
     * Sample code: Update an backup connection resource of virtual instance for SAP.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void updateAnBackupConnectionResourceOfVirtualInstanceForSAP(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        AcssBackupConnection resource =
            manager
                .acssBackupConnections()
                .getWithResponse("test-rg", "C1", "vmBackup", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1")).apply();
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

### Connectors_Create

```java
import java.util.HashMap;
import java.util.Map;

/** Samples for Connectors Create. */
public final class ConnectorsCreateSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/connectors/Create.json
     */
    /**
     * Sample code: Create a connector resource.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createAConnectorResource(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .connectors()
            .define("C1")
            .withRegion("westcentralus")
            .withExistingResourceGroup("test-rg")
            .withSourceResourceId(
                "/subscriptions/6d875e77-e412-4d7d-9af4-8895278b4443/resourceGroups/test-rg/providers/Microsoft.Workloads/sapVirtualInstances/X00")
            .withTags(mapOf())
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

### Connectors_Delete

```java
/** Samples for Connectors Delete. */
public final class ConnectorsDeleteSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/connectors/Delete.json
     */
    /**
     * Sample code: Delete the connector resource.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void deleteTheConnectorResource(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.connectors().delete("test-rg", "C1", com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_GetByResourceGroup

```java
/** Samples for Connectors GetByResourceGroup. */
public final class ConnectorsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/connectors/Get.json
     */
    /**
     * Sample code: Get the connector resource.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void getTheConnectorResource(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.connectors().getByResourceGroupWithResponse("test-rg", "C1", com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_List

```java
/** Samples for Connectors List. */
public final class ConnectorsListSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/connectors/ListBySubscription.json
     */
    /**
     * Sample code: List all connector resources in a subscription.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void listAllConnectorResourcesInASubscription(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.connectors().list(com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_ListByResourceGroup

```java
/** Samples for Connectors ListByResourceGroup. */
public final class ConnectorsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/connectors/ListByResourceGroup.json
     */
    /**
     * Sample code: List all connector resources in a resource group.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void listAllConnectorResourcesInAResourceGroup(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.connectors().listByResourceGroup("test-rg", com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_Update

```java
import com.azure.resourcemanager.workloads.models.Connector;
import java.util.HashMap;
import java.util.Map;

/** Samples for Connectors Update. */
public final class ConnectorsUpdateSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/connectors/preview/2023-10-01-preview/examples/connectors/Update.json
     */
    /**
     * Sample code: Update the connector resource.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void updateTheConnectorResource(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        Connector resource =
            manager
                .connectors()
                .getByResourceGroupWithResponse("test-rg", "C1", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1")).apply();
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
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/operations/preview/2023-10-01-preview/examples/Operations_List.json
     */
    /**
     * Sample code: Operations.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void operations(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_SapAvailabilityZoneDetails

```java
import com.azure.resourcemanager.workloads.models.SapAvailabilityZoneDetailsRequest;
import com.azure.resourcemanager.workloads.models.SapDatabaseType;
import com.azure.resourcemanager.workloads.models.SapProductType;

/** Samples for ResourceProvider SapAvailabilityZoneDetails. */
public final class ResourceProviderSapAvailabilityZoneDetailsSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPAvailabilityZoneDetails_northeurope.json
     */
    /**
     * Sample code: SAPAvailabilityZoneDetails_northeurope.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPAvailabilityZoneDetailsNortheurope(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .resourceProviders()
            .sapAvailabilityZoneDetailsWithResponse(
                "centralus",
                new SapAvailabilityZoneDetailsRequest()
                    .withAppLocation("northeurope")
                    .withSapProduct(SapProductType.S4HANA)
                    .withDatabaseType(SapDatabaseType.HANA),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPAvailabilityZoneDetails_eastus.json
     */
    /**
     * Sample code: SAPAvailabilityZoneDetails_eastus.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPAvailabilityZoneDetailsEastus(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .resourceProviders()
            .sapAvailabilityZoneDetailsWithResponse(
                "centralus",
                new SapAvailabilityZoneDetailsRequest()
                    .withAppLocation("eastus")
                    .withSapProduct(SapProductType.S4HANA)
                    .withDatabaseType(SapDatabaseType.HANA),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_SapDiskConfigurations

```java
import com.azure.resourcemanager.workloads.models.SapDatabaseType;
import com.azure.resourcemanager.workloads.models.SapDeploymentType;
import com.azure.resourcemanager.workloads.models.SapDiskConfigurationsRequest;
import com.azure.resourcemanager.workloads.models.SapEnvironmentType;
import com.azure.resourcemanager.workloads.models.SapProductType;

/** Samples for ResourceProvider SapDiskConfigurations. */
public final class ResourceProviderSapDiskConfigurationsSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPDiskConfigurations_NonProd.json
     */
    /**
     * Sample code: SAPDiskConfigurations_NonProd.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPDiskConfigurationsNonProd(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .resourceProviders()
            .sapDiskConfigurationsWithResponse(
                "centralus",
                new SapDiskConfigurationsRequest()
                    .withAppLocation("eastus")
                    .withEnvironment(SapEnvironmentType.NON_PROD)
                    .withSapProduct(SapProductType.S4HANA)
                    .withDatabaseType(SapDatabaseType.HANA)
                    .withDeploymentType(SapDeploymentType.THREE_TIER)
                    .withDbVmSku("Standard_M32ts"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPDiskConfigurations_Prod.json
     */
    /**
     * Sample code: SAPDiskConfigurations_Prod.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPDiskConfigurationsProd(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .resourceProviders()
            .sapDiskConfigurationsWithResponse(
                "centralus",
                new SapDiskConfigurationsRequest()
                    .withAppLocation("eastus")
                    .withEnvironment(SapEnvironmentType.PROD)
                    .withSapProduct(SapProductType.S4HANA)
                    .withDatabaseType(SapDatabaseType.HANA)
                    .withDeploymentType(SapDeploymentType.THREE_TIER)
                    .withDbVmSku("Standard_M32ts"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_SapSizingRecommendations

```java
import com.azure.resourcemanager.workloads.models.SapDatabaseScaleMethod;
import com.azure.resourcemanager.workloads.models.SapDatabaseType;
import com.azure.resourcemanager.workloads.models.SapDeploymentType;
import com.azure.resourcemanager.workloads.models.SapEnvironmentType;
import com.azure.resourcemanager.workloads.models.SapHighAvailabilityType;
import com.azure.resourcemanager.workloads.models.SapProductType;
import com.azure.resourcemanager.workloads.models.SapSizingRecommendationRequest;

/** Samples for ResourceProvider SapSizingRecommendations. */
public final class ResourceProviderSapSizingRecommendationsSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPSizingRecommendations_S4HANA_Distributed.json
     */
    /**
     * Sample code: SAPSizingRecommendations_S4HANA_Distributed.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPSizingRecommendationsS4HANADistributed(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .resourceProviders()
            .sapSizingRecommendationsWithResponse(
                "centralus",
                new SapSizingRecommendationRequest()
                    .withAppLocation("eastus")
                    .withEnvironment(SapEnvironmentType.PROD)
                    .withSapProduct(SapProductType.S4HANA)
                    .withDeploymentType(SapDeploymentType.THREE_TIER)
                    .withSaps(20000L)
                    .withDbMemory(1024L)
                    .withDatabaseType(SapDatabaseType.HANA)
                    .withDbScaleMethod(SapDatabaseScaleMethod.SCALE_UP),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPSizingRecommendations_S4HANA_SingleServer.json
     */
    /**
     * Sample code: SAPSizingRecommendations_S4HANA_SingleServer.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPSizingRecommendationsS4HANASingleServer(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .resourceProviders()
            .sapSizingRecommendationsWithResponse(
                "centralus",
                new SapSizingRecommendationRequest()
                    .withAppLocation("eastus")
                    .withEnvironment(SapEnvironmentType.NON_PROD)
                    .withSapProduct(SapProductType.S4HANA)
                    .withDeploymentType(SapDeploymentType.SINGLE_SERVER)
                    .withSaps(60000L)
                    .withDbMemory(2000L)
                    .withDatabaseType(SapDatabaseType.HANA)
                    .withDbScaleMethod(SapDatabaseScaleMethod.SCALE_UP),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPSizingRecommendations_S4HANA_HA_AvZone.json
     */
    /**
     * Sample code: SAPSizingRecommendations_S4HANA_DistributedHA_AvZone.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPSizingRecommendationsS4HANADistributedHAAvZone(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .resourceProviders()
            .sapSizingRecommendationsWithResponse(
                "centralus",
                new SapSizingRecommendationRequest()
                    .withAppLocation("eastus")
                    .withEnvironment(SapEnvironmentType.PROD)
                    .withSapProduct(SapProductType.S4HANA)
                    .withDeploymentType(SapDeploymentType.THREE_TIER)
                    .withSaps(75000L)
                    .withDbMemory(1024L)
                    .withDatabaseType(SapDatabaseType.HANA)
                    .withDbScaleMethod(SapDatabaseScaleMethod.SCALE_UP)
                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_ZONE),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPSizingRecommendations_S4HANA_HA_AvSet.json
     */
    /**
     * Sample code: SAPSizingRecommendations_S4HANA_DistributedHA_AvSet.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPSizingRecommendationsS4HANADistributedHAAvSet(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .resourceProviders()
            .sapSizingRecommendationsWithResponse(
                "centralus",
                new SapSizingRecommendationRequest()
                    .withAppLocation("eastus")
                    .withEnvironment(SapEnvironmentType.PROD)
                    .withSapProduct(SapProductType.S4HANA)
                    .withDeploymentType(SapDeploymentType.THREE_TIER)
                    .withSaps(75000L)
                    .withDbMemory(1024L)
                    .withDatabaseType(SapDatabaseType.HANA)
                    .withDbScaleMethod(SapDatabaseScaleMethod.SCALE_UP)
                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_SET),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_SapSupportedSku

```java
import com.azure.resourcemanager.workloads.models.SapDatabaseType;
import com.azure.resourcemanager.workloads.models.SapDeploymentType;
import com.azure.resourcemanager.workloads.models.SapEnvironmentType;
import com.azure.resourcemanager.workloads.models.SapHighAvailabilityType;
import com.azure.resourcemanager.workloads.models.SapProductType;
import com.azure.resourcemanager.workloads.models.SapSupportedSkusRequest;

/** Samples for ResourceProvider SapSupportedSku. */
public final class ResourceProviderSapSupportedSkuSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPSupportedSkus_SingleServer.json
     */
    /**
     * Sample code: SAPSupportedSkus_SingleServer.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPSupportedSkusSingleServer(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .resourceProviders()
            .sapSupportedSkuWithResponse(
                "centralus",
                new SapSupportedSkusRequest()
                    .withAppLocation("eastus")
                    .withEnvironment(SapEnvironmentType.NON_PROD)
                    .withSapProduct(SapProductType.S4HANA)
                    .withDeploymentType(SapDeploymentType.SINGLE_SERVER)
                    .withDatabaseType(SapDatabaseType.HANA),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPSupportedSkus_Distributed.json
     */
    /**
     * Sample code: SAPSupportedSkus_Distributed.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPSupportedSkusDistributed(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .resourceProviders()
            .sapSupportedSkuWithResponse(
                "centralus",
                new SapSupportedSkusRequest()
                    .withAppLocation("eastus")
                    .withEnvironment(SapEnvironmentType.PROD)
                    .withSapProduct(SapProductType.S4HANA)
                    .withDeploymentType(SapDeploymentType.THREE_TIER)
                    .withDatabaseType(SapDatabaseType.HANA),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPSupportedSkus_DistributedHA_AvZone.json
     */
    /**
     * Sample code: SAPSupportedSkus_DistributedHA_AvZone.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPSupportedSkusDistributedHAAvZone(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .resourceProviders()
            .sapSupportedSkuWithResponse(
                "centralus",
                new SapSupportedSkusRequest()
                    .withAppLocation("eastus")
                    .withEnvironment(SapEnvironmentType.PROD)
                    .withSapProduct(SapProductType.S4HANA)
                    .withDeploymentType(SapDeploymentType.THREE_TIER)
                    .withDatabaseType(SapDatabaseType.HANA)
                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_ZONE),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPSupportedSkus_DistributedHA_AvSet.json
     */
    /**
     * Sample code: SAPSupportedSkus_DistributedHA_AvSet.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPSupportedSkusDistributedHAAvSet(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .resourceProviders()
            .sapSupportedSkuWithResponse(
                "centralus",
                new SapSupportedSkusRequest()
                    .withAppLocation("eastus")
                    .withEnvironment(SapEnvironmentType.PROD)
                    .withSapProduct(SapProductType.S4HANA)
                    .withDeploymentType(SapDeploymentType.THREE_TIER)
                    .withDatabaseType(SapDatabaseType.HANA)
                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_SET),
                com.azure.core.util.Context.NONE);
    }
}
```

### SapApplicationServerInstances_Create

```java
import java.util.HashMap;
import java.util.Map;

/** Samples for SapApplicationServerInstances Create. */
public final class SapApplicationServerInstancesCreateSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapapplicationinstances/SAPApplicationServerInstances_Create.json
     */
    /**
     * Sample code: SAPApplicationServerInstances_Create.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPApplicationServerInstancesCreate(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapApplicationServerInstances()
            .define("app01")
            .withRegion("eastus")
            .withExistingSapVirtualInstance("test-rg", "X00")
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapapplicationinstances/SAPApplicationServerInstances_Create_HA_AvSet.json
     */
    /**
     * Sample code: Create SAP Application Server Instances for HA System with Availability Set.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createSAPApplicationServerInstancesForHASystemWithAvailabilitySet(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapApplicationServerInstances()
            .define("app01")
            .withRegion("eastus")
            .withExistingSapVirtualInstance("test-rg", "X00")
            .withTags(mapOf())
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

### SapApplicationServerInstances_Delete

```java
/** Samples for SapApplicationServerInstances Delete. */
public final class SapApplicationServerInstancesDeleteSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapapplicationinstances/SAPApplicationServerInstances_Delete.json
     */
    /**
     * Sample code: SAPApplicationServerInstances_Delete.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPApplicationServerInstancesDelete(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapApplicationServerInstances().delete("test-rg", "X00", "app01", com.azure.core.util.Context.NONE);
    }
}
```

### SapApplicationServerInstances_Get

```java
/** Samples for SapApplicationServerInstances Get. */
public final class SapApplicationServerInstancesGetSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapapplicationinstances/SAPApplicationServerInstances_Get.json
     */
    /**
     * Sample code: SAPApplicationServerInstances_Get.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPApplicationServerInstancesGet(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapApplicationServerInstances()
            .getWithResponse("test-rg", "X00", "app01", com.azure.core.util.Context.NONE);
    }
}
```

### SapApplicationServerInstances_List

```java
/** Samples for SapApplicationServerInstances List. */
public final class SapApplicationServerInstancesListSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapapplicationinstances/SAPApplicationServerInstances_List.json
     */
    /**
     * Sample code: SAPApplicationServerInstances_List.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPApplicationServerInstancesList(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapApplicationServerInstances().list("test-rg", "X00", com.azure.core.util.Context.NONE);
    }
}
```

### SapApplicationServerInstances_StartInstance

```java
import com.azure.resourcemanager.workloads.models.StartRequest;

/** Samples for SapApplicationServerInstances StartInstance. */
public final class SapApplicationServerInstancesStartInstanceSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapapplicationinstances/SAPApplicationServerInstances_StartInstance_WithInfraOperations.json
     */
    /**
     * Sample code: Start Virtual Machine and the SAP Application Server Instance on it.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void startVirtualMachineAndTheSAPApplicationServerInstanceOnIt(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapApplicationServerInstances()
            .startInstance(
                "test-rg", "X00", "app01", new StartRequest().withStartVm(true), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapapplicationinstances/SAPApplicationServerInstances_StartInstance.json
     */
    /**
     * Sample code: Start the SAP Application Server Instance.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void startTheSAPApplicationServerInstance(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapApplicationServerInstances()
            .startInstance("test-rg", "X00", "app01", null, com.azure.core.util.Context.NONE);
    }
}
```

### SapApplicationServerInstances_StopInstance

```java
import com.azure.resourcemanager.workloads.models.StopRequest;

/** Samples for SapApplicationServerInstances StopInstance. */
public final class SapApplicationServerInstancesStopInstanceSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapapplicationinstances/SAPApplicationServerInstances_StopInstance_WithInfraOperations.json
     */
    /**
     * Sample code: Stop the SAP Application Server Instance and the Virtual machine.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void stopTheSAPApplicationServerInstanceAndTheVirtualMachine(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapApplicationServerInstances()
            .stopInstance(
                "test-rg",
                "X00",
                "app01",
                new StopRequest().withSoftStopTimeoutSeconds(0L).withDeallocateVm(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapapplicationinstances/SAPApplicationServerInstances_StopInstance.json
     */
    /**
     * Sample code: Stop the SAP Application Server Instance.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void stopTheSAPApplicationServerInstance(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapApplicationServerInstances()
            .stopInstance(
                "test-rg",
                "X00",
                "app01",
                new StopRequest().withSoftStopTimeoutSeconds(0L),
                com.azure.core.util.Context.NONE);
    }
}
```

### SapApplicationServerInstances_Update

```java
import com.azure.resourcemanager.workloads.models.SapApplicationServerInstance;
import java.util.HashMap;
import java.util.Map;

/** Samples for SapApplicationServerInstances Update. */
public final class SapApplicationServerInstancesUpdateSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapapplicationinstances/SAPApplicationServerInstances_Update.json
     */
    /**
     * Sample code: SAPApplicationServerInstances_Update.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPApplicationServerInstancesUpdate(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        SapApplicationServerInstance resource =
            manager
                .sapApplicationServerInstances()
                .getWithResponse("test-rg", "X00", "app01", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1")).apply();
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

### SapCentralInstances_Create

```java
import java.util.HashMap;
import java.util.Map;

/** Samples for SapCentralInstances Create. */
public final class SapCentralInstancesCreateSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapcentralinstances/SAPCentralInstances_Create_HA_AvSet.json
     */
    /**
     * Sample code: Create SAP Central Instances for HA System with Availability Set.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createSAPCentralInstancesForHASystemWithAvailabilitySet(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapCentralInstances()
            .define("centralServer")
            .withRegion("eastus")
            .withExistingSapVirtualInstance("test-rg", "X00")
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapcentralinstances/SAPCentralInstances_Create.json
     */
    /**
     * Sample code: SAPCentralInstances_Create.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPCentralInstancesCreate(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapCentralInstances()
            .define("centralServer")
            .withRegion("eastus")
            .withExistingSapVirtualInstance("test-rg", "X00")
            .withTags(mapOf())
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

### SapCentralInstances_Delete

```java
/** Samples for SapCentralInstances Delete. */
public final class SapCentralInstancesDeleteSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapcentralinstances/SAPCentralInstances_Delete.json
     */
    /**
     * Sample code: SAPCentralInstances_Delete.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPCentralInstancesDelete(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapCentralInstances().delete("test-rg", "X00", "centralServer", com.azure.core.util.Context.NONE);
    }
}
```

### SapCentralInstances_Get

```java
/** Samples for SapCentralInstances Get. */
public final class SapCentralInstancesGetSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapcentralinstances/SAPCentralInstances_Get.json
     */
    /**
     * Sample code: SAPCentralInstances_Get.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPCentralInstancesGet(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapCentralInstances()
            .getWithResponse("test-rg", "X00", "centralServer", com.azure.core.util.Context.NONE);
    }
}
```

### SapCentralInstances_List

```java
/** Samples for SapCentralInstances List. */
public final class SapCentralInstancesListSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapcentralinstances/SAPCentralInstances_List.json
     */
    /**
     * Sample code: SAPCentralInstances_List.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPCentralInstancesList(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapCentralInstances().list("test-rg", "X00", com.azure.core.util.Context.NONE);
    }
}
```

### SapCentralInstances_StartInstance

```java
import com.azure.resourcemanager.workloads.models.StartRequest;

/** Samples for SapCentralInstances StartInstance. */
public final class SapCentralInstancesStartInstanceSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapcentralinstances/SAPCentralInstances_StartInstance_WithInfraOperations.json
     */
    /**
     * Sample code: Start the virtual machine(s) and the SAP central services instance on it.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void startTheVirtualMachineSAndTheSAPCentralServicesInstanceOnIt(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapCentralInstances()
            .startInstance(
                "test-rg",
                "X00",
                "centralServer",
                new StartRequest().withStartVm(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapcentralinstances/SAPCentralInstances_StartInstance.json
     */
    /**
     * Sample code: Start the SAP Central Services Instance.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void startTheSAPCentralServicesInstance(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapCentralInstances()
            .startInstance("test-rg", "X00", "centralServer", null, com.azure.core.util.Context.NONE);
    }
}
```

### SapCentralInstances_StopInstance

```java
import com.azure.resourcemanager.workloads.models.StopRequest;

/** Samples for SapCentralInstances StopInstance. */
public final class SapCentralInstancesStopInstanceSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapcentralinstances/SAPCentralInstances_StopInstance.json
     */
    /**
     * Sample code: Stop the SAP Central Services Instance.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void stopTheSAPCentralServicesInstance(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapCentralInstances()
            .stopInstance(
                "test-rg",
                "X00",
                "centralServer",
                new StopRequest().withSoftStopTimeoutSeconds(1200L),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapcentralinstances/SAPCentralInstances_StopInstance_WithInfraOperations.json
     */
    /**
     * Sample code: Stop the SAP Central Services Instance and its underlying Virtual Machine(s).
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void stopTheSAPCentralServicesInstanceAndItsUnderlyingVirtualMachineS(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapCentralInstances()
            .stopInstance(
                "test-rg",
                "X00",
                "centralServer",
                new StopRequest().withDeallocateVm(true),
                com.azure.core.util.Context.NONE);
    }
}
```

### SapCentralInstances_Update

```java
import com.azure.resourcemanager.workloads.models.SapCentralServerInstance;
import java.util.HashMap;
import java.util.Map;

/** Samples for SapCentralInstances Update. */
public final class SapCentralInstancesUpdateSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapcentralinstances/SAPCentralInstances_Update.json
     */
    /**
     * Sample code: SAPCentralInstances_Update.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPCentralInstancesUpdate(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        SapCentralServerInstance resource =
            manager
                .sapCentralInstances()
                .getWithResponse("test-rg", "X00", "centralServer", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1")).apply();
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

### SapDatabaseInstances_Create

```java
import java.util.HashMap;
import java.util.Map;

/** Samples for SapDatabaseInstances Create. */
public final class SapDatabaseInstancesCreateSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapdatabaseinstances/SAPDatabaseInstances_Create_HA_AvSet.json
     */
    /**
     * Sample code: Create SAP Database Instances for HA System with Availability Set.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createSAPDatabaseInstancesForHASystemWithAvailabilitySet(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapDatabaseInstances()
            .define("databaseServer")
            .withRegion("eastus")
            .withExistingSapVirtualInstance("test-rg", "X00")
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapdatabaseinstances/SAPDatabaseInstances_Create.json
     */
    /**
     * Sample code: SAPDatabaseInstances_Create.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPDatabaseInstancesCreate(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapDatabaseInstances()
            .define("databaseServer")
            .withRegion("eastus")
            .withExistingSapVirtualInstance("test-rg", "X00")
            .withTags(mapOf())
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

### SapDatabaseInstances_Delete

```java
/** Samples for SapDatabaseInstances Delete. */
public final class SapDatabaseInstancesDeleteSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapdatabaseinstances/SAPDatabaseInstances_Delete.json
     */
    /**
     * Sample code: SAPDatabaseInstances_Delete.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPDatabaseInstancesDelete(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapDatabaseInstances().delete("test-rg", "X00", "databaseServer", com.azure.core.util.Context.NONE);
    }
}
```

### SapDatabaseInstances_Get

```java
/** Samples for SapDatabaseInstances Get. */
public final class SapDatabaseInstancesGetSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapdatabaseinstances/SAPDatabaseInstances_Get.json
     */
    /**
     * Sample code: SAPDatabaseInstances_Get.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPDatabaseInstancesGet(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapDatabaseInstances()
            .getWithResponse("test-rg", "X00", "databaseServer", com.azure.core.util.Context.NONE);
    }
}
```

### SapDatabaseInstances_List

```java
/** Samples for SapDatabaseInstances List. */
public final class SapDatabaseInstancesListSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapdatabaseinstances/SAPDatabaseInstances_List.json
     */
    /**
     * Sample code: SAPDatabaseInstances_List.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPDatabaseInstancesList(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapDatabaseInstances().list("test-rg", "X00", com.azure.core.util.Context.NONE);
    }
}
```

### SapDatabaseInstances_StartInstance

```java
import com.azure.resourcemanager.workloads.models.StartRequest;

/** Samples for SapDatabaseInstances StartInstance. */
public final class SapDatabaseInstancesStartInstanceSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapdatabaseinstances/SAPDatabaseInstances_StartInstance.json
     */
    /**
     * Sample code: Start the database instance of the SAP system.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void startTheDatabaseInstanceOfTheSAPSystem(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapDatabaseInstances().startInstance("test-rg", "X00", "db0", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapdatabaseinstances/SAPDatabaseInstances_StartInstance_WithInfraOperations.json
     */
    /**
     * Sample code: Start Virtual Machine and the database instance of the SAP system on it.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void startVirtualMachineAndTheDatabaseInstanceOfTheSAPSystemOnIt(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapDatabaseInstances()
            .startInstance(
                "test-rg", "X00", "db0", new StartRequest().withStartVm(true), com.azure.core.util.Context.NONE);
    }
}
```

### SapDatabaseInstances_StopInstance

```java
import com.azure.resourcemanager.workloads.models.StopRequest;

/** Samples for SapDatabaseInstances StopInstance. */
public final class SapDatabaseInstancesStopInstanceSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapdatabaseinstances/SAPDatabaseInstances_StopInstance.json
     */
    /**
     * Sample code: Stop the database instance of the SAP system.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void stopTheDatabaseInstanceOfTheSAPSystem(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapDatabaseInstances()
            .stopInstance(
                "test-rg",
                "X00",
                "db0",
                new StopRequest().withSoftStopTimeoutSeconds(0L),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapdatabaseinstances/SAPDatabaseInstances_StopInstance_WithInfraOperations.json
     */
    /**
     * Sample code: Stop the database instance of the SAP system and the underlying Virtual Machine(s).
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void stopTheDatabaseInstanceOfTheSAPSystemAndTheUnderlyingVirtualMachineS(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapDatabaseInstances()
            .stopInstance(
                "test-rg",
                "X00",
                "db0",
                new StopRequest().withSoftStopTimeoutSeconds(0L).withDeallocateVm(true),
                com.azure.core.util.Context.NONE);
    }
}
```

### SapDatabaseInstances_Update

```java
import com.azure.resourcemanager.workloads.models.SapDatabaseInstance;
import java.util.HashMap;
import java.util.Map;

/** Samples for SapDatabaseInstances Update. */
public final class SapDatabaseInstancesUpdateSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapdatabaseinstances/SAPDatabaseInstances_Update.json
     */
    /**
     * Sample code: SAPDatabaseInstances_Update.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPDatabaseInstancesUpdate(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        SapDatabaseInstance resource =
            manager
                .sapDatabaseInstances()
                .getWithResponse("test-rg", "X00", "databaseServer", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key1", "fakeTokenPlaceholder")).apply();
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

### SapVirtualInstances_Create

```java
import com.azure.resourcemanager.workloads.models.ApplicationServerConfiguration;
import com.azure.resourcemanager.workloads.models.ApplicationServerFullResourceNames;
import com.azure.resourcemanager.workloads.models.CentralServerConfiguration;
import com.azure.resourcemanager.workloads.models.CentralServerFullResourceNames;
import com.azure.resourcemanager.workloads.models.CreateAndMountFileShareConfiguration;
import com.azure.resourcemanager.workloads.models.DatabaseConfiguration;
import com.azure.resourcemanager.workloads.models.DatabaseServerFullResourceNames;
import com.azure.resourcemanager.workloads.models.DeploymentConfiguration;
import com.azure.resourcemanager.workloads.models.DeploymentWithOSConfiguration;
import com.azure.resourcemanager.workloads.models.DiscoveryConfiguration;
import com.azure.resourcemanager.workloads.models.DiskConfiguration;
import com.azure.resourcemanager.workloads.models.DiskSku;
import com.azure.resourcemanager.workloads.models.DiskSkuName;
import com.azure.resourcemanager.workloads.models.DiskVolumeConfiguration;
import com.azure.resourcemanager.workloads.models.ExternalInstallationSoftwareConfiguration;
import com.azure.resourcemanager.workloads.models.HighAvailabilityConfiguration;
import com.azure.resourcemanager.workloads.models.ImageReference;
import com.azure.resourcemanager.workloads.models.LinuxConfiguration;
import com.azure.resourcemanager.workloads.models.LoadBalancerResourceNames;
import com.azure.resourcemanager.workloads.models.ManagedRGConfiguration;
import com.azure.resourcemanager.workloads.models.ManagedResourcesNetworkAccessType;
import com.azure.resourcemanager.workloads.models.MountFileShareConfiguration;
import com.azure.resourcemanager.workloads.models.NetworkConfiguration;
import com.azure.resourcemanager.workloads.models.NetworkInterfaceResourceNames;
import com.azure.resourcemanager.workloads.models.OSProfile;
import com.azure.resourcemanager.workloads.models.OsSapConfiguration;
import com.azure.resourcemanager.workloads.models.SapDatabaseType;
import com.azure.resourcemanager.workloads.models.SapEnvironmentType;
import com.azure.resourcemanager.workloads.models.SapHighAvailabilityType;
import com.azure.resourcemanager.workloads.models.SapInstallWithoutOSConfigSoftwareConfiguration;
import com.azure.resourcemanager.workloads.models.SapProductType;
import com.azure.resourcemanager.workloads.models.SharedStorageResourceNames;
import com.azure.resourcemanager.workloads.models.SingleServerConfiguration;
import com.azure.resourcemanager.workloads.models.SkipFileShareConfiguration;
import com.azure.resourcemanager.workloads.models.SshConfiguration;
import com.azure.resourcemanager.workloads.models.SshKeyPair;
import com.azure.resourcemanager.workloads.models.SshPublicKey;
import com.azure.resourcemanager.workloads.models.StorageConfiguration;
import com.azure.resourcemanager.workloads.models.ThreeTierConfiguration;
import com.azure.resourcemanager.workloads.models.ThreeTierFullResourceNames;
import com.azure.resourcemanager.workloads.models.VirtualMachineConfiguration;
import com.azure.resourcemanager.workloads.models.VirtualMachineResourceNames;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for SapVirtualInstances Create. */
public final class SapVirtualInstancesCreateSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Install_Distributed.json
     */
    /**
     * Sample code: Install SAP Software on Distributed System.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void installSAPSoftwareOnDistributedSystem(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus2")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("{{resourcegrp}}")
                            .withNetworkConfiguration(new NetworkConfiguration().withIsSecondaryIpEnabled(true))
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/8e17e36c-42e9-4cd5-a078-7b44883414e0/resourceGroups/test-rg/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/app")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E4ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP-HA")
                                                    .withSku("8.2")
                                                    .withVersion("8.2.2021091201"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("azureuser")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/8e17e36c-42e9-4cd5-a078-7b44883414e0/resourceGroups/test-rg/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/app")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E4ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP-HA")
                                                    .withSku("8.2")
                                                    .withVersion("8.2.2021091201"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("azureuser")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/8e17e36c-42e9-4cd5-a078-7b44883414e0/resourceGroups/test-rg/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/app")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP-HA")
                                                    .withSku("8.2")
                                                    .withVersion("8.2.2021091201"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("azureuser")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L)))
                    .withSoftwareConfiguration(
                        new SapInstallWithoutOSConfigSoftwareConfiguration()
                            .withBomUrl(
                                "https://teststorageaccount.blob.core.windows.net/sapbits/sapfiles/boms/S41909SPS03_v0011ms/S41909SPS03_v0011ms.yaml")
                            .withSapBitsStorageAccountId(
                                "/subscriptions/8e17e36c-42e9-4cd5-a078-7b44883414e0/resourceGroups/test-rg/providers/Microsoft.Storage/storageAccounts/teststorageaccount")
                            .withSoftwareVersion("SAP S/4HANA 1909 SPS 03"))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("sap.bpaas.com")))
            .withTags(mapOf("created by", "azureuser"))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_HA_AvZone.json
     */
    /**
     * Sample code: Create Infrastructure only for HA System with Availability Zone.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureOnlyForHASystemWithAvailabilityZone(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSsh(
                                                                new SshConfiguration()
                                                                    .withPublicKeys(
                                                                        Arrays
                                                                            .asList(
                                                                                new SshPublicKey()
                                                                                    .withKeyData(
                                                                                        "fakeTokenPlaceholder")))))))
                                    .withInstanceCount(2L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSsh(
                                                                new SshConfiguration()
                                                                    .withPublicKeys(
                                                                        Arrays
                                                                            .asList(
                                                                                new SshPublicKey()
                                                                                    .withKeyData(
                                                                                        "fakeTokenPlaceholder")))))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSsh(
                                                                new SshConfiguration()
                                                                    .withPublicKeys(
                                                                        Arrays
                                                                            .asList(
                                                                                new SshPublicKey()
                                                                                    .withKeyData(
                                                                                        "fakeTokenPlaceholder")))))))
                                    .withInstanceCount(2L))
                            .withHighAvailabilityConfig(
                                new HighAvailabilityConfiguration()
                                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_ZONE))))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_WithOSConfig_Distributed.json
     */
    /**
     * Sample code: Create Infrastructure with OS configuration for Distributed System (Recommended).
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithOSConfigurationForDistributedSystemRecommended(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L)))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_DetectInstallation_SingleServer.json
     */
    /**
     * Sample code: Detect SAP Software Installation on a Single Server System.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void detectSAPSoftwareInstallationOnASingleServerSystem(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.NON_PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new SingleServerConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withNetworkConfiguration(new NetworkConfiguration().withIsSecondaryIpEnabled(true))
                            .withDatabaseType(SapDatabaseType.HANA)
                            .withSubnetId(
                                "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                            .withVirtualMachineConfiguration(
                                new VirtualMachineConfiguration()
                                    .withVmSize("Standard_E32ds_v4")
                                    .withImageReference(
                                        new ImageReference()
                                            .withPublisher("RedHat")
                                            .withOffer("RHEL-SAP-HA")
                                            .withSku("84sapha-gen2")
                                            .withVersion("latest"))
                                    .withOsProfile(
                                        new OSProfile()
                                            .withAdminUsername("{your-username}")
                                            .withOsConfiguration(
                                                new LinuxConfiguration()
                                                    .withDisablePasswordAuthentication(true)
                                                    .withSshKeyPair(
                                                        new SshKeyPair()
                                                            .withPublicKey("fakeTokenPlaceholder")
                                                            .withPrivateKey("fakeTokenPlaceholder"))))))
                    .withSoftwareConfiguration(
                        new ExternalInstallationSoftwareConfiguration()
                            .withCentralServerVmId(
                                "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Compute/virtualMachines/sapq20scsvm0"))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_WithOSConfig_WithTrustedAccess.json
     */
    /**
     * Sample code: Create Infrastructure (with OS configuration) with trusted access enabled.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithOSConfigurationWithTrustedAccessEnabled(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L)))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .withManagedResourcesNetworkAccessType(ManagedResourcesNetworkAccessType.PRIVATE)
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_DiskDetails_HA_AvSet.json
     */
    /**
     * Sample code: Create Infrastructure with Disk and OS configuration for HA System with Availability Set
     * (Recommended).
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithDiskAndOSConfigurationForHASystemWithAvailabilitySetRecommended(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/dindurkhya-e2etesting/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/dindurkhya-e2etesting/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/dindurkhya-e2etesting/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L)
                                    .withDiskConfiguration(
                                        new DiskConfiguration()
                                            .withDiskVolumeConfigurations(
                                                mapOf(
                                                    "backup",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(2L)
                                                        .withSizeGB(256L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_LRS)),
                                                    "hana/data",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(4L)
                                                        .withSizeGB(128L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS)),
                                                    "hana/log",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(3L)
                                                        .withSizeGB(128L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS)),
                                                    "hana/shared",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(1L)
                                                        .withSizeGB(256L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_LRS)),
                                                    "os",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(1L)
                                                        .withSizeGB(64L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_LRS)),
                                                    "usr/sap",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(1L)
                                                        .withSizeGB(128L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS))))))
                            .withHighAvailabilityConfig(
                                new HighAvailabilityConfiguration()
                                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_SET)))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_Discover_TrustedAccessEnable.json
     */
    /**
     * Sample code: Register with trusted access enabled.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void registerWithTrustedAccessEnabled(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("northeurope")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.NON_PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DiscoveryConfiguration()
                    .withCentralServerVmId(
                        "/subscriptions/8e17e36c-42e9-4cd5-a078-7b44883414e0/resourceGroups/test-rg/providers/Microsoft.Compute/virtualMachines/sapq20scsvm0"))
            .withTags(mapOf("createdby", "abc@microsoft.com", "test", "abc"))
            .withManagedResourcesNetworkAccessType(ManagedResourcesNetworkAccessType.PRIVATE)
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_Custom_Image.json
     */
    /**
     * Sample code: Create Infrastructure (with OS configuration) with Azure Compute Gallery Image.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithOSConfigurationWithAzureComputeGalleryImage(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withId(
                                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Compute/galleries/testgallery/images/rhelimagetest/versions/0.0.1"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSsh(
                                                                new SshConfiguration()
                                                                    .withPublicKeys(
                                                                        Arrays
                                                                            .asList(
                                                                                new SshPublicKey()
                                                                                    .withKeyData(
                                                                                        "fakeTokenPlaceholder")))))))
                                    .withInstanceCount(2L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withId(
                                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Compute/galleries/testgallery/images/rhelimagetest/versions/0.0.1"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSsh(
                                                                new SshConfiguration()
                                                                    .withPublicKeys(
                                                                        Arrays
                                                                            .asList(
                                                                                new SshPublicKey()
                                                                                    .withKeyData(
                                                                                        "fakeTokenPlaceholder")))))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withId(
                                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Compute/galleries/testgallery/images/rhelimagetest/versions/0.0.1"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSsh(
                                                                new SshConfiguration()
                                                                    .withPublicKeys(
                                                                        Arrays
                                                                            .asList(
                                                                                new SshPublicKey()
                                                                                    .withKeyData(
                                                                                        "fakeTokenPlaceholder")))))))
                                    .withInstanceCount(2L))
                            .withHighAvailabilityConfig(
                                new HighAvailabilityConfiguration()
                                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_ZONE))))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_HA_AvSet.json
     */
    /**
     * Sample code: Create Infrastructure only for HA System with Availability Set.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureOnlyForHASystemWithAvailabilitySet(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSsh(
                                                                new SshConfiguration()
                                                                    .withPublicKeys(
                                                                        Arrays
                                                                            .asList(
                                                                                new SshPublicKey()
                                                                                    .withKeyData(
                                                                                        "fakeTokenPlaceholder")))))))
                                    .withInstanceCount(2L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSsh(
                                                                new SshConfiguration()
                                                                    .withPublicKeys(
                                                                        Arrays
                                                                            .asList(
                                                                                new SshPublicKey()
                                                                                    .withKeyData(
                                                                                        "fakeTokenPlaceholder")))))))
                                    .withInstanceCount(5L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSsh(
                                                                new SshConfiguration()
                                                                    .withPublicKeys(
                                                                        Arrays
                                                                            .asList(
                                                                                new SshPublicKey()
                                                                                    .withKeyData(
                                                                                        "fakeTokenPlaceholder")))))))
                                    .withInstanceCount(2L))
                            .withHighAvailabilityConfig(
                                new HighAvailabilityConfiguration()
                                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_SET))))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_DetectInstallation_HA_AvZone.json
     */
    /**
     * Sample code: Detect SAP Software Installation on an HA System with Availability Zone.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void detectSAPSoftwareInstallationOnAnHASystemWithAvailabilityZone(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP-HA")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP-HA")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP-HA")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withHighAvailabilityConfig(
                                new HighAvailabilityConfiguration()
                                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_ZONE)))
                    .withSoftwareConfiguration(
                        new ExternalInstallationSoftwareConfiguration()
                            .withCentralServerVmId(
                                "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Compute/virtualMachines/sapq20scsvm0"))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_SingleServer.json
     */
    /**
     * Sample code: Create Infrastructure only for Single Server System.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureOnlyForSingleServerSystem(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.NON_PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new SingleServerConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withNetworkConfiguration(new NetworkConfiguration().withIsSecondaryIpEnabled(true))
                            .withDatabaseType(SapDatabaseType.HANA)
                            .withSubnetId(
                                "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                            .withVirtualMachineConfiguration(
                                new VirtualMachineConfiguration()
                                    .withVmSize("Standard_E32ds_v4")
                                    .withImageReference(
                                        new ImageReference()
                                            .withPublisher("RedHat")
                                            .withOffer("RHEL-SAP")
                                            .withSku("84sapha-gen2")
                                            .withVersion("latest"))
                                    .withOsProfile(
                                        new OSProfile()
                                            .withAdminUsername("{your-username}")
                                            .withOsConfiguration(
                                                new LinuxConfiguration()
                                                    .withDisablePasswordAuthentication(true)
                                                    .withSsh(
                                                        new SshConfiguration()
                                                            .withPublicKeys(
                                                                Arrays
                                                                    .asList(
                                                                        new SshPublicKey()
                                                                            .withKeyData("fakeTokenPlaceholder")))))))))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_Distributed_CreateTransport.json
     */
    /**
     * Sample code: Create Infrastructure with a new SAP Transport Directory Fileshare.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithANewSAPTransportDirectoryFileshare(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L))
                            .withStorageConfiguration(
                                new StorageConfiguration()
                                    .withTransportFileShareConfiguration(
                                        new CreateAndMountFileShareConfiguration()
                                            .withResourceGroup("rgName")
                                            .withStorageAccountName("storageName"))))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_Discover.json
     */
    /**
     * Sample code: Register existing SAP system as Virtual Instance for SAP solutions.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void registerExistingSAPSystemAsVirtualInstanceForSAPSolutions(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("northeurope")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.NON_PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DiscoveryConfiguration()
                    .withCentralServerVmId(
                        "/subscriptions/8e17e36c-42e9-4cd5-a078-7b44883414e0/resourceGroups/test-rg/providers/Microsoft.Compute/virtualMachines/sapq20scsvm0"))
            .withTags(mapOf("createdby", "abc@microsoft.com", "test", "abc"))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_CustomFullResourceNames_Distributed.json
     */
    /**
     * Sample code: Create Infrastructure (with OS configuration) with custom resource names for Distributed System.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithOSConfigurationWithCustomResourceNamesForDistributedSystem(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L))
                            .withCustomResourceNames(
                                new ThreeTierFullResourceNames()
                                    .withCentralServer(
                                        new CentralServerFullResourceNames()
                                            .withVirtualMachines(
                                                Arrays
                                                    .asList(
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("ascsvm")
                                                            .withHostname("ascshostName")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("ascsnic")))
                                                            .withOsDiskName("ascsosdisk")
                                                            .withDataDiskNames(
                                                                mapOf("default", Arrays.asList("ascsdisk0"))))))
                                    .withApplicationServer(
                                        new ApplicationServerFullResourceNames()
                                            .withVirtualMachines(
                                                Arrays
                                                    .asList(
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("appvm0")
                                                            .withHostname("apphostName0")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("appnic0")))
                                                            .withOsDiskName("app0osdisk")
                                                            .withDataDiskNames(
                                                                mapOf("default", Arrays.asList("app0disk0"))),
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("appvm1")
                                                            .withHostname("apphostName1")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("appnic1")))
                                                            .withOsDiskName("app1osdisk")
                                                            .withDataDiskNames(
                                                                mapOf("default", Arrays.asList("app1disk0")))))
                                            .withAvailabilitySetName("appAvSet"))
                                    .withDatabaseServer(
                                        new DatabaseServerFullResourceNames()
                                            .withVirtualMachines(
                                                Arrays
                                                    .asList(
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("dbvm")
                                                            .withHostname("dbhostName")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("dbnic")))
                                                            .withOsDiskName("dbosdisk")
                                                            .withDataDiskNames(
                                                                mapOf(
                                                                    "hanaData",
                                                                    Arrays.asList("hanadata0", "hanadata1"),
                                                                    "hanaLog",
                                                                    Arrays.asList("hanalog0", "hanalog1", "hanalog2"),
                                                                    "hanaShared",
                                                                    Arrays.asList("hanashared0", "hanashared1"),
                                                                    "usrSap",
                                                                    Arrays.asList("usrsap0"))))))
                                    .withSharedStorage(
                                        new SharedStorageResourceNames()
                                            .withSharedStorageAccountName("storageacc")
                                            .withSharedStorageAccountPrivateEndPointName("peForxNFS"))))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .withManagedResourceGroupConfiguration(
                new ManagedRGConfiguration().withName("mrg-X00-8e17e36c-42e9-4cd5-a078-7b44883414e0"))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_CustomFullResourceNames_SingleServer.json
     */
    /**
     * Sample code: Create Infrastructure (with OS configuration) with custom resource names for Single Server System.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithOSConfigurationWithCustomResourceNamesForSingleServerSystem(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.NON_PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new SingleServerConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withNetworkConfiguration(new NetworkConfiguration().withIsSecondaryIpEnabled(true))
                            .withDatabaseType(SapDatabaseType.HANA)
                            .withSubnetId(
                                "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                            .withVirtualMachineConfiguration(
                                new VirtualMachineConfiguration()
                                    .withVmSize("Standard_E32ds_v4")
                                    .withImageReference(
                                        new ImageReference()
                                            .withPublisher("RedHat")
                                            .withOffer("RHEL-SAP")
                                            .withSku("84sapha-gen2")
                                            .withVersion("latest"))
                                    .withOsProfile(
                                        new OSProfile()
                                            .withAdminUsername("{your-username}")
                                            .withOsConfiguration(
                                                new LinuxConfiguration()
                                                    .withDisablePasswordAuthentication(true)
                                                    .withSshKeyPair(
                                                        new SshKeyPair()
                                                            .withPublicKey("fakeTokenPlaceholder")
                                                            .withPrivateKey("fakeTokenPlaceholder"))))))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .withManagedResourceGroupConfiguration(
                new ManagedRGConfiguration().withName("mrg-X00-8e17e36c-42e9-4cd5-a078-7b44883414e0"))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_CustomFullResourceNames_HA_AvZone.json
     */
    /**
     * Sample code: Create Infrastructure (with OS configuration) with custom resource names for HA system with
     * Availability Zone.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithOSConfigurationWithCustomResourceNamesForHASystemWithAvailabilityZone(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withHighAvailabilityConfig(
                                new HighAvailabilityConfiguration()
                                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_ZONE))
                            .withCustomResourceNames(
                                new ThreeTierFullResourceNames()
                                    .withCentralServer(
                                        new CentralServerFullResourceNames()
                                            .withVirtualMachines(
                                                Arrays
                                                    .asList(
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("ascsvm")
                                                            .withHostname("ascshostName")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("ascsnic")))
                                                            .withOsDiskName("ascsosdisk"),
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("ersvm")
                                                            .withHostname("ershostName")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("ersnic")))
                                                            .withOsDiskName("ersosdisk")))
                                            .withLoadBalancer(
                                                new LoadBalancerResourceNames()
                                                    .withLoadBalancerName("ascslb")
                                                    .withFrontendIpConfigurationNames(
                                                        Arrays.asList("ascsip0", "ersip0"))
                                                    .withBackendPoolNames(Arrays.asList("ascsBackendPool"))
                                                    .withHealthProbeNames(
                                                        Arrays.asList("ascsHealthProbe", "ersHealthProbe"))))
                                    .withApplicationServer(
                                        new ApplicationServerFullResourceNames()
                                            .withVirtualMachines(
                                                Arrays
                                                    .asList(
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("appvm0")
                                                            .withHostname("apphostName0")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("appnic0")))
                                                            .withOsDiskName("app0osdisk")
                                                            .withDataDiskNames(
                                                                mapOf("default", Arrays.asList("app0disk0"))),
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("appvm1")
                                                            .withHostname("apphostName1")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("appnic1")))
                                                            .withOsDiskName("app1osdisk")
                                                            .withDataDiskNames(
                                                                mapOf("default", Arrays.asList("app1disk0"))))))
                                    .withDatabaseServer(
                                        new DatabaseServerFullResourceNames()
                                            .withVirtualMachines(
                                                Arrays
                                                    .asList(
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("dbvmpr")
                                                            .withHostname("dbprhostName")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("dbprnic")))
                                                            .withOsDiskName("dbprosdisk")
                                                            .withDataDiskNames(
                                                                mapOf(
                                                                    "hanaData",
                                                                    Arrays.asList("hanadatapr0", "hanadatapr1"),
                                                                    "hanaLog",
                                                                    Arrays
                                                                        .asList(
                                                                            "hanalogpr0", "hanalogpr1", "hanalogpr2"),
                                                                    "hanaShared",
                                                                    Arrays.asList("hanasharedpr0", "hanasharedpr1"),
                                                                    "usrSap",
                                                                    Arrays.asList("usrsappr0"))),
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("dbvmsr")
                                                            .withHostname("dbsrhostName")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("dbsrnic")))
                                                            .withOsDiskName("dbsrosdisk")
                                                            .withDataDiskNames(
                                                                mapOf(
                                                                    "hanaData",
                                                                    Arrays.asList("hanadatasr0", "hanadatasr1"),
                                                                    "hanaLog",
                                                                    Arrays
                                                                        .asList(
                                                                            "hanalogsr0", "hanalogsr1", "hanalogsr2"),
                                                                    "hanaShared",
                                                                    Arrays.asList("hanasharedsr0", "hanasharedsr1"),
                                                                    "usrSap",
                                                                    Arrays.asList("usrsapsr0")))))
                                            .withLoadBalancer(
                                                new LoadBalancerResourceNames()
                                                    .withLoadBalancerName("dblb")
                                                    .withFrontendIpConfigurationNames(Arrays.asList("dbip"))
                                                    .withBackendPoolNames(Arrays.asList("dbBackendPool"))
                                                    .withHealthProbeNames(Arrays.asList("dbHealthProbe"))))
                                    .withSharedStorage(
                                        new SharedStorageResourceNames()
                                            .withSharedStorageAccountName("storageacc")
                                            .withSharedStorageAccountPrivateEndPointName("peForxNFS"))))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .withManagedResourceGroupConfiguration(
                new ManagedRGConfiguration().withName("mrg-X00-8e17e36c-42e9-4cd5-a078-7b44883414e0"))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_Distributed_MountTransport.json
     */
    /**
     * Sample code: Create Infrastructure with an existing SAP Transport Directory Fileshare.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithAnExistingSAPTransportDirectoryFileshare(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L))
                            .withStorageConfiguration(
                                new StorageConfiguration()
                                    .withTransportFileShareConfiguration(
                                        new MountFileShareConfiguration()
                                            .withId(
                                                "/subscriptions/49d64d54-e888-4c46-a868-1936802b762c/resourceGroups/testrg/providers/Microsoft.Network/privateEndpoints/endpoint")
                                            .withPrivateEndpointId(
                                                "/subscriptions/49d64d54-e888-4c46-a868-1936802b762c/resourceGroups/testrg/providers/Microsoft.Network/privateEndpoints/endpoint"))))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_CustomFullResourceNames_HA_AvSet.json
     */
    /**
     * Sample code: Create Infrastructure (with OS configuration) with custom resource names for HA System with
     * Availability Set.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithOSConfigurationWithCustomResourceNamesForHASystemWithAvailabilitySet(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withHighAvailabilityConfig(
                                new HighAvailabilityConfiguration()
                                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_SET))
                            .withCustomResourceNames(
                                new ThreeTierFullResourceNames()
                                    .withCentralServer(
                                        new CentralServerFullResourceNames()
                                            .withVirtualMachines(
                                                Arrays
                                                    .asList(
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("ascsvm")
                                                            .withHostname("ascshostName")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("ascsnic")))
                                                            .withOsDiskName("ascsosdisk"),
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("ersvm")
                                                            .withHostname("ershostName")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("ersnic")))
                                                            .withOsDiskName("ersosdisk")))
                                            .withAvailabilitySetName("csAvSet")
                                            .withLoadBalancer(
                                                new LoadBalancerResourceNames()
                                                    .withLoadBalancerName("ascslb")
                                                    .withFrontendIpConfigurationNames(
                                                        Arrays.asList("ascsip0", "ersip0"))
                                                    .withBackendPoolNames(Arrays.asList("ascsBackendPool"))
                                                    .withHealthProbeNames(
                                                        Arrays.asList("ascsHealthProbe", "ersHealthProbe"))))
                                    .withApplicationServer(
                                        new ApplicationServerFullResourceNames()
                                            .withVirtualMachines(
                                                Arrays
                                                    .asList(
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("appvm0")
                                                            .withHostname("apphostName0")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("appnic0")))
                                                            .withOsDiskName("app0osdisk")
                                                            .withDataDiskNames(
                                                                mapOf("default", Arrays.asList("app0disk0"))),
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("appvm1")
                                                            .withHostname("apphostName1")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("appnic1")))
                                                            .withOsDiskName("app1osdisk")
                                                            .withDataDiskNames(
                                                                mapOf("default", Arrays.asList("app1disk0")))))
                                            .withAvailabilitySetName("appAvSet"))
                                    .withDatabaseServer(
                                        new DatabaseServerFullResourceNames()
                                            .withVirtualMachines(
                                                Arrays
                                                    .asList(
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("dbvmpr")
                                                            .withHostname("dbprhostName")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("dbprnic")))
                                                            .withOsDiskName("dbprosdisk")
                                                            .withDataDiskNames(
                                                                mapOf(
                                                                    "hanaData",
                                                                    Arrays.asList("hanadatapr0", "hanadatapr1"),
                                                                    "hanaLog",
                                                                    Arrays
                                                                        .asList(
                                                                            "hanalogpr0", "hanalogpr1", "hanalogpr2"),
                                                                    "hanaShared",
                                                                    Arrays.asList("hanasharedpr0", "hanasharedpr1"),
                                                                    "usrSap",
                                                                    Arrays.asList("usrsappr0"))),
                                                        new VirtualMachineResourceNames()
                                                            .withVmName("dbvmsr")
                                                            .withHostname("dbsrhostName")
                                                            .withNetworkInterfaces(
                                                                Arrays
                                                                    .asList(
                                                                        new NetworkInterfaceResourceNames()
                                                                            .withNetworkInterfaceName("dbsrnic")))
                                                            .withOsDiskName("dbsrosdisk")
                                                            .withDataDiskNames(
                                                                mapOf(
                                                                    "hanaData",
                                                                    Arrays.asList("hanadatasr0", "hanadatasr1"),
                                                                    "hanaLog",
                                                                    Arrays
                                                                        .asList(
                                                                            "hanalogsr0", "hanalogsr1", "hanalogsr2"),
                                                                    "hanaShared",
                                                                    Arrays.asList("hanasharedsr0", "hanasharedsr1"),
                                                                    "usrSap",
                                                                    Arrays.asList("usrsapsr0")))))
                                            .withAvailabilitySetName("dbAvSet")
                                            .withLoadBalancer(
                                                new LoadBalancerResourceNames()
                                                    .withLoadBalancerName("dblb")
                                                    .withFrontendIpConfigurationNames(Arrays.asList("dbip"))
                                                    .withBackendPoolNames(Arrays.asList("dbBackendPool"))
                                                    .withHealthProbeNames(Arrays.asList("dbHealthProbe"))))
                                    .withSharedStorage(
                                        new SharedStorageResourceNames()
                                            .withSharedStorageAccountName("storageacc")
                                            .withSharedStorageAccountPrivateEndPointName("peForxNFS"))))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .withManagedResourceGroupConfiguration(
                new ManagedRGConfiguration().withName("mrg-X00-8e17e36c-42e9-4cd5-a078-7b44883414e0"))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_WithOSConfig_HA_AvSet.json
     */
    /**
     * Sample code: Create Infrastructure with OS configuration for HA System with Availability Set (Recommended).
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithOSConfigurationForHASystemWithAvailabilitySetRecommended(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withHighAvailabilityConfig(
                                new HighAvailabilityConfiguration()
                                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_SET)))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_DiskDetails_Distributed.json
     */
    /**
     * Sample code: Create Infrastructure with Disk and OS configuration for Distributed System (Recommended).
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithDiskAndOSConfigurationForDistributedSystemRecommended(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/dindurkhya-e2etesting/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/dindurkhya-e2etesting/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/dindurkhya-e2etesting/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L)
                                    .withDiskConfiguration(
                                        new DiskConfiguration()
                                            .withDiskVolumeConfigurations(
                                                mapOf(
                                                    "backup",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(2L)
                                                        .withSizeGB(256L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_LRS)),
                                                    "hana/data",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(4L)
                                                        .withSizeGB(128L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS)),
                                                    "hana/log",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(3L)
                                                        .withSizeGB(128L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS)),
                                                    "hana/shared",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(1L)
                                                        .withSizeGB(256L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_LRS)),
                                                    "os",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(1L)
                                                        .withSizeGB(64L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_LRS)),
                                                    "usr/sap",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(1L)
                                                        .withSizeGB(128L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS)))))))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_DetectInstallation_Distributed.json
     */
    /**
     * Sample code: Detect SAP Software Installation on a Distributed System.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void detectSAPSoftwareInstallationOnADistributedSystem(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus2")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("{{resourcegrp}}")
                            .withNetworkConfiguration(new NetworkConfiguration().withIsSecondaryIpEnabled(true))
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/app")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E4ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP-HA")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("azureuser")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/app")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E4ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP-HA")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("azureuser")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/app")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP-HA")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("azureuser")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L)))
                    .withSoftwareConfiguration(
                        new ExternalInstallationSoftwareConfiguration()
                            .withCentralServerVmId(
                                "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Compute/virtualMachines/sapq20scsvm0"))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("sap.bpaas.com")))
            .withTags(mapOf("created by", "azureuser"))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_DetectInstallation_HA_AvSet.json
     */
    /**
     * Sample code: Detect SAP Software Installation on an HA System with Availability Set.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void detectSAPSoftwareInstallationOnAnHASystemWithAvailabilitySet(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP-HA")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP-HA")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP-HA")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withHighAvailabilityConfig(
                                new HighAvailabilityConfiguration()
                                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_SET)))
                    .withSoftwareConfiguration(
                        new ExternalInstallationSoftwareConfiguration()
                            .withCentralServerVmId(
                                "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Compute/virtualMachines/sapq20scsvm0"))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Install_SingleServer.json
     */
    /**
     * Sample code: Install SAP Software on Single Server System.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void installSAPSoftwareOnSingleServerSystem(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus2")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.NON_PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new SingleServerConfiguration()
                            .withAppResourceGroup("test-rg")
                            .withSubnetId(
                                "/subscriptions/8e17e36c-42e9-4cd5-a078-7b44883414e0/resourceGroups/test-rg/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/testsubnet")
                            .withVirtualMachineConfiguration(
                                new VirtualMachineConfiguration()
                                    .withVmSize("Standard_E32ds_v4")
                                    .withImageReference(
                                        new ImageReference()
                                            .withPublisher("SUSE")
                                            .withOffer("SLES-SAP")
                                            .withSku("12-sp4-gen2")
                                            .withVersion("2022.02.01"))
                                    .withOsProfile(
                                        new OSProfile()
                                            .withAdminUsername("azureappadmin")
                                            .withOsConfiguration(
                                                new LinuxConfiguration()
                                                    .withDisablePasswordAuthentication(true)
                                                    .withSshKeyPair(
                                                        new SshKeyPair()
                                                            .withPublicKey("fakeTokenPlaceholder")
                                                            .withPrivateKey("fakeTokenPlaceholder"))))))
                    .withSoftwareConfiguration(
                        new SapInstallWithoutOSConfigSoftwareConfiguration()
                            .withBomUrl(
                                "https://teststorageaccount.blob.core.windows.net/sapbits/sapfiles/boms/S41909SPS03_v0011ms/S41909SPS03_v0011ms.yaml")
                            .withSapBitsStorageAccountId(
                                "/subscriptions/8e17e36c-42e9-4cd5-a078-7b44883414e0/resourceGroups/test-rg/providers/Microsoft.Storage/storageAccounts/teststorageaccount")
                            .withSoftwareVersion("SAP S/4HANA 1909 SPS 03"))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("sap.bpaas.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_Distributed.json
     */
    /**
     * Sample code: Create Infrastructure only for Distributed System.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureOnlyForDistributedSystem(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSsh(
                                                                new SshConfiguration()
                                                                    .withPublicKeys(
                                                                        Arrays
                                                                            .asList(
                                                                                new SshPublicKey()
                                                                                    .withKeyData(
                                                                                        "fakeTokenPlaceholder")))))))
                                    .withInstanceCount(1L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSsh(
                                                                new SshConfiguration()
                                                                    .withPublicKeys(
                                                                        Arrays
                                                                            .asList(
                                                                                new SshPublicKey()
                                                                                    .withKeyData(
                                                                                        "fakeTokenPlaceholder")))))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSsh(
                                                                new SshConfiguration()
                                                                    .withPublicKeys(
                                                                        Arrays
                                                                            .asList(
                                                                                new SshPublicKey()
                                                                                    .withKeyData(
                                                                                        "fakeTokenPlaceholder")))))))
                                    .withInstanceCount(1L))))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_Discover_CustomMrgStorageAccountName.json
     */
    /**
     * Sample code: Register existing SAP system as Virtual Instance for SAP solutions with optional customizations.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void registerExistingSAPSystemAsVirtualInstanceForSAPSolutionsWithOptionalCustomizations(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("northeurope")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.NON_PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DiscoveryConfiguration()
                    .withCentralServerVmId(
                        "/subscriptions/8e17e36c-42e9-4cd5-a078-7b44883414e0/resourceGroups/test-rg/providers/Microsoft.Compute/virtualMachines/sapq20scsvm0")
                    .withManagedRgStorageAccountName("q20saacssgrs"))
            .withTags(mapOf("createdby", "abc@microsoft.com", "test", "abc"))
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_Distributed_SkipTransport.json
     */
    /**
     * Sample code: Create Infrastructure without a SAP Transport Directory Fileshare.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithoutASAPTransportDirectoryFileshare(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(1L))
                            .withStorageConfiguration(
                                new StorageConfiguration()
                                    .withTransportFileShareConfiguration(new SkipFileShareConfiguration())))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_WithOSConfig_SingleServer.json
     */
    /**
     * Sample code: Create Infrastructure with OS configuration for Single Server System (Recommended).
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithOSConfigurationForSingleServerSystemRecommended(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.NON_PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new SingleServerConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withNetworkConfiguration(new NetworkConfiguration().withIsSecondaryIpEnabled(true))
                            .withDatabaseType(SapDatabaseType.HANA)
                            .withSubnetId(
                                "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                            .withVirtualMachineConfiguration(
                                new VirtualMachineConfiguration()
                                    .withVmSize("Standard_E32ds_v4")
                                    .withImageReference(
                                        new ImageReference()
                                            .withPublisher("RedHat")
                                            .withOffer("RHEL-SAP")
                                            .withSku("84sapha-gen2")
                                            .withVersion("latest"))
                                    .withOsProfile(
                                        new OSProfile()
                                            .withAdminUsername("{your-username}")
                                            .withOsConfiguration(
                                                new LinuxConfiguration()
                                                    .withDisablePasswordAuthentication(true)
                                                    .withSshKeyPair(
                                                        new SshKeyPair()
                                                            .withPublicKey("fakeTokenPlaceholder")
                                                            .withPrivateKey("fakeTokenPlaceholder"))))))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_DiskDetails_HA_AvZone.json
     */
    /**
     * Sample code: Create Infrastructure with Disk and OS configuration for HA System with Availability Zone
     * (Recommended).
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithDiskAndOSConfigurationForHASystemWithAvailabilityZoneRecommended(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/dindurkhya-e2etesting/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/dindurkhya-e2etesting/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/dindurkhya-e2etesting/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L)
                                    .withDiskConfiguration(
                                        new DiskConfiguration()
                                            .withDiskVolumeConfigurations(
                                                mapOf(
                                                    "backup",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(2L)
                                                        .withSizeGB(256L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_LRS)),
                                                    "hana/data",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(4L)
                                                        .withSizeGB(128L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS)),
                                                    "hana/log",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(3L)
                                                        .withSizeGB(128L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS)),
                                                    "hana/shared",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(1L)
                                                        .withSizeGB(256L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_LRS)),
                                                    "os",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(1L)
                                                        .withSizeGB(64L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_LRS)),
                                                    "usr/sap",
                                                    new DiskVolumeConfiguration()
                                                        .withCount(1L)
                                                        .withSizeGB(128L)
                                                        .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS))))))
                            .withHighAvailabilityConfig(
                                new HighAvailabilityConfiguration()
                                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_ZONE)))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_WithOSConfig_HA_AvZone.json
     */
    /**
     * Sample code: Create Infrastructure with OS configuration for HA System with Availability Zone (Recommended).
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithOSConfigurationForHASystemWithAvailabilityZoneRecommended(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new ThreeTierConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withCentralServer(
                                new CentralServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E16ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withApplicationServer(
                                new ApplicationServerConfiguration()
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_E32ds_v4")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(6L))
                            .withDatabaseServer(
                                new DatabaseConfiguration()
                                    .withDatabaseType(SapDatabaseType.HANA)
                                    .withSubnetId(
                                        "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/test-rg/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/dbsubnet")
                                    .withVirtualMachineConfiguration(
                                        new VirtualMachineConfiguration()
                                            .withVmSize("Standard_M32ts")
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("RedHat")
                                                    .withOffer("RHEL-SAP")
                                                    .withSku("84sapha-gen2")
                                                    .withVersion("latest"))
                                            .withOsProfile(
                                                new OSProfile()
                                                    .withAdminUsername("{your-username}")
                                                    .withOsConfiguration(
                                                        new LinuxConfiguration()
                                                            .withDisablePasswordAuthentication(true)
                                                            .withSshKeyPair(
                                                                new SshKeyPair()
                                                                    .withPublicKey("fakeTokenPlaceholder")
                                                                    .withPrivateKey("fakeTokenPlaceholder")))))
                                    .withInstanceCount(2L))
                            .withHighAvailabilityConfig(
                                new HighAvailabilityConfiguration()
                                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_ZONE)))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
            .create();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Create_DiskDetails_SingleServer.json
     */
    /**
     * Sample code: Create Infrastructure with Disk and OS configurations for Single Server System (Recommended).
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void createInfrastructureWithDiskAndOSConfigurationsForSingleServerSystemRecommended(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .define("X00")
            .withRegion("eastus")
            .withExistingResourceGroup("test-rg")
            .withEnvironment(SapEnvironmentType.NON_PROD)
            .withSapProduct(SapProductType.S4HANA)
            .withConfiguration(
                new DeploymentWithOSConfiguration()
                    .withAppLocation("eastus")
                    .withInfrastructureConfiguration(
                        new SingleServerConfiguration()
                            .withAppResourceGroup("X00-RG")
                            .withNetworkConfiguration(new NetworkConfiguration().withIsSecondaryIpEnabled(true))
                            .withDatabaseType(SapDatabaseType.HANA)
                            .withSubnetId(
                                "/subscriptions/49d64d54-e966-4c46-a868-1999802b762c/resourceGroups/dindurkhya-e2etesting/providers/Microsoft.Networks/virtualNetworks/test-vnet/subnets/appsubnet")
                            .withVirtualMachineConfiguration(
                                new VirtualMachineConfiguration()
                                    .withVmSize("Standard_E32ds_v4")
                                    .withImageReference(
                                        new ImageReference()
                                            .withPublisher("RedHat")
                                            .withOffer("RHEL-SAP")
                                            .withSku("84sapha-gen2")
                                            .withVersion("latest"))
                                    .withOsProfile(
                                        new OSProfile()
                                            .withAdminUsername("{your-username}")
                                            .withOsConfiguration(
                                                new LinuxConfiguration()
                                                    .withDisablePasswordAuthentication(true)
                                                    .withSshKeyPair(
                                                        new SshKeyPair()
                                                            .withPublicKey("fakeTokenPlaceholder")
                                                            .withPrivateKey("fakeTokenPlaceholder")))))
                            .withDbDiskConfiguration(
                                new DiskConfiguration()
                                    .withDiskVolumeConfigurations(
                                        mapOf(
                                            "backup",
                                            new DiskVolumeConfiguration()
                                                .withCount(2L)
                                                .withSizeGB(256L)
                                                .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_LRS)),
                                            "hana/data",
                                            new DiskVolumeConfiguration()
                                                .withCount(4L)
                                                .withSizeGB(128L)
                                                .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS)),
                                            "hana/log",
                                            new DiskVolumeConfiguration()
                                                .withCount(3L)
                                                .withSizeGB(128L)
                                                .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS)),
                                            "hana/shared",
                                            new DiskVolumeConfiguration()
                                                .withCount(1L)
                                                .withSizeGB(256L)
                                                .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_LRS)),
                                            "os",
                                            new DiskVolumeConfiguration()
                                                .withCount(1L)
                                                .withSizeGB(64L)
                                                .withSku(new DiskSku().withName(DiskSkuName.STANDARD_SSD_LRS)),
                                            "usr/sap",
                                            new DiskVolumeConfiguration()
                                                .withCount(1L)
                                                .withSizeGB(128L)
                                                .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS))))))
                    .withOsSapConfiguration(new OsSapConfiguration().withSapFqdn("xyz.test.com")))
            .withTags(mapOf())
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

### SapVirtualInstances_Delete

```java
/** Samples for SapVirtualInstances Delete. */
public final class SapVirtualInstancesDeleteSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Delete.json
     */
    /**
     * Sample code: SAPVirtualInstances_Delete.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPVirtualInstancesDelete(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapVirtualInstances().delete("test-rg", "X00", com.azure.core.util.Context.NONE);
    }
}
```

### SapVirtualInstances_GetByResourceGroup

```java
/** Samples for SapVirtualInstances GetByResourceGroup. */
public final class SapVirtualInstancesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Get.json
     */
    /**
     * Sample code: SAPVirtualInstances_Get.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPVirtualInstancesGet(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .getByResourceGroupWithResponse("test-rg", "X00", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Get_ACSSInstallationBlocked.json
     */
    /**
     * Sample code: SAPVirtualInstances Get With ACSS Installation Blocked.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPVirtualInstancesGetWithACSSInstallationBlocked(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .getByResourceGroupWithResponse("test-rg", "X00", com.azure.core.util.Context.NONE);
    }
}
```

### SapVirtualInstances_List

```java
/** Samples for SapVirtualInstances List. */
public final class SapVirtualInstancesListSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_ListBySubscription.json
     */
    /**
     * Sample code: SAPVirtualInstances_ListBySubscription.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPVirtualInstancesListBySubscription(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapVirtualInstances().list(com.azure.core.util.Context.NONE);
    }
}
```

### SapVirtualInstances_ListByResourceGroup

```java
/** Samples for SapVirtualInstances ListByResourceGroup. */
public final class SapVirtualInstancesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_ListByResourceGroup.json
     */
    /**
     * Sample code: SAPVirtualInstances_ListByResourceGroup.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPVirtualInstancesListByResourceGroup(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapVirtualInstances().listByResourceGroup("test-rg", com.azure.core.util.Context.NONE);
    }
}
```

### SapVirtualInstances_Start

```java
import com.azure.resourcemanager.workloads.models.StartRequest;

/** Samples for SapVirtualInstances Start. */
public final class SapVirtualInstancesStartSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Start_WithInfraOperations.json
     */
    /**
     * Sample code: Start the virtual machines and the SAP system.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void startTheVirtualMachinesAndTheSAPSystem(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .start("test-rg", "X00", new StartRequest().withStartVm(true), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Start.json
     */
    /**
     * Sample code: Start the SAP system.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void startTheSAPSystem(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapVirtualInstances().start("test-rg", "X00", null, com.azure.core.util.Context.NONE);
    }
}
```

### SapVirtualInstances_Stop

```java
import com.azure.resourcemanager.workloads.models.StopRequest;

/** Samples for SapVirtualInstances Stop. */
public final class SapVirtualInstancesStopSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Stop_WithInfraOperations.json
     */
    /**
     * Sample code: Stop the virtual machine(s) and the SAP system on it.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void stopTheVirtualMachineSAndTheSAPSystemOnIt(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .stop(
                "test-rg",
                "X00",
                new StopRequest().withSoftStopTimeoutSeconds(0L).withDeallocateVm(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Stop.json
     */
    /**
     * Sample code: SAPVirtualInstances_Stop.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPVirtualInstancesStop(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapVirtualInstances()
            .stop("test-rg", "X00", new StopRequest().withSoftStopTimeoutSeconds(0L), com.azure.core.util.Context.NONE);
    }
}
```

### SapVirtualInstances_Update

```java
import com.azure.resourcemanager.workloads.models.ManagedResourcesNetworkAccessType;
import com.azure.resourcemanager.workloads.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.workloads.models.SapVirtualInstance;
import com.azure.resourcemanager.workloads.models.UpdateSapVirtualInstanceProperties;
import com.azure.resourcemanager.workloads.models.UserAssignedServiceIdentity;
import java.util.HashMap;
import java.util.Map;

/** Samples for SapVirtualInstances Update. */
public final class SapVirtualInstancesUpdateSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_Update.json
     */
    /**
     * Sample code: SAPVirtualInstances_Update.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPVirtualInstancesUpdate(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        SapVirtualInstance resource =
            manager
                .sapVirtualInstances()
                .getByResourceGroupWithResponse("test-rg", "X00", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key1", "fakeTokenPlaceholder"))
            .withIdentity(new UserAssignedServiceIdentity().withType(ManagedServiceIdentityType.NONE))
            .apply();
    }

    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/examples/sapvirtualinstances/SAPVirtualInstances_TrustedAccessEnable_Update.json
     */
    /**
     * Sample code: SAPVirtualInstances_TrustedAccessEnable_Update.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPVirtualInstancesTrustedAccessEnableUpdate(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        SapVirtualInstance resource =
            manager
                .sapVirtualInstances()
                .getByResourceGroupWithResponse("test-rg", "X00", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key1", "fakeTokenPlaceholder"))
            .withIdentity(new UserAssignedServiceIdentity().withType(ManagedServiceIdentityType.NONE))
            .withProperties(
                new UpdateSapVirtualInstanceProperties()
                    .withManagedResourcesNetworkAccessType(ManagedResourcesNetworkAccessType.PRIVATE))
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

