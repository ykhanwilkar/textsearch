package com.ideapoke.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class TextSearchEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TextSearchEngineApplication.class, args);
	}

}
