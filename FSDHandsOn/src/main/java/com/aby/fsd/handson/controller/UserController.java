package com.aby.fsd.handson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aby.fsd.handson.service.CRUDService;

@RestController
public class UserController {

	@Autowired
	private CRUDService svc;
	
	@GetMapping("/user")
	public String welcomeUser() {
		return svc.welcomeUser();
		//return "Welcome";
	}

	@GetMapping("/user/get/{userId}")
	public String getUserDetails(@PathVariable String userId) {

		return svc.getUser(userId);
	}

	@PostMapping("/user/newUser")
	public String createUser() {
		return svc.createUser();
	}
	
	@PutMapping("/user/update/{userId}")
	public String updateUser(@PathVariable String userId) {
		return svc.updateUser(userId);
	}
	
	@DeleteMapping("/user/delete/{userId}")
	public String deleteUser(@PathVariable String userId) {
		return svc.deleteUser(userId);
	}
}
