package net.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.test.config.ConfigurationComponentScan;
import net.test.services.ReservationService;

public class MainJavaConfigComponentScan {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ConfigurationComponentScan.class);
		ReservationService reservationService = applicationContext.getBean(ReservationService.class);
		System.out.println(reservationService.findAllRecords());

	}
}
