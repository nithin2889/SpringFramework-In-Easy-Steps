package com.nithin.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nithin.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee employee = new Employee();
		employee.setId(11213);
		employee.setName("Nithin Prasad");
		employee.setSalary(68000);
		
		Employee employee2 = new Employee();
		employee2.setId(11214);
		employee2.setName("Akhila Martia");
		employee2.setSalary(50000);
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(employee);
		employees.add(employee2);
		
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

}