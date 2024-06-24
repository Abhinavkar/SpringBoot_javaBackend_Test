package com.javaLearning.javaBackendLearning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "Helloworldd ";
	}

	@GetMapping(path = "/hey")
	public String heyworld() {
		return "Hey world ";
	}

}
