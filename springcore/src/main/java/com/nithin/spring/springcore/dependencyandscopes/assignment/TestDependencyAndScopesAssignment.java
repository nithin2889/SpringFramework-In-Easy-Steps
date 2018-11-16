package com.nithin.spring.springcore.dependencyandscopes.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependencyAndScopesAssignment {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springcore/dependencyandscopes/assignment/dependencyscopesconfig.xml");
		University univ = (University) ctx.getBean("university");
		System.out.println(univ.hashCode());
		
		University univ2 = (University) ctx.getBean("university");
		System.out.println(univ2.hashCode());
	}

}