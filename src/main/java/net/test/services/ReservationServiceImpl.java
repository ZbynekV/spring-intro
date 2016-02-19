package net.test.services;

import java.util.ArrayList;
import java.util.List;

import net.test.persistence.entity.Record;
import net.test.persistence.repository.DvdRepository;
import net.test.persistence.repository.VhsRepository;

public class ReservationServiceImpl implements ReservationService {

	private VhsRepository vhsRepository;

	private DvdRepository dvdRepository;

	public List<Record> findAllRecords() {

		List<Record> records = new ArrayList<Record>();
		records.addAll(vhsRepository.findAllVhses());
		records.addAll(dvdRepository.findAllDvds());

		return records;
	}

	public VhsRepository getVhsRepository() {
		return vhsRepository;
	}

	public void setVhsRepository(VhsRepository vhsRepository) {
		this.vhsRepository = vhsRepository;
	}

	public DvdRepository getDvdRepository() {
		return dvdRepository;
	}

	public void setDvdRepository(DvdRepository dvdRepository) {
		this.dvdRepository = dvdRepository;
	}
}
