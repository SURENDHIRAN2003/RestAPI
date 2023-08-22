package com.example.demo.controller;
//import java.util.Arrays;
//import java.util.List;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentProfile;

@RestController
public class StudentController {
     
	@GetMapping("disp")
	public List<StudentProfile> disp(){
		return Arrays.asList(new StudentProfile(1,"Surendhiran","EEE"),new StudentProfile(2,"Thangavel","EEE"));
	}
}
