package com.aby.fsd.handson.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.aby.fsd.handson.domain.Domain;
import com.aby.fsd.handson.domain.DomainRepository;

@Component
public class CRUDService {

	public static void welcomeUser() {
		System.out.println("Welcome buddy");
	}

	@Autowired
	private DomainRepository domainRepository;
	
	@Bean
	public String getUser(String userId) {
		Domain obj2 = domainRepository.findFirstByDomain(userId);
        return obj2.toString();
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
