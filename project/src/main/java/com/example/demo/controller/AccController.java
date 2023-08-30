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

import com.example.demo.model.AccEntity;

import com.example.demo.service.AccService;


@RestController
public class AccController {
  
	@Autowired
	AccService sser;
	
	@PostMapping("addbill")
	public AccEntity add(@RequestBody AccEntity ss)
	{
		return sser.saveInfo(ss);
	}
	
	@PostMapping("addmul")
	public List<AccEntity> addndetails(@RequestBody List<AccEntity> ss)
	{
		return sser.savedetails(ss);
	}
	
	@GetMapping("showbill")
	public List<AccEntity> show()
	{
		return sser.showInfo();
	}
	
	@PutMapping("update")
	public AccEntity modify(@RequestBody AccEntity ss)
	{
		return sser.changeInfo(ss);
	}
	
	@DeleteMapping("deletedetail")
	public String del(@RequestBody AccEntity ss)
	{
		sser.deleteInfo(ss);
		return "DELETED SUCCESSFULLY";
	}
	
	@DeleteMapping("delid/{custid}")
	public String deletemyid(@PathVariable int custid)
	{
		sser.deleteid(custid);
		return "deleted cust id";
	}
	
	@DeleteMapping("delparamid")
	public String deleteparamid(@RequestParam int custid)
	{
		sser.deleteid(custid);
		return "deleted parameter id";
	}
	
	@GetMapping("showbyId/{id}")
	public Optional<AccEntity> showid(@PathVariable int id)
	{
		return sser.showbyid(id);
	}
	
	@PutMapping("updateinfo/{id}")
	public String updateInfoById(@PathVariable int id,@RequestBody AccEntity ss)
	{
		return sser.updateinfoById(id, ss);
	}
	
	@GetMapping("sort/{str}")
	public List<AccEntity> sort(@PathVariable String str)
	{
		return sser.sort(str);
	}
	
	@GetMapping("paging/{cur}/{tot}")
	public List<AccEntity> paging(@PathVariable int cur,@PathVariable int tot)
	{
		return sser.paging(cur, tot);
	}
	
	@GetMapping("pageandsort/{cur}/{tot}/{str}")
	public List<AccEntity> pageandsort(@PathVariable int cur,@PathVariable int tot,@PathVariable String str)
	{
		return sser.pageandsort(cur, tot, str);
	}
	
	@GetMapping("getbyname/{id}/{name}")
	public List<AccEntity> getbyname(@PathVariable int id,@PathVariable String name)
	{
		return sser.getbyname(id, name);
	}
	@GetMapping("updatename/{id}/{name}")
	public String updatename(@PathVariable int id,@PathVariable String name) {
		return sser.updatename(name, id)+" updated";
	}
	
	@DeleteMapping("deletename/{no}")
	public int deletename(@PathVariable int no)
	{
		return sser.deleteName(no);
	}
}