package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repo.CarRepo;

@Service
public class ApiService {
	
	@Autowired
	CarRepo cr;
	public List<Car>savedetails(List<Car>ss)
	{
		return (List<Car>)cr.saveAll(ss);
	}
	public List<Car>showinfo()
	{
		return cr.findAll();
	}
	public List<Car>getDetail(int s)
	{
		return cr.getcar(s);
	}
	public List<Car>getDetaill(String s)
	{
		return cr.getcarr(s);
	}
	public List<Car>getDetailll(String s)
	{
		return cr.getcarrr(s);
	}
	public List<Car>getDetaillll(int s,String b)
	{
		return cr.getcarrrr(s,b);
	}
}
