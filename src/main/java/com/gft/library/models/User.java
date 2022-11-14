package com.gft.library.models;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
	
	private Long id;
	private String name;
	private String email;
	private String password;
	@Size(max = 1000)
	private String description;
	private String photoUrl;
	private Double averageRating;

}