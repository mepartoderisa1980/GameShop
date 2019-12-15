package com.webshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.webshop.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

}
