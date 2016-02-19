package net.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.test.services.ReservationService;

public class MainXmlComponentScan {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContextComponentScan.xml");
		ReservationService reservationService = applicationContext.getBean(ReservationService.class,
				"reservationService");
		System.out.println(reservationService.findAllRecords());
	}

}
