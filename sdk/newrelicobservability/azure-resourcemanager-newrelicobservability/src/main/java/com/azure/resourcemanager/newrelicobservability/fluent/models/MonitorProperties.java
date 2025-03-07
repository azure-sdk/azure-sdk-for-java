// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.newrelicobservability.models.AccountCreationSource;
import com.azure.resourcemanager.newrelicobservability.models.LiftrResourceCategories;
import com.azure.resourcemanager.newrelicobservability.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.newrelicobservability.models.MonitoringStatus;
import com.azure.resourcemanager.newrelicobservability.models.NewRelicAccountProperties;
import com.azure.resourcemanager.newrelicobservability.models.OrgCreationSource;
import com.azure.resourcemanager.newrelicobservability.models.PlanData;
import com.azure.resourcemanager.newrelicobservability.models.ProvisioningState;
import com.azure.resourcemanager.newrelicobservability.models.UserInfo;
import java.io.IOException;

/**
 * Properties specific to the NewRelic Monitor resource.
 */
@Fluent
public final class MonitorProperties implements JsonSerializable<MonitorProperties> {
    /*
     * Provisioning State of the resource
     */
    private ProvisioningState provisioningState;

    /*
     * MonitoringStatus of the resource
     */
    private MonitoringStatus monitoringStatus;

    /*
     * NewRelic Organization properties of the resource
     */
    private MarketplaceSubscriptionStatus marketplaceSubscriptionStatus;

    /*
     * Marketplace Subscription Id
     */
    private String marketplaceSubscriptionId;

    /*
     * MarketplaceSubscriptionStatus of the resource
     */
    private NewRelicAccountProperties newRelicAccountProperties;

    /*
     * User Info
     */
    private UserInfo userInfo;

    /*
     * Plan details
     */
    private PlanData planData;

    /*
     * Liftr resource category
     */
    private LiftrResourceCategories liftrResourceCategory;

    /*
     * Liftr resource preference. The priority of the resource.
     */
    private Integer liftrResourcePreference;

    /*
     * Source of org creation
     */
    private OrgCreationSource orgCreationSource;

    /*
     * Source of account creation
     */
    private AccountCreationSource accountCreationSource;

    /*
     * State of the Azure Subscription containing the monitor resource
     */
    private String subscriptionState;

    /*
     * Status of Azure Subscription where Marketplace SaaS is located.
     */
    private String saaSAzureSubscriptionStatus;

    /**
     * Creates an instance of MonitorProperties class.
     */
    public MonitorProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning State of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the monitoringStatus property: MonitoringStatus of the resource.
     * 
     * @return the monitoringStatus value.
     */
    public MonitoringStatus monitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * Get the marketplaceSubscriptionStatus property: NewRelic Organization properties of the resource.
     * 
     * @return the marketplaceSubscriptionStatus value.
     */
    public MarketplaceSubscriptionStatus marketplaceSubscriptionStatus() {
        return this.marketplaceSubscriptionStatus;
    }

    /**
     * Get the marketplaceSubscriptionId property: Marketplace Subscription Id.
     * 
     * @return the marketplaceSubscriptionId value.
     */
    public String marketplaceSubscriptionId() {
        return this.marketplaceSubscriptionId;
    }

    /**
     * Get the newRelicAccountProperties property: MarketplaceSubscriptionStatus of the resource.
     * 
     * @return the newRelicAccountProperties value.
     */
    public NewRelicAccountProperties newRelicAccountProperties() {
        return this.newRelicAccountProperties;
    }

    /**
     * Set the newRelicAccountProperties property: MarketplaceSubscriptionStatus of the resource.
     * 
     * @param newRelicAccountProperties the newRelicAccountProperties value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withNewRelicAccountProperties(NewRelicAccountProperties newRelicAccountProperties) {
        this.newRelicAccountProperties = newRelicAccountProperties;
        return this;
    }

    /**
     * Get the userInfo property: User Info.
     * 
     * @return the userInfo value.
     */
    public UserInfo userInfo() {
        return this.userInfo;
    }

    /**
     * Set the userInfo property: User Info.
     * 
     * @param userInfo the userInfo value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    /**
     * Get the planData property: Plan details.
     * 
     * @return the planData value.
     */
    public PlanData planData() {
        return this.planData;
    }

    /**
     * Set the planData property: Plan details.
     * 
     * @param planData the planData value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withPlanData(PlanData planData) {
        this.planData = planData;
        return this;
    }

    /**
     * Get the liftrResourceCategory property: Liftr resource category.
     * 
     * @return the liftrResourceCategory value.
     */
    public LiftrResourceCategories liftrResourceCategory() {
        return this.liftrResourceCategory;
    }

    /**
     * Get the liftrResourcePreference property: Liftr resource preference. The priority of the resource.
     * 
     * @return the liftrResourcePreference value.
     */
    public Integer liftrResourcePreference() {
        return this.liftrResourcePreference;
    }

    /**
     * Get the orgCreationSource property: Source of org creation.
     * 
     * @return the orgCreationSource value.
     */
    public OrgCreationSource orgCreationSource() {
        return this.orgCreationSource;
    }

