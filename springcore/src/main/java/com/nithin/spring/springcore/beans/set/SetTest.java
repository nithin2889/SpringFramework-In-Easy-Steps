package com.nithin.spring.springcore.beans.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nithin/spring/springcore/beans/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) ctx.getBean("cardealer");
		System.out.println("Dealer Name: " + carDealer.getName());
		System.out.println("Make: " + carDealer.getMake().getClass().getName());
	}

}