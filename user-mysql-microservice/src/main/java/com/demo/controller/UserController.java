package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/create/user", method=RequestMethod.POST, headers={"Content-type=application/json"})
	public ResponseEntity<Void> createUser(@RequestBody User user ){
	
		userService.save(user);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value="delete/{name}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteUser(@PathVariable String name){
	
		userService.delete(name);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/get/{name}", produces = "application/json")
	public ResponseEntity<User> getUser(@PathVariable String name) {

		User user = userService.findUser(name);
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@RequestMapping(value = "/listall/", produces = "application/json")
	public ResponseEntity<List<User>> getAllUsers( ){
		
		List<User> users = userService.findAll();
	
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		
	}

}
