package net.test.services;

import java.util.List;

import net.test.persistence.entity.Record;

public interface ReservationService {

	List<Record> findAllRecords();
}
