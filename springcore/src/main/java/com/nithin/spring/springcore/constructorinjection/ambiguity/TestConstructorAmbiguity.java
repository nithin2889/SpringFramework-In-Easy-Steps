package com.nithin.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorAmbiguity {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springcore/constructorinjection/ambiguity/ambiguityconfig.xml");
		Addition addition = (Addition) ctx.getBean("addition");
		System.out.println(addition);
	}

}