    /**
     * Set the orgCreationSource property: Source of org creation.
     * 
     * @param orgCreationSource the orgCreationSource value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withOrgCreationSource(OrgCreationSource orgCreationSource) {
        this.orgCreationSource = orgCreationSource;
        return this;
    }

    /**
     * Get the accountCreationSource property: Source of account creation.
     * 
     * @return the accountCreationSource value.
     */
    public AccountCreationSource accountCreationSource() {
        return this.accountCreationSource;
    }

    /**
     * Set the accountCreationSource property: Source of account creation.
     * 
     * @param accountCreationSource the accountCreationSource value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withAccountCreationSource(AccountCreationSource accountCreationSource) {
        this.accountCreationSource = accountCreationSource;
        return this;
    }

    /**
     * Get the subscriptionState property: State of the Azure Subscription containing the monitor resource.
     * 
     * @return the subscriptionState value.
     */
    public String subscriptionState() {
        return this.subscriptionState;
    }

    /**
     * Set the subscriptionState property: State of the Azure Subscription containing the monitor resource.
     * 
     * @param subscriptionState the subscriptionState value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withSubscriptionState(String subscriptionState) {
        this.subscriptionState = subscriptionState;
        return this;
    }

    /**
     * Get the saaSAzureSubscriptionStatus property: Status of Azure Subscription where Marketplace SaaS is located.
     * 
     * @return the saaSAzureSubscriptionStatus value.
     */
    public String saaSAzureSubscriptionStatus() {
        return this.saaSAzureSubscriptionStatus;
    }

    /**
     * Set the saaSAzureSubscriptionStatus property: Status of Azure Subscription where Marketplace SaaS is located.
     * 
     * @param saaSAzureSubscriptionStatus the saaSAzureSubscriptionStatus value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withSaaSAzureSubscriptionStatus(String saaSAzureSubscriptionStatus) {
        this.saaSAzureSubscriptionStatus = saaSAzureSubscriptionStatus;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (newRelicAccountProperties() != null) {
            newRelicAccountProperties().validate();
        }
        if (userInfo() != null) {
            userInfo().validate();
        }
        if (planData() != null) {
            planData().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("newRelicAccountProperties", this.newRelicAccountProperties);
        jsonWriter.writeJsonField("userInfo", this.userInfo);
        jsonWriter.writeJsonField("planData", this.planData);
        jsonWriter.writeStringField("orgCreationSource",
            this.orgCreationSource == null ? null : this.orgCreationSource.toString());
        jsonWriter.writeStringField("accountCreationSource",
            this.accountCreationSource == null ? null : this.accountCreationSource.toString());
        jsonWriter.writeStringField("subscriptionState", this.subscriptionState);
        jsonWriter.writeStringField("saaSAzureSubscriptionStatus", this.saaSAzureSubscriptionStatus);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MonitorProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MonitorProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MonitorProperties.
     */
    public static MonitorProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MonitorProperties deserializedMonitorProperties = new MonitorProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedMonitorProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else if ("monitoringStatus".equals(fieldName)) {
                    deserializedMonitorProperties.monitoringStatus = MonitoringStatus.fromString(reader.getString());
                } else if ("marketplaceSubscriptionStatus".equals(fieldName)) {
                    deserializedMonitorProperties.marketplaceSubscriptionStatus
                        = MarketplaceSubscriptionStatus.fromString(reader.getString());
                } else if ("marketplaceSubscriptionId".equals(fieldName)) {
                    deserializedMonitorProperties.marketplaceSubscriptionId = reader.getString();
                } else if ("newRelicAccountProperties".equals(fieldName)) {
                    deserializedMonitorProperties.newRelicAccountProperties
                        = NewRelicAccountProperties.fromJson(reader);
                } else if ("userInfo".equals(fieldName)) {
                    deserializedMonitorProperties.userInfo = UserInfo.fromJson(reader);
                } else if ("planData".equals(fieldName)) {
                    deserializedMonitorProperties.planData = PlanData.fromJson(reader);
                } else if ("liftrResourceCategory".equals(fieldName)) {
                    deserializedMonitorProperties.liftrResourceCategory
                        = LiftrResourceCategories.fromString(reader.getString());
                } else if ("liftrResourcePreference".equals(fieldName)) {
                    deserializedMonitorProperties.liftrResourcePreference = reader.getNullable(JsonReader::getInt);
                } else if ("orgCreationSource".equals(fieldName)) {
                    deserializedMonitorProperties.orgCreationSource = OrgCreationSource.fromString(reader.getString());
                } else if ("accountCreationSource".equals(fieldName)) {
                    deserializedMonitorProperties.accountCreationSource
                        = AccountCreationSource.fromString(reader.getString());
                } else if ("subscriptionState".equals(fieldName)) {
                    deserializedMonitorProperties.subscriptionState = reader.getString();
                } else if ("saaSAzureSubscriptionStatus".equals(fieldName)) {
                    deserializedMonitorProperties.saaSAzureSubscriptionStatus = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMonitorProperties;
        });
    }
}
