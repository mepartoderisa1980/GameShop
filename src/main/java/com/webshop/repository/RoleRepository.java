package com.webshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.webshop.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
