package com.nithin.spring.springcoreadvanced.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProductsList {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springcoreadvanced/stereotype/annotation/stereotypeconfig.xml");
		Instructor instructor = (Instructor) ctx.getBean("ins");
		System.out.println(instructor);
	}

}