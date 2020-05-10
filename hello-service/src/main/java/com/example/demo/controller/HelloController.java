package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String hello(@RequestHeader("x-location") String location) {
		
		return "Hello from " + location + "!";
	}
	
	@GetMapping("/goodbye")
	public String callGoodbyeService() {
		
		return restTemplate.getForEntity("http://goodbye-service", String.class).getBody();
	}
}
