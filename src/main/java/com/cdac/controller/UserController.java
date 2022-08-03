package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entity.User;
import com.cdac.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users/save")
	public ResponseEntity<User> save(@RequestBody User user){
	   User newUser = userService.save(user);
	   return ResponseEntity.ok(newUser);
   }
}
