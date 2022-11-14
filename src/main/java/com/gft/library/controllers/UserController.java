package com.gft.library.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gft.library.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/{email}")
	public ResponseEntity<Object> getByEmail(@PathVariable String email){

		if(!userService.getByEmail(email).isPresent()){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User not found");
		}
		
		return ResponseEntity.ok().body(userService.getByEmail(email));
	}

}
