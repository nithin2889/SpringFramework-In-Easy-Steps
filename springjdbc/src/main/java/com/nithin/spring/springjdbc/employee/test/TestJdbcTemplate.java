package com.nithin.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nithin.spring.springjdbc.employee.DAO.EmployeeDAO;
import com.nithin.spring.springjdbc.employee.entity.Employee;

public class TestJdbcTemplate {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springjdbc/employee/test/config.xml");
		EmployeeDAO empDAO = (EmployeeDAO) ctx.getBean("employeeDao");
		/*Employee employee = new Employee();
		employee.setId(3);
		employee.setFirstName("Chrsytal");
		employee.setLastName("Nithin");*/

		// int result = empDAO.create(employee);
		// int result = empDAO.update(employee);
		// int result = empDAO.delete(3);

		Employee emp = empDAO.read(2);
		System.out.println("Record found is: " + emp);
		
		List<Employee> empList = empDAO.readAll();
		System.out.println("Reading all the employees:");
		empList.forEach(e -> System.out.println(e));
	}

}