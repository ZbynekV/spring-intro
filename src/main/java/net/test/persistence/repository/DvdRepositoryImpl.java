package net.test.persistence.repository;

import java.util.Arrays;
import java.util.List;

import net.test.persistence.entity.DVD;

public class DvdRepositoryImpl implements DvdRepository {

	List<DVD> dvds = Arrays.asList(new DVD("Matrix"), new DVD("Hackers"));

	public List<DVD> findAllDvds() {
		return dvds;
	}
}
