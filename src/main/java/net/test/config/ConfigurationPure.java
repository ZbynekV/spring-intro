package net.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.test.persistence.repository.DvdRepository;
import net.test.persistence.repository.DvdRepositoryImpl;
import net.test.persistence.repository.VhsRepository;
import net.test.persistence.repository.VhsRepositoryImpl;
import net.test.services.ReservationService;
import net.test.services.ReservationServiceImpl;

@Configuration
public class ConfigurationPure {

	@Bean
	public VhsRepository vhsRepository() {
		return new VhsRepositoryImpl();
	}

	@Bean
	public DvdRepository dvdRepository() {
		return new DvdRepositoryImpl();
	}

	@Bean
	public ReservationService reservationService() {
		ReservationServiceImpl reservationService = new ReservationServiceImpl();
		reservationService.setVhsRepository(vhsRepository());
		reservationService.setDvdRepository(dvdRepository());
		return reservationService;
	}
}
