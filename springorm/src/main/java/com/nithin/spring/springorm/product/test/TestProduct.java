package com.nithin.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nithin.spring.springorm.dao.impl.ProductDAO;
import com.nithin.spring.springorm.entity.Product;

public class TestProduct {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springorm/product/test/config.xml");
		ProductDAO productDao = (ProductDAO) ctx.getBean("productDAO");

		Product product = new Product();
		product.setId(1);
		product.setName("Dell Laptop");
		product.setDesc("Okay Okay");
		product.setPrice(888d);

		// productDao.create(product);
		// productDao.update(product);
		// productDao.delete(product);
		// Product prod = productDao.findById(2);
		// System.out.println(prod);
		List<Product> list = productDao.findAll();
		list.forEach(p -> System.out.println(p));
	}

}