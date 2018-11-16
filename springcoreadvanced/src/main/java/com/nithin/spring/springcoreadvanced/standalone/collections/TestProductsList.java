package com.nithin.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProductsList {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springcoreadvanced/standalone/collections/standaloneconfig.xml");
		ProductsList plist = (ProductsList) ctx.getBean("productlist");
		System.out.println(plist);
	}

}