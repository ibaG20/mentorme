package com.gft.library.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.library.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	List<User> getByEmail(String email);

}
