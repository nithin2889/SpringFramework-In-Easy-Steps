package com.nithin.spring.springcore.beans.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRefTypes {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nithin/spring/springcore/beans/reftypes/reftypeconfig.xml");
		Students students = (Students) ctx.getBean("students");
		System.out.println(students);
	}

}