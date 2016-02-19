package net.test.persistence.repository;

import java.util.List;

import net.test.persistence.entity.DVD;

public interface DvdRepository {

	public List<DVD> findAllDvds();
}
