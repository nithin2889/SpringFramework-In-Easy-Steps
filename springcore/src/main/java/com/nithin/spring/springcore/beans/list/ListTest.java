package com.nithin.spring.springcore.beans.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nithin/spring/springcore/beans/list/listconfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital Name:" + hospital.getName());
		System.out.println("Departments: " + hospital.getDepartments().getClass());
	}

}