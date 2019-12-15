package com.webshop;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.webshop.domain.User;
import com.webshop.domain.security.Role;
import com.webshop.domain.security.UserRole;
import com.webshop.service.UserService;
import com.webshop.utility.SecurityUtility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebshopApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(WebshopApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("Israel");
		user1.setLastName("Sebastian");
		user1.setUsername("isse");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user1.setEmail("isebastianrubio@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1= new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);

	}
}
