package com.myapp.users;

import com.myapp.users.domain.User;
import com.myapp.users.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.myapp.users.controllers")
public class UsersApplication {
    @Autowired
	private UserRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(UsersApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			repository.save(new User("Mathew", 50));
		};
	}

}
