package com.webshop.service;

import com.webshop.domain.ShippingAddress;
import com.webshop.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
