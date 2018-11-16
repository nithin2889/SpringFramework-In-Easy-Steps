package com.nithin.spring.springjdbc.employee.DAO;

import java.util.List;

import com.nithin.spring.springjdbc.employee.entity.Employee;

public interface EmployeeDAO {
	
	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(int id);
	
	Employee read(int id);
	
	List<Employee> readAll();
	
}