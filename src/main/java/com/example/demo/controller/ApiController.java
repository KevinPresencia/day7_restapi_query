package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService as;
	@PostMapping("addncar")
	public List<Car> addndetails(@RequestBody List<Car> ss) 
	{
		return as.savedetails(ss);
	}
	@GetMapping("showcar")
	public List<Car>show()
	{
		return as.showinfo();
	}
	@GetMapping("get1/{s}")
	public List<Car>display(@PathVariable int s)
	{
		return as.getDetail(s);
	}
	@GetMapping("get2/{i}")
	public List<Car>displayy(@PathVariable String i)
	{
		return as.getDetaill(i);
	}
	@GetMapping("get3/{i}")
	public List<Car>displayyy(@PathVariable String i)
	{
		return as.getDetailll(i);
	}
	@GetMapping("get4/{i}/{n}")
	public List<Car>displayyyy(@PathVariable int i,@PathVariable String n)
	{
		return as.getDetaillll(i,n);
	}
}
