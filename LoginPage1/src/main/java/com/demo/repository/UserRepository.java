package com.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	/*
	 * void findById(String username, String password);
	 * 
	 * Optional<User> findByUsernamePassword(String username, String password);
	 * 
	 * void findByUsernamePassword(User user2);
	 */

  }
