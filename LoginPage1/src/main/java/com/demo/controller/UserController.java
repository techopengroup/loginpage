package com.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(value = "/adduser")
	public User adduser(@RequestBody User user) {
		User usersts = userService.addUser(user);
		  return usersts;
		 
	}
	
	@GetMapping("/getdata")
	public Boolean findByUser(@RequestParam String  username, String password){
		Boolean usersts =	userService.findByUsernamePassword(username,password);
		return usersts;
		
	}
	
}
