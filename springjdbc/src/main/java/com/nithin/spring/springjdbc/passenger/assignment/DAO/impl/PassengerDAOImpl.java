package com.nithin.spring.springjdbc.passenger.assignment.DAO.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.nithin.spring.springjdbc.passenger.assignment.DAO.PassengerDAO;
import com.nithin.spring.springjdbc.passenger.assignment.DAO.PassengerRowMapper;
import com.nithin.spring.springjdbc.passenger.assignment.entity.Passenger;

@Component("passengerDao")
public class PassengerDAOImpl implements PassengerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Passenger passenger) {
		String sql = "insert into passenger values(?, ?, ?)";
		int result = jdbcTemplate.update(sql, passenger.getId(), passenger.getFirstname(), passenger.getLastname());
		return result;
	}

	@Override
	public Passenger read(int id) {
		String sql = "select * from passenger where id=?";
		PassengerRowMapper passengerRowMapper = new PassengerRowMapper();
		Passenger passenger = jdbcTemplate.queryForObject(sql, passengerRowMapper, id);
		return passenger;
	}

	@Override
	public List<Passenger> readAll() {
		String sql = "select * from passenger";
		PassengerRowMapper passengerRowMapper = new PassengerRowMapper();
		List<Passenger> passenger = jdbcTemplate.query(sql, passengerRowMapper);
		return passenger;
	}

	@Override
	public int update(Passenger passenger) {
		String sql = "update passenger set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql, passenger.getFirstname(), passenger.getLastname(), passenger.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete passenger where id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

}
