package com.mega.crud.crudExample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mega.crud.crudExample.entities.PostEntity;
import com.mega.crud.crudExample.exceptions.PostNotFoundException;
import com.mega.crud.crudExample.services.PostService;

@RestController
public class PostController {
	
	private final PostService postService;
	private PostController(PostService postService) {
		this.postService = postService;
	}
	
	@GetMapping(path="posts/{id}")
	public ResponseEntity<?> getPostById(@PathVariable("id") Integer id) throws PostNotFoundException{
		return ResponseEntity.ok().body(postService.getPost(id));
	}
	
	@PostMapping(path="posts")
	public ResponseEntity<?> registerPost(@RequestBody PostEntity post){
		return ResponseEntity.ok().body(postService.registerPost(post));
	}
	
}
