package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.UserRepository;
import com.demo.model.User;

@Service
@Transactional
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> findAll(){

		List<User> users = new ArrayList<>();
		for (User user : userRepository.findAll()) {
			users.add(user);
		}
		return users;
	}
	
	public User findUser(String name){ return userRepository.findOne(name); }

	public void save(User user){ userRepository.save(user); }
	
	public void delete(String name ){ userRepository.delete(name); }
	
}
