package com.mega.crud.crudExample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mega.crud.crudExample.entities.UserEntity;
import com.mega.crud.crudExample.exceptions.UserNotFoundException;
import com.mega.crud.crudExample.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public UserEntity getUser(Integer id) throws UserNotFoundException {
		return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Usuário não encontrado"));
	}
	
	public String registerUser(UserEntity user) throws Exception {
		try {
			userRepository.save(user);
			return "Usuário registrado com sucesso";
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	public List<UserEntity> getAllUser(){
		return userRepository.findAll();
	}
	
	public UserEntity deleteUser(Integer id) throws Exception {
		UserEntity user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Usuário não encontrado"));
		if(user instanceof UserEntity) {
			userRepository.deleteById(id);
		}
		return user;
	}


	public UserEntity updateUser(UserEntity newUser, Integer id) {
		newUser.setId(id);
		userRepository.save(newUser);
		return userRepository.findById(id).orElseThrow(RuntimeException::new);
	}
	
}
