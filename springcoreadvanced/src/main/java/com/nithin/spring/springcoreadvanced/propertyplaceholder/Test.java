package com.nithin.spring.springcoreadvanced.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springcore/propertyplaceholder/placeholderconfig.xml");
		MyDAO dao = (MyDAO) ctx.getBean("mydao");
		System.out.println(dao);
	}

}