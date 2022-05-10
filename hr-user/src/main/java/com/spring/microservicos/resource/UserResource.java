package com.spring.microservicos.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservicos.entities.User;
import com.spring.microservicos.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
		
	}
	
	/*
	 * busca por email
	 */
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEamil(@RequestParam String email){
		User obj = repository.findByEmail(email);
		return ResponseEntity.ok(obj);
		
	}

}
