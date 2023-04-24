package com.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.repository.UserRepository;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		  User usersts = userRepository.save(user);
		     return usersts;
	}

	@Override
	public Boolean findByUsernamePassword(String username, String password) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findByUsernamePassword(username,password);
		if(user.isPresent()) {
			User user2 =  user.get();
			userRepository.findByUsernamePassword(user2);
			return true;
		}
		else {
			return false;
		}
	}

}
