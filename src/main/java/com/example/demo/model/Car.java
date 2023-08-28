package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cartable")
public class Car {
	
	@Id
	private int id;
	private String carName;
	private String carType;
	private int owners;
	private String carOwnerName;
	private long mobile;
	private String Address;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int id, String carName, String carType, int owners, String carOwnerName, long mobile, String address) {
		super();
		this.id = id;
		this.carName = carName;
		this.carType = carType;
		this.owners = owners;
		this.carOwnerName = carOwnerName;
		this.mobile = mobile;
		Address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getOwners() {
		return owners;
	}
	public void setOwners(int owners) {
		this.owners = owners;
	}
	public String getCarOwnerName() {
		return carOwnerName;
	}
	public void setCarOwnerName(String carOwnerName) {
		this.carOwnerName = carOwnerName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
}
