package com.nithin.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		Service service1 = ctx.getBean(Service.class);
		service1.save();
		System.out.println(service1.hashCode());
		
		Service service2 = ctx.getBean(Service.class);
		service2.save();
		System.out.println(service2.hashCode());
		
		ctx.registerShutdownHook();
		ctx.close();
	}

}