package com.mega.crud.crudExample.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mega.crud.crudExample.DTO.PostDTO;
import com.mega.crud.crudExample.entities.PostEntity;
import com.mega.crud.crudExample.entities.UserEntity;
import com.mega.crud.crudExample.exceptions.PostNotFoundException;
import com.mega.crud.crudExample.exceptions.UserNotFoundException;
import com.mega.crud.crudExample.repository.PostRepository;
import com.mega.crud.crudExample.repository.UserRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	private UserRepository userRepository;
	
	public PostService(PostRepository postRepository, UserRepository userRepository) {
		this.postRepository = postRepository;
		this.userRepository = userRepository;
	}
	
	public PostDTO getPost(Integer id) throws PostNotFoundException {
		PostEntity post = postRepository.findById(id).orElseThrow(() -> new PostNotFoundException("Post não encontrado"));
		PostDTO postReturn = new PostDTO(post, post.getUser());
		return postReturn;
	}
	
	public PostDTO registerPost(PostEntity post, Integer id) throws UserNotFoundException {
//		UserEntity userPost = userRepository.findById(post.getUser().getId()).orElse(null);
//		if(userPost != null) {
//			post.setUser(userPost);
//			postRepository.save(post);
//			PostDTO postReturn = new PostDTO(post, post.getUser());
//			return postReturn;
//		}else {
			UserEntity userPost = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Usuário não encontrado"));
			post.setUser(userPost);
			postRepository.save(post);
			PostDTO postReturn = new PostDTO(post, post.getUser());
			return postReturn;
		}
		
	
	
	public List<PostDTO> getAllPost(){
		List<PostDTO> list = new ArrayList<>();
		postRepository.findAll().forEach(post -> list.add(new PostDTO(post, post.getUser())));
		return list;
//		return (List<PostEntity>) postRepository.findAll();
	}
	
}
