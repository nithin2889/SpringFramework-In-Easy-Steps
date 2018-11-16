package com.nithin.spring.springcore.beans.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProperties {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springcore/beans/properties/propertiesconfig.xml");
		CountriesAndLanguages cl = (CountriesAndLanguages) ctx.getBean("countriesandlangs");
		System.out.println(cl.getCountryAndLanguages());
		System.out.println(cl.getCountryAndLanguages().getProperty("France"));
	}

}