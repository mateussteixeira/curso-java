package com.mega.crud.crudExample.DTO;

import javax.persistence.Column;

import com.mega.crud.crudExample.entities.PostEntity;
import com.mega.crud.crudExample.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
public class PostDTO {

	private Integer Id;
	private String text;
    private String date; 
	private AuthorDTO author;
	
	public PostDTO(PostEntity post, UserEntity user) {
		this.Id = post.getId();
		this.text = post.getText();
		this.date = post.getDate();
		this.author = new AuthorDTO(user);
	}
}
