package com.nithin.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnerBeans {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springcore/innerbeans/innerbeansconfig.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee.hashCode());
		
		Employee employee2 = (Employee) ctx.getBean("employee");
		System.out.println(employee2.hashCode());
	}

}