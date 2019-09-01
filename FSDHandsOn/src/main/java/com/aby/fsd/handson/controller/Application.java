/**
 * 
 */
package com.aby.fsd.handson.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author abrahammilton
 *
 */

@SpringBootApplication(scanBasePackages={"com.aby.fsd.handson.service"})
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

	}

}