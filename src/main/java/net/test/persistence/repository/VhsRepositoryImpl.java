package net.test.persistence.repository;

import java.util.Arrays;
import java.util.List;

import net.test.persistence.entity.VHS;

public class VhsRepositoryImpl implements VhsRepository {

	List<VHS> vhses = Arrays.asList(new VHS("Deadpool"), new VHS("X-Men"));

	public List<VHS> findAllVhses() {
		return vhses;
	}
}
