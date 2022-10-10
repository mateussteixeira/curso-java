package com.mega.crud.crudExample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mega.crud.crudExample.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{
	public List<UserEntity> findAll(); 
}
