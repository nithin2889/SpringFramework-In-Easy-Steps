package com.nithin.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjectedInterfaces {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springcoreadvanced/injecting/interfaces/injectinterfaceconfig.xml");
		OrderBO orderBO = (OrderBO) ctx.getBean("bo");
		orderBO.placeOrder();
	}

}