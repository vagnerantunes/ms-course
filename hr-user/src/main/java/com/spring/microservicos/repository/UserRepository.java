package com.spring.microservicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.microservicos.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
