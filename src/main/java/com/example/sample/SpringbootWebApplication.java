package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}

	/**
	 * Throw exception if {@code throwException} is true
	 * 
	 * @param throwException
	 * @return
	 */
	@GetMapping("/v1/subjects")
	public String subject(@RequestParam(name = "exception", defaultValue = "false") boolean exception) {

		if (exception) {
			throw new RuntimeException("Subject not exists");
		}

		return "English";
	}
}
