package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyFirstApplication {
   
	@Value("${var}")
	private String name;
	@GetMapping("disp")
	public String display()
	{
		return "Welcome to website "+name;
	}
}
