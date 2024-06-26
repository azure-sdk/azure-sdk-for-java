// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billingbenefits.fluent.models.ReservationOrderAliasRequestProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Reservation order alias. */
@Fluent
public final class ReservationOrderAliasRequest extends ProxyResource {
    /*
     * Reservation order SKU
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * The Azure Region where the reservation benefits are applied to.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Reservation order alias request properties
     */
    @JsonProperty(value = "properties")
    private ReservationOrderAliasRequestProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ReservationOrderAliasRequest class. */
    public ReservationOrderAliasRequest() {
    }

    /**
     * Get the sku property: Reservation order SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Reservation order SKU.
     *
     * @param sku the sku value to set.
     * @return the ReservationOrderAliasRequest object itself.
     */
    public ReservationOrderAliasRequest withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the location property: The Azure Region where the reservation benefits are applied to.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The Azure Region where the reservation benefits are applied to.
     *
     * @param location the location value to set.
     * @return the ReservationOrderAliasRequest object itself.
     */
    public ReservationOrderAliasRequest withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the innerProperties property: Reservation order alias request properties.
     *
     * @return the innerProperties value.
     */
    private ReservationOrderAliasRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the displayName property: Display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Display name.
     *
     * @param displayName the displayName value to set.
     * @return the ReservationOrderAliasRequest object itself.
     */
    public ReservationOrderAliasRequest withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderAliasRequestProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     *
     * @return the billingScopeId value.
     */
    public String billingScopeId() {
        return this.innerProperties() == null ? null : this.innerProperties().billingScopeId();
    }

