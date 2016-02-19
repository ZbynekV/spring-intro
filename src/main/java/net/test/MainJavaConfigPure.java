package net.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.test.config.ConfigurationPure;
import net.test.services.ReservationService;

public class MainJavaConfigPure {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationPure.class);
		ReservationService reservationService = applicationContext.getBean(ReservationService.class,
				"reservationService");
		System.out.println(reservationService.findAllRecords());

	}
}
