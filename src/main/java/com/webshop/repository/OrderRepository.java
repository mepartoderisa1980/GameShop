package com.webshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.webshop.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
