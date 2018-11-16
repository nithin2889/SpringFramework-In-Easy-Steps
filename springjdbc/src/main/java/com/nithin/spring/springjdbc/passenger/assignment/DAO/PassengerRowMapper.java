package com.nithin.spring.springjdbc.passenger.assignment.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nithin.spring.springjdbc.passenger.assignment.entity.Passenger;

public class PassengerRowMapper implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger passenger = new Passenger();
		passenger.setId(rs.getInt(1));
		passenger.setFirstname(rs.getString(2));
		passenger.setLastname(rs.getString(3));

		return passenger;
	}

}