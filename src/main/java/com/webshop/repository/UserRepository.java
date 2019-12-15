package com.webshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.webshop.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	User findByEmail(String email);
}

