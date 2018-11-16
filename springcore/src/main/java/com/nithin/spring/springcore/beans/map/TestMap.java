package com.nithin.spring.springcore.beans.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nithin/spring/springcore/beans/map/mapconfig.xml");
		Products products = (Products) ctx.getBean("prod");
		System.out.println(products);
	}

}