package com.webshop.service;

import java.util.List;

import com.webshop.domain.CartItem;
import com.webshop.domain.Game;
import com.webshop.domain.Order;
import com.webshop.domain.ShoppingCart;
import com.webshop.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addGameToCartItem(Game game, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	List<CartItem> findByOrder(Order order);
}
