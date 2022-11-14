package com.gft.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.library.models.User;
import com.gft.library.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getByEmail(String email){
		
		return userRepository.getByEmail(email);
	}

}
