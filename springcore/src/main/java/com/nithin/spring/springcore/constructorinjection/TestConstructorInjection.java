package com.nithin.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorInjection {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springcore/constructorinjection/constructorinjectionconfig.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee);
	}

}