    /**
     * Set the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     *
     * @param billingScopeId the billingScopeId value to set.
     * @return the ReservationOrderAliasRequest object itself.
     */
    public ReservationOrderAliasRequest withBillingScopeId(String billingScopeId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderAliasRequestProperties();
        }
        this.innerProperties().withBillingScopeId(billingScopeId);
        return this;
    }

    /**
     * Get the term property: Represent benefit term in ISO 8601 format.
     *
     * @return the term value.
     */
    public Term term() {
        return this.innerProperties() == null ? null : this.innerProperties().term();
    }

    /**
     * Set the term property: Represent benefit term in ISO 8601 format.
     *
     * @param term the term value to set.
     * @return the ReservationOrderAliasRequest object itself.
     */
    public ReservationOrderAliasRequest withTerm(Term term) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderAliasRequestProperties();
        }
        this.innerProperties().withTerm(term);
        return this;
    }

    /**
     * Get the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     *
     * @return the billingPlan value.
     */
    public BillingPlan billingPlan() {
        return this.innerProperties() == null ? null : this.innerProperties().billingPlan();
    }

    /**
     * Set the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     *
     * @param billingPlan the billingPlan value to set.
     * @return the ReservationOrderAliasRequest object itself.
     */
    public ReservationOrderAliasRequest withBillingPlan(BillingPlan billingPlan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderAliasRequestProperties();
        }
        this.innerProperties().withBillingPlan(billingPlan);
        return this;
    }

    /**
     * Get the appliedScopeType property: Type of the Applied Scope.
     *
     * @return the appliedScopeType value.
     */
    public AppliedScopeType appliedScopeType() {
        return this.innerProperties() == null ? null : this.innerProperties().appliedScopeType();
    }

    /**
     * Set the appliedScopeType property: Type of the Applied Scope.
     *
     * @param appliedScopeType the appliedScopeType value to set.
     * @return the ReservationOrderAliasRequest object itself.
     */
    public ReservationOrderAliasRequest withAppliedScopeType(AppliedScopeType appliedScopeType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderAliasRequestProperties();
        }
        this.innerProperties().withAppliedScopeType(appliedScopeType);
        return this;
    }

    /**
     * Get the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable.
     *
     * @return the appliedScopeProperties value.
     */
    public AppliedScopeProperties appliedScopeProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().appliedScopeProperties();
    }

    /**
     * Set the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable.
     *
     * @param appliedScopeProperties the appliedScopeProperties value to set.
     * @return the ReservationOrderAliasRequest object itself.
     */
    public ReservationOrderAliasRequest withAppliedScopeProperties(AppliedScopeProperties appliedScopeProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderAliasRequestProperties();
        }
        this.innerProperties().withAppliedScopeProperties(appliedScopeProperties);
        return this;
    }

    /**
     * Get the quantity property: Total Quantity of the SKUs purchased in the Reservation.
     *
     * @return the quantity value.
     */
    public Integer quantity() {
        return this.innerProperties() == null ? null : this.innerProperties().quantity();
    }

    /**
     * Set the quantity property: Total Quantity of the SKUs purchased in the Reservation.
     *
     * @param quantity the quantity value to set.
     * @return the ReservationOrderAliasRequest object itself.
     */
    public ReservationOrderAliasRequest withQuantity(Integer quantity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderAliasRequestProperties();
        }
        this.innerProperties().withQuantity(quantity);
        return this;
    }

    /**
     * Get the renew property: Setting this to true will automatically purchase a new benefit on the expiration date
     * time.
     *
     * @return the renew value.
     */
    public Boolean renew() {
        return this.innerProperties() == null ? null : this.innerProperties().renew();
    }

    /**
     * Set the renew property: Setting this to true will automatically purchase a new benefit on the expiration date
     * time.
     *
     * @param renew the renew value to set.
     * @return the ReservationOrderAliasRequest object itself.
     */
    public ReservationOrderAliasRequest withRenew(Boolean renew) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderAliasRequestProperties();
        }
        this.innerProperties().withRenew(renew);
        return this;
    }

    /**
     * Get the reservedResourceType property: The type of the resource that is being reserved.
     *
     * @return the reservedResourceType value.
     */
    public ReservedResourceType reservedResourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().reservedResourceType();
    }

    /**
     * Set the reservedResourceType property: The type of the resource that is being reserved.
     *
     * @param reservedResourceType the reservedResourceType value to set.
     * @return the ReservationOrderAliasRequest object itself.
     */
    public ReservationOrderAliasRequest withReservedResourceType(ReservedResourceType reservedResourceType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderAliasRequestProperties();
        }
        this.innerProperties().withReservedResourceType(reservedResourceType);
        return this;
    }

    /**
     * Get the reviewDateTime property: This is the date-time when the Azure Hybrid Benefit needs to be reviewed.
     *
     * @return the reviewDateTime value.
     */
    public OffsetDateTime reviewDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().reviewDateTime();
    }

    /**
     * Set the reviewDateTime property: This is the date-time when the Azure Hybrid Benefit needs to be reviewed.
     *
     * @param reviewDateTime the reviewDateTime value to set.
     * @return the ReservationOrderAliasRequest object itself.
     */
    public ReservationOrderAliasRequest withReviewDateTime(OffsetDateTime reviewDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderAliasRequestProperties();
        }
        this.innerProperties().withReviewDateTime(reviewDateTime);
        return this;
    }

    /**
     * Get the reservedResourceProperties property: Properties specific to each reserved resource type. Not required if
     * not applicable.
     *
     * @return the reservedResourceProperties value.
     */
    public ReservationOrderAliasRequestPropertiesReservedResourceProperties reservedResourceProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().reservedResourceProperties();
    }

    /**
     * Set the reservedResourceProperties property: Properties specific to each reserved resource type. Not required if
     * not applicable.
     *
     * @param reservedResourceProperties the reservedResourceProperties value to set.
     * @return the ReservationOrderAliasRequest object itself.
     */
    public ReservationOrderAliasRequest withReservedResourceProperties(
        ReservationOrderAliasRequestPropertiesReservedResourceProperties reservedResourceProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationOrderAliasRequestProperties();
        }
        this.innerProperties().withReservedResourceProperties(reservedResourceProperties);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sku in model ReservationOrderAliasRequest"));
        } else {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ReservationOrderAliasRequest.class);
}
