package com.manfredwind.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String hello() {
		return "Hello, configured webhooks for jenkins...testing if its working!";
	}

}
