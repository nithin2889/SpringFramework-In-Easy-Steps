package com.nithin.spring.springjdbc.employee.DAO.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.nithin.spring.springjdbc.employee.DAO.EmployeeDAO;
import com.nithin.spring.springjdbc.employee.DAO.EmployeeRowMapper;
import com.nithin.spring.springjdbc.employee.entity.Employee;

@Component(value="employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?, ?, ?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete employee where id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return employee;
	}

	@Override
	public List<Employee> readAll() {
		String sql = "select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> empList = jdbcTemplate.query(sql, rowMapper);
		return empList;
	}
	
}