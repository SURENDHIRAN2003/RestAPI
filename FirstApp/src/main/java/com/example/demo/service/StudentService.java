package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
    
	@Autowired
	StudentRepo sr;
	
	//save is inbuilt method 
	public StudentEntity saveInfo(StudentEntity ss) {
		return sr.save(ss);
	}
	
	//findAll is inbuilt method
    public List<StudentEntity> showInfo(){
    	return sr.findAll();
    	}
	
	
	
}
