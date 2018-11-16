package com.nithin.spring.springcore.lifecycle.xmlconfig;

public class Patient {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}

	@SuppressWarnings("unused")
	private void init() {
		System.out.println("Inside init method");
	}
	
	@SuppressWarnings("unused")
	private void destroy() {
		System.out.println("Inside destroy method");
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
}