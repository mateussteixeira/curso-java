package com.mega.crud.crudExample.repository;

import org.springframework.data.repository.CrudRepository;

import com.mega.crud.crudExample.entities.PostEntity;

public interface PostRepository extends CrudRepository<PostEntity, Integer>{

}
