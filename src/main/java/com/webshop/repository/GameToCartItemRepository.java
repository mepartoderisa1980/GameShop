package com.webshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.webshop.domain.CartItem;
import com.webshop.domain.GameToCartItem;

@Transactional
public interface GameToCartItemRepository extends CrudRepository<GameToCartItem, Long> {
	void deleteByCartItem(CartItem cartItem);
}
