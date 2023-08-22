package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstApplication {
	@GetMapping("disp")
	
	public String display()
	{
		return "Hello Surendhiran";
	}
}