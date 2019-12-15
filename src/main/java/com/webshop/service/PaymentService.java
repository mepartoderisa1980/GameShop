package com.webshop.service;

import com.webshop.domain.Payment;
import com.webshop.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
