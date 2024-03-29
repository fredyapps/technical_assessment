package com.zenpay.tech.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	@GetMapping("/testino")
	public String yoyoyo() {
		
		return "jjjfjfjf";
	}
	
	
}
