/**
 * 
 */
package com.aby.fsd.handson.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author abrahammilton
 *
 */

@ComponentScan("com.aby.fsd.handson")
@SpringBootApplication
public class Application {

	@Autowired
	private DomainRepository repository;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}
	
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		
		repository.save(new Domain("Abraham", true));
		repository.save(new Domain("Milton", true));
	}
	

}
