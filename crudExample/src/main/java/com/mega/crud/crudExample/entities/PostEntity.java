package com.mega.crud.crudExample.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class PostEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
    @Column(nullable = false, length = 500)
	private String text;
    
    @Column(nullable = false, length = 10)
	private String date;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name="crudExample.user_entity")
	private UserEntity user;
	
}
