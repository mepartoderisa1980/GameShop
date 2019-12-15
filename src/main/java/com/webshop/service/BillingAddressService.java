package com.webshop.service;

import com.webshop.domain.BillingAddress;
import com.webshop.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
