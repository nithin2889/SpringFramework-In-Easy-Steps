package com.nithin.spring.springcore.lifecycleassigment.withannotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTicketReservation {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nithin/spring/springcore/lifecycleassigment/withannotations/ticketreservationconfig.xml");
		TicketReservation ticketReservation = (TicketReservation) ctx.getBean("ticks");
		System.out.println(ticketReservation);
		ctx.registerShutdownHook();
	}
	
}