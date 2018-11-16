package com.nithin.spring.springcore.beans.set;

import java.util.Set;

public class CarDealer {

	private String name;
	private Set<String> make;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getMake() {
		return make;
	}

	public void setMake(Set<String> make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "CarDealer [name=" + name + ", make=" + make + "]";
	}

}