package com.aby.fsd.handson.service;

import org.springframework.stereotype.Component;

@Component
public class CRUDService {
	
	public String welcomeUser() {
		return "Welcome buddy";
	}
	
	public String getUser(String userId) {
		return "Here is user "+userId;
	}
	
	public String createUser() {
		return "User is created";
	}
	
	public String updateUser(String userId) {
		return userId + " is updated";
	}
	
	public String deleteUser(String userId) {
		return userId + " is deleted";
	}

}