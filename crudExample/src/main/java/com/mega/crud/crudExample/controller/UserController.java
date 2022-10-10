package com.mega.crud.crudExample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mega.crud.crudExample.entities.UserEntity;
import com.mega.crud.crudExample.services.UserService;

@RestController
public class UserController {
	
	private final UserService userService;
	
	private UserController(UserService userService) {
		this.userService = userService;}

	@GetMapping(path = "/user/all")
	public ResponseEntity<?> getAllUsers() {
		try {
			return ResponseEntity.ok().body(userService.getAllUser());
		}catch(Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}
	
	@GetMapping(path = "/user/{id}")
	public ResponseEntity<Object> getUserById(@PathVariable("id") Integer id) {
		try {
			return ResponseEntity.ok().body(userService.getUser(id));
		}
		catch(Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@PostMapping(path = "/user")
	public ResponseEntity<String> registerUser(@RequestBody UserEntity user) {
		try {
			return ResponseEntity.ok().body(userService.registerUser(user));
		}catch(Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PutMapping(path = "/user/{id}")
	public ResponseEntity<?> updateUser(@RequestBody UserEntity user, @PathVariable("id") Integer id){
		try {
			return ResponseEntity.ok().body(userService.updateUser(user, id));
		}
		catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@DeleteMapping(path = "/user/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable("id") Integer id){
		try {
			return ResponseEntity.ok().body(userService.deleteUser(id));
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
}
