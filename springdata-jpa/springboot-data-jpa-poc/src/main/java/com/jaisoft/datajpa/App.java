package com.jaisoft.datajpa;

import com.jaisoft.datajpa.model.User;
import com.jaisoft.datajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class App implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUserName("Pepe");

		User userCreated = userRepository.save(user);

		System.err.println(userCreated);
	}
}
