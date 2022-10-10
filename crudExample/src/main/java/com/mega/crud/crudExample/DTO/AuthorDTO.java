package com.mega.crud.crudExample.DTO;

import com.mega.crud.crudExample.entities.UserEntity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AuthorDTO {

	private Integer id;
	private String name;
	
	public AuthorDTO(UserEntity user) {
		this.id = user.getId();
		this.name = user.getName();
	}
	
}
