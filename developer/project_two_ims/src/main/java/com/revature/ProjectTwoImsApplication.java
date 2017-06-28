package com.revature;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectTwoImsApplication {

	public static void main(String[] args) {
		System.out.println("This is a test");
		SpringApplication.run(ProjectTwoImsApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(){
		return args->{};
	}
}
