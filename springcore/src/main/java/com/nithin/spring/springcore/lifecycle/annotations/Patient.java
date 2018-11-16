package com.nithin.spring.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}
	
	@PostConstruct
	public void howdy() {
		System.out.println("Inside howdy method");
	}
	
	@PreDestroy
	public void bubye() {
		System.out.println("Inside bubye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}