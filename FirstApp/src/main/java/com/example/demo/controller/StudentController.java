package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
   
	@Autowired
	StudentService sr;
	
	@PostMapping("addstudent")
	public StudentEntity add(@RequestBody StudentEntity ss)
	{
		return sr.saveInfo(ss);
	}
	
	@PostMapping("addnstudents")
	public List<StudentEntity> addndetails(@RequestBody List<StudentEntity> ss)
	{
		return sr.savendetails(ss);
	}
	
	@GetMapping("showdetails")
	public List<StudentEntity> show(){
		return sr.showInfo();
		}
	
	@PutMapping("update")
	public StudentEntity modify(@RequestBody StudentEntity ss) {
		return sr.changeInfo(ss);
	}
	
	@DeleteMapping("deletedetails")
	public String del(@RequestBody StudentEntity ss)
	{
		sr.deleteInfo(ss);
		return "Deleted Successfully";
	}
	
	@DeleteMapping("del/{id}")
	public void delete(@PathVariable int id)
	{
		sr.deleteBy_Id(id);
	}
	
	@DeleteMapping("deletepid")
	public void deletepId(@RequestParam int id)
	{
		sr.deleteBy_Id(id);
	}
	
	@GetMapping("showbyId/{id}")
	public Optional<StudentEntity> showid(@PathVariable int id)
	{
		return sr.showbyid(id);
	}
	
	@PutMapping("updateinfo/{id}")
	public String updateInfoById(@PathVariable int id,@RequestBody StudentEntity ss)
	{
		return sr.updateinfoById(id, ss);
	}
}
