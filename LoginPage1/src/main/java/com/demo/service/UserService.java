package com.demo.service;

import java.util.Optional;

import com.demo.model.User;

public interface UserService {

	User addUser(User user);

	Boolean findByUsernamePassword(String username, String password);

	

}
