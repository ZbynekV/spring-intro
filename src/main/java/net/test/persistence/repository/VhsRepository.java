package net.test.persistence.repository;

import java.util.List;

import net.test.persistence.entity.VHS;

public interface VhsRepository {

	List<VHS> findAllVhses();
}
