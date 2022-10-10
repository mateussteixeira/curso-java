package com.mega.crud.crudExample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mega.crud.crudExample.entities.PostEntity;
import com.mega.crud.crudExample.exceptions.PostNotFoundException;
import com.mega.crud.crudExample.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	public PostService(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
	public PostEntity getPost(Integer id) throws PostNotFoundException {
		return postRepository.findById(id).orElseThrow(() -> new PostNotFoundException("Post não encontrado"));
	}
	
	public PostEntity registerPost(PostEntity post) {
		postRepository.save(post);
		return post;
	}
	
}
