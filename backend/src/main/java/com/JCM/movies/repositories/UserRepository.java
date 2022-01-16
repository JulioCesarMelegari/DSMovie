package com.JCM.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JCM.movies.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
