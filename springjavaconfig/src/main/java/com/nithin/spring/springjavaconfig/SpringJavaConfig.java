package com.nithin.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(DAOConfig.class)
public class SpringJavaConfig {

	@Bean(initMethod = "howdy", destroyMethod = "bubye")
	@Scope(scopeName = "prototype")
	public Service getService() {
		return new Service();
	}

}