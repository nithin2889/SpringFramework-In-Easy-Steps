package com.nithin.spring.springcoreadvanced.stereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ins")
@Scope("prototype")
public class Instructor {

	@Value("#{T(java.lang.Math).abs(-10)}")
	private int id = 15;
	
	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	private int intMax;
	
	@Value("#{'Akhila'.toUpperCase()}")
	private String name = "Nithin";
	
	@Value("#{topics}")
	private	List<String> topics;
	
	@Value("#{2+4>5}")
	private boolean active;
	
	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public int getIntMax() {
		return intMax;
	}

	public void setIntMax(int intMax) {
		this.intMax = intMax;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", intMax=" + intMax + ", name=" + name + ", topics=" + topics + ", active="
				+ active + ", profile=" + profile + "]";
	}
	
}