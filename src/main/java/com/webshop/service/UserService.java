package com.webshop.service;

import java.util.Set;

import com.webshop.domain.User;
import com.webshop.domain.UserBilling;
import com.webshop.domain.UserPayment;
import com.webshop.domain.UserShipping;
import com.webshop.domain.security.PasswordResetToken;
import com.webshop.domain.security.UserRole;

public interface UserService {
	
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User findById(Long id);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
	
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);
	
	void setUserDefaultShipping(Long userShippingId, User user);
}

