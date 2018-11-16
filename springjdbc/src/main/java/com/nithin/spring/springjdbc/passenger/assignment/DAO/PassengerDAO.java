package com.nithin.spring.springjdbc.passenger.assignment.DAO;

import java.util.List;

import com.nithin.spring.springjdbc.passenger.assignment.entity.Passenger;

public interface PassengerDAO {

	int create(Passenger passenger);
	
	Passenger read(int id);
	
	List<Passenger> readAll();
	
	int update(Passenger passenger);
	
	int delete(int id);
	
}