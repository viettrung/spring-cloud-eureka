package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeController {

	@Value("${server.port}")
	private String port;
	
	@GetMapping
	public String goodBye() {
		return String.format("The current time is: %s.\n Goodbye! (from goodbye-service with port: %s)", new Date(), port);
	}
}
