package com.mega.crud.crudExample.entities;

import javax.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
    @Column(nullable = false, length = 50)
	private String name;
    
    @Column(nullable = false, length = 40)
    private String email;
    
    @Column(nullable = false, length = 15)
    private String phone;
	
    @Column(nullable = false, length = 50)
    private String password;	
}
