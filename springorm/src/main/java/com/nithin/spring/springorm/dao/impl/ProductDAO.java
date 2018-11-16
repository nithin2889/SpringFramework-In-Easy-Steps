package com.nithin.spring.springorm.dao.impl;

import java.util.List;

import com.nithin.spring.springorm.entity.Product;

public interface ProductDAO {
	int create(Product product);
	void update(Product product);
	void delete(Product product);
	Product findById(int id);
	List<Product> findAll();
}