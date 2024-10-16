// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.implementation.models;

import com.azure.core.util.ExpandableStringEnum;

import java.util.Collection;

/** Defines values for Error. */
public final class Error extends ExpandableStringEnum<Error> {
    /** Static value NoError for Error. */
    public static final Error NO_ERROR = fromString("NoError");

    /** Static value UnknownErrorCode for Error. */
    public static final Error UNKNOWN_ERROR_CODE = fromString("UnknownErrorCode");

    /** Static value OutOfStock for Error. */
    public static final Error OUT_OF_STOCK = fromString("OutOfStock");

    /** Static value AuthorizationDenied for Error. */
    public static final Error AUTHORIZATION_DENIED = fromString("AuthorizationDenied");

    /** Static value MissingAddress for Error. */
    public static final Error MISSING_ADDRESS = fromString("MissingAddress");

    /** Static value InvalidAddress for Error. */
    public static final Error INVALID_ADDRESS = fromString("InvalidAddress");

    /** Static value InvalidOfferModel for Error. */
    public static final Error INVALID_OFFER_MODEL = fromString("InvalidOfferModel");

    /** Static value NotEnoughLicenses for Error. */
    public static final Error NOT_ENOUGH_LICENSES = fromString("NotEnoughLicenses");

    /** Static value NoWallet for Error. */
    public static final Error NO_WALLET = fromString("NoWallet");

    /** Static value NotEnoughCredit for Error. */
    public static final Error NOT_ENOUGH_CREDIT = fromString("NotEnoughCredit");

    /** Static value NumbersPartiallyAcquired for Error. */
    public static final Error NUMBERS_PARTIALLY_ACQUIRED = fromString("NumbersPartiallyAcquired");

    /** Static value AllNumbersNotAcquired for Error. */
    public static final Error ALL_NUMBERS_NOT_ACQUIRED = fromString("AllNumbersNotAcquired");

    /** Static value ReservationExpired for Error. */
    public static final Error RESERVATION_EXPIRED = fromString("ReservationExpired");

    /** Static value PurchaseFailed for Error. */
    public static final Error PURCHASE_FAILED = fromString("PurchaseFailed");

    /** Static value BillingUnavailable for Error. */
    public static final Error BILLING_UNAVAILABLE = fromString("BillingUnavailable");

    /** Static value ProvisioningFailed for Error. */
    public static final Error PROVISIONING_FAILED = fromString("ProvisioningFailed");

    /** Static value UnknownSearchError for Error. */
    public static final Error UNKNOWN_SEARCH_ERROR = fromString("UnknownSearchError");

    /**
     * Creates an instance of {@link Error} with no string value.
     *
     * @deprecated Use {@link #fromString(String)} to create or get an instance of {@link Error} instead.
     */
    @Deprecated
    public Error() {
    }

    /**
     * Creates or finds a Error from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Error.
     */
    public static Error fromString(String name) {
        return fromString(name, Error.class);
    }

    /**
     * Gets known Error values.
     *
     * @return known Error values.
     */
    public static Collection<Error> values() {
        return values(Error.class);
    }
}
