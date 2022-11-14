package com.gft.library.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.library.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> getByEmail(String email);

}
