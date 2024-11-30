package com.infosys.carRentalSystem.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarVariantRepository {
	@Query("SELECT max(variantId) from Variant")
	public String getLastId();
}
