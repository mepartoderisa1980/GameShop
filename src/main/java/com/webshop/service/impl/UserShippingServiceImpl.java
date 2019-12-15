package com.webshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.domain.UserShipping;
import com.webshop.repository.UserShippingRepository;
import com.webshop.service.UserShippingService;

@Service
public class UserShippingServiceImpl implements UserShippingService{
	
	@Autowired
	private UserShippingRepository userShippingRepository;
	
	
	public UserShipping findById(Long id) {
		return userShippingRepository.findById(id).orElse(null);
	}
	
	public void removeById(Long id) {
		userShippingRepository.deleteById(id);
	}

}
