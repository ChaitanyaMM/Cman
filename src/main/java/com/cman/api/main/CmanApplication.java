package com.cman.api.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@ComponentScan(basePackages = "com.*")

public class CmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmanApplication.class, args);
	}
	
	/*
	 * @RequestMapping(value = "/cman") public String bootUp(){ return
	 * "cman On bootup!..";
	 * 
	 * 
	 * }
	 */
	
	

}
