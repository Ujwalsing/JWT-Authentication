package com.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/user")
	public String getUser() {
		System.out.println("getting user");
		return "Users";
	}
}
