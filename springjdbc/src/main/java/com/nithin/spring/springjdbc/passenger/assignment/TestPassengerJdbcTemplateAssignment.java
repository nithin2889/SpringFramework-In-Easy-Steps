package com.nithin.spring.springjdbc.passenger.assignment;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nithin.spring.springjdbc.passenger.assignment.DAO.PassengerDAO;
import com.nithin.spring.springjdbc.passenger.assignment.entity.Passenger;

public class TestPassengerJdbcTemplateAssignment {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springjdbc/passenger/assignment/config.xml");
		PassengerDAO passDAO = (PassengerDAO) ctx.getBean("passengerDao");
		Passenger passenger = new Passenger();
		passenger.setId(2);
		passenger.setFirstname("Akhila");
		passenger.setLastname("Mariadas");

		// int result = passDAO.create(passenger);
		// System.out.println("number of passengers created is: " + result);
		
		// int result = passDAO.update(passenger);
		// System.out.println("number of passengers updated is: " + result);
		
		// int result = passDAO.delete(3);
		// System.out.println(result + " passenger deleted successfully!");
		
		Passenger pass = passDAO.read(2);
		System.out.println("Record found is: " + pass);
		
		List<Passenger> passList = passDAO.readAll();
		System.out.println("Reading all the employees:");
		passList.forEach(p -> System.out.println(p));
	}

}