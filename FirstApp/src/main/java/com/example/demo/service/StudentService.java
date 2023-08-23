package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
    
	@Autowired
	StudentRepo sr;
	
	//save // is inbuilt method 
	public StudentEntity saveInfo(StudentEntity ss) {
		return sr.save(ss);
	}
	
	//saveAll // is the inbuilt method which is used to save the array of details
	public List<StudentEntity> savendetails(List<StudentEntity> ss)
	{
		return (List<StudentEntity>)sr.saveAll(ss);
	}
	
	//findAll // is inbuilt method
    public List<StudentEntity> showInfo(){
    	return sr.findAll();
    	}
	
    //saveandFlush // is the inbuilt method which is used for basic updation
    public StudentEntity changeInfo(StudentEntity ss)
    {
    	return sr.saveAndFlush(ss);
    }
	
    //delete //is the inbuilt method 
    public void deleteInfo(StudentEntity ss) {
    	sr.delete(ss);
    }
    
    public void deleteBy_Id(int id)
    {
    	sr.deleteById(id);
    }
	
    public void deleteBy_par(int id)
    {
    	sr.deleteById(id);
    }
    
    public Optional <StudentEntity> showbyid(int id)
    {
      return sr.findById(id);	
    }
    
    public String updateinfoById(int id,StudentEntity ss) {
    	sr.saveAndFlush(ss);
    	if(sr.existsById(id))
    	{
    		return "Updated";
    	}
    	else{
    		return "Enter the valid Id";
    	}
    }
}
