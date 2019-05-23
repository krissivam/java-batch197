package com.axis.batch197.siakad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.batch197.siakad.model.BobotNilaiModel;

@Repository
public interface BobotNilaiRepo extends JpaRepository<BobotNilaiModel, Integer>{

}
