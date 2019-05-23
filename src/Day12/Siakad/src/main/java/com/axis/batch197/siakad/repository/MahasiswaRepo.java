package com.axis.batch197.siakad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.batch197.siakad.model.MahasiswaModel;

@Repository
public interface MahasiswaRepo extends JpaRepository<MahasiswaModel, Integer> {

}
