package com.webshop.service;

import com.webshop.domain.BillingAddress;
import com.webshop.domain.Order;
import com.webshop.domain.Payment;
import com.webshop.domain.ShippingAddress;
import com.webshop.domain.ShoppingCart;
import com.webshop.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findOne(Long id);
}
