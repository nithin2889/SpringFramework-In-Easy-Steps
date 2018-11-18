package com.nithin.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nithin.spring.springaop.ProductService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nithin/spring/springaop/test/config.xml");
		ProductService productService = (ProductService) ctx.getBean("productService");
		System.out.println(productService.multiply(4, 5));
	}

}