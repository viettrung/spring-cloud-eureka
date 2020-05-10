package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeController {

	@GetMapping
	public String goodBye() {
		return "Goodbye!";
	}
}
