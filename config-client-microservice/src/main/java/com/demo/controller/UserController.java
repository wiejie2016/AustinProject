package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;

@RestController
public class UserController {

	User user = new User();
	
	@RequestMapping(value = "/search/{name}", produces = "application/json")
    public ResponseEntity<User> retrieveReservation(@PathVariable String name){

		initialUser();
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
	
	public  void initialUser(){
		
		user.setId(101);
		user.setName("John");
		user.setAddress("Google Address");
		user.setDescription("http://google.com");
		
	}

}
