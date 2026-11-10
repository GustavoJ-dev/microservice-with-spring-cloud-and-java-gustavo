package com.gustavojdev.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class  Startup {

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}

	// http://localhost:8080/hello-world
	@GetMapping("/hello-world")
	public String helloWorld(){

		return "Hello, World!";
	}


}

