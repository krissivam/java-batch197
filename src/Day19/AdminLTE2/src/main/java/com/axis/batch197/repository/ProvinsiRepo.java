package com.axis.batch197.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.axis.batch197.model.ProvinsiModel;

@Repository
public interface ProvinsiRepo extends JpaRepository<ProvinsiModel, Long> {
	
	@Query(value="select max(kdProvinsi) from ProvinsiModel")
	public String getMaxKode();

}
