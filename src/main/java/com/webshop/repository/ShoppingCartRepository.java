package com.webshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.webshop.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
