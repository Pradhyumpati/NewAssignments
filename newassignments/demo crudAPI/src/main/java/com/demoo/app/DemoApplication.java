package com.demoo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner {
	@Autowired
private PasswordEncoder passwordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hii");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.passwordEncoder.encode("mendiss"));

	}
}
