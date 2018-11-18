package com.nithin.spring.springaop.impl;

import com.nithin.spring.springaop.ProductService;

public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

}