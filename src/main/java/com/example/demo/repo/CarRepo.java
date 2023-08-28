package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{
	
	String value = null;

	@Query(value="select * from cartable where owners=:s",nativeQuery=true)
	public List<Car>getcar(@Param("s")int owners);
	
	@Query(value="select * from cartable where address=:s",nativeQuery=true)
	public List<Car>getcarr(@Param("s")String address);
	
	@Query(value="select * from cartable where carName=:s",nativeQuery=true)
	public List<Car>getcarrr(@Param("s")String carName);
	
	@Query(value="select * from cartable where owners=:s and carType=:sn",nativeQuery=true)
	public List<Car>getcarrrr(@Param("s")int owners,@Param("sn")String carType);
	
}
