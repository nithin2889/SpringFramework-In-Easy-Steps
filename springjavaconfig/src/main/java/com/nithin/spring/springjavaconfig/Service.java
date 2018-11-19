package com.nithin.spring.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {

	@Autowired
	DAO dao;
	
	public void howdy() {
		System.out.println("howdy!!");
	}
	
	public void bubye() {
		System.out.println("bubye!!");
	}
	
	public void save() {
		dao.create();
	}
	
}