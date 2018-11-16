package com.nithin.spring.springcoreadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springcoreadvanced/autowiring/autowiringconfig.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee);
	}

}