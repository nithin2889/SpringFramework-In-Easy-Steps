package com.nithin.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {
	
	@Autowired
	@Qualifier(value="dao2")
	private OrderDAO dao;
	
	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBOImpl");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "OrderBOImpl [dao=" + dao + "]";
	}
	
}